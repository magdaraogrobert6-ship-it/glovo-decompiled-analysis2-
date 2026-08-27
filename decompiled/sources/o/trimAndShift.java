package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.huawei.hmf.tasks.a.i$d;

/* JADX INFO: loaded from: classes2.dex */
public class trimAndShift extends FrameLayout {
    public i$d IconCompatParcelizer;

    public trimAndShift(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        Boolean boolIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer(keyEvent);
        return boolIconCompatParcelizer != null ? boolIconCompatParcelizer.booleanValue() : super.dispatchKeyEvent(keyEvent);
    }

    public void setDismissListener(View.OnClickListener onClickListener) {
        this.IconCompatParcelizer = new i$d(this, onClickListener, false, 28);
    }
}
