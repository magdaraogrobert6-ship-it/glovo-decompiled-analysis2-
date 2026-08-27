package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.firebase.FirebaseApp$$ExternalSyntheticLambda0;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import com.incognia.internal.ND$$ExternalSyntheticLambda0;
import io.grpc.LoadBalancer$Helper;
import io.sentry.android.core.SentryLogcatAdapter;
import io.sentry.util.UrlUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class getPositionnOccac implements getMeasureResultui {
    public static final invalidateAlignmentLinesFromPositionChange serializer = new invalidateAlignmentLinesFromPositionChange(0);
    public final setPlacedUnderMotionFrameOfReference RemoteActionCompatParcelizer;
    public final isPlacedUnderMotionFrameOfReference read;
    public final HashMap write = new HashMap();
    public final HashMap MediaSessionCompatQueueItem = new HashMap();
    public final HashMap RatingCompat = new HashMap();
    public final HashSet MediaMetadataCompat = new HashSet();
    public final AtomicReference IconCompatParcelizer = new AtomicReference();

    @Override // o.getMeasureResultui
    public final AbstractComposeViewExternalSyntheticLambda0 RemoteActionCompatParcelizer(LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 lookaheadCapablePlaceableCompaniononCommitAffectingRuler1) {
        synchronized (this) {
            isPlacingForAlignmentui isplacingforalignmentui = (isPlacingForAlignmentui) this.RatingCompat.get(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1);
            if (isplacingforalignmentui != null) {
                return isplacingforalignmentui;
            }
            return serializer;
        }
    }

    public final void IconCompatParcelizer() {
        HashMap map = this.MediaSessionCompatQueueItem;
        HashMap map2 = this.RatingCompat;
        for (getHasMeasureResult gethasmeasureresult : this.write.keySet()) {
            for (provideRelativeRulerValue providerelativerulervalue : gethasmeasureresult.read) {
                boolean z = providerelativerulervalue.write == 2;
                LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 lookaheadCapablePlaceableCompaniononCommitAffectingRuler1 = providerelativerulervalue.serializer;
                if (z && !map2.containsKey(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1)) {
                    Set set = Collections.EMPTY_SET;
                    isPlacingForAlignmentui isplacingforalignmentui = new isPlacingForAlignmentui();
                    isplacingforalignmentui.read = null;
                    isplacingforalignmentui.serializer = Collections.newSetFromMap(new ConcurrentHashMap());
                    isplacingforalignmentui.serializer.addAll(set);
                    map2.put(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1, isplacingforalignmentui);
                } else if (map.containsKey(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1)) {
                    continue;
                } else {
                    int i = providerelativerulervalue.write;
                    if (i == 1) {
                        throw new MissingDependencyException("Unsatisfied dependency for component " + gethasmeasureresult + ": " + lookaheadCapablePlaceableCompaniononCommitAffectingRuler1);
                    }
                    if (i != 2) {
                        map.put(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1, new updatePlacedUnderMotionFrameOfReference(updatePlacedUnderMotionFrameOfReference.write, updatePlacedUnderMotionFrameOfReference.IconCompatParcelizer));
                    }
                }
            }
        }
    }

    public final ArrayList read(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            getHasMeasureResult gethasmeasureresult = (getHasMeasureResult) it.next();
            if (gethasmeasureresult.MediaMetadataCompat == 0) {
                AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0 = (AbstractComposeViewExternalSyntheticLambda0) this.write.get(gethasmeasureresult);
                for (LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 lookaheadCapablePlaceableCompaniononCommitAffectingRuler1 : gethasmeasureresult.serializer) {
                    HashMap map = this.MediaSessionCompatQueueItem;
                    if (map.containsKey(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1)) {
                        arrayList2.add(new ND$$ExternalSyntheticLambda0((updatePlacedUnderMotionFrameOfReference) ((AbstractComposeViewExternalSyntheticLambda0) map.get(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1)), 8, abstractComposeViewExternalSyntheticLambda0));
                    } else {
                        map.put(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1, abstractComposeViewExternalSyntheticLambda0);
                    }
                }
            }
        }
        return arrayList2;
    }

    @Override // o.getMeasureResultui
    public final AbstractComposeViewExternalSyntheticLambda0 IconCompatParcelizer(LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 lookaheadCapablePlaceableCompaniononCommitAffectingRuler1) {
        AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0;
        synchronized (this) {
            int iIconCompatParcelizer = trackEventI.IconCompatParcelizer();
            int iIconCompatParcelizer2 = trackEventI.IconCompatParcelizer();
            int iIconCompatParcelizer3 = trackEventI.IconCompatParcelizer();
            UrlUtils.RemoteActionCompatParcelizer(iIconCompatParcelizer, trackEventI.IconCompatParcelizer(), iIconCompatParcelizer2, 1390870901, -1390870897, iIconCompatParcelizer3, new Object[]{lookaheadCapablePlaceableCompaniononCommitAffectingRuler1, "Null interface requested."});
            abstractComposeViewExternalSyntheticLambda0 = (AbstractComposeViewExternalSyntheticLambda0) this.MediaSessionCompatQueueItem.get(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1);
        }
        return abstractComposeViewExternalSyntheticLambda0;
    }

    public final void RemoteActionCompatParcelizer(HashMap map, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            getHasMeasureResult gethasmeasureresult = (getHasMeasureResult) entry.getKey();
            AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0 = (AbstractComposeViewExternalSyntheticLambda0) entry.getValue();
            int i = gethasmeasureresult.write;
            if (i == 1 || (i == 2 && z)) {
                abstractComposeViewExternalSyntheticLambda0.write();
            }
        }
        setPlacedUnderMotionFrameOfReference setplacedundermotionframeofreference = this.RemoteActionCompatParcelizer;
        synchronized (setplacedundermotionframeofreference) {
            arrayDeque = setplacedundermotionframeofreference.IconCompatParcelizer;
            if (arrayDeque != null) {
                setplacedundermotionframeofreference.IconCompatParcelizer = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw ff$$ExternalSyntheticOutline0.m(it);
            }
        }
    }

    public final ArrayList write() {
        HashMap map = this.RatingCompat;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : this.write.entrySet()) {
            getHasMeasureResult gethasmeasureresult = (getHasMeasureResult) entry.getKey();
            if (gethasmeasureresult.MediaMetadataCompat != 0) {
                AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0 = (AbstractComposeViewExternalSyntheticLambda0) entry.getValue();
                for (LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 lookaheadCapablePlaceableCompaniononCommitAffectingRuler1 : gethasmeasureresult.serializer) {
                    if (!map2.containsKey(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1)) {
                        map2.put(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1, new HashSet());
                    }
                    ((Set) map2.get(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1)).add(abstractComposeViewExternalSyntheticLambda0);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                isPlacingForAlignmentui isplacingforalignmentui = (isPlacingForAlignmentui) map.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new ND$$ExternalSyntheticLambda0(isplacingforalignmentui, 9, (AbstractComposeViewExternalSyntheticLambda0) it.next()));
                }
            } else {
                LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 lookaheadCapablePlaceableCompaniononCommitAffectingRuler2 = (LookaheadCapablePlaceableCompaniononCommitAffectingRuler1) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                isPlacingForAlignmentui isplacingforalignmentui2 = new isPlacingForAlignmentui();
                isplacingforalignmentui2.read = null;
                isplacingforalignmentui2.serializer = Collections.newSetFromMap(new ConcurrentHashMap());
                isplacingforalignmentui2.serializer.addAll(set);
                map.put(lookaheadCapablePlaceableCompaniononCommitAffectingRuler2, isplacingforalignmentui2);
            }
        }
        return arrayList;
    }

    public getPositionnOccac(Executor executor, ArrayList arrayList, ArrayList arrayList2, isPlacedUnderMotionFrameOfReference isplacedundermotionframeofreference) {
        setPlacedUnderMotionFrameOfReference setplacedundermotionframeofreference = new setPlacedUnderMotionFrameOfReference(executor);
        this.RemoteActionCompatParcelizer = setplacedundermotionframeofreference;
        this.read = isplacedundermotionframeofreference;
        ArrayList<getHasMeasureResult> arrayList3 = new ArrayList();
        arrayList3.add(getHasMeasureResult.IconCompatParcelizer(setplacedundermotionframeofreference, setPlacedUnderMotionFrameOfReference.class, hasui.class, getTailui.class));
        arrayList3.add(getHasMeasureResult.IconCompatParcelizer(this, getPositionnOccac.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            getHasMeasureResult gethasmeasureresult = (getHasMeasureResult) it.next();
            if (gethasmeasureresult != null) {
                arrayList3.add(gethasmeasureresult);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((AbstractComposeViewExternalSyntheticLambda0) it3.next()).write();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.read.IconCompatParcelizer(componentRegistrar));
                        it3.remove();
                    }
                } catch (InvalidRegistrarException e) {
                    it3.remove();
                    SentryLogcatAdapter.write("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                for (Object obj : ((getHasMeasureResult) it4.next()).serializer.toArray()) {
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (this.MediaMetadataCompat.contains(obj.toString())) {
                            it4.remove();
                            break;
                        }
                        this.MediaMetadataCompat.add(obj.toString());
                    }
                }
            }
            if (this.write.isEmpty()) {
                LoadBalancer$Helper.IconCompatParcelizer(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.write.keySet());
                arrayList6.addAll(arrayList3);
                LoadBalancer$Helper.IconCompatParcelizer(arrayList6);
            }
            for (getHasMeasureResult gethasmeasureresult2 : arrayList3) {
                this.write.put(gethasmeasureresult2, new provideRulerValue(new FirebaseApp$$ExternalSyntheticLambda0(this, 1, gethasmeasureresult2)));
            }
            arrayList5.addAll(read(arrayList3));
            arrayList5.addAll(write());
            IconCompatParcelizer();
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        Boolean bool = (Boolean) this.IconCompatParcelizer.get();
        if (bool != null) {
            RemoteActionCompatParcelizer(this.write, bool.booleanValue());
        }
    }

    public final void IconCompatParcelizer(boolean z) {
        HashMap map;
        AtomicReference atomicReference = this.IconCompatParcelizer;
        while (!atomicReference.compareAndSet(null, Boolean.valueOf(z))) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            map = new HashMap(this.write);
        }
        RemoteActionCompatParcelizer(map, z);
    }

    @Override // o.getMeasureResultui
    public final updatePlacedUnderMotionFrameOfReference serializer(LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 lookaheadCapablePlaceableCompaniononCommitAffectingRuler1) {
        AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0IconCompatParcelizer = IconCompatParcelizer(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1);
        if (abstractComposeViewExternalSyntheticLambda0IconCompatParcelizer == null) {
            return new updatePlacedUnderMotionFrameOfReference(updatePlacedUnderMotionFrameOfReference.write, updatePlacedUnderMotionFrameOfReference.IconCompatParcelizer);
        }
        return abstractComposeViewExternalSyntheticLambda0IconCompatParcelizer instanceof updatePlacedUnderMotionFrameOfReference ? (updatePlacedUnderMotionFrameOfReference) abstractComposeViewExternalSyntheticLambda0IconCompatParcelizer : new updatePlacedUnderMotionFrameOfReference(null, abstractComposeViewExternalSyntheticLambda0IconCompatParcelizer);
    }
}
