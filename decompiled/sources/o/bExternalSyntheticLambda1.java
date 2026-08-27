package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class bExternalSyntheticLambda1 {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaMetadataCompat = 1;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final metaMarkUpdatedAndHasCallbacks read;
    public final boolean serializer;
    public final String write;

    public bExternalSyntheticLambda1(boolean z, String str, String str2, String str3, metaMarkUpdatedAndHasCallbacks metamarkupdatedandhascallbacks) {
        this.serializer = z;
        this.IconCompatParcelizer = str;
        this.write = str2;
        this.RemoteActionCompatParcelizer = str3;
        this.read = metamarkupdatedandhascallbacks;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int iHashCode = Boolean.hashCode(this.serializer);
        String str = this.IconCompatParcelizer;
        int iHashCode2 = 0;
        int iM = af$$ExternalSyntheticOutline0.m(((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31, 31, this.write);
        String str2 = this.RemoteActionCompatParcelizer;
        if (str2 == null) {
            int i2 = MediaMetadataCompat + 19;
            MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else {
            iHashCode2 = str2.hashCode();
        }
        int iHashCode3 = this.read.hashCode() + ((iM + iHashCode2) * 31);
        int i4 = MediaMetadataCompat + 49;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode3;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("CountryEnvViewEntity(isSelected=");
        sb.append(this.serializer);
        sb.append(", countryFlag=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", countryName=");
        c8$$ExternalSyntheticOutline0.m(sb, this.write, ", environment=", this.RemoteActionCompatParcelizer, ", countryConfig=");
        sb.append(this.read);
        sb.append(")");
        String string = sb.toString();
        int i2 = MediaMetadataCompat + 77;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2;
        int i3 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bExternalSyntheticLambda1)) {
            return false;
        }
        bExternalSyntheticLambda1 bexternalsyntheticlambda1 = (bExternalSyntheticLambda1) obj;
        if (this.serializer != bexternalsyntheticlambda1.serializer) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, bexternalsyntheticlambda1.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.write.equals(bexternalsyntheticlambda1.write)) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, bexternalsyntheticlambda1.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return this.read.equals(bexternalsyntheticlambda1.read);
            }
            i = MediaMetadataCompat + 23;
            i2 = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        } else {
            i = MediaMetadataCompat + 49;
            i2 = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        MediaBrowserCompatMediaItem = i2;
        int i4 = i % 2;
        return false;
    }
}
