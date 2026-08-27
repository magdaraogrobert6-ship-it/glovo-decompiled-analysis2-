package io.reactivex.internal.operators.observable;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
public final class ObservableOnErrorNext<T> extends AbstractObservableWithUpstream<T, T> {
    public final GetAppStateImpl IconCompatParcelizer;

    public static final class OnErrorNextObserver<T> implements Observer<T> {
        private static int MediaMetadataCompat = 0;
        private static int MediaSessionCompatQueueItem = 1;
        public boolean IconCompatParcelizer;
        public boolean RemoteActionCompatParcelizer;
        public final GetAppStateImpl read;
        public final Observer serializer;
        public final SequentialDisposable write = new SequentialDisposable();

        public OnErrorNextObserver(Observer observer, GetAppStateImpl getAppStateImpl) {
            this.serializer = observer;
            this.read = getAppStateImpl;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            int i = 2 % 2;
            int i2 = MediaSessionCompatQueueItem + 21;
            MediaMetadataCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            SequentialDisposable sequentialDisposable = this.write;
            sequentialDisposable.getClass();
            DisposableHelper.replace(sequentialDisposable, disposable);
            int i4 = MediaSessionCompatQueueItem + 83;
            MediaMetadataCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            int i = 2 % 2;
            int i2 = MediaSessionCompatQueueItem + 121;
            MediaMetadataCompat = i2 % Fields.SpotShadowColor;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            if (this.IconCompatParcelizer) {
                return;
            }
            this.serializer.onNext(obj);
            int i3 = MediaMetadataCompat + 47;
            MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return;
            }
            obj2.hashCode();
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            int i = 2 % 2;
            int i2 = MediaMetadataCompat + 91;
            MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            if (this.IconCompatParcelizer) {
                return;
            }
            this.IconCompatParcelizer = true;
            this.RemoteActionCompatParcelizer = true;
            this.serializer.onComplete();
            int i4 = MediaMetadataCompat + 59;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 92 / 0;
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            int i = 2 % 2;
            int i2 = MediaMetadataCompat;
            int i3 = i2 + 33;
            MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            boolean z = this.RemoteActionCompatParcelizer;
            Observer observer = this.serializer;
            if (z) {
                int i5 = i2 + 85;
                MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                if (!this.IconCompatParcelizer) {
                    observer.onError(th);
                    return;
                }
                RxJavaPlugins.IconCompatParcelizer(th);
                int i7 = MediaSessionCompatQueueItem + 43;
                MediaMetadataCompat = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    int i8 = 4 / 0;
                    return;
                }
                return;
            }
            this.RemoteActionCompatParcelizer = true;
            try {
                ObservableSource observableSource = (ObservableSource) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.read.serializer).invoke(th);
                if (observableSource != null) {
                    observableSource.subscribe(this);
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("Observable is null");
                nullPointerException.initCause(th);
                observer.onError(nullPointerException);
            } catch (Throwable th2) {
                Exceptions.read(th2);
                observer.onError(new CompositeException(th, th2));
            }
        }
    }

    @Override // io.reactivex.Observable
    public final void read(Observer observer) {
        OnErrorNextObserver onErrorNextObserver = new OnErrorNextObserver(observer, this.IconCompatParcelizer);
        observer.onSubscribe(onErrorNextObserver.write);
        this.read.subscribe(onErrorNextObserver);
    }

    public ObservableOnErrorNext(Observable observable, GetAppStateImpl getAppStateImpl) {
        super(observable);
        this.IconCompatParcelizer = getAppStateImpl;
    }
}
