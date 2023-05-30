import psycopg2 
conexion = psycopg2.connect(user = 'postgres', password = 'admin', host = '127.0.0.1', port = '5432', database = 'test_bd')
print(conexion) 

try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'SELECT * FROM persona WHERE id_persona IN (1, 2, 3) %s' #Placeholder
            inputIDs = input('Digite los id_persona a buscar (separados por coma): ')
            primary_key = (tuple(inputIDs.split(', ')),)
            id_persona = input('Ingrese un número para el id_persona que desea observar: ') 
            cursor.execute(sentencia, primary_key) #ejecutamos la sentencia
            registros = cursor.fetchall()
            for registro in registros:
              print(registros)
            
except Exception as e:
    print(f'Ocurrió un error: {e}')
finally:
    conexion.close()