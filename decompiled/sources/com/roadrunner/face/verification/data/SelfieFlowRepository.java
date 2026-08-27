package com.roadrunner.face.verification.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.core.MapboxNavigation$parsing$2;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ConstraintSet;
import o.ShortNewsContentCardView;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class SelfieFlowRepository {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final ConstraintSet IconCompatParcelizer;
    public final ExecuteApiRequest read;

    public SelfieFlowRepository(ConstraintSet constraintSet, ExecuteApiRequest executeApiRequest) {
        constraintSet.getClass();
        executeApiRequest.getClass();
        this.IconCompatParcelizer = constraintSet;
        this.read = executeApiRequest;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: checkSelfieStatus-IoAF18A, reason: not valid java name */
    public final Object m4958checkSelfieStatusIoAF18A(ContinuationImpl continuationImpl) {
        SelfieFlowRepository$checkSelfieStatus$1 selfieFlowRepository$checkSelfieStatus$1;
        int i = 2 % 2;
        if (continuationImpl instanceof SelfieFlowRepository$checkSelfieStatus$1) {
            selfieFlowRepository$checkSelfieStatus$1 = (SelfieFlowRepository$checkSelfieStatus$1) continuationImpl;
            int i2 = selfieFlowRepository$checkSelfieStatus$1.IconCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selfieFlowRepository$checkSelfieStatus$1.IconCompatParcelizer = i2 - Integer.MIN_VALUE;
            } else {
                selfieFlowRepository$checkSelfieStatus$1 = new SelfieFlowRepository$checkSelfieStatus$1(this, continuationImpl);
            }
        } else {
            selfieFlowRepository$checkSelfieStatus$1 = new SelfieFlowRepository$checkSelfieStatus$1(this, continuationImpl);
        }
        Object obj = selfieFlowRepository$checkSelfieStatus$1.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = selfieFlowRepository$checkSelfieStatus$1.IconCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            MapboxNavigation$parsing$2 mapboxNavigation$parsing$2 = new MapboxNavigation$parsing$2(this, shortNewsContentCardView, 9);
            selfieFlowRepository$checkSelfieStatus$1.IconCompatParcelizer = 1;
            Object objM4875invokegIAlus = this.read.m4875invokegIAlus(mapboxNavigation$parsing$2, selfieFlowRepository$checkSelfieStatus$1);
            if (objM4875invokegIAlus != coroutineSingletons) {
                return objM4875invokegIAlus;
            }
            int i4 = RemoteActionCompatParcelizer + 25;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return coroutineSingletons;
        }
        if (i3 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i6 = RemoteActionCompatParcelizer + 85;
        serializer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return ((onItemDismiss) obj).IconCompatParcelizer;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Object obj2 = ((onItemDismiss) obj).IconCompatParcelizer;
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002a  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ea, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r0.write(), "Start Working"}, o.getCieXyz.write())).booleanValue() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0115, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r0.write(), "Start Working"}, o.getCieXyz.write())).booleanValue() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0117, code lost:
    
        timber.log.Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r2, o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Received error in IAM-login with success: ", r2.getMessage()), new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0128, code lost:
    
        return r3;
     */
    /* JADX INFO: renamed from: uploadSelfie-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m4959uploadSelfieBWLJW6A(com.roadrunner.face.verification.api.navigation.IdentityVerificationParams r18, o.r8lambdaCTegLFIY2N5eeYL50pY32CICZRI r19, boolean r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.face.verification.data.SelfieFlowRepository.m4959uploadSelfieBWLJW6A(com.roadrunner.face.verification.api.navigation.IdentityVerificationParams, o.r8lambdaCTegLFIY2N5eeYL50pY32CICZRI, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
