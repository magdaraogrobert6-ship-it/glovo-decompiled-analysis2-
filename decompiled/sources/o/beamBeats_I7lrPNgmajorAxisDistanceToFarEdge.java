package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class beamBeats_I7lrPNgmajorAxisDistanceToFarEdge {
    public static final /* synthetic */ int write = 0;
    public final getDualFloatInfinityBaseannotations RemoteActionCompatParcelizer = new getDualFloatInfinityBaseannotations(16);
    public boolean serializer;

    public final Object clone() {
        beamBeats_I7lrPNgmajorAxisDistanceToFarEdge beambeats_i7lrpngmajoraxisdistancetofaredge = new beamBeats_I7lrPNgmajorAxisDistanceToFarEdge();
        getDualFloatInfinityBaseannotations getdualfloatinfinitybaseannotations = this.RemoteActionCompatParcelizer;
        if (getdualfloatinfinitybaseannotations.serializer.size() > 0) {
            Map.Entry entryWrite = getdualfloatinfinitybaseannotations.write(0);
            m1$$ExternalSyntheticOutline0.m(entryWrite.getKey());
            entryWrite.getValue();
            throw null;
        }
        Iterator it = getdualfloatinfinitybaseannotations.serializer().iterator();
        if (!it.hasNext()) {
            return beambeats_i7lrpngmajoraxisdistancetofaredge;
        }
        Map.Entry entry = (Map.Entry) it.next();
        m1$$ExternalSyntheticOutline0.m(entry.getKey());
        entry.getValue();
        throw null;
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }

    static {
        new beamBeats_I7lrPNgmajorAxisDistanceToFarEdge(0);
    }

    public beamBeats_I7lrPNgmajorAxisDistanceToFarEdge(int i) {
        read();
        read();
    }

    public static void RemoteActionCompatParcelizer(RequestChildFocusKt requestChildFocusKt, getHeight getheight, int i, Object obj) throws IOException {
        if (getheight == getHeight.GROUP) {
            requestChildFocusKt.RemoteActionCompatParcelizer(i, 3);
            ((PlatformFocusOwner) obj).read(requestChildFocusKt);
            requestChildFocusKt.RemoteActionCompatParcelizer(i, 4);
        }
        requestChildFocusKt.RemoteActionCompatParcelizer(i, getheight.getWireType());
        switch (bottomRight.read[getheight.ordinal()]) {
            case 1:
                requestChildFocusKt.serializer(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 2:
                requestChildFocusKt.RatingCompat(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 3:
                requestChildFocusKt.RemoteActionCompatParcelizer(((Long) obj).longValue());
                break;
            case 4:
                requestChildFocusKt.RemoteActionCompatParcelizer(((Long) obj).longValue());
                break;
            case 5:
                requestChildFocusKt.MediaBrowserCompatMediaItem(((Integer) obj).intValue());
                break;
            case 6:
                requestChildFocusKt.serializer(((Long) obj).longValue());
                break;
            case 7:
                requestChildFocusKt.RatingCompat(((Integer) obj).intValue());
                break;
            case 8:
                requestChildFocusKt.read(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 9:
                ((PlatformFocusOwner) obj).read(requestChildFocusKt);
                break;
            case 10:
                PlatformFocusOwner platformFocusOwner = (PlatformFocusOwner) obj;
                requestChildFocusKt.ParcelableVolumeInfo(platformFocusOwner.MediaSessionCompatToken());
                platformFocusOwner.read(requestChildFocusKt);
                break;
            case 11:
                if (!(obj instanceof moveFocusInChildren3ESFkO8)) {
                    requestChildFocusKt.write((String) obj);
                } else {
                    requestChildFocusKt.IconCompatParcelizer((moveFocusInChildren3ESFkO8) obj);
                }
                break;
            case 12:
                if (!(obj instanceof moveFocusInChildren3ESFkO8)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    requestChildFocusKt.ParcelableVolumeInfo(length);
                    requestChildFocusKt.write(bArr, 0, length);
                } else {
                    requestChildFocusKt.IconCompatParcelizer((moveFocusInChildren3ESFkO8) obj);
                }
                break;
            case 13:
                requestChildFocusKt.ParcelableVolumeInfo(((Integer) obj).intValue());
                break;
            case 14:
                requestChildFocusKt.RatingCompat(((Integer) obj).intValue());
                break;
            case 15:
                requestChildFocusKt.serializer(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                requestChildFocusKt.ParcelableVolumeInfo((iIntValue << 1) ^ (iIntValue >> 31));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                requestChildFocusKt.RemoteActionCompatParcelizer((jLongValue << 1) ^ (jLongValue >> 63));
                break;
            case 18:
                requestChildFocusKt.MediaBrowserCompatMediaItem(((Integer) obj).intValue());
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof beamBeats_I7lrPNgmajorAxisDistanceToFarEdge) {
            return this.RemoteActionCompatParcelizer.equals(((beamBeats_I7lrPNgmajorAxisDistanceToFarEdge) obj).RemoteActionCompatParcelizer);
        }
        return false;
    }

    public final void read() {
        if (this.serializer) {
            return;
        }
        getDualFloatInfinityBaseannotations getdualfloatinfinitybaseannotations = this.RemoteActionCompatParcelizer;
        if (!getdualfloatinfinitybaseannotations.read) {
            if (getdualfloatinfinitybaseannotations.serializer.size() > 0) {
                getdualfloatinfinitybaseannotations.write(0).getKey().getClass();
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
                return;
            } else {
                Iterator it = getdualfloatinfinitybaseannotations.serializer().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
                    return;
                }
            }
        }
        if (!getdualfloatinfinitybaseannotations.read) {
            getdualfloatinfinitybaseannotations.MediaMetadataCompat = getdualfloatinfinitybaseannotations.MediaMetadataCompat.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(getdualfloatinfinitybaseannotations.MediaMetadataCompat);
            getdualfloatinfinitybaseannotations.MediaSessionCompatQueueItem = getdualfloatinfinitybaseannotations.MediaSessionCompatQueueItem.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(getdualfloatinfinitybaseannotations.MediaSessionCompatQueueItem);
            getdualfloatinfinitybaseannotations.read = true;
        }
        this.serializer = true;
    }

    public beamBeats_I7lrPNgmajorAxisDistanceToFarEdge() {
    }
}
