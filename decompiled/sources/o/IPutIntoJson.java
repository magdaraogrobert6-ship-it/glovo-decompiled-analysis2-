package o;

import com.sentiance.sdk.eventtimeline.timelines.stores.tables.Tables;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class IPutIntoJson implements setSoundIfPresentAndSupportedlambda0<r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog> {
    private List<? extends r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE> read = new ArrayList();
    final /* synthetic */ IPropertiesObjectCompanion serializer;

    @Override // o.setSoundIfPresentAndSupportedlambda0
    public final List<logBaiduNotificationClicklambda1> RemoteActionCompatParcelizer(getLongitudeannotations<r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog> getlongitudeannotations) {
        this.read.clear();
        List list = getlongitudeannotations.read().write;
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Tables tables : Tables.values()) {
            if (tables.getTable() instanceof isPushPrimer) {
                isPushPrimer ispushprimer = (isPushPrimer) tables.getTable();
                map.put(ispushprimer.MediaSessionCompatQueueItem(), ispushprimer);
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            isPushPrimer ispushprimer2 = (isPushPrimer) map.get((Byte) it.next());
            if (ispushprimer2 != null) {
                arrayList.add(ispushprimer2);
            }
        }
        IPropertiesObjectCompanion iPropertiesObjectCompanion = this.serializer;
        parseLonglambda0 parselonglambda0 = iPropertiesObjectCompanion.RemoteActionCompatParcelizer;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((isPushPrimer) it2.next()).getClass().getSimpleName());
        }
        parselonglambda0.IconCompatParcelizer("TimelineUpdateEvent arrived, timelines: [%s]", r8lambda5tLpxyx6nsiTnLY5GKIpCwhnz8M.RemoteActionCompatParcelizer(arrayList2, ", "));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            List<? extends r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE> listIconCompatParcelizer = iPropertiesObjectCompanion.serializer.IconCompatParcelizer((isPushPrimer) it3.next());
            this.read = listIconCompatParcelizer;
            if (!listIconCompatParcelizer.isEmpty()) {
                iPropertiesObjectCompanion.RemoteActionCompatParcelizer.IconCompatParcelizer("Found %d unprocessed %s entries", Integer.valueOf(this.read.size()), ((r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE) r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer(1, this.read)).IconCompatParcelizer());
                getCardType getcardtypeWrite = iPropertiesObjectCompanion.IconCompatParcelizer.write(this.read, iPropertiesObjectCompanion.RemoteActionCompatParcelizer, iPropertiesObjectCompanion.read);
                return getcardtypeWrite == null ? Collections.EMPTY_LIST : Collections.singletonList(getcardtypeWrite);
            }
        }
        return Collections.EMPTY_LIST;
    }

    public IPutIntoJson(IPropertiesObjectCompanion iPropertiesObjectCompanion) {
        this.serializer = iPropertiesObjectCompanion;
    }

    @Override // o.setSoundIfPresentAndSupportedlambda0
    public final void serializer() {
        this.serializer.serializer.read(this.read);
    }
}
