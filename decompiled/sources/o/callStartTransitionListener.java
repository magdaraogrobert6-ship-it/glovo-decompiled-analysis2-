package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class callStartTransitionListener {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final String IconCompatParcelizer;
    public final String read;
    public final Integer serializer;

    public callStartTransitionListener(String str, String str2, Integer num) {
        str.getClass();
        this.read = str;
        this.serializer = num;
        this.IconCompatParcelizer = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ callStartTransitionListener(String str, String str2, int i) {
        Object obj = null;
        if ((i & 4) != 0) {
            int i2 = RemoteActionCompatParcelizer + 51;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            write = i3;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = i3 + 101;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str2 = null;
        }
        this(str, str2, (Integer) null);
    }

    public final int hashCode() {
        int iHashCode;
        Integer num;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 51;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iHashCode3 = 0;
        if (i2 % 2 != 0) {
            iHashCode = this.read.hashCode();
            num = this.serializer;
            iHashCode2 = 1;
            if (num != null) {
                iHashCode3 = 1;
                iHashCode2 = iHashCode3;
                iHashCode3 = num.hashCode();
            }
        } else {
            iHashCode = this.read.hashCode();
            num = this.serializer;
            if (num == null) {
                iHashCode2 = 0;
            } else {
                iHashCode2 = iHashCode3;
                iHashCode3 = num.hashCode();
            }
        }
        String str = this.IconCompatParcelizer;
        if (str == null) {
            int i3 = write + 95;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        } else {
            iHashCode2 = str.hashCode();
        }
        return (((iHashCode * 31) + iHashCode3) * 31) + iHashCode2;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("DeeplinkParams(pageId=");
        sb.append(this.read);
        sb.append(", deliveryId=");
        sb.append(this.serializer);
        sb.append(", flowVersion=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.IconCompatParcelizer, ")");
        int i2 = write + 79;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 33 / 0;
        }
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 53;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof callStartTransitionListener)) {
            return false;
        }
        callStartTransitionListener callstarttransitionlistener = (callStartTransitionListener) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, callstarttransitionlistener.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, callstarttransitionlistener.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, callstarttransitionlistener.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i3 = RemoteActionCompatParcelizer + 57;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i3 % 2 != 0;
    }
}
