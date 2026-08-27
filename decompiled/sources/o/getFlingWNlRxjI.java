package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getFlingWNlRxjI {
    public static final isAltPressedZmokQxo IconCompatParcelizer;
    public static final isAltPressedZmokQxo MediaMetadataCompat;
    public static final isAltPressedZmokQxo RemoteActionCompatParcelizer;
    public static final isAltPressedZmokQxo read;
    public static final isAltPressedZmokQxo serializer;
    public static final isAltPressedZmokQxo write;

    static {
        truncslo4al4 truncslo4al4Var = new truncslo4al4(getTypeZmokQxo.serializer(), true, true);
        write = truncslo4al4Var.serializer("measurement.test.boolean_flag", false);
        IconCompatParcelizer = truncslo4al4Var.IconCompatParcelizer(-1L, "measurement.test.cached_long_flag");
        Object obj = isAltPressedZmokQxo.RemoteActionCompatParcelizer;
        RemoteActionCompatParcelizer = new isAltPressedZmokQxo(truncslo4al4Var, "measurement.test.double_flag", Double.valueOf(-3.0d), 2);
        serializer = truncslo4al4Var.IconCompatParcelizer(-2L, "measurement.test.int_flag");
        read = truncslo4al4Var.IconCompatParcelizer(-1L, "measurement.test.long_flag");
        MediaMetadataCompat = truncslo4al4Var.serializer("measurement.test.string_flag", "---");
    }
}
