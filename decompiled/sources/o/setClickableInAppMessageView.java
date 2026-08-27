package o;

import kotlinx.coroutines.JobNode;

/* JADX INFO: loaded from: classes4.dex */
public final class setClickableInAppMessageView extends JobNode {
    public final setAndStartAnimation serializer;

    @Override // kotlinx.coroutines.JobNode
    public final boolean write() {
        return false;
    }

    @Override // kotlinx.coroutines.JobNode
    public final void write(Throwable th) {
        this.serializer.RemoteActionCompatParcelizer();
    }

    public setClickableInAppMessageView(setAndStartAnimation setandstartanimation) {
        this.serializer = setandstartanimation;
    }
}
