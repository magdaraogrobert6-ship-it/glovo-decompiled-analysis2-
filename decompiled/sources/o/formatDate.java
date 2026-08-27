package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.ui.common.widget.ThrottledButton$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class formatDate extends androidx.constraintlayout.widget.ConstraintLayout {
    public static final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    public final getDefaultCapKaPHkGw r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;

    public final void read(formatDatedefault formatdatedefault) {
        getDefaultCapKaPHkGw getdefaultcapkaphkgw = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        ((formatDate) getdefaultcapkaphkgw.RatingCompat).setOnClickListener(new ThrottledButton$$ExternalSyntheticLambda0(15, formatdatedefault));
        TextView textView = (TextView) getdefaultcapkaphkgw.MediaMetadataCompat;
        textView.setVisibility(8);
        textView.setText((CharSequence) null);
        ImageView imageView = (ImageView) getdefaultcapkaphkgw.IconCompatParcelizer;
        Integer num = formatdatedefault.write;
        imageView.setVisibility(0);
        imageView.setImageDrawable(coil3.util.IntPair.write(imageView.getContext(), num.intValue()));
        ((TextView) getdefaultcapkaphkgw.read).setText(formatdatedefault.MediaDescriptionCompat);
        ((createDatedefault) getdefaultcapkaphkgw.MediaBrowserCompatMediaItem).write(new formatDateFromMillis(false, null, formatdatedefault.read, formatdatedefault.serializer));
        TextView textView2 = (TextView) getdefaultcapkaphkgw.write;
        textView2.setVisibility(8);
        textView2.setText((CharSequence) null);
        TextView textView3 = (TextView) getdefaultcapkaphkgw.MediaDescriptionCompat;
        String str = formatdatedefault.RemoteActionCompatParcelizer;
        textView3.setVisibility(0);
        textView3.setText(str);
        parseDate parsedate = (parseDate) getdefaultcapkaphkgw.RemoteActionCompatParcelizer;
        parsedate.setVisibility(8);
        parsedate.removeAllViews();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public formatDate(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View.inflate(context, com.logistics.rider.glovo.R.layout.layout_full_width_multi_row_list_item_view, this);
        int i = com.logistics.rider.glovo.R.id.layout_full_width_multi_row_list_item_view_additional_info;
        TextView textView = (TextView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_full_width_multi_row_list_item_view_additional_info, this);
        if (textView != null) {
            i = com.logistics.rider.glovo.R.id.layout_full_width_multi_row_list_item_view_additional_tags;
            parseDate parsedate = (parseDate) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_full_width_multi_row_list_item_view_additional_tags, this);
            if (parsedate != null) {
                i = com.logistics.rider.glovo.R.id.layout_full_width_multi_row_list_item_view_caption;
                TextView textView2 = (TextView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_full_width_multi_row_list_item_view_caption, this);
                if (textView2 != null) {
                    i = com.logistics.rider.glovo.R.id.layout_full_width_multi_row_list_item_view_description;
                    TextView textView3 = (TextView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_full_width_multi_row_list_item_view_description, this);
                    if (textView3 != null) {
                        i = com.logistics.rider.glovo.R.id.layout_full_width_multi_row_list_item_view_icon;
                        ImageView imageView = (ImageView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_full_width_multi_row_list_item_view_icon, this);
                        if (imageView != null) {
                            i = com.logistics.rider.glovo.R.id.layout_full_width_multi_row_list_item_view_right_column;
                            createDatedefault createdatedefault = (createDatedefault) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_full_width_multi_row_list_item_view_right_column, this);
                            if (createdatedefault != null) {
                                i = com.logistics.rider.glovo.R.id.layout_full_width_multi_row_list_item_view_title;
                                TextView textView4 = (TextView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_full_width_multi_row_list_item_view_title, this);
                                if (textView4 != null) {
                                    this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new getDefaultCapKaPHkGw(this, textView, parsedate, textView2, textView3, imageView, createdatedefault, textView4);
                                    return;
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
