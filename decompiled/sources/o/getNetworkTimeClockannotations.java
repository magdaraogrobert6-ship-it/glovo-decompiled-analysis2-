package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class getNetworkTimeClockannotations extends androidx.constraintlayout.widget.ConstraintLayout {
    public static final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    public final com.common_ui.databinding.LayoutTileBinding ResultReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getNetworkTimeClockannotations(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View.inflate(context, com.logistics.rider.glovo.R.layout.layout_full_width_single_row_list_item_view, this);
        int i = com.logistics.rider.glovo.R.id.layout_full_width_single_row_list_item_view_caption;
        TextView textView = (TextView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_full_width_single_row_list_item_view_caption, this);
        if (textView != null) {
            i = com.logistics.rider.glovo.R.id.layout_full_width_single_row_list_item_view_icon;
            ImageView imageView = (ImageView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_full_width_single_row_list_item_view_icon, this);
            if (imageView != null) {
                i = com.logistics.rider.glovo.R.id.layout_full_width_single_row_list_item_view_right_column;
                createDatedefault createdatedefault = (createDatedefault) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_full_width_single_row_list_item_view_right_column, this);
                if (createdatedefault != null) {
                    i = com.logistics.rider.glovo.R.id.layout_full_width_single_row_list_item_view_title;
                    TextView textView2 = (TextView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_full_width_single_row_list_item_view_title, this);
                    if (textView2 != null) {
                        this.ResultReceiver = new com.common_ui.databinding.LayoutTileBinding(this, textView, imageView, createdatedefault, textView2);
                        return;
                    }
                }
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }
}
