package o;

import com.huawei.location.nlp.scan.FB;
import com.roadrunner.delivery.accept.laststop.data.RecentLastStopsDatastoreImpl;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class getLayoutannotations {
    private static int read = 0;
    private static int serializer = 1;
    public final RecentLastStopsDatastoreImpl IconCompatParcelizer;
    public final Clock write;

    public getLayoutannotations(RecentLastStopsDatastoreImpl recentLastStopsDatastoreImpl, isOpenInternalroom_runtime isopeninternalroom_runtime, getLineForVerticalUnbounded getlineforverticalunbounded, Clock clock) {
        this.IconCompatParcelizer = recentLastStopsDatastoreImpl;
        this.write = clock;
    }

    public static List read(List list) {
        Object next;
        int i = 2 % 2;
        int i2 = read + 83;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            list.isEmpty();
            throw null;
        }
        if (list.isEmpty()) {
            return instance_delegatelambda0.write;
        }
        List listSerializer = onContentCardDismissed.serializer(list, new FB(21));
        List list2 = listSerializer;
        Iterator it = list2.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int i3 = ((drawARGB) next).hitCount;
                do {
                    Object next2 = it.next();
                    int i4 = ((drawARGB) next2).hitCount;
                    if (i3 < i4) {
                        int i5 = read + 55;
                        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i5 % 2 == 0) {
                            int i6 = 2 / 5;
                        }
                        next = next2;
                        i3 = i4;
                    }
                } while (it.hasNext());
            }
        } else {
            int i7 = serializer + 125;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            next = null;
        }
        drawARGB drawargb = (drawARGB) next;
        if (drawargb == null) {
            int i9 = serializer + 75;
            read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                return listSerializer;
            }
            obj.hashCode();
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list2) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(drawARGB) obj2, drawargb}, getCieXyz.write())).booleanValue()) {
                arrayList.add(obj2);
            }
        }
        int iSerializer = getQueryParameterslambda2.serializer();
        return onContentCardDismissed.IconCompatParcelizer(arrayList, (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{drawargb}, getQueryParameterslambda2.serializer(), -516583649, iSerializer));
    }
}
