package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getDoneeUduSuo {
    private static int read = 0;
    private static int write = 1;
    public final FontEj4NQ78default IconCompatParcelizer;
    public final decode serializer;

    public getDoneeUduSuo(FontEj4NQ78default fontEj4NQ78default, decode decodeVar) {
        decodeVar.getClass();
        fontEj4NQ78default.getClass();
        this.serializer = decodeVar;
        this.IconCompatParcelizer = fontEj4NQ78default;
    }

    public final void serializer(int i) {
        int i2 = 2 % 2;
        safeSetClipToOutline safesetcliptooutline = new safeSetClipToOutline();
        safesetcliptooutline.putAll(this.IconCompatParcelizer.write());
        safesetcliptooutline.put("picture_count", String.valueOf(i));
        this.serializer.logEvent("cs_photo_icon_click", safesetcliptooutline.IconCompatParcelizer());
        int i3 = read + 27;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    public final void read(getUnspecifiedeUduSuo getunspecifiedeudusuo) {
        int i = 2 % 2;
        getunspecifiedeudusuo.getClass();
        safeSetClipToOutline safesetcliptooutline = new safeSetClipToOutline();
        safesetcliptooutline.putAll(this.IconCompatParcelizer.write());
        safesetcliptooutline.put("action", getunspecifiedeudusuo.getRawValue());
        this.serializer.logEvent("cs_photo_upload", safesetcliptooutline.IconCompatParcelizer());
        int i2 = write + 123;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public final void serializer(getSearcheUduSuo getsearcheudusuo, String str) {
        int i = 2 % 2;
        getsearcheudusuo.getClass();
        safeSetClipToOutline safesetcliptooutline = new safeSetClipToOutline();
        safesetcliptooutline.putAll(this.IconCompatParcelizer.write());
        safesetcliptooutline.put("action", getsearcheudusuo.getRawValue());
        if (str != null) {
            int i2 = read + 91;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                safesetcliptooutline.put("reason", str);
                throw null;
            }
            safesetcliptooutline.put("reason", str);
        }
        this.serializer.logEvent("cs_report", safesetcliptooutline.IconCompatParcelizer());
        int i3 = read + 101;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 8 / 0;
        }
    }

    public final void write(int i, ImeOptions imeOptions) {
        int i2 = 2 % 2;
        imeOptions.getClass();
        safeSetClipToOutline safesetcliptooutline = new safeSetClipToOutline();
        safesetcliptooutline.putAll(this.IconCompatParcelizer.write());
        safesetcliptooutline.put("picture_count", String.valueOf(i));
        safesetcliptooutline.put("action", imeOptions.getRawValue());
        this.serializer.logEvent("cs_gallery", safesetcliptooutline.IconCompatParcelizer());
        int i3 = read + 89;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 14 / 0;
        }
    }
}
