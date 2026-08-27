package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class isRemoteUri {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;

    public final int hashCode() {
        return this.e.hashCode() + af$$ExternalSyntheticOutline0.m(this.d, af$$ExternalSyntheticOutline0.m(this.c, af$$ExternalSyntheticOutline0.m(this.a.hashCode() * 31, 31, this.b), 31), 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isRemoteUri)) {
            return false;
        }
        isRemoteUri isremoteuri = (isRemoteUri) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.a, isremoteuri.a}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.b, isremoteuri.b}, getCieXyz.write())).booleanValue() || this.c != isremoteuri.c || this.d != isremoteuri.d) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.e, isremoteuri.e}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ModelInfo(name=");
        sb.append(this.a);
        sb.append(", flavour=");
        sb.append(this.b);
        sb.append(", majorVersion=");
        sb.append(this.c);
        sb.append(", minorVersion=");
        sb.append(this.d);
        sb.append(", extension=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.e, ')');
    }

    public isRemoteUri(int i, String str, String str2, int i2, int i3, String str3) {
        if (15 == (i & 15)) {
            this.a = str;
            this.b = str2;
            this.c = i2;
            this.d = i3;
            if ((i & 16) == 0) {
                this.e = "tflite";
                return;
            } else {
                this.e = str3;
                return;
            }
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, isRemoteUrilambda0.RemoteActionCompatParcelizer);
        throw null;
    }

    public isRemoteUri(String str, String str2, int i, int i2) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = "tflite";
    }
}
