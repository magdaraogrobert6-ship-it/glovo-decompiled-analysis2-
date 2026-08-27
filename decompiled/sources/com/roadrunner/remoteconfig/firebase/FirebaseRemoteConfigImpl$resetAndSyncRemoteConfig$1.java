package com.roadrunner.remoteconfig.firebase;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseRemoteConfigImpl$resetAndSyncRemoteConfig$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ FirebaseRemoteConfigImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseRemoteConfigImpl$resetAndSyncRemoteConfig$1(FirebaseRemoteConfigImpl firebaseRemoteConfigImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = firebaseRemoteConfigImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 15;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objM5014resetAndSyncRemoteConfigIoAF18A = this.write.m5014resetAndSyncRemoteConfigIoAF18A(this);
        if (objM5014resetAndSyncRemoteConfigIoAF18A != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM5014resetAndSyncRemoteConfigIoAF18A);
        }
        int i4 = serializer + 95;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objM5014resetAndSyncRemoteConfigIoAF18A;
    }
}
