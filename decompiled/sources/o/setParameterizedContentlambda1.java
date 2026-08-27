package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class setParameterizedContentlambda1 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final String serializer;
    public final long write;

    public setParameterizedContentlambda1(long j, String str) {
        str.getClass();
        this.write = j;
        this.serializer = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 65;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(0) + af$$ExternalSyntheticOutline0.m(Long.hashCode(this.write) * 31, 31, this.serializer);
        int i4 = RemoteActionCompatParcelizer + 11;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 35;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            StringBuilder sb = getBitmapFromCache.read("Params(deliveryId=", ", taskId=", this.write, this.serializer);
            sb.append(", sequenceId=0)");
            int i3 = 35 / 0;
            return sb.toString();
        }
        StringBuilder sb2 = getBitmapFromCache.read("Params(deliveryId=", ", taskId=", this.write, this.serializer);
        sb2.append(", sequenceId=0)");
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 57;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 35;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 != 0;
        }
        if (obj instanceof setParameterizedContentlambda1) {
            setParameterizedContentlambda1 setparameterizedcontentlambda1 = (setParameterizedContentlambda1) obj;
            if (this.write == setparameterizedcontentlambda1.write) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, setparameterizedcontentlambda1.serializer}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }
}
