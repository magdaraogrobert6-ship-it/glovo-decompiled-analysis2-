package o;

import android.database.Cursor;
import bo.app.wg$$ExternalSyntheticLambda0;
import com.google.firestore.v1.Value;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
public final class onLayoutModifierNodeChanged {
    public static final byte[] RemoteActionCompatParcelizer = new byte[0];
    public final getForceMeasureWithLookaheadConstraintsui MediaBrowserCompatMediaItem;
    public final String ParcelableVolumeInfo;
    public final headH91voCI serializer;
    public final HashMap RatingCompat = new HashMap();
    public final getLastLayerDrawingWasSkippedui write = new getLastLayerDrawingWasSkippedui(2);
    public final HashMap read = new HashMap();
    public final PriorityQueue MediaDescriptionCompat = new PriorityQueue(10, new wg$$ExternalSyntheticLambda0(10));
    public boolean MediaSessionCompatQueueItem = false;
    public int IconCompatParcelizer = -1;
    public long MediaMetadataCompat = -1;

    /* JADX WARN: Code duplicated, block: B:51:0x0182  */
    /* JADX WARN: Code duplicated, block: B:52:0x0185  */
    public final void RemoteActionCompatParcelizer(accessswap accessswapVar) {
        byte[] bArrCopyOf;
        int i;
        int i2;
        int i3;
        int i4 = 0;
        getRectManager.RemoteActionCompatParcelizer(this.MediaSessionCompatQueueItem, "IndexManager not started", new Object[0]);
        Iterator it = accessswapVar.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            for (toParentPosition8S9VItk toparentposition8s9vitk : IconCompatParcelizer(((visitNodes) entry.getKey()).write())) {
                visitNodes visitnodes = (visitNodes) entry.getKey();
                TreeSet treeSet = new TreeSet();
                headH91voCI headh91voci = this.serializer;
                com.huawei.wisesecurity.ucs_credential.x xVar = headh91voci.read("SELECT array_value, directional_value FROM index_entries WHERE index_id = ? AND document_key = ? AND uid = ?");
                int i5 = toparentposition8s9vitk.RemoteActionCompatParcelizer;
                String strWrite = visitnodes.RemoteActionCompatParcelizer.write();
                String str = this.ParcelableVolumeInfo;
                xVar.IconCompatParcelizer(Integer.valueOf(i5), strWrite, str);
                Cursor cursorIconCompatParcelizer = xVar.IconCompatParcelizer();
                while (cursorIconCompatParcelizer.moveToNext()) {
                    try {
                        treeSet.add(new outOfBoundsHit8NAm7pk(i5, visitnodes, cursorIconCompatParcelizer.getBlob(i4), cursorIconCompatParcelizer.getBlob(1)));
                    } catch (Throwable th) {
                        if (cursorIconCompatParcelizer == null) {
                            throw th;
                        }
                        try {
                            cursorIconCompatParcelizer.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                cursorIconCompatParcelizer.close();
                NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) entry.getValue();
                TreeSet treeSet2 = new TreeSet();
                toParentPosition8S9VItkdefault toparentposition8s9vitkdefault = new toParentPosition8S9VItkdefault();
                Iterator it2 = toparentposition8s9vitk.RemoteActionCompatParcelizer().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        updateLayerParametersdefault updatelayerparametersdefault = toparentposition8s9vitkdefault.write;
                        bArrCopyOf = Arrays.copyOf(updatelayerparametersdefault.read, updatelayerparametersdefault.write);
                        break;
                    }
                    shouldSharePointerInputWithSiblings shouldsharepointerinputwithsiblings = (shouldSharePointerInputWithSiblings) it2.next();
                    Value valueWrite = nodeCoordinatorCompanionPointerInputSource1.write.write(shouldsharepointerinputwithsiblings.IconCompatParcelizer);
                    if (valueWrite == null) {
                        bArrCopyOf = null;
                        break;
                    } else {
                        transformFromAncestorEL8BTi8 transformfromancestorel8bti8RemoteActionCompatParcelizer = toparentposition8s9vitkdefault.RemoteActionCompatParcelizer(shouldsharepointerinputwithsiblings.RemoteActionCompatParcelizer);
                        toCoordinator.write(valueWrite, transformfromancestorel8bti8RemoteActionCompatParcelizer);
                        transformfromancestorel8bti8RemoteActionCompatParcelizer.serializer();
                    }
                }
                if (bArrCopyOf != null) {
                    shouldSharePointerInputWithSiblings shouldsharepointerinputwithsiblingsWrite = toparentposition8s9vitk.write();
                    if (shouldsharepointerinputwithsiblingsWrite != null) {
                        Value valueWrite2 = nodeCoordinatorCompanionPointerInputSource1.write.write(shouldsharepointerinputwithsiblingsWrite.IconCompatParcelizer);
                        if (NodeCoordinatorCompaniononCommitAffectingLayer1.read(valueWrite2)) {
                            for (Value value : valueWrite2.getArrayValue().getValuesList()) {
                                visitNodes visitnodes2 = nodeCoordinatorCompanionPointerInputSource1.read;
                                toParentPosition8S9VItkdefault toparentposition8s9vitkdefault2 = new toParentPosition8S9VItkdefault();
                                transformFromAncestorEL8BTi8 transformfromancestorel8bti8RemoteActionCompatParcelizer2 = toparentposition8s9vitkdefault2.RemoteActionCompatParcelizer(NodeCoordinatorCompanion.ASCENDING);
                                toCoordinator.write(value, transformfromancestorel8bti8RemoteActionCompatParcelizer2);
                                transformfromancestorel8bti8RemoteActionCompatParcelizer2.serializer();
                                updateLayerParametersdefault updatelayerparametersdefault2 = toparentposition8s9vitkdefault2.write;
                                treeSet2.add(new outOfBoundsHit8NAm7pk(i5, visitnodes2, Arrays.copyOf(updatelayerparametersdefault2.read, updatelayerparametersdefault2.write), bArrCopyOf));
                            }
                        }
                        i = 0;
                    } else {
                        visitNodes visitnodes3 = nodeCoordinatorCompanionPointerInputSource1.read;
                        i = 0;
                        treeSet2.add(new outOfBoundsHit8NAm7pk(i5, visitnodes3, new byte[0], bArrCopyOf));
                    }
                } else {
                    i = 0;
                }
                if (!treeSet.equals(treeSet2)) {
                    NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource2 = (NodeCoordinatorCompanionPointerInputSource1) entry.getValue();
                    onEndApplyChanges.read("SQLiteIndexManager", "Updating index entries for document '%s'", nodeCoordinatorCompanionPointerInputSource2.read);
                    int i6 = com.google.firebase.firestore.util.Util.write;
                    Iterator it3 = treeSet.iterator();
                    Iterator it4 = treeSet2.iterator();
                    Comparator comparator = treeSet.comparator() != null ? treeSet.comparator() : new wg$$ExternalSyntheticLambda0(15);
                    Object objRemoteActionCompatParcelizer = com.google.firebase.firestore.util.Util.RemoteActionCompatParcelizer(it3);
                    Object objRemoteActionCompatParcelizer2 = com.google.firebase.firestore.util.Util.RemoteActionCompatParcelizer(it4);
                    while (true) {
                        if (objRemoteActionCompatParcelizer != null || objRemoteActionCompatParcelizer2 != null) {
                            if (objRemoteActionCompatParcelizer != null && objRemoteActionCompatParcelizer2 != null) {
                                int iCompare = comparator.compare(objRemoteActionCompatParcelizer, objRemoteActionCompatParcelizer2);
                                if (iCompare < 0) {
                                    i2 = i;
                                    i3 = 1;
                                } else if (iCompare > 0) {
                                    i3 = i;
                                    i2 = 1;
                                } else {
                                    i2 = i;
                                    i3 = i2;
                                }
                            } else if (objRemoteActionCompatParcelizer != null) {
                                i2 = i;
                                i3 = 1;
                            } else {
                                i3 = i;
                                i2 = 1;
                            }
                            if (i2 != 0) {
                                outOfBoundsHit8NAm7pk outofboundshit8nam7pk = (outOfBoundsHit8NAm7pk) objRemoteActionCompatParcelizer2;
                                headh91voci.IconCompatParcelizer("INSERT INTO index_entries (index_id, uid, array_value, directional_value, document_key) VALUES(?, ?, ?, ?, ?)", Integer.valueOf(outofboundshit8nam7pk.read), str, outofboundshit8nam7pk.RemoteActionCompatParcelizer, outofboundshit8nam7pk.IconCompatParcelizer, nodeCoordinatorCompanionPointerInputSource2.read.RemoteActionCompatParcelizer.write());
                                objRemoteActionCompatParcelizer2 = com.google.firebase.firestore.util.Util.RemoteActionCompatParcelizer(it4);
                            } else if (i3 != 0) {
                                outOfBoundsHit8NAm7pk outofboundshit8nam7pk2 = (outOfBoundsHit8NAm7pk) objRemoteActionCompatParcelizer;
                                headh91voci.IconCompatParcelizer("DELETE FROM index_entries WHERE index_id = ? AND uid = ? AND array_value = ? AND directional_value = ? AND document_key = ?", Integer.valueOf(outofboundshit8nam7pk2.read), str, outofboundshit8nam7pk2.RemoteActionCompatParcelizer, outofboundshit8nam7pk2.IconCompatParcelizer, nodeCoordinatorCompanionPointerInputSource2.read.RemoteActionCompatParcelizer.write());
                                objRemoteActionCompatParcelizer = com.google.firebase.firestore.util.Util.RemoteActionCompatParcelizer(it3);
                            } else {
                                objRemoteActionCompatParcelizer = com.google.firebase.firestore.util.Util.RemoteActionCompatParcelizer(it3);
                                objRemoteActionCompatParcelizer2 = com.google.firebase.firestore.util.Util.RemoteActionCompatParcelizer(it4);
                            }
                        }
                    }
                }
                i4 = i;
            }
        }
    }

    public final void RemoteActionCompatParcelizer(toParentPosition8S9VItk toparentposition8s9vitk) {
        String str = toparentposition8s9vitk.IconCompatParcelizer;
        int i = toparentposition8s9vitk.RemoteActionCompatParcelizer;
        HashMap map = this.read;
        Map map2 = (Map) map.get(str);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(str, map2);
        }
        toParentPosition8S9VItk toparentposition8s9vitk2 = (toParentPosition8S9VItk) map2.get(Integer.valueOf(i));
        PriorityQueue priorityQueue = this.MediaDescriptionCompat;
        if (toparentposition8s9vitk2 != null) {
            priorityQueue.remove(toparentposition8s9vitk2);
        }
        map2.put(Integer.valueOf(i), toparentposition8s9vitk);
        priorityQueue.add(toparentposition8s9vitk);
        this.IconCompatParcelizer = Math.max(this.IconCompatParcelizer, i);
        this.MediaMetadataCompat = Math.max(this.MediaMetadataCompat, toparentposition8s9vitk.read.serializer);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007b  */
    public final List serializer(fromParentRect fromparentrect) {
        List listSingletonList;
        HashMap map = this.RatingCompat;
        if (map.containsKey(fromparentrect)) {
            return (List) map.get(fromparentrect);
        }
        ArrayList arrayList = new ArrayList();
        if (fromparentrect.read.isEmpty()) {
            arrayList.add(fromparentrect);
        } else {
            setShouldAttachOnInsert setshouldattachoninsert = new setShouldAttachOnInsert(fromparentrect.read, linearDiffAborted.AND);
            if (Collections.unmodifiableList(setshouldattachoninsert.read).isEmpty()) {
                listSingletonList = Collections.EMPTY_LIST;
            } else {
                fillVector fillvector = onRequestRelayout.read(onRequestRelayout.RemoteActionCompatParcelizer(setshouldattachoninsert));
                getRectManager.RemoteActionCompatParcelizer(onRequestRelayout.IconCompatParcelizer(fillvector), "computeDistributedNormalForm did not result in disjunctive normal form", new Object[0]);
                if (fillvector instanceof nodeReused) {
                    listSingletonList = Collections.singletonList(fillvector);
                } else {
                    if (fillvector instanceof setShouldAttachOnInsert) {
                        setShouldAttachOnInsert setshouldattachoninsert2 = (setShouldAttachOnInsert) fillvector;
                        Iterator it = setshouldattachoninsert2.read.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((fillVector) it.next()) instanceof setShouldAttachOnInsert) {
                                }
                            } else if (setshouldattachoninsert2.IconCompatParcelizer()) {
                                listSingletonList = Collections.singletonList(fillvector);
                            }
                        }
                    }
                    listSingletonList = fillvector.RemoteActionCompatParcelizer();
                }
            }
            Iterator it2 = listSingletonList.iterator();
            while (it2.hasNext()) {
                arrayList.add(new fromParentRect(fromparentrect.MediaSessionCompatQueueItem, fromparentrect.write, ((fillVector) it2.next()).RemoteActionCompatParcelizer(), fromparentrect.MediaMetadataCompat, fromparentrect.serializer, fromparentrect.MediaBrowserCompatMediaItem, fromparentrect.IconCompatParcelizer));
            }
        }
        map.put(fromparentrect, arrayList);
        return arrayList;
    }

    public final Collection IconCompatParcelizer(String str) {
        getRectManager.RemoteActionCompatParcelizer(this.MediaSessionCompatQueueItem, "IndexManager not started", new Object[0]);
        Map map = (Map) this.read.get(str);
        return map == null ? Collections.EMPTY_LIST : map.values();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:50:0x010b  */
    /* JADX WARN: Code duplicated, block: B:57:0x012c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0138  */
    /* JADX WARN: Code duplicated, block: B:63:0x0147 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0149  */
    /* JADX WARN: Code duplicated, block: B:66:0x0157  */
    /* JADX WARN: Code duplicated, block: B:79:0x0123 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00ec A[EDGE_INSN: B:87:0x00ec->B:43:0x00ec BREAK  A[LOOP:3: B:34:0x00b3->B:41:0x00d7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:? A[PHI: r13
  PHI (r13v2 int) = (r13v1 int), (r13v5 int) binds: [B:47:0x00f7, B:62:0x0145] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public final toParentPosition8S9VItk IconCompatParcelizer(fromParentRect fromparentrect) {
        Iterator it;
        ArrayList arrayListRemoteActionCompatParcelizer;
        HashSet hashSet;
        int i;
        nodeReused nodereused;
        shouldSharePointerInputWithSiblings shouldsharepointerinputwithsiblings;
        shouldSharePointerInputWithSiblings shouldsharepointerinputwithsiblings2;
        Iterator it2;
        int i2 = 0;
        getRectManager.RemoteActionCompatParcelizer(this.MediaSessionCompatQueueItem, "IndexManager not started", new Object[0]);
        String strSerializer = fromparentrect.write;
        shareWithSiblings sharewithsiblings = fromparentrect.MediaSessionCompatQueueItem;
        if (strSerializer == null) {
            strSerializer = sharewithsiblings.serializer();
        }
        List list = fromparentrect.MediaMetadataCompat;
        TreeSet treeSet = new TreeSet(new wg$$ExternalSyntheticLambda0(14));
        ArrayList arrayList = new ArrayList();
        Iterator it3 = fromparentrect.read.iterator();
        while (it3.hasNext()) {
            nodeReused nodereused2 = (nodeReused) ((fillVector) it3.next());
            if (nodereused2.write()) {
                treeSet.add(nodereused2);
            } else {
                arrayList.add(nodereused2);
            }
        }
        String strSerializer2 = fromparentrect.write;
        if (strSerializer2 == null) {
            strSerializer2 = sharewithsiblings.serializer();
        }
        Collection<toParentPosition8S9VItk> collectionIconCompatParcelizer = IconCompatParcelizer(strSerializer2);
        toParentPosition8S9VItk toparentposition8s9vitk = null;
        if (collectionIconCompatParcelizer.isEmpty()) {
            return null;
        }
        for (toParentPosition8S9VItk toparentposition8s9vitk2 : collectionIconCompatParcelizer) {
            getRectManager.RemoteActionCompatParcelizer(toparentposition8s9vitk2.IconCompatParcelizer.equals(strSerializer), "Collection IDs do not match", new Object[i2]);
            if (treeSet.size() <= 1) {
                shouldSharePointerInputWithSiblings shouldsharepointerinputwithsiblingsWrite = toparentposition8s9vitk2.write();
                if (shouldsharepointerinputwithsiblingsWrite != null) {
                    Iterator it4 = arrayList.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            if (NodeCoordinatorCompanionSemanticsSource1.serializer((nodeReused) it4.next(), shouldsharepointerinputwithsiblingsWrite)) {
                                it = list.iterator();
                                arrayListRemoteActionCompatParcelizer = toparentposition8s9vitk2.RemoteActionCompatParcelizer();
                                hashSet = new HashSet();
                                i = i2;
                                while (i < arrayListRemoteActionCompatParcelizer.size()) {
                                    shouldsharepointerinputwithsiblings2 = (shouldSharePointerInputWithSiblings) arrayListRemoteActionCompatParcelizer.get(i);
                                    it2 = arrayList.iterator();
                                    do {
                                        if (it2.hasNext()) {
                                            break;
                                        }
                                    } while (!NodeCoordinatorCompanionSemanticsSource1.serializer((nodeReused) it2.next(), shouldsharepointerinputwithsiblings2));
                                    hashSet.add(((shouldSharePointerInputWithSiblings) arrayListRemoteActionCompatParcelizer.get(i)).IconCompatParcelizer.write());
                                    i++;
                                }
                                if (i != arrayListRemoteActionCompatParcelizer.size()) {
                                    if (treeSet.size() > 0) {
                                        nodereused = (nodeReused) treeSet.first();
                                        if (!hashSet.contains(nodereused.serializer.write())) {
                                            shouldsharepointerinputwithsiblings = (shouldSharePointerInputWithSiblings) arrayListRemoteActionCompatParcelizer.get(i);
                                            if (NodeCoordinatorCompanionSemanticsSource1.serializer(nodereused, shouldsharepointerinputwithsiblings) || !NodeCoordinatorCompanionSemanticsSource1.read((accessgetSnapshotObserver) it.next(), shouldsharepointerinputwithsiblings)) {
                                            }
                                        }
                                        i++;
                                        while (true) {
                                            if (i < arrayListRemoteActionCompatParcelizer.size()) {
                                                shouldSharePointerInputWithSiblings shouldsharepointerinputwithsiblings3 = (shouldSharePointerInputWithSiblings) arrayListRemoteActionCompatParcelizer.get(i);
                                                if (!it.hasNext() && NodeCoordinatorCompanionSemanticsSource1.read((accessgetSnapshotObserver) it.next(), shouldsharepointerinputwithsiblings3)) {
                                                    i++;
                                                }
                                            } else if (toparentposition8s9vitk != null || toparentposition8s9vitk2.write.size() > toparentposition8s9vitk.write.size()) {
                                                toparentposition8s9vitk = toparentposition8s9vitk2;
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            if (i < arrayListRemoteActionCompatParcelizer.size()) {
                                                shouldSharePointerInputWithSiblings shouldsharepointerinputwithsiblings4 = (shouldSharePointerInputWithSiblings) arrayListRemoteActionCompatParcelizer.get(i);
                                                if (!it.hasNext()) {
                                                }
                                            } else if (toparentposition8s9vitk != null) {
                                                toparentposition8s9vitk = toparentposition8s9vitk2;
                                            } else {
                                                toparentposition8s9vitk = toparentposition8s9vitk2;
                                            }
                                            i++;
                                        }
                                    }
                                } else if (toparentposition8s9vitk != null) {
                                    toparentposition8s9vitk = toparentposition8s9vitk2;
                                } else {
                                    toparentposition8s9vitk = toparentposition8s9vitk2;
                                }
                            }
                        }
                    }
                } else {
                    it = list.iterator();
                    arrayListRemoteActionCompatParcelizer = toparentposition8s9vitk2.RemoteActionCompatParcelizer();
                    hashSet = new HashSet();
                    i = i2;
                    while (i < arrayListRemoteActionCompatParcelizer.size()) {
                        shouldsharepointerinputwithsiblings2 = (shouldSharePointerInputWithSiblings) arrayListRemoteActionCompatParcelizer.get(i);
                        it2 = arrayList.iterator();
                        do {
                            if (it2.hasNext()) {
                                break;
                                break;
                            }
                        } while (!NodeCoordinatorCompanionSemanticsSource1.serializer((nodeReused) it2.next(), shouldsharepointerinputwithsiblings2));
                        hashSet.add(((shouldSharePointerInputWithSiblings) arrayListRemoteActionCompatParcelizer.get(i)).IconCompatParcelizer.write());
                        i++;
                    }
                    if (i != arrayListRemoteActionCompatParcelizer.size()) {
                        if (treeSet.size() > 0) {
                            nodereused = (nodeReused) treeSet.first();
                            if (!hashSet.contains(nodereused.serializer.write())) {
                                shouldsharepointerinputwithsiblings = (shouldSharePointerInputWithSiblings) arrayListRemoteActionCompatParcelizer.get(i);
                                if (NodeCoordinatorCompanionSemanticsSource1.serializer(nodereused, shouldsharepointerinputwithsiblings)) {
                                }
                            }
                            i++;
                            while (true) {
                                if (i < arrayListRemoteActionCompatParcelizer.size()) {
                                    shouldSharePointerInputWithSiblings shouldsharepointerinputwithsiblings5 = (shouldSharePointerInputWithSiblings) arrayListRemoteActionCompatParcelizer.get(i);
                                    if (!it.hasNext()) {
                                    }
                                } else if (toparentposition8s9vitk != null) {
                                    toparentposition8s9vitk = toparentposition8s9vitk2;
                                } else {
                                    toparentposition8s9vitk = toparentposition8s9vitk2;
                                }
                                i++;
                            }
                        } else {
                            while (true) {
                                if (i < arrayListRemoteActionCompatParcelizer.size()) {
                                    shouldSharePointerInputWithSiblings shouldsharepointerinputwithsiblings6 = (shouldSharePointerInputWithSiblings) arrayListRemoteActionCompatParcelizer.get(i);
                                    if (!it.hasNext()) {
                                    }
                                } else if (toparentposition8s9vitk != null) {
                                    toparentposition8s9vitk = toparentposition8s9vitk2;
                                } else {
                                    toparentposition8s9vitk = toparentposition8s9vitk2;
                                }
                                i++;
                            }
                        }
                    } else if (toparentposition8s9vitk != null) {
                        toparentposition8s9vitk = toparentposition8s9vitk2;
                    } else {
                        toparentposition8s9vitk = toparentposition8s9vitk2;
                    }
                }
            }
            i2 = 0;
        }
        return toparentposition8s9vitk;
    }

    public final List RemoteActionCompatParcelizer(String str) {
        getRectManager.RemoteActionCompatParcelizer(this.MediaSessionCompatQueueItem, "IndexManager not started", new Object[0]);
        ArrayList arrayList = new ArrayList();
        com.huawei.wisesecurity.ucs_credential.x xVar = this.serializer.read("SELECT parent FROM collection_parents WHERE collection_id = ?");
        xVar.IconCompatParcelizer(str);
        Cursor cursorIconCompatParcelizer = xVar.IconCompatParcelizer();
        while (cursorIconCompatParcelizer.moveToNext()) {
            try {
                arrayList.add(updateLayerParameters.RemoteActionCompatParcelizer(cursorIconCompatParcelizer.getString(0)));
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
        return arrayList;
    }

    public onLayoutModifierNodeChanged(headH91voCI headh91voci, getForceMeasureWithLookaheadConstraintsui getforcemeasurewithlookaheadconstraintsui, setOffset setoffset) {
        this.serializer = headh91voci;
        this.MediaBrowserCompatMediaItem = getforcemeasurewithlookaheadconstraintsui;
        String str = setoffset.IconCompatParcelizer;
        this.ParcelableVolumeInfo = str == null ? "" : str;
    }

    public static Object[] IconCompatParcelizer(toParentPosition8S9VItk toparentposition8s9vitk, fromParentRect fromparentrect, Collection collection) {
        Iterator it;
        Iterator it2;
        shouldSharePointerInputWithSiblings shouldsharepointerinputwithsiblings;
        Iterator it3;
        if (collection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new toParentPosition8S9VItkdefault());
        Iterator it4 = collection.iterator();
        Iterator it5 = toparentposition8s9vitk.RemoteActionCompatParcelizer().iterator();
        while (it5.hasNext()) {
            shouldSharePointerInputWithSiblings shouldsharepointerinputwithsiblings2 = (shouldSharePointerInputWithSiblings) it5.next();
            Value value = (Value) it4.next();
            Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                toParentPosition8S9VItkdefault toparentposition8s9vitkdefault = (toParentPosition8S9VItkdefault) it6.next();
                childHitTestqzLsGqo childhittestqzlsgqo = shouldsharepointerinputwithsiblings2.IconCompatParcelizer;
                NodeCoordinatorCompanion nodeCoordinatorCompanion = shouldsharepointerinputwithsiblings2.RemoteActionCompatParcelizer;
                Iterator it7 = fromparentrect.read.iterator();
                while (true) {
                    if (it7.hasNext()) {
                        fillVector fillvector = (fillVector) it7.next();
                        if (fillvector instanceof nodeReused) {
                            nodeReused nodereused = (nodeReused) fillvector;
                            if (nodereused.serializer.equals(childhittestqzlsgqo)) {
                                updateUnsafe updateunsafe = nodereused.read;
                                if (updateunsafe.equals(updateUnsafe.IN) || updateunsafe.equals(updateUnsafe.NOT_IN)) {
                                    if (NodeCoordinatorCompaniononCommitAffectingLayer1.read(value)) {
                                        ArrayList<toParentPosition8S9VItkdefault> arrayList2 = new ArrayList(arrayList);
                                        arrayList = new ArrayList();
                                        for (Value value2 : value.getArrayValue().getValuesList()) {
                                            for (toParentPosition8S9VItkdefault toparentposition8s9vitkdefault2 : arrayList2) {
                                                toParentPosition8S9VItkdefault toparentposition8s9vitkdefault3 = new toParentPosition8S9VItkdefault();
                                                updateLayerParametersdefault updatelayerparametersdefault = toparentposition8s9vitkdefault2.write;
                                                byte[] bArrCopyOf = Arrays.copyOf(updatelayerparametersdefault.read, updatelayerparametersdefault.write);
                                                int length = bArrCopyOf.length;
                                                updateLayerParametersdefault updatelayerparametersdefault2 = toparentposition8s9vitkdefault3.write;
                                                updatelayerparametersdefault2.write(length);
                                                int length2 = bArrCopyOf.length;
                                                Iterator it8 = it4;
                                                int i = 0;
                                                while (i < length2) {
                                                    byte b = bArrCopyOf[i];
                                                    Iterator it9 = it5;
                                                    byte[] bArr = updatelayerparametersdefault2.read;
                                                    shouldSharePointerInputWithSiblings shouldsharepointerinputwithsiblings3 = shouldsharepointerinputwithsiblings2;
                                                    int i2 = updatelayerparametersdefault2.write;
                                                    updatelayerparametersdefault2.write = i2 + 1;
                                                    bArr[i2] = b;
                                                    i++;
                                                    it5 = it9;
                                                    shouldsharepointerinputwithsiblings2 = shouldsharepointerinputwithsiblings3;
                                                    it6 = it6;
                                                }
                                                transformFromAncestorEL8BTi8 transformfromancestorel8bti8RemoteActionCompatParcelizer = toparentposition8s9vitkdefault3.RemoteActionCompatParcelizer(nodeCoordinatorCompanion);
                                                toCoordinator.write(value2, transformfromancestorel8bti8RemoteActionCompatParcelizer);
                                                transformfromancestorel8bti8RemoteActionCompatParcelizer.serializer();
                                                arrayList.add(toparentposition8s9vitkdefault3);
                                                it4 = it8;
                                            }
                                        }
                                        it = it4;
                                        it2 = it5;
                                        shouldsharepointerinputwithsiblings = shouldsharepointerinputwithsiblings2;
                                        it3 = it6;
                                    }
                                    it4 = it;
                                    it5 = it2;
                                    shouldsharepointerinputwithsiblings2 = shouldsharepointerinputwithsiblings;
                                    it6 = it3;
                                }
                            } else {
                                continue;
                            }
                        }
                        it4 = it4;
                        it5 = it5;
                        shouldsharepointerinputwithsiblings2 = shouldsharepointerinputwithsiblings2;
                        it6 = it6;
                    }
                    it = it4;
                    it2 = it5;
                    shouldsharepointerinputwithsiblings = shouldsharepointerinputwithsiblings2;
                    it3 = it6;
                    transformFromAncestorEL8BTi8 transformfromancestorel8bti8RemoteActionCompatParcelizer2 = toparentposition8s9vitkdefault.RemoteActionCompatParcelizer(nodeCoordinatorCompanion);
                    toCoordinator.write(value, transformfromancestorel8bti8RemoteActionCompatParcelizer2);
                    transformfromancestorel8bti8RemoteActionCompatParcelizer2.serializer();
                    it4 = it;
                    it5 = it2;
                    shouldsharepointerinputwithsiblings2 = shouldsharepointerinputwithsiblings;
                    it6 = it3;
                }
            }
        }
        Object[] objArr = new Object[arrayList.size()];
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            updateLayerParametersdefault updatelayerparametersdefault3 = ((toParentPosition8S9VItkdefault) arrayList.get(i3)).write;
            objArr[i3] = Arrays.copyOf(updatelayerparametersdefault3.read, updatelayerparametersdefault3.write);
        }
        return objArr;
    }

    public static setWrappedui RemoteActionCompatParcelizer(Collection collection) {
        getRectManager.RemoteActionCompatParcelizer(!collection.isEmpty(), "Found empty index group when looking for least recent index offset.", new Object[0]);
        Iterator it = collection.iterator();
        setWrappedui setwrappedui = ((toParentPosition8S9VItk) it.next()).read.read;
        int iMax = setwrappedui.IconCompatParcelizer;
        while (it.hasNext()) {
            setWrappedui setwrappedui2 = ((toParentPosition8S9VItk) it.next()).read.read;
            if (setwrappedui2.compareTo(setwrappedui) < 0) {
                setwrappedui = setwrappedui2;
            }
            iMax = Math.max(setwrappedui2.IconCompatParcelizer, iMax);
        }
        return new setWrappedui(setwrappedui.serializer, setwrappedui.write, iMax);
    }
}
