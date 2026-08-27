package com.roadrunner.login.domain.forgotpassword.usecase;

import androidx.compose.ui.graphics.Fields;
import com.sentiance.core.model.events.N$b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class GenerateMagicLinkUseCase$invoke$1 extends ContinuationImpl {
    private static int MediaSessionCompatQueueItem = 1;
    private static int serializer;
    public boolean IconCompatParcelizer;
    public final /* synthetic */ N$b RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateMagicLinkUseCase$invoke$1(N$b n$b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = n$b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 105;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.write |= Integer.MIN_VALUE;
        Object objM5080invoke0E7RQCE = this.RemoteActionCompatParcelizer.m5080invoke0E7RQCE(null, false, this);
        if (objM5080invoke0E7RQCE != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM5080invoke0E7RQCE);
        }
        int i4 = serializer + 49;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objM5080invoke0E7RQCE;
        }
        throw null;
    }
}
