package com.GotProject.ResponseDto;

import java.util.List;

public class RegionLocationResponseDto {

	
	private List<Object> Distinctlocation;
	
	private List<Object> DistinctRegion;

	public List<Object> getDistinctlocation() {
		return Distinctlocation;
	}

	public void setDistinctlocation(List<Object> distinctlocation) {
		Distinctlocation = distinctlocation;
	}

	public List<Object> getDistinctRegion() {
		return DistinctRegion;
	}

	public void setDistinctRegion(List<Object> distinctRegion) {
		DistinctRegion = distinctRegion;
	}
}
