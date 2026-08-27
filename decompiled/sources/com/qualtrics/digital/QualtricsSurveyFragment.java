package com.qualtrics.digital;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.ui.graphics.Fields;
import com.qualtrics.digital.utils.WebViewUtils;
import fwfd.com.fwfsdk.util.FWFHelper;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import o.onTrimMemory;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes4.dex */
public class QualtricsSurveyFragment extends Fragment {
    private static final String ACTIONSETID = "actionSetID";
    private static final String APPPACKAGENAME = "appPackageName";
    private static final String AUTO_CLOSE_AT_OF_SURVEY = "autoCloseAtEndOfSurvey";
    private static final String CONTENT_TYPE = "content-type";
    private static final String CREATIVEID = "creativeID";
    private static final int FILE_CHOOSER_REQUEST_CODE_ICECREAM = 2;
    public static final int FILE_CHOOSER_REQUEST_CODE_LOLLIPOP = 1;
    private static final String INTERCEPTID = "interceptID";
    public static final String INTERCEPT_REQUEST_OVERRIDE = "XMLHttpRequest.prototype.origOpen = XMLHttpRequest.prototype.open;\nXMLHttpRequest.prototype.open = function(method, url, async, user, password) {\n    // these will be the key to retrieve the payload\n    this.recordedMethod = method;\n    this.recordedUrl = url;\n    this.origOpen(method, url, async, user, password);\n};\nXMLHttpRequest.prototype.origSend = XMLHttpRequest.prototype.send;\nXMLHttpRequest.prototype.send = function(body) {\n    // interceptor is a Kotlin interface added in WebView\n    if(body) android.recordPayload(this.recordedMethod, this.recordedUrl, body);\n    this.origSend(body);\n};";
    private static int IconCompatParcelizer = 1;
    public static final String LOG_TAG = "Qualtrics";
    private static final String TOOLBAR_CLOSE_DESC = "Close Survey";
    private static final String URL = "URL";
    private static int read = 0;
    private static byte write = -112;
    private String actionSetID;
    private String appPackageName;
    private boolean autoCloseAtEndOfSurvey;
    private String creativeID;
    private String interceptID;
    private ValueCallback<Uri[]> mFilePathCallback;
    private ValueCallback<Uri> mUploadMessage;
    private String targetURL;
    private WebView webView;
    private boolean webViewShown = false;
    public String webRequestBody = null;

    public void setWebViewShown(boolean z) {
        this.webViewShown = z;
    }

