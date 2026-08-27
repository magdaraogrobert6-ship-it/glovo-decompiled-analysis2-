package com.braze.support;

import com.braze.models.inappmessage.InAppMessageImmersiveBase;
import com.braze.models.inappmessage.InAppMessageSlideup;
import com.braze.models.inappmessage.MessageButton;
import com.braze.models.outgoing.BrazeLocation;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.push.support.HtmlUtils;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class JsonUtils$$ExternalSyntheticLambda1 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ JsonUtils$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return JsonUtils.getPrettyPrintedString$lambda$0();
            case 1:
                return InAppMessageImmersiveBase.logButtonClick$lambda$1();
            case 2:
                return InAppMessageImmersiveBase.logButtonClick$lambda$2();
            case 3:
                return InAppMessageImmersiveBase.logButtonClick$lambda$0();
            case 4:
                return InAppMessageSlideup.enableDarkTheme$lambda$0();
            case 5:
                return InAppMessageSlideup.forJsonPut$lambda$1();
            case 6:
                return MessageButton.enableDarkTheme$lambda$0$0();
            case 7:
                return MessageButton.setClickBehavior$lambda$0();
            case 8:
                return MessageButton.setClickBehavior$lambda$1();
            case 9:
                return BrazeLocation.forJsonPut$lambda$0();
            case 10:
                return BrazeProperties.addProperty$lambda$1();
            case 11:
                return BrazeProperties.clone$lambda$0();
            case 12:
                return BrazeProperties.get$lambda$0();
            case 13:
                return BrazeNotificationPayload.Companion.getTemplateFieldAtIndex$lambda$1();
            case 14:
                return BrazeNotificationPayload.Companion.getTemplateFieldAtIndex$lambda$0();
            case 15:
                return HtmlUtils.getHtmlSpannedTextIfEnabled$lambda$0();
            case 16:
                return BrazeFileUtils.downloadFileToPath$lambda$3();
            case 17:
                return BrazeFileUtils.downloadFileToPath$lambda$2();
            case 18:
                return BrazeFileUtils.downloadFileToPath$lambda$1();
            case 19:
                return BrazeFileUtils.isRemoteUri$lambda$0();
            case 20:
                return BrazeImageUtils.calculateInSampleSize$lambda$0();
            case 21:
                return BrazeImageUtils.getRemoteBitmap$lambda$5();
            case 22:
                return BrazeImageUtils.resizeToBitmapDimensions$lambda$0();
            case 23:
                return BrazeImageUtils.getLocalBitmap$lambda$8();
            case 24:
                return BrazeImageUtils.getLocalBitmap$lambda$6();
            case 25:
                return BrazeImageUtils.getLocalBitmap$lambda$3();
            case 26:
                return JsonUtils.parseJsonObjectIntoBundle$lambda$0();
            case 27:
                return JsonUtils.getPrettyPrintedString$lambda$1();
            case 28:
                return JsonUtils.getColorIntegerOrNull$lambda$0();
            default:
                return PackageUtils.setResourcePackageName$lambda$0();
        }
    }
}
