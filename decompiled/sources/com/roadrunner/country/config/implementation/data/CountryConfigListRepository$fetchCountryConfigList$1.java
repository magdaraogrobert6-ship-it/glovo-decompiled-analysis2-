package com.roadrunner.country.config.implementation.data;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class CountryConfigListRepository$fetchCountryConfigList$1 extends ContinuationImpl {
    private static int read = 0;
    private static int write = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ CountryConfigListRepository RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountryConfigListRepository$fetchCountryConfigList$1(CountryConfigListRepository countryConfigListRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = countryConfigListRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        if ((r1 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        r2 = r2 + 13;
        com.roadrunner.country.config.implementation.data.CountryConfigListRepository$fetchCountryConfigList$1.read = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        return new o.onItemDismiss(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        if (r4 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r4 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        r1 = com.roadrunner.country.config.implementation.data.CountryConfigListRepository$fetchCountryConfigList$1.read + 55;
        r2 = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        com.roadrunner.country.config.implementation.data.CountryConfigListRepository$fetchCountryConfigList$1.write = r2;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.country.config.implementation.data.CountryConfigListRepository$fetchCountryConfigList$1.write
            int r1 = r1 + 83
            int r2 = r1 % 128
            com.roadrunner.country.config.implementation.data.CountryConfigListRepository$fetchCountryConfigList$1.read = r2
            int r1 = r1 % r0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L26
            r3.serializer = r4
            int r4 = r3.IconCompatParcelizer
            r4 = r4 | r2
            r3.IconCompatParcelizer = r4
            com.roadrunner.country.config.implementation.data.CountryConfigListRepository r4 = r3.RemoteActionCompatParcelizer
            java.lang.Object r4 = r4.m4878fetchCountryConfigListIoAF18A(r3)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r2 = 48
            int r2 = r2 / 0
            if (r4 != r1) goto L4c
            goto L37
        L26:
            r3.serializer = r4
            int r4 = r3.IconCompatParcelizer
            r4 = r4 | r2
            r3.IconCompatParcelizer = r4
            com.roadrunner.country.config.implementation.data.CountryConfigListRepository r4 = r3.RemoteActionCompatParcelizer
            java.lang.Object r4 = r4.m4878fetchCountryConfigListIoAF18A(r3)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r4 != r1) goto L4c
        L37:
            int r1 = com.roadrunner.country.config.implementation.data.CountryConfigListRepository$fetchCountryConfigList$1.read
            int r1 = r1 + 55
            int r2 = r1 % 128
            com.roadrunner.country.config.implementation.data.CountryConfigListRepository$fetchCountryConfigList$1.write = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L4a
            int r2 = r2 + 13
            int r1 = r2 % 128
            com.roadrunner.country.config.implementation.data.CountryConfigListRepository$fetchCountryConfigList$1.read = r1
            int r2 = r2 % r0
            return r4
        L4a:
            r4 = 0
            throw r4
        L4c:
            o.onItemDismiss r0 = new o.onItemDismiss
            r0.<init>(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.country.config.implementation.data.CountryConfigListRepository$fetchCountryConfigList$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
