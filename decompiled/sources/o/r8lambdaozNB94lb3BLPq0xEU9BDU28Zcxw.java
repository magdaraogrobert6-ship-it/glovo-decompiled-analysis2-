package o;

import coil3.ComponentRegistry$Builder;
import kotlinx.coroutines.internal.ContextScope;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaozNB94lb3BLPq0xEU9BDU28Zcxw {
    private static int read = 0;
    private static int serializer = 1;
    public final ComponentRegistry$Builder IconCompatParcelizer;

    public r8lambdaozNB94lb3BLPq0xEU9BDU28Zcxw(ComponentRegistry$Builder componentRegistry$Builder) {
        this.IconCompatParcelizer = componentRegistry$Builder;
    }

    public final r8lambdap8kVRPOrasFuL_ov_PvwbyBK_nY write(ContextScope contextScope) {
        int i = 2 % 2;
        ComponentRegistry$Builder componentRegistry$Builder = this.IconCompatParcelizer;
        r8lambdap8kVRPOrasFuL_ov_PvwbyBK_nY r8lambdap8kvrporasful_ov_pvwbybk_ny = new r8lambdap8kVRPOrasFuL_ov_PvwbyBK_nY(contextScope, (r8lambdaokZBgNnbR8K2i443J9b9JUwVwk) ((mergeJsonObjects) componentRegistry$Builder.write).write(), (r8lambdazJ_is40ErW_0zWXIHU0U2X8pyMM) ((mergeJsonObjects) componentRegistry$Builder.read).write(), (accessgetSdkEnablementProvidercp) ((mergeJsonObjects) componentRegistry$Builder.RemoteActionCompatParcelizer).write(), (dispatchChildDetached) ((mergeJsonObjects) componentRegistry$Builder.IconCompatParcelizer).write(), (OkHttpCall$1) ((r8lambdagJlqvKShRNmP25JfHDBcPsgUwKQ) componentRegistry$Builder.serializer).write());
        int i2 = serializer + 3;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return r8lambdap8kvrporasful_ov_pvwbybk_ny;
        }
        throw null;
    }
}
