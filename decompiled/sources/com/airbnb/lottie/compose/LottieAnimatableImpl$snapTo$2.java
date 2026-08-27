package com.airbnb.lottie.compose;

import coil3.ExtrasKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.StrokeJoinCompanion;
import o.createFromParcel;
import o.getVonKries;
import o.onShowTranslationui;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class LottieAnimatableImpl$snapTo$2 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ boolean IconCompatParcelizer;
    public final /* synthetic */ StrokeJoinCompanion RemoteActionCompatParcelizer;
    public final /* synthetic */ float read;
    public final /* synthetic */ getVonKries write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieAnimatableImpl$snapTo$2(getVonKries getvonkries, StrokeJoinCompanion strokeJoinCompanion, float f, boolean z, ShortNewsContentCardView shortNewsContentCardView) {
        super(1, shortNewsContentCardView);
        this.write = getvonkries;
        this.RemoteActionCompatParcelizer = strokeJoinCompanion;
        this.read = f;
        this.IconCompatParcelizer = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        return new LottieAnimatableImpl$snapTo$2(this.write, this.RemoteActionCompatParcelizer, this.read, this.IconCompatParcelizer, shortNewsContentCardView);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        LottieAnimatableImpl$snapTo$2 lottieAnimatableImpl$snapTo$2 = (LottieAnimatableImpl$snapTo$2) create((ShortNewsContentCardView) obj);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        lottieAnimatableImpl$snapTo$2.invokeSuspend(createfromparcel);
        return createfromparcel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        getVonKries getvonkries = this.write;
        ((onShowTranslationui) getvonkries.write).setValue(this.RemoteActionCompatParcelizer);
        getvonkries.serializer(this.read);
        getvonkries.IconCompatParcelizer(1);
        getVonKries.serializer(getvonkries, false);
        if (this.IconCompatParcelizer) {
            ((onShowTranslationui) getvonkries.MediaBrowserCompatMediaItem).setValue(Long.MIN_VALUE);
        }
        return createFromParcel.INSTANCE;
    }
}
