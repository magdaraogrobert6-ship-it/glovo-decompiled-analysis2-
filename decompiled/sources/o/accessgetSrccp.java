package o;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetSrccp implements Runnable {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ Object write;

    public /* synthetic */ accessgetSrccp(Object obj, int i, Object obj2) {
        this.read = i;
        this.write = obj;
        this.IconCompatParcelizer = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f;
        int i = this.read;
        Object obj = this.IconCompatParcelizer;
        Object obj2 = this.write;
        if (i == 0) {
            AndroidCanvas androidCanvas = (AndroidCanvas) obj2;
            accessgetSaturationcp accessgetsaturationcp = (accessgetSaturationcp) androidCanvas.IconCompatParcelizer;
            if (accessgetsaturationcp.MediaMetadataCompat == androidCanvas.read) {
                List list = (List) androidCanvas.write;
                Runnable runnable = (Runnable) androidCanvas.MediaDescriptionCompat;
                accessgetsaturationcp.serializer = list;
                accessgetsaturationcp.MediaDescriptionCompat = Collections.unmodifiableList(list);
                ((EnterExitTransitionKtshrinkVertically2) obj).read(accessgetsaturationcp.RatingCompat);
                accessgetsaturationcp.IconCompatParcelizer(runnable);
                return;
            }
            return;
        }
        float f2 = 0.0f;
        if (i == 1) {
            accessgetSoftlightcp accessgetsoftlightcp = (accessgetSoftlightcp) obj2;
            ArrayList<accessgetSrcOutcp> arrayList = (ArrayList) obj;
            for (accessgetSrcOutcp accessgetsrcoutcp : arrayList) {
                androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = accessgetsrcoutcp.IconCompatParcelizer;
                int i2 = accessgetsrcoutcp.serializer;
                int i3 = accessgetsrcoutcp.write;
                int i4 = accessgetsrcoutcp.read;
                int i5 = accessgetsrcoutcp.RemoteActionCompatParcelizer;
                accessgetsoftlightcp.getClass();
                View view = viewHolder.MediaSessionCompatQueueItem;
                int i6 = i4 - i2;
                int i7 = i5 - i3;
                if (i6 != 0) {
                    f = 0.0f;
                    view.animate().translationX(0.0f);
                } else {
                    f = 0.0f;
                }
                if (i7 != 0) {
                    view.animate().translationY(f);
                }
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                accessgetsoftlightcp.MediaBrowserCompatMediaItem.add(viewHolder);
                viewPropertyAnimatorAnimate.setDuration(accessgetsoftlightcp.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).setListener(new accessgetXorcp(accessgetsoftlightcp, viewHolder, i6, view, i7, viewPropertyAnimatorAnimate)).start();
            }
            arrayList.clear();
            accessgetsoftlightcp.MediaSessionCompatQueueItem.remove(arrayList);
            return;
        }
        if (i != 2) {
            accessgetSoftlightcp accessgetsoftlightcp2 = (accessgetSoftlightcp) obj2;
            ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> arrayList2 = (ArrayList) obj;
            for (androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder2 : arrayList2) {
                accessgetsoftlightcp2.getClass();
                View view2 = viewHolder2.MediaSessionCompatQueueItem;
                ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view2.animate();
                accessgetsoftlightcp2.write.add(viewHolder2);
                viewPropertyAnimatorAnimate2.alpha(1.0f).setDuration(accessgetsoftlightcp2.MediaSessionCompatResultReceiverWrapper).setListener(new accessgetSrcIncp(accessgetsoftlightcp2, viewHolder2, view2, viewPropertyAnimatorAnimate2)).start();
            }
            arrayList2.clear();
            accessgetsoftlightcp2.serializer.remove(arrayList2);
            return;
        }
        accessgetSoftlightcp accessgetsoftlightcp3 = (accessgetSoftlightcp) obj2;
        ArrayList<accessgetSrcAtopcp> arrayList3 = (ArrayList) obj;
        for (accessgetSrcAtopcp accessgetsrcatopcp : arrayList3) {
            ArrayList arrayList4 = accessgetsoftlightcp3.IconCompatParcelizer;
            long j = accessgetsoftlightcp3.PlaybackStateCompat;
            androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder3 = accessgetsrcatopcp.serializer;
            View view3 = viewHolder3 == null ? null : viewHolder3.MediaSessionCompatQueueItem;
            androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder4 = accessgetsrcatopcp.read;
            View view4 = viewHolder4 != null ? viewHolder4.MediaSessionCompatQueueItem : null;
            if (view3 != null) {
                ViewPropertyAnimator duration = view3.animate().setDuration(j);
                arrayList4.add(accessgetsrcatopcp.serializer);
                duration.translationX(accessgetsrcatopcp.write - accessgetsrcatopcp.IconCompatParcelizer);
                duration.translationY(accessgetsrcatopcp.MediaSessionCompatQueueItem - accessgetsrcatopcp.RemoteActionCompatParcelizer);
                duration.alpha(f2).setListener(new accessgetSrcOvercp(accessgetsoftlightcp3, accessgetsrcatopcp, duration, view3, 0)).start();
            }
            if (view4 != null) {
                ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                arrayList4.add(accessgetsrcatopcp.read);
                viewPropertyAnimatorAnimate3.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new accessgetSrcOvercp(accessgetsoftlightcp3, accessgetsrcatopcp, viewPropertyAnimatorAnimate3, view4, 1)).start();
                f2 = 0.0f;
            } else {
                f2 = 0.0f;
            }
        }
        arrayList3.clear();
        accessgetsoftlightcp3.read.remove(arrayList3);
    }
}
