package com.roadrunner.helpcenter.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.login.logging.RouterLogger;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.getAllowEnterTransitionOverlap;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class GetUnreadMessageCountUseCase {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final RouterLogger serializer;

    public GetUnreadMessageCountUseCase(RouterLogger routerLogger) {
        routerLogger.getClass();
        this.serializer = routerLogger;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    public final Object m4966invokegIAlus(getAllowEnterTransitionOverlap getallowentertransitionoverlap, ContinuationImpl continuationImpl) {
        GetUnreadMessageCountUseCase$invoke$1 getUnreadMessageCountUseCase$invoke$1;
        int i = 2 % 2;
        if (!(continuationImpl instanceof GetUnreadMessageCountUseCase$invoke$1)) {
            getUnreadMessageCountUseCase$invoke$1 = new GetUnreadMessageCountUseCase$invoke$1(this, continuationImpl);
        } else {
            getUnreadMessageCountUseCase$invoke$1 = (GetUnreadMessageCountUseCase$invoke$1) continuationImpl;
            int i2 = getUnreadMessageCountUseCase$invoke$1.IconCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getUnreadMessageCountUseCase$invoke$1.IconCompatParcelizer = i2 - Integer.MIN_VALUE;
            } else {
                getUnreadMessageCountUseCase$invoke$1 = new GetUnreadMessageCountUseCase$invoke$1(this, continuationImpl);
            }
        }
        Object obj = getUnreadMessageCountUseCase$invoke$1.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = getUnreadMessageCountUseCase$invoke$1.IconCompatParcelizer;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getUnreadMessageCountUseCase$invoke$1.IconCompatParcelizer = 1;
            Object objM4989getUnreadMessageCountgIAlus = this.serializer.m4989getUnreadMessageCountgIAlus(getallowentertransitionoverlap, getUnreadMessageCountUseCase$invoke$1);
            if (objM4989getUnreadMessageCountgIAlus != coroutineSingletons) {
                return objM4989getUnreadMessageCountgIAlus;
            }
            int i4 = IconCompatParcelizer + 35;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return coroutineSingletons;
        }
        Object obj2 = null;
        if (i3 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i6 = IconCompatParcelizer + 73;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return ((onItemDismiss) obj).IconCompatParcelizer;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Object obj3 = ((onItemDismiss) obj).IconCompatParcelizer;
        obj2.hashCode();
        throw null;
    }
}
