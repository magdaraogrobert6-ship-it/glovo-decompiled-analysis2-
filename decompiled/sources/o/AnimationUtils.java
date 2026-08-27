package o;

/* JADX INFO: loaded from: classes4.dex */
public final class AnimationUtils {
    public static final RequestBuilder PSEUDO_PREFIX;
    public static final RequestBuilder RESPONSE_STATUS;
    public static final RequestBuilder TARGET_AUTHORITY;
    public static final RequestBuilder TARGET_METHOD;
    public static final RequestBuilder TARGET_PATH;
    public static final RequestBuilder TARGET_SCHEME;
    public final int hpackSize;
    public final RequestBuilder name;
    public final RequestBuilder value;

    public final int hashCode() {
        return this.value.hashCode() + (this.name.hashCode() * 31);
    }

    public final String toString() {
        return this.name.RatingCompat() + ": " + this.value.RatingCompat();
    }

    public AnimationUtils(RequestBuilder requestBuilder, RequestBuilder requestBuilder2) {
        requestBuilder.getClass();
        requestBuilder2.getClass();
        this.name = requestBuilder;
        this.value = requestBuilder2;
        this.hpackSize = requestBuilder2.serializer() + requestBuilder.serializer() + 32;
    }

    static {
        RequestBuilder requestBuilder = RequestBuilder.EMPTY;
        PSEUDO_PREFIX = ImageHeaderParserImageType.serializer(":");
        RESPONSE_STATUS = ImageHeaderParserImageType.serializer(":status");
        TARGET_METHOD = ImageHeaderParserImageType.serializer(":method");
        TARGET_PATH = ImageHeaderParserImageType.serializer(":path");
        TARGET_SCHEME = ImageHeaderParserImageType.serializer(":scheme");
        TARGET_AUTHORITY = ImageHeaderParserImageType.serializer(":authority");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnimationUtils)) {
            return false;
        }
        AnimationUtils animationUtils = (AnimationUtils) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, animationUtils.name}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.value, animationUtils.value}, getCieXyz.write())).booleanValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimationUtils(String str, String str2) {
        this(ImageHeaderParserImageType.serializer(str), ImageHeaderParserImageType.serializer(str2));
        RequestBuilder requestBuilder = RequestBuilder.EMPTY;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimationUtils(RequestBuilder requestBuilder, String str) {
        this(requestBuilder, ImageHeaderParserImageType.serializer(str));
        requestBuilder.getClass();
        str.getClass();
        RequestBuilder requestBuilder2 = RequestBuilder.EMPTY;
    }
}
