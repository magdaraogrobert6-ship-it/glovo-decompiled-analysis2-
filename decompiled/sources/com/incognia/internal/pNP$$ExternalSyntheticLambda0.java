package com.incognia.internal;

import com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper;
import com.huawei.hms.locationSdk.w0;
import com.sentiance.sdk.Sentiance;
import com.sentiance.sdk.services.ServiceManager;
import o.ExtraSupportedOutputSizeQuirk;
import o.accessgetInfocp;
import o.r8lambdaGV766sOYYCl0YYkk8QccVU5zR38;
import o.setPushUniqueId;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pNP$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;

    private final void run$androidx$camera$core$imagecapture$TakePictureRequest$$ExternalSyntheticLambda2() {
    }

    private final void run$androidx$camera$core$imagecapture$TakePictureRequest$$ExternalSyntheticLambda4() {
    }

    public /* synthetic */ pNP$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    public /* synthetic */ pNP$$ExternalSyntheticLambda0(int i, Object obj) {
        this.$r8$classId = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                pNP.mbG();
                return;
            case 1:
                throw null;
            case 2:
            case 3:
                return;
            case 4:
                DefaultInAppMessageViewWrapper.addDismissRunnable$lambda$0();
                return;
            case 5:
                int i = accessgetInfocp.serializer;
                return;
            case 6:
                w0.c();
                return;
            case 7:
                throw null;
            case 8:
                throw null;
            case 9:
                Sentiance.lambda$publishSdkInitializedEvent$35();
                return;
            default:
                int i2 = r8lambdaGV766sOYYCl0YYkk8QccVU5zR38.write;
                ((ServiceManager) setPushUniqueId.read(ServiceManager.class)).serializer();
                return;
        }
    }

    public /* synthetic */ pNP$$ExternalSyntheticLambda0(ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk, Object obj, int i) {
        this.$r8$classId = i;
    }
}
