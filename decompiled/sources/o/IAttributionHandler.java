package o;

import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import com.roadrunner.rider.state.provider.database.dao.WorkOpportunityDao;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class IAttributionHandler extends AdaptedFunctionReference implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 1;
    public static final IAttributionHandler RemoteActionCompatParcelizer = new IAttributionHandler(WorkOpportunityDao.class, "getWorkOpportunities", "getWorkOpportunities()Lkotlinx/coroutines/flow/Flow;");
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = IconCompatParcelizer + 19;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        resolveClass resolveclass = (resolveClass) ((WorkOpportunityDao) obj);
        FlowUtil$createFlow$$inlined$map$1 flowUtil$createFlow$$inlined$map$1RemoteActionCompatParcelizer = DelayKt.RemoteActionCompatParcelizer(resolveclass.serializer, false, new String[]{"work_opportunity"}, new r8lambdaaj64OZVyd1y4RKHlJSx10F9bUic(4, resolveclass));
        int i2 = serializer + 35;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return flowUtil$createFlow$$inlined$map$1RemoteActionCompatParcelizer;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    public IAttributionHandler(Class cls, String str, String str2) {
        super(cls, str, str2);
    }
}
