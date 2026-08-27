package o;

import io.sentry.SentryOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class UriActionExternalSyntheticLambda1 implements onErrorlambda0 {
    public final SentryOptions write;

    public /* synthetic */ UriActionExternalSyntheticLambda1(SentryOptions sentryOptions) {
        this.write = sentryOptions;
    }

    public static Boolean RemoteActionCompatParcelizer(String str, List list, List list2) {
        if (str == null || str.isEmpty()) {
            return Boolean.TRUE;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (str.startsWith((String) it.next())) {
                return Boolean.TRUE;
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            if (str.startsWith((String) it2.next())) {
                return Boolean.FALSE;
            }
        }
        return null;
    }

    public ArrayList serializer(StackTraceElement[] stackTraceElementArr, boolean z) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement != null) {
                String className = stackTraceElement.getClassName();
                if (z || !className.startsWith("io.sentry.") || className.startsWith("io.sentry.samples.") || className.startsWith("io.sentry.mobile.")) {
                    io.sentry.protocol.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 r8lambdah6vvr6zuwa2u1fe0kskpogpr28 = new io.sentry.protocol.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    SentryOptions sentryOptions = this.write;
                    r8lambdah6vvr6zuwa2u1fe0kskpogpr28.MediaSessionCompatQueueItem = RemoteActionCompatParcelizer(className, sentryOptions.getInAppIncludes(), sentryOptions.getInAppExcludes());
                    r8lambdah6vvr6zuwa2u1fe0kskpogpr28.PlaybackStateCompat = className;
                    r8lambdah6vvr6zuwa2u1fe0kskpogpr28.MediaBrowserCompatMediaItem = stackTraceElement.getMethodName();
                    r8lambdah6vvr6zuwa2u1fe0kskpogpr28.MediaMetadataCompat = stackTraceElement.getFileName();
                    if (stackTraceElement.getLineNumber() >= 0) {
                        r8lambdah6vvr6zuwa2u1fe0kskpogpr28.PlaybackStateCompatCustomAction = Integer.valueOf(stackTraceElement.getLineNumber());
                    }
                    r8lambdah6vvr6zuwa2u1fe0kskpogpr28.write = Boolean.valueOf(stackTraceElement.isNativeMethod());
                    arrayList.add(r8lambdah6vvr6zuwa2u1fe0kskpogpr28);
                    if (arrayList.size() >= 100) {
                        break;
                    }
                }
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    @Override // o.onErrorlambda0
    public boolean IconCompatParcelizer() {
        return BannerViewcreateBannerWebViewClientListener1.RemoteActionCompatParcelizer().read(this.write.getFatalLogger());
    }
}
