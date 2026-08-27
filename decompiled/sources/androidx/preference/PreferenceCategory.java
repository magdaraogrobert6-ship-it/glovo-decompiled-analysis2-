package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import o.getStartX;

/* JADX INFO: loaded from: classes4.dex */
public class PreferenceCategory extends PreferenceGroup {
    @Override // androidx.preference.Preference
    public final boolean MediaMetadataCompat() {
        return false;
    }

    @Override // androidx.preference.Preference
    public final boolean read() {
        return !super.MediaMetadataCompat();
    }

    @Override // androidx.preference.Preference
    public final void serializer(getStartX getstartx) {
        super.serializer(getstartx);
        getstartx.MediaSessionCompatQueueItem.setAccessibilityHeading(true);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, ExtrasKt.RemoteActionCompatParcelizer(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle), 0);
    }
}
