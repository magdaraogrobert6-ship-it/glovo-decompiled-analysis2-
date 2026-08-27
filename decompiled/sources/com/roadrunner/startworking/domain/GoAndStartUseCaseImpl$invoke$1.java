package com.roadrunner.startworking.domain;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class GoAndStartUseCaseImpl$invoke$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ GetAppStateImpl RemoteActionCompatParcelizer;
    public int serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoAndStartUseCaseImpl$invoke$1(GetAppStateImpl getAppStateImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = getAppStateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.write = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objM5010invokegIAlus = this.RemoteActionCompatParcelizer.m5010invokegIAlus(null, this);
        if (objM5010invokegIAlus == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i2 = IconCompatParcelizer + 35;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return objM5010invokegIAlus;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM5010invokegIAlus);
        int i4 = IconCompatParcelizer + 83;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return onitemdismiss;
    }
}
