package Udemy.Classes;

public class Car {
    private String model;
    
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        }
        else {
            this.model = "Unknown";
        }
    } 

    public String getModel() {
        return this.model;
    }

    
}
