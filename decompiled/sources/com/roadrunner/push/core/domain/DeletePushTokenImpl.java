package com.roadrunner.push.core.domain;

import o.access1200;
import o.r8lambdaxXjW7P_AvkpTNfi9yKZ8umnanKU;

/* JADX INFO: loaded from: classes3.dex */
public final class DeletePushTokenImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final access1200 read;
    public final r8lambdaxXjW7P_AvkpTNfi9yKZ8umnanKU serializer;

    public DeletePushTokenImpl(access1200 access1200Var, r8lambdaxXjW7P_AvkpTNfi9yKZ8umnanKU r8lambdaxxjw7p_avkptnfi9ykz8umnanku) {
        this.read = access1200Var;
        this.serializer = r8lambdaxxjw7p_avkptnfi9ykz8umnanku;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        if (r1 == 2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        if (r1 != 3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        timber.log.Timber.RemoteActionCompatParcelizer.write(new com.roadrunner.push.core.data.MessagingServiceException("Push token deletion not successful as the service is not available", null));
        r1 = com.roadrunner.push.core.domain.DeletePushTokenImpl.write + 11;
        com.roadrunner.push.core.domain.DeletePushTokenImpl.RemoteActionCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        ((com.google.firebase.messaging.FirebaseMessaging) r3.write.write()).deleteToken();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        ((com.huawei.hms.aaid.HmsInstanceId) r3.read.write()).deleteToken("hms_applicant_token");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
    
        timber.log.Timber.RemoteActionCompatParcelizer.write(new com.roadrunner.push.core.data.MessagingServiceException("Unable to delete the hms token", null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0083, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r1 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        r4 = com.roadrunner.push.core.domain.DeletePushTokenImpl.RemoteActionCompatParcelizer + 75;
        com.roadrunner.push.core.domain.DeletePushTokenImpl.write = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r4 = r4 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void RemoteActionCompatParcelizer() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.push.core.domain.DeletePushTokenImpl.RemoteActionCompatParcelizer
            int r1 = r1 + 95
            int r2 = r1 % 128
            com.roadrunner.push.core.domain.DeletePushTokenImpl.write = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L22
            o.access1200 r1 = r6.read
            o.access1800 r1 = r1.RemoteActionCompatParcelizer()
            int[] r3 = o.access1100.write
            int r1 = r1.ordinal()
            r1 = r3[r1]
            o.r8lambdaxXjW7P_AvkpTNfi9yKZ8umnanKU r3 = r6.serializer
            if (r1 == 0) goto L69
            goto L35
        L22:
            o.access1200 r1 = r6.read
            o.access1800 r1 = r1.RemoteActionCompatParcelizer()
            int[] r3 = o.access1100.write
            int r1 = r1.ordinal()
            r1 = r3[r1]
            o.r8lambdaxXjW7P_AvkpTNfi9yKZ8umnanKU r3 = r6.serializer
            r4 = 1
            if (r1 == r4) goto L69
        L35:
            int r4 = com.roadrunner.push.core.domain.DeletePushTokenImpl.RemoteActionCompatParcelizer
            int r4 = r4 + 75
            int r5 = r4 % 128
            com.roadrunner.push.core.domain.DeletePushTokenImpl.write = r5
            int r4 = r4 % r0
            if (r1 == r0) goto L5d
            r3 = 3
            if (r1 != r3) goto L59
            timber.log.Timber$Forest r1 = timber.log.Timber.RemoteActionCompatParcelizer
            com.roadrunner.push.core.data.MessagingServiceException r3 = new com.roadrunner.push.core.data.MessagingServiceException
            java.lang.String r4 = "Push token deletion not successful as the service is not available"
            r3.<init>(r4, r2)
            r1.write(r3)
            int r1 = com.roadrunner.push.core.domain.DeletePushTokenImpl.write
            int r1 = r1 + 11
            int r2 = r1 % 128
            com.roadrunner.push.core.domain.DeletePushTokenImpl.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            return
        L59:
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer()
            return
        L5d:
            dagger.Lazy r0 = r3.write
            java.lang.Object r0 = r0.write()
            com.google.firebase.messaging.FirebaseMessaging r0 = (com.google.firebase.messaging.FirebaseMessaging) r0
            r0.deleteToken()
            return
        L69:
            dagger.Lazy r0 = r3.read     // Catch: com.huawei.hms.common.ApiException -> L77
            java.lang.Object r0 = r0.write()     // Catch: com.huawei.hms.common.ApiException -> L77
            com.huawei.hms.aaid.HmsInstanceId r0 = (com.huawei.hms.aaid.HmsInstanceId) r0     // Catch: com.huawei.hms.common.ApiException -> L77
            java.lang.String r1 = "hms_applicant_token"
            r0.deleteToken(r1)     // Catch: com.huawei.hms.common.ApiException -> L77
            return
        L77:
            timber.log.Timber$Forest r0 = timber.log.Timber.RemoteActionCompatParcelizer
            com.roadrunner.push.core.data.MessagingServiceException r1 = new com.roadrunner.push.core.data.MessagingServiceException
            java.lang.String r3 = "Unable to delete the hms token"
            r1.<init>(r3, r2)
            r0.write(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.push.core.domain.DeletePushTokenImpl.RemoteActionCompatParcelizer():void");
    }
}
