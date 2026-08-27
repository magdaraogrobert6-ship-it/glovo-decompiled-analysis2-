package o;

import com.google.firebase.sessions.SessionData$Companion;
import java.util.Map;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class AndroidComposeViewlocaleList2 {
    public final r8lambdaqAcahJELYuNmmyjvdiPCGfmxzQ backgroundTime;
    public final Map processDataMap;
    public final AndroidComposeViewpointerIconService1 sessionDetails;
    public static final SessionData$Companion Companion = new SessionData$Companion();
    public static final setGraphicModalMaxWidthDp[] $childSerializers = {null, null, new beforeOpened(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, AndroidComposeViewfocusSearchsearchResult1.serializer)};

    public final int hashCode() {
        int iHashCode = this.sessionDetails.hashCode();
        r8lambdaqAcahJELYuNmmyjvdiPCGfmxzQ r8lambdaqacahjelyunmmyjvdipcgfmxzq = this.backgroundTime;
        int iHashCode2 = r8lambdaqacahjelyunmmyjvdipcgfmxzq == null ? 0 : Long.hashCode(r8lambdaqacahjelyunmmyjvdipcgfmxzq.ms);
        Map map = this.processDataMap;
        return (((iHashCode * 31) + iHashCode2) * 31) + (map != null ? map.hashCode() : 0);
    }

    public static AndroidComposeViewlocaleList2 write(AndroidComposeViewlocaleList2 androidComposeViewlocaleList2, AndroidComposeViewpointerIconService1 androidComposeViewpointerIconService1, r8lambdaqAcahJELYuNmmyjvdiPCGfmxzQ r8lambdaqacahjelyunmmyjvdipcgfmxzq, Map map, int i) {
        if ((i & 1) != 0) {
            androidComposeViewpointerIconService1 = androidComposeViewlocaleList2.sessionDetails;
        }
        if ((i & 2) != 0) {
            r8lambdaqacahjelyunmmyjvdipcgfmxzq = androidComposeViewlocaleList2.backgroundTime;
        }
        if ((i & 4) != 0) {
            map = androidComposeViewlocaleList2.processDataMap;
        }
        androidComposeViewlocaleList2.getClass();
        androidComposeViewpointerIconService1.getClass();
        return new AndroidComposeViewlocaleList2(androidComposeViewpointerIconService1, r8lambdaqacahjelyunmmyjvdipcgfmxzq, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidComposeViewlocaleList2)) {
            return false;
        }
        AndroidComposeViewlocaleList2 androidComposeViewlocaleList2 = (AndroidComposeViewlocaleList2) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.sessionDetails, androidComposeViewlocaleList2.sessionDetails}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.backgroundTime, androidComposeViewlocaleList2.backgroundTime}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.processDataMap, androidComposeViewlocaleList2.processDataMap}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionData(sessionDetails=");
        sb.append(this.sessionDetails);
        sb.append(", backgroundTime=");
        sb.append(this.backgroundTime);
        sb.append(", processDataMap=");
        return r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(sb, this.processDataMap, ')');
    }

    public /* synthetic */ AndroidComposeViewlocaleList2(int i, AndroidComposeViewpointerIconService1 androidComposeViewpointerIconService1, r8lambdaqAcahJELYuNmmyjvdiPCGfmxzQ r8lambdaqacahjelyunmmyjvdipcgfmxzq, Map map) {
        if (1 == (i & 1)) {
            this.sessionDetails = androidComposeViewpointerIconService1;
            if ((i & 2) == 0) {
                this.backgroundTime = null;
            } else {
                this.backgroundTime = r8lambdaqacahjelyunmmyjvdipcgfmxzq;
            }
            if ((i & 4) == 0) {
                this.processDataMap = null;
                return;
            } else {
                this.processDataMap = map;
                return;
            }
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, AndroidComposeViewonAttachedToWindow1.read.getDescriptor());
        throw null;
    }

    public AndroidComposeViewlocaleList2(AndroidComposeViewpointerIconService1 androidComposeViewpointerIconService1, r8lambdaqAcahJELYuNmmyjvdiPCGfmxzQ r8lambdaqacahjelyunmmyjvdipcgfmxzq, Map map) {
        androidComposeViewpointerIconService1.getClass();
        this.sessionDetails = androidComposeViewpointerIconService1;
        this.backgroundTime = r8lambdaqacahjelyunmmyjvdipcgfmxzq;
        this.processDataMap = map;
    }
}
