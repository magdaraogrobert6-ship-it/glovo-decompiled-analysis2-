package o;

import com.roadrunner.home.nest.nestnavbar.NestNavBarContainerKt;
import com.roadrunner.liveness.instruction.presentation.compose.InstructionScreenKt;
import com.roadrunner.liveness.instruction.presentation.compose.PrivacyPolicyKt;
import com.roadrunner.liveness.recording.presentation.compose.RecordingScreenKt;
import com.roadrunner.login.presentation.checkemail.CheckEmailScreenKt;
import com.roadrunner.login.presentation.countryselection.compose.FilterableSelectionComponentKt;
import com.roadrunner.opportunities.calendar.BonusCalendarScreenKt;
import com.roadrunner.opportunities.calendar.BonusCalendarViewModel;
import com.roadrunner.rider.recruitment.accountcreation.otp_verification.OtpVerificationContentKt;
import com.roadrunner.rider.safety.permission.presentation.RiderSafetyPermissionScreenKt;
import com.roadrunner.rider.safety.report.presentation.ScoreItemKt;
import com.roadrunner.rider.state.currentshift.presentation.CurrentShiftV2ColumnKt;
import com.roadrunner.rider.state.currentshift.presentation.CurrentShiftV2Kt;
import com.roadrunner.rider.state.futureshift.presentation.compose.FutureShiftColumnKt;
import com.roadrunner.rider.state.ondemand.api.presentation.OnDemandUiModel;
import com.roadrunner.rider.state.ondemand.goofflineinfo.GoOfflineInformationDialogKt;
import com.roadrunner.rider.state.ondemand.presentation.compose.OnDemandKt;
import com.roadrunner.rider.state.ondemand.resumepause.OnDemandResumePauseFloatingContentKt;
import com.roadrunner.rider.state.quests.presentation.banner.BannerKt;
import com.roadrunner.rider.state.quests.presentation.list.QuestListKt;
import com.roadrunner.rider.state.searchshifts.presentation.SearchShiftsSelectedZoneKt;
import com.roadrunner.rrds.compose.component.actions.links.LinkKt;
import com.roadrunner.rrds.compose.component.buttons.slider.SliderButtonContainerKt;
import com.roadrunner.rrds.compose.component.navigations.TabsKt;
import com.roadrunner.sidemenu.accordion.AccordionContentKt;
import com.roadrunner.startworking.equipment.composable.EquipmentContentKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 1;
    private static int MediaMetadataCompat;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object MediaBrowserCompatMediaItem;
    public final /* synthetic */ int RatingCompat;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg(trackThirdPartySharing trackthirdpartysharing, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, androidx.compose.ui.Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, int i) {
        this.write = 10;
        this.RemoteActionCompatParcelizer = trackthirdpartysharing;
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaBrowserCompatMediaItem = modifier;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.RatingCompat = i;
    }

    public /* synthetic */ r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg(DividerItemDecoration dividerItemDecoration, getQueryContext getquerycontext, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, androidx.compose.ui.Modifier modifier, int i) {
        this.write = 1;
        this.RemoteActionCompatParcelizer = dividerItemDecoration;
        this.serializer = getquerycontext;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaBrowserCompatMediaItem = modifier;
        this.RatingCompat = i;
    }

    public /* synthetic */ r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg(int i, int i2, androidx.compose.ui.Modifier modifier, Object obj, Object obj2, Object obj3, isInvalidIndex isinvalidindex) {
        this.write = i2;
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer = obj2;
        this.read = isinvalidindex;
        this.serializer = obj3;
        this.MediaBrowserCompatMediaItem = modifier;
        this.RatingCompat = i;
    }

    public /* synthetic */ r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg(hasAllLocationsBeenRead hasalllocationsbeenread, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier, int i) {
        this.write = 23;
        this.RemoteActionCompatParcelizer = hasalllocationsbeenread;
        this.IconCompatParcelizer = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
        this.serializer = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaBrowserCompatMediaItem = modifier;
        this.RatingCompat = i;
    }

    public /* synthetic */ r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg(Object obj, Object obj2, Object obj3, Object obj4, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.write = i2;
        this.RemoteActionCompatParcelizer = obj;
        this.read = obj2;
        this.IconCompatParcelizer = obj3;
        this.serializer = obj4;
        this.MediaBrowserCompatMediaItem = modifier;
        this.RatingCompat = i;
    }

    public /* synthetic */ r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg(Object obj, Object obj2, Object obj3, Object obj4, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, int i2) {
        this.write = i2;
        this.RemoteActionCompatParcelizer = obj;
        this.read = obj2;
        this.serializer = obj3;
        this.MediaBrowserCompatMediaItem = obj4;
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.RatingCompat = i;
    }

    public /* synthetic */ r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg(Object obj, Object obj2, Object obj3, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.write = i2;
        this.RemoteActionCompatParcelizer = obj;
        this.read = obj2;
        this.serializer = obj3;
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaBrowserCompatMediaItem = modifier;
        this.RatingCompat = i;
    }

    public /* synthetic */ r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg(Object obj, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, androidx.compose.ui.Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, int i, int i2) {
        this.write = i2;
        this.RemoteActionCompatParcelizer = obj;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.MediaBrowserCompatMediaItem = modifier;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
        this.RatingCompat = i;
    }

    public /* synthetic */ r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg(Object obj, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.write = i2;
        this.RemoteActionCompatParcelizer = obj;
        this.serializer = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaBrowserCompatMediaItem = modifier;
        this.RatingCompat = i;
    }

    public /* synthetic */ r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, String str, FlowUtilcreateFlowinlinedmap12 flowUtilcreateFlowinlinedmap12, androidx.compose.ui.Modifier modifier, int i) {
        this.write = 3;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.RemoteActionCompatParcelizer = str;
        this.serializer = flowUtilcreateFlowinlinedmap12;
        this.MediaBrowserCompatMediaItem = modifier;
        this.RatingCompat = i;
    }

    public /* synthetic */ r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg(r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, androidx.compose.foundation.pager.PagerState pagerState, androidx.compose.ui.Modifier modifier, SwitchKt switchKt, androidx.compose.ui.Alignment.Horizontal horizontal, int i) {
        this.write = 27;
        this.RemoteActionCompatParcelizer = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        this.read = pagerState;
        this.MediaBrowserCompatMediaItem = modifier;
        this.IconCompatParcelizer = switchKt;
        this.serializer = horizontal;
        this.RatingCompat = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 99;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.RatingCompat;
        Object obj3 = this.MediaBrowserCompatMediaItem;
        Object obj4 = this.serializer;
        Object obj5 = this.IconCompatParcelizer;
        Object obj6 = this.read;
        Object obj7 = this.RemoteActionCompatParcelizer;
        switch (i4) {
            case 0:
                ((Integer) obj2).getClass();
                AccordionContentKt.Accordion((r8lambdag0m0JVUE1KB8aI8kjJMGJSHe1o8) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (r8lambdavHJVXyGGlLVHk5AGniQgYzeRF4) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                NestNavBarContainerKt.NestNavBarContainer((DividerItemDecoration) obj7, (getQueryContext) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                dispatchAnimationFinished.IconCompatParcelizer((getItemCount) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                InstructionScreenKt.InstructionScreen((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (String) obj7, (FlowUtilcreateFlowinlinedmap12) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                PrivacyPolicyKt.PrivacyPolicy((String) obj7, (String) obj6, (String) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                RecordingScreenKt.RecordingContent((setRefreshingWithoutSwipeGesture) obj7, (getWrapper) obj6, (setNavigationOnClickListener) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                CheckEmailScreenKt.CheckEmailScreen((a4) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                FilterableSelectionComponentKt.FilterableSelectionComponent((ah) obj7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj6, (String) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                d8.serializer((da) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                BonusCalendarScreenKt.serializer((wdefault) obj7, (BonusCalendarViewModel) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                OtpVerificationContentKt.OtpVerificationContent((trackThirdPartySharing) obj7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (androidx.compose.ui.Modifier) obj3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                RiderSafetyPermissionScreenKt.RiderSafetyPermissionScreen((getLastDeeplink) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (internalInitInvalidationTracker) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                ScoreItemKt.ScoreItem((String) obj7, (String) obj6, (String) obj5, (enableDeviceIdsReadingOnce) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                CurrentShiftV2ColumnKt.CurrentShiftV2Column((setConnectionOptions) obj7, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj6, (xb) obj5, (u6) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                CurrentShiftV2Kt.CurrentShiftV2((setHttpsURLConnectionProvider) obj7, (xb) obj6, (u6) obj5, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                FutureShiftColumnKt.FutureShiftColumn((AdjustInstance13) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                GoOfflineInformationDialogKt.GoOfflineInformationDialog((AttributionHandler3) obj7, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                int i6 = MediaMetadataCompat + 49;
                MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                break;
            case 17:
                ((Integer) obj2).getClass();
                GoOfflineInformationDialogKt.RemoteActionCompatParcelizer((getPartnerSharingSettings) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                int i8 = MediaDescriptionCompat + 95;
                MediaMetadataCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                break;
            case 18:
                ((Integer) obj2).getClass();
                OnDemandKt.OnDemand((OnDemandUiModel) obj7, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj6, (getStoreIdFromSystem) obj5, (logPushStoryPageClickedlambda11) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                OnDemandResumePauseFloatingContentKt.OnDemandResumePauseFloatingContent((getOsName) obj7, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                BannerKt.BannerRow((addDate) obj7, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                QuestListKt.QuestListColumn((addString) obj7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj6, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                int i10 = MediaMetadataCompat + 83;
                MediaDescriptionCompat = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i11 = i10 % 2;
                break;
            case 22:
                ((Integer) obj2).getClass();
                SearchShiftsSelectedZoneKt.RemoteActionCompatParcelizer((r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) obj7, (String) obj6, (String) obj5, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                SearchShiftsSelectedZoneKt.PromoRow((hasAllLocationsBeenRead) obj7, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj5, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                LinkKt.LinkText((String) obj7, (String) obj6, (equalObject) obj4, (androidx.compose.ui.Modifier) obj3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                SliderButtonContainerKt.read((configConnectionForGET) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (androidx.compose.ui.Modifier) obj3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                SliderButtonContainerKt.IconCompatParcelizer((String) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (androidx.compose.ui.Modifier) obj3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                TabsKt.ScrollableTabRow((r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) obj7, (androidx.compose.foundation.pager.PagerState) obj6, (androidx.compose.ui.Modifier) obj3, (SwitchKt) obj5, (androidx.compose.ui.Alignment.Horizontal) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 28:
                ((Integer) obj2).intValue();
                onVirtualViewTranslationResponseslambda0.read((r8lambdalR5SL_tSS1JcT7wrmZ_9di0raRc) obj7, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj6, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj4, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                EquipmentContentKt.EquipmentContent((lambda318) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
        }
        return createfromparcel;
    }
}
