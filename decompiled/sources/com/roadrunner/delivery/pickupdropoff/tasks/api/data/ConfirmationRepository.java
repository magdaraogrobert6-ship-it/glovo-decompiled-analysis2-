package com.roadrunner.delivery.pickupdropoff.tasks.api.data;

import androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.twofa.presentation.TwoFaViewModel$onPinChanged$1;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AnimatedVisibilityClockgetTransitionslambda0inlinedsortedBy1;
import o.ShortNewsContentCardView;
import o.isAdapterPositionOnScreen;
import o.isOpenInternalroom_runtime;
import o.isPermanentFailureimpl;
import o.onItemDismiss;
import o.r8lambdaO8CxgYAEJdvf6QoO3mkJZSui8c;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ;
import o.resetTransientState;
import o.transferSessionPackageI;
import o.withRect;

/* JADX INFO: loaded from: classes3.dex */
public final class ConfirmationRepository {
    private static int ParcelableVolumeInfo = 1;
    private static int PlaybackStateCompat;
    public final isOpenInternalroom_runtime IconCompatParcelizer;
    public final transferSessionPackageI MediaBrowserCompatMediaItem;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ MediaDescriptionCompat;
    public final resetTransientState MediaMetadataCompat;
    public final withRect MediaSessionCompatQueueItem;
    public final isAdapterPositionOnScreen RatingCompat;
    public final r8lambdaO8CxgYAEJdvf6QoO3mkJZSui8c RemoteActionCompatParcelizer;
    public final ExecuteApiRequest read;
    public final AnimatedVisibilityClockgetTransitionslambda0inlinedsortedBy1 serializer;
    public final ConcurrentHashMap write;

