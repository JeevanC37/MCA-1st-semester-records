import Adafruit_DHT
sensor = Adafruit_DHT.DHT11
pin = 15
from gpiozero import Button
def button_pressed():
    print("button pressed")
def button_released():
    print("button releaed")

button = Button(23)
button.when_pressed = button_pressed
button.when_released = button_released

while True:
   humidity, temperature = Adafruit_DHT.read_retry(sensor, pin)
   print('Temp={0:0.1f}*C Humidity={1:0.1f}%'.format(temperature,humidity))
   pass
