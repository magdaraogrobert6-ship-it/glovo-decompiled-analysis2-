package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes.dex */
public final class computeHorizontalBounds {
    public final MutableStateFlow IconCompatParcelizer;
    public final StateFlow MediaBrowserCompatMediaItem;
    public boolean MediaDescriptionCompat;
    public createBitmapx__hDUui_graphics MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public final StateFlow MediaSessionCompatResultReceiverWrapper;
    public final LinkedHashSet MediaSessionCompatToken;
    public final BrazeContentCardsManager ParcelableVolumeInfo;
    public final LinkedHashSet PlaybackStateCompat;
    public computeCubicVerticalBounds PlaybackStateCompatCustomAction;
    public boolean RatingCompat;
    public final BrazeContentCardsManager RemoteActionCompatParcelizer;
    public final LinkedHashSet read;
    public boolean serializer;
    public final MutableStateFlow write;

    public final createBitmapx__hDUui_graphics read(int i) {
        Object next;
        Object next2;
        BrazeContentCardsManager brazeContentCardsManager = this.RemoteActionCompatParcelizer;
        BrazeContentCardsManager brazeContentCardsManager2 = this.ParcelableVolumeInfo;
        Object obj = null;
        if (i == -1) {
            Iterator it = brazeContentCardsManager2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((createBitmapx__hDUui_graphics) next).MediaMetadataCompat);
            createBitmapx__hDUui_graphics createbitmapx__hduui_graphics = (createBitmapx__hDUui_graphics) next;
            if (createbitmapx__hduui_graphics != null) {
                return createbitmapx__hduui_graphics;
            }
            for (Object obj2 : brazeContentCardsManager) {
                if (((createBitmapx__hDUui_graphics) obj2).MediaMetadataCompat) {
                    obj = obj2;
                    break;
                }
            }
            return (createBitmapx__hDUui_graphics) obj;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it2 = brazeContentCardsManager2.iterator();
            while (it2.hasNext()) {
                ((createBitmapx__hDUui_graphics) it2.next()).getClass();
            }
            Iterator it3 = brazeContentCardsManager.iterator();
            while (it3.hasNext()) {
                ((createBitmapx__hDUui_graphics) it3.next()).getClass();
            }
            return null;
        }
        Iterator it4 = brazeContentCardsManager2.iterator();
        do {
            if (!it4.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it4.next();
        } while (!((createBitmapx__hDUui_graphics) next2).MediaMetadataCompat);
        createBitmapx__hDUui_graphics createbitmapx__hduui_graphics2 = (createBitmapx__hDUui_graphics) next2;
        if (createbitmapx__hduui_graphics2 != null) {
            return createbitmapx__hduui_graphics2;
        }
        for (Object obj3 : brazeContentCardsManager) {
            if (((createBitmapx__hDUui_graphics) obj3).MediaMetadataCompat) {
                obj = obj3;
                break;
            }
        }
        return (createBitmapx__hDUui_graphics) obj;
    }

