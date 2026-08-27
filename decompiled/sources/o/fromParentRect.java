package o;

import android.util.Pair;
import com.google.firestore.v1.Value;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fromParentRect {
    public final setBefore IconCompatParcelizer;
    public final setBefore MediaBrowserCompatMediaItem;
    public final List MediaMetadataCompat;
    public final shareWithSiblings MediaSessionCompatQueueItem;
    public String RemoteActionCompatParcelizer;
    public final List read;
    public final long serializer;
    public final String write;

    public final int hashCode() {
        int iHashCode = this.MediaMetadataCompat.hashCode();
        String str = this.write;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        int iHashCode3 = this.read.hashCode();
        int iHashCode4 = this.MediaSessionCompatQueueItem.hashCode();
        long j = this.serializer;
        int i = (int) (j ^ (j >>> 32));
        setBefore setbefore = this.MediaBrowserCompatMediaItem;
        int iHashCode5 = setbefore != null ? setbefore.hashCode() : 0;
        setBefore setbefore2 = this.IconCompatParcelizer;
        return ((((((iHashCode4 + ((iHashCode3 + (((iHashCode * 31) + iHashCode2) * 31)) * 31)) * 31) + i) * 31) + iHashCode5) * 31) + (setbefore2 != null ? setbefore2.hashCode() : 0);
    }

    public final ArrayList read(childHitTestqzLsGqo childhittestqzlsgqo) {
        ArrayList arrayList = new ArrayList();
        for (fillVector fillvector : this.read) {
            if (fillvector instanceof nodeReused) {
                nodeReused nodereused = (nodeReused) fillvector;
                if (nodereused.serializer.equals(childhittestqzlsgqo)) {
                    arrayList.add(nodereused);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007a A[FALL_THROUGH, PHI: r4
  0x007a: PHI (r4v5 com.google.firestore.v1.Value) = 
  (r4v4 com.google.firestore.v1.Value)
  (r4v4 com.google.firestore.v1.Value)
  (r4v4 com.google.firestore.v1.Value)
  (r4v8 com.google.firestore.v1.Value)
  (r4v9 com.google.firestore.v1.Value)
  (r4v10 com.google.firestore.v1.Value)
  (r4v11 com.google.firestore.v1.Value)
  (r4v12 com.google.firestore.v1.Value)
  (r4v13 com.google.firestore.v1.Value)
  (r4v14 com.google.firestore.v1.Value)
  (r4v15 com.google.firestore.v1.Value)
  (r4v16 com.google.firestore.v1.Value)
  (r4v18 com.google.firestore.v1.Value)
  (r4v19 com.google.firestore.v1.Value)
 binds: [B:6:0x002a, B:8:0x002d, B:9:0x002f, B:30:0x0078, B:29:0x0075, B:28:0x0072, B:27:0x006f, B:26:0x006c, B:25:0x0069, B:24:0x0066, B:23:0x0063, B:22:0x0060, B:21:0x005d, B:20:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x008c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x000e A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Switch 'out' block B:31:0x007a for B:15:0x0046 already processed. Defaulting to fallback option. */
    public final Pair serializer(shouldSharePointerInputWithSiblings shouldsharepointerinputwithsiblings, setBefore setbefore) {
        int iRemoteActionCompatParcelizer;
        Value value = NodeCoordinatorCompaniononCommitAffectingLayer1.ParcelableVolumeInfo;
        childHitTestqzLsGqo childhittestqzlsgqo = shouldsharepointerinputwithsiblings.IconCompatParcelizer;
        Iterator it = read(childhittestqzlsgqo).iterator();
        boolean z = 1;
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                if (setbefore != null) {
                    boolean z2 = setbefore.RemoteActionCompatParcelizer;
                    while (true) {
                        List list = this.MediaMetadataCompat;
                        if (i < list.size()) {
                            if (((accessgetSnapshotObserver) list.get(i)).RemoteActionCompatParcelizer.equals(childhittestqzlsgqo)) {
                                Value value2 = (Value) setbefore.write.get(i);
                                value.getClass();
                                value2.getClass();
                                int iRemoteActionCompatParcelizer2 = NodeCoordinatorCompaniononCommitAffectingLayer1.RemoteActionCompatParcelizer(value, value2);
                                if (iRemoteActionCompatParcelizer2 == 0 ? !(z == 0 || z2) : iRemoteActionCompatParcelizer2 < 0) {
                                    value = value2;
                                    z = z2;
                                }
                            } else {
                                i++;
                            }
                        }
                    }
                }
                return new Pair(value, Boolean.valueOf(z));
            }
            nodeReused nodereused = (nodeReused) it.next();
            Value value3 = NodeCoordinatorCompaniononCommitAffectingLayer1.ParcelableVolumeInfo;
            int[] iArr = hit5ShdDok.RemoteActionCompatParcelizer;
            updateUnsafe updateunsafe = nodereused.read;
            Value value4 = nodereused.RemoteActionCompatParcelizer;
            int i2 = iArr[updateunsafe.ordinal()];
            if (i2 != 3 && i2 != 4) {
                switch (i2) {
                    case 7:
                    case 8:
                        value4.getClass();
                        Value.RemoteActionCompatParcelizer valueTypeCase = value4.getValueTypeCase();
                        switch (valueTypeCase == null ? -1 : NodeCoordinatorinvalidateParentLayer1.write[valueTypeCase.ordinal()]) {
                            case 1:
                                value4 = NodeCoordinatorCompaniononCommitAffectingLayer1.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                                break;
                            case 2:
                                value4 = NodeCoordinatorCompaniononCommitAffectingLayer1.MediaMetadataCompat;
                                break;
                            case 3:
                            case 4:
                                value4 = NodeCoordinatorCompaniononCommitAffectingLayer1.MediaDescriptionCompat;
                                break;
                            case 5:
                                value4 = NodeCoordinatorCompaniononCommitAffectingLayer1.MediaSessionCompatToken;
                                break;
                            case 6:
                                value4 = NodeCoordinatorCompaniononCommitAffectingLayer1.PlaybackStateCompatCustomAction;
                                break;
                            case 7:
                                value4 = NodeCoordinatorCompaniononCommitAffectingLayer1.MediaBrowserCompatMediaItem;
                                break;
                            case 8:
                                value4 = NodeCoordinatorCompaniononCommitAffectingLayer1.MediaSessionCompatResultReceiverWrapper;
                                break;
                            case 9:
                                value4 = NodeCoordinatorCompaniononCommitAffectingLayer1.MediaSessionCompatQueueItem;
                                break;
                            case 10:
                                value4 = NodeCoordinatorCompaniononCommitAffectingLayer1.IconCompatParcelizer;
                                break;
                            case 11:
                                value4 = !NodeCoordinatorCompaniononCommitAffectingLayer1.write(value4) ? NodeCoordinatorCompaniononCommitAffectingLayer1.RatingCompat : NodeCoordinatorCompaniononCommitAffectingLayer1.PlaybackStateCompat;
                                break;
                            default:
                                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(value4.getValueTypeCase(), "Unknown value type: ");
                                return null;
                        }
                    case 9:
                        value3 = value4;
                    default:
                        i = 1;
                        value4 = value3;
                    case 10:
                        value.getClass();
                        value4.getClass();
                        iRemoteActionCompatParcelizer = NodeCoordinatorCompaniononCommitAffectingLayer1.RemoteActionCompatParcelizer(value, value4);
                        if (iRemoteActionCompatParcelizer != 0) {
                            if (iRemoteActionCompatParcelizer < 0) {
                                value = value4;
                                z = i;
                            }
                        } else if (z == 0 && i == 0) {
                            value = value4;
                            z = i;
                        }
                        break;
                }
            } else {
                value3 = value4;
                i = 1;
                value4 = value3;
            }
            value.getClass();
            value4.getClass();
            iRemoteActionCompatParcelizer = NodeCoordinatorCompaniononCommitAffectingLayer1.RemoteActionCompatParcelizer(value, value4);
            if (iRemoteActionCompatParcelizer != 0) {
                if (iRemoteActionCompatParcelizer < 0) {
                    value = value4;
                    z = i;
                }
            } else if (z == 0) {
            }
        }
    }

    public final boolean serializer() {
        return visitNodes.serializer(this.MediaSessionCompatQueueItem) && this.write == null && this.read.isEmpty();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:58:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x000e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x000e A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final Pair write(shouldSharePointerInputWithSiblings shouldsharepointerinputwithsiblings, setBefore setbefore) {
        int iRemoteActionCompatParcelizer;
        Value value = NodeCoordinatorCompaniononCommitAffectingLayer1.read;
        childHitTestqzLsGqo childhittestqzlsgqo = shouldsharepointerinputwithsiblings.IconCompatParcelizer;
        Iterator it = read(childhittestqzlsgqo).iterator();
        boolean z = 1;
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                if (setbefore != null) {
                    boolean z2 = setbefore.RemoteActionCompatParcelizer;
                    while (true) {
                        List list = this.MediaMetadataCompat;
                        if (i < list.size()) {
                            if (((accessgetSnapshotObserver) list.get(i)).RemoteActionCompatParcelizer.equals(childhittestqzlsgqo)) {
                                Value value2 = (Value) setbefore.write.get(i);
                                value.getClass();
                                value2.getClass();
                                int iRemoteActionCompatParcelizer2 = NodeCoordinatorCompaniononCommitAffectingLayer1.RemoteActionCompatParcelizer(value, value2);
                                if (iRemoteActionCompatParcelizer2 == 0 ? !(z == 0 || z2) : iRemoteActionCompatParcelizer2 > 0) {
                                    value = value2;
                                    z = z2;
                                }
                            } else {
                                i++;
                            }
                        }
                    }
                }
                return new Pair(value, Boolean.valueOf(z));
            }
            nodeReused nodereused = (nodeReused) it.next();
            Value value3 = NodeCoordinatorCompaniononCommitAffectingLayer1.read;
            int[] iArr = hit5ShdDok.RemoteActionCompatParcelizer;
            updateUnsafe updateunsafe = nodereused.read;
            Value value4 = nodereused.RemoteActionCompatParcelizer;
            int i2 = iArr[updateunsafe.ordinal()];
            if (i2 != 3 && i2 != 4) {
                switch (i2) {
                    case 7:
                        value3 = value4;
                        value.getClass();
                        value3.getClass();
                        iRemoteActionCompatParcelizer = NodeCoordinatorCompaniononCommitAffectingLayer1.RemoteActionCompatParcelizer(value, value3);
                        if (iRemoteActionCompatParcelizer != 0) {
                            if (iRemoteActionCompatParcelizer > 0) {
                                z = i;
                                value = value3;
                            }
                        } else if (z == 0 && i == 0) {
                            z = i;
                            value = value3;
                        }
                        break;
                    case 8:
                        value3 = value4;
                        break;
                    case 9:
                    case 10:
                        value4.getClass();
                        Value.RemoteActionCompatParcelizer valueTypeCase = value4.getValueTypeCase();
                        switch (valueTypeCase == null ? -1 : NodeCoordinatorinvalidateParentLayer1.write[valueTypeCase.ordinal()]) {
                            case 1:
                                value3 = NodeCoordinatorCompaniononCommitAffectingLayer1.MediaMetadataCompat;
                                break;
                            case 2:
                                value3 = NodeCoordinatorCompaniononCommitAffectingLayer1.MediaDescriptionCompat;
                                break;
                            case 3:
                            case 4:
                                value3 = NodeCoordinatorCompaniononCommitAffectingLayer1.MediaSessionCompatToken;
                                break;
                            case 5:
                                value3 = NodeCoordinatorCompaniononCommitAffectingLayer1.PlaybackStateCompatCustomAction;
                                break;
                            case 6:
                                value3 = NodeCoordinatorCompaniononCommitAffectingLayer1.MediaBrowserCompatMediaItem;
                                break;
                            case 7:
                                value3 = NodeCoordinatorCompaniononCommitAffectingLayer1.MediaSessionCompatResultReceiverWrapper;
                                break;
                            case 8:
                                value3 = NodeCoordinatorCompaniononCommitAffectingLayer1.MediaSessionCompatQueueItem;
                                break;
                            case 9:
                                value3 = NodeCoordinatorCompaniononCommitAffectingLayer1.IconCompatParcelizer;
                                break;
                            case 10:
                                value3 = NodeCoordinatorCompaniononCommitAffectingLayer1.PlaybackStateCompat;
                                break;
                            case 11:
                                if (NodeCoordinatorCompaniononCommitAffectingLayer1.write(value4)) {
                                    value3 = NodeCoordinatorCompaniononCommitAffectingLayer1.RatingCompat;
                                }
                                break;
                            default:
                                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(value4.getValueTypeCase(), "Unknown value type: ");
                                return null;
                        }
                        value.getClass();
                        value3.getClass();
                        iRemoteActionCompatParcelizer = NodeCoordinatorCompaniononCommitAffectingLayer1.RemoteActionCompatParcelizer(value, value3);
                        if (iRemoteActionCompatParcelizer != 0) {
                            if (iRemoteActionCompatParcelizer > 0) {
                                z = i;
                                value = value3;
                            }
                        } else if (z == 0) {
                        }
                        break;
                }
            } else {
                value3 = value4;
            }
            i = 1;
            value.getClass();
            value3.getClass();
            iRemoteActionCompatParcelizer = NodeCoordinatorCompaniononCommitAffectingLayer1.RemoteActionCompatParcelizer(value, value3);
            if (iRemoteActionCompatParcelizer != 0) {
                if (iRemoteActionCompatParcelizer > 0) {
                    z = i;
                    value = value3;
                }
            } else if (z == 0) {
            }
        }
    }

    public fromParentRect(shareWithSiblings sharewithsiblings, String str, List list, List list2, long j, setBefore setbefore, setBefore setbefore2) {
        this.MediaSessionCompatQueueItem = sharewithsiblings;
        this.write = str;
        this.MediaMetadataCompat = list2;
        this.read = list;
        this.serializer = j;
        this.MediaBrowserCompatMediaItem = setbefore;
        this.IconCompatParcelizer = setbefore2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Query(");
        sb.append(this.MediaSessionCompatQueueItem.write());
        String str = this.write;
        if (str != null) {
            sb.append(" collectionGroup=");
            sb.append(str);
        }
        List list = this.read;
        if (!list.isEmpty()) {
            sb.append(" where ");
            for (int i = 0; i < list.size(); i++) {
                if (i > 0) {
                    sb.append(" and ");
                }
                sb.append(list.get(i));
            }
        }
        List list2 = this.MediaMetadataCompat;
        if (!list2.isEmpty()) {
            sb.append(" order by ");
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(list2.get(i2));
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fromParentRect.class == obj.getClass()) {
            fromParentRect fromparentrect = (fromParentRect) obj;
            String str = fromparentrect.write;
            String str2 = this.write;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            if (this.serializer != fromparentrect.serializer || !this.MediaMetadataCompat.equals(fromparentrect.MediaMetadataCompat) || !this.read.equals(fromparentrect.read) || !this.MediaSessionCompatQueueItem.equals(fromparentrect.MediaSessionCompatQueueItem)) {
                return false;
            }
            setBefore setbefore = fromparentrect.MediaBrowserCompatMediaItem;
            setBefore setbefore2 = this.MediaBrowserCompatMediaItem;
            if (setbefore2 == null ? setbefore != null : !setbefore2.equals(setbefore)) {
                return false;
            }
            setBefore setbefore3 = fromparentrect.IconCompatParcelizer;
            setBefore setbefore4 = this.IconCompatParcelizer;
            if (setbefore4 != null) {
                return setbefore4.equals(setbefore3);
            }
            if (setbefore3 == null) {
                return true;
            }
        }
        return false;
    }
}
