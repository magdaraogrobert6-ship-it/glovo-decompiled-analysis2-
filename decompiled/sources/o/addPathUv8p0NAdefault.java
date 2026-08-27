package o;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class addPathUv8p0NAdefault {
    public final accessandjd IconCompatParcelizer;
    public final isAdapterPositionOnScreen MediaBrowserCompatMediaItem;
    public final ImageShaderF49vj9sdefault RemoteActionCompatParcelizer;
    public final isAdapterPositionOnScreen read;
    public final Context serializer;
    public final isAdapterPositionOnScreen write;

    public final int hashCode() {
        int iHashCode = this.serializer.hashCode();
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode3 = this.read.hashCode();
        int iHashCode4 = this.MediaBrowserCompatMediaItem.hashCode();
        int iHashCode5 = this.write.hashCode();
        return (this.IconCompatParcelizer.hashCode() + ((accessrelativeQuadraticTojd.read.hashCode() + ((iHashCode5 + ((iHashCode4 + ((iHashCode3 + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
    }

    public addPathUv8p0NAdefault(Context context, ImageShaderF49vj9sdefault imageShaderF49vj9sdefault, isAdapterPositionOnScreen isadapterpositiononscreen, isAdapterPositionOnScreen isadapterpositiononscreen2, isAdapterPositionOnScreen isadapterpositiononscreen3, accessandjd accessandjdVar) {
        this.serializer = context;
        this.RemoteActionCompatParcelizer = imageShaderF49vj9sdefault;
        this.read = isadapterpositiononscreen;
        this.MediaBrowserCompatMediaItem = isadapterpositiononscreen2;
        this.write = isadapterpositiononscreen3;
        this.IconCompatParcelizer = accessandjdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof addPathUv8p0NAdefault) {
            addPathUv8p0NAdefault addpathuv8p0nadefault = (addPathUv8p0NAdefault) obj;
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, addpathuv8p0nadefault.serializer}, getCieXyz.write())).booleanValue() && this.RemoteActionCompatParcelizer.equals(addpathuv8p0nadefault.RemoteActionCompatParcelizer) && this.read == addpathuv8p0nadefault.read && this.MediaBrowserCompatMediaItem == addpathuv8p0nadefault.MediaBrowserCompatMediaItem && this.write == addpathuv8p0nadefault.write && this.IconCompatParcelizer == addpathuv8p0nadefault.IconCompatParcelizer;
        }
        return false;
    }

    public final String toString() {
        return "Options(application=" + this.serializer + ", defaults=" + this.RemoteActionCompatParcelizer + ", mainCoroutineContextLazy=" + this.read + ", memoryCacheLazy=" + this.MediaBrowserCompatMediaItem + ", diskCacheLazy=" + this.write + ", eventListenerFactory=" + accessrelativeQuadraticTojd.read + ", componentRegistry=" + this.IconCompatParcelizer + ", logger=null)";
    }
}