    public ConfirmationRepository(r8lambdaO8CxgYAEJdvf6QoO3mkJZSui8c r8lambdao8cxgyaejdvf6qoo3mkjzsui8c, isOpenInternalroom_runtime isopeninternalroom_runtime, ExecuteApiRequest executeApiRequest, transferSessionPackageI transfersessionpackagei, withRect withrect, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, AnimatedVisibilityClockgetTransitionslambda0inlinedsortedBy1 animatedVisibilityClockgetTransitionslambda0inlinedsortedBy1, resetTransientState resettransientstate) {
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.RemoteActionCompatParcelizer = r8lambdao8cxgyaejdvf6qoo3mkjzsui8c;
        this.IconCompatParcelizer = isopeninternalroom_runtime;
        this.read = executeApiRequest;
        this.MediaBrowserCompatMediaItem = transfersessionpackagei;
        this.MediaSessionCompatQueueItem = withrect;
        this.MediaDescriptionCompat = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.serializer = animatedVisibilityClockgetTransitionslambda0inlinedsortedBy1;
        this.MediaMetadataCompat = resettransientstate;
        this.write = new ConcurrentHashMap();
        this.RatingCompat = new isAdapterPositionOnScreen(new ImageLoader$Builder$$ExternalSyntheticLambda1(19, this));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    /* JADX INFO: renamed from: handleConfirmationRequest-gIAlu-s, reason: not valid java name */
    public final Object m4924handleConfirmationRequestgIAlus(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ContinuationImpl continuationImpl) {
        ConfirmationRepository$handleConfirmationRequest$1 confirmationRepository$handleConfirmationRequest$1;
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 103;
        int i3 = i2 % Fields.SpotShadowColor;
        ParcelableVolumeInfo = i3;
        int i4 = i2 % 2;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (continuationImpl instanceof ConfirmationRepository$handleConfirmationRequest$1) {
            int i5 = i3 + 11;
            PlaybackStateCompat = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = ((ConfirmationRepository$handleConfirmationRequest$1) continuationImpl).RemoteActionCompatParcelizer;
                shortNewsContentCardView.hashCode();
                throw null;
            }
            confirmationRepository$handleConfirmationRequest$1 = (ConfirmationRepository$handleConfirmationRequest$1) continuationImpl;
            int i7 = confirmationRepository$handleConfirmationRequest$1.RemoteActionCompatParcelizer;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                confirmationRepository$handleConfirmationRequest$1.RemoteActionCompatParcelizer = i7 - Integer.MIN_VALUE;
            } else {
                confirmationRepository$handleConfirmationRequest$1 = new ConfirmationRepository$handleConfirmationRequest$1(this, continuationImpl);
            }
        } else {
            confirmationRepository$handleConfirmationRequest$1 = new ConfirmationRepository$handleConfirmationRequest$1(this, continuationImpl);
        }
        Object obj = confirmationRepository$handleConfirmationRequest$1.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = confirmationRepository$handleConfirmationRequest$1.RemoteActionCompatParcelizer;
        int i9 = 1;
        if (i8 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2 infiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2 = new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(i9, shortNewsContentCardView, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            confirmationRepository$handleConfirmationRequest$1.RemoteActionCompatParcelizer = 1;
            Object objM4875invokegIAlus = this.read.m4875invokegIAlus(infiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2, confirmationRepository$handleConfirmationRequest$1);
            return objM4875invokegIAlus == coroutineSingletons ? coroutineSingletons : objM4875invokegIAlus;
        }
        if (i8 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i10 = ParcelableVolumeInfo + 49;
        PlaybackStateCompat = i10 % Fields.SpotShadowColor;
        if (i10 % 2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return ((onItemDismiss) obj).IconCompatParcelizer;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Object obj2 = ((onItemDismiss) obj).IconCompatParcelizer;
        int i11 = 48 / 0;
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    /* JADX INFO: renamed from: initiatePostApiCall-0E7RQCE, reason: not valid java name */
    public final Object m4925initiatePostApiCall0E7RQCE(String str, Map map, ShortNewsContentCardView shortNewsContentCardView) {
        ConfirmationRepository$initiatePostApiCall$1 confirmationRepository$initiatePostApiCall$1;
        int i = 2 % 2;
        if (shortNewsContentCardView instanceof ConfirmationRepository$initiatePostApiCall$1) {
            int i2 = PlaybackStateCompat + 87;
            ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            confirmationRepository$initiatePostApiCall$1 = (ConfirmationRepository$initiatePostApiCall$1) shortNewsContentCardView;
            int i4 = confirmationRepository$initiatePostApiCall$1.RemoteActionCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = PlaybackStateCompat + 97;
                ParcelableVolumeInfo = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                confirmationRepository$initiatePostApiCall$1.RemoteActionCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                confirmationRepository$initiatePostApiCall$1 = new ConfirmationRepository$initiatePostApiCall$1(this, shortNewsContentCardView);
            }
        } else {
            confirmationRepository$initiatePostApiCall$1 = new ConfirmationRepository$initiatePostApiCall$1(this, shortNewsContentCardView);
        }
        Object obj = confirmationRepository$initiatePostApiCall$1.IconCompatParcelizer;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = confirmationRepository$initiatePostApiCall$1.RemoteActionCompatParcelizer;
        if (i7 != 0) {
            int i8 = PlaybackStateCompat + 69;
            ParcelableVolumeInfo = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0 ? i7 != 1 : i7 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return ((onItemDismiss) obj).IconCompatParcelizer;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM confirmationRepository$initiatePutApiCall$2 = new ConfirmationRepository$initiatePutApiCall$2(this, str, map, null, 1);
        confirmationRepository$initiatePostApiCall$1.RemoteActionCompatParcelizer = 1;
        Object objM4924handleConfirmationRequestgIAlus = m4924handleConfirmationRequestgIAlus(confirmationRepository$initiatePutApiCall$2, confirmationRepository$initiatePostApiCall$1);
        if (objM4924handleConfirmationRequestgIAlus != obj2) {
            return objM4924handleConfirmationRequestgIAlus;
        }
        int i9 = PlaybackStateCompat + 9;
        ParcelableVolumeInfo = i9 % Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX INFO: renamed from: initiatePutApiCall-0E7RQCE, reason: not valid java name */
    public final Object m4926initiatePutApiCall0E7RQCE(String str, Map map, ShortNewsContentCardView shortNewsContentCardView) {
        ConfirmationRepository$initiatePutApiCall$1 confirmationRepository$initiatePutApiCall$1;
        int i = 2 % 2;
        if (shortNewsContentCardView instanceof ConfirmationRepository$initiatePutApiCall$1) {
            int i2 = ParcelableVolumeInfo + 69;
            PlaybackStateCompat = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = ((ConfirmationRepository$initiatePutApiCall$1) shortNewsContentCardView).RemoteActionCompatParcelizer;
                throw null;
            }
            confirmationRepository$initiatePutApiCall$1 = (ConfirmationRepository$initiatePutApiCall$1) shortNewsContentCardView;
            int i4 = confirmationRepository$initiatePutApiCall$1.RemoteActionCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                confirmationRepository$initiatePutApiCall$1.RemoteActionCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                confirmationRepository$initiatePutApiCall$1 = new ConfirmationRepository$initiatePutApiCall$1(this, shortNewsContentCardView);
            }
        } else {
            confirmationRepository$initiatePutApiCall$1 = new ConfirmationRepository$initiatePutApiCall$1(this, shortNewsContentCardView);
        }
        Object obj = confirmationRepository$initiatePutApiCall$1.write;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = confirmationRepository$initiatePutApiCall$1.RemoteActionCompatParcelizer;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM confirmationRepository$initiatePutApiCall$2 = new ConfirmationRepository$initiatePutApiCall$2(this, str, map, null, 0);
            confirmationRepository$initiatePutApiCall$1.RemoteActionCompatParcelizer = 1;
            Object objM4924handleConfirmationRequestgIAlus = m4924handleConfirmationRequestgIAlus(confirmationRepository$initiatePutApiCall$2, confirmationRepository$initiatePutApiCall$1);
            return objM4924handleConfirmationRequestgIAlus == obj2 ? obj2 : objM4924handleConfirmationRequestgIAlus;
        }
        if (i5 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return ((onItemDismiss) obj).IconCompatParcelizer;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
        int i6 = ParcelableVolumeInfo + 85;
        PlaybackStateCompat = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: confirmDeliveryStep-yxL6bBk, reason: not valid java name */
    public final Object m4923confirmDeliveryStepyxL6bBk(String str, String str2, isPermanentFailureimpl ispermanentfailureimpl, Map map, ContinuationImpl continuationImpl) {
        ConfirmationRepository$confirmDeliveryStep$1 confirmationRepository$confirmDeliveryStep$1;
        int i = 2 % 2;
        if (continuationImpl instanceof ConfirmationRepository$confirmDeliveryStep$1) {
            confirmationRepository$confirmDeliveryStep$1 = (ConfirmationRepository$confirmDeliveryStep$1) continuationImpl;
            int i2 = confirmationRepository$confirmDeliveryStep$1.RemoteActionCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                confirmationRepository$confirmDeliveryStep$1.RemoteActionCompatParcelizer = i2 - Integer.MIN_VALUE;
            } else {
                confirmationRepository$confirmDeliveryStep$1 = new ConfirmationRepository$confirmDeliveryStep$1(this, continuationImpl);
            }
        } else {
            confirmationRepository$confirmDeliveryStep$1 = new ConfirmationRepository$confirmDeliveryStep$1(this, continuationImpl);
        }
        ConfirmationRepository$confirmDeliveryStep$1 confirmationRepository$confirmDeliveryStep$2 = confirmationRepository$confirmDeliveryStep$1;
        Object obj = confirmationRepository$confirmDeliveryStep$2.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = confirmationRepository$confirmDeliveryStep$2.RemoteActionCompatParcelizer;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            TwoFaViewModel$onPinChanged$1 twoFaViewModel$onPinChanged$1 = new TwoFaViewModel$onPinChanged$1(str2, ispermanentfailureimpl, map, this, str, (ShortNewsContentCardView) null);
            confirmationRepository$confirmDeliveryStep$2.RemoteActionCompatParcelizer = 1;
            Object objM4875invokegIAlus = this.read.m4875invokegIAlus(twoFaViewModel$onPinChanged$1, confirmationRepository$confirmDeliveryStep$2);
            if (objM4875invokegIAlus != coroutineSingletons) {
                return objM4875invokegIAlus;
            }
            int i4 = PlaybackStateCompat + 69;
            ParcelableVolumeInfo = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return coroutineSingletons;
        }
        int i6 = PlaybackStateCompat + 61;
        ParcelableVolumeInfo = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0 ? i3 != 1 : i3 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            int i7 = PlaybackStateCompat + 111;
            ParcelableVolumeInfo = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                return null;
            }
            throw null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Object obj2 = ((onItemDismiss) obj).IconCompatParcelizer;
        int i8 = ParcelableVolumeInfo + 67;
        PlaybackStateCompat = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008c, code lost:
    
        if (r10 == r2) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object uploadPicture(java.lang.String r7, o.r8lambdaCTegLFIY2N5eeYL50pY32CICZRI r8, java.lang.String r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws o.getLoaderKey {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository.uploadPicture(java.lang.String, o.r8lambdaCTegLFIY2N5eeYL50pY32CICZRI, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00db  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d8, code lost:
    
        if (r5 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00df, code lost:
    
        if (r5 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e1, code lost:
    
        r0 = (o.createFromParcel) r0;
        r8.IconCompatParcelizer = r4;
        r8.serializer = r1;
        r8.RemoteActionCompatParcelizer = r3;
        r8.write = 3;
        r4.getClass();
        r0 = o.prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        r0 = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.scheduling.DefaultIoScheduler.RemoteActionCompatParcelizer, new com.roadrunner.nafath.NafathModalUiModelImpl$1.AnonymousClass2(r4, r1, null, 6), r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0103, code lost:
    
        if (r0 != r9) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0106, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0151, code lost:
    
        timber.log.Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Failed to get cached response for deliveryId: " + r1 + ", error: " + r5.getMessage(), new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0180, code lost:
    
        return new o.getMaxWidth(new java.lang.Throwable(bo.app.af$$ExternalSyntheticOutline0.m(r1, "No cached response for deliveryId: ")));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getConfirmationResponse(long r22, kotlin.coroutines.jvm.internal.ContinuationImpl r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository.getConfirmationResponse(long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0097  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:38:0x0106  */
    /* JADX WARN: Code duplicated, block: B:41:0x0146  */
    /* JADX WARN: Code duplicated, block: B:44:0x014b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0184  */
    /* JADX WARN: Code duplicated, block: B:51:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:53:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x014b -> B:45:0x0157). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0162 -> B:47:0x017e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: validateAndSaveDeliveryConfirmation-gIAlu-s, reason: not valid java name */
    public final java.lang.Object m4927validateAndSaveDeliveryConfirmationgIAlus(java.util.Map r25, kotlin.coroutines.jvm.internal.ContinuationImpl r26) {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository.m4927validateAndSaveDeliveryConfirmationgIAlus(java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
