package o;

import com.roadrunner.appmigration.presentation.compose.AppMigrationFullScreenKt;
import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.compose.ReportBottomSheetKt;
import com.roadrunner.delivery.ontheway.tripplanner.list.presentation.compose.TripPlannerItemKt;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.tripinformation.TripInformationUiModel;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.tripinformation.compose.TripInformationKt;
import com.roadrunner.delivery.pickupdropoff.presentation.PickUpDropOffComposableFactoryImplKt;
import com.roadrunner.delivery.pickupdropoff.presentation.compose.SingleDeliveryPageKt;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeViewState;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.compose.TransferChangeScreenKt;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.scan.compose.QrScannerScreenKt;
import com.roadrunner.diagnostics.presentation.view.NotificationsDiagnosticsScreenKt;
import com.roadrunner.freelancing.presentation.goandstartinfo.GoAndStartInformationDialogKt;
import com.roadrunner.home.nest.NestScreenKt;
import com.roadrunner.inappnotifications.presentation.InAppNotificationLayoutComponentsKt;
import com.roadrunner.login.presentation.countryselection.compose.CountrySelectionKt;
import com.roadrunner.login.presentation.forgotpassword.ForgotPasswordContentKt;
import com.roadrunner.login.presentation.otp.OtpContentKt;
import com.roadrunner.opportunities.calendar.BonusCalendarScreenKt;
import com.roadrunner.rider.recruitment.accountcreation.email_and_phone.presentation.EmailAndPhoneScreenKt;
import com.roadrunner.rider.recruitment.accountcreation.password_creation.presentation.compose.PasswordCreationScreenKt;
import com.roadrunner.rider.safety.report.presentation.RiderSafetyReportScreenKt;
import com.roadrunner.rider.safety.report.presentation.RiderSafetyScoreKt;
import com.roadrunner.rider.state.futureshift.api.presentation.FutureShiftUiModel;
import com.roadrunner.rider.state.futureshift.presentation.compose.FutureShiftKt;
import com.roadrunner.rider.state.ondemand.offlinebutton.OnDemandOfflineFloatingContentKt;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemsKt;
import com.roadrunner.startworking.equipment.SelectedEquipmentKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getKeyboardKindJ9_QTjY implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaDescriptionCompat = 1;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int MediaMetadataCompat;
    public final /* synthetic */ Object MediaSessionCompatQueueItem;
    public final /* synthetic */ Object RatingCompat;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ getKeyboardKindJ9_QTjY(TransferChangeViewState transferChangeViewState, r8lambdacMvJsTJhw3hZOG60vfqxBRs6hS8 r8lambdacmvjstjhw3hzog60vfqxbrs6hs8, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, com.huawei.wisesecurity.ucs_credential.p0 p0Var, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i) {
        this.RemoteActionCompatParcelizer = 8;
        this.serializer = transferChangeViewState;
        this.IconCompatParcelizer = r8lambdacmvjstjhw3hzog60vfqxbrs6hs8;
        this.read = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.MediaSessionCompatQueueItem = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.RatingCompat = p0Var;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaMetadataCompat = i;
    }

    public /* synthetic */ getKeyboardKindJ9_QTjY(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.ui.Alignment.Vertical vertical2, intrinsicWidth intrinsicwidth, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, int i) {
        this.RemoteActionCompatParcelizer = 1;
        this.MediaSessionCompatQueueItem = modifier;
        this.serializer = horizontal;
        this.write = vertical;
        this.IconCompatParcelizer = vertical2;
        this.read = intrinsicwidth;
        this.RatingCompat = dragAndDropTargetModifierNode;
        this.MediaMetadataCompat = i;
    }

    public /* synthetic */ getKeyboardKindJ9_QTjY(removeGlobalCallbackParametersI removeglobalcallbackparametersi, androidx.compose.ui.Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3, int i) {
        this.RemoteActionCompatParcelizer = 19;
        this.serializer = removeglobalcallbackparametersi;
        this.MediaSessionCompatQueueItem = modifier;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
        this.RatingCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k3;
        this.MediaMetadataCompat = i;
    }

    public /* synthetic */ getKeyboardKindJ9_QTjY(ActivityHandler39 activityHandler39, String str, String str2, String str3, androidx.compose.ui.Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i) {
        this.RemoteActionCompatParcelizer = 20;
        this.serializer = activityHandler39;
        this.IconCompatParcelizer = str;
        this.read = str2;
        this.RatingCompat = str3;
        this.MediaSessionCompatQueueItem = modifier;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaMetadataCompat = i;
    }

    public /* synthetic */ getKeyboardKindJ9_QTjY(Object obj, Object obj2, androidx.compose.ui.Modifier modifier, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.RemoteActionCompatParcelizer = i2;
        this.serializer = obj;
        this.write = obj2;
        this.MediaSessionCompatQueueItem = modifier;
        this.IconCompatParcelizer = obj3;
        this.read = obj4;
        this.RatingCompat = obj5;
        this.MediaMetadataCompat = i;
    }

    public /* synthetic */ getKeyboardKindJ9_QTjY(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.RemoteActionCompatParcelizer = i2;
        this.serializer = obj;
        this.write = obj2;
        this.IconCompatParcelizer = obj3;
        this.read = obj4;
        this.RatingCompat = obj5;
        this.MediaSessionCompatQueueItem = modifier;
        this.MediaMetadataCompat = i;
    }

    public /* synthetic */ getKeyboardKindJ9_QTjY(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, int i2) {
        this.RemoteActionCompatParcelizer = i2;
        this.serializer = obj;
        this.write = obj2;
        this.IconCompatParcelizer = obj3;
        this.read = obj4;
        this.MediaSessionCompatQueueItem = obj5;
        this.RatingCompat = obj6;
        this.MediaMetadataCompat = i;
    }

    public /* synthetic */ getKeyboardKindJ9_QTjY(Object obj, Object obj2, Object obj3, Object obj4, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.RemoteActionCompatParcelizer = i2;
        this.serializer = obj;
        this.IconCompatParcelizer = obj2;
        this.read = obj3;
        this.RatingCompat = obj4;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaSessionCompatQueueItem = modifier;
        this.MediaMetadataCompat = i;
    }

    public /* synthetic */ getKeyboardKindJ9_QTjY(Object obj, Object obj2, Object obj3, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, isInvalidIndex isinvalidindex, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.RemoteActionCompatParcelizer = i2;
        this.serializer = obj;
        this.IconCompatParcelizer = obj2;
        this.read = obj3;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.RatingCompat = isinvalidindex;
        this.MediaSessionCompatQueueItem = modifier;
        this.MediaMetadataCompat = i;
    }

    public /* synthetic */ getKeyboardKindJ9_QTjY(Object obj, Object obj2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Object obj3, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.RemoteActionCompatParcelizer = i2;
        this.serializer = obj;
        this.IconCompatParcelizer = obj2;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.RatingCompat = obj3;
        this.MediaSessionCompatQueueItem = modifier;
        this.MediaMetadataCompat = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i3 = this.MediaMetadataCompat;
        Object obj3 = this.MediaSessionCompatQueueItem;
        Object obj4 = this.write;
        Object obj5 = this.RatingCompat;
        Object obj6 = this.read;
        Object obj7 = this.IconCompatParcelizer;
        Object obj8 = this.serializer;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                androidx.compose.material3.CheckboxKt.TriStateCheckbox((androidx.compose.ui.state.ToggleableState) obj8, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.graphics.drawscope.Stroke) obj7, (androidx.compose.ui.graphics.drawscope.Stroke) obj6, (androidx.compose.ui.Modifier) obj3, (SessionMutexwithSessionCancellingPrevious2) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                androidx.compose.foundation.layout.FlowLayoutKt.FlowRow((androidx.compose.ui.Modifier) obj3, (androidx.compose.foundation.layout.Arrangement.Horizontal) obj8, (androidx.compose.foundation.layout.Arrangement.Vertical) obj4, (androidx.compose.ui.Alignment.Vertical) obj7, (intrinsicWidth) obj6, (DragAndDropTargetModifierNode) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                AppMigrationFullScreenKt.AppMigrationFullScreen((clearAndSetSemantics) obj8, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ReportBottomSheetKt.write((hideSoftInput) obj8, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                TripPlannerItemKt.OrderInfo((String) obj8, (String) obj4, (String) obj7, (String) obj6, (findField) obj5, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                TripInformationKt.TripInformation((TripInformationUiModel) obj8, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (Nonelambda0) obj5, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                PickUpDropOffComposableFactoryImplKt.RemoteActionCompatParcelizer((r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ) obj8, (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) obj4, (getActionViewIntentlambda0) obj7, (i2) obj6, (defaultParamCount) obj3, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                SingleDeliveryPageKt.SingleDeliveryPage((TextIndent) obj8, (getActionViewIntentlambda0) obj4, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj7, (i2) obj6, (defaultParamCount) obj5, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                TransferChangeScreenKt.Content((TransferChangeViewState) obj8, (r8lambdacMvJsTJhw3hZOG60vfqxBRs6hS8) obj7, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, (com.huawei.wisesecurity.ucs_credential.p0) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                QrScannerScreenKt.QrScannerScreen((PreviewParameter) obj8, (accessgetMaxcp) obj7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                NotificationsDiagnosticsScreenKt.NotificationsDiagnosticsContent((getMaxHeight) obj8, (String) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                GoAndStartInformationDialogKt.write((makeContentView) obj8, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                NestScreenKt.NestContent((invoke0E7RQCE) obj8, (setCountrylambda1) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj5, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                InAppNotificationLayoutComponentsKt.Page((hasStableIds) obj8, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj7, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                InAppNotificationLayoutComponentsKt.InAppRow((getStateRestorationPolicy) obj8, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj7, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                int i4 = MediaDescriptionCompat + 83;
                MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                break;
            case 15:
                ((Integer) obj2).getClass();
                CountrySelectionKt.CountrySelection((a5ExternalSyntheticLambda0) obj8, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj7, (String) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                ForgotPasswordContentKt.ForgotPasswordContent((C0179j) obj8, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (androidx.compose.ui.Modifier) obj3, (getInvalidationTracker) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                OtpContentKt.OtpContent((bbExternalSyntheticLambda0) obj8, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (androidx.compose.ui.Modifier) obj3, (getInvalidationTracker) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                int i6 = MediaBrowserCompatMediaItem + 97;
                MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                break;
            case 18:
                ((Integer) obj2).getClass();
                BonusCalendarScreenKt.BonusCalendarContent((tc) obj8, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj6, (wdefault) obj5, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                EmailAndPhoneScreenKt.EmailAndPhoneContent((removeGlobalCallbackParametersI) obj8, (androidx.compose.ui.Modifier) obj3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                PasswordCreationScreenKt.Footer((ActivityHandler39) obj8, (String) obj7, (String) obj6, (String) obj5, (androidx.compose.ui.Modifier) obj3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                RiderSafetyReportScreenKt.RiderSafetyReportScreen((getOnDeeplinkResponseListener) obj8, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                RiderSafetyScoreKt.RiderSafetyScore((getPreinstallFilePath) obj8, (getLogger) obj4, (androidx.compose.ui.Modifier) obj3, (String) obj7, (String) obj6, (String) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                FutureShiftKt.FutureShift((FutureShiftUiModel) obj8, (logPushStoryPageClickedlambda11) obj4, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj6, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj5, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                FutureShiftKt.FutureShiftWithTitleColumn((doInBackground) obj8, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj6, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj5, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                OnDemandOfflineFloatingContentKt.OnDemandOfflineFloatingContent((AttributionHandler2) obj8, (getABI) obj7, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                int i8 = MediaBrowserCompatMediaItem + 81;
                MediaDescriptionCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    int i9 = 79 / 0;
                }
                break;
            case 26:
                ((Integer) obj2).getClass();
                UtilNetworking.write((String) obj8, (String) obj4, (androidx.compose.ui.Modifier) obj3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                r8lambdaZENoheqeAwue299tqO82jBghavc.RemoteActionCompatParcelizer((r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) obj8, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                FrequentlyUsedItemsKt.FrequentlyUsedItems((r8lambdaqnZRqetjfFf2WXtrt0EwRzhWIUs) obj8, (r8lambdaqnZRqetjfFf2WXtrt0EwRzhWIUs) obj4, (r8lambdaqnZRqetjfFf2WXtrt0EwRzhWIUs) obj7, (r8lambdaqnZRqetjfFf2WXtrt0EwRzhWIUs) obj6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                SelectedEquipmentKt.SelectedEquipment((String) obj8, (String) obj7, (String) obj6, (String) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
        }
        return createfromparcel;
    }
}
