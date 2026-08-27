package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class linearGradientmHitzGkdefault {
    public int IconCompatParcelizer;
    public boolean MediaBrowserCompatMediaItem;
    public final /* synthetic */ androidx.recyclerview.widget.StaggeredGridLayoutManager RatingCompat;
    public int[] RemoteActionCompatParcelizer;
    public int read;
    public boolean serializer;
    public boolean write;

    public final void read() {
        this.read = -1;
        this.IconCompatParcelizer = Integer.MIN_VALUE;
        this.serializer = false;
        this.write = false;
        this.MediaBrowserCompatMediaItem = false;
        int[] iArr = this.RemoteActionCompatParcelizer;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }

    public linearGradientmHitzGkdefault(androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.RatingCompat = staggeredGridLayoutManager;
        read();
    }
}
