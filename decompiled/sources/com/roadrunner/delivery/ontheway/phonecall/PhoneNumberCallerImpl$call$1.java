package com.roadrunner.delivery.ontheway.phonecall;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.getSpanVerticalAligndo9XGg;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class PhoneNumberCallerImpl$call$1 extends ContinuationImpl {
    private static int MediaSessionCompatQueueItem = 1;
    private static int read;
    public int IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public getSpanVerticalAligndo9XGg serializer;
    public final /* synthetic */ PhoneNumberCallerImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneNumberCallerImpl$call$1(PhoneNumberCallerImpl phoneNumberCallerImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = phoneNumberCallerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 3;
        read = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            this.write.m4918callgIAlus(null, this);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            obj2.hashCode();
            throw null;
        }
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objM4918callgIAlus = this.write.m4918callgIAlus(null, this);
        if (objM4918callgIAlus == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return objM4918callgIAlus;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4918callgIAlus);
        int i3 = MediaSessionCompatQueueItem + 45;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return onitemdismiss;
    }
}
