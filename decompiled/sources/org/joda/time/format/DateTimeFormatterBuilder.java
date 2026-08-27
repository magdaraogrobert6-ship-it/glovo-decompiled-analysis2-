package org.joda.time.format;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.DrawableTransformation;
import o.getAlignmentLinesMap;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadablePartial;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.PreciseDateTimeField;

/* JADX INFO: loaded from: classes4.dex */
public class DateTimeFormatterBuilder {
    private ArrayList<Object> iElementPairs = new ArrayList<>();
    private Object iFormatter;

    public static class CharacterLiteral implements InternalPrinter, InternalParser {
        private final char iValue;

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return 1;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return 1;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(this.iValue);
        }

        public CharacterLiteral(char c) {
            this.iValue = c;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            appendable.append(this.iValue);
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            char upperCase;
            char upperCase2;
            if (i >= charSequence.length()) {
                return ~i;
            }
            char cCharAt = charSequence.charAt(i);
            char c = this.iValue;
            return (cCharAt == c || (upperCase = Character.toUpperCase(cCharAt)) == (upperCase2 = Character.toUpperCase(c)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) ? i + 1 : ~i;
        }
    }

    public static class Fraction implements InternalPrinter, InternalParser {
        private final DateTimeFieldType iFieldType;
        protected int iMaxDigits;
        protected int iMinDigits;

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iMaxDigits;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iMaxDigits;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            DateTimeField field = this.iFieldType.getField(dateTimeParserBucket.getChronology());
            int iMin = Math.min(this.iMaxDigits, charSequence.length() - i);
            long unitMillis = field.getDurationField().getUnitMillis() * 10;
            long j = 0;
            int i2 = 0;
            while (i2 < iMin) {
                char cCharAt = charSequence.charAt(i + i2);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                i2++;
                unitMillis /= 10;
                j += ((long) (cCharAt - '0')) * unitMillis;
            }
            long j2 = j / 10;
            if (i2 != 0 && j2 <= 2147483647L) {
                dateTimeParserBucket.saveField(new PreciseDateTimeField(DateTimeFieldType.millisOfSecond(), MillisDurationField.INSTANCE, field.getDurationField()), (int) j2);
                return i + i2;
            }
            return ~i;
        }

        public void printTo(Appendable appendable, long j, Chronology chronology) throws IOException {
            DateTimeField field = this.iFieldType.getField(chronology);
            int i = this.iMinDigits;
            try {
                long jRemainder = field.remainder(j);
                if (jRemainder != 0) {
                    long[] fractionData = getFractionData(jRemainder, field);
                    long j2 = fractionData[0];
                    int i2 = (int) fractionData[1];
                    String string = (2147483647L & j2) == j2 ? Integer.toString((int) j2) : Long.toString(j2);
                    int length = string.length();
                    while (length < i2) {
                        appendable.append('0');
                        i--;
                        i2--;
                    }
                    if (i < i2) {
                        while (i < i2 && length > 1 && string.charAt(length - 1) == '0') {
                            i2--;
                            length--;
                        }
                        if (length < string.length()) {
                            for (int i3 = 0; i3 < length; i3++) {
                                appendable.append(string.charAt(i3));
                            }
                            return;
                        }
                    }
                    appendable.append(string);
                    return;
                }
                while (true) {
                    i--;
                    if (i < 0) {
                        return;
                    } else {
                        appendable.append('0');
                    }
                }
            } catch (RuntimeException unused) {
                DateTimeFormatterBuilder.appendUnknownString(appendable, i);
            }
        }

        public Fraction(DateTimeFieldType dateTimeFieldType, int i, int i2) {
            this.iFieldType = dateTimeFieldType;
            i2 = i2 > 18 ? 18 : i2;
            this.iMinDigits = i;
            this.iMaxDigits = i2;
        }

        private long[] getFractionData(long j, DateTimeField dateTimeField) {
            long j2;
            long unitMillis = dateTimeField.getDurationField().getUnitMillis();
            int i = this.iMaxDigits;
            while (true) {
                switch (i) {
                    case 1:
                        j2 = 10;
                        break;
                    case 2:
                        j2 = 100;
                        break;
                    case 3:
                        j2 = 1000;
                        break;
                    case 4:
                        j2 = DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM;
                        break;
                    case 5:
                        j2 = 100000;
                        break;
                    case 6:
                        j2 = 1000000;
                        break;
                    case 7:
                        j2 = 10000000;
                        break;
                    case 8:
                        j2 = 100000000;
                        break;
                    case 9:
                        j2 = 1000000000;
                        break;
                    case 10:
                        j2 = 10000000000L;
                        break;
                    case 11:
                        j2 = 100000000000L;
                        break;
                    case 12:
                        j2 = 1000000000000L;
                        break;
                    case 13:
                        j2 = 10000000000000L;
                        break;
                    case 14:
                        j2 = 100000000000000L;
                        break;
                    case 15:
                        j2 = 1000000000000000L;
                        break;
                    case 16:
                        j2 = 10000000000000000L;
                        break;
                    case 17:
                        j2 = 100000000000000000L;
                        break;
                    case 18:
                        j2 = 1000000000000000000L;
                        break;
                    default:
                        j2 = 1;
                        break;
                }
                if ((unitMillis * j2) / j2 == unitMillis) {
                    return new long[]{(j * j2) / unitMillis, i};
                }
                i--;
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            printTo(appendable, readablePartial.getChronology().set(readablePartial, 0L), readablePartial.getChronology());
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            printTo(appendable, j, chronology);
        }
    }

    public static class MatchingParser implements InternalParser {
        private final int iParsedLengthEstimate;
        private final InternalParser[] iParsers;

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iParsedLengthEstimate;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            int i2;
            int i3;
            InternalParser[] internalParserArr = this.iParsers;
            int length = internalParserArr.length;
            Object objSaveState = dateTimeParserBucket.saveState();
            boolean z = false;
            Object objSaveState2 = null;
            int i4 = i;
            int i5 = i4;
            for (int i6 = 0; i6 < length; i6++) {
                InternalParser internalParser = internalParserArr[i6];
                if (internalParser == null) {
                    if (i4 > i) {
                        z = true;
                        break;
                    }
                    return i;
                }
                int into = internalParser.parseInto(dateTimeParserBucket, charSequence, i);
                if (into >= i) {
                    if (into <= i4) {
                        continue;
                    } else {
                        if (into >= charSequence.length() || (i3 = i6 + 1) >= length || internalParserArr[i3] == null) {
                            return into;
                        }
                        objSaveState2 = dateTimeParserBucket.saveState();
                        i4 = into;
                    }
                } else if (into < 0 && (i2 = ~into) > i5) {
                    i5 = i2;
                }
                dateTimeParserBucket.restoreState(objSaveState);
            }
            if (i4 <= i && (i4 != i || !z)) {
                return ~i5;
            }
            if (objSaveState2 != null) {
                dateTimeParserBucket.restoreState(objSaveState2);
            }
            return i4;
        }

