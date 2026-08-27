package o;

import android.app.Application;
import com.google.firebase.inappmessaging.internal.AnalyticsEventsManager;
import com.google.firebase.inappmessaging.internal.ImpressionStorageClient;
import com.google.firebase.inappmessaging.internal.RateLimiterClient;
import io.reactivex.flowables.ConnectableFlowable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class resolveComposeViewContext implements getTextInputServiceannotations {
    public final /* synthetic */ int read;
    public final onAttachedToWindowlambda0 serializer;

    public /* synthetic */ resolveComposeViewContext(onAttachedToWindowlambda0 onattachedtowindowlambda0, int i) {
        this.read = i;
        this.serializer = onattachedtowindowlambda0;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = this.read;
        onAttachedToWindowlambda0 onattachedtowindowlambda0 = this.serializer;
        switch (i) {
            case 0:
                getShowLayoutBoundsannotations getshowlayoutboundsannotations = (getShowLayoutBoundsannotations) onattachedtowindowlambda0.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.write();
                setNativeShader.write(getshowlayoutboundsannotations);
                return getshowlayoutboundsannotations;
            case 1:
                logTree logtree = (logTree) onattachedtowindowlambda0.IconCompatParcelizer.write();
                setNativeShader.write(logtree);
                return logtree;
            case 2:
                AnalyticsEventsManager analyticsEventsManager = (AnalyticsEventsManager) onattachedtowindowlambda0.MediaMetadataCompat.write();
                setNativeShader.write(analyticsEventsManager);
                return analyticsEventsManager;
            case 3:
                ConnectableFlowable connectableFlowable = (ConnectableFlowable) onattachedtowindowlambda0.MediaBrowserCompatMediaItem.write();
                setNativeShader.write(connectableFlowable);
                return connectableFlowable;
            case 4:
                Application application = (Application) onattachedtowindowlambda0.MediaSessionCompatQueueItem.write();
                setNativeShader.write(application);
                return application;
            case 5:
                Executor executor = (Executor) onattachedtowindowlambda0.RatingCompat.write();
                setNativeShader.write(executor);
                return executor;
            case 6:
                TouchBoundsExpansionKt touchBoundsExpansionKt = (TouchBoundsExpansionKt) onattachedtowindowlambda0.read.write();
                setNativeShader.write(touchBoundsExpansionKt);
                return touchBoundsExpansionKt;
            case 7:
                TraversableNodeCompanion traversableNodeCompanion = (TraversableNodeCompanion) onattachedtowindowlambda0.serializer.write();
                setNativeShader.write(traversableNodeCompanion);
                return traversableNodeCompanion;
            case 8:
                hasui hasuiVar = (hasui) onattachedtowindowlambda0.ComponentActivity.write();
                setNativeShader.write(hasuiVar);
                return hasuiVar;
            case 9:
                parseJsonObjectIntoBundlelambda0 parsejsonobjectintobundlelambda0 = (parseJsonObjectIntoBundlelambda0) onattachedtowindowlambda0.MediaSessionCompatResultReceiverWrapper.write();
                setNativeShader.write(parsejsonobjectintobundlelambda0);
                return parsejsonobjectintobundlelambda0;
            case 10:
                ImpressionStorageClient impressionStorageClient = (ImpressionStorageClient) onattachedtowindowlambda0.write.write();
                setNativeShader.write(impressionStorageClient);
                return impressionStorageClient;
            case 11:
                Executor executor2 = (Executor) onattachedtowindowlambda0.MediaSessionCompatToken.write();
                setNativeShader.write(executor2);
                return executor2;
            case 12:
                ConnectableFlowable connectableFlowable2 = (ConnectableFlowable) onattachedtowindowlambda0.ParcelableVolumeInfo.write();
                setNativeShader.write(connectableFlowable2);
                return connectableFlowable2;
            case 13:
                tagKey tagkey = (tagKey) onattachedtowindowlambda0.PlaybackStateCompatCustomAction.write();
                setNativeShader.write(tagkey);
                return tagkey;
            case 14:
                WeakReference weakReference = (WeakReference) onattachedtowindowlambda0.RemoteActionCompatParcelizer.write();
                setNativeShader.write(weakReference);
                return weakReference;
            default:
                RateLimiterClient rateLimiterClient = (RateLimiterClient) onattachedtowindowlambda0.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write();
                setNativeShader.write(rateLimiterClient);
                return rateLimiterClient;
        }
    }
}
