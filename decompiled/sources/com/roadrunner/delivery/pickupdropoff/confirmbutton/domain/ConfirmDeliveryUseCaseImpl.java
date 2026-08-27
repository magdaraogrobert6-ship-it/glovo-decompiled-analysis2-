package com.roadrunner.delivery.pickupdropoff.confirmbutton.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.SwitcherUiModelImpl$1;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.ConfirmDeliveryStepUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.UploadPictureUseCaseImpl;
import com.roadrunner.rider.safety.report.domain.MapSafetyReportResponse;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import o.PreviewLogger_androidKt;
import o.ShortNewsContentCardView;
import o.isItemDismissable;
import o.isOpenInternalroom_runtime;
import o.logErrorui_tooling;
import o.onItemDismiss;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.setParameterizedContentlambda02;
import o.uiMode;

/* JADX INFO: loaded from: classes3.dex */
public final class ConfirmDeliveryUseCaseImpl {
    private static int serializer = 0;
    private static int write = 1;
    public final ConfirmDeliveryStepUseCaseImpl IconCompatParcelizer;
    public final MapSafetyReportResponse RemoteActionCompatParcelizer;
    public final UploadPictureUseCaseImpl read;

    public ConfirmDeliveryUseCaseImpl(UploadPictureUseCaseImpl uploadPictureUseCaseImpl, ConfirmDeliveryStepUseCaseImpl confirmDeliveryStepUseCaseImpl, MapSafetyReportResponse mapSafetyReportResponse) {
        uploadPictureUseCaseImpl.getClass();
        confirmDeliveryStepUseCaseImpl.getClass();
        mapSafetyReportResponse.getClass();
        this.read = uploadPictureUseCaseImpl;
        this.IconCompatParcelizer = confirmDeliveryStepUseCaseImpl;
        this.RemoteActionCompatParcelizer = mapSafetyReportResponse;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x011a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x014b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:9:0x002c  */
    /* JADX INFO: renamed from: invoke-yxL6bBk, reason: not valid java name */
    public final Object m4922invokeyxL6bBk(long j, String str, String str2, r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, ContinuationImpl continuationImpl) {
        ConfirmDeliveryUseCaseImpl$invoke$1 confirmDeliveryUseCaseImpl$invoke$1;
        String str3;
        Object objWithContext;
        String str4;
        PreviewLogger_androidKt previewLogger_androidKt;
        String str5;
        Object obj;
        Object objM4938invokegIAlus;
        long j2 = j;
        String str6 = str;
        int i = 2 % 2;
        int i2 = write + 117;
        serializer = i2 % Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 % 2 == 0) {
            if (continuationImpl instanceof ConfirmDeliveryUseCaseImpl$invoke$1) {
                confirmDeliveryUseCaseImpl$invoke$1 = (ConfirmDeliveryUseCaseImpl$invoke$1) continuationImpl;
                int i3 = confirmDeliveryUseCaseImpl$invoke$1.read;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    confirmDeliveryUseCaseImpl$invoke$1.read = i3 - Integer.MIN_VALUE;
                } else {
                    confirmDeliveryUseCaseImpl$invoke$1 = new ConfirmDeliveryUseCaseImpl$invoke$1(this, continuationImpl);
                }
            } else {
                confirmDeliveryUseCaseImpl$invoke$1 = new ConfirmDeliveryUseCaseImpl$invoke$1(this, continuationImpl);
            }
            Object obj2 = confirmDeliveryUseCaseImpl$invoke$1.MediaMetadataCompat;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = confirmDeliveryUseCaseImpl$invoke$1.read;
            if (i4 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                if (r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk == null || !r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.isEmpty()) {
                    Iterator<E> it = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.iterator();
                    while (it.hasNext()) {
                        uiMode uimode = (uiMode) it.next();
                        if (!uimode.write() && !uimode.read()) {
                            return new isItemDismissable(new IllegalStateException("Not all tasks are done for the Delivery " + j2 + "! The url for confirm is " + str6));
                        }
                    }
                }
                confirmDeliveryUseCaseImpl$invoke$1.write = str6;
                str3 = str2;
                confirmDeliveryUseCaseImpl$invoke$1.serializer = str3;
                confirmDeliveryUseCaseImpl$invoke$1.IconCompatParcelizer = j2;
                confirmDeliveryUseCaseImpl$invoke$1.read = 1;
                MapSafetyReportResponse mapSafetyReportResponse = this.RemoteActionCompatParcelizer;
                isOpenInternalroom_runtime isopeninternalroom_runtime = mapSafetyReportResponse.IconCompatParcelizer;
                objWithContext = BuildersKt.withContext(prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer, new SwitcherUiModelImpl$1.AnonymousClass1(mapSafetyReportResponse, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, shortNewsContentCardView, 19), confirmDeliveryUseCaseImpl$invoke$1);
                if (objWithContext != coroutineSingletons) {
                }
                int i5 = write + 33;
                serializer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return coroutineSingletons;
            }
            int i7 = serializer + 3;
            write = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (i4 == 1) {
                j2 = confirmDeliveryUseCaseImpl$invoke$1.IconCompatParcelizer;
                String str7 = confirmDeliveryUseCaseImpl$invoke$1.serializer;
                String str8 = confirmDeliveryUseCaseImpl$invoke$1.write;
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                str3 = str7;
                str6 = str8;
                objWithContext = obj2;
            } else {
                if (i4 != 2) {
                    if (i4 == 3) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj2);
                        return ((onItemDismiss) obj2).IconCompatParcelizer;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    int i9 = write + 67;
                    serializer = i9 % Fields.SpotShadowColor;
                    if (i9 % 2 != 0) {
                        int i10 = 73 / 0;
                    }
                    return null;
                }
                j2 = confirmDeliveryUseCaseImpl$invoke$1.IconCompatParcelizer;
                previewLogger_androidKt = confirmDeliveryUseCaseImpl$invoke$1.RemoteActionCompatParcelizer;
                str5 = confirmDeliveryUseCaseImpl$invoke$1.serializer;
                str4 = confirmDeliveryUseCaseImpl$invoke$1.write;
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                obj = ((onItemDismiss) obj2).IconCompatParcelizer;
            }
            if (obj instanceof isItemDismissable) {
                return obj;
            }
            setParameterizedContentlambda02 setparameterizedcontentlambda02 = new setParameterizedContentlambda02(j2, str4, str5, previewLogger_androidKt.IconCompatParcelizer);
            confirmDeliveryUseCaseImpl$invoke$1.write = null;
            confirmDeliveryUseCaseImpl$invoke$1.serializer = null;
            confirmDeliveryUseCaseImpl$invoke$1.RemoteActionCompatParcelizer = null;
            confirmDeliveryUseCaseImpl$invoke$1.IconCompatParcelizer = j2;
            confirmDeliveryUseCaseImpl$invoke$1.read = 3;
            objM4938invokegIAlus = this.IconCompatParcelizer.m4938invokegIAlus(setparameterizedcontentlambda02, confirmDeliveryUseCaseImpl$invoke$1);
            if (objM4938invokegIAlus != coroutineSingletons) {
                return objM4938invokegIAlus;
            }
            int i11 = write + 33;
            serializer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            return coroutineSingletons;
            PreviewLogger_androidKt previewLogger_androidKt2 = (PreviewLogger_androidKt) objWithContext;
            if (!previewLogger_androidKt2.read.isEmpty()) {
                logErrorui_tooling logerrorui_tooling = new logErrorui_tooling(j2, previewLogger_androidKt2.read);
                confirmDeliveryUseCaseImpl$invoke$1.write = str6;
                confirmDeliveryUseCaseImpl$invoke$1.serializer = str3;
                confirmDeliveryUseCaseImpl$invoke$1.RemoteActionCompatParcelizer = previewLogger_androidKt2;
                confirmDeliveryUseCaseImpl$invoke$1.IconCompatParcelizer = j2;
                confirmDeliveryUseCaseImpl$invoke$1.read = 2;
                Object objM4941invokegIAlus = this.read.m4941invokegIAlus(logerrorui_tooling, confirmDeliveryUseCaseImpl$invoke$1);
                if (objM4941invokegIAlus != coroutineSingletons) {
                    str4 = str6;
                    previewLogger_androidKt = previewLogger_androidKt2;
                    str5 = str3;
                    obj = objM4941invokegIAlus;
                    if (obj instanceof isItemDismissable) {
                        return obj;
                    }
                    setParameterizedContentlambda02 setparameterizedcontentlambda03 = new setParameterizedContentlambda02(j2, str4, str5, previewLogger_androidKt.IconCompatParcelizer);
                    confirmDeliveryUseCaseImpl$invoke$1.write = null;
                    confirmDeliveryUseCaseImpl$invoke$1.serializer = null;
                    confirmDeliveryUseCaseImpl$invoke$1.RemoteActionCompatParcelizer = null;
                    confirmDeliveryUseCaseImpl$invoke$1.IconCompatParcelizer = j2;
                    confirmDeliveryUseCaseImpl$invoke$1.read = 3;
                    objM4938invokegIAlus = this.IconCompatParcelizer.m4938invokegIAlus(setparameterizedcontentlambda03, confirmDeliveryUseCaseImpl$invoke$1);
                    if (objM4938invokegIAlus != coroutineSingletons) {
                        return objM4938invokegIAlus;
                    }
                }
            } else {
                str4 = str6;
                previewLogger_androidKt = previewLogger_androidKt2;
                str5 = str3;
                setParameterizedContentlambda02 setparameterizedcontentlambda04 = new setParameterizedContentlambda02(j2, str4, str5, previewLogger_androidKt.IconCompatParcelizer);
                confirmDeliveryUseCaseImpl$invoke$1.write = null;
                confirmDeliveryUseCaseImpl$invoke$1.serializer = null;
                confirmDeliveryUseCaseImpl$invoke$1.RemoteActionCompatParcelizer = null;
                confirmDeliveryUseCaseImpl$invoke$1.IconCompatParcelizer = j2;
                confirmDeliveryUseCaseImpl$invoke$1.read = 3;
                objM4938invokegIAlus = this.IconCompatParcelizer.m4938invokegIAlus(setparameterizedcontentlambda04, confirmDeliveryUseCaseImpl$invoke$1);
                if (objM4938invokegIAlus != coroutineSingletons) {
                    return objM4938invokegIAlus;
                }
            }
            int i13 = write + 33;
            serializer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            return coroutineSingletons;
        }
        boolean z = continuationImpl instanceof ConfirmDeliveryUseCaseImpl$invoke$1;
        throw null;
    }
}
