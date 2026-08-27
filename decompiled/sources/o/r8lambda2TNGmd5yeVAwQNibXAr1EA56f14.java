package o;

import com.sentiance.core.model.datasync.Payload;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.eventtimeline.timelines.creators.TransportChangeType;
import com.sentiance.sdk.eventtimeline.timelines.stores.entries.OccupantRoleInternal;
import com.sentiance.sdk.util.database.WhereClause;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.createFromParcel;
import o.getConversationalPushStyle;
import o.onContentCardDismissed;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(cacheName = "TransportPayloadCreator", componentName = "TransportPayloadCreator")
public final class r8lambda2TNGmd5yeVAwQNibXAr1EA56f14 extends getStoryStyle {
    private final com.sentiance.sdk.util.c IconCompatParcelizer;
    private final getVerticalAccuracy MediaBrowserCompatMediaItem;
    private final parseLonglambda0 MediaDescriptionCompat;
    private final getAnalyticsEnabledEnterannotations MediaMetadataCompat;
    private final setExpirationTimestamp MediaSessionCompatQueueItem;
    private final setIconColor MediaSessionCompatToken;
    private final IBrazeGeofenceLocationUpdateListener ParcelableVolumeInfo;
    private final setMessageTextAlign PlaybackStateCompatCustomAction;
    private final setClickBehavior RatingCompat;
    private final setHeaderTextColor RemoteActionCompatParcelizer;
    private final migrateFeatureFlagStorageToJsonlambda20 read;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI serializer;
    private final r8lambdaw447glWJfoun4bg91upXnaDQEZs write;

