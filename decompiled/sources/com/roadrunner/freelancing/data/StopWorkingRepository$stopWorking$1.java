package com.roadrunner.freelancing.data;

import androidx.compose.ui.graphics.Fields;
import com.google.re2j.Parser;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class StopWorkingRepository$stopWorking$1 extends ContinuationImpl {
    private static int serializer = 1;
    private static int write;
    public int IconCompatParcelizer;
    public final /* synthetic */ Parser.Pair RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopWorkingRepository$stopWorking$1(Parser.Pair pair, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = pair;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 39;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objM4502stopWorkingIoAF18A = this.RemoteActionCompatParcelizer.m4502stopWorkingIoAF18A(this);
        if (objM4502stopWorkingIoAF18A == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i4 = serializer + 3;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return objM4502stopWorkingIoAF18A;
            }
            throw null;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4502stopWorkingIoAF18A);
        int i5 = write + 89;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return onitemdismiss;
    }
}
