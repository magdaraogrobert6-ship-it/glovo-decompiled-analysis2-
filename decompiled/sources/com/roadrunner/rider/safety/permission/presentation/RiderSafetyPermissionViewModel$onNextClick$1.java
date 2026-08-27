package com.roadrunner.rider.safety.permission.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.home.HomeViewModel;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.roadrunner.rider.safety.lifecycle.RiderSafetyLifecycleManager;
import com.roadrunner.rider.safety.permission.data.PermissionHistoryRepository;
import com.roadrunner.rider.safety.sentiance.SentianceGuard;
import com.sentiance.core.model.events.N$b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.AdjustAdRevenue;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.extractApplicationContext;
import o.getBitmapui_graphics;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getDefaultInstance;
import o.getGoogleAdId;
import o.getGooglePlayInstallReferrer;
import o.inCompatibilityMode;
import o.isOpenInternalroom_runtime;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.setReferrer;
import o.toBitmapConfig1JJdX4A;

/* JADX INFO: loaded from: classes3.dex */
public final class RiderSafetyPermissionViewModel$onNextClick$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 1;
    private static int write;
    public int IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ AdjustAdRevenue serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RiderSafetyPermissionViewModel$onNextClick$1(AdjustAdRevenue adjustAdRevenue, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.serializer = adjustAdRevenue;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = read + 45;
        write = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = this.RemoteActionCompatParcelizer;
        AdjustAdRevenue adjustAdRevenue = this.serializer;
        if (i4 == 0) {
            return new RiderSafetyPermissionViewModel$onNextClick$1(adjustAdRevenue, shortNewsContentCardView, 0);
        }
        int i5 = 1;
        if (i4 == 1) {
            return new RiderSafetyPermissionViewModel$onNextClick$1(adjustAdRevenue, shortNewsContentCardView, i5);
        }
        if (i4 == 2) {
            return new RiderSafetyPermissionViewModel$onNextClick$1(adjustAdRevenue, shortNewsContentCardView, i);
        }
        RiderSafetyPermissionViewModel$onNextClick$1 riderSafetyPermissionViewModel$onNextClick$1 = new RiderSafetyPermissionViewModel$onNextClick$1(adjustAdRevenue, shortNewsContentCardView, 3);
        int i6 = write + 61;
        read = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return riderSafetyPermissionViewModel$onNextClick$1;
        }
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = read + 101;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 == 0) {
            return ((RiderSafetyPermissionViewModel$onNextClick$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        if (i4 != 1) {
            return i4 != 2 ? ((RiderSafetyPermissionViewModel$onNextClick$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((RiderSafetyPermissionViewModel$onNextClick$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((RiderSafetyPermissionViewModel$onNextClick$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = read + 39;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objInvoke;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.RemoteActionCompatParcelizer;
        AdjustAdRevenue adjustAdRevenue = this.serializer;
        Object obj2 = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i3 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = this.IconCompatParcelizer;
            if (i4 != 0) {
                if (i4 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    objInvoke = obj;
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            N$b n$b = adjustAdRevenue.read;
            GetAppStateImpl getAppStateImpl = adjustAdRevenue.RatingCompat;
            this.IconCompatParcelizer = 1;
            objInvoke = n$b.invoke(getAppStateImpl, this);
            if (objInvoke == coroutineSingletons) {
                int i5 = write + 5;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return coroutineSingletons;
            }
            getDefaultInstance getdefaultinstance = (getDefaultInstance) objInvoke;
            int i7 = 3;
            if (getdefaultinstance instanceof getGooglePlayInstallReferrer) {
                adjustAdRevenue.getClass();
                adjustAdRevenue.RemoteActionCompatParcelizer(setReferrer.BACKGROUND_LOCATION);
                ((getBitmapui_graphics) adjustAdRevenue.RatingCompat.serializer).RemoteActionCompatParcelizer("BACKGROUND_LOCATION_REQUESTED", Boolean.TRUE);
                adjustAdRevenue.IconCompatParcelizer.serializer((getGooglePlayInstallReferrer) getdefaultinstance);
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(adjustAdRevenue), null, null, new RiderSafetyPermissionViewModel$onNextClick$1(adjustAdRevenue, shortNewsContentCardView, i7), 3);
                return obj2;
            }
            if (getdefaultinstance instanceof extractApplicationContext) {
                adjustAdRevenue.getClass();
                adjustAdRevenue.RemoteActionCompatParcelizer(setReferrer.ACTIVITY_RECOGNITION);
                ((getBitmapui_graphics) adjustAdRevenue.RatingCompat.serializer).RemoteActionCompatParcelizer("ACTIVITY_RECOGNITION_REQUESTED", Boolean.TRUE);
                adjustAdRevenue.IconCompatParcelizer.serializer((extractApplicationContext) getdefaultinstance);
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(adjustAdRevenue), null, null, new RiderSafetyPermissionViewModel$onNextClick$1(adjustAdRevenue, shortNewsContentCardView, i), 3);
                return obj2;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getdefaultinstance, getGoogleAdId.write}, getCieXyz.write())).booleanValue()) {
                adjustAdRevenue.getClass();
                adjustAdRevenue.RemoteActionCompatParcelizer(setReferrer.DISABLE_BATTERY_OPTIMIZATION);
                ((getBitmapui_graphics) adjustAdRevenue.RatingCompat.serializer).RemoteActionCompatParcelizer("DISABLE_BATTERY_OPTIMIZATION_REQUESTED", Boolean.TRUE);
                RiderSafetyLifecycleManager riderSafetyLifecycleManager = adjustAdRevenue.MediaSessionCompatQueueItem;
                if (!riderSafetyLifecycleManager.IconCompatParcelizer) {
                    return obj2;
                }
                ((SentianceGuard) riderSafetyLifecycleManager.MediaSessionCompatToken.write()).IconCompatParcelizer().disableBatteryOptimization();
                return obj2;
            }
            getGoogleAdId getgoogleadid = getGoogleAdId.read;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getdefaultinstance, getgoogleadid}, getCieXyz.write())).booleanValue()) {
                adjustAdRevenue.IconCompatParcelizer.serializer(getgoogleadid);
                return obj2;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        if (i3 == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i8 = this.IconCompatParcelizer;
            if (i8 != 0) {
                int i9 = write + 13;
                read = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                if (i8 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj2;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            DropShadowEffect dropShadowEffect = adjustAdRevenue.MediaBrowserCompatMediaItem;
            this.IconCompatParcelizer = 1;
            ((inCompatibilityMode) ((isOpenInternalroom_runtime) dropShadowEffect.RatingCompat)).getClass();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new HomeViewModel.AnonymousClass1(dropShadowEffect, shortNewsContentCardView, 27), this);
            if (objWithContext != coroutineSingletons2) {
                objWithContext = obj2;
            }
            if (objWithContext != coroutineSingletons2) {
                return obj2;
            }
            int i11 = read + 55;
            write = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                int i12 = 71 / 0;
            }
            return coroutineSingletons2;
        }
        if (i3 == 2) {
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i13 = this.IconCompatParcelizer;
            if (i13 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                PermissionHistoryRepository permissionHistoryRepository = adjustAdRevenue.MediaDescriptionCompat;
                this.IconCompatParcelizer = 1;
                Object objStore = permissionHistoryRepository.write.store("is_activity_recognition_permission_requested_before", Boolean.TRUE, this);
                if (objStore != coroutineSingletons3) {
                    objStore = obj2;
                }
                if (objStore == coroutineSingletons3) {
                    obj2 = coroutineSingletons3;
                }
            } else if (i13 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                obj2 = null;
            }
            int i14 = write + 111;
            read = i14 % Fields.SpotShadowColor;
            if (i14 % 2 == 0) {
                int i15 = 91 / 0;
            }
            return obj2;
        }
        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i16 = this.IconCompatParcelizer;
        if (i16 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            PermissionHistoryRepository permissionHistoryRepository2 = adjustAdRevenue.MediaDescriptionCompat;
            this.IconCompatParcelizer = 1;
            Object objStore2 = permissionHistoryRepository2.write.store("is_background_location_permission_requested_before", Boolean.TRUE, this);
            if (objStore2 != coroutineSingletons4) {
                objStore2 = obj2;
            }
            return objStore2 == coroutineSingletons4 ? coroutineSingletons4 : obj2;
        }
        int i17 = read;
        int i18 = i17 + 37;
        write = i18 % Fields.SpotShadowColor;
        int i19 = i18 % 2;
        if (i16 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i20 = i17 + 39;
        write = i20 % Fields.SpotShadowColor;
        int i21 = i20 % 2;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        return obj2;
    }
}
