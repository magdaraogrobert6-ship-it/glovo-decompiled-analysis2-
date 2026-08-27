package o;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.sentry.SentryUUID;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class fastForEach extends LinearLayout {
    public TextView IconCompatParcelizer;
    public android.widget.Button RemoteActionCompatParcelizer;
    public final TimeInterpolator serializer;
    public int write;

    public android.widget.Button getActionView() {
        return this.RemoteActionCompatParcelizer;
    }

    public TextView getMessageView() {
        return this.IconCompatParcelizer;
    }

    public void setMaxInlineActionWidth(int i) {
        this.write = i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.logistics.rider.glovo.R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(com.logistics.rider.glovo.R.dimen.design_snackbar_padding_vertical);
        android.text.Layout layout = this.IconCompatParcelizer.getLayout();
        boolean z = layout != null && layout.getLineCount() > 1;
        if (!z || this.write <= 0 || this.RemoteActionCompatParcelizer.getMeasuredWidth() <= this.write) {
            if (!z) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!IconCompatParcelizer(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!IconCompatParcelizer(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public fastForEach(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.serializer = SentryUUID.IconCompatParcelizer(context, com.logistics.rider.glovo.R.attr.motionEasingEmphasizedInterpolator, handleMotionFrameOfReferencePlacement.RemoteActionCompatParcelizer);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.IconCompatParcelizer = (TextView) findViewById(com.logistics.rider.glovo.R.id.snackbar_text);
        this.RemoteActionCompatParcelizer = (android.widget.Button) findViewById(com.logistics.rider.glovo.R.id.snackbar_action);
    }

    public final boolean IconCompatParcelizer(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.IconCompatParcelizer.getPaddingTop() == i2 && this.IconCompatParcelizer.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.IconCompatParcelizer;
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }
}
