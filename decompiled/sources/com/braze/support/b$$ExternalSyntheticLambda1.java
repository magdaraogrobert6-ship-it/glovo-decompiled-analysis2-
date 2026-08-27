package com.braze.support;

import com.braze.images.DefaultBrazeImageLoader;
import com.braze.location.BrazeInternalLocationApi;
import com.braze.models.inappmessage.InAppMessageHtmlBase;
import com.braze.models.outgoing.BrazeProperties;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b$$ExternalSyntheticLambda1 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ b$$ExternalSyntheticLambda1(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 0:
                return b.a(str);
            case 1:
                return DefaultBrazeImageLoader.getBitmapFromCache$lambda$1$0(str);
            case 2:
                return DefaultBrazeImageLoader.getBitmapFromCache$lambda$2(str);
            case 3:
                return DefaultBrazeImageLoader.putBitmapIntoCache$lambda$0(str);
            case 4:
                return DefaultBrazeImageLoader.putBitmapIntoCache$lambda$1(str);
            case 5:
                return DefaultBrazeImageLoader.putBitmapIntoCache$lambda$2$0(str);
            case 6:
                return BrazeInternalLocationApi.requestSingleLocationUpdate$lambda$3(str);
            case 7:
                return InAppMessageHtmlBase.logButtonClick$lambda$0(str);
            case 8:
                return BrazeProperties.addProperty$lambda$0(str);
            case 9:
                return BrazeFileUtils.downloadFileToPath$lambda$6(str);
            case 10:
                return BrazeFileUtils.downloadFileToPath$lambda$0(str);
            case 11:
                return BrazeImageUtils.getRemoteBitmap$lambda$0(str);
            case 12:
                return BrazeLogger.d$lambda$0(str);
            case 13:
                return BrazeLogger.e$lambda$0(str);
            case 14:
                return BrazeLogger.w$lambda$0(str);
            case 15:
                return BrazeLogger.i$lambda$0(str);
            case 16:
                return BrazeLogger.v$lambda$0(str);
            case 17:
                return DateTimeUtils.parseDate$lambda$0(str);
            case 18:
                return JsonUtils.mergeJsonObjects$lambda$0$0(str);
            case 19:
                return JsonUtils.mergeJsonObjects$lambda$1$0(str);
            case 20:
                return PermissionUtils.incrementPermissionRequestCount$lambda$0(str);
            case 21:
                return ReflectionUtils.getDeclaredMethodQuietly$lambda$1(str);
            case 22:
                return ValidationUtils.isValidLogCustomEventInput$lambda$1(str);
            case 23:
                return ValidationUtils.isValidLogPurchaseInput$lambda$1(str);
            case 24:
                return ValidationUtils.isValidLogPurchaseInput$lambda$3(str);
            case 25:
                return WebContentUtils.getLocalHtmlUrlFromRemoteUrl$lambda$5(str);
            case 26:
                return WebContentUtils.getLocalHtmlUrlFromRemoteUrl$lambda$2(str);
            case 27:
                return WebContentUtils.replacePrefetchedUrlsWithLocalAssets$lambda$0(str);
            case 28:
                return c.a(str);
            default:
                return h.b(str);
        }
    }
}
