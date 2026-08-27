package com.deliveryhero.selfServiceChat.data.chat.url;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.invokekLtJ_vA;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.rebuildOutline;

/* JADX INFO: loaded from: classes2.dex */
public final class HelpcenterChatUrlDataSourceImpl$fetchUrlFromInitEndpoint$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public int IconCompatParcelizer;
    public final /* synthetic */ invokekLtJ_vA RemoteActionCompatParcelizer;
    public rebuildOutline read;
    public final /* synthetic */ HelpcenterInitRequestBody write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelpcenterChatUrlDataSourceImpl$fetchUrlFromInitEndpoint$2(invokekLtJ_vA invokekltj_va, HelpcenterInitRequestBody helpcenterInitRequestBody, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = invokekltj_va;
        this.write = helpcenterInitRequestBody;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        return new HelpcenterChatUrlDataSourceImpl$fetchUrlFromInitEndpoint$2(this.RemoteActionCompatParcelizer, this.write, shortNewsContentCardView);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((HelpcenterChatUrlDataSourceImpl$fetchUrlFromInitEndpoint$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r8 == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws com.deliveryhero.selfServiceChat.domain.exceptions.GlobalEntityNotSetException, com.deliveryhero.selfServiceChat.domain.exceptions.EnvironmentNotSetException {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.IconCompatParcelizer
            o.invokekLtJ_vA r2 = r7.RemoteActionCompatParcelizer
            r3 = 0
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L1f
            if (r1 == r5) goto L19
            if (r1 != r4) goto L13
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            goto L6d
        L13:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r8)
            return r3
        L19:
            o.rebuildOutline r1 = r7.read
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            goto L43
        L1f:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            o.setOutlineAmbientShadowColor r8 = r2.IconCompatParcelizer
            o.ViewLayerVerificationHelper31 r8 = (o.ViewLayerVerificationHelper31) r8
            o.LayerSnapshotV21 r8 = r8.write()
            if (r8 == 0) goto L77
            o.LayerSnapshot_androidKt r8 = r8.write
            if (r8 == 0) goto L77
            o.rebuildOutline r1 = r8.dhEnvironment
            if (r1 == 0) goto L77
            o.isMoreThanHalf r8 = r2.RemoteActionCompatParcelizer
            r7.read = r1
            r7.IconCompatParcelizer = r5
            com.deliveryhero.selfServiceChat.data.HelpcenterRemoteDataSourceImpl r8 = (com.deliveryhero.selfServiceChat.data.HelpcenterRemoteDataSourceImpl) r8
            java.lang.Object r8 = r8.serializer(r7)
            if (r8 != r0) goto L43
            goto L6c
        L43:
            com.deliveryhero.selfServiceChat.data.config.HelpcenterEntityConfigEndpointResponse$GlobalEntityConfig r8 = (com.deliveryhero.selfServiceChat.data.config.HelpcenterEntityConfigEndpointResponse.GlobalEntityConfig) r8
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            com.deliveryhero.chatsdk.util.UrlBuilder r6 = com.deliveryhero.chatsdk.util.UrlBuilder.INSTANCE
            java.lang.String r8 = r8.IconCompatParcelizer
            java.lang.String r8 = r6.buildHelpCenterChatAPAIServiceUrl(r1, r8)
            r5.append(r8)
            java.lang.String r8 = "/conditions-api/v1/init"
            r5.append(r8)
            java.lang.String r8 = r5.toString()
            o.VectorGroup r1 = r2.serializer
            r7.read = r3
            r7.IconCompatParcelizer = r4
            com.deliveryhero.selfServiceChat.data.chat.url.HelpcenterInitRequestBody r2 = r7.write
            java.lang.Object r8 = r1.RemoteActionCompatParcelizer(r8, r2, r7)
            if (r8 != r0) goto L6d
        L6c:
            return r0
        L6d:
            com.deliveryhero.selfServiceChat.data.chat.url.HelpcenterInitResponse r8 = (com.deliveryhero.selfServiceChat.data.chat.url.HelpcenterInitResponse) r8
            if (r8 == 0) goto L74
            java.lang.String r8 = r8.url
            return r8
        L74:
            com.deliveryhero.selfServiceChat.domain.exceptions.HelpcenterInitServiceInvalidChatURLException r8 = com.deliveryhero.selfServiceChat.domain.exceptions.HelpcenterInitServiceInvalidChatURLException.IconCompatParcelizer
            throw r8
        L77:
            com.deliveryhero.selfServiceChat.domain.exceptions.EnvironmentNotSetException r8 = com.deliveryhero.selfServiceChat.domain.exceptions.EnvironmentNotSetException.RemoteActionCompatParcelizer
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.deliveryhero.selfServiceChat.data.chat.url.HelpcenterChatUrlDataSourceImpl$fetchUrlFromInitEndpoint$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
