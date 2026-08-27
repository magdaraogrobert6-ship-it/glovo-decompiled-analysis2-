package com.roadrunner.helpcenter.domain;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ensureAnimationInfo;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class GetHelpCenterUrlUseCase$invoke$1 extends ContinuationImpl {
    private static int serializer = 1;
    private static int write;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ SendTestPushUseCase RemoteActionCompatParcelizer;
    public int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetHelpCenterUrlUseCase$invoke$1(SendTestPushUseCase sendTestPushUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = sendTestPushUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 49;
        serializer = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            this.IconCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            this.RemoteActionCompatParcelizer.m4956invokegIAlus((ensureAnimationInfo) null, this);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            obj2.hashCode();
            throw null;
        }
        this.IconCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objM4956invokegIAlus = this.RemoteActionCompatParcelizer.m4956invokegIAlus((ensureAnimationInfo) null, this);
        if (objM4956invokegIAlus != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4956invokegIAlus);
        }
        int i3 = serializer + 17;
        write = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return objM4956invokegIAlus;
        }
        obj2.hashCode();
        throw null;
    }
}
