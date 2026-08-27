package o;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.internal.ViewUtils$$ExternalSyntheticLambda0;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
class VerticalRuler extends FrameLayout implements Checkable {
    public final EditText IconCompatParcelizer;
    public final RootMeasurePolicy read;

    public VerticalRuler(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        RootMeasurePolicy rootMeasurePolicy = (RootMeasurePolicy) layoutInflaterFrom.inflate(com.logistics.rider.glovo.R.layout.material_time_chip, (ViewGroup) this, false);
        this.read = rootMeasurePolicy;
        rootMeasurePolicy.setAccessibilityClassName(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.ClassName);
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(com.logistics.rider.glovo.R.layout.material_time_input, (ViewGroup) this, false);
        EditText editText = textInputLayout.getEditText();
        this.IconCompatParcelizer = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new VerticalAlignmentLine(this));
        editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(rootMeasurePolicy);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(com.logistics.rider.glovo.R.id.material_label);
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        editText.setId(View.generateViewId());
        textView.setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.read.isChecked();
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        RootMeasurePolicy rootMeasurePolicy = this.read;
        rootMeasurePolicy.setChecked(z);
        int i = z ? 0 : 4;
        EditText editText = this.IconCompatParcelizer;
        editText.setVisibility(i);
        rootMeasurePolicy.setVisibility(z ? 8 : 0);
        if (rootMeasurePolicy.isChecked()) {
            editText.requestFocus();
            editText.post(new ViewUtils$$ExternalSyntheticLambda0(0, editText));
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.read.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        this.read.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.read.toggle();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.IconCompatParcelizer.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    public static String write(VerticalRuler verticalRuler, CharSequence charSequence) {
        try {
            return String.format(verticalRuler.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
