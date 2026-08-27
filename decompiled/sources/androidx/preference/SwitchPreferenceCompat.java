package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import com.logistics.rider.glovo.R;
import o.getStartX;
import o.isQuadraticMonotonic;
import o.quadraticToMonotonicQuadratics;
import o.setKeyListener;

/* JADX INFO: loaded from: classes4.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    public final String read;
    public final String serializer;
    public final quadraticToMonotonicQuadratics write;

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchPreferenceCompatStyle);
        this.write = new quadraticToMonotonicQuadratics(this, 2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, isQuadraticMonotonic.SwitchPreferenceCompat, R.attr.switchPreferenceCompatStyle, 0);
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
        this.serializer = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        write();
        String string4 = typedArrayObtainStyledAttributes.getString(8);
        this.read = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        write();
        this.MediaMetadataCompat = typedArrayObtainStyledAttributes.getBoolean(5, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void serializer(View view) {
        super.serializer(view);
        if (((AccessibilityManager) this.ResultReceiver.getSystemService("accessibility")).isEnabled()) {
            RemoteActionCompatParcelizer(view.findViewById(R.id.switchWidget));
            read(view.findViewById(android.R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void RemoteActionCompatParcelizer(View view) {
        boolean z = view instanceof setKeyListener;
        if (z) {
            ((setKeyListener) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.MediaDescriptionCompat);
        }
        if (z) {
            setKeyListener setkeylistener = (setKeyListener) view;
            setkeylistener.setTextOn(this.serializer);
            setkeylistener.setTextOff(this.read);
            setkeylistener.setOnCheckedChangeListener(this.write);
        }
    }

    @Override // androidx.preference.Preference
    public final void serializer(getStartX getstartx) {
        super.serializer(getstartx);
        RemoteActionCompatParcelizer(getstartx.IconCompatParcelizer(R.id.switchWidget));
        read(getstartx.IconCompatParcelizer(android.R.id.summary));
    }
}
