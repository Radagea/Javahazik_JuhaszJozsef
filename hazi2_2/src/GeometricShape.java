/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Date;
/**
 *
 * @author Radagea
 */
public class GeometricShape {
    
    private String color = "white";               
    private boolean filled;
    private Date dateCreated;

    public GeometricShape() {
    }
    
    public GeometricShape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    
    
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
   

    public Date getDateCreated() {
        return dateCreated = new Date();
    }

    @Override
    public String toString() {
        return "created on " + getDateCreated()+ "\n" + "color: " + getColor() + " and filled: " + isFilled();
    }  
    
}