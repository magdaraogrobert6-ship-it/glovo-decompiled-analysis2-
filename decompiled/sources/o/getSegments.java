package o;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import o.getHoldoutVariationName;

/* JADX INFO: loaded from: classes4.dex */
public final class getSegments extends Observable {
    public final Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ getSegments(int i, Object obj) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = obj;
    }

    @Override // io.reactivex.Observable
    public final void read(final Observer observer) {
        int i = this.serializer;
        if (i == 0) {
            ((getSegments) this.RemoteActionCompatParcelizer).subscribe(new Observer(observer) { // from class: retrofit2.adapter.rxjava2.BodyObservable$BodyObserver
                public final Observer RemoteActionCompatParcelizer;
                public boolean serializer;

                @Override // io.reactivex.Observer
                public final void onNext(Object obj) {
                    getHoldoutVariationName getholdoutvariationname = (getHoldoutVariationName) obj;
                    boolean z = getholdoutvariationname.rawResponse.isSuccessful;
                    Observer observer2 = this.RemoteActionCompatParcelizer;
                    if (z) {
                        observer2.onNext(getholdoutvariationname.body);
                        return;
                    }
                    this.serializer = true;
                    HttpException httpException = new HttpException(getholdoutvariationname);
                    try {
                        observer2.onError(httpException);
                    } catch (Throwable th) {
                        Exceptions.read(th);
                        RxJavaPlugins.IconCompatParcelizer(new CompositeException(httpException, th));
                    }
                }

                @Override // io.reactivex.Observer
                public final void onSubscribe(Disposable disposable) {
                    this.RemoteActionCompatParcelizer.onSubscribe(disposable);
                }

                {
                    this.RemoteActionCompatParcelizer = observer;
                }

                @Override // io.reactivex.Observer
                public final void onComplete() {
                    if (this.serializer) {
                        return;
                    }
                    this.RemoteActionCompatParcelizer.onComplete();
                }

                @Override // io.reactivex.Observer
                public final void onError(Throwable th) {
                    if (!this.serializer) {
                        this.RemoteActionCompatParcelizer.onError(th);
                        return;
                    }
                    AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
                    assertionError.initCause(th);
                    RxJavaPlugins.IconCompatParcelizer(assertionError);
                }
            });
            return;
        }
        boolean z = true;
        if (i == 1) {
            ((getSegments) this.RemoteActionCompatParcelizer).subscribe(new getTrackingOutcomes(observer));
            return;
        }
        syncCustomerProfile synccustomerprofileClone = ((writeSelffwf_client_release) this.RemoteActionCompatParcelizer).clone();
        getRunningExperimentId getrunningexperimentid = new getRunningExperimentId(synccustomerprofileClone);
        observer.onSubscribe(getrunningexperimentid);
        if (getrunningexperimentid.IconCompatParcelizer) {
            return;
        }
        try {
            Object objRemoteActionCompatParcelizer = ((writeSelffwf_client_release) synccustomerprofileClone).RemoteActionCompatParcelizer();
            if (!getrunningexperimentid.IconCompatParcelizer) {
                observer.onNext(objRemoteActionCompatParcelizer);
            }
            if (getrunningexperimentid.IconCompatParcelizer) {
                return;
            }
            try {
                observer.onComplete();
            } catch (Throwable th) {
                th = th;
                Exceptions.read(th);
                if (z) {
                    RxJavaPlugins.IconCompatParcelizer(th);
                    return;
                }
                if (getrunningexperimentid.IconCompatParcelizer) {
                    return;
                }
                try {
                    observer.onError(th);
                } catch (Throwable th2) {
                    Exceptions.read(th2);
                    RxJavaPlugins.IconCompatParcelizer(new CompositeException(th, th2));
                }
            }
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
    }
}
