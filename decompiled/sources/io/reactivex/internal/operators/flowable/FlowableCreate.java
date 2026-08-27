package io.reactivex.internal.operators.flowable;

import bo.app.m1$$ExternalSyntheticOutline0;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;
import o.FwFClientclose11;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowableCreate<T> extends Flowable<T> {
    public final FlowableOnSubscribe IconCompatParcelizer;
    public final BackpressureStrategy read;

    public static abstract class BaseEmitter<T> extends AtomicLong implements FlowableEmitter<T>, FwFClientclose11 {
        public final FwFClientaddFeatureKeysfeaturesUpdated1 read;
        public final SequentialDisposable serializer = new SequentialDisposable();

        public void IconCompatParcelizer() {
        }

        public void write() {
        }

        public boolean write(Throwable th) {
            return serializer(th);
        }

        @Override // o.FwFClientclose11
        public final void cancel() {
            SequentialDisposable sequentialDisposable = this.serializer;
            sequentialDisposable.getClass();
            DisposableHelper.dispose(sequentialDisposable);
            IconCompatParcelizer();
        }

        public final void read() {
            SequentialDisposable sequentialDisposable = this.serializer;
            if (sequentialDisposable.isDisposed()) {
                return;
            }
            try {
                this.read.onComplete();
            } finally {
                sequentialDisposable.getClass();
                DisposableHelper.dispose(sequentialDisposable);
            }
        }

        public BaseEmitter(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
            this.read = fwFClientaddFeatureKeysfeaturesUpdated1;
        }

        @Override // java.util.concurrent.atomic.AtomicLong
        public final String toString() {
            return m1$$ExternalSyntheticOutline0.m(getClass().getSimpleName(), "{", super.toString(), "}");
        }

        public final void IconCompatParcelizer(Throwable th) {
            if (write(th)) {
                return;
            }
            RxJavaPlugins.IconCompatParcelizer(th);
        }

        @Override // o.FwFClientclose11
        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.write(this, j);
                write();
            }
        }

        public final boolean serializer(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            SequentialDisposable sequentialDisposable = this.serializer;
            if (sequentialDisposable.isDisposed()) {
                return false;
            }
            try {
                this.read.onError(th);
                return true;
            } finally {
                sequentialDisposable.getClass();
                DisposableHelper.dispose(sequentialDisposable);
            }
        }
    }

    public static final class BufferAsyncEmitter<T> extends BaseEmitter<T> {
        public Throwable IconCompatParcelizer;
        public final AtomicInteger MediaDescriptionCompat;
        public final SpscLinkedArrayQueue RemoteActionCompatParcelizer;
        public volatile boolean write;

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        public final void write() {
            serializer();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        public final void IconCompatParcelizer() {
            if (this.MediaDescriptionCompat.getAndIncrement() == 0) {
                this.RemoteActionCompatParcelizer.clear();
            }
        }

        public final void serializer() {
            if (this.MediaDescriptionCompat.getAndIncrement() != 0) {
                return;
            }
            FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1 = this.read;
            SpscLinkedArrayQueue spscLinkedArrayQueue = this.RemoteActionCompatParcelizer;
            int iAddAndGet = 1;
            do {
                long j = get();
                long j2 = 0;
                while (j2 != j) {
                    if (this.serializer.isDisposed()) {
                        spscLinkedArrayQueue.clear();
                        return;
                    }
                    boolean z = this.write;
                    Object objPoll = spscLinkedArrayQueue.poll();
                    boolean z2 = objPoll == null;
                    if (z && z2) {
                        Throwable th = this.IconCompatParcelizer;
                        if (th != null) {
                            serializer(th);
                            return;
                        } else {
                            read();
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
                    if (this.serializer.isDisposed()) {
                        spscLinkedArrayQueue.clear();
                        return;
                    }
                    boolean z3 = this.write;
                    boolean zIsEmpty = spscLinkedArrayQueue.isEmpty();
                    if (z3 && zIsEmpty) {
                        Throwable th2 = this.IconCompatParcelizer;
                        if (th2 != null) {
                            serializer(th2);
                            return;
                        } else {
                            read();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    BackpressureHelper.serializer(this, j2);
                }
                iAddAndGet = this.MediaDescriptionCompat.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.Emitter
        public final void write(Object obj) {
            if (this.write || this.serializer.isDisposed()) {
                return;
            }
            if (obj == null) {
                IconCompatParcelizer(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.RemoteActionCompatParcelizer.offer(obj);
                serializer();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        public final boolean write(Throwable th) {
            if (this.write || this.serializer.isDisposed()) {
                return false;
            }
            this.IconCompatParcelizer = th;
            this.write = true;
            serializer();
            return true;
        }

        public BufferAsyncEmitter(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1, int i) {
            super(fwFClientaddFeatureKeysfeaturesUpdated1);
            this.RemoteActionCompatParcelizer = new SpscLinkedArrayQueue(i);
            this.MediaDescriptionCompat = new AtomicInteger();
        }
    }

    public static final class DropAsyncEmitter<T> extends NoOverflowBaseAsyncEmitter<T> {
        public DropAsyncEmitter(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
            super(fwFClientaddFeatureKeysfeaturesUpdated1);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.NoOverflowBaseAsyncEmitter
        public final void serializer() {
        }
    }

    public static final class LatestAsyncEmitter<T> extends BaseEmitter<T> {
        public volatile boolean IconCompatParcelizer;
        public final AtomicInteger RatingCompat;
        public final AtomicReference RemoteActionCompatParcelizer;
        public Throwable write;

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        public final void write() {
            serializer();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        public final void IconCompatParcelizer() {
            if (this.RatingCompat.getAndIncrement() == 0) {
                this.RemoteActionCompatParcelizer.lazySet(null);
            }
        }

        public final void serializer() {
            if (this.RatingCompat.getAndIncrement() != 0) {
                return;
            }
            FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1 = this.read;
            AtomicReference atomicReference = this.RemoteActionCompatParcelizer;
            int iAddAndGet = 1;
            do {
                long j = get();
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        break;
                    }
                    if (this.serializer.isDisposed()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z = this.IconCompatParcelizer;
                    Object andSet = atomicReference.getAndSet(null);
                    boolean z2 = andSet == null;
                    if (z && z2) {
                        Throwable th = this.write;
                        if (th != null) {
                            serializer(th);
                            return;
                        } else {
                            read();
                            return;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    fwFClientaddFeatureKeysfeaturesUpdated1.onNext(andSet);
                    j2++;
                }
                if (j2 == j) {
                    if (this.serializer.isDisposed()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z3 = this.IconCompatParcelizer;
                    boolean z4 = atomicReference.get() == null;
                    if (z3 && z4) {
                        Throwable th2 = this.write;
                        if (th2 != null) {
                            serializer(th2);
                            return;
                        } else {
                            read();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    BackpressureHelper.serializer(this, j2);
                }
                iAddAndGet = this.RatingCompat.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.Emitter
        public final void write(Object obj) {
            if (this.IconCompatParcelizer || this.serializer.isDisposed()) {
                return;
            }
            if (obj == null) {
                IconCompatParcelizer(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.RemoteActionCompatParcelizer.set(obj);
                serializer();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        public final boolean write(Throwable th) {
            if (this.IconCompatParcelizer || this.serializer.isDisposed()) {
                return false;
            }
            this.write = th;
            this.IconCompatParcelizer = true;
            serializer();
            return true;
        }

        public LatestAsyncEmitter(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
            super(fwFClientaddFeatureKeysfeaturesUpdated1);
            this.RemoteActionCompatParcelizer = new AtomicReference();
            this.RatingCompat = new AtomicInteger();
        }
    }

    public static final class MissingEmitter<T> extends BaseEmitter<T> {
        public MissingEmitter(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
            super(fwFClientaddFeatureKeysfeaturesUpdated1);
        }

        @Override // io.reactivex.Emitter
        public final void write(Object obj) {
            long j;
            if (this.serializer.isDisposed()) {
                return;
            }
            if (obj == null) {
                IconCompatParcelizer(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            this.read.onNext(obj);
            do {
                j = get();
                if (j == 0) {
                    return;
                }
            } while (!compareAndSet(j, j - 1));
        }
    }

    public static abstract class NoOverflowBaseAsyncEmitter<T> extends BaseEmitter<T> {
        public abstract void serializer();

        @Override // io.reactivex.Emitter
        public final void write(Object obj) {
            if (this.serializer.isDisposed()) {
                return;
            }
            if (obj == null) {
                IconCompatParcelizer(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else if (get() == 0) {
                serializer();
            } else {
                this.read.onNext(obj);
                BackpressureHelper.serializer(this, 1L);
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void IconCompatParcelizer(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        BaseEmitter missingEmitter;
        int i = AnonymousClass1.IconCompatParcelizer[this.read.ordinal()];
        if (i == 1) {
            missingEmitter = new MissingEmitter(fwFClientaddFeatureKeysfeaturesUpdated1);
        } else if (i == 2) {
            missingEmitter = new ErrorAsyncEmitter(fwFClientaddFeatureKeysfeaturesUpdated1);
        } else if (i != 3) {
            missingEmitter = i != 4 ? new BufferAsyncEmitter(fwFClientaddFeatureKeysfeaturesUpdated1, Flowable.write) : new LatestAsyncEmitter(fwFClientaddFeatureKeysfeaturesUpdated1);
        } else {
            missingEmitter = new DropAsyncEmitter(fwFClientaddFeatureKeysfeaturesUpdated1);
        }
        fwFClientaddFeatureKeysfeaturesUpdated1.onSubscribe(missingEmitter);
        try {
            this.IconCompatParcelizer.subscribe(missingEmitter);
        } catch (Throwable th) {
            Exceptions.read(th);
            missingEmitter.IconCompatParcelizer(th);
        }
    }

    /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.FlowableCreate$1, reason: invalid class name */
    public static abstract /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[BackpressureStrategy.values().length];
            IconCompatParcelizer = iArr;
            try {
                iArr[BackpressureStrategy.MISSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IconCompatParcelizer[BackpressureStrategy.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                IconCompatParcelizer[BackpressureStrategy.DROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                IconCompatParcelizer[BackpressureStrategy.LATEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class ErrorAsyncEmitter<T> extends NoOverflowBaseAsyncEmitter<T> {
        public static int IconCompatParcelizer;
        public static int RemoteActionCompatParcelizer;

        public ErrorAsyncEmitter(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
            super(fwFClientaddFeatureKeysfeaturesUpdated1);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.NoOverflowBaseAsyncEmitter
        public final void serializer() {
            IconCompatParcelizer(new MissingBackpressureException("create: could not emit value due to lack of requests", 0));
        }

        public static int MediaMetadataCompat() {
            int i = RemoteActionCompatParcelizer;
            int i2 = i % 8726012;
            RemoteActionCompatParcelizer = i + 1;
            if (i2 != 0) {
                return IconCompatParcelizer;
            }
            int i3 = (int) Runtime.getRuntime().totalMemory();
            IconCompatParcelizer = i3;
            return i3;
        }
    }

    public FlowableCreate(FlowableOnSubscribe flowableOnSubscribe, BackpressureStrategy backpressureStrategy) {
        this.IconCompatParcelizer = flowableOnSubscribe;
        this.read = backpressureStrategy;
    }
}
