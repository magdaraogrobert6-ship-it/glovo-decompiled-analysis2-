package o;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class migrateBannerStorageToJson {
    private final publishBrazePushAction IconCompatParcelizer;

    public final int hashCode() {
        return Objects.hash(this.IconCompatParcelizer);
    }

    public migrateBannerStorageToJson(publishBrazePushAction publishbrazepushaction) {
        r8lambdaBirSLjOAGmYxhIkoHl5Z5HHT12Q r8lambdabirsljoagmyxhikohl5z5hht12q = new r8lambdaBirSLjOAGmYxhIkoHl5Z5HHT12Q();
        r8lambdabirsljoagmyxhikohl5z5hht12q.MediaDescriptionCompat = publishbrazepushaction.RemoteActionCompatParcelizer;
        r8lambdabirsljoagmyxhikohl5z5hht12q.serializer = publishbrazepushaction.write;
        r8lambdabirsljoagmyxhikohl5z5hht12q.RemoteActionCompatParcelizer = publishbrazepushaction.serializer;
        r8lambdabirsljoagmyxhikohl5z5hht12q.IconCompatParcelizer = publishbrazepushaction.read;
        r8lambdabirsljoagmyxhikohl5z5hht12q.write = publishbrazepushaction.MediaBrowserCompatMediaItem;
        r8lambdabirsljoagmyxhikohl5z5hht12q.RatingCompat = publishbrazepushaction.MediaDescriptionCompat;
        r8lambdabirsljoagmyxhikohl5z5hht12q.MediaSessionCompatQueueItem = publishbrazepushaction.MediaSessionCompatQueueItem;
        r8lambdabirsljoagmyxhikohl5z5hht12q.MediaBrowserCompatMediaItem = publishbrazepushaction.ParcelableVolumeInfo;
        r8lambdabirsljoagmyxhikohl5z5hht12q.read = null;
        r8lambdabirsljoagmyxhikohl5z5hht12q.MediaMetadataCompat = null;
        this.IconCompatParcelizer = r8lambdabirsljoagmyxhikohl5z5hht12q.serializer();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.IconCompatParcelizer, ((migrateBannerStorageToJson) obj).IconCompatParcelizer);
    }
}
