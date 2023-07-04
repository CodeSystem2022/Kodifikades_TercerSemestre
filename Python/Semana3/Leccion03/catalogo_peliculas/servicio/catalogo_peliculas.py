import os

class CatalogoPeliculas:
  pathFile = 'movies.txt'

  @classmethod
  def addMovie(cls, movie):
    with open(cls.pathFile, 'a', encoding='utf8') as file:
      file.write(f'{movie.name}\n')
    
  @classmethod
  def listMovies(cls):
    with open(cls.pathFile, 'r', encoding='utf8') as file:
      print(f'Catalogo de pelis'.center(50,'-'))
      print(file.read())

  @classmethod
  def deleteMovies(cls):
    os.remove(cls.pathFile)
    print(f'File deleted: '{cls.pathFile})