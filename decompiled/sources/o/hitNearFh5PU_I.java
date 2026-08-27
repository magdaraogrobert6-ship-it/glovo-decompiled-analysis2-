package o;

import bo.app.hg$$ExternalSyntheticLambda5;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hitNearFh5PU_I {
    public String write() {
        if (this instanceof hasNodeH91voCI) {
            return onContentCardDismissed.IconCompatParcelizer(((hasNodeH91voCI) this).IconCompatParcelizer.IconCompatParcelizer(), HiAnalyticsConstant.REPORT_VAL_SEPARATOR, null, null, new hg$$ExternalSyntheticLambda5(12), 30);
        }
        if (!(this instanceof getSnapshotObserver)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        fromParentRect fromparentrect = ((getSnapshotObserver) this).serializer;
        String str = fromparentrect.write;
        long j = fromparentrect.serializer;
        setBefore setbefore = fromparentrect.IconCompatParcelizer;
        setBefore setbefore2 = fromparentrect.MediaBrowserCompatMediaItem;
        String str2 = fromparentrect.RemoteActionCompatParcelizer;
        if (str2 != null) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(fromparentrect.MediaSessionCompatQueueItem.write());
        if (str != null) {
            sb.append("|cg:");
            sb.append(str);
        }
        sb.append("|f:");
        Iterator it = fromparentrect.read.iterator();
        while (it.hasNext()) {
            sb.append(((fillVector) it.next()).serializer());
        }
        sb.append("|ob:");
        for (accessgetSnapshotObserver accessgetsnapshotobserver : fromparentrect.MediaMetadataCompat) {
            sb.append(accessgetsnapshotobserver.RemoteActionCompatParcelizer.write());
            sb.append(accessgetsnapshotobserver.write.equals(accessgetOnCommitAffectingLayercp.ASCENDING) ? "asc" : "desc");
        }
        if (j != -1) {
            sb.append("|l:");
            sb.append(j);
        }
        if (setbefore2 != null) {
            sb.append("|lb:");
            sb.append(setbefore2.RemoteActionCompatParcelizer ? "b:" : "a:");
            sb.append(setbefore2.RemoteActionCompatParcelizer());
        }
        if (setbefore != null) {
            sb.append("|ub:");
            sb.append(setbefore.RemoteActionCompatParcelizer ? "a:" : "b:");
            sb.append(setbefore.RemoteActionCompatParcelizer());
        }
        String string = sb.toString();
        fromparentrect.RemoteActionCompatParcelizer = string;
        return string;
    }

    public shareWithSiblings IconCompatParcelizer() {
        String[] strArr;
        if (this instanceof hasNodeH91voCI) {
            tailH91voCIui tailh91vociui = ((hasNodeH91voCI) this).IconCompatParcelizer;
            if (accessheadNode.RemoteActionCompatParcelizer(tailh91vociui) == accessgetSemanticsSourcecp.DOCUMENTS && (strArr = accessheadNode.read(tailh91vociui)) != null && strArr.length == 1) {
                return shareWithSiblings.IconCompatParcelizer(strArr[0]);
            }
        } else {
            if (!(this instanceof getSnapshotObserver)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            fromParentRect fromparentrect = ((getSnapshotObserver) this).serializer;
            if (fromparentrect.serializer()) {
                return fromparentrect.MediaSessionCompatQueueItem;
            }
        }
        return null;
    }
}
