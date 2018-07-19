PImage kitten;
int eyeOneX = 460;
int eyeOneY = 300;
int eyeTwoX = 610;
int eyeTwoY = 296;
int mouthX = 528;
int mouthY = 397;
int noseOneX = 510;
int noseOneY = 363;
int noseTwoX = 545;
int noseTwoY = 362;
void setup(){
  size (950,950);
  kitten=loadImage("CAT.jpg");
kitten.resize(950,950);
background(kitten);
}
void draw(){
  if(mousePressed){
   fill(0,0,255);
ellipse(eyeOneX,eyeOneY,30,30);
ellipse(eyeTwoX,eyeTwoY,30,30);
fill (255,0,0);
ellipse(mouthX,mouthY,50,50);
fill (0,255,0);
ellipse(noseOneX, noseOneY, 10,10);
ellipse(noseTwoX,noseTwoY,10,10);
eyeOneY=eyeOneY+2;
eyeTwoY=eyeTwoY+2;
eyeOneX=eyeOneX+1;
eyeTwoX=eyeTwoX+1;
mouthY=mouthY+2;
mouthX=mouthX+1;
noseTwoX = noseTwoX+1;
noseTwoY = noseTwoY+2;
noseOneX = noseOneX+1;
noseOneY = noseOneY+2;
if(eyeOneY>950){
eyeOneX = 460;
eyeOneY = 300;
eyeTwoX = 610;
eyeTwoY = 296;
mouthX = 528;
mouthY = 397;
noseTwoX = 545;
noseTwoY = 362;
noseOneX = 510;
noseOneY = 363;
background(kitten);
}
}
}