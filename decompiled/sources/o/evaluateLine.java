package o;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes4.dex */
public final class evaluateLine extends androidx.preference.Preference {
    public long RemoteActionCompatParcelizer;

    @Override // androidx.preference.Preference
    public final long RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // androidx.preference.Preference
    public final void serializer(getStartX getstartx) {
        super.serializer(getstartx);
        getstartx.write = false;
    }

    public evaluateLine(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
