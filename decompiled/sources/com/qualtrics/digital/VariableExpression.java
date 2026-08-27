package com.qualtrics.digital;

import io.sentry.android.core.SentryLogcatAdapter;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
class VariableExpression extends Expression {
    private String Key;
    private String PropertyType;
    private String RightOperand;
    private Properties properties;

    private double getDaysInMilliseconds(double d) {
        return d * 24.0d * 60.0d * 60.0d * 1000.0d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0057  */
    private boolean evaluateDatePropertyType() {
        byte b;
        Long dateTime = this.properties.getDateTime(this.Key);
        String lowerCase = getOperator().toLowerCase();
        lowerCase.getClass();
        switch (lowerCase) {
            case "equalto":
                b = 0;
                break;
            case "empty":
                b = 1;
                break;
            case "greaterthan":
                b = 2;
                break;
            case "notempty":
                b = 3;
                break;
            case "lessthan":
                b = 4;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            return dateTime != null && getMillisecondsInDays((double) (System.currentTimeMillis() - dateTime.longValue())) == Double.parseDouble(this.RightOperand);
        }
        if (b == 1) {
            return dateTime == null;
        }
        if (b == 2) {
            return dateTime != null && ((double) (System.currentTimeMillis() - dateTime.longValue())) > getDaysInMilliseconds(Double.parseDouble(this.RightOperand));
        }
        if (b == 3) {
            return dateTime != null;
        }
        if (b == 4) {
            return dateTime != null && ((double) (System.currentTimeMillis() - dateTime.longValue())) < getDaysInMilliseconds(Double.parseDouble(this.RightOperand));
        }
        SentryLogcatAdapter.serializer("Qualtrics", "Unexpected variable operator: " + getOperator());
        return false;
    }

    public VariableExpression(String str, String str2, String str3, String str4, String str5, String str6) {
        super(str, str2, str3);
        this.Key = str4;
        this.RightOperand = str5;
        this.PropertyType = str6;
        this.properties = Qualtrics.instance().properties;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.qualtrics.digital.Expression, com.qualtrics.digital.IEvaluable
    public boolean evaluate() {
        try {
            String str = this.PropertyType;
            if (str != null && str.equals("Date")) {
                return evaluateDatePropertyType();
            }
            String lowerCase = getOperator().toLowerCase();
            switch (lowerCase.hashCode()) {
                case -1777586444:
                    if (lowerCase.equals("matchesregex")) {
                        return Pattern.matches(this.RightOperand, this.properties.getString(this.Key));
                    }
                    SentryLogcatAdapter.serializer("Qualtrics", "Unexpected variable operator: " + getOperator());
                    return false;
                case -1505265489:
                    if (lowerCase.equals("equalto")) {
                        boolean zEqualsIgnoreCase = "Number".equalsIgnoreCase(this.PropertyType);
                        Properties properties = this.properties;
                        if (zEqualsIgnoreCase) {
                            return properties.getNumber(this.Key).doubleValue() == Double.parseDouble(this.RightOperand);
                        }
                        return properties.getString(this.Key).equals(this.RightOperand);
                    }
                    SentryLogcatAdapter.serializer("Qualtrics", "Unexpected variable operator: " + getOperator());
                    return false;
                case -587108553:
                    if (lowerCase.equals("lessthanorequal")) {
                        return this.properties.getNumber(this.Key).doubleValue() <= Double.parseDouble(this.RightOperand);
                    }
                    SentryLogcatAdapter.serializer("Qualtrics", "Unexpected variable operator: " + getOperator());
                    return false;
                case -567445985:
                    if (lowerCase.equals("contains")) {
                        return this.properties.getString(this.Key).contains(this.RightOperand);
                    }
                    SentryLogcatAdapter.serializer("Qualtrics", "Unexpected variable operator: " + getOperator());
                    return false;
                case -108361092:
                    if (lowerCase.equals("notequalto")) {
                        boolean zEqualsIgnoreCase2 = "Number".equalsIgnoreCase(this.PropertyType);
                        Properties properties2 = this.properties;
                        if (zEqualsIgnoreCase2) {
                            return properties2.getNumber(this.Key).doubleValue() != Double.parseDouble(this.RightOperand);
                        }
                        return !properties2.getString(this.Key).equals(this.RightOperand);
                    }
                    SentryLogcatAdapter.serializer("Qualtrics", "Unexpected variable operator: " + getOperator());
                    return false;
                case 96634189:
                    if (lowerCase.equals("empty")) {
                        return this.properties.getString(this.Key) == null;
                    }
                    SentryLogcatAdapter.serializer("Qualtrics", "Unexpected variable operator: " + getOperator());
                    return false;
                case 490690010:
                    if (lowerCase.equals("doesnotcontain")) {
                        return !this.properties.getString(this.Key).contains(this.RightOperand);
                    }
                    SentryLogcatAdapter.serializer("Qualtrics", "Unexpected variable operator: " + getOperator());
                    return false;
                case 714739254:
                    if (lowerCase.equals("greaterthanorequal")) {
                        return this.properties.getNumber(this.Key).doubleValue() >= Double.parseDouble(this.RightOperand);
                    }
                    SentryLogcatAdapter.serializer("Qualtrics", "Unexpected variable operator: " + getOperator());
                    return false;
                case 926100635:
                    if (lowerCase.equals("greaterthan")) {
                        return this.properties.getNumber(this.Key).doubleValue() > Double.parseDouble(this.RightOperand);
                    }
                    SentryLogcatAdapter.serializer("Qualtrics", "Unexpected variable operator: " + getOperator());
                    return false;
                case 1581885018:
                    if (lowerCase.equals("notempty")) {
                        return this.properties.getString(this.Key) != null;
                    }
                    SentryLogcatAdapter.serializer("Qualtrics", "Unexpected variable operator: " + getOperator());
                    return false;
                case 2090629818:
                    if (lowerCase.equals("lessthan")) {
                        return this.properties.getNumber(this.Key).doubleValue() < Double.parseDouble(this.RightOperand);
                    }
                    SentryLogcatAdapter.serializer("Qualtrics", "Unexpected variable operator: " + getOperator());
                    return false;
                default:
                    SentryLogcatAdapter.serializer("Qualtrics", "Unexpected variable operator: " + getOperator());
                    return false;
            }
        } catch (NullPointerException unused) {
            SentryLogcatAdapter.serializer("Qualtrics", "Unexpected value requested: " + this.Key);
        } catch (NumberFormatException unused2) {
            SentryLogcatAdapter.serializer("Qualtrics", "Unexpected number format: " + this.RightOperand);
        }
    }

    private double getMillisecondsInDays(double d) {
        return Math.floor((((((((d * 1.0d) / 1000.0d) * 1.0d) / 60.0d) * 1.0d) / 60.0d) * 1.0d) / 24.0d);
    }
}
