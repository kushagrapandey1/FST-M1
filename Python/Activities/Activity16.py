class Car:
    def __init__(self,manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color
    def accelerate(self):
        print(self.manufacturer + ' ' + self.model + ' is moving')
    def stop(self):
        print(self.manufacturer + ' ' + self.model + ' has stopped')
car1 = Car('Honda','18','2000','manual','red')
car2 = Car('Maruti','200','2019','manual','white')
car3 = Car('Suzuki','15','2020','manual','black')
car1.accelerate()
car1.stop()
car3.accelerate()


