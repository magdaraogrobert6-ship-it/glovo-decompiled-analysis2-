package com.roadrunner.home.nest;

import androidx.compose.foundation.pager.PagerState$scrollToPage$2;
import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.logistics.rider.glovo.R;
import com.mapbox.api.directions.v5.models.C$AutoValue_MapboxShield;
import com.roadrunner.face.verification.presentation.IdentityVerificationActivity;
import com.roadrunner.face.verification.presentation.identitypopup.IdentityPopupViewModel;
import com.roadrunner.face.verification.presentation.selfie.SelfieFlowViewModel;
import com.roadrunner.freelancing.api.bonus.WorkNowWithBonusUiModel;
import com.roadrunner.freelancing.api.infraboost.WorkNowWithInfraBoostUiModel;
import com.roadrunner.freelancing.api.presentation.WorkNowUiModel;
import com.roadrunner.freelancing.api.presentation.outsideactivearea.OutsideActiveAreaUiModel;
import com.roadrunner.freelancing.presentation.WorkNowUiModelImpl;
import com.roadrunner.freelancing.presentation.bonus.WorkNowWithBonusUiModelImpl;
import com.roadrunner.freelancing.presentation.goandstartinfo.GoAndStartInformationUiModelImpl;
import com.roadrunner.freelancing.presentation.infraboost.WorkNowWithInfraBoostUiModelImpl;
import com.roadrunner.freelancing.presentation.outsideactivearea.OutsideActiveAreaUiModelImpl;
import com.roadrunner.heatmap.presentation.description.HeatmapDescriptionUiModelImpl$1;
import com.roadrunner.home.HomeViewModel;
import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.push.PushEventPublisherImpl$emit$1;
import com.roadrunner.startworking.api.navigation.StartWorkingNavAction;
import java.util.Collections;
import java.util.Map;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.CoreComponentFactory;
import o.NotificationCompatAction;
import o.NotificationCompatBigPictureStyle;
import o.NotificationCompatMessagingStyle;
import o.NotificationCompatStyle;
import o.NotificationManagerCompat;
import o.ShortNewsContentCardView;
import o.WindowInsetsCompatImpl28;
import o.addCompatExtras;
import o.applyStandardTemplate;
import o.canPostPromotedNotifications;
import o.canUseFullScreenIntent;
import o.constructCompatStyleByName;
import o.constructCompatStyleForBundle;
import o.constructStyleForExtras;
import o.createFromParcel;
import o.createIconWithBackground;
import o.createInternalPathIterator;
import o.expandFieldArray;
import o.generatePOSTBodyString;
import o.getBoundingRects;
import o.getContentViewGroupParentLayout;
import o.getRouternavigation_release;
import o.instantiateProvider;
import o.instantiateReceiver;
import o.invokeBWLJW6A;
import o.makeHeadsUpContentView;
import o.onDependentViewRemoved;
import o.onServiceConnected;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.readDataOrHandleCorruption;
import o.sc;
import o.setDisplayShape;
import o.setFitsSystemWindows;
import o.setSmoothScrollingEnabled;
import o.setTransactionSuccessful;
import o.updateData;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class NestScreenKt$NestScreen$1$1 extends FunctionReferenceImpl implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int serializer = 0;
    private static int write = 1;
    public final /* synthetic */ int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestScreenKt$NestScreen$1$1(IdentityVerificationActivity identityVerificationActivity, int i) {
        super(0, 0, IdentityVerificationActivity.class, identityVerificationActivity, "cancelVerificationFlow", "cancelVerificationFlow()V");
        this.read = i;
        if (i != 4) {
        } else {
            super(0, 0, IdentityVerificationActivity.class, identityVerificationActivity, "onIdentityVerificationSuccess", "onIdentityVerificationSuccess()V");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NestScreenKt$NestScreen$1$1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.read = i3;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        Object obj;
        NotificationCompatAction notificationCompatAction;
        onServiceConnected onserviceconnected;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = serializer + 47;
        write = i3 % Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i3 % 2 == 0) {
            makeHeadsUpContentView makeheadsupcontentview = makeHeadsUpContentView.RemoteActionCompatParcelizer;
            canUseFullScreenIntent canusefullscreenintent = canUseFullScreenIntent.RemoteActionCompatParcelizer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            shortNewsContentCardView.hashCode();
            throw null;
        }
        int i4 = this.read;
        makeHeadsUpContentView makeheadsupcontentview2 = makeHeadsUpContentView.RemoteActionCompatParcelizer;
        canUseFullScreenIntent canusefullscreenintent2 = canUseFullScreenIntent.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        int i5 = 3;
        switch (i4) {
            case 0:
                getRouternavigation_release getrouternavigation_release = (getRouternavigation_release) this.MediaMetadataCompat;
                getrouternavigation_release.MediaDescriptionCompat.IconCompatParcelizer.IconCompatParcelizer(new expandFieldArray(null));
                getrouternavigation_release.MediaBrowserCompatMediaItem.serializer(createInternalPathIterator.read);
                getrouternavigation_release.IconCompatParcelizer.RemoteActionCompatParcelizer.logEvent("bubble_section_closed", null);
                return createfromparcel2;
            case 1:
                SelfieFlowViewModel selfieFlowViewModel = (SelfieFlowViewModel) this.MediaMetadataCompat;
                OtpLogger otpLogger = selfieFlowViewModel.MediaBrowserCompatMediaItem;
                String str = selfieFlowViewModel.serializer.RemoteActionCompatParcelizer;
                otpLogger.getClass();
                str.getClass();
                ff$$ExternalSyntheticOutline0.m("screenName", str, otpLogger.IconCompatParcelizer, "selfie_creation_screen_canceled");
                return createfromparcel2;
            case 2:
                MutableStateFlow mutableStateFlow = ((SelfieFlowViewModel) this.MediaMetadataCompat).write;
                do {
                    obj = mutableStateFlow.read();
                } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj, onDependentViewRemoved.write((onDependentViewRemoved) obj, false, false, false, 0, false, 95)));
                int i6 = serializer + 53;
                write = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    return createfromparcel2;
                }
                shortNewsContentCardView.hashCode();
                throw null;
            case 3:
                IdentityVerificationActivity.IconCompatParcelizer((IdentityVerificationActivity) this.MediaMetadataCompat);
                return createfromparcel2;
            case 4:
                IdentityVerificationActivity.IconCompatParcelizer(new Object[]{(IdentityVerificationActivity) this.MediaMetadataCompat}, C$AutoValue_MapboxShield.write(), 1722656450, C$AutoValue_MapboxShield.write(), -1722656449, C$AutoValue_MapboxShield.write(), C$AutoValue_MapboxShield.write());
                return createfromparcel2;
            case 5:
                IdentityPopupViewModel identityPopupViewModel = (IdentityPopupViewModel) this.MediaMetadataCompat;
                OtpLogger otpLogger2 = identityPopupViewModel.IconCompatParcelizer;
                String str2 = identityPopupViewModel.read.RemoteActionCompatParcelizer;
                otpLogger2.getClass();
                str2.getClass();
                ff$$ExternalSyntheticOutline0.m("screenName", str2, otpLogger2.IconCompatParcelizer, "verification_screen_canceled_new");
                identityPopupViewModel.write.serializer(setFitsSystemWindows.RemoteActionCompatParcelizer);
                return createfromparcel2;
            case 6:
                ((IdentityPopupViewModel) this.MediaMetadataCompat).write.serializer(setFitsSystemWindows.serializer);
                return createfromparcel2;
            case 7:
                IdentityPopupViewModel identityPopupViewModel2 = (IdentityPopupViewModel) this.MediaMetadataCompat;
                OtpLogger otpLogger3 = identityPopupViewModel2.IconCompatParcelizer;
                String str3 = identityPopupViewModel2.read.RemoteActionCompatParcelizer;
                otpLogger3.getClass();
                str3.getClass();
                ff$$ExternalSyntheticOutline0.m("screenName", str3, otpLogger3.IconCompatParcelizer, "no_camera_access_new");
                return createfromparcel2;
            case 8:
                WorkNowUiModelImpl workNowUiModelImpl = (WorkNowUiModelImpl) ((WorkNowUiModel) this.MediaMetadataCompat);
                constructStyleForExtras constructstyleforextras = (constructStyleForExtras) workNowUiModelImpl.MediaDescriptionCompat.read();
                if (constructstyleforextras instanceof constructCompatStyleForBundle) {
                    constructCompatStyleForBundle constructcompatstyleforbundle = (constructCompatStyleForBundle) constructstyleforextras;
                    workNowUiModelImpl.serializer.serializer(new addCompatExtras(new StartWorkingNavAction.StartWorkNow(constructcompatstyleforbundle.RemoteActionCompatParcelizer, constructcompatstyleforbundle.write)));
                    CoreComponentFactory coreComponentFactory = workNowUiModelImpl.RatingCompat;
                    Map mapSingletonMap = Collections.singletonMap("start_session_type", "work_now");
                    mapSingletonMap.getClass();
                    coreComponentFactory.IconCompatParcelizer("start_session_clicked", mapSingletonMap);
                    int i7 = serializer + 19;
                    write = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                }
                return createfromparcel2;
            case 9:
                ((WorkNowUiModelImpl) ((WorkNowUiModel) this.MediaMetadataCompat)).RatingCompat.serializer.logEvent("work_now_option_displayed", null);
                return createfromparcel2;
            case 10:
                ((setDisplayShape) this.MediaMetadataCompat).read();
                return createfromparcel2;
            case 11:
                WorkNowWithBonusUiModelImpl workNowWithBonusUiModelImpl = (WorkNowWithBonusUiModelImpl) ((WorkNowWithBonusUiModel) this.MediaMetadataCompat);
                workNowWithBonusUiModelImpl.MediaSessionCompatToken.serializer.logEvent("go_and_start_clicked", null);
                BuildersKt.RemoteActionCompatParcelizer(workNowWithBonusUiModelImpl.read, null, null, new PushEventPublisherImpl$emit$1(workNowWithBonusUiModelImpl, shortNewsContentCardView, i5), 3);
                return createfromparcel2;
            case 12:
                WorkNowWithBonusUiModelImpl workNowWithBonusUiModelImpl2 = (WorkNowWithBonusUiModelImpl) ((WorkNowWithBonusUiModel) this.MediaMetadataCompat);
                instantiateProvider instantiateprovider = (instantiateProvider) workNowWithBonusUiModelImpl2.MediaDescriptionCompat.read();
                if ((instantiateprovider instanceof NotificationCompatAction) && (onserviceconnected = (notificationCompatAction = (NotificationCompatAction) instantiateprovider).MediaSessionCompatToken) != null) {
                    workNowWithBonusUiModelImpl2.serializer.serializer(new instantiateReceiver(new StartWorkingNavAction.StartWorkNow(notificationCompatAction.MediaSessionCompatResultReceiverWrapper, onserviceconnected)));
                    CoreComponentFactory coreComponentFactory2 = workNowWithBonusUiModelImpl2.MediaSessionCompatToken;
                    Map mapSingletonMap2 = Collections.singletonMap("start_session_type", "work_now");
                    mapSingletonMap2.getClass();
                    coreComponentFactory2.IconCompatParcelizer("start_session_clicked", mapSingletonMap2);
                }
                return createfromparcel2;
            case 13:
                ((setDisplayShape) this.MediaMetadataCompat).read();
                return createfromparcel2;
            case 14:
                ((getBoundingRects) this.MediaMetadataCompat).IconCompatParcelizer.IconCompatParcelizer(applyStandardTemplate.IconCompatParcelizer);
                return createfromparcel2;
            case 15:
                GoAndStartInformationUiModelImpl goAndStartInformationUiModelImpl = (GoAndStartInformationUiModelImpl) this.MediaMetadataCompat;
                BuildersKt.RemoteActionCompatParcelizer(goAndStartInformationUiModelImpl.serializer, null, null, new PagerState$scrollToPage$2(goAndStartInformationUiModelImpl, null), 3);
                return createfromparcel2;
            case 16:
                ((GoAndStartInformationUiModelImpl) this.MediaMetadataCompat).IconCompatParcelizer.IconCompatParcelizer(makeheadsupcontentview2);
                return createfromparcel2;
            case 17:
                ((GoAndStartInformationUiModelImpl) this.MediaMetadataCompat).IconCompatParcelizer.IconCompatParcelizer(makeheadsupcontentview2);
                return createfromparcel2;
            case 18:
                ((setDisplayShape) this.MediaMetadataCompat).IconCompatParcelizer.IconCompatParcelizer(NotificationManagerCompat.write);
                return createfromparcel2;
            case 19:
                WorkNowWithInfraBoostUiModelImpl workNowWithInfraBoostUiModelImpl = (WorkNowWithInfraBoostUiModelImpl) ((WorkNowWithInfraBoostUiModel) this.MediaMetadataCompat);
                BuildersKt.RemoteActionCompatParcelizer(workNowWithInfraBoostUiModelImpl.write, null, null, new PushEventPublisherImpl$emit$1(workNowWithInfraBoostUiModelImpl, shortNewsContentCardView, 5), 3);
                return createfromparcel2;
            case 20:
                WorkNowWithInfraBoostUiModelImpl workNowWithInfraBoostUiModelImpl2 = (WorkNowWithInfraBoostUiModelImpl) ((WorkNowWithInfraBoostUiModel) this.MediaMetadataCompat);
                NotificationCompatMessagingStyle notificationCompatMessagingStyle = (NotificationCompatMessagingStyle) workNowWithInfraBoostUiModelImpl2.MediaSessionCompatResultReceiverWrapper.read();
                if (notificationCompatMessagingStyle instanceof NotificationCompatStyle) {
                    NotificationCompatStyle notificationCompatStyle = (NotificationCompatStyle) notificationCompatMessagingStyle;
                    workNowWithInfraBoostUiModelImpl2.IconCompatParcelizer.serializer(new NotificationCompatBigPictureStyle(new StartWorkingNavAction.StartWorkNow(notificationCompatStyle.MediaMetadataCompat, notificationCompatStyle.MediaBrowserCompatMediaItem)));
                    CoreComponentFactory coreComponentFactory3 = workNowWithInfraBoostUiModelImpl2.MediaSessionCompatToken;
                    Map mapSingletonMap3 = Collections.singletonMap("start_session_type", "work_now");
                    mapSingletonMap3.getClass();
                    coreComponentFactory3.IconCompatParcelizer("start_session_clicked", mapSingletonMap3);
                }
                return createfromparcel2;
            case 21:
                getBoundingRects getboundingrects = (getBoundingRects) this.MediaMetadataCompat;
                MutableStateFlow mutableStateFlow2 = getboundingrects.IconCompatParcelizer;
                setTransactionSuccessful settransactionsuccessful = getboundingrects.write;
                mutableStateFlow2.IconCompatParcelizer(new createIconWithBackground(new generatePOSTBodyString(settransactionsuccessful.IconCompatParcelizer(R.string.approximate_earnings_dialog_title), false, null, settransactionsuccessful.IconCompatParcelizer(R.string.got_it), null, null, 122, null), new constructCompatStyleByName(settransactionsuccessful.IconCompatParcelizer(R.string.approximate_earnings_dialog_what_s_included_title), settransactionsuccessful.IconCompatParcelizer(R.string.approximate_earnings_dialog_what_s_included_description), settransactionsuccessful.IconCompatParcelizer(R.string.approximate_earnings_dialog_not_included_title), settransactionsuccessful.IconCompatParcelizer(R.string.approximate_earnings_dialog_not_included_description), settransactionsuccessful.IconCompatParcelizer(R.string.approximate_earnings_dialog_estimate_disclaimer))));
                return createfromparcel2;
            case 22:
                CoreComponentFactory coreComponentFactory4 = ((OutsideActiveAreaUiModelImpl) ((OutsideActiveAreaUiModel) this.MediaMetadataCompat)).MediaBrowserCompatMediaItem;
                Map mapSingletonMap4 = Collections.singletonMap("trigger_reason", "outside_delivery_area");
                mapSingletonMap4.getClass();
                coreComponentFactory4.IconCompatParcelizer("work_now_option_displayed", mapSingletonMap4);
                return createfromparcel2;
            case 23:
                ((OutsideActiveAreaUiModelImpl) ((OutsideActiveAreaUiModel) this.MediaMetadataCompat)).read.write.IconCompatParcelizer(sc.SCHEDULE);
                return createfromparcel2;
            case 24:
                ((WindowInsetsCompatImpl28) this.MediaMetadataCompat).IconCompatParcelizer.IconCompatParcelizer(canusefullscreenintent2);
                return createfromparcel2;
            case 25:
                WindowInsetsCompatImpl28 windowInsetsCompatImpl28 = (WindowInsetsCompatImpl28) this.MediaMetadataCompat;
                windowInsetsCompatImpl28.RemoteActionCompatParcelizer.serializer.logEvent("stop_working_confirm_clicked", null);
                windowInsetsCompatImpl28.IconCompatParcelizer.IconCompatParcelizer(canusefullscreenintent2);
                windowInsetsCompatImpl28.read.serializer(canPostPromotedNotifications.IconCompatParcelizer);
                return createfromparcel2;
            case 26:
                readDataOrHandleCorruption readdataorhandlecorruption = (readDataOrHandleCorruption) this.MediaMetadataCompat;
                readdataorhandlecorruption.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.logEvent("heatmap_information_icon_click", null);
                BuildersKt.RemoteActionCompatParcelizer(readdataorhandlecorruption.write, null, null, new HomeViewModel.AnonymousClass1(readdataorhandlecorruption, shortNewsContentCardView, 14), 3);
                return createfromparcel2;
            case 27:
                updateData updatedata = (updateData) this.MediaMetadataCompat;
                BuildersKt.RemoteActionCompatParcelizer(updatedata.write, null, null, new HeatmapDescriptionUiModelImpl$1(updatedata, shortNewsContentCardView, 1), 3);
                return createfromparcel2;
            case 28:
                readDataOrHandleCorruption readdataorhandlecorruption2 = (readDataOrHandleCorruption) this.MediaMetadataCompat;
                readdataorhandlecorruption2.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.logEvent("heatmap_information_gotit", null);
                readdataorhandlecorruption2.read.IconCompatParcelizer(setSmoothScrollingEnabled.IconCompatParcelizer);
                return createfromparcel2;
            default:
                getRouternavigation_release getrouternavigation_release2 = (getRouternavigation_release) this.MediaMetadataCompat;
                getrouternavigation_release2.write.IconCompatParcelizer(invokeBWLJW6A.read);
                BuildersKt.RemoteActionCompatParcelizer((getContentViewGroupParentLayout) getrouternavigation_release2.RatingCompat.MediaSessionCompatResultReceiverWrapper(), null, null, new NestViewModel$observeNestScope$1(getrouternavigation_release2, shortNewsContentCardView, i), 3);
                return createfromparcel2;
        }
    }
}
