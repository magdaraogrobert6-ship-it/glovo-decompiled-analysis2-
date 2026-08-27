package o;

import android.text.Editable;

/* JADX INFO: loaded from: classes4.dex */
public final class isSpecifiedk4lQ0M extends Editable.Factory {
    public static final Object RemoteActionCompatParcelizer = new Object();
    public static Class serializer;
    public static volatile isSpecifiedk4lQ0M write;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = serializer;
        return cls != null ? new remtuRUvjQ(cls, charSequence) : super.newEditable(charSequence);
    }
}
