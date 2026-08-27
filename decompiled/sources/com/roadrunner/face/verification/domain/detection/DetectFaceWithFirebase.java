package com.roadrunner.face.verification.domain.detection;

import android.app.Application;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.face.verification.api.selfie.CameraImage;
import com.roadrunner.push.PushEventPublisherImpl$emit$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.inCompatibilityMode;
import o.isOpenInternalroom_runtime;
import o.onItemDismiss;
import o.prepareForActivityTransitionCarryover;

/* JADX INFO: loaded from: classes3.dex */
public final class DetectFaceWithFirebase {
    private static int read = 0;
    private static int serializer = 1;
    public final isOpenInternalroom_runtime RemoteActionCompatParcelizer;
    public final Application write;

    public DetectFaceWithFirebase(Application application, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        application.getClass();
        isopeninternalroom_runtime.getClass();
        this.write = application;
        this.RemoteActionCompatParcelizer = isopeninternalroom_runtime;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    public final Object m4961invokegIAlus(CameraImage cameraImage, ContinuationImpl continuationImpl) {
        DetectFaceWithFirebase$invoke$1 detectFaceWithFirebase$invoke$1;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = serializer;
        int i4 = i3 + 121;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        if (continuationImpl instanceof DetectFaceWithFirebase$invoke$1) {
            int i6 = i3 + 97;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            detectFaceWithFirebase$invoke$1 = (DetectFaceWithFirebase$invoke$1) continuationImpl;
            int i8 = detectFaceWithFirebase$invoke$1.read;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                detectFaceWithFirebase$invoke$1.read = i8 - Integer.MIN_VALUE;
            } else {
                detectFaceWithFirebase$invoke$1 = new DetectFaceWithFirebase$invoke$1(this, continuationImpl);
            }
        } else {
            detectFaceWithFirebase$invoke$1 = new DetectFaceWithFirebase$invoke$1(this, continuationImpl);
        }
        Object objWithContext = detectFaceWithFirebase$invoke$1.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = detectFaceWithFirebase$invoke$1.read;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i9 != 0) {
            int i10 = serializer + 3;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            if (i9 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
            ((inCompatibilityMode) this.RemoteActionCompatParcelizer).getClass();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.RemoteActionCompatParcelizer;
            PushEventPublisherImpl$emit$1 pushEventPublisherImpl$emit$1 = new PushEventPublisherImpl$emit$1(this, cameraImage, shortNewsContentCardView, i);
            detectFaceWithFirebase$invoke$1.read = 1;
            objWithContext = BuildersKt.withContext(defaultIoScheduler, pushEventPublisherImpl$emit$1, detectFaceWithFirebase$invoke$1);
            if (objWithContext == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return ((onItemDismiss) objWithContext).IconCompatParcelizer;
    }
}
