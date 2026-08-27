package com.roadrunner.country.config.implementation.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.country.config.implementation.data.CountryConfigListRepository;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class FetchCountryConfigListImpl {
    private static int read = 1;
    private static int write;
    public final CountryConfigListRepository RemoteActionCompatParcelizer;

    public FetchCountryConfigListImpl(CountryConfigListRepository countryConfigListRepository) {
        this.RemoteActionCompatParcelizer = countryConfigListRepository;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX INFO: renamed from: invoke-IoAF18A, reason: not valid java name */
    public final Object m4880invokeIoAF18A(ContinuationImpl continuationImpl) {
        FetchCountryConfigListImpl$invoke$1 fetchCountryConfigListImpl$invoke$1;
        int i = 2 % 2;
        int i2 = read + 29;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (!(continuationImpl instanceof FetchCountryConfigListImpl$invoke$1)) {
            fetchCountryConfigListImpl$invoke$1 = new FetchCountryConfigListImpl$invoke$1(this, continuationImpl);
        } else {
            fetchCountryConfigListImpl$invoke$1 = (FetchCountryConfigListImpl$invoke$1) continuationImpl;
            int i4 = fetchCountryConfigListImpl$invoke$1.read;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                fetchCountryConfigListImpl$invoke$1.read = i4 - Integer.MIN_VALUE;
            } else {
                fetchCountryConfigListImpl$invoke$1 = new FetchCountryConfigListImpl$invoke$1(this, continuationImpl);
            }
        }
        Object obj = fetchCountryConfigListImpl$invoke$1.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = fetchCountryConfigListImpl$invoke$1.read;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            fetchCountryConfigListImpl$invoke$1.read = 1;
            Object objM4878fetchCountryConfigListIoAF18A = this.RemoteActionCompatParcelizer.m4878fetchCountryConfigListIoAF18A(fetchCountryConfigListImpl$invoke$1);
            return objM4878fetchCountryConfigListIoAF18A == coroutineSingletons ? coroutineSingletons : objM4878fetchCountryConfigListIoAF18A;
        }
        Object obj2 = null;
        if (i5 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            int i6 = read + 63;
            write = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return null;
        }
        int i8 = write + 73;
        read = i8 % Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return ((onItemDismiss) obj).IconCompatParcelizer;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Object obj3 = ((onItemDismiss) obj).IconCompatParcelizer;
        obj2.hashCode();
        throw null;
    }
}
