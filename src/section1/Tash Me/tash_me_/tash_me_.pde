PImage mustache;

PImage photo;
void setup(){
  photo=loadImage ("photo.jpg");
size(800,800);
photo.resize(width,height);
mustache = loadImage("mustache.png"); 
mustache.resize(150,200);
}

void draw(){
background (photo);
image (mustache, 250,230);}
