/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procedimientos;

/**
 *
 * @author DELL
 */
public class Division {
  
    
    double dividendo;
    double divisor;
    double resultado;
    
    
    public double getDividendo() {
        return dividendo;
    }

    public void setDividendo(double dividendo) {
        this.dividendo = dividendo;
    }

    public double getDivisor() {
        return divisor;
    }

    public void setDivisor(double divisor) {
        this.divisor = divisor;
    }
    
    

    public Division(double dividendo, double divisor) {
        this.dividendo = dividendo;
        this.divisor = divisor;
    }
    
    public void dividir(){
        
        resultado= dividendo/divisor;
    }
}
