void setup() {
  Serial.begin(9600);

}
int b = 0;
void loop() {
  
  if (Serial.available()) {
    int c = Serial.parseInt();
    Serial.print((String)b);
    b=b+c;
    Serial.print("+");
    Serial.print(c);
    Serial.print("=");
    Serial.println(b);
    
  } 


}
