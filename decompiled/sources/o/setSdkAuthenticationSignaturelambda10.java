package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class setSdkAuthenticationSignaturelambda10 {
    private static int read = 1;
    private static int serializer;
    public final String IconCompatParcelizer;
    public final long RemoteActionCompatParcelizer;
    public final AppCompatTextHelper1 write;

    public setSdkAuthenticationSignaturelambda10(AppCompatTextHelper1 appCompatTextHelper1, String str, long j) {
        str.getClass();
        this.write = appCompatTextHelper1;
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = j;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 111;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Long.hashCode(this.RemoteActionCompatParcelizer) + af$$ExternalSyntheticOutline0.m(this.write.hashCode() * 31, 31, this.IconCompatParcelizer);
        int i4 = read + 121;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("TwoFaTrigger(status=");
        sb.append(this.write);
        sb.append(", flowId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", expiresAt=");
        String strM = c8$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, ")", sb);
        int i2 = serializer + 33;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return strM;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 79;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setSdkAuthenticationSignaturelambda10)) {
            return false;
        }
        setSdkAuthenticationSignaturelambda10 setsdkauthenticationsignaturelambda10 = (setSdkAuthenticationSignaturelambda10) obj;
        if (!this.write.equals(setsdkauthenticationsignaturelambda10.write)) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, setsdkauthenticationsignaturelambda10.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return this.RemoteActionCompatParcelizer == setsdkauthenticationsignaturelambda10.RemoteActionCompatParcelizer;
        }
        int i4 = serializer + 39;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
