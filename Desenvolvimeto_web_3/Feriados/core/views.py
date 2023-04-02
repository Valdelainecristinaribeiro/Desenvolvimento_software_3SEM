from django.shortcuts import render
from datetime import date

date = date.today()

def natal(request):
    if date.day == 25 and date.month == 12 :
        natal = {
            'natal': True
        }
        return render(request, 'natal.html', natal)
    else:
        natal = {
            'natal': False
        }
        return render(request, 'natal.html', natal)

def tiradentes(request):
    if date.day == 21 and date.month == 0 :
        tiradentes = {
            'tiradentes': True
        }
        return render(request, 'tiradentes.html', tiradentes)
    else :
        tiradentes = {
            'tiradentes': False
        }
        return render(request, 'tiradentes.html', tiradentes)

def nota(request):
    return render(request, 'nota.html')