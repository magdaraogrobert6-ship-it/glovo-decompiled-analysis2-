package com.roadrunner.inappnotifications.domain;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class FetchAndSaveInAppMessageUseCase$invoke$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ FetchAndSaveInAppMessageUseCase serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchAndSaveInAppMessageUseCase$invoke$1(FetchAndSaveInAppMessageUseCase fetchAndSaveInAppMessageUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = fetchAndSaveInAppMessageUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 83;
        read = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            this.serializer.m4982invoke0E7RQCE$implementation(null, null, this);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            obj2.hashCode();
            throw null;
        }
        this.RemoteActionCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        Object objM4982invoke0E7RQCE$implementation = this.serializer.m4982invoke0E7RQCE$implementation(null, null, this);
        if (objM4982invoke0E7RQCE$implementation != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4982invoke0E7RQCE$implementation);
        }
        int i3 = IconCompatParcelizer + 13;
        read = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return objM4982invoke0E7RQCE$implementation;
        }
        obj2.hashCode();
        throw null;
    }
}
