package bo.app;

import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.LinkedHashMap;
import kotlin.enums.EnumEntriesList;
import o.accessgetInstancedelegatecp;
import o.onMove;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 bo.app.k9[], still in use, count: 1, list:
  (r0v1 bo.app.k9[]) from 0x009c: CONSTRUCTOR (r1v2 kotlin.enums.EnumEntriesList) = (r0v1 bo.app.k9[]) A[MD:(java.lang.Enum[]):void (m)] (LINE:157) call: kotlin.enums.EnumEntriesList.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class k9 {
    CONTENT_CARD_SYNC("content_cards/sync"),
    FEATURE_FLAG_SYNC("feature_flags/sync"),
    V3_DATA(RemoteMessageConst.DATA),
    TEMPLATE_REQUEST("template"),
    PUSH_DELIVERY_EVENTS("push/delivery_events"),
    GEOFENCE_REFRESH("geofence/request"),
    GEOFENCE_REPORT("geofence/report"),
    PUSH_REDELIVER("push/redeliver"),
    BANNERS_SYNC("banners/sync"),
    SDK_DEBUGGER_INIT("debugger/init"),
    SDK_DEBUGGER_LOG("debugger/log"),
    DUST_CONFIG("dust/config");

    public static final j9 b;
    public static final LinkedHashMap c;
    public final String a;

    public static k9 valueOf(String str) {
        return (k9) Enum.valueOf(k9.class, str);
    }

    public static k9[] values() {
        return (k9[]) p.clone();
    }

    public k9(String str) {
        super(str, i);
        this.a = str;
    }

    static {
        EnumEntriesList enumEntriesList = new EnumEntriesList(k9VarArr);
        b = new j9();
        int iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(enumEntriesList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer < 16 ? 16 : iRemoteActionCompatParcelizer);
        for (Object obj : enumEntriesList) {
            linkedHashMap.put(((k9) obj).a, obj);
        }
        c = linkedHashMap;
    }
}
