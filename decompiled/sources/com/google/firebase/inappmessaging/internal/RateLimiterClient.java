package com.google.firebase.inappmessaging.internal;

import io.reactivex.Maybe;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.maybe.MaybeEmpty;
import io.reactivex.internal.operators.maybe.MaybeFromCallable;
import io.reactivex.internal.operators.maybe.MaybePeek;
import io.reactivex.internal.operators.maybe.MaybeSwitchIfEmpty;
import io.sentry.SentryEnvelopeItem$$ExternalSyntheticLambda3;
import o.cacheIfAlive;
import o.component23;
import o.disposeComposition;
import o.r8lambdaqu7RmgdCB4kSCqXaBH9yH_wahpM;

/* JADX INFO: loaded from: classes2.dex */
public final class RateLimiterClient {
    public static final RateLimitProto$RateLimit write = RateLimitProto$RateLimit.getDefaultInstance();
    public final disposeComposition IconCompatParcelizer;
    public final r8lambdaqu7RmgdCB4kSCqXaBH9yH_wahpM RemoteActionCompatParcelizer;
    public Maybe serializer = MaybeEmpty.IconCompatParcelizer;

    public final MaybePeek RemoteActionCompatParcelizer() {
        Maybe maybe = this.serializer;
        component23 rVar = RateLimitProto$RateLimit.parser();
        r8lambdaqu7RmgdCB4kSCqXaBH9yH_wahpM r8lambdaqu7rmgdcb4kscqxabh9yh_wahpm = this.RemoteActionCompatParcelizer;
        r8lambdaqu7rmgdcb4kscqxabh9yh_wahpm.getClass();
        MaybeFromCallable maybeFromCallable = new MaybeFromCallable(new SentryEnvelopeItem$$ExternalSyntheticLambda3(r8lambdaqu7rmgdcb4kscqxabh9yh_wahpm, 2, rVar));
        RateLimiterClient$$ExternalSyntheticLambda1 rateLimiterClient$$ExternalSyntheticLambda1 = new RateLimiterClient$$ExternalSyntheticLambda1(this, 0);
        Consumer consumer = Functions.serializer;
        return new MaybePeek(new MaybeSwitchIfEmpty(maybe, new MaybePeek(maybeFromCallable, rateLimiterClient$$ExternalSyntheticLambda1, consumer)), consumer, new RateLimiterClient$$ExternalSyntheticLambda1(this, 1));
    }

    public RateLimiterClient(r8lambdaqu7RmgdCB4kSCqXaBH9yH_wahpM r8lambdaqu7rmgdcb4kscqxabh9yh_wahpm, disposeComposition disposecomposition) {
        this.RemoteActionCompatParcelizer = r8lambdaqu7rmgdcb4kscqxabh9yh_wahpm;
        this.IconCompatParcelizer = disposecomposition;
    }

    public final RateLimitProto$Counter serializer() {
        cacheIfAlive cacheifaliveNewBuilder = RateLimitProto$Counter.newBuilder();
        cacheifaliveNewBuilder.RemoteActionCompatParcelizer(0L);
        this.IconCompatParcelizer.getClass();
        cacheifaliveNewBuilder.IconCompatParcelizer(System.currentTimeMillis());
        return (RateLimitProto$Counter) cacheifaliveNewBuilder.serializer();
    }
}
