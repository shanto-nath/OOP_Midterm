/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm_2211105_sec4;

/**
 *
 * @author User
 */
public class Income {
    String income_name;
    String income_category;
    float tax_rate; 

    public Income(String income_name, String income_category, float tax_rate) {
        this.income_name = income_name;
        this.income_category = income_category;
        this.tax_rate = tax_rate;
    }

    public String getIncome_category() {
        return income_category;
    }

    public String getIncome_name() {
        return income_name;
    }

    public float getTax_rate() {
        return tax_rate;
    }

    public void setIncome_category(String income_category) {
        this.income_category = income_category;
    }

    public void setIncome_name(String income_name) {
        this.income_name = income_name;
    }

    public void setTax_rate(float tax_rate) {
        this.tax_rate = tax_rate;
    }
    
    
}
