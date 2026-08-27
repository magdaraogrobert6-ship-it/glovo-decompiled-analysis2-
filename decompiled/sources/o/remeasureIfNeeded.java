package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class remeasureIfNeeded extends getLookaheadPassDelegate {
    public final String IconCompatParcelizer;
    public final String MediaMetadataCompat;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        int iHashCode2 = this.MediaMetadataCompat.hashCode();
        String str = this.RemoteActionCompatParcelizer;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.serializer;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.IconCompatParcelizer;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.write;
        return ((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * (-721379959)) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ (str4 != null ? str4.hashCode() : 0);
    }

    public remeasureIfNeeded(String str, String str2, String str3, String str4, String str5, String str6) {
        this.read = str;
        this.MediaMetadataCompat = str2;
        this.RemoteActionCompatParcelizer = str3;
        this.serializer = str4;
        this.IconCompatParcelizer = str5;
        this.write = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getLookaheadPassDelegate)) {
            return false;
        }
        remeasureIfNeeded remeasureifneeded = (remeasureIfNeeded) ((getLookaheadPassDelegate) obj);
        if (!this.read.equals(remeasureifneeded.read) || !this.MediaMetadataCompat.equals(remeasureifneeded.MediaMetadataCompat)) {
            return false;
        }
        String str = remeasureifneeded.RemoteActionCompatParcelizer;
        String str2 = this.RemoteActionCompatParcelizer;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        String str3 = remeasureifneeded.serializer;
        String str4 = this.serializer;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = remeasureifneeded.IconCompatParcelizer;
        String str6 = this.IconCompatParcelizer;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        String str7 = remeasureifneeded.write;
        String str8 = this.write;
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
        StringBuilder sb = new StringBuilder("Application{identifier=");
        sb.append(this.read);
        sb.append(", version=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", displayVersion=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", organization=null, installationUuid=");
        sb.append(this.serializer);
        sb.append(", developmentPlatform=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", developmentPlatformVersion=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.write, "}");
    }
}
