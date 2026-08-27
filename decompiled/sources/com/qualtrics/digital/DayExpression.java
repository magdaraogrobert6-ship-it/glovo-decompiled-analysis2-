package com.qualtrics.digital;

import io.sentry.android.core.SentryLogcatAdapter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes5.dex */
class DayExpression extends Expression {
    private final String DATE_FORMAT;
    private String LeftOperand;
    private String TimeZone;

    @Override // com.qualtrics.digital.Expression, com.qualtrics.digital.IEvaluable
    public boolean evaluate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE");
        Calendar calendar = Calendar.getInstance();
        String str = this.TimeZone;
        if (str != null) {
            calendar.setTimeZone(TimeZone.getTimeZone(str));
            calendar.setTime(new Date());
        }
        boolean zEquals = simpleDateFormat.format(calendar.getTime()).equals(this.LeftOperand);
        if (getOperator().equalsIgnoreCase("is")) {
            return zEquals;
        }
        if (getOperator().equalsIgnoreCase("isnot")) {
            return !zEquals;
        }
        SentryLogcatAdapter.serializer("Qualtrics", "Unexpected day operator: " + getOperator());
        return false;
    }

    public DayExpression(String str, String str2, String str3, String str4, String str5) {
        super(str, str2, str3);
        this.DATE_FORMAT = "EEE";
        this.LeftOperand = str4;
        this.TimeZone = str5;
    }
}
