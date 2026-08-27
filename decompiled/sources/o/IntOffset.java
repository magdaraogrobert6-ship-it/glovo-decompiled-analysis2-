package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class IntOffset extends FontScalingLinear {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final long IconCompatParcelizer;
    public final String read;
    public final String serializer;

    public IntOffset(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.IconCompatParcelizer = j;
        this.serializer = str;
        this.read = str2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 13;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.read.hashCode() / af$$ExternalSyntheticOutline0.m(Long.hashCode(this.IconCompatParcelizer) + 16, 107, this.serializer);
        }
        return this.read.hashCode() + af$$ExternalSyntheticOutline0.m(Long.hashCode(this.IconCompatParcelizer) * 31, 31, this.serializer);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 29;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return d$$ExternalSyntheticOutline0.m(getBitmapFromCache.read("OpenPinScreen(deliveryId=", ", deliveryState=", this.IconCompatParcelizer, this.serializer), ", taskId=", this.read, ")");
        }
        d$$ExternalSyntheticOutline0.m(getBitmapFromCache.read("OpenPinScreen(deliveryId=", ", deliveryState=", this.IconCompatParcelizer, this.serializer), ", taskId=", this.read, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 109;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntOffset)) {
            return false;
        }
        IntOffset intOffset = (IntOffset) obj;
        if (this.IconCompatParcelizer != intOffset.IconCompatParcelizer) {
            return false;
        }
        Object[] objArr = {this.serializer, intOffset.serializer};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i3 = write + 103;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        Object[] objArr2 = {this.read, intOffset.read};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return false;
        }
        int i5 = RemoteActionCompatParcelizer + 103;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return true;
    }
}
