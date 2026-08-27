package o;

/* JADX INFO: loaded from: classes4.dex */
public final class Custom {
    public final String IconCompatParcelizer;
    public final int serializer;
    public static final Custom write = new Custom("bike128", 12323);
    public static final Custom read = new Custom("bike192", 24659);
    public static final Custom RemoteActionCompatParcelizer = new Custom("bike256", 40973);

    public Custom(String str, int i) {
        this.IconCompatParcelizer = str;
        this.serializer = i;
        new io.sentry.hints.MediaSessionCompatQueueItem(i);
    }
}
