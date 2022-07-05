package com.reimbursement;

import java.math.BigDecimal;

public class Reimbursement{

    private BigDecimal value;

    public Reimbursement(BigDecimal value){
        this.value = value;
    }

    public BigDecimal getValue(){
        return value;
    }
}