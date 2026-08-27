package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes4.dex */
public final class CompletableOnErrorComplete extends Completable {
    public final Completable read;

    public final class OnError implements CompletableObserver {
        public final CompletableObserver RemoteActionCompatParcelizer;

        @Override // io.reactivex.CompletableObserver
        public final void onComplete() {
            this.RemoteActionCompatParcelizer.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th) {
            this.RemoteActionCompatParcelizer.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            this.RemoteActionCompatParcelizer.onSubscribe(disposable);
        }

        public OnError(CompletableOnErrorComplete completableOnErrorComplete, CompletableObserver completableObserver) {
            this.RemoteActionCompatParcelizer = completableObserver;
        }
    }

    @Override // io.reactivex.Completable
    public final void serializer(CompletableObserver completableObserver) {
        this.read.subscribe(new OnError(this, completableObserver));
    }

    public CompletableOnErrorComplete(Completable completable) {
        this.read = completable;
    }
}
