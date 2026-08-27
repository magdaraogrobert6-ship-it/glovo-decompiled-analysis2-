package o;

import com.sentiance.sdk.events.eventextras.TimelineUpdateDetails;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class accessgetDataStoremigrateRegisteredGeofencesListToJson {
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[TimelineUpdateDetails.UpdatedDataType.values().length];
        try {
            iArr[TimelineUpdateDetails.UpdatedDataType.VENUE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TimelineUpdateDetails.UpdatedDataType.TRANSPORT_STATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TimelineUpdateDetails.UpdatedDataType.SEGMENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        write = iArr;
    }
}
