package o;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class handleInternalBannerRefreshlambda1 {
    private static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final isEphemeralEventKey IconCompatParcelizer;
    public final Map RemoteActionCompatParcelizer;
    public final String read;
    public final Integer serializer;
    public final ExtensionWindowAreaStatusRequirements write;

    public handleInternalBannerRefreshlambda1(isEphemeralEventKey isephemeraleventkey, ExtensionWindowAreaStatusRequirements extensionWindowAreaStatusRequirements, Integer num, String str, Map map) {
        isephemeraleventkey.getClass();
        this.IconCompatParcelizer = isephemeraleventkey;
        this.write = extensionWindowAreaStatusRequirements;
        this.serializer = num;
        this.read = str;
        this.RemoteActionCompatParcelizer = map;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("StartWorkingParams(action=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", location=");
        sb.append(this.write);
        sb.append(", shiftId=");
        sb.append(this.serializer);
        sb.append(", opportunityId=");
        sb.append(this.read);
        sb.append(", components=");
        String strRemoteActionCompatParcelizer = SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(sb, this.RemoteActionCompatParcelizer, ")");
        int i2 = MediaSessionCompatQueueItem + 45;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 89 / 0;
        }
        return strRemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        int iHashCode;
        ExtensionWindowAreaStatusRequirements extensionWindowAreaStatusRequirements;
        int iHashCode2;
        int i;
        int iHashCode3;
        int iHashCode4;
        int i2 = 2 % 2;
        int iHashCode5 = 1;
        int i3 = MediaDescriptionCompat + 1;
        MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            iHashCode = this.IconCompatParcelizer.hashCode();
            extensionWindowAreaStatusRequirements = this.write;
            if (extensionWindowAreaStatusRequirements == null) {
                i = 1;
                int i4 = MediaSessionCompatQueueItem + 65;
                MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                iHashCode2 = i;
                iHashCode3 = 0;
            } else {
                iHashCode2 = 1;
                iHashCode3 = extensionWindowAreaStatusRequirements.hashCode();
            }
        } else {
            iHashCode = this.IconCompatParcelizer.hashCode();
            extensionWindowAreaStatusRequirements = this.write;
            if (extensionWindowAreaStatusRequirements == null) {
                i = 0;
                int i6 = MediaSessionCompatQueueItem + 65;
                MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                iHashCode2 = i;
                iHashCode3 = 0;
            } else {
                iHashCode2 = 0;
                iHashCode3 = extensionWindowAreaStatusRequirements.hashCode();
            }
        }
        Integer num = this.serializer;
        if (num == null) {
            int i8 = MediaSessionCompatQueueItem + 75;
            MediaDescriptionCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = num.hashCode();
        }
        String str = this.read;
        if (str == null) {
            int i10 = MediaDescriptionCompat + 103;
            MediaSessionCompatQueueItem = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                iHashCode5 = 0;
            }
        } else {
            iHashCode5 = str.hashCode();
        }
        Map map = this.RemoteActionCompatParcelizer;
        if (map != null) {
            iHashCode2 = map.hashCode();
        }
        return (((((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if ((r22 instanceof o.handleInternalBannerRefreshlambda1) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        r1 = (o.handleInternalBannerRefreshlambda1) r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if (r21.IconCompatParcelizer == r1.IconCompatParcelizer) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
    
        r12 = new java.lang.Object[]{r21.write, r1.write};
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r12, o.getCieXyz.write())).booleanValue() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        r19 = new java.lang.Object[]{r21.serializer, r1.serializer};
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007f, code lost:
    
        r19 = new java.lang.Object[]{r21.read, r1.read};
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a4, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a6, code lost:
    
        r1 = o.handleInternalBannerRefreshlambda1.MediaDescriptionCompat + 71;
        o.handleInternalBannerRefreshlambda1.MediaSessionCompatQueueItem = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00af, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b0, code lost:
    
        r19 = new java.lang.Object[]{r21.RemoteActionCompatParcelizer, r1.RemoteActionCompatParcelizer};
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d5, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d7, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d8, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.handleInternalBannerRefreshlambda1.equals(java.lang.Object):boolean");
    }
}
