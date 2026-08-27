package o;

import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes3.dex */
public final class i7 implements Expected.Transformer {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ i0 IconCompatParcelizer;
    public final /* synthetic */ i0 serializer;

    public i7(i0 i0Var, i0 i0Var2) {
        this.IconCompatParcelizer = i0Var;
        this.serializer = i0Var2;
    }

    @Override // com.mapbox.bindgen.Expected.Transformer
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = read + 23;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ((getSetTextSubstitution) obj).getClass();
        this.IconCompatParcelizer.serializer = false;
        this.serializer.RemoteActionCompatParcelizer.serializer.IconCompatParcelizer(Boolean.FALSE);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = RemoteActionCompatParcelizer + 125;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return createfromparcel;
        }
        throw null;
    }
}
