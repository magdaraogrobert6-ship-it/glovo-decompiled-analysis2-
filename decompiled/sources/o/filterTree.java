package o;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class filterTree {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final decode RemoteActionCompatParcelizer;
    public String write;

    public filterTree(decode decodeVar) {
        this.RemoteActionCompatParcelizer = decodeVar;
    }

    public final void serializer(String str, String str2, Map map) {
        int i = 2 % 2;
        this.RemoteActionCompatParcelizer.logEvent("deliveries_softpos", onMove.serializer(onMove.serializer(onMove.serializer(map, new onViewAttachedToWindowlambda0("softpos_id", str)), new onViewAttachedToWindowlambda0("softpos_action", str2)), new onViewAttachedToWindowlambda0("softpos_timestamp", String.valueOf(System.currentTimeMillis()))));
        int i2 = IconCompatParcelizer + 29;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 24 / 0;
        }
    }

    public static Map serializer(getPositionannotations getpositionannotations) {
        int i = 2 % 2;
        int i2 = read + 71;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (getpositionannotations != null) {
            return onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("currentDeliveryId", getpositionannotations.currentDeliveryId), new onViewAttachedToWindowlambda0("deliveryState", getpositionannotations.deliveryState), new onViewAttachedToWindowlambda0("deliveryTasks", onContentCardDismissed.IconCompatParcelizer(getpositionannotations.taskIds, ",", null, null, null, 62)), new onViewAttachedToWindowlambda0("isTaskMandatory", onContentCardDismissed.IconCompatParcelizer(getpositionannotations.tasksRequired, ",", null, null, null, 62)));
        }
        SimpleItemTouchHelperCallback simpleItemTouchHelperCallback = SimpleItemTouchHelperCallback.serializer;
        int i4 = IconCompatParcelizer + 83;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return simpleItemTouchHelperCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
