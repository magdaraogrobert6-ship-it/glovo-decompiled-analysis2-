package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class getDefaultSizeXSAIIZE {
    private static int MediaDescriptionCompat = 1;
    private static int read;
    public final String IconCompatParcelizer;
    public final File RemoteActionCompatParcelizer;
    public final String serializer;
    public final String write;

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 59;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.serializer;
        int i4 = i3 + 61;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 6 / 0;
        }
        return str;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = read + 117;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaDescriptionCompat = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.write;
        int i4 = i3 + 117;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final File write() {
        int i = 2 % 2;
        int i2 = read + 73;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.RemoteActionCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public getDefaultSizeXSAIIZE(File file, String str, String str2, String str3) {
        str3.getClass();
        this.RemoteActionCompatParcelizer = file;
        this.serializer = str;
        this.IconCompatParcelizer = str2;
        this.write = str3;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int iHashCode = 1;
        int i2 = read + 1;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer.hashCode() * 31, 31, this.serializer);
        String str = this.IconCompatParcelizer;
        if (str == null) {
            int i4 = MediaDescriptionCompat + 95;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                iHashCode = 0;
            }
        } else {
            iHashCode = str.hashCode();
        }
        int iHashCode2 = this.write.hashCode() + ((iM + iHashCode) * 31);
        int i5 = MediaDescriptionCompat + 111;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return iHashCode2;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("CachedChatAssetResource(file=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", mimeType=");
        sb.append(this.serializer);
        sb.append(", encoding=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.IconCompatParcelizer, ", sha256=", this.write, ")");
        int i2 = read + 99;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 83;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getDefaultSizeXSAIIZE)) {
            return false;
        }
        getDefaultSizeXSAIIZE getdefaultsizexsaiize = (getDefaultSizeXSAIIZE) obj;
        if (!this.RemoteActionCompatParcelizer.equals(getdefaultsizexsaiize.RemoteActionCompatParcelizer)) {
            return false;
        }
        if (!this.serializer.equals(getdefaultsizexsaiize.serializer)) {
            int i3 = read + 11;
            MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, getdefaultsizexsaiize.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, getdefaultsizexsaiize.write}, getCieXyz.write())).booleanValue();
        }
        int i5 = MediaDescriptionCompat + 75;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
