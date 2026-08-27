package androidx.room;

import android.os.Looper;
import androidx.compose.foundation.FocusableNode;
import androidx.compose.ui.focus.FocusTargetModifierNode;
import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.auth.domain.logout.ClearDataUseCaseImpl$invoke$2;
import com.roadrunner.delivery.state.Trigger;
import com.roadrunner.home.HomeViewModel;
import com.roadrunner.home.bottomsheet.HomeBottomSheetUiModelImpl;
import com.roadrunner.instant.shifts.presentation.InstantShiftsUiModel;
import com.roadrunner.instant.shifts.presentation.InstantShiftsUiModelImpl;
import com.roadrunner.map.container.enabled.usecases.recenter.RecenterMapTriggerImpl;
import com.roadrunner.rider.state.offertowork.api.presentation.OfferToWorkUiModel;
import com.roadrunner.rider.state.offertowork.presentation.OfferToWorkUiModelImpl;
import com.roadrunner.rider.state.searchshifts.api.presentation.SearchShiftsWithBonusUiModel;
import com.roadrunner.rider.state.searchshifts.presentation.SearchShiftsWithBonusUiModelImpl;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.C0215z;
import o.ConicConverter;
import o.ShortNewsContentCardView;
import o.StaticLayoutFactory28;
import o.WrongFragmentContainerViolation;
import o.createFromParcel;
import o.extendWith;
import o.generateActivityResultKey;
import o.getContentViewGroupParentLayout;
import o.getEnterTransition;
import o.getLayingOutChildren;
import o.getPayloadFromSystemPropertyFilePathReflection;
import o.getPhrasejp8hJ3c;
import o.getPurchaseTime;
import o.getStripNonMetricAffectingCharSpansannotations;
import o.getTextBounds;
import o.hideCurrentlyDisplayingInAppMessage;
import o.onMove;
import o.onOptionsMenuClosed;
import o.onPrimaryNavigationFragmentChanged;
import o.onViewAttachedToWindowlambda0;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdap8kVRPOrasFuL_ov_PvwbyBK_nY;
import o.r8lambdayR4Ccli8VOZbdisFGdrBYWq9ug;
import o.setNativeShader;
import o.updateHasCallbacks;
import o.wasReturnedFromScrap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RoomDatabase$closeBarrier$1 extends FunctionReferenceImpl implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int read = 0;
    private static int serializer = 1;
    public final /* synthetic */ int IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RoomDatabase$closeBarrier$1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.IconCompatParcelizer = i3;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() throws Exception {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.IconCompatParcelizer;
        ConicConverter conicConverter = ConicConverter.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = null;
        switch (i3) {
            case 0:
                RoomDatabase.access$onClosed((RoomDatabase) this.MediaMetadataCompat);
                return createfromparcel;
            case 1:
                return Boolean.valueOf(FocusTargetModifierNode.m382requestFocus3ESFkO8$default(((FocusableNode) this.MediaMetadataCompat).IconCompatParcelizer, 0, 1, null));
            case 2:
                ((getLayingOutChildren) this.MediaMetadataCompat).getClass();
                String name = Thread.currentThread().getName();
                name.getClass();
                return Boolean.valueOf(hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) name, (CharSequence) "Firebase Background Thread #", false));
            case 3:
                ((getLayingOutChildren) this.MediaMetadataCompat).getClass();
                Boolean boolValueOf = Boolean.valueOf(!Looper.getMainLooper().isCurrentThread());
                int i4 = read + 19;
                serializer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return boolValueOf;
            case 4:
                ((Runnable) this.MediaMetadataCompat).run();
                return createfromparcel;
            case 5:
                StaticLayoutFactory28 staticLayoutFactory28 = (StaticLayoutFactory28) ((getStripNonMetricAffectingCharSpansannotations) this.MediaMetadataCompat);
                staticLayoutFactory28.MediaSessionCompatResultReceiverWrapper.serializer();
                staticLayoutFactory28.RemoteActionCompatParcelizer(extendWith.serializer);
                BuildersKt.RemoteActionCompatParcelizer(staticLayoutFactory28.read, null, null, new ClearDataUseCaseImpl$invoke$2(staticLayoutFactory28, shortNewsContentCardView, 21), 3);
                return createfromparcel;
            case 6:
                StaticLayoutFactory28 staticLayoutFactory29 = (StaticLayoutFactory28) ((getStripNonMetricAffectingCharSpansannotations) this.MediaMetadataCompat);
                staticLayoutFactory29.RemoteActionCompatParcelizer(getTextBounds.IconCompatParcelizer);
                staticLayoutFactory29.serializer(Trigger.BACK_TO_BACK_POPUP_DISMISS);
                staticLayoutFactory29.MediaSessionCompatResultReceiverWrapper.serializer();
                return createfromparcel;
            case 7:
                StaticLayoutFactory28 staticLayoutFactory210 = (StaticLayoutFactory28) ((getStripNonMetricAffectingCharSpansannotations) this.MediaMetadataCompat);
                staticLayoutFactory210.MediaSessionCompatResultReceiverWrapper.write();
                staticLayoutFactory210.MediaSessionCompatToken.serializer();
                return createfromparcel;
            case 8:
                generateActivityResultKey generateactivityresultkey = (generateActivityResultKey) this.MediaMetadataCompat;
                Iterator it = ((Set) generateactivityresultkey.write.serializer).iterator();
                while (!(!it.hasNext())) {
                    getPhrasejp8hJ3c getphrasejp8hj3c = (getPhrasejp8hJ3c) it.next();
                    if (getphrasejp8hj3c.read.RemoteActionCompatParcelizer() && getphrasejp8hj3c.serializer.read.RemoteActionCompatParcelizer.length() != 0) {
                        getContentViewGroupParentLayout getcontentviewgroupparentlayout = getphrasejp8hj3c.write;
                        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new HomeViewModel.AnonymousClass1(getphrasejp8hj3c, shortNewsContentCardView, i), 2);
                    }
                }
                generateactivityresultkey.MediaDescriptionCompat.RemoteActionCompatParcelizer.write(getEnterTransition.OPEN_HELP_CENTER);
                return createfromparcel;
            case 9:
                ((WrongFragmentContainerViolation) this.MediaMetadataCompat).serializer.IconCompatParcelizer(conicConverter);
                return createfromparcel;
            case 10:
                ((WrongFragmentContainerViolation) this.MediaMetadataCompat).serializer.IconCompatParcelizer(conicConverter);
                return createfromparcel;
            case 11:
                ((WrongFragmentContainerViolation) this.MediaMetadataCompat).serializer.IconCompatParcelizer(conicConverter);
                return createfromparcel;
            case 12:
                ((WrongFragmentContainerViolation) this.MediaMetadataCompat).serializer.IconCompatParcelizer(conicConverter);
                return createfromparcel;
            case 13:
                HomeBottomSheetUiModelImpl homeBottomSheetUiModelImpl = (HomeBottomSheetUiModelImpl) this.MediaMetadataCompat;
                if (setNativeShader.RemoteActionCompatParcelizer((onOptionsMenuClosed) homeBottomSheetUiModelImpl.serializer.read()) && homeBottomSheetUiModelImpl.RatingCompat.read() == onPrimaryNavigationFragmentChanged.COLLAPSED) {
                    homeBottomSheetUiModelImpl.write.write(onPrimaryNavigationFragmentChanged.HALF_EXPANDED);
                }
                return createfromparcel;
            case 14:
                ((InstantShiftsUiModelImpl) ((InstantShiftsUiModel) this.MediaMetadataCompat)).read.serializer(wasReturnedFromScrap.serializer);
                return createfromparcel;
            case 15:
                C0215z c0215z = (C0215z) this.MediaMetadataCompat;
                c0215z.write.read.logEvent("recenter_map_clicked", null);
                RecenterMapTriggerImpl recenterMapTriggerImpl = c0215z.IconCompatParcelizer;
                updateHasCallbacks updatehascallbacks = updateHasCallbacks.CenterButton;
                recenterMapTriggerImpl.getClass();
                updatehascallbacks.getClass();
                recenterMapTriggerImpl.RemoteActionCompatParcelizer.onNext(updatehascallbacks);
                return createfromparcel;
            case 16:
                OfferToWorkUiModelImpl offerToWorkUiModelImpl = (OfferToWorkUiModelImpl) ((OfferToWorkUiModel) this.MediaMetadataCompat);
                ff$$ExternalSyntheticOutline0.m("start_session_type", "become_available", offerToWorkUiModelImpl.MediaSessionCompatQueueItem.read, "start_session_clicked");
                offerToWorkUiModelImpl.serializer.serializer(getPurchaseTime.RemoteActionCompatParcelizer);
                return createfromparcel;
            case 17:
                SearchShiftsWithBonusUiModelImpl searchShiftsWithBonusUiModelImpl = (SearchShiftsWithBonusUiModelImpl) ((SearchShiftsWithBonusUiModel) this.MediaMetadataCompat);
                searchShiftsWithBonusUiModelImpl.MediaSessionCompatResultReceiverWrapper.read.logEvent("see_all_sessions_action_click", onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("starting_point_selected", "false"), new onViewAttachedToWindowlambda0("bonus_applied", String.valueOf(searchShiftsWithBonusUiModelImpl.RemoteActionCompatParcelizer()))));
                searchShiftsWithBonusUiModelImpl.write.serializer(getPayloadFromSystemPropertyFilePathReflection.write);
                return createfromparcel;
            case 18:
                r8lambdap8kVRPOrasFuL_ov_PvwbyBK_nY r8lambdap8kvrporasful_ov_pvwbybk_ny = (r8lambdap8kVRPOrasFuL_ov_PvwbyBK_nY) this.MediaMetadataCompat;
                r8lambdap8kvrporasful_ov_pvwbybk_ny.MediaSessionCompatQueueItem.write();
                r8lambdap8kvrporasful_ov_pvwbybk_ny.MediaBrowserCompatMediaItem.IconCompatParcelizer.write(r8lambdayR4Ccli8VOZbdisFGdrBYWq9ug.SHOW);
                int i6 = serializer + 107;
                read = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return createfromparcel;
            default:
                ((r8lambdap8kVRPOrasFuL_ov_PvwbyBK_nY) this.MediaMetadataCompat).MediaDescriptionCompat.read.IconCompatParcelizer(null);
                return createfromparcel;
        }
    }
}
