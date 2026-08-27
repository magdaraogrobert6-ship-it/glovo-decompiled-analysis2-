package o;

import android.util.Pair;
import com.sentiance.sdk.configuration.ConfigurationManager;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class handleNotificationDeleted extends logBaiduNotificationClicklambda1 {
    private final getVerticalAccuracy IconCompatParcelizer;
    private final setSoundIfPresentAndSupportedlambda1 MediaBrowserCompatMediaItem;
    private final component4android_sdk_base_release MediaDescriptionCompat;
    private final ConfigurationManager MediaSessionCompatQueueItem;
    private final getCooldownEnterSeconds RatingCompat;
    private final long RemoteActionCompatParcelizer;
    private final String read;
    private final long serializer;
    private final parseLonglambda0 write;

    @Override // o.logBaiduNotificationClicklambda1
    public final Iterator<Pair<getCustomLocationProviderNamesandroid_sdk_base_release, isValidNotificationVisibility>> write() {
        return new handleContentCardsSerializedCardIfPresentlambda0(this.MediaBrowserCompatMediaItem, this.RatingCompat, this.MediaDescriptionCompat, this.IconCompatParcelizer, this.write, this.MediaSessionCompatQueueItem, this.read, this.serializer, this.RemoteActionCompatParcelizer);
    }

    public handleNotificationDeleted(setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1, getCooldownEnterSeconds getcooldownenterseconds, component4android_sdk_base_release component4android_sdk_base_releaseVar, getVerticalAccuracy getverticalaccuracy, parseLonglambda0 parselonglambda0, ConfigurationManager configurationManager, String str, long j, long j2) {
        this.write = parselonglambda0;
        this.RemoteActionCompatParcelizer = j2;
        this.read = str;
        this.serializer = j;
        this.RatingCompat = getcooldownenterseconds;
        this.IconCompatParcelizer = getverticalaccuracy;
        this.MediaBrowserCompatMediaItem = setsoundifpresentandsupportedlambda1;
        this.MediaDescriptionCompat = component4android_sdk_base_releaseVar;
        this.MediaSessionCompatQueueItem = configurationManager;
    }
}
