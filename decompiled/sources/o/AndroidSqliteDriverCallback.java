package o;

import bo.app.f2$$ExternalSyntheticLambda4;
import com.roadrunner.auth.logout.presentation.LogoutActivity;
import com.roadrunner.custom.password.presentation.CustomPasswordActivity;
import com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity;
import com.roadrunner.delivery.ontheway.crowdsourcing.sharing.presentation.ContentSharingFragment;
import com.roadrunner.delivery.ontheway.crowdsourcing.sharing.presentation.ContentSharingFragment$$ExternalSyntheticLambda1;
import com.roadrunner.delivery.ontheway.crowdsourcing.terms.presentation.TermsAndConditionsFragment;
import com.roadrunner.delivery.ontheway.tripplanner.actions.presentation.TripPlannerActionsFragment;
import com.roadrunner.delivery.pickupdropoff.codescanner.BarcodeAnalyzer$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeFragment$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableFragment;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda0;
import com.roadrunner.helpcenter.presentation.activity.HelpCenterActivity;
import com.roadrunner.login.presentation.LoginActivity;
import com.roadrunner.networking.core.NetworkingCoreModule$$ExternalSyntheticLambda2;
import com.roadrunner.opportunities.calendar.BonusCalendarFragment;
import com.roadrunner.overlay.bubble.permission.presentation.OverlayPermissionDialogFragment;
import com.roadrunner.permission.presentation.NonFloatablePermissionActivity;
import com.roadrunner.permission.presentation.PermissionActivity;
import com.roadrunner.rider.safety.permission.presentation.RiderSafetyPermissionFragment;
import com.roadrunner.startworking.equipment.EquipmentBottomSheet;
import com.roadrunner.startworking.equipment.EquipmentBottomSheet$$ExternalSyntheticLambda0;
import com.roadrunner.startworking.oneclick.OneClickStartWorkingFragment;
import com.roadrunner.startworking.oneclick.OneClickStartWorkingFragment$$ExternalSyntheticLambda0;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda2;
import com.roadrunner.vendor.review.presentation.VendorReviewFragment;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class AndroidSqliteDriverCallback implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object serializer;

    public /* synthetic */ AndroidSqliteDriverCallback(Object obj, int i, Object obj2) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = obj;
        this.serializer = obj2;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj = this.serializer;
        Object obj2 = this.RemoteActionCompatParcelizer;
        switch (i2) {
            case 0:
                LoginActivity loginActivity = (LoginActivity) obj2;
                return coil3.UriKt.IconCompatParcelizer(loginActivity.getIntent().getExtras(), loginActivity, (accessgetWindowSizeBytesp) obj);
            case 1:
                LogoutActivity logoutActivity = (LogoutActivity) obj2;
                return coil3.UriKt.IconCompatParcelizer(logoutActivity.getIntent().getExtras(), logoutActivity, (f2$$ExternalSyntheticLambda4) obj);
            case 2:
                CustomPasswordActivity customPasswordActivity = (CustomPasswordActivity) obj2;
                return coil3.UriKt.IconCompatParcelizer(customPasswordActivity.getIntent().getExtras(), customPasswordActivity, (f2$$ExternalSyntheticLambda4) obj);
            case 3:
                SelfServiceCustomerChatActivity selfServiceCustomerChatActivity = (SelfServiceCustomerChatActivity) obj2;
                return coil3.UriKt.IconCompatParcelizer(selfServiceCustomerChatActivity.getIntent().getExtras(), selfServiceCustomerChatActivity, (findParagraphsByRangeSbBc2M) obj);
            case 4:
                ContentSharingFragment contentSharingFragment = (ContentSharingFragment) obj2;
                return coil3.UriKt.IconCompatParcelizer(contentSharingFragment.getArguments(), contentSharingFragment, (ContentSharingFragment$$ExternalSyntheticLambda1) obj);
            case 5:
                TermsAndConditionsFragment termsAndConditionsFragment = (TermsAndConditionsFragment) obj2;
                return coil3.UriKt.IconCompatParcelizer(termsAndConditionsFragment.getArguments(), termsAndConditionsFragment, (BarcodeAnalyzer$$ExternalSyntheticLambda0) obj);
            case 6:
                TripPlannerActionsFragment tripPlannerActionsFragment = (TripPlannerActionsFragment) obj2;
                return coil3.UriKt.IconCompatParcelizer(tripPlannerActionsFragment.getArguments(), tripPlannerActionsFragment, (BarcodeAnalyzer$$ExternalSyntheticLambda0) obj);
            case 7:
                TransferChangeFragment transferChangeFragment = (TransferChangeFragment) obj2;
                return coil3.UriKt.IconCompatParcelizer(transferChangeFragment.getArguments(), transferChangeFragment, (TransferChangeFragment$$ExternalSyntheticLambda0) obj);
            case 8:
                CustomerUnavailableFragment customerUnavailableFragment = (CustomerUnavailableFragment) obj2;
                return coil3.UriKt.IconCompatParcelizer(customerUnavailableFragment.getArguments(), customerUnavailableFragment, (RetryWithDelay$$ExternalSyntheticLambda0) obj);
            case 9:
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke(Long.valueOf(((r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ) obj).write));
                return createfromparcel;
            case 10:
                HelpCenterActivity helpCenterActivity = (HelpCenterActivity) obj2;
                return coil3.UriKt.IconCompatParcelizer(helpCenterActivity.getIntent().getExtras(), helpCenterActivity, (getMinimumMaxLifecycleState) obj);
            case 11:
                LoginActivity loginActivity2 = (LoginActivity) obj2;
                return coil3.UriKt.IconCompatParcelizer(loginActivity2.getIntent().getExtras(), loginActivity2, (accessgetWindowSizeBytesp) obj);
            case 12:
                CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) obj2;
                if (cancellableContinuationImpl.RemoteActionCompatParcelizer() instanceof onTouchEnded) {
                    ((NetworkingCoreModule$$ExternalSyntheticLambda2) obj).invoke();
                    cancellableContinuationImpl.resumeWith(createfromparcel);
                }
                return createfromparcel;
            case 13:
                BonusCalendarFragment bonusCalendarFragment = (BonusCalendarFragment) obj2;
                return coil3.UriKt.IconCompatParcelizer(bonusCalendarFragment.getArguments(), bonusCalendarFragment, (TncContentKt$$ExternalSyntheticLambda2) obj);
            case 14:
                OverlayPermissionDialogFragment overlayPermissionDialogFragment = (OverlayPermissionDialogFragment) obj2;
                return coil3.UriKt.IconCompatParcelizer(overlayPermissionDialogFragment.getArguments(), overlayPermissionDialogFragment, (TncContentKt$$ExternalSyntheticLambda2) obj);
            case 15:
                NonFloatablePermissionActivity nonFloatablePermissionActivity = (NonFloatablePermissionActivity) obj2;
                return coil3.UriKt.IconCompatParcelizer(nonFloatablePermissionActivity.getIntent().getExtras(), nonFloatablePermissionActivity, (TncContentKt$$ExternalSyntheticLambda2) obj);
            case 16:
                PermissionActivity permissionActivity = (PermissionActivity) obj2;
                return coil3.UriKt.IconCompatParcelizer(permissionActivity.getIntent().getExtras(), permissionActivity, (TncContentKt$$ExternalSyntheticLambda2) obj);
            case 17:
                RiderSafetyPermissionFragment riderSafetyPermissionFragment = (RiderSafetyPermissionFragment) obj2;
                return coil3.UriKt.IconCompatParcelizer(riderSafetyPermissionFragment.getArguments(), riderSafetyPermissionFragment, (TncContentKt$$ExternalSyntheticLambda2) obj);
            case 18:
                EquipmentBottomSheet equipmentBottomSheet = (EquipmentBottomSheet) obj2;
                r8lambdak8D1aV0PAfigTPLH22X5wDyzFJU r8lambdak8d1av0pafigtplh22x5wdyzfjuIconCompatParcelizer = coil3.UriKt.IconCompatParcelizer(equipmentBottomSheet.getArguments(), equipmentBottomSheet, (EquipmentBottomSheet$$ExternalSyntheticLambda0) obj);
                int i3 = read + 113;
                write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    return r8lambdak8d1av0pafigtplh22x5wdyzfjuIconCompatParcelizer;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            case 19:
                OneClickStartWorkingFragment oneClickStartWorkingFragment = (OneClickStartWorkingFragment) obj2;
                return coil3.UriKt.IconCompatParcelizer(oneClickStartWorkingFragment.getArguments(), oneClickStartWorkingFragment, (OneClickStartWorkingFragment$$ExternalSyntheticLambda0) obj);
            default:
                VendorReviewFragment vendorReviewFragment = (VendorReviewFragment) obj2;
                r8lambdak8D1aV0PAfigTPLH22X5wDyzFJU r8lambdak8d1av0pafigtplh22x5wdyzfjuIconCompatParcelizer2 = coil3.UriKt.IconCompatParcelizer(vendorReviewFragment.getArguments(), vendorReviewFragment, (TncContentKt$$ExternalSyntheticLambda2) obj);
                int i4 = write + 93;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return r8lambdak8d1av0pafigtplh22x5wdyzfjuIconCompatParcelizer2;
        }
    }
}
