package com.roadrunner.startworking.data.stopworking;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes3.dex */
public final class AvailabilityRepository$stopWorking$1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public int IconCompatParcelizer;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ OkHttpCall$1 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvailabilityRepository$stopWorking$1(OkHttpCall$1 okHttpCall$1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = okHttpCall$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 85;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            this.serializer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            this.write.m5200stopWorkingIoAF18A(this);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            obj2.hashCode();
            throw null;
        }
        this.serializer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objM5200stopWorkingIoAF18A = this.write.m5200stopWorkingIoAF18A(this);
        if (objM5200stopWorkingIoAF18A != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM5200stopWorkingIoAF18A);
        }
        int i3 = read + 37;
        int i4 = i3 % Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 103;
        read = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return objM5200stopWorkingIoAF18A;
        }
        obj2.hashCode();
        throw null;
    }
}
