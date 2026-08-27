package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaC88K0nJTd0ZtnQMFV8dTGzTF_U implements r8lambdaB7lTIYT0cAH9MiUxCtgCibXo3iw {
    private static int MediaDescriptionCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public final String IconCompatParcelizer;
    public final String read;
    public final r8lambda9WmZxQ0wdyigcPoXrobdieYXRv8 serializer;
    public final int write;

    public r8lambdaC88K0nJTd0ZtnQMFV8dTGzTF_U(String str, int i, r8lambda9WmZxQ0wdyigcPoXrobdieYXRv8 r8lambda9wmzxq0wdyigcpoxrobdieyxrv8, String str2) {
        r8lambda9wmzxq0wdyigcpoxrobdieyxrv8.getClass();
        this.read = str;
        this.write = i;
        this.serializer = r8lambda9wmzxq0wdyigcpoxrobdieyxrv8;
        this.IconCompatParcelizer = str2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        String str = this.read;
        int iHashCode = 0;
        int iM = af$$ExternalSyntheticOutline0.m(this.write, (str == null ? 0 : str.hashCode()) * 31, 31);
        int iHashCode2 = this.serializer.hashCode();
        String str2 = this.IconCompatParcelizer;
        if (str2 == null) {
            int i2 = MediaDescriptionCompat + 95;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else {
            iHashCode = str2.hashCode();
        }
        int i4 = ((iHashCode2 + iM) * 31) + iHashCode;
        int i5 = MediaDescriptionCompat + 3;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return i4;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 75;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = m1$$ExternalSyntheticOutline0.m("Error(url=", this.write, this.read, ", code=", ", origin=");
        sbM.append(this.serializer);
        sbM.append(", description=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaDescriptionCompat + 19;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof r8lambdaC88K0nJTd0ZtnQMFV8dTGzTF_U) {
            r8lambdaC88K0nJTd0ZtnQMFV8dTGzTF_U r8lambdac88k0njtd0ztnqmfv8dtgztf_u = (r8lambdaC88K0nJTd0ZtnQMFV8dTGzTF_U) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, r8lambdac88k0njtd0ztnqmfv8dtgztf_u.read}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (this.write != r8lambdac88k0njtd0ztnqmfv8dtgztf_u.write) {
                int i2 = RemoteActionCompatParcelizer;
                int i3 = i2 + 31;
                MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                int i5 = i2 + 81;
                MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    return false;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this.serializer != r8lambdac88k0njtd0ztnqmfv8dtgztf_u.serializer) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, r8lambdac88k0njtd0ztnqmfv8dtgztf_u.IconCompatParcelizer}, getCieXyz.write())).booleanValue();
        }
        int i6 = RemoteActionCompatParcelizer + 27;
        MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
