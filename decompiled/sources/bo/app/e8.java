package bo.app;

import com.braze.Constants;
import com.braze.models.IPutIntoJson;
import com.braze.models.inappmessage.InAppMessageBase;
import java.util.LinkedHashMap;
import kotlin.enums.EnumEntriesList;
import o.accessgetInstancedelegatecp;
import o.onMove;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v26 bo.app.e8[], still in use, count: 1, list:
  (r0v26 bo.app.e8[]) from 0x0218: CONSTRUCTOR (r1v27 kotlin.enums.EnumEntriesList) = (r0v26 bo.app.e8[]) A[MD:(java.lang.Enum[]):void (m)] (LINE:573) call: kotlin.enums.EnumEntriesList.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class e8 implements IPutIntoJson {
    LOCATION_RECORDED("lr"),
    CUSTOM_EVENT("ce"),
    PURCHASE(Constants.BRAZE_PUSH_PRIORITY_KEY),
    PUSH_STORY_PAGE_CLICK("cic"),
    PUSH_CLICKED("pc"),
    PUSH_ACTION_BUTTON_CLICKED("ca"),
    /* JADX INFO: Fake field, exist only in values array */
    INTERNAL("i"),
    INTERNAL_ERROR("ie"),
    GEOFENCE("g"),
    CONTENT_CARDS_CLICK("ccc"),
    CONTENT_CARDS_IMPRESSION("cci"),
    CONTENT_CARDS_CONTROL_IMPRESSION("ccic"),
    CONTENT_CARDS_DISMISS("ccd"),
    INCREMENT("inc"),
    ADD_TO_CUSTOM_ATTRIBUTE_ARRAY("add"),
    REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY("rem"),
    SET_CUSTOM_ATTRIBUTE_ARRAY("set"),
    INAPP_MESSAGE_IMPRESSION("si"),
    INAPP_MESSAGE_CONTROL_IMPRESSION("iec"),
    INAPP_MESSAGE_CLICK("sc"),
    INAPP_MESSAGE_BUTTON_CLICK("sbc"),
    /* JADX INFO: Fake field, exist only in values array */
    TEST_TYPE(InAppMessageBase.MESSAGE_EXTRAS),
    USER_ALIAS("uae"),
    SESSION_START("ss"),
    SESSION_END("se"),
    /* JADX INFO: Fake field, exist only in values array */
    TEST_TYPE("tt"),
    LOCATION_CUSTOM_ATTRIBUTE_ADD("lcaa"),
    LOCATION_CUSTOM_ATTRIBUTE_REMOVE("lcar"),
    NESTED_CUSTOM_ATTRIBUTE_MERGE("ncam"),
    SUBSCRIPTION_GROUP_UPDATE("sgu"),
    FEATURE_FLAG_IMPRESSION_EVENT("ffi"),
    BANNER_IMPRESSION_EVENT("bi"),
    BANNER_CLICK_EVENT("bc"),
    BANNER_DISMISS_EVENT("bd"),
    PUSH_DELIVERY_EVENT("pde"),
    UNKNOWN("");

    public static final d8 b;
    public static final LinkedHashMap c;
    public final String a;

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() {
        return this.a;
    }

    public static e8 valueOf(String str) {
        return (e8) Enum.valueOf(e8.class, str);
    }

    public static e8[] values() {
        return (e8[]) K.clone();
    }

    public e8(String str) {
        super(str, i);
        this.a = str;
    }

    static {
        EnumEntriesList enumEntriesList = new EnumEntriesList(e8VarArr);
        b = new d8();
        int iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(enumEntriesList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer < 16 ? 16 : iRemoteActionCompatParcelizer);
        for (Object obj : enumEntriesList) {
            linkedHashMap.put(((e8) obj).a, obj);
        }
        c = linkedHashMap;
    }
}
