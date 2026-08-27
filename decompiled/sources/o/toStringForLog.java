package o;

/* JADX INFO: loaded from: classes3.dex */
public final class toStringForLog {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final decode IconCompatParcelizer;
    public final FontEj4NQ78default serializer;

    public toStringForLog(FontEj4NQ78default fontEj4NQ78default, decode decodeVar) {
        this.IconCompatParcelizer = decodeVar;
        this.serializer = fontEj4NQ78default;
    }

    public final void RemoteActionCompatParcelizer(long j, String str) {
        int i = 2 % 2;
        this.IconCompatParcelizer.logEvent(str, onMove.serializer(this.serializer.write(), new onViewAttachedToWindowlambda0("delivery_id", String.valueOf(j))));
        int i2 = RemoteActionCompatParcelizer + 103;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public final void read(Long l, setPathOutline setpathoutline) {
        int i = 2 % 2;
        setpathoutline.getClass();
        safeSetClipToOutline safesetcliptooutline = new safeSetClipToOutline();
        safesetcliptooutline.put("chat_type", setpathoutline.getRawValue());
        if (l != null) {
            int i2 = read + 13;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            safesetcliptooutline.put("delivery_id", String.valueOf(l.longValue()));
        }
        this.IconCompatParcelizer.logEvent("chat_notification_open_chat", onMove.RemoteActionCompatParcelizer(this.serializer.write(), safesetcliptooutline.IconCompatParcelizer()));
        int i4 = RemoteActionCompatParcelizer + 41;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
