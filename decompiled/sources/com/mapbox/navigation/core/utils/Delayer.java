package com.mapbox.navigation.core.utils;

import android.os.SystemClock;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.base.route.RouteAlternativesOptions;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.DelayKt;
import o.createFromParcel;

/* JADX INFO: loaded from: classes2.dex */
public final class Delayer {
    public long delayRemaining;

    /* JADX INFO: renamed from: com.mapbox.navigation.core.utils.Delayer$delayInternal$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public long J$0;
        public long J$1;
        public Delayer L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Delayer.this.delayInternal(0L, this);
        }
    }

    public RouteAlternativesOptions build() {
        return new RouteAlternativesOptions(this.delayRemaining);
    }

    public void intervalMillis() {
        this.delayRemaining = 30000L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object delayInternal(long j, ContinuationImpl continuationImpl) throws Throwable {
        AnonymousClass1 anonymousClass1;
        long jElapsedRealtime;
        Delayer delayer;
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
        Object obj = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                anonymousClass1.L$0 = this;
                anonymousClass1.J$0 = j;
                anonymousClass1.J$1 = jElapsedRealtime;
                anonymousClass1.label = 1;
                if (DelayKt.delay(j, anonymousClass1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                delayer = this;
                delayer.getClass();
                delayer.delayRemaining = j - (SystemClock.elapsedRealtime() - jElapsedRealtime);
                return createFromParcel.INSTANCE;
            } catch (Throwable th) {
                th = th;
                delayer = this;
                delayer.getClass();
                delayer.delayRemaining = j - (SystemClock.elapsedRealtime() - jElapsedRealtime);
                throw th;
            }
        }
        if (i2 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j2 = anonymousClass1.J$1;
        long j3 = anonymousClass1.J$0;
        delayer = anonymousClass1.L$0;
        try {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            jElapsedRealtime = j2;
            j = j3;
            delayer.getClass();
            delayer.delayRemaining = j - (SystemClock.elapsedRealtime() - jElapsedRealtime);
            return createFromParcel.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            jElapsedRealtime = j2;
            j = j3;
            delayer.getClass();
            delayer.delayRemaining = j - (SystemClock.elapsedRealtime() - jElapsedRealtime);
            throw th;
        }
    }

    public Delayer() {
        this.delayRemaining = 300000L;
    }

    public Delayer(long j) {
        this.delayRemaining = j;
    }

    public Delayer(int i) {
    }
}
