package com.roadrunner.inappnotifications.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.inappnotifications.data.InAppNotificationsRepository;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;
import o.processAdapterUpdatesAndSetAnimationFlags;

/* JADX INFO: loaded from: classes3.dex */
public final class FetchAndSaveInAppMessageUseCase {
    private static int read = 0;
    private static int serializer = 1;
    public final InAppNotificationsRepository IconCompatParcelizer;

    public FetchAndSaveInAppMessageUseCase(InAppNotificationsRepository inAppNotificationsRepository) {
        inAppNotificationsRepository.getClass();
        this.IconCompatParcelizer = inAppNotificationsRepository;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002d  */
    /* JADX INFO: renamed from: invoke-0E7RQCE$implementation, reason: not valid java name */
    public final Object m4982invoke0E7RQCE$implementation(String str, processAdapterUpdatesAndSetAnimationFlags processadapterupdatesandsetanimationflags, ContinuationImpl continuationImpl) {
        FetchAndSaveInAppMessageUseCase$invoke$1 fetchAndSaveInAppMessageUseCase$invoke$1;
        int i = 2 % 2;
        Object obj = null;
        if (!(continuationImpl instanceof FetchAndSaveInAppMessageUseCase$invoke$1)) {
            fetchAndSaveInAppMessageUseCase$invoke$1 = new FetchAndSaveInAppMessageUseCase$invoke$1(this, continuationImpl);
        } else {
            int i2 = serializer + 9;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = ((FetchAndSaveInAppMessageUseCase$invoke$1) continuationImpl).write;
                obj.hashCode();
                throw null;
            }
            fetchAndSaveInAppMessageUseCase$invoke$1 = (FetchAndSaveInAppMessageUseCase$invoke$1) continuationImpl;
            int i4 = fetchAndSaveInAppMessageUseCase$invoke$1.write;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                fetchAndSaveInAppMessageUseCase$invoke$1.write = i4 - Integer.MIN_VALUE;
                int i5 = serializer + 83;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else {
                fetchAndSaveInAppMessageUseCase$invoke$1 = new FetchAndSaveInAppMessageUseCase$invoke$1(this, continuationImpl);
            }
        }
        Object obj2 = fetchAndSaveInAppMessageUseCase$invoke$1.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = fetchAndSaveInAppMessageUseCase$invoke$1.write;
        if (i7 != 0) {
            int i8 = serializer + 25;
            read = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            if (i7 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                return ((onItemDismiss) obj2).IconCompatParcelizer;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj2);
        fetchAndSaveInAppMessageUseCase$invoke$1.write = 1;
        Object objM4981fetchAndSaveInAppMessage0E7RQCE = this.IconCompatParcelizer.m4981fetchAndSaveInAppMessage0E7RQCE(str, processadapterupdatesandsetanimationflags, fetchAndSaveInAppMessageUseCase$invoke$1);
        if (objM4981fetchAndSaveInAppMessage0E7RQCE != coroutineSingletons) {
            return objM4981fetchAndSaveInAppMessage0E7RQCE;
        }
        int i10 = read + 123;
        serializer = i10 % Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return coroutineSingletons;
    }
}
