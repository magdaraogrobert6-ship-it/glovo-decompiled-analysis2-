package io.reactivex.internal.operators.flowable;

import com.google.firebase.inappmessaging.internal.InAppMessageStreamManager$$ExternalSyntheticLambda1;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;
import o.FwFClientclose11;
import o.syncCustomerProfilefwf_client_release;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowableConcatMap<T, R> extends AbstractFlowableWithUpstream<T, R> {
    public final ErrorMode RemoteActionCompatParcelizer;
    public final int read;
    public final InAppMessageStreamManager$$ExternalSyntheticLambda1 serializer;

    /* JADX INFO: loaded from: classes5.dex */
    public static abstract class BaseConcatMapSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, ConcatMapSupport<R>, FwFClientclose11 {
        public final int MediaBrowserCompatMediaItem;
        public final int MediaDescriptionCompat;
        public final Function MediaSessionCompatQueueItem;
        public int PlaybackStateCompat;
        public FwFClientclose11 PlaybackStateCompatCustomAction;
        public SimpleQueue RatingCompat;
        public volatile boolean RemoteActionCompatParcelizer;
        public volatile boolean read;
        public int serializer;
        public volatile boolean write;
        public final ConcatMapInner MediaMetadataCompat = new ConcatMapInner(this);
        public final AtomicThrowable IconCompatParcelizer = new AtomicThrowable();

        public abstract void IconCompatParcelizer();

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onComplete() {
            this.write = true;
            write();
        }

        public abstract void write();

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onSubscribe(FwFClientclose11 fwFClientclose11) {
            if (SubscriptionHelper.validate(this.PlaybackStateCompatCustomAction, fwFClientclose11)) {
                this.PlaybackStateCompatCustomAction = fwFClientclose11;
                if (fwFClientclose11 instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) fwFClientclose11;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.PlaybackStateCompat = iRequestFusion;
                        this.RatingCompat = queueSubscription;
                        this.write = true;
                        IconCompatParcelizer();
                        write();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.PlaybackStateCompat = iRequestFusion;
                        this.RatingCompat = queueSubscription;
                        IconCompatParcelizer();
                        fwFClientclose11.request(this.MediaBrowserCompatMediaItem);
                        return;
                    }
                }
                this.RatingCompat = new SpscArrayQueue(this.MediaBrowserCompatMediaItem);
                IconCompatParcelizer();
                fwFClientclose11.request(this.MediaBrowserCompatMediaItem);
            }
        }

        public BaseConcatMapSubscriber(Function function, int i) {
            this.MediaSessionCompatQueueItem = function;
            this.MediaBrowserCompatMediaItem = i;
            this.MediaDescriptionCompat = i - (i >> 2);
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onNext(Object obj) {
            if (this.PlaybackStateCompat == 2 || this.RatingCompat.offer(obj)) {
                write();
            } else {
                this.PlaybackStateCompatCustomAction.cancel();
                onError(new IllegalStateException("Queue full?!"));
            }
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class ConcatMapDelayed<T, R> extends BaseConcatMapSubscriber<T, R> {
        public final boolean MediaSessionCompatToken;
        public final FwFClientaddFeatureKeysfeaturesUpdated1 ParcelableVolumeInfo;

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        public final void IconCompatParcelizer() {
            this.ParcelableVolumeInfo.onSubscribe(this);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public final void IconCompatParcelizer(Object obj) {
            this.ParcelableVolumeInfo.onNext(obj);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public final void RemoteActionCompatParcelizer(Throwable th) {
            AtomicThrowable atomicThrowable = this.IconCompatParcelizer;
            atomicThrowable.getClass();
            if (!ExceptionHelper.read(atomicThrowable, th)) {
                RxJavaPlugins.IconCompatParcelizer(th);
                return;
            }
            if (!this.MediaSessionCompatToken) {
                this.PlaybackStateCompatCustomAction.cancel();
                this.write = true;
            }
            this.read = false;
            write();
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.IconCompatParcelizer;
            atomicThrowable.getClass();
            if (!ExceptionHelper.read(atomicThrowable, th)) {
                RxJavaPlugins.IconCompatParcelizer(th);
            } else {
                this.write = true;
                write();
            }
        }

        @Override // o.FwFClientclose11
        public final void request(long j) {
            this.MediaMetadataCompat.request(j);
        }

        public ConcatMapDelayed(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1, Function function, int i, boolean z) {
            super(function, i);
            this.ParcelableVolumeInfo = fwFClientaddFeatureKeysfeaturesUpdated1;
            this.MediaSessionCompatToken = z;
        }

        @Override // o.FwFClientclose11
        public final void cancel() {
            if (this.RemoteActionCompatParcelizer) {
                return;
            }
            this.RemoteActionCompatParcelizer = true;
            this.MediaMetadataCompat.cancel();
            this.PlaybackStateCompatCustomAction.cancel();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        public final void write() {
            Object objCall;
            if (getAndIncrement() == 0) {
                while (!this.RemoteActionCompatParcelizer) {
                    if (!this.read) {
                        boolean z = this.write;
                        if (z && !this.MediaSessionCompatToken && this.IconCompatParcelizer.get() != null) {
                            FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1 = this.ParcelableVolumeInfo;
                            AtomicThrowable atomicThrowable = this.IconCompatParcelizer;
                            atomicThrowable.getClass();
                            fwFClientaddFeatureKeysfeaturesUpdated1.onError(ExceptionHelper.RemoteActionCompatParcelizer(atomicThrowable));
                            return;
                        }
                        try {
                            Object objPoll = this.RatingCompat.poll();
                            boolean z2 = objPoll == null;
                            if (z && z2) {
                                AtomicThrowable atomicThrowable2 = this.IconCompatParcelizer;
                                atomicThrowable2.getClass();
                                Throwable thRemoteActionCompatParcelizer = ExceptionHelper.RemoteActionCompatParcelizer(atomicThrowable2);
                                FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated2 = this.ParcelableVolumeInfo;
                                if (thRemoteActionCompatParcelizer != null) {
                                    fwFClientaddFeatureKeysfeaturesUpdated2.onError(thRemoteActionCompatParcelizer);
                                    return;
                                } else {
                                    fwFClientaddFeatureKeysfeaturesUpdated2.onComplete();
                                    return;
                                }
                            }
                            if (!z2) {
                                try {
                                    Object objApply = this.MediaSessionCompatQueueItem.apply(objPoll);
                                    ObjectHelper.write(objApply, "The mapper returned a null Publisher");
                                    syncCustomerProfilefwf_client_release synccustomerprofilefwf_client_release = (syncCustomerProfilefwf_client_release) objApply;
                                    if (this.PlaybackStateCompat != 1) {
                                        int i = this.serializer + 1;
                                        if (i == this.MediaDescriptionCompat) {
                                            this.serializer = 0;
                                            this.PlaybackStateCompatCustomAction.request(i);
                                        } else {
                                            this.serializer = i;
                                        }
                                    }
                                    if (synccustomerprofilefwf_client_release instanceof Callable) {
                                        try {
                                            objCall = ((Callable) synccustomerprofilefwf_client_release).call();
                                        } catch (Throwable th) {
                                            Exceptions.read(th);
                                            AtomicThrowable atomicThrowable3 = this.IconCompatParcelizer;
                                            atomicThrowable3.getClass();
                                            ExceptionHelper.read(atomicThrowable3, th);
                                            if (!this.MediaSessionCompatToken) {
                                                this.PlaybackStateCompatCustomAction.cancel();
                                                FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated3 = this.ParcelableVolumeInfo;
                                                AtomicThrowable atomicThrowable4 = this.IconCompatParcelizer;
                                                atomicThrowable4.getClass();
                                                fwFClientaddFeatureKeysfeaturesUpdated3.onError(ExceptionHelper.RemoteActionCompatParcelizer(atomicThrowable4));
                                                return;
                                            }
                                            objCall = null;
                                        }
                                        if (objCall == null) {
                                            continue;
                                        } else if (this.MediaMetadataCompat.ParcelableVolumeInfo) {
                                            this.ParcelableVolumeInfo.onNext(objCall);
                                        } else {
                                            this.read = true;
                                            this.MediaMetadataCompat.read(new SimpleScalarSubscription(objCall, this.MediaMetadataCompat));
                                        }
                                    } else {
                                        this.read = true;
                                        synccustomerprofilefwf_client_release.subscribe(this.MediaMetadataCompat);
                                    }
                                } catch (Throwable th2) {
                                    Exceptions.read(th2);
                                    this.PlaybackStateCompatCustomAction.cancel();
                                    AtomicThrowable atomicThrowable5 = this.IconCompatParcelizer;
                                    atomicThrowable5.getClass();
                                    ExceptionHelper.read(atomicThrowable5, th2);
                                    FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated4 = this.ParcelableVolumeInfo;
                                    AtomicThrowable atomicThrowable6 = this.IconCompatParcelizer;
                                    atomicThrowable6.getClass();
                                    fwFClientaddFeatureKeysfeaturesUpdated4.onError(ExceptionHelper.RemoteActionCompatParcelizer(atomicThrowable6));
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            Exceptions.read(th3);
                            this.PlaybackStateCompatCustomAction.cancel();
                            AtomicThrowable atomicThrowable7 = this.IconCompatParcelizer;
                            atomicThrowable7.getClass();
                            ExceptionHelper.read(atomicThrowable7, th3);
                            FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated5 = this.ParcelableVolumeInfo;
                            AtomicThrowable atomicThrowable8 = this.IconCompatParcelizer;
                            atomicThrowable8.getClass();
                            fwFClientaddFeatureKeysfeaturesUpdated5.onError(ExceptionHelper.RemoteActionCompatParcelizer(atomicThrowable8));
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class ConcatMapImmediate<T, R> extends BaseConcatMapSubscriber<T, R> {
        public final FwFClientaddFeatureKeysfeaturesUpdated1 MediaSessionCompatResultReceiverWrapper;
        public final AtomicInteger MediaSessionCompatToken;

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        public final void IconCompatParcelizer() {
            this.MediaSessionCompatResultReceiverWrapper.onSubscribe(this);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public final void RemoteActionCompatParcelizer(Throwable th) {
            AtomicThrowable atomicThrowable = this.IconCompatParcelizer;
            atomicThrowable.getClass();
            if (!ExceptionHelper.read(atomicThrowable, th)) {
                RxJavaPlugins.IconCompatParcelizer(th);
                return;
            }
            this.PlaybackStateCompatCustomAction.cancel();
            if (getAndIncrement() == 0) {
                atomicThrowable.getClass();
                this.MediaSessionCompatResultReceiverWrapper.onError(ExceptionHelper.RemoteActionCompatParcelizer(atomicThrowable));
            }
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.IconCompatParcelizer;
            atomicThrowable.getClass();
            if (!ExceptionHelper.read(atomicThrowable, th)) {
                RxJavaPlugins.IconCompatParcelizer(th);
                return;
            }
            this.MediaMetadataCompat.cancel();
            if (getAndIncrement() == 0) {
                atomicThrowable.getClass();
                this.MediaSessionCompatResultReceiverWrapper.onError(ExceptionHelper.RemoteActionCompatParcelizer(atomicThrowable));
            }
        }

        @Override // o.FwFClientclose11
        public final void request(long j) {
            this.MediaMetadataCompat.request(j);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        public final void write() {
            if (this.MediaSessionCompatToken.getAndIncrement() == 0) {
                while (!this.RemoteActionCompatParcelizer) {
                    if (!this.read) {
                        boolean z = this.write;
                        try {
                            Object objPoll = this.RatingCompat.poll();
                            boolean z2 = objPoll == null;
                            if (z && z2) {
                                this.MediaSessionCompatResultReceiverWrapper.onComplete();
                                return;
                            }
                            if (!z2) {
                                try {
                                    Object objApply = this.MediaSessionCompatQueueItem.apply(objPoll);
                                    ObjectHelper.write(objApply, "The mapper returned a null Publisher");
                                    syncCustomerProfilefwf_client_release synccustomerprofilefwf_client_release = (syncCustomerProfilefwf_client_release) objApply;
                                    if (this.PlaybackStateCompat != 1) {
                                        int i = this.serializer + 1;
                                        if (i == this.MediaDescriptionCompat) {
                                            this.serializer = 0;
                                            this.PlaybackStateCompatCustomAction.request(i);
                                        } else {
                                            this.serializer = i;
                                        }
                                    }
                                    if (synccustomerprofilefwf_client_release instanceof Callable) {
                                        try {
                                            Object objCall = ((Callable) synccustomerprofilefwf_client_release).call();
                                            if (objCall == null) {
                                                continue;
                                            } else if (!this.MediaMetadataCompat.ParcelableVolumeInfo) {
                                                this.read = true;
                                                this.MediaMetadataCompat.read(new SimpleScalarSubscription(objCall, this.MediaMetadataCompat));
                                            } else if (get() == 0 && compareAndSet(0, 1)) {
                                                this.MediaSessionCompatResultReceiverWrapper.onNext(objCall);
                                                if (!compareAndSet(1, 0)) {
                                                    FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1 = this.MediaSessionCompatResultReceiverWrapper;
                                                    AtomicThrowable atomicThrowable = this.IconCompatParcelizer;
                                                    atomicThrowable.getClass();
                                                    fwFClientaddFeatureKeysfeaturesUpdated1.onError(ExceptionHelper.RemoteActionCompatParcelizer(atomicThrowable));
                                                    return;
                                                }
                                            }
                                        } catch (Throwable th) {
                                            Exceptions.read(th);
                                            this.PlaybackStateCompatCustomAction.cancel();
                                            AtomicThrowable atomicThrowable2 = this.IconCompatParcelizer;
                                            atomicThrowable2.getClass();
                                            ExceptionHelper.read(atomicThrowable2, th);
                                            FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated2 = this.MediaSessionCompatResultReceiverWrapper;
                                            AtomicThrowable atomicThrowable3 = this.IconCompatParcelizer;
                                            atomicThrowable3.getClass();
                                            fwFClientaddFeatureKeysfeaturesUpdated2.onError(ExceptionHelper.RemoteActionCompatParcelizer(atomicThrowable3));
                                            return;
                                        }
                                    } else {
                                        this.read = true;
                                        synccustomerprofilefwf_client_release.subscribe(this.MediaMetadataCompat);
                                    }
                                } catch (Throwable th2) {
                                    Exceptions.read(th2);
                                    this.PlaybackStateCompatCustomAction.cancel();
                                    AtomicThrowable atomicThrowable4 = this.IconCompatParcelizer;
                                    atomicThrowable4.getClass();
                                    ExceptionHelper.read(atomicThrowable4, th2);
                                    FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated3 = this.MediaSessionCompatResultReceiverWrapper;
                                    AtomicThrowable atomicThrowable5 = this.IconCompatParcelizer;
                                    atomicThrowable5.getClass();
                                    fwFClientaddFeatureKeysfeaturesUpdated3.onError(ExceptionHelper.RemoteActionCompatParcelizer(atomicThrowable5));
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            Exceptions.read(th3);
                            this.PlaybackStateCompatCustomAction.cancel();
                            AtomicThrowable atomicThrowable6 = this.IconCompatParcelizer;
                            atomicThrowable6.getClass();
                            ExceptionHelper.read(atomicThrowable6, th3);
                            FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated4 = this.MediaSessionCompatResultReceiverWrapper;
                            AtomicThrowable atomicThrowable7 = this.IconCompatParcelizer;
                            atomicThrowable7.getClass();
                            fwFClientaddFeatureKeysfeaturesUpdated4.onError(ExceptionHelper.RemoteActionCompatParcelizer(atomicThrowable7));
                            return;
                        }
                    }
                    if (this.MediaSessionCompatToken.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        public ConcatMapImmediate(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1, Function function, int i) {
            super(function, i);
            this.MediaSessionCompatResultReceiverWrapper = fwFClientaddFeatureKeysfeaturesUpdated1;
            this.MediaSessionCompatToken = new AtomicInteger();
        }

        @Override // o.FwFClientclose11
        public final void cancel() {
            if (this.RemoteActionCompatParcelizer) {
                return;
            }
            this.RemoteActionCompatParcelizer = true;
            this.MediaMetadataCompat.cancel();
            this.PlaybackStateCompatCustomAction.cancel();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public final void IconCompatParcelizer(Object obj) {
            if (get() == 0 && compareAndSet(0, 1)) {
                FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1 = this.MediaSessionCompatResultReceiverWrapper;
                fwFClientaddFeatureKeysfeaturesUpdated1.onNext(obj);
                if (compareAndSet(1, 0)) {
                    return;
                }
                AtomicThrowable atomicThrowable = this.IconCompatParcelizer;
                atomicThrowable.getClass();
                fwFClientaddFeatureKeysfeaturesUpdated1.onError(ExceptionHelper.RemoteActionCompatParcelizer(atomicThrowable));
            }
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public interface ConcatMapSupport<T> {
        void IconCompatParcelizer(Object obj);

        void RemoteActionCompatParcelizer(Throwable th);
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class SimpleScalarSubscription<T> extends AtomicBoolean implements FwFClientclose11 {
        public final Object IconCompatParcelizer;
        public final FwFClientaddFeatureKeysfeaturesUpdated1 write;

        @Override // o.FwFClientclose11
        public final void cancel() {
        }

        public SimpleScalarSubscription(Object obj, FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
            this.IconCompatParcelizer = obj;
            this.write = fwFClientaddFeatureKeysfeaturesUpdated1;
        }

        @Override // o.FwFClientclose11
        public final void request(long j) {
            if (j <= 0 || !compareAndSet(false, true)) {
                return;
            }
            Object obj = this.IconCompatParcelizer;
            FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1 = this.write;
            fwFClientaddFeatureKeysfeaturesUpdated1.onNext(obj);
            fwFClientaddFeatureKeysfeaturesUpdated1.onComplete();
        }
    }

    public static <T, R> FwFClientaddFeatureKeysfeaturesUpdated1 subscribe(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1, Function<? super T, ? extends syncCustomerProfilefwf_client_release> function, int i, ErrorMode errorMode) {
        int i2 = AnonymousClass1.RemoteActionCompatParcelizer[errorMode.ordinal()];
        if (i2 != 1) {
            return i2 != 2 ? new ConcatMapImmediate(fwFClientaddFeatureKeysfeaturesUpdated1, function, i) : new ConcatMapDelayed(fwFClientaddFeatureKeysfeaturesUpdated1, function, i, true);
        }
        return new ConcatMapDelayed(fwFClientaddFeatureKeysfeaturesUpdated1, function, i, false);
    }

    @Override // io.reactivex.Flowable
    public final void IconCompatParcelizer(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        Flowable flowable = this.IconCompatParcelizer;
        InAppMessageStreamManager$$ExternalSyntheticLambda1 inAppMessageStreamManager$$ExternalSyntheticLambda1 = this.serializer;
        if (FlowableScalarXMap.RemoteActionCompatParcelizer(flowable, fwFClientaddFeatureKeysfeaturesUpdated1, inAppMessageStreamManager$$ExternalSyntheticLambda1)) {
            return;
        }
        flowable.subscribe(subscribe(fwFClientaddFeatureKeysfeaturesUpdated1, inAppMessageStreamManager$$ExternalSyntheticLambda1, this.read, this.RemoteActionCompatParcelizer));
    }

    /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.FlowableConcatMap$1, reason: invalid class name */
    public static abstract /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[ErrorMode.values().length];
            RemoteActionCompatParcelizer = iArr;
            try {
                iArr[ErrorMode.BOUNDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RemoteActionCompatParcelizer[ErrorMode.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public FlowableConcatMap(FlowableObserveOn flowableObserveOn, InAppMessageStreamManager$$ExternalSyntheticLambda1 inAppMessageStreamManager$$ExternalSyntheticLambda1, ErrorMode errorMode) {
        super(flowableObserveOn);
        this.serializer = inAppMessageStreamManager$$ExternalSyntheticLambda1;
        this.read = 2;
        this.RemoteActionCompatParcelizer = errorMode;
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class ConcatMapInner<R> extends SubscriptionArbiter implements FlowableSubscriber<R> {
        public final BaseConcatMapSubscriber IconCompatParcelizer;
        public long RemoteActionCompatParcelizer;

        public ConcatMapInner(BaseConcatMapSubscriber baseConcatMapSubscriber) {
            super(false);
            this.IconCompatParcelizer = baseConcatMapSubscriber;
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onNext(Object obj) {
            this.RemoteActionCompatParcelizer++;
            this.IconCompatParcelizer.IconCompatParcelizer(obj);
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onComplete() {
            long j = this.RemoteActionCompatParcelizer;
            if (j != 0) {
                this.RemoteActionCompatParcelizer = 0L;
                IconCompatParcelizer(j);
            }
            BaseConcatMapSubscriber baseConcatMapSubscriber = this.IconCompatParcelizer;
            baseConcatMapSubscriber.read = false;
            baseConcatMapSubscriber.write();
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onError(Throwable th) {
            long j = this.RemoteActionCompatParcelizer;
            if (j != 0) {
                this.RemoteActionCompatParcelizer = 0L;
                IconCompatParcelizer(j);
            }
            this.IconCompatParcelizer.RemoteActionCompatParcelizer(th);
        }
    }
}
