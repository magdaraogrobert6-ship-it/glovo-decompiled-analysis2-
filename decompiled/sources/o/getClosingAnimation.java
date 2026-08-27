package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes4.dex */
public class getClosingAnimation {
    public static final /* synthetic */ AtomicIntegerFieldUpdater write = AtomicIntegerFieldUpdater.newUpdater(getClosingAnimation.class, "_handled$volatile");
    public final Throwable IconCompatParcelizer;
    private volatile /* synthetic */ int _handled$volatile;

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.IconCompatParcelizer + ']';
    }

    public getClosingAnimation(Throwable th, boolean z) {
        this.IconCompatParcelizer = th;
        this._handled$volatile = z ? 1 : 0;
    }
}
