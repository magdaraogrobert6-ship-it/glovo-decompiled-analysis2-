package o;

import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import com.roadrunner.common.data.api.MapApiError$$ExternalSyntheticLambda1;
import com.roadrunner.rider.state.provider.database.dao.ShiftInfoDao;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class onSessionTrackingFailed extends AdaptedFunctionReference implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    public static final onSessionTrackingFailed write = new onSessionTrackingFailed(ShiftInfoDao.class, "getShiftInfo", "getShiftInfo()Lkotlinx/coroutines/flow/Flow;");

    static {
        int i = RemoteActionCompatParcelizer + 121;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        FlowUtil$createFlow$$inlined$map$1 flowUtil$createFlow$$inlined$map$1RemoteActionCompatParcelizer = DelayKt.RemoteActionCompatParcelizer(((getAndroidLogLevel) ((ShiftInfoDao) obj)).write, false, new String[]{"shift_info"}, new MapApiError$$ExternalSyntheticLambda1(28));
        int i2 = serializer + 1;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return flowUtil$createFlow$$inlined$map$1RemoteActionCompatParcelizer;
        }
        throw null;
    }

    public onSessionTrackingFailed(Class cls, String str, String str2) {
        super(cls, str, str2);
    }
}
