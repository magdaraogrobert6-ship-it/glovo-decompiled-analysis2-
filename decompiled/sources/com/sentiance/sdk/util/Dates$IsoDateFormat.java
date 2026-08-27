package com.sentiance.sdk.util;

import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes3.dex */
class Dates$IsoDateFormat extends SimpleDateFormat {
    @Override // java.text.SimpleDateFormat, java.text.DateFormat
    public final StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        StringBuffer stringBuffer2 = super.format(date, stringBuffer, fieldPosition);
        return stringBuffer2.insert(stringBuffer2.length() - 2, ":");
    }

    @Override // java.text.SimpleDateFormat, java.text.DateFormat
    public final Date parse(String str, ParsePosition parsePosition) {
        if (str.length() > 3) {
            str = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(3, 0, str).concat(str.substring(str.length() - 2));
        }
        return super.parse(str, parsePosition);
    }

    public Dates$IsoDateFormat(String str, Locale locale) {
        super(str, locale);
    }
}
