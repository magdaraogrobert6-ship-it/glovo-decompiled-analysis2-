package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambda2VqJyNr4bqey7SJ2sPucklkqufo extends androidx.constraintlayout.widget.ConstraintLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambda2VqJyNr4bqey7SJ2sPucklkqufo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View.inflate(context, com.logistics.rider.glovo.R.layout.layout_expanded_tile, this);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(com.logistics.rider.glovo.R.dimen.component_padding_tile_expanded_horizontal_padding);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.logistics.rider.glovo.R.dimen.component_padding_tile_expanded_vertical_padding);
        setPadding(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2);
        int i = com.logistics.rider.glovo.R.id.layout_expanded_tile_action;
        if (((getSUPPRESSannotations) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_expanded_tile_action, this)) != null) {
            i = com.logistics.rider.glovo.R.id.layout_expanded_tile_caption;
            if (((TextView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_expanded_tile_caption, this)) != null) {
                i = com.logistics.rider.glovo.R.id.layout_expanded_tile_icon;
                if (((ImageView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_expanded_tile_icon, this)) != null) {
                    i = com.logistics.rider.glovo.R.id.layout_expanded_tile_title;
                    if (((TextView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_expanded_tile_title, this)) != null) {
                        return;
                    }
                }
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }
}
