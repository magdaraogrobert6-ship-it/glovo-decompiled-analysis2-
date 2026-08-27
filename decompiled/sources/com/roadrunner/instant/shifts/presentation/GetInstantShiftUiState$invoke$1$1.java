package com.roadrunner.instant.shifts.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.roadrunner.login.logging.RouterLogger;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.remoteconfig.fwf.genii.Gen2FunWithFlagsConfigRepository;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.AdjustEvent;
import o.NestRiderStateSummary;
import o.ShortNewsContentCardView;
import o.StaggeredGridLayoutManagerLazySpanLookupFullSpanItem;
import o.checkRevenue;
import o.createFromParcel;
import o.displayInAppMessagelambda1;
import o.getCieXyz;
import o.getDeduplicationId;
import o.hasAnyOfTheFlags;
import o.isAttachedToTransitionOverlay;
import o.isBound;
import o.isTrackingEnabled;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.removeNodeAtDepth;
import o.sa;
import o.sb;
import o.sc;
import o.sd;
import o.setTransactionSuccessful;
import o.subscribeToBannersUpdateslambda2;
import o.t2;
import o.updateAdidI;

/* JADX INFO: loaded from: classes3.dex */
public final class GetInstantShiftUiState$invoke$1$1 extends SuspendLambda implements r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds {
    private static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public /* synthetic */ sc IconCompatParcelizer;
    public final /* synthetic */ GetInstantShiftUiState MediaBrowserCompatMediaItem;
    public int RatingCompat;
    public /* synthetic */ checkRevenue RemoteActionCompatParcelizer;
    public /* synthetic */ sa read;
    public final /* synthetic */ FlowCollector serializer;
    public boolean write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetInstantShiftUiState$invoke$1$1(GetInstantShiftUiState getInstantShiftUiState, FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        super(4, shortNewsContentCardView);
        this.MediaBrowserCompatMediaItem = getInstantShiftUiState;
        this.serializer = flowCollector;
    }

