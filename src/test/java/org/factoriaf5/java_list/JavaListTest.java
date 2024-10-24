package org.factoriaf5.java_list;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class JavaListTest {
	
	private JavaList javaList;

    @BeforeEach
    public void init() {
        this.javaList = new JavaList();
    }

	@Test
	public void testCreateTheDaysOfTheWeek() {
        
		List<String> result = new ArrayList<>();
		javaList.createTheDaysOfTheWeek(result);

		assertEquals("Monday", result.get(0));
		assertEquals("Tuesday", result.get(1));
		assertEquals("Wednesday", result.get(2));
		assertEquals("Thursday", result.get(3));
		assertEquals("Friday", result.get(4));
		assertEquals("Saturday", result.get(5));
		assertEquals("Sunday", result.get(6));
		
	}

	@Test
	public void testReturnTheDaysOfTheWeek() {
		List<String> daysOfTheWeek = new ArrayList<>();
		javaList.createTheDaysOfTheWeek(daysOfTheWeek);
		
		List<String> result = javaList.returnTheDaysOfTheWeek(daysOfTheWeek);
		
		assertEquals("Monday", result.get(0));
        assertEquals("Tuesday", result.get(1));
        assertEquals("Wednesday", result.get(2));
        assertEquals("Thursday", result.get(3));
        assertEquals("Friday", result.get(4));
        assertEquals("Saturday", result.get(5));
        assertEquals("Sunday", result.get(6));
	}

	@Test
	public void testReturnListlength() {
		List<String> daysOfTheWeek = new ArrayList<>();
		javaList.createTheDaysOfTheWeek(daysOfTheWeek);
		long result = javaList.returnListlength(daysOfTheWeek);
		assertEquals(7, result);
	}

	@Test
	public void testDeleteADayOfTheWeek() {
		List<String> daysOfTheWeek = new ArrayList<>();
		javaList.createTheDaysOfTheWeek(daysOfTheWeek);
		int pos = 1;
		javaList.deleteADayOfTheWeek(daysOfTheWeek, pos);
		long result = daysOfTheWeek.size();
		assertEquals(6, result);
	}

	@Test
	public void testReturnDesiredDay() {
		List<String> daysOfTheWeek = new ArrayList<>();
		javaList.createTheDaysOfTheWeek(daysOfTheWeek);
		int pos = 1;
		String result = javaList.returnDesiredDay(daysOfTheWeek, pos);
		assertEquals("Tuesday", result);
	}

	@Test
	public void testReturnDayExistsTrue() {
		List<String> daysOfTheWeek = new ArrayList<>();
		javaList.createTheDaysOfTheWeek(daysOfTheWeek);
		
		String day = "Saturday";
		boolean result = javaList.returnDayExists(daysOfTheWeek, day);
		assertTrue(result);
	}

	@Test
	public void testReturnDayExistsFalse() {
		List<String> daysOfTheWeek = new ArrayList<>();
		javaList.createTheDaysOfTheWeek(daysOfTheWeek);
		
		String day = "Martes";
		boolean result = javaList.returnDayExists(daysOfTheWeek, day);
		assertFalse(result);
	}

	@Test
	public void testSortList() {
		List<String> daysOfTheWeek = new ArrayList<>();
		javaList.createTheDaysOfTheWeek(daysOfTheWeek);
		
		javaList.sortList(daysOfTheWeek);
		
		assertEquals("Friday", daysOfTheWeek.get(0));
        assertEquals("Monday", daysOfTheWeek.get(1));
        assertEquals("Saturday", daysOfTheWeek.get(2));
        assertEquals("Sunday", daysOfTheWeek.get(3));
        assertEquals("Thursday", daysOfTheWeek.get(4));
        assertEquals("Tuesday", daysOfTheWeek.get(5));
        assertEquals("Wednesday", daysOfTheWeek.get(6));
	}

	@Test
	public void testEmptyList() {
		List<String> daysOfTheWeek = new ArrayList<>();
		javaList.createTheDaysOfTheWeek(daysOfTheWeek);
		javaList.emptyList(daysOfTheWeek);
		assertTrue(daysOfTheWeek.isEmpty());
	}
	
}