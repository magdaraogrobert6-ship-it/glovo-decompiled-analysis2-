package org.joda.time;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.deliveryhero.fwf_customer_profile.util.ConstantsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.location.gwi.config.CarGwiSoFileConstant;
import java.io.Serializable;
import org.joda.convert.FromString;
import org.joda.time.base.BasePeriod;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

/* JADX INFO: loaded from: classes4.dex */
public final class Period extends BasePeriod implements ReadablePeriod, Serializable {
    public static final Period ZERO = new Period();
    private static final long serialVersionUID = 741052353876488155L;

    public Period minusDays(int i) {
        return plusDays(-i);
    }

    public Period minusHours(int i) {
        return plusHours(-i);
    }

    public Period minusMillis(int i) {
        return plusMillis(-i);
    }

    public Period minusMinutes(int i) {
        return plusMinutes(-i);
    }

    public Period minusMonths(int i) {
        return plusMonths(-i);
    }

    public Period minusSeconds(int i) {
        return plusSeconds(-i);
    }

    public Period minusWeeks(int i) {
        return plusWeeks(-i);
    }

    public Period minusYears(int i) {
        return plusYears(-i);
    }

    public Period negated() {
        return multipliedBy(-1);
    }

    @Override // org.joda.time.base.AbstractPeriod, org.joda.time.ReadablePeriod
    public Period toPeriod() {
        return this;
    }

    public Days toStandardDays() {
        checkYearsAndMonths("Days");
        return Days.days(FieldUtils.safeToInt(FieldUtils.safeAdd(FieldUtils.safeAdd(((((long) getHours()) * 3600000) + ((((long) getMinutes()) * 60000) + ((getSeconds() * 1000) + getMillis()))) / CarGwiSoFileConstant.CAR_GWI_SPECIFY_INTERVAL, getDays()), ((long) getWeeks()) * 7)));
    }

    public Duration toStandardDuration() {
        checkYearsAndMonths("Duration");
        long millis = getMillis();
        long seconds = getSeconds();
        long minutes = getMinutes();
        return new Duration((((long) getWeeks()) * 604800000) + (((long) getDays()) * CarGwiSoFileConstant.CAR_GWI_SPECIFY_INTERVAL) + (getHours() * 3600000) + (minutes * 60000) + (seconds * 1000) + millis);
    }

