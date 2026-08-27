package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getDefaultPaddingXSAIIZE {
    private static int MediaDescriptionCompat = 1;
    private static int serializer;
    public final String IconCompatParcelizer;
    public final from RemoteActionCompatParcelizer;
    public final String read;
    public final getBullet write;

    public final getBullet IconCompatParcelizer() {
        getBullet getbullet;
        int i = 2 % 2;
        int i2 = serializer + 103;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaDescriptionCompat = i3;
        if (i2 % 2 == 0) {
            getbullet = this.write;
            int i4 = 8 / 0;
        } else {
            getbullet = this.write;
        }
        int i5 = i3 + 65;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return getbullet;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 113;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        String str = this.read;
        int i5 = i3 + 49;
        MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final from serializer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 67;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.RemoteActionCompatParcelizer;
        }
        throw null;
    }

    public getDefaultPaddingXSAIIZE(String str, String str2, from fromVar, getBullet getbullet) {
        str.getClass();
        str2.getClass();
        fromVar.getClass();
        this.IconCompatParcelizer = str;
        this.read = str2;
        this.RemoteActionCompatParcelizer = fromVar;
        this.write = getbullet;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer.hashCode() * 31, 31, this.read);
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
        getBullet getbullet = this.write;
        if (getbullet == null) {
            int i2 = MediaDescriptionCompat + 119;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = getbullet.hashCode();
        }
        int i3 = ((iHashCode2 + iM) * 31) + iHashCode;
        int i4 = MediaDescriptionCompat + 89;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return i3;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 101;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("AvailableRelease(publishedAt=", this.IconCompatParcelizer, ", releaseId=", this.read, ", role=");
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(", rollout=");
        sbM.append(this.write);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaDescriptionCompat + 21;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 89;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaDescriptionCompat = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 21;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i5 % 2 == 0;
        }
        if (!(obj instanceof getDefaultPaddingXSAIIZE)) {
            return false;
        }
        getDefaultPaddingXSAIIZE getdefaultpaddingxsaiize = (getDefaultPaddingXSAIIZE) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, getdefaultpaddingxsaiize.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, getdefaultpaddingxsaiize.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.RemoteActionCompatParcelizer != getdefaultpaddingxsaiize.RemoteActionCompatParcelizer) {
            int i6 = MediaDescriptionCompat + 7;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, getdefaultpaddingxsaiize.write}, getCieXyz.write())).booleanValue();
    }
}
