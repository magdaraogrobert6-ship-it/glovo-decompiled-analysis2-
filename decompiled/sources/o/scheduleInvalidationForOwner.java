package o;

import android.util.Base64;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class scheduleInvalidationForOwner {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final String MediaMetadataCompat;
    public final String RemoteActionCompatParcelizer;
    public final List read;
    public final String serializer;
    public final String write;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.RemoteActionCompatParcelizer + ", mProviderPackage: " + this.write + ", mQuery: " + this.IconCompatParcelizer + ", mSystemFont: " + this.MediaBrowserCompatMediaItem + ", mVariationSettings: " + this.MediaMetadataCompat + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.read;
            if (i >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i++;
        }
    }

    public scheduleInvalidationForOwner(String str, String str2, String str3, String str4, String str5, List list) {
        str.getClass();
        this.RemoteActionCompatParcelizer = str;
        str2.getClass();
        this.write = str2;
        this.IconCompatParcelizer = str3;
        list.getClass();
        this.read = list;
        this.MediaBrowserCompatMediaItem = str4;
        this.MediaMetadataCompat = str5;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        sb.append("-");
        sb.append(str3);
        this.serializer = ff$$ExternalSyntheticOutline0.m(sb, "-", str4, "-", str5);
    }
}
