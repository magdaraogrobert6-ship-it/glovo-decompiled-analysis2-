package org.joda.time.chrono;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.ImpreciseDateTimeField;

/* JADX INFO: loaded from: classes4.dex */
class BasicMonthOfYearDateTimeField extends ImpreciseDateTimeField {
    private static final int MIN = 1;
    private static final long serialVersionUID = -8258715387168736L;
    private final BasicChronology iChronology;
    private final int iLeapMonth;
    private final int iMax;

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getLeapAmount(long j) {
        return isLeap(j) ? 1 : 0;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue() {
        return this.iMax;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return 1;
    }

    @Override // org.joda.time.DateTimeField
    public boolean isLenient() {
        return false;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long remainder(long j) {
        return j - roundFloor(j);
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long set(long j, int i) {
        FieldUtils.verifyValueBounds(this, i, 1, this.iMax);
        int year = this.iChronology.getYear(j);
        int dayOfMonth = this.iChronology.getDayOfMonth(j, year);
        int daysInYearMonth = this.iChronology.getDaysInYearMonth(year, i);
        if (dayOfMonth > daysInYearMonth) {
            dayOfMonth = daysInYearMonth;
        }
        return this.iChronology.getYearMonthDayMillis(year, i, dayOfMonth) + ((long) this.iChronology.getMillisOfDay(j));
    }

    private Object readResolve() {
        return this.iChronology.monthOfYear();
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j) {
        return this.iChronology.getMonthOfYear(j);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getLeapDurationField() {
        return this.iChronology.days();
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        return this.iChronology.years();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public boolean isLeap(long j) {
        int year = this.iChronology.getYear(j);
        return this.iChronology.isLeapYear(year) && this.iChronology.getMonthOfYear(j, year) == this.iLeapMonth;
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundFloor(long j) {
        int year = this.iChronology.getYear(j);
        return this.iChronology.getYearMonthMillis(year, this.iChronology.getMonthOfYear(j, year));
    }

    public BasicMonthOfYearDateTimeField(BasicChronology basicChronology, int i) {
        super(DateTimeFieldType.monthOfYear(), basicChronology.getAverageMillisPerMonth());
        this.iChronology = basicChronology;
        this.iMax = basicChronology.getMaxMonth();
        this.iLeapMonth = i;
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long getDifferenceAsLong(long j, long j2) {
        long j3;
        if (j < j2) {
            return -getDifference(j2, j);
        }
        int year = this.iChronology.getYear(j);
        int monthOfYear = this.iChronology.getMonthOfYear(j, year);
        int year2 = this.iChronology.getYear(j2);
        int monthOfYear2 = this.iChronology.getMonthOfYear(j2, year2);
        long j4 = ((((long) (year - year2)) * ((long) this.iMax)) + ((long) monthOfYear)) - ((long) monthOfYear2);
        int dayOfMonth = this.iChronology.getDayOfMonth(j, year, monthOfYear);
        if (dayOfMonth == this.iChronology.getDaysInYearMonth(year, monthOfYear)) {
            j3 = j2;
            if (this.iChronology.getDayOfMonth(j3, year2, monthOfYear2) > dayOfMonth) {
                j3 = this.iChronology.dayOfMonth().set(j3, dayOfMonth);
            }
        } else {
            j3 = j2;
        }
        return j - this.iChronology.getYearMonthMillis(year, monthOfYear) < j3 - this.iChronology.getYearMonthMillis(year2, monthOfYear2) ? j4 - 1 : j4;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long addWrapField(long j, int i) {
        return set(j, FieldUtils.getWrappedValue(get(j), i, 1, this.iMax));
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j, long j2) {
        long j3;
        long j4;
        int i = (int) j2;
        if (i == j2) {
            return add(j, i);
        }
        long millisOfDay = this.iChronology.getMillisOfDay(j);
        int year = this.iChronology.getYear(j);
        int monthOfYear = this.iChronology.getMonthOfYear(j, year);
        long j5 = ((long) (monthOfYear - 1)) + j2;
        int i2 = this.iMax;
        if (j5 >= 0) {
            long j6 = i2;
            j3 = (j5 / j6) + ((long) year);
            j4 = (j5 % j6) + 1;
        } else {
            j3 = ((long) year) + (j5 / ((long) i2));
            long jAbs = Math.abs(j5);
            int i3 = this.iMax;
            int i4 = (int) (jAbs % ((long) i3));
            if (i4 == 0) {
                i4 = i3;
            }
            j4 = (i3 - i4) + 1;
            if (j4 != 1) {
                j3--;
            }
        }
        long j7 = j3;
        if (j7 >= this.iChronology.getMinYear() && j7 <= this.iChronology.getMaxYear()) {
            int i5 = (int) j7;
            int i6 = (int) j4;
            int dayOfMonth = this.iChronology.getDayOfMonth(j, year, monthOfYear);
            int daysInYearMonth = this.iChronology.getDaysInYearMonth(i5, i6);
            if (dayOfMonth > daysInYearMonth) {
                dayOfMonth = daysInYearMonth;
            }
            return this.iChronology.getYearMonthDayMillis(i5, i6, dayOfMonth) + millisOfDay;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(j2, "Magnitude of add amount is too large: "));
        return 0L;
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (i == 0) {
            return j;
        }
        long millisOfDay = this.iChronology.getMillisOfDay(j);
        int year = this.iChronology.getYear(j);
        int monthOfYear = this.iChronology.getMonthOfYear(j, year);
        int i7 = monthOfYear - 1;
        int i8 = i7 + i;
        if (monthOfYear <= 0 || i8 >= 0) {
            i2 = year;
        } else {
            float fSignum = Math.signum(this.iMax + i);
            float fSignum2 = Math.signum(i);
            int i9 = this.iMax;
            if (fSignum == fSignum2) {
                i5 = year - 1;
                i6 = i + i9;
            } else {
                i5 = year + 1;
                i6 = i - i9;
            }
            int i10 = i5;
            i8 = i6 + i7;
            i2 = i10;
        }
        int i11 = this.iMax;
        if (i8 >= 0) {
            i3 = (i8 / i11) + i2;
            i4 = (i8 % i11) + 1;
        } else {
            i3 = (i8 / i11) + i2;
            int iAbs = Math.abs(i8);
            int i12 = this.iMax;
            int i13 = iAbs % i12;
            if (i13 == 0) {
                i13 = i12;
            }
            i4 = (i12 - i13) + 1;
            if (i4 != 1) {
                i3--;
            }
        }
        int dayOfMonth = this.iChronology.getDayOfMonth(j, year, monthOfYear);
        int daysInYearMonth = this.iChronology.getDaysInYearMonth(i3, i4);
        if (dayOfMonth > daysInYearMonth) {
            dayOfMonth = daysInYearMonth;
        }
        return this.iChronology.getYearMonthDayMillis(i3, i4, dayOfMonth) + millisOfDay;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int[] add(ReadablePartial readablePartial, int i, int[] iArr, int i2) {
        if (i2 == 0) {
            return iArr;
        }
        if (readablePartial.size() > 0 && readablePartial.getFieldType(0).equals(DateTimeFieldType.monthOfYear()) && i == 0) {
            return set(readablePartial, 0, iArr, ((((i2 % 12) + (iArr[0] - 1)) + 12) % 12) + 1);
        }
        if (DateTimeUtils.isContiguous(readablePartial)) {
            int size = readablePartial.size();
            long j = 0;
            for (int i3 = 0; i3 < size; i3++) {
                j = readablePartial.getFieldType(i3).getField(this.iChronology).set(j, iArr[i3]);
            }
            return this.iChronology.get(readablePartial, add(j, i2));
        }
        return super.add(readablePartial, i, iArr, i2);
    }
}
