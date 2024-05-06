package assignment2.organizations.Pharmacy;

public class Drug {
    String name;
    String indication; 
    String dosage;
    String ingredients;
    String manufacturer;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getIndication(){
        return indication;
    }

    public void setIndication(String indication){
        this.indication = indication;
    }

    public String getDosage(){
        return dosage;
    }

    public void setDosage(String dosage){
        this.dosage = dosage;
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }

    
}
