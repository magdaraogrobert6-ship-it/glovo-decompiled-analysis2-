package o;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class TapGestureDetectorKt {
    public final getPostSlopOffsetqto3Fdw serializer;
    public static final TapGestureDetectorKt RemoteActionCompatParcelizer = new TapGestureDetectorKt(new getPostSlopOffsetqto3Fdw((consumeUntilUp) null, (TouchSlopDetector) null, (tryAwaitRelease) null, (waitForUpOrCancellation) null, (LinkedHashMap) null, 127));
    public static final TapGestureDetectorKt IconCompatParcelizer = new TapGestureDetectorKt(new getPostSlopOffsetqto3Fdw((consumeUntilUp) null, (TouchSlopDetector) null, (tryAwaitRelease) null, (waitForUpOrCancellation) null, (LinkedHashMap) null, 95));

    public final int hashCode() {
        return this.serializer.hashCode();
    }

    public final String toString() {
        if (equals(RemoteActionCompatParcelizer)) {
            return "ExitTransition.None";
        }
        if (equals(IconCompatParcelizer)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        getPostSlopOffsetqto3Fdw getpostslopoffsetqto3fdw = this.serializer;
        consumeUntilUp consumeuntilup = getpostslopoffsetqto3fdw.RemoteActionCompatParcelizer;
        sb.append(consumeuntilup != null ? consumeuntilup.toString() : null);
        sb.append(",\nSlide - ");
        TouchSlopDetector touchSlopDetector = getpostslopoffsetqto3fdw.MediaSessionCompatQueueItem;
        sb.append(touchSlopDetector != null ? touchSlopDetector.toString() : null);
        sb.append(",\nShrink - ");
        tryAwaitRelease tryawaitrelease = getpostslopoffsetqto3fdw.IconCompatParcelizer;
        sb.append(tryawaitrelease != null ? tryawaitrelease.toString() : null);
        sb.append(",\nScale - ");
        waitForUpOrCancellation waitforuporcancellation = getpostslopoffsetqto3fdw.read;
        sb.append(waitforuporcancellation != null ? waitforuporcancellation.toString() : null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(getpostslopoffsetqto3fdw.write);
        return sb.toString();
    }

    public TapGestureDetectorKt(getPostSlopOffsetqto3Fdw getpostslopoffsetqto3fdw) {
        this.serializer = getpostslopoffsetqto3fdw;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof TapGestureDetectorKt) && ((TapGestureDetectorKt) obj).serializer.equals(this.serializer);
    }

    public final TapGestureDetectorKt read(TapGestureDetectorKt tapGestureDetectorKt) {
        consumeUntilUp consumeuntilup = tapGestureDetectorKt.serializer.RemoteActionCompatParcelizer;
        if (consumeuntilup == null) {
            consumeuntilup = this.serializer.RemoteActionCompatParcelizer;
        }
        consumeUntilUp consumeuntilup2 = consumeuntilup;
        getPostSlopOffsetqto3Fdw getpostslopoffsetqto3fdw = tapGestureDetectorKt.serializer;
        TouchSlopDetector touchSlopDetector = getpostslopoffsetqto3fdw.MediaSessionCompatQueueItem;
        if (touchSlopDetector == null) {
            touchSlopDetector = this.serializer.MediaSessionCompatQueueItem;
        }
        TouchSlopDetector touchSlopDetector2 = touchSlopDetector;
        tryAwaitRelease tryawaitrelease = getpostslopoffsetqto3fdw.IconCompatParcelizer;
        if (tryawaitrelease == null) {
            tryawaitrelease = this.serializer.IconCompatParcelizer;
        }
        tryAwaitRelease tryawaitrelease2 = tryawaitrelease;
        waitForUpOrCancellation waitforuporcancellation = getpostslopoffsetqto3fdw.read;
        if (waitforuporcancellation == null) {
            waitforuporcancellation = this.serializer.read;
        }
        waitForUpOrCancellation waitforuporcancellation2 = waitforuporcancellation;
        boolean z = getpostslopoffsetqto3fdw.write;
        getPostSlopOffsetqto3Fdw getpostslopoffsetqto3fdw2 = this.serializer;
        return new TapGestureDetectorKt(new getPostSlopOffsetqto3Fdw(consumeuntilup2, touchSlopDetector2, tryawaitrelease2, waitforuporcancellation2, z || getpostslopoffsetqto3fdw2.write, onMove.RemoteActionCompatParcelizer(getpostslopoffsetqto3fdw2.serializer, getpostslopoffsetqto3fdw.serializer)));
    }
}
