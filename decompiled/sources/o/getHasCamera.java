package o;

import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.biometrics.presentation.compose.BiometricContentKt;
import com.roadrunner.delivery.accept.autoaccept.presentation.DeliveryAutoAcceptUiModelImpl;
import com.roadrunner.delivery.accept.bottomsheet.overlay.presentation.compose.FloatingContentKt;
import com.roadrunner.delivery.accept.bottomsheet.overlay.presentation.compose.OverlayFooterKt;
import com.roadrunner.delivery.accept.laststop.presentation.compose.LastStopAddressManageBottomSheetKt;
import com.roadrunner.delivery.accept.payatpickup.implementation.presentation.compose.PayAtPickupWithPaymentOptionsKt;
import com.roadrunner.delivery.ontheway.address.presentation.compose.DestinationAddressKt;
import com.roadrunner.delivery.ontheway.crowdsourcing.floating.presentation.components.FloatingImageButtonKt;
import com.roadrunner.delivery.ontheway.crowdsourcing.navigation.presentation.compose.NavigationCrowdsourcingKt;
import com.roadrunner.delivery.ontheway.deliverynotes.api.DeliveryNotesLinkUiModel;
import com.roadrunner.delivery.ontheway.deliverynotes.api.DeliveryNotesUiModel;
import com.roadrunner.delivery.ontheway.deliverynotes.presentation.compose.DeliveryNotesKt;
import com.roadrunner.delivery.ontheway.deliverynotes.presentation.compose.DeliveryNotesLinkKt;
import com.roadrunner.delivery.ontheway.entrancepicture.floatingicon.presentation.EntrancePictureIconKt;
import com.roadrunner.delivery.ontheway.entrancepicture.navigation.presentation.NavigationEntrancePictureKt;
import com.roadrunner.delivery.ontheway.header.implementation.presentation.compose.DestinationHeaderWithAddressKt;
import com.roadrunner.delivery.ontheway.tripplanner.actions.presentation.compose.ActionsBottomSheetKt;
import com.roadrunner.delivery.ontheway.tripplanner.list.presentation.compose.TripPlannerListKt;
import com.roadrunner.delivery.pickupdropoff.tasks.cardcashpayment.presentation.compose.CardCashPaymentKt;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.compose.v2.CustomerUnavailableScreenV2Kt;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem;
import com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.presentation.compose.PinValidationContentV1Kt;
import com.roadrunner.delivery.pickupdropoff.tasks.qrpayment.presentation.screen.compose.ShowQrCodeKt;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.compose.QrCodeScanKt;
import com.roadrunner.delivery.pickupdropoff.tasks.signature.presentation.compose.SignatureContentKt;
import com.roadrunner.home.CreateHomeScope;
import com.roadrunner.tnc.TncComposableFactoryImpl$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getHasCamera implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int RatingCompat;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ getHasCamera(PreviewLightDark previewLightDark, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier, int i) {
        this.serializer = 26;
        this.write = previewLightDark;
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.IconCompatParcelizer = modifier;
        this.RatingCompat = i;
    }

    public /* synthetic */ getHasCamera(int i, int i2, Object obj, Object obj2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.serializer = i2;
        this.write = obj;
        this.IconCompatParcelizer = obj2;
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.RatingCompat = i;
    }

    public /* synthetic */ getHasCamera(int i, int i2, androidx.compose.ui.Modifier modifier, Object obj, Object obj2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.serializer = i2;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.IconCompatParcelizer = modifier;
        this.write = obj;
        this.read = obj2;
        this.RatingCompat = i;
    }

    public /* synthetic */ getHasCamera(Object obj, Object obj2, Object obj3, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.serializer = i2;
        this.write = obj;
        this.RemoteActionCompatParcelizer = obj2;
        this.read = obj3;
        this.IconCompatParcelizer = modifier;
        this.RatingCompat = i;
    }

    public /* synthetic */ getHasCamera(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.serializer = i2;
        this.write = obj;
        this.RemoteActionCompatParcelizer = obj2;
        this.IconCompatParcelizer = obj3;
        this.read = obj4;
        this.RatingCompat = i;
    }

    public /* synthetic */ getHasCamera(String str, s4 s4Var, androidx.compose.ui.Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i) {
        this.serializer = 12;
        this.write = str;
        this.read = s4Var;
        this.IconCompatParcelizer = modifier;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.RatingCompat = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 25;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        Object obj3 = this.IconCompatParcelizer;
        Object obj4 = this.read;
        Object obj5 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.RatingCompat;
        Object obj6 = this.write;
        switch (i4) {
            case 0:
                ((Integer) obj2).getClass();
                androidx.compose.material3.CheckboxKt.IconCompatParcelizer((androidx.compose.ui.state.ToggleableState) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (androidx.compose.ui.Modifier) obj3, (SessionMutexwithSessionCancellingPrevious2) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                PullToRefreshModifierNodeupdate1.write((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (androidx.compose.ui.Modifier) obj3, (RadioButtonTokens) obj6, (CheckboxTokens) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                androidx.compose.material3.internal.BasicTooltipKt.WrappedAnchor((androidx.compose.material3.TooltipStateImpl) obj6, (PopulateViewStructure_androidKtpopulate7) obj5, (androidx.compose.ui.Modifier) obj3, (DragAndDropTargetModifierNode) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i5);
                ((DragAndDropTargetModifierNode) obj6).write(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.read, (getBirthDateFull) obj, iRemoteActionCompatParcelizer | 1);
                break;
            case 4:
                ((Integer) obj2).getClass();
                BiometricContentKt.BiometricContent((SemanticsSortKtUnmergedConfigComparator1) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ExecuteDelayUsingPostAndRemove.IconCompatParcelizer((r8lambdaG2Lta7vZPQRir3Ldpv_t1nZTSzg) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                MediaMetadataCompat.IconCompatParcelizer((DeliveryAutoAcceptUiModelImpl) obj6, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                FloatingContentKt.FloatingContent((getPlatformAndroidManager) obj6, (SignInDataStore) obj5, (drawTextLVfH_YUdefault) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                OverlayFooterKt.OverlayStickyFooter((drawTextLVfH_YU) obj6, (accessstripNonMetricAffectingCharacterStyleSpans) obj5, (TncComposableFactoryImpl$$ExternalSyntheticLambda0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                BoringLayoutFactoryDefault.write((clipOutRect) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                LastStopAddressManageBottomSheetKt.LastStopAddressManageContent((getSaveCount) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                PayAtPickupWithPaymentOptionsKt.PaymentOptionChips((String) obj6, (LetterSpacingSpanPx) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                DestinationAddressKt.Address((String) obj6, (s4) obj4, (androidx.compose.ui.Modifier) obj3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                FloatingImageButtonKt.FloatingImageButton((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (androidx.compose.ui.Modifier) obj3, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj6, (DragAndDropTargetModifierNode) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                NavigationCrowdsourcingKt.NavigationCrowdsourcingWithImage((getCharactersIUNYP9kannotations) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (androidx.compose.ui.Modifier) obj3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                DeliveryNotesKt.DeliveryNotes((DeliveryNotesUiModel) obj6, (CreateHomeScope) obj5, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                DeliveryNotesLinkKt.DeliveryNotesLink((DeliveryNotesLinkUiModel) obj6, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj5, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                EntrancePictureIconKt.write((getNativeTypefacePYhJU0U) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                NavigationEntrancePictureKt.RemoteActionCompatParcelizer((AndroidMultiParagraphDraw_androidKt) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                DestinationHeaderWithAddressKt.DestinationHeaderWithAddressDeliveryStatus((AndroidTextPaint) obj6, (DragAndDropTargetModifierNode) obj5, (DragAndDropTargetModifierNode) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                EmojiCompatStatus.serializer((AndroidTypefaceCache) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                ActionsBottomSheetKt.ActionsBottomSheet((setBrushAndDrawyzxVdVo) obj6, (androidx.compose.ui.Modifier) obj3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                TripPlannerListKt.TripPlannerListContainer((BaselineShiftCompanion) obj6, (getQueryContext) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                TripPlannerListKt.TripPlannerList((BaselineShift) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 24:
                ((Integer) obj2).intValue();
                CardCashPaymentKt.ActionButtons((CashPaymentTaskUiItem) obj6, (getEnterjXw82LU) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                CustomerUnavailableScreenV2Kt.CustomerUnavailableScreenV2((accessibleField) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                int i6 = MediaSessionCompatQueueItem + 7;
                MediaBrowserCompatMediaItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                break;
            case 26:
                ((Integer) obj2).getClass();
                PinValidationContentV1Kt.PinValidationContentV1((PreviewLightDark) obj6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                ShowQrCodeKt.QrCodeScanComposable((takeOrElseD5KLDUw) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                QrCodeScanKt.QrCodeScanComposable((PreviewContainer) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                SignatureContentKt.SignatureContent((wrapper) obj6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
        }
        return createfromparcel;
    }
}
