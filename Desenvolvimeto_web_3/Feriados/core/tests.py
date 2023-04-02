from django.test import TestCase

class NatalTest(TestCase):
    def setUp(self):
        self.resp = self.client.get('/')

    def test_200_status_code(self):
        self.assertEqual(200, self.resp.status_code)

    def test_texto(self):
        self.assertContains(self.resp, 'natal')

    def test_template_natal(self):
        self.assertTemplateUsed(self.resp, 'natal.html')

class Tiradentestest(TestCase):
    def setUp(self):
        self.resp = self.client.get('/tiradentes')

    def test_200_status_code(self):
        self.assertEqual(200, self.resp.status_code)

    def test_texto(self):
        self.assertContains(self.resp, 'tiradentes')

    def test_template_tiradentes(self):
        self.assertTemplateUsed(self.resp, 'tiradentes.html')

class Notatest(TestCase):
    def setUp(self):
        self.resp = self.client.get('/nota')
    
    def test_200_status_code(self):
        self.assertEqual(200, self.resp.status_code)
    
    def test_texto(self):
        self.assertContains(self.resp, 'nota')
    
    def test_template_nota(self):
        self.assertTemplateUsed(self.resp, 'nota.html')