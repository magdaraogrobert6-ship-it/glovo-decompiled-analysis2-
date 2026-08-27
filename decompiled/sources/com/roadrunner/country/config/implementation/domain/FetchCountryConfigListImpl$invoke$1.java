package com.roadrunner.country.config.implementation.domain;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class FetchCountryConfigListImpl$invoke$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ FetchCountryConfigListImpl serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchCountryConfigListImpl$invoke$1(FetchCountryConfigListImpl fetchCountryConfigListImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = fetchCountryConfigListImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objM4880invokeIoAF18A = this.serializer.m4880invokeIoAF18A(this);
        if (objM4880invokeIoAF18A == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i2 = write + 3;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return objM4880invokeIoAF18A;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4880invokeIoAF18A);
        int i4 = IconCompatParcelizer + 125;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return onitemdismiss;
    }
}
