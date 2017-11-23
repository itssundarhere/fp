package com.vehicle;

import javax.persistence.Entity;

@Entity
public class FourWheeler extends Vehicle {
	private String stearingWheel;

	public FourWheeler() {
		super();
	}

	public String getStearingWheel() {
		return stearingWheel;
	}

	public void setStearingWheel(String stearingWheel) {
		this.stearingWheel = stearingWheel;
	}

}
