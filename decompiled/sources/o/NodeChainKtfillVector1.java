package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class NodeChainKtfillVector1 implements Runnable {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ accessupdateUnsafe RemoteActionCompatParcelizer;
    public final /* synthetic */ accesssetDrawBlockCanvasp serializer;

    public /* synthetic */ NodeChainKtfillVector1(accessupdateUnsafe accessupdateunsafe, accesssetDrawBlockCanvasp accesssetdrawblockcanvasp, int i) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = accessupdateunsafe;
        this.serializer = accesssetdrawblockcanvasp;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        int i = this.IconCompatParcelizer;
        accesssetDrawBlockCanvasp accesssetdrawblockcanvasp = this.serializer;
        accessupdateUnsafe accessupdateunsafe = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            androidx.transition.TransitionValuesMaps transitionValuesMaps = accessupdateunsafe.read;
            ancestorToLocalS_NoaFU ancestortolocals_noafu = (ancestorToLocalS_NoaFU) transitionValuesMaps.MediaBrowserCompatMediaItem;
            accesssetLastLayerDrawingWasSkippedp accesssetlastlayerdrawingwasskippedp = accesssetdrawblockcanvasp.RemoteActionCompatParcelizer;
            HashMap map = (HashMap) transitionValuesMaps.MediaDescriptionCompat;
            nodeUpdated nodeupdated = (nodeUpdated) map.get(accesssetlastlayerdrawingwasskippedp);
            NodeChainsentinelHead1 nodeChainsentinelHead1 = NodeChainsentinelHead1.NO_ACTION_REQUIRED;
            if (nodeupdated == null) {
                return;
            }
            ArrayList arrayList = nodeupdated.write;
            arrayList.remove(accesssetdrawblockcanvasp);
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                do {
                    if (!it.hasNext()) {
                        if (!accesssetdrawblockcanvasp.read()) {
                            break;
                        }
                        nodeChainsentinelHead1 = NodeChainsentinelHead1.REQUIRE_WATCH_DISCONNECTION_ONLY;
                        break;
                    }
                } while (!((accesssetDrawBlockCanvasp) it.next()).read());
            } else {
                nodeChainsentinelHead1 = accesssetdrawblockcanvasp.read() ? NodeChainsentinelHead1.TERMINATE_LOCAL_LISTEN_AND_REQUIRE_WATCH_DISCONNECTION : NodeChainsentinelHead1.TERMINATE_LOCAL_LISTEN_ONLY;
            }
            int i2 = NodeChainLogger.IconCompatParcelizer[nodeChainsentinelHead1.ordinal()];
            if (i2 == 1) {
                map.remove(accesssetlastlayerdrawingwasskippedp);
                ancestortolocals_noafu.write(accesssetlastlayerdrawingwasskippedp, true);
                return;
            }
            if (i2 == 2) {
                map.remove(accesssetlastlayerdrawingwasskippedp);
                ancestortolocals_noafu.write(accesssetlastlayerdrawingwasskippedp, false);
                return;
            }
            if (i2 != 3) {
                return;
            }
            ancestortolocals_noafu.write("stopListeningToRemoteStore");
            fromParentPosition8S9VItkdefault fromparentposition8s9vitkdefault = (fromParentPosition8S9VItkdefault) ancestortolocals_noafu.RatingCompat.get(accesssetlastlayerdrawingwasskippedp);
            getRectManager.RemoteActionCompatParcelizer(fromparentposition8s9vitkdefault != null, "Trying to stop listening to a query not found", new Object[0]);
            int i3 = fromparentposition8s9vitkdefault.IconCompatParcelizer;
            List list = (List) ancestortolocals_noafu.MediaBrowserCompatMediaItem.get(Integer.valueOf(i3));
            list.remove(accesssetlastlayerdrawingwasskippedp);
            if (list.isEmpty()) {
                ancestortolocals_noafu.PlaybackStateCompatCustomAction.serializer(i3);
                return;
            }
            return;
        }
        androidx.transition.TransitionValuesMaps transitionValuesMaps2 = accessupdateunsafe.read;
        ancestorToLocalS_NoaFU ancestortolocals_noafu2 = (ancestorToLocalS_NoaFU) transitionValuesMaps2.MediaBrowserCompatMediaItem;
        accesssetLastLayerDrawingWasSkippedp accesssetlastlayerdrawingwasskippedp2 = accesssetdrawblockcanvasp.RemoteActionCompatParcelizer;
        NodeChainKt nodeChainKt = NodeChainKt.NO_ACTION_REQUIRED;
        HashMap map2 = (HashMap) transitionValuesMaps2.MediaDescriptionCompat;
        nodeUpdated nodeupdated2 = (nodeUpdated) map2.get(accesssetlastlayerdrawingwasskippedp2);
        if (nodeupdated2 != null) {
            Iterator it2 = nodeupdated2.write.iterator();
            do {
                if (!it2.hasNext()) {
                    if (!accesssetdrawblockcanvasp.read()) {
                        break;
                    }
                    nodeChainKt = NodeChainKt.REQUIRE_WATCH_CONNECTION_ONLY;
                    break;
                }
            } while (!((accesssetDrawBlockCanvasp) it2.next()).read());
        } else {
            nodeupdated2 = new nodeUpdated();
            map2.put(accesssetlastlayerdrawingwasskippedp2, nodeupdated2);
            nodeChainKt = accesssetdrawblockcanvasp.read() ? NodeChainKt.INITIALIZE_LOCAL_LISTEN_AND_REQUIRE_WATCH_CONNECTION : NodeChainKt.INITIALIZE_LOCAL_LISTEN_ONLY;
        }
        nodeupdated2.write.add(accesssetdrawblockcanvasp);
        accessgetDrawBlockCanvasp accessgetdrawblockcanvasp = (accessgetDrawBlockCanvasp) transitionValuesMaps2.RatingCompat;
        accesssetdrawblockcanvasp.read = accessgetdrawblockcanvasp;
        offsetFromEdgeMKHz9U offsetfromedgemkhz9u = accesssetdrawblockcanvasp.MediaDescriptionCompat;
        if (offsetfromedgemkhz9u == null || accesssetdrawblockcanvasp.IconCompatParcelizer || !accesssetdrawblockcanvasp.write(offsetfromedgemkhz9u, accessgetdrawblockcanvasp)) {
            z = false;
        } else {
            accesssetdrawblockcanvasp.read(accesssetdrawblockcanvasp.MediaDescriptionCompat);
            z = true;
        }
        getRectManager.RemoteActionCompatParcelizer(!z, "onOnlineStateChanged() shouldn't raise an event for brand-new listeners.", new Object[0]);
        offsetFromEdgeMKHz9U offsetfromedgemkhz9u2 = nodeupdated2.RemoteActionCompatParcelizer;
        if (offsetfromedgemkhz9u2 != null && accesssetdrawblockcanvasp.RemoteActionCompatParcelizer(offsetfromedgemkhz9u2)) {
            transitionValuesMaps2.RatingCompat();
        }
        int i4 = NodeChainLogger.serializer[nodeChainKt.ordinal()];
        if (i4 == 1) {
            ancestortolocals_noafu2.read(accesssetlastlayerdrawingwasskippedp2, true);
            return;
        }
        if (i4 == 2) {
            ancestortolocals_noafu2.read(accesssetlastlayerdrawingwasskippedp2, false);
        } else {
            if (i4 != 3) {
                return;
            }
            ancestortolocals_noafu2.write("listenToRemoteStore");
            getRectManager.RemoteActionCompatParcelizer(ancestortolocals_noafu2.RatingCompat.containsKey(accesssetlastlayerdrawingwasskippedp2), "This is the first listen to query: %s", accesssetlastlayerdrawingwasskippedp2);
            ancestortolocals_noafu2.PlaybackStateCompatCustomAction.write(ancestortolocals_noafu2.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(accesssetlastlayerdrawingwasskippedp2.read()));
        }
    }
}
