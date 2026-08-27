package com.mapbox.navigation.tripdata.speedlimit.model;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.base.formatter.UnitType;
import com.mapbox.navigation.base.speed.model.SpeedUnit;
import com.mapbox.navigation.ui.base.formatter.ValueFormatter;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes2.dex */
public final class PostedAndCurrentSpeedFormatter implements ValueFormatter {
    @Override // com.mapbox.navigation.ui.base.formatter.ValueFormatter
    public final Object format(Object obj) {
        double d;
        int iWrite;
        int iWrite2;
        SpeedData speedData = (SpeedData) obj;
        double d2 = speedData.speed;
        SpeedUnit speedUnit = speedData.fromUnit;
        UnitType unitType = speedData.toUnit;
        int i = WhenMappings.$EnumSwitchMapping$1[speedUnit.ordinal()];
        if (i == 1) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[unitType.ordinal()];
            if (i2 == 1) {
                d = (d2 / 1000.0d) / 1.609d;
            } else {
                if (i2 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                d = d2 / 1000.0d;
            }
            iWrite = MathKt.write(d * 3600.0d);
        } else if (i == 2) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[unitType.ordinal()];
            if (i3 == 1) {
                iWrite2 = MathKt.write((d2 / 1.609d) / 5.0d);
                iWrite = iWrite2 * 5;
            } else {
                if (i3 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                iWrite = MathKt.write(d2);
            }
        } else {
            if (i != 3) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            int i4 = WhenMappings.$EnumSwitchMapping$0[unitType.ordinal()];
            if (i4 == 1) {
                iWrite = MathKt.write(d2);
            } else {
                if (i4 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                iWrite2 = MathKt.write((d2 * 1.609d) / 5.0d);
                iWrite = iWrite2 * 5;
            }
        }
        return Integer.valueOf(iWrite);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[UnitType.values().length];
            try {
                iArr[UnitType.IMPERIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UnitType.METRIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SpeedUnit.values().length];
            try {
                iArr2[SpeedUnit.METERS_PER_SECOND.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[SpeedUnit.KILOMETERS_PER_HOUR.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[SpeedUnit.MILES_PER_HOUR.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
