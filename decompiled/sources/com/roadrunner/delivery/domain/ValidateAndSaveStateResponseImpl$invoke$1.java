package com.roadrunner.delivery.domain;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class ValidateAndSaveStateResponseImpl$invoke$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ ValidateAndSaveStateResponseImpl serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidateAndSaveStateResponseImpl$invoke$1(ValidateAndSaveStateResponseImpl validateAndSaveStateResponseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = validateAndSaveStateResponseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 47;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        Object obj2 = null;
        Object objM4911invokegIAlus = this.serializer.m4911invokegIAlus(null, this);
        if (objM4911invokegIAlus == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i4 = IconCompatParcelizer + 79;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 69 / 0;
            }
            return objM4911invokegIAlus;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4911invokegIAlus);
        int i6 = write + 21;
        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return onitemdismiss;
        }
        obj2.hashCode();
        throw null;
    }
}
