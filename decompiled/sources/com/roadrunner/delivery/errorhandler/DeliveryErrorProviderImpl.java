package com.roadrunner.delivery.errorhandler;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.createFromParcel;

/* JADX INFO: loaded from: classes3.dex */
public final class DeliveryErrorProviderImpl {
    private static int read = 1;
    private static int serializer;
    public final MutableStateFlow write = StateFlowKt.read(null);

    public final createFromParcel emitError(Throwable th, ContinuationImpl continuationImpl) {
        int i = 2 % 2;
        int i2 = read + 21;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write.emit(th, continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = serializer + 41;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel;
    }
}
