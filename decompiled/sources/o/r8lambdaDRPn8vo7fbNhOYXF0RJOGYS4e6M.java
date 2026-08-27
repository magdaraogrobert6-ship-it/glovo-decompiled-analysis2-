package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaDRPn8vo7fbNhOYXF0RJOGYS4e6M implements r8lambda55q2_ohlbc4LGzu4K9wd7pcC14s {
    private static int IconCompatParcelizer = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    public final String RemoteActionCompatParcelizer;
    public final int read;
    public final r8lambdaAiQCq78tstY9Mg_YjFDvtLmfw serializer;
    public final String write;

    public r8lambdaDRPn8vo7fbNhOYXF0RJOGYS4e6M(String str, String str2, int i, r8lambdaAiQCq78tstY9Mg_YjFDvtLmfw r8lambdaaiqcq78tsty9mg_yjfdvtlmfw) {
        str.getClass();
        this.write = str;
        this.RemoteActionCompatParcelizer = str2;
        this.read = i;
        this.serializer = r8lambdaaiqcq78tsty9mg_yjfdvtlmfw;
    }

    public final int hashCode() {
        int iHashCode;
        String str;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 125;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iHashCode3 = 0;
        if (i2 % 2 == 0) {
            iHashCode = this.write.hashCode();
            str = this.RemoteActionCompatParcelizer;
            iHashCode2 = 1;
            if (str != null) {
                iHashCode3 = 1;
                iHashCode2 = iHashCode3;
                iHashCode3 = str.hashCode();
            }
        } else {
            iHashCode = this.write.hashCode();
            str = this.RemoteActionCompatParcelizer;
            if (str == null) {
                iHashCode2 = 0;
            } else {
                iHashCode2 = iHashCode3;
                iHashCode3 = str.hashCode();
            }
        }
        int iM = af$$ExternalSyntheticOutline0.m(this.read, ((iHashCode * 31) + iHashCode3) * 31, 31);
        r8lambdaAiQCq78tstY9Mg_YjFDvtLmfw r8lambdaaiqcq78tsty9mg_yjfdvtlmfw = this.serializer;
        Object obj = null;
        if (r8lambdaaiqcq78tsty9mg_yjfdvtlmfw == null) {
            int i3 = IconCompatParcelizer + 105;
            MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            iHashCode2 = r8lambdaaiqcq78tsty9mg_yjfdvtlmfw.hashCode();
        }
        int i4 = iM + iHashCode2;
        int i5 = MediaBrowserCompatMediaItem + 123;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 31;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("InstructionV2(title=", this.write, ", description=", this.RemoteActionCompatParcelizer, ", icon=");
        sbM.append(this.read);
        sbM.append(", link=");
        sbM.append(this.serializer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = IconCompatParcelizer + 119;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 71;
            MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof r8lambdaDRPn8vo7fbNhOYXF0RJOGYS4e6M)) {
            return false;
        }
        r8lambdaDRPn8vo7fbNhOYXF0RJOGYS4e6M r8lambdadrpn8vo7fbnhoyxf0rjogys4e6m = (r8lambdaDRPn8vo7fbNhOYXF0RJOGYS4e6M) obj;
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, r8lambdadrpn8vo7fbnhoyxf0rjogys4e6m.write}, getCieXyz.write())).booleanValue())) {
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, r8lambdadrpn8vo7fbnhoyxf0rjogys4e6m.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue())) {
                if (this.read != r8lambdadrpn8vo7fbnhoyxf0rjogys4e6m.read) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, r8lambdadrpn8vo7fbnhoyxf0rjogys4e6m.serializer}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i4 = MediaBrowserCompatMediaItem + 45;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i4 % 2 != 0;
            }
            int i5 = MediaBrowserCompatMediaItem + 93;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i5 % 2 != 0;
        }
        int i6 = IconCompatParcelizer + 33;
        MediaBrowserCompatMediaItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
