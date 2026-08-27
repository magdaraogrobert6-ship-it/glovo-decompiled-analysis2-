package o;

/* JADX INFO: loaded from: classes3.dex */
public final class qc {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final long read;
    public final _get_messageWebView_lambda1 serializer;

    public final _get_messageWebView_lambda1 serializer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 111;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        _get_messageWebView_lambda1 _get_messagewebview_lambda1 = this.serializer;
        int i4 = i3 + 55;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return _get_messagewebview_lambda1;
    }

    public final long write() {
        int i = 2 % 2;
        int i2 = write + 39;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.read;
        }
        throw null;
    }

    public qc(long j, _get_messageWebView_lambda1 _get_messagewebview_lambda1) {
        this.read = j;
        this.serializer = _get_messagewebview_lambda1;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 17;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.serializer.hashCode() + (Long.hashCode(this.read) * 31);
        int i4 = write + 47;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 57;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 67;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return true;
        }
        if (obj instanceof qc) {
            qc qcVar = (qc) obj;
            if (this.read == qcVar.read) {
                if (this.serializer == qcVar.serializer) {
                    return true;
                }
                int i8 = i2 + 27;
                RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return false;
            }
        }
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "BlockedRequestInfo(initialTime=" + this.read + ", response=" + this.serializer + ")";
        int i2 = RemoteActionCompatParcelizer + 85;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
