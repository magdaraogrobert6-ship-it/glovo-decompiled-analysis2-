package bo.app;

import android.content.Context;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DataStoreKey;

/* JADX INFO: loaded from: classes.dex */
public final class cd implements x9 {
    public final BrazeConfigurationProvider a;
    public final dd b;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r0 != r2.intValue()) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b() {
        /*
            r12 = this;
            monitor-enter(r12)
            com.braze.configuration.BrazeConfigurationProvider r0 = r12.a     // Catch: java.lang.Throwable -> La7
            boolean r0 = r0.isFirebaseCloudMessagingRegistrationEnabled()     // Catch: java.lang.Throwable -> La7
            r1 = 0
            if (r0 != 0) goto L12
            com.braze.configuration.BrazeConfigurationProvider r0 = r12.a     // Catch: java.lang.Throwable -> La7
            boolean r0 = r0.isAdmMessagingRegistrationEnabled()     // Catch: java.lang.Throwable -> La7
            if (r0 == 0) goto L4a
        L12:
            bo.app.dd r0 = r12.b     // Catch: java.lang.Throwable -> La7
            com.braze.enums.DataStoreKey r2 = com.braze.enums.DataStoreKey.PUSH_REGISTRATION_VERSION_CODE     // Catch: java.lang.Throwable -> La7
            boolean r0 = r0.contains(r2)     // Catch: java.lang.Throwable -> La7
            if (r0 == 0) goto L4a
            com.braze.configuration.BrazeConfigurationProvider r0 = r12.a     // Catch: java.lang.Throwable -> La7
            int r0 = r0.getVersionCode()     // Catch: java.lang.Throwable -> La7
            bo.app.dd r3 = r12.b     // Catch: java.lang.Throwable -> La7
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> La7
            java.lang.Integer r2 = r3.readInt(r2, r4)     // Catch: java.lang.Throwable -> La7
            if (r2 != 0) goto L31
            goto L37
        L31:
            int r3 = r2.intValue()     // Catch: java.lang.Throwable -> La7
            if (r0 == r3) goto L4a
        L37:
            com.braze.support.BrazeLogger r4 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Throwable -> La7
            com.braze.support.BrazeLogger$Priority r6 = com.braze.support.BrazeLogger.Priority.V     // Catch: java.lang.Throwable -> La7
            bo.app.cd$$ExternalSyntheticLambda0 r9 = new bo.app.cd$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> La7
            r9.<init>(r2, r0)     // Catch: java.lang.Throwable -> La7
            r7 = 0
            r8 = 0
            r10 = 6
            r11 = 0
            r5 = r12
            com.braze.support.BrazeLogger.brazelog$default(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> La7
            monitor-exit(r12)
            return r1
        L4a:
            bo.app.dd r0 = r12.b     // Catch: java.lang.Throwable -> La7
            com.braze.enums.DataStoreKey r2 = com.braze.enums.DataStoreKey.PUSH_REGISTRATION_PERSISTENT_DEVICE_ID     // Catch: java.lang.Throwable -> La7
            boolean r0 = r0.contains(r2)     // Catch: java.lang.Throwable -> La7
            if (r0 == 0) goto L9d
            bo.app.dd r0 = r12.b     // Catch: java.lang.Throwable -> La7
            java.lang.String r3 = ""
            java.lang.String r0 = r0.readString(r2, r3)     // Catch: java.lang.Throwable -> La7
            r2 = 722989291(0x2b17f0eb, float:5.398032E-13)
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> La7
            java.lang.Object[] r8 = new java.lang.Object[]{r2, r0}     // Catch: java.lang.Throwable -> La7
            int r3 = o.getCieXyz.write()     // Catch: java.lang.Throwable -> La7
            int r7 = o.getCieXyz.write()     // Catch: java.lang.Throwable -> La7
            int r9 = o.getCieXyz.write()     // Catch: java.lang.Throwable -> La7
            int r6 = o.getCieXyz.write()     // Catch: java.lang.Throwable -> La7
            r4 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r5 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            java.lang.Object r0 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> La7
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> La7
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> La7
            if (r0 != 0) goto L9d
            com.braze.support.BrazeLogger r2 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Throwable -> La7
            com.braze.support.BrazeLogger$Priority r4 = com.braze.support.BrazeLogger.Priority.I     // Catch: java.lang.Throwable -> La7
            bo.app.c8$$ExternalSyntheticLambda1 r7 = new bo.app.c8$$ExternalSyntheticLambda1     // Catch: java.lang.Throwable -> La7
            r0 = 2
            r7.<init>(r0)     // Catch: java.lang.Throwable -> La7
            r5 = 0
            r6 = 0
            r8 = 6
            r9 = 0
            r3 = r12
            com.braze.support.BrazeLogger.brazelog$default(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> La7
            monitor-exit(r12)
            return r1
        L9d:
            bo.app.dd r0 = r12.b     // Catch: java.lang.Throwable -> La7
            com.braze.enums.DataStoreKey r2 = com.braze.enums.DataStoreKey.PUSH_REGISTRATION_ID_KEY     // Catch: java.lang.Throwable -> La7
            java.lang.String r0 = r0.readString(r2, r1)     // Catch: java.lang.Throwable -> La7
            monitor-exit(r12)
            return r0
        La7:
            r0 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> La7
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.app.cd.b():java.lang.String");
    }

    public cd(Context context, BrazeConfigurationProvider brazeConfigurationProvider) {
        context.getClass();
        brazeConfigurationProvider.getClass();
        this.a = brazeConfigurationProvider;
        this.b = new dd(context);
    }

    public final void a(String str) {
        synchronized (this) {
            try {
                if (str == null) {
                    throw new NullPointerException("Provided push token is null. Cannot set null push token.");
                }
                this.b.writeData(DataStoreKey.PUSH_REGISTRATION_ID_KEY, str);
                this.b.writeData(DataStoreKey.PUSH_REGISTRATION_VERSION_CODE, Integer.valueOf(this.a.getVersionCode()));
                this.b.writeData(DataStoreKey.PUSH_REGISTRATION_PERSISTENT_DEVICE_ID, String.valueOf(722989291));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final String a() {
        return "Device identifier differs from saved device identifier. Returning null token.";
    }

    public static final String a(Integer num, int i) {
        return "Stored push registration ID version code " + num + " does not match live version code " + i + ". Not returning saved registration ID.";
    }
}
