package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class accessnotifyInvalidation {
    private static int MediaSessionCompatQueueItem = 1;
    private static int read;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String serializer;
    public final String write;

    public accessnotifyInvalidation(String str, String str2, String str3, String str4) {
        this.serializer = str;
        this.IconCompatParcelizer = str2;
        this.write = str3;
        this.RemoteActionCompatParcelizer = str4;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 123;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("FailureReasonsViewState(popupTitle=", this.serializer, ", popupDescription=", this.IconCompatParcelizer, ", btnText="), this.write, ", popupFailReasons=", this.RemoteActionCompatParcelizer, ")");
        int i4 = MediaSessionCompatQueueItem + 109;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 85 / 0;
        }
        return strM;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 85;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 31, 31, this.IconCompatParcelizer), 31, this.write);
        int i4 = MediaSessionCompatQueueItem + 25;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        r0 = 2 % 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if ((r5 instanceof o.accessnotifyInvalidation) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        r5 = (o.accessnotifyInvalidation) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r4.serializer.equals(r5.serializer) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (r4.IconCompatParcelizer.equals(r5.IconCompatParcelizer) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r4.write.equals(r5.write) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r4.RemoteActionCompatParcelizer.equals(r5.RemoteActionCompatParcelizer) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r4 == r5) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r4 == r5) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r1 = r1 + 5;
        o.accessnotifyInvalidation.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if ((r1 % 2) == 0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.accessnotifyInvalidation.MediaSessionCompatQueueItem
            int r2 = r1 + 59
            int r3 = r2 % 128
            o.accessnotifyInvalidation.read = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 == 0) goto L15
            r2 = 57
            int r2 = r2 / r3
            if (r4 != r5) goto L23
            goto L17
        L15:
            if (r4 != r5) goto L23
        L17:
            int r1 = r1 + 5
            int r5 = r1 % 128
            o.accessnotifyInvalidation.read = r5
            int r1 = r1 % r0
            if (r1 == 0) goto L55
            int r0 = r0 % 4
            goto L55
        L23:
            boolean r0 = r5 instanceof o.accessnotifyInvalidation
            if (r0 != 0) goto L28
            goto L57
        L28:
            o.accessnotifyInvalidation r5 = (o.accessnotifyInvalidation) r5
            java.lang.String r0 = r4.serializer
            java.lang.String r1 = r5.serializer
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L35
            goto L57
        L35:
            java.lang.String r0 = r4.IconCompatParcelizer
            java.lang.String r1 = r5.IconCompatParcelizer
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L40
            goto L57
        L40:
            java.lang.String r0 = r4.write
            java.lang.String r1 = r5.write
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4b
            goto L57
        L4b:
            java.lang.String r0 = r4.RemoteActionCompatParcelizer
            java.lang.String r5 = r5.RemoteActionCompatParcelizer
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L57
        L55:
            r5 = 1
            return r5
        L57:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.accessnotifyInvalidation.equals(java.lang.Object):boolean");
    }
}
