package o;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.eventtimeline.timelines.creators.TransportChangeType;
import com.sentiance.sdk.eventtimeline.timelines.stores.entries.OccupantRoleFeedbackInternal;
import com.sentiance.sdk.eventtimeline.timelines.stores.entries.OccupantRoleInternal;
import com.sentiance.sdk.feedback.api.OccupantRoleFeedbackResult;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "TransportOccupantRoleFeedbackConsumer")
public final class getPushStoryPages {
    private final getAnalyticsEnabledEnterannotations IconCompatParcelizer;
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private final setUpGeofences read;
    private final setHeaderTextColor write;

    public getPushStoryPages(parseLonglambda0 parselonglambda0, setHeaderTextColor setheadertextcolor, setUpGeofences setupgeofences, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations) {
        parselonglambda0.getClass();
        setheadertextcolor.getClass();
        setupgeofences.getClass();
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        getanalyticsenabledenterannotations.getClass();
        this.RemoteActionCompatParcelizer = parselonglambda0;
        this.write = setheadertextcolor;
        this.read = setupgeofences;
        this.IconCompatParcelizer = getanalyticsenabledenterannotations;
    }

    public final OccupantRoleFeedbackResult read(String str, OccupantRoleFeedbackInternal occupantRoleFeedbackInternal) {
        str.getClass();
        occupantRoleFeedbackInternal.getClass();
        InAppMessageFull inAppMessageFull = InAppMessageFull.read();
        setHeaderTextColor setheadertextcolor = this.write;
        List listSerializer = setheadertextcolor.serializer(inAppMessageFull, str);
        listSerializer.getClass();
        r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq = (r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ) onContentCardDismissed.MediaMetadataCompat(listSerializer);
        final parseLonglambda0 parselonglambda0 = this.RemoteActionCompatParcelizer;
        if (r8lambdali8uu9krigfjg6en6xj7af4cwaq == null || !r8lambdali8uu9krigfjg6en6xj7af4cwaq.MediaSessionCompatQueueItem()) {
            parselonglambda0.IconCompatParcelizer("Transport not found for transport ".concat(str), new Object[0]);
            return OccupantRoleFeedbackResult.TRANSPORT_NOT_FOUND;
        }
        List listIconCompatParcelizer = setheadertextcolor.IconCompatParcelizer(InAppMessageFull.read(), r8lambdali8uu9krigfjg6en6xj7af4cwaq.PlaybackStateCompatCustomAction(), false, 1);
        if ((listIconCompatParcelizer.isEmpty() ? null : (r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE) listIconCompatParcelizer.get(0)) == null) {
            parselonglambda0.IconCompatParcelizer(ff$$ExternalSyntheticOutline0.m("Transport ", str, " is not yet complete"), new Object[0]);
            return OccupantRoleFeedbackResult.TRANSPORT_NOT_YET_COMPLETE;
        }
        List listIconCompatParcelizer2 = setheadertextcolor.IconCompatParcelizer(InAppMessageHtml.MediaBrowserCompatMediaItem(), str);
        listIconCompatParcelizer2.getClass();
        final handleLogClick handlelogclick = (handleLogClick) onContentCardDismissed.MediaMetadataCompat(listIconCompatParcelizer2);
        if (handlelogclick == null) {
            parselonglambda0.IconCompatParcelizer("Transport metadata not found for transport ".concat(str), new Object[0]);
            return OccupantRoleFeedbackResult.TRANSPORT_NOT_YET_COMPLETE;
        }
        if (r8lambdali8uu9krigfjg6en6xj7af4cwaq.MediaDescriptionCompat()) {
            parselonglambda0.IconCompatParcelizer(ff$$ExternalSyntheticOutline0.m("Transport ", str, " is provisional"), new Object[0]);
            return OccupantRoleFeedbackResult.TRANSPORT_IS_PROVISIONAL;
        }
        if (handlelogclick.MediaSessionCompatQueueItem() != OccupantRoleFeedbackInternal.UNSET) {
            parselonglambda0.IconCompatParcelizer("Feedback already provided for transport ".concat(str), new Object[0]);
            return OccupantRoleFeedbackResult.FEEDBACK_ALREADY_PROVIDED;
        }
        TransportChangeType transportChangeType = TransportChangeType.TRANSPORT_CAR;
        if (!androidx.sqlite.SQLite.read(transportChangeType, TransportChangeType.TRANSPORT_VEHICLE, TransportChangeType.TRANSPORT_MOTORCYCLE).contains(r8lambdali8uu9krigfjg6en6xj7af4cwaq.read())) {
            parselonglambda0.IconCompatParcelizer("Transport type not supported for transport ".concat(str), new Object[0]);
            return OccupantRoleFeedbackResult.TRANSPORT_TYPE_NOT_SUPPORTED;
        }
        final ContentValues contentValues = new ContentValues();
        contentValues.put("occupant_role_feedback", occupantRoleFeedbackInternal.getValue());
        setheadertextcolor.serializer(new migrateBlocklistedListslambda1() { // from class: o.enableDarkThemelambda0
            @Override // o.migrateBlocklistedListslambda1
            public final void serializer(SQLiteDatabase sQLiteDatabase) {
                String str2 = handlelogclick.RemoteActionCompatParcelizer;
                int iUpdate = sQLiteDatabase.update("transport_metadata", contentValues, "unique_id = ?", new String[]{str2});
                parseLonglambda0 parselonglambda1 = parselonglambda0;
                if (iUpdate > 0) {
                    parselonglambda1.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Updated occupant role feedback for transport: ", str2), new Object[0]);
                } else {
                    parselonglambda1.RemoteActionCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to update occupant role feedback for transport: ", str2), new Object[0]);
                }
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        OccupantRoleInternal occupantRoleInternalMediaMetadataCompat = handlelogclick.MediaMetadataCompat();
        occupantRoleInternalMediaMetadataCompat.getClass();
        this.IconCompatParcelizer.IconCompatParcelizer(ControlMessage.OCCUPANT_ROLE_FEEDBACK_SUBMITTED, new getFlushMaxMinutes(str, jCurrentTimeMillis, occupantRoleInternalMediaMetadataCompat, occupantRoleFeedbackInternal, handlelogclick.MediaBrowserCompatMediaItem(), handlelogclick.RatingCompat()));
        if (r8lambdali8uu9krigfjg6en6xj7af4cwaq.read() != transportChangeType) {
            parselonglambda0.IconCompatParcelizer("Transport type does not benefit from feedback for transport ".concat(str), new Object[0]);
            return OccupantRoleFeedbackResult.ACCEPTED;
        }
        OccupantRoleInternal occupantRoleInternalMediaMetadataCompat2 = handlelogclick.MediaMetadataCompat();
        OccupantRoleInternal occupantRoleInternal = OccupantRoleInternal.UNAVAILABLE;
        if (occupantRoleInternalMediaMetadataCompat2 == occupantRoleInternal) {
            parselonglambda0.IconCompatParcelizer("Occupant role prediction is UNAVAILABLE for transport ".concat(str), new Object[0]);
            return OccupantRoleFeedbackResult.ACCEPTED;
        }
        OccupantRoleInternal occupantRoleInternalMediaMetadataCompat3 = handlelogclick.MediaMetadataCompat();
        occupantRoleInternalMediaMetadataCompat3.getClass();
        int i = getPushStoryPageIndex.read[occupantRoleFeedbackInternal.ordinal()];
        if (i == 1) {
            occupantRoleInternal = OccupantRoleInternal.DRIVER;
        } else if (i == 2) {
            occupantRoleInternal = OccupantRoleInternal.PASSENGER;
        } else if (i != 3) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        if (occupantRoleInternalMediaMetadataCompat3 == occupantRoleInternal) {
            parselonglambda0.IconCompatParcelizer("Feedback is the same as the prediction for transport ".concat(str), new Object[0]);
            return OccupantRoleFeedbackResult.ACCEPTED;
        }
        Double dMediaBrowserCompatMediaItem = handlelogclick.MediaBrowserCompatMediaItem();
        if (dMediaBrowserCompatMediaItem != null) {
            this.read.write().IconCompatParcelizer(Float.valueOf((float) dMediaBrowserCompatMediaItem.doubleValue()));
        } else {
            parselonglambda0.IconCompatParcelizer("Probability not found for transport ".concat(str), new Object[0]);
        }
        return OccupantRoleFeedbackResult.ACCEPTED;
    }
}
