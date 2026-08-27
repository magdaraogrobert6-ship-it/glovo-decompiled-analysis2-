package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.data.DeliveryTasksStateDataStore;

/* JADX INFO: loaded from: classes3.dex */
public final class AnimatedVisibilityClockgetTransitionslambda0inlinedsortedBy1 {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final DeliveryTasksStateDataStore read;

    public AnimatedVisibilityClockgetTransitionslambda0inlinedsortedBy1(DeliveryTasksStateDataStore deliveryTasksStateDataStore) {
        deliveryTasksStateDataStore.getClass();
        this.read = deliveryTasksStateDataStore;
    }

    public static isRoot read(long j) {
        int i = 2 % 2;
        isRoot isroot = new isRoot(af$$ExternalSyntheticOutline0.m(j, "delivery_task_state"));
        int i2 = IconCompatParcelizer + 63;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return isroot;
        }
        throw null;
    }
}
