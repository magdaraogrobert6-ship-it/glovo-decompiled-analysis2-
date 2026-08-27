package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.Iterator;
import java.util.List;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowableFromIterable<T> extends Flowable<T> {
    public final List RemoteActionCompatParcelizer;

    public static final class IteratorConditionalSubscription<T> extends BaseRangeSubscription<T> {
        public final ConditionalSubscriber read;

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        public final void RemoteActionCompatParcelizer() {
            Iterator it = this.IconCompatParcelizer;
            ConditionalSubscriber conditionalSubscriber = this.read;
            while (!this.RemoteActionCompatParcelizer) {
                try {
                    Object next = it.next();
                    if (this.RemoteActionCompatParcelizer) {
                        return;
                    }
                    if (next == null) {
                        conditionalSubscriber.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    conditionalSubscriber.IconCompatParcelizer(next);
                    if (this.RemoteActionCompatParcelizer) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.RemoteActionCompatParcelizer) {
                                return;
                            }
                            conditionalSubscriber.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        Exceptions.read(th);
                        conditionalSubscriber.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    Exceptions.read(th2);
                    conditionalSubscriber.onError(th2);
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        public final void serializer(long j) {
            Iterator it = this.IconCompatParcelizer;
            ConditionalSubscriber conditionalSubscriber = this.read;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        j = get();
                        if (j2 == j) {
                            break;
                        }
                    } else {
                        if (this.RemoteActionCompatParcelizer) {
                            return;
                        }
                        try {
                            Object next = it.next();
                            if (this.RemoteActionCompatParcelizer) {
                                return;
                            }
                            if (next == null) {
                                conditionalSubscriber.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            boolean zIconCompatParcelizer = conditionalSubscriber.IconCompatParcelizer(next);
                            if (this.RemoteActionCompatParcelizer) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.RemoteActionCompatParcelizer) {
                                        return;
                                    }
                                    conditionalSubscriber.onComplete();
                                    return;
                                } else if (zIconCompatParcelizer) {
                                    j2++;
                                }
                            } catch (Throwable th) {
                                Exceptions.read(th);
                                conditionalSubscriber.onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            Exceptions.read(th2);
                            conditionalSubscriber.onError(th2);
                            return;
                        }
                    }
                }
                j = addAndGet(-j2);
            } while (j != 0);
        }

        public IteratorConditionalSubscription(ConditionalSubscriber conditionalSubscriber, Iterator it) {
            super(it);
            this.read = conditionalSubscriber;
        }
    }

    public static final class IteratorSubscription<T> extends BaseRangeSubscription<T> {
        public final FwFClientaddFeatureKeysfeaturesUpdated1 read;

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        public final void RemoteActionCompatParcelizer() {
            Iterator it = this.IconCompatParcelizer;
            FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1 = this.read;
            while (!this.RemoteActionCompatParcelizer) {
                try {
                    Object next = it.next();
                    if (this.RemoteActionCompatParcelizer) {
                        return;
                    }
                    if (next == null) {
                        fwFClientaddFeatureKeysfeaturesUpdated1.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    fwFClientaddFeatureKeysfeaturesUpdated1.onNext(next);
                    if (this.RemoteActionCompatParcelizer) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.RemoteActionCompatParcelizer) {
                                return;
                            }
                            fwFClientaddFeatureKeysfeaturesUpdated1.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        Exceptions.read(th);
                        fwFClientaddFeatureKeysfeaturesUpdated1.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    Exceptions.read(th2);
                    fwFClientaddFeatureKeysfeaturesUpdated1.onError(th2);
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        public final void serializer(long j) {
            Iterator it = this.IconCompatParcelizer;
            FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1 = this.read;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        j = get();
                        if (j2 == j) {
                            break;
                        }
                    } else {
                        if (this.RemoteActionCompatParcelizer) {
                            return;
                        }
                        try {
                            Object next = it.next();
                            if (this.RemoteActionCompatParcelizer) {
                                return;
                            }
                            if (next == null) {
                                fwFClientaddFeatureKeysfeaturesUpdated1.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            fwFClientaddFeatureKeysfeaturesUpdated1.onNext(next);
                            if (this.RemoteActionCompatParcelizer) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.RemoteActionCompatParcelizer) {
                                        return;
                                    }
                                    fwFClientaddFeatureKeysfeaturesUpdated1.onComplete();
                                    return;
                                }
                                j2++;
                            } catch (Throwable th) {
                                Exceptions.read(th);
                                fwFClientaddFeatureKeysfeaturesUpdated1.onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            Exceptions.read(th2);
                            fwFClientaddFeatureKeysfeaturesUpdated1.onError(th2);
                            return;
                        }
                    }
                }
                j = addAndGet(-j2);
            } while (j != 0);
        }

        public IteratorSubscription(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1, Iterator it) {
            super(it);
            this.read = fwFClientaddFeatureKeysfeaturesUpdated1;
        }
    }

    public static abstract class BaseRangeSubscription<T> extends BasicQueueSubscription<T> {
        public Iterator IconCompatParcelizer;
        public volatile boolean RemoteActionCompatParcelizer;
        public boolean serializer;

        public abstract void RemoteActionCompatParcelizer();

        @Override // o.FwFClientclose11
        public final void cancel() {
            this.RemoteActionCompatParcelizer = true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.IconCompatParcelizer = null;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            return 1;
        }

        public abstract void serializer(long j);

        public BaseRangeSubscription(Iterator it) {
            this.IconCompatParcelizer = it;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            Iterator it = this.IconCompatParcelizer;
            return it == null || !it.hasNext();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            Iterator it = this.IconCompatParcelizer;
            if (it == null) {
                return null;
            }
            if (!this.serializer) {
                this.serializer = true;
            } else if (!it.hasNext()) {
                return null;
            }
            Object next = this.IconCompatParcelizer.next();
            ObjectHelper.write(next, "Iterator.next() returned a null value");
            return next;
        }

        @Override // o.FwFClientclose11
        public final void request(long j) {
            if (SubscriptionHelper.validate(j) && BackpressureHelper.write(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    RemoteActionCompatParcelizer();
                } else {
                    serializer(j);
                }
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void IconCompatParcelizer(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        try {
            subscribe(fwFClientaddFeatureKeysfeaturesUpdated1, this.RemoteActionCompatParcelizer.iterator());
        } catch (Throwable th) {
            Exceptions.read(th);
            EmptySubscription.error(th, fwFClientaddFeatureKeysfeaturesUpdated1);
        }
    }

    public FlowableFromIterable(List list) {
        this.RemoteActionCompatParcelizer = list;
    }

    public static <T> void subscribe(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1, Iterator<? extends T> it) {
        try {
            if (!it.hasNext()) {
                EmptySubscription.complete(fwFClientaddFeatureKeysfeaturesUpdated1);
            } else if (fwFClientaddFeatureKeysfeaturesUpdated1 instanceof ConditionalSubscriber) {
                fwFClientaddFeatureKeysfeaturesUpdated1.onSubscribe(new IteratorConditionalSubscription((ConditionalSubscriber) fwFClientaddFeatureKeysfeaturesUpdated1, it));
            } else {
                fwFClientaddFeatureKeysfeaturesUpdated1.onSubscribe(new IteratorSubscription(fwFClientaddFeatureKeysfeaturesUpdated1, it));
            }
        } catch (Throwable th) {
            Exceptions.read(th);
            EmptySubscription.error(th, fwFClientaddFeatureKeysfeaturesUpdated1);
        }
    }
}
