package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Snake;
/**
 * 
 * @author manue
 * JUnit-Test für die Snake-Klasse
 */
public class SnakeTest {
/**
 * test des construktors und der übergaben via getter der x und y pos.
 */
	@Test
	public void testConstruktor() {
		Snake schnake= new Snake (10,10);
		assertEquals(10, schnake.getXPos());
		assertEquals(10, schnake.getYPos());
	}

	@Test
	public void testUp() {
		Snake schnake= new Snake (10,10);
		assertEquals(false, schnake.moveUp());	
	}
	
	@Test
	public void testUpHindered() {
		Snake schnake= new Snake (0,0);
		schnake.moveUp();
		assertEquals(true, schnake.moveUp());	
	}
	
	@Test
	public void testDown() {
		Snake schnake= new Snake (10,10);
		assertEquals(false, schnake.moveUp());	
	}
	
	@Test
	public void testDownHindered() {
		Snake schnake= new Snake (10,10);
		assertEquals(false, schnake.moveUp());	
	}
	
	@Test
	public void testLeft() {
		Snake schnake= new Snake (10,10);
		assertEquals(false, schnake.moveUp());	
	}
	
	@Test
	public void testLeftHindered() {
		Snake schnake= new Snake (10,10);
		assertEquals(false, schnake.moveUp());	
	}
	
	@Test
	public void testRight() {
		Snake schnake= new Snake (10,10);
		assertEquals(false, schnake.moveUp());	
	}
	
	@Test
	public void testRightHindered() {
		Snake schnake= new Snake (10,10);
		assertEquals(false, schnake.moveUp());	
	}
}
