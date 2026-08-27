package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class FragmentManagerState {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[requireParentFragment.values().length];
        try {
            iArr[requireParentFragment.NOT_ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[requireParentFragment.ENDING_WITHOUT_ORDERS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[requireParentFragment.HAS_WORK_NOW_OPPORTUNITY.ordinal()] = 3;
            int i = read + 31;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[requireParentFragment.PREPARING_TO_WORK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[requireParentFragment.WAITING_FOR_DELIVERIES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[requireParentFragment.ON_THE_WAY.ordinal()] = 6;
            int i4 = RemoteActionCompatParcelizer + 21;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 4 % 2;
            } else {
                int i6 = 2 % 2;
            }
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[requireParentFragment.PICK_UP_DROP_OFF.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[requireParentFragment.PAUSED.ordinal()] = 8;
            int i7 = 2 % 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[requireParentFragment.ACCEPTING_DELIVERIES.ordinal()] = 9;
            int i8 = read + 7;
            RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[requireParentFragment.LAST_STOP.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        serializer = iArr;
    }
}
