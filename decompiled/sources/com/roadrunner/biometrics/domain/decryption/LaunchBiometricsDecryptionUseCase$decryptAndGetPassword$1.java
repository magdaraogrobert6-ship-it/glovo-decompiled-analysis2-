package com.roadrunner.biometrics.domain.decryption;

import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.BlockRunner;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;
import o.setToggleableState;

/* JADX INFO: loaded from: classes3.dex */
public final class LaunchBiometricsDecryptionUseCase$decryptAndGetPassword$1 extends ContinuationImpl {
    private static int MediaDescriptionCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final /* synthetic */ BlockRunner IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public int read;
    public setToggleableState serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LaunchBiometricsDecryptionUseCase$decryptAndGetPassword$1(BlockRunner blockRunner, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = blockRunner;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 121;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.read |= Integer.MIN_VALUE;
        Object obj2 = null;
        Object objM3946decryptAndGetPasswordBWLJW6A = this.IconCompatParcelizer.m3946decryptAndGetPasswordBWLJW6A(null, 0, null, this);
        if (objM3946decryptAndGetPasswordBWLJW6A == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i4 = MediaDescriptionCompat + 27;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return objM3946decryptAndGetPasswordBWLJW6A;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM3946decryptAndGetPasswordBWLJW6A);
        int i6 = MediaDescriptionCompat + 17;
        MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return onitemdismiss;
        }
        obj2.hashCode();
        throw null;
    }
}
