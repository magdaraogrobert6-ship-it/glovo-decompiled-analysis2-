package com.qualtrics.digital;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.huawei.riemann.location.common.utils.Constant;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import o.DrawableTransformation;
import o.GifDrawableTransformation;
import o.InAppMessageHtmlBaseView;
import o.InAppMessageModalView;
import o._get_messageWebView_lambda1;
import o._get_messageWebView_lambda3;
import o._get_messageWebView_lambda4;
import o.applyDisplayCutoutMarginsToContentArealambda0;
import o.getInAppMessageEventMap;
import o.getMessageHeaderTextView;
import o.getMessageWebView;
import o.getShortEdge;
import o.r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc;
import o.r8lambday113fDFTSR5e4PZj6XsSXLtpL60;
import o.resetMessageMarginslambda00;
import okhttp3.RequestBody;
import okio.Okio;

/* JADX INFO: loaded from: classes4.dex */
public class RequestInterceptor implements getShortEdge {
    public static final String CONTENT_LENGTH = "content-length";
    public static final String CONTENT_TYPE = "content-type";
    public static final String LOG_TAG = "Qualtrics";

    private _get_messageWebView_lambda1 createOkhttpResponse(r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60, WebResourceResponse webResourceResponse) {
        r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc r8lambdacwme7obcpvw4lrr1hr7xiufmyc = r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc.HTTP_2;
        _get_messageWebView_lambda4 _get_messagewebview_lambda4 = _get_messageWebView_lambda3.EMPTY;
        applyDisplayCutoutMarginsToContentArealambda0 applydisplaycutoutmarginstocontentarealambda0 = new applyDisplayCutoutMarginsToContentArealambda0((byte) 0, 0);
        r8lambday113fdftsr5e4pzj6xssxltpl60.getClass();
        r8lambdacwme7obcpvw4lrr1hr7xiufmyc.getClass();
        String reasonPhrase = webResourceResponse.getReasonPhrase();
        reasonPhrase.getClass();
        int statusCode = webResourceResponse.getStatusCode();
        for (Map.Entry<String, String> entry : webResourceResponse.getResponseHeaders().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            key.getClass();
            value.getClass();
            applydisplaycutoutmarginstocontentarealambda0.write(key, value);
        }
        _get_messageWebView_lambda3 _get_messagewebview_lambda3CreateOkResponseBody = createOkResponseBody(webResourceResponse);
        _get_messagewebview_lambda3CreateOkResponseBody.getClass();
        if (statusCode >= 0) {
            return new _get_messageWebView_lambda1(r8lambday113fdftsr5e4pzj6xssxltpl60, r8lambdacwme7obcpvw4lrr1hr7xiufmyc, reasonPhrase, statusCode, null, applydisplaycutoutmarginstocontentarealambda0.read(), _get_messagewebview_lambda3CreateOkResponseBody, null, null, null, 0L, 0L, null, getMessageWebView.EMPTY);
        }
        DrawableTransformation.read((Object) c8$$ExternalSyntheticOutline0.m(statusCode, "code < 0: "));
        return null;
    }

    private WebResourceRequest createWebResourceRequest(final r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60) {
        return new WebResourceRequest() { // from class: com.qualtrics.digital.RequestInterceptor.1
            @Override // android.webkit.WebResourceRequest
            public boolean hasGesture() {
                return false;
            }

            @Override // android.webkit.WebResourceRequest
            public boolean isForMainFrame() {
                return false;
            }

            @Override // android.webkit.WebResourceRequest
            public boolean isRedirect() {
                return false;
            }

            @Override // android.webkit.WebResourceRequest
            public String getMethod() {
                return r8lambday113fdftsr5e4pzj6xssxltpl60.method;
            }

            @Override // android.webkit.WebResourceRequest
            public Map<String, String> getRequestHeaders() {
                HashMap map = new HashMap();
                for (String str : r8lambday113fdftsr5e4pzj6xssxltpl60.headers.write()) {
                    r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl61 = r8lambday113fdftsr5e4pzj6xssxltpl60;
                    r8lambday113fdftsr5e4pzj6xssxltpl61.getClass();
                    str.getClass();
                    map.put(str, r8lambday113fdftsr5e4pzj6xssxltpl61.headers.write(str));
                }
                if (r8lambday113fdftsr5e4pzj6xssxltpl60.body != null && !map.containsKey("content-type") && r8lambday113fdftsr5e4pzj6xssxltpl60.body.contentType() != null) {
                    map.put("content-type", r8lambday113fdftsr5e4pzj6xssxltpl60.body.contentType().mediaType);
                }
                return map;
            }

            @Override // android.webkit.WebResourceRequest
            public Uri getUrl() {
                return Uri.parse(r8lambday113fdftsr5e4pzj6xssxltpl60.url.RatingCompat().toString());
            }
        };
    }

