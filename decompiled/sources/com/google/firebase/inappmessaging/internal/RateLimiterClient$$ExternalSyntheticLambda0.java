package com.google.firebase.inappmessaging.internal;

import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$$ExternalSyntheticLambda0;
import com.huawei.location.gwi.config.CarGwiSoFileConstant;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.operators.observable.ObservableFilter;
import io.reactivex.internal.operators.observable.ObservableFlatMapCompletableCompletable;
import io.reactivex.internal.operators.observable.ObservableMap;
import io.reactivex.internal.operators.observable.ObservableSwitchIfEmpty;
import o.getHasComposition;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RateLimiterClient$$ExternalSyntheticLambda0 implements Function, Predicate {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ getHasComposition read;
    public final /* synthetic */ RateLimiterClient serializer;

    public /* synthetic */ RateLimiterClient$$ExternalSyntheticLambda0(RateLimiterClient rateLimiterClient, getHasComposition gethascomposition, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = rateLimiterClient;
        this.read = gethascomposition;
    }

    @Override // io.reactivex.functions.Function
    public Object apply(Object obj) {
        int i = this.RemoteActionCompatParcelizer;
        getHasComposition gethascomposition = this.read;
        RateLimiterClient rateLimiterClient = this.serializer;
        RateLimitProto$RateLimit rateLimitProto$RateLimit = (RateLimitProto$RateLimit) obj;
        rateLimiterClient.getClass();
        if (i != 0) {
            gethascomposition.getClass();
            return rateLimitProto$RateLimit.getLimitsOrDefault("APP_FOREGROUND_ONE_PER_DAY_LIMITER_KEY", rateLimiterClient.serializer());
        }
        gethascomposition.getClass();
        return new ObservableFlatMapCompletableCompletable(new ObservableMap(new ObservableSwitchIfEmpty(new ObservableFilter(Observable.read(rateLimitProto$RateLimit.getLimitsOrDefault("APP_FOREGROUND_ONE_PER_DAY_LIMITER_KEY", rateLimiterClient.serializer())), new RateLimiterClient$$ExternalSyntheticLambda0(rateLimiterClient, gethascomposition, 1)), Observable.read(rateLimiterClient.serializer())), new CaptureRequestOptions$Builder$$ExternalSyntheticLambda0(rateLimitProto$RateLimit, 28, gethascomposition)), new RateLimiterClient$$ExternalSyntheticLambda1(rateLimiterClient, 2));
    }

    @Override // io.reactivex.functions.Predicate
    public boolean read(Object obj) {
        int i = this.RemoteActionCompatParcelizer;
        getHasComposition gethascomposition = this.read;
        RateLimiterClient rateLimiterClient = this.serializer;
        RateLimitProto$Counter rateLimitProto$Counter = (RateLimitProto$Counter) obj;
        if (i != 1) {
            rateLimiterClient.IconCompatParcelizer.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long startTimeEpoch = rateLimitProto$Counter.getStartTimeEpoch();
            gethascomposition.getClass();
            return jCurrentTimeMillis - startTimeEpoch > CarGwiSoFileConstant.CAR_GWI_SPECIFY_INTERVAL || rateLimitProto$Counter.getValue() < 1;
        }
        rateLimiterClient.IconCompatParcelizer.getClass();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long startTimeEpoch2 = rateLimitProto$Counter.getStartTimeEpoch();
        gethascomposition.getClass();
        return !(jCurrentTimeMillis2 - startTimeEpoch2 > CarGwiSoFileConstant.CAR_GWI_SPECIFY_INTERVAL);
    }
}
