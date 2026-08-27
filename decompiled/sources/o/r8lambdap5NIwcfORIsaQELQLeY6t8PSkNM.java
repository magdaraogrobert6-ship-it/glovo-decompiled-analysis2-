package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambdap5NIwcfORIsaQELQLeY6t8PSkNM {
    public static final /* synthetic */ int IconCompatParcelizer = 0;

    public static final boolean IconCompatParcelizer(_get_messageWebView_lambda1 _get_messagewebview_lambda1) {
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{_get_messagewebview_lambda1.request.method, "HEAD"}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        int i = _get_messagewebview_lambda1.code;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && setWebViewContent.read(_get_messagewebview_lambda1) == -1 && !"chunked".equalsIgnoreCase(_get_messageWebView_lambda1.RemoteActionCompatParcelizer(_get_messagewebview_lambda1, "Transfer-Encoding"))) ? false : true;
    }

    static {
        RequestBuilder requestBuilder = RequestBuilder.EMPTY;
        ImageHeaderParserImageType.serializer("\"\\");
        ImageHeaderParserImageType.serializer("\t ,=");
    }
}