    public static final class RemoteActionCompatParcelizer {
        public RemoteActionCompatParcelizer(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // o.getStoryStyle
    public final int IconCompatParcelizer() {
        return 1;
    }

    @Override // o.getStoryStyle
    public final getNotificationStyle IconCompatParcelizer(r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog r8lambdaqoukgs6h1gfby4ttokxnao8yog, long j) {
        Payload payloadRemoteActionCompatParcelizer;
        r8lambdaqoukgs6h1gfby4ttokxnao8yog.getClass();
        List list = r8lambdaqoukgs6h1gfby4ttokxnao8yog.write;
        InAppMessageFull.read().getClass();
        if (list.contains((byte) 1)) {
            com.sentiance.sdk.util.c cVar = this.IconCompatParcelizer;
            if (cVar.write("KEY_LAST_PROCESSED_TRANSPORT_END_TIME")) {
                if (!RemoteActionCompatParcelizer()) {
                    cVar.read(j, "KEY_LAST_PROCESSED_TRANSPORT_END_TIME");
                    getNotificationStyle.write.getClass();
                    return getNotificationStyle.serializer.IconCompatParcelizer();
                }
                parseLonglambda0 parselonglambda0 = this.MediaDescriptionCompat;
                parselonglambda0.serializer("Processing timeline update event...", new Object[0]);
                r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni = this.serializer;
                r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jIconCompatParcelizer = cVar.IconCompatParcelizer("KEY_LAST_PROCESSED_TRANSPORT_END_TIME", jCurrentTimeMillis);
                InAppMessageFull inAppMessageFull = InAppMessageFull.read();
                setHeaderTextColor setheadertextcolor = this.RemoteActionCompatParcelizer;
                setheadertextcolor.getClass();
                List listIconCompatParcelizer = setheadertextcolor.IconCompatParcelizer(inAppMessageFull, jIconCompatParcelizer, jCurrentTimeMillis, new WhereClause());
                listIconCompatParcelizer.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listIconCompatParcelizer) {
                    if (((r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ) obj).MediaDescriptionCompat()) {
                        break;
                    }
                    arrayList.add(obj);
                }
                parselonglambda0.serializer("Found " + arrayList.size() + " unprocessed transport entries", new Object[0]);
                int size = arrayList.size();
                final List<handleLogClickdefault> list2 = instance_delegatelambda0.write;
                if (size > 1) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    loop1: while (true) {
                        r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq = null;
                        while (true) {
                            if (!it.hasNext()) {
                                break loop1;
                            }
                            r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq2 = (r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ) it.next();
                            if (r8lambdali8uu9krigfjg6en6xj7af4cwaq != null) {
                                String strR8lambda54BeH8ZsBru0CXI2CCSP2syNys = r8lambdali8uu9krigfjg6en6xj7af4cwaq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                                List listIconCompatParcelizer2 = setheadertextcolor.IconCompatParcelizer(InAppMessageHtml.MediaBrowserCompatMediaItem(), strR8lambda54BeH8ZsBru0CXI2CCSP2syNys);
                                listIconCompatParcelizer2.getClass();
                                handleLogClick handlelogclick = (handleLogClick) onContentCardDismissed.MediaMetadataCompat(listIconCompatParcelizer2);
                                List<handleLogClickdefault> listMediaSessionCompatResultReceiverWrapper = handlelogclick != null ? handlelogclick.MediaSessionCompatResultReceiverWrapper() : null;
                                List<handleLogClickdefault> list3 = listMediaSessionCompatResultReceiverWrapper == null ? list2 : listMediaSessionCompatResultReceiverWrapper;
                                Integer numValueOf = handlelogclick != null ? Integer.valueOf(handlelogclick.MediaDescriptionCompat()) : null;
                                List listIconCompatParcelizer3 = setheadertextcolor.IconCompatParcelizer(logImpressionlambda3.MediaBrowserCompatMediaItem(), strR8lambda54BeH8ZsBru0CXI2CCSP2syNys);
                                setClickBehaviorlambda0 setclickbehaviorlambda0 = setClickBehaviorlambda0.read();
                                long jPlaybackStateCompatCustomAction = r8lambdali8uu9krigfjg6en6xj7af4cwaq.PlaybackStateCompatCustomAction();
                                long jPlaybackStateCompatCustomAction2 = r8lambdali8uu9krigfjg6en6xj7af4cwaq2.PlaybackStateCompatCustomAction();
                                setheadertextcolor.getClass();
                                List listIconCompatParcelizer4 = setheadertextcolor.IconCompatParcelizer(setclickbehaviorlambda0, jPlaybackStateCompatCustomAction, jPlaybackStateCompatCustomAction2, new WhereClause());
                                strR8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
                                List listSerializer = this.MediaSessionCompatQueueItem.serializer(strR8lambda54BeH8ZsBru0CXI2CCSP2syNys);
                                List<r8lambdaUQHb7DT0BtnJovsZzbeRVrBdwJ0> listWrite = this.MediaSessionCompatToken.write(strR8lambda54BeH8ZsBru0CXI2CCSP2syNys);
                                List<r8lambdaSfG0H956DzQ3kMqujvKuyGX6Fc> listIconCompatParcelizer5 = this.RatingCompat.IconCompatParcelizer(strR8lambda54BeH8ZsBru0CXI2CCSP2syNys);
                                List<r8lambdaRleDsXHyrU7hnnAyr0DPXgvoX80> listSerializer2 = this.PlaybackStateCompatCustomAction.serializer(strR8lambda54BeH8ZsBru0CXI2CCSP2syNys);
                                parseString parsestringPlaybackStateCompat = handlelogclick != null ? handlelogclick.PlaybackStateCompat() : null;
                                OccupantRoleInternal occupantRoleInternalMediaMetadataCompat = handlelogclick != null ? handlelogclick.MediaMetadataCompat() : null;
                                r8lambdaVofB8WwxNgIIXeLWle1yBluC3iQ r8lambdavofb8wwxngiixelwle1ybluc3iq = this.ParcelableVolumeInfo.read(strR8lambda54BeH8ZsBru0CXI2CCSP2syNys);
                                TransportChangeType transportChangeType = r8lambdali8uu9krigfjg6en6xj7af4cwaq.read();
                                transportChangeType.getClass();
                                long jPlaybackStateCompatCustomAction3 = r8lambdali8uu9krigfjg6en6xj7af4cwaq.PlaybackStateCompatCustomAction();
                                long jPlaybackStateCompatCustomAction4 = r8lambdali8uu9krigfjg6en6xj7af4cwaq2.PlaybackStateCompatCustomAction();
                                listIconCompatParcelizer3.getClass();
                                listIconCompatParcelizer4.getClass();
                                arrayList2.add(new getConversationalPushStyle(strR8lambda54BeH8ZsBru0CXI2CCSP2syNys, transportChangeType, jPlaybackStateCompatCustomAction3, jPlaybackStateCompatCustomAction4, list3, numValueOf, listIconCompatParcelizer3, listIconCompatParcelizer4, listSerializer, listWrite, listIconCompatParcelizer5, listSerializer2, parsestringPlaybackStateCompat, occupantRoleInternalMediaMetadataCompat, r8lambdavofb8wwxngiixelwle1ybluc3iq));
                            }
                            if (r8lambdali8uu9krigfjg6en6xj7af4cwaq2.MediaSessionCompatQueueItem()) {
                                r8lambdali8uu9krigfjg6en6xj7af4cwaq = r8lambdali8uu9krigfjg6en6xj7af4cwaq2;
                            }
                        }
                    }
                    list2 = arrayList2;
                }
                parselonglambda0.serializer("Extracted " + list2.size() + " completed transports", new Object[0]);
                ArrayList<Payload> arrayList3 = new ArrayList();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    try {
                        payloadRemoteActionCompatParcelizer = r8lambdaQMpB2ZjTzCqSwpx9l6hPdj8cu4s.RemoteActionCompatParcelizer((getConversationalPushStyle) it2.next(), this.read, r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, this.write, write());
                    } catch (Exception e) {
                        parselonglambda0.IconCompatParcelizer(false, e, "Failed to create data sync payload", new Object[0]);
                        this.MediaMetadataCompat.serializer(this.MediaBrowserCompatMediaItem.serializer(e));
                        payloadRemoteActionCompatParcelizer = null;
                    }
                    if (payloadRemoteActionCompatParcelizer != null) {
                        arrayList3.add(payloadRemoteActionCompatParcelizer);
                    }
                }
                parselonglambda0.serializer("Created " + arrayList3.size() + " transport payloads", new Object[0]);
                for (Payload payload : arrayList3) {
                    parselonglambda0.IconCompatParcelizer(payload.getUuid() + ": " + payload.getData().getTransportInfo().getEventId(), new Object[0]);
                }
                if (!arrayList3.isEmpty()) {
                    return new getNotificationStyle(arrayList3, RemoteActionCompatParcelizer(), new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.sentiance.sdk.ondevice.datasyncing.creators.TransportPayloadCreator$onTimelineUpdated$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public final Object invoke() {
                            this.this$0.IconCompatParcelizer.read(((getConversationalPushStyle) onContentCardDismissed.MediaDescriptionCompat((List) list2)).MediaSessionCompatQueueItem(), "KEY_LAST_PROCESSED_TRANSPORT_END_TIME");
                            return createFromParcel.INSTANCE;
                        }
                    });
                }
                getNotificationStyle.write.getClass();
                return getNotificationStyle.serializer.IconCompatParcelizer();
            }
        }
        getNotificationStyle.write.getClass();
        return getNotificationStyle.serializer.IconCompatParcelizer();
    }

    @Override // o.getStoryStyle, o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        this.IconCompatParcelizer.read();
    }

    static {
        new RemoteActionCompatParcelizer(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambda2TNGmd5yeVAwQNibXAr1EA56f14(setHeaderTextColor setheadertextcolor, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, com.sentiance.sdk.util.c cVar, migrateFeatureFlagStorageToJsonlambda20 migratefeatureflagstoragetojsonlambda20, r8lambdaw447glWJfoun4bg91upXnaDQEZs r8lambdaw447glwjfoun4bg91upxnadqezs, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, getVerticalAccuracy getverticalaccuracy, parseLonglambda0 parselonglambda0, setExpirationTimestamp setexpirationtimestamp, setClickBehavior setclickbehavior, setIconColor seticoncolor, setMessageTextAlign setmessagetextalign, IBrazeGeofenceLocationUpdateListener iBrazeGeofenceLocationUpdateListener, ConfigurationManager configurationManager, storeRegisteredGeofencesToLocalStoragelambda0 storeregisteredgeofencestolocalstoragelambda0) {
        super(configurationManager, storeregisteredgeofencestolocalstoragelambda0);
        setheadertextcolor.getClass();
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        cVar.getClass();
        migratefeatureflagstoragetojsonlambda20.getClass();
        r8lambdaw447glwjfoun4bg91upxnadqezs.getClass();
        getanalyticsenabledenterannotations.getClass();
        getverticalaccuracy.getClass();
        parselonglambda0.getClass();
        setexpirationtimestamp.getClass();
        setclickbehavior.getClass();
        seticoncolor.getClass();
        setmessagetextalign.getClass();
        iBrazeGeofenceLocationUpdateListener.getClass();
        configurationManager.getClass();
        storeregisteredgeofencestolocalstoragelambda0.getClass();
        this.RemoteActionCompatParcelizer = setheadertextcolor;
        this.serializer = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.IconCompatParcelizer = cVar;
        this.read = migratefeatureflagstoragetojsonlambda20;
        this.write = r8lambdaw447glwjfoun4bg91upxnadqezs;
        this.MediaMetadataCompat = getanalyticsenabledenterannotations;
        this.MediaBrowserCompatMediaItem = getverticalaccuracy;
        this.MediaDescriptionCompat = parselonglambda0;
        this.MediaSessionCompatQueueItem = setexpirationtimestamp;
        this.RatingCompat = setclickbehavior;
        this.MediaSessionCompatToken = seticoncolor;
        this.PlaybackStateCompatCustomAction = setmessagetextalign;
        this.ParcelableVolumeInfo = iBrazeGeofenceLocationUpdateListener;
    }

    @Override // o.getStoryStyle
    public final void read() {
        com.sentiance.sdk.util.c cVar = this.IconCompatParcelizer;
        if (cVar.write("KEY_LAST_PROCESSED_TRANSPORT_END_TIME")) {
            return;
        }
        this.serializer.getClass();
        cVar.read(System.currentTimeMillis(), "KEY_LAST_PROCESSED_TRANSPORT_END_TIME");
    }
}
