package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setLastHorizontalBias implements androidx.lifecycle.DefaultLifecycleObserver {
    public final setMaxElementsWrap write;

    public setLastHorizontalBias(setMaxElementsWrap setmaxelementswrap) {
        setmaxelementswrap.getClass();
        this.write = setmaxelementswrap;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        accessisrendernodecompatiblecp.getClass();
        synchronized (this.write) {
        }
    }
}
