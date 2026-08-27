package com.qualtrics.digital;

/* JADX INFO: loaded from: classes5.dex */
abstract class Expression implements IEvaluable {
    private String Conjunction;
    private String Operator;
    private String Type;

    @Override // com.qualtrics.digital.IEvaluable
    public abstract boolean evaluate();

    public String getOperator() {
        return this.Operator;
    }

    public String getType() {
        return this.Type;
    }

    @Override // com.qualtrics.digital.IEvaluable
    public boolean isBaseCondition() {
        return this.Conjunction == null;
    }

    public Expression(String str, String str2, String str3) {
        this.Operator = str;
        this.Type = str2;
        this.Conjunction = str3;
    }

    @Override // com.qualtrics.digital.IEvaluable
    public boolean hasAndConjunction() {
        return this.Conjunction.equalsIgnoreCase("and");
    }

    @Override // com.qualtrics.digital.IEvaluable
    public boolean hasOrConjunction() {
        return this.Conjunction.equalsIgnoreCase("or");
    }
}
