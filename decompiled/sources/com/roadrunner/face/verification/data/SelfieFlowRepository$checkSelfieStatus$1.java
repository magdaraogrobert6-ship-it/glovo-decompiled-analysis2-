package com.roadrunner.face.verification.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class SelfieFlowRepository$checkSelfieStatus$1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public int IconCompatParcelizer;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ SelfieFlowRepository write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfieFlowRepository$checkSelfieStatus$1(SelfieFlowRepository selfieFlowRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = selfieFlowRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.serializer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objM4958checkSelfieStatusIoAF18A = this.write.m4958checkSelfieStatusIoAF18A(this);
        if (objM4958checkSelfieStatusIoAF18A != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4958checkSelfieStatusIoAF18A);
        }
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 19;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 83;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return objM4958checkSelfieStatusIoAF18A;
    }
}
