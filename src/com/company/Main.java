package com.company;

import javax.crypto.Cipher;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Dimensions dimension = new Dimensions(20,20,5);
	 Case theCase = new Case("220B","Dell","240",dimension);

	 Monitor theMonitor = new Monitor("27inch Beast","Acer",27,new Resolution(2540,1440));

	 Motherboard theMotherboard = new Motherboard("BJ_200","Asus",4,6,"v2.44");
	 PC thePc = new PC(theCase,theMonitor,theMotherboard);
	 thePc.powerUp();

	 Wall wall1 =new Wall("West");
		Wall wall2 =new Wall("East");
		Wall wall3 =new Wall("North");
		Wall wall4 =new Wall("South");
		Ceiling ceiling = new Ceiling(12,55);
		 Bed bed = new Bed("Modern",4,3,2,1);
		 Lamp lamp = new Lamp("Classic",false,7);
		 Bedroom bedroom = new Bedroom("Saman",wall1,wall2,wall3,wall4,ceiling,bed,lamp);
		 bedroom.makeBed();
		 bedroom.getLamp().turnOn();

	}

}
