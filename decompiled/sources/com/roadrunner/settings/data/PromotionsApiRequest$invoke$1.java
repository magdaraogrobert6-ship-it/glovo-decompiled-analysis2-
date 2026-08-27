package com.roadrunner.settings.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;
import o.r8lambdaMPzwjNy3Ix7pjQnMRxA6_CdyVM;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final class PromotionsApiRequest$invoke$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public /* synthetic */ Object read;
    public int serializer;
    public final /* synthetic */ FormBody.Builder write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotionsApiRequest$invoke$1(FormBody.Builder builder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = builder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 79;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            this.read = obj;
            this.serializer |= Integer.MIN_VALUE;
            this.write.m5158invokegIAlus((r8lambdaMPzwjNy3Ix7pjQnMRxA6_CdyVM) null, this);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            obj2.hashCode();
            throw null;
        }
        this.read = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objM5158invokegIAlus = this.write.m5158invokegIAlus((r8lambdaMPzwjNy3Ix7pjQnMRxA6_CdyVM) null, this);
        if (objM5158invokegIAlus != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM5158invokegIAlus);
        }
        int i3 = RemoteActionCompatParcelizer + 93;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 39 / 0;
        }
        return objM5158invokegIAlus;
    }
}
