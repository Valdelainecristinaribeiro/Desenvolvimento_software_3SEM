##sequencia
print('oi mundo')
print('Primeiro comando')
print('Segundo comando')
print('Terceiro comando')

##seleção
condicao = False
if condicao:
    print('Passou por aqui 1')
condicao = True
if condicao:
    print('Passou por aqui 2')

##interação
lista = list(range(1,10))

for numero in lista:
    print(numero)

##funções

def caixinha_magica(numero1, numero2):
    numero_magico = numero1 + numero2
    return numero_magico

caixinha_magica(3,4)

def caixinha_magica2(numero1, numero2):
    numero_magico = numero1 - numero2
    return numero_magico

print('Testes')
assert caixinha_magica(2,5) == 7
assert caixinha_magica('oi ', 'mundo') == 'oi mundo'

print('Primeiro experimento com TDD')
assert caixinha_magica2(10,4) == 6
assert caixinha_magica2(10,5) == 5

##strings

nome = 'Fatec Araras'
nome = 'Fatec Araras 2'

print(nome)
print('Id: ',id(nome))
print('Deixar letras maiuscula: ',nome.upper())

##listas
## lista.append adiciona itens

lista = []
lista.append('Pão')
lista.append('Queijo')
lista.append('Bacon')
lista.append('Alface')
lista.append('Tomate')

for comida in lista:
    print(comida)

for comida in lista:
    print(comida.upper())

tupla1 = ('Pão', 'Bacon', 'Leite')

r = list(range(1,15))
print(list(r))


