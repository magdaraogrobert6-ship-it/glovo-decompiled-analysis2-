package o;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class drawOutlinewDX37Wwdefault implements Runnable {
    public final int RemoteActionCompatParcelizer;
    public final boolean read;
    public final getDefaultShadowColor serializer;
    public final accessgetRgb565cp write;

    @Override // java.lang.Runnable
    public final void run() {
        androidx.work.impl.WorkerWrapper workerWrapper;
        boolean z = this.read;
        getDefaultShadowColor getdefaultshadowcolor = this.serializer;
        accessgetRgb565cp accessgetrgb565cp = this.write;
        if (z) {
            int i = this.RemoteActionCompatParcelizer;
            getdefaultshadowcolor.getClass();
            String str = accessgetrgb565cp.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
            synchronized (getdefaultshadowcolor.MediaMetadataCompat) {
                workerWrapper = getdefaultshadowcolor.read(str);
            }
            getDefaultShadowColor.IconCompatParcelizer(workerWrapper, i);
        } else {
            int i2 = this.RemoteActionCompatParcelizer;
            getdefaultshadowcolor.getClass();
            String str2 = accessgetrgb565cp.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
            synchronized (getdefaultshadowcolor.MediaMetadataCompat) {
                if (getdefaultshadowcolor.RatingCompat.get(str2) != null) {
                    setRotationX.read().getClass();
                } else {
                    Set set = (Set) getdefaultshadowcolor.MediaSessionCompatResultReceiverWrapper.get(str2);
                    if (set != null && set.contains(accessgetrgb565cp)) {
                        getDefaultShadowColor.IconCompatParcelizer(getdefaultshadowcolor.read(str2), i2);
                    }
                }
            }
        }
        setRotationX setrotationx = setRotationX.read();
        setRotationX.IconCompatParcelizer("StopWorkRunnable");
        String str3 = this.write.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        setrotationx.getClass();
    }

    public drawOutlinewDX37Wwdefault(getDefaultShadowColor getdefaultshadowcolor, accessgetRgb565cp accessgetrgb565cp, boolean z, int i) {
        getdefaultshadowcolor.getClass();
        accessgetrgb565cp.getClass();
        this.serializer = getdefaultshadowcolor;
        this.write = accessgetrgb565cp;
        this.read = z;
        this.RemoteActionCompatParcelizer = i;
    }
}
