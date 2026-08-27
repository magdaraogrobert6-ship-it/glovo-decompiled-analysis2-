package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Space;
import android.widget.TextView;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.ui.common.widget.ThrottledButton$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class createDatedefault extends androidx.constraintlayout.widget.ConstraintLayout {
    public static final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    public final com.common_ui.databinding.LayoutTileBinding ResultReceiver;

    public final void write(formatDateFromMillis formatdatefrommillis) {
        com.common_ui.databinding.LayoutTileBinding layoutTileBinding = this.ResultReceiver;
        TextView textView = (TextView) layoutTileBinding.read;
        WindowCallbackWrapper windowCallbackWrapper = (WindowCallbackWrapper) layoutTileBinding.serializer;
        boolean z = formatdatefrommillis.RemoteActionCompatParcelizer;
        String str = formatdatefrommillis.serializer;
        textView.setVisibility(z ? 0 : 8);
        textView.setText(str);
        ((IntentUtils) layoutTileBinding.write).setVisibility(8);
        boolean z2 = formatdatefrommillis.IconCompatParcelizer;
        toStringSafe tostringsafe = formatdatefrommillis.write;
        boolean z3 = tostringsafe instanceof toStringSafe;
        getSUPPRESSannotations getsuppressannotations = (getSUPPRESSannotations) layoutTileBinding.RemoteActionCompatParcelizer;
        if (!z3) {
            getsuppressannotations.setVisibility(8);
            windowCallbackWrapper.setVisibility(8);
        } else {
            getsuppressannotations.setVisibility(8);
            windowCallbackWrapper.setVisibility(z2 ? 0 : 8);
            windowCallbackWrapper.setOnClickListener(new ThrottledButton$$ExternalSyntheticLambda0(14, tostringsafe));
            windowCallbackWrapper.setImageDrawable(coil3.util.IntPair.write(windowCallbackWrapper.getContext(), tostringsafe.serializer.intValue()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public createDatedefault(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View.inflate(context, com.logistics.rider.glovo.R.layout.layout_full_width_list_item_right_column_view, this);
        int i = com.logistics.rider.glovo.R.id.layout_full_row_list_item_right_column_view_button;
        getSUPPRESSannotations getsuppressannotations = (getSUPPRESSannotations) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_full_row_list_item_right_column_view_button, this);
        if (getsuppressannotations != null) {
            i = com.logistics.rider.glovo.R.id.layout_full_row_list_item_right_column_view_image_button;
            WindowCallbackWrapper windowCallbackWrapper = (WindowCallbackWrapper) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_full_row_list_item_right_column_view_image_button, this);
            if (windowCallbackWrapper != null) {
                i = com.logistics.rider.glovo.R.id.layout_full_row_list_item_right_column_view_tag;
                IntentUtils intentUtils = (IntentUtils) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_full_row_list_item_right_column_view_tag, this);
                if (intentUtils != null) {
                    i = com.logistics.rider.glovo.R.id.layout_full_row_list_item_right_column_view_tag_button_icon_space;
                    if (((Space) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_full_row_list_item_right_column_view_tag_button_icon_space, this)) != null) {
                        i = com.logistics.rider.glovo.R.id.layout_full_row_list_item_right_column_view_tag_button_space;
                        if (((Space) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_full_row_list_item_right_column_view_tag_button_space, this)) != null) {
                            i = com.logistics.rider.glovo.R.id.layout_full_row_list_item_right_column_view_tag_buttons_barrier;
                            if (((dropShadow) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_full_row_list_item_right_column_view_tag_buttons_barrier, this)) != null) {
                                i = com.logistics.rider.glovo.R.id.layout_full_row_list_item_right_column_view_value;
                                TextView textView = (TextView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_full_row_list_item_right_column_view_value, this);
                                if (textView != null) {
                                    i = com.logistics.rider.glovo.R.id.layout_full_row_list_item_right_column_view_value_tag_space;
                                    if (((Space) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_full_row_list_item_right_column_view_value_tag_space, this)) != null) {
                                        this.ResultReceiver = new com.common_ui.databinding.LayoutTileBinding(this, getsuppressannotations, windowCallbackWrapper, intentUtils, textView);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }
}
