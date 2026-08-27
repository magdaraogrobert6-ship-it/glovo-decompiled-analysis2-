package androidx.recyclerview.widget;

import android.os.Trace;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import o.getColorBurn0nO6VwU;
import o.getDstOver0nO6VwU;
import o.getIntrinsicSizeNHjbRc;
import o.isActive;
import o.releaseFocus;

/* JADX INFO: loaded from: classes.dex */
public final class GapWorker implements Runnable {
    public long IconCompatParcelizer;
    public long RemoteActionCompatParcelizer;
    public static final ThreadLocal write = new ThreadLocal();
    public static final getColorBurn0nO6VwU serializer = new getColorBurn0nO6VwU(1);
    public final ArrayList read = new ArrayList();
    public final ArrayList MediaDescriptionCompat = new ArrayList();

    public static RecyclerView.ViewHolder RemoteActionCompatParcelizer(RecyclerView recyclerView, int i, long j) {
        int iWrite = recyclerView.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write();
        for (int i2 = 0; i2 < iWrite; i2++) {
            RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write(i2));
            if (childViewHolderInt.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == i && !childViewHolderInt.isInvalid()) {
                return null;
            }
        }
        RecyclerView.Recycler recycler = recyclerView.getLastCustomNonConfigurationInstance;
        if (j == Long.MAX_VALUE) {
            try {
                if (releaseFocus.serializer()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } finally {
                recyclerView.onExitLayoutOrScroll(false);
                Trace.endSection();
            }
        }
        recyclerView.onEnterLayoutOrScroll();
        RecyclerView.ViewHolder viewHolderTryGetViewHolderForPositionByDeadline = recycler.tryGetViewHolderForPositionByDeadline(i, j);
        if (viewHolderTryGetViewHolderForPositionByDeadline != null) {
            if (!viewHolderTryGetViewHolderForPositionByDeadline.isBound() || viewHolderTryGetViewHolderForPositionByDeadline.isInvalid()) {
                recycler.read(viewHolderTryGetViewHolderForPositionByDeadline, false);
            } else {
                recycler.serializer(viewHolderTryGetViewHolderForPositionByDeadline.MediaSessionCompatQueueItem);
            }
        }
        return viewHolderTryGetViewHolderForPositionByDeadline;
    }

