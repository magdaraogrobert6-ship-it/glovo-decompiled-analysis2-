package o;

import com.deliveryhero.perseus.common.Coroutines$Companion$channel$1$1;
import io.sentry.util.UrlUtils;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getViewportWidth {
    public static final BufferedChannel read;
    public static final ContextScope serializer;

    static {
        ContextScope contextScopeRemoteActionCompatParcelizer = YieldKt.RemoteActionCompatParcelizer(UrlUtils.serializer());
        serializer = contextScopeRemoteActionCompatParcelizer;
        BufferedChannel bufferedChannelIconCompatParcelizer = androidx.sqlite.SQLite.IconCompatParcelizer(Integer.MAX_VALUE, 6, (IInAppMessageViewWrapper) null);
        BuildersKt.RemoteActionCompatParcelizer(contextScopeRemoteActionCompatParcelizer, null, null, new Coroutines$Companion$channel$1$1(bufferedChannelIconCompatParcelizer, null), 3);
        read = bufferedChannelIconCompatParcelizer;
    }
}
