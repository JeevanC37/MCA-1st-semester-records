// Define the pins for the ultrasonic sensor, LEDs, and buzzer
const int trigPin = 9;
const int echoPin = 10;
const int redLED = 3;
const int blueLED = 4;
const int greenLED = 5;
const int buzzer = 6;

// Define variables to store distance
long duration;
int distance;

void setup() {
  // Start the serial communication
  Serial.begin(9600);

  // Set the pin modes
  pinMode(trigPin, OUTPUT);
  pinMode(echoPin, INPUT);
  pinMode(redLED, OUTPUT);
  pinMode(blueLED, OUTPUT);
  pinMode(greenLED, OUTPUT);
  pinMode(buzzer, OUTPUT);
}

void loop() {
  // Clear the trigPin by setting it LOW
  digitalWrite(trigPin, LOW);
  delayMicroseconds(2);
  
  // Set the trigPin HIGH to send a pulse
  digitalWrite(trigPin, HIGH);
  delayMicroseconds(10);
  digitalWrite(trigPin, LOW);
  
  // Read the echoPin to get the duration of the pulse
  duration = pulseIn(echoPin, HIGH);
  
  // Calculate the distance in cm
  distance = duration * 0.034 / 2;

  // Print the distance to the Serial Monitor
  Serial.print("Distance: ");
  Serial.print(distance);
  Serial.println(" cm");

  // Perform actions based on the distance
  if (distance < 10) {
    // If the distance is less than 10 cm, turn on the red LED and beep the buzzer
    digitalWrite(redLED, HIGH);
    digitalWrite(blueLED, LOW);
    digitalWrite(greenLED, LOW);
    digitalWrite(buzzer, HIGH); // Beep the buzzer
  }
  else if (distance >= 10 && distance <= 20) {
    // If the distance is between 10 cm and 20 cm, turn on the blue LED
    digitalWrite(redLED, LOW);
    digitalWrite(blueLED, HIGH);
    digitalWrite(greenLED, LOW);
    digitalWrite(buzzer, LOW); // No beep
  }
  else {
    // If the distance is more than 20 cm, turn on the green LED
    digitalWrite(redLED, LOW);
    digitalWrite(blueLED, LOW);
    digitalWrite(greenLED, HIGH);
    digitalWrite(buzzer, LOW); // No beep
  }
  
  // Delay for a short time before taking the next reading
  delay(500);
}