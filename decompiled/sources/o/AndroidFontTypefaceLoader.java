package o;

import com.roadrunner.delivery.accept.tags.presentation.compose.TagsContentKt;
import com.roadrunner.delivery.inappcamera.api.model.InAppCameraOverlayItem$Tag;
import com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.image_overlay_v2.TagsListContentKt;
import com.roadrunner.delivery.ontheway.actionablemessage.presentation.ActionableMessageCardContainerKt;
import com.roadrunner.delivery.ontheway.crowdsourcing.sharing.presentation.compose.ContentSharingContentKt;
import com.roadrunner.delivery.ontheway.crowdsourcing.terms.presentation.compose.TermsAndConditionsKt;
import com.roadrunner.delivery.ontheway.header.implementation.presentation.compose.DestinationHeaderButtonsKt;
import com.roadrunner.delivery.ontheway.header.implementation.presentation.compose.DestinationHeaderWithAddressKt;
import com.roadrunner.delivery.ontheway.tripplanner.list.presentation.compose.TripPlannerItemKt;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.recenter.compose.NavigationRecenterKt;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.speedlimit.compose.SpeedLimitKt;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.streetname.compose.StreetNameKt;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.compose.SwitcherKt;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.tripinformation.compose.TripInformationKt;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.voicetoggle.compose.VoiceToggleKt;
import com.roadrunner.delivery.pickupdropoff.details.presentation.compose.InstructionsKt;
import com.roadrunner.delivery.pickupdropoff.details.presentation.compose.PaymentKt;
import com.roadrunner.delivery.pickupdropoff.details.presentation.compose.v1.BagsAndItemsDetailKt;
import com.roadrunner.delivery.pickupdropoff.details.presentation.compose.v1.BagsAndItemsV1Kt;
import com.roadrunner.delivery.pickupdropoff.tasks.cardcashpayment.presentation.compose.CardCashPaymentKt;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.CalculatorState;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.compose.TransferChangeScreenKt;
import com.roadrunner.delivery.pickupdropoff.tasks.datepicker.presentation.compose.DatePickerAgeCheckContentKt;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.scan.compose.ScannerCanvasKt;
import com.roadrunner.diagnostics.presentation.view.NotificationsDiagnosticsScreenKt;
import com.roadrunner.face.verification.presentation.selfie.camera.SelfieCameraContentKt;
import com.roadrunner.freelancing.presentation.bonusinfo.BonusInformationDialogKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class AndroidFontTypefaceLoader implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatQueueItem = 1;
    private static int write;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ Object serializer;

    public /* synthetic */ AndroidFontTypefaceLoader(int i, int i2, Object obj, Object obj2) {
        this.read = i2;
        this.serializer = obj;
        this.IconCompatParcelizer = obj2;
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 85;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.RemoteActionCompatParcelizer;
        Object obj3 = this.IconCompatParcelizer;
        Object obj4 = this.serializer;
        switch (i4) {
            case 0:
                ((Integer) obj2).getClass();
                TagsContentKt.Tags((getAssetManager) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                TagsListContentKt.TagsItem((InAppCameraOverlayItem$Tag) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ActionableMessageCardContainerKt.BackgroundCard((getTopLeftnOccac) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ContentSharingContentKt.SubjectInfo((setOnRequestDisallowInterceptTouchEventui) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                TermsAndConditionsKt.ExamplePhoto((getUnspecifiedIUNYP9k) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                DestinationHeaderButtonsKt.RemoteActionCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (getSpanVerticalAligndo9XGgannotations) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                int i6 = write + 73;
                MediaSessionCompatQueueItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                break;
            case 6:
                ((Integer) obj2).getClass();
                DestinationHeaderWithAddressKt.DestinationHeaderWithAddressDeliveryStatusContent((AndroidTextPaint) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                TripPlannerItemKt.write((findField) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                int i8 = write + 11;
                MediaSessionCompatQueueItem = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                break;
            case 8:
                ((Integer) obj2).getClass();
                NavigationRecenterKt.NavigationRecenter((LineHeightStyleMode) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                SpeedLimitKt.RemoteActionCompatParcelizer((accessgetFirstLineTopcp) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                StreetNameKt.read((getNoneEVpEnUU) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                StreetNameKt.RemoteActionCompatParcelizer((TextAlignCompanion) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                SwitcherKt.Switcher((getJustifye0LSkKk) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                TripInformationKt.TripInformationTextContainer((accessgetContentcp) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                VoiceToggleKt.VoiceToggle((TextDirectionKt) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                InstructionsKt.IconCompatParcelizer((r8lambdanlfTZVuvy_8jMV3I3Z3dE7gl_2g) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                PaymentKt.RemoteActionCompatParcelizer((accesstoViewInfoFactory) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                BagsAndItemsDetailKt.ProductItemsList((r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) obj4, (DragAndDropTargetModifierNode) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                BagsAndItemsDetailKt.ItemsSummary((WrapPreviewlambda1) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                BagsAndItemsV1Kt.BagsAndItemsV1((r8lambdaMtsD8x0F0XuTzn3OeIE_s8mt0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                CardCashPaymentKt.Done((getEnterjXw82LU) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 21:
                ((Integer) obj2).intValue();
                CardCashPaymentKt.IconCompatParcelizer((getEnterjXw82LU) obj4, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 22:
                ((Integer) obj2).intValue();
                TransferChangeScreenKt.read((r8lambdacMvJsTJhw3hZOG60vfqxBRs6hS8) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 23:
                ((Integer) obj2).intValue();
                TransferChangeScreenKt.Calculator((CalculatorState) obj4, (r8lambdacMvJsTJhw3hZOG60vfqxBRs6hS8) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 24:
                ((Integer) obj2).intValue();
                DatePickerAgeCheckContentKt.DateViewerPicker((extractFromIndyLambdaFields) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                ScannerCanvasKt.read((accessgetMaxcp) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.image_overlay_v2.TagsListContentKt.TagsItem((C0158device) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 27:
                ((Integer) obj2).intValue();
                NotificationsDiagnosticsScreenKt.NotificationsDiagnosticsScreen((getReferencedIds) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                SelfieCameraContentKt.IconCompatParcelizer((setNavigationOnClickListener) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            default:
                getBoundingRects getboundingrects = (getBoundingRects) obj4;
                ((Integer) obj2).getClass();
                BonusInformationDialogKt.BonusInformationDialog(getboundingrects, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
        }
        return createfromparcel;
    }
}
