package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.Switch;
import coil3.ExtrasKt;
import o.getStartX;
import o.isQuadraticMonotonic;
import o.quadraticToMonotonicQuadratics;

/* JADX INFO: loaded from: classes4.dex */
public class SwitchPreference extends TwoStatePreference {
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final quadraticToMonotonicQuadratics serializer;

    @Override // androidx.preference.Preference
    public final void serializer(View view) {
        super.serializer(view);
        if (((AccessibilityManager) this.ResultReceiver.getSystemService("accessibility")).isEnabled()) {
            write(view.findViewById(R.id.switch_widget));
            read(view.findViewById(R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void write(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.MediaDescriptionCompat);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.IconCompatParcelizer);
            r4.setTextOff(this.RemoteActionCompatParcelizer);
            r4.setOnCheckedChangeListener(this.serializer);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchPreference(Context context, AttributeSet attributeSet) {
        int iRemoteActionCompatParcelizer = ExtrasKt.RemoteActionCompatParcelizer(context, com.logistics.rider.glovo.R.attr.switchPreferenceStyle, R.attr.switchPreferenceStyle);
        super(context, attributeSet, iRemoteActionCompatParcelizer);
        this.serializer = new quadraticToMonotonicQuadratics(this, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, isQuadraticMonotonic.SwitchPreference, iRemoteActionCompatParcelizer, 0);
        String string = typedArrayObtainStyledAttributes.getString(7);
        this.MediaBrowserCompatMediaItem = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        if (this.MediaDescriptionCompat) {
            write();
        }
        String string2 = typedArrayObtainStyledAttributes.getString(6);
        this.RatingCompat = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        if (!this.MediaDescriptionCompat) {
            write();
        }
        String string3 = typedArrayObtainStyledAttributes.getString(9);
        this.IconCompatParcelizer = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        write();
        String string4 = typedArrayObtainStyledAttributes.getString(8);
        this.RemoteActionCompatParcelizer = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        write();
        this.MediaMetadataCompat = typedArrayObtainStyledAttributes.getBoolean(5, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void serializer(getStartX getstartx) {
        super.serializer(getstartx);
        write(getstartx.IconCompatParcelizer(R.id.switch_widget));
        read(getstartx.IconCompatParcelizer(R.id.summary));
    }
}
