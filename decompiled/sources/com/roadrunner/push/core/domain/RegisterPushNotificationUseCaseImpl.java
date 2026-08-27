package com.roadrunner.push.core.domain;

import androidx.work.impl.WorkManagerImpl;
import com.roadrunner.auth.domain.token.IsUserAuthenticatedWrapper;
import dagger.Lazy;
import io.sentry.util.network.NetworkBody;
import o.access1200;
import o.access800;

/* JADX INFO: loaded from: classes3.dex */
public final class RegisterPushNotificationUseCaseImpl {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public final NetworkBody IconCompatParcelizer;
    public final WorkManagerImpl MediaDescriptionCompat;
    public final access1200 RemoteActionCompatParcelizer;
    public final IsUserAuthenticatedWrapper read;
    public final Lazy serializer;
    public final access800 write;

    public RegisterPushNotificationUseCaseImpl(access800 access800Var, Lazy lazy, IsUserAuthenticatedWrapper isUserAuthenticatedWrapper, WorkManagerImpl workManagerImpl, access1200 access1200Var, NetworkBody networkBody) {
        lazy.getClass();
        workManagerImpl.getClass();
        this.write = access800Var;
        this.serializer = lazy;
        this.read = isUserAuthenticatedWrapper;
        this.MediaDescriptionCompat = workManagerImpl;
        this.RemoteActionCompatParcelizer = access1200Var;
        this.IconCompatParcelizer = networkBody;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:56:0x0110 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x0112 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0114  */
    /* JADX WARN: Code duplicated, block: B:59:0x0125  */
    /* JADX WARN: Code duplicated, block: B:61:0x0129  */
    /* JADX WARN: Code duplicated, block: B:62:0x014b  */
    /* JADX WARN: Code duplicated, block: B:64:0x016e  */
    /* JADX WARN: Code duplicated, block: B:66:0x017d A[Catch: Exception -> 0x0067, TRY_ENTER, TryCatch #0 {Exception -> 0x0067, blocks: (B:66:0x017d, B:69:0x018d, B:23:0x0062), top: B:77:0x0041 }] */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ac, code lost:
    
        if (r0 == r4) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x018a, code lost:
    
        if (r0 == r4) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(kotlin.coroutines.jvm.internal.ContinuationImpl r27) {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.push.core.domain.RegisterPushNotificationUseCaseImpl.invoke(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
