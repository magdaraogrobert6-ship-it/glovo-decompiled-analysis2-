package com.roadrunner.rider.state.shiftextension.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.core.model.events.H$b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class ToggleShiftExtensionUseCase {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final H$b read;

    public ToggleShiftExtensionUseCase(H$b h$b) {
        this.read = h$b;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    public final Object m5033invokegIAlus(boolean z, ContinuationImpl continuationImpl) {
        ToggleShiftExtensionUseCase$invoke$1 toggleShiftExtensionUseCase$invoke$1;
        int i = 2 % 2;
        int i2 = write + 35;
        int i3 = i2 % Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        Object obj = null;
        if (continuationImpl instanceof ToggleShiftExtensionUseCase$invoke$1) {
            int i5 = i3 + 69;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = ((ToggleShiftExtensionUseCase$invoke$1) continuationImpl).write;
                obj.hashCode();
                throw null;
            }
            toggleShiftExtensionUseCase$invoke$1 = (ToggleShiftExtensionUseCase$invoke$1) continuationImpl;
            int i7 = toggleShiftExtensionUseCase$invoke$1.write;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                toggleShiftExtensionUseCase$invoke$1.write = i7 - Integer.MIN_VALUE;
            } else {
                toggleShiftExtensionUseCase$invoke$1 = new ToggleShiftExtensionUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            toggleShiftExtensionUseCase$invoke$1 = new ToggleShiftExtensionUseCase$invoke$1(this, continuationImpl);
        }
        Object obj2 = toggleShiftExtensionUseCase$invoke$1.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = toggleShiftExtensionUseCase$invoke$1.write;
        if (i8 != 0) {
            if (i8 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                return ((onItemDismiss) obj2).IconCompatParcelizer;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj2);
        toggleShiftExtensionUseCase$invoke$1.write = 1;
        Object objM5077toggleShiftExtensiongIAlus = this.read.m5077toggleShiftExtensiongIAlus(z, toggleShiftExtensionUseCase$invoke$1);
        if (objM5077toggleShiftExtensiongIAlus != coroutineSingletons) {
            return objM5077toggleShiftExtensiongIAlus;
        }
        int i9 = write + 113;
        IconCompatParcelizer = i9 % Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            return coroutineSingletons;
        }
        obj.hashCode();
        throw null;
    }
}
