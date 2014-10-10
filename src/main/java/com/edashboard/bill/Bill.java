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
    private String billTrendChart;
    private String name;
    private String msisdn;
    private String email;
    private String upgradeMessage;

    public String getUpgradeMessage() {
        return upgradeMessage;
    }

    public void setUpgradeMessage(String upgradeMessage) {
        this.upgradeMessage = upgradeMessage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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

    public String getBillTrendChart() {
        return billTrendChart;
    }

    public void setBillTrendChart(String billTrendChart) {
        this.billTrendChart = billTrendChart;
    }
}
