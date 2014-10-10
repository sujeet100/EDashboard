package com.edashboard.bill;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by maverick on 10/10/14.
 */
@XmlRootElement
public class Bill {

    private String billAmount;
    private String dateIssued;
    private String billPeriod;
    private String billDueDate;

    public String getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(String billAmount) {
        this.billAmount = billAmount;
    }

    public String getDateIssued() {
        return dateIssued;
    }

    public void setDateIssued(String dateIssued) {
        this.dateIssued = dateIssued;
    }

    public String getBillPeriod() {
        return billPeriod;
    }

    public void setBillPeriod(String billPeriod) {
        this.billPeriod = billPeriod;
    }

    public String getBillDueDate() {
        return billDueDate;
    }

    public void setBillDueDate(String billDueDate) {
        this.billDueDate = billDueDate;
    }
}
