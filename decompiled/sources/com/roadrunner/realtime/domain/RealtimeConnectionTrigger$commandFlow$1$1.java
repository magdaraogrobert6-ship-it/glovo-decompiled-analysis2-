package com.roadrunner.realtime.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getFailureResponseData;
import o.getTextEntryKey;
import o.getTextSubstitution;
import o.lambdaverifyAndTrackPlayStorePurchase46;
import o.lambdaverifyPlayStorePurchase44;
import o.launchDeeplinkMain;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;

/* JADX INFO: loaded from: classes3.dex */
public final class RealtimeConnectionTrigger$commandFlow$1$1 extends SuspendLambda implements r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public /* synthetic */ getTextSubstitution RemoteActionCompatParcelizer;
    public final /* synthetic */ launchDeeplinkMain read;
    public /* synthetic */ getFailureResponseData write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealtimeConnectionTrigger$commandFlow$1$1(launchDeeplinkMain launchdeeplinkmain, ShortNewsContentCardView shortNewsContentCardView) {
        super(4, shortNewsContentCardView);
        this.read = launchdeeplinkmain;
    }

    @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = 2 % 2;
        RealtimeConnectionTrigger$commandFlow$1$1 realtimeConnectionTrigger$commandFlow$1$1 = new RealtimeConnectionTrigger$commandFlow$1$1(this.read, (ShortNewsContentCardView) obj4);
        realtimeConnectionTrigger$commandFlow$1$1.RemoteActionCompatParcelizer = (getTextSubstitution) obj;
        realtimeConnectionTrigger$commandFlow$1$1.write = (getFailureResponseData) obj2;
        Object objInvokeSuspend = realtimeConnectionTrigger$commandFlow$1$1.invokeSuspend(createFromParcel.INSTANCE);
        int i2 = serializer + 117;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 53;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getTextSubstitution gettextsubstitution = this.RemoteActionCompatParcelizer;
        getFailureResponseData getfailureresponsedata = this.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        if ((!(gettextsubstitution instanceof getTextEntryKey)) || !this.read.serializer.contains(getfailureresponsedata.RemoteActionCompatParcelizer)) {
            return lambdaverifyAndTrackPlayStorePurchase46.write;
        }
        lambdaverifyPlayStorePurchase44 lambdaverifyplaystorepurchase44 = new lambdaverifyPlayStorePurchase44(((getTextEntryKey) gettextsubstitution).read);
        int i4 = IconCompatParcelizer + 23;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return lambdaverifyplaystorepurchase44;
    }
}
