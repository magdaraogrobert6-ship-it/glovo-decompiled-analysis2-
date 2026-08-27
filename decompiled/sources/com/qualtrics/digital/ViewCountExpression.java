package com.qualtrics.digital;

import io.sentry.android.core.SentryLogcatAdapter;

/* JADX INFO: loaded from: classes5.dex */
class ViewCountExpression extends Expression {
    private String CountType;
    private String RightOperand;

    public ViewCountExpression(String str, String str2, String str3, String str4, String str5) {
        super(str, str2, str3);
        this.RightOperand = str4;
        this.CountType = str5;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.qualtrics.digital.Expression, com.qualtrics.digital.IEvaluable
    public boolean evaluate() {
        int totalViewsVisited;
        try {
            int i = Integer.parseInt(this.RightOperand);
            if (this.CountType.equalsIgnoreCase("page")) {
                totalViewsVisited = ViewCounter.instance().getUniqueViewsVisited();
            } else {
                if (!this.CountType.equalsIgnoreCase("total")) {
                    SentryLogcatAdapter.serializer("Qualtrics", "Unexpected page count count type: " + this.CountType);
                    return false;
                }
                totalViewsVisited = ViewCounter.instance().getTotalViewsVisited();
            }
            String lowerCase = getOperator().toLowerCase();
            switch (lowerCase.hashCode()) {
                case -1505265489:
                    if (lowerCase.equals("equalto")) {
                        return totalViewsVisited == i;
                    }
                    break;
                case -587108553:
                    if (lowerCase.equals("lessthanorequal")) {
                        return totalViewsVisited <= i;
                    }
                    break;
                case -108361092:
                    if (lowerCase.equals("notequalto")) {
                        return totalViewsVisited != i;
                    }
                    break;
                case 714739254:
                    if (lowerCase.equals("greaterthanorequal")) {
                        return totalViewsVisited >= i;
                    }
                    break;
                case 926100635:
                    if (lowerCase.equals("greaterthan")) {
                        return totalViewsVisited > i;
                    }
                    break;
                case 2090629818:
                    if (lowerCase.equals("lessthan")) {
                        return totalViewsVisited < i;
                    }
                    break;
            }
            SentryLogcatAdapter.serializer("Qualtrics", "Unexpected page count operator: " + getOperator());
        } catch (NumberFormatException unused) {
            SentryLogcatAdapter.serializer("Qualtrics", "Unexpected number format: " + this.RightOperand);
        }
        return false;
    }
}
