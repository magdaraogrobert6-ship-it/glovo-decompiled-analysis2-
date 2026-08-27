package o;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class getSrcAtop0nO6VwU implements Runnable {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView write;

    public /* synthetic */ getSrcAtop0nO6VwU(androidx.recyclerview.widget.RecyclerView recyclerView, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.write = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        int i = this.RemoteActionCompatParcelizer;
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.write;
        if (i == 0) {
            if (!recyclerView2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss || recyclerView2.isLayoutRequested()) {
                return;
            }
            if (!recyclerView2.accessensureViewModelStore) {
                recyclerView2.requestLayout();
                return;
            } else if (recyclerView2.addContentView) {
                recyclerView2.onBackPressedDispatcher_delegatelambda00 = true;
                return;
            } else {
                recyclerView2.consumePendingUpdateOperations();
                return;
            }
        }
        androidx.recyclerview.widget.RecyclerView.ItemAnimator itemAnimator = recyclerView2._init_lambda1;
        if (itemAnimator != null) {
            accessgetSoftlightcp accessgetsoftlightcp = (accessgetSoftlightcp) itemAnimator;
            long j = accessgetsoftlightcp.ComponentActivity;
            ArrayList arrayList = accessgetsoftlightcp.MediaSessionCompatToken;
            boolean zIsEmpty = arrayList.isEmpty();
            ArrayList arrayList2 = accessgetsoftlightcp.RatingCompat;
            boolean zIsEmpty2 = arrayList2.isEmpty();
            ArrayList arrayList3 = accessgetsoftlightcp.MediaMetadataCompat;
            boolean zIsEmpty3 = arrayList3.isEmpty();
            ArrayList arrayList4 = accessgetsoftlightcp.MediaDescriptionCompat;
            boolean zIsEmpty4 = arrayList4.isEmpty();
            if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
                recyclerView = recyclerView2;
            } else {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = (androidx.recyclerview.widget.RecyclerView.ViewHolder) it.next();
                    View view = viewHolder.MediaSessionCompatQueueItem;
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                    accessgetsoftlightcp.ParcelableVolumeInfo.add(viewHolder);
                    viewPropertyAnimatorAnimate.setDuration(j).alpha(0.0f).setListener(new accessgetSrcIncp(accessgetsoftlightcp, viewHolder, viewPropertyAnimatorAnimate, view)).start();
                    it = it;
                    recyclerView2 = recyclerView2;
                }
                androidx.recyclerview.widget.RecyclerView recyclerView3 = recyclerView2;
                arrayList.clear();
                if (!zIsEmpty2) {
                    ArrayList arrayList5 = new ArrayList();
                    arrayList5.addAll(arrayList2);
                    accessgetsoftlightcp.MediaSessionCompatQueueItem.add(arrayList5);
                    arrayList2.clear();
                    accessgetSrccp accessgetsrccp = new accessgetSrccp(accessgetsoftlightcp, 1, arrayList5);
                    if (zIsEmpty) {
                        accessgetsrccp.run();
                    } else {
                        View view2 = ((accessgetSrcOutcp) arrayList5.get(0)).IconCompatParcelizer.MediaSessionCompatQueueItem;
                        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                        view2.postOnAnimationDelayed(accessgetsrccp, j);
                    }
                }
                if (!zIsEmpty3) {
                    ArrayList arrayList6 = new ArrayList();
                    arrayList6.addAll(arrayList3);
                    accessgetsoftlightcp.read.add(arrayList6);
                    arrayList3.clear();
                    accessgetSrccp accessgetsrccp2 = new accessgetSrccp(accessgetsoftlightcp, 2, arrayList6);
                    if (zIsEmpty) {
                        accessgetsrccp2.run();
                    } else {
                        View view3 = ((accessgetSrcAtopcp) arrayList6.get(0)).serializer.MediaSessionCompatQueueItem;
                        WeakHashMap weakHashMap2 = FocusPropertiesNode.RatingCompat;
                        view3.postOnAnimationDelayed(accessgetsrccp2, j);
                    }
                }
                if (zIsEmpty4) {
                    z = false;
                } else {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.addAll(arrayList4);
                    accessgetsoftlightcp.serializer.add(arrayList7);
                    arrayList4.clear();
                    accessgetSrccp accessgetsrccp3 = new accessgetSrccp(accessgetsoftlightcp, 3, arrayList7);
                    if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
                        accessgetsrccp3.run();
                        recyclerView = recyclerView3;
                    } else {
                        if (zIsEmpty) {
                            j = 0;
                        }
                        long jMax = Math.max(!zIsEmpty2 ? accessgetsoftlightcp.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY : 0L, zIsEmpty3 ? 0L : accessgetsoftlightcp.PlaybackStateCompat);
                        z = false;
                        View view4 = ((androidx.recyclerview.widget.RecyclerView.ViewHolder) arrayList7.get(0)).MediaSessionCompatQueueItem;
                        WeakHashMap weakHashMap3 = FocusPropertiesNode.RatingCompat;
                        view4.postOnAnimationDelayed(accessgetsrccp3, jMax + j);
                    }
                }
                recyclerView = recyclerView3;
            }
            z = false;
        } else {
            z = false;
            recyclerView = recyclerView2;
        }
        recyclerView.getFullyDrawnReporter = z;
    }
}
