package o;

import com.roadrunner.opportunities.calendar.data.BonusLevel;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class u5 {
    private static int RemoteActionCompatParcelizer = 0;
    public static final /* synthetic */ int[] read;
    private static int write = 1;

    static {
        int[] iArr = new int[BonusLevel.values().length];
        try {
            iArr[BonusLevel.NONE.ordinal()] = 1;
            int i = RemoteActionCompatParcelizer + 3;
            write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 5 % 2;
            } else {
                int i3 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BonusLevel.VERY_LOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BonusLevel.LOW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BonusLevel.MID.ordinal()] = 4;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[BonusLevel.HIGH.ordinal()] = 5;
            int i5 = RemoteActionCompatParcelizer + 113;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[BonusLevel.VERY_HIGH.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        read = iArr;
    }
}
