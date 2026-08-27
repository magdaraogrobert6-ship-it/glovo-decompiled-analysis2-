package com.qualtrics.digital;

import io.sentry.android.core.SentryLogcatAdapter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes5.dex */
class DateExpression extends Expression {
    private final String DATE_FORMAT;
    private String LeftOperand;
    private String TimeZone;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.qualtrics.digital.Expression, com.qualtrics.digital.IEvaluable
    public boolean evaluate() {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            String str = this.TimeZone;
            if (str != null) {
                calendar2.setTimeZone(TimeZone.getTimeZone(str));
                calendar2.setTime(new Date());
            }
            calendar.setTime(simpleDateFormat.parse(this.LeftOperand));
            int i = calendar.get(1) - calendar2.get(1);
            int i2 = calendar.get(6) - calendar2.get(6);
            String lowerCase = getOperator().toLowerCase();
            switch (lowerCase.hashCode()) {
                case -660633517:
                    if (lowerCase.equals("isisbefore")) {
                        return i > 0 || (i == 0 && i2 >= 0);
                    }
                    break;
                case -160738680:
                    if (lowerCase.equals("isisafter")) {
                        return i < 0 || (i == 0 && i2 <= 0);
                    }
                    break;
                case 3370:
                    if (lowerCase.equals("is")) {
                        return i == 0 && i2 == 0;
                    }
                    break;
                case 100504937:
                    if (lowerCase.equals("isnot")) {
                        return (i == 0 && i2 == 0) ? false : true;
                    }
                    break;
                case 197281065:
                    if (lowerCase.equals("isbefore")) {
                        return i > 0 || (i == 0 && i2 > 0);
                    }
                    break;
                case 2083693298:
                    if (lowerCase.equals("isafter")) {
                        return i < 0 || (i == 0 && i2 < 0);
                    }
                    break;
            }
            SentryLogcatAdapter.serializer("Qualtrics", "Unexpected date operator: " + getOperator());
        } catch (ParseException e) {
            SentryLogcatAdapter.read("Qualtrics", "Unexpected date format", e);
        }
        return false;
    }

    public DateExpression(String str, String str2, String str3, String str4, String str5) {
        super(str, str2, str3);
        this.DATE_FORMAT = "yyyy-MM-dd";
        this.LeftOperand = str4;
        this.TimeZone = str5;
    }
}
