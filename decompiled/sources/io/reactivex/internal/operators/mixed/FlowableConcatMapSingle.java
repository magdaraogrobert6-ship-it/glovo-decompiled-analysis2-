package io.reactivex.internal.operators.mixed;

import com.roadrunner.logger.logger.perseus.PerseusInitializerImpl$$ExternalSyntheticLambda0;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;
import o.FwFClientclose11;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowableConcatMapSingle<T, R> extends Flowable<R> {
    public final ErrorMode RemoteActionCompatParcelizer;
    public final PerseusInitializerImpl$$ExternalSyntheticLambda0 read;
    public final Flowable serializer;

    public static final class ConcatMapSingleSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, FwFClientclose11 {
        public long IconCompatParcelizer;
        public final ErrorMode MediaDescriptionCompat;
        public final PerseusInitializerImpl$$ExternalSyntheticLambda0 MediaMetadataCompat;
        public FwFClientclose11 ParcelableVolumeInfo;
        public volatile int PlaybackStateCompatCustomAction;
        public Object RatingCompat;
        public int RemoteActionCompatParcelizer;
        public volatile boolean read;
        public volatile boolean serializer;
        public final FwFClientaddFeatureKeysfeaturesUpdated1 write;
        public final int PlaybackStateCompat = 2;
        public final AtomicLong MediaSessionCompatToken = new AtomicLong();
        public final AtomicThrowable MediaSessionCompatQueueItem = new AtomicThrowable();
        public final ConcatMapSingleObserver MediaBrowserCompatMediaItem = new ConcatMapSingleObserver(this);
        public final SpscArrayQueue MediaSessionCompatResultReceiverWrapper = new SpscArrayQueue(2);

        public static final class ConcatMapSingleObserver<R> extends AtomicReference<Disposable> implements SingleObserver<R> {
            public final ConcatMapSingleSubscriber read;

            @Override // io.reactivex.SingleObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public final void onError(Throwable th) {
                ConcatMapSingleSubscriber concatMapSingleSubscriber = this.read;
                AtomicThrowable atomicThrowable = concatMapSingleSubscriber.MediaSessionCompatQueueItem;
                atomicThrowable.getClass();
                if (!ExceptionHelper.read(atomicThrowable, th)) {
                    RxJavaPlugins.IconCompatParcelizer(th);
                    return;
                }
                if (concatMapSingleSubscriber.MediaDescriptionCompat != ErrorMode.END) {
                    concatMapSingleSubscriber.ParcelableVolumeInfo.cancel();
                }
                concatMapSingleSubscriber.PlaybackStateCompatCustomAction = 0;
                concatMapSingleSubscriber.read();
            }

            @Override // io.reactivex.SingleObserver
            public final void onSuccess(Object obj) {
                ConcatMapSingleSubscriber concatMapSingleSubscriber = this.read;
                concatMapSingleSubscriber.RatingCompat = obj;
                concatMapSingleSubscriber.PlaybackStateCompatCustomAction = 2;
                concatMapSingleSubscriber.read();
            }

            public ConcatMapSingleObserver(ConcatMapSingleSubscriber concatMapSingleSubscriber) {
                this.read = concatMapSingleSubscriber;
            }
        }

        @Override // o.FwFClientclose11
        public final void cancel() {
            this.read = true;
            this.ParcelableVolumeInfo.cancel();
            ConcatMapSingleObserver concatMapSingleObserver = this.MediaBrowserCompatMediaItem;
            concatMapSingleObserver.getClass();
            DisposableHelper.dispose(concatMapSingleObserver);
            if (getAndIncrement() == 0) {
                this.MediaSessionCompatResultReceiverWrapper.clear();
                this.RatingCompat = null;
            }
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onComplete() {
            this.serializer = true;
            read();
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.MediaSessionCompatQueueItem;
            atomicThrowable.getClass();
            if (!ExceptionHelper.read(atomicThrowable, th)) {
                RxJavaPlugins.IconCompatParcelizer(th);
                return;
            }
            if (this.MediaDescriptionCompat == ErrorMode.IMMEDIATE) {
                ConcatMapSingleObserver concatMapSingleObserver = this.MediaBrowserCompatMediaItem;
                concatMapSingleObserver.getClass();
                DisposableHelper.dispose(concatMapSingleObserver);
            }
            this.serializer = true;
            read();
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onNext(Object obj) {
            if (this.MediaSessionCompatResultReceiverWrapper.offer(obj)) {
                read();
            } else {
                this.ParcelableVolumeInfo.cancel();
                onError(new MissingBackpressureException("queue full?!"));
            }
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onSubscribe(FwFClientclose11 fwFClientclose11) {
            if (SubscriptionHelper.validate(this.ParcelableVolumeInfo, fwFClientclose11)) {
                this.ParcelableVolumeInfo = fwFClientclose11;
                this.write.onSubscribe(this);
                fwFClientclose11.request(this.PlaybackStateCompat);
            }
        }

        @Override // o.FwFClientclose11
        public final void request(long j) {
            BackpressureHelper.write(this.MediaSessionCompatToken, j);
            read();
        }

        public ConcatMapSingleSubscriber(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1, PerseusInitializerImpl$$ExternalSyntheticLambda0 perseusInitializerImpl$$ExternalSyntheticLambda0, ErrorMode errorMode) {
            this.write = fwFClientaddFeatureKeysfeaturesUpdated1;
            this.MediaMetadataCompat = perseusInitializerImpl$$ExternalSyntheticLambda0;
            this.MediaDescriptionCompat = errorMode;
        }

        public final void read() {
            if (getAndIncrement() != 0) {
                return;
            }
            FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1 = this.write;
            ErrorMode errorMode = this.MediaDescriptionCompat;
            SpscArrayQueue spscArrayQueue = this.MediaSessionCompatResultReceiverWrapper;
            AtomicThrowable atomicThrowable = this.MediaSessionCompatQueueItem;
            AtomicLong atomicLong = this.MediaSessionCompatToken;
            int i = this.PlaybackStateCompat;
            int i2 = i - (i >> 1);
            int iAddAndGet = 1;
            while (true) {
                if (!this.read) {
                    int i3 = this.PlaybackStateCompatCustomAction;
                    if (atomicThrowable.get() != null && (errorMode == ErrorMode.IMMEDIATE || (errorMode == ErrorMode.BOUNDARY && i3 == 0))) {
                        break;
                    }
                    if (i3 == 0) {
                        boolean z = this.serializer;
                        Object objPoll = spscArrayQueue.poll();
                        boolean z2 = objPoll == null;
                        if (z && z2) {
                            Throwable thRemoteActionCompatParcelizer = ExceptionHelper.RemoteActionCompatParcelizer(atomicThrowable);
                            if (thRemoteActionCompatParcelizer == null) {
                                fwFClientaddFeatureKeysfeaturesUpdated1.onComplete();
                                return;
                            } else {
                                fwFClientaddFeatureKeysfeaturesUpdated1.onError(thRemoteActionCompatParcelizer);
                                return;
                            }
                        }
                        if (!z2) {
                            int i4 = this.RemoteActionCompatParcelizer + 1;
                            if (i4 == i2) {
                                this.RemoteActionCompatParcelizer = 0;
                                this.ParcelableVolumeInfo.request(i2);
                            } else {
                                this.RemoteActionCompatParcelizer = i4;
                            }
                            try {
                                SingleSource singleSource = (SingleSource) this.MediaMetadataCompat.apply(objPoll);
                                this.PlaybackStateCompatCustomAction = 1;
                                singleSource.subscribe(this.MediaBrowserCompatMediaItem);
                            } catch (Throwable th) {
                                Exceptions.read(th);
                                this.ParcelableVolumeInfo.cancel();
                                spscArrayQueue.clear();
                                ExceptionHelper.read(atomicThrowable, th);
                                fwFClientaddFeatureKeysfeaturesUpdated1.onError(ExceptionHelper.RemoteActionCompatParcelizer(atomicThrowable));
                                return;
                            }
                        }
                    } else if (i3 == 2) {
                        long j = this.IconCompatParcelizer;
                        if (j != atomicLong.get()) {
                            Object obj = this.RatingCompat;
                            this.RatingCompat = null;
                            fwFClientaddFeatureKeysfeaturesUpdated1.onNext(obj);
                            this.IconCompatParcelizer = j + 1;
                            this.PlaybackStateCompatCustomAction = 0;
                        }
                    }
                } else {
                    spscArrayQueue.clear();
                    this.RatingCompat = null;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            spscArrayQueue.clear();
            this.RatingCompat = null;
            fwFClientaddFeatureKeysfeaturesUpdated1.onError(ExceptionHelper.RemoteActionCompatParcelizer(atomicThrowable));
        }
    }

    @Override // io.reactivex.Flowable
    public final void IconCompatParcelizer(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        this.serializer.subscribe((FlowableSubscriber) new ConcatMapSingleSubscriber(fwFClientaddFeatureKeysfeaturesUpdated1, this.read, this.RemoteActionCompatParcelizer));
    }

    public FlowableConcatMapSingle(Flowable flowable, PerseusInitializerImpl$$ExternalSyntheticLambda0 perseusInitializerImpl$$ExternalSyntheticLambda0, ErrorMode errorMode) {
        this.serializer = flowable;
        this.read = perseusInitializerImpl$$ExternalSyntheticLambda0;
        this.RemoteActionCompatParcelizer = errorMode;
    }
}
