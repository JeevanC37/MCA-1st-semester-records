import RPi.GPIO as GPIO
import time
GPIO.setmode(GPIO.BOARD)
#GPIO.setmode(GPIO.BCM)
#redled=5
redled=29
GPIO.setup(redled,GPIO.OUT)
blinktimes=input("how many times to blink")
for i in range(0,blinktimes):
    GPIO.output(redled,True)
    time.sleep(1)
    GPIO.output(redled,False)
    time.sleep(1)
GPIO.cleanup()

