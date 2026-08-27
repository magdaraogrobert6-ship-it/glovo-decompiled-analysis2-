package io.sentry.android.core.internal.util;

import io.sentry.android.core.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
import o.UriActionExternalSyntheticLambda4;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class IconCompatParcelizer implements Runnable {
    public final /* synthetic */ read serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ IconCompatParcelizer(read readVar, int i) {
        this.write = i;
        this.serializer = readVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.write;
        read readVar = this.serializer;
        if (i != 0) {
            readVar.RemoteActionCompatParcelizer(false);
            return;
        }
        readVar.RemoteActionCompatParcelizer(true);
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = read.IconCompatParcelizer.serializer();
        try {
            read.RemoteActionCompatParcelizer.clear();
            uriActionExternalSyntheticLambda4Serializer.close();
            UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer2 = read.serializer.serializer();
            try {
                read.write = null;
                uriActionExternalSyntheticLambda4Serializer2.close();
                r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.serializer.RemoteActionCompatParcelizer(readVar);
            } catch (Throwable th) {
                try {
                    uriActionExternalSyntheticLambda4Serializer2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
