import os
import time
import RPi.GPIO as GPIO
GPIO.setmode(GPIO.BOARD)
GPIO.setwarnings(False)
GPIO.setup(29,GPIO.OUT)
GPIO.setup(31,GPIO.OUT)
GPIO.setup(33,GPIO.OUT)
#Setup variables for user input
led_choice = 0
count = 0

os.system('clear')

print "Which LED you want to blink?"
print "1: Red?"
print "2: Green?"
print "3: Blue?"
print "4: All?"
led_choice = input("Make your choice: ")

if led_choice == 1:
	os.system('clear')
	print "You choose the red LED"
	count = input("How many times you want it to blink?: ")
	while count > 0:
		GPIO.output(29,GPIO.HIGH)
		time.sleep(1)
		GPIO.output(29,GPIO.LOW)
		time.sleep(1)
		count = count - 1
		
if led_choice == 2:
	os.system('clear')
	print "You choose the green LED"
	count = input("How many times you want it to blink?: ")
	while count > 0:
		GPIO.output(31,GPIO.HIGH)
		time.sleep(1)
		GPIO.output(31,GPIO.LOW)
		time.sleep(1)
		count = count - 1
if led_choice == 3:
        os.system('clear')
        print "You choose the yellow LED"
        count = input("How many times you want it to blink?: ")
        while count > 0:
                GPIO.output(33,GPIO.HIGH)
                time.sleep(1)
                GPIO.output(33,GPIO.LOW)
                time.sleep(1)
                count = count - 1

if led_choice == 4:
	os.system('clear')
	print "You choose all LEDs"
	count = input("How many times you want them to blink?: ")
	while count > 0:
		GPIO.output(29,GPIO.HIGH)
		time.sleep(1)
		GPIO.output(29,GPIO.LOW)
		
                GPIO.output(31,GPIO.HIGH)
		time.sleep(1)
		GPIO.output(31,GPIO.LOW)
                
                GPIO.output(33,GPIO.HIGH)
                time.sleep(1)
                GPIO.output(33,GPIO.LOW)
               
                count = count - 1
                

GPIO.cleanup()
