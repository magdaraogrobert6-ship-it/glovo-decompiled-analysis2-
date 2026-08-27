package o;

import android.view.View;
import bo.app.af$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class radialGradientP_VxKs {
    public final int IconCompatParcelizer;
    public final /* synthetic */ androidx.recyclerview.widget.StaggeredGridLayoutManager MediaSessionCompatQueueItem;
    public final ArrayList write = new ArrayList();
    public int RemoteActionCompatParcelizer = Integer.MIN_VALUE;
    public int read = Integer.MIN_VALUE;
    public int serializer = 0;

    public final int IconCompatParcelizer() {
        boolean z = this.MediaSessionCompatQueueItem.MediaSessionCompatResultReceiverWrapper;
        ArrayList arrayList = this.write;
        return z ? read(0, arrayList.size()) : read(arrayList.size() - 1, -1);
    }

    public final int read() {
        boolean z = this.MediaSessionCompatQueueItem.MediaSessionCompatResultReceiverWrapper;
        ArrayList arrayList = this.write;
        return z ? read(arrayList.size() - 1, -1) : read(0, arrayList.size());
    }

    public final int read(int i, int i2) {
        androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = this.MediaSessionCompatQueueItem;
        int iIconCompatParcelizer = staggeredGridLayoutManager.PlaybackStateCompat.IconCompatParcelizer();
        int iWrite = staggeredGridLayoutManager.PlaybackStateCompat.write();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) this.write.get(i);
            int iRemoteActionCompatParcelizer = staggeredGridLayoutManager.PlaybackStateCompat.RemoteActionCompatParcelizer(view);
            int iWrite2 = staggeredGridLayoutManager.PlaybackStateCompat.write(view);
            boolean z = iRemoteActionCompatParcelizer <= iWrite;
            boolean z2 = iWrite2 >= iIconCompatParcelizer;
            if (z && z2 && (iRemoteActionCompatParcelizer < iIconCompatParcelizer || iWrite2 > iWrite)) {
                return androidx.recyclerview.widget.RecyclerView.LayoutManager.RemoteActionCompatParcelizer(view);
            }
            i += i3;
        }
        return -1;
    }

    public final void serializer() {
        this.write.clear();
        this.RemoteActionCompatParcelizer = Integer.MIN_VALUE;
        this.read = Integer.MIN_VALUE;
        this.serializer = 0;
    }

    public radialGradientP_VxKs(androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.MediaSessionCompatQueueItem = staggeredGridLayoutManager;
        this.IconCompatParcelizer = i;
    }

    public final void write() {
        View view = (View) af$$ExternalSyntheticOutline0.m(1, this.write);
        horizontalGradient8A3gB4 horizontalgradient8a3gb4 = (horizontalGradient8A3gB4) view.getLayoutParams();
        this.read = this.MediaSessionCompatQueueItem.PlaybackStateCompat.write(view);
        horizontalgradient8a3gb4.getClass();
    }

    public final View write(int i, int i2) {
        androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = this.MediaSessionCompatQueueItem;
        ArrayList arrayList = this.write;
        View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.MediaSessionCompatResultReceiverWrapper && androidx.recyclerview.widget.RecyclerView.LayoutManager.RemoteActionCompatParcelizer(view2) >= i) || ((!staggeredGridLayoutManager.MediaSessionCompatResultReceiverWrapper && androidx.recyclerview.widget.RecyclerView.LayoutManager.RemoteActionCompatParcelizer(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            View view3 = (View) arrayList.get(i3);
            if ((staggeredGridLayoutManager.MediaSessionCompatResultReceiverWrapper && androidx.recyclerview.widget.RecyclerView.LayoutManager.RemoteActionCompatParcelizer(view3) <= i) || ((!staggeredGridLayoutManager.MediaSessionCompatResultReceiverWrapper && androidx.recyclerview.widget.RecyclerView.LayoutManager.RemoteActionCompatParcelizer(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i3++;
            view = view3;
        }
        return view;
    }

    public final int read(int i) {
        int i2 = this.read;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.write.size() == 0) {
            return i;
        }
        write();
        return this.read;
    }

    public final int serializer(int i) {
        int i2 = this.RemoteActionCompatParcelizer;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        ArrayList arrayList = this.write;
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        horizontalGradient8A3gB4 horizontalgradient8a3gb4 = (horizontalGradient8A3gB4) view.getLayoutParams();
        this.RemoteActionCompatParcelizer = this.MediaSessionCompatQueueItem.PlaybackStateCompat.RemoteActionCompatParcelizer(view);
        horizontalgradient8a3gb4.getClass();
        return this.RemoteActionCompatParcelizer;
    }
}
