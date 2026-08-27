package o;

import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class j4 {
    private static int serializer = 0;
    private static int write = 1;

    public static String read() {
        int i = 2 % 2;
        String str = "com.roadrunner_" + UUID.randomUUID();
        int i2 = write + 27;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r5.styleLayerExists("road-label") == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        return "road-label";
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (r5.styleLayerExists("mapbox-location-indicator-layer") == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        r5 = o.j4.serializer + 79;
        o.j4.write = r5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        return "mapbox-location-indicator-layer";
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        r5 = o.j4.write + 113;
        o.j4.serializer = r5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if ((r5 % 2) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        r5 = null;
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (r5.styleLayerExists("road-label-medium") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r5.styleLayerExists("road-label-medium") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        return "road-label-medium";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String RemoteActionCompatParcelizer(com.mapbox.maps.Style r5) {
        /*
            java.lang.String r0 = "mapbox-location-indicator-layer"
            r1 = 2
            int r2 = r1 % r1
            int r2 = o.j4.write
            int r2 = r2 + 97
            int r3 = r2 % 128
            o.j4.serializer = r3
            int r2 = r2 % r1
            java.lang.String r3 = "road-label-medium"
            if (r2 == 0) goto L20
            r5.getClass()
            boolean r2 = r5.styleLayerExists(r3)
            r4 = 19
            int r4 = r4 / 0
            if (r2 == 0) goto L2a
            goto L29
        L20:
            r5.getClass()
            boolean r2 = r5.styleLayerExists(r3)
            if (r2 == 0) goto L2a
        L29:
            return r3
        L2a:
            java.lang.String r2 = "road-label"
            boolean r3 = r5.styleLayerExists(r2)
            if (r3 == 0) goto L33
            return r2
        L33:
            boolean r5 = r5.styleLayerExists(r0)
            if (r5 == 0) goto L43
            int r5 = o.j4.serializer
            int r5 = r5 + 79
            int r2 = r5 % 128
            o.j4.write = r2
            int r5 = r5 % r1
            return r0
        L43:
            int r5 = o.j4.write
            int r5 = r5 + 113
            int r0 = r5 % 128
            o.j4.serializer = r0
            int r5 = r5 % r1
            if (r5 != 0) goto L51
            java.lang.String r5 = ""
            return r5
        L51:
            r5 = 0
            r5.hashCode()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.j4.RemoteActionCompatParcelizer(com.mapbox.maps.Style):java.lang.String");
    }
}
