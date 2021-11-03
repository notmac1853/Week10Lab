/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marco
 */
public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(int sz) {
        super(50, "RED");
    }
   
    public Rectangle(int width, int height) {
        super(50, "RED");
        this.width = width;
        this.height = height;
    }
    
    public void setBrdrW(int b){
        
    }
    
    public void setWidth(int width){
        this.width = width;
    }
    
    public void setHeight(int h){
        height = h;
    }
    
}
