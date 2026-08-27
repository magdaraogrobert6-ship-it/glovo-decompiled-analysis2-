package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class CompletableResumeNext extends Completable {
    public final Completable IconCompatParcelizer;
    public final Function read;

    public static final class ResumeNextObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
        public final CompletableObserver IconCompatParcelizer;
        public boolean RemoteActionCompatParcelizer;
        public final Function write;

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.replace(this, disposable);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onComplete() {
            this.IconCompatParcelizer.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th) {
            boolean z = this.RemoteActionCompatParcelizer;
            CompletableObserver completableObserver = this.IconCompatParcelizer;
            if (z) {
                completableObserver.onError(th);
                return;
            }
            this.RemoteActionCompatParcelizer = true;
            try {
                Object objApply = this.write.apply(th);
                ObjectHelper.write(objApply, "The errorMapper returned a null CompletableSource");
                ((CompletableSource) objApply).subscribe(this);
            } catch (Throwable th2) {
                Exceptions.read(th2);
                completableObserver.onError(new CompositeException(th, th2));
            }
        }

        public ResumeNextObserver(CompletableObserver completableObserver, Function function) {
            this.IconCompatParcelizer = completableObserver;
            this.write = function;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }
    }

    @Override // io.reactivex.Completable
    public final void serializer(CompletableObserver completableObserver) {
        ResumeNextObserver resumeNextObserver = new ResumeNextObserver(completableObserver, this.read);
        completableObserver.onSubscribe(resumeNextObserver);
        this.IconCompatParcelizer.subscribe(resumeNextObserver);
    }

    public CompletableResumeNext(Completable completable, Function function) {
        this.IconCompatParcelizer = completable;
        this.read = function;
    }
}
