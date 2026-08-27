package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class createHandler extends androidx.constraintlayout.widget.ConstraintLayout {
    public static final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    public final com.common_ui.databinding.LayoutTileBinding r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public createHandler(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View.inflate(context, com.logistics.rider.glovo.R.layout.layout_tile, this);
        setMinWidth(getResources().getDimensionPixelOffset(com.logistics.rider.glovo.R.dimen.component_dimension_list_boxed_min_size));
        int i = com.logistics.rider.glovo.R.id.layout_tile_action;
        getSUPPRESSannotations getsuppressannotations = (getSUPPRESSannotations) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_tile_action, this);
        if (getsuppressannotations != null) {
            i = com.logistics.rider.glovo.R.id.layout_tile_caption;
            TextView textView = (TextView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_tile_caption, this);
            if (textView != null) {
                i = com.logistics.rider.glovo.R.id.layout_tile_icon;
                ImageView imageView = (ImageView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_tile_icon, this);
                if (imageView != null) {
                    i = com.logistics.rider.glovo.R.id.layout_tile_title;
                    TextView textView2 = (TextView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_tile_title, this);
                    if (textView2 != null) {
                        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new com.common_ui.databinding.LayoutTileBinding(this, getsuppressannotations, textView, imageView, textView2);
                        return;
                    }
                }
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }
}
