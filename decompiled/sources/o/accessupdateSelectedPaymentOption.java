package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.order.history.databinding.LayoutNoDeliveryBinding;

/* JADX INFO: loaded from: classes3.dex */
public final class accessupdateSelectedPaymentOption extends FrameLayout {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final LayoutNoDeliveryBinding IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessupdateSelectedPaymentOption(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View.inflate(context, com.logistics.rider.glovo.R.layout.view_latest_delivery, this);
        int i = com.logistics.rider.glovo.R.id.latest_delivery_card_view;
        if (((drawWithRotationAndOffsetubNVwUQ) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.latest_delivery_card_view, this)) != null) {
            i = com.logistics.rider.glovo.R.id.latest_delivery_card_view_content;
            formatDate formatdate = (formatDate) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.latest_delivery_card_view_content, this);
            if (formatdate != null) {
                this.IconCompatParcelizer = new LayoutNoDeliveryBinding(3, formatdate, this);
                int i2 = RemoteActionCompatParcelizer + 35;
                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    int i3 = 19 / 0;
                    return;
                }
                return;
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }
}
