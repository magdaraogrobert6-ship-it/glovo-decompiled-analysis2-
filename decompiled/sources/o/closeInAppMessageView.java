package o;

import kotlinx.coroutines.EventLoopImplBase;

/* JADX INFO: loaded from: classes4.dex */
public final class closeInAppMessageView extends EventLoopImplBase {
    public final Thread write;

    @Override // kotlinx.coroutines.EventLoopImplBase
    public final Thread RemoteActionCompatParcelizer() {
        return this.write;
    }

    public closeInAppMessageView(Thread thread) {
        this.write = thread;
    }
}
