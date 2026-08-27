package com.roadrunner.country.config.implementation.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class CountryConfigFallbackDataSource$getFallbackCountryConfigs$1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ CountryConfigFallbackDataSource read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountryConfigFallbackDataSource$getFallbackCountryConfigs$1(CountryConfigFallbackDataSource countryConfigFallbackDataSource, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = countryConfigFallbackDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.IconCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        Object objM4877getFallbackCountryConfigsIoAF18A = this.read.m4877getFallbackCountryConfigsIoAF18A(this);
        if (objM4877getFallbackCountryConfigsIoAF18A == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i2 = RemoteActionCompatParcelizer + 39;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return objM4877getFallbackCountryConfigsIoAF18A;
            }
            throw null;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4877getFallbackCountryConfigsIoAF18A);
        int i3 = serializer + 43;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return onitemdismiss;
    }
}
