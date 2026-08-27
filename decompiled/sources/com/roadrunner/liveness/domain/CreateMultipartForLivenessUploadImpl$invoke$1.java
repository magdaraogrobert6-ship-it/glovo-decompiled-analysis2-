package com.roadrunner.liveness.domain;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class CreateMultipartForLivenessUploadImpl$invoke$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ CreateMultipartForLivenessUploadImpl serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateMultipartForLivenessUploadImpl$invoke$1(CreateMultipartForLivenessUploadImpl createMultipartForLivenessUploadImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = createMultipartForLivenessUploadImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 17;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.read |= Integer.MIN_VALUE;
        Object objM4984invokeIoAF18A = this.serializer.m4984invokeIoAF18A(this);
        if (objM4984invokeIoAF18A != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4984invokeIoAF18A);
        }
        int i4 = RemoteActionCompatParcelizer + 85;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objM4984invokeIoAF18A;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
