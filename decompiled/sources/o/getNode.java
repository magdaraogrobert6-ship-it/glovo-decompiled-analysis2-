package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class getNode {
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[ModifierElement.values().length];
        try {
            iArr[ModifierElement.EditableText.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ModifierElement.StaticText.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        write = iArr;
    }
}
