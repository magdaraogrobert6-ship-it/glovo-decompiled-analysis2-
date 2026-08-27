package com.roadrunner.remoteconfig.fwf.genii;

import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.fwf_http.IFwFHTTPRequestClient;
import com.roadrunner.common.data.api.MapApiError$$ExternalSyntheticLambda1;
import com.roadrunner.heatmap.data.HeatmapDataStore$set$2;
import com.roadrunner.nafath.logger.NafathLogger$$ExternalSyntheticLambda0;
import io.sentry.SentryTracer$$ExternalSyntheticLambda1;
import io.sentry.okhttp.read;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o._get_messageWebView_lambda0;
import o.isOpenInternalroom_runtime;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ;
import o.r8lambday113fDFTSR5e4PZj6XsSXLtpL60;
import o.r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE;
import o.resetMessageMarginslambda00;
import o.rollback;
import o.setWebViewContent;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$3;
import okio.Options;

/* JADX INFO: loaded from: classes3.dex */
public final class SentryFwfHttpRequestClient implements IFwFHTTPRequestClient {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 read;

    public SentryFwfHttpRequestClient(rollback rollbackVar, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ r8lambdauggauuj_lbnzvef8yyxtwmhrlkq = new r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ();
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.add(rollbackVar.IconCompatParcelizer());
        read readVar = new read();
        TimeZone timeZone = setWebViewContent.RemoteActionCompatParcelizer;
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.PlaybackStateCompatCustomAction = new SentryTracer$$ExternalSyntheticLambda1(15, readVar);
        this.read = new r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0(r8lambdauggauuj_lbnzvef8yyxtwmhrlkq);
    }

    @Override // com.deliveryhero.fwf_http.IFwFHTTPRequestClient
    public final Object httpJsonFwFRequest(String str, String str2, Map map, String str3, long j, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        Object objSerializer = serializer(str, str2, map, str3, j, new NafathLogger$$ExternalSyntheticLambda0(19), shortNewsContentCardView);
        int i2 = RemoteActionCompatParcelizer + 37;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return objSerializer;
        }
        throw null;
    }

    @Override // com.deliveryhero.fwf_http.IFwFHTTPRequestClient
    public final Object httpProtoFwFRequest(String str, String str2, Map map, String str3, long j, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        Object objSerializer = serializer(str, str2, map, str3, j, new MapApiError$$ExternalSyntheticLambda1(25), shortNewsContentCardView);
        int i2 = write + 99;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return objSerializer;
        }
        throw null;
    }

    public final Object serializer(String str, String str2, Map map, String str3, long j, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        _get_messageWebView_lambda0 _get_messagewebview_lambda0 = new _get_messageWebView_lambda0(0);
        _get_messagewebview_lambda0.read(str2);
        resetMessageMarginslambda00 resetmessagemarginslambda00 = resetMessageMarginslambda00.EMPTY;
        _get_messagewebview_lambda0.serializer = Options.Companion.serializer(map).serializer();
        RequestBody$Companion$toRequestBody$3 requestBody$Companion$toRequestBody$3Serializer = null;
        if (str3 != null) {
            int i2 = RemoteActionCompatParcelizer + 39;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            RequestBody.Companion.getClass();
            requestBody$Companion$toRequestBody$3Serializer = r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE.serializer(str3, null);
        } else {
            int i4 = write + 61;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 3 % 2;
            }
        }
        _get_messagewebview_lambda0.write(str, requestBody$Companion$toRequestBody$3Serializer);
        r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60 = new r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messagewebview_lambda0);
        r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ r8lambdauggauuj_lbnzvef8yyxtwmhrlkq = this.read.read();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.serializer = setWebViewContent.read("timeout", j, timeUnit);
        r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0 = new r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0(r8lambdauggauuj_lbnzvef8yyxtwmhrlkq);
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        return BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new HeatmapDataStore$set$2(r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0, r8lambday113fdftsr5e4pzj6xssxltpl60, r8lambdaunavo3sxub_pc9xroryotnrlvsm, (ShortNewsContentCardView) null, 9), shortNewsContentCardView);
    }
}
