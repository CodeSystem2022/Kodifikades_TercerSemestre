import logging

#logging.basicConfig(level=logging.DEBUG)

logging.basicConfig(level=logging.DEBUG,
                    format='%(asctime)s:%(levelname)s [%(filename)s:%(lineno)s] %(message)s',
                    datefmt='%I:%M:%S %p',
                    handlers=[
                        log.FileHandler('capa_datos.log'),
                        log.StreamHandler()
                    ])

if __name__ == '__main__':
    logging.debug('Mensaje a nivel bug')
    logging.info('Mensaje a nivel info')
    logging.warning('Mensaje a nivel warning')
    logging.error('Mensaje a nivel error')
    logging.critical('Mensaje a nivel critical')