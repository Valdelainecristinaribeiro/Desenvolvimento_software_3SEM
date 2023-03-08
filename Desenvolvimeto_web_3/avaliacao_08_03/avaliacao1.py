import pickle 
import csv
         
def extrair_chaves_dicionario(cidades):
    return list(cidades.keys())

def concatenar_listas(lista1, lista2):
    listas_concat = list(lista1 + lista2)
    return listas_concat

def quebrar_string_em_listas(string_maior, string_quebra):
    quebrando = string_maior.split(string_quebra)
    return quebrando

def gerar_lista_codigos(cidades):
    lista = []
    for itens in cidades:
        cidade = itens.split(":")[0]
        lista.append(cidade)
    return lista

def gerar_lista_cidades(cidades):
    lista = []
    for itens in cidades:
        cidade = itens.split(":")[-1]
        lista.append(cidade)
    return lista

if __name__ == "__main__":
    with open('dados.bin', 'rb') as file:
        dados = pickle.load(file)
'''
    estados = extrair_chaves_dicionario(dados)
    lista_codigos_cidades = []
    lista_cidades = []
    for estado in estados:
        lista1 = gerar_lista_cidades(dados[estado])
        lista2 = gerar_lista_codigos(dados[estado])
        lista_cidades = concatenar_listas(lista_cidades, lista1)
        lista_codigos_cidades = concatenar_listas(lista_codigos_cidades, lista2)
'''
