package o;

import android.util.Pair;
import android.util.Range;
import com.sentiance.sdk.InjectUsing;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "PhoneUsageEventsWithWaypointsProvider")
public final class setIconColor {
    private final parseLonglambda0 IconCompatParcelizer;
    private final setDismissType RemoteActionCompatParcelizer;
    private final migrateTriggersStorageToJsonlambda1 read;
    private final logButtonClick serializer;
    private final setHeaderTextColor write;

    public setIconColor(parseLonglambda0 parselonglambda0, setHeaderTextColor setheadertextcolor, migrateTriggersStorageToJsonlambda1 migratetriggersstoragetojsonlambda1, setDismissType setdismisstype, logButtonClick logbuttonclick) {
        parselonglambda0.getClass();
        setheadertextcolor.getClass();
        migratetriggersstoragetojsonlambda1.getClass();
        setdismisstype.getClass();
        logbuttonclick.getClass();
        this.IconCompatParcelizer = parselonglambda0;
        this.write = setheadertextcolor;
        this.read = migratetriggersstoragetojsonlambda1;
        this.RemoteActionCompatParcelizer = setdismisstype;
        this.serializer = logbuttonclick;
    }

    private final List<r8lambdaUQHb7DT0BtnJovsZzbeRVrBdwJ0> read(List<setDismissType.write> list, List<? extends handleLogClickdefault> list2) {
        boolean zIsEmpty = list.isEmpty();
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        if (zIsEmpty) {
            return instance_delegatelambda0Var;
        }
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        for (setDismissType.write writeVar : list) {
            arrayList.add(new r8lambdaUQHb7DT0BtnJovsZzbeRVrBdwJ0(writeVar.write(), writeVar.IconCompatParcelizer(), writeVar.serializer(), writeVar.read(), instance_delegatelambda0Var));
        }
        List listSerializer = onContentCardDismissed.serializer(arrayList, new setLocalPrefetchedAssetPaths());
        ArrayList<r8lambdaUQHb7DT0BtnJovsZzbeRVrBdwJ0> arrayList2 = new ArrayList();
        r8lambdaUQHb7DT0BtnJovsZzbeRVrBdwJ0 r8lambdauqhb7dt0btnjovszzbervrbdwj0RemoteActionCompatParcelizer = (r8lambdaUQHb7DT0BtnJovsZzbeRVrBdwJ0) onContentCardDismissed.read(listSerializer);
        int size = listSerializer.size();
        for (int i = 1; i < size; i++) {
            r8lambdaUQHb7DT0BtnJovsZzbeRVrBdwJ0 r8lambdauqhb7dt0btnjovszzbervrbdwj0 = (r8lambdaUQHb7DT0BtnJovsZzbeRVrBdwJ0) listSerializer.get(i);
            boolean z = r8lambdauqhb7dt0btnjovszzbervrbdwj0.write() == r8lambdauqhb7dt0btnjovszzbervrbdwj0RemoteActionCompatParcelizer.write();
            boolean z2 = r8lambdauqhb7dt0btnjovszzbervrbdwj0.serializer() <= r8lambdauqhb7dt0btnjovszzbervrbdwj0RemoteActionCompatParcelizer.IconCompatParcelizer();
            if (z && z2) {
                r8lambdauqhb7dt0btnjovszzbervrbdwj0RemoteActionCompatParcelizer = r8lambdaUQHb7DT0BtnJovsZzbeRVrBdwJ0.RemoteActionCompatParcelizer(r8lambdauqhb7dt0btnjovszzbervrbdwj0RemoteActionCompatParcelizer, Math.max(r8lambdauqhb7dt0btnjovszzbervrbdwj0RemoteActionCompatParcelizer.IconCompatParcelizer(), r8lambdauqhb7dt0btnjovszzbervrbdwj0.IconCompatParcelizer()), null, 29);
            } else {
                arrayList2.add(r8lambdauqhb7dt0btnjovszzbervrbdwj0RemoteActionCompatParcelizer);
                r8lambdauqhb7dt0btnjovszzbervrbdwj0RemoteActionCompatParcelizer = r8lambdauqhb7dt0btnjovszzbervrbdwj0;
            }
        }
        arrayList2.add(r8lambdauqhb7dt0btnjovszzbervrbdwj0RemoteActionCompatParcelizer);
        ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(arrayList2, 10));
        for (r8lambdaUQHb7DT0BtnJovsZzbeRVrBdwJ0 r8lambdauqhb7dt0btnjovszzbervrbdwj1 : arrayList2) {
            arrayList3.add(r8lambdaUQHb7DT0BtnJovsZzbeRVrBdwJ0.RemoteActionCompatParcelizer(r8lambdauqhb7dt0btnjovszzbervrbdwj1, 0L, this.serializer.read(r8lambdauqhb7dt0btnjovszzbervrbdwj1.serializer(), r8lambdauqhb7dt0btnjovszzbervrbdwj1.IconCompatParcelizer(), list2), 15));
        }
        return arrayList3;
    }

    public final List<r8lambdaUQHb7DT0BtnJovsZzbeRVrBdwJ0> serializer() {
        List<setDismissType.write> listWrite = this.RemoteActionCompatParcelizer.write();
        InAppMessageFull inAppMessageFull = InAppMessageFull.read();
        List list = Collections.EMPTY_LIST;
        setHeaderTextColor setheadertextcolor = this.write;
        List list2 = (List) setheadertextcolor.serializer(list, new getEnterEvents(setheadertextcolor, 2, inAppMessageFull));
        list2.getClass();
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
        Iterator it = list2.iterator();
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
        return read(listWrite, accessgetInstancedelegatecp.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<r8lambdaUQHb7DT0BtnJovsZzbeRVrBdwJ0> write(String str) {
        str.getClass();
        Pair<Long, Long> pairSerializer = this.read.serializer(str);
        Range range = (pairSerializer == null || pairSerializer.second == null) ? null : new Range((Comparable) pairSerializer.first, (Comparable) pairSerializer.second);
        List list = instance_delegatelambda0.write;
        if (range == null) {
            return list;
        }
        Long l = (Long) range.getLower();
        Long l2 = (Long) range.getUpper();
        parseLonglambda0 parselonglambda0 = this.IconCompatParcelizer;
        parselonglambda0.IconCompatParcelizer("Retrieving phone usage events for transport with ID: %s", str);
        l.getClass();
        long jLongValue = l.longValue();
        l2.getClass();
        List<setDismissType.write> listWrite = this.RemoteActionCompatParcelizer.write(jLongValue, l2.longValue());
        parselonglambda0.IconCompatParcelizer("Retrieved %d phone usage events for transport with ID: %s", Integer.valueOf(listWrite.size()), str);
        List listIconCompatParcelizer = this.write.IconCompatParcelizer(InAppMessageHtml.MediaBrowserCompatMediaItem(), str);
        listIconCompatParcelizer.getClass();
        handleLogClick handlelogclick = (handleLogClick) onContentCardDismissed.MediaMetadataCompat(listIconCompatParcelizer);
        List<handleLogClickdefault> listMediaSessionCompatResultReceiverWrapper = handlelogclick != null ? handlelogclick.MediaSessionCompatResultReceiverWrapper() : null;
        if (listMediaSessionCompatResultReceiverWrapper != null) {
            list = listMediaSessionCompatResultReceiverWrapper;
        }
        return read(listWrite, list);
    }
}
