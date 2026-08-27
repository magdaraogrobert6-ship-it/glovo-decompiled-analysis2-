package com.roadrunner.face.verification.data;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.face.verification.api.navigation.IdentityVerificationParams;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class SelfieFlowRepository$uploadSelfie$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int RatingCompat = 1;
    public int RemoteActionCompatParcelizer;
    public IdentityVerificationParams read;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ SelfieFlowRepository write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfieFlowRepository$uploadSelfie$1(SelfieFlowRepository selfieFlowRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = selfieFlowRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 95;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objM4959uploadSelfieBWLJW6A = this.write.m4959uploadSelfieBWLJW6A(null, null, false, this);
        if (objM4959uploadSelfieBWLJW6A == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i4 = IconCompatParcelizer + 63;
            RatingCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return objM4959uploadSelfieBWLJW6A;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4959uploadSelfieBWLJW6A);
        int i6 = RatingCompat + 105;
        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return onitemdismiss;
    }
}
