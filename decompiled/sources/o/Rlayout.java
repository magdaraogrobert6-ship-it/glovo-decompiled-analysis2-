package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Rlayout {
    public static final incrementCustomUserAttributelambda1 IconCompatParcelizer;
    public static final incrementCustomUserAttributelambda1 MediaBrowserCompatMediaItem;
    public static final incrementCustomUserAttributelambda1 RemoteActionCompatParcelizer;
    public static final incrementCustomUserAttributelambda1 read;
    public static final incrementCustomUserAttributelambda1 serializer;
    public static final incrementCustomUserAttributelambda1 write;

    static {
        RequestBuilder requestBuilder = incrementCustomUserAttributelambda1.IconCompatParcelizer;
        IconCompatParcelizer = new incrementCustomUserAttributelambda1(requestBuilder, com.adjust.sdk.Constants.SCHEME);
        read = new incrementCustomUserAttributelambda1(requestBuilder, "http");
        RequestBuilder requestBuilder2 = incrementCustomUserAttributelambda1.write;
        write = new incrementCustomUserAttributelambda1(requestBuilder2, "POST");
        RemoteActionCompatParcelizer = new incrementCustomUserAttributelambda1(requestBuilder2, "GET");
        serializer = new incrementCustomUserAttributelambda1(r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer, "application/grpc");
        MediaBrowserCompatMediaItem = new incrementCustomUserAttributelambda1("te", "trailers");
    }
}
