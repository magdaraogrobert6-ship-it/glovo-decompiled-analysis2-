package com.mapbox.navigation.core.internal.utils;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.logger.PerseusLogger$w$1;
import com.mapbox.navigation.core.routerefresh.RouteRefresherResult;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: loaded from: classes2.dex */
public final class CoroutineUtils {
    public static final CoroutineUtils INSTANCE = new CoroutineUtils();

    /* JADX INFO: renamed from: com.mapbox.navigation.core.internal.utils.CoroutineUtils$withTimeoutOrDefault$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CoroutineUtils.this.withTimeoutOrDefault(0L, null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object withTimeoutOrDefault(long j, RouteRefresherResult routeRefresherResult, PerseusLogger$w$1 perseusLogger$w$1, ContinuationImpl continuationImpl) {
        AnonymousClass1 anonymousClass1;
        Object obj;
        Object obj2;
        if (continuationImpl instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuationImpl;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuationImpl);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuationImpl);
        }
        Object objWithTimeoutOrNull = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objWithTimeoutOrNull);
            anonymousClass1.L$0 = routeRefresherResult;
            anonymousClass1.label = 1;
            objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(j, perseusLogger$w$1, anonymousClass1);
            if (objWithTimeoutOrNull == coroutineSingletons) {
                obj = routeRefresherResult;
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = anonymousClass1.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(objWithTimeoutOrNull);
        }
        if (objWithTimeoutOrNull == null) {
            obj = obj2;
            return obj;
        }
        obj = obj2;
        return objWithTimeoutOrNull;
    }
}
