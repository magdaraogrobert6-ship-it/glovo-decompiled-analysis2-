package o;

import com.sentiance.sdk.eventtimeline.timelines.creators.TransportChangeType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class parsePayloadFieldsFromBundleparseVisibleContent {
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[TransportChangeType.values().length];
        try {
            iArr[TransportChangeType.STATIONARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransportChangeType.OFF_THE_GRID.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        serializer = iArr;
    }
}
