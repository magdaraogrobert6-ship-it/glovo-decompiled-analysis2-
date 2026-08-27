package com.roadrunner.delivery.pickupdropoff.tasks.cardcashpayment.domain;

import android.net.Uri;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.common.data.CoroutineApiErrorHandlerKt;
import com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository;
import com.roadrunner.rider.safety.report.data.SafetyReportRepository$getSafetyReport$2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.AnimateXAsStateComposeAnimation;
import o.PreviewUtils_androidKt;
import o.asPreviewProviderClass;
import o.getMaxWidth;
import o.getOptimizationLevel;
import o.getSceneString;
import o.isItemDismissable;
import o.onViewAdded;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.toDebugStringlambda1;
import o.toDebugStringlambda3;
import o.withRect;

/* JADX INFO: loaded from: classes3.dex */
public final class GetSoftPosDeeplinkUseCaseImpl {
    private static int serializer = 1;
    private static int write;
    public final ConfirmationRepository IconCompatParcelizer;
    public final withRect RemoteActionCompatParcelizer;

    public GetSoftPosDeeplinkUseCaseImpl(ConfirmationRepository confirmationRepository, withRect withrect) {
        this.IconCompatParcelizer = confirmationRepository;
        this.RemoteActionCompatParcelizer = withrect;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    public final Object m4928invokegIAlus(toDebugStringlambda1 todebugstringlambda1, ContinuationImpl continuationImpl) {
        GetSoftPosDeeplinkUseCaseImpl$invoke$1 getSoftPosDeeplinkUseCaseImpl$invoke$1;
        int i = 2 % 2;
        int i2 = serializer + 87;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            boolean z = continuationImpl instanceof GetSoftPosDeeplinkUseCaseImpl$invoke$1;
            throw null;
        }
        if (continuationImpl instanceof GetSoftPosDeeplinkUseCaseImpl$invoke$1) {
            getSoftPosDeeplinkUseCaseImpl$invoke$1 = (GetSoftPosDeeplinkUseCaseImpl$invoke$1) continuationImpl;
            int i3 = getSoftPosDeeplinkUseCaseImpl$invoke$1.IconCompatParcelizer;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                getSoftPosDeeplinkUseCaseImpl$invoke$1.IconCompatParcelizer = i3 - Integer.MIN_VALUE;
            } else {
                getSoftPosDeeplinkUseCaseImpl$invoke$1 = new GetSoftPosDeeplinkUseCaseImpl$invoke$1(this, continuationImpl);
            }
        } else {
            getSoftPosDeeplinkUseCaseImpl$invoke$1 = new GetSoftPosDeeplinkUseCaseImpl$invoke$1(this, continuationImpl);
        }
        Object objWrite = getSoftPosDeeplinkUseCaseImpl$invoke$1.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = getSoftPosDeeplinkUseCaseImpl$invoke$1.IconCompatParcelizer;
        if (i4 != 0) {
            int i5 = write + 29;
            serializer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0 ? i4 != 1 : i4 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i6 = write + 101;
                serializer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objWrite);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objWrite);
            long j = todebugstringlambda1.RemoteActionCompatParcelizer;
            getSoftPosDeeplinkUseCaseImpl$invoke$1.IconCompatParcelizer = 1;
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            objWrite = CoroutineApiErrorHandlerKt.write(DefaultIoScheduler.RemoteActionCompatParcelizer, new SafetyReportRepository$getSafetyReport$2(this.IconCompatParcelizer, j, null, 1), getSoftPosDeeplinkUseCaseImpl$invoke$1);
            if (objWrite == coroutineSingletons) {
                int i8 = serializer + 23;
                write = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return coroutineSingletons;
            }
        }
        getOptimizationLevel getoptimizationlevel = (getOptimizationLevel) objWrite;
        getoptimizationlevel.getClass();
        boolean z2 = getoptimizationlevel instanceof getMaxWidth;
        if (!(!z2)) {
            if (!z2) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
                return null;
            }
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(((getMaxWidth) getoptimizationlevel).serializer);
        }
        if (!(getoptimizationlevel instanceof getSceneString)) {
            if (z2) {
                int i10 = serializer + 47;
                write = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                return ExtrasKt.IconCompatParcelizer(((getMaxWidth) getoptimizationlevel).serializer);
            }
            if (getoptimizationlevel instanceof onViewAdded) {
                return new isItemDismissable(new IllegalStateException());
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        int i12 = serializer + 47;
        write = i12 % Fields.SpotShadowColor;
        int i13 = i12 % 2;
        asPreviewProviderClass aspreviewproviderclass = (asPreviewProviderClass) ((getSceneString) getoptimizationlevel).read;
        try {
            PreviewUtils_androidKt previewUtils_androidKt = aspreviewproviderclass.data;
            String str = previewUtils_androidKt.deeplink;
            String str2 = previewUtils_androidKt.deeplink;
            Uri uri = Uri.parse(str);
            if (uri.getScheme() == null) {
                throw new IllegalArgumentException(("Deeplink scheme is missing: " + str2).toString());
            }
            if (uri.getPath() != null) {
                return new AnimateXAsStateComposeAnimation(uri, previewUtils_androidKt.testingData);
            }
            throw new IllegalArgumentException(("Deeplink path is missing: " + str2).toString());
        } catch (Exception unused) {
            aspreviewproviderclass.getClass();
            return new isItemDismissable(new toDebugStringlambda3());
        }
    }
}
