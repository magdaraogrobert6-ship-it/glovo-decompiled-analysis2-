package com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.data;

import androidx.compose.ui.graphics.Fields;
import com.google.android.gms.internal.mlkit_vision_face.zzng;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class UseCaseUtilsKt$executeIfValid$1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public int IconCompatParcelizer;
    public /* synthetic */ Object write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.write = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objExecuteIfValid = zzng.executeIfValid(null, null, null, this);
        if (objExecuteIfValid != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objExecuteIfValid);
        }
        int i2 = serializer;
        int i3 = i2 + 119;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 26 / 0;
        }
        int i5 = i2 + 123;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return objExecuteIfValid;
    }

    public UseCaseUtilsKt$executeIfValid$1(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
