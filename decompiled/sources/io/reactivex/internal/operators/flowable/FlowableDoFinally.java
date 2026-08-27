package io.reactivex.internal.operators.flowable;

import com.roadrunner.logger.logger.perseus.PerseusInitializerImpl$$ExternalSyntheticLambda0;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;
import o.FwFClientclose11;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowableDoFinally<T> extends AbstractFlowableWithUpstream<T, T> {
    public final PerseusInitializerImpl$$ExternalSyntheticLambda0 RemoteActionCompatParcelizer;

    public static final class DoFinallyConditionalSubscriber<T> extends BasicIntQueueSubscription<T> implements ConditionalSubscriber<T> {
        public final ConditionalSubscriber IconCompatParcelizer;
        public FwFClientclose11 RemoteActionCompatParcelizer;
        public boolean read;
        public QueueSubscription serializer;
        public final Action write;

        public final void IconCompatParcelizer() {
            if (compareAndSet(0, 1)) {
                try {
                    this.write.run();
                } catch (Throwable th) {
                    Exceptions.read(th);
                    RxJavaPlugins.IconCompatParcelizer(th);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean IconCompatParcelizer(Object obj) {
            return this.IconCompatParcelizer.IconCompatParcelizer(obj);
        }

        @Override // o.FwFClientclose11
        public final void cancel() {
            this.RemoteActionCompatParcelizer.cancel();
            IconCompatParcelizer();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.serializer.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.serializer.isEmpty();
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onComplete() {
            this.IconCompatParcelizer.onComplete();
            IconCompatParcelizer();
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onError(Throwable th) {
            this.IconCompatParcelizer.onError(th);
            IconCompatParcelizer();
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onNext(Object obj) {
            this.IconCompatParcelizer.onNext(obj);
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onSubscribe(FwFClientclose11 fwFClientclose11) {
            if (SubscriptionHelper.validate(this.RemoteActionCompatParcelizer, fwFClientclose11)) {
                this.RemoteActionCompatParcelizer = fwFClientclose11;
                if (fwFClientclose11 instanceof QueueSubscription) {
                    this.serializer = (QueueSubscription) fwFClientclose11;
                }
                this.IconCompatParcelizer.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            Object objPoll = this.serializer.poll();
            if (objPoll == null && this.read) {
                IconCompatParcelizer();
            }
            return objPoll;
        }

        @Override // o.FwFClientclose11
        public final void request(long j) {
            this.RemoteActionCompatParcelizer.request(j);
        }

        public DoFinallyConditionalSubscriber(ConditionalSubscriber conditionalSubscriber, PerseusInitializerImpl$$ExternalSyntheticLambda0 perseusInitializerImpl$$ExternalSyntheticLambda0) {
            this.IconCompatParcelizer = conditionalSubscriber;
            this.write = perseusInitializerImpl$$ExternalSyntheticLambda0;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            QueueSubscription queueSubscription = this.serializer;
            if (queueSubscription == null || (i & 4) != 0) {
                return 0;
            }
            int iRequestFusion = queueSubscription.requestFusion(i);
            if (iRequestFusion != 0) {
                this.read = iRequestFusion == 1;
            }
            return iRequestFusion;
        }
    }

    public static final class DoFinallySubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T> {
        public final Action IconCompatParcelizer;
        public FwFClientclose11 RemoteActionCompatParcelizer;
        public final FwFClientaddFeatureKeysfeaturesUpdated1 read;
        public QueueSubscription serializer;
        public boolean write;

        public final void RemoteActionCompatParcelizer() {
            if (compareAndSet(0, 1)) {
                try {
                    this.IconCompatParcelizer.run();
                } catch (Throwable th) {
                    Exceptions.read(th);
                    RxJavaPlugins.IconCompatParcelizer(th);
                }
            }
        }

        @Override // o.FwFClientclose11
        public final void cancel() {
            this.RemoteActionCompatParcelizer.cancel();
            RemoteActionCompatParcelizer();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.serializer.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.serializer.isEmpty();
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onComplete() {
            this.read.onComplete();
            RemoteActionCompatParcelizer();
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onError(Throwable th) {
            this.read.onError(th);
            RemoteActionCompatParcelizer();
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onNext(Object obj) {
            this.read.onNext(obj);
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onSubscribe(FwFClientclose11 fwFClientclose11) {
            if (SubscriptionHelper.validate(this.RemoteActionCompatParcelizer, fwFClientclose11)) {
                this.RemoteActionCompatParcelizer = fwFClientclose11;
                if (fwFClientclose11 instanceof QueueSubscription) {
                    this.serializer = (QueueSubscription) fwFClientclose11;
                }
                this.read.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            Object objPoll = this.serializer.poll();
            if (objPoll == null && this.write) {
                RemoteActionCompatParcelizer();
            }
            return objPoll;
        }

        @Override // o.FwFClientclose11
        public final void request(long j) {
            this.RemoteActionCompatParcelizer.request(j);
        }

        public DoFinallySubscriber(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1, PerseusInitializerImpl$$ExternalSyntheticLambda0 perseusInitializerImpl$$ExternalSyntheticLambda0) {
            this.read = fwFClientaddFeatureKeysfeaturesUpdated1;
            this.IconCompatParcelizer = perseusInitializerImpl$$ExternalSyntheticLambda0;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            QueueSubscription queueSubscription = this.serializer;
            if (queueSubscription == null || (i & 4) != 0) {
                return 0;
            }
            int iRequestFusion = queueSubscription.requestFusion(i);
            if (iRequestFusion != 0) {
                this.write = iRequestFusion == 1;
            }
            return iRequestFusion;
        }
    }

    @Override // io.reactivex.Flowable
    public final void IconCompatParcelizer(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        boolean z = fwFClientaddFeatureKeysfeaturesUpdated1 instanceof ConditionalSubscriber;
        PerseusInitializerImpl$$ExternalSyntheticLambda0 perseusInitializerImpl$$ExternalSyntheticLambda0 = this.RemoteActionCompatParcelizer;
        Flowable flowable = this.IconCompatParcelizer;
        if (z) {
            flowable.subscribe((FlowableSubscriber) new DoFinallyConditionalSubscriber((ConditionalSubscriber) fwFClientaddFeatureKeysfeaturesUpdated1, perseusInitializerImpl$$ExternalSyntheticLambda0));
        } else {
            flowable.subscribe((FlowableSubscriber) new DoFinallySubscriber(fwFClientaddFeatureKeysfeaturesUpdated1, perseusInitializerImpl$$ExternalSyntheticLambda0));
        }
    }

    public FlowableDoFinally(Flowable flowable, PerseusInitializerImpl$$ExternalSyntheticLambda0 perseusInitializerImpl$$ExternalSyntheticLambda0) {
        super(flowable);
        this.RemoteActionCompatParcelizer = perseusInitializerImpl$$ExternalSyntheticLambda0;
    }
}
