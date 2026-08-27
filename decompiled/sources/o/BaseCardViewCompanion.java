package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseCardViewCompanion {
    public static final byte[] RemoteActionCompatParcelizer;

    static {
        RequestBuilder requestBuilder = RequestBuilder.EMPTY;
        RemoteActionCompatParcelizer = ImageHeaderParserImageType.serializer("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").data;
        ImageHeaderParserImageType.serializer("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
    }
}
