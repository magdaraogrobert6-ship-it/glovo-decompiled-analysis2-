package o;

import com.sentiance.sdk.geofence.states.Type;

/* JADX INFO: loaded from: classes4.dex */
abstract /* synthetic */ class isNewlyReceivedPushStory {
    static final /* synthetic */ int[] IconCompatParcelizer;

    static {
        int[] iArr = new int[Type.values().length];
        IconCompatParcelizer = iArr;
        try {
            iArr[Type.WAITING_ENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            IconCompatParcelizer[Type.WAITING_DWELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            IconCompatParcelizer[Type.WAITING_EXIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            IconCompatParcelizer[Type.LOST.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            IconCompatParcelizer[Type.STOPPED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
