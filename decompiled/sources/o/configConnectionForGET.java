package o;

import bo.app.af$$ExternalSyntheticOutline1;

/* JADX INFO: loaded from: classes3.dex */
public final class configConnectionForGET {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final boolean RemoteActionCompatParcelizer;
    public final String serializer;

    public configConnectionForGET(String str, boolean z) {
        str.getClass();
        this.serializer = str;
        this.RemoteActionCompatParcelizer = z;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 55;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = Boolean.hashCode(this.RemoteActionCompatParcelizer) - af$$ExternalSyntheticOutline1.m(0.8f, this.serializer.hashCode() / 39, 48);
        } else {
            iHashCode = Boolean.hashCode(this.RemoteActionCompatParcelizer) + af$$ExternalSyntheticOutline1.m(0.8f, this.serializer.hashCode() * 31, 31);
        }
        int i3 = IconCompatParcelizer + 47;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "SliderState(text=" + this.serializer + ", confirmThreshold=0.8, isLoading=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = write + 53;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 67;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this != obj) {
            if (!(obj instanceof configConnectionForGET)) {
                return false;
            }
            configConnectionForGET configconnectionforget = (configConnectionForGET) obj;
            Object[] objArr = {this.serializer, configconnectionforget.serializer};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                if (Float.compare(0.8f, 0.8f) != 0 || this.RemoteActionCompatParcelizer != configconnectionforget.RemoteActionCompatParcelizer) {
                    return false;
                }
            } else {
                int i4 = IconCompatParcelizer + 53;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
        }
        int i6 = write + 109;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return true;
    }
}
