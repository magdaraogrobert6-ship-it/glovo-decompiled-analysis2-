package o;

/* JADX INFO: loaded from: classes.dex */
public final class timesd16Qtg0 {
    public toColorLong8_81llA IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public boolean MediaDescriptionCompat;
    public toColorLong8_81llA MediaSessionCompatQueueItem;
    public int RatingCompat;
    public int RemoteActionCompatParcelizer;
    public int read;
    public androidx.fragment.app.Fragment serializer;
    public int write;

    public timesd16Qtg0(androidx.fragment.app.Fragment fragment, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = fragment;
        this.MediaDescriptionCompat = false;
        toColorLong8_81llA tocolorlong8_81lla = toColorLong8_81llA.RESUMED;
        this.MediaSessionCompatQueueItem = tocolorlong8_81lla;
        this.IconCompatParcelizer = tocolorlong8_81lla;
    }

    public timesd16Qtg0(androidx.fragment.app.Fragment fragment, int i, int i2) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = fragment;
        this.MediaDescriptionCompat = true;
        toColorLong8_81llA tocolorlong8_81lla = toColorLong8_81llA.RESUMED;
        this.MediaSessionCompatQueueItem = tocolorlong8_81lla;
        this.IconCompatParcelizer = tocolorlong8_81lla;
    }

    public timesd16Qtg0() {
    }
}
