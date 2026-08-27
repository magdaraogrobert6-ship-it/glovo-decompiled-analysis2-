package o;

import android.os.Bundle;
import com.roadrunner.delivery.ontheway.tripplanner.actions.api.navigator.ActionsParams;
import com.roadrunner.delivery.ontheway.tripplanner.actions.presentation.TripPlannerActionsFragment;
import com.roadrunner.delivery.stacked.delivery.details.ui.StackedDeliveryDetailsFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class minusAH228Gc implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ androidx.fragment.app.FragmentActivity serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ minusAH228Gc(Object obj, androidx.fragment.app.FragmentActivity fragmentActivity, int i) {
        this.write = i;
        this.serializer = fragmentActivity;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = read + 95;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        androidx.fragment.app.FragmentActivity fragmentActivity = this.serializer;
        if (i4 == 0) {
            long jLongValue = ((Long) obj).longValue();
            Bundle bundle = new Bundle();
            bundle.putLong("delivery_id", jLongValue);
            StackedDeliveryDetailsFragment stackedDeliveryDetailsFragment = new StackedDeliveryDetailsFragment();
            stackedDeliveryDetailsFragment.setArguments(bundle);
            stackedDeliveryDetailsFragment.RemoteActionCompatParcelizer(fragmentActivity.getSupportFragmentManager(), "com.roadrunner.delivery.stacked.delivery.details.ui.StackedDeliveryDetailsFragment");
            return createfromparcel;
        }
        ActionsParams actionsParams = (ActionsParams) obj;
        actionsParams.getClass();
        TripPlannerActionsFragment tripPlannerActionsFragment = new TripPlannerActionsFragment();
        onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr = {new onViewAttachedToWindowlambda0("ACTIONS_PARAMS", actionsParams)};
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        tripPlannerActionsFragment.setArguments((Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{onviewattachedtowindowlambda0Arr}, iSerializer, isAppSetIdReadingEnabled.serializer(), 1771348320));
        tripPlannerActionsFragment.RemoteActionCompatParcelizer(fragmentActivity.getSupportFragmentManager(), "com.roadrunner.delivery.ontheway.tripplanner.actions.presentation.TripPlannerActionsFragment");
        int i5 = read + 89;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return createfromparcel;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
