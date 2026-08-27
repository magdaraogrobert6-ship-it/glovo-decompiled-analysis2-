package o;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollingLogicdoFlingAnimation2reverseScope1 {
    public static final ScrollingLogicdoFlingAnimation2reverseScope1 IconCompatParcelizer = new ScrollingLogicdoFlingAnimation2reverseScope1(new getPostSlopOffsetqto3Fdw((consumeUntilUp) null, (TouchSlopDetector) null, (tryAwaitRelease) null, (waitForUpOrCancellation) null, (LinkedHashMap) null, 127));
    public final getPostSlopOffsetqto3Fdw serializer;

    public final int hashCode() {
        return this.serializer.hashCode();
    }

    public final String toString() {
        if (equals(IconCompatParcelizer)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
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
        return sb.toString();
    }

    public ScrollingLogicdoFlingAnimation2reverseScope1(getPostSlopOffsetqto3Fdw getpostslopoffsetqto3fdw) {
        this.serializer = getpostslopoffsetqto3fdw;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ScrollingLogicdoFlingAnimation2reverseScope1) && ((ScrollingLogicdoFlingAnimation2reverseScope1) obj).serializer.equals(this.serializer);
    }

    public final ScrollingLogicdoFlingAnimation2reverseScope1 serializer(ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1) {
        consumeUntilUp consumeuntilup = scrollingLogicdoFlingAnimation2reverseScope1.serializer.RemoteActionCompatParcelizer;
        if (consumeuntilup == null) {
            consumeuntilup = this.serializer.RemoteActionCompatParcelizer;
        }
        consumeUntilUp consumeuntilup2 = consumeuntilup;
        getPostSlopOffsetqto3Fdw getpostslopoffsetqto3fdw = scrollingLogicdoFlingAnimation2reverseScope1.serializer;
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
        return new ScrollingLogicdoFlingAnimation2reverseScope1(new getPostSlopOffsetqto3Fdw(consumeuntilup2, touchSlopDetector2, tryawaitrelease2, waitforuporcancellation, onMove.RemoteActionCompatParcelizer(this.serializer.serializer, getpostslopoffsetqto3fdw.serializer), 32));
    }
}
