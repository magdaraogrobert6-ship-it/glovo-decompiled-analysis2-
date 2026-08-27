package o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 o.isUpdatingui, still in use, count: 1, list:
  (r0v0 o.isUpdatingui) from 0x0024: SPUT (r0v0 o.isUpdatingui) (LINE:36) o.isUpdatingui.DEFAULT o.isUpdatingui
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
public final class isUpdatingui {
    NONE,
    ESTIMATE,
    PREVIOUS;

    static final isUpdatingui DEFAULT = new isUpdatingui();

    private isUpdatingui() {
        super(str, i);
    }

    public static isUpdatingui valueOf(String str) {
        return (isUpdatingui) Enum.valueOf(isUpdatingui.class, str);
    }

    public static isUpdatingui[] values() {
        return (isUpdatingui[]) $VALUES.clone();
    }

    static {
    }
}
