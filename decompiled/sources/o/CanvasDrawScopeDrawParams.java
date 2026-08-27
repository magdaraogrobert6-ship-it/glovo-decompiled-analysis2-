package o;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class CanvasDrawScopeDrawParams implements drawImage9jGpkUE {
    public final Class IconCompatParcelizer;
    public final drawImage9jGpkUE read;
    public final Context serializer;
    public final drawImage9jGpkUE write;

    @Override // o.drawImage9jGpkUE
    public final drawLine1RTmtNc RemoteActionCompatParcelizer(Object obj, int i, int i2, getEotfFuncui_graphics geteotffuncui_graphics) {
        Uri uri = (Uri) obj;
        return new drawLine1RTmtNc(new translatedefault(uri), new drawRoundRectuAw5IA(this.serializer, this.write, this.read, uri, i, i2, geteotffuncui_graphics, this.IconCompatParcelizer));
    }

    @Override // o.drawImage9jGpkUE
    public final boolean write(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && computeVerticalBoundsdefault.IconCompatParcelizer((Uri) obj);
    }

    public CanvasDrawScopeDrawParams(Context context, drawImage9jGpkUE drawimage9jgpkue, drawImage9jGpkUE drawimage9jgpkue2, Class cls) {
        this.serializer = context.getApplicationContext();
        this.write = drawimage9jgpkue;
        this.read = drawimage9jgpkue2;
        this.IconCompatParcelizer = cls;
    }
}
