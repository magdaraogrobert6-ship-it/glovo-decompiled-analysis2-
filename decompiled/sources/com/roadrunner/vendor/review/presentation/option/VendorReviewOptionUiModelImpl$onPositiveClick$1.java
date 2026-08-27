package com.roadrunner.vendor.review.presentation.option;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.sidemenu.photoId.PhotoIdUiModelImpl$1$1;
import com.roadrunner.vendor.review.data.database.entity.ReviewState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvertKt$asFlow$1;
import kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.addSingleSynchronousSubscription;
import o.createFromParcel;
import o.deserializeContentCard;
import o.getConfigurationProviderSafeandroid_sdk_base_release;
import o.getContentCardUnviewedCount;
import o.getContentViewGroupParentLayout;
import o.getDeviceIdAsync;
import o.getDeviceIdProviderandroid_sdk_base_release;
import o.getRegisteredPushToken;
import o.inCompatibilityMode;
import o.instance_delegatelambda0;
import o.logPushNotificationActionClicked;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release;
import o.setZIndex;
import o.subscribeToNoMatchingTriggerForEventlambda0;
import o.verifyProperSdkSetup;
import o.verifyProperSdkSetuplambda2;

/* JADX INFO: loaded from: classes3.dex */
public final class VendorReviewOptionUiModelImpl$onPositiveClick$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 1;
    private static int write;
    public final /* synthetic */ int IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ VendorReviewOptionUiModelImpl serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VendorReviewOptionUiModelImpl$onPositiveClick$1(VendorReviewOptionUiModelImpl vendorReviewOptionUiModelImpl, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.serializer = vendorReviewOptionUiModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.IconCompatParcelizer;
        VendorReviewOptionUiModelImpl vendorReviewOptionUiModelImpl = this.serializer;
        if (i3 == 0) {
            VendorReviewOptionUiModelImpl$onPositiveClick$1 vendorReviewOptionUiModelImpl$onPositiveClick$1 = new VendorReviewOptionUiModelImpl$onPositiveClick$1(vendorReviewOptionUiModelImpl, shortNewsContentCardView, 0);
            int i4 = read + 41;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return vendorReviewOptionUiModelImpl$onPositiveClick$1;
        }
        int i6 = 1;
        if (i3 != 1) {
            VendorReviewOptionUiModelImpl$onPositiveClick$1 vendorReviewOptionUiModelImpl$onPositiveClick$2 = new VendorReviewOptionUiModelImpl$onPositiveClick$1(vendorReviewOptionUiModelImpl, shortNewsContentCardView, i);
            int i7 = write + 15;
            read = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return vendorReviewOptionUiModelImpl$onPositiveClick$2;
        }
        VendorReviewOptionUiModelImpl$onPositiveClick$1 vendorReviewOptionUiModelImpl$onPositiveClick$3 = new VendorReviewOptionUiModelImpl$onPositiveClick$1(vendorReviewOptionUiModelImpl, shortNewsContentCardView, i6);
        int i9 = write + 103;
        read = i9 % Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return vendorReviewOptionUiModelImpl$onPositiveClick$3;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = write + 99;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i3 != 0) {
            return i3 != 1 ? ((VendorReviewOptionUiModelImpl$onPositiveClick$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2) : ((VendorReviewOptionUiModelImpl$onPositiveClick$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        Object objInvokeSuspend = ((VendorReviewOptionUiModelImpl$onPositiveClick$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = read + 55;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
        return objInvokeSuspend;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00dd  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAccess$tryLoadingSubmittedState;
        Object objWithContext;
        logPushNotificationActionClicked logpushnotificationactionclicked;
        verifyProperSdkSetuplambda2 verifypropersdksetuplambda2;
        Object obj2;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = read + 35;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.IconCompatParcelizer;
        Object obj3 = createFromParcel.INSTANCE;
        VendorReviewOptionUiModelImpl vendorReviewOptionUiModelImpl = this.serializer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i5 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i6 = this.RemoteActionCompatParcelizer;
            if (i6 != 0) {
                if (i6 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i7 = write + 45;
                read = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj3;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            vendorReviewOptionUiModelImpl.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(vendorReviewOptionUiModelImpl.read, ReviewState.SUBMITTED_POSITIVE);
            getRegisteredPushToken getregisteredpushtoken = vendorReviewOptionUiModelImpl.RatingCompat;
            getDeviceIdProviderandroid_sdk_base_release getdeviceidproviderandroid_sdk_base_release = new getDeviceIdProviderandroid_sdk_base_release(vendorReviewOptionUiModelImpl.read, getDeviceIdAsync.BINARY, subscribeToNoMatchingTriggerForEventlambda0.POSITIVE.getValue(), null, instance_delegatelambda0.write);
            this.RemoteActionCompatParcelizer = 1;
            ((inCompatibilityMode) getregisteredpushtoken.write).getClass();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            Object objWithContext2 = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new PhotoIdUiModelImpl$1$1(getregisteredpushtoken, getdeviceidproviderandroid_sdk_base_release, shortNewsContentCardView, 26), this);
            if (objWithContext2 != coroutineSingletons) {
                objWithContext2 = obj3;
            }
            if (objWithContext2 != coroutineSingletons) {
                return obj3;
            }
            int i9 = write + 111;
            read = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                int i10 = 5 / 3;
            }
            return coroutineSingletons;
        }
        if (i5 != 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i11 = this.RemoteActionCompatParcelizer;
            if (i11 != 0) {
                if (i11 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj3;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release = vendorReviewOptionUiModelImpl.IconCompatParcelizer;
            long j = vendorReviewOptionUiModelImpl.read;
            deserializeContentCard deserializecontentcard = (deserializeContentCard) ((addSingleSynchronousSubscription) sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write).read;
            Flow flowSerializer = FlowKt.serializer(DelayKt.RemoteActionCompatParcelizer(deserializecontentcard.IconCompatParcelizer, false, new String[]{"vendor_review_state"}, new setZIndex(j, i, deserializecontentcard)));
            RxConvertKt$asObservable$1$job$1.AnonymousClass1 anonymousClass1 = new RxConvertKt$asObservable$1$job$1.AnonymousClass1(28, vendorReviewOptionUiModelImpl);
            this.RemoteActionCompatParcelizer = 1;
            return flowSerializer.collect(anonymousClass1, this) == coroutineSingletons2 ? coroutineSingletons2 : obj3;
        }
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = this.RemoteActionCompatParcelizer;
        if (i12 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.RemoteActionCompatParcelizer = 1;
            objAccess$tryLoadingSubmittedState = VendorReviewOptionUiModelImpl.access$tryLoadingSubmittedState(vendorReviewOptionUiModelImpl, this);
            if (objAccess$tryLoadingSubmittedState == coroutineSingletons3) {
                obj3 = coroutineSingletons3;
            }
            int i13 = write + 101;
            read = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            return obj3;
        }
        if (i12 != 1) {
            int i15 = write + 7;
            read = i15 % Fields.SpotShadowColor;
            if (i15 % 2 != 0 ? i12 != 2 : i12 != 4) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                obj3 = null;
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                objWithContext = obj;
                logpushnotificationactionclicked = (logPushNotificationActionClicked) objWithContext;
                verifypropersdksetuplambda2 = verifyProperSdkSetuplambda2.serializer;
                if (logpushnotificationactionclicked == null) {
                    obj2 = verifyProperSdkSetup.write;
                } else {
                    obj2 = verifypropersdksetuplambda2;
                }
                vendorReviewOptionUiModelImpl.write.IconCompatParcelizer(obj2);
                if (obj2.equals(verifypropersdksetuplambda2)) {
                    BuildersKt.RemoteActionCompatParcelizer(vendorReviewOptionUiModelImpl.serializer, null, null, new VendorReviewOptionUiModelImpl$onPositiveClick$1(vendorReviewOptionUiModelImpl, shortNewsContentCardView, i), 3);
                }
            }
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objAccess$tryLoadingSubmittedState = obj;
        }
        int i16 = write + 101;
        read = i16 % Fields.SpotShadowColor;
        int i17 = i16 % 2;
        return obj3;
        if (!((Boolean) objAccess$tryLoadingSubmittedState).booleanValue()) {
            getConfigurationProviderSafeandroid_sdk_base_release getconfigurationprovidersafeandroid_sdk_base_release = vendorReviewOptionUiModelImpl.RemoteActionCompatParcelizer;
            getContentCardUnviewedCount getcontentcardunviewedcount = new getContentCardUnviewedCount(getDeviceIdAsync.BINARY);
            this.RemoteActionCompatParcelizer = 2;
            ((inCompatibilityMode) getconfigurationprovidersafeandroid_sdk_base_release.serializer).getClass();
            DefaultScheduler defaultScheduler2 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new RxConvertKt$asFlow$1(getconfigurationprovidersafeandroid_sdk_base_release, getcontentcardunviewedcount, shortNewsContentCardView, 22), this);
            if (objWithContext == coroutineSingletons3) {
                obj3 = coroutineSingletons3;
            } else {
                logpushnotificationactionclicked = (logPushNotificationActionClicked) objWithContext;
                verifypropersdksetuplambda2 = verifyProperSdkSetuplambda2.serializer;
                if (logpushnotificationactionclicked == null) {
                    obj2 = verifyProperSdkSetup.write;
                } else {
                    obj2 = verifypropersdksetuplambda2;
                }
                vendorReviewOptionUiModelImpl.write.IconCompatParcelizer(obj2);
                if (obj2.equals(verifypropersdksetuplambda2)) {
                    BuildersKt.RemoteActionCompatParcelizer(vendorReviewOptionUiModelImpl.serializer, null, null, new VendorReviewOptionUiModelImpl$onPositiveClick$1(vendorReviewOptionUiModelImpl, shortNewsContentCardView, i), 3);
                }
            }
        }
        int i18 = write + 101;
        read = i18 % Fields.SpotShadowColor;
        int i19 = i18 % 2;
        return obj3;
    }
}
