package com.mapbox.navigation.utils.internal;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.common.LoggingLevel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LoggingLevelUtilKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoggingLevel.values().length];
            try {
                iArr[LoggingLevel.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoggingLevel.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoggingLevel.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LoggingLevel.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean accepts(LoggingLevel loggingLevel, LoggingLevel loggingLevel2) {
        loggingLevel2.getClass();
        return toPriority(loggingLevel2) >= toPriority(loggingLevel);
    }

    public static final int toPriority(LoggingLevel loggingLevel) {
        int i = loggingLevel == null ? -1 : WhenMappings.$EnumSwitchMapping$0[loggingLevel.ordinal()];
        if (i == -1) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i == 4) {
                        return 4;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return 0;
                }
            }
        }
        return i2;
    }
}
