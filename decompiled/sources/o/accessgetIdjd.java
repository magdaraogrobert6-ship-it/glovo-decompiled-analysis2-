package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetIdjd extends findMergingSemanticsParent {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaMetadataCompat = 1;
    public final String IconCompatParcelizer;
    public final String MediaDescriptionCompat;
    public final boolean MediaSessionCompatQueueItem;
    public final SemanticsListener RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public accessgetIdjd(String str, String str2, String str3, String str4, String str5, boolean z, SemanticsListener semanticsListener) {
        af$$ExternalSyntheticOutline0.m3978m(str2, str4, str5);
        this.write = str;
        this.MediaDescriptionCompat = str2;
        this.read = str3;
        this.IconCompatParcelizer = str4;
        this.serializer = str5;
        this.MediaSessionCompatQueueItem = z;
        this.RemoteActionCompatParcelizer = semanticsListener;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 39;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Available(iconUrl=", this.write, ", title=", this.MediaDescriptionCompat, ", body=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.read, ", ctaButtonText=", this.IconCompatParcelizer, ", ctaButtonUrl=");
        SweepGradientShader9KIMszodefault.IconCompatParcelizer(this.serializer, ", isCollapsed=", ", analytics=", sbM, this.MediaSessionCompatQueueItem);
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaMetadataCompat + 63;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 23 / 0;
        }
        return string;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.write;
        if (str == null) {
            int i2 = MediaMetadataCompat + 47;
            MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iM = af$$ExternalSyntheticOutline0.m(iHashCode * 31, 31, this.MediaDescriptionCompat);
        String str2 = this.read;
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode() + d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m((iM + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.IconCompatParcelizer), 31, this.serializer), 31, this.MediaSessionCompatQueueItem);
        int i4 = MediaBrowserCompatMediaItem + 53;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f6, code lost:
    
        if (r19.RemoteActionCompatParcelizer.equals(r1.RemoteActionCompatParcelizer) == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.accessgetIdjd.equals(java.lang.Object):boolean");
    }
}