    @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = 2 % 2;
        GetInstantShiftUiState$invoke$1$1 getInstantShiftUiState$invoke$1$1 = new GetInstantShiftUiState$invoke$1$1(this.MediaBrowserCompatMediaItem, this.serializer, (ShortNewsContentCardView) obj4);
        getInstantShiftUiState$invoke$1$1.RemoteActionCompatParcelizer = (checkRevenue) obj;
        getInstantShiftUiState$invoke$1$1.read = (sa) obj2;
        getInstantShiftUiState$invoke$1$1.IconCompatParcelizer = (sc) obj3;
        Object objInvokeSuspend = getInstantShiftUiState$invoke$1$1.invokeSuspend(createFromParcel.INSTANCE);
        int i2 = MediaSessionCompatQueueItem + 45;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return objInvokeSuspend;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0092  */
    /* JADX WARN: Code duplicated, block: B:21:0x0094  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:54:0x011b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean zSerializer;
        boolean z;
        boolean z2;
        Object instantShiftsUiState;
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 77;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        checkRevenue checkrevenue = this.RemoteActionCompatParcelizer;
        sa saVar = this.read;
        sc scVar = this.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.RatingCompat;
        GetInstantShiftUiState getInstantShiftUiState = this.MediaBrowserCompatMediaItem;
        Object obj2 = null;
        if (i4 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            RouterLogger routerLogger = getInstantShiftUiState.PlaybackStateCompat;
            routerLogger.getClass();
            checkrevenue.getClass();
            isBound isbound = (isBound) routerLogger.read;
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) isbound.RemoteActionCompatParcelizer;
            firebaseRemoteConfigImpl.getClass();
            if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_FIREBASE_TO_FWF_MIGRATION_ENABLED)) {
                int i5 = MediaSessionCompatQueueItem + 99;
                MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 10 / 0;
                    if (((Gen2FunWithFlagsConfigRepository) isbound.read).serializer(hasAnyOfTheFlags.serializer, displayInAppMessagelambda1.serializer(isAttachedToTransitionOverlay.class)) == isAttachedToTransitionOverlay.TREATMENT) {
                        zSerializer = true;
                    } else {
                        zSerializer = false;
                    }
                } else {
                    if (((Gen2FunWithFlagsConfigRepository) isbound.read).serializer(hasAnyOfTheFlags.serializer, displayInAppMessagelambda1.serializer(isAttachedToTransitionOverlay.class)) == isAttachedToTransitionOverlay.TREATMENT) {
                        zSerializer = true;
                    } else {
                        zSerializer = false;
                    }
                }
            } else {
                zSerializer = firebaseRemoteConfigImpl.serializer();
            }
            String str = ((subscribeToBannersUpdateslambda2) routerLogger.serializer).read();
            boolean z3 = (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "ON_DEMAND"}, getCieXyz.write())).booleanValue() || str == null || str.length() == 0) ? false : true;
            AdjustEvent adjustEvent = checkrevenue.read;
            boolean z4 = adjustEvent == null || adjustEvent.MediaSessionCompatQueueItem == getDeduplicationId.NEXT;
            if (checkrevenue.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer == isTrackingEnabled.NOT_WORKING) {
                int i7 = MediaDescriptionCompat + 85;
                MediaSessionCompatQueueItem = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            if (zSerializer && z3) {
                int i8 = MediaDescriptionCompat + 97;
                int i9 = i8 % Fields.SpotShadowColor;
                MediaSessionCompatQueueItem = i9;
                if (i8 % 2 == 0) {
                    obj2.hashCode();
                    throw null;
                }
                if (z4 && z) {
                    int i10 = i9 + 71;
                    MediaDescriptionCompat = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            if (getInstantShiftUiState.MediaDescriptionCompat) {
                int i12 = MediaSessionCompatQueueItem + 59;
                MediaDescriptionCompat = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                if (z2) {
                    getInstantShiftUiState.MediaDescriptionCompat = false;
                    setTransactionSuccessful settransactionsuccessful = getInstantShiftUiState.RatingCompat;
                    NestRiderStateSummary nestRiderStateSummary = new NestRiderStateSummary(settransactionsuccessful.IconCompatParcelizer(R.string.instant_shift_title_today_shift), settransactionsuccessful.IconCompatParcelizer(R.string.instant_shift_description), settransactionsuccessful.IconCompatParcelizer(R.string.viewholder_search_shifts_text_button));
                    this.RemoteActionCompatParcelizer = null;
                    this.read = saVar;
                    this.IconCompatParcelizer = scVar;
                    this.write = z2;
                    this.RatingCompat = 1;
                    if (this.serializer.emit(nestRiderStateSummary, this) == coroutineSingletons) {
                        int i14 = MediaDescriptionCompat + 51;
                        MediaSessionCompatQueueItem = i14 % Fields.SpotShadowColor;
                        int i15 = i14 % 2;
                    }
                }
            }
        }
        if (i4 != 1) {
            if (i4 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z2 = this.write;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        int i16 = MediaSessionCompatQueueItem + 93;
        MediaDescriptionCompat = i16 % Fields.SpotShadowColor;
        int i17 = i16 % 2;
        this.RemoteActionCompatParcelizer = null;
        this.read = null;
        this.IconCompatParcelizer = null;
        this.write = z2;
        this.RatingCompat = 2;
        getInstantShiftUiState.getClass();
        if (!z2 || scVar != sc.SCHEDULE) {
            instantShiftsUiState = StaggeredGridLayoutManagerLazySpanLookupFullSpanItem.write;
        } else if (saVar instanceof sd) {
            instantShiftsUiState = getInstantShiftUiState.getInstantShiftsUiState(false, this);
        } else {
            if (!(saVar instanceof sb)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            int i18 = MediaSessionCompatQueueItem + 63;
            MediaDescriptionCompat = i18 % Fields.SpotShadowColor;
            if (i18 % 2 != 0) {
                boolean z5 = ((sb) saVar).write instanceof Collection;
                throw null;
            }
            List list = ((sb) saVar).write;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        int i19 = MediaSessionCompatQueueItem + 13;
                        MediaDescriptionCompat = i19 % Fields.SpotShadowColor;
                        int i20 = i19 % 2;
                        if (!(!((t2) it.next()).IconCompatParcelizer)) {
                            instantShiftsUiState = StaggeredGridLayoutManagerLazySpanLookupFullSpanItem.write;
                        }
                    }
                }
            }
            instantShiftsUiState = getInstantShiftUiState.getInstantShiftsUiState(true, this);
        }
        return instantShiftsUiState == coroutineSingletons ? coroutineSingletons : instantShiftsUiState;
    }
}
