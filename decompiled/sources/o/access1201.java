package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class access1201 extends LinearLayout {
    public final int RemoteActionCompatParcelizer;
    public final int serializer;

    public access1201(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.RemoteActionCompatParcelizer = getResources().getDimensionPixelOffset(com.logistics.rider.glovo.R.dimen.browser_actions_context_menu_min_padding);
        this.serializer = getResources().getDimensionPixelOffset(com.logistics.rider.glovo.R.dimen.browser_actions_context_menu_max_width);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.RemoteActionCompatParcelizer * 2), this.serializer), 1073741824), i2);
    }
}
