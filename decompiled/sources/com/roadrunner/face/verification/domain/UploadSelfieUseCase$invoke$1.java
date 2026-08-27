package com.roadrunner.face.verification.domain;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.auth.data.SignInDataStore;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class UploadSelfieUseCase$invoke$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ SignInDataStore serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadSelfieUseCase$invoke$1(SignInDataStore signInDataStore, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = signInDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 113;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.write |= Integer.MIN_VALUE;
        Object objM4866invokeBWLJW6A = this.serializer.m4866invokeBWLJW6A(null, null, false, this);
        if (objM4866invokeBWLJW6A != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4866invokeBWLJW6A);
        }
        int i4 = RemoteActionCompatParcelizer + 123;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objM4866invokeBWLJW6A;
    }
}
