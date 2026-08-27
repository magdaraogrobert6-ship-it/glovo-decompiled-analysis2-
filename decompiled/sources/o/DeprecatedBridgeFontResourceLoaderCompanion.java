package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class DeprecatedBridgeFontResourceLoaderCompanion {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaDescriptionCompat = 1;
    public final int IconCompatParcelizer;
    public final Integer MediaMetadataCompat;
    public final Integer MediaSessionCompatQueueItem;
    public final String RemoteActionCompatParcelizer;
    public final Integer read;
    public final boolean serializer;
    public final int write;

    public final int IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem;
        int i3 = i2 + 53;
        MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.write;
        int i6 = i2 + 125;
        MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            int i7 = 86 / 0;
        }
        return i5;
    }

    public final boolean RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 73;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaBrowserCompatMediaItem = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        boolean z = this.serializer;
        int i4 = i3 + 93;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public DeprecatedBridgeFontResourceLoaderCompanion(boolean z, String str, int i, int i2, Integer num, Integer num2, Integer num3) {
        this.serializer = z;
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = i;
        this.write = i2;
        this.MediaMetadataCompat = num;
        this.read = num2;
        this.MediaSessionCompatQueueItem = num3;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("ManifestConfig(cacheEnabled=");
        sb.append(this.serializer);
        sb.append(", minNativeVersion=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", manifestSchemaVersion=");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.IconCompatParcelizer, this.write, ", pollIntervalSeconds=", ", staleAfterSeconds=", sb);
        sb.append(this.MediaMetadataCompat);
        sb.append(", giveUpAfterSeconds=");
        sb.append(this.read);
        sb.append(", staleCapPercentage=");
        String strWrite = IconCompatParcelizer.write(this.MediaSessionCompatQueueItem, ")", sb);
        int i2 = MediaDescriptionCompat + 33;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return strWrite;
        }
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 37;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode3 = Boolean.hashCode(this.serializer);
        String str = this.RemoteActionCompatParcelizer;
        int iM = af$$ExternalSyntheticOutline0.m(this.write, af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, ((iHashCode3 * 31) + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        Integer num = this.MediaMetadataCompat;
        if (num == null) {
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
            int i4 = MediaDescriptionCompat + 47;
            MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        Integer num2 = this.read;
        if (num2 == null) {
            int i6 = MediaDescriptionCompat + 63;
            MediaBrowserCompatMediaItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = num2.hashCode();
        }
        Integer num3 = this.MediaSessionCompatQueueItem;
        return ((((iM + iHashCode) * 31) + iHashCode2) * 31) + (num3 != null ? num3.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = MediaBrowserCompatMediaItem + 95;
            MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof DeprecatedBridgeFontResourceLoaderCompanion)) {
            int i4 = MediaDescriptionCompat + 37;
            MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        DeprecatedBridgeFontResourceLoaderCompanion deprecatedBridgeFontResourceLoaderCompanion = (DeprecatedBridgeFontResourceLoaderCompanion) obj;
        if (this.serializer != deprecatedBridgeFontResourceLoaderCompanion.serializer) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, deprecatedBridgeFontResourceLoaderCompanion.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.IconCompatParcelizer != deprecatedBridgeFontResourceLoaderCompanion.IconCompatParcelizer) {
            int i6 = MediaDescriptionCompat + 105;
            MediaBrowserCompatMediaItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this.write != deprecatedBridgeFontResourceLoaderCompanion.write) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaMetadataCompat, deprecatedBridgeFontResourceLoaderCompanion.MediaMetadataCompat}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, deprecatedBridgeFontResourceLoaderCompanion.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem, deprecatedBridgeFontResourceLoaderCompanion.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i7 = MediaDescriptionCompat + 125;
        MediaBrowserCompatMediaItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
