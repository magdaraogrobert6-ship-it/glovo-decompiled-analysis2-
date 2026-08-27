package io.reactivex.disposables;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Disposables {
    public static Disposable RemoteActionCompatParcelizer(Runnable runnable) {
        return new RunnableDisposable(runnable);
    }
}
