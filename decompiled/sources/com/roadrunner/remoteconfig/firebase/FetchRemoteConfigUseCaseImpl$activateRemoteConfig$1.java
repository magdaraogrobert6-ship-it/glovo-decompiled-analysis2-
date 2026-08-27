package com.roadrunner.remoteconfig.firebase;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class FetchRemoteConfigUseCaseImpl$activateRemoteConfig$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public int read;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ FetchRemoteConfigUseCaseImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchRemoteConfigUseCaseImpl$activateRemoteConfig$1(FetchRemoteConfigUseCaseImpl fetchRemoteConfigUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = fetchRemoteConfigUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 103;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objM5011activateRemoteConfigIoAF18A = this.write.m5011activateRemoteConfigIoAF18A(this);
        if (objM5011activateRemoteConfigIoAF18A != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM5011activateRemoteConfigIoAF18A);
        }
        int i4 = RemoteActionCompatParcelizer + 29;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 68 / 0;
        }
        return objM5011activateRemoteConfigIoAF18A;
    }
}
