package com.deliveryhero.perseus.logger;

import coil3.compose.AsyncImagePainter$launchJob$1;
import io.sentry.android.core.SentryLogcatAdapter;
import io.sentry.util.UrlUtils;
import java.util.ArrayList;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.internal.ContextScope;
import o.ShortNewsContentCardView;
import o.onContentCardClicked;
import o.r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI;

/* JADX INFO: loaded from: classes2.dex */
public final class PerseusLogger {
    public final ContextScope IconCompatParcelizer = YieldKt.RemoteActionCompatParcelizer(UrlUtils.serializer());
    public final r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI read;

    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:32:0x007d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x008a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0096, code lost:
    
        if (r6 == r7) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$refreshMetadata(com.deliveryhero.perseus.logger.PerseusLogger r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            o.r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r0 = r6.read
            boolean r1 = r7 instanceof o.setTrimPathOffset
            if (r1 == 0) goto L15
            r1 = r7
            o.setTrimPathOffset r1 = (o.setTrimPathOffset) r1
            int r2 = r1.RemoteActionCompatParcelizer
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 + r3
            r1.RemoteActionCompatParcelizer = r2
            goto L1a
        L15:
            o.setTrimPathOffset r1 = new o.setTrimPathOffset
            r1.<init>(r6, r7)
        L1a:
            java.lang.Object r6 = r1.serializer
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r1.RemoteActionCompatParcelizer
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L31
            o.r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r0 = r1.write
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r6)
            goto L99
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r6)
            r6 = 0
            return r6
        L38:
            o.r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r2 = r1.write
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r6)
            goto L7e
        L3e:
            o.r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r2 = r1.write
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r6)
            goto L64
        L44:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r6)
            android.content.Context r6 = o.pauseWebviewIfNecessarylambda10.IconCompatParcelizer
            if (r6 == 0) goto La3
            com.deliveryhero.perseus.core.config.DefaultPerseusConfigProvider r6 = o.updateRenderPath.MediaSessionCompatQueueItem
            r6.getClass()
            boolean r2 = com.deliveryhero.perseus.core.config.DefaultPerseusConfigProvider.RemoteActionCompatParcelizer()
            if (r2 == 0) goto La3
            if (r0 == 0) goto L6c
            r1.write = r0
            r1.RemoteActionCompatParcelizer = r5
            java.lang.Object r6 = r6.getConfig(r1)
            if (r6 != r7) goto L63
            goto L98
        L63:
            r2 = r0
        L64:
            com.deliveryhero.perseus.PerseusParamsConfig r6 = (com.deliveryhero.perseus.PerseusParamsConfig) r6
            boolean r6 = r6.getDebuggable()
            r2.RemoteActionCompatParcelizer = r6
        L6c:
            if (r0 == 0) goto L88
            com.deliveryhero.perseus.core.session.ClientIdProviderImpl r6 = o.updateRenderPath.read()
            r1.write = r0
            r1.RemoteActionCompatParcelizer = r4
            java.lang.Object r6 = r6.getClientId(r1)
            if (r6 != r7) goto L7d
            goto L98
        L7d:
            r2 = r0
        L7e:
            java.lang.String r6 = (java.lang.String) r6
            r2.getClass()
            r6.getClass()
            r2.read = r6
        L88:
            if (r0 == 0) goto La3
            com.deliveryhero.perseus.core.session.AppSessionManagerImpl r6 = o.updateRenderPath.IconCompatParcelizer()
            r1.write = r0
            r1.RemoteActionCompatParcelizer = r3
            java.lang.Object r6 = r6.getUserSessionId(r1)
            if (r6 != r7) goto L99
        L98:
            return r7
        L99:
            java.lang.String r6 = (java.lang.String) r6
            r0.getClass()
            r6.getClass()
            r0.write = r6
        La3:
            o.createFromParcel r6 = o.createFromParcel.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.deliveryhero.perseus.logger.PerseusLogger.access$refreshMetadata(com.deliveryhero.perseus.logger.PerseusLogger, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public PerseusLogger() {
        try {
            r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = new r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(5);
            r8lambdalmkbrrgswwtv97obrsj7trj7ai.read = "";
            r8lambdalmkbrrgswwtv97obrsj7trj7ai.write = "";
            r8lambdalmkbrrgswwtv97obrsj7trj7ai.RemoteActionCompatParcelizer = true;
            r8lambdalmkbrrgswwtv97obrsj7trj7ai.serializer = new ArrayList();
            this.read = r8lambdalmkbrrgswwtv97obrsj7trj7ai;
        } catch (NoClassDefFoundError unused) {
            SentryLogcatAdapter.IconCompatParcelizer("perseus", "no logging library is detected. revert to no-op.");
        }
    }

    public final void RemoteActionCompatParcelizer(String str, Throwable th) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        stackTrace.getClass();
        BuildersKt.RemoteActionCompatParcelizer(this.IconCompatParcelizer, null, null, new PerseusLogger$e$1(th, str, onContentCardClicked.serializer(stackTrace, "\n\t", null, null, 62), this, (ShortNewsContentCardView) null), 3);
    }

    public final void write(String str, Throwable th) {
        BuildersKt.RemoteActionCompatParcelizer(this.IconCompatParcelizer, null, null, new PerseusLogger$w$1(this, str, th, null, 0), 3);
    }

    public static void IconCompatParcelizer(PerseusLogger perseusLogger, String str) {
        BuildersKt.RemoteActionCompatParcelizer(perseusLogger.IconCompatParcelizer, null, null, new AsyncImagePainter$launchJob$1(perseusLogger, str, null, null, 13), 3);
    }
}
