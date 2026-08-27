package com.qualtrics.digital.resolvers;

import com.deliveryhero.fwf_customer_profile.util.ConstantsKt;
import com.qualtrics.digital.Properties;
import com.qualtrics.digital.Qualtrics;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.Date;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class CustomPropertyResolver {
    private static Properties properties = Qualtrics.instance().properties;

    private static boolean getNumberOrTextEquality(String str, String str2) {
        String string = properties.getString(str);
        return string != null && string.equals(str2);
    }

    private static boolean getNumberOrTextInequality(String str, String str2) {
        String string = properties.getString(str);
        return (string == null || string.equals(str2)) ? false : true;
    }

    private static boolean isEmptyDate(String str) {
        return properties.getDateTime(str) == null;
    }

    private static boolean isEmptyString(String str) {
        return properties.getString(str) == null;
    }

    private static boolean isNotEmptyDate(String str) {
        return properties.getDateTime(str) != null;
    }

    private static boolean isNotEmptyString(String str) {
        return properties.getString(str) != null;
    }

    public CustomPropertyResolver() {
        properties = Qualtrics.instance().properties;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    public static boolean evaluateCustomProperty(String str, String str2, String str3, String str4) {
        byte b;
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != -1359722156) {
            if (iHashCode != -1359241517) {
                if (iHashCode == -718380177 && str.equals("CustomPropertyNumber")) {
                    b = 2;
                } else {
                    b = -1;
                }
            } else if (str.equals("CustomPropertyText")) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (str.equals("CustomPropertyDate")) {
            b = 0;
        } else {
            b = -1;
        }
        if (b == 0) {
            return evaluateCustomPropertyDate(str2, str3, str4);
        }
        if (b == 1) {
            return evaluateCustomPropertyText(str2, str3, str4);
        }
        if (b == 2) {
            return evaluateCustomPropertyNumber(str2, str3, str4);
        }
        SentryLogcatAdapter.serializer("Qualtrics", "Error, unexpected custom property type: ".concat(str));
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    private static boolean evaluateCustomPropertyDate(String str, String str2, String str3) {
        byte b;
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != 2220) {
            if (iHashCode != 2285) {
                if (iHashCode != 2440) {
                    if (iHashCode != 1022299297) {
                        if (iHashCode == 1810362840 && str.equals("IS_EMPTY")) {
                            b = 4;
                        } else {
                            b = -1;
                        }
                    } else if (str.equals("NOT_EMPTY")) {
                        b = 3;
                    } else {
                        b = -1;
                    }
                } else if (str.equals("LT")) {
                    b = 2;
                } else {
                    b = -1;
                }
            } else if (str.equals("GT")) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (str.equals("EQ")) {
            b = 0;
        } else {
            b = -1;
        }
        if (b == 0) {
            Long dateTime = properties.getDateTime(str2);
            if (dateTime != null) {
                if (getSecondsInDays(Long.valueOf((new Date().getTime() / 1000) - (dateTime.longValue() / 1000))) == Long.parseLong(str3)) {
                    return true;
                }
            }
            return false;
        }
        if (b == 1) {
            Long dateTime2 = properties.getDateTime(str2);
            if (dateTime2 != null) {
                if ((new Date().getTime() / 1000) - (dateTime2.longValue() / 1000) > getDaysInSeconds(Long.valueOf(Long.parseLong(str3))).longValue()) {
                    return true;
                }
            }
            return false;
        }
        if (b != 2) {
            if (b == 3) {
                return isNotEmptyDate(str2);
            }
            if (b == 4) {
                return isEmptyDate(str2);
            }
            SentryLogcatAdapter.serializer("Qualtrics", "Error, unexpected variable operator: ".concat(str));
            return false;
        }
        Long dateTime3 = properties.getDateTime(str2);
        if (dateTime3 != null) {
            if ((new Date().getTime() / 1000) - (dateTime3.longValue() / 1000) < getDaysInSeconds(Long.valueOf(Long.parseLong(str3))).longValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    public static boolean evaluateCustomPropertyNumber(String str, String str2, String str3) {
        str.getClass();
        switch (str) {
            case "EQ":
                return getNumberOrTextEquality(str2, str3);
            case "GT":
                Double number = properties.getNumber(str2);
                if (number != null) {
                    if (number.doubleValue() > Double.parseDouble(str3)) {
                        return true;
                    }
                }
                return false;
            case "LT":
                Double number2 = properties.getNumber(str2);
                if (number2 != null) {
                    if (number2.doubleValue() < Double.parseDouble(str3)) {
                        return true;
                    }
                }
                return false;
            case "GTE":
                Double number3 = properties.getNumber(str2);
                if (number3 != null) {
                    if (number3.doubleValue() >= Double.parseDouble(str3)) {
                        return true;
                    }
                }
                return false;
            case "LTE":
                Double number4 = properties.getNumber(str2);
                if (number4 != null) {
                    if (number4.doubleValue() <= Double.parseDouble(str3)) {
                        return true;
                    }
                }
                return false;
            case "NEQ":
                return getNumberOrTextInequality(str2, str3);
            case "NOT_EMPTY":
                return isNotEmptyString(str2);
            case "IS_EMPTY":
                return isEmptyString(str2);
            default:
                SentryLogcatAdapter.serializer("Qualtrics", "Error, unexpected variable operator: ".concat(str));
                return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    public static boolean evaluateCustomPropertyText(String str, String str2, String str3) {
        str.getClass();
        switch (str) {
            case "NOT_CONTAINS":
                String string = properties.getString(str2);
                return (string == null || string.contains(str3)) ? false : true;
            case "EQ":
                return getNumberOrTextEquality(str2, str3);
            case "NEQ":
                return getNumberOrTextInequality(str2, str3);
            case "REGEX":
                if (str3.isEmpty()) {
                    return false;
                }
                try {
                    return Pattern.compile(str3).matcher(properties.getString(str2)).find();
                } catch (Exception unused) {
                    return false;
                }
            case "CONTAINS":
                String string2 = properties.getString(str2);
                return string2 != null && string2.contains(str3);
            case "NOT_EMPTY":
                return isNotEmptyString(str2);
            case "IS_EMPTY":
                return isEmptyString(str2);
            default:
                SentryLogcatAdapter.serializer("Qualtrics", "Error, unexpected variable operator: ".concat(str));
                return false;
        }
    }

    private static long getSecondsInDays(Long l) {
        return ((l.longValue() / 60) / 60) / 24;
    }

    private static Long getDaysInSeconds(Long l) {
        return Long.valueOf(l.longValue() * ConstantsKt.DEFAULT_PROFILE_TTL);
    }
}
