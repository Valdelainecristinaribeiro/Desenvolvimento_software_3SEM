def caixinha_magica3(parametro1, parametro2):
    resultado = parametro1 - parametro2
    if resultado >= 0:
        return resultado
    elif resultado < 0:
        return 0

assert caixinha_magica3(20, 15) == 5
assert caixinha_magica3(20, 10) == 10
assert caixinha_magica3(10, 10) == 0
assert caixinha_magica3(10, 15) == 0
assert caixinha_magica3(30, 45) == 0