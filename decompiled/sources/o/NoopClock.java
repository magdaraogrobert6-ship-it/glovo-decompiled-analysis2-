package o;

import com.roadrunner.delivery.pickupdropoff.tasks.data.DeliveryTasksStateDataStore;

/* JADX INFO: loaded from: classes3.dex */
public final class NoopClock {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final DeliveryTasksStateDataStore IconCompatParcelizer;

    public NoopClock(DeliveryTasksStateDataStore deliveryTasksStateDataStore) {
        deliveryTasksStateDataStore.getClass();
        this.IconCompatParcelizer = deliveryTasksStateDataStore;
    }

    public static isRoot RemoteActionCompatParcelizer(long j, String str) {
        int i = 2 % 2;
        str.getClass();
        isRoot isroot = new isRoot("merged_task_state-" + j + "-" + str);
        int i2 = serializer + 65;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return isroot;
    }
}
