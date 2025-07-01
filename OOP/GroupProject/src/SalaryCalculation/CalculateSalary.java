/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SalaryCalculation;

/**
 *
 * @author Admin
 */
public class CalculateSalary {
    
    
    public double salary(double hworks, double hrate, double tax){
        double pay = hworks * hrate;
        double deduc = pay * tax/100;
        return pay - deduc;
    }
    
    public int salary(int hworks, int hrate, int tax){
        int pay = hworks * hrate;
        int deduc = pay * tax /100;
        return pay - deduc;
    }
}
