package com.roadrunner.login.domain.forgotpassword.usecase;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.SignInDataStore$get$1;
import com.roadrunner.home.nest.config.GetNestScope$invoke$$inlined$map$1;
import com.sentiance.core.model.events.N$b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.QueryResultAsyncValue;
import o.ShortNewsContentCardView;
import o.endStream;
import o.inCompatibilityMode;
import o.isOpenInternalroom_runtime;
import o.performCustomExitMxy_nc0;
import o.prepareForActivityTransitionCarryover;
import o.setSuccessfulruntime;

/* JADX INFO: loaded from: classes3.dex */
public final class GetRemainingForgotPasswordTimerIfRunning {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final N$b read;

    public GetRemainingForgotPasswordTimerIfRunning(N$b n$b, int i) {
        n$b.getClass();
        if (i != 1) {
            this.read = n$b;
        } else {
            this.read = n$b;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public Object invoke(endStream endstream, ContinuationImpl continuationImpl) {
        QueryResultAsyncValue queryResultAsyncValue;
        int i = 2 % 2;
        int i2 = write + 29;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof QueryResultAsyncValue) {
            queryResultAsyncValue = (QueryResultAsyncValue) continuationImpl;
            int i4 = queryResultAsyncValue.serializer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                queryResultAsyncValue.serializer = i4 - Integer.MIN_VALUE;
            } else {
                queryResultAsyncValue = new QueryResultAsyncValue(this, continuationImpl);
            }
        } else {
            queryResultAsyncValue = new QueryResultAsyncValue(this, continuationImpl);
        }
        Object objFirstOrNull = queryResultAsyncValue.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = queryResultAsyncValue.serializer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i5 != 0) {
            int i6 = write + 105;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
            N$b n$b = this.read;
            n$b.getClass();
            endstream.getClass();
            int i8 = 3;
            GetNestScope$invoke$$inlined$map$1 getNestScope$invoke$$inlined$map$1 = new GetNestScope$invoke$$inlined$map$1(new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(((performCustomExitMxy_nc0) n$b.read).serializer(), new SignInDataStore$get$1(i8, i8, shortNewsContentCardView)), endstream, n$b, 7);
            ((inCompatibilityMode) ((isOpenInternalroom_runtime) n$b.write)).getClass();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            Flow flowRemoteActionCompatParcelizer = FlowKt.RemoteActionCompatParcelizer(getNestScope$invoke$$inlined$map$1, DefaultIoScheduler.RemoteActionCompatParcelizer);
            queryResultAsyncValue.serializer = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowRemoteActionCompatParcelizer, queryResultAsyncValue);
            if (objFirstOrNull == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        setSuccessfulruntime setsuccessfulruntime = (setSuccessfulruntime) objFirstOrNull;
        if (setsuccessfulruntime == null) {
            return new Long(0L);
        }
        long jCurrentTimeMillis = (setsuccessfulruntime.timerEndTimeInMillis - System.currentTimeMillis()) / 1000;
        Long l = new Long(jCurrentTimeMillis >= 0 ? jCurrentTimeMillis : 0L);
        int i9 = write + 29;
        RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return l;
    }
}
