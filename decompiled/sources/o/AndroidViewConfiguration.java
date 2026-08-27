package o;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidViewConfiguration {
    public static int IconCompatParcelizer;
    public static int read;
    public final AbstractComposeViewExternalSyntheticLambda0 RemoteActionCompatParcelizer;

    public AndroidViewConfiguration(AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0) {
        this.RemoteActionCompatParcelizer = abstractComposeViewExternalSyntheticLambda0;
    }

    public static int serializer() {
        int i = IconCompatParcelizer;
        int i2 = i % 5618777;
        IconCompatParcelizer = i + 1;
        if (i2 != 0) {
            return read;
        }
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        read = iFreeMemory;
        return iFreeMemory;
    }
}
