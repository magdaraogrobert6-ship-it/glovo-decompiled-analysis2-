package o;

import android.os.Bundle;
import com.roadrunner.delivery.inappcamera.api.model.InAppCameraArgs;
import com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.InAppCameraWithTagsFragment;

/* JADX INFO: loaded from: classes4.dex */
public abstract class FoodoraMigrationException {
    private static int read = 0;
    private static int serializer = 1;

    public static InAppCameraWithTagsFragment RemoteActionCompatParcelizer(InAppCameraArgs inAppCameraArgs) {
        int i = 2 % 2;
        InAppCameraWithTagsFragment inAppCameraWithTagsFragment = new InAppCameraWithTagsFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("InAppCameraFragmentArgs", inAppCameraArgs);
        inAppCameraWithTagsFragment.setArguments(bundle);
        int i2 = read + 121;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return inAppCameraWithTagsFragment;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
