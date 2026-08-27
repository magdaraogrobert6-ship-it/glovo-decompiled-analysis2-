package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.schedulers.TrampolineScheduler;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes4.dex */
public final class ObservableObserveOn<T> extends AbstractObservableWithUpstream<T, T> {
    public final Scheduler serializer;
    public final int write;

    public static final class ObserveOnObserver<T> extends BasicIntQueueDisposable<T> implements Observer<T>, Runnable {
        public volatile boolean IconCompatParcelizer;
        public boolean MediaBrowserCompatMediaItem;
        public Disposable MediaDescriptionCompat;
        public int MediaMetadataCompat;
        public final Scheduler.Worker MediaSessionCompatQueueItem;
        public SimpleQueue RatingCompat;
        public Throwable RemoteActionCompatParcelizer;
        public volatile boolean read;
        public final Observer serializer;
        public final int write;

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.IconCompatParcelizer;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            this.MediaBrowserCompatMediaItem = true;
            return 2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.RatingCompat.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.RatingCompat.isEmpty();
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.MediaDescriptionCompat, disposable)) {
                this.MediaDescriptionCompat = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iRequestFusion = queueDisposable.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.MediaMetadataCompat = iRequestFusion;
                        this.RatingCompat = queueDisposable;
                        this.read = true;
                        this.serializer.onSubscribe(this);
                        if (getAndIncrement() == 0) {
                            this.MediaSessionCompatQueueItem.IconCompatParcelizer(this);
                            return;
                        }
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.MediaMetadataCompat = iRequestFusion;
                        this.RatingCompat = queueDisposable;
                        this.serializer.onSubscribe(this);
                        return;
                    }
                }
                this.RatingCompat = new SpscLinkedArrayQueue(this.write);
                this.serializer.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            return this.RatingCompat.poll();
        }

        public ObserveOnObserver(Observer observer, Scheduler.Worker worker, int i) {
            this.serializer = observer;
            this.MediaSessionCompatQueueItem = worker;
            this.write = i;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.read) {
                RxJavaPlugins.IconCompatParcelizer(th);
                return;
            }
            this.RemoteActionCompatParcelizer = th;
            this.read = true;
            if (getAndIncrement() == 0) {
                this.MediaSessionCompatQueueItem.IconCompatParcelizer(this);
            }
        }

        public final boolean IconCompatParcelizer(boolean z, boolean z2, Observer observer) {
            if (this.IconCompatParcelizer) {
                this.RatingCompat.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.RemoteActionCompatParcelizer;
            if (th != null) {
                this.IconCompatParcelizer = true;
                this.RatingCompat.clear();
                observer.onError(th);
                this.MediaSessionCompatQueueItem.dispose();
                return true;
            }
            if (!z2) {
                return false;
            }
            this.IconCompatParcelizer = true;
            observer.onComplete();
            this.MediaSessionCompatQueueItem.dispose();
            return true;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.IconCompatParcelizer) {
                return;
            }
            this.IconCompatParcelizer = true;
            this.MediaDescriptionCompat.dispose();
            this.MediaSessionCompatQueueItem.dispose();
            if (this.MediaBrowserCompatMediaItem || getAndIncrement() != 0) {
                return;
            }
            this.RatingCompat.clear();
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.read) {
                return;
            }
            if (this.MediaMetadataCompat != 2) {
                this.RatingCompat.offer(obj);
            }
            if (getAndIncrement() == 0) {
                this.MediaSessionCompatQueueItem.IconCompatParcelizer(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.read) {
                return;
            }
            this.read = true;
            if (getAndIncrement() == 0) {
                this.MediaSessionCompatQueueItem.IconCompatParcelizer(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.MediaBrowserCompatMediaItem) {
                int iAddAndGet = 1;
                while (!this.IconCompatParcelizer) {
                    boolean z = this.read;
                    Throwable th = this.RemoteActionCompatParcelizer;
                    if (z && th != null) {
                        this.IconCompatParcelizer = true;
                        this.serializer.onError(this.RemoteActionCompatParcelizer);
                        this.MediaSessionCompatQueueItem.dispose();
                        return;
                    }
                    this.serializer.onNext(null);
                    if (z) {
                        this.IconCompatParcelizer = true;
                        Throwable th2 = this.RemoteActionCompatParcelizer;
                        Observer observer = this.serializer;
                        if (th2 != null) {
                            observer.onError(th2);
                        } else {
                            observer.onComplete();
                        }
                        this.MediaSessionCompatQueueItem.dispose();
                        return;
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
                return;
            }
            SimpleQueue simpleQueue = this.RatingCompat;
            Observer observer2 = this.serializer;
            int iAddAndGet2 = 1;
            while (!IconCompatParcelizer(this.read, simpleQueue.isEmpty(), observer2)) {
                while (true) {
                    boolean z2 = this.read;
                    try {
                        Object objPoll = simpleQueue.poll();
                        boolean z3 = objPoll == null;
                        if (IconCompatParcelizer(z2, z3, observer2)) {
                            return;
                        }
                        if (z3) {
                            break;
                        } else {
                            observer2.onNext(objPoll);
                        }
                    } catch (Throwable th3) {
                        Exceptions.read(th3);
                        this.IconCompatParcelizer = true;
                        this.MediaDescriptionCompat.dispose();
                        simpleQueue.clear();
                        observer2.onError(th3);
                        this.MediaSessionCompatQueueItem.dispose();
                        return;
                    }
                }
                iAddAndGet2 = addAndGet(-iAddAndGet2);
                if (iAddAndGet2 == 0) {
                    return;
                }
            }
        }
    }

    @Override // io.reactivex.Observable
    public final void read(Observer observer) {
        Scheduler scheduler = this.serializer;
        boolean z = scheduler instanceof TrampolineScheduler;
        Observable observable = this.read;
        if (z) {
            observable.subscribe(observer);
        } else {
            observable.subscribe(new ObserveOnObserver(observer, scheduler.write(), this.write));
        }
    }

    public ObservableObserveOn(Observable observable, Scheduler scheduler, int i) {
        super(observable);
        this.serializer = scheduler;
        this.write = i;
    }
}
