#The word list are:
# r: read
# a: append
# w: write
# x: create
file = open('c:\\user\\pathfile.txt', 'r', encoding='utf8')
print(file.read(5))
print(file.read(10))
print(file.readLine())