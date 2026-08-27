package o;

import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.SystemPropsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getInAppMessageAnimationFactory {
    public static final int IconCompatParcelizer = SystemPropsKt.IconCompatParcelizer(100, 12, "kotlinx.coroutines.semaphore.maxSpinCycles");
    public static final Symbol serializer = new Symbol("PERMIT");
    public static final Symbol MediaMetadataCompat = new Symbol("TAKEN");
    public static final Symbol write = new Symbol("BROKEN");
    public static final Symbol RemoteActionCompatParcelizer = new Symbol("CANCELLED");
    public static final int read = SystemPropsKt.IconCompatParcelizer(16, 12, "kotlinx.coroutines.semaphore.segmentSize");

    public static getInAppMessageManagerListener serializer(int i) {
        return new getInAppMessageManagerListener(i, 0);
    }
}
