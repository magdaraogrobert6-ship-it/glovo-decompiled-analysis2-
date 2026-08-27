package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
class getIme extends androidx.constraintlayout.widget.ConstraintLayout {
    public static final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    public final RootMeasurePolicy r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;

    public getIme(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        getCaptionBar getcaptionbar = new getCaptionBar();
        LayoutInflater.from(context).inflate(com.logistics.rider.glovo.R.layout.material_timepicker, this);
        outermostOf outermostof = (outermostOf) findViewById(com.logistics.rider.glovo.R.id.material_clock_period_toggle);
        outermostof.MediaBrowserCompatMediaItem.add(new WindowInsetsRulersCompanion());
        RootMeasurePolicy rootMeasurePolicy = (RootMeasurePolicy) findViewById(com.logistics.rider.glovo.R.id.material_minute_tv);
        RootMeasurePolicy rootMeasurePolicy2 = (RootMeasurePolicy) findViewById(com.logistics.rider.glovo.R.id.material_hour_tv);
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = rootMeasurePolicy2;
        getSafeContent getsafecontent = new getSafeContent(new GestureDetector(getContext(), new WindowInsetsRulers()));
        rootMeasurePolicy.setOnTouchListener(getsafecontent);
        rootMeasurePolicy2.setOnTouchListener(getsafecontent);
        rootMeasurePolicy.setTag(com.logistics.rider.glovo.R.id.selection_type, 12);
        rootMeasurePolicy2.setTag(com.logistics.rider.glovo.R.id.selection_type, 10);
        rootMeasurePolicy.setOnClickListener(getcaptionbar);
        rootMeasurePolicy2.setOnClickListener(getcaptionbar);
        rootMeasurePolicy.setAccessibilityClassName(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.ClassName);
        rootMeasurePolicy2.setAccessibilityClassName(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.ClassName);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.sendAccessibilityEvent(8);
        }
    }
}
