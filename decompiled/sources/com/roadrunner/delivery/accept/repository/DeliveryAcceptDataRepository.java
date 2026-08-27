package com.roadrunner.delivery.accept.repository;

import androidx.compose.animation.core.Animatable$runAnimation$2;
import androidx.compose.material3.TooltipStateImpl;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AndroidView_androidKtupdateViewHolderParams2;
import o.ClickableSaverlambda1;
import o.ShortNewsContentCardView;
import o.accessisMainThread;
import o.copyGSF8kmg;
import o.copyNs73l9sdefault;
import o.copyaIRg9q4default;
import o.createFromParcel;
import o.isItemDismissable;
import o.isStrikethroughText;
import o.onItemDismiss;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setOnSessionTrackingFailedListener;
import o.unpackInt1;
import okio.Path$Companion;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class DeliveryAcceptDataRepository implements ClickableSaverlambda1 {
    public static final accessisMainThread IconCompatParcelizer = new accessisMainThread();
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaDescriptionCompat = 1;
    private static int MediaMetadataCompat = 0;
    private static int RatingCompat = 1;
    public final setOnSessionTrackingFailedListener MediaSessionCompatQueueItem = setOnSessionTrackingFailedListener.OTHER;
    public final isStrikethroughText RemoteActionCompatParcelizer;
    public final unpackInt1 read;
    public final ExecuteApiRequest serializer;
    public final copyGSF8kmg write;

    static {
        int i = MediaDescriptionCompat + 23;
        MediaBrowserCompatMediaItem = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public DeliveryAcceptDataRepository(isStrikethroughText isstrikethroughtext, Path$Companion path$Companion, ExecuteApiRequest executeApiRequest, copyGSF8kmg copygsf8kmg, unpackInt1 unpackint1) {
        this.RemoteActionCompatParcelizer = isstrikethroughtext;
        this.serializer = executeApiRequest;
        this.write = copygsf8kmg;
        this.read = unpackint1;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX INFO: renamed from: acceptDelivery-gIAlu-s, reason: not valid java name */
    public final Object m4908acceptDeliverygIAlus(AndroidView_androidKtupdateViewHolderParams2 androidView_androidKtupdateViewHolderParams2, ContinuationImpl continuationImpl) {
        DeliveryAcceptDataRepository$acceptDelivery$1 deliveryAcceptDataRepository$acceptDelivery$1;
        Object objM4875invokegIAlus;
        int i = 2 % 2;
        if (!(continuationImpl instanceof DeliveryAcceptDataRepository$acceptDelivery$1)) {
            deliveryAcceptDataRepository$acceptDelivery$1 = new DeliveryAcceptDataRepository$acceptDelivery$1(this, continuationImpl);
        } else {
            deliveryAcceptDataRepository$acceptDelivery$1 = (DeliveryAcceptDataRepository$acceptDelivery$1) continuationImpl;
            int i2 = deliveryAcceptDataRepository$acceptDelivery$1.serializer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryAcceptDataRepository$acceptDelivery$1.serializer = i2 - Integer.MIN_VALUE;
            } else {
                deliveryAcceptDataRepository$acceptDelivery$1 = new DeliveryAcceptDataRepository$acceptDelivery$1(this, continuationImpl);
            }
        }
        Object obj = deliveryAcceptDataRepository$acceptDelivery$1.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = deliveryAcceptDataRepository$acceptDelivery$1.serializer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            TooltipStateImpl.AnonymousClass2 anonymousClass2 = new TooltipStateImpl.AnonymousClass2(this, androidView_androidKtupdateViewHolderParams2, shortNewsContentCardView, 13);
            deliveryAcceptDataRepository$acceptDelivery$1.serializer = 1;
            objM4875invokegIAlus = this.serializer.m4875invokegIAlus(anonymousClass2, deliveryAcceptDataRepository$acceptDelivery$1);
            if (objM4875invokegIAlus == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i4 = MediaMetadataCompat + 35;
                RatingCompat = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return null;
            }
            int i6 = MediaMetadataCompat + 73;
            RatingCompat = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4875invokegIAlus = ((onItemDismiss) obj).IconCompatParcelizer;
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4875invokegIAlus);
        if (thSerializer != null) {
            return new isItemDismissable(Path$Companion.IconCompatParcelizer(thSerializer));
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: autoAcceptDelivery-gIAlu-s, reason: not valid java name */
    public final Object m4910autoAcceptDeliverygIAlus(copyaIRg9q4default copyairg9q4default, ContinuationImpl continuationImpl) {
        DeliveryAcceptDataRepository$autoAcceptDelivery$1 deliveryAcceptDataRepository$autoAcceptDelivery$1;
        Object objM4875invokegIAlus;
        int i = 2 % 2;
        if (continuationImpl instanceof DeliveryAcceptDataRepository$autoAcceptDelivery$1) {
            deliveryAcceptDataRepository$autoAcceptDelivery$1 = (DeliveryAcceptDataRepository$autoAcceptDelivery$1) continuationImpl;
            int i2 = deliveryAcceptDataRepository$autoAcceptDelivery$1.RemoteActionCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = MediaMetadataCompat + 29;
                RatingCompat = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                deliveryAcceptDataRepository$autoAcceptDelivery$1.RemoteActionCompatParcelizer = i2 - Integer.MIN_VALUE;
            } else {
                deliveryAcceptDataRepository$autoAcceptDelivery$1 = new DeliveryAcceptDataRepository$autoAcceptDelivery$1(this, continuationImpl);
                int i5 = RatingCompat + 41;
                MediaMetadataCompat = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
        } else {
            deliveryAcceptDataRepository$autoAcceptDelivery$1 = new DeliveryAcceptDataRepository$autoAcceptDelivery$1(this, continuationImpl);
            int i7 = RatingCompat + 41;
            MediaMetadataCompat = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        Object obj = deliveryAcceptDataRepository$autoAcceptDelivery$1.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = deliveryAcceptDataRepository$autoAcceptDelivery$1.RemoteActionCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i9 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            TooltipStateImpl.AnonymousClass2 anonymousClass2 = new TooltipStateImpl.AnonymousClass2(this, copyairg9q4default, shortNewsContentCardView, 14);
            deliveryAcceptDataRepository$autoAcceptDelivery$1.RemoteActionCompatParcelizer = 1;
            objM4875invokegIAlus = this.serializer.m4875invokegIAlus(anonymousClass2, deliveryAcceptDataRepository$autoAcceptDelivery$1);
            if (objM4875invokegIAlus == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i9 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i10 = MediaMetadataCompat + 101;
            RatingCompat = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Object obj2 = ((onItemDismiss) obj).IconCompatParcelizer;
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4875invokegIAlus = ((onItemDismiss) obj).IconCompatParcelizer;
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4875invokegIAlus);
        if (thSerializer != null) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, "auto accept v2 is failed.", new Object[0]);
            int i11 = MediaMetadataCompat + 3;
            RatingCompat = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
        }
        Throwable thSerializer2 = onItemDismiss.serializer(objM4875invokegIAlus);
        return thSerializer2 == null ? (copyNs73l9sdefault) objM4875invokegIAlus : new isItemDismissable(Path$Companion.IconCompatParcelizer(thSerializer2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: ackOrderSeen-yxL6bBk, reason: not valid java name */
    public final Object m4909ackOrderSeenyxL6bBk(String str, String str2, String str3, long j, ContinuationImpl continuationImpl) {
        DeliveryAcceptDataRepository$ackOrderSeen$1 deliveryAcceptDataRepository$ackOrderSeen$1;
        String str4;
        Object objM4875invokegIAlus;
        int i = 2 % 2;
        if (!(!(continuationImpl instanceof DeliveryAcceptDataRepository$ackOrderSeen$1))) {
            deliveryAcceptDataRepository$ackOrderSeen$1 = (DeliveryAcceptDataRepository$ackOrderSeen$1) continuationImpl;
            int i2 = deliveryAcceptDataRepository$ackOrderSeen$1.serializer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryAcceptDataRepository$ackOrderSeen$1.serializer = i2 - Integer.MIN_VALUE;
            } else {
                deliveryAcceptDataRepository$ackOrderSeen$1 = new DeliveryAcceptDataRepository$ackOrderSeen$1(this, continuationImpl);
            }
        } else {
            deliveryAcceptDataRepository$ackOrderSeen$1 = new DeliveryAcceptDataRepository$ackOrderSeen$1(this, continuationImpl);
        }
        DeliveryAcceptDataRepository$ackOrderSeen$1 deliveryAcceptDataRepository$ackOrderSeen$2 = deliveryAcceptDataRepository$ackOrderSeen$1;
        Object obj = deliveryAcceptDataRepository$ackOrderSeen$2.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = deliveryAcceptDataRepository$ackOrderSeen$2.serializer;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Animatable$runAnimation$2 animatable$runAnimation$2 = new Animatable$runAnimation$2(this, str, str2, str3, j, null);
            str4 = str2;
            deliveryAcceptDataRepository$ackOrderSeen$2.IconCompatParcelizer = str4;
            deliveryAcceptDataRepository$ackOrderSeen$2.serializer = 1;
            objM4875invokegIAlus = this.serializer.m4875invokegIAlus(animatable$runAnimation$2, deliveryAcceptDataRepository$ackOrderSeen$2);
            if (objM4875invokegIAlus == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i4 = RatingCompat + 99;
                MediaMetadataCompat = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return null;
            }
            String str5 = deliveryAcceptDataRepository$ackOrderSeen$2.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4875invokegIAlus = ((onItemDismiss) obj).IconCompatParcelizer;
            str4 = str5;
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4875invokegIAlus);
        if (thSerializer != null) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Acknowledge delivery seen failed. ", str4), new Object[0]);
        }
        Throwable thSerializer2 = onItemDismiss.serializer(objM4875invokegIAlus);
        if (thSerializer2 != null) {
            return new isItemDismissable(Path$Companion.IconCompatParcelizer(thSerializer2));
        }
        int i6 = RatingCompat + 7;
        MediaMetadataCompat = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return createFromParcel.INSTANCE;
        }
        int i7 = 63 / 0;
        return createFromParcel.INSTANCE;
    }
}