    private WebChromeClient createWebChromeClient() {
        return new WebChromeClient() { // from class: com.qualtrics.digital.QualtricsSurveyFragment.2
            @Override // android.webkit.WebChromeClient
            public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                if (QualtricsSurveyFragment.this.mFilePathCallback != null) {
                    QualtricsSurveyFragment.this.mFilePathCallback.onReceiveValue(null);
                }
                QualtricsSurveyFragment.this.mFilePathCallback = valueCallback;
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType("*/*");
                Intent intent2 = new Intent("android.intent.action.CHOOSER");
                intent2.putExtra("android.intent.extra.INTENT", intent);
                intent2.putExtra("android.intent.extra.TITLE", "File Chooser");
                QualtricsSurveyFragment.this.startActivityForResult(intent2, 1);
                return true;
            }

            public void openFileChooser(ValueCallback<Uri> valueCallback) {
                QualtricsSurveyFragment.this.mUploadMessage = valueCallback;
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType("*/*");
                QualtricsSurveyFragment.this.startActivityForResult(Intent.createChooser(intent, "File Chooser"), 2);
            }

            public void openFileChooser(ValueCallback valueCallback, String str) {
                QualtricsSurveyFragment.this.mUploadMessage = valueCallback;
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType("*/*");
                QualtricsSurveyFragment.this.startActivityForResult(Intent.createChooser(intent, "File Browser"), 2);
            }

            public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
                QualtricsSurveyFragment.this.mUploadMessage = valueCallback;
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType("*/*");
                QualtricsSurveyFragment.this.startActivityForResult(Intent.createChooser(intent, "File Chooser"), 2);
            }
        };
    }

    private WebViewClient createWebViewClient() {
        return new WebViewClient() { // from class: com.qualtrics.digital.QualtricsSurveyFragment.3
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                webView.loadUrl("javascript:window.addEventListener('message', function(postMessage) {var postMsgData = postMessage.data.split('|');if (postMsgData.includes('QualtricsEOS')) {android.postMessage(postMsgData.find(value => /^SV_/.match(value)))}})");
                QualtricsSurveyFragment.this.loadInterceptJavascript(webView);
            }

            @Override // android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                return RequestInterceptorProvider.getInstance().getRequestHandler() != null ? RequestInterceptorProvider.getInstance().getRequestHandler().handleRequest(webResourceRequest, QualtricsSurveyFragment.this.getBodyForUrl()) : super.shouldInterceptRequest(webView, webResourceRequest);
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                Uri url = webResourceRequest.getUrl();
                if (url != null && QualtricsSurveyFragment.this.webViewShown) {
                    return QualtricsSurveyFragment.this.tryToCreateAndExecuteRedirectIntent(url.toString());
                }
                return false;
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                if (webResourceError.getDescription() != null) {
                    QualtricsLog.logError("There was an error reported when loading the survey: " + webResourceError.getDescription().toString());
                }
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i, String str, String str2) {
                QualtricsLog.logError(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("There was an error reported when loading the survey: ", str));
            }
        };
    }

    public static QualtricsSurveyFragment newInstance(String str, String str2, String str3, String str4, String str5, boolean z) {
        QualtricsSurveyFragment qualtricsSurveyFragment = new QualtricsSurveyFragment();
        Bundle bundle = new Bundle(5);
        bundle.putString(URL, str);
        bundle.putString(INTERCEPTID, str2);
        bundle.putString(CREATIVEID, str3);
        bundle.putString(ACTIONSETID, str4);
        bundle.putString(APPPACKAGENAME, str5);
        bundle.putBoolean(AUTO_CLOSE_AT_OF_SURVEY, z);
        qualtricsSurveyFragment.setArguments(bundle);
        return qualtricsSurveyFragment;
    }

    public boolean performRedirectIfNeeded() {
        return tryToCreateAndExecuteRedirectIntent(this.targetURL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getBodyForUrl() {
        String str = this.webRequestBody;
        this.webRequestBody = null;
        return str;
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        setupCloseIconContentDescription();
        if (isHidden() || !shouldRecordClick()) {
            return;
        }
        SiteInterceptService.instance().recordClick(this.interceptID, this.creativeID, this.actionSetID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadInterceptJavascript(WebView webView) {
        if (RequestInterceptorProvider.getInstance().getRequestHandler() != null) {
            try {
                webView.evaluateJavascript(INTERCEPT_REQUEST_OVERRIDE, null);
            } catch (Exception e) {
                QualtricsLog.logError("Error loading request intercepting javascript: " + e);
            }
        }
    }

    private void setupCloseIconContentDescription() {
        onTrimMemory supportActionBar = ((AppCompatActivity) getActivity()).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.ParcelableVolumeInfo();
        }
    }

    @Override // android.app.Fragment
    @SuppressLint
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getActivity().getWindow().setSoftInputMode(16);
        this.interceptID = getArguments().getString(INTERCEPTID);
        this.creativeID = getArguments().getString(CREATIVEID);
        this.actionSetID = getArguments().getString(ACTIONSETID);
        this.targetURL = getArguments().getString(URL);
        this.appPackageName = getArguments().getString(APPPACKAGENAME);
        this.autoCloseAtEndOfSurvey = getArguments().getBoolean(AUTO_CLOSE_AT_OF_SURVEY);
        WebView webView = new WebView(getActivity());
        this.webView = webView;
        webView.setBackgroundColor(-1);
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.addJavascriptInterface(new WebViewInterface(getActivity(), this, this.autoCloseAtEndOfSurvey), FWFHelper.fwfDeviceOS);
        this.webView.getSettings().setDomStorageEnabled(true);
        this.webView.getSettings().setAllowFileAccess(false);
        this.webView.getSettings().setLoadWithOverviewMode(true);
        this.webView.getSettings().setUseWideViewPort(true);
        loadInterceptJavascript(this.webView);
        this.webView.setWebViewClient(createWebViewClient());
        this.webView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.webView.setFocusable(true);
        this.webView.setFocusableInTouchMode(true);
        this.webView.requestLayout();
        this.webView.setWebChromeClient(createWebChromeClient());
        LinearLayout linearLayout = new LinearLayout(getActivity());
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.setFitsSystemWindows(true);
        linearLayout.setBackgroundColor(-1);
        linearLayout.addView(this.webView);
        linearLayout.setFocusable(true);
        linearLayout.setFocusableInTouchMode(true);
        this.webView.loadUrl(this.targetURL);
        return linearLayout;
    }

    public boolean shouldRecordClick() {
        return (this.interceptID == null || this.creativeID == null || this.actionSetID == null) ? false : true;
    }

    @Override // android.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            return;
        }
        if (shouldRecordClick()) {
            SiteInterceptService.instance().recordClick(this.interceptID, this.creativeID, this.actionSetID);
        }
        onTrimMemory supportActionBar = ((AppCompatActivity) getActivity()).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.MediaSessionCompatResultReceiverWrapper();
            supportActionBar.write(R.drawable.ic_close_black_24dp);
            supportActionBar.IconCompatParcelizer(true);
            supportActionBar.MediaSessionCompatToken();
        }
    }

    @Override // android.app.Fragment
    public Animator onCreateAnimator(int i, boolean z, int i2) {
        if (i2 != 17498112 || !z) {
            return null;
        }
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(getActivity(), i2);
        animatorLoadAnimator.addListener(new Animator.AnimatorListener() { // from class: com.qualtrics.digital.QualtricsSurveyFragment.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Activity activity = QualtricsSurveyFragment.this.getActivity();
                if (activity == null || activity.getWindow() == null) {
                    return;
                }
                activity.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
            }
        });
        return animatorLoadAnimator;
    }

    private Intent tryCreatingRedirectIntent(String str) throws URISyntaxException {
        Activity activity = getActivity();
        if (activity == null) {
            return null;
        }
        return WebViewUtils.INSTANCE.createBrowsingIntent(activity.getApplicationContext(), str);
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        String dataString;
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            this.mFilePathCallback.onReceiveValue((i2 != -1 || (dataString = intent.getDataString()) == null) ? null : new Uri[]{Uri.parse(dataString)});
            this.mFilePathCallback = null;
        } else {
            if (i != 2) {
                return;
            }
            this.mUploadMessage.onReceiveValue(intent != null ? intent.getData() : null);
            this.mUploadMessage = null;
        }
    }

    private void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ write);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean tryToCreateAndExecuteRedirectIntent(String str) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 23;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (str == null) {
            int i5 = i2 + 97;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            return i5 % 2 == 0;
        }
        try {
            Intent intentTryCreatingRedirectIntent = tryCreatingRedirectIntent(str);
            if (intentTryCreatingRedirectIntent == null) {
                return false;
            }
            Object obj = null;
            startActivity(intentTryCreatingRedirectIntent, null);
            int i6 = read + 43;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                return true;
            }
            obj.hashCode();
            throw null;
        } catch (ActivityNotFoundException unused) {
            QualtricsLog.logInfo("Exception during redirection in WebView:\n".concat("No application can handle ".concat(str)));
            Context applicationContext = getActivity().getApplicationContext();
            String string = getString(R.string.unable_to_open_web_view_link_no_app);
            if (string.startsWith("%('")) {
                String strSubstring = string.substring(3);
                Object[] objArr = new Object[1];
                a(strSubstring, objArr);
                string = ((String) objArr[0]).intern();
            }
            Toast.makeText(applicationContext, string, 0).show();
            return false;
        } catch (SecurityException unused2) {
            QualtricsLog.logInfo("Exception during redirection in WebView:\n".concat("SecurityException when starting intent for ".concat(str)));
            Context applicationContext2 = getActivity().getApplicationContext();
            String string2 = getString(R.string.unable_to_open_web_view_link_no_app);
            if (string2.startsWith("%('")) {
                String strSubstring2 = string2.substring(3);
                Object[] objArr2 = new Object[1];
                a(strSubstring2, objArr2);
                string2 = ((String) objArr2[0]).intern();
            }
            Toast.makeText(applicationContext2, string2, 0).show();
            return false;
        } catch (URISyntaxException unused3) {
            QualtricsLog.logInfo("Exception during redirection in WebView:\n".concat("Bad URI ".concat(str)));
            Context applicationContext3 = getActivity().getApplicationContext();
            String string3 = getString(R.string.unable_to_open_web_view_link_malformed);
            if (string3.startsWith("%('")) {
                String strSubstring3 = string3.substring(3);
                Object[] objArr3 = new Object[1];
                a(strSubstring3, objArr3);
                string3 = ((String) objArr3[0]).intern();
            }
            Toast.makeText(applicationContext3, string3, 0).show();
            return false;
        }
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
