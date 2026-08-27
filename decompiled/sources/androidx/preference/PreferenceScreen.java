package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;

/* JADX INFO: loaded from: classes4.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public final boolean MediaDescriptionCompat;

    @Override // androidx.preference.Preference
    public final void serializer() {
        PreferenceFragment preferenceFragment;
        if (this._init_lambda1 != null || this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 != null || this.MediaSessionCompatQueueItem.size() == 0 || (preferenceFragment = this.fullyDrawnReporter_delegatelambda0.RatingCompat) == null) {
            return;
        }
        preferenceFragment.serializer(this);
    }

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, ExtrasKt.RemoteActionCompatParcelizer(context, R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle), 0);
        this.MediaDescriptionCompat = true;
    }
}
