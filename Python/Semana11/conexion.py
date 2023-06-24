from psycopg2 import pool


class Conexion:
    _DATABASE = 'test_bd'
    _USERNAME = 'postgres'
    _PASSWORD = 'admin'
    _DB_PORT = '5432'
    _HOST = '127.0.0.1'
    _MIN_CON = 1
    _MAX_CON = 5
    _pool = None

    @classmethod
    def obtenerConexion(cls):
        pass

    @classmethod
    def obtenerCursor(cls):
        pass

    @classmethod
    def obtenerPool(cls):
        pass


# Prueba de errores de la clase Conection:

if __name__ == '__main__':
   pass
