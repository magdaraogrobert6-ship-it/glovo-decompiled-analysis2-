package com.roadrunner.home.nest.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class NestComponentRepositoryImpl$load$1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public int IconCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ NestComponentRepositoryImpl serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestComponentRepositoryImpl$load$1(NestComponentRepositoryImpl nestComponentRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = nestComponentRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 83;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objM4967loadIoAF18A = this.serializer.m4967loadIoAF18A(this);
        if (objM4967loadIoAF18A != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4967loadIoAF18A);
        }
        int i4 = RemoteActionCompatParcelizer;
        int i5 = i4 + 115;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        int i7 = i4 + 33;
        write = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return objM4967loadIoAF18A;
    }
}
