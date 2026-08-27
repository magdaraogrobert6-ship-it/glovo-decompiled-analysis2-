package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class backwardFocusSearch extends getNoActiveChildannotations {
    public final LinkedHashMap RemoteActionCompatParcelizer;
    public final AtomicBoolean serializer;

    public final void RemoteActionCompatParcelizer() {
        if (this.serializer.get()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Do mutate preferences once returned to DataStore.");
        }
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }

    @Override // o.getNoActiveChildannotations
    public final Map read() {
        Map mapUnmodifiableMap = Collections.unmodifiableMap(this.RemoteActionCompatParcelizer);
        mapUnmodifiableMap.getClass();
        return mapUnmodifiableMap;
    }

    public final String toString() {
        return onContentCardDismissed.IconCompatParcelizer(this.RemoteActionCompatParcelizer.entrySet(), ",\n", "{\n", "\n}", forEachItemBefore.RemoteActionCompatParcelizer, 24);
    }

    public backwardFocusSearch(LinkedHashMap linkedHashMap, boolean z) {
        this.RemoteActionCompatParcelizer = linkedHashMap;
        this.serializer = new AtomicBoolean(z);
    }

    public final void read(isRoot isroot) {
        isroot.getClass();
        RemoteActionCompatParcelizer();
        this.RemoteActionCompatParcelizer.remove(isroot);
    }

    @Override // o.getNoActiveChildannotations
    public final Object serializer(isRoot isroot) {
        isroot.getClass();
        return this.RemoteActionCompatParcelizer.get(isroot);
    }

    public final void serializer(isRoot isroot, Object obj) {
        isroot.getClass();
        RemoteActionCompatParcelizer();
        if (obj == null) {
            read(isroot);
            return;
        }
        boolean z = obj instanceof Set;
        LinkedHashMap linkedHashMap = this.RemoteActionCompatParcelizer;
        if (!z) {
            linkedHashMap.put(isroot, obj);
            return;
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys((Iterable) obj));
        setUnmodifiableSet.getClass();
        linkedHashMap.put(isroot, setUnmodifiableSet);
    }

    public final void write() {
        RemoteActionCompatParcelizer();
        this.RemoteActionCompatParcelizer.clear();
    }

    public final void write(isRoot isroot, Object obj) {
        isroot.getClass();
        serializer(isroot, obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof backwardFocusSearch)) {
            return false;
        }
        Object[] objArr = {this.RemoteActionCompatParcelizer, ((backwardFocusSearch) obj).RemoteActionCompatParcelizer};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }

    public /* synthetic */ backwardFocusSearch(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