    public final void read() {
        boolean z;
        boolean z2;
        computeCubicVerticalBoundsdefault computecubicverticalboundsdefault;
        BrazeContentCardsManager brazeContentCardsManager = this.ParcelableVolumeInfo;
        if (brazeContentCardsManager != null && brazeContentCardsManager.isEmpty()) {
            z = false;
            break;
        }
        Iterator it = brazeContentCardsManager.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (((createBitmapx__hDUui_graphics) it.next()).MediaMetadataCompat) {
                z = true;
                break;
            }
        }
        BrazeContentCardsManager brazeContentCardsManager2 = this.RemoteActionCompatParcelizer;
        if (brazeContentCardsManager2 != null && brazeContentCardsManager2.isEmpty()) {
            z2 = false;
            break;
        }
        Iterator it2 = brazeContentCardsManager2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z2 = false;
                break;
            } else if (((createBitmapx__hDUui_graphics) it2.next()).MediaMetadataCompat) {
                z2 = true;
                break;
            }
        }
        boolean z3 = z || z2;
        boolean z4 = this.RatingCompat != z;
        boolean z5 = this.MediaDescriptionCompat != z2;
        boolean z6 = this.serializer != z3;
        LinkedHashSet linkedHashSet = this.MediaSessionCompatToken;
        if (z4) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((computeCubicVerticalBounds) it3.next()).serializer(z);
            }
        }
        LinkedHashSet linkedHashSet2 = this.read;
        if (z5) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((computeCubicVerticalBounds) it4.next()).serializer(z2);
            }
        }
        LinkedHashSet linkedHashSet3 = this.PlaybackStateCompat;
        if (z6) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((computeCubicVerticalBounds) it5.next()).serializer(z3);
            }
        }
        this.RatingCompat = z;
        this.MediaDescriptionCompat = z2;
        this.serializer = z3;
        createBitmapx__hDUui_graphics createbitmapx__hduui_graphics = this.MediaMetadataCompat;
        if (createbitmapx__hduui_graphics == null) {
            createbitmapx__hduui_graphics = read(0);
        }
        createBitmapx__hDUui_graphics createbitmapx__hduui_graphics2 = this.MediaMetadataCompat;
        if (createbitmapx__hduui_graphics2 == null) {
            createbitmapx__hduui_graphics2 = read(0);
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{createbitmapx__hduui_graphics2, createbitmapx__hduui_graphics}, getCieXyz.write())).booleanValue()) {
            if (createbitmapx__hduui_graphics2 == null) {
                computecubicverticalboundsdefault = new computeCubicVerticalBoundsdefault();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = brazeContentCardsManager.iterator();
                while (it6.hasNext()) {
                    boolean z7 = ((createBitmapx__hDUui_graphics) it6.next()).MediaMetadataCompat;
                }
                Iterator<E> it7 = brazeContentCardsManager2.iterator();
                while (it7.hasNext()) {
                    boolean z8 = ((createBitmapx__hDUui_graphics) it7.next()).MediaMetadataCompat;
                }
                computeHorizontalBoundsdefault computehorizontalboundsdefault = createbitmapx__hduui_graphics2.IconCompatParcelizer;
                BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda0 = (BaseContentCardViewExternalSyntheticLambda0) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -1169780863, new Object[0], getQueryParameterslambda2.serializer(), 1169780871, getQueryParameterslambda2.serializer());
                onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) arrayList, (Collection) baseContentCardViewExternalSyntheticLambda0);
                baseContentCardViewExternalSyntheticLambda0.add(computehorizontalboundsdefault);
                onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) instance_delegatelambda0.write, (Collection) baseContentCardViewExternalSyntheticLambda0);
                computecubicverticalboundsdefault = new computeCubicVerticalBoundsdefault(androidx.sqlite.SQLite.serializer((List) baseContentCardViewExternalSyntheticLambda0), arrayList.size());
            }
            MutableStateFlow mutableStateFlow = this.write;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(computeCubicVerticalBoundsdefault) mutableStateFlow.read(), computecubicverticalboundsdefault}, getCieXyz.write())).booleanValue()) {
                return;
            }
            mutableStateFlow.IconCompatParcelizer(computecubicverticalboundsdefault);
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((computeCubicVerticalBounds) it8.next()).getClass();
            }
            Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((computeCubicVerticalBounds) it9.next()).getClass();
            }
            Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((computeCubicVerticalBounds) it10.next()).getClass();
            }
        }
    }

    public computeHorizontalBounds() {
        MutableStateFlow mutableStateFlow = StateFlowKt.read(closeTo.RemoteActionCompatParcelizer);
        this.IconCompatParcelizer = mutableStateFlow;
        this.MediaSessionCompatResultReceiverWrapper = FlowKt.write(mutableStateFlow);
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(new computeCubicVerticalBoundsdefault());
        this.write = mutableStateFlow2;
        this.MediaBrowserCompatMediaItem = FlowKt.write(mutableStateFlow2);
        this.ParcelableVolumeInfo = new BrazeContentCardsManager();
        this.RemoteActionCompatParcelizer = new BrazeContentCardsManager();
        this.PlaybackStateCompat = new LinkedHashSet();
        this.read = new LinkedHashSet();
        this.MediaSessionCompatToken = new LinkedHashSet();
    }

    public final void IconCompatParcelizer(clampValidRootInUnitRange clampvalidrootinunitrange, computeCubicVerticalBounds computecubicverticalbounds, int i) {
        LinkedHashSet linkedHashSet;
        boolean z;
        clampvalidrootinunitrange.getClass();
        if (computecubicverticalbounds.RemoteActionCompatParcelizer != null) {
            StringBuilder sb = new StringBuilder("Input '");
            sb.append(computecubicverticalbounds);
            clampValidRootInUnitRange clampvalidrootinunitrange2 = computecubicverticalbounds.RemoteActionCompatParcelizer;
            sb.append("' is already added to dispatcher ");
            sb.append(clampvalidrootinunitrange2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (i != 0) {
            linkedHashSet = i != 1 ? this.PlaybackStateCompat : this.read;
        } else {
            linkedHashSet = this.MediaSessionCompatToken;
        }
        linkedHashSet.add(computecubicverticalbounds);
        computecubicverticalbounds.RemoteActionCompatParcelizer = clampvalidrootinunitrange;
        ((computeCubicVerticalBoundsdefault) this.MediaBrowserCompatMediaItem.read()).getClass();
        if (i != 0) {
            z = i != 1 ? this.serializer : this.MediaDescriptionCompat;
        } else {
            z = this.RatingCompat;
        }
        computecubicverticalbounds.serializer(z);
    }
}
