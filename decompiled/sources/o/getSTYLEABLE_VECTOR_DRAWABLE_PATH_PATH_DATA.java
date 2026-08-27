package o;

import androidx.camera.video.Recorder$3;
import com.foodora.courier.legacy.ui.preferences.SettingsActivity;
import com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity;
import com.roadrunner.delivery.ontheway.crowdsourcing.terms.presentation.TermsAndConditionsFragment;
import com.roadrunner.delivery.ontheway.tripplanner.actions.presentation.TripPlannerActionsFragment;
import com.roadrunner.delivery.pickupdropoff.blockingui.presentation.dialog.TimeChangedBlockingDialogFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.InAppCameraWithTagsFragment;
import com.roadrunner.delivery.stacked.delivery.details.ui.StackedDeliveryDetailsFragment;
import com.roadrunner.rider.state.worksettings.presentation.SettingsInfoBottomSheet;
import com.roadrunner.sidemenu.presentation.SideMenuFragment;
import com.roadrunner.vendor.review.presentation.VendorReviewFragment;
import com.roadrunner.web.presentation.simpleWebView.SimpleWebViewFragment;
import com.sentiance.core.model.events.E$b;

/* JADX INFO: loaded from: classes2.dex */
public final class getSTYLEABLE_VECTOR_DRAWABLE_PATH_PATH_DATA implements areJsonObjectsEqual {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION read;

    public /* synthetic */ getSTYLEABLE_VECTOR_DRAWABLE_PATH_PATH_DATA(getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.read = getstyleable_vector_drawable_group_rotation;
    }

    @Override // o.areJsonObjectsEqual
    public final r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34 serializer(Object obj) {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation = this.read;
        switch (i2) {
            case 0:
                ((SettingsActivity) obj).getClass();
                return new E$b(getstyleable_vector_drawable_group_rotation);
            case 1:
                ((SelfServiceCustomerChatActivity) obj).getClass();
                return new getSTYLEABLE_VECTOR_DRAWABLE_NAME(getstyleable_vector_drawable_group_rotation, 6);
            case 2:
                ((SettingsInfoBottomSheet) obj).getClass();
                Recorder$3 recorder$3 = new Recorder$3(getstyleable_vector_drawable_group_rotation, 22);
                int i3 = IconCompatParcelizer + 63;
                write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    return recorder$3;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            case 3:
                ((SideMenuFragment) obj).getClass();
                return new accessgetGreencp(getstyleable_vector_drawable_group_rotation, 24);
            case 4:
                ((SimpleWebViewFragment) obj).getClass();
                getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_FILLTYPE getstyleable_vector_drawable_path_trim_path_filltype = new getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_FILLTYPE(getstyleable_vector_drawable_group_rotation, 0);
                int i4 = IconCompatParcelizer + 97;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return getstyleable_vector_drawable_path_trim_path_filltype;
            case 5:
                ((StackedDeliveryDetailsFragment) obj).getClass();
                return new colorResource(getstyleable_vector_drawable_group_rotation, 19);
            case 6:
                ((InAppCameraWithTagsFragment) obj).getClass();
                return new Recorder$3(getstyleable_vector_drawable_group_rotation, 23);
            case 7:
                ((TermsAndConditionsFragment) obj).getClass();
                return new getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_Y(getstyleable_vector_drawable_group_rotation, 4);
            case 8:
                ((TimeChangedBlockingDialogFragment) obj).getClass();
                return new accessgetGreencp(getstyleable_vector_drawable_group_rotation, 25);
            case 9:
                ((TransferChangeFragment) obj).getClass();
                return new getSTYLEABLE_VECTOR_DRAWABLE_NAME(getstyleable_vector_drawable_group_rotation, 7);
            case 10:
                ((TripPlannerActionsFragment) obj).getClass();
                return new getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_Y(getstyleable_vector_drawable_group_rotation, 3);
            default:
                ((VendorReviewFragment) obj).getClass();
                return new getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_Y(getstyleable_vector_drawable_group_rotation, 5);
        }
    }
}
