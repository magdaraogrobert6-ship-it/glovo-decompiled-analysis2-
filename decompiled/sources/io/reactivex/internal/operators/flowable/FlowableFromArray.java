package io.reactivex.internal.operators.flowable;

import bo.app.d$$ExternalSyntheticOutline0;
import io.reactivex.Flowable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowableFromArray<T> extends Flowable<T> {
    public final Object[] RemoteActionCompatParcelizer;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class ArrayConditionalSubscription<T> extends BaseArraySubscription<T> {
        public final ConditionalSubscriber write;

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        public final void read() {
            Object[] objArr = this.IconCompatParcelizer;
            int length = objArr.length;
            ConditionalSubscriber conditionalSubscriber = this.write;
            int i = this.read;
            while (true) {
                boolean z = this.serializer;
                if (i == length) {
                    if (z) {
                        return;
                    }
                    conditionalSubscriber.onComplete();
                    return;
                } else {
                    if (z) {
                        return;
                    }
                    Object obj = objArr[i];
                    if (obj == null) {
                        conditionalSubscriber.onError(new NullPointerException(d$$ExternalSyntheticOutline0.m(i, "The element at index ", " is null")));
                        return;
                    } else {
                        conditionalSubscriber.IconCompatParcelizer(obj);
                        i++;
                    }
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        public final void read(long j) {
            Object[] objArr = this.IconCompatParcelizer;
            int length = objArr.length;
            int i = this.read;
            ConditionalSubscriber conditionalSubscriber = this.write;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i == length) {
                        if (i == length) {
                            if (this.serializer) {
                                return;
                            }
                            conditionalSubscriber.onComplete();
                            return;
                        } else {
                            j = get();
                            if (j2 == j) {
                                break;
                            }
                        }
                    } else {
                        if (this.serializer) {
                            return;
                        }
                        Object obj = objArr[i];
                        if (obj == null) {
                            conditionalSubscriber.onError(new NullPointerException(d$$ExternalSyntheticOutline0.m(i, "The element at index ", " is null")));
                            return;
                        } else {
                            if (conditionalSubscriber.IconCompatParcelizer(obj)) {
                                j2++;
                            }
                            i++;
                        }
                    }
                }
                this.read = i;
                j = addAndGet(-j2);
            } while (j != 0);
        }

        public ArrayConditionalSubscription(ConditionalSubscriber conditionalSubscriber, Object[] objArr) {
            super(objArr);
            this.write = conditionalSubscriber;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class ArraySubscription<T> extends BaseArraySubscription<T> {
        public final FwFClientaddFeatureKeysfeaturesUpdated1 RemoteActionCompatParcelizer;

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        public final void read() {
            Object[] objArr = this.IconCompatParcelizer;
            int length = objArr.length;
            FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1 = this.RemoteActionCompatParcelizer;
            int i = this.read;
            while (true) {
                boolean z = this.serializer;
                if (i == length) {
                    if (z) {
                        return;
                    }
                    fwFClientaddFeatureKeysfeaturesUpdated1.onComplete();
                    return;
                } else {
                    if (z) {
                        return;
                    }
                    Object obj = objArr[i];
                    if (obj == null) {
                        fwFClientaddFeatureKeysfeaturesUpdated1.onError(new NullPointerException(d$$ExternalSyntheticOutline0.m(i, "The element at index ", " is null")));
                        return;
                    } else {
                        fwFClientaddFeatureKeysfeaturesUpdated1.onNext(obj);
                        i++;
                    }
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        public final void read(long j) {
            Object[] objArr = this.IconCompatParcelizer;
            int length = objArr.length;
            int i = this.read;
            FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1 = this.RemoteActionCompatParcelizer;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i == length) {
                        if (i == length) {
                            if (this.serializer) {
                                return;
                            }
                            fwFClientaddFeatureKeysfeaturesUpdated1.onComplete();
                            return;
                        } else {
                            j = get();
                            if (j2 == j) {
                                break;
                            }
                        }
                    } else {
                        if (this.serializer) {
                            return;
                        }
                        Object obj = objArr[i];
                        if (obj == null) {
                            fwFClientaddFeatureKeysfeaturesUpdated1.onError(new NullPointerException(d$$ExternalSyntheticOutline0.m(i, "The element at index ", " is null")));
                            return;
                        } else {
                            fwFClientaddFeatureKeysfeaturesUpdated1.onNext(obj);
                            j2++;
                            i++;
                        }
                    }
                }
                this.read = i;
                j = addAndGet(-j2);
            } while (j != 0);
        }

        public ArraySubscription(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1, Object[] objArr) {
            super(objArr);
            this.RemoteActionCompatParcelizer = fwFClientaddFeatureKeysfeaturesUpdated1;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static abstract class BaseArraySubscription<T> extends BasicQueueSubscription<T> {
        public final Object[] IconCompatParcelizer;
        public int read;
        public volatile boolean serializer;

        @Override // o.FwFClientclose11
        public final void cancel() {
            this.serializer = true;
        }

        public abstract void read();

        public abstract void read(long j);

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            return 1;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.read = this.IconCompatParcelizer.length;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.read == this.IconCompatParcelizer.length;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            int i = this.read;
            Object[] objArr = this.IconCompatParcelizer;
            if (i == objArr.length) {
                return null;
            }
            this.read = i + 1;
            Object obj = objArr[i];
            ObjectHelper.write(obj, "array element is null");
            return obj;
        }

        public BaseArraySubscription(Object[] objArr) {
            this.IconCompatParcelizer = objArr;
        }

        @Override // o.FwFClientclose11
        public final void request(long j) {
            if (SubscriptionHelper.validate(j) && BackpressureHelper.write(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    read();
                } else {
                    read(j);
                }
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void IconCompatParcelizer(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        boolean z = fwFClientaddFeatureKeysfeaturesUpdated1 instanceof ConditionalSubscriber;
        Object[] objArr = this.RemoteActionCompatParcelizer;
        if (z) {
            fwFClientaddFeatureKeysfeaturesUpdated1.onSubscribe(new ArrayConditionalSubscription((ConditionalSubscriber) fwFClientaddFeatureKeysfeaturesUpdated1, objArr));
        } else {
            fwFClientaddFeatureKeysfeaturesUpdated1.onSubscribe(new ArraySubscription(fwFClientaddFeatureKeysfeaturesUpdated1, objArr));
        }
    }

    public FlowableFromArray(Object[] objArr) {
        this.RemoteActionCompatParcelizer = objArr;
    }
}
