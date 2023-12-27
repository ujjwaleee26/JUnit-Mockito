package com.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessImplStubTest {

	@Test
	void testFindTheGreatestFromAllData() 
	{
		DataServiceStub dataServiceStub=new DataServiceStub();
		SomeBusinessImpl businessImpl=new SomeBusinessImpl(dataServiceStub);//preventing from talking to actual data service, instead talk to this stub
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(25,result,"Not the greatest ${result}");
	}
	
	@Test
	void testFindTheGreatestFromAllData1() 
	{
		DataServiceStub1 dataServiceStub=new DataServiceStub1();
		SomeBusinessImpl businessImpl=new SomeBusinessImpl(dataServiceStub);//preventing from talking to actual data service, instead talk to this stub
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(25,result,"Not the greatest ${result}");
	}

}

class DataServiceStub implements DataService{

	@Override
	public int[] retrieveAllData() {
		return new int[] {25,15,5};
	}
	
}

class DataServiceStub1 implements DataService{

	@Override
	public int[] retrieveAllData() {
		return new int[] {25};
	}
	
}