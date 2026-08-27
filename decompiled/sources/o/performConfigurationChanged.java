package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class performConfigurationChanged {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[requireParentFragment.values().length];
        try {
            iArr[requireParentFragment.NOT_ACTIVE.ordinal()] = 1;
            int i = 2 % 2;
        } catch (Exception e) {
            throw e;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[requireParentFragment.PREPARING_TO_WORK.ordinal()] = 2;
            int i2 = IconCompatParcelizer + 35;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[requireParentFragment.ACCEPTING_DELIVERIES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[requireParentFragment.PICK_UP_DROP_OFF.ordinal()] = 4;
            int i5 = IconCompatParcelizer + 119;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[requireParentFragment.ENDING_WITHOUT_ORDERS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[requireParentFragment.WAITING_FOR_DELIVERIES.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[requireParentFragment.LAST_STOP.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[requireParentFragment.PAUSED.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[requireParentFragment.HAS_WORK_NOW_OPPORTUNITY.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[requireParentFragment.ON_THE_WAY.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        serializer = iArr;
    }
}
