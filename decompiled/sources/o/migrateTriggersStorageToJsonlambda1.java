package o;

import android.util.Pair;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.ondevice.api.event.OccupantRole;
import com.sentiance.sdk.ondevice.api.event.TransportEvent;
import com.sentiance.sdk.ondevice.api.event.TransportMode;
import com.sentiance.sdk.util.DateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "TransportEventUtil")
public class migrateTriggersStorageToJsonlambda1 {
    private final setHeaderTextColor read;
    private final migrateFeatureFlagStorageToJsonlambda20 serializer;

    public final boolean IconCompatParcelizer(String str) {
        List listSerializer = this.read.serializer(InAppMessageFull.read(), str);
        if (listSerializer.isEmpty()) {
            return false;
        }
        return ((r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ) listSerializer.get(0)).RatingCompat();
    }

    public final Pair<Long, Long> serializer(String str) {
        List listSerializer = this.read.serializer(InAppMessageFull.read(), str);
        if (listSerializer.isEmpty()) {
            return null;
        }
        long jPlaybackStateCompatCustomAction = ((r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ) listSerializer.get(0)).PlaybackStateCompatCustomAction();
        return Pair.create(Long.valueOf(jPlaybackStateCompatCustomAction), IconCompatParcelizer(jPlaybackStateCompatCustomAction));
    }

    public migrateTriggersStorageToJsonlambda1(parseLonglambda0 parselonglambda0, setHeaderTextColor setheadertextcolor, migrateFeatureFlagStorageToJsonlambda20 migratefeatureflagstoragetojsonlambda20) {
        this.serializer = migratefeatureflagstoragetojsonlambda20;
        this.read = setheadertextcolor;
    }

    public final TransportEvent RemoteActionCompatParcelizer(r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq) {
        List list;
        Map<String, String> map;
        OccupantRole occupantRole;
        Long lIconCompatParcelizer = IconCompatParcelizer(r8lambdali8uu9krigfjg6en6xj7af4cwaq.PlaybackStateCompatCustomAction());
        List<accessgetClickLoggedp> listWrite = this.serializer.write();
        TransportMode externalTransportMode = r8lambdali8uu9krigfjg6en6xj7af4cwaq.read().toClassifiedTransportMode().toExternalTransportMode();
        DateTime dateTime = migrateFeatureFlagStorageToJsonlambda20.read(Long.valueOf(r8lambdali8uu9krigfjg6en6xj7af4cwaq.PlaybackStateCompatCustomAction()), listWrite);
        DateTime dateTime2 = lIconCompatParcelizer == null ? null : migrateFeatureFlagStorageToJsonlambda20.read(lIconCompatParcelizer, listWrite);
        DateTime dateTime3 = migrateFeatureFlagStorageToJsonlambda20.read(Long.valueOf(r8lambdali8uu9krigfjg6en6xj7af4cwaq.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY()), listWrite);
        List listIconCompatParcelizer = this.read.IconCompatParcelizer(InAppMessageHtml.MediaBrowserCompatMediaItem(), r8lambdali8uu9krigfjg6en6xj7af4cwaq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
        handleLogClick handlelogclick = !listIconCompatParcelizer.isEmpty() ? (handleLogClick) listIconCompatParcelizer.get(0) : null;
        List list2 = Collections.EMPTY_LIST;
        Map<String, String> map2 = Collections.EMPTY_MAP;
        OccupantRole occupantRole2 = OccupantRole.UNAVAILABLE;
        if (handlelogclick != null) {
            OccupantRole occupantRoleIconCompatParcelizer = r8lambdaxHkJqKUHkuBvtHvtOlqgehcIRIA.IconCompatParcelizer(handlelogclick.MediaMetadataCompat());
            ArrayList arrayList = r8lambdaxHkJqKUHkuBvtHvtOlqgehcIRIA.read(handlelogclick);
            parseString parsestringPlaybackStateCompat = handlelogclick.PlaybackStateCompat();
            if (parsestringPlaybackStateCompat != null) {
                map2 = parsestringPlaybackStateCompat.read();
            }
            occupantRole = occupantRoleIconCompatParcelizer;
            map = map2;
            list = arrayList;
        } else {
            list = list2;
            map = map2;
            occupantRole = occupantRole2;
        }
        return new TransportEvent(r8lambdali8uu9krigfjg6en6xj7af4cwaq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(), dateTime, dateTime2, dateTime3, externalTransportMode, list, (handlelogclick == null || handlelogclick.MediaDescriptionCompat() == -1) ? null : Integer.valueOf(handlelogclick.MediaDescriptionCompat()), map, occupantRole, r8lambdali8uu9krigfjg6en6xj7af4cwaq.MediaDescriptionCompat());
    }

    public final Long write(r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq) {
        List listIconCompatParcelizer = this.read.IconCompatParcelizer(InAppMessageFull.read(), r8lambdali8uu9krigfjg6en6xj7af4cwaq.PlaybackStateCompatCustomAction(), false, 0);
        if (listIconCompatParcelizer.isEmpty()) {
            return null;
        }
        return Long.valueOf(((r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ) listIconCompatParcelizer.get(0)).PlaybackStateCompatCustomAction());
    }

    private Long IconCompatParcelizer(long j) {
        List listIconCompatParcelizer = this.read.IconCompatParcelizer(InAppMessageFull.read(), j, false, 0);
        if (listIconCompatParcelizer.isEmpty()) {
            return null;
        }
        return Long.valueOf(((r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ) listIconCompatParcelizer.get(0)).PlaybackStateCompatCustomAction());
    }
}
