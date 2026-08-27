package o;

import com.roadrunner.rider.state.quests.data.QuestStatus;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class buildClickPackage {
    private static int IconCompatParcelizer = 0;
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    private static int serializer = 1;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[QuestStatus.values().length];
        try {
            iArr[QuestStatus.ONGOING.ordinal()] = 1;
            int i = serializer + 93;
            IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[QuestStatus.FAILING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[QuestStatus.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        RemoteActionCompatParcelizer = iArr;
        int[] iArr2 = new int[isTrackingEnabled.values().length];
        try {
            iArr2[isTrackingEnabled.ENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[isTrackingEnabled.LATE.ordinal()] = 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[isTrackingEnabled.NOT_WORKING.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[isTrackingEnabled.ON_PAID_BREAK.ordinal()] = 4;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[isTrackingEnabled.ON_BREAK.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[isTrackingEnabled.READY.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[isTrackingEnabled.STARTING.ordinal()] = 7;
            int i5 = IconCompatParcelizer + 55;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[isTrackingEnabled.SUSPENDED.ordinal()] = 8;
            int i8 = serializer + 71;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[isTrackingEnabled.AVAILABLE.ordinal()] = 9;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[isTrackingEnabled.WORKING.ordinal()] = 10;
        } catch (NoSuchFieldError unused13) {
        }
        write = iArr2;
    }
}
