package o;

/* JADX INFO: loaded from: classes4.dex */
public final class InAppMessageJavascriptInterface extends onButtonClicked {
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InAppMessageJavascriptInterface(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
        super(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        this.write = i;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final String serializer() {
        return this.write != 0 ? "kotlin.collections.HashSet" : "kotlin.Array";
    }
}
