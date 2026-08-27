package o;

import android.util.Pair;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.eventtimeline.timelines.creators.HarshDrivingEntryType;
import com.sentiance.sdk.util.database.WhereClause;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "HarshDrivingEvaluationEventsProvider")
public final class setExpirationTimestamp {
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private final migrateTriggersStorageToJsonlambda1 read;
    private final setHeaderTextColor serializer;
    private final getFrameColor write;

    public setExpirationTimestamp(parseLonglambda0 parselonglambda0, setHeaderTextColor setheadertextcolor, migrateTriggersStorageToJsonlambda1 migratetriggersstoragetojsonlambda1, getFrameColor getframecolor) {
        parselonglambda0.getClass();
        setheadertextcolor.getClass();
        migratetriggersstoragetojsonlambda1.getClass();
        getframecolor.getClass();
        this.RemoteActionCompatParcelizer = parselonglambda0;
        this.serializer = setheadertextcolor;
        this.read = migratetriggersstoragetojsonlambda1;
        this.write = getframecolor;
    }

    public final List serializer(String str) {
        str.getClass();
        migrateTriggersStorageToJsonlambda1 migratetriggersstoragetojsonlambda1 = this.read;
        Pair<Long, Long> pairSerializer = migratetriggersstoragetojsonlambda1.serializer(str);
        WhereClause whereClauseWrite = WhereClause.serializer(migratetriggersstoragetojsonlambda1.IconCompatParcelizer(str) ? "type_motorcycle" : "type").write((List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{Integer.valueOf(HarshDrivingEntryType.NO_EVENT.value)}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer()));
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        if (pairSerializer != null) {
            Long l = (Long) pairSerializer.first;
            Long l2 = (Long) pairSerializer.second;
            if (l2 != null) {
                l.getClass();
                long jLongValue = l.longValue();
                long jLongValue2 = l2.longValue();
                List listIconCompatParcelizer = this.serializer.IconCompatParcelizer(InAppMessageHtml.MediaBrowserCompatMediaItem(), str);
                listIconCompatParcelizer.getClass();
                handleLogClick handlelogclick = (handleLogClick) onContentCardDismissed.MediaMetadataCompat(listIconCompatParcelizer);
                List<handleLogClickdefault> listMediaSessionCompatResultReceiverWrapper = handlelogclick != null ? handlelogclick.MediaSessionCompatResultReceiverWrapper() : null;
                return read(jLongValue, jLongValue2, listMediaSessionCompatResultReceiverWrapper == null ? instance_delegatelambda0Var : listMediaSessionCompatResultReceiverWrapper, whereClauseWrite);
            }
        }
        return instance_delegatelambda0Var;
    }

    public final ArrayList RemoteActionCompatParcelizer() {
        setBrazeManager setbrazemanager = setBrazeManager.read();
        List list = Collections.EMPTY_LIST;
        setHeaderTextColor setheadertextcolor = this.serializer;
        int i = 2;
        List list2 = (List) setheadertextcolor.serializer(list, new getEnterEvents(setheadertextcolor, i, setbrazemanager));
        list2.getClass();
        ArrayList arrayListRemoteActionCompatParcelizer = onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) list2);
        List list3 = (List) setheadertextcolor.serializer(list, new getEnterEvents(setheadertextcolor, i, InAppMessageFull.read()));
        list3.getClass();
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            String strR8lambda54BeH8ZsBru0CXI2CCSP2syNys = ((r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ) it.next()).r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            strR8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
            List listIconCompatParcelizer = setheadertextcolor.IconCompatParcelizer(InAppMessageHtml.MediaBrowserCompatMediaItem(), strR8lambda54BeH8ZsBru0CXI2CCSP2syNys);
            listIconCompatParcelizer.getClass();
            handleLogClick handlelogclick = (handleLogClick) onContentCardDismissed.MediaMetadataCompat(listIconCompatParcelizer);
            List<handleLogClickdefault> listMediaSessionCompatResultReceiverWrapper = handlelogclick != null ? handlelogclick.MediaSessionCompatResultReceiverWrapper() : null;
            if (listMediaSessionCompatResultReceiverWrapper == null) {
                listMediaSessionCompatResultReceiverWrapper = instance_delegatelambda0.write;
            }
            arrayList.add(listMediaSessionCompatResultReceiverWrapper);
        }
        return read(arrayListRemoteActionCompatParcelizer, accessgetInstancedelegatecp.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(arrayList));
    }

    private final ArrayList read(ArrayList arrayList, List list) {
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r8lambdaLPyJWl1WpW_cGrgMy_9R4FP1b0 r8lambdalpyjwl1wpw_cgrgmy_9r4fp1b0 = (r8lambdaLPyJWl1WpW_cGrgMy_9R4FP1b0) it.next();
            Long lMediaBrowserCompatMediaItem = r8lambdalpyjwl1wpw_cgrgmy_9r4fp1b0.MediaBrowserCompatMediaItem();
            if (lMediaBrowserCompatMediaItem == null) {
                lMediaBrowserCompatMediaItem = Long.valueOf(r8lambdalpyjwl1wpw_cgrgmy_9r4fp1b0.PlaybackStateCompatCustomAction());
            }
            long jLongValue = lMediaBrowserCompatMediaItem.longValue();
            Long lMediaMetadataCompat = r8lambdalpyjwl1wpw_cgrgmy_9r4fp1b0.MediaMetadataCompat();
            if (lMediaMetadataCompat == null) {
                lMediaMetadataCompat = Long.valueOf(r8lambdalpyjwl1wpw_cgrgmy_9r4fp1b0.PlaybackStateCompatCustomAction());
            }
            arrayList2.add(new r8lambdaToWEBn4vVR9WqvyA_znNRwHzM(jLongValue, lMediaMetadataCompat.longValue(), r8lambdalpyjwl1wpw_cgrgmy_9r4fp1b0.MediaDescriptionCompat(), r8lambdalpyjwl1wpw_cgrgmy_9r4fp1b0.RatingCompat(), r8lambdalpyjwl1wpw_cgrgmy_9r4fp1b0.serializer(), r8lambdalpyjwl1wpw_cgrgmy_9r4fp1b0.read(), r8lambdalpyjwl1wpw_cgrgmy_9r4fp1b0.MediaSessionCompatQueueItem(), this.write.IconCompatParcelizer(jLongValue, list)));
        }
        return arrayList2;
    }

    private final ArrayList read(long j, long j2, List list, WhereClause whereClause) {
        List listIconCompatParcelizer = this.serializer.IconCompatParcelizer(setBrazeManager.read(), j, j2, whereClause);
        this.RemoteActionCompatParcelizer.IconCompatParcelizer("Retrieved %d harsh driving events between [%d - %d]", Integer.valueOf(listIconCompatParcelizer.size()), Long.valueOf(j), Long.valueOf(j2));
        return read(onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) listIconCompatParcelizer), list);
    }

    public static ArrayList IconCompatParcelizer(setExpirationTimestamp setexpirationtimestamp, long j, long j2) {
        WhereClause whereClause = new WhereClause();
        setexpirationtimestamp.getClass();
        return setexpirationtimestamp.read(j, j2, instance_delegatelambda0.write, whereClause);
    }
}
