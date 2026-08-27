package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class NullRequestDataException {
    private static int MediaMetadataCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public final String IconCompatParcelizer;
    public final boolean read;
    public final int serializer;
    public final String write;

    public NullRequestDataException(int i, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.write = str;
        this.IconCompatParcelizer = str2;
        this.read = z;
        this.serializer = i;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 115;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.serializer) + d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.write.hashCode() * 31, 31, this.IconCompatParcelizer), 31, this.read);
        int i4 = MediaMetadataCompat + 75;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 43;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("PasswordRule(pattern=", this.write, ", text=", this.IconCompatParcelizer, ", isCompleted=");
        sbM.append(this.read);
        sbM.append(", order=");
        sbM.append(this.serializer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaMetadataCompat + 5;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat;
        int i3 = i2 + 1;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 15;
            MediaMetadataCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof NullRequestDataException)) {
            int i8 = i2 + 89;
            RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        NullRequestDataException nullRequestDataException = (NullRequestDataException) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, nullRequestDataException.write}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, nullRequestDataException.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            int i10 = MediaMetadataCompat + 53;
            RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return false;
        }
        if (this.read == nullRequestDataException.read) {
            return this.serializer == nullRequestDataException.serializer;
        }
        int i12 = RemoteActionCompatParcelizer + 115;
        MediaMetadataCompat = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i13 = i12 % 2;
        return false;
    }
}
