package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import o.isQuadraticMonotonic;

/* JADX INFO: loaded from: classes4.dex */
public abstract class DialogPreference extends Preference {
    public final CharSequence IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final Drawable RemoteActionCompatParcelizer;
    public final String read;
    public final int serializer;
    public final String write;

    @Override // androidx.preference.Preference
    public void serializer() {
        PreferenceFragment preferenceFragment = this.fullyDrawnReporter_delegatelambda0.read;
        if (preferenceFragment != null) {
            preferenceFragment.read(this);
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, isQuadraticMonotonic.DialogPreference, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(9);
        string = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        this.IconCompatParcelizer = string;
        if (string == null) {
            this.IconCompatParcelizer = this.onBackPressedInput_delegatelambda0;
        }
        String string2 = typedArrayObtainStyledAttributes.getString(8);
        this.read = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(6);
        this.RemoteActionCompatParcelizer = drawable == null ? typedArrayObtainStyledAttributes.getDrawable(2) : drawable;
        String string3 = typedArrayObtainStyledAttributes.getString(11);
        this.MediaBrowserCompatMediaItem = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        String string4 = typedArrayObtainStyledAttributes.getString(10);
        this.write = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        this.serializer = typedArrayObtainStyledAttributes.getResourceId(7, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ExtrasKt.RemoteActionCompatParcelizer(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
