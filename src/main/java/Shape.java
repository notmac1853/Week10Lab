/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marco
 */
public class Shape {
    private int brdrW;
    private String interColor;
    
    public Shape(){
        brdrW = 0;
        interColor = "None";
    }
    
    public Shape(int b, String c){
        brdrW = b;
        interColor = c;
    }
    
    public int getBrdrW(){
        return brdrW;
    }
    
    public void setBrdrW(int b){
        
    }
    
}