    private _get_messageWebView_lambda3 createOkResponseBody(WebResourceResponse webResourceResponse) {
        InputStream data = webResourceResponse.getData();
        String mimeType = webResourceResponse.getMimeType();
        InAppMessageHtmlBaseView inAppMessageHtmlBaseViewWrite = null;
        String value = null;
        for (Map.Entry<String, String> entry : webResourceResponse.getResponseHeaders().entrySet()) {
            if (entry.getKey().equalsIgnoreCase("content-length")) {
                value = entry.getValue();
            }
            if (mimeType == null && entry.getKey().equalsIgnoreCase("content-type")) {
                mimeType = entry.getValue();
            }
        }
        if (data == null) {
            return null;
        }
        if (mimeType != null) {
            getInAppMessageEventMap getinappmessageeventmap = InAppMessageHtmlBaseView.TYPE_SUBTYPE;
            try {
                inAppMessageHtmlBaseViewWrite = SQLite.write(mimeType);
            } catch (IllegalArgumentException unused) {
            }
        }
        long j = value != null ? Integer.parseInt(value) : 0L;
        GifDrawableTransformation gifDrawableTransformation = new GifDrawableTransformation(Okio.RemoteActionCompatParcelizer(data));
        _get_messageWebView_lambda4 _get_messagewebview_lambda4 = _get_messageWebView_lambda3.EMPTY;
        return new _get_messageWebView_lambda4(inAppMessageHtmlBaseViewWrite, j, gifDrawableTransformation);
    }

    @Override // o.getShortEdge
    public _get_messageWebView_lambda1 intercept(getMessageHeaderTextView getmessageheadertextview) throws IOException {
        IQualtricsRequestInterceptor requestHandler = RequestInterceptorProvider.getInstance().getRequestHandler();
        InAppMessageModalView inAppMessageModalView = (InAppMessageModalView) getmessageheadertextview;
        r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60 = inAppMessageModalView.MediaDescriptionCompat;
        if (requestHandler == null) {
            return inAppMessageModalView.write(r8lambday113fdftsr5e4pzj6xssxltpl60);
        }
        RequestBody requestBody = r8lambday113fdftsr5e4pzj6xssxltpl60.body;
        WebResourceResponse webResourceResponseHandleRequest = requestHandler.handleRequest(createWebResourceRequest(r8lambday113fdftsr5e4pzj6xssxltpl60), requestBody != null ? requestBody.toString() : null);
        if (webResourceResponseHandleRequest != null) {
            return createOkhttpResponse(r8lambday113fdftsr5e4pzj6xssxltpl60, webResourceResponseHandleRequest);
        }
        QualtricsLog.logError("null response returned from IQualtricsRequestInterceptor.");
        return createEmptyOkResponse(r8lambday113fdftsr5e4pzj6xssxltpl60);
    }

    private _get_messageWebView_lambda1 createEmptyOkResponse(r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60) {
        _get_messageWebView_lambda4 _get_messagewebview_lambda4 = _get_messageWebView_lambda3.EMPTY;
        ArrayList arrayList = new ArrayList(20);
        r8lambday113fdftsr5e4pzj6xssxltpl60.getClass();
        r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc r8lambdacwme7obcpvw4lrr1hr7xiufmyc = r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc.HTTP_2;
        r8lambdacwme7obcpvw4lrr1hr7xiufmyc.getClass();
        return new _get_messageWebView_lambda1(r8lambday113fdftsr5e4pzj6xssxltpl60, r8lambdacwme7obcpvw4lrr1hr7xiufmyc, "", Constant.ERROR_UNKNOWN, null, new resetMessageMarginslambda00((String[]) arrayList.toArray(new String[0])), new _get_messageWebView_lambda4(null, 0L, new GifDrawableTransformation(Okio.RemoteActionCompatParcelizer(new ByteArrayInputStream(new byte[0])))), null, null, null, 0L, 0L, null, getMessageWebView.EMPTY);
    }
}
