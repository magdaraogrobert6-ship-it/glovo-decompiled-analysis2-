package com.roadrunner.delivery.ontheway.turnbyturn.settings.domain.onboarding;

import androidx.compose.ui.graphics.Fields;
import androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1;
import coil3.ExtrasKt;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.sessions.SharedSessionRepositoryImpl;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.freelancing.domain.HasWorkNowOpportunityImpl$invoke$$inlined$map$1;
import com.roadrunner.heatmap.data.HeatmapDataStore$get$$inlined$map$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1;
import o.LineHeightStyle;
import o.createFromParcel;
import o.getNeedsDensityui_text;
import o.isAdapterPositionOnScreen;
import o.r8lambdaokZBgNnbR8K2i443J9b9JUwVwk;
import o.setTransactionSuccessful;

/* JADX INFO: loaded from: classes3.dex */
public final class ShowNavigationSettingsTooltipUseCaseImpl {
    private static int MediaDescriptionCompat = 1;
    private static int MediaMetadataCompat;
    public final InitializeAppStartupItemsImpl IconCompatParcelizer;
    public final isAdapterPositionOnScreen RatingCompat = new isAdapterPositionOnScreen(new ImageLoader$Builder$$ExternalSyntheticLambda1(18, this));
    public final setTransactionSuccessful RemoteActionCompatParcelizer;
    public final r8lambdaokZBgNnbR8K2i443J9b9JUwVwk read;
    public final getNeedsDensityui_text serializer;
    public final ShouldShowTooltip write;

    public ShowNavigationSettingsTooltipUseCaseImpl(ShouldShowTooltip shouldShowTooltip, getNeedsDensityui_text getneedsdensityui_text, setTransactionSuccessful settransactionsuccessful, r8lambdaokZBgNnbR8K2i443J9b9JUwVwk r8lambdaokzbgnnbr8k2i443j9b9juwvwk, InitializeAppStartupItemsImpl initializeAppStartupItemsImpl) {
        this.write = shouldShowTooltip;
        this.serializer = getneedsdensityui_text;
        this.RemoteActionCompatParcelizer = settransactionsuccessful;
        this.read = r8lambdaokzbgnnbr8k2i443j9b9juwvwk;
        this.IconCompatParcelizer = initializeAppStartupItemsImpl;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    public final Object invoke(ContinuationImpl continuationImpl) {
        LineHeightStyle lineHeightStyle;
        int i = 2 % 2;
        if (continuationImpl instanceof LineHeightStyle) {
            int i2 = MediaMetadataCompat + 7;
            MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            lineHeightStyle = (LineHeightStyle) continuationImpl;
            int i4 = lineHeightStyle.serializer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = MediaMetadataCompat + 31;
                MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                lineHeightStyle.serializer = i4 - Integer.MIN_VALUE;
            } else {
                lineHeightStyle = new LineHeightStyle(this, continuationImpl);
            }
        } else {
            lineHeightStyle = new LineHeightStyle(this, continuationImpl);
        }
        Object objInvoke = lineHeightStyle.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = lineHeightStyle.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i8 = 1;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            lineHeightStyle.serializer = 1;
            objInvoke = this.write.invoke(lineHeightStyle);
            if (objInvoke != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i7 != 1) {
            if (i7 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
        if (((Boolean) objInvoke).booleanValue()) {
            FlowKt__LimitKt$take$$inlined$unsafeFlow$1 flowKt__LimitKt$take$$inlined$unsafeFlow$1 = new FlowKt__LimitKt$take$$inlined$unsafeFlow$1(new WorkSpecDaoKt$dedup$$inlined$map$1(9, new HeatmapDataStore$get$$inlined$map$1(new HasWorkNowOpportunityImpl$invoke$$inlined$map$1(this.serializer.read.write(), i8), this, 18)));
            SharedSessionRepositoryImpl.AnonymousClass1.AnonymousClass2 anonymousClass2 = new SharedSessionRepositoryImpl.AnonymousClass1.AnonymousClass2(19, this);
            lineHeightStyle.serializer = 2;
            if (flowKt__LimitKt$take$$inlined$unsafeFlow$1.collect(anonymousClass2, lineHeightStyle) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return createfromparcel;
    }
}