    public final void postFromTraversal(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.accessensureViewModelStore) {
            if (RecyclerView.MediaSessionCompatQueueItem && !this.read.contains(recyclerView)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("attempting to post unregistered view!");
                return;
            } else if (this.IconCompatParcelizer == 0) {
                this.IconCompatParcelizer = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        isActive isactive = recyclerView.getDefaultViewModelCreationExtras;
        isactive.write = i;
        isactive.serializer = i2;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0143  */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void prefetch(long j) {
        getDstOver0nO6VwU getdstover0no6vwu;
        RecyclerView recyclerView;
        ?? r5;
        String str;
        getDstOver0nO6VwU getdstover0no6vwu2;
        ArrayList arrayList = this.read;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView recyclerView2 = (RecyclerView) arrayList.get(i3);
            int windowVisibility = recyclerView2.getWindowVisibility();
            isActive isactive = recyclerView2.getDefaultViewModelCreationExtras;
            if (windowVisibility == 0) {
                isactive.serializer(recyclerView2, false);
                i2 += isactive.read;
            }
        }
        ArrayList arrayList2 = this.MediaDescriptionCompat;
        arrayList2.ensureCapacity(i2);
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i4);
            if (recyclerView3.getWindowVisibility() == 0) {
                isActive isactive2 = recyclerView3.getDefaultViewModelCreationExtras;
                int iAbs = Math.abs(isactive2.serializer) + Math.abs(isactive2.write);
                for (int i6 = i; i6 < isactive2.read * 2; i6 += 2) {
                    if (i5 >= arrayList2.size()) {
                        getdstover0no6vwu2 = new getDstOver0nO6VwU();
                        arrayList2.add(getdstover0no6vwu2);
                    } else {
                        getdstover0no6vwu2 = (getDstOver0nO6VwU) arrayList2.get(i5);
                    }
                    int[] iArr = (int[]) isactive2.RemoteActionCompatParcelizer;
                    int i7 = iArr[i6 + 1];
                    getdstover0no6vwu2.serializer = i7 <= iAbs;
                    getdstover0no6vwu2.read = iAbs;
                    getdstover0no6vwu2.write = i7;
                    getdstover0no6vwu2.IconCompatParcelizer = recyclerView3;
                    getdstover0no6vwu2.RemoteActionCompatParcelizer = iArr[i6];
                    i5++;
                }
            }
            i4++;
            i = 0;
        }
        Collections.sort(arrayList2, serializer);
        for (int i8 = 0; i8 < arrayList2.size() && (recyclerView = (getdstover0no6vwu = (getDstOver0nO6VwU) arrayList2.get(i8)).IconCompatParcelizer) != null; i8++) {
            RecyclerView.ViewHolder viewHolderRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(recyclerView, getdstover0no6vwu.RemoteActionCompatParcelizer, getdstover0no6vwu.serializer ? Long.MAX_VALUE : j);
            if (viewHolderRemoteActionCompatParcelizer == null || viewHolderRemoteActionCompatParcelizer.ParcelableVolumeInfo == null || !viewHolderRemoteActionCompatParcelizer.isBound() || viewHolderRemoteActionCompatParcelizer.isInvalid()) {
                r5 = 0;
            } else {
                RecyclerView recyclerView4 = viewHolderRemoteActionCompatParcelizer.ParcelableVolumeInfo.get();
                if (recyclerView4 == null) {
                    r5 = 0;
                } else {
                    if (recyclerView4.ResultReceiver && recyclerView4.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write() != 0) {
                        RecyclerView.Recycler recycler = recyclerView4.getLastCustomNonConfigurationInstance;
                        RecyclerView.ItemAnimator itemAnimator = recyclerView4._init_lambda1;
                        if (itemAnimator != null) {
                            itemAnimator.serializer();
                        }
                        RecyclerView.LayoutManager layoutManager = recyclerView4.fullyDrawnReporter_delegatelambda00;
                        if (layoutManager != null) {
                            layoutManager.write(recycler);
                            recyclerView4.fullyDrawnReporter_delegatelambda00.read(recycler);
                        }
                        recycler.serializer.clear();
                        recycler.IconCompatParcelizer();
                    }
                    isActive isactive3 = recyclerView4.getDefaultViewModelCreationExtras;
                    isactive3.serializer(recyclerView4, true);
                    if (isactive3.read != 0) {
                        if (j == Long.MAX_VALUE) {
                            str = "RV Nested Prefetch";
                        } else {
                            str = "RV Nested Prefetch forced - needed next frame";
                        }
                        try {
                            Trace.beginSection(str);
                            getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc = recyclerView4.onCreatePanelMenu;
                            RecyclerView.Adapter adapter = recyclerView4.MediaSessionCompatResultReceiverWrapper;
                            getintrinsicsizenhjbrc.MediaMetadataCompat = 1;
                            getintrinsicsizenhjbrc.MediaDescriptionCompat = adapter.getItemCount();
                            getintrinsicsizenhjbrc.write = false;
                            getintrinsicsizenhjbrc.MediaSessionCompatResultReceiverWrapper = false;
                            getintrinsicsizenhjbrc.RatingCompat = false;
                            for (int i9 = 0; i9 < isactive3.read * 2; i9 += 2) {
                                RemoteActionCompatParcelizer(recyclerView4, ((int[]) isactive3.RemoteActionCompatParcelizer)[i9], j);
                            }
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    }
                    r5 = 0;
                }
            }
            getdstover0no6vwu.serializer = r5;
            getdstover0no6vwu.read = r5;
            getdstover0no6vwu.write = r5;
            getdstover0no6vwu.IconCompatParcelizer = null;
            getdstover0no6vwu.RemoteActionCompatParcelizer = r5;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.read;
        try {
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    prefetch(TimeUnit.MILLISECONDS.toNanos(jMax) + this.RemoteActionCompatParcelizer);
                }
            }
        } finally {
            this.IconCompatParcelizer = 0L;
            Trace.endSection();
        }
    }
}
