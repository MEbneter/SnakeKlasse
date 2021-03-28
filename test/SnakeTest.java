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
/**
 * test der Methode moveUp objekt frei
 */
	@Test
	public void testUp() {
		Snake schnake= new Snake (10,10);
		schnake.moveUp();
		assertEquals(5, schnake.getXPos());
		assertEquals(true, schnake.moveUp());	
	}
/**
 * test der Methode moveUp objekt hindered	
 */
	@Test
	public void testUpHindered() {
		Snake schnake= new Snake (0,0);
		schnake.moveUp();
		assertEquals(0, schnake.getXPos());
		assertEquals(false, schnake.moveUp());	
	}
/**
 * test der Methode moveDown objekt frei	
 */
	@Test
	public void testDown() {
		Snake schnake= new Snake (10,109);
		schnake.moveDown();
		assertEquals(15, schnake.getXPos());
		assertEquals(true, schnake.moveDown());	
	}
/**
 * test der Methode moveDown objekt hindered
 */	
	@Test
	public void testDownHindered() {
		Snake schnake= new Snake (1079,109);
		schnake.moveDown();
		assertEquals(1084, schnake.getXPos());
		assertEquals(false, schnake.moveDown());	
	}
/**
 * test der Methode moveLeft objekt frei	
 */
	@Test
	public void testLeft() {
		Snake schnake= new Snake (10,10);
		schnake.moveLeft();
		assertEquals(5, schnake.getYPos());
		assertEquals(true, schnake.moveLeft());	
	}
/**
 * test der Methode moveLeft objekt hindered	
 */
	@Test
	public void testLeftHindered() {
		Snake schnake= new Snake (5,5);
		schnake.moveLeft();
		assertEquals(0, schnake.getYPos());
		assertEquals(false, schnake.moveLeft());		
	}
/**
 * test der Methode moveRight objekt frei	
 */
	@Test
	public void testRight() {
		Snake schnake= new Snake (10,10);
		schnake.moveRight();
		assertEquals(15, schnake.getYPos());
		assertEquals(true, schnake.moveRight());	
	}
/**
 * test der Methode moveRight objekt hindered	
 */	
	@Test
	public void testRightHindered() {
		Snake schnake= new Snake (10,1915);
		schnake.moveRight();
		assertEquals(1920, schnake.getYPos());
		assertEquals(false, schnake.moveRight());	
	}
}
