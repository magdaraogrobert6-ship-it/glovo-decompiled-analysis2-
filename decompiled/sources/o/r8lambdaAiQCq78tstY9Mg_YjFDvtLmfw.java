package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaAiQCq78tstY9Mg_YjFDvtLmfw {
    private static int IconCompatParcelizer = 0;
    private static int MediaDescriptionCompat = 1;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public r8lambdaAiQCq78tstY9Mg_YjFDvtLmfw(String str, String str2, String str3, String str4) {
        d$$ExternalSyntheticOutline0.m(str, str2, str3, str4);
        this.serializer = str;
        this.write = str2;
        this.read = str3;
        this.RemoteActionCompatParcelizer = str4;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 43;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("Link(text=", this.serializer, ", url=", this.write, ", packageName="), this.read, ", errorMessage=", this.RemoteActionCompatParcelizer, ")");
        }
        ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("Link(text=", this.serializer, ", url=", this.write, ", packageName="), this.read, ", errorMessage=", this.RemoteActionCompatParcelizer, ")");
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 35;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 31, 31, this.write), 31, this.read);
        int i4 = IconCompatParcelizer + 101;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 77;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof r8lambdaAiQCq78tstY9Mg_YjFDvtLmfw) {
            r8lambdaAiQCq78tstY9Mg_YjFDvtLmfw r8lambdaaiqcq78tsty9mg_yjfdvtlmfw = (r8lambdaAiQCq78tstY9Mg_YjFDvtLmfw) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, r8lambdaaiqcq78tsty9mg_yjfdvtlmfw.serializer}, getCieXyz.write())).booleanValue()) {
                int i5 = MediaDescriptionCompat + 3;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, r8lambdaaiqcq78tsty9mg_yjfdvtlmfw.write}, getCieXyz.write())).booleanValue()) {
                int i7 = MediaDescriptionCompat + 125;
                IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, r8lambdaaiqcq78tsty9mg_yjfdvtlmfw.read}, getCieXyz.write())).booleanValue()) {
                int i9 = MediaDescriptionCompat + 1;
                IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, r8lambdaaiqcq78tsty9mg_yjfdvtlmfw.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue();
        }
        int i11 = i3 + 29;
        MediaDescriptionCompat = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i11 % 2 == 0;
    }
}
