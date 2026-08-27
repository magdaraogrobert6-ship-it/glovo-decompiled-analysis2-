package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getSceneString extends getOptimizationLevel {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final Object read;

    public final Object MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = write + 17;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.read;
        }
        throw null;
    }

    public getSceneString(Object obj) {
        this.read = obj;
    }

    public final int hashCode() {
        int i = 2 % 2;
        Object obj = this.read;
        if (obj != null) {
            return obj.hashCode();
        }
        int i2 = RemoteActionCompatParcelizer + 51;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2 != 0 ? 1 : 0;
        int i5 = i3 + 71;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return i4;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 83;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return af$$ExternalSyntheticOutline0.m(this.read, "Data(value=", ")");
        }
        int i3 = 44 / 0;
        return af$$ExternalSyntheticOutline0.m(this.read, "Data(value=", ")");
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 101;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getSceneString)) {
            return false;
        }
        Object[] objArr = {this.read, ((getSceneString) obj).read};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i3 = RemoteActionCompatParcelizer + 57;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }
}
