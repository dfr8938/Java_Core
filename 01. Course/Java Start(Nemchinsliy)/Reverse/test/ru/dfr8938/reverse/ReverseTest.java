package ru.dfr8938.reverse;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseTest {

	@Test
	public void test() {
		assertEquals("265", Reverse.reverse("562"));
		assertEquals("olleH!dlrow", Reverse.reverse("Hello world!"));
	}

}

