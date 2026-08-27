package o;

import bo.app.d$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class getPostSlopOffsetqto3Fdw {
    public final tryAwaitRelease IconCompatParcelizer;
    public final TouchSlopDetector MediaSessionCompatQueueItem;
    public final consumeUntilUp RemoteActionCompatParcelizer;
    public final waitForUpOrCancellation read;
    public final Map serializer;
    public final boolean write;

    public final int hashCode() {
        consumeUntilUp consumeuntilup = this.RemoteActionCompatParcelizer;
        int iHashCode = consumeuntilup == null ? 0 : consumeuntilup.hashCode();
        TouchSlopDetector touchSlopDetector = this.MediaSessionCompatQueueItem;
        int iHashCode2 = touchSlopDetector == null ? 0 : touchSlopDetector.hashCode();
        tryAwaitRelease tryawaitrelease = this.IconCompatParcelizer;
        int iHashCode3 = tryawaitrelease == null ? 0 : tryawaitrelease.hashCode();
        waitForUpOrCancellation waitforuporcancellation = this.read;
        return this.serializer.hashCode() + d$$ExternalSyntheticOutline0.m(((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (waitforuporcancellation != null ? waitforuporcancellation.hashCode() : 0)) * 961, 31, this.write);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getPostSlopOffsetqto3Fdw)) {
            return false;
        }
        getPostSlopOffsetqto3Fdw getpostslopoffsetqto3fdw = (getPostSlopOffsetqto3Fdw) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, getpostslopoffsetqto3fdw.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem, getpostslopoffsetqto3fdw.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, getpostslopoffsetqto3fdw.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, getpostslopoffsetqto3fdw.read}, getCieXyz.write())).booleanValue() || this.write != getpostslopoffsetqto3fdw.write) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, getpostslopoffsetqto3fdw.serializer}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionData(fade=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", slide=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", changeSize=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", scale=");
        sb.append(this.read);
        sb.append(", veil=null, hold=");
        sb.append(this.write);
        sb.append(", effectsMap=");
        return r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(sb, this.serializer, ')');
    }

    public /* synthetic */ getPostSlopOffsetqto3Fdw(consumeUntilUp consumeuntilup, TouchSlopDetector touchSlopDetector, tryAwaitRelease tryawaitrelease, waitForUpOrCancellation waitforuporcancellation, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : consumeuntilup, (i & 2) != 0 ? null : touchSlopDetector, (i & 4) != 0 ? null : tryawaitrelease, (i & 8) != 0 ? null : waitforuporcancellation, (i & 32) == 0, (i & 64) != 0 ? SimpleItemTouchHelperCallback.serializer : linkedHashMap);
    }

    public getPostSlopOffsetqto3Fdw(consumeUntilUp consumeuntilup, TouchSlopDetector touchSlopDetector, tryAwaitRelease tryawaitrelease, waitForUpOrCancellation waitforuporcancellation, boolean z, Map map) {
        this.RemoteActionCompatParcelizer = consumeuntilup;
        this.MediaSessionCompatQueueItem = touchSlopDetector;
        this.IconCompatParcelizer = tryawaitrelease;
        this.read = waitforuporcancellation;
        this.write = z;
        this.serializer = map;
    }
}
