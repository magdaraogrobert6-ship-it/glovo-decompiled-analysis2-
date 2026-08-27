package com.roadrunner.twofa.data.repo;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class TwoFaRepository$triggerFaCode$1 extends ContinuationImpl {
    private static int MediaSessionCompatQueueItem = 1;
    private static int serializer;
    public /* synthetic */ Object IconCompatParcelizer;
    public String RemoteActionCompatParcelizer;
    public final /* synthetic */ TwoFaRepository read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoFaRepository$triggerFaCode$1(TwoFaRepository twoFaRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = twoFaRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 29;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        Object objM5072triggerFaCode0E7RQCE$implementation = this.read.m5072triggerFaCode0E7RQCE$implementation(null, null, this);
        if (objM5072triggerFaCode0E7RQCE$implementation == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return objM5072triggerFaCode0E7RQCE$implementation;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM5072triggerFaCode0E7RQCE$implementation);
        int i4 = serializer + 83;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return onitemdismiss;
    }
}
