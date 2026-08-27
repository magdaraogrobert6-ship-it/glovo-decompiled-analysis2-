package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getEmUIouoOA {
    private static int read = 1;
    private static int serializer;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String write;

    public final String toString() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 25;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 67;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return "ChatRegistrationData(userId=REDACTED, token=REDACTED, email=REDACTED)";
    }

    public getEmUIouoOA(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.write = str2;
        this.IconCompatParcelizer = str3;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 79;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer.hashCode() * 31, 31, this.write);
        String str = this.IconCompatParcelizer;
        if (str == null) {
            int i4 = serializer + 35;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return iM + iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 27;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getEmUIouoOA)) {
            int i5 = i3 + 61;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        getEmUIouoOA getemuiouooa = (getEmUIouoOA) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, getemuiouooa.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, getemuiouooa.write}, getCieXyz.write())).booleanValue())) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, getemuiouooa.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i7 = read + 9;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i7 % 2 != 0;
        }
        int i8 = read + 125;
        serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
