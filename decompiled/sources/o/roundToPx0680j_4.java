package o;

/* JADX INFO: loaded from: classes.dex */
public final class roundToPx0680j_4 implements DropShadowScopeDefaultImpls {
    public float IconCompatParcelizer;
    public float RemoteActionCompatParcelizer;
    public String read;
    public boolean serializer;
    public String write;

    @Override // o.DropShadowScopeDefaultImpls
    public final float serializer() {
        float f = this.IconCompatParcelizer;
        if (f >= this.RemoteActionCompatParcelizer) {
            this.serializer = true;
        }
        if (!this.serializer) {
            this.IconCompatParcelizer = f + 1.0f;
        }
        return this.IconCompatParcelizer;
    }
}
