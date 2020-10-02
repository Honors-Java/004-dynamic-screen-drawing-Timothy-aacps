void setup() {
 size(300, 300);
 fill(0,0,0);
 ellipse(120,260,200,100);
 fill(255,255,0);
 ellipse(237,234,80,50);
 fill(255,0,0);
 ellipse(200,200,100,100);
 fill(47);
 ellipse(100,260,200,100);
 fill(0,0,255);
 ellipse(225,220,25,25);
}


void mousePressed(){
 fill(random(0,255),random(0,255),random(0,255));
 ellipse(120,260,200,100);
 fill(random(0,255),random(0,255),random(0,255));
 ellipse(237,234,80,50);
 fill(random(0,255),random(0,255),random(0,255));
 ellipse(200,200,100,100);
 fill(random(0,255),random(0,255),random(0,255));
 ellipse(100,260,200,100);
 fill(random(0,255),random(0,255),random(0,255));
 ellipse(225,220,25,25);
 println("CHANGE!");
}

//dont forget to add mouse and keypressed interaction functions