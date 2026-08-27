package coil3.network.okhttp.internal;

import androidx.compose.ui.graphics.Fields;
import com.braze.BrazeUser;
import com.braze.events.IValueCallback;
import com.google.android.gms.tasks.OnFailureListener;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.bindgen.Expected;
import com.mapbox.navigation.core.internal.router.NavigationRouterRefreshError;
import com.mapbox.navigation.core.reroute.RouteRequestResult$Cancellation;
import com.mapbox.navigation.core.routerefresh.RouteRefresher$RouteRefreshResult$Fail;
import com.mapbox.navigation.navigator.internal.MapboxNativeNavigatorImpl$setRoutes$2$2$1;
import com.mapbox.navigator.ChangeLegCallback;
import com.mapbox.navigator.SetAlternativeRoutesCallback;
import com.mapbox.navigator.SetRouteCallback;
import com.mapbox.navigator.UpdateLocationCallback;
import java.io.IOException;
import java.util.List;
import kotlinx.coroutines.CancellableContinuationImpl;
import o.ViewLayerUniqueDrawingIdApi29;
import o._get_messageWebView_lambda1;
import o.getCameraDistancePx;
import o.getMessageTextView;
import o.getTransform3i98HWw;
import o.instance_delegatelambda0;
import o.isItemDismissable;
import o.l2ExternalSyntheticLambda7;
import o.onItemDismiss;
import o.onTouchEnded;
import o.setMessageImageView;
import o.setShouldUseDispatchDrawui;

/* JADX INFO: loaded from: classes.dex */
public final class CallsKt$await$2$2 implements setMessageImageView, SetAlternativeRoutesCallback, SetRouteCallback, ChangeLegCallback, UpdateLocationCallback, IValueCallback, OnFailureListener, getCameraDistancePx {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ CancellableContinuationImpl serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ CallsKt$await$2$2(CancellableContinuationImpl cancellableContinuationImpl, int i) {
        this.write = i;
        this.serializer = cancellableContinuationImpl;
    }

    @Override // o.setMessageImageView
    public void onResponse(getMessageTextView getmessagetextview, _get_messageWebView_lambda1 _get_messagewebview_lambda1) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 67;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.serializer.serializer(_get_messagewebview_lambda1, getTransform3i98HWw.serializer);
            int i3 = 82 / 0;
        } else {
            this.serializer.serializer(_get_messagewebview_lambda1, getTransform3i98HWw.serializer);
        }
        int i4 = RemoteActionCompatParcelizer + 33;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public void onFailure(NavigationRouterRefreshError navigationRouterRefreshError) {
        int i = 2 % 2;
        int i2 = read + 1;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        CancellableContinuationImpl cancellableContinuationImpl = this.serializer;
        if (cancellableContinuationImpl.RemoteActionCompatParcelizer() instanceof onTouchEnded) {
            cancellableContinuationImpl.resumeWith(new RouteRefresher$RouteRefreshResult$Fail(navigationRouterRefreshError));
            int i4 = read + 109;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 3 % 3;
            }
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        int i = 2 % 2;
        exc.getClass();
        this.serializer.resumeWith(new onItemDismiss(new isItemDismissable(exc)));
        int i2 = RemoteActionCompatParcelizer + 37;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.braze.events.IValueCallback
    public void onSuccess(Object obj) {
        int i = 2 % 2;
        BrazeUser brazeUser = (BrazeUser) obj;
        brazeUser.getClass();
        CancellableContinuationImpl cancellableContinuationImpl = this.serializer;
        if (cancellableContinuationImpl.RemoteActionCompatParcelizer() instanceof onTouchEnded) {
            int i2 = RemoteActionCompatParcelizer + 79;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            cancellableContinuationImpl.resumeWith(brazeUser.getUserId());
        }
        int i4 = RemoteActionCompatParcelizer + 119;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.setMessageImageView
    public void onFailure(getMessageTextView getmessagetextview, IOException iOException) {
        int i = 2 % 2;
        this.serializer.resumeWith(new isItemDismissable(iOException));
        int i2 = RemoteActionCompatParcelizer + 79;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public void onCanceled(RouteOptions routeOptions, String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 125;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        CancellableContinuationImpl cancellableContinuationImpl = this.serializer;
        routeOptions.getClass();
        if (i4 != 1) {
            cancellableContinuationImpl.resumeWith(new l2ExternalSyntheticLambda7(routeOptions, str));
            int i5 = RemoteActionCompatParcelizer + 51;
            read = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 79 / 0;
                return;
            }
            return;
        }
        if (cancellableContinuationImpl.RemoteActionCompatParcelizer() instanceof onTouchEnded) {
            int i7 = RemoteActionCompatParcelizer + 55;
            read = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                cancellableContinuationImpl.resumeWith(RouteRequestResult$Cancellation.INSTANCE);
            } else {
                cancellableContinuationImpl.resumeWith(RouteRequestResult$Cancellation.INSTANCE);
                throw null;
            }
        }
    }

    @Override // com.mapbox.navigator.SetAlternativeRoutesCallback, com.mapbox.navigator.SetRouteCallback
    public void run(Expected expected) {
        int i = 2 % 2;
        int i2 = read + 7;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        CancellableContinuationImpl cancellableContinuationImpl = this.serializer;
        expected.getClass();
        if (i4 != 3) {
            expected.onError(MapboxNativeNavigatorImpl$setRoutes$2$2$1.INSTANCE);
            cancellableContinuationImpl.resumeWith(expected);
            int i5 = read + 73;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return;
        }
        expected.onError(MapboxNativeNavigatorImpl$setRoutes$2$2$1.INSTANCE$1);
        Object obj = (List) expected.getValue();
        if (obj == null) {
            obj = instance_delegatelambda0.write;
        }
        cancellableContinuationImpl.resumeWith(obj);
    }

    @Override // o.getCameraDistancePx
    public void onComplete(setShouldUseDispatchDrawui setshouldusedispatchdrawui) {
        int i = 2 % 2;
        int i2 = read + 91;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Exception exc = setshouldusedispatchdrawui.read();
        if (exc != null) {
            this.serializer.resumeWith(new isItemDismissable(exc));
            return;
        }
        int i4 = RemoteActionCompatParcelizer + 79;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        boolean z = ((ViewLayerUniqueDrawingIdApi29) setshouldusedispatchdrawui).serializer;
        CancellableContinuationImpl cancellableContinuationImpl = this.serializer;
        if (!z) {
            cancellableContinuationImpl.resumeWith(setshouldusedispatchdrawui.IconCompatParcelizer());
            return;
        }
        int i6 = RemoteActionCompatParcelizer + 7;
        read = i6 % Fields.SpotShadowColor;
        Object obj = null;
        if (i6 % 2 != 0) {
            cancellableContinuationImpl.serializer((Throwable) null);
        } else {
            cancellableContinuationImpl.serializer((Throwable) null);
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.mapbox.navigator.ChangeLegCallback, com.mapbox.navigator.UpdateLocationCallback
    public void run(boolean z) {
        int i = 2 % 2;
        int i2 = read + 21;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Boolean.valueOf(z);
            throw null;
        }
        int i3 = this.write;
        CancellableContinuationImpl cancellableContinuationImpl = this.serializer;
        Boolean boolValueOf = Boolean.valueOf(z);
        if (i3 == 5) {
            cancellableContinuationImpl.resumeWith(boolValueOf);
            return;
        }
        cancellableContinuationImpl.resumeWith(boolValueOf);
        int i4 = read + 3;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}
