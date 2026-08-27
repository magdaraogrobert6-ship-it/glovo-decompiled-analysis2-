package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
public final class getOnLoggedCallbackannotations extends androidx.constraintlayout.widget.ConstraintLayout {
    private static byte ResultReceiver = -112;
    private static int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 0;
    private static int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = 1;
    public final com.common_ui.databinding.ItemSingleChoiceBinding RemoteActionCompatParcelizer;

    public final void setChecked(boolean z) {
        ((setKeyListener) this.RemoteActionCompatParcelizer.read).setChecked(z);
    }

    public final void setToggleEnabled(boolean z) {
        com.common_ui.databinding.ItemSingleChoiceBinding itemSingleChoiceBinding = this.RemoteActionCompatParcelizer;
        ((setKeyListener) itemSingleChoiceBinding.read).setEnabled(z);
        ((TextView) itemSingleChoiceBinding.serializer).setEnabled(z);
    }

    public final void setOnToggleClickListener(View.OnClickListener onClickListener) {
        onClickListener.getClass();
        ((setKeyListener) this.RemoteActionCompatParcelizer.read).setOnClickListener(onClickListener);
    }

    @SuppressLint
    public final void setOnToggleTouchListener(View.OnTouchListener onTouchListener) {
        onTouchListener.getClass();
        ((setKeyListener) this.RemoteActionCompatParcelizer.read).setOnTouchListener(onTouchListener);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public getOnLoggedCallbackannotations(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(com.logistics.rider.glovo.R.layout.layout_toggle_with_labels, this);
        int i2 = com.logistics.rider.glovo.R.id.barrier;
        if (((dropShadow) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.barrier, this)) != null) {
            i2 = com.logistics.rider.glovo.R.id.toggle;
            setKeyListener setkeylistener = (setKeyListener) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.toggle, this);
            if (setkeylistener != null) {
                i2 = com.logistics.rider.glovo.R.id.tvPrimaryLabel;
                TextView textView = (TextView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.tvPrimaryLabel, this);
                if (textView != null) {
                    i2 = com.logistics.rider.glovo.R.id.tvSecondaryLabel;
                    TextView textView2 = (TextView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.tvSecondaryLabel, this);
                    if (textView2 != null) {
                        this.RemoteActionCompatParcelizer = new com.common_ui.databinding.ItemSingleChoiceBinding(this, setkeylistener, textView, textView2, 1);
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, accessgetDependenciesSetp.ToggleWithLabelsView);
                        typedArrayObtainStyledAttributes.getClass();
                        textView.setText(typedArrayObtainStyledAttributes.getString(0));
                        textView2.setText(typedArrayObtainStyledAttributes.getString(1));
                        typedArrayObtainStyledAttributes.recycle();
                        return;
                    }
                }
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void setPrimaryLabel(int i) {
        int i2 = 2 % 2;
        int i3 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 101;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        TextView textView = (TextView) this.RemoteActionCompatParcelizer.serializer;
        String string = getResources().getString(i);
        if (string.startsWith("%('")) {
            int i5 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 123;
            r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                Object[] objArr = new Object[1];
                a(string.substring(3), objArr);
                string = ((String) objArr[0]).intern();
                int i6 = 80 / 0;
            } else {
                Object[] objArr2 = new Object[1];
                a(string.substring(3), objArr2);
                string = ((String) objArr2[0]).intern();
            }
        }
        textView.setText(string);
    }

    public final void setSecondaryLabel(int i) {
        int i2 = 2 % 2;
        int i3 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 91;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        TextView textView = (TextView) this.RemoteActionCompatParcelizer.write;
        String string = getResources().getString(i);
        if (string.startsWith("%('")) {
            int i5 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 33;
            r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            a(string.substring(3), objArr);
            string = ((String) objArr[0]).intern();
        }
        textView.setText(string);
    }

    private void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ ResultReceiver);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public getOnLoggedCallbackannotations(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }
}
