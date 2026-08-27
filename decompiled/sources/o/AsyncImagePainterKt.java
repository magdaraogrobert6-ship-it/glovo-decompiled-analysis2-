package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class AsyncImagePainterKt extends androidx.constraintlayout.widget.ConstraintLayout {
    private static int ResultReceiver = 1;
    private static int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final getDefaultJoinLxFBmk8 RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncImagePainterKt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View.inflate(context, com.logistics.rider.glovo.R.layout.layout_order_items, this);
        int i = com.logistics.rider.glovo.R.id.layout_order_items_section_items;
        LinearLayout linearLayout = (LinearLayout) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_order_items_section_items, this);
        Object obj = null;
        if (linearLayout != null) {
            i = com.logistics.rider.glovo.R.id.layout_order_items_section_items_guideline;
            if (coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_order_items_section_items_guideline, this) != null) {
                int i2 = ResultReceiver + 95;
                r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                TextView textView = (TextView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_order_items_section_title, this);
                if (textView != null) {
                    this.RemoteActionCompatParcelizer = new getDefaultJoinLxFBmk8(this, linearLayout, textView, 8);
                    int i3 = ResultReceiver + 89;
                    r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    return;
                }
                i = com.logistics.rider.glovo.R.id.layout_order_items_section_title;
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }
}
