package edu.cvtc.tests;

import static org.junit.Assert.*;
import edu.cvtc.shapes.*;

import org.junit.Test;

public class CuboidUnitTests {

	@Test
	public void getNameAccessors_returnsCorrect() {
		// Arrange
		Cuboid cuboid = new Cuboid(1, 2, 3);
		
		float expected = 23.0f;
		
		// Act
		cuboid.setDepth(23.0f);
		float actual = cuboid.getDepth();
		
		// Assert
		
		assertEquals(expected, actual, 0.001f);
	}
	
	@Test
	public void getSurfaceArea_height1Depth2Length3_Returns22() { // method name, what were passing, return value
		
		// Arrange
		Cuboid cuboid = new Cuboid(1, 2, 3);
		
		float expected = 22.0f;
		
		// Act
		float actual = cuboid.surfaceArea();
		
		// Assert
		assertEquals(expected, actual, 0.001f);
		
	}
	
	@Test
	public void getSurfaceArea_height3Depth4Length5_Returns94() { // method name, what were passing, return value
		
		// Arrange
		Cuboid cuboid = new Cuboid(3, 4, 5);
		
		float expected = 94.0f;
		
		// Act
		float actual = cuboid.surfaceArea();
		
		// Assert
		assertEquals(expected, actual, 0.001f);
		
	}
	
	@Test
	public void getSurfaceArea_height20Depth90Length25_Returns94() { // method name, what were passing, return value
		
		// Arrange
		Cuboid cuboid = new Cuboid(20, 90, 25);
		
		float expected = 9100.0f;
		
		// Act
		float actual = cuboid.surfaceArea();
		
		// Assert
		assertEquals(expected, actual, 0.001f);
		
	}
	
	@Test
	public void getVolume_height1Depth2Length3_Returns6() { // method name, what were passing, return value
		
		// Arrange
		Cuboid cuboid = new Cuboid(1, 2, 3);
		
		float expected = 6.0f;
		
		// Act
		float actual = cuboid.volume();
		
		// Assert
		assertEquals(expected, actual, 0.001f);
		
	}
	
	@Test
	public void getVolume_height3Depth4Length5_Returns60() { // method name, what were passing, return value
		
		// Arrange
		Cuboid cuboid = new Cuboid(3, 4, 5);
		
		float expected = 60.0f;
		
		// Act
		float actual = cuboid.volume();
		
		// Assert
		assertEquals(expected, actual, 0.001f);
		
	}
	
	@Test
	public void getVolume_height20Depth90Length25_Returns45000() { // method name, what were passing, return value
		
		// Arrange
		Cuboid cuboid = new Cuboid(20, 90, 25);
		
		float expected = 45000.0f;
		
		// Act
		float actual = cuboid.volume();
		
		// Assert
		assertEquals(expected, actual, 0.001f);
		
	}
	
	// testing exceptions
	/*@Test(expected = Excpetion.class)
	public void constructor_NegativeHeight_ThrowsException() {
		throw new Exception();
	}
*/
	
}
