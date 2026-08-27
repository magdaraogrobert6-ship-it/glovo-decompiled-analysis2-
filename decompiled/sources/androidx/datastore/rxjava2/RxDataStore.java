package androidx.datastore.rxjava2;

import io.reactivex.disposables.Disposable;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ContextScope;
import o.pickChildForBackwardSearch;

/* JADX INFO: loaded from: classes.dex */
public final class RxDataStore implements Disposable {
    public final ContextScope read;
    public final pickChildForBackwardSearch serializer;

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        JobKt.IconCompatParcelizer(this.read.serializer).write(null);
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return JobKt.IconCompatParcelizer(this.read.serializer).I_();
    }

    public RxDataStore(pickChildForBackwardSearch pickchildforbackwardsearch, ContextScope contextScope) {
        this.serializer = pickchildforbackwardsearch;
        this.read = contextScope;
    }
}
