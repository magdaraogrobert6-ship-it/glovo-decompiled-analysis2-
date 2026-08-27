package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import o.composite7EN7VTw;
import o.getLayerBlock;
import o.getSoftlight0nO6VwU;

/* JADX INFO: loaded from: classes.dex */
public class PagerSnapHelper extends getLayerBlock {
    public final composite7EN7VTw IconCompatParcelizer = new composite7EN7VTw(this);
    public getSoftlight0nO6VwU RemoteActionCompatParcelizer;
    public RecyclerView read;
    public getSoftlight0nO6VwU serializer;

    public final int[] write(RecyclerView.LayoutManager layoutManager, View view) {
        int[] iArr = new int[2];
        if (layoutManager.RatingCompat()) {
            iArr[0] = RemoteActionCompatParcelizer(view, read(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.MediaBrowserCompatMediaItem()) {
            iArr[1] = RemoteActionCompatParcelizer(view, RemoteActionCompatParcelizer(layoutManager));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public static int RemoteActionCompatParcelizer(View view, getSoftlight0nO6VwU getsoftlight0no6vwu) {
        int iRemoteActionCompatParcelizer = getsoftlight0no6vwu.RemoteActionCompatParcelizer(view);
        return ((getsoftlight0no6vwu.IconCompatParcelizer(view) / 2) + iRemoteActionCompatParcelizer) - ((getsoftlight0no6vwu.MediaDescriptionCompat() / 2) + getsoftlight0no6vwu.IconCompatParcelizer());
    }

    public final getSoftlight0nO6VwU RemoteActionCompatParcelizer(RecyclerView.LayoutManager layoutManager) {
        getSoftlight0nO6VwU getsoftlight0no6vwu = this.serializer;
        if (getsoftlight0no6vwu == null || getsoftlight0no6vwu.IconCompatParcelizer != layoutManager) {
            this.serializer = new getSoftlight0nO6VwU(layoutManager, 1);
        }
        return this.serializer;
    }

    public final getSoftlight0nO6VwU read(RecyclerView.LayoutManager layoutManager) {
        getSoftlight0nO6VwU getsoftlight0no6vwu = this.RemoteActionCompatParcelizer;
        if (getsoftlight0no6vwu == null || getsoftlight0no6vwu.IconCompatParcelizer != layoutManager) {
            this.RemoteActionCompatParcelizer = new getSoftlight0nO6VwU(layoutManager, 0);
        }
        return this.RemoteActionCompatParcelizer;
    }

    public final void attachToRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.read;
        if (recyclerView2 == recyclerView) {
            return;
        }
        composite7EN7VTw composite7en7vtw = this.IconCompatParcelizer;
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.onBackPressed;
            if (arrayList != null) {
                arrayList.remove(composite7en7vtw);
            }
            this.read.setOnFlingListener(null);
        }
        this.read = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("An instance of OnFlingListener already set.");
                return;
            }
            this.read.addOnScrollListener(composite7en7vtw);
            this.read.setOnFlingListener(this);
            new Scroller(this.read.getContext(), new DecelerateInterpolator());
            snapToTargetExistingView();
        }
    }

    public final void snapToTargetExistingView() {
        RecyclerView.LayoutManager layoutManager;
        View viewSerializer;
        RecyclerView recyclerView = this.read;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewSerializer = serializer(layoutManager)) == null) {
            return;
        }
        int[] iArrWrite = write(layoutManager, viewSerializer);
        int i = iArrWrite[0];
        if (i == 0 && iArrWrite[1] == 0) {
            return;
        }
        this.read.smoothScrollBy$1(i, iArrWrite[1], false);
    }

    public View serializer(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.MediaBrowserCompatMediaItem()) {
            return serializer(layoutManager, RemoteActionCompatParcelizer(layoutManager));
        }
        if (layoutManager.RatingCompat()) {
            return serializer(layoutManager, read(layoutManager));
        }
        return null;
    }

    public static View serializer(RecyclerView.LayoutManager layoutManager, getSoftlight0nO6VwU getsoftlight0no6vwu) {
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = layoutManager.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
        View view = null;
        if (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == 0) {
            return null;
        }
        int iIconCompatParcelizer = getsoftlight0no6vwu.IconCompatParcelizer();
        int iMediaDescriptionCompat = getsoftlight0no6vwu.MediaDescriptionCompat() / 2;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus; i2++) {
            View viewMediaSessionCompatResultReceiverWrapper = layoutManager.MediaSessionCompatResultReceiverWrapper(i2);
            int iAbs = Math.abs(((getsoftlight0no6vwu.IconCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper) / 2) + getsoftlight0no6vwu.RemoteActionCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper)) - (iMediaDescriptionCompat + iIconCompatParcelizer));
            if (iAbs < i) {
                view = viewMediaSessionCompatResultReceiverWrapper;
                i = iAbs;
            }
        }
        return view;
    }
}
