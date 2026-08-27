package o;

import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ILogger extends AdaptedFunctionReference implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public static final ILogger IconCompatParcelizer = new ILogger(Logger.class, "observeStatus", "observeStatus()Lkotlinx/coroutines/flow/Flow;");
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;

    static {
        int i = write + 1;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        getSignedData getsigneddata = (getSignedData) ((Logger) obj);
        FlowUtil$createFlow$$inlined$map$1 flowUtil$createFlow$$inlined$map$1RemoteActionCompatParcelizer = DelayKt.RemoteActionCompatParcelizer(getsigneddata.read, false, new String[]{"status"}, new r8lambdaaj64OZVyd1y4RKHlJSx10F9bUic(3, getsigneddata));
        int i2 = serializer + 83;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return flowUtil$createFlow$$inlined$map$1RemoteActionCompatParcelizer;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    public ILogger(Class cls, String str, String str2) {
        super(cls, str, str2);
    }
}
