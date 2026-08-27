package o;

import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.compose.TakePictureKt;
import com.roadrunner.delivery.stacked.delivery.list.compose.v1.OrderDetailsContainerKt;
import com.roadrunner.delivery.stacked.delivery.list.compose.v1.StackedDeliveryListV1Kt;
import com.roadrunner.instant.shifts.presentation.InstantShiftsKt;
import com.roadrunner.liveness.recording.presentation.RecordingViewModel;
import com.roadrunner.liveness.recording.presentation.compose.CameraContentKt;
import com.roadrunner.liveness.recording.presentation.compose.RecordingScreenKt;
import com.roadrunner.login.presentation.router.RouterScreenKt;
import com.roadrunner.nafath.NafathModalContentKt;
import com.roadrunner.opportunities.calendar.BonusCalendarScreenKt;
import com.roadrunner.opportunities.calendar.info.CalendarInformationScreenKt;
import com.roadrunner.rider.recruitment.accountcreation.email_and_phone.presentation.CountryCodePickerBottomSheetKt;
import com.roadrunner.rider.recruitment.passverification.pass_error.PassErrorScreenKt;
import com.roadrunner.rider.safety.report.presentation.RiderSafetyReportScreenKt;
import com.roadrunner.rider.state.cashblock.presentation.CashBlockKt;
import com.roadrunner.rider.state.futureshift.presentation.compose.FutureShiftInformationColumnKt;
import com.roadrunner.rider.state.ondemand.presentation.compose.OnDemandWorkingKt;
import com.roadrunner.rider.state.suspension.presentation.SuspensionScreenKt;
import com.roadrunner.settings.SettingsViewModel;
import com.roadrunner.settings.ui.screens.AppearanceScreenKt;
import com.roadrunner.settings.ui.screens.ChatLanguageSelectorScreenKt;
import com.roadrunner.settings.ui.screens.NavigationSettingsScreenKt;
import com.roadrunner.settings.ui.screens.SettingsScreenKt;
import com.roadrunner.sidemenu.accordion.AccordionContentKt;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemsContentKt;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemsKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p7 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RatingCompat;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ int MediaMetadataCompat;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ p7(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier, r8lambdaPiZLedL0JH1wIOGQM80pCH0fhkU r8lambdapizledl0jh1wiogqm80pch0fhku, extractAuthorizationHeader extractauthorizationheader, int i) {
        this.IconCompatParcelizer = 5;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.serializer = modifier;
        this.RemoteActionCompatParcelizer = r8lambdapizledl0jh1wiogqm80pch0fhku;
        this.write = extractauthorizationheader;
        this.MediaMetadataCompat = i;
    }

    public /* synthetic */ p7(int i, int i2, Object obj, Object obj2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.IconCompatParcelizer = i2;
        this.RemoteActionCompatParcelizer = obj;
        this.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.serializer = obj2;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaMetadataCompat = i;
    }

    public /* synthetic */ p7(Object obj, Object obj2, Object obj3, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.IconCompatParcelizer = i2;
        this.RemoteActionCompatParcelizer = obj;
        this.read = obj2;
        this.write = obj3;
        this.serializer = modifier;
        this.MediaMetadataCompat = i;
    }

    public /* synthetic */ p7(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.IconCompatParcelizer = i2;
        this.RemoteActionCompatParcelizer = obj;
        this.serializer = obj2;
        this.read = obj3;
        this.write = obj4;
        this.MediaMetadataCompat = i;
    }

    public /* synthetic */ p7(int i, int i2, androidx.compose.ui.Modifier modifier, Object obj, Object obj2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.IconCompatParcelizer = i2;
        this.RemoteActionCompatParcelizer = obj;
        this.write = obj2;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.serializer = modifier;
        this.MediaMetadataCompat = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 95;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.MediaMetadataCompat;
        Object obj3 = this.serializer;
        Object obj4 = this.write;
        Object obj5 = this.read;
        Object obj6 = this.RemoteActionCompatParcelizer;
        switch (i4) {
            case 0:
                ((Integer) obj2).getClass();
                NafathModalContentKt.NafathModalContent((pf) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                int i6 = MediaBrowserCompatMediaItem + 5;
                RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    return createfromparcel;
                }
                throw null;
            case 1:
                ((Integer) obj2).getClass();
                TakePictureKt.TakePictureContent((accessgetLOREM_IPSUM_SOURCEp) obj6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 2:
                ((Integer) obj2).getClass();
                TakePictureKt.Photo((accessgetLOREM_IPSUM_SOURCEp) obj6, (getHasFixedWidthimpl) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 3:
                ((Integer) obj2).getClass();
                OrderDetailsContainerKt.OrderDetailsContainer((r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 4:
                ((Integer) obj2).getClass();
                StackedDeliveryListV1Kt.StackedDeliveryListV1((unaryMinus9UxMQ8M) obj6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 5:
                ((Integer) obj2).getClass();
                lambdainit3.RemoteActionCompatParcelizer((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (androidx.compose.ui.Modifier) obj3, (r8lambdaPiZLedL0JH1wIOGQM80pCH0fhkU) obj6, (extractAuthorizationHeader) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 6:
                ((Integer) obj2).getClass();
                InstantShiftsKt.BookableShiftsColumn((StaggeredGridLayoutManagerLazySpanLookupFullSpanItem1) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 7:
                ((Integer) obj2).intValue();
                setInflatedId.IconCompatParcelizer((accessgetAltRightcp) obj6, (getUseTempTrackingTableroom_runtime) obj3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 8:
                ((Integer) obj2).getClass();
                CameraContentKt.serializer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj6, (getWrapper) obj5, (setNavigationOnClickListener) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 9:
                ((Integer) obj2).getClass();
                RecordingScreenKt.read((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (RecordingViewModel) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 10:
                ((Integer) obj2).getClass();
                RouterScreenKt.RouterContent((String) obj6, (ca) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 11:
                ((Integer) obj2).intValue();
                BonusCalendarScreenKt.IconCompatParcelizer((String) obj6, (String) obj3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 12:
                ((Integer) obj2).getClass();
                CalendarInformationScreenKt.BonusMultiplierDescriptionItem((String) obj6, (String) obj5, (DragAndDropTargetModifierNode) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 13:
                ((Integer) obj2).getClass();
                accesswriteToDiskCache.IconCompatParcelizer((NetworkFetcherfetch2) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 14:
                ((Integer) obj2).getClass();
                CountryCodePickerBottomSheetKt.RemoteActionCompatParcelizer((removeGlobalCallbackParameters) obj6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 15:
                ((Integer) obj2).getClass();
                PassErrorScreenKt.PassErrorScreen((fromString) obj6, (androidx.compose.ui.Modifier) obj3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 16:
                ((Integer) obj2).getClass();
                RiderSafetyReportScreenKt.RiderSafetyReportContent((getOnEventTrackingFailedListener) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 17:
                ((Integer) obj2).getClass();
                CashBlockKt.CashBlockColumn((getBaseUrl) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 18:
                ((Integer) obj2).getClass();
                FutureShiftInformationColumnKt.FutureShiftInformationColumn((AdjustInstance13) obj6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                int i7 = RatingCompat + 53;
                MediaBrowserCompatMediaItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    return createfromparcel;
                }
                throw null;
            case 19:
                ((Integer) obj2).getClass();
                OnDemandWorkingKt.OnDemandWorkingColumn((AttributionHandler) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (DragAndDropTargetModifierNode) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 20:
                ((Integer) obj2).getClass();
                SuspensionScreenKt.SuspensionScreenContent((removeDeeplink) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 21:
                ((Integer) obj2).getClass();
                Util3.serializer((configConnectionForGET) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 22:
                ((Integer) obj2).getClass();
                AppearanceScreenKt.AppearanceScreen((r8lambdaTq96bk0BBdzjoDKqhVDnbn_apY) obj6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (androidx.compose.ui.Modifier) obj3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 23:
                ((Integer) obj2).getClass();
                ChatLanguageSelectorScreenKt.ChatLanguageSelectorScreen((r8lambdaTgPsXaTTZ8gJI5Nphc8TulxhY9I) obj6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (androidx.compose.ui.Modifier) obj3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 24:
                ((Integer) obj2).getClass();
                NavigationSettingsScreenKt.NaverRoutePreviewSwitch((r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c) obj6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 25:
                ((Integer) obj2).getClass();
                SettingsScreenKt.SettingsScreen((SettingsViewModel) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaRTIvhvu27JBv_zhnPEAt2ZGU) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 26:
                ((Integer) obj2).getClass();
                AccordionContentKt.AccordionScreen((r8lambdafOIPryYKxSg19oxLSCcW3X8q4Qk) obj6, (r8lambdag0m0JVUE1KB8aI8kjJMGJSHe1o8) obj5, (r8lambdavHJVXyGGlLVHk5AGniQgYzeRF4) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 27:
                ((Integer) obj2).getClass();
                FrequentlyUsedItemKt.write((String) obj6, (androidx.compose.ui.Modifier) obj3, (String) obj5, (Integer) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 28:
                ((Integer) obj2).getClass();
                FrequentlyUsedItemsContentKt.FrequentlyUsedItemsScreen((r8lambdarhobHpPgW3fYGaomIOtfm02vDE) obj6, (r8lambdas7hGQZUVhdtJa9loZ8w1Xl2jDOA) obj5, (r8lambdakakRSJ0yRWnWIggdAd9IDPYuM) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            default:
                ((Integer) obj2).getClass();
                FrequentlyUsedItemsKt.FrequentlyUsedItemsRow((r8lambdaqnZRqetjfFf2WXtrt0EwRzhWIUs) obj6, (r8lambdaqnZRqetjfFf2WXtrt0EwRzhWIUs) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
        }
    }
}
