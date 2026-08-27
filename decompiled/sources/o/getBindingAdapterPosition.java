package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getBindingAdapterPosition implements clearReturnedFromScrapFlag {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public static final getBindingAdapterPosition read = new getBindingAdapterPosition();
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = RemoteActionCompatParcelizer + 27;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.clearReturnedFromScrapFlag
    public final flagRemovedAndOffsetPosition serializer(String str) {
        int i = 2 % 2;
        str.getClass();
        flagRemovedAndOffsetPosition flagremovedandoffsetposition = new flagRemovedAndOffsetPosition(!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str), "");
        int i2 = write + 59;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return flagremovedandoffsetposition;
    }
}
