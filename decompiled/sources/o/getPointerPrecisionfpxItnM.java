package o;

import com.roadrunner.appmigration.presentation.compose.AppMigrationKt;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.delivery.accept.acceptbutton.presentation.AcceptButtonComposableKt;
import com.roadrunner.delivery.accept.acceptbutton.presentation.DeliveryAcceptButtonUiModelImpl;
import com.roadrunner.delivery.accept.bottomsheet.overlay.presentation.compose.OverlayBodyKt;
import com.roadrunner.delivery.ontheway.actionablemessage.presentation.ActionableMessageCardContainerKt;
import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.compose.DeliveryDetailsKt;
import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.compose.ReportBottomSheetKt;
import com.roadrunner.delivery.ontheway.crowdsourcing.terms.presentation.compose.TermsAndConditionsKt;
import com.roadrunner.delivery.ontheway.destinationdetails.api.DestinationDetailsUiModel;
import com.roadrunner.delivery.ontheway.destinationdetails.presentation.compose.DestinationDetailsKt;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.tripinformation.compose.TripInformationKt;
import com.roadrunner.delivery.pickupdropoff.details.api.PickUpDropOffDetailsUiModel;
import com.roadrunner.delivery.pickupdropoff.details.contactrider.presentation.compose.ContactRiderBottomSheetKt;
import com.roadrunner.delivery.pickupdropoff.details.presentation.compose.InstructionsKt;
import com.roadrunner.delivery.pickupdropoff.details.presentation.compose.PickUpDropOffDetailsKt;
import com.roadrunner.delivery.pickupdropoff.presentation.PickUpDropOffComposableFactoryImplKt;
import com.roadrunner.delivery.pickupdropoff.tasks.cardcashpayment.presentation.compose.CardCashPaymentKt;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.reason.AmountChangeReasonScreenKt;
import com.roadrunner.delivery.pickupdropoff.tasks.taptopay.presentation.compose.TapToPayContentKt;
import com.roadrunner.delivery.stacked.delivery.details.ui.compose.StackedDeliveryDetailsContentKt;
import com.roadrunner.delivery.state.pudo.TagToken;
import com.roadrunner.freelancing.api.presentation.WorkNowUiModel;
import com.roadrunner.freelancing.presentation.WorkNowRowKt;
import com.roadrunner.freelancing.presentation.infraboost.WorkNowWithInfraBoostKt;
import com.roadrunner.home.nest.NestItemsContentKt;
import com.roadrunner.home.nest.NestScreenKt;
import com.sentiance.core.model.events.N$b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getPointerPrecisionfpxItnM implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaMetadataCompat = 1;
    private static int RatingCompat;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int MediaDescriptionCompat;
    public final /* synthetic */ Object MediaSessionCompatQueueItem;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ getPointerPrecisionfpxItnM(String str, String str2, getPostalCode getpostalcode, Class cls, int i, androidx.compose.ui.tooling.ComposeViewAdapter composeViewAdapter) {
        this.RemoteActionCompatParcelizer = 4;
        this.write = str;
        this.IconCompatParcelizer = str2;
        this.read = getpostalcode;
        this.serializer = cls;
        this.MediaDescriptionCompat = i;
        this.MediaSessionCompatQueueItem = composeViewAdapter;
    }

    public /* synthetic */ getPointerPrecisionfpxItnM(Object obj, Object obj2, Object obj3, Object obj4, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.RemoteActionCompatParcelizer = i2;
        this.write = obj;
        this.read = obj2;
        this.serializer = obj3;
        this.MediaSessionCompatQueueItem = obj4;
        this.IconCompatParcelizer = modifier;
        this.MediaDescriptionCompat = i;
    }

    public /* synthetic */ getPointerPrecisionfpxItnM(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.RemoteActionCompatParcelizer = i2;
        this.write = obj;
        this.IconCompatParcelizer = obj2;
        this.read = obj3;
        this.serializer = obj4;
        this.MediaSessionCompatQueueItem = obj5;
        this.MediaDescriptionCompat = i;
    }

    public /* synthetic */ getPointerPrecisionfpxItnM(int i, int i2, androidx.compose.ui.Modifier modifier, Object obj, Object obj2, Object obj3, isInvalidIndex isinvalidindex) {
        this.RemoteActionCompatParcelizer = i2;
        this.write = obj;
        this.read = obj2;
        this.serializer = obj3;
        this.IconCompatParcelizer = modifier;
        this.MediaSessionCompatQueueItem = isinvalidindex;
        this.MediaDescriptionCompat = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i3 = this.MediaDescriptionCompat;
        Object obj3 = this.serializer;
        Object obj4 = this.read;
        Object obj5 = this.IconCompatParcelizer;
        Object obj6 = this.MediaSessionCompatQueueItem;
        Object obj7 = this.write;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                androidx.compose.material3.CheckboxKt.read((androidx.compose.ui.state.ToggleableState) obj7, (androidx.compose.ui.Modifier) obj5, (SessionMutexwithSessionCancellingPrevious2) obj4, (androidx.compose.ui.graphics.drawscope.Stroke) obj3, (androidx.compose.ui.graphics.drawscope.Stroke) obj6, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 1:
                ((Integer) obj2).intValue();
                int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
                requiredHeightInVpY3zN4default.RemoteActionCompatParcelizer((androidx.compose.animation.core.Transition) obj7, (requiredSize3ABfNKs) obj5, this.read, this.serializer, (Arrangement) obj6, (getBirthDateFull) obj, iRemoteActionCompatParcelizer);
                return createfromparcel;
            case 2:
                ((Integer) obj2).getClass();
                androidx.compose.material3.BottomSheetScaffoldKt.BottomSheetScaffoldLayout((DragAndDropTargetModifierNode) obj7, (DragAndDropTargetModifierNode) obj5, (DragAndDropTargetModifierNode) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (androidx.compose.material3.SheetState) obj6, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 3:
                ((Integer) obj2).getClass();
                androidx.compose.material3.internal.BasicTooltipKt.BasicTooltipBox((androidx.compose.ui.window.PopupPositionProvider) obj7, (DragAndDropTargetModifierNode) obj4, (androidx.compose.material3.TooltipStateImpl) obj3, (androidx.compose.ui.Modifier) obj5, (DragAndDropTargetModifierNode) obj6, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 4:
                int iIntValue = ((Integer) obj2).intValue();
                return androidx.compose.ui.tooling.ComposeViewAdapter.init$lambda$2$0$0((String) obj7, (String) obj5, (getPostalCode) obj4, (Class) obj3, this.MediaDescriptionCompat, (androidx.compose.ui.tooling.ComposeViewAdapter) obj6, (getBirthDateFull) obj, iIntValue);
            case 5:
                ((Integer) obj2).getClass();
                AppMigrationKt.AppMigrationContainer((clearAndSetSemantics) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (androidx.compose.ui.Modifier) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 6:
                ((Integer) obj2).getClass();
                multiRemove.IconCompatParcelizer((accessmultiRemove) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (androidx.compose.ui.Modifier) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 7:
                ((Integer) obj2).getClass();
                AcceptButtonComposableKt.write((DeliveryAcceptButtonUiModelImpl) obj7, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (androidx.compose.ui.Modifier) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 8:
                ((Integer) obj2).getClass();
                AcceptButtonComposableKt.read((HyphensSaverlambda0) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (androidx.compose.ui.Modifier) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 9:
                ((Integer) obj2).getClass();
                OverlayBodyKt.OverlayBody((getPlatformAndroidManager) obj7, (getPlatformAndroidManager) obj4, (N$b) obj3, (TextPainterKt) obj6, (androidx.compose.ui.Modifier) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 10:
                ((Integer) obj2).getClass();
                ActionableMessageCardContainerKt.CardContent((getTopLeftnOccac) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj6, (androidx.compose.ui.Modifier) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                int i4 = MediaMetadataCompat + 21;
                RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return createfromparcel;
            case 11:
                ((Integer) obj2).getClass();
                DeliveryDetailsKt.DetailsSection((updateExtractedText) obj7, (androidx.compose.ui.Modifier) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                int i6 = RatingCompat + 55;
                MediaMetadataCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    return createfromparcel;
                }
                throw null;
            case 12:
                ((Integer) obj2).intValue();
                ReportBottomSheetKt.ReportSheetContent((hideSoftInput) obj7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 13:
                ((Integer) obj2).getClass();
                TermsAndConditionsKt.TermsAndConditions((KeyboardType) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (androidx.compose.ui.Modifier) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 14:
                ((Integer) obj2).intValue();
                DestinationDetailsKt.read((DestinationDetailsUiModel) obj7, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj5, (r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) obj4, (r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) obj3, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj6, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 15:
                ((Integer) obj2).getClass();
                TripInformationKt.RemoteActionCompatParcelizer((accessgetContentcp) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, (androidx.compose.ui.Modifier) obj5, (DragAndDropTargetModifierNode) obj6, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 16:
                ((Integer) obj2).getClass();
                ContactRiderBottomSheetKt.ContactRiderBottomSheet((hasDesignInfo) obj7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (androidx.compose.ui.Modifier) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 17:
                ((Integer) obj2).getClass();
                InstructionsKt.Instruction((String) obj7, (String) obj4, (TagToken) obj3, (androidx.compose.ui.Modifier) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 18:
                ((Integer) obj2).getClass();
                PickUpDropOffDetailsKt.PickUpDropOffDetails((PickUpDropOffDetailsUiModel) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj6, (androidx.compose.ui.Modifier) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 19:
                ((Integer) obj2).getClass();
                PickUpDropOffComposableFactoryImplKt.DeliveryPages((r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) obj7, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj5, (getActionViewIntentlambda0) obj4, (i2) obj3, (defaultParamCount) obj6, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 20:
                ((Integer) obj2).getClass();
                CardCashPaymentKt.DefaultState((getEnterjXw82LU) obj7, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj6, (androidx.compose.ui.Modifier) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 21:
                ((Integer) obj2).getClass();
                AmountChangeReasonScreenKt.AmountChangeReasonScreen((String) obj7, (String) obj5, (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj6, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 22:
                ((Integer) obj2).getClass();
                getDp.RemoteActionCompatParcelizer((String) obj7, (ComposeAnimationState) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (androidx.compose.ui.Modifier) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 23:
                ((Integer) obj2).getClass();
                TapToPayContentKt.IconCompatParcelizer((getMaxHeightimpl) obj7, (isZeroannotations) obj4, (restrictConstraintsxF2OJ5Qdefault) obj3, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj6, (androidx.compose.ui.Modifier) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 24:
                ((Integer) obj2).getClass();
                StackedDeliveryDetailsContentKt.StackedDeliveryDetailsContent((getUnspecifiedUIouoOA) obj7, (SignInDataStore) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj6, (androidx.compose.ui.Modifier) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                int i7 = RatingCompat + 11;
                MediaMetadataCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return createfromparcel;
            case 25:
                ((Integer) obj2).getClass();
                WorkNowRowKt.WorkNow((getTappableElementInsets) obj7, (logPushStoryPageClickedlambda11) obj4, (WorkNowUiModel) obj3, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj6, (androidx.compose.ui.Modifier) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 26:
                ((Integer) obj2).getClass();
                WorkNowRowKt.WorkNowRow((constructCompatStyleForBundle) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (androidx.compose.ui.Modifier) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 27:
                ((Integer) obj2).getClass();
                WorkNowWithInfraBoostKt.WorkNowRowWithInfraBoost((NotificationCompatStyle) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (androidx.compose.ui.Modifier) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 28:
                ((Integer) obj2).getClass();
                NestItemsContentKt.NestItemsContent((invokegIAlus) obj7, (setCountrylambda1) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj6, (androidx.compose.ui.Modifier) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            default:
                ((Integer) obj2).getClass();
                NestScreenKt.NestScreen((getRouternavigation_release) obj7, (setCountrylambda1) obj4, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (androidx.compose.ui.Modifier) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
        }
    }
}
