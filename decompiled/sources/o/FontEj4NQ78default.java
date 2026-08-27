package o;

import com.roadrunner.delivery.analytics.StateV3AnalyticsProviderImpl;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class FontEj4NQ78default {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final getHeadingrAG3T2k IconCompatParcelizer;
    public final accessgetLoosecp RemoteActionCompatParcelizer;
    public final FontEj4NQ78 read;
    public final ld serializer;
    public final setSpanStyles write;

    public FontEj4NQ78default(FontEj4NQ78 fontEj4NQ78, ld ldVar, accessgetLoosecp accessgetloosecp, setSpanStyles setspanstyles, getHeadingrAG3T2k getheadingrag3t2k) {
        fontEj4NQ78.getClass();
        ldVar.getClass();
        getheadingrag3t2k.getClass();
        this.read = fontEj4NQ78;
        this.serializer = ldVar;
        this.RemoteActionCompatParcelizer = accessgetloosecp;
        this.write = setspanstyles;
        this.IconCompatParcelizer = getheadingrag3t2k;
    }

    public final safeSetClipToOutline write() {
        int i = 2 % 2;
        Map mapWrite = ((StateV3AnalyticsProviderImpl) this.read).write();
        getNormalusljTpc getnormalusljtpc = this.serializer.read;
        String str = getnormalusljtpc.RemoteActionCompatParcelizer;
        String str2 = getnormalusljtpc.IconCompatParcelizer;
        safeSetClipToOutline safesetcliptooutline = new safeSetClipToOutline();
        safesetcliptooutline.putAll(mapWrite);
        if (str.length() > 0) {
            int i2 = MediaBrowserCompatMediaItem + 41;
            MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            safesetcliptooutline.put("navigation_session_id", str);
        }
        if (str2.length() > 0) {
            int i4 = MediaSessionCompatQueueItem + 49;
            MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            safesetcliptooutline.put("navigation_trip_id", str2);
        }
        safesetcliptooutline.putAll(read());
        return safesetcliptooutline.IconCompatParcelizer();
    }

    public final safeSetClipToOutline read() {
        String str;
        int i = 2 % 2;
        safeSetClipToOutline safesetcliptooutline = new safeSetClipToOutline();
        boolean z = false;
        if (this.RemoteActionCompatParcelizer.IconCompatParcelizer.RemoteActionCompatParcelizer()) {
            int i2 = MediaSessionCompatQueueItem + 33;
            MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            str = "inapp";
            if (i2 % 2 != 0) {
                int i3 = 96 / 0;
            }
        } else {
            str = "external";
        }
        safesetcliptooutline.put("navigation_mode", str);
        TextPaintExtensions_androidKt textPaintExtensions_androidKt = this.write.read;
        if (textPaintExtensions_androidKt.read.serializer()) {
            int i4 = MediaSessionCompatQueueItem + 73;
            MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0 ? textPaintExtensions_androidKt.RemoteActionCompatParcelizer.getBoolean(textPaintExtensions_androidKt.IconCompatParcelizer, false) : textPaintExtensions_androidKt.RemoteActionCompatParcelizer.getBoolean(textPaintExtensions_androidKt.IconCompatParcelizer, true)) {
                z = true;
            }
        }
        Map mapSingletonMap = Collections.singletonMap("is_route_preview_enabled", String.valueOf(z));
        mapSingletonMap.getClass();
        safesetcliptooutline.putAll(mapSingletonMap);
        return safesetcliptooutline.IconCompatParcelizer();
    }
}
