package com.huawei.secure.android.common.webview;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.ui.graphics.Fields;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;
import o.ScrollCaptureonScrollCaptureSearch2;
import o.mapOffsetToViewport;
import o.setScrollCaptureInProgress;

/* JADX INFO: loaded from: classes5.dex */
public class SafeWebView extends WebView {
    public String[] IconCompatParcelizer;
    public String[] RemoteActionCompatParcelizer;
    public String read;
    public String[] serializer;

    public final class b extends WebViewClient {
        public final WebViewClient serializer;
        public final boolean write = true;

        public b(WebViewClient webViewClient) {
            this.serializer = webViewClient;
        }

        @Override // android.webkit.WebViewClient
        public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
            WebViewClient webViewClient = this.serializer;
            if (webViewClient != null) {
                webViewClient.doUpdateVisitedHistory(webView, str, z);
            } else {
                super.doUpdateVisitedHistory(webView, str, z);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onFormResubmission(WebView webView, Message message, Message message2) {
            WebViewClient webViewClient = this.serializer;
            if (webViewClient != null) {
                webViewClient.onFormResubmission(webView, message, message2);
            } else {
                super.onFormResubmission(webView, message, message2);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onLoadResource(WebView webView, String str) {
            WebViewClient webViewClient = this.serializer;
            if (webViewClient != null) {
                webViewClient.onLoadResource(webView, str);
            } else {
                super.onLoadResource(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageCommitVisible(WebView webView, String str) {
            WebViewClient webViewClient = this.serializer;
            if (webViewClient != null) {
                webViewClient.onPageCommitVisible(webView, str);
            } else {
                super.onPageCommitVisible(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            WebViewClient webViewClient = this.serializer;
            if (webViewClient != null) {
                webViewClient.onPageFinished(webView, str);
            } else {
                super.onPageFinished(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            WebViewClient webViewClient = this.serializer;
            if (webViewClient != null && !this.write) {
                webViewClient.onPageStarted(webView, str, bitmap);
                return;
            }
            SafeWebView safeWebView = SafeWebView.this;
            if (safeWebView.read(str)) {
                super.onPageStarted(webView, str, bitmap);
            } else {
                safeWebView.write(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
            WebViewClient webViewClient = this.serializer;
            if (webViewClient != null) {
                webViewClient.onReceivedClientCertRequest(webView, clientCertRequest);
            } else {
                super.onReceivedClientCertRequest(webView, clientCertRequest);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            WebViewClient webViewClient = this.serializer;
            if (webViewClient != null) {
                webViewClient.onReceivedError(webView, i, str, str2);
            } else {
                super.onReceivedError(webView, i, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            WebViewClient webViewClient = this.serializer;
            if (webViewClient != null) {
                webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            } else {
                super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            WebViewClient webViewClient = this.serializer;
            if (webViewClient != null) {
                webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            } else {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
            WebViewClient webViewClient = this.serializer;
            if (webViewClient != null) {
                webViewClient.onReceivedLoginRequest(webView, str, str2, str3);
            } else {
                super.onReceivedLoginRequest(webView, str, str2, str3);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            WebViewClient webViewClient = this.serializer;
            if (webViewClient != null) {
                webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
            } else {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }
        }

        @Override // android.webkit.WebViewClient
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            WebViewClient webViewClient = this.serializer;
            return webViewClient != null ? webViewClient.onRenderProcessGone(webView, renderProcessGoneDetail) : super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }

        @Override // android.webkit.WebViewClient
        public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
            WebViewClient webViewClient = this.serializer;
            if (webViewClient != null) {
                webViewClient.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
            } else {
                super.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onScaleChanged(WebView webView, float f, float f2) {
            WebViewClient webViewClient = this.serializer;
            if (webViewClient != null) {
                webViewClient.onScaleChanged(webView, f, f2);
            } else {
                super.onScaleChanged(webView, f, f2);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
            WebViewClient webViewClient = this.serializer;
            if (webViewClient != null) {
                webViewClient.onTooManyRedirects(webView, message, message2);
            } else {
                super.onTooManyRedirects(webView, message, message2);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
            WebViewClient webViewClient = this.serializer;
            if (webViewClient != null) {
                webViewClient.onUnhandledKeyEvent(webView, keyEvent);
            } else {
                super.onUnhandledKeyEvent(webView, keyEvent);
            }
        }

        @Override // android.webkit.WebViewClient
        public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            WebViewClient webViewClient = this.serializer;
            return webViewClient != null ? webViewClient.shouldInterceptRequest(webView, webResourceRequest) : super.shouldInterceptRequest(webView, webResourceRequest);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
            WebViewClient webViewClient = this.serializer;
            return webViewClient != null ? webViewClient.shouldOverrideKeyEvent(webView, keyEvent) : super.shouldOverrideKeyEvent(webView, keyEvent);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            WebViewClient webViewClient = this.serializer;
            if (webViewClient != null && !this.write) {
                return webViewClient.shouldOverrideUrlLoading(webView, str);
            }
            SafeWebView safeWebView = SafeWebView.this;
            if (safeWebView.read(str)) {
                return webViewClient != null ? webViewClient.shouldOverrideUrlLoading(webView, str) : super.shouldOverrideUrlLoading(webView, str);
            }
            safeWebView.write(webView, str);
            return false;
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            WebViewClient webViewClient = this.serializer;
            if (webViewClient != null) {
                webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
            } else {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
            }
        }

        @Override // android.webkit.WebViewClient
        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            WebViewClient webViewClient = this.serializer;
            if (webViewClient != null) {
                return webViewClient.shouldInterceptRequest(webView, str);
            }
            return super.shouldInterceptRequest(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            WebViewClient webViewClient = this.serializer;
            if (webViewClient != null) {
                return webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest);
            }
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    public String getDefaultErrorPage() {
        return this.read;
    }

    public setScrollCaptureInProgress getWebViewLoadCallBack() {
        return null;
    }

    public void setDefaultErrorPage(String str) {
        this.read = str;
    }

    public void setWebViewLoadCallBack(setScrollCaptureInProgress setscrollcaptureinprogress) {
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(new b(webViewClient));
    }

    @TargetApi
    @Deprecated
    public void setWhitelist(String[] strArr) {
        this.serializer = strArr == null ? null : (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public void setWhitelistNotMatchSubDomain(String[] strArr) {
        this.IconCompatParcelizer = strArr == null ? null : (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @Deprecated
    public void setWhitelistNotMathcSubDomain(String[] strArr) {
        this.IconCompatParcelizer = strArr == null ? null : (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @TargetApi
    public void setWhitelistWithPath(String[] strArr) {
        this.RemoteActionCompatParcelizer = strArr == null ? null : (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public final void write(WebView webView, String str) {
        Pattern pattern = mapOffsetToViewport.read;
        if (!TextUtils.isEmpty("onCheckError url is not in white list ") || !TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder(Fields.RotationY);
            if (!TextUtils.isEmpty("onCheckError url is not in white list ")) {
                sb.append("onCheckError url is not in white list ");
            }
            if (!TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(str)) {
                    int length = str.length();
                    int i = 1;
                    if (1 == length) {
                        str = String.valueOf('*');
                    } else {
                        StringBuilder sb2 = new StringBuilder(length);
                        for (int i2 = 0; i2 < length; i2++) {
                            char cCharAt = str.charAt(i2);
                            if (mapOffsetToViewport.read.matcher(String.valueOf(cCharAt)).matches()) {
                                if (i % 2 == 0) {
                                    cCharAt = '*';
                                }
                                i++;
                            }
                            sb2.append(cCharAt);
                        }
                        str = sb2.toString();
                    }
                }
                sb.append(str);
            }
            Log.e("SafeWebView", sb.toString());
        }
        webView.stopLoading();
        String defaultErrorPage = getDefaultErrorPage();
        if (TextUtils.isEmpty(defaultErrorPage)) {
            getWebViewLoadCallBack();
        } else {
            webView.loadUrl(defaultErrorPage);
        }
    }

    @TargetApi
    @Deprecated
    public String[] getWhitelist() {
        String[] strArr = this.serializer;
        if (strArr == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public String[] getWhitelistNotMatchSubDomain() {
        String[] strArr = this.IconCompatParcelizer;
        if (strArr == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @Deprecated
    public String[] getWhitelistNotMathcSubDomain() {
        String[] strArr = this.IconCompatParcelizer;
        if (strArr == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @TargetApi
    public String[] getWhitelistWithPath() {
        String[] strArr = this.RemoteActionCompatParcelizer;
        if (strArr == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String str) {
        if (read(str) && !URLUtil.isHttpUrl(str)) {
            super.loadUrl(str);
            return;
        }
        Log.e("SafeWebView", "loadUrl: url is not in white list or http url not safe");
        if (TextUtils.isEmpty(this.read)) {
            getWebViewLoadCallBack();
        } else {
            super.loadUrl(this.read);
        }
    }

    @Override // android.webkit.WebView
    public final void postUrl(String str, byte[] bArr) {
        if (read(str) && !URLUtil.isHttpUrl(str)) {
            super.postUrl(str, bArr);
            return;
        }
        Log.e("SafeWebView", "postUrl: url is not in white list or http url not safe");
        if (TextUtils.isEmpty(this.read)) {
            getWebViewLoadCallBack();
        } else {
            super.postUrl(this.read, bArr);
        }
    }

    @Override // android.webkit.WebView
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!URLUtil.isHttpUrl(str)) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
            return;
        }
        Log.e("SafeWebView", "loadDataWithBaseURL: http url , not safe");
        if (TextUtils.isEmpty(this.read)) {
            getWebViewLoadCallBack();
        } else {
            super.loadDataWithBaseURL(this.read, str2, str3, str4, str5);
        }
    }

    public final boolean read(String str) {
        if (TextUtils.isEmpty(str)) {
            mapOffsetToViewport.read("SafeWebView", "url is null");
            return false;
        }
        if (URLUtil.isNetworkUrl(str)) {
            String[] whitelistWithPath = getWhitelistWithPath();
            String[] whitelistNotMatchSubDomain = getWhitelistNotMatchSubDomain();
            String[] whitelist = getWhitelist();
            boolean z = whitelistWithPath == null || whitelistWithPath.length == 0;
            boolean z2 = whitelistNotMatchSubDomain == null || whitelistNotMatchSubDomain.length == 0;
            boolean z3 = whitelist == null || whitelist.length == 0;
            if (!z || !z2 || !z3) {
                if (whitelistWithPath != null && whitelistWithPath.length != 0) {
                    if (whitelistWithPath.length == 0) {
                        mapOffsetToViewport.read("UriUtil", "whitelist is null");
                        return false;
                    }
                    for (String str2 : whitelistWithPath) {
                        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                            String strDecode = Uri.decode(str);
                            String strDecode2 = Uri.decode(str2);
                            if (strDecode.contains("..") || strDecode2.contains("@")) {
                                Log.e("UriUtil", "url contains unsafe char");
                            } else if (str.contains("..") || str.contains("@")) {
                                Log.e("UriUtil", "url contains unsafe char");
                            } else if (!str2.equals(str) && !str.startsWith(str2.concat("?")) && !str.startsWith(str2.concat("#"))) {
                                if (!str2.endsWith("/")) {
                                    continue;
                                } else if (Uri.parse(strDecode).getPathSegments().size() - Uri.parse(strDecode2).getPathSegments().size() == 1 && str.startsWith(str2)) {
                                }
                            }
                        }
                    }
                    return false;
                }
                if (whitelistNotMatchSubDomain != null && whitelistNotMatchSubDomain.length != 0) {
                    if (whitelistNotMatchSubDomain.length == 0) {
                        mapOffsetToViewport.read("UriUtil", "whitelist is null");
                        return false;
                    }
                    int length = whitelistNotMatchSubDomain.length;
                    for (int i = 0; i < length; i++) {
                        String strWrite = whitelistNotMatchSubDomain[i];
                        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(strWrite)) {
                            Log.e("UriUtil", "isUrlHostSameWhitelist: url or host is null");
                        } else {
                            String strWrite2 = ScrollCaptureonScrollCaptureSearch2.write(str);
                            if (TextUtils.isEmpty(strWrite)) {
                                Pattern pattern = mapOffsetToViewport.read;
                                if (!TextUtils.isEmpty("whiteListUrl is null")) {
                                    mapOffsetToViewport.serializer("whiteListUrl is null");
                                }
                                strWrite = null;
                            } else if (URLUtil.isNetworkUrl(strWrite)) {
                                strWrite = ScrollCaptureonScrollCaptureSearch2.write(strWrite);
                            }
                            if (TextUtils.equals(strWrite2, strWrite)) {
                            }
                        }
                    }
                    return false;
                }
                if (whitelist == null || whitelist.length == 0) {
                    mapOffsetToViewport.read("UriUtil", "whitelist is null");
                    return false;
                }
                int length2 = whitelist.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    String strWrite3 = whitelist[i2];
                    String strWrite4 = ScrollCaptureonScrollCaptureSearch2.write(str);
                    if (TextUtils.isEmpty(strWrite4) || TextUtils.isEmpty(strWrite3)) {
                        mapOffsetToViewport.read("UriUtil", "url or whitelist is null");
                    } else {
                        if (TextUtils.isEmpty(strWrite3)) {
                            Pattern pattern2 = mapOffsetToViewport.read;
                            if (!TextUtils.isEmpty("whiteListUrl is null")) {
                                mapOffsetToViewport.serializer("whiteListUrl is null");
                            }
                            strWrite3 = null;
                        } else if (URLUtil.isNetworkUrl(strWrite3)) {
                            strWrite3 = ScrollCaptureonScrollCaptureSearch2.write(strWrite3);
                        }
                        if (!TextUtils.isEmpty(strWrite3)) {
                            if (!strWrite3.equals(strWrite4)) {
                                if (strWrite4.endsWith(strWrite3)) {
                                    try {
                                        String strSubstring = strWrite4.substring(0, strWrite4.length() - strWrite3.length());
                                        if (strSubstring.endsWith(".") && strSubstring.matches("^[A-Za-z0-9.-]+$")) {
                                        }
                                    } catch (IndexOutOfBoundsException e) {
                                        mapOffsetToViewport.read("UriUtil", "IndexOutOfBoundsException" + e.getMessage());
                                    } catch (Exception e2) {
                                        mapOffsetToViewport.read("UriUtil", "Exception : " + e2.getMessage());
                                    }
                                } else {
                                    continue;
                                }
                            }
                            return true;
                        }
                        Log.e("UriUtil", "whitelist host is null");
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String str, Map map) {
        if (read(str) && !URLUtil.isHttpUrl(str)) {
            super.loadUrl(str, map);
            return;
        }
        Log.e("SafeWebView", "loadUrl: url is not in white list or http url not safe");
        if (!TextUtils.isEmpty(this.read)) {
            super.loadUrl(this.read, map);
        } else {
            getWebViewLoadCallBack();
        }
    }
}
