package com.sentiance.core.model.events;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.BlockRunner;
import androidx.sqlite.SQLite;
import androidx.work.impl.WorkManagerImpl;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.UriKt;
import com.adjust.sdk.Constants;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.foodora.courier.legacy.ui.preferences.SettingsActivity;
import com.google.android.gms.internal.mlkit_vision_face.zzdr;
import com.google.re2j.Parser;
import com.huawei.agconnect.config.impl.m;
import com.huawei.location.Vw$Vw;
import com.huawei.wisesecurity.ucs_credential.n0;
import com.mapbox.common.BillingService;
import com.mapbox.common.BillingServiceError;
import com.mapbox.common.BillingServiceErrorCode;
import com.mapbox.common.BillingServiceFactory;
import com.mapbox.common.BillingSessionStatus;
import com.mapbox.common.LoggingLevel;
import com.mapbox.common.SdkInformation;
import com.mapbox.common.SessionSKUIdentifier;
import com.mapbox.maps.Snapshotter$$ExternalSyntheticLambda0;
import com.mapbox.navigation.base.internal.route.Waypoint;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.core.accounts.BillingController$$ExternalSyntheticLambda1;
import com.mapbox.navigation.core.accounts.BillingController$WhenMappings;
import com.mapbox.navigation.core.accounts.BillingController$arrivalObserver$1;
import com.mapbox.navigation.core.accounts.BillingController$getRunningOrPausedSessionSkuId$SkuSessionStatus;
import com.mapbox.navigation.core.arrival.ArrivalProgressObserver;
import com.mapbox.navigation.core.trip.session.MapboxTripSession;
import com.mapbox.navigation.core.trip.session.NavigationSession;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.roadrunner.adjust.ui.AdjustTrueLinkBrowsableActivity;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.auth.logout.presentation.LogoutActivity;
import com.roadrunner.biometrics.presentation.BiometricsActivity;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.custom.password.presentation.CustomPasswordActivity;
import com.roadrunner.customerchat.legacy.chatlist.presentation.CustomerChatsActivity;
import com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity;
import com.roadrunner.deeplink.DeepLinkActivity;
import com.roadrunner.delivery.accept.autoaccept.preferences.presentation.AutoAcceptPreferencesFragment;
import com.roadrunner.delivery.accept.declinebutton.presentation.LasagnaDeclineBottomSheet;
import com.roadrunner.delivery.accept.declinebutton.presentation.LasagnaDeclineComposeBottomSheet;
import com.roadrunner.delivery.accept.declinebutton.presentation.LasagnaDeclineWithAcceptanceRateBottomSheet;
import com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.InAppCameraWithTagsFragment;
import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.GalleryFragment;
import com.roadrunner.delivery.ontheway.crowdsourcing.sharing.presentation.ContentSharingFragment;
import com.roadrunner.delivery.ontheway.crowdsourcing.sharing.presentation.PhotoSharedSuccessDialogFragment;
import com.roadrunner.delivery.ontheway.crowdsourcing.terms.presentation.TermsAndConditionsFragment;
import com.roadrunner.delivery.ontheway.entrancepicture.details.presentation.EntrancePictureFragment;
import com.roadrunner.delivery.ontheway.tripplanner.actions.presentation.TripPlannerActionsFragment;
import com.roadrunner.delivery.pickupdropoff.blockingui.presentation.dialog.TimeChangedBlockingDialogFragment;
import com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothEnableDialogFragment;
import com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothScanPermissionDialogFragment;
import com.roadrunner.delivery.pickupdropoff.confirmbutton.presentation.DoubleConfirmationFragment;
import com.roadrunner.delivery.pickupdropoff.details.contactrider.presentation.ContactRiderActionsFragment;
import com.roadrunner.delivery.pickupdropoff.fullscreendetails.presentation.FullScreenDetailsFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.reason.AmountChangingReasonDialogFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableFragmentV2;
import com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.CodeScanFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.presentation.signature.CustomerSignatureFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.qrpayment.presentation.screen.QrPaymentScreenFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.pin.PinScreenFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.scan.QrScannerFragment;
import com.roadrunner.delivery.stacked.delivery.details.ui.StackedDeliveryDetailsFragment;
import com.roadrunner.diagnostics.presentation.activity.DiagnosticsActivity;
import com.roadrunner.face.verification.presentation.IdentityVerificationActivity;
import com.roadrunner.helpcenter.presentation.activity.HelpCenterActivity;
import com.roadrunner.home.HomeFragment;
import com.roadrunner.home.nest.NestFragment;
import com.roadrunner.inappnotifications.presentation.InAppNotificationsFragment;
import com.roadrunner.instant.shifts.presentation.confirmation.BookShiftConfirmationContainerFragment;
import com.roadrunner.instant.shifts.presentation.confirmation.BookShiftConfirmationDialogFragment;
import com.roadrunner.liveness.presentation.LivenessDetectionActivity;
import com.roadrunner.login.presentation.LoginActivity;
import com.roadrunner.login.presentation.router.RouterActivity;
import com.roadrunner.map.container.enabled.presentation.MapboxFragment;
import com.roadrunner.nafath.presentation.ui.NafathModalFragment;
import com.roadrunner.opportunities.calendar.BonusCalendarFragment;
import com.roadrunner.opportunities.calendar.info.CalendarInformationFragment;
import com.roadrunner.order.history.presentation.HistoryDialogFragment;
import com.roadrunner.order.history.presentation.HistoryNavContainerFragment;
import com.roadrunner.order.history.presentation.main.HistoryFragment;
import com.roadrunner.order.history.presentation.orderdetails.OrderDetailsFragment;
import com.roadrunner.overlay.bubble.permission.presentation.OverlayPermissionDialogFragment;
import com.roadrunner.permission.location.gps.presentation.GPSActivity;
import com.roadrunner.permission.presentation.NonFloatablePermissionActivity;
import com.roadrunner.permission.presentation.PermissionActivity;
import com.roadrunner.push.presentation.PushMessagesActivity;
import com.roadrunner.push.presentation.PushMessagesInjectionActivity;
import com.roadrunner.recentdeliveries.presentation.RecentDeliveriesFragment;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.recruitment.accountcreation.presentation.AccountCreationFragment;
import com.roadrunner.rider.safety.permission.presentation.RiderSafetyPermissionFragment;
import com.roadrunner.rider.safety.report.presentation.RiderSafetyReportFragment;
import com.roadrunner.rider.state.breakrequest.RequestBreakFragment;
import com.roadrunner.rider.state.breakrequest.SelectBreakDurationFragment;
import com.roadrunner.rider.state.worksettings.presentation.SettingsInfoBottomSheet;
import com.roadrunner.settings.SettingsFragment;
import com.roadrunner.settings.SettingsViewModel$special$$inlined$map$1;
import com.roadrunner.settings.subscreens.appearance.AppearanceFragment;
import com.roadrunner.settings.subscreens.chatLanguageSelector.ChatLanguageSelectorFragment;
import com.roadrunner.settings.subscreens.navigation.NavigationSettingsFragment;
import com.roadrunner.sidemenu.photoId.preview.PhotoIdPreviewFragment;
import com.roadrunner.sidemenu.presentation.SideMenuFragment;
import com.roadrunner.startworking.data.StartWorkingRepository$startWorking$2;
import com.roadrunner.startworking.equipment.EquipmentBottomSheet;
import com.roadrunner.startworking.oneclick.OneClickStartWorkingFragment;
import com.roadrunner.vendor.review.data.cache.VendorReviewConfigCache;
import com.roadrunner.vendor.review.data.cache.VendorReviewConfigCache$set$2;
import com.roadrunner.vendor.review.presentation.VendorReviewFragment;
import com.roadrunner.web.presentation.authWebView.AuthWebFragment;
import com.roadrunner.web.presentation.hiring.RiderHiringWebViewFragment;
import com.roadrunner.web.presentation.simpleWebView.SimpleWebViewFragment;
import com.ui.common.widget.message_dialog.MessageDialogFragment;
import io.sentry.SentryOptions;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import io.sentry.android.replay.util.MediaBrowserCompatMediaItem;
import io.sentry.android.replay.util.MediaMetadataCompat;
import io.sentry.android.replay.video.IconCompatParcelizer;
import io.sentry.android.replay.video.RemoteActionCompatParcelizer;
import io.sentry.android.replay.video.write;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.time.Clock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.AnimatedEnterExitMeasurePolicy;
import o.BrazeExternalSyntheticLambda5;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.FocusOwnerImplKt;
import o.FwFClientbootstrapIfNeeded1;
import o.MutationInterruptedException;
import o.PreviewDelayWhenVideoCaptureIsBoundQuirk;
import o.PreviewGreenTintQuirk;
import o.ShortNewsContentCardView;
import o.accessgetInstancedelegatecp;
import o.accessrunAnimations;
import o.addSerializedCardJsonToStorageandroid_sdk_base_release;
import o.animateOneFrame;
import o.applyPendingRuntimeConfigurationandroid_sdk_base_release;
import o.computeLeftimplui;
import o.computeRightimplui;
import o.constructJsonArray;
import o.createFromParcel;
import o.getColorIntegerOrNull;
import o.getContentCardUnviewedCount;
import o.getContentCardsLastUpdatedInSecondsFromEpoch;
import o.getFailureMessage;
import o.getGlobalParameters;
import o.getNavigationIcon;
import o.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION;
import o.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_COLOR;
import o.getStartXimpl;
import o.getStartYimpl;
import o.getTextHandleMove5zf0vsI;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isItemDismissable;
import o.isVerticalSwipeInAllowedDirection;
import o.mergeJsonObjects;
import o.onContentCardDismissed;
import o.onItemDismiss;
import o.onUncaughtException;
import o.onViewDetachedFromWindowlambda0;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.resetTransientState;
import o.resizeGraphicFrameIfAppropriate;
import o.seekTo;
import o.setEmail;
import o.setInflatedId;
import o.setUnregisteredInAppMessage;
import o.transferSessionPackageI;
import o.unregisterInAppMessageManager;
import o.updateValuesIJZedt4animation_core;
import o.waitForUserDependencyThreadlambda1;
import okhttp3.FormBody;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class E$b implements FocusOwnerImplKt, r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34, getGlobalParameters {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public Object IconCompatParcelizer;
    public Object MediaBrowserCompatMediaItem;
    public Object MediaDescriptionCompat;
    public Object MediaMetadataCompat;
    public Object RemoteActionCompatParcelizer;
    public Object read;
    public final /* synthetic */ int serializer;
    public Object write;

    public E$b(SentryOptions sentryOptions, IconCompatParcelizer iconCompatParcelizer) throws IOException {
        MediaCodec mediaCodecCreateEncoderByType;
        this.serializer = 17;
        sentryOptions.getClass();
        this.read = sentryOptions;
        this.RemoteActionCompatParcelizer = iconCompatParcelizer;
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.NONE;
        if (((Boolean) LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, RemoteActionCompatParcelizer.read).MediaSessionCompatResultReceiverWrapper()).booleanValue()) {
            mediaCodecCreateEncoderByType = MediaCodec.createByCodecName("c2.android.avc.encoder");
            int i = RatingCompat + 89;
            MediaSessionCompatQueueItem = i % Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 2 / 5;
            } else {
                int i3 = 2 % 2;
            }
        } else {
            mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(iconCompatParcelizer.IconCompatParcelizer);
        }
        mediaCodecCreateEncoderByType.getClass();
        this.IconCompatParcelizer = mediaCodecCreateEncoderByType;
        this.MediaDescriptionCompat = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new FwFClientbootstrapIfNeeded1(15, this));
        this.MediaBrowserCompatMediaItem = new MediaCodec.BufferInfo();
        String absolutePath = iconCompatParcelizer.RemoteActionCompatParcelizer.getAbsolutePath();
        absolutePath.getClass();
        this.write = new write(absolutePath, iconCompatParcelizer.serializer);
        int i4 = MediaSessionCompatQueueItem + 71;
        RatingCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public getStartXimpl IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompat + 37;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getStartXimpl getstartximpl = (getStartXimpl) ((onUncaughtException) this.write).write();
        int i4 = RatingCompat + 115;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 85 / 0;
        }
        return getstartximpl;
    }

    public computeRightimplui MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 69;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        computeRightimplui computerightimplui = (computeRightimplui) ((onUncaughtException) this.MediaDescriptionCompat).write();
        int i4 = MediaSessionCompatQueueItem + 31;
        RatingCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return computerightimplui;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public computeLeftimplui MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = RatingCompat + 65;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        computeLeftimplui computeleftimplui = (computeLeftimplui) ((onUncaughtException) this.MediaBrowserCompatMediaItem).write();
        int i4 = MediaSessionCompatQueueItem + 85;
        RatingCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return computeleftimplui;
        }
        throw null;
    }

    public getStartYimpl RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 103;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (getStartYimpl) ((onUncaughtException) this.MediaMetadataCompat).write();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void handlerError(BillingServiceError billingServiceError) {
        int i;
        int i2 = 2 % 2;
        BillingServiceErrorCode code = billingServiceError.getCode();
        if (code == null) {
            int i3 = MediaSessionCompatQueueItem;
            int i4 = i3 + 95;
            RatingCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = i3 + 13;
            RatingCompat = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i = -1;
        } else {
            i = BillingController$WhenMappings.$EnumSwitchMapping$0[code.ordinal()];
        }
        if (i == -1) {
            throw new IllegalArgumentException(billingServiceError.toString());
        }
        int i8 = RatingCompat + 7;
        int i9 = i8 % Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i9;
        int i10 = i8 % 2;
        if (i != 1) {
            int i11 = i9 + 39;
            RatingCompat = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                if (i != 4) {
                    return;
                }
            } else if (i != 2) {
                return;
            }
        }
        String string = billingServiceError.toString();
        string.getClass();
        LoggerProviderKt.logW(string, "BillingController");
    }

    @Override // o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34
    public void inject(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 93;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        SettingsActivity settingsActivity = (SettingsActivity) obj;
        ((PushMessagesActivity) settingsActivity).PlaybackStateCompatCustomAction = (getTextHandleMove5zf0vsI) ((mergeJsonObjects) this.IconCompatParcelizer).write();
        getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation = (getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.read;
        ((PushMessagesActivity) settingsActivity).MediaSessionCompatToken = getstyleable_vector_drawable_group_rotation.addOnPictureInPictureModeChangedListener();
        ((PushMessagesActivity) settingsActivity).RatingCompat = getstyleable_vector_drawable_group_rotation.MediaBrowserCompatMediaItem();
        ((PushMessagesInjectionActivity) settingsActivity).MediaSessionCompatResultReceiverWrapper = read();
        settingsActivity.MediaSessionCompatQueueItem = getstyleable_vector_drawable_group_rotation.PlaybackStateCompat();
        settingsActivity.MediaBrowserCompatMediaItem = getstyleable_vector_drawable_group_rotation.MediaSessionCompatQueueItem();
        int i4 = RatingCompat + 47;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public void MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 89;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        MediaCodec mediaCodec = (MediaCodec) this.IconCompatParcelizer;
        try {
            RemoteActionCompatParcelizer(true);
            mediaCodec.stop();
            mediaCodec.release();
            Surface surface = (Surface) this.MediaMetadataCompat;
            if (surface != null) {
                int i4 = RatingCompat + 55;
                MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    surface.release();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                surface.release();
            }
            MediaMuxer mediaMuxer = ((write) this.write).IconCompatParcelizer;
            mediaMuxer.stop();
            mediaMuxer.release();
        } catch (Throwable th) {
            ((SentryOptions) this.read).getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Failed to properly release video encoder", th);
        }
    }

    public setEmail write() {
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 87;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (((String) this.read) == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'session_id' is missing");
            return null;
        }
        int i5 = i2 + 93;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        if (((Long) this.MediaMetadataCompat) == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'start_time' is missing");
            return null;
        }
        if (((Long) this.RemoteActionCompatParcelizer) == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'stop_time' is missing");
            return null;
        }
        int i7 = i2 + 39;
        int i8 = i7 % Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i8;
        int i9 = i7 % 2;
        if (((Short) this.IconCompatParcelizer) == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'chunk_sequence_number' is missing");
            return null;
        }
        int i10 = i8 + 95;
        RatingCompat = i10 % Fields.SpotShadowColor;
        int i11 = i10 % 2;
        if (((Boolean) this.MediaDescriptionCompat) != null) {
            return new setEmail(this);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'is_last_chunk' is missing");
        return null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 33;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this.serializer != 7) {
            String string = super.toString();
            int i4 = RatingCompat + 117;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return string;
        }
        StringBuilder sb = new StringBuilder("SignMessageReq{method='");
        sb.append((String) this.read);
        sb.append("', query='");
        sb.append((String) this.RemoteActionCompatParcelizer);
        sb.append("', payload='");
        sb.append((String) this.IconCompatParcelizer);
        sb.append("', url='");
        sb.append((String) this.MediaBrowserCompatMediaItem);
        sb.append("', tid='");
        return ff$$ExternalSyntheticOutline0.m(sb, (String) this.write, "'}");
    }

    public static ArrayList getNonServerAddedWaypointsOnRoute(NavigationRoute navigationRoute, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int i = 2 % 2;
        navigationRoute.getClass();
        ArrayList arrayList = navigationRoute.nativeWaypoints;
        List listSerializer = onContentCardDismissed.serializer(arrayList, ((Number) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(arrayList)).intValue());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listSerializer.iterator();
        int i2 = MediaSessionCompatQueueItem + 107;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        while (!(!it.hasNext())) {
            Object next = it.next();
            Waypoint waypoint = (Waypoint) next;
            waypoint.getClass();
            if (waypoint.internalType != Waypoint.InternalType.EvChargingServer) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (!(!it2.hasNext())) {
            arrayList3.add(((Waypoint) it2.next()).location);
            int i4 = RatingCompat + 109;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 5 % 2;
            }
        }
        return arrayList3;
    }

    public /* synthetic */ E$b(int i) {
        this.serializer = i;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    /* JADX WARN: Code duplicated, block: B:18:0x0055  */
    public void write(Bitmap bitmap) {
        Surface surface;
        Canvas canvasLockCanvas;
        int i = 2 % 2;
        String str = Build.MANUFACTURER;
        str.getClass();
        Object obj = null;
        if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str, (CharSequence) Constants.REFERRER_API_XIAOMI, true) || hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str, (CharSequence) "motorola", true)) {
            surface = (Surface) this.MediaMetadataCompat;
            if (surface != null) {
                int i2 = RatingCompat + 31;
                MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                canvasLockCanvas = surface.lockCanvas(null);
            } else {
                int i4 = MediaSessionCompatQueueItem + 99;
                RatingCompat = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                canvasLockCanvas = null;
            }
        } else {
            MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem.SOC_MANUFACTURER;
            if (MediaMetadataCompat.RemoteActionCompatParcelizer(mediaBrowserCompatMediaItem).equalsIgnoreCase("spreadtrum") || MediaMetadataCompat.RemoteActionCompatParcelizer(mediaBrowserCompatMediaItem).equalsIgnoreCase("unisoc")) {
                surface = (Surface) this.MediaMetadataCompat;
                if (surface != null) {
                    int i6 = RatingCompat + 31;
                    MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    canvasLockCanvas = surface.lockCanvas(null);
                } else {
                    int i8 = MediaSessionCompatQueueItem + 99;
                    RatingCompat = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    canvasLockCanvas = null;
                }
            } else {
                Surface surface2 = (Surface) this.MediaMetadataCompat;
                if (surface2 != null) {
                    canvasLockCanvas = surface2.lockHardwareCanvas();
                } else {
                    int i10 = MediaSessionCompatQueueItem + 99;
                    RatingCompat = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    canvasLockCanvas = null;
                }
            }
        }
        if (canvasLockCanvas != null) {
            canvasLockCanvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        Surface surface3 = (Surface) this.MediaMetadataCompat;
        if (surface3 != null) {
            surface3.unlockCanvasAndPost(canvasLockCanvas);
        }
        RemoteActionCompatParcelizer(false);
        int i12 = MediaSessionCompatQueueItem + 25;
        RatingCompat = i12 % Fields.SpotShadowColor;
        if (i12 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ E$b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.serializer = i;
        this.read = obj;
        this.RemoteActionCompatParcelizer = obj2;
        this.IconCompatParcelizer = obj3;
        this.MediaDescriptionCompat = obj4;
        this.MediaBrowserCompatMediaItem = obj5;
        this.write = obj6;
        this.MediaMetadataCompat = obj7;
    }

    public E$b() {
        this.serializer = 4;
        this.read = new AtomicBoolean();
        this.RemoteActionCompatParcelizer = null;
        this.IconCompatParcelizer = new HashMap(16, 1.0f);
        this.MediaDescriptionCompat = new HashMap(16, 1.0f);
        this.MediaBrowserCompatMediaItem = new HashMap(16, 1.0f);
        this.write = new HashMap(16, 1.0f);
        this.MediaMetadataCompat = null;
    }

    public E$b(transferSessionPackageI transfersessionpackagei, r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny, r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny2, r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny3, r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny4, FormBody.Builder builder, r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny5) {
        this.serializer = 10;
        transfersessionpackagei.getClass();
        this.read = transfersessionpackagei;
        this.RemoteActionCompatParcelizer = r8lambdaudhhxliolpu0hpccqh6voskpny;
        this.IconCompatParcelizer = r8lambdaudhhxliolpu0hpccqh6voskpny2;
        this.MediaDescriptionCompat = r8lambdaudhhxliolpu0hpccqh6voskpny3;
        this.MediaBrowserCompatMediaItem = r8lambdaudhhxliolpu0hpccqh6voskpny4;
        this.write = builder;
        this.MediaMetadataCompat = r8lambdaudhhxliolpu0hpccqh6voskpny5;
    }

    public E$b(Vw$Vw vw$Vw, SignInDataStore signInDataStore, n0 n0Var, H$b h$b, m mVar, BlockRunner blockRunner, Parser.Pair pair) {
        this.serializer = 9;
        vw$Vw.getClass();
        signInDataStore.getClass();
        n0Var.getClass();
        h$b.getClass();
        mVar.getClass();
        blockRunner.getClass();
        pair.getClass();
        this.read = vw$Vw;
        this.RemoteActionCompatParcelizer = signInDataStore;
        this.IconCompatParcelizer = n0Var;
        this.MediaDescriptionCompat = h$b;
        this.MediaBrowserCompatMediaItem = mVar;
        this.write = blockRunner;
        this.MediaMetadataCompat = pair;
    }

    public E$b(waitForUserDependencyThreadlambda1 waitforuserdependencythreadlambda1, VendorReviewConfigCache vendorReviewConfigCache, Clock clock, ExecuteApiRequest executeApiRequest, WorkManagerImpl workManagerImpl, BrazeExternalSyntheticLambda5 brazeExternalSyntheticLambda5, transferSessionPackageI transfersessionpackagei) {
        this.serializer = 12;
        waitforuserdependencythreadlambda1.getClass();
        vendorReviewConfigCache.getClass();
        clock.getClass();
        executeApiRequest.getClass();
        workManagerImpl.getClass();
        brazeExternalSyntheticLambda5.getClass();
        transfersessionpackagei.getClass();
        this.read = waitforuserdependencythreadlambda1;
        this.RemoteActionCompatParcelizer = vendorReviewConfigCache;
        this.IconCompatParcelizer = clock;
        this.MediaDescriptionCompat = executeApiRequest;
        this.MediaBrowserCompatMediaItem = workManagerImpl;
        this.write = brazeExternalSyntheticLambda5;
        this.MediaMetadataCompat = transfersessionpackagei;
    }

    public void beginBillingSession(SessionSKUIdentifier sessionSKUIdentifier, long j, String str) {
        int i = 2 % 2;
        int i2 = RatingCompat + 13;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        AnalyticsServiceImpl analyticsServiceImpl = (AnalyticsServiceImpl) this.MediaBrowserCompatMediaItem;
        SessionSKUIdentifier runningOrPausedSessionSkuId = getRunningOrPausedSessionSkuId();
        if (runningOrPausedSessionSkuId != null) {
            ((BillingService) analyticsServiceImpl.locationProvider).stopBillingSession(runningOrPausedSessionSkuId);
            if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.INFO)) {
                LoggerProviderKt.logI(zzdr.access$getPublicName(runningOrPausedSessionSkuId) + " has been stopped because " + str, "BillingExplanation");
            }
        }
        ((BillingService) analyticsServiceImpl.locationProvider).beginBillingSession((SdkInformation) this.MediaDescriptionCompat, sessionSKUIdentifier, new Snapshotter$$ExternalSyntheticLambda0(16, this), j);
        if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.INFO)) {
            LoggerProviderKt.logI(zzdr.access$getPublicName(sessionSKUIdentifier) + " has been started because " + str, "BillingExplanation");
            int i4 = RatingCompat + 95;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 3 / 2;
            }
        }
    }

    public SessionSKUIdentifier getRunningOrPausedSessionSkuId() {
        int i = 2 % 2;
        List<SessionSKUIdentifier> list = SQLite.read(SessionSKUIdentifier.NAV3_SES_CORE_AGTRIP, SessionSKUIdentifier.NAV3_SES_CORE_FDTRIP);
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        for (SessionSKUIdentifier sessionSKUIdentifier : list) {
            BillingSessionStatus sessionStatus = ((BillingService) ((AnalyticsServiceImpl) this.MediaBrowserCompatMediaItem).locationProvider).getSessionStatus(sessionSKUIdentifier);
            sessionStatus.getClass();
            arrayList.add(new BillingController$getRunningOrPausedSessionSkuId$SkuSessionStatus(sessionSKUIdentifier, sessionStatus));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            int i2 = RatingCompat + 47;
            MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            if (((BillingController$getRunningOrPausedSessionSkuId$SkuSessionStatus) obj).status != BillingSessionStatus.NO_SESSION) {
                arrayList2.add(obj);
                int i4 = RatingCompat + 61;
                MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    int i5 = 4 % 5;
                }
            }
        }
        if (arrayList2.size() <= 1) {
            BillingController$getRunningOrPausedSessionSkuId$SkuSessionStatus billingController$getRunningOrPausedSessionSkuId$SkuSessionStatus = (BillingController$getRunningOrPausedSessionSkuId$SkuSessionStatus) onContentCardDismissed.MediaMetadataCompat((List) arrayList2);
            if (billingController$getRunningOrPausedSessionSkuId$SkuSessionStatus != null) {
                return billingController$getRunningOrPausedSessionSkuId$SkuSessionStatus.skuId;
            }
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(arrayList, "More than one session is active or paused: ");
        return null;
    }

    public E$b(NavigationSession navigationSession, ArrivalProgressObserver arrivalProgressObserver, MapboxTripSession mapboxTripSession, n0 n0Var, SdkInformation sdkInformation) {
        this.serializer = 8;
        this.read = navigationSession;
        this.RemoteActionCompatParcelizer = arrivalProgressObserver;
        this.IconCompatParcelizer = mapboxTripSession;
        this.MediaDescriptionCompat = sdkInformation;
        BillingService billingServiceFactory = BillingServiceFactory.getInstance();
        billingServiceFactory.getClass();
        this.MediaBrowserCompatMediaItem = new AnalyticsServiceImpl(2, billingServiceFactory);
        BillingController$$ExternalSyntheticLambda1 billingController$$ExternalSyntheticLambda1 = new BillingController$$ExternalSyntheticLambda1(0, this);
        this.write = billingController$$ExternalSyntheticLambda1;
        BillingController$arrivalObserver$1 billingController$arrivalObserver$1 = new BillingController$arrivalObserver$1(0, this);
        this.MediaMetadataCompat = billingController$arrivalObserver$1;
        navigationSession.stateObservers.add(billingController$$ExternalSyntheticLambda1);
        billingController$$ExternalSyntheticLambda1.onNavigationSessionStateChanged(navigationSession.state);
        arrivalProgressObserver.arrivalObservers.add(billingController$arrivalObserver$1);
    }

    @Override // o.FocusOwnerImplKt
    public Object serializer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 77;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        AnimatedEnterExitMeasurePolicy animatedEnterExitMeasurePolicy = (AnimatedEnterExitMeasurePolicy) this.IconCompatParcelizer;
        MutationInterruptedException mutationInterruptedException = accessrunAnimations.read(animatedEnterExitMeasurePolicy, (Range) this.MediaMetadataCompat);
        setInflatedId.IconCompatParcelizer(3, "VidEncVdPrflRslvr");
        Range range = animatedEnterExitMeasurePolicy.read;
        setInflatedId.IconCompatParcelizer(3, "VidEncVdPrflRslvr");
        PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk = (PreviewDelayWhenVideoCaptureIsBoundQuirk) this.MediaBrowserCompatMediaItem;
        int i4 = previewDelayWhenVideoCaptureIsBoundQuirk.write;
        int i5 = ((getNavigationIcon) this.write).MediaBrowserCompatMediaItem;
        int i6 = previewDelayWhenVideoCaptureIsBoundQuirk.serializer;
        int i7 = mutationInterruptedException.serializer;
        int i8 = previewDelayWhenVideoCaptureIsBoundQuirk.RemoteActionCompatParcelizer;
        Size size = (Size) this.MediaDescriptionCompat;
        int i9 = accessrunAnimations.read(i4, i5, i6, i7, i8, size.getWidth(), previewDelayWhenVideoCaptureIsBoundQuirk.MediaDescriptionCompat, size.getHeight(), previewDelayWhenVideoCaptureIsBoundQuirk.MediaMetadataCompat, range);
        int i10 = previewDelayWhenVideoCaptureIsBoundQuirk.MediaBrowserCompatMediaItem;
        String str = (String) this.read;
        updateValuesIJZedt4animation_core updatevaluesijzedt4animation_coreSerializer = accessrunAnimations.serializer(i10, str);
        seekTo seektoSerializer = animateOneFrame.serializer();
        seektoSerializer.MediaBrowserCompatMediaItem = str;
        PreviewGreenTintQuirk previewGreenTintQuirk = (PreviewGreenTintQuirk) this.RemoteActionCompatParcelizer;
        if (previewGreenTintQuirk == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null inputTimebase");
            int i11 = MediaSessionCompatQueueItem + 1;
            RatingCompat = i11 % Fields.SpotShadowColor;
            Object obj = null;
            if (i11 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        int i12 = RatingCompat + 47;
        MediaSessionCompatQueueItem = i12 % Fields.SpotShadowColor;
        int i13 = i12 % 2;
        seektoSerializer.MediaMetadataCompat = previewGreenTintQuirk;
        seektoSerializer.RatingCompat = size;
        seektoSerializer.serializer = Integer.valueOf(i9);
        seektoSerializer.read = Integer.valueOf(mutationInterruptedException.IconCompatParcelizer);
        seektoSerializer.MediaDescriptionCompat = Integer.valueOf(mutationInterruptedException.serializer);
        seektoSerializer.MediaSessionCompatQueueItem = Integer.valueOf(i10);
        seektoSerializer.write = updatevaluesijzedt4animation_coreSerializer;
        animateOneFrame animateoneframeRemoteActionCompatParcelizer = seektoSerializer.RemoteActionCompatParcelizer();
        int i14 = RatingCompat + 87;
        MediaSessionCompatQueueItem = i14 % Fields.SpotShadowColor;
        int i15 = i14 % 2;
        return animateoneframeRemoteActionCompatParcelizer;
    }

    public E$b(getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation) {
        this.serializer = 3;
        this.RemoteActionCompatParcelizer = this;
        this.read = getstyleable_vector_drawable_group_rotation;
        this.IconCompatParcelizer = getColorIntegerOrNull.IconCompatParcelizer(new getFailureMessage(getstyleable_vector_drawable_group_rotation.getAccessibilityClassName, getstyleable_vector_drawable_group_rotation.reset, getstyleable_vector_drawable_group_rotation.MutatorMutexmutate2, getstyleable_vector_drawable_group_rotation.TapGestureDetectorKtawaitSecondDown2, 1));
        this.MediaDescriptionCompat = new getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_COLOR(this, 0);
        this.MediaBrowserCompatMediaItem = new getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_COLOR(this, 1);
        this.write = new getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_COLOR(this, 2);
        this.MediaMetadataCompat = new getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_COLOR(this, 3);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    /* JADX WARN: Code duplicated, block: B:40:0x010e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0145  */
    /* JADX WARN: Code duplicated, block: B:46:0x014a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x014b  */
    /* JADX WARN: Code duplicated, block: B:49:0x015a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0166 A[RETURN] */
    public Object fetchVendorReviewConfig(getContentCardUnviewedCount getcontentcardunviewedcount, ContinuationImpl continuationImpl) {
        applyPendingRuntimeConfigurationandroid_sdk_base_release applypendingruntimeconfigurationandroid_sdk_base_release;
        getContentCardUnviewedCount getcontentcardunviewedcount2;
        addSerializedCardJsonToStorageandroid_sdk_base_release addserializedcardjsontostorageandroid_sdk_base_release;
        Object obj;
        getContentCardsLastUpdatedInSecondsFromEpoch getcontentcardslastupdatedinsecondsfromepoch;
        Object objSerializer;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = MediaSessionCompatQueueItem + 67;
        RatingCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        Clock clock = (Clock) this.IconCompatParcelizer;
        VendorReviewConfigCache vendorReviewConfigCache = (VendorReviewConfigCache) this.RemoteActionCompatParcelizer;
        if (continuationImpl instanceof applyPendingRuntimeConfigurationandroid_sdk_base_release) {
            applypendingruntimeconfigurationandroid_sdk_base_release = (applyPendingRuntimeConfigurationandroid_sdk_base_release) continuationImpl;
            int i5 = applypendingruntimeconfigurationandroid_sdk_base_release.write;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                int i6 = RatingCompat + 49;
                MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
                applypendingruntimeconfigurationandroid_sdk_base_release.write = i6 % 2 == 0 ? i5 * Integer.MIN_VALUE : i5 - Integer.MIN_VALUE;
            } else {
                applypendingruntimeconfigurationandroid_sdk_base_release = new applyPendingRuntimeConfigurationandroid_sdk_base_release(this, continuationImpl);
            }
        } else {
            applypendingruntimeconfigurationandroid_sdk_base_release = new applyPendingRuntimeConfigurationandroid_sdk_base_release(this, continuationImpl);
        }
        Object objFirst = applypendingruntimeconfigurationandroid_sdk_base_release.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = applypendingruntimeconfigurationandroid_sdk_base_release.write;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objFirst);
            Flow flowSerializer = FlowKt.serializer(new SettingsViewModel$special$$inlined$map$1(vendorReviewConfigCache.RemoteActionCompatParcelizer.serializer(), 21, vendorReviewConfigCache));
            getcontentcardunviewedcount2 = getcontentcardunviewedcount;
            applypendingruntimeconfigurationandroid_sdk_base_release.serializer = getcontentcardunviewedcount2;
            applypendingruntimeconfigurationandroid_sdk_base_release.write = 1;
            objFirst = FlowKt.first(flowSerializer, applypendingruntimeconfigurationandroid_sdk_base_release);
            if (objFirst != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        int i8 = MediaSessionCompatQueueItem + 95;
        RatingCompat = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        if (i7 == 1) {
            getcontentcardunviewedcount2 = applypendingruntimeconfigurationandroid_sdk_base_release.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(objFirst);
        } else {
            if (i7 != 2) {
                if (i7 != 3) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                getContentCardsLastUpdatedInSecondsFromEpoch getcontentcardslastupdatedinsecondsfromepoch2 = applypendingruntimeconfigurationandroid_sdk_base_release.read;
                ExtrasKt.RemoteActionCompatParcelizer(objFirst);
                return getcontentcardslastupdatedinsecondsfromepoch2;
            }
            addserializedcardjsontostorageandroid_sdk_base_release = applypendingruntimeconfigurationandroid_sdk_base_release.RemoteActionCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(objFirst);
            obj = ((onItemDismiss) objFirst).IconCompatParcelizer;
        }
        if (!(obj instanceof isItemDismissable)) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(onItemDismiss.serializer(obj), "VendorReviewRepository: Failed to fetch vendor review config", new Object[0]);
            if (addserializedcardjsontostorageandroid_sdk_base_release != null) {
                return null;
            }
            int i10 = RatingCompat + 3;
            MediaSessionCompatQueueItem = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return addserializedcardjsontostorageandroid_sdk_base_release.serializer;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        getcontentcardslastupdatedinsecondsfromepoch = (getContentCardsLastUpdatedInSecondsFromEpoch) obj;
        long jMillis = clock.millis();
        applypendingruntimeconfigurationandroid_sdk_base_release.serializer = null;
        applypendingruntimeconfigurationandroid_sdk_base_release.RemoteActionCompatParcelizer = null;
        applypendingruntimeconfigurationandroid_sdk_base_release.read = getcontentcardslastupdatedinsecondsfromepoch;
        applypendingruntimeconfigurationandroid_sdk_base_release.write = 3;
        vendorReviewConfigCache.getClass();
        isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
        isverticalswipeinalloweddirection.getClass();
        objSerializer = pauseWebviewIfNecessarylambda10.serializer(vendorReviewConfigCache.RemoteActionCompatParcelizer, new VendorReviewConfigCache$set$2(vendorReviewConfigCache, isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(getContentCardsLastUpdatedInSecondsFromEpoch.Companion.serializer(), getcontentcardslastupdatedinsecondsfromepoch), jMillis, (ShortNewsContentCardView) null), applypendingruntimeconfigurationandroid_sdk_base_release);
        if (objSerializer != coroutineSingletons) {
            objSerializer = createFromParcel.INSTANCE;
        }
        if (objSerializer != coroutineSingletons) {
            return coroutineSingletons;
        }
        return getcontentcardslastupdatedinsecondsfromepoch;
        addSerializedCardJsonToStorageandroid_sdk_base_release addserializedcardjsontostorageandroid_sdk_base_release2 = (addSerializedCardJsonToStorageandroid_sdk_base_release) objFirst;
        if (addserializedcardjsontostorageandroid_sdk_base_release2 != null) {
            getContentCardsLastUpdatedInSecondsFromEpoch getcontentcardslastupdatedinsecondsfromepoch3 = addserializedcardjsontostorageandroid_sdk_base_release2.serializer;
            long j = addserializedcardjsontostorageandroid_sdk_base_release2.read;
            long jWrite = ((FirebaseRemoteConfigImpl) ((transferSessionPackageI) this.MediaMetadataCompat)).IconCompatParcelizer.write("vendor_review_config_cache_ttl_minutes");
            unregisterInAppMessageManager unregisterinappmessagemanager = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
            if (clock.millis() - j < BrazeInAppMessageManagerExternalSyntheticLambda2.write(UriKt.IconCompatParcelizer(jWrite, setUnregisteredInAppMessage.MINUTES))) {
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("VendorReviewRepository: Using cached vendor review config: " + getcontentcardslastupdatedinsecondsfromepoch3, new Object[0]);
                return getcontentcardslastupdatedinsecondsfromepoch3;
            }
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("VendorReviewRepository: Cached vendor review config is expired: " + getcontentcardslastupdatedinsecondsfromepoch3, new Object[0]);
        }
        ExecuteApiRequest executeApiRequest = (ExecuteApiRequest) this.MediaDescriptionCompat;
        StartWorkingRepository$startWorking$2 startWorkingRepository$startWorking$2 = new StartWorkingRepository$startWorking$2(this, getcontentcardunviewedcount2, shortNewsContentCardView, i);
        applypendingruntimeconfigurationandroid_sdk_base_release.serializer = null;
        applypendingruntimeconfigurationandroid_sdk_base_release.RemoteActionCompatParcelizer = addserializedcardjsontostorageandroid_sdk_base_release2;
        applypendingruntimeconfigurationandroid_sdk_base_release.write = 2;
        Object objM4875invokegIAlus = executeApiRequest.m4875invokegIAlus(startWorkingRepository$startWorking$2, applypendingruntimeconfigurationandroid_sdk_base_release);
        if (objM4875invokegIAlus != coroutineSingletons) {
            addserializedcardjsontostorageandroid_sdk_base_release = addserializedcardjsontostorageandroid_sdk_base_release2;
            obj = objM4875invokegIAlus;
            if (!(obj instanceof isItemDismissable)) {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(onItemDismiss.serializer(obj), "VendorReviewRepository: Failed to fetch vendor review config", new Object[0]);
                if (addserializedcardjsontostorageandroid_sdk_base_release != null) {
                    return null;
                }
                int i12 = RatingCompat + 3;
                MediaSessionCompatQueueItem = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                return addserializedcardjsontostorageandroid_sdk_base_release.serializer;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getcontentcardslastupdatedinsecondsfromepoch = (getContentCardsLastUpdatedInSecondsFromEpoch) obj;
            long jMillis2 = clock.millis();
            applypendingruntimeconfigurationandroid_sdk_base_release.serializer = null;
            applypendingruntimeconfigurationandroid_sdk_base_release.RemoteActionCompatParcelizer = null;
            applypendingruntimeconfigurationandroid_sdk_base_release.read = getcontentcardslastupdatedinsecondsfromepoch;
            applypendingruntimeconfigurationandroid_sdk_base_release.write = 3;
            vendorReviewConfigCache.getClass();
            isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection2 = resetTransientState.read;
            isverticalswipeinalloweddirection2.getClass();
            objSerializer = pauseWebviewIfNecessarylambda10.serializer(vendorReviewConfigCache.RemoteActionCompatParcelizer, new VendorReviewConfigCache$set$2(vendorReviewConfigCache, isverticalswipeinalloweddirection2.RemoteActionCompatParcelizer(getContentCardsLastUpdatedInSecondsFromEpoch.Companion.serializer(), getcontentcardslastupdatedinsecondsfromepoch), jMillis2, (ShortNewsContentCardView) null), applypendingruntimeconfigurationandroid_sdk_base_release);
            if (objSerializer != coroutineSingletons) {
                objSerializer = createFromParcel.INSTANCE;
            }
            if (objSerializer != coroutineSingletons) {
                return getcontentcardslastupdatedinsecondsfromepoch;
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public void RemoteActionCompatParcelizer(boolean z) {
        boolean z2;
        int i = 2 % 2;
        write writeVar = (write) this.write;
        MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) this.MediaBrowserCompatMediaItem;
        MediaCodec mediaCodec = (MediaCodec) this.IconCompatParcelizer;
        SentryOptions sentryOptions = (SentryOptions) this.read;
        int i2 = 0;
        if (sentryOptions.getSessionReplay().RemoteActionCompatParcelizer) {
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "[Encoder]: drainCodec(" + z + ')', new Object[0]);
        }
        int i3 = 1;
        if (z) {
            if (!(!sentryOptions.getSessionReplay().RemoteActionCompatParcelizer)) {
                sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "[Encoder]: sending EOS to encoder", new Object[0]);
            }
            mediaCodec.signalEndOfInputStream();
        }
        ByteBuffer[] outputBuffers = mediaCodec.getOutputBuffers();
        while (true) {
            int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 100000L);
            if (iDequeueOutputBuffer != -1) {
                Object obj = null;
                if (iDequeueOutputBuffer == -3) {
                    int i4 = MediaSessionCompatQueueItem + 89;
                    RatingCompat = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 != 0) {
                        mediaCodec.getOutputBuffers();
                        obj.hashCode();
                        throw null;
                    }
                    outputBuffers = mediaCodec.getOutputBuffers();
                } else if (iDequeueOutputBuffer == -2) {
                    int i5 = RatingCompat + 23;
                    MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        boolean z3 = writeVar.RemoteActionCompatParcelizer;
                        throw null;
                    }
                    if (writeVar.RemoteActionCompatParcelizer) {
                        ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("format changed twice");
                        return;
                    }
                    MediaFormat outputFormat = mediaCodec.getOutputFormat();
                    outputFormat.getClass();
                    if (sentryOptions.getSessionReplay().RemoteActionCompatParcelizer) {
                        sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "[Encoder]: encoder output format changed: " + outputFormat, new Object[i2]);
                    }
                    MediaMuxer mediaMuxer = writeVar.IconCompatParcelizer;
                    writeVar.RatingCompat = mediaMuxer.addTrack(outputFormat);
                    mediaMuxer.start();
                    writeVar.RemoteActionCompatParcelizer = i3;
                } else {
                    if (iDequeueOutputBuffer >= 0) {
                        if (outputBuffers != null) {
                            int i6 = MediaSessionCompatQueueItem;
                            int i7 = i6 + 89;
                            RatingCompat = i7 % Fields.SpotShadowColor;
                            int i8 = i7 % 2;
                            ByteBuffer byteBuffer = outputBuffers[iDequeueOutputBuffer];
                            if (byteBuffer != null) {
                                int i9 = i6 + 57;
                                RatingCompat = i9 % Fields.SpotShadowColor;
                                if (i9 % 2 == 0 ? (bufferInfo.flags & 2) != 0 : (bufferInfo.flags & 2) != 0) {
                                    if (sentryOptions.getSessionReplay().RemoteActionCompatParcelizer) {
                                        sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "[Encoder]: ignoring BUFFER_FLAG_CODEC_CONFIG", new Object[i2]);
                                    }
                                    bufferInfo.size = i2;
                                }
                                if (bufferInfo.size == 0) {
                                    z2 = i2;
                                } else {
                                    if (!writeVar.RemoteActionCompatParcelizer) {
                                        ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("muxer hasn't started");
                                        int i10 = MediaSessionCompatQueueItem + 69;
                                        RatingCompat = i10 % Fields.SpotShadowColor;
                                        int i11 = i10 % 2;
                                        return;
                                    }
                                    long j = writeVar.read;
                                    int i12 = writeVar.serializer;
                                    writeVar.serializer = i12 + 1;
                                    long j2 = j * ((long) i12);
                                    writeVar.write = j2;
                                    bufferInfo.presentationTimeUs = j2;
                                    writeVar.IconCompatParcelizer.writeSampleData(writeVar.RatingCompat, byteBuffer, bufferInfo);
                                    if (sentryOptions.getSessionReplay().RemoteActionCompatParcelizer) {
                                        sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, af$$ExternalSyntheticOutline0.m(bufferInfo.size, " bytes to muxer", new StringBuilder("[Encoder]: sent ")), new Object[0]);
                                    }
                                    z2 = 0;
                                }
                                mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, z2);
                                if ((bufferInfo.flags & 4) != 0) {
                                    int i13 = RatingCompat + 75;
                                    MediaSessionCompatQueueItem = i13 % Fields.SpotShadowColor;
                                    int i14 = i13 % 2;
                                    if (!sentryOptions.getSessionReplay().RemoteActionCompatParcelizer) {
                                        return;
                                    }
                                    if (z) {
                                        sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "[Encoder]: end of stream reached", new Object[0]);
                                        return;
                                    } else {
                                        sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "[Encoder]: reached end of stream unexpectedly", new Object[0]);
                                        return;
                                    }
                                }
                                i3 = 1;
                                i2 = 0;
                            }
                        }
                        ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer(d$$ExternalSyntheticOutline0.m(iDequeueOutputBuffer, "encoderOutputBuffer ", " was null"));
                        return;
                    }
                    if (sentryOptions.getSessionReplay().RemoteActionCompatParcelizer == i3) {
                        int i15 = RatingCompat + 71;
                        MediaSessionCompatQueueItem = i15 % Fields.SpotShadowColor;
                        if (i15 % 2 == 0) {
                            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, c8$$ExternalSyntheticOutline0.m(iDequeueOutputBuffer, "[Encoder]: unexpected result from encoder.dequeueOutputBuffer: "), new Object[i3]);
                        } else {
                            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, c8$$ExternalSyntheticOutline0.m(iDequeueOutputBuffer, "[Encoder]: unexpected result from encoder.dequeueOutputBuffer: "), new Object[i2]);
                        }
                    }
                }
            } else {
                if (!z) {
                    return;
                }
                if (sentryOptions.getSessionReplay().RemoteActionCompatParcelizer) {
                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "[Encoder]: no output available, spinning to await EOS", new Object[i2]);
                }
            }
        }
    }

    public constructJsonArray read() {
        int i = 2 % 2;
        SQLite.serializer(80, "expectedSize");
        resizeGraphicFrameIfAppropriate resizegraphicframeifappropriate = new resizeGraphicFrameIfAppropriate(80);
        getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation = (getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.read;
        resizegraphicframeifappropriate.read(AccountCreationFragment.class, getstyleable_vector_drawable_group_rotation.write);
        resizegraphicframeifappropriate.read(AutoAcceptPreferencesFragment.class, getstyleable_vector_drawable_group_rotation.addOnMultiWindowModeChangedListener);
        resizegraphicframeifappropriate.read(AdjustTrueLinkBrowsableActivity.class, getstyleable_vector_drawable_group_rotation.PlaybackStateCompat);
        resizegraphicframeifappropriate.read(BiometricsActivity.class, getstyleable_vector_drawable_group_rotation.onCreate);
        resizegraphicframeifappropriate.read(BluetoothEnableDialogFragment.class, getstyleable_vector_drawable_group_rotation.onRequestPermissionsResult);
        resizegraphicframeifappropriate.read(BluetoothScanPermissionDialogFragment.class, getstyleable_vector_drawable_group_rotation.onPanelClosed);
        resizegraphicframeifappropriate.read(SelectBreakDurationFragment.class, getstyleable_vector_drawable_group_rotation.requiredSize3ABfNKs);
        resizegraphicframeifappropriate.read(RequestBreakFragment.class, getstyleable_vector_drawable_group_rotation.fling);
        resizegraphicframeifappropriate.read(MessageDialogFragment.class, getstyleable_vector_drawable_group_rotation.getMaxCardElevation);
        resizegraphicframeifappropriate.read(ContentSharingFragment.class, getstyleable_vector_drawable_group_rotation.initDelegate);
        resizegraphicframeifappropriate.read(PhotoSharedSuccessDialogFragment.class, getstyleable_vector_drawable_group_rotation.TransitionanimateTo111);
        resizegraphicframeifappropriate.read(TermsAndConditionsFragment.class, getstyleable_vector_drawable_group_rotation.TextFieldSizeNode);
        resizegraphicframeifappropriate.read(GalleryFragment.class, getstyleable_vector_drawable_group_rotation.setThumbTintMode);
        resizegraphicframeifappropriate.read(CustomPasswordActivity.class, getstyleable_vector_drawable_group_rotation.onPrepareSupportNavigateUpTaskStack);
        resizegraphicframeifappropriate.read(CustomerChatsActivity.class, getstyleable_vector_drawable_group_rotation.openOptionsMenu);
        resizegraphicframeifappropriate.read(LasagnaDeclineBottomSheet.class, getstyleable_vector_drawable_group_rotation.MediaStoreVideoCannotWrite);
        resizegraphicframeifappropriate.read(LasagnaDeclineComposeBottomSheet.class, getstyleable_vector_drawable_group_rotation.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk);
        resizegraphicframeifappropriate.read(LasagnaDeclineWithAcceptanceRateBottomSheet.class, getstyleable_vector_drawable_group_rotation.PreviewFreezeAfterHighSpeedRecordingQuirk);
        resizegraphicframeifappropriate.read(DiagnosticsActivity.class, getstyleable_vector_drawable_group_rotation.getNestedScrollAxes);
        resizegraphicframeifappropriate.read(EntrancePictureFragment.class, getstyleable_vector_drawable_group_rotation.setExpandedActionViewsExclusive);
        resizegraphicframeifappropriate.read(HelpCenterActivity.class, getstyleable_vector_drawable_group_rotation.TextureViewIsClosedQuirk);
        resizegraphicframeifappropriate.read(HistoryNavContainerFragment.class, getstyleable_vector_drawable_group_rotation.ImageCaptureMetadata);
        resizegraphicframeifappropriate.read(HistoryFragment.class, getstyleable_vector_drawable_group_rotation.CameraXExternalSyntheticLambda2);
        resizegraphicframeifappropriate.read(OrderDetailsFragment.class, getstyleable_vector_drawable_group_rotation.getValueFromNanos);
        resizegraphicframeifappropriate.read(HistoryDialogFragment.class, getstyleable_vector_drawable_group_rotation.CameraXExternalSyntheticLambda0);
        resizegraphicframeifappropriate.read(IdentityVerificationActivity.class, getstyleable_vector_drawable_group_rotation.nativeConvertAndroid420ToABGR);
        resizegraphicframeifappropriate.read(LoginActivity.class, getstyleable_vector_drawable_group_rotation.getBitmap);
        resizegraphicframeifappropriate.read(EquipmentBottomSheet.class, getstyleable_vector_drawable_group_rotation.setOverflowReserved);
        resizegraphicframeifappropriate.read(OneClickStartWorkingFragment.class, getstyleable_vector_drawable_group_rotation.getVelocityFromNanos);
        resizegraphicframeifappropriate.read(DeepLinkActivity.class, getstyleable_vector_drawable_group_rotation.ensureSubDecor);
        resizegraphicframeifappropriate.read(SettingsActivity.class, getstyleable_vector_drawable_group_rotation.LazyList);
        resizegraphicframeifappropriate.read(FullScreenDetailsFragment.class, getstyleable_vector_drawable_group_rotation.setTrackTintMode);
        resizegraphicframeifappropriate.read(HomeFragment.class, getstyleable_vector_drawable_group_rotation.ImageCapture1);
        resizegraphicframeifappropriate.read(NafathModalFragment.class, getstyleable_vector_drawable_group_rotation.setCardElevation);
        resizegraphicframeifappropriate.read(InAppCameraWithTagsFragment.class, getstyleable_vector_drawable_group_rotation.nativeShiftPixel);
        resizegraphicframeifappropriate.read(InAppNotificationsFragment.class, getstyleable_vector_drawable_group_rotation.nativeGetYUVImageVUOff);
        resizegraphicframeifappropriate.read(BookShiftConfirmationContainerFragment.class, getstyleable_vector_drawable_group_rotation.onTrimMemory);
        resizegraphicframeifappropriate.read(BookShiftConfirmationDialogFragment.class, getstyleable_vector_drawable_group_rotation.onRetainNonConfigurationInstance);
        resizegraphicframeifappropriate.read(LivenessDetectionActivity.class, getstyleable_vector_drawable_group_rotation.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk);
        resizegraphicframeifappropriate.read(GPSActivity.class, getstyleable_vector_drawable_group_rotation.setTrackTintList);
        resizegraphicframeifappropriate.read(LogoutActivity.class, getstyleable_vector_drawable_group_rotation.getOutputTransform);
        resizegraphicframeifappropriate.read(MapboxFragment.class, getstyleable_vector_drawable_group_rotation.setBrightness);
        resizegraphicframeifappropriate.read(NestFragment.class, getstyleable_vector_drawable_group_rotation.get);
        resizegraphicframeifappropriate.read(BonusCalendarFragment.class, getstyleable_vector_drawable_group_rotation.onPictureInPictureModeChanged);
        resizegraphicframeifappropriate.read(CalendarInformationFragment.class, getstyleable_vector_drawable_group_rotation.startActivityForResult);
        resizegraphicframeifappropriate.read(OverlayPermissionDialogFragment.class, getstyleable_vector_drawable_group_rotation.animateOneFrame);
        resizegraphicframeifappropriate.read(NonFloatablePermissionActivity.class, getstyleable_vector_drawable_group_rotation.MutableSetWrapperiterator1iterator1);
        resizegraphicframeifappropriate.read(PermissionActivity.class, getstyleable_vector_drawable_group_rotation.updateValuesIJZedt4animation_core);
        resizegraphicframeifappropriate.read(ContactRiderActionsFragment.class, getstyleable_vector_drawable_group_rotation.performMenuItemShortcut);
        resizegraphicframeifappropriate.read(CustomerSignatureFragment.class, getstyleable_vector_drawable_group_rotation.setSupportProgressBarIndeterminateVisibility);
        resizegraphicframeifappropriate.read(com.roadrunner.push.presentation.MessageDialogFragment.class, getstyleable_vector_drawable_group_rotation.getPreventCornerOverlap);
        resizegraphicframeifappropriate.read(RecentDeliveriesFragment.class, getstyleable_vector_drawable_group_rotation.calculateCentroid);
        resizegraphicframeifappropriate.read(RiderSafetyReportFragment.class, getstyleable_vector_drawable_group_rotation.placeSpaceEvenlyfoundation_layout);
        resizegraphicframeifappropriate.read(RiderSafetyPermissionFragment.class, getstyleable_vector_drawable_group_rotation.placeCenterfoundation_layout);
        resizegraphicframeifappropriate.read(RouterActivity.class, getstyleable_vector_drawable_group_rotation.FillNode);
        resizegraphicframeifappropriate.read(SelfServiceCustomerChatActivity.class, getstyleable_vector_drawable_group_rotation.requiredSizeInqDBjuR0default);
        resizegraphicframeifappropriate.read(PhotoIdPreviewFragment.class, getstyleable_vector_drawable_group_rotation.TransitionKtrememberTransitionlambda10inlinedonDispose1);
        resizegraphicframeifappropriate.read(SideMenuFragment.class, getstyleable_vector_drawable_group_rotation.LazyLayoutPagerKtdragDirectionDetector111);
        resizegraphicframeifappropriate.read(StackedDeliveryDetailsFragment.class, getstyleable_vector_drawable_group_rotation.bringIntoView);
        resizegraphicframeifappropriate.read(TripPlannerActionsFragment.class, getstyleable_vector_drawable_group_rotation.AndroidTextContextMenuToolbarProvider);
        resizegraphicframeifappropriate.read(VendorReviewFragment.class, getstyleable_vector_drawable_group_rotation.accessawaitDown);
        resizegraphicframeifappropriate.read(SimpleWebViewFragment.class, getstyleable_vector_drawable_group_rotation.PagerDefaultsExternalSyntheticLambda0);
        resizegraphicframeifappropriate.read(RiderHiringWebViewFragment.class, getstyleable_vector_drawable_group_rotation.ClipboardUtils_androidKt);
        resizegraphicframeifappropriate.read(AuthWebFragment.class, getstyleable_vector_drawable_group_rotation.getSavedStateRegistryControllerannotations);
        resizegraphicframeifappropriate.read(SettingsInfoBottomSheet.class, getstyleable_vector_drawable_group_rotation.LazyListKt);
        resizegraphicframeifappropriate.read(com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.InAppCameraWithTagsFragment.class, getstyleable_vector_drawable_group_rotation.nativeNewDirectByteBuffer);
        resizegraphicframeifappropriate.read(CustomerUnavailableFragment.class, getstyleable_vector_drawable_group_rotation.setSupportProgressBarIndeterminate);
        resizegraphicframeifappropriate.read(CustomerUnavailableFragmentV2.class, getstyleable_vector_drawable_group_rotation.setSupportProgress);
        resizegraphicframeifappropriate.read(TimeChangedBlockingDialogFragment.class, getstyleable_vector_drawable_group_rotation.TextLayoutResultProxy);
        resizegraphicframeifappropriate.read(TransferChangeFragment.class, getstyleable_vector_drawable_group_rotation.AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl);
        resizegraphicframeifappropriate.read(AmountChangingReasonDialogFragment.class, getstyleable_vector_drawable_group_rotation.MediaSessionCompatResultReceiverWrapper);
        resizegraphicframeifappropriate.read(DoubleConfirmationFragment.class, getstyleable_vector_drawable_group_rotation.setMenuPrepared);
        resizegraphicframeifappropriate.read(QrPaymentScreenFragment.class, getstyleable_vector_drawable_group_rotation.onPan);
        resizegraphicframeifappropriate.read(QrScannerFragment.class, getstyleable_vector_drawable_group_rotation.TransformGestureDetectorKt);
        resizegraphicframeifappropriate.read(PinScreenFragment.class, getstyleable_vector_drawable_group_rotation.VectorizedFloatDecaySpec);
        resizegraphicframeifappropriate.read(CodeScanFragment.class, getstyleable_vector_drawable_group_rotation.handleMessage);
        resizegraphicframeifappropriate.read(SettingsFragment.class, (getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_COLOR) this.MediaDescriptionCompat);
        resizegraphicframeifappropriate.read(NavigationSettingsFragment.class, (getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_COLOR) this.MediaBrowserCompatMediaItem);
        resizegraphicframeifappropriate.read(ChatLanguageSelectorFragment.class, (getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_COLOR) this.write);
        resizegraphicframeifappropriate.read(AppearanceFragment.class, (getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_COLOR) this.MediaMetadataCompat);
        constructJsonArray constructjsonarray = new constructJsonArray(resizegraphicframeifappropriate.RemoteActionCompatParcelizer());
        int i2 = MediaSessionCompatQueueItem + 75;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return constructjsonarray;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
