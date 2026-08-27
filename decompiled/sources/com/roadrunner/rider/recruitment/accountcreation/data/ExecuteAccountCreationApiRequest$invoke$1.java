package com.roadrunner.rider.recruitment.accountcreation.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class ExecuteAccountCreationApiRequest$invoke$1 extends ContinuationImpl {
    private static int read = 0;
    private static int write = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ ExecuteAccountCreationApiRequest serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExecuteAccountCreationApiRequest$invoke$1(ExecuteAccountCreationApiRequest executeAccountCreationApiRequest, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = executeAccountCreationApiRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object obj2 = null;
        Object objM5016invokegIAlus = this.serializer.m5016invokegIAlus(null, this);
        if (objM5016invokegIAlus != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM5016invokegIAlus);
        }
        int i2 = read;
        int i3 = i2 + 47;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 21;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return objM5016invokegIAlus;
        }
        obj2.hashCode();
        throw null;
    }
}
