package o;

import com.roadrunner.opportunities.calendar.info.CalendarInformationScreenKt;
import com.roadrunner.overlay.bubble.banner.presentation.OverlayVisibilityBannerKt;
import com.roadrunner.push.presentation.NotificationDialogKt;
import com.roadrunner.push.presentation.viewentity.MessageDialogData;
import com.roadrunner.rider.recruitment.accountcreation.email_and_phone.presentation.CountryCodePickerBottomSheetKt;
import com.roadrunner.rider.safety.permission.presentation.missingpermission.MissingPermissionsContentKt;
import com.roadrunner.rider.state.finishedshift.presentation.FinishedShiftV2Kt;
import com.roadrunner.rider.state.futureshift.presentation.compose.FutureShiftTitleRowKt;
import com.roadrunner.rider.state.noorders.api.HomeNoOrdersUiModel;
import com.roadrunner.rider.state.noorders.presentation.RiderStateNoOrdersKt;
import com.roadrunner.rider.state.offertowork.presentation.OfferToWorkKt;
import com.roadrunner.rider.state.onpause.presentation.OnPauseScreenKt;
import com.roadrunner.rider.state.shiftextension.presentation.ShiftExtensionKt;
import com.roadrunner.rider.state.summary.nest.NestRiderStateSummaryColumnKt;
import com.roadrunner.rrds.compose.component.navigations.TabsKt;
import com.roadrunner.rrds.compose.component.stepper.TaskStatusIndicatorKt;
import com.roadrunner.settings.presentation.turnoffpromotion.TurnOffPromotionDialogKt;
import com.roadrunner.settings.ui.components.AppVersionKt;
import com.roadrunner.settings.ui.components.PromotionsSectionKt;
import com.roadrunner.settings.ui.screens.NavigationSettingsScreenKt;
import com.roadrunner.sidemenu.accordion.AccordionContentKt;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemsContentKt;
import com.roadrunner.sidemenu.menuitems.MenuItemContentKt;
import com.roadrunner.sidemenu.photoId.PhotoIdContainerKt;
import com.roadrunner.startworking.equipment.composable.EquipmentButtonKt;
import com.roadrunner.vendor.review.api.presentation.VendorReviewOptionKt;
import com.roadrunner.vendor.review.presentation.VendorReviewScreenKt;
import com.roadrunner.vendor.review.presentation.option.VendorReviewOptionUiModelImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.read = i2;
        this.IconCompatParcelizer = obj;
        this.write = obj2;
        this.serializer = obj3;
        this.RemoteActionCompatParcelizer = i;
    }

    public /* synthetic */ r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU(Object obj, Object obj2, isInvalidIndex isinvalidindex, int i, int i2) {
        this.read = i2;
        this.IconCompatParcelizer = obj;
        this.serializer = obj2;
        this.write = isinvalidindex;
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 79;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.RemoteActionCompatParcelizer;
        Object obj3 = this.serializer;
        Object obj4 = this.write;
        Object obj5 = this.IconCompatParcelizer;
        switch (i4) {
            case 0:
                ((Integer) obj2).getClass();
                AppVersionKt.AppVersion((r8lambda4OvXzM2G3U08xdmIsvfVqgmSBTg) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                int i6 = RatingCompat + 7;
                MediaSessionCompatQueueItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                break;
            case 1:
                ((Integer) obj2).getClass();
                CalendarInformationScreenKt.CalendarInformationContent((uc) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                OverlayVisibilityBannerKt.OverlayVisibilityBanner((AsyncImagePreviewHandlerCompanionDefault1) obj5, (androidx.compose.ui.Modifier) obj3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                NotificationDialogKt.RemoteActionCompatParcelizer((MessageDialogData) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (lambdaisEnabled11) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                CountryCodePickerBottomSheetKt.CountryCodeRow((removeGlobalPartnerParameterI) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                MissingPermissionsContentKt.MissingPermissionsContent((getSdkVersion) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                FinishedShiftV2Kt.FinishedShiftV2Content((String) obj5, (r8lambdahCMuiUVsRubxJCkqZuukT4uD724) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                FutureShiftTitleRowKt.FutureShiftTitleRow((AdjustInstance2) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                RiderStateNoOrdersKt.read((transformAndWrite) obj5, (HomeNoOrdersUiModel) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                RiderStateNoOrdersKt.RiderStateNoOrdersContent((requestAndResolve) obj5, (androidx.compose.ui.Modifier) obj3, (DragAndDropTargetModifierNode) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                OfferToWorkKt.BecomeUnavailableContent((getPrice) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                OnPauseScreenKt.OnPauseContent((getScreenDensity) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                ShiftExtensionKt.write((getAdvertisingInfoObject) obj5, (androidx.compose.ui.Modifier) obj3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                NestRiderStateSummaryColumnKt.NestRiderStateSummaryColumn((SessionResponseData) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                getIsSystemApp.RemoteActionCompatParcelizer((StoreInfoUtil) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 15:
                ((Integer) obj2).intValue();
                TabsKt.serializer((String) obj5, (AdjustBridgeInstance2) obj3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                TaskStatusIndicatorKt.CircleWithContent((fieldToDouble) obj5, (androidx.compose.ui.Modifier) obj3, (DragAndDropTargetModifierNode) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                TurnOffPromotionDialogKt.IconCompatParcelizer((r8lambdaRdO_uN7XDjHQOVIqToN9xCXIqPA) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                TurnOffPromotionDialogKt.RemoteActionCompatParcelizer((r8lambdaRs8ikecszMGN9l84OfpDXRodorE) obj5, (r8lambdaRdO_uN7XDjHQOVIqToN9xCXIqPA) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                PromotionsSectionKt.write((r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) obj5, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                int i8 = MediaSessionCompatQueueItem + 27;
                RatingCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                break;
            case 20:
                ((Integer) obj2).getClass();
                NavigationSettingsScreenKt.serializer((r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 21:
                ((Integer) obj2).intValue();
                NavigationSettingsScreenKt.NavigationAppPreference((r8lambdaVVReJdWF2brhZpg2b8Cht1nsK8o) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                AccordionContentKt.serializer((r8lambdafOIPryYKxSg19oxLSCcW3X8q4Qk) obj5, (r8lambdavHJVXyGGlLVHk5AGniQgYzeRF4) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                FrequentlyUsedItemsContentKt.RemoteActionCompatParcelizer((r8lambdarhobHpPgW3fYGaomIOtfm02vDE) obj5, (r8lambdakakRSJ0yRWnWIggdAd9IDPYuM) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                int i10 = RatingCompat + 95;
                MediaSessionCompatQueueItem = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i11 = i10 % 2;
                break;
            case 24:
                ((Integer) obj2).getClass();
                MenuItemContentKt.serializer((r8lambdavFhLS1yxrGUJqVmNjrm6vmsl_H8) obj5, (r8lambdakakRSJ0yRWnWIggdAd9IDPYuM) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                MenuItemContentKt.RemoteActionCompatParcelizer((r8lambdav4khHexYF7B8JZECOja6EPumcY4) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 26:
                ((Integer) obj2).intValue();
                PhotoIdContainerKt.PhotoIdContainer((_get_deviceId_lambda0) obj5, (getQueryContext) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                EquipmentButtonKt.IconCompatParcelizer((lambda315) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                VendorReviewOptionKt.VendorReviewOption((VendorReviewOptionUiModelImpl) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                VendorReviewScreenKt.write((subscribeToNoMatchingTriggerForEventlambda0) obj5, (String) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
        }
        return createfromparcel;
    }
}
