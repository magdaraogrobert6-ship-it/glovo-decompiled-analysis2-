package org.joda.time.format;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import com.mapbox.common.logger.LogPriority;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;

/* JADX INFO: loaded from: classes4.dex */
public class DateTimeFormat {
    static final int DATE = 0;
    static final int DATETIME = 2;
    static final int FULL = 0;
    static final int LONG = 1;
    static final int MEDIUM = 2;
    static final int NONE = 4;
    private static final int PATTERN_CACHE_SIZE = 500;
    static final int SHORT = 3;
    static final int TIME = 1;
    private static final ConcurrentHashMap<String, DateTimeFormatter> cPatternCache = new ConcurrentHashMap<>();
    private static final AtomicReferenceArray<DateTimeFormatter> cStyleCache = new AtomicReferenceArray<>(25);

    public static class StyleFormatter implements InternalPrinter, InternalParser {
        private static final ConcurrentHashMap<StyleFormatterCacheKey, DateTimeFormatter> cCache = new ConcurrentHashMap<>();
        private final int iDateStyle;
        private final int iTimeStyle;
        private final int iType;

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return 40;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return 40;
        }

        private DateTimeFormatter getFormatter(Locale locale) {
            if (locale == null) {
                locale = Locale.getDefault();
            }
            StyleFormatterCacheKey styleFormatterCacheKey = new StyleFormatterCacheKey(this.iType, this.iDateStyle, this.iTimeStyle, locale);
            ConcurrentHashMap<StyleFormatterCacheKey, DateTimeFormatter> concurrentHashMap = cCache;
            DateTimeFormatter dateTimeFormatter = concurrentHashMap.get(styleFormatterCacheKey);
            if (dateTimeFormatter != null) {
                return dateTimeFormatter;
            }
            DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern(getPattern(locale));
            DateTimeFormatter dateTimeFormatterPutIfAbsent = concurrentHashMap.putIfAbsent(styleFormatterCacheKey, dateTimeFormatterForPattern);
            return dateTimeFormatterPutIfAbsent != null ? dateTimeFormatterPutIfAbsent : dateTimeFormatterForPattern;
        }

        public StyleFormatter(int i, int i2, int i3) {
            this.iDateStyle = i;
            this.iTimeStyle = i2;
            this.iType = i3;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            return getFormatter(dateTimeParserBucket.getLocale()).getParser0().parseInto(dateTimeParserBucket, charSequence, i);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            getFormatter(locale).getPrinter0().printTo(appendable, j, chronology, i, dateTimeZone, locale);
        }

