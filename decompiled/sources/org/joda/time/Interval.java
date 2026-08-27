package org.joda.time;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.Serializable;
import org.joda.time.base.BaseInterval;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

/* JADX INFO: loaded from: classes4.dex */
public final class Interval extends BaseInterval implements ReadableInterval, Serializable {
    private static final long serialVersionUID = 4922451897541386752L;

    @Override // org.joda.time.base.AbstractInterval, org.joda.time.ReadableInterval
    public Interval toInterval() {
        return this;
    }

    public static Interval parse(String str) {
        return new Interval(str);
    }

    public static Interval parseWithOffset(String str) {
        Period period;
        DateTime dateTime;
        int iIndexOf = str.indexOf(47);
        if (iIndexOf < 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Format requires a '/' separator: ".concat(str));
            return null;
        }
        String strSubstring = str.substring(0, iIndexOf);
        if (strSubstring.length() <= 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Format invalid: ".concat(str));
            return null;
        }
        String strSubstring2 = str.substring(iIndexOf + 1);
        if (strSubstring2.length() <= 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Format invalid: ".concat(str));
            return null;
        }
        DateTimeFormatter dateTimeFormatterWithOffsetParsed = ISODateTimeFormat.dateTimeParser().withOffsetParsed();
        PeriodFormatter periodFormatterStandard = ISOPeriodFormat.standard();
        char cCharAt = strSubstring.charAt(0);
        if (cCharAt == 'P' || cCharAt == 'p') {
            period = periodFormatterStandard.withParseType(PeriodType.standard()).parsePeriod(strSubstring);
            dateTime = null;
        } else {
            dateTime = dateTimeFormatterWithOffsetParsed.parseDateTime(strSubstring);
            period = null;
        }
        char cCharAt2 = strSubstring2.charAt(0);
        if (cCharAt2 != 'P' && cCharAt2 != 'p') {
            DateTime dateTime2 = dateTimeFormatterWithOffsetParsed.parseDateTime(strSubstring2);
            return period != null ? new Interval(period, dateTime2) : new Interval(dateTime, dateTime2);
        }
        if (period == null) {
            return new Interval(dateTime, periodFormatterStandard.withParseType(PeriodType.standard()).parsePeriod(strSubstring2));
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Interval composed of two durations: ".concat(str));
        return null;
    }

    public Interval withPeriodAfterStart(ReadablePeriod readablePeriod) {
        if (readablePeriod == null) {
            return withDurationAfterStart(null);
        }
        Chronology chronology = getChronology();
        long startMillis = getStartMillis();
        return new Interval(startMillis, chronology.add(readablePeriod, startMillis, 1), chronology);
    }

    public Interval withPeriodBeforeEnd(ReadablePeriod readablePeriod) {
        if (readablePeriod == null) {
            return withDurationBeforeEnd(null);
        }
        Chronology chronology = getChronology();
        long endMillis = getEndMillis();
        return new Interval(chronology.add(readablePeriod, endMillis, -1), endMillis, chronology);
    }

    public Interval(long j, long j2) {
        super(j, j2, null);
    }

    public boolean abuts(ReadableInterval readableInterval) {
        if (readableInterval != null) {
            return readableInterval.getEndMillis() == getStartMillis() || getEndMillis() == readableInterval.getStartMillis();
        }
        long jCurrentTimeMillis = DateTimeUtils.currentTimeMillis();
        return getStartMillis() == jCurrentTimeMillis || getEndMillis() == jCurrentTimeMillis;
    }

    public Interval gap(ReadableInterval readableInterval) {
        ReadableInterval readableInterval2 = DateTimeUtils.getReadableInterval(readableInterval);
        long startMillis = readableInterval2.getStartMillis();
        long endMillis = readableInterval2.getEndMillis();
        long startMillis2 = getStartMillis();
        long endMillis2 = getEndMillis();
        if (startMillis2 > endMillis) {
            return new Interval(endMillis, startMillis2, getChronology());
        }
        if (startMillis > endMillis2) {
            return new Interval(endMillis2, startMillis, getChronology());
        }
        return null;
    }

    public Interval overlap(ReadableInterval readableInterval) {
        ReadableInterval readableInterval2 = DateTimeUtils.getReadableInterval(readableInterval);
        if (overlaps(readableInterval2)) {
            return new Interval(Math.max(getStartMillis(), readableInterval2.getStartMillis()), Math.min(getEndMillis(), readableInterval2.getEndMillis()), getChronology());
        }
        return null;
    }

    public Interval withDurationAfterStart(ReadableDuration readableDuration) {
        long durationMillis = DateTimeUtils.getDurationMillis(readableDuration);
        if (durationMillis == toDurationMillis()) {
            return this;
        }
        Chronology chronology = getChronology();
        long startMillis = getStartMillis();
        return new Interval(startMillis, chronology.add(startMillis, durationMillis, 1), chronology);
    }

    public Interval withDurationBeforeEnd(ReadableDuration readableDuration) {
        long durationMillis = DateTimeUtils.getDurationMillis(readableDuration);
        if (durationMillis == toDurationMillis()) {
            return this;
        }
        Chronology chronology = getChronology();
        long endMillis = getEndMillis();
        return new Interval(chronology.add(endMillis, durationMillis, -1), endMillis, chronology);
    }

    public Interval withEnd(ReadableInstant readableInstant) {
        return withEndMillis(DateTimeUtils.getInstantMillis(readableInstant));
    }

    public Interval withStart(ReadableInstant readableInstant) {
        return withStartMillis(DateTimeUtils.getInstantMillis(readableInstant));
    }

    public Interval(long j, long j2, DateTimeZone dateTimeZone) {
        super(j, j2, ISOChronology.getInstance(dateTimeZone));
    }

    public Interval(long j, long j2, Chronology chronology) {
        super(j, j2, chronology);
    }

    public Interval withChronology(Chronology chronology) {
        return getChronology() == chronology ? this : new Interval(getStartMillis(), getEndMillis(), chronology);
    }

    public Interval(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        super(readableInstant, readableInstant2);
    }

    public Interval(ReadableInstant readableInstant, ReadableDuration readableDuration) {
        super(readableInstant, readableDuration);
    }

    public Interval withEndMillis(long j) {
        return j == getEndMillis() ? this : new Interval(getStartMillis(), j, getChronology());
    }

    public Interval withStartMillis(long j) {
        return j == getStartMillis() ? this : new Interval(j, getEndMillis(), getChronology());
    }

    public Interval(ReadableDuration readableDuration, ReadableInstant readableInstant) {
        super(readableDuration, readableInstant);
    }

    public Interval(ReadableInstant readableInstant, ReadablePeriod readablePeriod) {
        super(readableInstant, readablePeriod);
    }

    public Interval(ReadablePeriod readablePeriod, ReadableInstant readableInstant) {
        super(readablePeriod, readableInstant);
    }

    public Interval(Object obj) {
        super(obj, (Chronology) null);
    }

    public Interval(Object obj, Chronology chronology) {
        super(obj, chronology);
    }
}
