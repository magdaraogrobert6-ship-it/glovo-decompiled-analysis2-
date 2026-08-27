package o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 o.getBaselineShift5SSeXJ0, still in use, count: 1, list:
  (r0v0 o.getBaselineShift5SSeXJ0) from 0x002e: FILLED_NEW_ARRAY 
  (r1v1 o.getBaselineShift5SSeXJ0)
  (r0v0 o.getBaselineShift5SSeXJ0)
  (r3v2 o.getBaselineShift5SSeXJ0)
  (r2v1 o.getBaselineShift5SSeXJ0)
 A[WRAPPED] (LINE:46) elemType: o.getBaselineShift5SSeXJ0
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
public final class getBaselineShift5SSeXJ0 {
    L(1),
    M(0),
    Q(3),
    H(2);

    private static final getBaselineShift5SSeXJ0[] FOR_BITS;
    private final int bits;

    public int getBits() {
        return this.bits;
    }

    public static getBaselineShift5SSeXJ0 forBits(int i) {
        if (i >= 0) {
            getBaselineShift5SSeXJ0[] getbaselineshift5ssexj0Arr = FOR_BITS;
            if (i < getbaselineshift5ssexj0Arr.length) {
                return getbaselineshift5ssexj0Arr[i];
            }
        }
        DrawableTransformation.write();
        return null;
    }

    public static getBaselineShift5SSeXJ0 valueOf(String str) {
        return (getBaselineShift5SSeXJ0) Enum.valueOf(getBaselineShift5SSeXJ0.class, str);
    }

    public static getBaselineShift5SSeXJ0[] values() {
        return (getBaselineShift5SSeXJ0[]) $VALUES.clone();
    }

    private getBaselineShift5SSeXJ0(int i) {
        super(str, i);
        this.bits = i;
    }

    static {
        FOR_BITS = new getBaselineShift5SSeXJ0[]{getbaselineshift5ssexj0, new getBaselineShift5SSeXJ0(1), getbaselineshift5ssexj0, new getBaselineShift5SSeXJ0(3)};
    }
}
