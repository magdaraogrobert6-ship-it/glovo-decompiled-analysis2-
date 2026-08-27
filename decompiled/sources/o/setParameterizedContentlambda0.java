package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class setParameterizedContentlambda0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final long IconCompatParcelizer;
    public final String read;

    public setParameterizedContentlambda0(long j, String str) {
        str.getClass();
        this.IconCompatParcelizer = j;
        this.read = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 53;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(0) + af$$ExternalSyntheticOutline0.m(Long.hashCode(this.IconCompatParcelizer) * 31, 31, this.read);
        int i4 = RemoteActionCompatParcelizer + 117;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 117;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sb = getBitmapFromCache.read("ImageKey(deliveryId=", ", taskId=", this.IconCompatParcelizer, this.read);
        sb.append(", sequenceId=0)");
        String string = sb.toString();
        int i4 = RemoteActionCompatParcelizer + 7;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 87;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof setParameterizedContentlambda0) {
            setParameterizedContentlambda0 setparameterizedcontentlambda0 = (setParameterizedContentlambda0) obj;
            if (this.IconCompatParcelizer == setparameterizedcontentlambda0.IconCompatParcelizer) {
                Object[] objArr = {this.read, setparameterizedcontentlambda0.read};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    return true;
                }
            }
        }
        int i4 = RemoteActionCompatParcelizer + 49;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 83 / 0;
        }
        return false;
    }
}
