package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class vlambda0 extends LinearLayout {
    public static final /* synthetic */ int read = 0;
    public final getDefaultJoinLxFBmk8 IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vlambda0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View.inflate(context, com.logistics.rider.glovo.R.layout.layout_calendar_cell, this);
        int i = com.logistics.rider.glovo.R.id.layout_calendar_cell_badge;
        View viewRemoteActionCompatParcelizer = coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_calendar_cell_badge, this);
        if (viewRemoteActionCompatParcelizer != null) {
            i = com.logistics.rider.glovo.R.id.layout_calendar_cell_date_text;
            TextView textView = (TextView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_calendar_cell_date_text, this);
            if (textView != null) {
                this.IconCompatParcelizer = new getDefaultJoinLxFBmk8(this, viewRemoteActionCompatParcelizer, textView, 2);
                return;
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }
}
