import psycopg2 #para poder conectarnos a postgres
conexion = psycopg2.connect(user='postgres', password='admin', host='127.0.0.1', port='5432', database = 'test_bd')
try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'
            valores = ('Juan Carlos', 'Perez', 'jcarlosp@gmai.com', 1) # es una tupla de tuplas
            cursor.executemany(sentencia, valores) #de esta manera ejecutamos la sentencia
            registros_actualizados = cursor.rowcount
            print(f'Los registros actualizados son: {registros_actualizados}')
except Exception as e:
    print(f'Ocurrió un error: {e}')
finally:
    conexion.close()