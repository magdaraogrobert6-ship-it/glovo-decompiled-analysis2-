package o;

import android.content.Context;
import coil3.util.AndroidSystemCallbacks$ActivityCallbacks;
import com.google.android.gms.internal.gtm.zzcp;

/* JADX INFO: loaded from: classes.dex */
public final class StrokeCapCompanion {
    public boolean IconCompatParcelizer;
    public final java.lang.ref.WeakReference RemoteActionCompatParcelizer;
    public final AndroidSystemCallbacks$ActivityCallbacks read;
    public Context serializer;
    public final zzcp write = new zzcp(1, this);

    public final void serializer() {
        synchronized (this) {
            if (this.IconCompatParcelizer) {
                return;
            }
            this.IconCompatParcelizer = true;
            Context context = this.serializer;
            if (context != null) {
                this.read.read(context);
                context.unregisterComponentCallbacks(this.write);
            }
            this.RemoteActionCompatParcelizer.clear();
        }
    }

    public StrokeCapCompanion(coil3.RealImageLoader realImageLoader) {
        this.RemoteActionCompatParcelizer = new java.lang.ref.WeakReference(realImageLoader);
        this.read = new AndroidSystemCallbacks$ActivityCallbacks(this, realImageLoader);
    }
}
