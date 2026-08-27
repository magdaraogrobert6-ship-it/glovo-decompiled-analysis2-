package o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 o._init_lambda0, still in use, count: 1, list:
  (r0v0 o._init_lambda0) from 0x001a: SPUT (r0v0 o._init_lambda0) (LINE:26) o._init_lambda0.DEFAULT o._init_lambda0
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
public final class _init_lambda0 {
    PREFER_ARGB_8888,
    PREFER_RGB_565;

    public static final _init_lambda0 DEFAULT = new _init_lambda0();

    private _init_lambda0() {
        super(str, i);
    }

    public static _init_lambda0 valueOf(String str) {
        return (_init_lambda0) Enum.valueOf(_init_lambda0.class, str);
    }

    public static _init_lambda0[] values() {
        return (_init_lambda0[]) $VALUES.clone();
    }

    static {
    }
}
