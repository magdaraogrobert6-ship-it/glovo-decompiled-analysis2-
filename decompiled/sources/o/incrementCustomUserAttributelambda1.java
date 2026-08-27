package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes4.dex */
public final class incrementCustomUserAttributelambda1 {
    public static final RequestBuilder IconCompatParcelizer;
    public static final RequestBuilder RemoteActionCompatParcelizer;
    public static final RequestBuilder read;
    public static final RequestBuilder serializer;
    public static final RequestBuilder write;
    public final RequestBuilder MediaBrowserCompatMediaItem;
    public final int MediaDescriptionCompat;
    public final RequestBuilder MediaSessionCompatQueueItem;

    public final int hashCode() {
        return this.MediaBrowserCompatMediaItem.hashCode() + ((this.MediaSessionCompatQueueItem.hashCode() + 527) * 31);
    }

    public final String toString() {
        return af$$ExternalSyntheticOutline0.m(this.MediaSessionCompatQueueItem.RatingCompat(), ": ", this.MediaBrowserCompatMediaItem.RatingCompat());
    }

    public incrementCustomUserAttributelambda1(RequestBuilder requestBuilder, RequestBuilder requestBuilder2) {
        this.MediaSessionCompatQueueItem = requestBuilder;
        this.MediaBrowserCompatMediaItem = requestBuilder2;
        this.MediaDescriptionCompat = requestBuilder2.serializer() + requestBuilder.serializer() + 32;
    }

    static {
        RequestBuilder requestBuilder = RequestBuilder.EMPTY;
        RemoteActionCompatParcelizer = ImageHeaderParserImageType.serializer(":status");
        write = ImageHeaderParserImageType.serializer(":method");
        serializer = ImageHeaderParserImageType.serializer(":path");
        IconCompatParcelizer = ImageHeaderParserImageType.serializer(":scheme");
        read = ImageHeaderParserImageType.serializer(":authority");
        ImageHeaderParserImageType.serializer(":host");
        ImageHeaderParserImageType.serializer(":version");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof incrementCustomUserAttributelambda1)) {
            return false;
        }
        incrementCustomUserAttributelambda1 incrementcustomuserattributelambda1 = (incrementCustomUserAttributelambda1) obj;
        return this.MediaSessionCompatQueueItem.equals(incrementcustomuserattributelambda1.MediaSessionCompatQueueItem) && this.MediaBrowserCompatMediaItem.equals(incrementcustomuserattributelambda1.MediaBrowserCompatMediaItem);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public incrementCustomUserAttributelambda1(RequestBuilder requestBuilder, String str) {
        this(requestBuilder, ImageHeaderParserImageType.serializer(str));
        RequestBuilder requestBuilder2 = RequestBuilder.EMPTY;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public incrementCustomUserAttributelambda1(String str, String str2) {
        this(ImageHeaderParserImageType.serializer(str), ImageHeaderParserImageType.serializer(str2));
        RequestBuilder requestBuilder = RequestBuilder.EMPTY;
    }
}
