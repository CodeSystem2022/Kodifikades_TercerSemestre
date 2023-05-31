import psycopg2 #para poder conectarnos a postgres
conexion = psycopg2.connect(user='postgres', password='admin', host='127.0.0.1', port='5432', database = 'test_bd')
try:
    with conexion:
        with conexion.cursor() as cursor:

            sentencia = 'DELETE FROM persona WHERE id_persona=%s'
            entrada = input('Digite el número de registro a eliminar: ')
            valores = (entrada,) # Es una tupla de valores
            
            cursor.executemany(sentencia, valores) #de esta manera ejecutamos la sentencia
            # conexion.commit() esto se utiliza para guardar los cambios en la base de datos
            registros_insertados = cursor.rowcount
            print(f'Los registros eliminador son: {registros_eliminados}')
except Exception as e:
    print(f'Ocurrió un error: {e}')
finally:
    conexion.close()