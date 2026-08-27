package org.joda.time.base;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.Serializable;
import o.DrawableTransformation;
import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.FieldUtils;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseSingleFieldPeriod implements ReadablePeriod, Comparable<BaseSingleFieldPeriod>, Serializable {
    private static final long START_1972 = 63072000000L;
    private static final long serialVersionUID = 9386874258972L;
    private volatile int iPeriod;

    public abstract DurationFieldType getFieldType();

    @Override // org.joda.time.ReadablePeriod
    public abstract PeriodType getPeriodType();

    @Override // org.joda.time.ReadablePeriod
    public boolean isSupported(DurationFieldType durationFieldType) {
        return durationFieldType == getFieldType();
    }

    public void setValue(int i) {
        this.iPeriod = i;
    }

    @Override // org.joda.time.ReadablePeriod
    public int size() {
        return 1;
    }

    @Override // org.joda.time.ReadablePeriod
    public DurationFieldType getFieldType(int i) {
        if (i == 0) {
            return getFieldType();
        }
        DrawableTransformation.read(String.valueOf(i));
        return null;
    }

    @Override // org.joda.time.ReadablePeriod
    public int getValue(int i) {
        if (i == 0) {
            return getValue();
        }
        DrawableTransformation.read(String.valueOf(i));
        return 0;
    }

    @Override // org.joda.time.ReadablePeriod
    public MutablePeriod toMutablePeriod() {
        MutablePeriod mutablePeriod = new MutablePeriod();
        mutablePeriod.add(this);
        return mutablePeriod;
    }

    @Override // org.joda.time.ReadablePeriod
    public Period toPeriod() {
        return Period.ZERO.withFields(this);
    }

    public BaseSingleFieldPeriod(int i) {
        this.iPeriod = i;
    }

    public static int standardPeriodIn(ReadablePeriod readablePeriod, long j) {
        if (readablePeriod == null) {
            return 0;
        }
        ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
        long jSafeAdd = 0;
        for (int i = 0; i < readablePeriod.size(); i++) {
            int value = readablePeriod.getValue(i);
            if (value != 0) {
                DurationField field = readablePeriod.getFieldType(i).getField(instanceUTC);
                if (field.isPrecise()) {
                    jSafeAdd = FieldUtils.safeAdd(jSafeAdd, FieldUtils.safeMultiply(field.getUnitMillis(), value));
                } else {
                    DrawableTransformation.read("Cannot convert period to duration as ", field.getName(), " is not precise in the period ", readablePeriod);
                    return 0;
                }
            }
        }
        return FieldUtils.safeToInt(jSafeAdd / j);
    }

    @Override // java.lang.Comparable
    public int compareTo(BaseSingleFieldPeriod baseSingleFieldPeriod) {
        if (baseSingleFieldPeriod.getClass() == getClass()) {
            int value = baseSingleFieldPeriod.getValue();
            int value2 = getValue();
            if (value2 > value) {
                return 1;
            }
            return value2 < value ? -1 : 0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass());
        Class<?> cls = baseSingleFieldPeriod.getClass();
        sb.append(" cannot be compared to ");
        sb.append(cls);
        throw new ClassCastException(sb.toString());
    }

    @Override // org.joda.time.ReadablePeriod
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReadablePeriod)) {
            return false;
        }
        ReadablePeriod readablePeriod = (ReadablePeriod) obj;
        return readablePeriod.getPeriodType() == getPeriodType() && readablePeriod.getValue(0) == getValue();
    }

    public static int between(ReadablePartial readablePartial, ReadablePartial readablePartial2, ReadablePeriod readablePeriod) {
        if (readablePartial != null && readablePartial2 != null) {
            if (readablePartial.size() == readablePartial2.size()) {
                int size = readablePartial.size();
                for (int i = 0; i < size; i++) {
                    if (readablePartial.getFieldType(i) != readablePartial2.getFieldType(i)) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("ReadablePartial objects must have the same set of fields");
                        return 0;
                    }
                }
                if (DateTimeUtils.isContiguous(readablePartial)) {
                    Chronology chronologyWithUTC = DateTimeUtils.getChronology(readablePartial.getChronology()).withUTC();
                    return chronologyWithUTC.get(readablePeriod, chronologyWithUTC.set(readablePartial, START_1972), chronologyWithUTC.set(readablePartial2, START_1972))[0];
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("ReadablePartial objects must be contiguous");
                return 0;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("ReadablePartial objects must have the same set of fields");
            return 0;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("ReadablePartial objects must not be null");
        return 0;
    }

    @Override // org.joda.time.ReadablePeriod
    public int get(DurationFieldType durationFieldType) {
        if (durationFieldType == getFieldType()) {
            return getValue();
        }
        return 0;
    }

    @Override // org.joda.time.ReadablePeriod
    public int hashCode() {
        return getFieldType().hashCode() + ((getValue() + 459) * 27);
    }

    public int getValue() {
        return this.iPeriod;
    }

    public static int between(ReadableInstant readableInstant, ReadableInstant readableInstant2, DurationFieldType durationFieldType) {
        if (readableInstant != null && readableInstant2 != null) {
            return durationFieldType.getField(DateTimeUtils.getInstantChronology(readableInstant)).getDifference(readableInstant2.getMillis(), readableInstant.getMillis());
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("ReadableInstant objects must not be null");
        return 0;
    }
}
