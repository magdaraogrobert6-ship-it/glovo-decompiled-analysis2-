package com.roadrunner.push.core.domain;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class UpdatePushToken$invoke$1 extends ContinuationImpl {
    private static int MediaDescriptionCompat = 1;
    private static int serializer;
    public final /* synthetic */ UpdatePushToken IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public String read;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatePushToken$invoke$1(UpdatePushToken updatePushToken, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = updatePushToken;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 95;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            this.write = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            this.IconCompatParcelizer.m5006invokegIAlus(null, this);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            obj2.hashCode();
            throw null;
        }
        this.write = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objM5006invokegIAlus = this.IconCompatParcelizer.m5006invokegIAlus(null, this);
        if (objM5006invokegIAlus == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return objM5006invokegIAlus;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM5006invokegIAlus);
        int i3 = serializer + 67;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return onitemdismiss;
        }
        throw null;
    }
}
