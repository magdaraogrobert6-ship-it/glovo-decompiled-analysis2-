package com.roadrunner.custom.password.data;

import androidx.compose.ui.graphics.Fields;
import com.huawei.location.Vw$Vw;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomPasswordRepository$createPassword$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ Vw$Vw serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomPasswordRepository$createPassword$1(Vw$Vw vw$Vw, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = vw$Vw;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 83;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objM4509createPasswordgIAlus = this.serializer.m4509createPasswordgIAlus(null, this);
        if (objM4509createPasswordgIAlus == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i4 = read + 119;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return objM4509createPasswordgIAlus;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4509createPasswordgIAlus);
        int i6 = read + 9;
        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return onitemdismiss;
    }
}
