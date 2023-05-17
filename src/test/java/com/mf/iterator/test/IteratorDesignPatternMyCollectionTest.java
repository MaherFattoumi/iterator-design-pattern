package com.mf.iterator.test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.mf.iterator.MyCollection;

public class IteratorDesignPatternMyCollectionTest {

	    @Test
	    public void testIterationOverElements() {
	        List<String> elements = Arrays.asList("A", "B", "C");
	        MyCollection<String> collection = new MyCollection<>(elements);

	        Iterator<String> iterator = collection.iterator();

	        Assert.assertTrue(iterator.hasNext());
	        Assert.assertEquals("A", iterator.next());

	        Assert.assertTrue(iterator.hasNext());
	        Assert.assertEquals("B", iterator.next());

	        Assert.assertTrue(iterator.hasNext());
	        Assert.assertEquals("C", iterator.next());

	        Assert.assertFalse(iterator.hasNext());
	    }

	    @Test
	    public void testEmptyCollection() {
	        List<String> elements = Arrays.asList();
	        MyCollection<String> collection = new MyCollection<>(elements);

	        Iterator<String> iterator = collection.iterator();

	        Assert.assertFalse(iterator.hasNext());
	    }
	}

