package o;

/* JADX INFO: loaded from: classes4.dex */
public final class ddefault {
    public static final ddefault IconCompatParcelizer = new ddefault(com.logistics.rider.glovo.R.color.component_background_message_overlay_snackbar_error, com.logistics.rider.glovo.R.color.component_text_message_overlay_snackbar_error, null);
    public static final ddefault RemoteActionCompatParcelizer;
    public static final ddefault read;
    public static final ddefault serializer;
    public static final ddefault write;
    public final int MediaBrowserCompatMediaItem;
    public final Integer MediaSessionCompatQueueItem;
    public final int RatingCompat;

    public final int IconCompatParcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final int read() {
        return this.RatingCompat;
    }

    public final Integer serializer() {
        return this.MediaSessionCompatQueueItem;
    }

    public ddefault(int i, int i2, Integer num) {
        this.RatingCompat = i;
        this.MediaBrowserCompatMediaItem = i2;
        this.MediaSessionCompatQueueItem = num;
    }

    static {
        Integer numValueOf = Integer.valueOf(com.logistics.rider.glovo.R.string.got_it);
        write = new ddefault(com.logistics.rider.glovo.R.color.component_background_message_overlay_snackbar_error, com.logistics.rider.glovo.R.color.component_text_message_overlay_snackbar_error, numValueOf);
        RemoteActionCompatParcelizer = new ddefault(com.logistics.rider.glovo.R.color.component_background_message_overlay_snackbar_success, com.logistics.rider.glovo.R.color.component_text_message_overlay_snackbar_success, null);
        read = new ddefault(com.logistics.rider.glovo.R.color.component_background_message_overlay_snackbar_success, com.logistics.rider.glovo.R.color.component_text_message_overlay_snackbar_success, numValueOf);
        serializer = new ddefault(com.logistics.rider.glovo.R.color.component_background_message_overlay_snackbar_alert, com.logistics.rider.glovo.R.color.component_text_message_overlay_snackbar_alert, null);
    }
}
