package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.eventtimeline.api.EventTimelineUpdateListener;
import com.sentiance.sdk.tile.j$$ExternalSyntheticLambda1;
import com.sentiance.sdk.util.database.WhereClause;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.createFromParcel;
import o.doesKeyExistlambda0;
import o.getLongitudeannotations;
import o.r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "EventTimelineProvider")
public final class doesKeyExistlambda0 implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    public static final /* synthetic */ int IconCompatParcelizer = 0;
    private EventTimelineUpdateListener MediaBrowserCompatMediaItem;
    private final readandroid_sdk_base_release MediaDescriptionCompat;
    private EventTimelineUpdateListener MediaMetadataCompat;
    private final Object MediaSessionCompatQueueItem;
    private Long RatingCompat;
    private final getAnalyticsEnabledEnterannotations RemoteActionCompatParcelizer;
    private final migrateFeatureFlagStorageToJsonlambda20 read;
    private final setHeaderTextColor serializer;
    private final parseLonglambda0 write;

    public static final class RemoteActionCompatParcelizer {
        public RemoteActionCompatParcelizer(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        return null;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
    }

    public final void serializer(EventTimelineUpdateListener eventTimelineUpdateListener) {
        synchronized (this.MediaSessionCompatQueueItem) {
            this.MediaBrowserCompatMediaItem = eventTimelineUpdateListener;
            if (eventTimelineUpdateListener == null) {
                if (this.MediaMetadataCompat == null) {
                    this.RatingCompat = null;
                }
            } else if (this.RatingCompat == null) {
                this.RatingCompat = Long.valueOf(System.currentTimeMillis());
            }
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        getEnterEventsannotations.IconCompatParcelizer(this.RemoteActionCompatParcelizer, r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog.class, this.MediaDescriptionCompat, "EventTimelineProvider", new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.sentiance.sdk.eventtimeline.api.EventTimelineProvider$subscribe$1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                getLongitudeannotations getlongitudeannotations = (getLongitudeannotations) obj;
                getlongitudeannotations.getClass();
                if (((r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog) getlongitudeannotations.read()).write.contains((byte) 1)) {
                    doesKeyExistlambda0.IconCompatParcelizer(this.this$0);
                }
                return createFromParcel.INSTANCE;
            }

            {
                super(1);
            }
        });
    }

    static {
        new RemoteActionCompatParcelizer(null);
    }

    public doesKeyExistlambda0(setHeaderTextColor setheadertextcolor, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, migrateFeatureFlagStorageToJsonlambda20 migratefeatureflagstoragetojsonlambda20, parseLonglambda0 parselonglambda0, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        setheadertextcolor.getClass();
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        migratefeatureflagstoragetojsonlambda20.getClass();
        parselonglambda0.getClass();
        getanalyticsenabledenterannotations.getClass();
        readandroid_sdk_base_releaseVar.getClass();
        this.serializer = setheadertextcolor;
        this.read = migratefeatureflagstoragetojsonlambda20;
        this.write = parselonglambda0;
        this.RemoteActionCompatParcelizer = getanalyticsenabledenterannotations;
        this.MediaDescriptionCompat = readandroid_sdk_base_releaseVar;
        this.MediaSessionCompatQueueItem = new Object();
    }

    public final ArrayList serializer(Date date, Date date2, boolean z) {
        date.getClass();
        date2.getClass();
        InAppMessageFull inAppMessageFull = InAppMessageFull.read();
        long time = date.getTime();
        long time2 = date2.getTime();
        InAppMessageFull.read readVar = new InAppMessageFull.read();
        readVar.write(z);
        setHeaderTextColor setheadertextcolor = this.serializer;
        List listIconCompatParcelizer = setheadertextcolor.IconCompatParcelizer(inAppMessageFull, time, time2, readVar);
        listIconCompatParcelizer.getClass();
        ArrayList arrayList = new ArrayList(listIconCompatParcelizer);
        r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq = (r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ) setheadertextcolor.read(InAppMessageFull.read(), date.getTime());
        int i = 0;
        if (r8lambdali8uu9krigfjg6en6xj7af4cwaq != null) {
            long time3 = date.getTime();
            long jPlaybackStateCompatCustomAction = r8lambdali8uu9krigfjg6en6xj7af4cwaq.PlaybackStateCompatCustomAction();
            r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq2 = read(r8lambdali8uu9krigfjg6en6xj7af4cwaq);
            Long lValueOf = r8lambdali8uu9krigfjg6en6xj7af4cwaq2 != null ? Long.valueOf(r8lambdali8uu9krigfjg6en6xj7af4cwaq2.PlaybackStateCompatCustomAction()) : null;
            if (jPlaybackStateCompatCustomAction < time3 && ((lValueOf == null || lValueOf.longValue() > time3) && (!r8lambdali8uu9krigfjg6en6xj7af4cwaq.MediaDescriptionCompat() || z))) {
                arrayList.add(0, r8lambdali8uu9krigfjg6en6xj7af4cwaq);
            }
        }
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                androidx.sqlite.SQLite.serializer();
                throw null;
            }
            r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq3 = (r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ) obj;
            r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq4 = (r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ) onContentCardDismissed.read(i2, arrayList);
            if (r8lambdali8uu9krigfjg6en6xj7af4cwaq4 == null) {
                r8lambdali8uu9krigfjg6en6xj7af4cwaq4 = read(r8lambdali8uu9krigfjg6en6xj7af4cwaq3);
            }
            arrayList2.add(r8lambdaxHkJqKUHkuBvtHvtOlqgehcIRIA.read(r8lambdali8uu9krigfjg6en6xj7af4cwaq3, r8lambdali8uu9krigfjg6en6xj7af4cwaq4 != null ? Long.valueOf(r8lambdali8uu9krigfjg6en6xj7af4cwaq4.PlaybackStateCompatCustomAction()) : null, this.read, setheadertextcolor, this.write));
            i = i2;
        }
        return arrayList2;
    }

    public final void IconCompatParcelizer(EventTimelineUpdateListener eventTimelineUpdateListener) {
        synchronized (this.MediaSessionCompatQueueItem) {
            this.MediaMetadataCompat = eventTimelineUpdateListener;
            if (eventTimelineUpdateListener == null) {
                if (this.MediaBrowserCompatMediaItem == null) {
                    this.RatingCompat = null;
                }
            } else if (this.RatingCompat == null) {
                this.RatingCompat = Long.valueOf(System.currentTimeMillis());
            }
        }
    }

    public static final void IconCompatParcelizer(doesKeyExistlambda0 doeskeyexistlambda0) {
        com.sentiance.sdk.ondevice.api.event.Event event;
        EventTimelineUpdateListener eventTimelineUpdateListener;
        EventTimelineUpdateListener eventTimelineUpdateListener2;
        synchronized (doeskeyexistlambda0.MediaSessionCompatQueueItem) {
            if (doeskeyexistlambda0.MediaBrowserCompatMediaItem == null && doeskeyexistlambda0.MediaMetadataCompat == null) {
                return;
            }
            Long l = doeskeyexistlambda0.RatingCompat;
            if (l == null) {
                doeskeyexistlambda0.write.RemoteActionCompatParcelizer("Received timeline update while handlers are registered, but most recent update time is null.", new Object[0]);
                return;
            }
            ArrayList arrayListWrite = doeskeyexistlambda0.write(l.longValue(), true);
            synchronized (doeskeyexistlambda0.MediaSessionCompatQueueItem) {
                if ((doeskeyexistlambda0.MediaBrowserCompatMediaItem != null || doeskeyexistlambda0.MediaMetadataCompat != null) && (event = (com.sentiance.sdk.ondevice.api.event.Event) onContentCardDismissed.MediaBrowserCompatMediaItem((List) arrayListWrite)) != null) {
                    doeskeyexistlambda0.RatingCompat = Long.valueOf(event.getLastUpdateTime().getEpochTime());
                }
            }
            synchronized (doeskeyexistlambda0.MediaSessionCompatQueueItem) {
                eventTimelineUpdateListener = doeskeyexistlambda0.MediaMetadataCompat;
                eventTimelineUpdateListener2 = doeskeyexistlambda0.MediaBrowserCompatMediaItem;
            }
            readBoolean.write(new j$$ExternalSyntheticLambda1(arrayListWrite, eventTimelineUpdateListener, eventTimelineUpdateListener2, 8));
        }
    }

    public final ArrayList read(Date date, boolean z) {
        date.getClass();
        return write(date.getTime(), z);
    }

    public final com.sentiance.sdk.ondevice.api.event.Event write(String str) {
        str.getClass();
        InAppMessageFull inAppMessageFull = InAppMessageFull.read();
        setHeaderTextColor setheadertextcolor = this.serializer;
        List listSerializer = setheadertextcolor.serializer(inAppMessageFull, str);
        listSerializer.getClass();
        r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq = (r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ) onContentCardDismissed.MediaMetadataCompat(listSerializer);
        if (r8lambdali8uu9krigfjg6en6xj7af4cwaq == null) {
            return null;
        }
        r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq2 = read(r8lambdali8uu9krigfjg6en6xj7af4cwaq);
        return r8lambdaxHkJqKUHkuBvtHvtOlqgehcIRIA.read(r8lambdali8uu9krigfjg6en6xj7af4cwaq, r8lambdali8uu9krigfjg6en6xj7af4cwaq2 != null ? Long.valueOf(r8lambdali8uu9krigfjg6en6xj7af4cwaq2.PlaybackStateCompatCustomAction()) : null, this.read, setheadertextcolor, this.write);
    }

    private final ArrayList write(long j, boolean z) {
        InAppMessageFull.read readVar = new InAppMessageFull.read();
        readVar.write(z);
        WhereClause whereClauseIconCompatParcelizer = readVar.IconCompatParcelizer("update_time").IconCompatParcelizer(Long.valueOf(j));
        migrateSealedSessionsMapToJsonlambda10 migratesealedsessionsmaptojsonlambda10RemoteActionCompatParcelizer = migrateSealedSessionsMapToJsonlambda10.RemoteActionCompatParcelizer("update_time", "ASC");
        InAppMessageFull inAppMessageFull = InAppMessageFull.read();
        setHeaderTextColor setheadertextcolor = this.serializer;
        List<r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ> list = setheadertextcolor.read(inAppMessageFull, whereClauseIconCompatParcelizer, (Integer) null, migratesealedsessionsmaptojsonlambda10RemoteActionCompatParcelizer);
        list.getClass();
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        for (r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq : list) {
            r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq2 = read(r8lambdali8uu9krigfjg6en6xj7af4cwaq);
            arrayList.add(r8lambdaxHkJqKUHkuBvtHvtOlqgehcIRIA.read(r8lambdali8uu9krigfjg6en6xj7af4cwaq, r8lambdali8uu9krigfjg6en6xj7af4cwaq2 != null ? Long.valueOf(r8lambdali8uu9krigfjg6en6xj7af4cwaq2.PlaybackStateCompatCustomAction()) : null, this.read, setheadertextcolor, this.write));
        }
        return arrayList;
    }

    private final r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ read(r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq) {
        InAppMessageFull inAppMessageFull = InAppMessageFull.read();
        long jPlaybackStateCompatCustomAction = r8lambdali8uu9krigfjg6en6xj7af4cwaq.PlaybackStateCompatCustomAction();
        List list = Collections.EMPTY_LIST;
        setHeaderTextColor setheadertextcolor = this.serializer;
        List list2 = (List) setheadertextcolor.serializer(list, new IInAppMessageThemeable(setheadertextcolor, 1, jPlaybackStateCompatCustomAction, inAppMessageFull));
        list2.getClass();
        return (r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ) onContentCardDismissed.MediaMetadataCompat(list2);
    }
}
