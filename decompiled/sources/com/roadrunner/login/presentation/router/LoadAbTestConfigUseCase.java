package com.roadrunner.login.presentation.router;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.logger.info.AppEventInfoChangeHandler;
import com.roadrunner.remoteconfig.fwf.genii.Gen2FunWithFlagsConfigRepository;
import com.roadrunner.remoteconfig.fwf.genii.Gen2FunWithFlagsConfigRepository$loadConfig$2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.c3;
import o.createFromParcel;
import o.isOpenInternalroom_runtime;
import o.prepareForActivityTransitionCarryover;
import o.updateStatusI;

/* JADX INFO: loaded from: classes3.dex */
public final class LoadAbTestConfigUseCase {
    private static int serializer = 1;
    private static int write;
    public final AppEventInfoChangeHandler RemoteActionCompatParcelizer;
    public final updateStatusI read;

    public LoadAbTestConfigUseCase(updateStatusI updatestatusi, AppEventInfoChangeHandler appEventInfoChangeHandler) {
        updatestatusi.getClass();
        appEventInfoChangeHandler.getClass();
        this.read = updatestatusi;
        this.RemoteActionCompatParcelizer = appEventInfoChangeHandler;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0096 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x0097  */
    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    public final Object invoke(ContinuationImpl continuationImpl) {
        c3 c3Var;
        int i;
        int i2 = 2 % 2;
        if (continuationImpl instanceof c3) {
            int i3 = serializer + 89;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            c3Var = (c3) continuationImpl;
            int i5 = c3Var.IconCompatParcelizer;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                int i6 = serializer + 125;
                write = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                c3Var.IconCompatParcelizer = i5 - Integer.MIN_VALUE;
            } else {
                c3Var = new c3(this, continuationImpl);
            }
        } else {
            c3Var = new c3(this, continuationImpl);
        }
        Object obj = c3Var.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = c3Var.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i8 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            c3Var.IconCompatParcelizer = 1;
            if (this.RemoteActionCompatParcelizer.refreshUserInfo(c3Var) != coroutineSingletons) {
            }
            i = write + 39;
            serializer = i % Fields.SpotShadowColor;
            if (i % 2 != 0) {
                return coroutineSingletons;
            }
            shortNewsContentCardView.hashCode();
            throw null;
        }
        int i9 = write;
        int i10 = i9 + 33;
        serializer = i10 % Fields.SpotShadowColor;
        int i11 = i10 % 2;
        if (i8 != 1) {
            if (i8 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i12 = i9 + 17;
            serializer = i12 % Fields.SpotShadowColor;
            if (i12 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            throw null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        c3Var.IconCompatParcelizer = 2;
        Gen2FunWithFlagsConfigRepository gen2FunWithFlagsConfigRepository = (Gen2FunWithFlagsConfigRepository) this.read;
        isOpenInternalroom_runtime isopeninternalroom_runtime = gen2FunWithFlagsConfigRepository.RemoteActionCompatParcelizer;
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new Gen2FunWithFlagsConfigRepository$loadConfig$2(gen2FunWithFlagsConfigRepository, shortNewsContentCardView, 0), c3Var);
        if (objWithContext != coroutineSingletons) {
            objWithContext = createfromparcel;
        }
        if (objWithContext != coroutineSingletons) {
            return createfromparcel;
        }
        i = write + 39;
        serializer = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return coroutineSingletons;
        }
        shortNewsContentCardView.hashCode();
        throw null;
    }
}
