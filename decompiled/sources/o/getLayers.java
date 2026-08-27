package o;

import com.roadrunner.customerchat.selfservice.presentation.screen.HelpCenterLoadingScreenKt;
import com.roadrunner.delivery.accept.deliverydetails.presentation.compose.DeliveryDetailsContentKt;
import com.roadrunner.delivery.accept.laststop.presentation.lastStopMapPin.composable.LastStopMapPinKt;
import com.roadrunner.delivery.ontheway.actionablemessage.presentation.ActionableMessageCardComponentsKt;
import com.roadrunner.delivery.ontheway.actionablemessage.presentation.ActionableMessageSentCardKt;
import com.roadrunner.delivery.ontheway.crowdsourcing.common.presentation.ImageLoadingKt;
import com.roadrunner.delivery.ontheway.crowdsourcing.sharing.presentation.compose.PhotoSharedSuccessDialogKt;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.compose.CustomerUnavailableHeaderKt;
import com.roadrunner.designsystem.mode.discovery.DarkModeDiscoveryScreenKt;
import com.roadrunner.face.verification.presentation.selfie.camera.CameraInstructionsOverlayKt;
import com.roadrunner.home.bottomsheet.skeleton.BottomSheetHeaderSkeletonKt;
import com.roadrunner.home.nest.NestSkeletonKt;
import com.roadrunner.login.presentation.countryselection.compose.FilterableSelectionComponentKt;
import com.roadrunner.login.presentation.welcome.WelcomeContentKt;
import com.roadrunner.opportunities.calendar.info.CalendarInformationScreenKt;
import com.roadrunner.rider.safety.permission.presentation.missingpermission.MissingPermissionsContentKt;
import com.roadrunner.rider.safety.report.presentation.ReiderSafetyReportLoadingContentKt;
import com.roadrunner.rrds.compose.component.forms.pattern.LoadingFullScreenKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getLayers implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.Modifier serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ getLayers(androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.IconCompatParcelizer = i2;
        this.serializer = modifier;
        this.write = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 7;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj3 = null;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            ((Integer) obj2).getClass();
            obj3.hashCode();
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        int i4 = this.write;
        androidx.compose.ui.Modifier modifier = this.serializer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        switch (i3) {
            case 0:
                NestSkeletonKt.NestSkeleton(modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 1:
                HelpCenterLoadingScreenKt.CustomerChatLoadingScreen(modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 2:
                HelpCenterLoadingScreenKt.write(modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                int i5 = RemoteActionCompatParcelizer + 65;
                read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    return createfromparcel2;
                }
                obj3.hashCode();
                throw null;
            case 3:
                textLayoutConstraintsv_w8tDc.RemoteActionCompatParcelizer(modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                int i6 = RemoteActionCompatParcelizer + 39;
                read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    int i7 = 75 / 0;
                }
                return createfromparcel2;
            case 4:
                DeliveryDetailsContentKt.NewDeliveryRouteLine(modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 5:
                LastStopMapPinKt.LastStopMapPinShadow(modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 6:
                LastStopMapPinKt.LastStopMapPinBar(modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 7:
                LastStopMapPinKt.LastStopMapPinMovingBar(modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 8:
                ActionableMessageCardComponentsKt.RemoteActionCompatParcelizer(modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 9:
                ActionableMessageCardComponentsKt.IconCompatParcelizer(modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 10:
                ActionableMessageSentCardKt.MessageSentTick(modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 11:
                ImageLoadingKt.ImageLoading(modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 12:
                PhotoSharedSuccessDialogKt.read(modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 13:
                CustomerUnavailableHeaderKt.DragHandle(modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 14:
                DarkModeDiscoveryScreenKt.AppearanceSwitchAnimation(modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 15:
                CameraInstructionsOverlayKt.CameraInstructionsOverlayColumn(modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 16:
                CameraInstructionsOverlayKt.FaceShapeCanvas(modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 17:
                performResume.read(modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 18:
                BottomSheetHeaderSkeletonKt.BottomSheetHeaderSkeleton(modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 19:
                MeasurementManagerImplCommon.IconCompatParcelizer(modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 20:
                FilterableSelectionComponentKt.NotFoundComponent(modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 21:
                WelcomeContentKt.RemoteActionCompatParcelizer(modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 22:
                CalendarInformationScreenKt.PromoLevelsIndicator(modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 23:
                MissingPermissionsContentKt.TitleColumn(modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 24:
                ReiderSafetyReportLoadingContentKt.RiderSafetyReportLoadingContent(modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 25:
                ReiderSafetyReportLoadingContentKt.SkeletonScoreRow(modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 26:
                resolveContentProvider.IconCompatParcelizer(modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 27:
                LoadingFullScreenKt.read(modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            default:
                Signer.IconCompatParcelizer(modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
        }
    }
}
