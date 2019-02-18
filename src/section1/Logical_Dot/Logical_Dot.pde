void setup() {
  size(800, 800);
  fill(0, 255, 255);
}

void draw() {
  if(mousePressed) {
    fill(0, random(0, 255), random(0, 255));
  } else {
    fill(random(0, 255), random(0, 255), 0);
  }
  ellipse(400, 400, 400, 400);
}