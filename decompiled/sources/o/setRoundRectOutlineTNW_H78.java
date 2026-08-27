package o;

/* JADX INFO: loaded from: classes2.dex */
public enum setRoundRectOutlineTNW_H78 implements writeGlobalCallbackParametersI {
    CONTROL("Control"),
    TREATMENT_1("Variation1");

    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = coil3.util.UtilsKt.read((Enum[]) values());
    private final String variantName;

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        return $ENTRIES;
    }

    @Override // o.writeGlobalCallbackParametersI
    public String getVariantName() {
        return this.variantName;
    }

    setRoundRectOutlineTNW_H78(String str) {
        this.variantName = str;
    }
}
