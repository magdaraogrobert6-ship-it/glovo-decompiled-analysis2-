package com.roadrunner.phonenumber.data.api;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final class ProxyPhonePhoneNumberApiRequest$getPhoneNumber$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ FormBody.Builder RemoteActionCompatParcelizer;
    public int serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProxyPhonePhoneNumberApiRequest$getPhoneNumber$1(FormBody.Builder builder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = builder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 21;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objM5156getPhoneNumbergIAlus = this.RemoteActionCompatParcelizer.m5156getPhoneNumbergIAlus(0L, this);
        if (objM5156getPhoneNumbergIAlus == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return objM5156getPhoneNumbergIAlus;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM5156getPhoneNumbergIAlus);
        int i4 = read + 89;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return onitemdismiss;
    }
}
