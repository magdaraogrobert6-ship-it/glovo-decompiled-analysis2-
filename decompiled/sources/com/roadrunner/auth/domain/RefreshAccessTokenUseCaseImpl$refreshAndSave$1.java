package com.roadrunner.auth.domain;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.dismissdefault;
import o.getTraversalIndexdelegate;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class RefreshAccessTokenUseCaseImpl$refreshAndSave$1 extends ContinuationImpl {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public int IconCompatParcelizer;
    public getTraversalIndexdelegate RemoteActionCompatParcelizer;
    public final /* synthetic */ RefreshAccessTokenUseCaseImpl read;
    public dismissdefault serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefreshAccessTokenUseCaseImpl$refreshAndSave$1(RefreshAccessTokenUseCaseImpl refreshAccessTokenUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = refreshAccessTokenUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        this.write = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objM4869access$refreshAndSaveIoAF18A = RefreshAccessTokenUseCaseImpl.m4869access$refreshAndSaveIoAF18A(this.read, this);
        if (objM4869access$refreshAndSaveIoAF18A == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i2 = MediaMetadataCompat + 31;
            MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return objM4869access$refreshAndSaveIoAF18A;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4869access$refreshAndSaveIoAF18A);
        int i4 = MediaMetadataCompat + 11;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return onitemdismiss;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
