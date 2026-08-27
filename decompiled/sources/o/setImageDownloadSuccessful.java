package o;

import com.sentiance.sdk.ondevice.api.event.OccupantRole;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class setImageDownloadSuccessful {
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[OccupantRole.values().length];
        try {
            iArr[OccupantRole.DRIVER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OccupantRole.PASSENGER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        write = iArr;
    }
}
