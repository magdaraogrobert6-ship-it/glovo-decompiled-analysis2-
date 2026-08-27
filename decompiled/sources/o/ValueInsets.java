package o;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.EndCompoundLayout;
import com.ui.common.widget.ThrottledButton$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class ValueInsets extends updateModifier {
    public final int read;
    public EditText serializer;
    public final ThrottledButton$$ExternalSyntheticLambda0 write;

    @Override // o.updateModifier
    public final void MediaDescriptionCompat() {
        MediaSessionCompatToken();
    }

    @Override // o.updateModifier
    public final boolean PlaybackStateCompat() {
        return true;
    }

    @Override // o.updateModifier
    public final int RemoteActionCompatParcelizer() {
        return this.read;
    }

    @Override // o.updateModifier
    public final View.OnClickListener serializer() {
        return this.write;
    }

    @Override // o.updateModifier
    public final int write() {
        return com.logistics.rider.glovo.R.string.password_toggle_content_description;
    }

    @Override // o.updateModifier
    public final void write(EditText editText) {
        this.serializer = editText;
        MediaSessionCompatToken();
    }

    @Override // o.updateModifier
    public final void RatingCompat() {
        EditText editText = this.serializer;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // o.updateModifier
    public final void setUp() {
        EditText editText = this.serializer;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.serializer.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // o.updateModifier
    public final boolean MediaMetadataCompat() {
        EditText editText = this.serializer;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    public ValueInsets(EndCompoundLayout endCompoundLayout, int i) {
        super(endCompoundLayout);
        this.read = com.logistics.rider.glovo.R.drawable.design_password_eye;
        this.write = new ThrottledButton$$ExternalSyntheticLambda0(8, this);
        if (i != 0) {
            this.read = i;
        }
    }
}
