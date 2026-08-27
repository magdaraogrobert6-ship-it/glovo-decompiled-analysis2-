package o;

import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.GalleryFragment;
import com.roadrunner.delivery.ontheway.crowdsourcing.sharing.presentation.ContentSharingFragment;
import com.roadrunner.delivery.ontheway.crowdsourcing.terms.presentation.TermsAndConditionsFragment;
import com.roadrunner.delivery.ontheway.entrancepicture.details.presentation.EntrancePictureFragment;
import com.roadrunner.delivery.ontheway.tripplanner.actions.presentation.TripPlannerActionsFragment;
import com.roadrunner.delivery.pickupdropoff.blockingui.presentation.dialog.TimeChangedBlockingDialogFragment;
import com.roadrunner.delivery.pickupdropoff.confirmbutton.presentation.DoubleConfirmationFragment;
import com.roadrunner.delivery.pickupdropoff.details.contactrider.presentation.ContactRiderActionsFragment;
import com.roadrunner.delivery.pickupdropoff.fullscreendetails.presentation.FullScreenDetailsFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.reason.AmountChangingReasonDialogFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableFragmentV2;
import com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.CodeScanFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.qrpayment.presentation.screen.QrPaymentScreenFragment;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class filter extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ filter(int i, Object obj) {
        super(0);
        this.serializer = i;
        this.write = obj;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 87;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i4;
        int i5 = i3 % 2;
        int i6 = this.serializer;
        Object obj = this.write;
        switch (i6) {
            case 0:
                return (GalleryFragment) obj;
            case 1:
                return (asFrameworkPaint) ((filter) obj).invoke();
            case 2:
                return (ContentSharingFragment) obj;
            case 3:
                return (asFrameworkPaint) ((filter) obj).invoke();
            case 4:
                return (TermsAndConditionsFragment) obj;
            case 5:
                return (asFrameworkPaint) ((filter) obj).invoke();
            case 6:
                return (EntrancePictureFragment) obj;
            case 7:
                return (asFrameworkPaint) ((filter) obj).invoke();
            case 8:
                return (TripPlannerActionsFragment) obj;
            case 9:
                return (asFrameworkPaint) ((filter) obj).invoke();
            case 10:
                TimeChangedBlockingDialogFragment timeChangedBlockingDialogFragment = (TimeChangedBlockingDialogFragment) obj;
                int i7 = i4 + 11;
                RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return timeChangedBlockingDialogFragment;
            case 11:
                return (asFrameworkPaint) ((filter) obj).invoke();
            case 12:
                DoubleConfirmationFragment doubleConfirmationFragment = (DoubleConfirmationFragment) obj;
                int i9 = i2 + 69;
                IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return doubleConfirmationFragment;
            case 13:
                return (asFrameworkPaint) ((filter) obj).invoke();
            case 14:
                return (ContactRiderActionsFragment) obj;
            case 15:
                return (asFrameworkPaint) ((filter) obj).invoke();
            case 16:
                return (FullScreenDetailsFragment) obj;
            case 17:
                return (asFrameworkPaint) ((filter) obj).invoke();
            case 18:
                return (AmountChangingReasonDialogFragment) obj;
            case 19:
                return (asFrameworkPaint) ((filter) obj).invoke();
            case 20:
                return (TransferChangeFragment) obj;
            case 21:
                return (asFrameworkPaint) ((filter) obj).invoke();
            case 22:
                return (CustomerUnavailableFragment) obj;
            case 23:
                return (asFrameworkPaint) ((filter) obj).invoke();
            case 24:
                return (CustomerUnavailableFragmentV2) obj;
            case 25:
                return (asFrameworkPaint) ((filter) obj).invoke();
            case 26:
                return (CodeScanFragment) obj;
            case 27:
                return (asFrameworkPaint) ((filter) obj).invoke();
            case 28:
                return (QrPaymentScreenFragment) obj;
            default:
                return (asFrameworkPaint) ((filter) obj).invoke();
        }
    }
}
