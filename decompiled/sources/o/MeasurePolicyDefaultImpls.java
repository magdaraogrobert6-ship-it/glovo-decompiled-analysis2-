package o;

import android.os.Bundle;
import android.os.SystemClock;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.mlkit.vision.barcode.internal.zzl;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.location.logic.zp;
import io.grpc.SynchronizationContext$1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class MeasurePolicyDefaultImpls implements Runnable {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object MediaSessionCompatQueueItem;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ long serializer;
    public final /* synthetic */ Object write;

    public MeasurePolicyDefaultImpls(OnFirstVisibleNode onFirstVisibleNode, Bundle bundle, getViewportBounds getviewportbounds, getViewportBounds getviewportbounds2, long j) {
        this.IconCompatParcelizer = 3;
        this.RemoteActionCompatParcelizer = bundle;
        this.read = getviewportbounds;
        this.write = getviewportbounds2;
        this.serializer = j;
        Objects.requireNonNull(onFirstVisibleNode);
        this.MediaSessionCompatQueueItem = onFirstVisibleNode;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.IconCompatParcelizer;
        long j = this.serializer;
        Object obj = this.write;
        Object obj2 = this.read;
        Object obj3 = this.RemoteActionCompatParcelizer;
        Object obj4 = this.MediaSessionCompatQueueItem;
        if (i == 0) {
            String str = (String) obj2;
            LookaheadScopeKtdefaultPlacementApproachInProgress1 lookaheadScopeKtdefaultPlacementApproachInProgress1 = (LookaheadScopeKtdefaultPlacementApproachInProgress1) obj4;
            String str2 = (String) obj3;
            if (str2 == null) {
                zzpg zzpgVar = lookaheadScopeKtdefaultPlacementApproachInProgress1.serializer;
                zzpgVar.PlaybackStateCompat().MediaSessionCompatToken();
                String str3 = zzpgVar.MediaMetadataCompat;
                if (str3 == null || str3.equals(str)) {
                    zzpgVar.MediaMetadataCompat = str;
                    zzpgVar.RatingCompat = null;
                    return;
                }
                return;
            }
            getViewportBounds getviewportbounds = new getViewportBounds((String) obj, str2, j);
            zzpg zzpgVar2 = lookaheadScopeKtdefaultPlacementApproachInProgress1.serializer;
            zzpgVar2.PlaybackStateCompat().MediaSessionCompatToken();
            String str4 = zzpgVar2.MediaMetadataCompat;
            if (str4 != null) {
                str4.equals(str);
            }
            zzpgVar2.MediaMetadataCompat = str;
            zzpgVar2.RatingCompat = getviewportbounds;
            return;
        }
        if (i == 1) {
            final toMotionEventScoped4ec7I tomotioneventscoped4ec7i = (toMotionEventScoped4ec7I) obj3;
            final PointerInteropFilterpointerInputFilter1dispatchToView2 pointerInteropFilterpointerInputFilter1dispatchToView2 = (PointerInteropFilterpointerInputFilter1dispatchToView2) obj2;
            resetFakeFingerGesture resetfakefingergesture = (resetFakeFingerGesture) obj;
            final i$d.a aVar = (i$d.a) obj4;
            HashMap map = tomotioneventscoped4ec7i.PlaybackStateCompatCustomAction;
            if (!map.containsKey(pointerInteropFilterpointerInputFilter1dispatchToView2)) {
                map.put(pointerInteropFilterpointerInputFilter1dispatchToView2, new getPointerIconService());
            }
            getPointerIconService getpointericonservice = (getPointerIconService) map.get(pointerInteropFilterpointerInputFilter1dispatchToView2);
            Long lValueOf = Long.valueOf(j);
            HoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1 hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1 = getpointericonservice.IconCompatParcelizer;
            Collection collection = (Collection) hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.get(resetfakefingergesture);
            if (collection == null) {
                ArrayList arrayList = new ArrayList(3);
                if (!arrayList.add(lValueOf)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write((Object) "New Collection violated the Collection spec");
                    return;
                }
                hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.put(resetfakefingergesture, arrayList);
            } else {
                collection.add(lValueOf);
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (tomotioneventscoped4ec7i.serializer(pointerInteropFilterpointerInputFilter1dispatchToView2, jElapsedRealtime)) {
                tomotioneventscoped4ec7i.PlaybackStateCompat.put(pointerInteropFilterpointerInputFilter1dispatchToView2, Long.valueOf(jElapsedRealtime));
                getScaledHandwritingGestureLineMargin.INSTANCE.execute(new Runnable() { // from class: o.PointerType
                    @Override // java.lang.Runnable
                    public final void run() {
                        toMotionEventScoped4ec7I tomotioneventscoped4ec7i2 = tomotioneventscoped4ec7i;
                        HashMap map2 = tomotioneventscoped4ec7i2.PlaybackStateCompatCustomAction;
                        PointerInteropFilterpointerInputFilter1dispatchToView2 pointerInteropFilterpointerInputFilter1dispatchToView3 = pointerInteropFilterpointerInputFilter1dispatchToView2;
                        getPointerIconService getpointericonservice2 = (getPointerIconService) map2.get(pointerInteropFilterpointerInputFilter1dispatchToView3);
                        if (getpointericonservice2 != null) {
                            for (Object obj5 : (onExit) getpointericonservice2.read()) {
                                Object arrayList2 = (Collection) getpointericonservice2.IconCompatParcelizer.get(obj5);
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList(3);
                                }
                                List list = (List) arrayList2;
                                ArrayList arrayList3 = new ArrayList(list instanceof RandomAccess ? new getTouchBoundsExpansionRZrCHBk(getpointericonservice2, obj5, list, null) : new getBeyondBoundsLayout(getpointericonservice2, obj5, list, (getBeyondBoundsLayout) null));
                                Collections.sort(arrayList3);
                                accessapplyPausedPrecomposition accessapplypausedprecomposition = new accessapplyPausedPrecomposition();
                                Iterator it = arrayList3.iterator();
                                long jLongValue = 0;
                                while (it.hasNext()) {
                                    jLongValue += ((Long) it.next()).longValue();
                                }
                                accessapplypausedprecomposition.write = Long.valueOf((jLongValue / ((long) arrayList3.size())) & Long.MAX_VALUE);
                                accessapplypausedprecomposition.RemoteActionCompatParcelizer = Long.valueOf(toMotionEventScoped4ec7I.IconCompatParcelizer(arrayList3, 100.0d) & Long.MAX_VALUE);
                                accessapplypausedprecomposition.MediaDescriptionCompat = Long.valueOf(toMotionEventScoped4ec7I.IconCompatParcelizer(arrayList3, 75.0d) & Long.MAX_VALUE);
                                accessapplypausedprecomposition.serializer = Long.valueOf(toMotionEventScoped4ec7I.IconCompatParcelizer(arrayList3, 50.0d) & Long.MAX_VALUE);
                                accessapplypausedprecomposition.IconCompatParcelizer = Long.valueOf(toMotionEventScoped4ec7I.IconCompatParcelizer(arrayList3, 25.0d) & Long.MAX_VALUE);
                                accessapplypausedprecomposition.read = Long.valueOf(toMotionEventScoped4ec7I.IconCompatParcelizer(arrayList3, 0.0d) & Long.MAX_VALUE);
                                PointerInteropFilter pointerInteropFilter = new PointerInteropFilter(accessapplypausedprecomposition);
                                int size = arrayList3.size();
                                zzl zzlVar = (zzl) aVar.read;
                                resetFakeFingerGesture resetfakefingergesture2 = (resetFakeFingerGesture) obj5;
                                androidx.lifecycle.BlockRunner blockRunner = new androidx.lifecycle.BlockRunner();
                                blockRunner.RatingCompat = zzlVar.PlaybackStateCompatCustomAction ? setDisallowInterceptui.TYPE_THICK : setDisallowInterceptui.TYPE_THIN;
                                createPointerInputEventDataInuC1xA createpointerinputeventdatainuc1xa = new createPointerInputEventDataInuC1xA();
                                createpointerinputeventdatainuc1xa.IconCompatParcelizer = Integer.valueOf(size & Integer.MAX_VALUE);
                                createpointerinputeventdatainuc1xa.RemoteActionCompatParcelizer = resetfakefingergesture2;
                                createpointerinputeventdatainuc1xa.read = pointerInteropFilter;
                                blockRunner.IconCompatParcelizer = new convertToPointerInputEventui(createpointerinputeventdatainuc1xa);
                                getScaledHandwritingGestureLineMargin.INSTANCE.execute(new ImageVectorCacheImageVectorEntry((Object) tomotioneventscoped4ec7i2, (Object) new zp(blockRunner, 0), (Enum) pointerInteropFilterpointerInputFilter1dispatchToView3, tomotioneventscoped4ec7i2.write(), 4));
                            }
                            map2.remove(pointerInteropFilterpointerInputFilter1dispatchToView3);
                        }
                    }
                });
                return;
            }
            return;
        }
        if (i != 2) {
            OnFirstVisibleNode onFirstVisibleNode = (OnFirstVisibleNode) obj4;
            Bundle bundle = (Bundle) obj3;
            onFirstVisibleNode.getClass();
            bundle.remove("screen_name");
            bundle.remove("screen_class");
            onLayoutRectChangeddefault onlayoutrectchangeddefault = ((LookaheadScopeKtLookaheadScope221) onFirstVisibleNode.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
            onFirstVisibleNode.read((getViewportBounds) obj2, (getViewportBounds) obj, this.serializer, true, onlayoutrectchangeddefault.read("screen_view", bundle, null, false));
            return;
        }
        resetLayoutState resetlayoutstate = (resetLayoutState) obj3;
        accessgetRootp accessgetrootp = (accessgetRootp) obj2;
        computeFillWidthiLBOSCw computefillwidthilboscw = (computeFillWidthiLBOSCw) obj;
        i$d.a aVar2 = (i$d.a) obj4;
        HashMap map2 = resetlayoutstate.MediaSessionCompatResultReceiverWrapper;
        if (!map2.containsKey(accessgetrootp)) {
            getFillWidthannotations getfillwidthannotations = new getFillWidthannotations();
            getLambda641200809ui getlambda641200809ui = new getLambda641200809ui();
            if (!getfillwidthannotations.isEmpty()) {
                DrawableTransformation.write();
                throw null;
            }
            getlambda641200809ui.serializer = getfillwidthannotations;
            map2.put(accessgetrootp, getlambda641200809ui);
        }
        getLambda641200809ui getlambda641200809ui2 = (getLambda641200809ui) map2.get(accessgetrootp);
        Long lValueOf2 = Long.valueOf(j);
        getFillWidthannotations getfillwidthannotations2 = getlambda641200809ui2.serializer;
        Collection collection2 = (Collection) getfillwidthannotations2.get(computefillwidthilboscw);
        if (collection2 == null) {
            ArrayList arrayList2 = new ArrayList(3);
            if (!arrayList2.add(lValueOf2)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write((Object) "New Collection violated the Collection spec");
                return;
            } else {
                getlambda641200809ui2.read++;
                getfillwidthannotations2.put(computefillwidthilboscw, arrayList2);
            }
        } else if (collection2.add(lValueOf2)) {
            getlambda641200809ui2.read++;
        }
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        if (resetlayoutstate.IconCompatParcelizer(accessgetrootp, jElapsedRealtime2)) {
            resetlayoutstate.PlaybackStateCompatCustomAction.put(accessgetrootp, Long.valueOf(jElapsedRealtime2));
            getScaledHandwritingGestureLineMargin.INSTANCE.execute(new SynchronizationContext$1(resetlayoutstate, accessgetrootp, aVar2, 4));
        }
    }

    public MeasurePolicyDefaultImpls(LookaheadScopeKtdefaultPlacementApproachInProgress1 lookaheadScopeKtdefaultPlacementApproachInProgress1, String str, String str2, String str3, long j) {
        this.IconCompatParcelizer = 0;
        this.RemoteActionCompatParcelizer = str;
        this.read = str2;
        this.write = str3;
        this.serializer = j;
        this.MediaSessionCompatQueueItem = lookaheadScopeKtdefaultPlacementApproachInProgress1;
    }

    public /* synthetic */ MeasurePolicyDefaultImpls(Object obj, Enum r2, Object obj2, long j, Object obj3, int i) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = obj;
        this.read = r2;
        this.write = obj2;
        this.serializer = j;
        this.MediaSessionCompatQueueItem = obj3;
    }
}
