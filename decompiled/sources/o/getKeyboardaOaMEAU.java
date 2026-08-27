package o;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class getKeyboardaOaMEAU implements getOutlineProvider {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ accessgetKeyboardcp write;

    public /* synthetic */ getKeyboardaOaMEAU(accessgetKeyboardcp accessgetkeyboardcp, int i) {
        this.serializer = i;
        this.write = accessgetkeyboardcp;
    }

    @Override // o.getOutlineProvider, com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 57;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i3 = this.serializer;
        accessgetKeyboardcp accessgetkeyboardcp = this.write;
        if (i3 == 0) {
            accessgetkeyboardcp.write.cancel();
            return;
        }
        accessgetkeyboardcp.write.cancel();
        int i4 = RemoteActionCompatParcelizer + 13;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }
}
