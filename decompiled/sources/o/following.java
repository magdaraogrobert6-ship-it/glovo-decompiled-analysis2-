package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class following {
    public static final /* synthetic */ int IconCompatParcelizer = 0;
    public final long MediaBrowserCompatMediaItem;
    public final String MediaMetadataCompat;
    public final getInstance RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final long write;

    public final int hashCode() {
        String str = this.read;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = this.RatingCompat.hashCode();
        String str2 = this.serializer;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.MediaMetadataCompat;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        long j = this.write;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.MediaBrowserCompatMediaItem;
        int i2 = (int) ((j2 >>> 32) ^ j2);
        String str4 = this.RemoteActionCompatParcelizer;
        return ((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ (str4 != null ? str4.hashCode() : 0);
    }

    static {
        preceding precedingVar = new preceding();
        precedingVar.MediaMetadataCompat = 0L;
        precedingVar.MediaDescriptionCompat = (byte) (precedingVar.MediaDescriptionCompat | 2);
        precedingVar.RemoteActionCompatParcelizer(getInstance.ATTEMPT_MIGRATION);
        precedingVar.read = 0L;
        precedingVar.MediaDescriptionCompat = (byte) (precedingVar.MediaDescriptionCompat | 1);
        precedingVar.read();
    }

    public final preceding serializer() {
        preceding precedingVar = new preceding();
        precedingVar.write = this.read;
        precedingVar.MediaBrowserCompatMediaItem = this.RatingCompat;
        precedingVar.serializer = this.serializer;
        precedingVar.IconCompatParcelizer = this.MediaMetadataCompat;
        precedingVar.read = this.write;
        precedingVar.MediaMetadataCompat = this.MediaBrowserCompatMediaItem;
        precedingVar.RemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer;
        precedingVar.MediaDescriptionCompat = (byte) 3;
        return precedingVar;
    }

    public following(String str, getInstance getinstance, String str2, String str3, long j, long j2, String str4) {
        this.read = str;
        this.RatingCompat = getinstance;
        this.serializer = str2;
        this.MediaMetadataCompat = str3;
        this.write = j;
        this.MediaBrowserCompatMediaItem = j2;
        this.RemoteActionCompatParcelizer = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof following)) {
            return false;
        }
        following followingVar = (following) obj;
        String str = followingVar.read;
        String str2 = this.read;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.RatingCompat.equals(followingVar.RatingCompat)) {
            return false;
        }
        String str3 = followingVar.serializer;
        String str4 = this.serializer;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = followingVar.MediaMetadataCompat;
        String str6 = this.MediaMetadataCompat;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        if (this.write != followingVar.write || this.MediaBrowserCompatMediaItem != followingVar.MediaBrowserCompatMediaItem) {
            return false;
        }
        String str7 = followingVar.RemoteActionCompatParcelizer;
        String str8 = this.RemoteActionCompatParcelizer;
        if (str8 == null) {
            if (str7 != null) {
                return false;
            }
        } else if (!str8.equals(str7)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.read);
        sb.append(", registrationStatus=");
        sb.append(this.RatingCompat);
        sb.append(", authToken=");
        sb.append(this.serializer);
        sb.append(", refreshToken=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", expiresInSecs=");
        sb.append(this.write);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", fisError=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.RemoteActionCompatParcelizer, "}");
    }
}
