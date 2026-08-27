package com.airbnb.lottie.compose;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.StrokeJoinCompanion;
import o.accessgetRgbcp;
import o.awaitScrollDependencies;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getVonKries;
import o.isAppSetIdReadingEnabled;
import o.onShowTranslationui;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;

/* JADX INFO: loaded from: classes.dex */
public final class AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ accessgetRgbcp IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public final /* synthetic */ boolean MediaDescriptionCompat;
    public final /* synthetic */ int MediaMetadataCompat;
    public final /* synthetic */ PopulateViewStructure_androidKtpopulate7 MediaSessionCompatQueueItem;
    public final /* synthetic */ boolean RatingCompat;
    public final /* synthetic */ float RemoteActionCompatParcelizer;
    public final /* synthetic */ StrokeJoinCompanion read;
    public final /* synthetic */ boolean serializer;
    public final /* synthetic */ getVonKries write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3(boolean z, boolean z2, getVonKries getvonkries, StrokeJoinCompanion strokeJoinCompanion, int i, boolean z3, float f, accessgetRgbcp accessgetrgbcp, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.serializer = z;
        this.MediaDescriptionCompat = z2;
        this.write = getvonkries;
        this.read = strokeJoinCompanion;
        this.MediaMetadataCompat = i;
        this.RatingCompat = z3;
        this.RemoteActionCompatParcelizer = f;
        this.IconCompatParcelizer = accessgetrgbcp;
        this.MediaSessionCompatQueueItem = populateViewStructure_androidKtpopulate7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        return new AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3(this.serializer, this.MediaDescriptionCompat, this.write, this.read, this.MediaMetadataCompat, this.RatingCompat, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.MediaSessionCompatQueueItem, shortNewsContentCardView);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.MediaBrowserCompatMediaItem;
        getVonKries getvonkries = this.write;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = this.MediaSessionCompatQueueItem;
        boolean z = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (z && !((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue() && this.MediaDescriptionCompat) {
                this.MediaBrowserCompatMediaItem = 1;
                StrokeJoinCompanion strokeJoinCompanion = (StrokeJoinCompanion) ((onShowTranslationui) getvonkries.write).getValue();
                if (((onShowTranslationui) getvonkries.IconCompatParcelizer).getValue() != null) {
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
                    return null;
                }
                float fFloatValue = ((Number) ((onShowTranslationui) getvonkries.MediaSessionCompatResultReceiverWrapper).getValue()).floatValue();
                float f = ((fFloatValue >= 0.0f || strokeJoinCompanion != null) && (strokeJoinCompanion == null || fFloatValue >= 0.0f)) ? 0.0f : 1.0f;
                Object objWrite = awaitScrollDependencies.write(getvonkries.MediaDescriptionCompat, new LottieAnimatableImpl$snapTo$2(getvonkries, (StrokeJoinCompanion) ((onShowTranslationui) getvonkries.write).getValue(), f, !(f == getvonkries.write()), null), this);
                if (objWrite != coroutineSingletons) {
                    objWrite = createfromparcel;
                }
                if (objWrite != coroutineSingletons) {
                    objWrite = createfromparcel;
                }
                if (objWrite != coroutineSingletons) {
                }
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        populateViewStructure_androidKtpopulate7.setValue(Boolean.valueOf(z));
        if (z) {
            float fWrite = getvonkries.write();
            this.MediaBrowserCompatMediaItem = 2;
            Object objWrite2 = awaitScrollDependencies.write(getvonkries.MediaDescriptionCompat, new LottieAnimatableImpl$animate$2(getvonkries, getvonkries.RemoteActionCompatParcelizer(), this.MediaMetadataCompat, this.RatingCompat, this.RemoteActionCompatParcelizer, this.read, fWrite, this.IconCompatParcelizer, null), this);
            if (objWrite2 != coroutineSingletons) {
                objWrite2 = createfromparcel;
            }
            if (objWrite2 == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return createfromparcel;
    }
}
