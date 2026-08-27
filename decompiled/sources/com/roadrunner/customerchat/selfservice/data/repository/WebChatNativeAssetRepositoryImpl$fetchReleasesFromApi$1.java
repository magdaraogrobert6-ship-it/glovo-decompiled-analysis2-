package com.roadrunner.customerchat.selfservice.data.repository;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class WebChatNativeAssetRepositoryImpl$fetchReleasesFromApi$1 extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ WebChatNativeAssetRepositoryImpl IconCompatParcelizer;
    public /* synthetic */ Object read;
    public String serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebChatNativeAssetRepositoryImpl$fetchReleasesFromApi$1(WebChatNativeAssetRepositoryImpl webChatNativeAssetRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = webChatNativeAssetRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 95;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.write |= Integer.MIN_VALUE;
        Object objM4885fetchReleasesFromApieH_QyT8 = this.IconCompatParcelizer.m4885fetchReleasesFromApieH_QyT8(null, null, null, null, null, null, null, this);
        if (objM4885fetchReleasesFromApieH_QyT8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4885fetchReleasesFromApieH_QyT8);
        }
        int i4 = RemoteActionCompatParcelizer + 57;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objM4885fetchReleasesFromApieH_QyT8;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
