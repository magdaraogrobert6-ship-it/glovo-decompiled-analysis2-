package o;

import android.content.ContentValues;
import android.location.Location;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.wg$$ExternalSyntheticLambda0;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.events.eventextras.TimelineUpdateDetails;
import com.sentiance.sdk.eventtimeline.timelines.creators.HarshDrivingEntryType;
import com.sentiance.sdk.eventtimeline.timelines.creators.TransportChangeType;
import com.sentiance.sdk.eventtimeline.timelines.stores.entries.OccupantRoleFeedbackInternal;
import com.sentiance.sdk.eventtimeline.timelines.stores.entries.VenueSignificance;
import com.sentiance.sdk.eventtimeline.timelines.stores.entries.VenueType;
import com.sentiance.sdk.tile.SpeedLimit;
import com.sentiance.sdk.util.database.WhereClause;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = "TransportChangeTimelineCreator", componentName = "TransportChangeTimelineCreator")
public class isIndicatorHighlighted implements r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q, removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private final r8lambda59SWxCYBPdsiW8mt9H_rosbR8qQ IconCompatParcelizer;
    private final isValidCard MediaBrowserCompatMediaItem;
    private final readMap MediaDescriptionCompat;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI MediaMetadataCompat;
    private final parsePayloadFieldsFromBundleparsePushStoryData MediaSessionCompatQueueItem;
    private final storeRegisteredGeofencesToLocalStoragelambda0 MediaSessionCompatResultReceiverWrapper;
    private final r8lambdaYOSAISsOlydt0qolNDdZsa8StmI MediaSessionCompatToken;
    private final getByteSize ParcelableVolumeInfo;
    private final ConfigurationManager PlaybackStateCompat;
    private final r8lambda_JQ3jJQJzrEU5jXzvFHiwwXkD1o PlaybackStateCompatCustomAction;
    private final ICardListener RatingCompat;
    private final com.sentiance.sdk.util.c RemoteActionCompatParcelizer;
    private final parseLonglambda0 read;
    private final setDismissed serializer;
    private final setHeaderTextColor write;
    private final ArrayList ComponentActivity = new ArrayList();
    private final migrateTriggersReeligibilityToJsonlambda4<r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ> r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new isDismissibleByUser(this);

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        return Collections.EMPTY_LIST;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
    }

    private r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ RemoteActionCompatParcelizer(long j, long j2) {
        r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.read();
        r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq2 = new r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ(UUID.randomUUID().toString(), j, r8lambdali8uu9krigfjg6en6xj7af4cwaq == null ? 0L : r8lambdali8uu9krigfjg6en6xj7af4cwaq.ComponentActivity(), TransportChangeType.OFF_THE_GRID, this.RemoteActionCompatParcelizer.write("session_id", (String) null), j2, j2, false);
        this.ComponentActivity.add(new setHeaderTextAlign(r8lambdali8uu9krigfjg6en6xj7af4cwaq2, TimelineUpdateDetails.RemoteActionCompatParcelizer(TimelineUpdateDetails.UpdatedDataType.TRANSPORT_STATE, Collections.singletonList(r8lambdali8uu9krigfjg6en6xj7af4cwaq2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys()))));
        return r8lambdali8uu9krigfjg6en6xj7af4cwaq2;
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        this.RemoteActionCompatParcelizer.read();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        HashMap map = new HashMap();
        List list = this.write.read((isPushPrimer) InAppMessageFull.read(), WhereClause.serializer("is_provisional").write(0), (Integer) 1, migrateSealedSessionsMapToJsonlambda10.RemoteActionCompatParcelizer("event_time", "DESC"));
        Long lValueOf = list.isEmpty() ? null : Long.valueOf(((r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ) list.get(0)).PlaybackStateCompatCustomAction());
        if (lValueOf == null) {
            lValueOf = 0L;
        }
        map.put(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, lValueOf);
        this.ParcelableVolumeInfo.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(r8lambdaVYxNhK9sdrAxWugVbef6IZzXiDs.class, lValueOf);
        this.MediaMetadataCompat.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (Class cls : linkedHashMap.keySet()) {
            Long lValueOf2 = (Long) map.get(cls);
            if (lValueOf2 == null) {
                lValueOf2 = Long.valueOf(jCurrentTimeMillis);
            }
            long jLongValue = lValueOf2.longValue();
            Long lValueOf3 = (Long) linkedHashMap.get(cls);
            if (lValueOf3 == null) {
                lValueOf3 = Long.valueOf(jCurrentTimeMillis);
            }
            map.put(cls, Long.valueOf(Math.min(jLongValue, lValueOf3.longValue())));
        }
        return map;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.write();
    }

    public isIndicatorHighlighted(com.sentiance.sdk.util.c cVar, parseLonglambda0 parselonglambda0, setHeaderTextColor setheadertextcolor, r8lambda59SWxCYBPdsiW8mt9H_rosbR8qQ r8lambda59swxcybpdsiw8mt9h_rosbr8qq, setDismissed setdismissed, isValidCard isvalidcard, ICardListener iCardListener, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, parsePayloadFieldsFromBundleparsePushStoryData parsepayloadfieldsfrombundleparsepushstorydata, readMap readmap, r8lambdaYOSAISsOlydt0qolNDdZsa8StmI r8lambdayosaissolydt0qolnddzsa8stmi, getByteSize getbytesize, ConfigurationManager configurationManager, r8lambda_JQ3jJQJzrEU5jXzvFHiwwXkD1o r8lambda_jq3jjqjzreu5jxzvfhiwwxkd1o, storeRegisteredGeofencesToLocalStoragelambda0 storeregisteredgeofencestolocalstoragelambda0) {
        this.RemoteActionCompatParcelizer = cVar;
        this.read = parselonglambda0;
        this.write = setheadertextcolor;
        this.IconCompatParcelizer = r8lambda59swxcybpdsiw8mt9h_rosbr8qq;
        this.serializer = setdismissed;
        this.MediaBrowserCompatMediaItem = isvalidcard;
        this.RatingCompat = iCardListener;
        this.MediaMetadataCompat = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.MediaDescriptionCompat = readmap;
        this.MediaSessionCompatQueueItem = parsepayloadfieldsfrombundleparsepushstorydata;
        this.MediaSessionCompatToken = r8lambdayosaissolydt0qolnddzsa8stmi;
        this.ParcelableVolumeInfo = getbytesize;
        this.PlaybackStateCompat = configurationManager;
        this.PlaybackStateCompatCustomAction = r8lambda_jq3jjqjzreu5jxzvfhiwwxkd1o;
        this.MediaSessionCompatResultReceiverWrapper = storeregisteredgeofencestolocalstoragelambda0;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x028c  */
    /* JADX WARN: Code duplicated, block: B:117:0x028e  */
    public final List<getImageStyle> IconCompatParcelizer(getLongitudeannotations<r8lambdaSfjrR_HlZhgR9qJKoiGmntl4F8o> getlongitudeannotations) {
        boolean z;
        Boolean boolValueOf;
        r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaqRemoteActionCompatParcelizer;
        Location locationWrite;
        Long l;
        r8lambdaSkwTftgXIpCd_0z_JGsIzJVLWBQ r8lambdaskwtftgxipcd_0z_jgsizjvlwbq;
        Long lValueOf;
        List<cleandefault> list;
        r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaqRemoteActionCompatParcelizer2;
        Location locationWrite2;
        BrazeActivityLifecycleCallbackListener brazeActivityLifecycleCallbackListener;
        ArrayList arrayList = this.ComponentActivity;
        arrayList.clear();
        TransportChangeType transportChangeTypeFromTransportState = TransportChangeType.fromTransportState(getlongitudeannotations.read().serializer);
        if (transportChangeTypeFromTransportState == null) {
            return Collections.EMPTY_LIST;
        }
        migrateTriggersReeligibilityToJsonlambda4<r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ> migratetriggersreeligibilitytojsonlambda4 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq = migratetriggersreeligibilitytojsonlambda4.read();
        if (r8lambdali8uu9krigfjg6en6xj7af4cwaq != null && r8lambdali8uu9krigfjg6en6xj7af4cwaq.read() == transportChangeTypeFromTransportState) {
            return Collections.EMPTY_LIST;
        }
        r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq2 = migratetriggersreeligibilitytojsonlambda4.read();
        com.sentiance.sdk.util.c cVar = this.RemoteActionCompatParcelizer;
        r8lambda59SWxCYBPdsiW8mt9H_rosbR8qQ r8lambda59swxcybpdsiw8mt9h_rosbr8qq = this.IconCompatParcelizer;
        r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni = this.MediaMetadataCompat;
        if (r8lambdali8uu9krigfjg6en6xj7af4cwaq2 != null && r8lambdali8uu9krigfjg6en6xj7af4cwaq2.MediaDescriptionCompat() && transportChangeTypeFromTransportState.isOffTheGridOrStationary()) {
            long jMediaMetadataCompat = getlongitudeannotations.MediaMetadataCompat();
            cVar.read("session_id");
            arrayList.add(getImageStyle.RemoteActionCompatParcelizer(InAppMessageFull.read(), WhereClause.serializer("is_provisional").write(1)));
            r8lambdaSfjrR_HlZhgR9qJKoiGmntl4F8o r8lambdasfjrr_hlzhgr9qjkoigmntl4f8o = getlongitudeannotations.read();
            if (transportChangeTypeFromTransportState == TransportChangeType.OFF_THE_GRID && (brazeActivityLifecycleCallbackListener = r8lambdasfjrr_hlzhgr9qjkoigmntl4f8o.serializer.RemoteActionCompatParcelizer) != null) {
                l = brazeActivityLifecycleCallbackListener.RemoteActionCompatParcelizer;
            } else {
                l = (transportChangeTypeFromTransportState != TransportChangeType.STATIONARY || (r8lambdaskwtftgxipcd_0z_jgsizjvlwbq = r8lambdasfjrr_hlzhgr9qjkoigmntl4f8o.serializer.IconCompatParcelizer) == null) ? null : r8lambdaskwtftgxipcd_0z_jgsizjvlwbq.write;
            }
            long jMediaMetadataCompat2 = getlongitudeannotations.MediaMetadataCompat();
            TransportChangeType transportChangeType = TransportChangeType.STATIONARY;
            boolean z2 = transportChangeTypeFromTransportState == transportChangeType;
            if (l == null) {
                return arrayList;
            }
            List<cleandefault> listSerializer = this.ParcelableVolumeInfo.serializer(l.longValue(), jMediaMetadataCompat2, z2);
            if (listSerializer.isEmpty()) {
                write(getlongitudeannotations, transportChangeTypeFromTransportState);
                return arrayList;
            }
            if (listSerializer.isEmpty()) {
                list = listSerializer;
                jMediaMetadataCompat = jMediaMetadataCompat;
            } else {
                ArrayList arrayList2 = new ArrayList();
                r8lambdaSkwTftgXIpCd_0z_JGsIzJVLWBQ r8lambdaskwtftgxipcd_0z_jgsizjvlwbq2 = getlongitudeannotations.read().serializer.IconCompatParcelizer;
                if (r8lambdaskwtftgxipcd_0z_jgsizjvlwbq2 == null || (lValueOf = r8lambdaskwtftgxipcd_0z_jgsizjvlwbq2.serializer) == null) {
                    lValueOf = Long.valueOf(getlongitudeannotations.write());
                }
                long jLongValue = lValueOf.longValue();
                for (cleandefault cleandefaultVar : listSerializer) {
                    if (cleandefaultVar.RemoteActionCompatParcelizer() >= jLongValue) {
                        break;
                    }
                    arrayList2.add(cleandefaultVar);
                }
                if (!arrayList2.isEmpty()) {
                    cleandefault cleandefaultVar2 = (cleandefault) af$$ExternalSyntheticOutline0.m(1, arrayList2);
                    cleandefaultVar2.RemoteActionCompatParcelizer(Math.min(jLongValue, cleandefaultVar2.serializer()));
                }
                list = arrayList2;
            }
            if (list.isEmpty()) {
                write(getlongitudeannotations, transportChangeTypeFromTransportState);
                return arrayList;
            }
            long jSerializer = ((cleandefault) r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer(1, list)).serializer();
            List list2 = this.write.read((isPushPrimer) setClickBehaviorlambda0.read(), WhereClause.serializer("event_time").RemoteActionCompatParcelizer(Long.valueOf(jSerializer)).IconCompatParcelizer("event_time").write(Long.valueOf(getlongitudeannotations.MediaMetadataCompat())), (Integer) 1, migrateSealedSessionsMapToJsonlambda10.RemoteActionCompatParcelizer("event_time", "ASC"));
            Long lValueOf2 = list2.isEmpty() ? null : Long.valueOf(((r8lambda5plvMMYc7MSPH8a8XIGNiKxWbe0) list2.get(0)).PlaybackStateCompatCustomAction());
            long jMax = lValueOf2 != null ? Math.max(jSerializer, lValueOf2.longValue()) : jSerializer;
            parseLonglambda0 parselonglambda0 = this.read;
            if (transportChangeTypeFromTransportState == transportChangeType) {
                r8lambdaSkwTftgXIpCd_0z_JGsIzJVLWBQ r8lambdaskwtftgxipcd_0z_jgsizjvlwbq3 = getlongitudeannotations.read().serializer.IconCompatParcelizer;
                if (r8lambdaskwtftgxipcd_0z_jgsizjvlwbq3 == null) {
                    parselonglambda0.RemoteActionCompatParcelizer("Stationary state is null, cannot create stationary entry", new Object[0]);
                    return arrayList;
                }
                r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
                r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaqWrite = write(jMax, r8lambdaskwtftgxipcd_0z_jgsizjvlwbq3, System.currentTimeMillis());
                BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = getlongitudeannotations.read().serializer.IconCompatParcelizer.read;
                r8lambda59swxcybpdsiw8mt9h_rosbr8qq.getClass();
                r8lambdali8uu9krigfjg6en6xj7af4cwaqRemoteActionCompatParcelizer2 = r8lambdali8uu9krigfjg6en6xj7af4cwaqWrite;
                locationWrite2 = getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda4);
            } else if (transportChangeTypeFromTransportState == TransportChangeType.OFF_THE_GRID) {
                r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
                r8lambdali8uu9krigfjg6en6xj7af4cwaqRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(jMax, System.currentTimeMillis());
                locationWrite2 = null;
            } else {
                parselonglambda0.RemoteActionCompatParcelizer("Not a stationary or otg transport type: %s", transportChangeTypeFromTransportState);
                return arrayList;
            }
            r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq3 = null;
            for (cleandefault cleandefaultVar3 : list) {
                TransportChangeType transportChangeTypeFromClassifiedTransportMode = TransportChangeType.fromClassifiedTransportMode(cleandefaultVar3.write());
                if (transportChangeTypeFromClassifiedTransportMode == null) {
                    parselonglambda0.RemoteActionCompatParcelizer("TransportChangeType is null", new Object[0]);
                } else {
                    long jRemoteActionCompatParcelizer = cleandefaultVar3.RemoteActionCompatParcelizer();
                    r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
                    r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq4 = read(jRemoteActionCompatParcelizer, System.currentTimeMillis(), transportChangeTypeFromClassifiedTransportMode, false);
                    if (r8lambdali8uu9krigfjg6en6xj7af4cwaq3 != null) {
                        read(r8lambdali8uu9krigfjg6en6xj7af4cwaq3, r8lambdali8uu9krigfjg6en6xj7af4cwaq4, (Location) null, cleandefaultVar3.serializer());
                        RemoteActionCompatParcelizer(r8lambdali8uu9krigfjg6en6xj7af4cwaq3, r8lambdali8uu9krigfjg6en6xj7af4cwaq4.MediaSessionCompatToken());
                    }
                    r8lambdali8uu9krigfjg6en6xj7af4cwaq3 = r8lambdali8uu9krigfjg6en6xj7af4cwaq4;
                }
            }
            if (r8lambdali8uu9krigfjg6en6xj7af4cwaq3 != null) {
                read(r8lambdali8uu9krigfjg6en6xj7af4cwaq3, r8lambdali8uu9krigfjg6en6xj7af4cwaqRemoteActionCompatParcelizer2, locationWrite2, jMediaMetadataCompat);
                RemoteActionCompatParcelizer(r8lambdali8uu9krigfjg6en6xj7af4cwaq3, r8lambdali8uu9krigfjg6en6xj7af4cwaqRemoteActionCompatParcelizer2.MediaSessionCompatToken());
            }
            migratetriggersreeligibilitytojsonlambda4.IconCompatParcelizer(r8lambdali8uu9krigfjg6en6xj7af4cwaqRemoteActionCompatParcelizer2);
            return arrayList;
        }
        storeRegisteredGeofencesToLocalStoragelambda0 storeregisteredgeofencestolocalstoragelambda0 = this.MediaSessionCompatResultReceiverWrapper;
        if (storeregisteredgeofencestolocalstoragelambda0.IconCompatParcelizer() != null) {
            boolValueOf = Boolean.FALSE;
        } else {
            r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq5 = migratetriggersreeligibilitytojsonlambda4.read();
            if (r8lambdali8uu9krigfjg6en6xj7af4cwaq5 != null && r8lambdali8uu9krigfjg6en6xj7af4cwaq5.MediaDescriptionCompat()) {
                boolValueOf = Boolean.TRUE;
            } else {
                if (r8lambdali8uu9krigfjg6en6xj7af4cwaq5 == null || r8lambdali8uu9krigfjg6en6xj7af4cwaq5.read().isOffTheGridOrStationary()) {
                    Boolean boolMediaSessionCompatQueueItem = storeregisteredgeofencestolocalstoragelambda0.MediaSessionCompatQueueItem();
                    if (boolMediaSessionCompatQueueItem != null) {
                        if (boolMediaSessionCompatQueueItem.booleanValue()) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        ConfigurationManager configurationManager = this.PlaybackStateCompat;
                        if (configurationManager.addOnContextAvailableListener() || !configurationManager.addContentView()) {
                            z = false;
                        } else {
                            z = true;
                        }
                    }
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
        }
        boolean zBooleanValue = boolValueOf.booleanValue();
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (transportChangeTypeFromTransportState == TransportChangeType.OFF_THE_GRID) {
            cVar.read("session_id");
            r8lambdali8uu9krigfjg6en6xj7af4cwaqRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(getlongitudeannotations.write(), jCurrentTimeMillis);
            locationWrite = null;
        } else if (transportChangeTypeFromTransportState == TransportChangeType.STATIONARY && getlongitudeannotations.read().serializer.IconCompatParcelizer != null) {
            cVar.read("session_id");
            r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaqWrite2 = write(getlongitudeannotations.write(), getlongitudeannotations.read().serializer.IconCompatParcelizer, jCurrentTimeMillis);
            BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda5 = getlongitudeannotations.read().serializer.IconCompatParcelizer.read;
            r8lambda59swxcybpdsiw8mt9h_rosbr8qq.getClass();
            r8lambdali8uu9krigfjg6en6xj7af4cwaqRemoteActionCompatParcelizer = r8lambdali8uu9krigfjg6en6xj7af4cwaqWrite2;
            locationWrite = getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda5);
        } else {
            if (cVar.write("session_id", (String) null) == null) {
                cVar.RemoteActionCompatParcelizer("session_id", UUID.randomUUID().toString());
            }
            r8lambdali8uu9krigfjg6en6xj7af4cwaqRemoteActionCompatParcelizer = read(getlongitudeannotations.write(), jCurrentTimeMillis, transportChangeTypeFromTransportState, zBooleanValue);
            locationWrite = null;
        }
        r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq6 = migratetriggersreeligibilitytojsonlambda4.read();
        if (!zBooleanValue) {
            read(r8lambdali8uu9krigfjg6en6xj7af4cwaq6, r8lambdali8uu9krigfjg6en6xj7af4cwaqRemoteActionCompatParcelizer, locationWrite, getlongitudeannotations.MediaMetadataCompat());
        }
        if (r8lambdali8uu9krigfjg6en6xj7af4cwaq6 != null) {
            RemoteActionCompatParcelizer(r8lambdali8uu9krigfjg6en6xj7af4cwaq6, jCurrentTimeMillis);
        }
        migratetriggersreeligibilitytojsonlambda4.IconCompatParcelizer(r8lambdali8uu9krigfjg6en6xj7af4cwaqRemoteActionCompatParcelizer);
        return arrayList;
    }

    private void read(r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq, r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq2, Location location, long j) {
        readMap readmap;
        parseLonglambda0 parselonglambda0;
        Double dValueOf;
        String string;
        Float fValueOf;
        if (r8lambdali8uu9krigfjg6en6xj7af4cwaq != null && r8lambdali8uu9krigfjg6en6xj7af4cwaq.read().isOfTypeTransport()) {
            long jPlaybackStateCompatCustomAction = r8lambdali8uu9krigfjg6en6xj7af4cwaq2.PlaybackStateCompatCustomAction();
            List<Location> list = this.serializer.read(r8lambdali8uu9krigfjg6en6xj7af4cwaq.PlaybackStateCompatCustomAction(), jPlaybackStateCompatCustomAction, location);
            ArrayList<handleLogClickdefault> arrayList = new ArrayList();
            Iterator<Location> it = list.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                readmap = this.MediaDescriptionCompat;
                if (!zHasNext) {
                    break;
                }
                Location next = it.next();
                SpeedLimit speedLimitWrite = readmap.write().write(next.getLatitude(), next.getLongitude());
                if (speedLimitWrite == SpeedLimit.LIMITED) {
                    fValueOf = Float.valueOf((float) speedLimitWrite.mps());
                } else {
                    fValueOf = speedLimitWrite == SpeedLimit.UNLIMITED ? Float.valueOf(Float.MAX_VALUE) : null;
                }
                arrayList.add(new handleLogClickdefault(next, fValueOf));
            }
            readmap.write().RemoteActionCompatParcelizer();
            HashSet hashSet = new HashSet();
            for (handleLogClickdefault handlelogclickdefault : arrayList) {
                hashSet.add(String.format(java.util.Locale.US, "%.5f,%.5f", Double.valueOf(handlelogclickdefault.RemoteActionCompatParcelizer()), Double.valueOf(handlelogclickdefault.serializer())));
            }
            Object[] objArr = {Integer.valueOf(hashSet.size())};
            parseLonglambda0 parselonglambda1 = this.read;
            parselonglambda1.IconCompatParcelizer("There are %d unique waypoints", objArr);
            this.MediaBrowserCompatMediaItem.getClass();
            if (list.isEmpty()) {
                parselonglambda0 = parselonglambda1;
                dValueOf = null;
            } else {
                ArrayList arrayList2 = new ArrayList(list);
                Collections.sort(arrayList2, new wg$$ExternalSyntheticLambda0(26));
                double dAsin = 0.0d;
                int i = 1;
                while (i < arrayList2.size()) {
                    int i2 = i - 1;
                    double latitude = ((Location) arrayList2.get(i2)).getLatitude();
                    double longitude = ((Location) arrayList2.get(i2)).getLongitude();
                    double d = latitude * 0.017453292519943295d;
                    double latitude2 = ((Location) arrayList2.get(i)).getLatitude() * 0.017453292519943295d;
                    dAsin += Math.asin(Math.sqrt((Math.cos(latitude2) * Math.cos(d) * Math.pow(Math.sin(((((Location) arrayList2.get(i)).getLongitude() * 0.017453292519943295d) - (longitude * 0.017453292519943295d)) / 2.0d), 2.0d)) + Math.pow(Math.sin((latitude2 - d) / 2.0d), 2.0d))) * 1.2742E7d;
                    i++;
                    parselonglambda1 = parselonglambda1;
                    arrayList2 = arrayList2;
                }
                parselonglambda0 = parselonglambda1;
                dValueOf = Double.valueOf(dAsin);
            }
            int iRound = dValueOf == null ? -1 : (int) Math.round(dValueOf.doubleValue());
            r8lambdaVofB8WwxNgIIXeLWle1yBluC3iQ.RemoteActionCompatParcelizer.getClass();
            r8lambdaVofB8WwxNgIIXeLWle1yBluC3iQ r8lambdavofb8wwxngiixelwle1ybluc3iqRemoteActionCompatParcelizer = r8lambdaVofB8WwxNgIIXeLWle1yBluC3iQ.read.RemoteActionCompatParcelizer();
            if (this.PlaybackStateCompat.fullyDrawnReporter_delegatelambda00()) {
                TransportChangeType transportChangeType = r8lambdali8uu9krigfjg6en6xj7af4cwaq.read();
                r8lambda_JQ3jJQJzrEU5jXzvFHiwwXkD1o r8lambda_jq3jjqjzreu5jxzvfhiwwxkd1o = this.PlaybackStateCompatCustomAction;
                r8lambda_jq3jjqjzreu5jxzvfhiwwxkd1o.getClass();
                transportChangeType.getClass();
                r8lambdavofb8wwxngiixelwle1ybluc3iqRemoteActionCompatParcelizer = r8lambda_jq3jjqjzreu5jxzvfhiwwxkd1o.write().IconCompatParcelizer(transportChangeType, arrayList);
            }
            parseString parsestring = this.MediaSessionCompatQueueItem.read(j);
            boolean zIsEmpty = true ^ this.write.read((isPushPrimer) InAppMessageControl.read(), WhereClause.serializer("event_time").RemoteActionCompatParcelizer(Long.valueOf(r8lambdali8uu9krigfjg6en6xj7af4cwaq.PlaybackStateCompatCustomAction())).IconCompatParcelizer("event_time").write(Long.valueOf(jPlaybackStateCompatCustomAction)), (Integer) 1, (migrateSealedSessionsMapToJsonlambda10) null).isEmpty();
            String strR8lambda54BeH8ZsBru0CXI2CCSP2syNys = r8lambdali8uu9krigfjg6en6xj7af4cwaq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            String strName = r8lambdali8uu9krigfjg6en6xj7af4cwaq.read().name();
            if (parsestring == null) {
                string = "null";
            } else {
                string = parsestring.toString();
            }
            parselonglambda0.IconCompatParcelizer("Transport uniqueId: %s, type: %s, distance travelled: %d, tags: %s", strR8lambda54BeH8ZsBru0CXI2CCSP2syNys, strName, Integer.valueOf(iRound), string);
            r8lambdaWCg3UcfFIZmFRiKL7zmHbVZif3M r8lambdawcg3ucffizmfrikl7zmhbvzif3mRemoteActionCompatParcelizer = this.MediaSessionCompatToken.write().RemoteActionCompatParcelizer(r8lambdali8uu9krigfjg6en6xj7af4cwaq.read(), r8lambdali8uu9krigfjg6en6xj7af4cwaq.PlaybackStateCompatCustomAction(), jPlaybackStateCompatCustomAction, arrayList);
            setHeaderTextAlign setheadertextalignRemoteActionCompatParcelizer = getImageStyle.RemoteActionCompatParcelizer(new handleLogClick(r8lambdali8uu9krigfjg6en6xj7af4cwaq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(), iRound, arrayList, parsestring, r8lambdawcg3ucffizmfrikl7zmhbvzif3mRemoteActionCompatParcelizer.IconCompatParcelizer(), r8lambdawcg3ucffizmfrikl7zmhbvzif3mRemoteActionCompatParcelizer.serializer(), OccupantRoleFeedbackInternal.UNSET, r8lambdawcg3ucffizmfrikl7zmhbvzif3mRemoteActionCompatParcelizer.read(), r8lambdavofb8wwxngiixelwle1ybluc3iqRemoteActionCompatParcelizer, Boolean.valueOf(zIsEmpty)));
            ArrayList arrayList3 = this.ComponentActivity;
            arrayList3.add(setheadertextalignRemoteActionCompatParcelizer);
            long jPlaybackStateCompatCustomAction2 = r8lambdali8uu9krigfjg6en6xj7af4cwaq.PlaybackStateCompatCustomAction();
            boolean zMediaBrowserCompatMediaItem = r8lambdali8uu9krigfjg6en6xj7af4cwaq.MediaBrowserCompatMediaItem();
            if (zMediaBrowserCompatMediaItem) {
                ArrayList<r8lambdalJNxQUFANCKWLgXbV6bNxcttL0k> arrayList4 = this.RatingCompat.read(r8lambdali8uu9krigfjg6en6xj7af4cwaq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(), iRound, r8lambdali8uu9krigfjg6en6xj7af4cwaq.PlaybackStateCompatCustomAction(), jPlaybackStateCompatCustomAction, arrayList, r8lambdali8uu9krigfjg6en6xj7af4cwaq.read(), r8lambdavofb8wwxngiixelwle1ybluc3iqRemoteActionCompatParcelizer, Boolean.valueOf(zIsEmpty));
                ArrayList arrayList5 = new ArrayList();
                for (r8lambdalJNxQUFANCKWLgXbV6bNxcttL0k r8lambdaljnxqufanckwlgxbv6bnxcttl0k : arrayList4) {
                    arrayList5.add(new setHeaderTextAlign(new r8lambdaRwoOJtaRBUu1yb4G_0x9VnCeEQ(r8lambdali8uu9krigfjg6en6xj7af4cwaq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(), r8lambdaljnxqufanckwlgxbv6bnxcttl0k.IconCompatParcelizer(), r8lambdaljnxqufanckwlgxbv6bnxcttl0k.write()), TimelineUpdateDetails.RemoteActionCompatParcelizer(TimelineUpdateDetails.UpdatedDataType.TRANSPORT_SAFETY_SCORE, Collections.singletonList(r8lambdali8uu9krigfjg6en6xj7af4cwaq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys()))));
                }
                arrayList3.addAll(arrayList5);
            }
            TransportChangeType transportChangeType2 = r8lambdali8uu9krigfjg6en6xj7af4cwaq.read();
            if (r8lambdali8uu9krigfjg6en6xj7af4cwaq2.read() == TransportChangeType.STATIONARY) {
                this.MediaMetadataCompat.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                write(jPlaybackStateCompatCustomAction, jCurrentTimeMillis, transportChangeType2, false);
                serializer(jPlaybackStateCompatCustomAction, jCurrentTimeMillis, false);
            }
            write(jPlaybackStateCompatCustomAction2, jPlaybackStateCompatCustomAction, transportChangeType2, zMediaBrowserCompatMediaItem);
            serializer(jPlaybackStateCompatCustomAction2, jPlaybackStateCompatCustomAction, zMediaBrowserCompatMediaItem);
        }
    }

    private r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ read(long j, long j2, TransportChangeType transportChangeType, boolean z) {
        r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.read();
        r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq2 = new r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ(UUID.randomUUID().toString(), j, r8lambdali8uu9krigfjg6en6xj7af4cwaq == null ? 0L : r8lambdali8uu9krigfjg6en6xj7af4cwaq.ComponentActivity(), transportChangeType, this.RemoteActionCompatParcelizer.write("session_id", (String) null), j2, j2, z);
        this.ComponentActivity.add(new setHeaderTextAlign(r8lambdali8uu9krigfjg6en6xj7af4cwaq2, TimelineUpdateDetails.RemoteActionCompatParcelizer(TimelineUpdateDetails.UpdatedDataType.TRANSPORT_STATE, Collections.singletonList(r8lambdali8uu9krigfjg6en6xj7af4cwaq2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys()))));
        return r8lambdali8uu9krigfjg6en6xj7af4cwaq2;
    }

    private r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ write(long j, r8lambdaSkwTftgXIpCd_0z_JGsIzJVLWBQ r8lambdaskwtftgxipcd_0z_jgsizjvlwbq, long j2) {
        r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq = new r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ(UUID.randomUUID().toString(), j, j, TransportChangeType.STATIONARY, this.RemoteActionCompatParcelizer.write("session_id", (String) null), j2, j2, false);
        setHeaderTextAlign setheadertextalign = new setHeaderTextAlign(r8lambdali8uu9krigfjg6en6xj7af4cwaq, TimelineUpdateDetails.RemoteActionCompatParcelizer(TimelineUpdateDetails.UpdatedDataType.TRANSPORT_STATE, Collections.singletonList(r8lambdali8uu9krigfjg6en6xj7af4cwaq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys())));
        ArrayList arrayList = this.ComponentActivity;
        arrayList.add(setheadertextalign);
        String strR8lambda54BeH8ZsBru0CXI2CCSP2syNys = r8lambdali8uu9krigfjg6en6xj7af4cwaq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        handleIncomingIntent handleincomingintent = r8lambdaskwtftgxipcd_0z_jgsizjvlwbq.IconCompatParcelizer;
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = r8lambdaskwtftgxipcd_0z_jgsizjvlwbq.read;
        arrayList.add(getImageStyle.RemoteActionCompatParcelizer(new _set_durationInMilliseconds_lambda0(strR8lambda54BeH8ZsBru0CXI2CCSP2syNys, ((double) brazeCompanionExternalSyntheticLambda4.read.intValue()) / 100000.0d, ((double) brazeCompanionExternalSyntheticLambda4.write.intValue()) / 100000.0d, brazeCompanionExternalSyntheticLambda4.serializer.shortValue(), brazeCompanionExternalSyntheticLambda4.MediaBrowserCompatMediaItem.shortValue(), handleincomingintent != null ? new logClick(handleincomingintent.IconCompatParcelizer) : null, VenueSignificance.UNSET, VenueType.UNKNOWN)));
        return r8lambdali8uu9krigfjg6en6xj7af4cwaq;
    }

    private void write(getLongitudeannotations<r8lambdaSfjrR_HlZhgR9qJKoiGmntl4F8o> getlongitudeannotations, TransportChangeType transportChangeType) {
        r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaqRemoteActionCompatParcelizer;
        long jWrite = getlongitudeannotations.write();
        TransportChangeType transportChangeType2 = TransportChangeType.TRANSPORT_UNKNOWN;
        this.MediaMetadataCompat.getClass();
        r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq = read(jWrite - 1, System.currentTimeMillis(), transportChangeType2, false);
        if (transportChangeType == TransportChangeType.STATIONARY) {
            r8lambdaSkwTftgXIpCd_0z_JGsIzJVLWBQ r8lambdaskwtftgxipcd_0z_jgsizjvlwbq = getlongitudeannotations.read().serializer.IconCompatParcelizer;
            if (r8lambdaskwtftgxipcd_0z_jgsizjvlwbq != null) {
                r8lambdali8uu9krigfjg6en6xj7af4cwaqRemoteActionCompatParcelizer = write(getlongitudeannotations.write(), r8lambdaskwtftgxipcd_0z_jgsizjvlwbq, System.currentTimeMillis());
            } else {
                this.read.RemoteActionCompatParcelizer("Stationary state is null, cannot create stationary entry", new Object[0]);
            }
        } else {
            r8lambdali8uu9krigfjg6en6xj7af4cwaqRemoteActionCompatParcelizer = transportChangeType == TransportChangeType.OFF_THE_GRID ? RemoteActionCompatParcelizer(getlongitudeannotations.write(), System.currentTimeMillis()) : null;
        }
        if (r8lambdali8uu9krigfjg6en6xj7af4cwaqRemoteActionCompatParcelizer != null) {
            RemoteActionCompatParcelizer(r8lambdali8uu9krigfjg6en6xj7af4cwaq, r8lambdali8uu9krigfjg6en6xj7af4cwaqRemoteActionCompatParcelizer.MediaSessionCompatToken());
        }
    }

    private void RemoteActionCompatParcelizer(r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("update_time", Long.valueOf(j));
        TimelineUpdateDetails timelineUpdateDetailsRemoteActionCompatParcelizer = TimelineUpdateDetails.RemoteActionCompatParcelizer(TimelineUpdateDetails.UpdatedDataType.TRANSPORT_STATE, Collections.singletonList(r8lambdali8uu9krigfjg6en6xj7af4cwaq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys()));
        this.ComponentActivity.add(new handleLogClicklambda0(InAppMessageFull.read(), contentValues, WhereClause.serializer("unique_id").write(r8lambdali8uu9krigfjg6en6xj7af4cwaq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys()), false, timelineUpdateDetailsRemoteActionCompatParcelizer));
    }

    private void write(long j, long j2, TransportChangeType transportChangeType, boolean z) {
        String str;
        isPushPrimer.write writeVar = new isPushPrimer.write();
        writeVar.IconCompatParcelizer("event_time").RemoteActionCompatParcelizer(Long.valueOf(j)).IconCompatParcelizer("event_time").write(Long.valueOf(j2));
        if (z) {
            if (transportChangeType.isMotorcycleTransport()) {
                str = "type_motorcycle";
            } else {
                str = "type";
            }
            java.util.Locale locale = java.util.Locale.ENGLISH;
            String strM = af$$ExternalSyntheticOutline0.m(HarshDrivingEntryType.NO_EVENT.value, ")", c8$$ExternalSyntheticOutline0.m("(", str, " IS NULL) OR (", str, " = "));
            List list = Collections.EMPTY_LIST;
            writeVar.RemoteActionCompatParcelizer(strM);
        }
        this.ComponentActivity.add(getImageStyle.RemoteActionCompatParcelizer(setBrazeManager.read(), writeVar));
    }

    private void serializer(long j, long j2, boolean z) {
        WhereClause whereClauseWrite = WhereClause.serializer("event_time").RemoteActionCompatParcelizer(Long.valueOf(j)).IconCompatParcelizer("event_time").write(Long.valueOf(j2));
        if (z) {
            whereClauseWrite = whereClauseWrite.IconCompatParcelizer("is_phone_usage_event").write(0);
        }
        this.ComponentActivity.add(getImageStyle.RemoteActionCompatParcelizer(InAppMessageControl.read(), whereClauseWrite));
    }
}
