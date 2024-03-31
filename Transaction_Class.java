/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm_2211105_sec4;

/**
 *
 * @author User
 */
public class Transaction_Class {
    int TranID;
    int Amount;   

    public Transaction_Class(int TranID, int Amount) {
        this.TranID = TranID;
        this.Amount = Amount;
    }
    

    public int getAmount() {
        return Amount;
    }

    public int getTranID() {
        return TranID;
    }
    
    public void setTranID(int TranID) {
        this.TranID = TranID;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
