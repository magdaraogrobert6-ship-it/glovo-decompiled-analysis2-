package o;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public final class dispatchKeyEvent extends FrameLayout implements handleOnBackProgressed {
    public final CollapsibleActionView write;

    /* JADX WARN: Multi-variable type inference failed */
    public dispatchKeyEvent(View view) {
        super(view.getContext());
        this.write = (CollapsibleActionView) view;
        addView(view);
    }
}
