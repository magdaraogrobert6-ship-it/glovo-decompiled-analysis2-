package com.roadrunner.liveness.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.home.HomeViewModel;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.inCompatibilityMode;
import o.isOpenInternalroom_runtime;
import o.onExitLayoutOrScroll;
import o.onItemDismiss;
import o.prepareForActivityTransitionCarryover;
import o.setDistanceToTriggerSync;

/* JADX INFO: loaded from: classes3.dex */
public final class CreateMultipartForLivenessUploadImpl {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final setDistanceToTriggerSync RemoteActionCompatParcelizer;
    public final onExitLayoutOrScroll read;
    public final isOpenInternalroom_runtime serializer;

    public CreateMultipartForLivenessUploadImpl(onExitLayoutOrScroll onexitlayoutorscroll, setDistanceToTriggerSync setdistancetotriggersync, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        onexitlayoutorscroll.getClass();
        setdistancetotriggersync.getClass();
        isopeninternalroom_runtime.getClass();
        this.read = onexitlayoutorscroll;
        this.RemoteActionCompatParcelizer = setdistancetotriggersync;
        this.serializer = isopeninternalroom_runtime;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b A[PHI: r1 r3
  0x002b: PHI (r1v10 com.roadrunner.liveness.domain.CreateMultipartForLivenessUploadImpl$invoke$1) = 
  (r1v9 com.roadrunner.liveness.domain.CreateMultipartForLivenessUploadImpl$invoke$1)
  (r1v12 com.roadrunner.liveness.domain.CreateMultipartForLivenessUploadImpl$invoke$1)
 binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x002b: PHI (r3v3 int) = (r3v2 int), (r3v5 int) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    /* JADX INFO: renamed from: invoke-IoAF18A, reason: not valid java name */
    public final Object m4984invokeIoAF18A(ContinuationImpl continuationImpl) {
        CreateMultipartForLivenessUploadImpl$invoke$1 createMultipartForLivenessUploadImpl$invoke$1;
        int i;
        int i2;
        int i3 = 2 % 2;
        if (continuationImpl instanceof CreateMultipartForLivenessUploadImpl$invoke$1) {
            int i4 = write + 63;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                createMultipartForLivenessUploadImpl$invoke$1 = (CreateMultipartForLivenessUploadImpl$invoke$1) continuationImpl;
                i2 = createMultipartForLivenessUploadImpl$invoke$1.read;
                int i5 = 70 / 0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    createMultipartForLivenessUploadImpl$invoke$1.read = i2 - Integer.MIN_VALUE;
                } else {
                    createMultipartForLivenessUploadImpl$invoke$1 = new CreateMultipartForLivenessUploadImpl$invoke$1(this, continuationImpl);
                    i = IconCompatParcelizer + 95;
                    write = i % Fields.SpotShadowColor;
                    if (i % 2 == 0) {
                        int i6 = 3 % 4;
                    }
                }
            } else {
                createMultipartForLivenessUploadImpl$invoke$1 = (CreateMultipartForLivenessUploadImpl$invoke$1) continuationImpl;
                i2 = createMultipartForLivenessUploadImpl$invoke$1.read;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    createMultipartForLivenessUploadImpl$invoke$1.read = i2 - Integer.MIN_VALUE;
                } else {
                    createMultipartForLivenessUploadImpl$invoke$1 = new CreateMultipartForLivenessUploadImpl$invoke$1(this, continuationImpl);
                    i = IconCompatParcelizer + 95;
                    write = i % Fields.SpotShadowColor;
                    if (i % 2 == 0) {
                        int i7 = 3 % 4;
                    }
                }
            }
        } else {
            createMultipartForLivenessUploadImpl$invoke$1 = new CreateMultipartForLivenessUploadImpl$invoke$1(this, continuationImpl);
            i = IconCompatParcelizer + 95;
            write = i % Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i8 = 3 % 4;
            }
        }
        Object objWithContext = createMultipartForLivenessUploadImpl$invoke$1.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = createMultipartForLivenessUploadImpl$invoke$1.read;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i9 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
            ((inCompatibilityMode) this.serializer).getClass();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.RemoteActionCompatParcelizer;
            HomeViewModel.AnonymousClass1 anonymousClass1 = new HomeViewModel.AnonymousClass1(this, shortNewsContentCardView, 18);
            createMultipartForLivenessUploadImpl$invoke$1.read = 1;
            objWithContext = BuildersKt.withContext(defaultIoScheduler, anonymousClass1, createMultipartForLivenessUploadImpl$invoke$1);
            if (objWithContext == coroutineSingletons) {
                int i10 = write + 71;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                return coroutineSingletons;
            }
        } else {
            if (i9 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
        }
        return ((onItemDismiss) objWithContext).IconCompatParcelizer;
    }
}
