package com.roadrunner.common.data.api;

import androidx.compose.ui.graphics.Fields;
import kotlin.ranges.RangesKt;
import o.getHoldoutVariationName;
import o.hideCurrentlyDisplayingInAppMessage;
import o.markUpdated;
import o.q6;
import o.r8lambday113fDFTSR5e4PZj6XsSXLtpL60;
import o.safeSetClipToOutline;
import o.withTopLeftBottomRight;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes3.dex */
public final class ExtractCriticalHttpIssueData {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;

    public ExtractCriticalHttpIssueData(CloudflareErrorClassifier cloudflareErrorClassifier) {
    }

    public final markUpdated RemoteActionCompatParcelizer(Throwable th) {
        HttpException httpException;
        getHoldoutVariationName getholdoutvariationname;
        int i = 2 % 2;
        th.getClass();
        withTopLeftBottomRight withtopleftbottomrightIconCompatParcelizer = RangesKt.IconCompatParcelizer(th);
        q6 q6VarRemoteActionCompatParcelizer = null;
        if (withtopleftbottomrightIconCompatParcelizer == null || (getholdoutvariationname = (httpException = withtopleftbottomrightIconCompatParcelizer.read).write) == null) {
            return null;
        }
        r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60 = getholdoutvariationname.rawResponse.request;
        String strRemoteActionCompatParcelizer = UniqueHttpExceptionKt.serializer.RemoteActionCompatParcelizer(r8lambday113fdftsr5e4pzj6xssxltpl60.url.read(), "/<redacted>");
        if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) strRemoteActionCompatParcelizer, (CharSequence) "/api/iam-login/", false)) {
            int i2 = RemoteActionCompatParcelizer + 125;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                q6VarRemoteActionCompatParcelizer = CloudflareErrorClassifier.RemoteActionCompatParcelizer(th);
                int i3 = 59 / 0;
            } else {
                q6VarRemoteActionCompatParcelizer = CloudflareErrorClassifier.RemoteActionCompatParcelizer(th);
            }
        }
        q6 q6Var = q6VarRemoteActionCompatParcelizer;
        String str = r8lambday113fdftsr5e4pzj6xssxltpl60.method;
        String str2 = withtopleftbottomrightIconCompatParcelizer.IconCompatParcelizer;
        int i4 = httpException.read;
        safeSetClipToOutline safesetcliptooutline = new safeSetClipToOutline();
        safesetcliptooutline.put("http_error_code", String.valueOf(httpException.read));
        if (q6Var != null) {
            int i5 = write + 79;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            safesetcliptooutline.put("error_origin", q6Var.getValue());
        }
        return new markUpdated(str, strRemoteActionCompatParcelizer, str2, i4, q6Var, safesetcliptooutline.IconCompatParcelizer());
    }
}
