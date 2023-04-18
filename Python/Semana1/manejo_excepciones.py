# try exception

try:
    10/0
except Exception as e:
    print(f'Ha ocurrido un error: {e}') #división entre cero