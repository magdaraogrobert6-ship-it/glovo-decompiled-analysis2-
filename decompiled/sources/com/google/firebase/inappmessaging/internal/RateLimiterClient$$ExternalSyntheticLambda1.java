package com.google.firebase.inappmessaging.internal;

import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$$ExternalSyntheticLambda0;
import io.reactivex.Maybe;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.operators.completable.CompletableFromCallable;
import io.reactivex.internal.operators.maybe.MaybeEmpty;
import io.sentry.SentryEnvelopeItem$$ExternalSyntheticLambda3;
import o.r8lambdaqu7RmgdCB4kSCqXaBH9yH_wahpM;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RateLimiterClient$$ExternalSyntheticLambda1 implements Consumer, Function {
    public final /* synthetic */ int serializer;
    public final /* synthetic */ RateLimiterClient write;

    public /* synthetic */ RateLimiterClient$$ExternalSyntheticLambda1(RateLimiterClient rateLimiterClient, int i) {
        this.serializer = i;
        this.write = rateLimiterClient;
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
        int i = this.serializer;
        RateLimiterClient rateLimiterClient = this.write;
        if (i == 0) {
            rateLimiterClient.serializer = Maybe.RemoteActionCompatParcelizer((RateLimitProto$RateLimit) obj);
        } else {
            rateLimiterClient.serializer = MaybeEmpty.IconCompatParcelizer;
        }
    }

    @Override // io.reactivex.functions.Function
    public Object apply(Object obj) {
        RateLimitProto$RateLimit rateLimitProto$RateLimit = (RateLimitProto$RateLimit) obj;
        RateLimiterClient rateLimiterClient = this.write;
        r8lambdaqu7RmgdCB4kSCqXaBH9yH_wahpM r8lambdaqu7rmgdcb4kscqxabh9yh_wahpm = rateLimiterClient.RemoteActionCompatParcelizer;
        r8lambdaqu7rmgdcb4kscqxabh9yh_wahpm.getClass();
        return new CompletableFromCallable(new SentryEnvelopeItem$$ExternalSyntheticLambda3(r8lambdaqu7rmgdcb4kscqxabh9yh_wahpm, 3, rateLimitProto$RateLimit)).serializer(new CaptureRequestOptions$Builder$$ExternalSyntheticLambda0(rateLimiterClient, 29, rateLimitProto$RateLimit));
    }
}
