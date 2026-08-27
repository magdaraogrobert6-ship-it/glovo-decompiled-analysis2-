package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.ContextThemeWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class getStartY {
    public androidx.preference.PreferenceFragment MediaBrowserCompatMediaItem;
    public final String MediaMetadataCompat;
    public androidx.preference.PreferenceScreen MediaSessionCompatQueueItem;
    public androidx.preference.PreferenceFragment RatingCompat;
    public final ContextThemeWrapper RemoteActionCompatParcelizer;
    public androidx.preference.PreferenceFragment read;
    public boolean serializer;
    public SharedPreferences.Editor write;
    public long IconCompatParcelizer = 0;
    public SharedPreferences MediaDescriptionCompat = null;

    public static String read(Context context) {
        return context.getPackageName() + "_preferences";
    }

    public final SharedPreferences IconCompatParcelizer() {
        if (this.MediaDescriptionCompat == null) {
            this.MediaDescriptionCompat = this.RemoteActionCompatParcelizer.getSharedPreferences(this.MediaMetadataCompat, 0);
        }
        return this.MediaDescriptionCompat;
    }

    public final SharedPreferences.Editor read() {
        if (!this.serializer) {
            return IconCompatParcelizer().edit();
        }
        if (this.write == null) {
            this.write = IconCompatParcelizer().edit();
        }
        return this.write;
    }

    public getStartY(ContextThemeWrapper contextThemeWrapper) {
        this.RemoteActionCompatParcelizer = contextThemeWrapper;
        this.MediaMetadataCompat = read(contextThemeWrapper);
    }
}
