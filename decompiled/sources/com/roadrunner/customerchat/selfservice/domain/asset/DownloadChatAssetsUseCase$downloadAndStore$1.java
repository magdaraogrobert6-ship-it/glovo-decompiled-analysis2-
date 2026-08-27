package com.roadrunner.customerchat.selfservice.domain.asset;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.getDefaultIndentationXSAIIZE;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class DownloadChatAssetsUseCase$downloadAndStore$1 extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RatingCompat;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ DownloadChatAssetsUseCase RemoteActionCompatParcelizer;
    public String read;
    public getDefaultIndentationXSAIIZE serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadChatAssetsUseCase$downloadAndStore$1(DownloadChatAssetsUseCase downloadChatAssetsUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = downloadChatAssetsUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = RatingCompat + 43;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        Object objM4894access$downloadAndStore0E7RQCE = DownloadChatAssetsUseCase.m4894access$downloadAndStore0E7RQCE(this.RemoteActionCompatParcelizer, null, null, this);
        if (objM4894access$downloadAndStore0E7RQCE == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return objM4894access$downloadAndStore0E7RQCE;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4894access$downloadAndStore0E7RQCE);
        int i4 = RatingCompat + 67;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return onitemdismiss;
        }
        throw null;
    }
}
