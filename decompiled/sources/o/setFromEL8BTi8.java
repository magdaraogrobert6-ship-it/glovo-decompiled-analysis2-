package o;

import androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;

/* JADX INFO: loaded from: classes.dex */
public final class setFromEL8BTi8 implements Runnable {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 serializer;
    public final /* synthetic */ supportsColorMatrixQuery write;

    public /* synthetic */ setFromEL8BTi8(supportsColorMatrixQuery supportscolormatrixquery, WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1, int i) {
        this.IconCompatParcelizer = i;
        this.write = supportscolormatrixquery;
        this.serializer = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.IconCompatParcelizer;
        WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 = this.serializer;
        supportsColorMatrixQuery supportscolormatrixquery = this.write;
        if (i != 0) {
            supportscolormatrixquery.read(withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1);
        } else {
            supportscolormatrixquery.IconCompatParcelizer(withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1);
        }
    }
}
