package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import kotlin.coroutines.AbstractCoroutineContextElement;

/* JADX INFO: loaded from: classes4.dex */
public final class getInAppMessageViewLifecycleListener extends AbstractCoroutineContextElement {
    public static final onAnimationEndlambda1 serializer = new onAnimationEndlambda1();
    public final String write;

    public getInAppMessageViewLifecycleListener(String str) {
        super(serializer);
        this.write = str;
    }

    public final int hashCode() {
        return this.write.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getInAppMessageViewLifecycleListener)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, ((getInAppMessageViewLifecycleListener) obj).write}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("CoroutineName("), this.write, ')');
    }
}