        public MatchingParser(InternalParser[] internalParserArr) {
            int iEstimateParsedLength;
            this.iParsers = internalParserArr;
            int length = internalParserArr.length;
            int i = 0;
            while (true) {
                length--;
                if (length < 0) {
                    this.iParsedLengthEstimate = i;
                    return;
                }
                InternalParser internalParser = internalParserArr[length];
                if (internalParser != null && (iEstimateParsedLength = internalParser.estimateParsedLength()) > i) {
                    i = iEstimateParsedLength;
                }
            }
        }
    }

    public static class PaddedNumber extends NumberFormatter {
        protected final int iMinPrintedDigits;

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iMaxParsedDigits;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            if (!readablePartial.isSupported(this.iFieldType)) {
                DateTimeFormatterBuilder.appendUnknownString(appendable, this.iMinPrintedDigits);
                return;
            }
            try {
                FormatUtils.appendPaddedInteger(appendable, readablePartial.get(this.iFieldType), this.iMinPrintedDigits);
            } catch (RuntimeException unused) {
                DateTimeFormatterBuilder.appendUnknownString(appendable, this.iMinPrintedDigits);
            }
        }

        public PaddedNumber(DateTimeFieldType dateTimeFieldType, int i, boolean z, int i2) {
            super(dateTimeFieldType, i, z);
            this.iMinPrintedDigits = i2;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                FormatUtils.appendPaddedInteger(appendable, this.iFieldType.getField(chronology).get(j), this.iMinPrintedDigits);
            } catch (RuntimeException unused) {
                DateTimeFormatterBuilder.appendUnknownString(appendable, this.iMinPrintedDigits);
            }
        }
    }

    public static class StringLiteral implements InternalPrinter, InternalParser {
        private final String iValue;

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iValue.length();
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iValue.length();
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            return DateTimeFormatterBuilder.csStartsWithIgnoreCase(charSequence, i, this.iValue) ? this.iValue.length() + i : ~i;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(this.iValue);
        }

        public StringLiteral(String str) {
            this.iValue = str;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            appendable.append(this.iValue);
        }
    }

    public static class TextField implements InternalPrinter, InternalParser {
        private static Map<Locale, Map<DateTimeFieldType, Object[]>> cParseCache = new ConcurrentHashMap();
        private final DateTimeFieldType iFieldType;
        private final boolean iShort;

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return estimatePrintedLength();
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iShort ? 6 : 20;
        }

        private String print(ReadablePartial readablePartial, Locale locale) {
            if (!readablePartial.isSupported(this.iFieldType)) {
                return "�";
            }
            DateTimeField field = this.iFieldType.getField(readablePartial.getChronology());
            return this.iShort ? field.getAsShortText(readablePartial, locale) : field.getAsText(readablePartial, locale);
        }

        public TextField(DateTimeFieldType dateTimeFieldType, boolean z) {
            this.iFieldType = dateTimeFieldType;
            this.iShort = z;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            int iIntValue;
            Map map;
            Locale locale = dateTimeParserBucket.getLocale();
            Map<DateTimeFieldType, Object[]> concurrentHashMap = cParseCache.get(locale);
            if (concurrentHashMap == null) {
                concurrentHashMap = new ConcurrentHashMap<>();
                cParseCache.put(locale, concurrentHashMap);
            }
            Object[] objArr = concurrentHashMap.get(this.iFieldType);
            if (objArr == null) {
                ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap(32);
                MutableDateTime.Property property = new MutableDateTime(0L, DateTimeZone.UTC).property(this.iFieldType);
                int minimumValueOverall = property.getMinimumValueOverall();
                int maximumValueOverall = property.getMaximumValueOverall();
                if (maximumValueOverall - minimumValueOverall > 32) {
                    return ~i;
                }
                iIntValue = property.getMaximumTextLength(locale);
                while (minimumValueOverall <= maximumValueOverall) {
                    property.set(minimumValueOverall);
                    String asShortText = property.getAsShortText(locale);
                    Boolean bool = Boolean.TRUE;
                    concurrentHashMap2.put(asShortText, bool);
                    concurrentHashMap2.put(property.getAsShortText(locale).toLowerCase(locale), bool);
                    concurrentHashMap2.put(property.getAsShortText(locale).toUpperCase(locale), bool);
                    concurrentHashMap2.put(property.getAsText(locale), bool);
                    concurrentHashMap2.put(property.getAsText(locale).toLowerCase(locale), bool);
                    concurrentHashMap2.put(property.getAsText(locale).toUpperCase(locale), bool);
                    minimumValueOverall++;
                }
                if ("en".equals(locale.getLanguage()) && this.iFieldType == DateTimeFieldType.era()) {
                    Boolean bool2 = Boolean.TRUE;
                    concurrentHashMap2.put("BCE", bool2);
                    concurrentHashMap2.put("bce", bool2);
                    concurrentHashMap2.put("CE", bool2);
                    concurrentHashMap2.put("ce", bool2);
                    iIntValue = 3;
                }
                concurrentHashMap.put(this.iFieldType, new Object[]{concurrentHashMap2, Integer.valueOf(iIntValue)});
                map = concurrentHashMap2;
            } else {
                Map map2 = (Map) objArr[0];
                iIntValue = ((Integer) objArr[1]).intValue();
                map = map2;
            }
            for (int iMin = Math.min(charSequence.length(), iIntValue + i); iMin > i; iMin--) {
                String string = charSequence.subSequence(i, iMin).toString();
                if (map.containsKey(string)) {
                    dateTimeParserBucket.saveField(this.iFieldType, string, locale);
                    return iMin;
                }
            }
            return ~i;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                appendable.append(print(j, chronology, locale));
            } catch (RuntimeException unused) {
                appendable.append((char) 65533);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            try {
                appendable.append(print(readablePartial, locale));
            } catch (RuntimeException unused) {
                appendable.append((char) 65533);
            }
        }

        private String print(long j, Chronology chronology, Locale locale) {
            DateTimeField field = this.iFieldType.getField(chronology);
            if (this.iShort) {
                return field.getAsShortText(j, locale);
            }
            return field.getAsText(j, locale);
        }
    }

    public enum TimeZoneId implements InternalPrinter, InternalParser {
        INSTANCE;

        private static final List<String> ALL_IDS;
        private static final List<String> BASE_GROUPED_IDS = new ArrayList();
        private static final Map<String, List<String>> GROUPED_IDS;
        static final int MAX_LENGTH;
        static final int MAX_PREFIX_LENGTH;

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return MAX_LENGTH;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return MAX_LENGTH;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            String string;
            int length;
            String string2;
            List<String> list = BASE_GROUPED_IDS;
            int length2 = charSequence.length();
            int iMin = Math.min(length2, MAX_PREFIX_LENGTH + i);
            int i2 = i;
            while (true) {
                if (i2 >= iMin) {
                    string = "";
                    length = i;
                    break;
                }
                if (charSequence.charAt(i2) == '/') {
                    int i3 = i2 + 1;
                    string = charSequence.subSequence(i, i3).toString();
                    length = string.length() + i;
                    if (i2 < length2 - 1) {
                        StringBuilder sbM = d$$ExternalSyntheticOutline0.m(string);
                        sbM.append(charSequence.charAt(i3));
                        string2 = sbM.toString();
                    } else {
                        string2 = string;
                    }
                    list = GROUPED_IDS.get(string2);
                    if (list != null) {
                        break;
                    }
                    return ~i;
                }
                i2++;
            }
            String str = null;
            for (int i4 = 0; i4 < list.size(); i4++) {
                String str2 = list.get(i4);
                if (DateTimeFormatterBuilder.csStartsWith(charSequence, length, str2) && (str == null || str2.length() > str.length())) {
                    str = str2;
                }
            }
            if (str == null) {
                return ~i;
            }
            dateTimeParserBucket.setZone(DateTimeZone.forID(string.concat(str)));
            return str.length() + length;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(dateTimeZone != null ? dateTimeZone.getID() : "");
        }

        static {
            ArrayList<String> arrayList = new ArrayList(DateTimeZone.getAvailableIDs());
            ALL_IDS = arrayList;
            Collections.sort(arrayList);
            GROUPED_IDS = new HashMap();
            int iMax = 0;
            int iMax2 = 0;
            for (String str : arrayList) {
                int iIndexOf = str.indexOf(47);
                if (iIndexOf >= 0) {
                    iIndexOf = iIndexOf < str.length() ? iIndexOf + 1 : iIndexOf;
                    iMax2 = Math.max(iMax2, iIndexOf);
                    String strSubstring = str.substring(0, iIndexOf + 1);
                    String strSubstring2 = str.substring(iIndexOf);
                    Map<String, List<String>> map = GROUPED_IDS;
                    if (!map.containsKey(strSubstring)) {
                        map.put(strSubstring, new ArrayList());
                    }
                    map.get(strSubstring).add(strSubstring2);
                } else {
                    BASE_GROUPED_IDS.add(str);
                }
                iMax = Math.max(iMax, str.length());
            }
            MAX_LENGTH = iMax;
            MAX_PREFIX_LENGTH = iMax2;
        }
    }

    public static class TimeZoneName implements InternalPrinter, InternalParser {
        static final int LONG_NAME = 0;
        static final int SHORT_NAME = 1;
        private final Map<String, DateTimeZone> iParseLookup;
        private final int iType;

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iType == 1 ? 4 : 20;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iType == 1 ? 4 : 20;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
        }

        private String print(long j, DateTimeZone dateTimeZone, Locale locale) {
            if (dateTimeZone == null) {
                return "";
            }
            int i = this.iType;
            if (i != 0) {
                return i != 1 ? "" : dateTimeZone.getShortName(j, locale);
            }
            return dateTimeZone.getName(j, locale);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(print(j - ((long) i), dateTimeZone, locale));
        }

        public TimeZoneName(int i, Map<String, DateTimeZone> map) {
            this.iType = i;
            this.iParseLookup = map;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            Map<String, DateTimeZone> defaultTimeZoneNames = this.iParseLookup;
            if (defaultTimeZoneNames == null) {
                defaultTimeZoneNames = DateTimeUtils.getDefaultTimeZoneNames();
            }
            String str = null;
            for (String str2 : defaultTimeZoneNames.keySet()) {
                if (DateTimeFormatterBuilder.csStartsWith(charSequence, i, str2) && (str == null || str2.length() > str.length())) {
                    str = str2;
                }
            }
            if (str == null) {
                return ~i;
            }
            dateTimeParserBucket.setZone(defaultTimeZoneNames.get(str));
            return str.length() + i;
        }
    }

    public static class TwoDigitYear implements InternalPrinter, InternalParser {
        private final boolean iLenientParse;
        private final int iPivot;
        private final DateTimeFieldType iType;

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iLenientParse ? 4 : 2;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return 2;
        }

        private int getTwoDigitYear(ReadablePartial readablePartial) {
            if (!readablePartial.isSupported(this.iType)) {
                return -1;
            }
            try {
                int i = readablePartial.get(this.iType);
                if (i < 0) {
                    i = -i;
                }
                return i % 100;
            } catch (RuntimeException unused) {
                return -1;
            }
        }

        public TwoDigitYear(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
            this.iType = dateTimeFieldType;
            this.iPivot = i;
            this.iLenientParse = z;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            int i2;
            int i3;
            int length = charSequence.length() - i;
            if (this.iLenientParse) {
                int i4 = 0;
                boolean z = false;
                boolean z2 = false;
                while (i4 < length) {
                    char cCharAt = charSequence.charAt(i + i4);
                    if (i4 == 0 && (cCharAt == '-' || cCharAt == '+')) {
                        z = cCharAt == '-';
                        if (z) {
                            i4++;
                        } else {
                            i++;
                            length--;
                        }
                        z2 = true;
                    } else {
                        if (cCharAt < '0' || cCharAt > '9') {
                            break;
                        }
                        i4++;
                    }
                }
                if (i4 == 0) {
                    return ~i;
                }
                if (z2 || i4 != 2) {
                    if (i4 >= 9) {
                        i2 = i4 + i;
                        i3 = Integer.parseInt(charSequence.subSequence(i, i2).toString());
                    } else {
                        int i5 = z ? i + 1 : i;
                        int i6 = i5 + 1;
                        try {
                            int iCharAt = charSequence.charAt(i5) - '0';
                            i2 = i4 + i;
                            while (i6 < i2) {
                                char cCharAt2 = charSequence.charAt(i6);
                                i6++;
                                iCharAt = (cCharAt2 + ((iCharAt << 3) + (iCharAt << 1))) - 48;
                            }
                            i3 = z ? -iCharAt : iCharAt;
                        } catch (StringIndexOutOfBoundsException unused) {
                            return ~i;
                        }
                    }
                    dateTimeParserBucket.saveField(this.iType, i3);
                    return i2;
                }
            } else if (Math.min(2, length) < 2) {
                return ~i;
            }
            char cCharAt3 = charSequence.charAt(i);
            if (cCharAt3 < '0' || cCharAt3 > '9') {
                return ~i;
            }
            int i7 = cCharAt3 - '0';
            char cCharAt4 = charSequence.charAt(i + 1);
            if (cCharAt4 < '0' || cCharAt4 > '9') {
                return ~i;
            }
            int i8 = (((i7 << 3) + (i7 << 1)) + cCharAt4) - 48;
            int iIntValue = this.iPivot;
            if (dateTimeParserBucket.getPivotYear() != null) {
                iIntValue = dateTimeParserBucket.getPivotYear().intValue();
            }
            int i9 = iIntValue - 50;
            int i10 = i9 >= 0 ? i9 % 100 : ((iIntValue - 49) % 100) + 99;
            dateTimeParserBucket.saveField(this.iType, ((i9 + (i8 < i10 ? 100 : 0)) - i10) + i8);
            return i + 2;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            int twoDigitYear = getTwoDigitYear(j, chronology);
            if (twoDigitYear >= 0) {
                FormatUtils.appendPaddedInteger(appendable, twoDigitYear, 2);
            } else {
                appendable.append((char) 65533);
                appendable.append((char) 65533);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            int twoDigitYear = getTwoDigitYear(readablePartial);
            if (twoDigitYear < 0) {
                appendable.append((char) 65533);
                appendable.append((char) 65533);
            } else {
                FormatUtils.appendPaddedInteger(appendable, twoDigitYear, 2);
            }
        }

        private int getTwoDigitYear(long j, Chronology chronology) {
            try {
                int i = this.iType.getField(chronology).get(j);
                if (i < 0) {
                    i = -i;
                }
                return i % 100;
            } catch (RuntimeException unused) {
                return -1;
            }
        }
    }

    public static class UnpaddedNumber extends NumberFormatter {
        public UnpaddedNumber(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
            super(dateTimeFieldType, i, z);
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iMaxParsedDigits;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            if (!readablePartial.isSupported(this.iFieldType)) {
                appendable.append((char) 65533);
                return;
            }
            try {
                FormatUtils.appendUnpaddedInteger(appendable, readablePartial.get(this.iFieldType));
            } catch (RuntimeException unused) {
                appendable.append((char) 65533);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                FormatUtils.appendUnpaddedInteger(appendable, this.iFieldType.getField(chronology).get(j));
            } catch (RuntimeException unused) {
                appendable.append((char) 65533);
            }
        }
    }

    private DateTimeFormatterBuilder append0(Object obj) {
        this.iFormatter = null;
        this.iElementPairs.add(obj);
        this.iElementPairs.add(obj);
        return this;
    }

    public DateTimeFormatterBuilder appendPattern(String str) {
        DateTimeFormat.appendPatternTo(this, str);
        return this;
    }

    public void clear() {
        this.iFormatter = null;
        this.iElementPairs.clear();
    }

    public static class Composite implements InternalPrinter, InternalParser {
        private final int iParsedLengthEstimate;
        private final InternalParser[] iParsers;
        private final int iPrintedLengthEstimate;
        private final InternalPrinter[] iPrinters;

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iParsedLengthEstimate;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iPrintedLengthEstimate;
        }

        public boolean isParser() {
            return this.iParsers != null;
        }

        public boolean isPrinter() {
            return this.iPrinters != null;
        }

        private void addArrayToList(List<Object> list, Object[] objArr) {
            if (objArr != null) {
                for (Object obj : objArr) {
                    list.add(obj);
                }
            }
        }

        public Composite(List<Object> list) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            decompose(list, arrayList, arrayList2);
            if (arrayList.contains(null) || arrayList.isEmpty()) {
                this.iPrinters = null;
                this.iPrintedLengthEstimate = 0;
            } else {
                int size = arrayList.size();
                this.iPrinters = new InternalPrinter[size];
                int iEstimatePrintedLength = 0;
                for (int i = 0; i < size; i++) {
                    InternalPrinter internalPrinter = (InternalPrinter) arrayList.get(i);
                    iEstimatePrintedLength += internalPrinter.estimatePrintedLength();
                    this.iPrinters[i] = internalPrinter;
                }
                this.iPrintedLengthEstimate = iEstimatePrintedLength;
            }
            if (arrayList2.contains(null) || arrayList2.isEmpty()) {
                this.iParsers = null;
                this.iParsedLengthEstimate = 0;
                return;
            }
            int size2 = arrayList2.size();
            this.iParsers = new InternalParser[size2];
            int iEstimateParsedLength = 0;
            for (int i2 = 0; i2 < size2; i2++) {
                InternalParser internalParser = (InternalParser) arrayList2.get(i2);
                iEstimateParsedLength += internalParser.estimateParsedLength();
                this.iParsers[i2] = internalParser;
            }
            this.iParsedLengthEstimate = iEstimateParsedLength;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            InternalParser[] internalParserArr = this.iParsers;
            if (internalParserArr == null) {
                getAlignmentLinesMap.write();
                return 0;
            }
            int length = internalParserArr.length;
            for (int i2 = 0; i2 < length && i >= 0; i2++) {
                i = internalParserArr[i2].parseInto(dateTimeParserBucket, charSequence, i);
            }
            return i;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            InternalPrinter[] internalPrinterArr = this.iPrinters;
            if (internalPrinterArr == null) {
                getAlignmentLinesMap.write();
                return;
            }
            Locale locale2 = locale == null ? Locale.getDefault() : locale;
            for (InternalPrinter internalPrinter : internalPrinterArr) {
                internalPrinter.printTo(appendable, j, chronology, i, dateTimeZone, locale2);
            }
        }

        private void decompose(List<Object> list, List<Object> list2, List<Object> list3) {
            int size = list.size();
            for (int i = 0; i < size; i += 2) {
                Object obj = list.get(i);
                if (obj instanceof Composite) {
                    addArrayToList(list2, ((Composite) obj).iPrinters);
                } else {
                    list2.add(obj);
                }
                Object obj2 = list.get(i + 1);
                if (obj2 instanceof Composite) {
                    addArrayToList(list3, ((Composite) obj2).iParsers);
                } else {
                    list3.add(obj2);
                }
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            InternalPrinter[] internalPrinterArr = this.iPrinters;
            if (internalPrinterArr != null) {
                if (locale == null) {
                    locale = Locale.getDefault();
                }
                for (InternalPrinter internalPrinter : internalPrinterArr) {
                    internalPrinter.printTo(appendable, readablePartial, locale);
                }
                return;
            }
            getAlignmentLinesMap.write();
        }
    }

    public static abstract class NumberFormatter implements InternalPrinter, InternalParser {
        protected final DateTimeFieldType iFieldType;
        protected final int iMaxParsedDigits;
        protected final boolean iSigned;

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iMaxParsedDigits;
        }

        public NumberFormatter(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
            this.iFieldType = dateTimeFieldType;
            this.iMaxParsedDigits = i;
            this.iSigned = z;
        }

        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            int i2;
            int i3;
            char cCharAt;
            int iMin = Math.min(this.iMaxParsedDigits, charSequence.length() - i);
            boolean z = false;
            boolean z2 = false;
            int i4 = 0;
            while (i4 < iMin) {
                int i5 = i + i4;
                char cCharAt2 = charSequence.charAt(i5);
                if (i4 == 0 && ((cCharAt2 == '-' || cCharAt2 == '+') && this.iSigned)) {
                    z = cCharAt2 == '-';
                    z2 = cCharAt2 == '+';
                    int i6 = i4 + 1;
                    if (i6 >= iMin || (cCharAt = charSequence.charAt(i5 + 1)) < '0' || cCharAt > '9') {
                        break;
                    }
                    iMin = Math.min(iMin + 1, charSequence.length() - i);
                    i4 = i6;
                } else {
                    if (cCharAt2 < '0' || cCharAt2 > '9') {
                        break;
                    }
                    i4++;
                }
            }
            if (i4 == 0) {
                return ~i;
            }
            if (i4 < 9) {
                int i7 = (z || z2) ? i + 1 : i;
                int i8 = i7 + 1;
                try {
                    int iCharAt = charSequence.charAt(i7) - '0';
                    int i9 = i + i4;
                    while (i8 < i9) {
                        char cCharAt3 = charSequence.charAt(i8);
                        i8++;
                        iCharAt = (cCharAt3 + ((iCharAt << 3) + (iCharAt << 1))) - 48;
                    }
                    i2 = z ? -iCharAt : iCharAt;
                    i3 = i9;
                } catch (StringIndexOutOfBoundsException unused) {
                    return ~i;
                }
            } else if (z2) {
                i3 = i + i4;
                i2 = Integer.parseInt(charSequence.subSequence(i + 1, i3).toString());
            } else {
                i3 = i + i4;
                i2 = Integer.parseInt(charSequence.subSequence(i, i3).toString());
            }
            dateTimeParserBucket.saveField(this.iFieldType, i2);
            return i3;
        }
    }

    public static class TimeZoneOffset implements InternalPrinter, InternalParser {
        private final int iMaxFields;
        private final int iMinFields;
        private final boolean iShowSeparators;
        private final String iZeroOffsetParseText;
        private final String iZeroOffsetPrintText;

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return estimatePrintedLength();
        }

        /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:82:0x00e7  */
        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            boolean z;
            int twoDigits;
            int twoDigits2;
            int twoDigits3;
            char cCharAt;
            boolean z2 = false;
            int length = charSequence.length() - i;
            String str = this.iZeroOffsetParseText;
            if (str != null) {
                if (str.length() == 0) {
                    if (length <= 0 || ((cCharAt = charSequence.charAt(i)) != '-' && cCharAt != '+')) {
                        dateTimeParserBucket.setOffset((Integer) 0);
                        return i;
                    }
                } else if (DateTimeFormatterBuilder.csStartsWithIgnoreCase(charSequence, i, this.iZeroOffsetParseText)) {
                    dateTimeParserBucket.setOffset((Integer) 0);
                    return this.iZeroOffsetParseText.length() + i;
                }
            }
            if (length <= 1) {
                return ~i;
            }
            char cCharAt2 = charSequence.charAt(i);
            if (cCharAt2 == '-') {
                z = true;
            } else {
                if (cCharAt2 != '+') {
                    return ~i;
                }
                z = false;
            }
            int i2 = i + 1;
            if (digitCount(charSequence, i2, 2) >= 2 && (twoDigits = FormatUtils.parseTwoDigits(charSequence, i2)) <= 23) {
                int iCharAt = twoDigits * 3600000;
                int i3 = length - 3;
                int i4 = i + 3;
                if (i3 > 0) {
                    char cCharAt3 = charSequence.charAt(i4);
                    if (cCharAt3 == ':') {
                        i3 = length - 4;
                        i4 = i + 4;
                        z2 = true;
                    } else if (cCharAt3 >= '0' && cCharAt3 <= '9') {
                    }
                    int iDigitCount = digitCount(charSequence, i4, 2);
                    if (iDigitCount != 0 || z2) {
                        if (iDigitCount >= 2 && (twoDigits2 = FormatUtils.parseTwoDigits(charSequence, i4)) <= 59) {
                            iCharAt += twoDigits2 * 60000;
                            int i5 = i3 - 2;
                            int i6 = i4 + 2;
                            if (i5 > 0) {
                                if (!z2) {
                                    i4 = i6;
                                } else if (charSequence.charAt(i6) != ':') {
                                    i4 = i6;
                                } else {
                                    i5 = i3 - 3;
                                    i4 += 3;
                                }
                                int iDigitCount2 = digitCount(charSequence, i4, 2);
                                if (iDigitCount2 != 0 || z2) {
                                    if (iDigitCount2 >= 2 && (twoDigits3 = FormatUtils.parseTwoDigits(charSequence, i4)) <= 59) {
                                        iCharAt += twoDigits3 * 1000;
                                        int i7 = i4 + 2;
                                        if (i5 - 2 > 0) {
                                            if (!z2) {
                                                i4 = i7;
                                            } else if (charSequence.charAt(i7) == '.' || charSequence.charAt(i7) == ',') {
                                                i4 += 3;
                                            } else {
                                                i4 = i7;
                                            }
                                            int iDigitCount3 = digitCount(charSequence, i4, 3);
                                            if (iDigitCount3 != 0 || z2) {
                                                if (iDigitCount3 < 1) {
                                                    return ~i4;
                                                }
                                                int i8 = i4 + 1;
                                                iCharAt += (charSequence.charAt(i4) - '0') * 100;
                                                if (iDigitCount3 > 1) {
                                                    int i9 = i4 + 2;
                                                    iCharAt += (charSequence.charAt(i8) - '0') * 10;
                                                    if (iDigitCount3 > 2) {
                                                        i4 += 3;
                                                        iCharAt += charSequence.charAt(i9) - '0';
                                                    } else {
                                                        i4 = i9;
                                                    }
                                                } else {
                                                    i4 = i8;
                                                }
                                            }
                                        } else {
                                            i4 = i7;
                                        }
                                    }
                                    return ~i4;
                                }
                            } else {
                                i4 = i6;
                            }
                        }
                        return ~i4;
                    }
                }
                if (z) {
                    iCharAt = -iCharAt;
                }
                dateTimeParserBucket.setOffset(Integer.valueOf(iCharAt));
                return i4;
            }
            return ~i2;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
        }

        public TimeZoneOffset(String str, String str2, boolean z, int i, int i2) {
            this.iZeroOffsetPrintText = str;
            this.iZeroOffsetParseText = str2;
            this.iShowSeparators = z;
            if (i <= 0 || i2 < i) {
                DrawableTransformation.write();
                throw null;
            }
            if (i > 4) {
                i = 4;
                i2 = 4;
            }
            this.iMinFields = i;
            this.iMaxFields = i2;
        }

        private int digitCount(CharSequence charSequence, int i, int i2) {
            int i3 = 0;
            for (int iMin = Math.min(charSequence.length() - i, i2); iMin > 0; iMin--) {
                char cCharAt = charSequence.charAt(i + i3);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                i3++;
            }
            return i3;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            int i = this.iMinFields;
            int i2 = (i + 1) << 1;
            if (this.iShowSeparators) {
                i2 += i - 1;
            }
            String str = this.iZeroOffsetPrintText;
            return (str == null || str.length() <= i2) ? i2 : this.iZeroOffsetPrintText.length();
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            String str;
            if (dateTimeZone == null) {
                return;
            }
            if (i == 0 && (str = this.iZeroOffsetPrintText) != null) {
                appendable.append(str);
                return;
            }
            if (i >= 0) {
                appendable.append('+');
            } else {
                appendable.append('-');
                i = -i;
            }
            int i2 = i / 3600000;
            FormatUtils.appendPaddedInteger(appendable, i2, 2);
            if (this.iMaxFields == 1) {
                return;
            }
            int i3 = i - (i2 * 3600000);
            if (i3 != 0 || this.iMinFields > 1) {
                int i4 = i3 / 60000;
                if (this.iShowSeparators) {
                    appendable.append(':');
                }
                FormatUtils.appendPaddedInteger(appendable, i4, 2);
                if (this.iMaxFields == 2) {
                    return;
                }
                int i5 = i3 - (i4 * 60000);
                if (i5 != 0 || this.iMinFields > 2) {
                    int i6 = i5 / 1000;
                    if (this.iShowSeparators) {
                        appendable.append(':');
                    }
                    FormatUtils.appendPaddedInteger(appendable, i6, 2);
                    if (this.iMaxFields == 3) {
                        return;
                    }
                    int i7 = i5 - (i6 * 1000);
                    if (i7 != 0 || this.iMinFields > 3) {
                        if (this.iShowSeparators) {
                            appendable.append('.');
                        }
                        FormatUtils.appendPaddedInteger(appendable, i7, 3);
                    }
                }
            }
        }
    }

    public DateTimeFormatterBuilder append(DateTimePrinter dateTimePrinter, DateTimeParser[] dateTimeParserArr) {
        if (dateTimePrinter != null) {
            checkPrinter(dateTimePrinter);
        }
        if (dateTimeParserArr == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("No parsers supplied");
            return null;
        }
        int length = dateTimeParserArr.length;
        int i = 0;
        if (length == 1) {
            if (dateTimeParserArr[0] != null) {
                return append0(DateTimePrinterInternalPrinter.of(dateTimePrinter), DateTimeParserInternalParser.of(dateTimeParserArr[0]));
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("No parser supplied");
            return null;
        }
        InternalParser[] internalParserArr = new InternalParser[length];
        while (i < length - 1) {
            InternalParser internalParserOf = DateTimeParserInternalParser.of(dateTimeParserArr[i]);
            internalParserArr[i] = internalParserOf;
            if (internalParserOf == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Incomplete parser array");
                return null;
            }
            i++;
        }
        internalParserArr[i] = DateTimeParserInternalParser.of(dateTimeParserArr[i]);
        return append0(DateTimePrinterInternalPrinter.of(dateTimePrinter), new MatchingParser(internalParserArr));
    }

    public DateTimeFormatterBuilder appendLiteral(String str) {
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Literal must not be null");
            return null;
        }
        int length = str.length();
        if (length != 0) {
            return length != 1 ? append0(new StringLiteral(str)) : append0(new CharacterLiteral(str.charAt(0)));
        }
        return this;
    }

    public DateTimeFormatterBuilder appendTimeZoneId() {
        TimeZoneId timeZoneId = TimeZoneId.INSTANCE;
        return append0(timeZoneId, timeZoneId);
    }

    public DateTimeFormatterBuilder appendTwoDigitWeekyear(int i, boolean z) {
        return append0(new TwoDigitYear(DateTimeFieldType.weekyear(), i, z));
    }

    public DateTimeFormatterBuilder appendTwoDigitYear(int i, boolean z) {
        return append0(new TwoDigitYear(DateTimeFieldType.year(), i, z));
    }

    public DateTimeFormatterBuilder appendOptional(DateTimeParser dateTimeParser) {
        checkParser(dateTimeParser);
        return append0(null, new MatchingParser(new InternalParser[]{DateTimeParserInternalParser.of(dateTimeParser), null}));
    }

    public static boolean csStartsWith(CharSequence charSequence, int i, String str) {
        int length = str.length();
        if (charSequence.length() - i < length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (charSequence.charAt(i + i2) != str.charAt(i2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean csStartsWithIgnoreCase(CharSequence charSequence, int i, String str) {
        char upperCase;
        char upperCase2;
        int length = str.length();
        if (charSequence.length() - i < length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = charSequence.charAt(i + i2);
            char cCharAt2 = str.charAt(i2);
            if (cCharAt != cCharAt2 && (upperCase = Character.toUpperCase(cCharAt)) != (upperCase2 = Character.toUpperCase(cCharAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                return false;
            }
        }
        return true;
    }

    private Object getFormatter() {
        Object composite = this.iFormatter;
        if (composite == null) {
            if (this.iElementPairs.size() == 2) {
                Object obj = this.iElementPairs.get(0);
                Object obj2 = this.iElementPairs.get(1);
                if (obj == null) {
                    composite = obj2;
                } else if (obj == obj2 || obj2 == null) {
                    composite = obj;
                }
            }
            if (composite == null) {
                composite = new Composite(this.iElementPairs);
            }
            this.iFormatter = composite;
        }
        return composite;
    }

    private boolean isParser(Object obj) {
        if (!(obj instanceof InternalParser)) {
            return false;
        }
        if (obj instanceof Composite) {
            return ((Composite) obj).isParser();
        }
        return true;
    }

    private boolean isPrinter(Object obj) {
        if (!(obj instanceof InternalPrinter)) {
            return false;
        }
        if (obj instanceof Composite) {
            return ((Composite) obj).isPrinter();
        }
        return true;
    }

    public DateTimeFormatterBuilder appendCenturyOfEra(int i, int i2) {
        return appendSignedDecimal(DateTimeFieldType.centuryOfEra(), i, i2);
    }

    public DateTimeFormatterBuilder appendDayOfWeekShortText() {
        return appendShortText(DateTimeFieldType.dayOfWeek());
    }

    public DateTimeFormatterBuilder appendDayOfWeekText() {
        return appendText(DateTimeFieldType.dayOfWeek());
    }

    public DateTimeFormatterBuilder appendEraText() {
        return appendText(DateTimeFieldType.era());
    }

    public DateTimeFormatterBuilder appendFractionOfDay(int i, int i2) {
        return appendFraction(DateTimeFieldType.dayOfYear(), i, i2);
    }

    public DateTimeFormatterBuilder appendFractionOfHour(int i, int i2) {
        return appendFraction(DateTimeFieldType.hourOfDay(), i, i2);
    }

    public DateTimeFormatterBuilder appendFractionOfMinute(int i, int i2) {
        return appendFraction(DateTimeFieldType.minuteOfDay(), i, i2);
    }

    public DateTimeFormatterBuilder appendFractionOfSecond(int i, int i2) {
        return appendFraction(DateTimeFieldType.secondOfDay(), i, i2);
    }

    public DateTimeFormatterBuilder appendHalfdayOfDayText() {
        return appendText(DateTimeFieldType.halfdayOfDay());
    }

    public DateTimeFormatterBuilder appendMonthOfYearShortText() {
        return appendShortText(DateTimeFieldType.monthOfYear());
    }

    public DateTimeFormatterBuilder appendMonthOfYearText() {
        return appendText(DateTimeFieldType.monthOfYear());
    }

    public DateTimeFormatterBuilder appendTimeZoneName() {
        return append0(new TimeZoneName(0, null), null);
    }

    public DateTimeFormatterBuilder appendTimeZoneShortName() {
        return append0(new TimeZoneName(1, null), null);
    }

    public DateTimeFormatterBuilder appendWeekyear(int i, int i2) {
        return appendSignedDecimal(DateTimeFieldType.weekyear(), i, i2);
    }

    public DateTimeFormatterBuilder appendYear(int i, int i2) {
        return appendSignedDecimal(DateTimeFieldType.year(), i, i2);
    }

    public DateTimeFormatterBuilder appendYearOfCentury(int i, int i2) {
        return appendDecimal(DateTimeFieldType.yearOfCentury(), i, i2);
    }

    public DateTimeFormatterBuilder appendYearOfEra(int i, int i2) {
        return appendDecimal(DateTimeFieldType.yearOfEra(), i, i2);
    }

    public boolean canBuildFormatter() {
        return isFormatter(getFormatter());
    }

    public boolean canBuildParser() {
        return isParser(getFormatter());
    }

    public boolean canBuildPrinter() {
        return isPrinter(getFormatter());
    }

    public DateTimeFormatter toFormatter() {
        Object formatter = getFormatter();
        InternalPrinter internalPrinter = isPrinter(formatter) ? (InternalPrinter) formatter : null;
        InternalParser internalParser = isParser(formatter) ? (InternalParser) formatter : null;
        if (internalPrinter != null || internalParser != null) {
            return new DateTimeFormatter(internalPrinter, internalParser);
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Both printing and parsing not supported");
        return null;
    }

    public DateTimeParser toParser() {
        Object formatter = getFormatter();
        if (isParser(formatter)) {
            return InternalParserDateTimeParser.of((InternalParser) formatter);
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Parsing is not supported");
        return null;
    }

    public DateTimePrinter toPrinter() {
        Object formatter = getFormatter();
        if (isPrinter(formatter)) {
            return InternalPrinterDateTimePrinter.of((InternalPrinter) formatter);
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Printing is not supported");
        return null;
    }

    private void checkParser(DateTimeParser dateTimeParser) {
        if (dateTimeParser != null) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("No parser supplied");
    }

    private void checkPrinter(DateTimePrinter dateTimePrinter) {
        if (dateTimePrinter != null) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("No printer supplied");
    }

    public DateTimeFormatterBuilder appendClockhourOfDay(int i) {
        return appendDecimal(DateTimeFieldType.clockhourOfDay(), i, 2);
    }

    public DateTimeFormatterBuilder appendClockhourOfHalfday(int i) {
        return appendDecimal(DateTimeFieldType.clockhourOfHalfday(), i, 2);
    }

    public DateTimeFormatterBuilder appendDayOfMonth(int i) {
        return appendDecimal(DateTimeFieldType.dayOfMonth(), i, 2);
    }

    public DateTimeFormatterBuilder appendDayOfWeek(int i) {
        return appendDecimal(DateTimeFieldType.dayOfWeek(), i, 1);
    }

    public DateTimeFormatterBuilder appendDayOfYear(int i) {
        return appendDecimal(DateTimeFieldType.dayOfYear(), i, 3);
    }

    public DateTimeFormatterBuilder appendHourOfDay(int i) {
        return appendDecimal(DateTimeFieldType.hourOfDay(), i, 2);
    }

    public DateTimeFormatterBuilder appendHourOfHalfday(int i) {
        return appendDecimal(DateTimeFieldType.hourOfHalfday(), i, 2);
    }

    public DateTimeFormatterBuilder appendMillisOfSecond(int i) {
        return appendDecimal(DateTimeFieldType.millisOfSecond(), i, 3);
    }

    public DateTimeFormatterBuilder appendMinuteOfDay(int i) {
        return appendDecimal(DateTimeFieldType.minuteOfDay(), i, 4);
    }

    public DateTimeFormatterBuilder appendMinuteOfHour(int i) {
        return appendDecimal(DateTimeFieldType.minuteOfHour(), i, 2);
    }

    public DateTimeFormatterBuilder appendMonthOfYear(int i) {
        return appendDecimal(DateTimeFieldType.monthOfYear(), i, 2);
    }

    public DateTimeFormatterBuilder appendSecondOfDay(int i) {
        return appendDecimal(DateTimeFieldType.secondOfDay(), i, 5);
    }

    public DateTimeFormatterBuilder appendSecondOfMinute(int i) {
        return appendDecimal(DateTimeFieldType.secondOfMinute(), i, 2);
    }

    public DateTimeFormatterBuilder appendShortText(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return append0(new TextField(dateTimeFieldType, true));
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Field type must not be null");
        return null;
    }

    public DateTimeFormatterBuilder appendText(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return append0(new TextField(dateTimeFieldType, false));
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Field type must not be null");
        return null;
    }

    public DateTimeFormatterBuilder appendWeekOfWeekyear(int i) {
        return appendDecimal(DateTimeFieldType.weekOfWeekyear(), i, 2);
    }

    public static class FixedNumber extends PaddedNumber {
        public FixedNumber(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
            super(dateTimeFieldType, i, z, i);
        }

        @Override // org.joda.time.format.DateTimeFormatterBuilder.NumberFormatter, org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            int i2;
            char cCharAt;
            int into = super.parseInto(dateTimeParserBucket, charSequence, i);
            if (into < 0 || into == (i2 = this.iMaxParsedDigits + i)) {
                return into;
            }
            if (this.iSigned && ((cCharAt = charSequence.charAt(i)) == '-' || cCharAt == '+')) {
                i2++;
            }
            if (into > i2) {
                return ~(i2 + 1);
            }
            return into < i2 ? ~into : into;
        }
    }

    private boolean isFormatter(Object obj) {
        return isPrinter(obj) || isParser(obj);
    }

    public DateTimeFormatterBuilder appendMillisOfDay(int i) {
        return appendDecimal(DateTimeFieldType.millisOfDay(), i, 8);
    }

    public static void appendUnknownString(Appendable appendable, int i) throws IOException {
        while (true) {
            i--;
            if (i < 0) {
                return;
            } else {
                appendable.append((char) 65533);
            }
        }
    }

    public DateTimeFormatterBuilder appendTimeZoneOffset(String str, boolean z, int i, int i2) {
        return append0(new TimeZoneOffset(str, str, z, i, i2));
    }

    public DateTimeFormatterBuilder appendFixedDecimal(DateTimeFieldType dateTimeFieldType, int i) {
        if (dateTimeFieldType == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Field type must not be null");
            return null;
        }
        if (i > 0) {
            return append0(new FixedNumber(dateTimeFieldType, i, false));
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "Illegal number of digits: "));
        return null;
    }

    public DateTimeFormatterBuilder appendFixedSignedDecimal(DateTimeFieldType dateTimeFieldType, int i) {
        if (dateTimeFieldType == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Field type must not be null");
            return null;
        }
        if (i > 0) {
            return append0(new FixedNumber(dateTimeFieldType, i, true));
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "Illegal number of digits: "));
        return null;
    }

    public DateTimeFormatterBuilder appendFraction(DateTimeFieldType dateTimeFieldType, int i, int i2) {
        if (dateTimeFieldType == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Field type must not be null");
            return null;
        }
        if (i2 < i) {
            i2 = i;
        }
        if (i >= 0 && i2 > 0) {
            return append0(new Fraction(dateTimeFieldType, i, i2));
        }
        DrawableTransformation.write();
        return null;
    }

    public DateTimeFormatterBuilder appendTimeZoneName(Map<String, DateTimeZone> map) {
        TimeZoneName timeZoneName = new TimeZoneName(0, map);
        return append0(timeZoneName, timeZoneName);
    }

    public DateTimeFormatterBuilder appendTimeZoneShortName(Map<String, DateTimeZone> map) {
        TimeZoneName timeZoneName = new TimeZoneName(1, map);
        return append0(timeZoneName, timeZoneName);
    }

    private DateTimeFormatterBuilder append0(InternalPrinter internalPrinter, InternalParser internalParser) {
        this.iFormatter = null;
        this.iElementPairs.add(internalPrinter);
        this.iElementPairs.add(internalParser);
        return this;
    }

    public DateTimeFormatterBuilder appendTwoDigitWeekyear(int i) {
        return appendTwoDigitWeekyear(i, false);
    }

    public DateTimeFormatterBuilder appendTwoDigitYear(int i) {
        return appendTwoDigitYear(i, false);
    }

    public DateTimeFormatterBuilder appendSignedDecimal(DateTimeFieldType dateTimeFieldType, int i, int i2) {
        if (dateTimeFieldType == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Field type must not be null");
            return null;
        }
        if (i2 < i) {
            i2 = i;
        }
        if (i < 0 || i2 <= 0) {
            DrawableTransformation.write();
            return null;
        }
        if (i <= 1) {
            return append0(new UnpaddedNumber(dateTimeFieldType, i2, true));
        }
        return append0(new PaddedNumber(dateTimeFieldType, i2, true, i));
    }

    public DateTimeFormatterBuilder appendTimeZoneOffset(String str, String str2, boolean z, int i, int i2) {
        return append0(new TimeZoneOffset(str, str2, z, i, i2));
    }

    public DateTimeFormatterBuilder appendDecimal(DateTimeFieldType dateTimeFieldType, int i, int i2) {
        if (dateTimeFieldType == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Field type must not be null");
            return null;
        }
        if (i2 < i) {
            i2 = i;
        }
        if (i < 0 || i2 <= 0) {
            DrawableTransformation.write();
            return null;
        }
        if (i <= 1) {
            return append0(new UnpaddedNumber(dateTimeFieldType, i2, false));
        }
        return append0(new PaddedNumber(dateTimeFieldType, i2, false, i));
    }

    public DateTimeFormatterBuilder appendLiteral(char c) {
        return append0(new CharacterLiteral(c));
    }

    public DateTimeFormatterBuilder append(DateTimePrinter dateTimePrinter) {
        checkPrinter(dateTimePrinter);
        return append0(DateTimePrinterInternalPrinter.of(dateTimePrinter), null);
    }

    public DateTimeFormatterBuilder append(DateTimeParser dateTimeParser) {
        checkParser(dateTimeParser);
        return append0(null, DateTimeParserInternalParser.of(dateTimeParser));
    }

    public DateTimeFormatterBuilder append(DateTimePrinter dateTimePrinter, DateTimeParser dateTimeParser) {
        checkPrinter(dateTimePrinter);
        checkParser(dateTimeParser);
        return append0(DateTimePrinterInternalPrinter.of(dateTimePrinter), DateTimeParserInternalParser.of(dateTimeParser));
    }

    public DateTimeFormatterBuilder append(DateTimeFormatter dateTimeFormatter) {
        if (dateTimeFormatter != null) {
            return append0(dateTimeFormatter.getPrinter0(), dateTimeFormatter.getParser0());
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("No formatter supplied");
        return null;
    }
}
