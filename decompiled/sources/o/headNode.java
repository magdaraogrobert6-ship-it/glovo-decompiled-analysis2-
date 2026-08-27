package o;

import coil3.disk.DiskLruCache$Editor;
import com.google.android.gms.internal.gtm.zzkh;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.location.Vw$Vw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.collections.ReversedListReadOnly;

/* JADX INFO: loaded from: classes2.dex */
public final class headNode {
    public boolean IconCompatParcelizer;
    public asList MediaDescriptionCompat;
    public isInExpandedTouchBoundsThDn1k RatingCompat = isInExpandedTouchBoundsThDn1k.NONE;
    public final accesssetLastLayerDrawingWasSkippedp RemoteActionCompatParcelizer;
    public withinLayerBoundsk4lQ0M read;
    public asList serializer;
    public asList write;

    public static int RemoteActionCompatParcelizer(nodeInserted nodeinserted) {
        int i = speculativeHitFh5PU_I.write[nodeinserted.read.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 3) {
                if (i == 4) {
                    return 0;
                }
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(nodeinserted.read, "Unknown change type: ");
                return 0;
            }
        }
        return i2;
    }

    public headNode(accesssetLastLayerDrawingWasSkippedp accesssetlastlayerdrawingwasskippedp, asList aslist) {
        this.RemoteActionCompatParcelizer = accesssetlastlayerdrawingwasskippedp;
        this.read = withinLayerBoundsk4lQ0M.IconCompatParcelizer(accesssetlastlayerdrawingwasskippedp.serializer());
        this.MediaDescriptionCompat = aslist;
        asList aslist2 = visitNodes.IconCompatParcelizer;
        this.serializer = aslist2;
        this.write = aslist2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003e  */
    public static Long read(accesssetLastLayerDrawingWasSkippedp accesssetlastlayerdrawingwasskippedp) {
        Integer numValueOf;
        specifiesCanFocusProperty specifiescanfocusproperty;
        accesssetlastlayerdrawingwasskippedp.getClass();
        if (!(accesssetlastlayerdrawingwasskippedp instanceof accessoutOfBoundsHit8NAm7pk)) {
            return null;
        }
        List listIconCompatParcelizer = ((accessoutOfBoundsHit8NAm7pk) accesssetlastlayerdrawingwasskippedp).read.IconCompatParcelizer();
        listIconCompatParcelizer.getClass();
        Iterator it = new ReversedListReadOnly(listIconCompatParcelizer).iterator();
        do {
            ListIterator listIterator = ((BaseContentCardView) it).write;
            if (listIterator.hasPrevious()) {
                specifiescanfocusproperty = (specifiesCanFocusProperty) listIterator.previous();
            } else {
                numValueOf = null;
            }
            if (numValueOf == null) {
                return null;
            }
            return Long.valueOf(numValueOf.intValue());
        } while (!(specifiescanfocusproperty instanceof getRemovedannotations));
        numValueOf = Integer.valueOf(((getRemovedannotations) specifiescanfocusproperty).write);
        if (numValueOf == null) {
            return null;
        }
        return Long.valueOf(numValueOf.intValue());
    }

    public final Vw$Vw serializer(DiskLruCache$Editor diskLruCache$Editor, getFocusOwner getfocusowner, boolean z) {
        List list;
        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1;
        isInExpandedTouchBoundsThDn1k isinexpandedtouchboundsthdn1k;
        offsetFromEdgeMKHz9U offsetfromedgemkhz9u;
        getRectManager.RemoteActionCompatParcelizer(!diskLruCache$Editor.read, "Cannot apply changes that need a refill", new Object[0]);
        withinLayerBoundsk4lQ0M withinlayerboundsk4lq0m = this.read;
        this.read = (withinLayerBoundsk4lQ0M) diskLruCache$Editor.write;
        this.write = (asList) diskLruCache$Editor.serializer;
        com.airbnb.lottie.PerformanceTracker performanceTracker = (com.airbnb.lottie.PerformanceTracker) diskLruCache$Editor.RemoteActionCompatParcelizer;
        performanceTracker.getClass();
        ArrayList arrayList = new ArrayList(performanceTracker.IconCompatParcelizer.values());
        Collections.sort(arrayList, new rectInParentuidefault(this.RemoteActionCompatParcelizer.serializer(), 0));
        if (getfocusowner != null) {
            Iterator it = getfocusowner.IconCompatParcelizer.iterator();
            while (true) {
                zzkh zzkhVar = (zzkh) it;
                if (!((Iterator) zzkhVar.RemoteActionCompatParcelizer).hasNext()) {
                    break;
                }
                this.MediaDescriptionCompat = this.MediaDescriptionCompat.IconCompatParcelizer((visitNodes) zzkhVar.next());
            }
            Iterator it2 = getfocusowner.RemoteActionCompatParcelizer.iterator();
            while (true) {
                zzkh zzkhVar2 = (zzkh) it2;
                if (!((Iterator) zzkhVar2.RemoteActionCompatParcelizer).hasNext()) {
                    break;
                }
                visitNodes visitnodes = (visitNodes) zzkhVar2.next();
                getRectManager.RemoteActionCompatParcelizer(this.MediaDescriptionCompat.RemoteActionCompatParcelizer.serializer(visitnodes), "Modified document %s not found in view.", visitnodes);
            }
            Iterator it3 = getfocusowner.read.iterator();
            while (true) {
                zzkh zzkhVar3 = (zzkh) it3;
                if (!((Iterator) zzkhVar3.RemoteActionCompatParcelizer).hasNext()) {
                    break;
                }
                this.MediaDescriptionCompat = this.MediaDescriptionCompat.read((visitNodes) zzkhVar3.next());
            }
            this.IconCompatParcelizer = getfocusowner.write;
        }
        if (z || !this.IconCompatParcelizer) {
            list = Collections.EMPTY_LIST;
        } else {
            asList aslist = this.serializer;
            this.serializer = visitNodes.IconCompatParcelizer;
            Iterator it4 = this.read.serializer.iterator();
            while (true) {
                zzkh zzkhVar4 = (zzkh) it4;
                if (!((Iterator) zzkhVar4.RemoteActionCompatParcelizer).hasNext()) {
                    break;
                }
                NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource2 = (NodeCoordinatorCompanionPointerInputSource1) zzkhVar4.next();
                visitNodes visitnodes2 = nodeCoordinatorCompanionPointerInputSource2.read;
                if (!this.MediaDescriptionCompat.RemoteActionCompatParcelizer.serializer(visitnodes2) && (nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) this.read.RemoteActionCompatParcelizer.IconCompatParcelizer(visitnodes2)) != null && !nodeCoordinatorCompanionPointerInputSource1.IconCompatParcelizer()) {
                    this.serializer = this.serializer.IconCompatParcelizer(nodeCoordinatorCompanionPointerInputSource2.read);
                }
            }
            ArrayList arrayList2 = new ArrayList(this.serializer.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer() + aslist.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer());
            Iterator it5 = aslist.iterator();
            while (true) {
                zzkh zzkhVar5 = (zzkh) it5;
                if (!((Iterator) zzkhVar5.RemoteActionCompatParcelizer).hasNext()) {
                    break;
                }
                visitNodes visitnodes3 = (visitNodes) zzkhVar5.next();
                if (!this.serializer.RemoteActionCompatParcelizer.serializer(visitnodes3)) {
                    arrayList2.add(new NodeCoordinator(accessgetGraphicsLayerScopecp.REMOVED, visitnodes3));
                }
            }
            Iterator it6 = this.serializer.iterator();
            while (true) {
                zzkh zzkhVar6 = (zzkh) it6;
                if (!((Iterator) zzkhVar6.RemoteActionCompatParcelizer).hasNext()) {
                    break;
                }
                visitNodes visitnodes4 = (visitNodes) zzkhVar6.next();
                if (!aslist.RemoteActionCompatParcelizer.serializer(visitnodes4)) {
                    arrayList2.add(new NodeCoordinator(accessgetGraphicsLayerScopecp.ADDED, visitnodes4));
                }
            }
            list = arrayList2;
        }
        if (this.serializer.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer() == 0 && this.IconCompatParcelizer && !z) {
            isinexpandedtouchboundsthdn1k = isInExpandedTouchBoundsThDn1k.SYNCED;
        } else {
            isinexpandedtouchboundsthdn1k = isInExpandedTouchBoundsThDn1k.LOCAL;
        }
        boolean z2 = isinexpandedtouchboundsthdn1k != this.RatingCompat;
        this.RatingCompat = isinexpandedtouchboundsthdn1k;
        if (arrayList.size() != 0 || z2) {
            offsetfromedgemkhz9u = new offsetFromEdgeMKHz9U(this.RemoteActionCompatParcelizer, (withinLayerBoundsk4lQ0M) diskLruCache$Editor.write, withinlayerboundsk4lq0m, arrayList, isinexpandedtouchboundsthdn1k == isInExpandedTouchBoundsThDn1k.LOCAL, (asList) diskLruCache$Editor.serializer, z2, false, (getfocusowner == null || getfocusowner.serializer.serializer()) ? false : true);
        } else {
            offsetfromedgemkhz9u = null;
        }
        return new Vw$Vw(offsetfromedgemkhz9u, 6, list);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:51:0x012a  */
    /* JADX WARN: Code duplicated, block: B:60:0x014b  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c2 A[PHI: r16
  0x01c2: PHI (r16v2 o.withinLayerBoundsk4lQ0M) = 
  (r16v0 o.withinLayerBoundsk4lQ0M)
  (r16v0 o.withinLayerBoundsk4lQ0M)
  (r16v5 o.withinLayerBoundsk4lQ0M)
  (r16v5 o.withinLayerBoundsk4lQ0M)
 binds: [B:89:0x01be, B:90:0x01c0, B:78:0x018f, B:75:0x0187] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x01c5 A[PHI: r16
  0x01c5: PHI (r16v4 o.withinLayerBoundsk4lQ0M) = 
  (r16v0 o.withinLayerBoundsk4lQ0M)
  (r16v0 o.withinLayerBoundsk4lQ0M)
  (r16v5 o.withinLayerBoundsk4lQ0M)
  (r16v5 o.withinLayerBoundsk4lQ0M)
 binds: [B:86:0x01b0, B:87:0x01b2, B:80:0x0192, B:70:0x0170] A[DONT_GENERATE, DONT_INLINE]] */
    public final DiskLruCache$Editor write(accessswap accessswapVar, DiskLruCache$Editor diskLruCache$Editor) {
        com.airbnb.lottie.PerformanceTracker performanceTracker;
        withinLayerBoundsk4lQ0M withinlayerboundsk4lq0m;
        asList aslist;
        i$d i_d;
        i$d i_d2;
        i$d i_d3;
        int i;
        boolean z;
        accesssetDrawBlockParentLayerp accesssetdrawblockparentlayerp;
        Object objWrite;
        boolean z2;
        boolean z3;
        withinLayerBoundsk4lQ0M withinlayerboundsk4lq0m2;
        boolean z4;
        asList aslistIconCompatParcelizer;
        headNode headnode = this;
        if (diskLruCache$Editor != null) {
            performanceTracker = (com.airbnb.lottie.PerformanceTracker) diskLruCache$Editor.RemoteActionCompatParcelizer;
        } else {
            performanceTracker = new com.airbnb.lottie.PerformanceTracker(2);
        }
        if (diskLruCache$Editor != null) {
            withinlayerboundsk4lq0m = (withinLayerBoundsk4lQ0M) diskLruCache$Editor.write;
        } else {
            withinlayerboundsk4lq0m = headnode.read;
        }
        if (diskLruCache$Editor != null) {
            aslist = (asList) diskLruCache$Editor.serializer;
        } else {
            aslist = headnode.write;
        }
        accesssetLastLayerDrawingWasSkippedp accesssetlastlayerdrawingwasskippedp = headnode.RemoteActionCompatParcelizer;
        Long l = read(accesssetlastlayerdrawingwasskippedp);
        int i2 = 26;
        Object obj = null;
        boolean z5 = false;
        if (l == null) {
            i_d2 = new i$d(obj, obj, z5, i2);
        } else if (accesssetlastlayerdrawingwasskippedp instanceof accessoutOfBoundsHit8NAm7pk) {
            if (l.longValue() > 0 && withinlayerboundsk4lq0m.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer() == l.longValue()) {
                i_d3 = new i$d((NodeCoordinatorCompanionPointerInputSource1) withinlayerboundsk4lq0m.serializer.RemoteActionCompatParcelizer.read(), obj, z5, i2);
            } else if (l.longValue() < 0 && withinlayerboundsk4lq0m.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer() == (-l.longValue())) {
                i_d3 = new i$d(obj, (NodeCoordinatorCompanionPointerInputSource1) withinlayerboundsk4lq0m.serializer.RemoteActionCompatParcelizer.write(), z5, i2);
            } else {
                i_d2 = new i$d(obj, obj, z5, i2);
            }
            i_d2 = i_d3;
        } else {
            accesssetDrawBlockParentLayerp accesssetdrawblockparentlayerp2 = ((ancestorToLocal) accesssetlastlayerdrawingwasskippedp).IconCompatParcelizer.write;
            if (accesssetdrawblockparentlayerp2 == accesssetDrawBlockParentLayerp.LIMIT_TO_FIRST && withinlayerboundsk4lq0m.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer() == -1) {
                i_d = new i$d((NodeCoordinatorCompanionPointerInputSource1) withinlayerboundsk4lq0m.serializer.RemoteActionCompatParcelizer.read(), obj, z5, i2);
            } else if (accesssetdrawblockparentlayerp2 == accesssetDrawBlockParentLayerp.LIMIT_TO_LAST && withinlayerboundsk4lq0m.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer() == -1) {
                i_d = new i$d(obj, (NodeCoordinatorCompanionPointerInputSource1) withinlayerboundsk4lq0m.serializer.RemoteActionCompatParcelizer.write(), z5, i2);
            } else {
                i_d2 = new i$d(obj, obj, z5, i2);
            }
            i_d2 = i_d;
        }
        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) i_d2.serializer;
        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource2 = (NodeCoordinatorCompanionPointerInputSource1) i_d2.read;
        Iterator it = accessswapVar.iterator();
        withinLayerBoundsk4lQ0M withinlayerboundsk4lq0m3 = withinlayerboundsk4lq0m;
        boolean z6 = false;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            visitNodes visitnodes = (visitNodes) entry.getKey();
            NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource3 = (NodeCoordinatorCompanionPointerInputSource1) withinlayerboundsk4lq0m.RemoteActionCompatParcelizer.IconCompatParcelizer(visitnodes);
            NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource4 = accesssetlastlayerdrawingwasskippedp.write((NodeCoordinatorCompanionPointerInputSource1) entry.getValue()) ? (NodeCoordinatorCompanionPointerInputSource1) entry.getValue() : null;
            if (nodeCoordinatorCompanionPointerInputSource3 != null) {
                if (headnode.write.RemoteActionCompatParcelizer.serializer(nodeCoordinatorCompanionPointerInputSource3.read)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            if (nodeCoordinatorCompanionPointerInputSource4 != null) {
                if (!nodeCoordinatorCompanionPointerInputSource4.IconCompatParcelizer()) {
                    z3 = headnode.write.RemoteActionCompatParcelizer.serializer(nodeCoordinatorCompanionPointerInputSource4.read) && nodeCoordinatorCompanionPointerInputSource4.RemoteActionCompatParcelizer.equals(getPointerInputSource.HAS_COMMITTED_MUTATIONS);
                }
            }
            if (nodeCoordinatorCompanionPointerInputSource3 == null || nodeCoordinatorCompanionPointerInputSource4 == null) {
                withinlayerboundsk4lq0m2 = withinlayerboundsk4lq0m;
                if (nodeCoordinatorCompanionPointerInputSource3 == null && nodeCoordinatorCompanionPointerInputSource4 != null) {
                    performanceTracker.IconCompatParcelizer(new nodeInserted(nodeRemoved.ADDED, nodeCoordinatorCompanionPointerInputSource4));
                } else if (nodeCoordinatorCompanionPointerInputSource3 == null || nodeCoordinatorCompanionPointerInputSource4 != null) {
                    z4 = false;
                } else {
                    performanceTracker.IconCompatParcelizer(new nodeInserted(nodeRemoved.REMOVED, nodeCoordinatorCompanionPointerInputSource3));
                    if (nodeCoordinatorCompanionPointerInputSource1 != null || nodeCoordinatorCompanionPointerInputSource2 != null) {
                        z6 = true;
                    }
                }
                z4 = true;
            } else {
                withinlayerboundsk4lq0m2 = withinlayerboundsk4lq0m;
                if (nodeCoordinatorCompanionPointerInputSource3.write.equals(nodeCoordinatorCompanionPointerInputSource4.write)) {
                    if (z2 != z3) {
                        performanceTracker.IconCompatParcelizer(new nodeInserted(nodeRemoved.METADATA, nodeCoordinatorCompanionPointerInputSource4));
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                } else if (nodeCoordinatorCompanionPointerInputSource3.IconCompatParcelizer() && nodeCoordinatorCompanionPointerInputSource4.RemoteActionCompatParcelizer.equals(getPointerInputSource.HAS_COMMITTED_MUTATIONS) && !nodeCoordinatorCompanionPointerInputSource4.IconCompatParcelizer()) {
                    z4 = false;
                } else {
                    performanceTracker.IconCompatParcelizer(new nodeInserted(nodeRemoved.MODIFIED, nodeCoordinatorCompanionPointerInputSource4));
                    Comparator comparatorSerializer = accesssetlastlayerdrawingwasskippedp.serializer();
                    if ((nodeCoordinatorCompanionPointerInputSource1 != null && comparatorSerializer.compare(nodeCoordinatorCompanionPointerInputSource4, nodeCoordinatorCompanionPointerInputSource1) > 0) || (nodeCoordinatorCompanionPointerInputSource2 != null && comparatorSerializer.compare(nodeCoordinatorCompanionPointerInputSource4, nodeCoordinatorCompanionPointerInputSource2) < 0)) {
                        z6 = true;
                    }
                    z4 = true;
                }
            }
            if (z4) {
                if (nodeCoordinatorCompanionPointerInputSource4 != null) {
                    withinlayerboundsk4lq0m3.getClass();
                    visitNodes visitnodes2 = nodeCoordinatorCompanionPointerInputSource4.read;
                    withinLayerBoundsk4lQ0M withinlayerboundsk4lq0m4 = withinlayerboundsk4lq0m3.read(visitnodes2);
                    withinLayerBoundsk4lQ0M withinlayerboundsk4lq0m5 = new withinLayerBoundsk4lQ0M(withinlayerboundsk4lq0m4.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(visitnodes2, nodeCoordinatorCompanionPointerInputSource4), withinlayerboundsk4lq0m4.serializer.IconCompatParcelizer(nodeCoordinatorCompanionPointerInputSource4));
                    if (nodeCoordinatorCompanionPointerInputSource4.IconCompatParcelizer()) {
                        aslistIconCompatParcelizer = aslist.IconCompatParcelizer(visitnodes2);
                    } else {
                        aslistIconCompatParcelizer = aslist.read(visitnodes2);
                    }
                    withinlayerboundsk4lq0m3 = withinlayerboundsk4lq0m5;
                } else {
                    withinlayerboundsk4lq0m3 = withinlayerboundsk4lq0m3.read(visitnodes);
                    aslistIconCompatParcelizer = aslist.read(visitnodes);
                }
                aslist = aslistIconCompatParcelizer;
            }
            headnode = this;
            withinlayerboundsk4lq0m = withinlayerboundsk4lq0m2;
        }
        Long l2 = read(accesssetlastlayerdrawingwasskippedp);
        if (l2 != null) {
            boolean z7 = accesssetlastlayerdrawingwasskippedp instanceof accessoutOfBoundsHit8NAm7pk;
            if (z7) {
                ArrayList arrayList = new ArrayList();
                Iterator it2 = withinlayerboundsk4lq0m3.serializer.iterator();
                while (true) {
                    zzkh zzkhVar = (zzkh) it2;
                    if (!((Iterator) zzkhVar.RemoteActionCompatParcelizer).hasNext()) {
                        break;
                    }
                    arrayList.add((NodeCoordinatorCompanionPointerInputSource1) zzkhVar.next());
                }
                List<NodeCoordinatorCompanionPointerInputSource1> listIconCompatParcelizer = ((accessoutOfBoundsHit8NAm7pk) accesssetlastlayerdrawingwasskippedp).read.IconCompatParcelizer(arrayList);
                withinLayerBoundsk4lQ0M withinlayerboundsk4lq0mIconCompatParcelizer = withinLayerBoundsk4lQ0M.IconCompatParcelizer(accesssetlastlayerdrawingwasskippedp.serializer());
                for (NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource5 : listIconCompatParcelizer) {
                    withinLayerBoundsk4lQ0M withinlayerboundsk4lq0m6 = withinlayerboundsk4lq0mIconCompatParcelizer.read(nodeCoordinatorCompanionPointerInputSource5.read);
                    withinlayerboundsk4lq0mIconCompatParcelizer = new withinLayerBoundsk4lQ0M(withinlayerboundsk4lq0m6.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(nodeCoordinatorCompanionPointerInputSource5.read, nodeCoordinatorCompanionPointerInputSource5), withinlayerboundsk4lq0m6.serializer.IconCompatParcelizer(nodeCoordinatorCompanionPointerInputSource5));
                }
                Iterator it3 = withinlayerboundsk4lq0m3.serializer.iterator();
                while (true) {
                    zzkh zzkhVar2 = (zzkh) it3;
                    if (!((Iterator) zzkhVar2.RemoteActionCompatParcelizer).hasNext()) {
                        break;
                    }
                    NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource6 = (NodeCoordinatorCompanionPointerInputSource1) zzkhVar2.next();
                    if (!withinlayerboundsk4lq0mIconCompatParcelizer.RemoteActionCompatParcelizer.serializer(nodeCoordinatorCompanionPointerInputSource6.read)) {
                        aslist = aslist.read(nodeCoordinatorCompanionPointerInputSource6.read);
                        performanceTracker.IconCompatParcelizer(new nodeInserted(nodeRemoved.REMOVED, nodeCoordinatorCompanionPointerInputSource6));
                    }
                }
                withinlayerboundsk4lq0m3 = withinlayerboundsk4lq0mIconCompatParcelizer;
            } else {
                long jAbs = Math.abs(l2.longValue());
                if (z7) {
                    Long l3 = read(accesssetlastlayerdrawingwasskippedp);
                    if (l3 != null && l3.longValue() > 0) {
                        accesssetdrawblockparentlayerp = accesssetDrawBlockParentLayerp.LIMIT_TO_FIRST;
                    } else {
                        accesssetdrawblockparentlayerp = accesssetDrawBlockParentLayerp.LIMIT_TO_LAST;
                    }
                } else {
                    accesssetdrawblockparentlayerp = ((ancestorToLocal) accesssetlastlayerdrawingwasskippedp).IconCompatParcelizer.write;
                }
                for (long jRemoteActionCompatParcelizer = ((long) withinlayerboundsk4lq0m3.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer()) - jAbs; jRemoteActionCompatParcelizer > 0; jRemoteActionCompatParcelizer--) {
                    accesssetDrawBlockParentLayerp accesssetdrawblockparentlayerp3 = accesssetDrawBlockParentLayerp.LIMIT_TO_FIRST;
                    asList aslist2 = withinlayerboundsk4lq0m3.serializer;
                    if (accesssetdrawblockparentlayerp == accesssetdrawblockparentlayerp3) {
                        objWrite = aslist2.RemoteActionCompatParcelizer.read();
                    } else {
                        objWrite = aslist2.RemoteActionCompatParcelizer.write();
                    }
                    NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource7 = (NodeCoordinatorCompanionPointerInputSource1) objWrite;
                    withinlayerboundsk4lq0m3 = withinlayerboundsk4lq0m3.read(nodeCoordinatorCompanionPointerInputSource7.read);
                    aslist = aslist.read(nodeCoordinatorCompanionPointerInputSource7.read);
                    performanceTracker.IconCompatParcelizer(new nodeInserted(nodeRemoved.REMOVED, nodeCoordinatorCompanionPointerInputSource7));
                }
            }
        }
        if (!z6 || diskLruCache$Editor == null) {
            i = 0;
            z = true;
        } else {
            i = 0;
            z = false;
        }
        getRectManager.RemoteActionCompatParcelizer(z, "View was refilled using docs that themselves needed refilling.", new Object[i]);
        return new DiskLruCache$Editor(withinlayerboundsk4lq0m3, performanceTracker, aslist, z6);
    }
}
