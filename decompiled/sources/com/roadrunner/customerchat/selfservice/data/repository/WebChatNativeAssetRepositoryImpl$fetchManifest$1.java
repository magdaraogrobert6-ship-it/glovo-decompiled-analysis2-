package com.roadrunner.customerchat.selfservice.data.repository;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class WebChatNativeAssetRepositoryImpl$fetchManifest$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ WebChatNativeAssetRepositoryImpl serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebChatNativeAssetRepositoryImpl$fetchManifest$1(WebChatNativeAssetRepositoryImpl webChatNativeAssetRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = webChatNativeAssetRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.read = obj;
        this.write |= Integer.MIN_VALUE;
        Object objM4883fetchManifestyxL6bBk = this.serializer.m4883fetchManifestyxL6bBk(null, null, null, null, this);
        if (objM4883fetchManifestyxL6bBk == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i2 = IconCompatParcelizer + 53;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return objM4883fetchManifestyxL6bBk;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4883fetchManifestyxL6bBk);
        int i4 = RemoteActionCompatParcelizer + 81;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 17 / 0;
        }
        return onitemdismiss;
    }
}
