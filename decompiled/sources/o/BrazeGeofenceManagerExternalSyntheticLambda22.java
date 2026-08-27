package o;

import com.sentiance.sdk.eventtimeline.timelines.creators.TransportChangeType;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class BrazeGeofenceManagerExternalSyntheticLambda22 {
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[TransportChangeType.values().length];
        try {
            iArr[TransportChangeType.TRANSPORT_MOTORCYCLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransportChangeType.TRANSPORT_CAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        serializer = iArr;
    }
}
