package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdavqK0yH3ghr0voBP7IVvbATocpo extends r8lambdav4khHexYF7B8JZECOja6EPumcY4 {
    private static int MediaDescriptionCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final String IconCompatParcelizer;
    public final r8lambdav9lEwuigriKPLoepmU9DzDAsGns MediaBrowserCompatMediaItem;
    public final String MediaMetadataCompat;
    public final boolean RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final r8lambdaltZ1uNITaEov9GRvWdNWxxSy0k read;
    public final String serializer;
    public final String write;

    public r8lambdavqK0yH3ghr0voBP7IVvbATocpo(String str, String str2, String str3, String str4, boolean z, r8lambdaltZ1uNITaEov9GRvWdNWxxSy0k r8lambdaltz1unitaeov9grvwdnwxxsy0k, String str5, r8lambdav9lEwuigriKPLoepmU9DzDAsGns r8lambdav9lewuigrikploepmu9dzdasgns) {
        str.getClass();
        str5.getClass();
        r8lambdav9lewuigrikploepmu9dzdasgns.getClass();
        this.IconCompatParcelizer = str;
        this.serializer = str2;
        this.RemoteActionCompatParcelizer = str3;
        this.MediaMetadataCompat = str4;
        this.RatingCompat = z;
        this.read = r8lambdaltz1unitaeov9grvwdnwxxsy0k;
        this.write = str5;
        this.MediaBrowserCompatMediaItem = r8lambdav9lewuigrikploepmu9dzdasgns;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 43;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("DynamicMenuItemUiState(label=", this.IconCompatParcelizer, ", iconUrl=", this.serializer, ", newTag=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.RemoteActionCompatParcelizer, ", unreadCount=", this.MediaMetadataCompat, ", showExternalLinkIcon=");
        sbM.append(this.RatingCompat);
        sbM.append(", action=");
        sbM.append(this.read);
        sbM.append(", analyticsName=");
        sbM.append(this.write);
        sbM.append(", style=");
        sbM.append(this.MediaBrowserCompatMediaItem);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaSessionCompatQueueItem + 33;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return string;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0031 A[PHI: r1 r3 r4
  0x0031: PHI (r1v22 int) = (r1v5 int), (r1v24 int) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0031: PHI (r3v6 java.lang.String) = (r3v0 java.lang.String), (r3v8 java.lang.String) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0031: PHI (r4v5 int) = (r4v0 int), (r4v6 int) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0026 A[PHI: r1 r4
  0x0026: PHI (r1v6 int) = (r1v5 int), (r1v24 int) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0026: PHI (r4v1 int) = (r4v0 int), (r4v6 int) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iHashCode;
        String str;
        int iHashCode2;
        int iHashCode3;
        int i;
        int i2 = 2 % 2;
        int i3 = MediaDescriptionCompat + 13;
        MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iHashCode4 = 0;
        if (i3 % 2 != 0) {
            iHashCode = this.IconCompatParcelizer.hashCode();
            str = this.serializer;
            iHashCode2 = 1;
            if (str == null) {
                int i4 = MediaDescriptionCompat + 97;
                MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                iHashCode3 = 0;
            } else {
                iHashCode3 = str.hashCode();
                int i6 = MediaDescriptionCompat + 55;
                MediaSessionCompatQueueItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
            }
        } else {
            iHashCode = this.IconCompatParcelizer.hashCode();
            str = this.serializer;
            iHashCode2 = 0;
            if (str == null) {
                int i8 = MediaDescriptionCompat + 97;
                MediaSessionCompatQueueItem = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                iHashCode3 = 0;
            } else {
                iHashCode3 = str.hashCode();
                int i10 = MediaDescriptionCompat + 55;
                MediaSessionCompatQueueItem = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i11 = i10 % 2;
            }
        }
        String str2 = this.RemoteActionCompatParcelizer;
        if (str2 == null) {
            i = MediaSessionCompatQueueItem + 23;
            MediaDescriptionCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        } else {
            iHashCode4 = str2.hashCode();
            i = MediaDescriptionCompat + 53;
            MediaSessionCompatQueueItem = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        int i12 = i % 2;
        String str3 = this.MediaMetadataCompat;
        if (str3 != null) {
            iHashCode2 = str3.hashCode();
        }
        return this.MediaBrowserCompatMediaItem.hashCode() + af$$ExternalSyntheticOutline0.m((this.read.hashCode() + d$$ExternalSyntheticOutline0.m(((((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode2) * 31, 31, this.RatingCompat)) * 31, 31, this.write);
    }

    public final boolean equals(Object obj) {
        int i;
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambdavqK0yH3ghr0voBP7IVvbATocpo)) {
            return false;
        }
        r8lambdavqK0yH3ghr0voBP7IVvbATocpo r8lambdavqk0yh3ghr0vobp7ivvbatocpo = (r8lambdavqK0yH3ghr0voBP7IVvbATocpo) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, r8lambdavqk0yh3ghr0vobp7ivvbatocpo.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, r8lambdavqk0yh3ghr0vobp7ivvbatocpo.serializer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, r8lambdavqk0yh3ghr0vobp7ivvbatocpo.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaMetadataCompat, r8lambdavqk0yh3ghr0vobp7ivvbatocpo.MediaMetadataCompat}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (this.RatingCompat == r8lambdavqk0yh3ghr0vobp7ivvbatocpo.RatingCompat) {
                if (!this.read.equals(r8lambdavqk0yh3ghr0vobp7ivvbatocpo.read)) {
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, r8lambdavqk0yh3ghr0vobp7ivvbatocpo.write}, getCieXyz.write())).booleanValue() && this.MediaBrowserCompatMediaItem == r8lambdavqk0yh3ghr0vobp7ivvbatocpo.MediaBrowserCompatMediaItem;
            }
            i = MediaDescriptionCompat + 55;
            MediaSessionCompatQueueItem = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        } else {
            i = MediaSessionCompatQueueItem + 121;
            MediaDescriptionCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        int i3 = i % 2;
        return false;
    }
}
