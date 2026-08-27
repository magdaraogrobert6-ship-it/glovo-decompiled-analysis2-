package o;

import com.google.protobuf.Field;

/* JADX INFO: loaded from: classes4.dex */
public final class CompositionLocalsKtLocalAutofillManager1 implements decodeByte {
    public static final CompositionLocalsKtLocalAutofillManager1 read = new CompositionLocalsKtLocalAutofillManager1();

    @Override // o.decodeByte
    public final boolean write(int i) {
        return Field.IconCompatParcelizer.forNumber(i) != null;
    }
}
