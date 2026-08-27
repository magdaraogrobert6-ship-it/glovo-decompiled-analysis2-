package o;

import com.google.android.gms.location.LocationRequest;

/* JADX INFO: loaded from: classes3.dex */
public final class RxWorker {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final CoroutineWorker IconCompatParcelizer;
    public final LocationRequest serializer;

    public RxWorker(LocationRequest locationRequest, CoroutineWorker coroutineWorker) {
        this.serializer = locationRequest;
        this.IconCompatParcelizer = coroutineWorker;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 91;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.IconCompatParcelizer.hashCode() * (this.serializer.hashCode() - 69);
        } else {
            iHashCode = this.IconCompatParcelizer.hashCode() + (this.serializer.hashCode() * 31);
        }
        int i3 = read + 55;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 103;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this != obj) {
            if (obj instanceof RxWorker) {
                RxWorker rxWorker = (RxWorker) obj;
                if (this.serializer.equals(rxWorker.serializer)) {
                    if (this.IconCompatParcelizer == rxWorker.IconCompatParcelizer) {
                        return true;
                    }
                    int i5 = RemoteActionCompatParcelizer + 123;
                    read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    return false;
                }
            }
            return false;
        }
        int i7 = i2 + 81;
        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return true;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "GmsLocationRequestData(locationRequest=" + this.serializer + ", callback=" + this.IconCompatParcelizer + ")";
        int i2 = read + 43;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
