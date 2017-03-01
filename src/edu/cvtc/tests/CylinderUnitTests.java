package edu.cvtc.tests;

import static org.junit.Assert.*;
import edu.cvtc.shapes.*;

import org.junit.Test;

public class CylinderUnitTests {

	@Test
	public void getNameAccessors_returnsCorrect() {
		// Arrange
		Cylinder cylinder = new Cylinder(1, 2);
		
		float expected = 23.0f;
		
		// Act
		cylinder.setHeight(23.0f);
		float actual = cylinder.getHeight();
		
		// Assert
		
		assertEquals(expected, actual, 0.001f);
	}
	
	
	
	@Test
	public void getSurfaceArea_height1Radius2_Returns18ish() { 
		
		// Arrange
		Cylinder cylinder = new Cylinder(1, 2);
		
		float expected = 18.85f;
		
		// Act
		float actual = cylinder.surfaceArea();
		
		// Assert
		assertEquals(expected, actual, 0.001f);
		
	}
	
	@Test
	public void getSurfaceArea_height6Radius2_Returns100ish() { 
		
		// Arrange
		Cylinder cylinder = new Cylinder(2, 6);
		
		float expected = 100.53f;
		
		// Act
		float actual = cylinder.surfaceArea();
		
		// Assert
		assertEquals(expected, actual, 0.001f);
		
	}
	
	@Test
	public void getSurfaceArea_height20Radius30_Returns9424ish() { 
		
		// Arrange
		Cylinder cylinder = new Cylinder(30, 20);
		
		float expected = 9424.778f;
		
		// Act
		float actual = cylinder.surfaceArea();
		
		// Assert
		assertEquals(expected, actual, 0.001f);
		
	}
	
	@Test
	public void getVolume_height2Radius3_Returns56ish() { 
		
		// Arrange
		Cylinder cylinder = new Cylinder(3, 2);
		
		float expected = 56.548668f;
		
		// Act
		float actual = cylinder.volume();
		
		// Assert
		assertEquals(expected, actual, 0.001f);
		
	}
	
	@Test
	public void getVolume_height24Radius32_Returns77207ish() { 
		
		// Arrange
		Cylinder cylinder = new Cylinder(32, 24);
		
		float expected = 77207.78f;
		
		// Act
		float actual = cylinder.volume();
		
		// Assert
		assertEquals(expected, actual, 0.001f);
		
	}
	
	@Test
	public void getVolume_height1Radius2_Returns12ish() { 
		
		// Arrange
		Cylinder cylinder = new Cylinder(2, 1);
		
		float expected = 12.566371f;
		
		// Act
		float actual = cylinder.volume();
		
		// Assert
		assertEquals(expected, actual, 0.001f);
		
	}
	
	

}
