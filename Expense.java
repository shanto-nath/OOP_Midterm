/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm_2211105_sec4;

/**
 *
 * @author User
 */
public class Expense {
    String expense_name;
    String expense_category;

    public Expense(String expense_name, String expense_category) {
        this.expense_name = expense_name;
        this.expense_category = expense_category;
    }

    public String getExpense_category() {
        return expense_category;
    }

    public String getExpense_name() {
        return expense_name;
    }

    public void setExpense_category(String expense_category) {
        this.expense_category = expense_category;
    }

    public void setExpense_name(String expense_name) {
        this.expense_name = expense_name;
    }
    
    
}
