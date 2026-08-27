package o;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes.dex */
public final class ColorMatrixFilterHelper implements Animation.AnimationListener {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ SwipeRefreshLayout serializer;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    public /* synthetic */ ColorMatrixFilterHelper(SwipeRefreshLayout swipeRefreshLayout, int i) {
        this.IconCompatParcelizer = i;
        this.serializer = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        r8lambdaYYrMr3f_0vhPsnRJrur1NVokAtM r8lambdayyrmr3f_0vhpsnrjrur1nvokatm;
        int i = this.IconCompatParcelizer;
        SwipeRefreshLayout swipeRefreshLayout = this.serializer;
        if (i != 0) {
            dotMe4OoYI dotme4ooyi = new dotMe4OoYI(swipeRefreshLayout, 1);
            swipeRefreshLayout._init_lambda3 = dotme4ooyi;
            dotme4ooyi.setDuration(150L);
            timesAssignjHGOpc timesassignjhgopc = swipeRefreshLayout.MediaSessionCompatQueueItem;
            timesassignjhgopc.RemoteActionCompatParcelizer = null;
            timesassignjhgopc.clearAnimation();
            swipeRefreshLayout.MediaSessionCompatQueueItem.startAnimation(swipeRefreshLayout._init_lambda3);
            return;
        }
        if (!swipeRefreshLayout.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) {
            swipeRefreshLayout.write();
            return;
        }
        swipeRefreshLayout.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.setAlpha(255);
        swipeRefreshLayout.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.start();
        if (swipeRefreshLayout.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 && (r8lambdayyrmr3f_0vhpsnrjrur1nvokatm = swipeRefreshLayout.ResultReceiver) != null) {
            r8lambdayyrmr3f_0vhpsnrjrur1nvokatm.onRefresh();
        }
        swipeRefreshLayout.MediaDescriptionCompat = swipeRefreshLayout.MediaSessionCompatQueueItem.getTop();
    }
}
