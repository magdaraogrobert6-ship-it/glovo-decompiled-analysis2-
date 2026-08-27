package o;

import android.view.View;
import android.widget.SeekBar;
import io.sentry.android.core.SentryLogcatAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class lineWinding implements View.OnKeyListener {
    public final /* synthetic */ androidx.preference.SeekBarPreference RemoteActionCompatParcelizer;

    public lineWinding(androidx.preference.SeekBarPreference seekBarPreference) {
        this.RemoteActionCompatParcelizer = seekBarPreference;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            androidx.preference.SeekBarPreference seekBarPreference = this.RemoteActionCompatParcelizer;
            if ((seekBarPreference.serializer || (i != 21 && i != 22)) && i != 23 && i != 66) {
                SeekBar seekBar = seekBarPreference.read;
                if (seekBar != null) {
                    return seekBar.onKeyDown(i, keyEvent);
                }
                SentryLogcatAdapter.serializer("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
                return false;
            }
        }
        return false;
    }
}
