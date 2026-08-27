package o;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class InfiniteAnimationPolicyDefaultImpls {
    public int RemoteActionCompatParcelizer;
    public int serializer;

    public /* synthetic */ InfiniteAnimationPolicyDefaultImpls(int i, int i2) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = i2;
    }

    public void read(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.MediaSessionCompatQueueItem;
        this.serializer = view.getLeft();
        this.RemoteActionCompatParcelizer = view.getTop();
        view.getRight();
        view.getBottom();
    }

    public InfiniteAnimationPolicyDefaultImpls() {
    }
}
