package o;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 o.accessgetLayoutNode, still in use, count: 1, list:
  (r0v0 o.accessgetLayoutNode) from 0x0084: INVOKE (r5v5 java.util.HashMap), ("x86"), (r0v0 o.accessgetLayoutNode) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)] (LINE:133)
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
/* JADX INFO: loaded from: classes2.dex */
public final class accessgetLayoutNode {
    X86_32,
    X86_64,
    ARM_UNKNOWN,
    PPC,
    PPC64,
    ARMV6,
    ARMV7,
    UNKNOWN,
    ARMV7S,
    ARM64;

    private static final Map<String, accessgetLayoutNode> matcher;

    private accessgetLayoutNode() {
        super(str, i);
    }

    public static accessgetLayoutNode getValue() {
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str)) {
            Log.isLoggable("FirebaseCrashlytics", 2);
            return UNKNOWN;
        }
        accessgetLayoutNode accessgetlayoutnode = matcher.get(str.toLowerCase(java.util.Locale.US));
        return accessgetlayoutnode == null ? UNKNOWN : accessgetlayoutnode;
    }

    public static accessgetLayoutNode valueOf(String str) {
        return (accessgetLayoutNode) Enum.valueOf(accessgetLayoutNode.class, str);
    }

    public static accessgetLayoutNode[] values() {
        return (accessgetLayoutNode[]) $VALUES.clone();
    }

    static {
        HashMap map = new HashMap(4);
        matcher = map;
        map.put("armeabi-v7a", new accessgetLayoutNode());
        map.put("armeabi", new accessgetLayoutNode());
        map.put("arm64-v8a", new accessgetLayoutNode());
        map.put("x86", new accessgetLayoutNode());
    }
}
