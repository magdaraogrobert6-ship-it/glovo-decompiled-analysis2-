package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class getUnionb3I0S0c {
    public static final getIntersect serializer(GifDrawableTransformation gifDrawableTransformation, HttpUrlFetcher httpUrlFetcher, PathOperationKt pathOperationKt) {
        return new getIntersect(gifDrawableTransformation, httpUrlFetcher, pathOperationKt);
    }

    public static getXorb3I0S0c RemoteActionCompatParcelizer(RecyclableBufferedInputStream recyclableBufferedInputStream, HttpUrlFetcher httpUrlFetcher, String str, getPoints getpoints, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            getpoints = null;
        }
        return new getXorb3I0S0c(recyclableBufferedInputStream, httpUrlFetcher, str, getpoints);
    }
}
