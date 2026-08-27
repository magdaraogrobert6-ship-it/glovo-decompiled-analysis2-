package o;

import com.sentiance.core.model.datasync.Payload;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.events.ControlMessage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getStoryStyle;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(cacheName = "DataSyncPayloadCreator", componentName = "DataSyncPayloadCreator")
public final class BrazeNotificationUtils implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private final com.sentiance.sdk.util.c IconCompatParcelizer;
    private final r8lambda2Z24byTAeHxLu8lP73Dh4AcjHhM MediaBrowserCompatMediaItem;
    private final r8lambda1EzHY_LOIkKjPSeQvPl13OfHS3U MediaDescriptionCompat;
    private final r8lambda2cjFFMAd_RWrPqWlBD9mzTs2j8c MediaMetadataCompat;
    private final r8lambda2TNGmd5yeVAwQNibXAr1EA56f14 RatingCompat;
    private final getAnalyticsEnabledEnterannotations RemoteActionCompatParcelizer;
    private final readandroid_sdk_base_release read;
    private final r8lambda43c3j9_07_y35Qq6GrmdmAdkBhI serializer;
    private final parseLonglambda0 write;

    public static final class read {
        public read(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final List<getStoryStyle> IconCompatParcelizer() {
        return androidx.sqlite.SQLite.read(this.RatingCompat, this.MediaMetadataCompat, this.MediaBrowserCompatMediaItem, this.MediaDescriptionCompat);
    }

    public static final void write(BrazeNotificationUtils brazeNotificationUtils) {
        brazeNotificationUtils.RemoteActionCompatParcelizer(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(1) { // from class: com.sentiance.sdk.ondevice.datasyncing.creators.DataSyncPayloadCreator$processVehicleCrashFeedbackEvent$1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                getStoryStyle getstorystyle = (getStoryStyle) obj;
                getstorystyle.getClass();
                return getstorystyle.serializer();
            }
        });
    }

    public static final void write(BrazeNotificationUtils brazeNotificationUtils, final r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog r8lambdaqoukgs6h1gfby4ttokxnao8yog, final long j) {
        brazeNotificationUtils.RemoteActionCompatParcelizer(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.sentiance.sdk.ondevice.datasyncing.creators.DataSyncPayloadCreator$processTimelineUpdate$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                getStoryStyle getstorystyle = (getStoryStyle) obj;
                getstorystyle.getClass();
                return getstorystyle.IconCompatParcelizer(r8lambdaqoukgs6h1gfby4ttokxnao8yog, j);
            }
        });
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(addBannerViewMonitor.class, new BrazeNotificationStyleFactoryNoOpSentinelStyle(this, this.read));
    }

    static {
        new read(null);
    }

    public BrazeNotificationUtils(getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, r8lambda43c3j9_07_y35Qq6GrmdmAdkBhI r8lambda43c3j9_07_y35qq6grmdmadkbhi, parseLonglambda0 parselonglambda0, com.sentiance.sdk.util.c cVar, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, r8lambda2TNGmd5yeVAwQNibXAr1EA56f14 r8lambda2tngmd5yevawqnibxar1ea56f14, r8lambda2cjFFMAd_RWrPqWlBD9mzTs2j8c r8lambda2cjffmad_rwrpqwlbd9mzts2j8c, r8lambda2Z24byTAeHxLu8lP73Dh4AcjHhM r8lambda2z24bytaehxlu8lp73dh4acjhhm, r8lambda1EzHY_LOIkKjPSeQvPl13OfHS3U r8lambda1ezhy_loikkjpseqvpl13ofhs3u) {
        getanalyticsenabledenterannotations.getClass();
        readandroid_sdk_base_releaseVar.getClass();
        r8lambda43c3j9_07_y35qq6grmdmadkbhi.getClass();
        parselonglambda0.getClass();
        cVar.getClass();
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        r8lambda2tngmd5yevawqnibxar1ea56f14.getClass();
        r8lambda2cjffmad_rwrpqwlbd9mzts2j8c.getClass();
        r8lambda2z24bytaehxlu8lp73dh4acjhhm.getClass();
        r8lambda1ezhy_loikkjpseqvpl13ofhs3u.getClass();
        this.RemoteActionCompatParcelizer = getanalyticsenabledenterannotations;
        this.read = readandroid_sdk_base_releaseVar;
        this.serializer = r8lambda43c3j9_07_y35qq6grmdmadkbhi;
        this.write = parselonglambda0;
        this.IconCompatParcelizer = cVar;
        this.RatingCompat = r8lambda2tngmd5yevawqnibxar1ea56f14;
        this.MediaMetadataCompat = r8lambda2cjffmad_rwrpqwlbd9mzts2j8c;
        this.MediaBrowserCompatMediaItem = r8lambda2z24bytaehxlu8lp73dh4acjhhm;
        this.MediaDescriptionCompat = r8lambda1ezhy_loikkjpseqvpl13ofhs3u;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        Iterator<T> it = IconCompatParcelizer().iterator();
        while (it.hasNext()) {
            ((getStoryStyle) it.next()).onKillswitchActivated();
        }
        this.IconCompatParcelizer.read();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        List<getStoryStyle> listIconCompatParcelizer = IconCompatParcelizer();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listIconCompatParcelizer.iterator();
        while (it.hasNext()) {
            onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) onMove.IconCompatParcelizer(((getStoryStyle) it.next()).getRequiredEvents()), (Collection) arrayList);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.sentiance.sdk.util.c cVar = this.IconCompatParcelizer;
        ArrayList arrayListIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(androidx.sqlite.SQLite.read(new onViewAttachedToWindowlambda0(r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog.class, Long.valueOf(cVar.IconCompatParcelizer("KEY_LAST_EVENT_INGESTION_TIME", jCurrentTimeMillis))), new onViewAttachedToWindowlambda0(r8lambda9XibBb_UAwpsuoULwKlfVxtang.class, Long.valueOf(cVar.IconCompatParcelizer("KEY_LAST_EVENT_INGESTION_TIME", System.currentTimeMillis())))), arrayList);
        ArrayList<onViewAttachedToWindowlambda0> arrayList2 = new ArrayList();
        ArrayList<onViewAttachedToWindowlambda0> arrayList3 = new ArrayList();
        for (Object obj : arrayListIconCompatParcelizer) {
            onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) obj;
            if (!arrayListIconCompatParcelizer.isEmpty()) {
                Iterator it2 = arrayListIconCompatParcelizer.iterator();
                int i = 0;
                while (it2.hasNext()) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((onViewAttachedToWindowlambda0) it2.next()).serializer, onviewattachedtowindowlambda0.serializer}, getCieXyz.write())).booleanValue() && (i = i + 1) < 0) {
                        androidx.sqlite.SQLite.RemoteActionCompatParcelizer();
                        throw null;
                    }
                }
                if (i > 1) {
                    arrayList2.add(obj);
                }
            }
            arrayList3.add(obj);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList4 = new ArrayList(accessgetInstancedelegatecp.write(arrayList3, 10));
        for (onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 : arrayList3) {
            arrayList4.add(new onViewAttachedToWindowlambda0(onviewattachedtowindowlambda1.serializer, onviewattachedtowindowlambda1.write));
        }
        onMove.RemoteActionCompatParcelizer(linkedHashMap, arrayList4);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (onViewAttachedToWindowlambda0 onviewattachedtowindowlambda2 : arrayList2) {
            Class cls = (Class) onviewattachedtowindowlambda2.serializer;
            Object arrayList5 = linkedHashMap2.get(cls);
            if (arrayList5 == null) {
                arrayList5 = new ArrayList();
                linkedHashMap2.put(cls, arrayList5);
            }
            ((List) arrayList5).add(Long.valueOf(((Number) onviewattachedtowindowlambda2.write).longValue()));
        }
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            Class cls2 = (Class) entry.getKey();
            Long l = (Long) onContentCardDismissed.RatingCompat((Iterable) entry.getValue());
            if (l != null) {
                linkedHashMap.put(cls2, l);
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        parseLonglambda0 parselonglambda0;
        List<getStoryStyle> listIconCompatParcelizer = IconCompatParcelizer();
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(listIconCompatParcelizer, 10));
        Iterator<T> it = listIconCompatParcelizer.iterator();
        while (it.hasNext()) {
            arrayList.add((getNotificationStyle) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke((getStoryStyle) it.next()));
        }
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            parselonglambda0 = this.write;
            boolean z = false;
            if (!zHasNext) {
                break;
            }
            getNotificationStyle getnotificationstyle = (getNotificationStyle) it2.next();
            List<Payload> list = getnotificationstyle.read();
            ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
            for (Payload payload : list) {
                boolean zSerializer = this.serializer.serializer(payload, getnotificationstyle.serializer());
                if (zSerializer) {
                    parselonglambda0.IconCompatParcelizer("Successfully stored payload: " + payload.getUuid() + " of type " + payload.getData().getDataTypeCase(), new Object[0]);
                } else {
                    parselonglambda0.RemoteActionCompatParcelizer("Failed to store payload: " + payload.getUuid() + " of type " + payload.getData().getDataTypeCase(), new Object[0]);
                }
                arrayList3.add(Boolean.valueOf(zSerializer));
            }
            if (!arrayList3.isEmpty()) {
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    if (((Boolean) it3.next()).booleanValue()) {
                        z = true;
                        break;
                    }
                }
            }
            getnotificationstyle.write().invoke();
            arrayList2.add(Boolean.valueOf(z));
        }
        if (!arrayList2.isEmpty()) {
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                if (((Boolean) it4.next()).booleanValue()) {
                    this.RemoteActionCompatParcelizer.IconCompatParcelizer(ControlMessage.DATA_SYNC_PAYLOAD_AVAILABLE, (Object) null);
                    return;
                }
            }
        }
        parselonglambda0.serializer("Finished processing event, no payload was created.", new Object[0]);
    }

    public static final void IconCompatParcelizer(BrazeNotificationUtils brazeNotificationUtils, final r8lambda9XibBb_UAwpsuoULwKlfVxtang r8lambda9xibbb_uawpsuoulwklfvxtang, final long j) {
        brazeNotificationUtils.RemoteActionCompatParcelizer(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.sentiance.sdk.ondevice.datasyncing.creators.DataSyncPayloadCreator$processSmartGeofenceEvent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                getStoryStyle getstorystyle = (getStoryStyle) obj;
                getstorystyle.getClass();
                return getstorystyle.write(r8lambda9xibbb_uawpsuoulwklfvxtang, j);
            }
        });
    }
}
