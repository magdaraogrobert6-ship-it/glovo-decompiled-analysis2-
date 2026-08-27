package o;

import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.pin.PinScreenFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.scan.QrScannerFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.InAppCameraWithTagsFragment;
import com.roadrunner.delivery.stacked.delivery.details.ui.StackedDeliveryDetailsFragment;
import com.roadrunner.diagnostics.presentation.fragment.SettingsNotificationsDiagnosticsFragment;
import com.roadrunner.home.nest.NestFragment;
import com.roadrunner.inappnotifications.presentation.InAppNotificationsFragment;
import com.roadrunner.instant.shifts.presentation.confirmation.BookShiftConfirmationContainerFragment;
import com.roadrunner.instant.shifts.presentation.confirmation.BookShiftConfirmationDialogFragment$$ExternalSyntheticLambda0;
import com.roadrunner.nafath.presentation.ui.NafathModalFragment;
import com.roadrunner.opportunities.calendar.BonusCalendarFragment;
import com.roadrunner.opportunities.calendar.info.CalendarInformationFragment;
import com.roadrunner.order.history.presentation.HistoryDialogFragment;
import com.roadrunner.order.history.presentation.main.HistoryFragment;
import com.roadrunner.order.history.presentation.orderdetails.OrderDetailsFragment;
import com.roadrunner.overlay.bubble.permission.presentation.OverlayPermissionDialogFragment;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class internalConicToQuadratics extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ internalConicToQuadratics(int i, Object obj) {
        super(0);
        this.write = i;
        this.serializer = obj;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = this.write;
        Object obj = this.serializer;
        switch (i2) {
            case 0:
                return (NestFragment) obj;
            case 1:
                return (PinScreenFragment) obj;
            case 2:
                return (asFrameworkPaint) ((internalConicToQuadratics) obj).invoke();
            case 3:
                return (QrScannerFragment) obj;
            case 4:
                return (asFrameworkPaint) ((internalConicToQuadratics) obj).invoke();
            case 5:
                return (InAppCameraWithTagsFragment) obj;
            case 6:
                return (asFrameworkPaint) ((internalConicToQuadratics) obj).invoke();
            case 7:
                return (StackedDeliveryDetailsFragment) obj;
            case 8:
                return (asFrameworkPaint) ((internalConicToQuadratics) obj).invoke();
            case 9:
                return (SettingsNotificationsDiagnosticsFragment) obj;
            case 10:
                return (asFrameworkPaint) ((internalConicToQuadratics) obj).invoke();
            case 11:
                return (asFrameworkPaint) ((internalConicToQuadratics) obj).invoke();
            case 12:
                InAppNotificationsFragment inAppNotificationsFragment = (InAppNotificationsFragment) obj;
                int i3 = read + 91;
                RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    return inAppNotificationsFragment;
                }
                throw null;
            case 13:
                return (asFrameworkPaint) ((internalConicToQuadratics) obj).invoke();
            case 14:
                return (BookShiftConfirmationContainerFragment) obj;
            case 15:
                return (asFrameworkPaint) ((internalConicToQuadratics) obj).invoke();
            case 16:
                return (asFrameworkPaint) ((BookShiftConfirmationDialogFragment$$ExternalSyntheticLambda0) obj).invoke();
            case 17:
                NafathModalFragment nafathModalFragment = (NafathModalFragment) obj;
                int i4 = read + 41;
                RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    int i5 = 65 / 0;
                }
                return nafathModalFragment;
            case 18:
                asFrameworkPaint asframeworkpaint = (asFrameworkPaint) ((internalConicToQuadratics) obj).invoke();
                int i6 = RemoteActionCompatParcelizer + 83;
                read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    int i7 = 47 / 0;
                }
                return asframeworkpaint;
            case 19:
                return (BonusCalendarFragment) obj;
            case 20:
                return (asFrameworkPaint) ((internalConicToQuadratics) obj).invoke();
            case 21:
                return (CalendarInformationFragment) obj;
            case 22:
                return (asFrameworkPaint) ((internalConicToQuadratics) obj).invoke();
            case 23:
                return (HistoryDialogFragment) obj;
            case 24:
                return (asFrameworkPaint) ((internalConicToQuadratics) obj).invoke();
            case 25:
                return (HistoryFragment) obj;
            case 26:
                return (asFrameworkPaint) ((internalConicToQuadratics) obj).invoke();
            case 27:
                return (OrderDetailsFragment) obj;
            case 28:
                return (asFrameworkPaint) ((internalConicToQuadratics) obj).invoke();
            default:
                return (OverlayPermissionDialogFragment) obj;
        }
    }
}