    public Hours toStandardHours() {
        checkYearsAndMonths("Hours");
        return Hours.hours(FieldUtils.safeToInt(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd(((((long) getMinutes()) * 60000) + ((((long) getSeconds()) * 1000) + ((long) getMillis()))) / 3600000, getHours()), ((long) getDays()) * 24), ((long) getWeeks()) * 168)));
    }

    public Minutes toStandardMinutes() {
        checkYearsAndMonths("Minutes");
        return Minutes.minutes(FieldUtils.safeToInt(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd(((((long) getSeconds()) * 1000) + ((long) getMillis())) / 60000, getMinutes()), ((long) getHours()) * 60), ((long) getDays()) * 1440), ((long) getWeeks()) * 10080)));
    }

    public Seconds toStandardSeconds() {
        checkYearsAndMonths("Seconds");
        return Seconds.seconds(FieldUtils.safeToInt(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd(getMillis() / 1000, getSeconds()), ((long) getMinutes()) * 60), ((long) getHours()) * 3600), ((long) getDays()) * ConstantsKt.DEFAULT_PROFILE_TTL), ((long) getWeeks()) * 604800)));
    }

    public Weeks toStandardWeeks() {
        checkYearsAndMonths("Weeks");
        long millis = getMillis();
        long seconds = getSeconds();
        long minutes = getMinutes();
        long hours = getHours();
        return Weeks.weeks(FieldUtils.safeToInt((((getDays() * CarGwiSoFileConstant.CAR_GWI_SPECIFY_INTERVAL) + ((hours * 3600000) + ((minutes * 60000) + ((seconds * 1000) + millis)))) / 604800000) + ((long) getWeeks())));
    }

    public Period withField(DurationFieldType durationFieldType, int i) {
        if (durationFieldType == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Field must not be null");
            return null;
        }
        int[] values = getValues();
        super.setFieldInto(values, durationFieldType, i);
        return new Period(values, getPeriodType());
    }

    public Period minus(ReadablePeriod readablePeriod) {
        if (readablePeriod == null) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.YEAR_INDEX, values, -readablePeriod.get(DurationFieldType.YEARS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.MONTH_INDEX, values, -readablePeriod.get(DurationFieldType.MONTHS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.WEEK_INDEX, values, -readablePeriod.get(DurationFieldType.WEEKS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.DAY_INDEX, values, -readablePeriod.get(DurationFieldType.DAYS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.HOUR_INDEX, values, -readablePeriod.get(DurationFieldType.HOURS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.MINUTE_INDEX, values, -readablePeriod.get(DurationFieldType.MINUTES_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.SECOND_INDEX, values, -readablePeriod.get(DurationFieldType.SECONDS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.MILLI_INDEX, values, -readablePeriod.get(DurationFieldType.MILLIS_TYPE));
        return new Period(values, getPeriodType());
    }

    public Period plus(ReadablePeriod readablePeriod) {
        if (readablePeriod == null) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.YEAR_INDEX, values, readablePeriod.get(DurationFieldType.YEARS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.MONTH_INDEX, values, readablePeriod.get(DurationFieldType.MONTHS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.WEEK_INDEX, values, readablePeriod.get(DurationFieldType.WEEKS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.DAY_INDEX, values, readablePeriod.get(DurationFieldType.DAYS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.HOUR_INDEX, values, readablePeriod.get(DurationFieldType.HOURS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.MINUTE_INDEX, values, readablePeriod.get(DurationFieldType.MINUTES_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.SECOND_INDEX, values, readablePeriod.get(DurationFieldType.SECONDS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.MILLI_INDEX, values, readablePeriod.get(DurationFieldType.MILLIS_TYPE));
        return new Period(values, getPeriodType());
    }

    public Period plusDays(int i) {
        if (i == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.DAY_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period plusHours(int i) {
        if (i == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.HOUR_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period plusMillis(int i) {
        if (i == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.MILLI_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period plusMinutes(int i) {
        if (i == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.MINUTE_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period plusMonths(int i) {
        if (i == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.MONTH_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period plusSeconds(int i) {
        if (i == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.SECOND_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period plusWeeks(int i) {
        if (i == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.WEEK_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period plusYears(int i) {
        if (i == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.YEAR_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period withFields(ReadablePeriod readablePeriod) {
        return readablePeriod == null ? this : new Period(super.mergePeriodInto(getValues(), readablePeriod), getPeriodType());
    }

    @FromString
    public static Period parse(String str) {
        return parse(str, ISOPeriodFormat.standard());
    }

    public int getDays() {
        return getPeriodType().getIndexedField(this, PeriodType.DAY_INDEX);
    }

    public int getHours() {
        return getPeriodType().getIndexedField(this, PeriodType.HOUR_INDEX);
    }

    public int getMillis() {
        return getPeriodType().getIndexedField(this, PeriodType.MILLI_INDEX);
    }

    public int getMinutes() {
        return getPeriodType().getIndexedField(this, PeriodType.MINUTE_INDEX);
    }

    public int getMonths() {
        return getPeriodType().getIndexedField(this, PeriodType.MONTH_INDEX);
    }

    public int getSeconds() {
        return getPeriodType().getIndexedField(this, PeriodType.SECOND_INDEX);
    }

    public int getWeeks() {
        return getPeriodType().getIndexedField(this, PeriodType.WEEK_INDEX);
    }

    public int getYears() {
        return getPeriodType().getIndexedField(this, PeriodType.YEAR_INDEX);
    }

    public Period normalizedStandard(PeriodType periodType) {
        PeriodType periodType2 = DateTimeUtils.getPeriodType(periodType);
        long millis = getMillis();
        long seconds = getSeconds();
        long minutes = getMinutes();
        long hours = getHours();
        long days = getDays();
        Period period = new Period((getWeeks() * 604800000) + (days * CarGwiSoFileConstant.CAR_GWI_SPECIFY_INTERVAL) + (hours * 3600000) + (minutes * 60000) + (seconds * 1000) + millis, periodType2, ISOChronology.getInstanceUTC());
        int years = getYears();
        int months = getMonths();
        if (years == 0 && months == 0) {
            return period;
        }
        long j = (((long) years) * 12) + ((long) months);
        if (periodType2.isSupported(DurationFieldType.YEARS_TYPE)) {
            int iSafeToInt = FieldUtils.safeToInt(j / 12);
            period = period.withYears(iSafeToInt);
            j -= ((long) iSafeToInt) * 12;
        }
        if (periodType2.isSupported(DurationFieldType.MONTHS_TYPE)) {
            int iSafeToInt2 = FieldUtils.safeToInt(j);
            period = period.withMonths(iSafeToInt2);
            j -= (long) iSafeToInt2;
        }
        if (j == 0) {
            return period;
        }
        throw new UnsupportedOperationException("Unable to normalize as PeriodType is missing either years or months but period has a month/year amount: " + toString());
    }

    public Period withDays(int i) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.DAY_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period withHours(int i) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.HOUR_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period withMillis(int i) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.MILLI_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period withMinutes(int i) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.MINUTE_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period withMonths(int i) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.MONTH_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period withPeriodType(PeriodType periodType) {
        PeriodType periodType2 = DateTimeUtils.getPeriodType(periodType);
        return periodType2.equals(getPeriodType()) ? this : new Period(this, periodType2);
    }

    public Period withSeconds(int i) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.SECOND_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period withWeeks(int i) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.WEEK_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period withYears(int i) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.YEAR_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public static Period fieldDifference(ReadablePartial readablePartial, ReadablePartial readablePartial2) {
        if (readablePartial != null && readablePartial2 != null) {
            if (readablePartial.size() == readablePartial2.size()) {
                DurationFieldType[] durationFieldTypeArr = new DurationFieldType[readablePartial.size()];
                int[] iArr = new int[readablePartial.size()];
                int size = readablePartial.size();
                for (int i = 0; i < size; i++) {
                    if (readablePartial.getFieldType(i) == readablePartial2.getFieldType(i)) {
                        DurationFieldType durationType = readablePartial.getFieldType(i).getDurationType();
                        durationFieldTypeArr[i] = durationType;
                        if (i > 0 && durationFieldTypeArr[i - 1].equals(durationType)) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("ReadablePartial objects must not have overlapping fields");
                            return null;
                        }
                        iArr[i] = readablePartial2.getValue(i) - readablePartial.getValue(i);
                    } else {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("ReadablePartial objects must have the same set of fields");
                        return null;
                    }
                }
                return new Period(iArr, PeriodType.forFields(durationFieldTypeArr));
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("ReadablePartial objects must have the same set of fields");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("ReadablePartial objects must not be null");
        return null;
    }

    public Period withFieldAdded(DurationFieldType durationFieldType, int i) {
        if (durationFieldType == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Field must not be null");
            return null;
        }
        if (i == 0) {
            return this;
        }
        int[] values = getValues();
        super.addFieldInto(values, durationFieldType, i);
        return new Period(values, getPeriodType());
    }

    private void checkYearsAndMonths(String str) {
        if (getMonths() != 0) {
            IBraze$$ExternalSyntheticBUOutline0.m(ff$$ExternalSyntheticOutline0.m("Cannot convert to ", str, " as this period contains months and months vary in length"));
        } else {
            if (getYears() == 0) {
                return;
            }
            IBraze$$ExternalSyntheticBUOutline0.m(ff$$ExternalSyntheticOutline0.m("Cannot convert to ", str, " as this period contains years and years vary in length"));
        }
    }

    public Period multipliedBy(int i) {
        if (this == ZERO || i == 1) {
            return this;
        }
        int[] values = getValues();
        for (int i2 = 0; i2 < values.length; i2++) {
            values[i2] = FieldUtils.safeMultiply(values[i2], i);
        }
        return new Period(values, getPeriodType());
    }

    public static Period parse(String str, PeriodFormatter periodFormatter) {
        return periodFormatter.parsePeriod(str);
    }

    public static Period days(int i) {
        return new Period(new int[]{0, 0, 0, i, 0, 0, 0, 0}, PeriodType.standard());
    }

    public static Period hours(int i) {
        return new Period(new int[]{0, 0, 0, 0, i, 0, 0, 0}, PeriodType.standard());
    }

    public static Period millis(int i) {
        return new Period(new int[]{0, 0, 0, 0, 0, 0, 0, i}, PeriodType.standard());
    }

    public static Period minutes(int i) {
        return new Period(new int[]{0, 0, 0, 0, 0, i, 0, 0}, PeriodType.standard());
    }

    public static Period months(int i) {
        return new Period(new int[]{0, i, 0, 0, 0, 0, 0, 0}, PeriodType.standard());
    }

    public static Period seconds(int i) {
        return new Period(new int[]{0, 0, 0, 0, 0, 0, i, 0}, PeriodType.standard());
    }

    public static Period weeks(int i) {
        return new Period(new int[]{0, 0, i, 0, 0, 0, 0, 0}, PeriodType.standard());
    }

    public static Period years(int i) {
        return new Period(new int[]{i, 0, 0, 0, 0, 0, 0, 0}, PeriodType.standard());
    }

    public Period(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        super(i, i2, i3, i4, i5, i6, i7, i8, PeriodType.standard());
    }

    public Period(int i, int i2, int i3, int i4) {
        super(0, 0, 0, 0, i, i2, i3, i4, PeriodType.standard());
    }

    public Period() {
        super(0L, (PeriodType) null, (Chronology) null);
    }

    public Period(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, PeriodType periodType) {
        super(i, i2, i3, i4, i5, i6, i7, i8, periodType);
    }

    public Period(long j) {
        super(j);
    }

    public Period(long j, PeriodType periodType) {
        super(j, periodType, (Chronology) null);
    }

    public Period(long j, Chronology chronology) {
        super(j, (PeriodType) null, chronology);
    }

    public Period(long j, PeriodType periodType, Chronology chronology) {
        super(j, periodType, chronology);
    }

    public Period(long j, long j2) {
        super(j, j2, null, null);
    }

    public Period(long j, long j2, PeriodType periodType) {
        super(j, j2, periodType, null);
    }

    public Period(long j, long j2, Chronology chronology) {
        super(j, j2, null, chronology);
    }

    public Period(long j, long j2, PeriodType periodType, Chronology chronology) {
        super(j, j2, periodType, chronology);
    }

    public Period(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        super(readableInstant, readableInstant2, (PeriodType) null);
    }

    public Period(ReadableInstant readableInstant, ReadableInstant readableInstant2, PeriodType periodType) {
        super(readableInstant, readableInstant2, periodType);
    }

    public Period(ReadablePartial readablePartial, ReadablePartial readablePartial2) {
        super(readablePartial, readablePartial2, (PeriodType) null);
    }

    public Period(ReadablePartial readablePartial, ReadablePartial readablePartial2, PeriodType periodType) {
        super(readablePartial, readablePartial2, periodType);
    }

    public Period(ReadableInstant readableInstant, ReadableDuration readableDuration) {
        super(readableInstant, readableDuration, (PeriodType) null);
    }

    public Period(ReadableInstant readableInstant, ReadableDuration readableDuration, PeriodType periodType) {
        super(readableInstant, readableDuration, periodType);
    }

    public Period(ReadableDuration readableDuration, ReadableInstant readableInstant) {
        super(readableDuration, readableInstant, (PeriodType) null);
    }

    public Period(ReadableDuration readableDuration, ReadableInstant readableInstant, PeriodType periodType) {
        super(readableDuration, readableInstant, periodType);
    }

    public Period(Object obj) {
        super(obj, (PeriodType) null, (Chronology) null);
    }

    public Period(Object obj, PeriodType periodType) {
        super(obj, periodType, (Chronology) null);
    }

    public Period(Object obj, Chronology chronology) {
        super(obj, (PeriodType) null, chronology);
    }

    public Period(Object obj, PeriodType periodType, Chronology chronology) {
        super(obj, periodType, chronology);
    }

    private Period(int[] iArr, PeriodType periodType) {
        super(iArr, periodType);
    }

    public Period normalizedStandard() {
        return normalizedStandard(PeriodType.standard());
    }
}
