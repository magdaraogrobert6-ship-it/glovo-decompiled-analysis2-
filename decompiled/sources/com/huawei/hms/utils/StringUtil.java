package com.huawei.hms.utils;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.huawei.hms.framework.common.ExceptionCode;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class StringUtil {
    private static final Pattern a = Pattern.compile("(^([0-9]{1,2}\\.){2}[0-9]{1,2}$)|(^([0-9]{1,2}\\.){3}[0-9]{1,3}$)");

    private StringUtil() {
    }

    public static String addByteForNum(String str, int i, char c) {
        if (str == null) {
            str = "";
        }
        int length = str.length();
        if (length == i) {
            return str;
        }
        if (length > i) {
            return str.substring(length - i);
        }
        StringBuffer stringBuffer = new StringBuffer();
        while (length < i) {
            stringBuffer.append(c);
            length++;
        }
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    public static boolean checkVersion(String str) {
        return a.matcher(str).find();
    }

    public static String objDesc(Object obj) {
        if (obj == null) {
            return "null";
        }
        return obj.getClass().getName() + '@' + Integer.toHexString(obj.hashCode());
    }

    public static int convertVersion2Integer(String str) {
        if (!checkVersion(str)) {
            return 0;
        }
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length < 3) {
            return 0;
        }
        int i = (Integer.parseInt(strArrSplit[2]) * 1000) + (Integer.parseInt(strArrSplit[1]) * AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength) + (Integer.parseInt(strArrSplit[0]) * ExceptionCode.CRASH_EXCEPTION);
        return strArrSplit.length == 4 ? Integer.parseInt(strArrSplit[3]) + i : i;
    }
}
