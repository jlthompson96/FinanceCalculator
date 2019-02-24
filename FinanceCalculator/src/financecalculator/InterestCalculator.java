package financecalculator;
import java.lang.Math;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @version 1
 * @author joeythompson
 */
public class InterestCalculator {
    private int compoundValue;
    private double length;
    private double initAmount;
    private double rate;
    
    /**
     * No-Arg Constructor
     */
    public InterestCalculator() {
        
    }
    /**
     * Constructor With Arguments
     * @param compoundValue
     * @param length
     * @param initAmount
     * @param rate 
     */
    public InterestCalculator(int compoundValue, double length, double initAmount, double rate) {
        this.compoundValue = compoundValue;
        this.length = length;
        this.initAmount = initAmount;
        this.rate = rate;
    }
    /**
     * 
     * @return converted rate
     */
    public double convertRate() {
        return rate / 100; 
       
    }    
    /**
     * 
     * @return Final amount after compounded
     */
    public double calcCompound() {
        return initAmount * Math.pow(1 + convertRate() / compoundValue, length * compoundValue);   
    }
    /**
     * 
     * @param compoundValue 
     */
    public void setCompoundValue(int compoundValue) {
        this.compoundValue = compoundValue;
    }
    /**
     * 
     * @param length 
     */
    public void setLength(double length) {
        this.length = length;
    }
    /**
     * 
     * @param initAmount 
     */
    public void setInitAmount(double initAmount) {
        this.initAmount = initAmount;
    }
    /**
     * 
     * @param rate 
     */
    public void setRate(double rate) {
        this.rate = rate;
    }
    /**
     * 
     * @return CompoundValue
     */
    public int getCompoundValue() {
        return compoundValue;
    }
    /**
     * 
     * @return length
     */
    public double getLength() {
        return length;
    }
    /**
     * 
     * @return initAmount
     */
    public double getInitAmount() {
        return initAmount;
    }
    /**
     * 
     * @return rate
     */
    public double getRate() {
        return rate;
    }
    /**
     * 
     * @return toString
     */
    @Override
    public String toString() {
        return String.format("Your total balance after " 
                + length + " years is $%,.2f" , calcCompound());
    }
    
}

