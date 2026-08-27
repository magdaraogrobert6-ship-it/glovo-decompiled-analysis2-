package o;

/* JADX INFO: loaded from: classes.dex */
public final class accesstoSpkPz2Gy4jd {
    public boolean MediaBrowserCompatMediaItem;
    public String MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public float MediaSessionCompatToken;
    public int ParcelableVolumeInfo;
    public String PlaybackStateCompatCustomAction;
    public int RatingCompat;
    public static final String IconCompatParcelizer = new String("FIXED_DIMENSION");
    public static final String MediaSessionCompatQueueItem = new String("WRAP_DIMENSION");
    public static final String serializer = new String("SPREAD_DIMENSION");
    public static final String write = new String("PARENT_DIMENSION");
    public static final String RemoteActionCompatParcelizer = new String("PERCENT_DIMENSION");
    public static final String read = new String("RATIO_DIMENSION");

    public static accesstoSpkPz2Gy4jd read(int i) {
        accesstoSpkPz2Gy4jd accesstospkpz2gy4jd = new accesstoSpkPz2Gy4jd(IconCompatParcelizer);
        accesstospkpz2gy4jd.MediaDescriptionCompat = null;
        accesstospkpz2gy4jd.ParcelableVolumeInfo = i;
        return accesstospkpz2gy4jd;
    }

    public static accesstoSpkPz2Gy4jd write(String str) {
        accesstoSpkPz2Gy4jd accesstospkpz2gy4jd = new accesstoSpkPz2Gy4jd();
        accesstospkpz2gy4jd.RatingCompat = 0;
        accesstospkpz2gy4jd.MediaMetadataCompat = Integer.MAX_VALUE;
        accesstospkpz2gy4jd.MediaSessionCompatToken = 1.0f;
        accesstospkpz2gy4jd.ParcelableVolumeInfo = 0;
        accesstospkpz2gy4jd.PlaybackStateCompatCustomAction = null;
        accesstospkpz2gy4jd.MediaDescriptionCompat = str;
        accesstospkpz2gy4jd.MediaBrowserCompatMediaItem = true;
        return accesstospkpz2gy4jd;
    }

    public accesstoSpkPz2Gy4jd(String str) {
        this.RatingCompat = 0;
        this.MediaMetadataCompat = Integer.MAX_VALUE;
        this.MediaSessionCompatToken = 1.0f;
        this.ParcelableVolumeInfo = 0;
        this.PlaybackStateCompatCustomAction = null;
        this.MediaBrowserCompatMediaItem = false;
        this.MediaDescriptionCompat = str;
    }

    public final void read(setAlignment setalignment, int i) {
        String str = this.PlaybackStateCompatCustomAction;
        if (str != null) {
            setalignment.serializer(str);
        }
        boolean z = this.MediaBrowserCompatMediaItem;
        String str2 = write;
        String str3 = RemoteActionCompatParcelizer;
        String str4 = MediaSessionCompatQueueItem;
        int i2 = 1;
        if (i == 0) {
            if (z) {
                setalignment.write(hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT);
                String str5 = this.MediaDescriptionCompat;
                if (str5 != str4) {
                    i2 = str5 == str3 ? 2 : 0;
                }
                setalignment.serializer(this.MediaSessionCompatToken, i2, this.RatingCompat, this.MediaMetadataCompat);
                return;
            }
            int i3 = this.RatingCompat;
            if (i3 > 0) {
                if (i3 < 0) {
                    setalignment.getFullyDrawnReporter = 0;
                } else {
                    setalignment.getFullyDrawnReporter = i3;
                }
            }
            int i4 = this.MediaMetadataCompat;
            if (i4 < Integer.MAX_VALUE) {
                setalignment.getActivityResultRegistry[0] = i4;
            }
            String str6 = this.MediaDescriptionCompat;
            if (str6 == str4) {
                setalignment.write(hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT);
                return;
            }
            if (str6 == str2) {
                setalignment.write(hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_PARENT);
                return;
            } else {
                if (str6 == null) {
                    setalignment.write(hasSpecifiedAndFiniteHeightuvyYCjk.FIXED);
                    setalignment.MediaSessionCompatQueueItem(this.ParcelableVolumeInfo);
                    return;
                }
                return;
            }
        }
        if (z) {
            setalignment.RemoteActionCompatParcelizer(hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT);
            String str7 = this.MediaDescriptionCompat;
            if (str7 != str4) {
                i2 = str7 == str3 ? 2 : 0;
            }
            setalignment.RemoteActionCompatParcelizer(this.MediaSessionCompatToken, i2, this.RatingCompat, this.MediaMetadataCompat);
            return;
        }
        int i5 = this.RatingCompat;
        if (i5 > 0) {
            if (i5 < 0) {
                setalignment.getDefaultViewModelCreationExtras = 0;
            } else {
                setalignment.getDefaultViewModelCreationExtras = i5;
            }
        }
        int i6 = this.MediaMetadataCompat;
        if (i6 < Integer.MAX_VALUE) {
            setalignment.getActivityResultRegistry[1] = i6;
        }
        String str8 = this.MediaDescriptionCompat;
        if (str8 == str4) {
            setalignment.RemoteActionCompatParcelizer(hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT);
            return;
        }
        if (str8 == str2) {
            setalignment.RemoteActionCompatParcelizer(hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_PARENT);
        } else if (str8 == null) {
            setalignment.RemoteActionCompatParcelizer(hasSpecifiedAndFiniteHeightuvyYCjk.FIXED);
            setalignment.MediaMetadataCompat(this.ParcelableVolumeInfo);
        }
    }

    public accesstoSpkPz2Gy4jd() {
    }
}
