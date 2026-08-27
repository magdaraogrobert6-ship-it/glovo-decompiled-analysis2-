package o;

/* JADX INFO: loaded from: classes3.dex */
public final class schedulePushDeliverylambda1 extends runGuardedForResultandroid_sdk_base_releasedefault {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final boolean write;

    public schedulePushDeliverylambda1(boolean z) {
        this.write = z;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 121;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.write);
        int i4 = RemoteActionCompatParcelizer + 77;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 121;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strSerializer = MediaSessionCompatQueueItem.serializer("UpdateLoading(showLoading=", ")", this.write);
        int i4 = RemoteActionCompatParcelizer + 11;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strSerializer;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof schedulePushDeliverylambda1) {
            if (this.write == ((schedulePushDeliverylambda1) obj).write) {
                return true;
            }
        } else {
            int i2 = IconCompatParcelizer + 115;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        int i4 = IconCompatParcelizer + 111;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
