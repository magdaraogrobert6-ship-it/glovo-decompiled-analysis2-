package o;

import android.widget.SeekBar;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class getEndY implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ androidx.preference.SeekBarPreference serializer;

    public getEndY(androidx.preference.SeekBarPreference seekBarPreference) {
        this.serializer = seekBarPreference;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.serializer.MediaSessionCompatToken = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        int progress;
        androidx.preference.SeekBarPreference seekBarPreference = this.serializer;
        seekBarPreference.MediaSessionCompatToken = false;
        int progress2 = seekBar.getProgress();
        int i = seekBarPreference.write;
        if (progress2 + i == seekBarPreference.MediaMetadataCompat || (progress = seekBar.getProgress() + i) == seekBarPreference.MediaMetadataCompat) {
            return;
        }
        seekBarPreference.serializer(progress, false);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        androidx.preference.SeekBarPreference seekBarPreference = this.serializer;
        if (!z || (!seekBarPreference.ParcelableVolumeInfo && seekBarPreference.MediaSessionCompatToken)) {
            int i2 = seekBarPreference.write;
            TextView textView = seekBarPreference.RatingCompat;
            if (textView != null) {
                textView.setText(String.valueOf(i + i2));
                return;
            }
            return;
        }
        int progress = seekBar.getProgress() + seekBarPreference.write;
        if (progress != seekBarPreference.MediaMetadataCompat) {
            seekBarPreference.serializer(progress, false);
        }
    }
}
