package o;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class SLOperation extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    public final TextView read;
    public final MaterialCalendarGridView write;

    public SLOperation(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(com.logistics.rider.glovo.R.id.month_title);
        this.read = textView;
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        new accessgetRedirectcp(com.logistics.rider.glovo.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).write(textView, Boolean.TRUE);
        this.write = (MaterialCalendarGridView) linearLayout.findViewById(com.logistics.rider.glovo.R.id.month_grid);
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }
}
