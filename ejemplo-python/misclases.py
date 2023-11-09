"""
    Ejemplo clase en Python
"""

class Hospital:

    def __init__(self, name, camas, monto_asignado):
        self.nombre = name
        self.numero_camas = camas
        self.presupuesto = monto_asignado

    def establecer_nombre(self, x):
        self.nombre = x

    def establecer_numero_camas(self, x):
        self.numero_camas = x

    def establecer_presupuesto(self, x):
        self.presupuesto = x
        
    def obtener_nombre(self):
        return self.nombre

    def obtener_numero_camas(self):
        return self.numero_camas

    def obtener_presupuesto(self):
        return self.presupuesto

    def __str__(self):
        return "Hospital\nNombre:%s\nNúmero de Camas:%d\nPresupuesto: %.2f\n" \
            % (self.nombre, self.numero_camas, self.obtener_presupuesto())
