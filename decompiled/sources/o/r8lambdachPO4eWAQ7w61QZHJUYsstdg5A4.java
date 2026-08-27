package o;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdachPO4eWAQ7w61QZHJUYsstdg5A4 {
    public final Set IconCompatParcelizer;
    public final copyO0kMr_c read;
    public final Set serializer;

    public r8lambdachPO4eWAQ7w61QZHJUYsstdg5A4(copyO0kMr_c copyo0kmr_c) {
        this.read = copyo0kmr_c;
        foregroundTimerFiredI foregroundtimerfiredi = foregroundTimerFiredI.DELIVERY_DISPATCHED;
        String value = foregroundtimerfiredi.getValue();
        String value2 = foregroundTimerFiredI.BACK_TO_BACK_DELIVERY_DISPATCHED.getValue();
        foregroundTimerFiredI foregroundtimerfiredi2 = foregroundTimerFiredI.ROUTE_CHANGED;
        String value3 = foregroundtimerfiredi2.getValue();
        foregroundTimerFiredI foregroundtimerfiredi3 = foregroundTimerFiredI.ROUTE_ORDER_CHANGED;
        this.serializer = onContentCardClicked.MediaSessionCompatQueueItem(new String[]{value, value2, value3, foregroundtimerfiredi3.getValue()});
        this.IconCompatParcelizer = onContentCardClicked.MediaSessionCompatQueueItem(new String[]{foregroundtimerfiredi.getValue(), foregroundtimerfiredi2.getValue(), foregroundtimerfiredi3.getValue()});
    }
}
