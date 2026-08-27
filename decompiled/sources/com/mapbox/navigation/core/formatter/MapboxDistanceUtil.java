package com.mapbox.navigation.core.formatter;

import bo.app.af$$ExternalSyntheticOutline0;
import com.mapbox.navigation.base.formatter.UnitType;
import java.text.NumberFormat;
import java.util.Locale;
import kotlin.math.MathKt;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MapboxDistanceUtil {
    public static final String enLanguage = new Locale("en").getLanguage();

    public final class FormattingData {
        public final double distance;
        public final String distanceAsString;
        public final String turfDistanceUnit;
        public final UnitType unitType;

        public final int hashCode() {
            return this.unitType.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(Double.hashCode(this.distance) * 31, 31, this.distanceAsString), 31, this.turfDistanceUnit);
        }

        public FormattingData(double d, String str, String str2, UnitType unitType) {
            str.getClass();
            unitType.getClass();
            this.distance = d;
            this.distanceAsString = str;
            this.turfDistanceUnit = str2;
            this.unitType = unitType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FormattingData)) {
                return false;
            }
            FormattingData formattingData = (FormattingData) obj;
            if (Double.compare(this.distance, formattingData.distance) != 0) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.distanceAsString, formattingData.distanceAsString}, getCieXyz.write())).booleanValue() && this.turfDistanceUnit.equals(formattingData.turfDistanceUnit) && this.unitType == formattingData.unitType;
        }

        public final String toString() {
            return "FormattingData(distance=" + this.distance + ", distanceAsString=" + this.distanceAsString + ", turfDistanceUnit=" + this.turfDistanceUnit + ", unitType=" + this.unitType + ')';
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UnitType.values().length];
            try {
                iArr[UnitType.METRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UnitType.IMPERIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static FormattingData largeValue(double d, int i, String str, UnitType unitType, Locale locale) {
        NumberFormat numberInstance = NumberFormat.getNumberInstance(locale);
        numberInstance.setMaximumFractionDigits(i);
        String str2 = numberInstance.format(d);
        str2.getClass();
        return new FormattingData(d, str2, str, unitType);
    }

    public static FormattingData smallValue(double d, int i, int i2, String str, UnitType unitType) {
        Number numberValueOf;
        int iIntValue;
        if (i == -1) {
            i = i2;
        }
        if (d < 0.0d) {
            iIntValue = 0;
        } else {
            if (i > 0) {
                int iWrite = MathKt.write(d);
                if (iWrite >= i) {
                    i *= iWrite / i;
                }
                numberValueOf = Integer.valueOf(i);
            } else {
                numberValueOf = Double.valueOf(d);
            }
            iIntValue = numberValueOf.intValue();
        }
        return new FormattingData(iIntValue, String.valueOf(iIntValue), str, unitType);
    }
}
