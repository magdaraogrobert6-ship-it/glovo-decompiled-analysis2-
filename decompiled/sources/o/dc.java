package o;

import com.roadrunner.delivery.accept.laststop.presentation.compose.LastStopOptionKt;
import com.roadrunner.delivery.accept.laststop.presentation.lastStopMapPin.composable.LastStopMapPinKt;
import com.roadrunner.delivery.accept.newordertitle.presentation.compose.NewOrderTitleContentKt;
import com.roadrunner.delivery.accept.orderitems.presentation.compose.OrderItemsBottomSheetKt;
import com.roadrunner.delivery.ontheway.crowdsourcing.terms.presentation.compose.TermsAndConditionsKt;
import com.roadrunner.delivery.ontheway.tripplanner.list.presentation.compose.TripPlannerListKt;
import com.roadrunner.delivery.pickupdropoff.tasks.qrpayment.presentation.screen.compose.ShowQrCodeKt;
import com.roadrunner.face.verification.presentation.identitypopup.compose.IdentityPopupContentKt;
import com.roadrunner.freelancing.presentation.bonusinfo.BonusInformationDialogKt;
import com.roadrunner.home.nest.component.empty.EmptyContentKt;
import com.roadrunner.liveness.instruction.presentation.compose.InstructionComponentKt;
import com.roadrunner.liveness.recording.presentation.compose.InstructionsContentKt;
import com.roadrunner.rider.recruitment.passverification.presentation.VerifyScreenKt;
import com.roadrunner.rider.safety.report.presentation.RiderSafetyReportScreenKt;
import com.roadrunner.rider.state.ondemand.presentation.compose.OnDemandWorkingKt;
import com.roadrunner.rider.state.searchshifts.presentation.TextWithIconKt;
import com.roadrunner.rrds.compose.component.forms.TextInputBigV2Kt;
import com.roadrunner.settings.ui.screens.NavigationSettingsScreenKt;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import com.roadrunner.sidemenu.greeting.GreetingContentKt;
import com.roadrunner.startworking.oneclick.OneClickStartWorkingScreenKt;
import com.roadrunner.startworking.oneclick.bullet.PolicyItemWithHyperLinkKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dc implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RatingCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ androidx.compose.ui.Modifier serializer;
    public final /* synthetic */ String write;

    public /* synthetic */ dc(androidx.compose.ui.Modifier modifier, String str, int i) {
        this.IconCompatParcelizer = 25;
        this.serializer = modifier;
        this.write = str;
        this.read = i;
    }

    public /* synthetic */ dc(int i, String str, androidx.compose.ui.Modifier modifier, int i2) {
        this.IconCompatParcelizer = i2;
        this.write = str;
        this.serializer = modifier;
        this.read = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 87;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.read;
        androidx.compose.ui.Modifier modifier = this.serializer;
        String str = this.write;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        switch (i4) {
            case 0:
                dd.IconCompatParcelizer(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), getbirthdatefull, modifier, str);
                return createfromparcel;
            case 1:
                LastStopOptionKt.LastStopOptionWithLocation(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), getbirthdatefull, modifier, str);
                return createfromparcel;
            case 2:
                LastStopMapPinKt.LastStopMapToolTip(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), getbirthdatefull, modifier, str);
                return createfromparcel;
            case 3:
                NewOrderTitleContentKt.IconCompatParcelizer(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), getbirthdatefull, modifier, str);
                return createfromparcel;
            case 4:
                OrderItemsBottomSheetKt.IconCompatParcelizer(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), getbirthdatefull, modifier, str);
                int i6 = RatingCompat + 91;
                RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    return createfromparcel;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            case 5:
                TermsAndConditionsKt.GuidelinePoint(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), getbirthdatefull, modifier, str);
                int i7 = RemoteActionCompatParcelizer + 1;
                RatingCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    int i8 = 4 / 0;
                }
                return createfromparcel;
            case 6:
                TripPlannerListKt.read(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), getbirthdatefull, modifier, str);
                return createfromparcel;
            case 7:
                ShowQrCodeKt.write(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), getbirthdatefull, modifier, str);
                return createfromparcel;
            case 8:
                ShowQrCodeKt.read(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), getbirthdatefull, modifier, str);
                return createfromparcel;
            case 9:
                ShowQrCodeKt.QrSuccessComposable(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), getbirthdatefull, modifier, str);
                return createfromparcel;
            case 10:
                IdentityPopupContentKt.IdentityWarning(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), getbirthdatefull, modifier, str);
                return createfromparcel;
            case 11:
                BonusInformationDialogKt.DisclaimerBox(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), getbirthdatefull, modifier, str);
                return createfromparcel;
            case 12:
                EmptyContentKt.EmptyContent(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), getbirthdatefull, modifier, str);
                return createfromparcel;
            case 13:
                InstructionComponentKt.RequirementComponent(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), getbirthdatefull, modifier, str);
                return createfromparcel;
            case 14:
                PassthroughConnectionwithTransaction2.serializer(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), getbirthdatefull, modifier, str);
                return createfromparcel;
            case 15:
                InstructionsContentKt.IconCompatParcelizer(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), getbirthdatefull, modifier, str);
                return createfromparcel;
            case 16:
                d9.read(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), getbirthdatefull, modifier, str);
                return createfromparcel;
            case 17:
                VerifyScreenKt.IconCompatParcelizer(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), getbirthdatefull, modifier, str);
                return createfromparcel;
            case 18:
                RiderSafetyReportScreenKt.write(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), getbirthdatefull, modifier, str);
                return createfromparcel;
            case 19:
                getDeviceManufacturer.read(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), getbirthdatefull, modifier, str);
                return createfromparcel;
            case 20:
                getDeviceManufacturer.write(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), getbirthdatefull, modifier, str);
                return createfromparcel;
            case 21:
                OnDemandWorkingKt.WorkAreaColumn(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), getbirthdatefull, modifier, str);
                return createfromparcel;
            case 22:
                TextWithIconKt.TextWithFlagIconStart(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), getbirthdatefull, modifier, str);
                return createfromparcel;
            case 23:
                TextInputBigV2Kt.ErrorTextV2(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), getbirthdatefull, modifier, str);
                return createfromparcel;
            case 24:
                NavigationSettingsScreenKt.BulletPointRow(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), getbirthdatefull, modifier, str);
                return createfromparcel;
            case 25:
                FrequentlyUsedItemKt.UnreadCountBadge(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), getbirthdatefull, modifier, str);
                return createfromparcel;
            case 26:
                GreetingContentKt.Greeting(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), getbirthdatefull, modifier, str);
                return createfromparcel;
            case 27:
                OneClickStartWorkingScreenKt.write(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), getbirthdatefull, modifier, str);
                return createfromparcel;
            case 28:
                OneClickStartWorkingScreenKt.RemoteActionCompatParcelizer(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), getbirthdatefull, modifier, str);
                return createfromparcel;
            default:
                PolicyItemWithHyperLinkKt.TextWithIcon(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), getbirthdatefull, modifier, str);
                return createfromparcel;
        }
    }
}
