package com.HA.runner;

import com.HA.volume.Voume;

public class VolumeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Voume v = new Voume();
		double spherevolume = v.volumeOfSphere(15.5);
		System.out.println("Volume of sphere is: " +spherevolume);
		double cuboidvolume = v.volumeOfCuboid(20, 20.5, 65.2);
		System.out.println("Voulme of cuboid is: "+cuboidvolume);
		double cyclindervolume= v.volumeOfCyclinder(20.45);
		System.out.println("Volume of cyclinder is:" +cyclindervolume);
		v.volumeOfCone(12,122);
			

	}

}
