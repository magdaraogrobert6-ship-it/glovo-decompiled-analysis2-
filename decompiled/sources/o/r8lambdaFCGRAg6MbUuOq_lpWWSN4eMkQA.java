package o;

import com.roadrunner.push.presentation.MessageDialogFragment;
import com.roadrunner.recentdeliveries.presentation.RecentDeliveriesFragment;
import com.roadrunner.rider.recruitment.accountcreation.presentation.AccountCreationFragment;
import com.roadrunner.rider.safety.permission.presentation.RiderSafetyPermissionFragment;
import com.roadrunner.rider.safety.report.presentation.RiderSafetyReportFragment;
import com.roadrunner.rider.state.breakrequest.RequestBreakFragment;
import com.roadrunner.rider.state.worksettings.presentation.SettingsInfoBottomSheet;
import com.roadrunner.settings.subscreens.appearance.AppearanceFragment;
import com.roadrunner.settings.subscreens.chatLanguageSelector.ChatLanguageSelectorFragment;
import com.roadrunner.settings.subscreens.navigation.NavigationSettingsFragment;
import com.roadrunner.sidemenu.photoId.preview.PhotoIdPreviewFragment;
import com.roadrunner.sidemenu.presentation.SideMenuFragment;
import com.roadrunner.startworking.equipment.EquipmentBottomSheet;
import com.roadrunner.startworking.oneclick.OneClickStartWorkingFragment;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA(int i, Object obj) {
        super(0);
        this.write = i;
        this.IconCompatParcelizer = obj;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = this.write;
        Object obj = this.IconCompatParcelizer;
        switch (i2) {
            case 0:
                return (asFrameworkPaint) ((r8lambdaF39FVXzcHG_DLAHx0YomtvrCnlQ) obj).invoke();
            case 1:
                return (asFrameworkPaint) ((internalConicToQuadratics) obj).invoke();
            case 2:
                return (MessageDialogFragment) obj;
            case 3:
                return (asFrameworkPaint) ((r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA) obj).invoke();
            case 4:
                return (RecentDeliveriesFragment) obj;
            case 5:
                return (asFrameworkPaint) ((r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA) obj).invoke();
            case 6:
                return (AccountCreationFragment) obj;
            case 7:
                return (asFrameworkPaint) ((r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA) obj).invoke();
            case 8:
                return (RiderSafetyPermissionFragment) obj;
            case 9:
                return (asFrameworkPaint) ((r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA) obj).invoke();
            case 10:
                return (RiderSafetyReportFragment) obj;
            case 11:
                return (asFrameworkPaint) ((r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA) obj).invoke();
            case 12:
                return (RequestBreakFragment) obj;
            case 13:
                return (asFrameworkPaint) ((r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA) obj).invoke();
            case 14:
                SettingsInfoBottomSheet settingsInfoBottomSheet = (SettingsInfoBottomSheet) obj;
                int i3 = RemoteActionCompatParcelizer + 43;
                read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    int i4 = 63 / 0;
                }
                return settingsInfoBottomSheet;
            case 15:
                return (asFrameworkPaint) ((r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA) obj).invoke();
            case 16:
                return (asFrameworkPaint) ((r8lambdaF39FVXzcHG_DLAHx0YomtvrCnlQ) obj).invoke();
            case 17:
                return (AppearanceFragment) obj;
            case 18:
                return (asFrameworkPaint) ((r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA) obj).invoke();
            case 19:
                return (ChatLanguageSelectorFragment) obj;
            case 20:
                asFrameworkPaint asframeworkpaint = (asFrameworkPaint) ((r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA) obj).invoke();
                int i5 = read + 33;
                RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return asframeworkpaint;
            case 21:
                return (NavigationSettingsFragment) obj;
            case 22:
                return (asFrameworkPaint) ((r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA) obj).invoke();
            case 23:
                return (PhotoIdPreviewFragment) obj;
            case 24:
                return (asFrameworkPaint) ((r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA) obj).invoke();
            case 25:
                return (SideMenuFragment) obj;
            case 26:
                return (asFrameworkPaint) ((r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA) obj).invoke();
            case 27:
                return (EquipmentBottomSheet) obj;
            case 28:
                return (asFrameworkPaint) ((r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA) obj).invoke();
            default:
                return (OneClickStartWorkingFragment) obj;
        }
    }
}
