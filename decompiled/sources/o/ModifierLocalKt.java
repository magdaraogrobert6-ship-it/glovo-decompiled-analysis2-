package o;

/* JADX INFO: loaded from: classes4.dex */
public final class ModifierLocalKt implements decodeByte {
    public static final ModifierLocalKt IconCompatParcelizer = new ModifierLocalKt(0);
    public static final ModifierLocalKt write = new ModifierLocalKt(1);
    public final /* synthetic */ int serializer;

    public /* synthetic */ ModifierLocalKt(int i) {
        this.serializer = i;
    }

    @Override // o.decodeByte
    public final boolean write(int i) {
        if (this.serializer != 0) {
            return setUsedByModifierLayoutui.forNumber(i) != null;
        }
        return insertedProvider.forNumber(i) != null;
    }
}
