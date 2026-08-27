package o;

import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 o.toSizeXkaWNTQ, still in use, count: 1, list:
  (r0v0 o.toSizeXkaWNTQ) from 0x0036: INVOKE 
  (wrap java.util.Map<java.lang.String, o.toSizeXkaWNTQ>:0x0032: SGET  A[WRAPPED] (LINE:50) o.toSizeXkaWNTQ.wrapMap java.util.Map)
  ("none")
  (r0v0 o.toSizeXkaWNTQ)
 INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)] (LINE:55)
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
public final class toSizeXkaWNTQ {
    NONE,
    CHAIN,
    ALIGNED;

    public static Map<String, toSizeXkaWNTQ> wrapMap = new HashMap();
    public static Map<String, Integer> valueMap = new HashMap();

    private toSizeXkaWNTQ() {
        super(str, i);
    }

    public static toSizeXkaWNTQ getChainByString(String str) {
        if (wrapMap.containsKey(str)) {
            return wrapMap.get(str);
        }
        return null;
    }

    public static int getValueByString(String str) {
        if (valueMap.containsKey(str)) {
            return valueMap.get(str).intValue();
        }
        return -1;
    }

    public static toSizeXkaWNTQ valueOf(String str) {
        return (toSizeXkaWNTQ) Enum.valueOf(toSizeXkaWNTQ.class, str);
    }

    public static toSizeXkaWNTQ[] values() {
        return (toSizeXkaWNTQ[]) $VALUES.clone();
    }

    static {
        wrapMap.put("none", new toSizeXkaWNTQ());
        wrapMap.put("chain", new toSizeXkaWNTQ());
        wrapMap.put("aligned", new toSizeXkaWNTQ());
        valueMap.put("none", 0);
        valueMap.put("chain", 3);
        valueMap.put("aligned", 2);
    }
}
