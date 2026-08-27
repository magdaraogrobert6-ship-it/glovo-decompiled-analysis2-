package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;
import o.FwFClientclose11;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowableFlatMapMaybe<T, R> extends AbstractFlowableWithUpstream<T, R> {
    public final Function RemoteActionCompatParcelizer;
    public final int read;

    public static final class FlatMapMaybeSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, FwFClientclose11 {
        public final FwFClientaddFeatureKeysfeaturesUpdated1 IconCompatParcelizer;
        public final int MediaDescriptionCompat;
        public FwFClientclose11 MediaSessionCompatQueueItem;
        public volatile boolean read;
        public final Function write;
        public final AtomicLong MediaBrowserCompatMediaItem = new AtomicLong();
        public final CompositeDisposable MediaMetadataCompat = new CompositeDisposable();
        public final AtomicThrowable serializer = new AtomicThrowable();
        public final AtomicInteger RemoteActionCompatParcelizer = new AtomicInteger(1);
        public final AtomicReference RatingCompat = new AtomicReference();

        public final class InnerObserver extends AtomicReference<Disposable> implements MaybeObserver<R>, Disposable {
            @Override // io.reactivex.disposables.Disposable
            public final void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            public InnerObserver() {
            }

            @Override // io.reactivex.MaybeObserver
            public final void onComplete() {
                FlatMapMaybeSubscriber flatMapMaybeSubscriber = FlatMapMaybeSubscriber.this;
                int i = flatMapMaybeSubscriber.MediaDescriptionCompat;
                AtomicInteger atomicInteger = flatMapMaybeSubscriber.RemoteActionCompatParcelizer;
                flatMapMaybeSubscriber.MediaMetadataCompat.IconCompatParcelizer(this);
                if (flatMapMaybeSubscriber.get() == 0) {
                    if (flatMapMaybeSubscriber.compareAndSet(0, 1)) {
                        boolean z = atomicInteger.decrementAndGet() == 0;
                        SpscLinkedArrayQueue spscLinkedArrayQueue = (SpscLinkedArrayQueue) flatMapMaybeSubscriber.RatingCompat.get();
                        if (!z || (spscLinkedArrayQueue != null && !spscLinkedArrayQueue.isEmpty())) {
                            if (i != Integer.MAX_VALUE) {
                                flatMapMaybeSubscriber.MediaSessionCompatQueueItem.request(1L);
                            }
                            if (flatMapMaybeSubscriber.decrementAndGet() == 0) {
                                return;
                            }
                            flatMapMaybeSubscriber.RemoteActionCompatParcelizer();
                            return;
                        }
                        AtomicThrowable atomicThrowable = flatMapMaybeSubscriber.serializer;
                        atomicThrowable.getClass();
                        Throwable thRemoteActionCompatParcelizer = ExceptionHelper.RemoteActionCompatParcelizer(atomicThrowable);
                        FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1 = flatMapMaybeSubscriber.IconCompatParcelizer;
                        if (thRemoteActionCompatParcelizer != null) {
                            fwFClientaddFeatureKeysfeaturesUpdated1.onError(thRemoteActionCompatParcelizer);
                            return;
                        } else {
                            fwFClientaddFeatureKeysfeaturesUpdated1.onComplete();
                            return;
                        }
                    }
                }
                atomicInteger.decrementAndGet();
                if (i != Integer.MAX_VALUE) {
                    flatMapMaybeSubscriber.MediaSessionCompatQueueItem.request(1L);
                }
                flatMapMaybeSubscriber.write();
            }

            @Override // io.reactivex.MaybeObserver
            public final void onError(Throwable th) {
                FlatMapMaybeSubscriber flatMapMaybeSubscriber = FlatMapMaybeSubscriber.this;
                CompositeDisposable compositeDisposable = flatMapMaybeSubscriber.MediaMetadataCompat;
                compositeDisposable.IconCompatParcelizer(this);
                AtomicThrowable atomicThrowable = flatMapMaybeSubscriber.serializer;
                atomicThrowable.getClass();
                if (!ExceptionHelper.read(atomicThrowable, th)) {
                    RxJavaPlugins.IconCompatParcelizer(th);
                    return;
                }
                flatMapMaybeSubscriber.MediaSessionCompatQueueItem.cancel();
                compositeDisposable.dispose();
                flatMapMaybeSubscriber.RemoteActionCompatParcelizer.decrementAndGet();
                flatMapMaybeSubscriber.write();
            }

            /* JADX WARN: Code duplicated, block: B:41:0x0092  */
            /* JADX WARN: Code duplicated, block: B:45:0x009d  */
            /* JADX WARN: Code duplicated, block: B:53:0x00bb A[ORIG_RETURN, RETURN] */
            /* JADX WARN: Code duplicated, block: B:59:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:66:0x00ab A[EDGE_INSN: B:66:0x00ab->B:48:0x00ab BREAK  A[LOOP:1: B:42:0x0094->B:68:?], SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:67:0x00aa A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:68:? A[LOOP:1: B:42:0x0094->B:68:?, LOOP_END, SYNTHETIC] */
            @Override // io.reactivex.MaybeObserver
            public final void onSuccess(Object obj) {
                AtomicReference atomicReference;
                SpscLinkedArrayQueue spscLinkedArrayQueue;
                SpscLinkedArrayQueue spscLinkedArrayQueue2;
                SpscLinkedArrayQueue spscLinkedArrayQueue3;
                FlatMapMaybeSubscriber flatMapMaybeSubscriber = FlatMapMaybeSubscriber.this;
                flatMapMaybeSubscriber.MediaMetadataCompat.IconCompatParcelizer(this);
                if (flatMapMaybeSubscriber.get() == 0) {
                    if (flatMapMaybeSubscriber.compareAndSet(0, 1)) {
                        boolean z = flatMapMaybeSubscriber.RemoteActionCompatParcelizer.decrementAndGet() == 0;
                        if (flatMapMaybeSubscriber.MediaBrowserCompatMediaItem.get() != 0) {
                            flatMapMaybeSubscriber.IconCompatParcelizer.onNext(obj);
                            SpscLinkedArrayQueue spscLinkedArrayQueue4 = (SpscLinkedArrayQueue) flatMapMaybeSubscriber.RatingCompat.get();
                            if (z && (spscLinkedArrayQueue4 == null || spscLinkedArrayQueue4.isEmpty())) {
                                AtomicThrowable atomicThrowable = flatMapMaybeSubscriber.serializer;
                                atomicThrowable.getClass();
                                Throwable thRemoteActionCompatParcelizer = ExceptionHelper.RemoteActionCompatParcelizer(atomicThrowable);
                                FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1 = flatMapMaybeSubscriber.IconCompatParcelizer;
                                if (thRemoteActionCompatParcelizer != null) {
                                    fwFClientaddFeatureKeysfeaturesUpdated1.onError(thRemoteActionCompatParcelizer);
                                    return;
                                } else {
                                    fwFClientaddFeatureKeysfeaturesUpdated1.onComplete();
                                    return;
                                }
                            }
                            BackpressureHelper.serializer(flatMapMaybeSubscriber.MediaBrowserCompatMediaItem, 1L);
                            if (flatMapMaybeSubscriber.MediaDescriptionCompat != Integer.MAX_VALUE) {
                                flatMapMaybeSubscriber.MediaSessionCompatQueueItem.request(1L);
                            }
                        } else {
                            AtomicReference atomicReference2 = flatMapMaybeSubscriber.RatingCompat;
                            while (true) {
                                spscLinkedArrayQueue3 = (SpscLinkedArrayQueue) atomicReference2.get();
                                if (spscLinkedArrayQueue3 != null) {
                                    break;
                                }
                                SpscLinkedArrayQueue spscLinkedArrayQueue5 = new SpscLinkedArrayQueue(Flowable.write);
                                if (getBitmapFromCache.write(atomicReference2, spscLinkedArrayQueue5)) {
                                    spscLinkedArrayQueue3 = spscLinkedArrayQueue5;
                                    break;
                                }
                            }
                            synchronized (spscLinkedArrayQueue3) {
                                spscLinkedArrayQueue3.offer(obj);
                            }
                        }
                        if (flatMapMaybeSubscriber.decrementAndGet() == 0) {
                            return;
                        }
                    } else {
                        atomicReference = flatMapMaybeSubscriber.RatingCompat;
                        while (true) {
                            spscLinkedArrayQueue = (SpscLinkedArrayQueue) atomicReference.get();
                            if (spscLinkedArrayQueue != null) {
                                break;
                            }
                            spscLinkedArrayQueue2 = new SpscLinkedArrayQueue(Flowable.write);
                            if (getBitmapFromCache.write(atomicReference, spscLinkedArrayQueue2)) {
                                spscLinkedArrayQueue = spscLinkedArrayQueue2;
                                break;
                            }
                        }
                        synchronized (spscLinkedArrayQueue) {
                            spscLinkedArrayQueue.offer(obj);
                        }
                        flatMapMaybeSubscriber.RemoteActionCompatParcelizer.decrementAndGet();
                        if (flatMapMaybeSubscriber.getAndIncrement() != 0) {
                            return;
                        }
                    }
                } else {
                    atomicReference = flatMapMaybeSubscriber.RatingCompat;
                    while (true) {
                        spscLinkedArrayQueue = (SpscLinkedArrayQueue) atomicReference.get();
                        if (spscLinkedArrayQueue != null) {
                            break;
                            break;
                        }
                        spscLinkedArrayQueue2 = new SpscLinkedArrayQueue(Flowable.write);
                        if (getBitmapFromCache.write(atomicReference, spscLinkedArrayQueue2)) {
                            spscLinkedArrayQueue = spscLinkedArrayQueue2;
                            break;
                        }
                    }
                    synchronized (spscLinkedArrayQueue) {
                        spscLinkedArrayQueue.offer(obj);
                        flatMapMaybeSubscriber.RemoteActionCompatParcelizer.decrementAndGet();
                        if (flatMapMaybeSubscriber.getAndIncrement() != 0) {
                            return;
                        }
                    }
                }
                flatMapMaybeSubscriber.RemoteActionCompatParcelizer();
            }

            @Override // io.reactivex.disposables.Disposable
            public final boolean isDisposed() {
                return DisposableHelper.isDisposed(get());
            }
        }

        @Override // o.FwFClientclose11
        public final void cancel() {
            this.read = true;
            this.MediaSessionCompatQueueItem.cancel();
            this.MediaMetadataCompat.dispose();
        }

        public final void IconCompatParcelizer() {
            SpscLinkedArrayQueue spscLinkedArrayQueue = (SpscLinkedArrayQueue) this.RatingCompat.get();
            if (spscLinkedArrayQueue != null) {
                spscLinkedArrayQueue.clear();
            }
        }

        public final void RemoteActionCompatParcelizer() {
            FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1 = this.IconCompatParcelizer;
            AtomicInteger atomicInteger = this.RemoteActionCompatParcelizer;
            AtomicReference atomicReference = this.RatingCompat;
            int iAddAndGet = 1;
            do {
                long j = this.MediaBrowserCompatMediaItem.get();
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        break;
                    }
                    if (this.read) {
                        IconCompatParcelizer();
                        return;
                    }
                    if (this.serializer.get() != null) {
                        AtomicThrowable atomicThrowable = this.serializer;
                        atomicThrowable.getClass();
                        Throwable thRemoteActionCompatParcelizer = ExceptionHelper.RemoteActionCompatParcelizer(atomicThrowable);
                        IconCompatParcelizer();
                        fwFClientaddFeatureKeysfeaturesUpdated1.onError(thRemoteActionCompatParcelizer);
                        return;
                    }
                    boolean z = atomicInteger.get() == 0;
                    SpscLinkedArrayQueue spscLinkedArrayQueue = (SpscLinkedArrayQueue) atomicReference.get();
                    Object objPoll = spscLinkedArrayQueue != null ? spscLinkedArrayQueue.poll() : null;
                    boolean z2 = objPoll == null;
                    if (z && z2) {
                        AtomicThrowable atomicThrowable2 = this.serializer;
                        atomicThrowable2.getClass();
                        Throwable thRemoteActionCompatParcelizer2 = ExceptionHelper.RemoteActionCompatParcelizer(atomicThrowable2);
                        if (thRemoteActionCompatParcelizer2 != null) {
                            fwFClientaddFeatureKeysfeaturesUpdated1.onError(thRemoteActionCompatParcelizer2);
                            return;
                        } else {
                            fwFClientaddFeatureKeysfeaturesUpdated1.onComplete();
                            return;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    fwFClientaddFeatureKeysfeaturesUpdated1.onNext(objPoll);
                    j2++;
                }
                if (j2 == j) {
                    if (this.read) {
                        IconCompatParcelizer();
                        return;
                    }
                    if (this.serializer.get() != null) {
                        AtomicThrowable atomicThrowable3 = this.serializer;
                        atomicThrowable3.getClass();
                        Throwable thRemoteActionCompatParcelizer3 = ExceptionHelper.RemoteActionCompatParcelizer(atomicThrowable3);
                        IconCompatParcelizer();
                        fwFClientaddFeatureKeysfeaturesUpdated1.onError(thRemoteActionCompatParcelizer3);
                        return;
                    }
                    boolean z3 = atomicInteger.get() == 0;
                    SpscLinkedArrayQueue spscLinkedArrayQueue2 = (SpscLinkedArrayQueue) atomicReference.get();
                    boolean z4 = spscLinkedArrayQueue2 == null || spscLinkedArrayQueue2.isEmpty();
                    if (z3 && z4) {
                        AtomicThrowable atomicThrowable4 = this.serializer;
                        atomicThrowable4.getClass();
                        Throwable thRemoteActionCompatParcelizer4 = ExceptionHelper.RemoteActionCompatParcelizer(atomicThrowable4);
                        if (thRemoteActionCompatParcelizer4 != null) {
                            fwFClientaddFeatureKeysfeaturesUpdated1.onError(thRemoteActionCompatParcelizer4);
                            return;
                        } else {
                            fwFClientaddFeatureKeysfeaturesUpdated1.onComplete();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    BackpressureHelper.serializer(this.MediaBrowserCompatMediaItem, j2);
                    if (this.MediaDescriptionCompat != Integer.MAX_VALUE) {
                        this.MediaSessionCompatQueueItem.request(j2);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onComplete() {
            this.RemoteActionCompatParcelizer.decrementAndGet();
            write();
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onError(Throwable th) {
            this.RemoteActionCompatParcelizer.decrementAndGet();
            AtomicThrowable atomicThrowable = this.serializer;
            atomicThrowable.getClass();
            if (!ExceptionHelper.read(atomicThrowable, th)) {
                RxJavaPlugins.IconCompatParcelizer(th);
            } else {
                this.MediaMetadataCompat.dispose();
                write();
            }
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onNext(Object obj) {
            try {
                Object objApply = this.write.apply(obj);
                ObjectHelper.write(objApply, "The mapper returned a null MaybeSource");
                MaybeSource maybeSource = (MaybeSource) objApply;
                this.RemoteActionCompatParcelizer.getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (this.read || !this.MediaMetadataCompat.read(innerObserver)) {
                    return;
                }
                maybeSource.subscribe(innerObserver);
            } catch (Throwable th) {
                Exceptions.read(th);
                this.MediaSessionCompatQueueItem.cancel();
                onError(th);
            }
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onSubscribe(FwFClientclose11 fwFClientclose11) {
            if (SubscriptionHelper.validate(this.MediaSessionCompatQueueItem, fwFClientclose11)) {
                this.MediaSessionCompatQueueItem = fwFClientclose11;
                this.IconCompatParcelizer.onSubscribe(this);
                int i = this.MediaDescriptionCompat;
                if (i == Integer.MAX_VALUE) {
                    fwFClientclose11.request(Long.MAX_VALUE);
                } else {
                    fwFClientclose11.request(i);
                }
            }
        }

        public FlatMapMaybeSubscriber(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1, Function function, int i) {
            this.IconCompatParcelizer = fwFClientaddFeatureKeysfeaturesUpdated1;
            this.write = function;
            this.MediaDescriptionCompat = i;
        }

        @Override // o.FwFClientclose11
        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.write(this.MediaBrowserCompatMediaItem, j);
                write();
            }
        }

        public final void write() {
            if (getAndIncrement() == 0) {
                RemoteActionCompatParcelizer();
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void IconCompatParcelizer(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        this.IconCompatParcelizer.subscribe((FlowableSubscriber) new FlatMapMaybeSubscriber(fwFClientaddFeatureKeysfeaturesUpdated1, this.RemoteActionCompatParcelizer, this.read));
    }

    public FlowableFlatMapMaybe(Flowable flowable, Function function) {
        super(flowable);
        this.RemoteActionCompatParcelizer = function;
        this.read = Integer.MAX_VALUE;
    }
}
