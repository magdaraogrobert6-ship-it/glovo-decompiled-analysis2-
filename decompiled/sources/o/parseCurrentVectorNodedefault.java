package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class parseCurrentVectorNodedefault extends InAppMessageManagerBaseWhenMappings {
    private static int read = 0;
    private static int serializer = 1;
    public final int IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final getStrokeLineJoinkLtJ_vA write;

    public final getStrokeLineJoinkLtJ_vA IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 103;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getStrokeLineJoinkLtJ_vA getstrokelinejoinkltj_va = this.write;
        int i4 = i2 + 19;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 17 / 0;
        }
        return getstrokelinejoinkltj_va;
    }

    public final int read() {
        int i = 2 % 2;
        int i2 = read + 71;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        int i5 = this.IconCompatParcelizer;
        int i6 = i3 + 93;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return i5;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = read + 3;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.RemoteActionCompatParcelizer;
        }
        int i3 = 46 / 0;
        return this.RemoteActionCompatParcelizer;
    }

    public parseCurrentVectorNodedefault(String str, getStrokeLineJoinkLtJ_vA getstrokelinejoinkltj_va, int i) {
        str.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.write = getstrokelinejoinkltj_va;
        this.IconCompatParcelizer = i;
    }

    public /* synthetic */ parseCurrentVectorNodedefault(String str) {
        this(str, getStrokeLineJoinkLtJ_vAdefault.read, 0);
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 55;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
            iHashCode = Integer.hashCode(this.IconCompatParcelizer) * ((this.write.hashCode() % (iHashCode2 >>> 90)) << 117);
        } else {
            int iHashCode3 = this.RemoteActionCompatParcelizer.hashCode();
            iHashCode = Integer.hashCode(this.IconCompatParcelizer) + ((this.write.hashCode() + (iHashCode3 * 31)) * 31);
        }
        int i3 = read + 27;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("SnackbarViewModel(message=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", actions=");
        sb.append(this.write);
        sb.append(", duration=");
        String strM = af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, ")", sb);
        int i2 = read + 125;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return strM;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = read + 61;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return true;
        }
        if (obj instanceof parseCurrentVectorNodedefault) {
            parseCurrentVectorNodedefault parsecurrentvectornodedefault = (parseCurrentVectorNodedefault) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, parsecurrentvectornodedefault.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, parsecurrentvectornodedefault.write}, getCieXyz.write())).booleanValue() && this.IconCompatParcelizer == parsecurrentvectornodedefault.IconCompatParcelizer;
            }
            i = serializer + 47;
            read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        } else {
            i = read + 41;
            serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        int i5 = i % 2;
        return false;
    }
}
