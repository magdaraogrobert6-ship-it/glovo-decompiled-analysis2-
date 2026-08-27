package o;

import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 o.toDpSizekrfVVM, still in use, count: 1, list:
  (r0v0 o.toDpSizekrfVVM) from 0x0044: INVOKE 
  (wrap java.util.Map<java.lang.String, o.toDpSizekrfVVM>:0x0040: SGET  A[WRAPPED] (LINE:66) o.toDpSizekrfVVM.chainMap java.util.Map)
  ("spread")
  (r0v0 o.toDpSizekrfVVM)
 INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)] (LINE:71)
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
public final class toDpSizekrfVVM {
    SPREAD,
    SPREAD_INSIDE,
    PACKED;

    public static Map<String, toDpSizekrfVVM> chainMap = new HashMap();
    public static Map<String, Integer> valueMap = new HashMap();

    private toDpSizekrfVVM() {
        super(str, i);
    }

    public static toDpSizekrfVVM getChainByString(String str) {
        if (chainMap.containsKey(str)) {
            return chainMap.get(str);
        }
        return null;
    }

    public static int getValueByString(String str) {
        if (valueMap.containsKey(str)) {
            return valueMap.get(str).intValue();
        }
        return -1;
    }

    public static toDpSizekrfVVM valueOf(String str) {
        return (toDpSizekrfVVM) Enum.valueOf(toDpSizekrfVVM.class, str);
    }

    public static toDpSizekrfVVM[] values() {
        return (toDpSizekrfVVM[]) $VALUES.clone();
    }

    static {
        chainMap.put("packed", new toDpSizekrfVVM());
        chainMap.put("spread_inside", new toDpSizekrfVVM());
        chainMap.put("spread", new toDpSizekrfVVM());
        valueMap.put("packed", 2);
        valueMap.put("spread_inside", 1);
        valueMap.put("spread", 0);
    }
}
