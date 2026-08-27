package o;

import java.time.Clock;

/* JADX INFO: loaded from: classes3.dex */
public final class getSubpixelTextPositioningui_text {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final FontEj4NQ78default IconCompatParcelizer;
    public final Clock read;
    public final decode serializer;

    public getSubpixelTextPositioningui_text(decode decodeVar, FontEj4NQ78default fontEj4NQ78default, Clock clock) {
        decodeVar.getClass();
        fontEj4NQ78default.getClass();
        clock.getClass();
        this.serializer = decodeVar;
        this.IconCompatParcelizer = fontEj4NQ78default;
        this.read = clock;
    }

    public final void IconCompatParcelizer(String str, Integer num, accessgetClipcp accessgetclipcp) {
        int i = 2 % 2;
        str.getClass();
        accessgetclipcp.getClass();
        safeSetClipToOutline safesetcliptooutline = new safeSetClipToOutline();
        safesetcliptooutline.putAll(this.IconCompatParcelizer.write());
        safesetcliptooutline.put("vendor_id", str);
        if (num != null) {
            int i2 = RemoteActionCompatParcelizer + 71;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i3 = write + 93;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        safesetcliptooutline.put("reason", accessgetclipcp.getValue());
        this.serializer.logEvent("ble_scan_stopped", safesetcliptooutline.IconCompatParcelizer());
    }
}
