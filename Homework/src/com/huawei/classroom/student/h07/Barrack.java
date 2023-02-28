package com.huawei.classroom.student.h07;

public class Barrack extends Building {

	public Barrack(int x, int y) {

		// super( Param.BARRACK_HEALTH,Param.BARRACK_STRENGTH);
		// TODO Auto-generated constructor stub
	}

	public GameObject traing(EnumObjectType type) {
		GameObject gameObject;

		if (type == EnumObjectType.rifleSoldier) {
			gameObject.setHealth(50);
			gameObject.setStrength(5);
			gameObject.setRange(5);
		} else if (type == EnumObjectType.RPGSoldier) {
			gameObject.setHealth(50);
			gameObject.setStrength(10);
			gameObject.setRange(10);
		} else if (type == EnumObjectType.dog) {
			gameObject.setHealth(50);
			gameObject.setStrength(5);
			gameObject.setRange(5);
		}
		gameObject.setX(this.getX());
		gameObject.setY(this.getY());
		return gameObject;
	}

}
