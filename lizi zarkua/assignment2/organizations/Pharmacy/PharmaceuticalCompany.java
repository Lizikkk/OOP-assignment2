package assignment2.organizations.Pharmacy;

import assignment2.commons.Contactable;
import assignment2.commons.Organization;

import java.util.ArrayList;
import java.util.List;

public class PharmaceuticalCompany extends Organization implements Contactable {

    private List<Drug> drugs;

    public PharmaceuticalCompany() {
        drugs = new ArrayList<>();
    }

    public List<Drug> getDrugs() {
        return drugs;
    }

    public void setDrugs(List<Drug> drugs) {
        this.drugs = drugs;
    }

    public void addDrug(Drug drug) {
        drugs.add(drug);
    }

    public boolean removeDrug(Drug drug) {
        return drugs.remove(drug);
    }

    public String getEmail(){
        return "Pharmacy@company.com";
    }

    public String getPhoneNumber() {
         return "Pharmacy PhoneNumber";
    }

    public String getAddress() {
        return "Pharmaceutical Company address";
    }
}
