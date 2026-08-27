package o;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class accessstringAndKey {
    private static final Pattern IconCompatParcelizer = Pattern.compile("-([^-]+?)(?:\\.gz)?$");

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public static Integer serializer(String str) {
        String strGroup;
        if (str.contains("-")) {
            Matcher matcher = IconCompatParcelizer.matcher(str);
            if (matcher.find()) {
                strGroup = matcher.group(1);
            } else {
                strGroup = null;
            }
        } else {
            strGroup = null;
        }
        if (strGroup != null && strGroup.length() >= 8) {
            try {
                return Integer.valueOf(strGroup.substring(0, 8));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public static Date write(String str) {
        String strSubstring;
        String str2;
        if (str.contains("-")) {
            Matcher matcher = IconCompatParcelizer.matcher(str);
            if (matcher.find()) {
                strSubstring = matcher.group(1);
            } else {
                strSubstring = null;
            }
        } else {
            strSubstring = null;
        }
        if (strSubstring != null) {
            if (strSubstring.contains(".")) {
                try {
                    strSubstring = strSubstring.substring(0, strSubstring.lastIndexOf(".") + 4);
                    str2 = "yyyyMMddHHmmss.SSS";
                } catch (IndexOutOfBoundsException unused) {
                }
            } else {
                str2 = strSubstring.length() > 8 ? "yyyyMMddHHmmss" : "yyyyMMdd";
            }
            try {
                return new SimpleDateFormat(str2, java.util.Locale.US).parse(strSubstring);
            } catch (java.text.ParseException unused2) {
                return null;
            }
        }
        return null;
    }
}
