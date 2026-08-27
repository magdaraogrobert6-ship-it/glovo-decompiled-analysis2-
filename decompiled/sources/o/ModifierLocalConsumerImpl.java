package o;

import com.google.api.BackendRule;

/* JADX INFO: loaded from: classes4.dex */
public final class ModifierLocalConsumerImpl implements decodeByte {
    public static final ModifierLocalConsumerImpl write = new ModifierLocalConsumerImpl();

    @Override // o.decodeByte
    public final boolean write(int i) {
        return BackendRule.IconCompatParcelizer.forNumber(i) != null;
    }
}
