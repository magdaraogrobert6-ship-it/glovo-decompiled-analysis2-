package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class performMultiWindowModeChanged {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[requireParentFragment.values().length];
        try {
            iArr[requireParentFragment.ACCEPTING_DELIVERIES.ordinal()] = 1;
            int i = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[requireParentFragment.WAITING_FOR_DELIVERIES.ordinal()] = 2;
            int i2 = RemoteActionCompatParcelizer + 91;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[requireParentFragment.ENDING_WITHOUT_ORDERS.ordinal()] = 3;
            int i5 = RemoteActionCompatParcelizer + 115;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[requireParentFragment.ON_THE_WAY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[requireParentFragment.PICK_UP_DROP_OFF.ordinal()] = 5;
            int i7 = RemoteActionCompatParcelizer + 45;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[requireParentFragment.PAUSED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[requireParentFragment.NOT_ACTIVE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[requireParentFragment.HAS_WORK_NOW_OPPORTUNITY.ordinal()] = 8;
            int i10 = read + 59;
            RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                int i11 = 2 % 2;
            }
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[requireParentFragment.PREPARING_TO_WORK.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[requireParentFragment.LAST_STOP.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        write = iArr;
    }
}
