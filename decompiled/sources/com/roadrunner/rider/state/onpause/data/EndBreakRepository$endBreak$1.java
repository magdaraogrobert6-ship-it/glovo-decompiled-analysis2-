package com.roadrunner.rider.state.onpause.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes3.dex */
public final class EndBreakRepository$endBreak$1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ OkHttpCall$1 IconCompatParcelizer;
    public int read;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EndBreakRepository$endBreak$1(OkHttpCall$1 okHttpCall$1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = okHttpCall$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 91;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            this.serializer = obj;
            this.read |= Integer.MIN_VALUE;
            this.IconCompatParcelizer.m5199endBreakIoAF18A(this);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            obj2.hashCode();
            throw null;
        }
        this.serializer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objM5199endBreakIoAF18A = this.IconCompatParcelizer.m5199endBreakIoAF18A(this);
        if (objM5199endBreakIoAF18A != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM5199endBreakIoAF18A);
        }
        int i3 = write + 121;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return objM5199endBreakIoAF18A;
        }
        obj2.hashCode();
        throw null;
    }
}
