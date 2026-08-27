package com.roadrunner.twofa.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.SignInDataStore$get$1;
import com.roadrunner.nafath.data.NafathTimerDataStore;
import com.roadrunner.settings.SettingsViewModel$special$$inlined$map$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.inCompatibilityMode;
import o.prepareForActivityTransitionCarryover;
import o.requestGeofenceRefreshlambda0;
import o.requestImmediateDataFlushlambda1;

/* JADX INFO: loaded from: classes3.dex */
public final class GetRemainingTwoFaTimerIfRunning {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final NafathTimerDataStore write;

    public GetRemainingTwoFaTimerIfRunning(NafathTimerDataStore nafathTimerDataStore, int i) {
        nafathTimerDataStore.getClass();
        if (i != 1) {
            this.write = nafathTimerDataStore;
        } else {
            this.write = nafathTimerDataStore;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public Object invoke(ContinuationImpl continuationImpl) {
        requestImmediateDataFlushlambda1 requestimmediatedataflushlambda1;
        int i = 2 % 2;
        if (continuationImpl instanceof requestImmediateDataFlushlambda1) {
            requestimmediatedataflushlambda1 = (requestImmediateDataFlushlambda1) continuationImpl;
            int i2 = requestimmediatedataflushlambda1.RemoteActionCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requestimmediatedataflushlambda1.RemoteActionCompatParcelizer = i2 - Integer.MIN_VALUE;
            } else {
                requestimmediatedataflushlambda1 = new requestImmediateDataFlushlambda1(this, continuationImpl);
            }
        } else {
            requestimmediatedataflushlambda1 = new requestImmediateDataFlushlambda1(this, continuationImpl);
        }
        Object objFirstOrNull = requestimmediatedataflushlambda1.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = requestimmediatedataflushlambda1.RemoteActionCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i3 != 0) {
            int i4 = RemoteActionCompatParcelizer;
            int i5 = i4 + 47;
            serializer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0 ? i3 != 1 : i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i6 = serializer + 121;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return null;
            }
            int i8 = i4 + 49;
            serializer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
            NafathTimerDataStore nafathTimerDataStore = this.write;
            SettingsViewModel$special$$inlined$map$1 settingsViewModel$special$$inlined$map$1 = new SettingsViewModel$special$$inlined$map$1(new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(nafathTimerDataStore.serializer.serializer(), new SignInDataStore$get$1(3, 5, shortNewsContentCardView)), 20, nafathTimerDataStore);
            ((inCompatibilityMode) nafathTimerDataStore.read).getClass();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            Flow flowRemoteActionCompatParcelizer = FlowKt.RemoteActionCompatParcelizer(settingsViewModel$special$$inlined$map$1, DefaultIoScheduler.RemoteActionCompatParcelizer);
            requestimmediatedataflushlambda1.RemoteActionCompatParcelizer = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowRemoteActionCompatParcelizer, requestimmediatedataflushlambda1);
            if (objFirstOrNull == coroutineSingletons) {
                int i10 = serializer + 19;
                RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                return coroutineSingletons;
            }
        }
        requestGeofenceRefreshlambda0 requestgeofencerefreshlambda0 = (requestGeofenceRefreshlambda0) objFirstOrNull;
        if (requestgeofencerefreshlambda0 == null) {
            return new Long(0L);
        }
        long jCurrentTimeMillis = (requestgeofencerefreshlambda0.timerEndTimeInMillis - System.currentTimeMillis()) / 1000;
        return new Long(jCurrentTimeMillis >= 0 ? jCurrentTimeMillis : 0L);
    }
}
