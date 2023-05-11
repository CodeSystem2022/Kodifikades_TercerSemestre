import psycopg2 

conexion = psycopg2.connect( 
    user = 'postgres',
    password = 'admin',
    host = '127.0.0.1',
    port = '5432',
    database = 'test_db'
)

cursor = conexion.cursor()
sentencia = 'SELECT * FROM pruebas' 
cursor.execute(sentencia) 
registros = cursor.fetchall() 

#1.7 Cerramos la conexión y la consulta

print(registros)
cursor.close()
conexion.close
