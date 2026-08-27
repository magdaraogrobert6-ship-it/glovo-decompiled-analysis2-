package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class TextLinkStylesSaverlambda1 {
    private static int MediaDescriptionCompat = 0;
    private static int MediaMetadataCompat = 1;
    public final String IconCompatParcelizer;
    public final long RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final long write;

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 85;
        MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.serializer;
        int i4 = i2 + 107;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String RemoteActionCompatParcelizer() {
        String str;
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 29;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaDescriptionCompat = i3;
        if (i2 % 2 != 0) {
            str = this.read;
            int i4 = 78 / 0;
        } else {
            str = this.read;
        }
        int i5 = i3 + 29;
        MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final long read() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 111;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.write;
        }
        throw null;
    }

    public TextLinkStylesSaverlambda1(long j, long j2, String str, String str2, String str3) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
        this.read = str;
        this.write = j;
        this.serializer = str2;
        this.IconCompatParcelizer = str3;
        this.RemoteActionCompatParcelizer = j2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 45;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Long.hashCode(this.RemoteActionCompatParcelizer) + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(this.read.hashCode() * 31, 31, this.write), 31, this.serializer), 31, this.IconCompatParcelizer);
        int i4 = MediaMetadataCompat + 37;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 45 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 93;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("AckParams(url=", this.read, this.write, ", deliveryId=");
        c8$$ExternalSyntheticOutline0.m(sbM, ", confirmationNumber=", this.serializer, ", trigger=", this.IconCompatParcelizer);
        sbM.append(", currentTimeMillis=");
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaMetadataCompat + 45;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = MediaDescriptionCompat + 119;
            MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 != 0;
        }
        if (obj instanceof TextLinkStylesSaverlambda1) {
            TextLinkStylesSaverlambda1 textLinkStylesSaverlambda1 = (TextLinkStylesSaverlambda1) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, textLinkStylesSaverlambda1.read}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (this.write != textLinkStylesSaverlambda1.write) {
                int i3 = MediaDescriptionCompat + 65;
                MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i3 % 2 == 0;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, textLinkStylesSaverlambda1.serializer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, textLinkStylesSaverlambda1.IconCompatParcelizer}, getCieXyz.write())).booleanValue() && this.RemoteActionCompatParcelizer == textLinkStylesSaverlambda1.RemoteActionCompatParcelizer;
        }
        int i4 = MediaMetadataCompat + 17;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
