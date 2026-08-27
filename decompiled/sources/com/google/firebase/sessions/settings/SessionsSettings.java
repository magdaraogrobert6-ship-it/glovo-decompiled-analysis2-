package com.google.firebase.sessions.settings;

import o.boundsInScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class SessionsSettings {
    public final boundsInScreen RemoteActionCompatParcelizer;
    public final boundsInScreen serializer;

    public final double RemoteActionCompatParcelizer() {
        Double dIconCompatParcelizer = this.serializer.IconCompatParcelizer();
        if (dIconCompatParcelizer != null) {
            double dDoubleValue = dIconCompatParcelizer.doubleValue();
            if (0.0d <= dDoubleValue && dDoubleValue <= 1.0d) {
                return dDoubleValue;
            }
        }
        Double dIconCompatParcelizer2 = this.RemoteActionCompatParcelizer.IconCompatParcelizer();
        if (dIconCompatParcelizer2 != null) {
            double dDoubleValue2 = dIconCompatParcelizer2.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                return dDoubleValue2;
            }
        }
        return 1.0d;
    }

    public SessionsSettings(boundsInScreen boundsinscreen, boundsInScreen boundsinscreen2) {
        boundsinscreen.getClass();
        boundsinscreen2.getClass();
        this.serializer = boundsinscreen;
        this.RemoteActionCompatParcelizer = boundsinscreen2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r7.updateSettings(r0) == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateSettings(kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof o.accesssemanticsNodeIdToAccessibilityVirtualNodeId
            if (r0 == 0) goto L13
            r0 = r7
            o.accesssemanticsNodeIdToAccessibilityVirtualNodeId r0 = (o.accesssemanticsNodeIdToAccessibilityVirtualNodeId) r0
            int r1 = r0.serializer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.serializer = r1
            goto L18
        L13:
            o.accesssemanticsNodeIdToAccessibilityVirtualNodeId r0 = new o.accesssemanticsNodeIdToAccessibilityVirtualNodeId
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.RemoteActionCompatParcelizer
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.serializer
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L31
            if (r2 != r3) goto L2b
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r7)
            goto L55
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r7)
            return r4
        L31:
            com.google.firebase.sessions.settings.SessionsSettings r2 = r0.IconCompatParcelizer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r7)
            goto L48
        L37:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r7)
            r0.IconCompatParcelizer = r6
            r0.serializer = r5
            o.boundsInScreen r7 = r6.serializer
            java.lang.Object r7 = r7.updateSettings(r0)
            if (r7 != r1) goto L47
            goto L54
        L47:
            r2 = r6
        L48:
            o.boundsInScreen r7 = r2.RemoteActionCompatParcelizer
            r0.IconCompatParcelizer = r4
            r0.serializer = r3
            java.lang.Object r7 = r7.updateSettings(r0)
            if (r7 != r1) goto L55
        L54:
            return r1
        L55:
            o.createFromParcel r7 = o.createFromParcel.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.SessionsSettings.updateSettings(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
