package com.roadrunner.liveness.data;

import androidx.compose.ui.graphics.Fields;
import com.huawei.agconnect.config.impl.m;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class LivenessRepository$uploadImage$1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public int IconCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ m write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivenessRepository$uploadImage$1(m mVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 97;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objM4505uploadImagebMdYcbs = this.write.m4505uploadImagebMdYcbs(null, null, null, false, null, null, this);
        if (objM4505uploadImagebMdYcbs == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return objM4505uploadImagebMdYcbs;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4505uploadImagebMdYcbs);
        int i4 = RemoteActionCompatParcelizer + 75;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return onitemdismiss;
    }
}
