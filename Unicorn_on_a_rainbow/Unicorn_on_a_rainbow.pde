PImage rainbow;
PImage unicorn;
void setup () {
  rainbow=loadImage("rainbow.gif");
  size (800,600);
  rainbow.resize (800,600);
  unicorn=loadImage("unicorn.png");
  unicorn.resize (100,100);
}
void draw () {
  ellipse(50,50,100,100);
  background (rainbow);
  image(unicorn, mouseX, mouseY);
}