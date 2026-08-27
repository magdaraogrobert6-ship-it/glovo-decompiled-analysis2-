package androidx.activity;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import o.addObserverForBackInvoker;
import o.computeHorizontalBoundsdefault;
import o.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;

/* JADX INFO: loaded from: classes.dex */
public abstract class OnBackPressedCallback {
    private boolean read;
    private final List<addObserverForBackInvoker> IconCompatParcelizer = new ArrayList();
    private final CopyOnWriteArrayList<AutoCloseable> serializer = new CopyOnWriteArrayList<>();

    public void handleOnBackCancelled() {
    }

    public abstract void handleOnBackPressed();

    public void handleOnBackProgressed(r8lambda54BeH8ZsBru0CXI2CCSP2syNys r8lambda54beh8zsbru0cxi2ccsp2synys) {
        r8lambda54beh8zsbru0cxi2ccsp2synys.getClass();
    }

    public void handleOnBackStarted(r8lambda54BeH8ZsBru0CXI2CCSP2syNys r8lambda54beh8zsbru0cxi2ccsp2synys) {
        r8lambda54beh8zsbru0cxi2ccsp2synys.getClass();
    }

    public final boolean isEnabled() {
        return this.read;
    }

    public final void remove() {
        Iterator<AutoCloseable> it = this.serializer.iterator();
        it.getClass();
        while (it.hasNext()) {
            af$$ExternalSyntheticOutline0.m(it.next());
        }
        this.serializer.clear();
        Iterator<addObserverForBackInvoker> it2 = this.IconCompatParcelizer.iterator();
        while (it2.hasNext()) {
            it2.next().serializer();
        }
        this.IconCompatParcelizer.clear();
    }

    public final void setEnabled(boolean z) {
        this.read = z;
        for (addObserverForBackInvoker addobserverforbackinvoker : this.IconCompatParcelizer) {
            addobserverforbackinvoker.read(addobserverforbackinvoker.read && z);
        }
    }

    public final void addCloseable$activity(AutoCloseable autoCloseable) {
        autoCloseable.getClass();
        this.serializer.add(autoCloseable);
    }

    public final void removeCloseable$activity(AutoCloseable autoCloseable) {
        autoCloseable.getClass();
        this.serializer.remove(autoCloseable);
    }

    public OnBackPressedCallback(boolean z) {
        this.read = z;
    }

    public final addObserverForBackInvoker createNavigationEventHandler$activity(computeHorizontalBoundsdefault computehorizontalboundsdefault) {
        computehorizontalboundsdefault.getClass();
        addObserverForBackInvoker addobserverforbackinvoker = new addObserverForBackInvoker(this, computehorizontalboundsdefault);
        this.IconCompatParcelizer.add(addobserverforbackinvoker);
        return addobserverforbackinvoker;
    }
}
