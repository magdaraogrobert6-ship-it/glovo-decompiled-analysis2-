package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hmf.tasks.a.i$d;

/* JADX INFO: loaded from: classes2.dex */
public class TouchBoundsExpansionCompanion extends drawWithRotationAndOffsetubNVwUQ {
    public i$d MediaBrowserCompatMediaItem;

    public TouchBoundsExpansionCompanion(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        Boolean boolIconCompatParcelizer = this.MediaBrowserCompatMediaItem.IconCompatParcelizer(keyEvent);
        return boolIconCompatParcelizer != null ? boolIconCompatParcelizer.booleanValue() : super.dispatchKeyEvent(keyEvent);
    }

    public void setDismissListener(View.OnClickListener onClickListener) {
        this.MediaBrowserCompatMediaItem = new i$d(this, onClickListener, false, 28);
    }
}
