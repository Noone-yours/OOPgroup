/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Admin
 */
public class TuitionFeeCalculator {
    
    public int Tuition(int credits, int cost, int scholar){
        int tuition = cost * credits;
        int totalTuition = scholar - tuition;
        return totalTuition;
    }
    
    public double Tuition(int credits, Double cost, double scholar){
        double tuition = cost * credits;
        double totalTuition = scholar - tuition;
        return totalTuition;
    }
    public int Tuition(int payment){
        return payment;
    }
    public double Tuition(double payment){
        return payment;
    }
}
