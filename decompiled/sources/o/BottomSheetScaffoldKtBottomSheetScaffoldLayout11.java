package o;

/* JADX INFO: loaded from: classes.dex */
public final class BottomSheetScaffoldKtBottomSheetScaffoldLayout11 {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public static final BottomSheetScaffoldKtBottomSheetScaffoldLayout11 write = new BottomSheetScaffoldKtBottomSheetScaffoldLayout11(1);
    public static final BottomSheetScaffoldKtBottomSheetScaffoldLayout11 read = new BottomSheetScaffoldKtBottomSheetScaffoldLayout11(0);

    public /* synthetic */ BottomSheetScaffoldKtBottomSheetScaffoldLayout11(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    public final int serializer(int i, int i2, int i3, int i4) {
        if (this.RemoteActionCompatParcelizer != 0) {
            return (((i - i3) - i4) / 2) - (i2 / 2);
        }
        return 0;
    }

    public final String toString() {
        return this.RemoteActionCompatParcelizer != 0 ? "Center" : "Start";
    }
}
