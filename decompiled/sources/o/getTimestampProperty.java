package o;

import com.sentiance.sdk.eventtimeline.timelines.creators.TransportChangeType;
import com.sentiance.sdk.ondevice.timeline.TimelineTransportType;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class getTimestampProperty {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[TransportChangeType.values().length];
        try {
            iArr[TransportChangeType.TRANSPORT_CAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransportChangeType.TRANSPORT_BIKING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TransportChangeType.TRANSPORT_MOTORCYCLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        write = iArr;
        int[] iArr2 = new int[TimelineTransportType.values().length];
        try {
            iArr2[TimelineTransportType.CAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[TimelineTransportType.BIKE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[TimelineTransportType.MOTORCYCLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        IconCompatParcelizer = iArr2;
    }
}
