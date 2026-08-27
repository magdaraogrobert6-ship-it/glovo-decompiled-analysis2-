package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class setOnRefreshListener {
    private static int read = 1;
    private static int write;
    public final int RemoteActionCompatParcelizer;
    public final int serializer;

    public setOnRefreshListener(int i, int i2) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = i2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 19;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = af$$ExternalSyntheticOutline0.m(this.serializer, this.RemoteActionCompatParcelizer, "PageIndicatorViewState(pageCount=", ", currentIndex=", ")");
        int i4 = read + 123;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 13;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.RemoteActionCompatParcelizer) + (Integer.hashCode(this.serializer) * 31);
        int i4 = write + 83;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 63;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setOnRefreshListener)) {
            return false;
        }
        setOnRefreshListener setonrefreshlistener = (setOnRefreshListener) obj;
        if (this.serializer == setonrefreshlistener.serializer) {
            if (this.RemoteActionCompatParcelizer != setonrefreshlistener.RemoteActionCompatParcelizer) {
                return false;
            }
            int i5 = i3 + 61;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 34 / 0;
            }
            return true;
        }
        int i7 = i3 + 5;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i7 % 2 == 0;
    }
}
