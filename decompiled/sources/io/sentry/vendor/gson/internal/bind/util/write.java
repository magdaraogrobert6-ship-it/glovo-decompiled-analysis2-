package io.sentry.vendor.gson.internal.bind.util;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes4.dex */
public abstract class write {
    public static final TimeZone RemoteActionCompatParcelizer = TimeZone.getTimeZone("UTC");

    public static int RemoteActionCompatParcelizer(String str, int i, int i2) {
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

    /* JADX WARN: Code duplicated, block: B:60:0x00e8 A[Catch: IllegalArgumentException -> 0x01d3, NumberFormatException -> 0x01d5, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d7, TRY_LEAVE, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d7, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:17:0x0051, B:19:0x0061, B:20:0x0063, B:22:0x006f, B:24:0x0073, B:26:0x0079, B:30:0x0083, B:35:0x0093, B:37:0x009b, B:38:0x009f, B:40:0x00a5, B:45:0x00b2, B:48:0x00bd, B:58:0x00e2, B:60:0x00e8, B:86:0x019a, B:68:0x00fa, B:69:0x0115, B:70:0x0116, B:74:0x0133, B:76:0x0140, B:79:0x0149, B:81:0x0168, B:84:0x0177, B:85:0x0199, B:73:0x0122, B:88:0x01cb, B:89:0x01d2, B:52:0x00cd, B:53:0x00d0, B:47:0x00b9), top: B:105:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:72:0x0121  */
    /* JADX WARN: Code duplicated, block: B:73:0x0122 A[Catch: IllegalArgumentException -> 0x01d3, NumberFormatException -> 0x01d5, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d7, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d7, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:17:0x0051, B:19:0x0061, B:20:0x0063, B:22:0x006f, B:24:0x0073, B:26:0x0079, B:30:0x0083, B:35:0x0093, B:37:0x009b, B:38:0x009f, B:40:0x00a5, B:45:0x00b2, B:48:0x00bd, B:58:0x00e2, B:60:0x00e8, B:86:0x019a, B:68:0x00fa, B:69:0x0115, B:70:0x0116, B:74:0x0133, B:76:0x0140, B:79:0x0149, B:81:0x0168, B:84:0x0177, B:85:0x0199, B:73:0x0122, B:88:0x01cb, B:89:0x01d2, B:52:0x00cd, B:53:0x00d0, B:47:0x00b9), top: B:105:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01cb A[Catch: IllegalArgumentException -> 0x01d3, NumberFormatException -> 0x01d5, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d7, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d7, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:17:0x0051, B:19:0x0061, B:20:0x0063, B:22:0x006f, B:24:0x0073, B:26:0x0079, B:30:0x0083, B:35:0x0093, B:37:0x009b, B:38:0x009f, B:40:0x00a5, B:45:0x00b2, B:48:0x00bd, B:58:0x00e2, B:60:0x00e8, B:86:0x019a, B:68:0x00fa, B:69:0x0115, B:70:0x0116, B:74:0x0133, B:76:0x0140, B:79:0x0149, B:81:0x0168, B:84:0x0177, B:85:0x0199, B:73:0x0122, B:88:0x01cb, B:89:0x01d2, B:52:0x00cd, B:53:0x00d0, B:47:0x00b9), top: B:105:0x0004 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:73:0x0122, please report this as an issue */
    public static Date IconCompatParcelizer(String str, ParsePosition parsePosition) {
        int iRemoteActionCompatParcelizer;
        int iRemoteActionCompatParcelizer2;
        int i;
        int i2;
        int iRemoteActionCompatParcelizer3;
        int iRemoteActionCompatParcelizer4;
        char cCharAt;
        TimeZone timeZone;
        String strSubstring;
        int length;
        String str2;
        String id;
        char cCharAt2;
        int length2;
        try {
            int index = parsePosition.getIndex();
            int i3 = index + 4;
            int iRemoteActionCompatParcelizer5 = RemoteActionCompatParcelizer(str, index, i3);
            if (IconCompatParcelizer(str, i3, '-')) {
                i3 = index + 5;
            }
            int i4 = i3 + 2;
            int iRemoteActionCompatParcelizer6 = RemoteActionCompatParcelizer(str, i3, i4);
            if (IconCompatParcelizer(str, i4, '-')) {
                i4 = i3 + 3;
            }
            int i5 = i4 + 2;
            int iRemoteActionCompatParcelizer7 = RemoteActionCompatParcelizer(str, i4, i5);
            boolean zIconCompatParcelizer = IconCompatParcelizer(str, i5, 'T');
            if (!zIconCompatParcelizer && str.length() <= i5) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iRemoteActionCompatParcelizer5, iRemoteActionCompatParcelizer6 - 1, iRemoteActionCompatParcelizer7);
                parsePosition.setIndex(i5);
                return gregorianCalendar.getTime();
            }
            if (zIconCompatParcelizer) {
                int i6 = i4 + 5;
                iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str, i4 + 3, i6);
                if (IconCompatParcelizer(str, i6, ':')) {
                    i6 = i4 + 6;
                }
                int i7 = i6 + 2;
                iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(str, i6, i7);
                i5 = IconCompatParcelizer(str, i7, ':') ? i6 + 3 : i7;
                if (str.length() > i5 && (cCharAt2 = str.charAt(i5)) != 'Z' && cCharAt2 != '+' && cCharAt2 != '-') {
                    i = i5 + 2;
                    iRemoteActionCompatParcelizer4 = RemoteActionCompatParcelizer(str, i5, i);
                    if (iRemoteActionCompatParcelizer4 > 59 && iRemoteActionCompatParcelizer4 < 63) {
                        iRemoteActionCompatParcelizer4 = 59;
                    }
                    if (IconCompatParcelizer(str, i, '.')) {
                        int i8 = i5 + 3;
                        int i9 = i5 + 4;
                        while (true) {
                            if (i9 < str.length()) {
                                char cCharAt3 = str.charAt(i9);
                                if (cCharAt3 >= '0' && cCharAt3 <= '9') {
                                    i9++;
                                }
                                length2 = i9;
                                break;
                            }
                            length2 = str.length();
                            break;
                        }
                        int iMin = Math.min(length2, i5 + 6);
                        iRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(str, i8, iMin);
                        int i10 = iMin - i8;
                        if (i10 == 1) {
                            iRemoteActionCompatParcelizer3 *= 100;
                        } else if (i10 == 2) {
                            iRemoteActionCompatParcelizer3 *= 10;
                        }
                        i = length2;
                        i2 = iRemoteActionCompatParcelizer2;
                    } else {
                        i2 = iRemoteActionCompatParcelizer2;
                        iRemoteActionCompatParcelizer3 = 0;
                    }
                }
                if (str.length() > i) {
                    cCharAt = str.charAt(i);
                    timeZone = RemoteActionCompatParcelizer;
                    if (cCharAt == 'Z') {
                        length = i + 1;
                    } else {
                        if (cCharAt == '+' && cCharAt != '-') {
                            throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                        }
                        strSubstring = str.substring(i);
                        if (strSubstring.length() >= 5) {
                            strSubstring = strSubstring + "00";
                        }
                        length = i + strSubstring.length();
                        if (!"+0000".equals(strSubstring) && !"+00:00".equals(strSubstring)) {
                            str2 = "GMT" + strSubstring;
                            timeZone = TimeZone.getTimeZone(str2);
                            id = timeZone.getID();
                            if (!id.equals(str2) && !id.replace(":", "").equals(str2)) {
                                throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone.getID());
                            }
                        }
                    }
                    GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                    gregorianCalendar2.setLenient(false);
                    gregorianCalendar2.set(1, iRemoteActionCompatParcelizer5);
                    gregorianCalendar2.set(2, iRemoteActionCompatParcelizer6 - 1);
                    gregorianCalendar2.set(5, iRemoteActionCompatParcelizer7);
                    gregorianCalendar2.set(11, iRemoteActionCompatParcelizer);
                    gregorianCalendar2.set(12, i2);
                    gregorianCalendar2.set(13, iRemoteActionCompatParcelizer4);
                    gregorianCalendar2.set(14, iRemoteActionCompatParcelizer3);
                    parsePosition.setIndex(length);
                    return gregorianCalendar2.getTime();
                }
                throw new IllegalArgumentException("No time zone indicator");
            }
            iRemoteActionCompatParcelizer = 0;
            iRemoteActionCompatParcelizer2 = 0;
            i = i5;
            i2 = iRemoteActionCompatParcelizer2;
            iRemoteActionCompatParcelizer3 = 0;
            iRemoteActionCompatParcelizer4 = 0;
            if (str.length() > i) {
                cCharAt = str.charAt(i);
                timeZone = RemoteActionCompatParcelizer;
                if (cCharAt == 'Z') {
                    length = i + 1;
                } else {
                    if (cCharAt == '+') {
                    }
                    strSubstring = str.substring(i);
                    if (strSubstring.length() >= 5) {
                        strSubstring = strSubstring + "00";
                    }
                    length = i + strSubstring.length();
                    if (!"+0000".equals(strSubstring)) {
                        str2 = "GMT" + strSubstring;
                        timeZone = TimeZone.getTimeZone(str2);
                        id = timeZone.getID();
                        if (!id.equals(str2)) {
                            throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone.getID());
                        }
                    }
                }
                GregorianCalendar gregorianCalendar3 = new GregorianCalendar(timeZone);
                gregorianCalendar3.setLenient(false);
                gregorianCalendar3.set(1, iRemoteActionCompatParcelizer5);
                gregorianCalendar3.set(2, iRemoteActionCompatParcelizer6 - 1);
                gregorianCalendar3.set(5, iRemoteActionCompatParcelizer7);
                gregorianCalendar3.set(11, iRemoteActionCompatParcelizer);
                gregorianCalendar3.set(12, i2);
                gregorianCalendar3.set(13, iRemoteActionCompatParcelizer4);
                gregorianCalendar3.set(14, iRemoteActionCompatParcelizer3);
                parsePosition.setIndex(length);
                return gregorianCalendar3.getTime();
            }
            throw new IllegalArgumentException("No time zone indicator");
        } catch (IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException e) {
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

    public static void read(StringBuilder sb, int i, int i2) {
        String string = Integer.toString(i);
        for (int length = i2 - string.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(string);
    }

    public static boolean IconCompatParcelizer(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }
}
