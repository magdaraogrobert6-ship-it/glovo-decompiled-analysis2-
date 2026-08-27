package io.reactivex.internal.operators.flowable;

import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowableDoOnEach<T> extends AbstractFlowableWithUpstream<T, T> {
    public final Gson$$ExternalSyntheticBUOutline0 MediaBrowserCompatMediaItem;
    public final Action RemoteActionCompatParcelizer;
    public final Action read;
    public final Consumer serializer;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class DoOnEachConditionalSubscriber<T> extends BasicFuseableConditionalSubscriber<T, T> {
        public final Consumer IconCompatParcelizer;
        public final Action read;
        public final Consumer serializer;
        public final Action write;

        @Override // io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber, o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onError(Throwable th) {
            ConditionalSubscriber conditionalSubscriber = this.MediaMetadataCompat;
            if (this.RatingCompat) {
                RxJavaPlugins.IconCompatParcelizer(th);
                return;
            }
            this.RatingCompat = true;
            try {
                this.IconCompatParcelizer.accept(th);
                conditionalSubscriber.onError(th);
            } catch (Throwable th2) {
                Exceptions.read(th2);
                conditionalSubscriber.onError(new CompositeException(th, th2));
            }
            try {
                this.read.run();
            } catch (Throwable th3) {
                Exceptions.read(th3);
                RxJavaPlugins.IconCompatParcelizer(th3);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() throws Exception {
            Consumer consumer = this.IconCompatParcelizer;
            try {
                Object objPoll = this.MediaSessionCompatQueueItem.poll();
                Action action = this.read;
                if (objPoll == null) {
                    if (this.MediaDescriptionCompat == 1) {
                        this.write.run();
                        action.run();
                    }
                    return objPoll;
                }
                try {
                    this.serializer.accept(objPoll);
                    action.run();
                    return objPoll;
                } catch (Throwable th) {
                    try {
                        Exceptions.read(th);
                        try {
                            consumer.accept(th);
                            Throwable th2 = ExceptionHelper.serializer;
                            if (th instanceof Exception) {
                                throw th;
                            }
                            throw th;
                        } catch (Throwable th3) {
                            throw new CompositeException(th, th3);
                        }
                    } catch (Throwable th4) {
                        action.run();
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                Exceptions.read(th5);
                try {
                    consumer.accept(th5);
                    Throwable th6 = ExceptionHelper.serializer;
                    if (th5 instanceof Exception) {
                        throw th5;
                    }
                    throw th5;
                } catch (Throwable th7) {
                    throw new CompositeException(th5, th7);
                }
            }
        }

        public DoOnEachConditionalSubscriber(ConditionalSubscriber conditionalSubscriber, Gson$$ExternalSyntheticBUOutline0 gson$$ExternalSyntheticBUOutline0, Consumer consumer, Action action, Action action2) {
            super(conditionalSubscriber);
            this.serializer = gson$$ExternalSyntheticBUOutline0;
            this.IconCompatParcelizer = consumer;
            this.write = action;
            this.read = action2;
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber, o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onComplete() {
            if (this.RatingCompat) {
                return;
            }
            try {
                this.write.run();
                this.RatingCompat = true;
                this.MediaMetadataCompat.onComplete();
                try {
                    this.read.run();
                } catch (Throwable th) {
                    Exceptions.read(th);
                    RxJavaPlugins.IconCompatParcelizer(th);
                }
            } catch (Throwable th2) {
                read(th2);
            }
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onNext(Object obj) {
            if (this.RatingCompat) {
                return;
            }
            int i = this.MediaDescriptionCompat;
            ConditionalSubscriber conditionalSubscriber = this.MediaMetadataCompat;
            if (i != 0) {
                conditionalSubscriber.onNext(null);
                return;
            }
            try {
                this.serializer.accept(obj);
                conditionalSubscriber.onNext(obj);
            } catch (Throwable th) {
                read(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean IconCompatParcelizer(Object obj) {
            if (this.RatingCompat) {
                return false;
            }
            try {
                this.serializer.accept(obj);
                return this.MediaMetadataCompat.IconCompatParcelizer(obj);
            } catch (Throwable th) {
                read(th);
                return false;
            }
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class DoOnEachSubscriber<T> extends BasicFuseableSubscriber<T, T> {
        public final Consumer IconCompatParcelizer;
        public final Action RemoteActionCompatParcelizer;
        public final Action read;
        public final Consumer serializer;

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onError(Throwable th) {
            FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1 = this.MediaDescriptionCompat;
            if (this.write) {
                RxJavaPlugins.IconCompatParcelizer(th);
                return;
            }
            this.write = true;
            try {
                this.serializer.accept(th);
                fwFClientaddFeatureKeysfeaturesUpdated1.onError(th);
            } catch (Throwable th2) {
                Exceptions.read(th2);
                fwFClientaddFeatureKeysfeaturesUpdated1.onError(new CompositeException(th, th2));
            }
            try {
                this.RemoteActionCompatParcelizer.run();
            } catch (Throwable th3) {
                Exceptions.read(th3);
                RxJavaPlugins.IconCompatParcelizer(th3);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() throws Exception {
            Consumer consumer = this.serializer;
            try {
                Object objPoll = this.MediaBrowserCompatMediaItem.poll();
                Action action = this.RemoteActionCompatParcelizer;
                if (objPoll == null) {
                    if (this.MediaSessionCompatQueueItem == 1) {
                        this.read.run();
                        action.run();
                    }
                    return objPoll;
                }
                try {
                    this.IconCompatParcelizer.accept(objPoll);
                    action.run();
                    return objPoll;
                } catch (Throwable th) {
                    try {
                        Exceptions.read(th);
                        try {
                            consumer.accept(th);
                            Throwable th2 = ExceptionHelper.serializer;
                            if (th instanceof Exception) {
                                throw th;
                            }
                            throw th;
                        } catch (Throwable th3) {
                            throw new CompositeException(th, th3);
                        }
                    } catch (Throwable th4) {
                        action.run();
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                Exceptions.read(th5);
                try {
                    consumer.accept(th5);
                    Throwable th6 = ExceptionHelper.serializer;
                    if (th5 instanceof Exception) {
                        throw th5;
                    }
                    throw th5;
                } catch (Throwable th7) {
                    throw new CompositeException(th5, th7);
                }
            }
        }

        public DoOnEachSubscriber(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1, Gson$$ExternalSyntheticBUOutline0 gson$$ExternalSyntheticBUOutline0, Consumer consumer, Action action, Action action2) {
            super(fwFClientaddFeatureKeysfeaturesUpdated1);
            this.IconCompatParcelizer = gson$$ExternalSyntheticBUOutline0;
            this.serializer = consumer;
            this.read = action;
            this.RemoteActionCompatParcelizer = action2;
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onComplete() {
            if (this.write) {
                return;
            }
            try {
                this.read.run();
                this.write = true;
                this.MediaDescriptionCompat.onComplete();
                try {
                    this.RemoteActionCompatParcelizer.run();
                } catch (Throwable th) {
                    Exceptions.read(th);
                    RxJavaPlugins.IconCompatParcelizer(th);
                }
            } catch (Throwable th2) {
                Exceptions.read(th2);
                this.MediaMetadataCompat.cancel();
                onError(th2);
            }
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onNext(Object obj) {
            if (this.write) {
                return;
            }
            int i = this.MediaSessionCompatQueueItem;
            FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1 = this.MediaDescriptionCompat;
            if (i != 0) {
                fwFClientaddFeatureKeysfeaturesUpdated1.onNext(null);
                return;
            }
            try {
                this.IconCompatParcelizer.accept(obj);
                fwFClientaddFeatureKeysfeaturesUpdated1.onNext(obj);
            } catch (Throwable th) {
                Exceptions.read(th);
                this.MediaMetadataCompat.cancel();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void IconCompatParcelizer(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        boolean z = fwFClientaddFeatureKeysfeaturesUpdated1 instanceof ConditionalSubscriber;
        Action action = this.RemoteActionCompatParcelizer;
        Action action2 = this.read;
        Consumer consumer = this.serializer;
        Flowable flowable = this.IconCompatParcelizer;
        Gson$$ExternalSyntheticBUOutline0 gson$$ExternalSyntheticBUOutline0 = this.MediaBrowserCompatMediaItem;
        if (z) {
            flowable.subscribe((FlowableSubscriber) new DoOnEachConditionalSubscriber((ConditionalSubscriber) fwFClientaddFeatureKeysfeaturesUpdated1, gson$$ExternalSyntheticBUOutline0, consumer, action2, action));
        } else {
            flowable.subscribe((FlowableSubscriber) new DoOnEachSubscriber(fwFClientaddFeatureKeysfeaturesUpdated1, gson$$ExternalSyntheticBUOutline0, consumer, action2, action));
        }
    }

    public FlowableDoOnEach(Flowable flowable, Gson$$ExternalSyntheticBUOutline0 gson$$ExternalSyntheticBUOutline0) {
        super(flowable);
        this.MediaBrowserCompatMediaItem = gson$$ExternalSyntheticBUOutline0;
        this.serializer = Functions.serializer;
        Action action = Functions.read;
        this.read = action;
        this.RemoteActionCompatParcelizer = action;
    }
}
