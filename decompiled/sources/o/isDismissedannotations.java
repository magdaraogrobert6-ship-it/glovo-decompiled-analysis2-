package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.events.eventextras.TimelineUpdateDetails;
import com.sentiance.sdk.eventtimeline.timelines.stores.entries.VenueSignificance;
import com.sentiance.sdk.eventtimeline.timelines.stores.entries.VenueType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "StationaryVenueCreator")
public class isDismissedannotations {
    private final setHeaderTextColor read;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI serializer;

    public isDismissedannotations(parseLonglambda0 parselonglambda0, setHeaderTextColor setheadertextcolor, r8lambdaXPYBZDOuJKDQIhpUsif_DKhgJb4 r8lambdaxpybzdoujkdqihpusif_dkhgjb4, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni) {
        this.read = setheadertextcolor;
        this.serializer = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
    }

    public final ArrayList read(String str, VenueSignificance venueSignificance, VenueType venueType) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        InAppMessageFull inAppMessageFull = InAppMessageFull.read();
        r8lambdaSywuHIWfLiZV_fav810RJNKPOo r8lambdasywuhiwflizv_fav810rjnkpooMediaBrowserCompatMediaItem = r8lambdaSywuHIWfLiZV_fav810RJNKPOo.MediaBrowserCompatMediaItem();
        setHeaderTextColor setheadertextcolor = this.read;
        List listSerializer = setheadertextcolor.serializer(inAppMessageFull, str);
        List listIconCompatParcelizer = setheadertextcolor.IconCompatParcelizer(r8lambdasywuhiwflizv_fav810rjnkpooMediaBrowserCompatMediaItem, str);
        if (!listSerializer.isEmpty() && !listIconCompatParcelizer.isEmpty()) {
            _set_durationInMilliseconds_lambda0 _set_durationinmilliseconds_lambda0 = (_set_durationInMilliseconds_lambda0) listIconCompatParcelizer.get(0);
            _set_durationInMilliseconds_lambda0 _set_durationinmilliseconds_lambda1 = new _set_durationInMilliseconds_lambda0(_set_durationinmilliseconds_lambda0.serializer(), _set_durationinmilliseconds_lambda0.MediaMetadataCompat(), _set_durationinmilliseconds_lambda0.MediaDescriptionCompat(), _set_durationinmilliseconds_lambda0.read(), _set_durationinmilliseconds_lambda0.MediaSessionCompatQueueItem(), _set_durationinmilliseconds_lambda0.MediaSessionCompatToken(), venueSignificance, venueType);
            r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq = (r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ) listSerializer.get(0);
            this.serializer.getClass();
            r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq2 = new r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ(r8lambdali8uu9krigfjg6en6xj7af4cwaq, System.currentTimeMillis(), false);
            InAppMessageFull.read readVar = new InAppMessageFull.read();
            readVar.IconCompatParcelizer("unique_id").write(str);
            TimelineUpdateDetails timelineUpdateDetailsRemoteActionCompatParcelizer = TimelineUpdateDetails.RemoteActionCompatParcelizer(TimelineUpdateDetails.UpdatedDataType.VENUE, Collections.singletonList(str));
            arrayList = new ArrayList();
            arrayList.add(getImageStyle.RemoteActionCompatParcelizer(inAppMessageFull, readVar));
            arrayList.add(getImageStyle.RemoteActionCompatParcelizer(r8lambdali8uu9krigfjg6en6xj7af4cwaq2));
            arrayList.add(new setHeaderTextAlign(_set_durationinmilliseconds_lambda1, timelineUpdateDetailsRemoteActionCompatParcelizer));
        } else {
            arrayList = new ArrayList();
        }
        arrayList2.addAll(arrayList);
        return arrayList2;
    }
}
