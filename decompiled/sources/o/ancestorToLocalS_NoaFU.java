package o;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import bo.app.w4$$ExternalSyntheticLambda0;
import bo.app.wg$$ExternalSyntheticLambda0;
import coil3.disk.DiskLruCache$Editor;
import com.google.android.gms.internal.gtm.zzkh;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.location.Vw$Vw;
import com.sentiance.core.model.events.I$b;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ancestorToLocalS_NoaFU {
    public setOffset IconCompatParcelizer;
    public final I$b MediaSessionCompatQueueItem;
    public androidx.transition.TransitionValuesMaps ParcelableVolumeInfo;
    public final getAccessibilityManager PlaybackStateCompatCustomAction;
    public final HashMap RatingCompat = new HashMap();
    public final HashMap MediaBrowserCompatMediaItem = new HashMap();
    public final LinkedHashSet RemoteActionCompatParcelizer = new LinkedHashSet();
    public final HashMap write = new HashMap();
    public final HashMap serializer = new HashMap();
    public final i$d read = new i$d(27);
    public final HashMap MediaDescriptionCompat = new HashMap();
    public final getUseEvaluationsCachefwf_client_release PlaybackStateCompat = new getUseEvaluationsCachefwf_client_release(1, 1);
    public final HashMap MediaMetadataCompat = new HashMap();

    public static void write(Status status, String str, Object... objArr) {
        invokeMethodQuietly invokemethodquietly = status.PlaybackStateCompat;
        String str2 = status.ComponentActivity;
        if (str2 == null) {
            str2 = "";
        }
        if ((invokemethodquietly == invokeMethodQuietly.FAILED_PRECONDITION && str2.contains("requires an index")) || invokemethodquietly == invokeMethodQuietly.PERMISSION_DENIED) {
            onEndApplyChanges.RemoteActionCompatParcelizer("Firestore", "%s: %s", String.format(str, objArr), status);
        }
    }

    public final void RemoteActionCompatParcelizer() {
        while (true) {
            LinkedHashSet linkedHashSet = this.RemoteActionCompatParcelizer;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            HashMap map = this.write;
            if (map.size() >= 100) {
                return;
            }
            Iterator it = linkedHashSet.iterator();
            visitNodes visitnodes = (visitNodes) it.next();
            it.remove();
            getUseEvaluationsCachefwf_client_release getuseevaluationscachefwf_client_release = this.PlaybackStateCompat;
            int i = getuseevaluationscachefwf_client_release.write;
            getuseevaluationscachefwf_client_release.write = i + 2;
            this.serializer.put(Integer.valueOf(i), new drawContainedDrawModifiers(visitnodes));
            map.put(visitnodes, Integer.valueOf(i));
            this.PlaybackStateCompatCustomAction.write(new setLastShapeui(new getSnapshotObserver(accessgetPointerInputSourcecp.IconCompatParcelizer(visitnodes.RemoteActionCompatParcelizer).serializer()), i, -1L, getWasLayerBlockInvokedui.LIMBO_RESOLUTION));
        }
    }

    public final int read(accesssetLastLayerDrawingWasSkippedp accesssetlastlayerdrawingwasskippedp, boolean z) {
        write("listen");
        HashMap map = this.RatingCompat;
        getRectManager.RemoteActionCompatParcelizer(!map.containsKey(accesssetlastlayerdrawingwasskippedp), "We already listen to query: %s", accesssetlastlayerdrawingwasskippedp);
        hitNearFh5PU_I hitnearfh5pu_i = accesssetlastlayerdrawingwasskippedp.read();
        I$b i$b = this.MediaSessionCompatQueueItem;
        setLastShapeui setlastshapeuiRemoteActionCompatParcelizer = i$b.RemoteActionCompatParcelizer(hitnearfh5pu_i);
        int i = setlastshapeuiRemoteActionCompatParcelizer.MediaSessionCompatQueueItem;
        getClipMetadata getclipmetadata = setlastshapeuiRemoteActionCompatParcelizer.write;
        com.huawei.agconnect.config.impl.m mVarIconCompatParcelizer = i$b.IconCompatParcelizer(accesssetlastlayerdrawingwasskippedp, true);
        isInExpandedTouchBoundsThDn1k isinexpandedtouchboundsthdn1k = isInExpandedTouchBoundsThDn1k.NONE;
        HashMap map2 = this.MediaBrowserCompatMediaItem;
        if (map2.get(Integer.valueOf(i)) != null) {
            isinexpandedtouchboundsthdn1k = ((fromParentPosition8S9VItkdefault) map.get((accesssetLastLayerDrawingWasSkippedp) ((List) map2.get(Integer.valueOf(i))).get(0))).write.RatingCompat;
        }
        boolean z2 = isinexpandedtouchboundsthdn1k == isInExpandedTouchBoundsThDn1k.SYNCED;
        asList aslist = visitNodes.IconCompatParcelizer;
        getFocusOwner getfocusowner = new getFocusOwner(getclipmetadata, z2, aslist, aslist, aslist);
        headNode headnode = new headNode(accesssetlastlayerdrawingwasskippedp, (asList) mVarIconCompatParcelizer.read);
        Vw$Vw vw$VwSerializer = headnode.serializer(headnode.write((accessswap) mVarIconCompatParcelizer.RemoteActionCompatParcelizer, null), getfocusowner, false);
        RemoteActionCompatParcelizer(i, (List) vw$VwSerializer.IconCompatParcelizer);
        map.put(accesssetlastlayerdrawingwasskippedp, new fromParentPosition8S9VItkdefault(accesssetlastlayerdrawingwasskippedp, i, headnode));
        if (!map2.containsKey(Integer.valueOf(i))) {
            map2.put(Integer.valueOf(i), new ArrayList(1));
        }
        ((List) map2.get(Integer.valueOf(i))).add(accesssetlastlayerdrawingwasskippedp);
        this.ParcelableVolumeInfo.read(Collections.singletonList((offsetFromEdgeMKHz9U) vw$VwSerializer.serializer));
        if (z) {
            this.PlaybackStateCompatCustomAction.write(setlastshapeuiRemoteActionCompatParcelizer);
        }
        return setlastshapeuiRemoteActionCompatParcelizer.MediaSessionCompatQueueItem;
    }

    public final void serializer(int i, Status status) {
        Map map = (Map) this.MediaDescriptionCompat.get(this.IconCompatParcelizer);
        if (map != null) {
            Integer numValueOf = Integer.valueOf(i);
            ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = (ParentDataModifierDefaultImpls) map.get(numValueOf);
            if (parentDataModifierDefaultImpls != null) {
                if (status != null) {
                    parentDataModifierDefaultImpls.RemoteActionCompatParcelizer(com.google.firebase.firestore.util.Util.serializer(status));
                } else {
                    parentDataModifierDefaultImpls.IconCompatParcelizer((Object) null);
                }
                map.remove(numValueOf);
            }
        }
    }

    public final void serializer(com.airbnb.lottie.parser.DropShadowEffect dropShadowEffect) {
        write("handleRemoteEvent");
        for (Map.Entry entry : ((Map) dropShadowEffect.RatingCompat).entrySet()) {
            Integer num = (Integer) entry.getKey();
            getFocusOwner getfocusowner = (getFocusOwner) entry.getValue();
            drawContainedDrawModifiers drawcontaineddrawmodifiers = (drawContainedDrawModifiers) this.serializer.get(num);
            if (drawcontaineddrawmodifiers != null) {
                asList aslist = getfocusowner.IconCompatParcelizer;
                asList aslist2 = getfocusowner.read;
                asList aslist3 = getfocusowner.RemoteActionCompatParcelizer;
                getRectManager.RemoteActionCompatParcelizer(aslist2.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer() + (aslist3.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer() + aslist.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer()) <= 1, "Limbo resolution for single document contains multiple changes.", new Object[0]);
                if (getfocusowner.IconCompatParcelizer.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer() > 0) {
                    drawcontaineddrawmodifiers.write = true;
                } else if (aslist3.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer() > 0) {
                    getRectManager.RemoteActionCompatParcelizer(drawcontaineddrawmodifiers.write, "Received change for limbo target document without add.", new Object[0]);
                } else if (aslist2.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer() > 0) {
                    getRectManager.RemoteActionCompatParcelizer(drawcontaineddrawmodifiers.write, "Received remove for limbo target document without add.", new Object[0]);
                    drawcontaineddrawmodifiers.write = false;
                }
            }
        }
        SnapshotVersion snapshotVersion = (SnapshotVersion) dropShadowEffect.read;
        I$b i$b = this.MediaSessionCompatQueueItem;
        serializer((accessswap) ((getMinimumTouchTargetSizeNHjbRc) i$b.IconCompatParcelizer).write("Apply remote event", new PreviewView$1$$ExternalSyntheticLambda2(i$b, dropShadowEffect, snapshotVersion, 12)), dropShadowEffect);
    }

    public final void serializer(accessswap accessswapVar, com.airbnb.lottie.parser.DropShadowEffect dropShadowEffect) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.RatingCompat.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            I$b i$b = this.MediaSessionCompatQueueItem;
            if (!zHasNext) {
                this.ParcelableVolumeInfo.read(arrayList);
                ((getMinimumTouchTargetSizeNHjbRc) i$b.IconCompatParcelizer).read(new w4$$ExternalSyntheticLambda0(i$b, 17, arrayList2), "notifyLocalViewChanges");
                return;
            }
            fromParentPosition8S9VItkdefault fromparentposition8s9vitkdefault = (fromParentPosition8S9VItkdefault) ((Map.Entry) it.next()).getValue();
            headNode headnode = fromparentposition8s9vitkdefault.write;
            int i = fromparentposition8s9vitkdefault.IconCompatParcelizer;
            DiskLruCache$Editor diskLruCache$EditorWrite = headnode.write(accessswapVar, null);
            boolean z = false;
            if (diskLruCache$EditorWrite.read) {
                diskLruCache$EditorWrite = headnode.write((accessswap) i$b.IconCompatParcelizer(fromparentposition8s9vitkdefault.serializer, false).RemoteActionCompatParcelizer, diskLruCache$EditorWrite);
            }
            getFocusOwner getfocusowner = dropShadowEffect != null ? (getFocusOwner) ((Map) dropShadowEffect.RatingCompat).get(Integer.valueOf(i)) : null;
            if (dropShadowEffect != null && ((Map) dropShadowEffect.write).get(Integer.valueOf(i)) != null) {
                z = true;
            }
            Vw$Vw vw$VwSerializer = fromparentposition8s9vitkdefault.write.serializer(diskLruCache$EditorWrite, getfocusowner, z);
            offsetFromEdgeMKHz9U offsetfromedgemkhz9u = (offsetFromEdgeMKHz9U) vw$VwSerializer.serializer;
            RemoteActionCompatParcelizer(i, (List) vw$VwSerializer.IconCompatParcelizer);
            if (offsetfromedgemkhz9u != null) {
                arrayList.add(offsetfromedgemkhz9u);
                ArrayList arrayList3 = new ArrayList();
                wg$$ExternalSyntheticLambda0 wg__externalsyntheticlambda0 = visitNodes.write;
                asList aslist = new asList(arrayList3, wg__externalsyntheticlambda0);
                asList aslist2 = new asList(new ArrayList(), wg__externalsyntheticlambda0);
                for (nodeInserted nodeinserted : offsetfromedgemkhz9u.serializer) {
                    int[] iArr = getLastShapeui.serializer;
                    nodeRemoved noderemoved = nodeinserted.read;
                    NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = nodeinserted.IconCompatParcelizer;
                    int i2 = iArr[noderemoved.ordinal()];
                    if (i2 == 1) {
                        aslist = aslist.IconCompatParcelizer(nodeCoordinatorCompanionPointerInputSource1.read);
                    } else if (i2 == 2) {
                        aslist2 = aslist2.IconCompatParcelizer(nodeCoordinatorCompanionPointerInputSource1.read);
                    }
                }
                arrayList2.add(new getLastClipui(i, offsetfromedgemkhz9u.MediaDescriptionCompat, aslist, aslist2));
            }
        }
    }

    public final void serializer(visitNodes visitnodes) {
        this.RemoteActionCompatParcelizer.remove(visitnodes);
        HashMap map = this.write;
        Integer num = (Integer) map.get(visitnodes);
        if (num != null) {
            this.PlaybackStateCompatCustomAction.serializer(num.intValue());
            map.remove(visitnodes);
            this.serializer.remove(num);
            RemoteActionCompatParcelizer();
        }
    }

    public final void write(accesssetLastLayerDrawingWasSkippedp accesssetlastlayerdrawingwasskippedp, boolean z) {
        write("stopListening");
        HashMap map = this.RatingCompat;
        fromParentPosition8S9VItkdefault fromparentposition8s9vitkdefault = (fromParentPosition8S9VItkdefault) map.get(accesssetlastlayerdrawingwasskippedp);
        getRectManager.RemoteActionCompatParcelizer(fromparentposition8s9vitkdefault != null, "Trying to stop listening to a query not found", new Object[0]);
        map.remove(accesssetlastlayerdrawingwasskippedp);
        int i = fromparentposition8s9vitkdefault.IconCompatParcelizer;
        List list = (List) this.MediaBrowserCompatMediaItem.get(Integer.valueOf(i));
        list.remove(accesssetlastlayerdrawingwasskippedp);
        if (list.isEmpty()) {
            I$b i$b = this.MediaSessionCompatQueueItem;
            ((getMinimumTouchTargetSizeNHjbRc) i$b.IconCompatParcelizer).read(new brazelogdefault(i$b, i, 9), "Release target");
            if (z) {
                this.PlaybackStateCompatCustomAction.serializer(i);
            }
            RemoteActionCompatParcelizer(i, Status.RatingCompat);
        }
    }

    public ancestorToLocalS_NoaFU(I$b i$b, getAccessibilityManager getaccessibilitymanager, setOffset setoffset) {
        this.MediaSessionCompatQueueItem = i$b;
        this.PlaybackStateCompatCustomAction = getaccessibilitymanager;
        this.IconCompatParcelizer = setoffset;
    }

    public final void RemoteActionCompatParcelizer(int i) {
        HashMap map = this.MediaMetadataCompat;
        if (map.containsKey(Integer.valueOf(i))) {
            Iterator it = ((List) map.get(Integer.valueOf(i))).iterator();
            while (it.hasNext()) {
                ((ParentDataModifierDefaultImpls) it.next()).IconCompatParcelizer((Object) null);
            }
            map.remove(Integer.valueOf(i));
        }
    }

    public final void RemoteActionCompatParcelizer(int i, Status status) {
        HashMap map = this.MediaBrowserCompatMediaItem;
        for (accesssetLastLayerDrawingWasSkippedp accesssetlastlayerdrawingwasskippedp : (List) map.get(Integer.valueOf(i))) {
            this.RatingCompat.remove(accesssetlastlayerdrawingwasskippedp);
            if (!status.IconCompatParcelizer()) {
                HashMap map2 = (HashMap) this.ParcelableVolumeInfo.MediaDescriptionCompat;
                nodeUpdated nodeupdated = (nodeUpdated) map2.get(accesssetlastlayerdrawingwasskippedp);
                if (nodeupdated != null) {
                    for (accesssetDrawBlockCanvasp accesssetdrawblockcanvasp : nodeupdated.write) {
                        accesssetdrawblockcanvasp.write.serializer(null, com.google.firebase.firestore.util.Util.serializer(status));
                    }
                }
                map2.remove(accesssetlastlayerdrawingwasskippedp);
                write(status, "Listen for %s failed", accesssetlastlayerdrawingwasskippedp);
            }
        }
        map.remove(Integer.valueOf(i));
        i$d i_d = this.read;
        i_d.getClass();
        zzkh zzkhVarIconCompatParcelizer = ((asList) i_d.read).IconCompatParcelizer(new calculateMinimumTouchTargetPaddingE7KxVPU(visitNodes.RemoteActionCompatParcelizer(), i));
        asList aslistIconCompatParcelizer = visitNodes.IconCompatParcelizer;
        while (((Iterator) zzkhVarIconCompatParcelizer.RemoteActionCompatParcelizer).hasNext()) {
            calculateMinimumTouchTargetPaddingE7KxVPU calculateminimumtouchtargetpaddinge7kxvpu = (calculateMinimumTouchTargetPaddingE7KxVPU) zzkhVarIconCompatParcelizer.next();
            if (calculateminimumtouchtargetpaddinge7kxvpu.IconCompatParcelizer != i) {
                break;
            } else {
                aslistIconCompatParcelizer = aslistIconCompatParcelizer.IconCompatParcelizer(calculateminimumtouchtargetpaddinge7kxvpu.read);
            }
        }
        i_d.write(i);
        Iterator it = aslistIconCompatParcelizer.iterator();
        while (true) {
            zzkh zzkhVar = (zzkh) it;
            if (!((Iterator) zzkhVar.RemoteActionCompatParcelizer).hasNext()) {
                return;
            }
            visitNodes visitnodes = (visitNodes) zzkhVar.next();
            if (!i_d.IconCompatParcelizer(visitnodes)) {
                serializer(visitnodes);
            }
        }
    }

    public final void RemoteActionCompatParcelizer(int i, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NodeCoordinator nodeCoordinator = (NodeCoordinator) it.next();
            int[] iArr = getDrawBlock.write;
            accessgetGraphicsLayerScopecp accessgetgraphicslayerscopecp = nodeCoordinator.IconCompatParcelizer;
            visitNodes visitnodes = nodeCoordinator.serializer;
            int i2 = iArr[accessgetgraphicslayerscopecp.ordinal()];
            i$d i_d = this.read;
            if (i2 == 1) {
                i_d.getClass();
                calculateMinimumTouchTargetPaddingE7KxVPU calculateminimumtouchtargetpaddinge7kxvpu = new calculateMinimumTouchTargetPaddingE7KxVPU(visitnodes, i);
                i_d.serializer = ((asList) i_d.serializer).IconCompatParcelizer((Object) calculateminimumtouchtargetpaddinge7kxvpu);
                i_d.read = ((asList) i_d.read).IconCompatParcelizer((Object) calculateminimumtouchtargetpaddinge7kxvpu);
                if (!this.write.containsKey(visitnodes)) {
                    LinkedHashSet linkedHashSet = this.RemoteActionCompatParcelizer;
                    if (!linkedHashSet.contains(visitnodes)) {
                        onEndApplyChanges.read("SyncEngine", "New document in limbo: %s", visitnodes);
                        linkedHashSet.add(visitnodes);
                        RemoteActionCompatParcelizer();
                    }
                }
            } else {
                if (i2 != 2) {
                    getRectManager.write("Unknown limbo change type: %s", nodeCoordinator.IconCompatParcelizer);
                    throw null;
                }
                onEndApplyChanges.read("SyncEngine", "Document no longer in limbo: %s", visitnodes);
                i_d.getClass();
                calculateMinimumTouchTargetPaddingE7KxVPU calculateminimumtouchtargetpaddinge7kxvpu2 = new calculateMinimumTouchTargetPaddingE7KxVPU(visitnodes, i);
                i_d.serializer = ((asList) i_d.serializer).read(calculateminimumtouchtargetpaddinge7kxvpu2);
                i_d.read = ((asList) i_d.read).read(calculateminimumtouchtargetpaddinge7kxvpu2);
                if (!i_d.IconCompatParcelizer(visitnodes)) {
                    serializer(visitnodes);
                }
            }
        }
    }

    public final void write(String str) {
        getRectManager.RemoteActionCompatParcelizer(this.ParcelableVolumeInfo != null, "Trying to call %s before setting callback", str);
    }
}
