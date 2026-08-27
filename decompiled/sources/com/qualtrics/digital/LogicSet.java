package com.qualtrics.digital;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
class LogicSet extends LogicEvaluator implements IEvaluable {
    ArrayList<Expression> Expressions;
    String Type;

    public LogicSet(String str, ArrayList<Expression> arrayList) {
        this.Type = str;
        this.Expressions = arrayList;
    }

    @Override // com.qualtrics.digital.IEvaluable
    public boolean evaluate() {
        ArrayList<Expression> arrayList = this.Expressions;
        return arrayList != null && super.evaluateLogic(arrayList);
    }

    @Override // com.qualtrics.digital.IEvaluable
    public boolean hasAndConjunction() {
        String str = this.Type;
        return str != null && str.equals("AndIf");
    }

    @Override // com.qualtrics.digital.IEvaluable
    public boolean hasOrConjunction() {
        String str = this.Type;
        return str != null && str.equals("ElseIf");
    }

    @Override // com.qualtrics.digital.IEvaluable
    public boolean isBaseCondition() {
        String str = this.Type;
        return str != null && str.equals("If");
    }
}
