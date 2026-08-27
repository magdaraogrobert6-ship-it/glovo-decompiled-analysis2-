package com.deliveryhero.fwf_http;

import com.deliveryhero.fwf_http.model.FwFHTTPResponse;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import o.ShortNewsContentCardView;
import o._get_messageWebView_lambda0;
import o._get_messageWebView_lambda1;
import o._get_messageWebView_lambda3;
import o.clipCanvasToPath;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0;
import o.r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ;
import o.r8lambday113fDFTSR5e4PZj6XsSXLtpL60;
import o.r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE;
import o.resetMessageMarginslambda00;
import o.setWebViewContent;
import o.sourceInformationContextOfdefault;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$3;
import okio.Options;

/* JADX INFO: loaded from: classes2.dex */
public class HTTPRequestClient implements IFwFHTTPRequestClient {
    private final r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 client = new r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0();

    @Override // com.deliveryhero.fwf_http.IFwFHTTPRequestClient
    public Object httpJsonFwFRequest(String str, String str2, Map<String, String> map, String str3, long j, ShortNewsContentCardView<? super FwFHTTPResponse<String>> shortNewsContentCardView) {
        return httpJsonFwFRequest$suspendImpl(this, str, str2, map, str3, j, shortNewsContentCardView);
    }

    @Override // com.deliveryhero.fwf_http.IFwFHTTPRequestClient
    public Object httpProtoFwFRequest(String str, String str2, Map<String, String> map, String str3, long j, ShortNewsContentCardView<? super FwFHTTPResponse<byte[]>> shortNewsContentCardView) {
        return httpProtoFwFRequest$suspendImpl(this, str, str2, map, str3, j, shortNewsContentCardView);
    }

    public static Object httpJsonFwFRequest$suspendImpl(HTTPRequestClient hTTPRequestClient, String str, String str2, Map<String, String> map, String str3, long j, ShortNewsContentCardView<? super FwFHTTPResponse<String>> shortNewsContentCardView) {
        _get_messageWebView_lambda0 _get_messagewebview_lambda0 = new _get_messageWebView_lambda0(0);
        _get_messagewebview_lambda0.read(str2);
        resetMessageMarginslambda00 resetmessagemarginslambda00 = resetMessageMarginslambda00.EMPTY;
        _get_messagewebview_lambda0.serializer = Options.Companion.serializer(map).serializer();
        RequestBody$Companion$toRequestBody$3 requestBody$Companion$toRequestBody$3Serializer = null;
        if (str3 != null) {
            RequestBody.Companion.getClass();
            requestBody$Companion$toRequestBody$3Serializer = r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE.serializer(str3, null);
        }
        _get_messagewebview_lambda0.write(str, requestBody$Companion$toRequestBody$3Serializer);
        r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60 = new r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messagewebview_lambda0);
        r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ r8lambdauggauuj_lbnzvef8yyxtwmhrlkq = hTTPRequestClient.client.read();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.serializer = setWebViewContent.read("timeout", j, timeUnit);
        try {
            _get_messageWebView_lambda1 _get_messagewebview_lambda1Execute = FirebasePerfOkHttpClient.execute(new clipCanvasToPath(new r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0(r8lambdauggauuj_lbnzvef8yyxtwmhrlkq), r8lambday113fdftsr5e4pzj6xssxltpl60, false));
            try {
                FwFHTTPResponse fwFHTTPResponse = new FwFHTTPResponse(_get_messagewebview_lambda1Execute.code, _get_messagewebview_lambda1Execute.message, String.valueOf(_get_messagewebview_lambda1Execute.body));
                _get_messagewebview_lambda1Execute.close();
                return fwFHTTPResponse;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    int i = sourceInformationContextOfdefault.read();
                    int i2 = sourceInformationContextOfdefault.read();
                    int i3 = sourceInformationContextOfdefault.read();
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, i, i2, -871780639, sourceInformationContextOfdefault.read(), new Object[]{_get_messagewebview_lambda1Execute, th}, i3);
                    throw th2;
                }
            }
        } catch (IOException e) {
            return new FwFHTTPResponse(0, e.getMessage(), null, 5, null);
        } catch (IllegalStateException e2) {
            return new FwFHTTPResponse(0, e2.getMessage(), null, 5, null);
        }
    }

    public static Object httpProtoFwFRequest$suspendImpl(HTTPRequestClient hTTPRequestClient, String str, String str2, Map<String, String> map, String str3, long j, ShortNewsContentCardView<? super FwFHTTPResponse<byte[]>> shortNewsContentCardView) {
        RequestBody$Companion$toRequestBody$3 requestBody$Companion$toRequestBody$3Serializer;
        _get_messageWebView_lambda0 _get_messagewebview_lambda0 = new _get_messageWebView_lambda0(0);
        _get_messagewebview_lambda0.read(str2);
        resetMessageMarginslambda00 resetmessagemarginslambda00 = resetMessageMarginslambda00.EMPTY;
        _get_messagewebview_lambda0.serializer = Options.Companion.serializer(map).serializer();
        if (str3 != null) {
            RequestBody.Companion.getClass();
            requestBody$Companion$toRequestBody$3Serializer = r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE.serializer(str3, null);
        } else {
            requestBody$Companion$toRequestBody$3Serializer = null;
        }
        _get_messagewebview_lambda0.write(str, requestBody$Companion$toRequestBody$3Serializer);
        r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60 = new r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messagewebview_lambda0);
        r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ r8lambdauggauuj_lbnzvef8yyxtwmhrlkq = hTTPRequestClient.client.read();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.serializer = setWebViewContent.read("timeout", j, timeUnit);
        try {
            _get_messageWebView_lambda1 _get_messagewebview_lambda1Execute = FirebasePerfOkHttpClient.execute(new clipCanvasToPath(new r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0(r8lambdauggauuj_lbnzvef8yyxtwmhrlkq), r8lambday113fdftsr5e4pzj6xssxltpl60, false));
            try {
                int i = _get_messagewebview_lambda1Execute.code;
                String str4 = _get_messagewebview_lambda1Execute.message;
                _get_messageWebView_lambda3 _get_messagewebview_lambda3 = _get_messagewebview_lambda1Execute.body;
                FwFHTTPResponse fwFHTTPResponse = new FwFHTTPResponse(i, str4, _get_messagewebview_lambda3 != null ? _get_messagewebview_lambda3.serializer() : null);
                _get_messagewebview_lambda1Execute.close();
                return fwFHTTPResponse;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{_get_messagewebview_lambda1Execute, th}, sourceInformationContextOfdefault.read());
                    throw th2;
                }
            }
        } catch (IOException e) {
            return new FwFHTTPResponse(0, e.getMessage(), null, 5, null);
        } catch (IllegalStateException e2) {
            return new FwFHTTPResponse(0, e2.getMessage(), null, 5, null);
        }
    }
}
