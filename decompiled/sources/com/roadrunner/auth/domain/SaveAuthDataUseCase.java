package com.roadrunner.auth.domain;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.auth.data.AuthRepository;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.createFromParcel;
import o.getTraversalIndexdelegate;

/* JADX INFO: loaded from: classes3.dex */
public final class SaveAuthDataUseCase {
    private static int read = 1;
    private static int serializer;
    public final AuthRepository RemoteActionCompatParcelizer;

    public SaveAuthDataUseCase(AuthRepository authRepository) {
        authRepository.getClass();
        this.RemoteActionCompatParcelizer = authRepository;
    }

    public final Object invoke(getTraversalIndexdelegate gettraversalindexdelegate, ContinuationImpl continuationImpl) throws Throwable {
        int i = 2 % 2;
        int i2 = read + 109;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objStore = this.RemoteActionCompatParcelizer.serializer.store(gettraversalindexdelegate, continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (objStore != coroutineSingletons) {
            objStore = createfromparcel;
        }
        if (objStore == coroutineSingletons) {
            return objStore;
        }
        int i4 = serializer + 91;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 5 / 0;
        }
        return createfromparcel;
    }
}
