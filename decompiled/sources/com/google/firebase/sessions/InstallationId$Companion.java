package com.google.firebase.sessions;

/* JADX INFO: loaded from: classes2.dex */
public final class InstallationId$Companion {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0084, code lost:
    
        if (r10 == r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v14, types: [com.google.firebase.installations.FirebaseInstallations, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r9v0, types: [o.accesssetInstancecp] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object create(o.accesssetInstancecp r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof o.AndroidComposeViewdragAndDropManager1
            if (r0 == 0) goto L13
            r0 = r10
            o.AndroidComposeViewdragAndDropManager1 r0 = (o.AndroidComposeViewdragAndDropManager1) r0
            int r1 = r0.IconCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.IconCompatParcelizer = r1
            goto L18
        L13:
            o.AndroidComposeViewdragAndDropManager1 r0 = new o.AndroidComposeViewdragAndDropManager1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.write
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.IconCompatParcelizer
            java.lang.String r3 = "FirebaseSessions"
            r4 = 2
            r5 = 1
            java.lang.String r6 = ""
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3c
            if (r2 != r4) goto L35
            java.lang.Object r9 = r0.read
            java.lang.String r9 = (java.lang.String) r9
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)     // Catch: java.lang.Exception -> L32
            goto L87
        L32:
            r10 = move-exception
            goto L8e
        L35:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r9)
            r9 = 0
            return r9
        L3c:
            java.lang.Object r9 = r0.read
            o.accesssetInstancecp r9 = (o.accesssetInstancecp) r9
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)     // Catch: java.lang.Exception -> L69
            goto L5f
        L44:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            r10 = r9
            com.google.firebase.installations.FirebaseInstallations r10 = (com.google.firebase.installations.FirebaseInstallations) r10     // Catch: java.lang.Exception -> L69
            com.google.android.gms.tasks.zzw r9 = r10.read()     // Catch: java.lang.Exception -> L69
            r9.getClass()     // Catch: java.lang.Exception -> L67
            r0.read = r10     // Catch: java.lang.Exception -> L67
            r0.IconCompatParcelizer = r5     // Catch: java.lang.Exception -> L67
            java.lang.Object r9 = kotlin.ranges.RangesKt.await(r9, r0)     // Catch: java.lang.Exception -> L67
            if (r9 != r1) goto L5c
            goto L86
        L5c:
            r7 = r10
            r10 = r9
            r9 = r7
        L5f:
            o.AccessibilityIterators r10 = (o.AccessibilityIterators) r10     // Catch: java.lang.Exception -> L69
            java.lang.String r10 = r10.IconCompatParcelizer     // Catch: java.lang.Exception -> L69
            r7 = r10
            r10 = r9
            r9 = r7
            goto L73
        L67:
            r9 = move-exception
            goto L6d
        L69:
            r10 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L6d:
            java.lang.String r2 = "Error getting authentication token."
            io.sentry.android.core.SentryLogcatAdapter.write(r3, r2, r9)
            r9 = r6
        L73:
            com.google.firebase.installations.FirebaseInstallations r10 = (com.google.firebase.installations.FirebaseInstallations) r10     // Catch: java.lang.Exception -> L32
            com.google.android.gms.tasks.zzw r10 = r10.write()     // Catch: java.lang.Exception -> L32
            r10.getClass()     // Catch: java.lang.Exception -> L32
            r0.read = r9     // Catch: java.lang.Exception -> L32
            r0.IconCompatParcelizer = r4     // Catch: java.lang.Exception -> L32
            java.lang.Object r10 = kotlin.ranges.RangesKt.await(r10, r0)     // Catch: java.lang.Exception -> L32
            if (r10 != r1) goto L87
        L86:
            return r1
        L87:
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L32
            if (r10 != 0) goto L8c
            goto L93
        L8c:
            r6 = r10
            goto L93
        L8e:
            java.lang.String r0 = "Error getting Firebase installation id ."
            io.sentry.android.core.SentryLogcatAdapter.write(r3, r0, r10)
        L93:
            o.onInitializeAccessibilityNodeInfo r10 = new o.onInitializeAccessibilityNodeInfo
            r10.<init>(r6, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.InstallationId$Companion.create(o.accesssetInstancecp, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
