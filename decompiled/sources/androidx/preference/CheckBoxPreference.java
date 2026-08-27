package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import coil3.ExtrasKt;
import o.getStartX;
import o.isQuadraticMonotonic;
import o.quadraticToMonotonicQuadratics;

/* JADX INFO: loaded from: classes4.dex */
public class CheckBoxPreference extends TwoStatePreference {
    public final quadraticToMonotonicQuadratics RemoteActionCompatParcelizer;

    @Override // androidx.preference.Preference
    public final void serializer(View view) {
        super.serializer(view);
        if (((AccessibilityManager) this.ResultReceiver.getSystemService("accessibility")).isEnabled()) {
            IconCompatParcelizer(view.findViewById(R.id.checkbox));
            read(view.findViewById(R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void IconCompatParcelizer(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.MediaDescriptionCompat);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.RemoteActionCompatParcelizer);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        int iRemoteActionCompatParcelizer = ExtrasKt.RemoteActionCompatParcelizer(context, com.logistics.rider.glovo.R.attr.checkBoxPreferenceStyle, R.attr.checkBoxPreferenceStyle);
        super(context, attributeSet, iRemoteActionCompatParcelizer);
        this.RemoteActionCompatParcelizer = new quadraticToMonotonicQuadratics(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, isQuadraticMonotonic.CheckBoxPreference, iRemoteActionCompatParcelizer, 0);
        String string = typedArrayObtainStyledAttributes.getString(5);
        this.MediaBrowserCompatMediaItem = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        if (this.MediaDescriptionCompat) {
            write();
        }
        String string2 = typedArrayObtainStyledAttributes.getString(4);
        this.RatingCompat = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        if (!this.MediaDescriptionCompat) {
            write();
        }
        this.MediaMetadataCompat = typedArrayObtainStyledAttributes.getBoolean(3, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void serializer(getStartX getstartx) {
        super.serializer(getstartx);
        IconCompatParcelizer(getstartx.IconCompatParcelizer(R.id.checkbox));
        read(getstartx.IconCompatParcelizer(R.id.summary));
    }
}
