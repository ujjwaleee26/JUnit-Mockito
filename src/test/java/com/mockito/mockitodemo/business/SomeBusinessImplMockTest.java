package com.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMockTest {
	
	
	@Mock
	private DataService dataServiceMock;
	
	@InjectMocks
	private SomeBusinessImpl businessImpl;

	@Test
	void allTypeTest() 
	{
		
		//DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {25,19,10}).thenReturn(new int[] {35});
		//SomeBusinessImpl businessImpl=new SomeBusinessImpl(dataServiceMock);
		assertEquals(25,businessImpl.findTheGreatestFromAllData());
		assertEquals(35,businessImpl.findTheGreatestFromAllData());
		assertEquals(35,businessImpl.findTheGreatestFromAllData());
	}
	
//	@Test
//	void testFindTheGreatestFromAllData1() 
//	{
//		
//		//DataService dataServiceMock = mock(DataService.class);
//		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {25});
//		//SomeBusinessImpl businessImpl=new SomeBusinessImpl(dataServiceMock);
//		assertEquals(25,businessImpl.findTheGreatestFromAllData());
//	}

}

