package com.mf.iterator.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.runner.RunWith;

import com.mf.iterator.MyCollection;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "iterator-design-pattern-myCollection.feature")
public class IteratorDesignPatternCollectionSteps {
    private MyCollection<String> collection;
    private Iterator<String> iterator;
    private List<String> elements;

    @Given("^a MyCollection with elements \"(.*)\"$")
    public void aMyCollectionWithElements(String elementsString) {
        elements = new ArrayList<>();
        String[] elementArray = elementsString.split(", ");
        for (String element : elementArray) {
            elements.add(element);
        }
        collection = new MyCollection<>(elements);
    }

    @When("^I iterate over the collection$")
    public void iIterateOverTheCollection() {
        iterator = collection.iterator();
    }

    @Then("^the elements should be returned in order \"(.*)\"$")
    public void theElementsShouldBeReturnedInOrder(String expectedOrder) {
        String[] expectedOrderArray = expectedOrder.split(", ");
        int index = 0;
        while (iterator.hasNext()) {
            String element = iterator.next();
            assertEquals(expectedOrderArray[index], element);
            index++;
        }
    }
}

