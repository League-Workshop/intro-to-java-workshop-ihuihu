PImage mustache;
PImage face;
void setup () {
  face = loadImage ("FACE.jpg");
  size (800,600);
  face.resize (800, 600);
  mustache = loadImage ("MUSTACHE.png");
  mustache.resize (200,100);
  background (face);
}

void draw () {
  if (mouseButton==LEFT){
image (mustache, mouseX-100,mouseY-50);
  }
  if (mouseButton==RIGHT){
  background(face);
  }
}