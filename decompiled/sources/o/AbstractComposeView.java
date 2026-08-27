package o;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class AbstractComposeView implements logTree {
    public volatile Object serializer;

    @Override // o.logTree
    public final List IconCompatParcelizer(String str) {
        return Collections.EMPTY_LIST;
    }

    @Override // o.logTree
    public final Map IconCompatParcelizer(boolean z) {
        return Collections.EMPTY_MAP;
    }

    @Override // o.logTree
    public final void IconCompatParcelizer(logTreeprintSubTree logtreeprintsubtree) {
    }

    @Override // o.logTree
    public final void RemoteActionCompatParcelizer(String str) {
    }

    @Override // o.logTree
    public final int serializer(String str) {
        return 0;
    }

    @Override // o.logTree
    public final assertConsistent IconCompatParcelizer(String str, nodeToString nodetostring) {
        Object obj = this.serializer;
        return obj instanceof logTree ? ((logTree) obj).IconCompatParcelizer(str, nodetostring) : new attachedToWindow(str, nodetostring, (updatePlacedUnderMotionFrameOfReference) obj);
    }

    @Override // o.logTree
    public final void RemoteActionCompatParcelizer(Object obj, String str) {
        Object obj2 = this.serializer;
        logTree logtree = obj2 instanceof logTree ? (logTree) obj2 : null;
        if (logtree != null) {
            logtree.RemoteActionCompatParcelizer(obj, str);
        }
    }

    @Override // o.logTree
    public final void serializer(String str, String str2, Bundle bundle) {
        Object obj = this.serializer;
        logTree logtree = obj instanceof logTree ? (logTree) obj : null;
        if (logtree != null) {
            logtree.serializer(str, str2, bundle);
        }
    }
}
