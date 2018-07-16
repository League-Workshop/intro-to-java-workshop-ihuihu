void setup () {
  size (800,800);
}
void draw () {
  background (mouseX-400,0,mouseY-400);
  noStroke();
  fill (mouseX,mouseY,0);
  if (mousePressed) {
    fill (mouseY,0,mouseX);
    
  }
  ellipse (mouseX,mouseY,mouseX,mouseY);
}