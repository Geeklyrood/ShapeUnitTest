package edu.cvtc.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.cvtc.shapes.Sphere;

public class SphereUnitTest {

	@Test
	public void getNameAccessors_returnsCorrect() {
		// Arrange
		Sphere sphere = new Sphere(1);
		
		float expected = 1.0f;
		
		// Act
		sphere.setRadius(1.0f);
		float actual = sphere.getRadius();
		
		// Assert
		
		assertEquals(expected, actual, 0.001f);
	}
	
	
	
	@Test
	public void getSurfaceArea_Radius1_Returns12ish() { 
		
		// Arrange
		Sphere sphere = new Sphere(1);
		
		float expected = 12.566371f;
		
		// Act
		float actual = sphere.surfaceArea();
		
		// Assert
		assertEquals(expected, actual, 0.001f);
		
	}
	
	@Test
	public void getSurfaceArea_Radius22_Returns6082ish() { 
		
		// Arrange
		Sphere sphere = new Sphere(22);
		
		float expected = 6082.1235f;
		
		// Act
		float actual = sphere.surfaceArea();
		
		// Assert
		assertEquals(expected, actual, 0.001f);
		
	}
	
	@Test
	public void getSurfaceArea_Radius30_Returns12ish() { 
		
		// Arrange
		Sphere sphere = new Sphere(1);
		
		float expected = 12.566371f;
		
		// Act
		float actual = sphere.surfaceArea();
		
		// Assert
		assertEquals(expected, actual, 0.001f);
		
	}
	
	@Test
	public void getVolume_Radius2_Returns56ish() { 
		
		// Arrange
		Sphere sphere = new Sphere(2);
		
		float expected = 33.510323f;
		
		// Act
		float actual = sphere.volume();
		
		// Assert
		assertEquals(expected, actual, 0.001f);
		
	}
	
	@Test
	public void getVolume_Radius5_Returns523ish() { 
		
		// Arrange
		Sphere sphere = new Sphere(5);
		
		float expected = 523.5988f;
		
		// Act
		float actual = sphere.volume();
		
		// Assert
		assertEquals(expected, actual, 0.001f);
		
	}
	
	@Test
	public void getVolume_Radius8_Returns2144ish() { 
		
		// Arrange
		Sphere sphere = new Sphere(8);
		
		float expected = 2144.6606f;
		
		// Act
		float actual = sphere.volume();
		
		// Assert
		assertEquals(expected, actual, 0.001f);
		
	}

}
