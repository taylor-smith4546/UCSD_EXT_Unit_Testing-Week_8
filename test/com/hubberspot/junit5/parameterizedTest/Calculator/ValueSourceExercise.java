package com.hubberspot.junit5.parameterizedTest.valueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.hubberspot.junit5.example.Calculator;

public class ValueSourceExercise {

	@Test
	public void testEvenValues() {
		//Provide new instance of calculator object
		//Provide assertions for even numbers here
	}
	
	@ParameterizedTest
	@ValueSource(ints = {}) //enter even numbers within array
	public void testEvenValuesUsingParamaterizedTest(int number) {

	}
	
}
