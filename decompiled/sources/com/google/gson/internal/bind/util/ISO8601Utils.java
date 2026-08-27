package com.google.gson.internal.bind.util;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public class ISO8601Utils {
    private static final String UTC_ID = "UTC";
    private static final TimeZone TIMEZONE_UTC = TimeZone.getTimeZone(UTC_ID);

    private ISO8601Utils() {
    }

    public static String format(Date date, boolean z, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder((z ? 4 : 0) + 19 + (timeZone.getRawOffset() == 0 ? 1 : 6));
        padInt(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        padInt(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(13), 2);
        if (z) {
            sb.append('.');
            padInt(sb, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i = offset / 60000;
            int iAbs = Math.abs(i / 60);
            int iAbs2 = Math.abs(i % 60);
            sb.append(offset >= 0 ? '+' : '-');
            padInt(sb, iAbs, 2);
            sb.append(':');
            padInt(sb, iAbs2, 2);
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }

    private static int parseInt(String str, int i, int i2) throws NumberFormatException {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int iDigit = Character.digit(str.charAt(i), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: ".concat(str.substring(i, i2)));
            }
            i3 = -iDigit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int iDigit2 = Character.digit(str.charAt(i4), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: ".concat(str.substring(i, i2)));
            }
            i3 = (i3 * 10) - iDigit2;
            i4++;
        }
        return -i3;
    }

    private static void padInt(StringBuilder sb, int i, int i2) {
        String string = Integer.toString(i);
        for (int length = i2 - string.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(string);
    }

    private static boolean checkOffset(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    private static int indexOfNonDigit(String str, int i) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d4 A[Catch: IllegalArgumentException | IndexOutOfBoundsException -> 0x01a4, IndexOutOfBoundsException -> 0x01a6, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException -> 0x01a4, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:17:0x0055, B:19:0x0065, B:20:0x0067, B:22:0x0073, B:24:0x0077, B:26:0x007d, B:30:0x0087, B:35:0x0097, B:37:0x009f, B:47:0x00ce, B:49:0x00d4, B:51:0x00da, B:75:0x016b, B:55:0x00e4, B:56:0x00fc, B:57:0x00fd, B:61:0x010e, B:63:0x011b, B:66:0x0124, B:68:0x0138, B:71:0x0147, B:72:0x0166, B:74:0x0169, B:60:0x0108, B:77:0x019c, B:78:0x01a3, B:41:0x00b7, B:42:0x00ba), top: B:92:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00da A[Catch: IllegalArgumentException | IndexOutOfBoundsException -> 0x01a4, IndexOutOfBoundsException -> 0x01a6, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException -> 0x01a4, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:17:0x0055, B:19:0x0065, B:20:0x0067, B:22:0x0073, B:24:0x0077, B:26:0x007d, B:30:0x0087, B:35:0x0097, B:37:0x009f, B:47:0x00ce, B:49:0x00d4, B:51:0x00da, B:75:0x016b, B:55:0x00e4, B:56:0x00fc, B:57:0x00fd, B:61:0x010e, B:63:0x011b, B:66:0x0124, B:68:0x0138, B:71:0x0147, B:72:0x0166, B:74:0x0169, B:60:0x0108, B:77:0x019c, B:78:0x01a3, B:41:0x00b7, B:42:0x00ba), top: B:92:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00df  */
    /* JADX WARN: Code duplicated, block: B:59:0x0107  */
    /* JADX WARN: Code duplicated, block: B:60:0x0108 A[Catch: IllegalArgumentException | IndexOutOfBoundsException -> 0x01a4, IndexOutOfBoundsException -> 0x01a6, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException -> 0x01a4, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:17:0x0055, B:19:0x0065, B:20:0x0067, B:22:0x0073, B:24:0x0077, B:26:0x007d, B:30:0x0087, B:35:0x0097, B:37:0x009f, B:47:0x00ce, B:49:0x00d4, B:51:0x00da, B:75:0x016b, B:55:0x00e4, B:56:0x00fc, B:57:0x00fd, B:61:0x010e, B:63:0x011b, B:66:0x0124, B:68:0x0138, B:71:0x0147, B:72:0x0166, B:74:0x0169, B:60:0x0108, B:77:0x019c, B:78:0x01a3, B:41:0x00b7, B:42:0x00ba), top: B:92:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0169 A[Catch: IllegalArgumentException | IndexOutOfBoundsException -> 0x01a4, IndexOutOfBoundsException -> 0x01a6, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException -> 0x01a4, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:17:0x0055, B:19:0x0065, B:20:0x0067, B:22:0x0073, B:24:0x0077, B:26:0x007d, B:30:0x0087, B:35:0x0097, B:37:0x009f, B:47:0x00ce, B:49:0x00d4, B:51:0x00da, B:75:0x016b, B:55:0x00e4, B:56:0x00fc, B:57:0x00fd, B:61:0x010e, B:63:0x011b, B:66:0x0124, B:68:0x0138, B:71:0x0147, B:72:0x0166, B:74:0x0169, B:60:0x0108, B:77:0x019c, B:78:0x01a3, B:41:0x00b7, B:42:0x00ba), top: B:92:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x019c A[Catch: IllegalArgumentException | IndexOutOfBoundsException -> 0x01a4, IndexOutOfBoundsException -> 0x01a6, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException -> 0x01a4, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:17:0x0055, B:19:0x0065, B:20:0x0067, B:22:0x0073, B:24:0x0077, B:26:0x007d, B:30:0x0087, B:35:0x0097, B:37:0x009f, B:47:0x00ce, B:49:0x00d4, B:51:0x00da, B:75:0x016b, B:55:0x00e4, B:56:0x00fc, B:57:0x00fd, B:61:0x010e, B:63:0x011b, B:66:0x0124, B:68:0x0138, B:71:0x0147, B:72:0x0166, B:74:0x0169, B:60:0x0108, B:77:0x019c, B:78:0x01a3, B:41:0x00b7, B:42:0x00ba), top: B:92:0x0004 }] */
    public static Date parse(String str, ParsePosition parsePosition) throws ParseException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        char cCharAt;
        String strSubstring;
        int length;
        TimeZone timeZone;
        char cCharAt2;
        try {
            int index = parsePosition.getIndex();
            int i7 = index + 4;
            int i8 = parseInt(str, index, i7);
            if (checkOffset(str, i7, '-')) {
                i7 = index + 5;
            }
            int i9 = i7 + 2;
            int i10 = parseInt(str, i7, i9);
            if (checkOffset(str, i9, '-')) {
                i9 = i7 + 3;
            }
            int i11 = i9 + 2;
            int i12 = parseInt(str, i9, i11);
            boolean zCheckOffset = checkOffset(str, i11, 'T');
            if (!zCheckOffset && str.length() <= i11) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(i8, i10 - 1, i12);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i11);
                return gregorianCalendar.getTime();
            }
            if (zCheckOffset) {
                int i13 = i9 + 5;
                i = parseInt(str, i9 + 3, i13);
                if (checkOffset(str, i13, ':')) {
                    i13 = i9 + 6;
                }
                int i14 = i13 + 2;
                i2 = parseInt(str, i13, i14);
                i11 = checkOffset(str, i14, ':') ? i13 + 3 : i14;
                if (str.length() > i11 && (cCharAt2 = str.charAt(i11)) != 'Z' && cCharAt2 != '+' && cCharAt2 != '-') {
                    i3 = i11 + 2;
                    i6 = parseInt(str, i11, i3);
                    if (i6 > 59 && i6 < 63) {
                        i6 = 59;
                    }
                    if (checkOffset(str, i3, '.')) {
                        int i15 = i11 + 3;
                        int iIndexOfNonDigit = indexOfNonDigit(str, i11 + 4);
                        int iMin = Math.min(iIndexOfNonDigit, i11 + 6);
                        int i16 = parseInt(str, i15, iMin);
                        int i17 = iMin - i15;
                        if (i17 == 1) {
                            i16 *= 100;
                        } else if (i17 == 2) {
                            i16 *= 10;
                        }
                        i3 = iIndexOfNonDigit;
                        i4 = i2;
                        i5 = i16;
                    } else {
                        i4 = i2;
                        i5 = 0;
                    }
                }
                if (str.length() > i3) {
                    cCharAt = str.charAt(i3);
                    if (cCharAt == 'Z') {
                        timeZone = TIMEZONE_UTC;
                        length = i3 + 1;
                    } else {
                        if (cCharAt != '+' && cCharAt != '-') {
                            throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                        }
                        strSubstring = str.substring(i3);
                        if (strSubstring.length() >= 5) {
                            strSubstring = strSubstring.concat("00");
                        }
                        length = i3 + strSubstring.length();
                        if (strSubstring.equals("+0000") && !strSubstring.equals("+00:00")) {
                            String strConcat = "GMT".concat(strSubstring);
                            TimeZone timeZone2 = TimeZone.getTimeZone(strConcat);
                            String id = timeZone2.getID();
                            if (!id.equals(strConcat) && !id.replace(":", "").equals(strConcat)) {
                                throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + strConcat + " given, resolves to " + timeZone2.getID());
                            }
                            timeZone = timeZone2;
                        } else {
                            timeZone = TIMEZONE_UTC;
                        }
                    }
                    GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                    gregorianCalendar2.setLenient(false);
                    gregorianCalendar2.set(1, i8);
                    gregorianCalendar2.set(2, i10 - 1);
                    gregorianCalendar2.set(5, i12);
                    gregorianCalendar2.set(11, i);
                    gregorianCalendar2.set(12, i4);
                    gregorianCalendar2.set(13, i6);
                    gregorianCalendar2.set(14, i5);
                    parsePosition.setIndex(length);
                    return gregorianCalendar2.getTime();
                }
                throw new IllegalArgumentException("No time zone indicator");
            }
            i = 0;
            i2 = 0;
            i3 = i11;
            i4 = i2;
            i5 = 0;
            i6 = 0;
            if (str.length() > i3) {
                cCharAt = str.charAt(i3);
                if (cCharAt == 'Z') {
                    timeZone = TIMEZONE_UTC;
                    length = i3 + 1;
                } else {
                    if (cCharAt != '+') {
                        throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                    }
                    strSubstring = str.substring(i3);
                    if (strSubstring.length() >= 5) {
                        strSubstring = strSubstring.concat("00");
                    }
                    length = i3 + strSubstring.length();
                    if (strSubstring.equals("+0000")) {
                        timeZone = TIMEZONE_UTC;
                    } else {
                        timeZone = TIMEZONE_UTC;
                    }
                }
                GregorianCalendar gregorianCalendar3 = new GregorianCalendar(timeZone);
                gregorianCalendar3.setLenient(false);
                gregorianCalendar3.set(1, i8);
                gregorianCalendar3.set(2, i10 - 1);
                gregorianCalendar3.set(5, i12);
                gregorianCalendar3.set(11, i);
                gregorianCalendar3.set(12, i4);
                gregorianCalendar3.set(13, i6);
                gregorianCalendar3.set(14, i5);
                parsePosition.setIndex(length);
                return gregorianCalendar3.getTime();
            }
            throw new IllegalArgumentException("No time zone indicator");
        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            String strM = str == null ? null : m1$$ExternalSyntheticOutline0.m('\"', "\"", str);
            String message = e.getMessage();
            if (message == null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException(af$$ExternalSyntheticOutline0.m("Failed to parse date [", strM, "]: ", message), parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        }
    }

    public static String format(Date date, boolean z) {
        return format(date, z, TIMEZONE_UTC);
    }

    public static String format(Date date) {
        return format(date, false, TIMEZONE_UTC);
    }
}
