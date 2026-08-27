package o;

import android.app.Notification;
import com.foodora.courier.delivery.service.DeliveryService;

/* JADX INFO: loaded from: classes4.dex */
public abstract class invalidateOwnerFocusState {
    public static void IconCompatParcelizer(DeliveryService deliveryService, Notification notification, int i) {
        if (i != 0 && i != -1) {
            deliveryService.startForeground(104, notification, i & 1073745919);
        } else {
            deliveryService.startForeground(104, notification, i);
        }
    }
}
