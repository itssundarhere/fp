package com.vehicle;

import javax.persistence.Entity;

@Entity
public class TwoWheeler extends Vehicle {
	private String stearingHandle;

	public TwoWheeler() {
		super();
	}

	public String getStearingHandle() {
		return stearingHandle;
	}

	public void setStearingHandle(String stearingHandle) {
		this.stearingHandle = stearingHandle;
	}

}
