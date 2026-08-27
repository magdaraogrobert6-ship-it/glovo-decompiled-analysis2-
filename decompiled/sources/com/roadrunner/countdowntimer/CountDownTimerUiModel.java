package com.roadrunner.countdowntimer;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import o.RectListDebugger;
import o.RectListDebuggerModifierNodeonAttach1;
import o.distanceScore;
import o.getEverythingButLastChildOffset;
import o.getToken;

/* JADX INFO: loaded from: classes3.dex */
public final class CountDownTimerUiModel {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final RectListDebugger read;
    public final RectListDebuggerModifierNodeonAttach1 write;

    public CountDownTimerUiModel(RectListDebuggerModifierNodeonAttach1 rectListDebuggerModifierNodeonAttach1, RectListDebugger rectListDebugger) {
        rectListDebuggerModifierNodeonAttach1.getClass();
        rectListDebugger.getClass();
        this.write = rectListDebuggerModifierNodeonAttach1;
        this.read = rectListDebugger;
    }

    public final void write(long j) {
        int i = 2 % 2;
        RectListDebuggerModifierNodeonAttach1 rectListDebuggerModifierNodeonAttach1 = this.write;
        ContextScope contextScope = rectListDebuggerModifierNodeonAttach1.RemoteActionCompatParcelizer;
        JobKt.serializer(contextScope.serializer);
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new CountDownTimer$start$1(j, rectListDebuggerModifierNodeonAttach1, null), 3);
        int i2 = serializer + 47;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 90 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object getRemainingCountTimeDuration(ContinuationImpl continuationImpl) {
        getToken gettoken;
        int i = 2 % 2;
        if (continuationImpl instanceof getToken) {
            gettoken = (getToken) continuationImpl;
            int i2 = gettoken.RemoteActionCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gettoken.RemoteActionCompatParcelizer = i2 - Integer.MIN_VALUE;
            } else {
                gettoken = new getToken(this, continuationImpl);
            }
        } else {
            gettoken = new getToken(this, continuationImpl);
        }
        Object objFirstOrNull = gettoken.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = gettoken.RemoteActionCompatParcelizer;
        Object obj = null;
        if (i3 != 0) {
            int i4 = serializer + 121;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i6 = serializer + 27;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
            StateFlow stateFlow = this.write.serializer;
            gettoken.RemoteActionCompatParcelizer = 1;
            objFirstOrNull = FlowKt.firstOrNull(stateFlow, gettoken);
            if (objFirstOrNull == coroutineSingletons) {
                int i8 = RemoteActionCompatParcelizer + 51;
                serializer = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    return coroutineSingletons;
                }
                obj.hashCode();
                throw null;
            }
        }
        distanceScore distancescore = (distanceScore) objFirstOrNull;
        if (distancescore != null) {
            return new Long(distancescore instanceof getEverythingButLastChildOffset ? ((getEverythingButLastChildOffset) distancescore).read : 0L);
        }
        return null;
    }
}
