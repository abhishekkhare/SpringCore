package com.edu.abhi.expressionlanguage.xml;

public class Operators {
	// Relational operators

	private boolean testEqual;

	private boolean testNotEqual;

	private boolean testLessThan;

	private boolean testLessThanOrEqual;

	private boolean testGreaterThan;

	private boolean testGreaterThanOrEqual;

	// Logical operators , numberBean.no == 999

	private boolean testAnd;

	private boolean testOr;

	private boolean testNot;

	// Mathematical operators

	private double testAdd;

	private String testAddString;

	private double testSubtraction;

	private double testMultiplication;

	private double testDivision;

	private double testModulus;

	private double testExponentialPower;

	private boolean warning;

	
	
	public boolean isTestEqual() {
		return testEqual;
	}

	public void setTestEqual(boolean testEqual) {
		this.testEqual = testEqual;
	}

	public boolean isTestNotEqual() {
		return testNotEqual;
	}

	public void setTestNotEqual(boolean testNotEqual) {
		this.testNotEqual = testNotEqual;
	}

	public boolean isTestLessThan() {
		return testLessThan;
	}

	public void setTestLessThan(boolean testLessThan) {
		this.testLessThan = testLessThan;
	}

	public boolean isTestLessThanOrEqual() {
		return testLessThanOrEqual;
	}

	public void setTestLessThanOrEqual(boolean testLessThanOrEqual) {
		this.testLessThanOrEqual = testLessThanOrEqual;
	}

	public boolean isTestGreaterThan() {
		return testGreaterThan;
	}

	public void setTestGreaterThan(boolean testGreaterThan) {
		this.testGreaterThan = testGreaterThan;
	}

	public boolean isTestGreaterThanOrEqual() {
		return testGreaterThanOrEqual;
	}

	public void setTestGreaterThanOrEqual(boolean testGreaterThanOrEqual) {
		this.testGreaterThanOrEqual = testGreaterThanOrEqual;
	}

	public boolean isTestAnd() {
		return testAnd;
	}

	public void setTestAnd(boolean testAnd) {
		this.testAnd = testAnd;
	}

	public boolean isTestOr() {
		return testOr;
	}

	public void setTestOr(boolean testOr) {
		this.testOr = testOr;
	}

	public boolean isTestNot() {
		return testNot;
	}

	public void setTestNot(boolean testNot) {
		this.testNot = testNot;
	}

	public double getTestAdd() {
		return testAdd;
	}

	public void setTestAdd(double testAdd) {
		this.testAdd = testAdd;
	}

	public String getTestAddString() {
		return testAddString;
	}

	public void setTestAddString(String testAddString) {
		this.testAddString = testAddString;
	}

	public double getTestSubtraction() {
		return testSubtraction;
	}

	public void setTestSubtraction(double testSubtraction) {
		this.testSubtraction = testSubtraction;
	}

	public double getTestMultiplication() {
		return testMultiplication;
	}

	public void setTestMultiplication(double testMultiplication) {
		this.testMultiplication = testMultiplication;
	}

	public double getTestDivision() {
		return testDivision;
	}

	public void setTestDivision(double testDivision) {
		this.testDivision = testDivision;
	}

	public double getTestModulus() {
		return testModulus;
	}

	public void setTestModulus(double testModulus) {
		this.testModulus = testModulus;
	}

	public double getTestExponentialPower() {
		return testExponentialPower;
	}

	public void setTestExponentialPower(double testExponentialPower) {
		this.testExponentialPower = testExponentialPower;
	}

	public boolean isWarning() {
		return warning;
	}

	public void setWarning(boolean warning) {
		this.warning = warning;
	}

	@Override
	public String toString() {
		return "Operators [testEqual=" + testEqual + ", testNotEqual=" + testNotEqual + ", testLessThan=" + testLessThan
				+ ", testLessThanOrEqual=" + testLessThanOrEqual + ", testGreaterThan=" + testGreaterThan
				+ ", testGreaterThanOrEqual=" + testGreaterThanOrEqual + ", testAnd=" + testAnd + ", testOr=" + testOr
				+ ", testNot=" + testNot + ", testAdd=" + testAdd + ", testAddString=" + testAddString
				+ ", testSubtraction=" + testSubtraction + ", testMultiplication=" + testMultiplication
				+ ", testDivision=" + testDivision + ", testModulus=" + testModulus + ", testExponentialPower="
				+ testExponentialPower + ", warning=" + warning + "]";
	}
}
