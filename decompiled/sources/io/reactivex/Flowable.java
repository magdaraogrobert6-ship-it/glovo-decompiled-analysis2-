package io.reactivex;

import androidx.compose.ui.graphics.Fields;
import com.uber.rxdogtag.RxDogTag$$ExternalSyntheticLambda0;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ScalarCallable;
import io.reactivex.internal.operators.flowable.FlowableEmpty;
import io.reactivex.internal.operators.flowable.FlowableFlatMap;
import io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe;
import io.reactivex.internal.operators.flowable.FlowableInternalHelper$RequestMax;
import io.reactivex.internal.operators.flowable.FlowableObserveOn;
import io.reactivex.internal.operators.flowable.FlowableScalarXMap;
import io.reactivex.internal.subscribers.LambdaSubscriber;
import io.reactivex.internal.subscribers.StrictSubscriber;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;
import o.FwFClientclose11;
import o.syncCustomerProfilefwf_client_release;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Flowable<T> implements syncCustomerProfilefwf_client_release {
    public static final int write = Math.max(1, Integer.getInteger("rx2.buffer-size", Fields.SpotShadowColor).intValue());

    public abstract void IconCompatParcelizer(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1);

    public final FlowableFlatMapMaybe read(Function function) {
        ObjectHelper.write(function, "mapper is null");
        ObjectHelper.serializer(Integer.MAX_VALUE, "maxConcurrency");
        return new FlowableFlatMapMaybe(this, function);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Flowable write(Function function, int i, int i2) throws Exception {
        ObjectHelper.serializer(i, "maxConcurrency");
        ObjectHelper.serializer(i2, "bufferSize");
        if (!(this instanceof ScalarCallable)) {
            return new FlowableFlatMap(this, function, i, i2);
        }
        T tCall = ((ScalarCallable) this).call();
        return tCall == null ? FlowableEmpty.read : FlowableScalarXMap.serializer(tCall, function);
    }

    public final void subscribe(FlowableSubscriber<? super T> flowableSubscriber) {
        ObjectHelper.write(flowableSubscriber, "s is null");
        try {
            RxDogTag$$ExternalSyntheticLambda0 rxDogTag$$ExternalSyntheticLambda0 = RxJavaPlugins.IconCompatParcelizer;
            if (rxDogTag$$ExternalSyntheticLambda0 != null) {
                try {
                    flowableSubscriber = (FlowableSubscriber<? super T>) ((FwFClientaddFeatureKeysfeaturesUpdated1) rxDogTag$$ExternalSyntheticLambda0.apply(this, flowableSubscriber));
                } catch (Throwable th) {
                    throw ExceptionHelper.write(th);
                }
            }
            ObjectHelper.write(flowableSubscriber, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            IconCompatParcelizer(flowableSubscriber);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            Exceptions.read(th2);
            RxJavaPlugins.IconCompatParcelizer(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final FlowableObserveOn write(Scheduler scheduler) {
        ObjectHelper.write(scheduler, "scheduler is null");
        int i = write;
        ObjectHelper.serializer(i, "bufferSize");
        return new FlowableObserveOn(this, scheduler, i);
    }

    public final Disposable subscribe(Consumer<? super T> consumer) {
        return subscribe(consumer, Functions.RemoteActionCompatParcelizer, Functions.read, FlowableInternalHelper$RequestMax.INSTANCE);
    }

    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        return subscribe(consumer, consumer2, Functions.read, FlowableInternalHelper$RequestMax.INSTANCE);
    }

    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action) {
        return subscribe(consumer, consumer2, action, FlowableInternalHelper$RequestMax.INSTANCE);
    }

    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Consumer<? super FwFClientclose11> consumer3) {
        ObjectHelper.write(consumer, "onNext is null");
        ObjectHelper.write(consumer2, "onError is null");
        ObjectHelper.write(action, "onComplete is null");
        ObjectHelper.write(consumer3, "onSubscribe is null");
        LambdaSubscriber lambdaSubscriber = new LambdaSubscriber(consumer, consumer2, action, consumer3);
        subscribe((FlowableSubscriber) lambdaSubscriber);
        return lambdaSubscriber;
    }

    @Override // o.syncCustomerProfilefwf_client_release
    public final void subscribe(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        if (fwFClientaddFeatureKeysfeaturesUpdated1 instanceof FlowableSubscriber) {
            subscribe((FlowableSubscriber) fwFClientaddFeatureKeysfeaturesUpdated1);
        } else {
            ObjectHelper.write(fwFClientaddFeatureKeysfeaturesUpdated1, "s is null");
            subscribe((FlowableSubscriber) new StrictSubscriber(fwFClientaddFeatureKeysfeaturesUpdated1));
        }
    }

    public final Disposable subscribe() {
        return subscribe(Functions.serializer, Functions.RemoteActionCompatParcelizer, Functions.read, FlowableInternalHelper$RequestMax.INSTANCE);
    }
}
