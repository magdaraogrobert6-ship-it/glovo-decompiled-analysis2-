package o;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class getCancelPausedPrecompositionNjRlDlw {
    public final TextPaint MediaBrowserCompatMediaItem;
    public boolean MediaDescriptionCompat;
    public CharSequence MediaSessionCompatQueueItem;
    public final int PlaybackStateCompatCustomAction;
    public int read;
    public android.text.Layout.Alignment serializer = android.text.Layout.Alignment.ALIGN_NORMAL;
    public int MediaMetadataCompat = Integer.MAX_VALUE;
    public float RatingCompat = 1.0f;
    public int RemoteActionCompatParcelizer = 1;
    public boolean IconCompatParcelizer = true;
    public TextUtils.TruncateAt write = null;

    public getCancelPausedPrecompositionNjRlDlw(CharSequence charSequence, TextPaint textPaint, int i) {
        this.MediaSessionCompatQueueItem = charSequence;
        this.MediaBrowserCompatMediaItem = textPaint;
        this.PlaybackStateCompatCustomAction = i;
        this.read = charSequence.length();
    }

    public final StaticLayout write() {
        if (this.MediaSessionCompatQueueItem == null) {
            this.MediaSessionCompatQueueItem = "";
        }
        int iMax = Math.max(0, this.PlaybackStateCompatCustomAction);
        CharSequence charSequenceEllipsize = this.MediaSessionCompatQueueItem;
        int i = this.MediaMetadataCompat;
        TextPaint textPaint = this.MediaBrowserCompatMediaItem;
        if (i == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.write);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.read);
        this.read = iMin;
        if (this.MediaDescriptionCompat && this.MediaMetadataCompat == 1) {
            this.serializer = android.text.Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.serializer);
        builderObtain.setIncludePad(this.IconCompatParcelizer);
        builderObtain.setTextDirection(this.MediaDescriptionCompat ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.write;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.MediaMetadataCompat);
        float f = this.RatingCompat;
        if (f != 1.0f) {
            builderObtain.setLineSpacing(0.0f, f);
        }
        if (this.MediaMetadataCompat > 1) {
            builderObtain.setHyphenationFrequency(this.RemoteActionCompatParcelizer);
        }
        return builderObtain.build();
    }
}
