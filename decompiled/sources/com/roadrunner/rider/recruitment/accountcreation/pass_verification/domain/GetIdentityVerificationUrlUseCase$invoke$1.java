package com.roadrunner.rider.recruitment.accountcreation.pass_verification.domain;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class GetIdentityVerificationUrlUseCase$invoke$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ GetAppStateImpl RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetIdentityVerificationUrlUseCase$invoke$1(GetAppStateImpl getAppStateImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = getAppStateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 41;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.write |= Integer.MIN_VALUE;
        Object objM5009invokeIoAF18A$implementation = this.RemoteActionCompatParcelizer.m5009invokeIoAF18A$implementation(this);
        if (objM5009invokeIoAF18A$implementation != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM5009invokeIoAF18A$implementation);
        }
        int i4 = IconCompatParcelizer + 83;
        int i5 = i4 % Fields.SpotShadowColor;
        serializer = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 11;
        IconCompatParcelizer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            int i8 = 72 / 0;
        }
        return objM5009invokeIoAF18A$implementation;
    }
}
