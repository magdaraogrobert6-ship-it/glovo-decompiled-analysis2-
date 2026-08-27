package o;

import bo.app.n$$ExternalSyntheticLambda3;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class setRequestDisallowInterceptTouchEvent {
    public static final void IconCompatParcelizer(getType gettype, getAddressCountry getaddresscountry, int i) {
        while (true) {
            int i2 = gettype.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            if (i > i2 && i < gettype.read) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            gettype.MediaSessionCompatQueueItem();
            if (gettype.MediaSessionCompatResultReceiverWrapper(gettype.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus)) {
                getaddresscountry.up();
            }
            gettype.write();
        }
    }

    public static final double RemoteActionCompatParcelizer(double d) {
        return RangesKt.read(d, 0.0d, 1.0d);
    }

    public static final colorResource RemoteActionCompatParcelizer(drag12SF9DM drag12sf9dm, getType gettype) {
        return new colorResource(drag12sf9dm, gettype, false, 9);
    }

    public static final Throwable read(Throwable th, drag12SF9DM drag12sf9dm, getType gettype, AndroidContentCaptureManagercurrentSemanticsNodes1 androidContentCaptureManagercurrentSemanticsNodes1) {
        if (drag12sf9dm == null) {
            return th;
        }
        getLayoutDirection.read(th, new n$$ExternalSyntheticLambda3(androidContentCaptureManagercurrentSemanticsNodes1, gettype, drag12sf9dm, 8));
        return th;
    }
}
