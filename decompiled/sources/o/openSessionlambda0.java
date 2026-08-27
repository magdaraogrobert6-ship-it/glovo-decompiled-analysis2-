package o;

import com.roadrunner.networking.errormapper.NetworkErrorMapperImpl;
import com.roadrunner.startworking.oneclick.navigation.StartWorkingNavigationUiModelImpl;
import io.grpc.internal.CallTracer;
import io.grpc.internal.SharedResourcePool;
import io.sentry.JsonObjectSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class openSessionlambda0 {
    private static int read = 0;
    private static int write = 1;
    public final _get_messageWebView_lambda0 serializer;

    public openSessionlambda0(_get_messageWebView_lambda0 _get_messagewebview_lambda0) {
        this.serializer = _get_messagewebview_lambda0;
    }

    public final StartWorkingNavigationUiModelImpl serializer(getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        int i = 2 % 2;
        _get_messageWebView_lambda0 _get_messagewebview_lambda0 = this.serializer;
        StartWorkingNavigationUiModelImpl startWorkingNavigationUiModelImpl = new StartWorkingNavigationUiModelImpl((CallTracer) ((performPushDeliveryFlushlambda0) _get_messagewebview_lambda0.write).write(), (SharedResourcePool) ((requestSingleLocationUpdatelambda1) _get_messagewebview_lambda0.RemoteActionCompatParcelizer).write(), (NetworkErrorMapperImpl) ((mergeJsonObjects) _get_messagewebview_lambda0.serializer).write(), (JsonObjectSerializer) ((requestSingleLocationUpdatelambda1) _get_messagewebview_lambda0.IconCompatParcelizer).write(), (transferSessionPackageI) ((mergeJsonObjects) _get_messagewebview_lambda0.read).write(), new getQueryContext(), getcontentviewgroupparentlayout);
        int i2 = read + 19;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return startWorkingNavigationUiModelImpl;
    }
}