        public String getPattern(Locale locale) {
            DateFormat dateInstance;
            int i = this.iType;
            if (i == 0) {
                dateInstance = DateFormat.getDateInstance(this.iDateStyle, locale);
            } else if (i != 1) {
                dateInstance = i != 2 ? null : DateFormat.getDateTimeInstance(this.iDateStyle, this.iTimeStyle, locale);
            } else {
                dateInstance = DateFormat.getTimeInstance(this.iTimeStyle, locale);
            }
            if (dateInstance instanceof SimpleDateFormat) {
                return ((SimpleDateFormat) dateInstance).toPattern();
            }
            Gson$$ExternalSyntheticBUOutline0.m(locale, "No datetime pattern for locale: ");
            return null;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            getFormatter(locale).getPrinter0().printTo(appendable, readablePartial, locale);
        }
    }

    public static void appendPatternTo(DateTimeFormatterBuilder dateTimeFormatterBuilder, String str) {
        parsePatternTo(dateTimeFormatterBuilder, str);
    }

    public static DateTimeFormatter forPattern(String str) {
        return createFormatterForPattern(str);
    }

    public static DateTimeFormatter forStyle(String str) {
        return createFormatterForStyle(str);
    }

    public static DateTimeFormatter fullDateTime() {
        return createFormatterForStyleIndex(0, 0);
    }

    public static DateTimeFormatter longDateTime() {
        return createFormatterForStyleIndex(1, 1);
    }

    public static DateTimeFormatter mediumDateTime() {
        return createFormatterForStyleIndex(2, 2);
    }

    public static DateTimeFormatter shortDateTime() {
        return createFormatterForStyleIndex(3, 3);
    }

    public static class StyleFormatterCacheKey {
        private final int combinedTypeAndStyle;
        private final Locale locale;

        public StyleFormatterCacheKey(int i, int i2, int i3, Locale locale) {
            this.locale = locale;
            this.combinedTypeAndStyle = i + (i2 << 4) + (i3 << 8);
        }

        public int hashCode() {
            int i = this.combinedTypeAndStyle;
            Locale locale = this.locale;
            return ((i + 31) * 31) + (locale == null ? 0 : locale.hashCode());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof StyleFormatterCacheKey)) {
                return false;
            }
            StyleFormatterCacheKey styleFormatterCacheKey = (StyleFormatterCacheKey) obj;
            if (this.combinedTypeAndStyle != styleFormatterCacheKey.combinedTypeAndStyle) {
                return false;
            }
            Locale locale = this.locale;
            Locale locale2 = styleFormatterCacheKey.locale;
            if (locale == null) {
                if (locale2 != null) {
                    return false;
                }
            } else if (!locale.equals(locale2)) {
                return false;
            }
            return true;
        }
    }

    private static DateTimeFormatter createFormatterForPattern(String str) {
        DateTimeFormatter dateTimeFormatterPutIfAbsent;
        if (str == null || str.length() == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Invalid pattern specification: Pattern is null or empty");
            return null;
        }
        ConcurrentHashMap<String, DateTimeFormatter> concurrentHashMap = cPatternCache;
        DateTimeFormatter formatter = concurrentHashMap.get(str);
        if (formatter == null) {
            DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
            parsePatternTo(dateTimeFormatterBuilder, str);
            formatter = dateTimeFormatterBuilder.toFormatter();
            if (concurrentHashMap.size() < 500 && (dateTimeFormatterPutIfAbsent = concurrentHashMap.putIfAbsent(str, formatter)) != null) {
                return dateTimeFormatterPutIfAbsent;
            }
        }
        return formatter;
    }

    public static DateTimeFormatter fullDate() {
        return createFormatterForStyleIndex(0, 4);
    }

    public static DateTimeFormatter fullTime() {
        return createFormatterForStyleIndex(4, 0);
    }

    public static DateTimeFormatter longDate() {
        return createFormatterForStyleIndex(1, 4);
    }

    public static DateTimeFormatter longTime() {
        return createFormatterForStyleIndex(4, 1);
    }

    public static DateTimeFormatter mediumDate() {
        return createFormatterForStyleIndex(2, 4);
    }

    public static DateTimeFormatter mediumTime() {
        return createFormatterForStyleIndex(4, 2);
    }

    private static String parseToken(String str, int[] iArr) {
        StringBuilder sb = new StringBuilder();
        int i = iArr[0];
        int length = str.length();
        char cCharAt = str.charAt(i);
        if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
            sb.append('\'');
            boolean z = false;
            while (i < length) {
                char cCharAt2 = str.charAt(i);
                if (cCharAt2 != '\'') {
                    if (!z && ((cCharAt2 >= 'A' && cCharAt2 <= 'Z') || (cCharAt2 >= 'a' && cCharAt2 <= 'z'))) {
                        i--;
                        break;
                    }
                    sb.append(cCharAt2);
                } else {
                    int i2 = i + 1;
                    if (i2 >= length || str.charAt(i2) != '\'') {
                        z = !z;
                    } else {
                        sb.append(cCharAt2);
                        i = i2;
                    }
                }
                i++;
            }
        } else {
            sb.append(cCharAt);
            while (true) {
                int i3 = i + 1;
                if (i3 >= length || str.charAt(i3) != cCharAt) {
                    break;
                }
                sb.append(cCharAt);
                i = i3;
            }
        }
        iArr[0] = i;
        return sb.toString();
    }

    public static DateTimeFormatter shortDate() {
        return createFormatterForStyleIndex(3, 4);
    }

    public static DateTimeFormatter shortTime() {
        return createFormatterForStyleIndex(4, 3);
    }

    private static DateTimeFormatter createFormatterForStyle(String str) {
        if (str != null && str.length() == 2) {
            int iSelectStyle = selectStyle(str.charAt(0));
            int iSelectStyle2 = selectStyle(str.charAt(1));
            if (iSelectStyle == 4 && iSelectStyle2 == 4) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Style '--' is invalid");
                return null;
            }
            return createFormatterForStyleIndex(iSelectStyle, iSelectStyle2);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Invalid style specification: ", str));
        return null;
    }

    private static DateTimeFormatter createFormatterForStyleIndex(int i, int i2) {
        int i3 = (i << 2) + i + i2;
        AtomicReferenceArray<DateTimeFormatter> atomicReferenceArray = cStyleCache;
        if (i3 >= atomicReferenceArray.length()) {
            return createDateTimeFormatter(i, i2);
        }
        DateTimeFormatter dateTimeFormatter = atomicReferenceArray.get(i3);
        if (dateTimeFormatter != null) {
            return dateTimeFormatter;
        }
        DateTimeFormatter dateTimeFormatterCreateDateTimeFormatter = createDateTimeFormatter(i, i2);
        while (!atomicReferenceArray.compareAndSet(i3, null, dateTimeFormatterCreateDateTimeFormatter)) {
            if (atomicReferenceArray.get(i3) != null) {
                return cStyleCache.get(i3);
            }
        }
        return dateTimeFormatterCreateDateTimeFormatter;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x017f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00df  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:68:0x0105  */
    /* JADX WARN: Code duplicated, block: B:70:0x0114  */
    /* JADX WARN: Code duplicated, block: B:73:0x011c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x011e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0124  */
    /* JADX WARN: Code duplicated, block: B:78:0x0128  */
    /* JADX WARN: Code duplicated, block: B:79:0x012c  */
    /* JADX WARN: Switch 'out' block B:57:0x00c0 for B:37:0x005d already processed. Defaulting to fallback option. */
    private static void parsePatternTo(DateTimeFormatterBuilder dateTimeFormatterBuilder, String str) {
        int i;
        boolean z;
        int length = str.length();
        int[] iArr = new int[1];
        int i2 = 0;
        while (i2 < length) {
            iArr[0] = i2;
            String token = parseToken(str, iArr);
            int i3 = iArr[0];
            int length2 = token.length();
            if (length2 == 0) {
                return;
            }
            char cCharAt = token.charAt(0);
            if (cCharAt == '\'') {
                String strSubstring = token.substring(1);
                if (strSubstring.length() == 1) {
                    dateTimeFormatterBuilder.appendLiteral(strSubstring.charAt(0));
                } else {
                    dateTimeFormatterBuilder.appendLiteral(new String(strSubstring));
                }
            } else if (cCharAt == 'K') {
                dateTimeFormatterBuilder.appendHourOfHalfday(length2);
            } else if (cCharAt != 'M') {
                if (cCharAt == 'S') {
                    dateTimeFormatterBuilder.appendFractionOfSecond(length2, length2);
                } else if (cCharAt == 'a') {
                    dateTimeFormatterBuilder.appendHalfdayOfDayText();
                } else if (cCharAt == 'h') {
                    dateTimeFormatterBuilder.appendClockhourOfHalfday(length2);
                } else if (cCharAt == 'k') {
                    dateTimeFormatterBuilder.appendClockhourOfDay(length2);
                } else if (cCharAt == 'm') {
                    dateTimeFormatterBuilder.appendMinuteOfHour(length2);
                } else if (cCharAt == 's') {
                    dateTimeFormatterBuilder.appendSecondOfMinute(length2);
                } else if (cCharAt == 'G') {
                    dateTimeFormatterBuilder.appendEraText();
                } else if (cCharAt == 'H') {
                    dateTimeFormatterBuilder.appendHourOfDay(length2);
                } else if (cCharAt == 'Y') {
                    if (length2 != 2) {
                        if (i3 + 1 < length) {
                            iArr[0] = iArr[0] + 1;
                            z = !isNumericToken(parseToken(str, iArr));
                            iArr[0] = iArr[0] - 1;
                        } else {
                            z = true;
                        }
                        if (cCharAt == 'x') {
                            dateTimeFormatterBuilder.appendTwoDigitYear(new DateTime().getYear() - 30, z);
                        } else {
                            dateTimeFormatterBuilder.appendTwoDigitWeekyear(new DateTime().getWeekyear() - 30, z);
                        }
                    } else {
                        i = 9;
                        if (i3 + 1 < length) {
                            iArr[0] = iArr[0] + 1;
                            i = isNumericToken(parseToken(str, iArr)) ? length2 : 9;
                            iArr[0] = iArr[0] - 1;
                        }
                        if (cCharAt != 'Y') {
                            dateTimeFormatterBuilder.appendYearOfEra(length2, i);
                        } else if (cCharAt != 'x') {
                            dateTimeFormatterBuilder.appendWeekyear(length2, i);
                        } else if (cCharAt != 'y') {
                            dateTimeFormatterBuilder.appendYear(length2, i);
                        }
                    }
                } else if (cCharAt != 'Z') {
                    if (cCharAt == 'd') {
                        dateTimeFormatterBuilder.appendDayOfMonth(length2);
                    } else if (cCharAt != 'e') {
                        switch (cCharAt) {
                            case 'C':
                                dateTimeFormatterBuilder.appendCenturyOfEra(length2, length2);
                                continue;
                            case 'D':
                                dateTimeFormatterBuilder.appendDayOfYear(length2);
                                continue;
                            case 'E':
                                if (length2 < 4) {
                                    dateTimeFormatterBuilder.appendDayOfWeekShortText();
                                } else {
                                    dateTimeFormatterBuilder.appendDayOfWeekText();
                                    continue;
                                }
                                break;
                            default:
                                switch (cCharAt) {
                                    case 'w':
                                        dateTimeFormatterBuilder.appendWeekOfWeekyear(length2);
                                        break;
                                    case 'x':
                                    case 'y':
                                        if (length2 != 2) {
                                            i = 9;
                                            if (i3 + 1 < length) {
                                                iArr[0] = iArr[0] + 1;
                                                if (isNumericToken(parseToken(str, iArr))) {
                                                }
                                                iArr[0] = iArr[0] - 1;
                                            }
                                            if (cCharAt != 'Y') {
                                                dateTimeFormatterBuilder.appendYearOfEra(length2, i);
                                            } else if (cCharAt != 'x') {
                                                dateTimeFormatterBuilder.appendWeekyear(length2, i);
                                            } else if (cCharAt != 'y') {
                                                dateTimeFormatterBuilder.appendYear(length2, i);
                                            }
                                        } else {
                                            if (i3 + 1 < length) {
                                                iArr[0] = iArr[0] + 1;
                                                z = !isNumericToken(parseToken(str, iArr));
                                                iArr[0] = iArr[0] - 1;
                                            } else {
                                                z = true;
                                            }
                                            if (cCharAt == 'x') {
                                                dateTimeFormatterBuilder.appendTwoDigitWeekyear(new DateTime().getWeekyear() - 30, z);
                                            } else {
                                                dateTimeFormatterBuilder.appendTwoDigitYear(new DateTime().getYear() - 30, z);
                                            }
                                        }
                                        break;
                                    case 'z':
                                        if (length2 < 4) {
                                            dateTimeFormatterBuilder.appendTimeZoneShortName(null);
                                        } else {
                                            dateTimeFormatterBuilder.appendTimeZoneName();
                                            continue;
                                        }
                                        break;
                                    default:
                                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Illegal pattern component: ".concat(token));
                                        return;
                                }
                                break;
                        }
                    } else {
                        dateTimeFormatterBuilder.appendDayOfWeek(length2);
                    }
                } else if (length2 == 1) {
                    dateTimeFormatterBuilder.appendTimeZoneOffset(null, "Z", false, 2, 2);
                } else if (length2 == 2) {
                    dateTimeFormatterBuilder.appendTimeZoneOffset(null, "Z", true, 2, 2);
                } else {
                    dateTimeFormatterBuilder.appendTimeZoneId();
                }
            } else if (length2 < 3) {
                dateTimeFormatterBuilder.appendMonthOfYear(length2);
            } else if (length2 >= 4) {
                dateTimeFormatterBuilder.appendMonthOfYearText();
            } else {
                dateTimeFormatterBuilder.appendMonthOfYearShortText();
            }
            i2 = i3 + 1;
        }
    }

    public static String patternForStyle(String str, Locale locale) {
        DateTimeFormatter dateTimeFormatterCreateFormatterForStyle = createFormatterForStyle(str);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        return ((StyleFormatter) dateTimeFormatterCreateFormatterForStyle.getPrinter0()).getPattern(locale);
    }

    private static boolean isNumericToken(String str) {
        int length = str.length();
        if (length > 0) {
            switch (str.charAt(0)) {
                case 'C':
                case 'D':
                case 'F':
                case 'H':
                case 'K':
                case 'S':
                case 'W':
                case 'Y':
                case LogPriority.NONE /* 99 */:
                case 'd':
                case 'e':
                case 'h':
                case 'k':
                case 'm':
                case 's':
                case 'w':
                case 'x':
                case 'y':
                    return true;
                case 'M':
                    if (length <= 2) {
                        return true;
                    }
                default:
                    return false;
            }
        }
        return false;
    }

    private static DateTimeFormatter createDateTimeFormatter(int i, int i2) {
        int i3;
        if (i == 4) {
            i3 = 1;
        } else {
            i3 = i2 == 4 ? 0 : 2;
        }
        StyleFormatter styleFormatter = new StyleFormatter(i, i2, i3);
        return new DateTimeFormatter(styleFormatter, styleFormatter);
    }

    private static int selectStyle(char c) {
        if (c == '-') {
            return 4;
        }
        if (c == 'F') {
            return 0;
        }
        if (c == 'S') {
            return 3;
        }
        if (c == 'L') {
            return 1;
        }
        if (c == 'M') {
            return 2;
        }
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(c, "Invalid style character: ");
        return 0;
    }
}
