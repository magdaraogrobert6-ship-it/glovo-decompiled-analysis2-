package com.google.firebase.firestore.local;

import android.database.Cursor;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.ChildHelper;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.wg$$ExternalSyntheticLambda0;
import com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.local.LocalDocumentsView;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.proto.MaybeDocument;
import com.google.firebase.firestore.proto.NoDocument;
import com.google.firebase.firestore.proto.UnknownDocument;
import com.google.firebase.firestore.remote.RemoteSerializer;
import com.google.firebase.firestore.util.Util;
import com.google.firestore.v1.Document;
import com.google.firestore.v1.Value;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import com.huawei.wisesecurity.ucs_credential.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import o.MyersDiffKt;
import o.NodeCoordinatorCompanionPointerInputSource1;
import o.NodeCoordinatorKt;
import o.NodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1;
import o.NodeCoordinatoroutOfBoundsHit1;
import o.NodeCoordinatorupdateLayerParameters1;
import o.OnUnplacedModifierNode;
import o.OutOfFrameExecutor;
import o.accesscompareEquals;
import o.accessgetInstancedelegatecp;
import o.accessgetModulatecp;
import o.accessgetPointerInputSourcecp;
import o.accessgetSemanticsSourcecp;
import o.accessheadNode;
import o.accessnextUntilhw7D004;
import o.accessoutOfBoundsHit8NAm7pk;
import o.accesssetLastLayerDrawingWasSkippedp;
import o.accessswap;
import o.ancestorToLocal;
import o.childHitTestqzLsGqo;
import o.compareEquals;
import o.entityTypeOLwlOKw;
import o.getForceMeasureWithLookaheadConstraintsui;
import o.getForcePlaceWithLookaheadOffsetui;
import o.getIncludeSelfInTraversalH91voCI;
import o.getLastLayerDrawingWasSkippedui;
import o.getMask;
import o.getPointerInputSource;
import o.getRectManager;
import o.getSemanticsSource;
import o.getWrappedByui;
import o.headH91voCI;
import o.invalidateRootLayer;
import o.nextUntilhw7D004;
import o.onContentCardDismissed;
import o.onLayoutChange;
import o.onLayoutModifierNodeChanged;
import o.orimpl;
import o.releaseLayer;
import o.resizeozmzZPI;
import o.setContentInvalid;
import o.setWasLayerBlockInvokedui;
import o.setWrappedui;
import o.shareWithSiblings;
import o.specifiesCanFocusProperty;
import o.tailH91voCIui;
import o.updateLayerParameters;
import o.visitNodes;
import o.withPositionTranslation;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalDocumentsView {
    public onLayoutModifierNodeChanged IconCompatParcelizer;
    public final Object RemoteActionCompatParcelizer;
    public final Object read;
    public final Object serializer;

    public void IconCompatParcelizer(invalidateRootLayer invalidaterootlayer, final HashMap map, Cursor cursor, final onLayoutChange onlayoutchange) {
        final byte[] blob = cursor.getBlob(0);
        final int i = cursor.getInt(1);
        final int i2 = cursor.getInt(2);
        final boolean zIsNull = cursor.isNull(3);
        final String string = cursor.getString(4);
        Runnable runnable = new Runnable() { // from class: o.onLayoutNodeDetach
            @Override // java.lang.Runnable
            public final void run() {
                LocalDocumentsView localDocumentsView = this.serializer;
                byte[] bArr = blob;
                int i3 = i;
                int i4 = i2;
                boolean z = zIsNull;
                String str = string;
                onLayoutChange onlayoutchange2 = onlayoutchange;
                HashMap map2 = map;
                try {
                    NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1RemoteActionCompatParcelizer = ((getForceMeasureWithLookaheadConstraintsui) localDocumentsView.serializer).RemoteActionCompatParcelizer(MaybeDocument.parseFrom(bArr));
                    nodeCoordinatorCompanionPointerInputSource1RemoteActionCompatParcelizer.IconCompatParcelizer = new SnapshotVersion(new Timestamp(i3, i4));
                    if (z) {
                        getLastLayerDrawingWasSkippedui getlastlayerdrawingwasskippedui = (getLastLayerDrawingWasSkippedui) localDocumentsView.RemoteActionCompatParcelizer;
                        getlastlayerdrawingwasskippedui.getClass();
                        ((ConcurrentHashMap) getlastlayerdrawingwasskippedui.read).putIfAbsent(new setForceMeasureWithLookaheadConstraintsui(str, i3, i4), releaseLayer.forMutableDocument(nodeCoordinatorCompanionPointerInputSource1RemoteActionCompatParcelizer));
                    }
                    if (onlayoutchange2 == null || ((Boolean) onlayoutchange2.apply(nodeCoordinatorCompanionPointerInputSource1RemoteActionCompatParcelizer)).booleanValue()) {
                        synchronized (map2) {
                            map2.put(nodeCoordinatorCompanionPointerInputSource1RemoteActionCompatParcelizer.read, nodeCoordinatorCompanionPointerInputSource1RemoteActionCompatParcelizer);
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    getRectManager.write("MaybeDocument failed to parse: %s", e);
                    throw null;
                }
            }
        };
        if (cursor.isFirst() && cursor.isLast()) {
            runnable.run();
        } else {
            invalidaterootlayer.RemoteActionCompatParcelizer(runnable);
        }
    }

    public HashMap IconCompatParcelizer(Set set, Map map, Map map2) {
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        for (NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 : map.values()) {
            visitNodes visitnodes = nodeCoordinatorCompanionPointerInputSource1.read;
            NodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1 nodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1 = (NodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1) map2.get(visitnodes);
            if (set.contains(visitnodes) && (nodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1 == null || (nodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1.serializer instanceof compareEquals))) {
                map3.put(visitnodes, nodeCoordinatorCompanionPointerInputSource1);
            } else if (nodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1 != null) {
                NodeCoordinatorKt nodeCoordinatorKt = nodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1.serializer;
                map4.put(visitnodes, nodeCoordinatorKt.write());
                nodeCoordinatorKt.read(nodeCoordinatorCompanionPointerInputSource1, nodeCoordinatorKt.write(), new Timestamp(new Date()));
            } else {
                map4.put(visitnodes, accesscompareEquals.serializer);
            }
        }
        map4.putAll(write(map3));
        HashMap map5 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            visitNodes visitnodes2 = (visitNodes) entry.getKey();
            NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource2 = (NodeCoordinatorCompanionPointerInputSource1) entry.getValue();
            getWrappedByui getwrappedbyui = new getWrappedByui();
            getwrappedbyui.write = nodeCoordinatorCompanionPointerInputSource2;
            map5.put(visitnodes2, getwrappedbyui);
        }
        return map5;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003c  */
    public accessswap RemoteActionCompatParcelizer(accesssetLastLayerDrawingWasSkippedp accesssetlastlayerdrawingwasskippedp, setWrappedui setwrappedui, Timestamp.Companion companion) {
        HashMap mapSerializer;
        HashMap mapIconCompatParcelizer;
        String str;
        LocalDocumentsView localDocumentsView = (LocalDocumentsView) this.read;
        accesssetlastlayerdrawingwasskippedp.getClass();
        tailH91voCIui tailh91vociui = ((accessoutOfBoundsHit8NAm7pk) accesssetlastlayerdrawingwasskippedp).read;
        RemoteSerializer remoteSerializer = tailh91vociui.write;
        accessgetSemanticsSourcecp accessgetsemanticssourcecpRemoteActionCompatParcelizer = accessheadNode.RemoteActionCompatParcelizer(tailh91vociui);
        ArrayList<specifiesCanFocusProperty> arrayList = tailh91vociui.IconCompatParcelizer;
        accessgetSemanticsSourcecp accessgetsemanticssourcecp = accessgetSemanticsSourcecp.COLLECTION_GROUP;
        if (accessgetsemanticssourcecpRemoteActionCompatParcelizer == accessgetsemanticssourcecp) {
            if (accessheadNode.RemoteActionCompatParcelizer(tailh91vociui) == accessgetsemanticssourcecp) {
                getRectManager.RemoteActionCompatParcelizer(!arrayList.isEmpty(), "Pipeline source is CollectionGroup but stages are empty.", new Object[0]);
                specifiesCanFocusProperty specifiescanfocusproperty = (specifiesCanFocusProperty) onContentCardDismissed.read((List) arrayList);
                if (specifiescanfocusproperty instanceof getMask) {
                    str = ((getMask) specifiescanfocusproperty).IconCompatParcelizer;
                } else {
                    str = null;
                }
            } else {
                str = null;
            }
            getRectManager.RemoteActionCompatParcelizer(str != null, "Pipeline source type is COLLECTION_GROUP but is missing", new Object[0]);
            accessswap accessswapVarRemoteActionCompatParcelizer = withPositionTranslation.read;
            Iterator it = this.IconCompatParcelizer.RemoteActionCompatParcelizer(str).iterator();
            while (it.hasNext()) {
                shareWithSiblings sharewithsiblings = (shareWithSiblings) ((shareWithSiblings) it.next()).write(str);
                ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
                for (specifiesCanFocusProperty orimplVar : arrayList) {
                    if (orimplVar instanceof getMask) {
                        orimplVar = new orimpl(sharewithsiblings, remoteSerializer, getIncludeSelfInTraversalH91voCI.read);
                    }
                    arrayList2.add(orimplVar);
                }
                for (Map.Entry entry : RemoteActionCompatParcelizer(new accessoutOfBoundsHit8NAm7pk(new tailH91voCIui(remoteSerializer, tailh91vociui.RemoteActionCompatParcelizer, arrayList2, null)), setwrappedui, companion)) {
                    accessswapVarRemoteActionCompatParcelizer = accessswapVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer((visitNodes) entry.getKey(), (NodeCoordinatorCompanionPointerInputSource1) entry.getValue());
                }
            }
            return accessswapVarRemoteActionCompatParcelizer;
        }
        int i = setwrappedui.IconCompatParcelizer;
        x xVar = (x) this.RemoteActionCompatParcelizer;
        int i2 = getForcePlaceWithLookaheadOffsetui.read[accessheadNode.RemoteActionCompatParcelizer(tailh91vociui).ordinal()];
        if (i2 == 1) {
            String strSerializer = accessheadNode.serializer(tailh91vociui);
            getRectManager.RemoteActionCompatParcelizer(strSerializer != null, "Pipeline source type is COLLECTION but is missing", new Object[0]);
            mapSerializer = xVar.serializer(shareWithSiblings.IconCompatParcelizer(strSerializer), i);
        } else {
            if (i2 != 2) {
                Gson$$ExternalSyntheticBUOutline0.m(tailh91vociui, "GetOverlaysForPipeline: Unrecognized pipeline source type for pipeline ");
                return null;
            }
            List listAsList = Arrays.asList(accessheadNode.read(tailh91vociui));
            getRectManager.RemoteActionCompatParcelizer(listAsList != null, "Pipeline source type is DOCUMENTS but is missing", new Object[0]);
            TreeSet treeSet = new TreeSet();
            Iterator it2 = listAsList.iterator();
            while (it2.hasNext()) {
                treeSet.add(new visitNodes(shareWithSiblings.IconCompatParcelizer((String) it2.next())));
            }
            mapSerializer = xVar.IconCompatParcelizer(treeSet);
        }
        int i3 = getForcePlaceWithLookaheadOffsetui.read[accessheadNode.RemoteActionCompatParcelizer(tailh91vociui).ordinal()];
        if (i3 == 1) {
            mapIconCompatParcelizer = localDocumentsView.IconCompatParcelizer(accesssetlastlayerdrawingwasskippedp, setwrappedui, mapSerializer.keySet(), companion);
        } else {
            if (i3 != 2) {
                Gson$$ExternalSyntheticBUOutline0.m(tailh91vociui, "Invalid pipeline source to execute offline: ");
                return null;
            }
            List listAsList2 = Arrays.asList(accessheadNode.read(tailh91vociui));
            HashSet hashSet = new HashSet();
            Iterator it3 = listAsList2.iterator();
            while (it3.hasNext()) {
                hashSet.add(new visitNodes(shareWithSiblings.IconCompatParcelizer((String) it3.next())));
            }
            mapIconCompatParcelizer = localDocumentsView.write(hashSet);
        }
        return RemoteActionCompatParcelizer(mapSerializer, mapIconCompatParcelizer, new DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5(15, tailh91vociui));
    }

    public void read(NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1, SnapshotVersion snapshotVersion) {
        getRectManager.RemoteActionCompatParcelizer(!snapshotVersion.equals(SnapshotVersion.IconCompatParcelizer), "Cannot add document to the RemoteDocumentCache with a read time of zero", new Object[0]);
        visitNodes visitnodes = nodeCoordinatorCompanionPointerInputSource1.read;
        Timestamp timestamp = snapshotVersion.read;
        RemoteSerializer remoteSerializer = ((getForceMeasureWithLookaheadConstraintsui) this.serializer).IconCompatParcelizer;
        OnUnplacedModifierNode onUnplacedModifierNodeNewBuilder = MaybeDocument.newBuilder();
        if (nodeCoordinatorCompanionPointerInputSource1.serializer.equals(getSemanticsSource.NO_DOCUMENT)) {
            OutOfFrameExecutor outOfFrameExecutorNewBuilder = NoDocument.newBuilder();
            String strSerializer = remoteSerializer.serializer(visitnodes);
            outOfFrameExecutorNewBuilder.RemoteActionCompatParcelizer();
            ((NoDocument) outOfFrameExecutorNewBuilder.RemoteActionCompatParcelizer).setName(strSerializer);
            com.google.protobuf.Timestamp timestampWrite = RemoteSerializer.write(nodeCoordinatorCompanionPointerInputSource1.MediaDescriptionCompat.read);
            outOfFrameExecutorNewBuilder.RemoteActionCompatParcelizer();
            ((NoDocument) outOfFrameExecutorNewBuilder.RemoteActionCompatParcelizer).setReadTime(timestampWrite);
            NoDocument noDocument = (NoDocument) outOfFrameExecutorNewBuilder.serializer();
            onUnplacedModifierNodeNewBuilder.RemoteActionCompatParcelizer();
            ((MaybeDocument) onUnplacedModifierNodeNewBuilder.RemoteActionCompatParcelizer).setNoDocument(noDocument);
        } else if (nodeCoordinatorCompanionPointerInputSource1.read()) {
            setContentInvalid setcontentinvalidNewBuilder = Document.newBuilder();
            String strSerializer2 = remoteSerializer.serializer(visitnodes);
            setcontentinvalidNewBuilder.RemoteActionCompatParcelizer();
            ((Document) setcontentinvalidNewBuilder.RemoteActionCompatParcelizer).setName(strSerializer2);
            Map<String, Value> fieldsMap = nodeCoordinatorCompanionPointerInputSource1.write.serializer().getMapValue().getFieldsMap();
            setcontentinvalidNewBuilder.RemoteActionCompatParcelizer();
            ((Document) setcontentinvalidNewBuilder.RemoteActionCompatParcelizer).getMutableFieldsMap().putAll(fieldsMap);
            com.google.protobuf.Timestamp timestampWrite2 = RemoteSerializer.write(nodeCoordinatorCompanionPointerInputSource1.MediaDescriptionCompat.read);
            setcontentinvalidNewBuilder.RemoteActionCompatParcelizer();
            ((Document) setcontentinvalidNewBuilder.RemoteActionCompatParcelizer).setUpdateTime(timestampWrite2);
            Document document = (Document) setcontentinvalidNewBuilder.serializer();
            onUnplacedModifierNodeNewBuilder.RemoteActionCompatParcelizer();
            ((MaybeDocument) onUnplacedModifierNodeNewBuilder.RemoteActionCompatParcelizer).setDocument(document);
        } else {
            if (!nodeCoordinatorCompanionPointerInputSource1.serializer.equals(getSemanticsSource.UNKNOWN_DOCUMENT)) {
                getRectManager.write("Cannot encode invalid document %s", nodeCoordinatorCompanionPointerInputSource1);
                throw null;
            }
            resizeozmzZPI resizeozmzzpiNewBuilder = UnknownDocument.newBuilder();
            String strSerializer3 = remoteSerializer.serializer(visitnodes);
            resizeozmzzpiNewBuilder.RemoteActionCompatParcelizer();
            ((UnknownDocument) resizeozmzzpiNewBuilder.RemoteActionCompatParcelizer).setName(strSerializer3);
            com.google.protobuf.Timestamp timestampWrite3 = RemoteSerializer.write(nodeCoordinatorCompanionPointerInputSource1.MediaDescriptionCompat.read);
            resizeozmzzpiNewBuilder.RemoteActionCompatParcelizer();
            ((UnknownDocument) resizeozmzzpiNewBuilder.RemoteActionCompatParcelizer).setVersion(timestampWrite3);
            UnknownDocument unknownDocument = (UnknownDocument) resizeozmzzpiNewBuilder.serializer();
            onUnplacedModifierNodeNewBuilder.RemoteActionCompatParcelizer();
            ((MaybeDocument) onUnplacedModifierNodeNewBuilder.RemoteActionCompatParcelizer).setUnknownDocument(unknownDocument);
        }
        boolean zEquals = nodeCoordinatorCompanionPointerInputSource1.RemoteActionCompatParcelizer.equals(getPointerInputSource.HAS_COMMITTED_MUTATIONS);
        onUnplacedModifierNodeNewBuilder.RemoteActionCompatParcelizer();
        ((MaybeDocument) onUnplacedModifierNodeNewBuilder.RemoteActionCompatParcelizer).setHasCommittedMutations(zEquals);
        ((headH91voCI) this.read).IconCompatParcelizer("INSERT OR REPLACE INTO remote_documents (path, path_length, read_time_seconds, read_time_nanos, document_type, contents) VALUES (?, ?, ?, ?, ?, ?)", updateLayerParameters.write(visitnodes.RemoteActionCompatParcelizer), Integer.valueOf(visitnodes.RemoteActionCompatParcelizer.IconCompatParcelizer.size()), Long.valueOf(timestamp.IconCompatParcelizer), Integer.valueOf(timestamp.RemoteActionCompatParcelizer), Integer.valueOf(releaseLayer.forMutableDocument(nodeCoordinatorCompanionPointerInputSource1).dbValue), ((MaybeDocument) onUnplacedModifierNodeNewBuilder.serializer()).toByteArray());
        onLayoutModifierNodeChanged onlayoutmodifiernodechanged = this.IconCompatParcelizer;
        shareWithSiblings sharewithsiblings = (shareWithSiblings) visitnodes.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        getRectManager.RemoteActionCompatParcelizer(onlayoutmodifiernodechanged.MediaSessionCompatQueueItem, "IndexManager not started", new Object[0]);
        getRectManager.RemoteActionCompatParcelizer(sharewithsiblings.IconCompatParcelizer.size() % 2 == 1, "Expected a collection path.", new Object[0]);
        if (onlayoutmodifiernodechanged.write.serializer(sharewithsiblings)) {
            onlayoutmodifiernodechanged.serializer.IconCompatParcelizer("INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)", sharewithsiblings.serializer(), updateLayerParameters.write((shareWithSiblings) sharewithsiblings.RemoteActionCompatParcelizer()));
        }
    }

    public accessswap serializer(Iterable iterable) {
        return write(((LocalDocumentsView) this.read).write(iterable), new HashSet());
    }

    public void serializer(Map map, Set set) {
        TreeSet treeSet = new TreeSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            visitNodes visitnodes = (visitNodes) it.next();
            if (!map.containsKey(visitnodes)) {
                treeSet.add(visitnodes);
            }
        }
        map.putAll(((x) this.RemoteActionCompatParcelizer).IconCompatParcelizer(treeSet));
    }

    public accessswap write(Map map, HashSet hashSet) {
        HashMap map2 = new HashMap();
        serializer(map2, map.keySet());
        accessswap accessswapVarRemoteActionCompatParcelizer = withPositionTranslation.read;
        for (Map.Entry entry : IconCompatParcelizer(hashSet, map, map2).entrySet()) {
            accessswapVarRemoteActionCompatParcelizer = accessswapVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer((visitNodes) entry.getKey(), ((getWrappedByui) entry.getValue()).write);
        }
        return accessswapVarRemoteActionCompatParcelizer;
    }

    public accessswap write(accesssetLastLayerDrawingWasSkippedp accesssetlastlayerdrawingwasskippedp, setWrappedui setwrappedui, Timestamp.Companion companion) {
        NodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1 nodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1Write;
        accesssetlastlayerdrawingwasskippedp.getClass();
        if (!(accesssetlastlayerdrawingwasskippedp instanceof ancestorToLocal)) {
            return RemoteActionCompatParcelizer(accesssetlastlayerdrawingwasskippedp, setwrappedui, companion);
        }
        accessgetPointerInputSourcecp accessgetpointerinputsourcecp = ((ancestorToLocal) accesssetlastlayerdrawingwasskippedp).IconCompatParcelizer;
        shareWithSiblings sharewithsiblings = accessgetpointerinputsourcecp.MediaSessionCompatQueueItem;
        boolean zSerializer = visitNodes.serializer(sharewithsiblings);
        Object obj = this.read;
        Object obj2 = this.RemoteActionCompatParcelizer;
        if (!zSerializer || !Collections.EMPTY_LIST.isEmpty()) {
            HashMap mapSerializer = ((x) obj2).serializer(accessgetpointerinputsourcecp.MediaSessionCompatQueueItem, setwrappedui.IconCompatParcelizer);
            return RemoteActionCompatParcelizer(mapSerializer, ((LocalDocumentsView) obj).IconCompatParcelizer(new ancestorToLocal(accessgetpointerinputsourcecp), setwrappedui, mapSerializer.keySet(), companion), new DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5(14, accessgetpointerinputsourcecp));
        }
        MyersDiffKt myersDiffKt = withPositionTranslation.read;
        visitNodes visitnodes = new visitNodes(sharewithsiblings);
        x xVar = (x) obj2;
        xVar.getClass();
        shareWithSiblings sharewithsiblings2 = visitnodes.RemoteActionCompatParcelizer;
        String strWrite = updateLayerParameters.write((shareWithSiblings) sharewithsiblings2.RemoteActionCompatParcelizer());
        String strSerializer = sharewithsiblings2.serializer();
        x xVar2 = ((headH91voCI) xVar.read).read("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id = ?");
        xVar2.IconCompatParcelizer((String) xVar.IconCompatParcelizer, strWrite, strSerializer);
        Cursor cursorIconCompatParcelizer = xVar2.IconCompatParcelizer();
        try {
            if (cursorIconCompatParcelizer.moveToFirst()) {
                nodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1Write = xVar.write(cursorIconCompatParcelizer.getInt(1), cursorIconCompatParcelizer.getBlob(0));
                cursorIconCompatParcelizer.close();
            } else {
                cursorIconCompatParcelizer.close();
                nodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1Write = null;
            }
            NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1Serializer = (nodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1Write == null || (nodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1Write.serializer instanceof compareEquals)) ? ((LocalDocumentsView) obj).read(visitnodes) : NodeCoordinatorCompanionPointerInputSource1.serializer(visitnodes);
            if (nodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1Write != null) {
                nodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1Write.serializer.read(nodeCoordinatorCompanionPointerInputSource1Serializer, accesscompareEquals.serializer, new Timestamp(new Date()));
            }
            return nodeCoordinatorCompanionPointerInputSource1Serializer.read() ? myersDiffKt.RemoteActionCompatParcelizer(nodeCoordinatorCompanionPointerInputSource1Serializer.read, nodeCoordinatorCompanionPointerInputSource1Serializer) : myersDiffKt;
        } catch (Throwable th) {
            if (cursorIconCompatParcelizer != null) {
                try {
                    cursorIconCompatParcelizer.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static accessswap RemoteActionCompatParcelizer(Map map, Map map2, onLayoutChange onlayoutchange) {
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey())) {
                map2.put((visitNodes) entry.getKey(), NodeCoordinatorCompanionPointerInputSource1.serializer((visitNodes) entry.getKey()));
            }
        }
        accessswap accessswapVarRemoteActionCompatParcelizer = withPositionTranslation.read;
        for (Map.Entry entry2 : map2.entrySet()) {
            NodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1 nodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1 = (NodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1) map.get(entry2.getKey());
            if (nodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1 != null) {
                nodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1.serializer.read((NodeCoordinatorCompanionPointerInputSource1) entry2.getValue(), accesscompareEquals.serializer, new Timestamp(new Date()));
            }
            if (((Boolean) onlayoutchange.apply((NodeCoordinatorCompanionPointerInputSource1) entry2.getValue())).booleanValue()) {
                accessswapVarRemoteActionCompatParcelizer = accessswapVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer((visitNodes) entry2.getKey(), (NodeCoordinatorCompanionPointerInputSource1) entry2.getValue());
            }
        }
        return accessswapVarRemoteActionCompatParcelizer;
    }

    public NodeCoordinatorCompanionPointerInputSource1 read(visitNodes visitnodes) {
        return (NodeCoordinatorCompanionPointerInputSource1) write(Collections.singletonList(visitnodes)).get(visitnodes);
    }

    public HashMap write(Map map) {
        Iterator it;
        Iterator it2;
        NodeCoordinatorKt compareequals;
        accesscompareEquals accesscompareequals;
        Map map2 = map;
        ChildHelper childHelper = (ChildHelper) this.serializer;
        Set setKeySet = map.keySet();
        childHelper.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it3 = setKeySet.iterator();
        while (it3.hasNext()) {
            arrayList.add(updateLayerParameters.write(((visitNodes) it3.next()).RemoteActionCompatParcelizer));
        }
        accessgetModulatecp accessgetmodulatecp = new accessgetModulatecp((headH91voCI) childHelper.serializer, "SELECT DISTINCT dm.batch_id, SUBSTR(m.mutations, 1, ?) FROM document_mutations dm, mutations m WHERE dm.uid = ? AND dm.path IN (", Arrays.asList(1000000, (String) childHelper.read), arrayList, ") AND dm.uid = m.uid AND dm.batch_id = m.batch_id ORDER BY dm.batch_id");
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        while (true) {
            int i = 1;
            if (!((Iterator) accessgetmodulatecp.serializer).hasNext()) {
                break;
            }
            accessgetmodulatecp.IconCompatParcelizer().RemoteActionCompatParcelizer(new setWasLayerBlockInvokedui(childHelper, hashSet, arrayList2, i));
        }
        if (accessgetmodulatecp.IconCompatParcelizer > 1) {
            Collections.sort(arrayList2, new wg$$ExternalSyntheticLambda0(11));
        }
        HashMap map3 = new HashMap();
        TreeMap treeMap = new TreeMap();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            NodeCoordinatorupdateLayerParameters1 nodeCoordinatorupdateLayerParameters1 = (NodeCoordinatorupdateLayerParameters1) it4.next();
            for (visitNodes visitnodes : nodeCoordinatorupdateLayerParameters1.IconCompatParcelizer()) {
                NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) map2.get(visitnodes);
                if (nodeCoordinatorCompanionPointerInputSource1 != null) {
                    visitNodes visitnodes2 = nodeCoordinatorCompanionPointerInputSource1.read;
                    if (map3.containsKey(visitnodes)) {
                        accesscompareequals = (accesscompareEquals) map3.get(visitnodes);
                    } else {
                        accesscompareequals = accesscompareEquals.serializer;
                    }
                    ArrayList arrayList3 = nodeCoordinatorupdateLayerParameters1.serializer;
                    Timestamp timestamp = nodeCoordinatorupdateLayerParameters1.write;
                    ArrayList arrayList4 = nodeCoordinatorupdateLayerParameters1.IconCompatParcelizer;
                    int i2 = 0;
                    while (i2 < arrayList4.size()) {
                        NodeCoordinatorKt nodeCoordinatorKt = (NodeCoordinatorKt) arrayList4.get(i2);
                        Iterator it5 = it4;
                        if (nodeCoordinatorKt.read.equals(visitnodes2)) {
                            accesscompareequals = nodeCoordinatorKt.read(nodeCoordinatorCompanionPointerInputSource1, accesscompareequals, timestamp);
                        }
                        i2++;
                        it4 = it5;
                    }
                    Iterator it6 = it4;
                    for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                        NodeCoordinatorKt nodeCoordinatorKt2 = (NodeCoordinatorKt) arrayList3.get(i3);
                        if (nodeCoordinatorKt2.read.equals(visitnodes2)) {
                            accesscompareequals = nodeCoordinatorKt2.read(nodeCoordinatorCompanionPointerInputSource1, accesscompareequals, timestamp);
                        }
                    }
                    map3.put(visitnodes, accesscompareequals);
                    int i4 = nodeCoordinatorupdateLayerParameters1.RemoteActionCompatParcelizer;
                    if (!treeMap.containsKey(Integer.valueOf(i4))) {
                        treeMap.put(Integer.valueOf(i4), new HashSet());
                    }
                    ((Set) treeMap.get(Integer.valueOf(i4))).add(visitnodes);
                    it4 = it6;
                }
            }
        }
        HashSet hashSet2 = new HashSet();
        Iterator it7 = treeMap.descendingMap().entrySet().iterator();
        while (it7.hasNext()) {
            Map.Entry entry = (Map.Entry) it7.next();
            HashMap map4 = new HashMap();
            Iterator it8 = ((Set) entry.getValue()).iterator();
            while (it8.hasNext()) {
                visitNodes visitnodes3 = (visitNodes) it8.next();
                if (hashSet2.contains(visitnodes3)) {
                    it = it7;
                    it2 = it8;
                } else {
                    NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource2 = (NodeCoordinatorCompanionPointerInputSource1) map2.get(visitnodes3);
                    accesscompareEquals accesscompareequals2 = (accesscompareEquals) map3.get(visitnodes3);
                    if (!nodeCoordinatorCompanionPointerInputSource2.IconCompatParcelizer() || (accesscompareequals2 != null && accesscompareequals2.RemoteActionCompatParcelizer.isEmpty())) {
                        it = it7;
                        it2 = it8;
                        compareequals = null;
                    } else if (accesscompareequals2 == null) {
                        boolean zEquals = nodeCoordinatorCompanionPointerInputSource2.serializer.equals(getSemanticsSource.NO_DOCUMENT);
                        visitNodes visitnodes4 = nodeCoordinatorCompanionPointerInputSource2.read;
                        if (zEquals) {
                            compareequals = new NodeCoordinatoroutOfBoundsHit1(visitnodes4, accessnextUntilhw7D004.serializer);
                        } else {
                            compareequals = new nextUntilhw7D004(visitnodes4, nodeCoordinatorCompanionPointerInputSource2.write, accessnextUntilhw7D004.serializer, new ArrayList());
                        }
                        it = it7;
                        it2 = it8;
                    } else {
                        entityTypeOLwlOKw entitytypeolwlokw = nodeCoordinatorCompanionPointerInputSource2.write;
                        entityTypeOLwlOKw entitytypeolwlokw2 = new entityTypeOLwlOKw();
                        HashSet hashSet3 = new HashSet();
                        for (childHitTestqzLsGqo childhittestqzlsgqo : accesscompareequals2.RemoteActionCompatParcelizer) {
                            if (!hashSet3.contains(childhittestqzlsgqo)) {
                                if (entitytypeolwlokw.write(childhittestqzlsgqo) == null && childhittestqzlsgqo.IconCompatParcelizer.size() > 1) {
                                    childhittestqzlsgqo = (childHitTestqzLsGqo) childhittestqzlsgqo.RemoteActionCompatParcelizer();
                                }
                                Value valueWrite = entitytypeolwlokw.write(childhittestqzlsgqo);
                                getRectManager.RemoteActionCompatParcelizer(!childhittestqzlsgqo.IconCompatParcelizer(), "Cannot set field for empty path on ObjectValue", new Object[0]);
                                entitytypeolwlokw2.write(childhittestqzlsgqo, valueWrite);
                                hashSet3.add(childhittestqzlsgqo);
                            }
                            it8 = it8;
                            it7 = it7;
                        }
                        it = it7;
                        it2 = it8;
                        compareequals = new compareEquals(nodeCoordinatorCompanionPointerInputSource2.read, entitytypeolwlokw2, new accesscompareEquals(hashSet3), accessnextUntilhw7D004.serializer, new ArrayList());
                    }
                    if (compareequals != null) {
                        map4.put(visitnodes3, compareequals);
                    }
                    hashSet2.add(visitnodes3);
                }
                map2 = map;
                it8 = it2;
                it7 = it;
            }
            Iterator it9 = it7;
            x xVar = (x) this.RemoteActionCompatParcelizer;
            int iIntValue = ((Integer) entry.getKey()).intValue();
            xVar.getClass();
            for (Map.Entry entry2 : map4.entrySet()) {
                visitNodes visitnodes5 = (visitNodes) entry2.getKey();
                NodeCoordinatorKt nodeCoordinatorKt3 = (NodeCoordinatorKt) entry2.getValue();
                if (nodeCoordinatorKt3 != null) {
                    String strWrite = visitnodes5.write();
                    shareWithSiblings sharewithsiblings = visitnodes5.RemoteActionCompatParcelizer;
                    ((headH91voCI) xVar.read).IconCompatParcelizer("INSERT OR REPLACE INTO document_overlays (uid, collection_group, collection_path, document_id, largest_batch_id, overlay_mutation) VALUES (?, ?, ?, ?, ?, ?)", (String) xVar.IconCompatParcelizer, strWrite, updateLayerParameters.write((shareWithSiblings) sharewithsiblings.RemoteActionCompatParcelizer()), sharewithsiblings.serializer(), Integer.valueOf(iIntValue), ((getForceMeasureWithLookaheadConstraintsui) xVar.RemoteActionCompatParcelizer).IconCompatParcelizer.read(nodeCoordinatorKt3).toByteArray());
                } else {
                    Locale locale = Locale.US;
                    throw new NullPointerException("null value for key: " + visitnodes5);
                }
            }
            map2 = map;
            it7 = it9;
        }
        return map3;
    }

    public LocalDocumentsView(headH91voCI headh91voci, getForceMeasureWithLookaheadConstraintsui getforcemeasurewithlookaheadconstraintsui) {
        this.RemoteActionCompatParcelizer = new getLastLayerDrawingWasSkippedui(1);
        this.read = headh91voci;
        this.serializer = getforcemeasurewithlookaheadconstraintsui;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HashMap serializer(List list, setWrappedui setwrappedui, int i, releaseLayer releaselayer, CaptureRequestOptions$Builder$$ExternalSyntheticLambda0 captureRequestOptions$Builder$$ExternalSyntheticLambda0, Timestamp.Companion companion) {
        String str;
        Timestamp timestamp = setwrappedui.serializer.read;
        visitNodes visitnodes = setwrappedui.write;
        StringBuilder sb = new StringBuilder("SELECT contents, read_time_seconds, read_time_nanos, document_type, path FROM remote_documents WHERE path >= ? AND path < ? AND path_length = ? ");
        if (releaselayer == null) {
            str = "";
        } else {
            str = " AND (document_type IS NULL OR document_type = ?) ";
        }
        StringBuilder sb2 = Util.read(ff$$ExternalSyntheticOutline0.m(sb, str, "AND (read_time_seconds > ? OR ( read_time_seconds = ? AND read_time_nanos > ?) OR ( read_time_seconds = ? AND read_time_nanos = ? and path > ?)) "), list.size(), " UNION ");
        sb2.append("ORDER BY read_time_seconds, read_time_nanos, path LIMIT ?");
        int i2 = 0;
        Object[] objArr = new Object[(list.size() * ((releaselayer != null ? 1 : 0) + 9)) + 1];
        Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            shareWithSiblings sharewithsiblings = (shareWithSiblings) it.next();
            String strWrite = updateLayerParameters.write(sharewithsiblings);
            objArr[i3] = strWrite;
            StringBuilder sb3 = new StringBuilder(strWrite);
            int length = sb3.length() - 1;
            char cCharAt = sb3.charAt(length);
            getRectManager.RemoteActionCompatParcelizer(cCharAt == 1 ? 1 : i2, "successor may only operate on paths generated by encode", new Object[i2]);
            sb3.setCharAt(length, (char) (cCharAt + 1));
            objArr[i3 + 1] = sb3.toString();
            int i4 = i3 + 3;
            objArr[i3 + 2] = Integer.valueOf(sharewithsiblings.IconCompatParcelizer.size() + 1);
            if (releaselayer != null) {
                objArr[i4] = Integer.valueOf(releaselayer.dbValue);
                i4 = i3 + 4;
            }
            objArr[i4] = Long.valueOf(timestamp.IconCompatParcelizer);
            objArr[i4 + 1] = Long.valueOf(timestamp.IconCompatParcelizer);
            objArr[i4 + 2] = Integer.valueOf(timestamp.RemoteActionCompatParcelizer);
            objArr[i4 + 3] = Long.valueOf(timestamp.IconCompatParcelizer);
            objArr[i4 + 4] = Integer.valueOf(timestamp.RemoteActionCompatParcelizer);
            i3 = i4 + 6;
            objArr[i4 + 5] = updateLayerParameters.write(visitnodes.RemoteActionCompatParcelizer);
            i2 = 0;
        }
        objArr[i3] = Integer.valueOf(i);
        invalidateRootLayer invalidaterootlayer = new invalidateRootLayer();
        HashMap map = new HashMap();
        x xVar = ((headH91voCI) this.read).read(sb2.toString());
        xVar.IconCompatParcelizer(objArr);
        Cursor cursorIconCompatParcelizer = xVar.IconCompatParcelizer();
        while (cursorIconCompatParcelizer.moveToNext()) {
            try {
                IconCompatParcelizer(invalidaterootlayer, map, cursorIconCompatParcelizer, captureRequestOptions$Builder$$ExternalSyntheticLambda0);
            } catch (Throwable th) {
                if (cursorIconCompatParcelizer != null) {
                    try {
                        cursorIconCompatParcelizer.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
                throw th;
            }
        }
        cursorIconCompatParcelizer.close();
        invalidaterootlayer.write();
        ((getLastLayerDrawingWasSkippedui) this.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer((headH91voCI) this.read);
        synchronized (map) {
        }
        return map;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void read(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        accessswap accessswapVarRemoteActionCompatParcelizer = withPositionTranslation.read;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            visitNodes visitnodes = (visitNodes) it.next();
            arrayList2.add(updateLayerParameters.write(visitnodes.RemoteActionCompatParcelizer));
            accessswapVarRemoteActionCompatParcelizer = accessswapVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(visitnodes, NodeCoordinatorCompanionPointerInputSource1.write(visitnodes, SnapshotVersion.IconCompatParcelizer));
        }
        headH91voCI headh91voci = (headH91voCI) this.read;
        List list = Collections.EMPTY_LIST;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ArrayList arrayList3 = new ArrayList(list);
            for (int i = 0; it2.hasNext() && i < 900 - list.size(); i++) {
                arrayList3.add(it2.next());
            }
            Object[] array = arrayList3.toArray();
            headh91voci.IconCompatParcelizer("DELETE FROM remote_documents WHERE path IN (" + ((Object) Util.read("?", array.length, ", ")) + ")", array);
        }
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(accessswapVarRemoteActionCompatParcelizer);
    }

    public LocalDocumentsView(LocalDocumentsView localDocumentsView, ChildHelper childHelper, x xVar, onLayoutModifierNodeChanged onlayoutmodifiernodechanged) {
        this.read = localDocumentsView;
        this.serializer = childHelper;
        this.RemoteActionCompatParcelizer = xVar;
        this.IconCompatParcelizer = onlayoutmodifiernodechanged;
    }

    public HashMap IconCompatParcelizer(accesssetLastLayerDrawingWasSkippedp accesssetlastlayerdrawingwasskippedp, setWrappedui setwrappedui, Set set, Timestamp.Companion companion) {
        shareWithSiblings sharewithsiblingsIconCompatParcelizer;
        shareWithSiblings sharewithsiblings = shareWithSiblings.serializer;
        accesssetlastlayerdrawingwasskippedp.getClass();
        if (accesssetlastlayerdrawingwasskippedp instanceof ancestorToLocal) {
            sharewithsiblingsIconCompatParcelizer = ((ancestorToLocal) accesssetlastlayerdrawingwasskippedp).IconCompatParcelizer.MediaSessionCompatQueueItem;
        } else {
            String strSerializer = accessheadNode.serializer(((accessoutOfBoundsHit8NAm7pk) accesssetlastlayerdrawingwasskippedp).read);
            getRectManager.RemoteActionCompatParcelizer(strSerializer != null, "SQLiteRemoteDocumentCache.getDocumentsMatchingQuery receives pipeline without collection source.", new Object[0]);
            sharewithsiblingsIconCompatParcelizer = shareWithSiblings.IconCompatParcelizer(strSerializer);
        }
        return serializer(Collections.singletonList(sharewithsiblingsIconCompatParcelizer), setwrappedui, Integer.MAX_VALUE, releaseLayer.FOUND_DOCUMENT, new CaptureRequestOptions$Builder$$ExternalSyntheticLambda0(accesssetlastlayerdrawingwasskippedp, 19, set), companion);
    }

    public HashMap write(Iterable iterable) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            visitNodes visitnodes = (visitNodes) it.next();
            arrayList.add(updateLayerParameters.write(visitnodes.RemoteActionCompatParcelizer));
            map.put(visitnodes, NodeCoordinatorCompanionPointerInputSource1.serializer(visitnodes));
        }
        accessgetModulatecp accessgetmodulatecp = new accessgetModulatecp((headH91voCI) this.read, arrayList);
        invalidateRootLayer invalidaterootlayer = new invalidateRootLayer();
        while (((Iterator) accessgetmodulatecp.serializer).hasNext()) {
            Cursor cursorIconCompatParcelizer = accessgetmodulatecp.IconCompatParcelizer().IconCompatParcelizer();
            while (cursorIconCompatParcelizer.moveToNext()) {
                try {
                    IconCompatParcelizer(invalidaterootlayer, map, cursorIconCompatParcelizer, (onLayoutChange) null);
                } catch (Throwable th) {
                    if (cursorIconCompatParcelizer != null) {
                        try {
                            cursorIconCompatParcelizer.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            cursorIconCompatParcelizer.close();
        }
        invalidaterootlayer.write();
        ((getLastLayerDrawingWasSkippedui) this.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer((headH91voCI) this.read);
        synchronized (map) {
        }
        return map;
    }
}
