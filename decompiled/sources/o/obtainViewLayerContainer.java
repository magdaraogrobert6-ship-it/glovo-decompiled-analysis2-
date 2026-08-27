package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class obtainViewLayerContainer {
    public final /* synthetic */ accessunregisterComponentCallback RatingCompat;
    public int RemoteActionCompatParcelizer = -1;
    public boolean serializer;
    public final unregisterComponentCallback write;

    public abstract boolean IconCompatParcelizer();

    public boolean read(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        return false;
    }

    public void serializer() {
    }

    public obtainViewLayerContainer(accessunregisterComponentCallback accessunregistercomponentcallback, unregisterComponentCallback unregistercomponentcallback) {
        this.RatingCompat = accessunregistercomponentcallback;
        this.write = unregistercomponentcallback;
    }

    public final void serializer(boolean z) {
        if (z == this.serializer) {
            return;
        }
        this.serializer = z;
        int i = z ? 1 : -1;
        accessunregisterComponentCallback accessunregistercomponentcallback = this.RatingCompat;
        int i2 = accessunregistercomponentcallback.MediaDescriptionCompat;
        accessunregistercomponentcallback.MediaDescriptionCompat = i + i2;
        if (!accessunregistercomponentcallback.MediaBrowserCompatMediaItem) {
            accessunregistercomponentcallback.MediaBrowserCompatMediaItem = true;
            while (true) {
                try {
                    int i3 = accessunregistercomponentcallback.MediaDescriptionCompat;
                    if (i2 == i3) {
                        break;
                    }
                    boolean z2 = i2 == 0 && i3 > 0;
                    boolean z3 = i2 > 0 && i3 == 0;
                    if (z2) {
                        accessunregistercomponentcallback.RemoteActionCompatParcelizer();
                    } else if (z3) {
                        accessunregistercomponentcallback.read();
                    }
                    i2 = i3;
                } catch (Throwable th) {
                    accessunregistercomponentcallback.MediaBrowserCompatMediaItem = false;
                    throw th;
                }
            }
            accessunregistercomponentcallback.MediaBrowserCompatMediaItem = false;
        }
        if (this.serializer) {
            accessunregistercomponentcallback.RemoteActionCompatParcelizer(this);
        }
    }
}
