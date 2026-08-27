package o;

import android.content.res.Resources;
import android.os.Build;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getLocalHtmlUrlFromRemoteUrllambda5 {
    public static void write(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (!(list.get(i) instanceof Map)) {
                throw new ClassCastException(String.format(java.util.Locale.US, "value %s for idx %d in %s is not object", list.get(i), Integer.valueOf(i), list));
            }
        }
    }

    public static void serializer(Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 29) {
            getXor.RemoteActionCompatParcelizer(theme);
            return;
        }
        synchronized (getUp.write) {
            if (!getUp.IconCompatParcelizer) {
                try {
                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                    getUp.serializer = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                getUp.IconCompatParcelizer = true;
            }
            Method method = getUp.serializer;
            if (method != null) {
                try {
                    method.invoke(theme, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    getUp.serializer = null;
                }
            }
        }
    }

    public static long serializer(String str) throws java.text.ParseException {
        boolean z;
        String strSubstring;
        int iCharAt;
        if (str.isEmpty() || str.charAt(str.length() - 1) != 's') {
            throw new java.text.ParseException("Invalid duration string: ".concat(str), 0);
        }
        if (str.charAt(0) == '-') {
            str = str.substring(1);
            z = true;
        } else {
            z = false;
        }
        String strSerializer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(1, 0, str);
        int iIndexOf = strSerializer.indexOf(46);
        if (iIndexOf != -1) {
            strSubstring = strSerializer.substring(iIndexOf + 1);
            strSerializer = strSerializer.substring(0, iIndexOf);
        } else {
            strSubstring = "";
        }
        long j = Long.parseLong(strSerializer);
        if (strSubstring.isEmpty()) {
            iCharAt = 0;
        } else {
            iCharAt = 0;
            for (int i = 0; i < 9; i++) {
                iCharAt *= 10;
                if (i < strSubstring.length()) {
                    if (strSubstring.charAt(i) < '0' || strSubstring.charAt(i) > '9') {
                        throw new java.text.ParseException("Invalid nanoseconds.", 0);
                    }
                    iCharAt = (strSubstring.charAt(i) - '0') + iCharAt;
                }
            }
        }
        if (j < 0) {
            throw new java.text.ParseException("Invalid duration string: ".concat(str), 0);
        }
        if (z) {
            j = -j;
            iCharAt = -iCharAt;
        }
        try {
            return RemoteActionCompatParcelizer(iCharAt, j);
        } catch (IllegalArgumentException unused) {
            throw new java.text.ParseException("Duration value is out of range.", 0);
        }
    }

    public static Double IconCompatParcelizer(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (!(obj instanceof String)) {
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.IconCompatParcelizer("value '%s' for key '%s' in '%s' is not a number", new Object[]{obj, str, map});
            return null;
        }
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.IconCompatParcelizer("value '%s' for key '%s' is not a double", new Object[]{obj, str});
            return null;
        }
    }

    public static Map MediaBrowserCompatMediaItem(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
    }

    public static Long MediaSessionCompatQueueItem(String str, Map map) {
        String strRatingCompat = RatingCompat(str, map);
        if (strRatingCompat == null) {
            return null;
        }
        try {
            return Long.valueOf(serializer(strRatingCompat));
        } catch (java.text.ParseException e) {
            DrawableTransformation.read((Throwable) e);
            return null;
        }
    }

    public static String RatingCompat(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
    }

    public static Boolean read(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, str, map));
    }

    public static List serializer(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
    }

    public static Integer write(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (!(obj instanceof Double)) {
            if (!(obj instanceof String)) {
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.IconCompatParcelizer("value '%s' for key '%s' is not an integer", new Object[]{obj, str});
                return null;
            }
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.IconCompatParcelizer("value '%s' for key '%s' is not an integer", new Object[]{obj, str});
                return null;
            }
        }
        Double d = (Double) obj;
        int iIntValue = d.intValue();
        if (iIntValue == d.doubleValue()) {
            return Integer.valueOf(iIntValue);
        }
        throw new ClassCastException("Number expected to be integer: " + d);
    }

    public static List RemoteActionCompatParcelizer(String str, Map map) {
        List listSerializer = serializer(str, map);
        if (listSerializer == null) {
            return null;
        }
        for (int i = 0; i < listSerializer.size(); i++) {
            if (!(listSerializer.get(i) instanceof String)) {
                throw new ClassCastException(String.format(java.util.Locale.US, "value '%s' for idx %d in '%s' is not string", listSerializer.get(i), Integer.valueOf(i), listSerializer));
            }
        }
        return listSerializer;
    }

    public static long RemoteActionCompatParcelizer(int i, long j) {
        long j2 = i;
        if (j2 <= -1000000000 || j2 >= 1000000000) {
            j = compareTo9YPOF3E.read(j, j2 / 1000000000);
            i = (int) (j2 % 1000000000);
        }
        if (j > 0 && i < 0) {
            i = (int) (((long) i) + 1000000000);
            j--;
        }
        if (j < 0 && i > 0) {
            i = (int) (((long) i) - 1000000000);
            j++;
        }
        if (j >= -315576000000L && j <= 315576000000L) {
            long j3 = i;
            if (j3 >= -999999999 && j3 < 1000000000 && ((j >= 0 && i >= 0) || (j <= 0 && i <= 0))) {
                long nanos = TimeUnit.SECONDS.toNanos(j);
                long j4 = nanos + j3;
                return (((j3 ^ nanos) > 0L ? 1 : ((j3 ^ nanos) == 0L ? 0 : -1)) < 0) | ((nanos ^ j4) >= 0) ? j4 : ((j4 >>> 63) ^ 1) + Long.MAX_VALUE;
            }
        }
        throw new IllegalArgumentException("Duration is not valid. See proto definition for valid values. Seconds (" + j + ") must be in range [-315,576,000,000, +315,576,000,000]. Nanos (" + i + ") must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds");
    }
}
