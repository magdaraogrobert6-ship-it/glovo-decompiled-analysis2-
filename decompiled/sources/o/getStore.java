package o;

import com.roadrunner.delivery.ontheway.actionablemessage.presentation.ActionableMessageCardComponentsKt;
import com.roadrunner.delivery.ontheway.address.presentation.compose.DestinationAddressKt;
import com.roadrunner.delivery.ontheway.crowdsourcing.navigation.presentation.compose.NavigationCrowdsourcingKt;
import com.roadrunner.delivery.ontheway.crowdsourcing.sharing.presentation.compose.ContentSharingContentKt;
import com.roadrunner.delivery.ontheway.entrancepicture.floatingicon.presentation.EntrancePictureIconKt;
import com.roadrunner.delivery.ontheway.entrancepicture.floatingicon.presentation.EntrancePictureIconUiModelImpl;
import com.roadrunner.delivery.ontheway.entrancepicture.navigation.presentation.NavigationEntrancePictureKt;
import com.roadrunner.delivery.ontheway.header.implementation.presentation.compose.DestinationHeaderKt;
import com.roadrunner.delivery.ontheway.header.implementation.presentation.compose.DestinationHeaderWithAddressKt;
import com.roadrunner.delivery.ontheway.navigation.presentation.NavigationButtonUiModelImpl;
import com.roadrunner.delivery.ontheway.navigation.presentation.compose.NavigationButtonKt;
import com.roadrunner.delivery.ontheway.tripplanner.list.presentation.compose.TripPlannerListKt;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.compose.SwitcherKt;
import com.roadrunner.delivery.pickupdropoff.details.presentation.compose.InstructionV2Kt;
import com.roadrunner.delivery.pickupdropoff.details.presentation.compose.InstructionsKt;
import com.roadrunner.delivery.pickupdropoff.details.presentation.compose.SplitOrderInstructionKt;
import com.roadrunner.delivery.pickupdropoff.details.presentation.compose.v1.OrderHeaderV1Kt;
import com.roadrunner.delivery.pickupdropoff.tasks.acknowledgement.presentation.compose.AcknowledgmentContentKt;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferButtonState;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.compose.TransferChangeScreenKt;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.compose.CustomerUnavailableContentKt;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.compose.v2.CustomerUnavailableV2ContentKt;
import com.roadrunner.delivery.pickupdropoff.tasks.datepicker.presentation.compose.DatePickerAgeCheckContentKt;
import com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.compose.MultipleCodeScanKt;
import com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.compose.ScannerCanvasKt;
import com.roadrunner.delivery.pickupdropoff.tasks.presentation.error.PickUpDropOffTasksErrorKt;
import com.roadrunner.delivery.pickupdropoff.tasks.qrpayment.presentation.compose.QrPaymentKt;
import com.roadrunner.delivery.pickupdropoff.tasks.qrpayment.presentation.screen.compose.ShowQrCodeKt;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.scan.compose.QrScannerOverlayKt;
import com.roadrunner.ontheway.address.DestinationAddressUiModel;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getStore implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ getStore(int i, int i2, androidx.compose.ui.Modifier modifier, Object obj, Object obj2) {
        this.serializer = i2;
        this.read = obj;
        this.IconCompatParcelizer = modifier;
        this.write = obj2;
        this.RemoteActionCompatParcelizer = i;
    }

    public /* synthetic */ getStore(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.serializer = i2;
        this.read = obj;
        this.write = obj2;
        this.IconCompatParcelizer = obj3;
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 95;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.serializer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        int i4 = this.RemoteActionCompatParcelizer;
        Object obj3 = this.IconCompatParcelizer;
        Object obj4 = this.write;
        Object obj5 = this.read;
        switch (i3) {
            case 0:
                ((Integer) obj2).getClass();
                CompositionDataRecord.write((ComposeViewAdapterprocessViewInfos2) obj5, (androidx.compose.foundation.pager.PagerState) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 1:
                ((Integer) obj2).getClass();
                ActionableMessageCardComponentsKt.MessageRow((getTopLeftnOccac) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 2:
                ((Integer) obj2).getClass();
                ActionableMessageCardComponentsKt.QuickRepliesRow((recordmLhObY) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 3:
                ((Integer) obj2).getClass();
                DestinationAddressKt.RemoteActionCompatParcelizer((s5) obj5, (androidx.compose.ui.Modifier) obj3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 4:
                ((Integer) obj2).getClass();
                DestinationAddressKt.RemoteActionCompatParcelizer((DestinationAddressUiModel) obj5, (Nonelambda0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 5:
                ((Integer) obj2).getClass();
                NavigationCrowdsourcingKt.NavigationCrowdsourcing((accessgetCharacterscp) obj5, (androidx.compose.ui.Modifier) obj3, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 6:
                ((Integer) obj2).intValue();
                ContentSharingContentKt.ImageGrid((r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 7:
                ((Integer) obj2).getClass();
                EntrancePictureIconKt.EntrancePictureIcon((EntrancePictureIconUiModelImpl) obj5, (androidx.compose.ui.Modifier) obj3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 8:
                ((Integer) obj2).getClass();
                NavigationEntrancePictureKt.NavigationEntrancePicture((toUrlLink) obj5, (androidx.compose.ui.Modifier) obj3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 9:
                ((Integer) obj2).getClass();
                DestinationHeaderKt.serializer((AndroidStringDelegate) obj5, (androidx.compose.ui.Modifier) obj3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 10:
                ((Integer) obj2).getClass();
                int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1);
                DestinationHeaderWithAddressKt.DestinationHeaderWithAddressActions(iRemoteActionCompatParcelizer, (getBirthDateFull) obj, (DragAndDropTargetModifierNode) obj5, (DragAndDropTargetModifierNode) obj4, (androidx.compose.ui.Modifier) obj3);
                return createfromparcel2;
            case 11:
                ((Integer) obj2).intValue();
                NavigationButtonKt.NavigationButton((NavigationButtonUiModelImpl) obj5, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 12:
                ((Integer) obj2).getClass();
                TripPlannerListKt.IconCompatParcelizer((BaselineShift) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                int i5 = MediaDescriptionCompat + 67;
                RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return createfromparcel2;
            case 13:
                ((Integer) obj2).getClass();
                SwitcherKt.write((valueOfIgVj0fw) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 14:
                ((Integer) obj2).getClass();
                InstructionV2Kt.InstructionV2((r8lambdaDRPn8vo7fbNhOYXF0RJOGYS4e6M) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 15:
                ((Integer) obj2).getClass();
                InstructionsKt.RemoteActionCompatParcelizer((r8lambda6ugNDFPZCmsyUQ0qlnt0YI4vxE) obj5, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                int i7 = MediaDescriptionCompat + 27;
                RatingCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return createfromparcel2;
            case 16:
                ((Integer) obj2).getClass();
                SplitOrderInstructionKt.SplitOrderInstruction((r8lambda4xemsQi_rXvuhFGMMjGIfxFd9k) obj5, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 17:
                ((Integer) obj2).getClass();
                OrderHeaderV1Kt.OrderHeaderV1((r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 18:
                ((Integer) obj2).getClass();
                AcknowledgmentContentKt.AcknowledgmentContent((InfiniteTransitionSearchInfo) obj5, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 19:
                ((Integer) obj2).intValue();
                TransferChangeScreenKt.IconCompatParcelizer((TransferButtonState) obj5, (r8lambdacMvJsTJhw3hZOG60vfqxBRs6hS8) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 20:
                ((Integer) obj2).getClass();
                CustomerUnavailableContentKt.CustomerUnavailableContent((makeTreedefault) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 21:
                ((Integer) obj2).getClass();
                CustomerUnavailableV2ContentKt.CustomerUnavailableV2Content((accessibleField) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 22:
                ((Integer) obj2).getClass();
                DatePickerAgeCheckContentKt.DatePickerAgeCheckContent((extractFromIndyLambdaFields) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 23:
                ((Integer) obj2).getClass();
                MultipleCodeScanKt.MultipleCodeScanContent((sourceInformationContextOf) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 24:
                ((Integer) obj2).getClass();
                coerceAtLeastYgX7TsA.write((r8lambda9saPDiQX6C5HcUvRgmuVyXEkHj8) obj5, (C0204sourceLocation) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 25:
                ((Integer) obj2).getClass();
                ScannerCanvasKt.RemoteActionCompatParcelizer((invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationTakePictureTaskComposableFactoryV1ImplExternalSyntheticLambda0) obj5, (androidx.compose.ui.Modifier) obj3, (Float) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 26:
                ((Integer) obj2).getClass();
                PickUpDropOffTasksErrorKt.PickUpDropOffTasksError((LayoutlibFontResourceLoader) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 27:
                ((Integer) obj2).intValue();
                QrPaymentKt.IconCompatParcelizer((C0195provider) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 28:
                ((Integer) obj2).intValue();
                ShowQrCodeKt.QrImageComposable((takeOrElseD5KLDUw) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            default:
                accessgetMaxcp accessgetmaxcp = (accessgetMaxcp) obj5;
                ((Integer) obj2).getClass();
                QrScannerOverlayKt.read(accessgetmaxcp, (PreviewParameter) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
        }
    }
}
