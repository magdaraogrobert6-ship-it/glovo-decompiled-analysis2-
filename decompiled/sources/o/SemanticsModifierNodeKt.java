package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class SemanticsModifierNodeKt {
    public static final /* synthetic */ int[] IconCompatParcelizer;

    static {
        int[] iArr = new int[SemanticsModifierNode.values().length];
        IconCompatParcelizer = iArr;
        try {
            iArr[SemanticsModifierNode.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            IconCompatParcelizer[SemanticsModifierNode.RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            IconCompatParcelizer[SemanticsModifierNode.TOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            IconCompatParcelizer[SemanticsModifierNode.BOTTOM.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
