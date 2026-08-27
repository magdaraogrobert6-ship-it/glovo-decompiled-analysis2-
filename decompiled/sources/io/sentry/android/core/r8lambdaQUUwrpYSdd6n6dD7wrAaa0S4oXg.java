package io.sentry.android.core;

import androidx.lifecycle.DefaultLifecycleObserver;
import java.util.Iterator;
import o.accessisRenderNodeCompatiblecp;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg implements DefaultLifecycleObserver {
    public final /* synthetic */ r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 read;
    public final r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss serializer = new r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss(this);

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        this.read.read = Boolean.FALSE;
        Iterator it = this.serializer.iterator();
        while (it.hasNext()) {
            ((r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8) it.next()).RemoteActionCompatParcelizer();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        this.read.read = Boolean.TRUE;
        Iterator it = this.serializer.iterator();
        while (it.hasNext()) {
            ((r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8) it.next()).D_();
        }
    }

    public r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg(r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 r8lambdaxj9c8vip9dfevatmzt0ejauc4a4) {
        this.read = r8lambdaxj9c8vip9dfevatmzt0ejauc4a4;
    }
}
