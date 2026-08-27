package org.joda.time.field;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PreciseDurationDateTimeField extends BaseDateTimeField {
    private static final long serialVersionUID = 5004523158306266035L;
    private final DurationField iUnitField;
    final long iUnitMillis;

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getDurationField() {
        return this.iUnitField;
    }

    public int getMaximumValueForSet(long j, int i) {
        return getMaximumValue(j);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return 0;
    }

    public final long getUnitMillis() {
        return this.iUnitMillis;
    }

    @Override // org.joda.time.DateTimeField
    public boolean isLenient() {
        return false;
    }

    public PreciseDurationDateTimeField(DateTimeFieldType dateTimeFieldType, DurationField durationField) {
        super(dateTimeFieldType);
        if (!durationField.isPrecise()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unit duration field must be precise");
            throw null;
        }
        long unitMillis = durationField.getUnitMillis();
        this.iUnitMillis = unitMillis;
        if (unitMillis >= 1) {
            this.iUnitField = durationField;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("The unit milliseconds must be at least 1");
            throw null;
        }
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long remainder(long j) {
        long j2 = this.iUnitMillis;
        if (j >= 0) {
            return j % j2;
        }
        return (((j + 1) % j2) + j2) - 1;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundCeiling(long j) {
        long j2 = this.iUnitMillis;
        if (j > 0) {
            long j3 = j - 1;
            return (j3 - (j3 % j2)) + j2;
        }
        return j - (j % j2);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundFloor(long j) {
        long j2 = this.iUnitMillis;
        if (j >= 0) {
            j2 = j % j2;
        } else {
            long j3 = j + 1;
            j = j3 - (j3 % j2);
        }
        return j - j2;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long set(long j, int i) {
        FieldUtils.verifyValueBounds(this, i, getMinimumValue(), getMaximumValueForSet(j, i));
        return (((long) (i - get(j))) * this.iUnitMillis) + j;
    }
}
