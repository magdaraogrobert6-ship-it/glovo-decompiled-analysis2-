package o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getEllipsisgIe3tQ8 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int read = 0;
    private static int serializer = 1;
    public final /* synthetic */ getExtendedTouchPaddinghWWAJMo RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ getEllipsisgIe3tQ8(getExtendedTouchPaddinghWWAJMo getextendedtouchpaddinghwwajmo, int i) {
        this.write = i;
        this.RemoteActionCompatParcelizer = getextendedtouchpaddinghwwajmo;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getExtendedTouchPaddinghWWAJMo getextendedtouchpaddinghwwajmo = this.RemoteActionCompatParcelizer;
        boolean z = false;
        if (i2 == 0) {
            PrematureEndOfStreamVideoQuirk.write();
            Integer num = (Integer) getextendedtouchpaddinghwwajmo.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.IconCompatParcelizer();
            if (num != null && num.intValue() == 1) {
                z = true;
            }
            getextendedtouchpaddinghwwajmo.write(!z);
            int i3 = serializer + 11;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return createfromparcel;
        }
        PrematureEndOfStreamVideoQuirk.write();
        Integer num2 = (Integer) getextendedtouchpaddinghwwajmo.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.IconCompatParcelizer();
        if (num2 == null) {
            int i5 = read + 55;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        } else if (num2.intValue() == 1) {
            int i7 = serializer + 75;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            z = true;
        }
        getextendedtouchpaddinghwwajmo.write(!z);
        return createfromparcel;
    }
}
