package o;

import android.content.Context;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetPausePausedcp {
    public static final int RemoteActionCompatParcelizer = (int) Math.round(5.1000000000000005d);
    public final int IconCompatParcelizer;
    public final boolean MediaBrowserCompatMediaItem;
    public final int read;
    public final int serializer;
    public final float write;

    public accessgetPausePausedcp(Context context) {
        boolean zIconCompatParcelizer = BuildersKt.IconCompatParcelizer(context, com.logistics.rider.glovo.R.attr.elevationOverlayEnabled, false);
        int iWrite = mergeRulerValues.write(context, com.logistics.rider.glovo.R.attr.elevationOverlayColor, 0);
        int iWrite2 = mergeRulerValues.write(context, com.logistics.rider.glovo.R.attr.elevationOverlayAccentColor, 0);
        int iWrite3 = mergeRulerValues.write(context, com.logistics.rider.glovo.R.attr.colorSurface, 0);
        float f = context.getResources().getDisplayMetrics().density;
        this.MediaBrowserCompatMediaItem = zIconCompatParcelizer;
        this.serializer = iWrite;
        this.IconCompatParcelizer = iWrite2;
        this.read = iWrite3;
        this.write = f;
    }
}
