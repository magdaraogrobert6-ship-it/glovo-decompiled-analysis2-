package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes4.dex */
public final class getTrackingOutcomes implements Observer {
    public final Observer write;

    @Override // io.reactivex.Observer
    public final void onComplete() {
        this.write.onComplete();
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.write.onSubscribe(disposable);
    }

    public getTrackingOutcomes(Observer observer) {
        this.write = observer;
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        Observer observer = this.write;
        try {
            if (th == null) {
                throw new NullPointerException("error == null");
            }
            observer.onNext(new com.huawei.hmf.tasks.a.j(1));
            observer.onComplete();
        } catch (Throwable th2) {
            try {
                observer.onError(th2);
            } catch (Throwable th3) {
                Exceptions.read(th3);
                RxJavaPlugins.IconCompatParcelizer(new CompositeException(th2, th3));
            }
        }
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        if (((getHoldoutVariationName) obj) == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("response == null");
        } else {
            this.write.onNext(new com.huawei.hmf.tasks.a.j(1));
        }
    }
}
