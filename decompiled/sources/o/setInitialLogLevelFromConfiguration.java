package o;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes4.dex */
public final class setInitialLogLevelFromConfiguration extends androidx.appcompat.widget.AppCompatTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setInitialLogLevelFromConfiguration(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        setTextAppearance(com.logistics.rider.glovo.R.style.TextAppearance_Component_Navigation_CalendarCell_DateDay);
        setTextColor(FocusListener.write(context, com.logistics.rider.glovo.R.color.component_calendar_cell_day_text));
        setGravity(17);
    }
}
