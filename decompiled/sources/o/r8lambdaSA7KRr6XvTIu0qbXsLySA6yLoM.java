package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class r8lambdaSA7KRr6XvTIu0qbXsLySA6yLoM {
    public static final r8lambdaIfMtEZSBetxsfitHFCf7ry2CR4 Companion = new r8lambdaIfMtEZSBetxsfitHFCf7ry2CR4();
    public static final setGraphicModalMaxWidthDp[] d;
    public final Map a;
    public final Map b;
    public final Map c;

    static {
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        beforeOpened beforeopened = new beforeOpened(beforeinappmessageviewclosed, r8lambdaUifwJT5DPVd3p01R7jJ_bUXcVg.write);
        afterClosed afterclosed = afterClosed.IconCompatParcelizer;
        d = new setGraphicModalMaxWidthDp[]{beforeopened, new beforeOpened(beforeinappmessageviewclosed, afterclosed), new beforeOpened(beforeinappmessageviewclosed, afterclosed)};
    }

    public final int hashCode() {
        return this.c.hashCode() + IconCompatParcelizer.RemoteActionCompatParcelizer(this.a.hashCode() * 31, this.b, 31);
    }

    public final Map write() {
        Map map = this.a;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(((r8lambdab0ISQPsb2J3NkxPxCM79mDdZDtM) ((Map.Entry) it.next()).getValue()).b);
        }
        List listPlaybackStateCompatCustomAction = onContentCardDismissed.PlaybackStateCompatCustomAction(onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(arrayList));
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(listPlaybackStateCompatCustomAction, 10));
        int i = 0;
        for (Object obj : listPlaybackStateCompatCustomAction) {
            if (i < 0) {
                androidx.sqlite.SQLite.serializer();
                throw null;
            }
            arrayList2.add(new onViewAttachedToWindowlambda0((String) obj, Integer.valueOf(i)));
            i++;
        }
        return onMove.serializer(arrayList2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambdaSA7KRr6XvTIu0qbXsLySA6yLoM)) {
            return false;
        }
        r8lambdaSA7KRr6XvTIu0qbXsLySA6yLoM r8lambdasa7krr6xvtiu0qbxslysa6ylom = (r8lambdaSA7KRr6XvTIu0qbXsLySA6yLoM) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.a, r8lambdasa7krr6xvtiu0qbxslysa6ylom.a}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.b, r8lambdasa7krr6xvtiu0qbxslysa6ylom.b}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.c, r8lambdasa7krr6xvtiu0qbxslysa6ylom.c}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mappings(osmTypeMappings=");
        sb.append(this.a);
        sb.append(", todModels=");
        sb.append(this.b);
        sb.append(", durationModels=");
        return r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(sb, this.c, ')');
    }

    public r8lambdaSA7KRr6XvTIu0qbXsLySA6yLoM(Map map, Map map2, Map map3) {
        map.getClass();
        map2.getClass();
        map3.getClass();
        this.a = map;
        this.b = map2;
        this.c = map3;
    }
}
