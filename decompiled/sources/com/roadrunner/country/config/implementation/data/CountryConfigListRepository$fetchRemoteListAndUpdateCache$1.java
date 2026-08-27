package com.roadrunner.country.config.implementation.data;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class CountryConfigListRepository$fetchRemoteListAndUpdateCache$1 extends ContinuationImpl {
    private static int MediaDescriptionCompat = 0;
    private static int RatingCompat = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ CountryConfigListRepository MediaMetadataCompat;
    public Object RemoteActionCompatParcelizer;
    public int read;
    public Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountryConfigListRepository$fetchRemoteListAndUpdateCache$1(CountryConfigListRepository countryConfigListRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaMetadataCompat = countryConfigListRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        return new o.onItemDismiss(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        if (r4 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r4 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        r1 = com.roadrunner.country.config.implementation.data.CountryConfigListRepository$fetchRemoteListAndUpdateCache$1.MediaDescriptionCompat + 51;
        com.roadrunner.country.config.implementation.data.CountryConfigListRepository$fetchRemoteListAndUpdateCache$1.RatingCompat = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
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
            int r1 = com.roadrunner.country.config.implementation.data.CountryConfigListRepository$fetchRemoteListAndUpdateCache$1.MediaDescriptionCompat
            int r1 = r1 + 27
            int r2 = r1 % 128
            com.roadrunner.country.config.implementation.data.CountryConfigListRepository$fetchRemoteListAndUpdateCache$1.RatingCompat = r2
            int r1 = r1 % r0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != 0) goto L26
            r3.IconCompatParcelizer = r4
            int r4 = r3.read
            r4 = r4 | r2
            r3.read = r4
            com.roadrunner.country.config.implementation.data.CountryConfigListRepository r4 = r3.MediaMetadataCompat
            java.lang.Object r4 = r4.m4879fetchRemoteListAndUpdateCacheIoAF18A(r3)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r2 = 31
            int r2 = r2 / 0
            if (r4 != r1) goto L41
            goto L37
        L26:
            r3.IconCompatParcelizer = r4
            int r4 = r3.read
            r4 = r4 | r2
            r3.read = r4
            com.roadrunner.country.config.implementation.data.CountryConfigListRepository r4 = r3.MediaMetadataCompat
            java.lang.Object r4 = r4.m4879fetchRemoteListAndUpdateCacheIoAF18A(r3)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r4 != r1) goto L41
        L37:
            int r1 = com.roadrunner.country.config.implementation.data.CountryConfigListRepository$fetchRemoteListAndUpdateCache$1.MediaDescriptionCompat
            int r1 = r1 + 51
            int r2 = r1 % 128
            com.roadrunner.country.config.implementation.data.CountryConfigListRepository$fetchRemoteListAndUpdateCache$1.RatingCompat = r2
            int r1 = r1 % r0
            return r4
        L41:
            o.onItemDismiss r0 = new o.onItemDismiss
            r0.<init>(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.country.config.implementation.data.CountryConfigListRepository$fetchRemoteListAndUpdateCache$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
