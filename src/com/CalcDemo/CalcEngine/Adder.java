package com.CalcDemo.CalcEngine;

public class Adder extends CalculateBase implements MathProcessing{
	public Adder(){}
	public Adder(double leftVal, double rightVal){
		super(leftVal,rightVal);
	}
	
	@Override
	public void calculate(){
		double value = getLeftVal() + getRightVal();
		setResult(value);
	}
	@Override
	public String getKeyword() {
		// TODO Auto-generated method stub
		return "add";
	}
	@Override
	public char getSymbol() {
		// TODO Auto-generated method stub
		return '+';
	}
	@Override
	public double doCalculation(double leftVal, double rightVal) {
		// TODO Auto-generated method stub
		setLeftVal(leftVal);
		setRightVal(rightVal);
		calculate();
		return getResult();
	}
}
