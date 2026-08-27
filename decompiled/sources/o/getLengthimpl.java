package o;

import bo.app.af$$ExternalSyntheticOutline0;
import java.time.ZonedDateTime;

/* JADX INFO: loaded from: classes3.dex */
public final class getLengthimpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final ZonedDateTime IconCompatParcelizer;
    public final int read;
    public final boolean write;

    public getLengthimpl(boolean z, ZonedDateTime zonedDateTime, int i) {
        this.write = z;
        this.IconCompatParcelizer = zonedDateTime;
        this.read = i;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = serializer + 17;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int iHashCode = Boolean.hashCode(this.write);
        ZonedDateTime zonedDateTime = this.IconCompatParcelizer;
        if (zonedDateTime == null) {
            i = 0;
        } else {
            int iHashCode2 = zonedDateTime.hashCode();
            int i5 = RemoteActionCompatParcelizer + 19;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i = iHashCode2;
        }
        return Integer.hashCode(this.read) + (((iHashCode * 31) + i) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("CountdownState(showTimer=");
        sb.append(this.write);
        sb.append(", expirationTime=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", secondsToExpiry=");
        String strM = af$$ExternalSyntheticOutline0.m(this.read, ")", sb);
        int i2 = RemoteActionCompatParcelizer + 49;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return strM;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 11;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof getLengthimpl)) {
            return false;
        }
        getLengthimpl getlengthimpl = (getLengthimpl) obj;
        if (this.write == getlengthimpl.write) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, getlengthimpl.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (this.read == getlengthimpl.read) {
                return true;
            }
            int i3 = serializer + 99;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i3 % 2 != 0;
        }
        int i4 = serializer + 59;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
