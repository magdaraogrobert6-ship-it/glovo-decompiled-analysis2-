package o;

import bo.app.wg$$ExternalSyntheticLambda0;
import com.incognia.internal.ZM$$ExternalSyntheticLambda2;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.eventtimeline.timelines.creators.TransportChangeType;
import com.sentiance.sdk.eventtimeline.transportclassification.ClassifiedTransportMode;
import com.sentiance.sdk.eventtimeline.transportsessionrecorder.api.TransportSession;
import com.sentiance.sdk.util.DateTime;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = "TransportSessionRecorder", componentName = "TransportSessionRecorder")
public class parsePayloadFieldsFromBundleparseBigImageStyle implements removeGeofencesRegisteredWithGeofencingClientlambda2, r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    private final readandroid_sdk_base_release IconCompatParcelizer;
    private final isPushDeliveryEnabledannotations MediaDescriptionCompat;
    private final parsePayloadFieldsFromBundle MediaMetadataCompat;
    private final isPushDeliveryEnabledannotations MediaSessionCompatQueueItem;
    private final migrateTriggersReeligibilityToJsonlambda1<parsePayloadFieldsFromBundleparseNotificationMetadata> RatingCompat;
    private final getAnalyticsEnabledEnterannotations RemoteActionCompatParcelizer;
    private final setHeaderTextColor read;
    private final parseLonglambda0 serializer;
    private final com.sentiance.sdk.util.c write;

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        return null;
    }

    public static void IconCompatParcelizer(parsePayloadFieldsFromBundleparseBigImageStyle parsepayloadfieldsfrombundleparsebigimagestyle) {
        TransportSession transportSessionSerializer;
        migrateTriggersReeligibilityToJsonlambda1<parsePayloadFieldsFromBundleparseNotificationMetadata> migratetriggersreeligibilitytojsonlambda1 = parsepayloadfieldsfrombundleparsebigimagestyle.RatingCompat;
        parseLonglambda0 parselonglambda0 = parsepayloadfieldsfrombundleparsebigimagestyle.serializer;
        if (!parsepayloadfieldsfrombundleparsebigimagestyle.read() && migratetriggersreeligibilitytojsonlambda1.read().serializer() == null) {
            StringBuilder sb = new StringBuilder("Ignoring timeline update. isRecording:");
            sb.append(parsepayloadfieldsfrombundleparsebigimagestyle.read());
            sb.append(", ongoingSessionExists: ");
            sb.append(migratetriggersreeligibilitytojsonlambda1.read().serializer() != null);
            parselonglambda0.IconCompatParcelizer(sb.toString(), new Object[0]);
            return;
        }
        r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq = (r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ) parsepayloadfieldsfrombundleparsebigimagestyle.read.serializer(InAppMessageFull.read());
        if (r8lambdali8uu9krigfjg6en6xj7af4cwaq == null || r8lambdali8uu9krigfjg6en6xj7af4cwaq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys().equals(migratetriggersreeligibilitytojsonlambda1.read().RemoteActionCompatParcelizer())) {
            return;
        }
        isPushDeliveryEnabledannotations ispushdeliveryenabledannotations = parsepayloadfieldsfrombundleparsebigimagestyle.MediaDescriptionCompat;
        parsePayloadFieldsFromBundle parsepayloadfieldsfrombundle = parsepayloadfieldsfrombundleparsebigimagestyle.MediaMetadataCompat;
        String strSerializer = migratetriggersreeligibilitytojsonlambda1.read().serializer();
        TransportChangeType transportChangeType = migratetriggersreeligibilitytojsonlambda1.read().read();
        parselonglambda0.IconCompatParcelizer("Handling transport change for type: " + transportChangeType, new Object[0]);
        if (migratetriggersreeligibilitytojsonlambda1.read().serializer() != null && strSerializer != null) {
            if (transportChangeType != null) {
                parselonglambda0.IconCompatParcelizer("Ending session %s of type %s", strSerializer, transportChangeType.name());
            }
            migratetriggersreeligibilitytojsonlambda1.read().serializer(null);
            if (parsepayloadfieldsfrombundle.RemoteActionCompatParcelizer(r8lambdali8uu9krigfjg6en6xj7af4cwaq.PlaybackStateCompatCustomAction(), strSerializer) && (transportSessionSerializer = parsepayloadfieldsfrombundleparsebigimagestyle.serializer(strSerializer)) != null) {
                parsepayloadfieldsfrombundleparsebigimagestyle.RemoteActionCompatParcelizer.IconCompatParcelizer(ControlMessage.TRANSPORT_SESSION_COMPLETED, transportSessionSerializer);
            }
        }
        TransportChangeType transportChangeType2 = r8lambdali8uu9krigfjg6en6xj7af4cwaq.read();
        if (transportChangeType2 != TransportChangeType.TRANSPORT_UNKNOWN && transportChangeType2.isOfTypeTransport() && parsepayloadfieldsfrombundleparsebigimagestyle.read()) {
            String strR8lambda54BeH8ZsBru0CXI2CCSP2syNys = r8lambdali8uu9krigfjg6en6xj7af4cwaq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            ClassifiedTransportMode classifiedTransportMode = r8lambdali8uu9krigfjg6en6xj7af4cwaq.read().toClassifiedTransportMode();
            migratetriggersreeligibilitytojsonlambda1.read().serializer(strR8lambda54BeH8ZsBru0CXI2CCSP2syNys);
            parsepayloadfieldsfrombundle.serializer(strR8lambda54BeH8ZsBru0CXI2CCSP2syNys, classifiedTransportMode, r8lambdali8uu9krigfjg6en6xj7af4cwaq.PlaybackStateCompatCustomAction());
            parselonglambda0.IconCompatParcelizer("Starting session %s of type %s", migratetriggersreeligibilitytojsonlambda1.read().serializer(), r8lambdali8uu9krigfjg6en6xj7af4cwaq.read().name());
            parsepayloadfieldsfrombundle.write(strR8lambda54BeH8ZsBru0CXI2CCSP2syNys, ispushdeliveryenabledannotations.IconCompatParcelizer());
            parsepayloadfieldsfrombundle.serializer(strR8lambda54BeH8ZsBru0CXI2CCSP2syNys, ispushdeliveryenabledannotations.read());
        } else {
            ispushdeliveryenabledannotations.write();
            parsepayloadfieldsfrombundleparsebigimagestyle.MediaSessionCompatQueueItem.write();
        }
        migratetriggersreeligibilitytojsonlambda1.read().read(r8lambdali8uu9krigfjg6en6xj7af4cwaq.read());
        migratetriggersreeligibilitytojsonlambda1.read().read(r8lambdali8uu9krigfjg6en6xj7af4cwaq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
        migratetriggersreeligibilitytojsonlambda1.read().RatingCompat();
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(parsePayloadFieldsFromBundleparseBigImageStyle parsepayloadfieldsfrombundleparsebigimagestyle) {
        migrateTriggersReeligibilityToJsonlambda1<parsePayloadFieldsFromBundleparseNotificationMetadata> migratetriggersreeligibilitytojsonlambda1 = parsepayloadfieldsfrombundleparsebigimagestyle.RatingCompat;
        String strSerializer = migratetriggersreeligibilitytojsonlambda1.read().serializer();
        if (strSerializer != null) {
            parsepayloadfieldsfrombundleparsebigimagestyle.MediaMetadataCompat.serializer(strSerializer);
        }
        migratetriggersreeligibilitytojsonlambda1.read().serializer(null);
        migratetriggersreeligibilitytojsonlambda1.read().RatingCompat();
    }

    public static void serializer(parsePayloadFieldsFromBundleparseBigImageStyle parsepayloadfieldsfrombundleparsebigimagestyle) {
        String strSerializer;
        migrateTriggersReeligibilityToJsonlambda1<parsePayloadFieldsFromBundleparseNotificationMetadata> migratetriggersreeligibilitytojsonlambda1 = parsepayloadfieldsfrombundleparsebigimagestyle.RatingCompat;
        if (migratetriggersreeligibilitytojsonlambda1.read().serializer() == null || (strSerializer = migratetriggersreeligibilitytojsonlambda1.read().serializer()) == null) {
            return;
        }
        parsepayloadfieldsfrombundleparsebigimagestyle.MediaMetadataCompat.IconCompatParcelizer(strSerializer);
    }

    public static void serializer(parsePayloadFieldsFromBundleparseBigImageStyle parsepayloadfieldsfrombundleparsebigimagestyle, getLongitudeannotations getlongitudeannotations) {
        isPushDeliveryEnabledannotations ispushdeliveryenabledannotations = parsepayloadfieldsfrombundleparsebigimagestyle.MediaDescriptionCompat;
        parsePayloadFieldsFromBundle parsepayloadfieldsfrombundle = parsepayloadfieldsfrombundleparsebigimagestyle.MediaMetadataCompat;
        isPushDeliveryEnabledannotations ispushdeliveryenabledannotations2 = parsepayloadfieldsfrombundleparsebigimagestyle.MediaSessionCompatQueueItem;
        Byte b = ((r8lambdaVYxNhK9sdrAxWugVbef6IZzXiDs) getlongitudeannotations.read()).serializer;
        migrateTriggersReeligibilityToJsonlambda1<parsePayloadFieldsFromBundleparseNotificationMetadata> migratetriggersreeligibilitytojsonlambda1 = parsepayloadfieldsfrombundleparsebigimagestyle.RatingCompat;
        String strSerializer = migratetriggersreeligibilitytojsonlambda1.read().serializer();
        parseLonglambda0 parselonglambda0 = parsepayloadfieldsfrombundleparsebigimagestyle.serializer;
        parselonglambda0.IconCompatParcelizer("Handling classification for mode: " + ClassifiedTransportMode.fromEventConstant(b), new Object[0]);
        if (b == null) {
            return;
        }
        if (getlongitudeannotations.RemoteActionCompatParcelizer() instanceof r8lambdabuq0kpt9xWGgh2Z3gBfct3eoBM) {
            r8lambdabuq0kpt9xWGgh2Z3gBfct3eoBM r8lambdabuq0kpt9xwggh2z3gbfct3eobm = (r8lambdabuq0kpt9xWGgh2Z3gBfct3eoBM) getlongitudeannotations.RemoteActionCompatParcelizer();
            if (b.byteValue() == 12) {
                ispushdeliveryenabledannotations2.RemoteActionCompatParcelizer(r8lambdabuq0kpt9xwggh2z3gbfct3eobm);
                ispushdeliveryenabledannotations2.RemoteActionCompatParcelizer();
                parselonglambda0.IconCompatParcelizer("Handled classification is idle, caching it into intermediate store", new Object[0]);
            } else {
                ispushdeliveryenabledannotations.RemoteActionCompatParcelizer(r8lambdabuq0kpt9xwggh2z3gbfct3eobm);
                parselonglambda0.IconCompatParcelizer("Handled classification is cached", new Object[0]);
            }
        }
        Byte bIconCompatParcelizer = migratetriggersreeligibilitytojsonlambda1.read().IconCompatParcelizer();
        if (migratetriggersreeligibilitytojsonlambda1.read().serializer() != null && strSerializer != null) {
            if (migratetriggersreeligibilitytojsonlambda1.read().read() == TransportChangeType.fromTransportModeEventConstant(b.byteValue())) {
                parsepayloadfieldsfrombundle.write(strSerializer, ispushdeliveryenabledannotations2.IconCompatParcelizer());
                parsepayloadfieldsfrombundle.serializer(strSerializer, ispushdeliveryenabledannotations2.read());
                parsepayloadfieldsfrombundle.write(strSerializer, ispushdeliveryenabledannotations.IconCompatParcelizer());
                parsepayloadfieldsfrombundle.serializer(strSerializer, ispushdeliveryenabledannotations.read());
                parselonglambda0.IconCompatParcelizer("Handled classification belongs to current session, data is bulked", new Object[0]);
            } else if (bIconCompatParcelizer != null && bIconCompatParcelizer.byteValue() == 12) {
                parsepayloadfieldsfrombundle.write(strSerializer, ispushdeliveryenabledannotations2.IconCompatParcelizer());
                parsepayloadfieldsfrombundle.serializer(strSerializer, ispushdeliveryenabledannotations2.read());
                parselonglambda0.IconCompatParcelizer("Handled classification is different than current sessiopn type, bulked intermediate data", new Object[0]);
            }
        }
        migratetriggersreeligibilitytojsonlambda1.read().IconCompatParcelizer(b);
        migratetriggersreeligibilitytojsonlambda1.read().RatingCompat();
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        this.write.read();
        migrateSealedSessionsMapToJsonlambda0.read(this.MediaMetadataCompat.write());
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        return migrateSealedSessionsMapToJsonlambda0.write(this.MediaMetadataCompat.write());
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        this.RatingCompat.read().MediaDescriptionCompat();
        this.MediaDescriptionCompat.write();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        parsePayloadFieldsFromBundleparseConversationPushData parsepayloadfieldsfrombundleparseconversationpushdata = new parsePayloadFieldsFromBundleparseConversationPushData(this);
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.RemoteActionCompatParcelizer;
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog.class, parsepayloadfieldsfrombundleparseconversationpushdata);
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(addBannerViewMonitor.class, new parsePayloadFieldsFromBundleparseContentCardData(this));
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(r8lambdaVYxNhK9sdrAxWugVbef6IZzXiDs.class, new parsePayloadFieldsFromBundleparseActionButtons(this));
    }

    public parsePayloadFieldsFromBundleparseBigImageStyle(getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, setHeaderTextColor setheadertextcolor, com.sentiance.sdk.util.c cVar, parseLonglambda0 parselonglambda0, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, parsePayloadFieldsFromBundle parsepayloadfieldsfrombundle) {
        this.RemoteActionCompatParcelizer = getanalyticsenabledenterannotations;
        this.IconCompatParcelizer = readandroid_sdk_base_releaseVar;
        this.read = setheadertextcolor;
        this.write = cVar;
        this.serializer = parselonglambda0;
        this.MediaMetadataCompat = parsepayloadfieldsfrombundle;
        this.MediaDescriptionCompat = new isPushDeliveryEnabledannotations(r8lambdaqv3gcjxzuxdig5g76qjuzxgjni);
        this.MediaSessionCompatQueueItem = new isPushDeliveryEnabledannotations(r8lambdaqv3gcjxzuxdig5g76qjuzxgjni);
        this.RatingCompat = new parsePayloadFieldsFromBundleparseBigTextStyle(cVar, parselonglambda0);
    }

    public final boolean read() {
        return this.write.read("is_transport_session_recording_enabled", false);
    }

    public final void IconCompatParcelizer(boolean z) {
        this.write.IconCompatParcelizer("is_transport_session_recording_enabled", z);
        this.serializer.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("is_transport_session_recording_enabled: ", z), new Object[0]);
        if (z) {
            return;
        }
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(new ZM$$ExternalSyntheticLambda2(23, this));
    }

    public final void IconCompatParcelizer(String str) {
        this.MediaMetadataCompat.serializer(str);
    }

    private TransportSession serializer(String str) {
        getCampaignIdannotations getcampaignidannotations = this.MediaMetadataCompat.read(str);
        if (getcampaignidannotations == null) {
            return null;
        }
        long jMediaDescriptionCompat = getcampaignidannotations.MediaDescriptionCompat();
        String strMediaBrowserCompatMediaItem = getcampaignidannotations.MediaBrowserCompatMediaItem();
        int iRatingCompat = getcampaignidannotations.RatingCompat();
        Long lRemoteActionCompatParcelizer = getcampaignidannotations.RemoteActionCompatParcelizer();
        String strIconCompatParcelizer = getcampaignidannotations.IconCompatParcelizer();
        Integer numMediaMetadataCompat = getcampaignidannotations.MediaMetadataCompat();
        if (lRemoteActionCompatParcelizer != null && numMediaMetadataCompat != null && strIconCompatParcelizer != null) {
            return new TransportSession(str, new DateTime(jMediaDescriptionCompat, iRatingCompat, strMediaBrowserCompatMediaItem), new DateTime(lRemoteActionCompatParcelizer.longValue(), numMediaMetadataCompat.intValue(), strIconCompatParcelizer), getcampaignidannotations.PlaybackStateCompatCustomAction().toExternalTransportMode(), this.MediaMetadataCompat);
        }
        this.serializer.RemoteActionCompatParcelizer("End data is missing", new Object[0]);
        return null;
    }

    public final ArrayList RemoteActionCompatParcelizer() {
        List<String> listAsList;
        TransportSession transportSessionSerializer;
        parsePayloadFieldsFromBundle parsepayloadfieldsfrombundle = this.MediaMetadataCompat;
        String[] list = parsepayloadfieldsfrombundle.write().list();
        if (list == null) {
            listAsList = new ArrayList();
        } else {
            listAsList = Arrays.asList(list);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : listAsList) {
            getCampaignIdannotations getcampaignidannotations = parsepayloadfieldsfrombundle.read(str);
            if (getcampaignidannotations != null && getcampaignidannotations.RemoteActionCompatParcelizer() != null && (transportSessionSerializer = serializer(str)) != null) {
                arrayList.add(transportSessionSerializer);
            }
        }
        Collections.sort(arrayList, new wg$$ExternalSyntheticLambda0(23));
        return arrayList;
    }
}
