package coil3.util;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.grpc.LoadBalancer$Helper;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CancellableContinuationImpl;
import o.accessclearShadowCache;
import o.accessgetButtcp;
import o.accessgetSquarecp;
import o.accessregisterComponentCallback;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.supportsColorMatrixQuery;
import o.toColorLong8_81llA;

/* JADX INFO: loaded from: classes.dex */
public abstract class LifecyclesKt {
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object awaitStarted(supportsColorMatrixQuery supportscolormatrixquery, ContinuationImpl continuationImpl) throws Throwable {
        accessgetSquarecp accessgetsquarecp;
        supportsColorMatrixQuery supportscolormatrixquery2;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber;
        Throwable th;
        accessclearShadowCache accessclearshadowcache;
        accessclearShadowCache accessclearshadowcache2;
        if (continuationImpl instanceof accessgetSquarecp) {
            accessgetsquarecp = (accessgetSquarecp) continuationImpl;
            int i = accessgetsquarecp.serializer;
            if ((i & Integer.MIN_VALUE) != 0) {
                accessgetsquarecp.serializer = i - Integer.MIN_VALUE;
            } else {
                accessgetsquarecp = new accessgetSquarecp(continuationImpl);
            }
        } else {
            accessgetsquarecp = new accessgetSquarecp(continuationImpl);
        }
        Object obj = accessgetsquarecp.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = accessgetsquarecp.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (!((accessregisterComponentCallback) supportscolormatrixquery).RatingCompat.isAtLeast(toColorLong8_81llA.STARTED)) {
                createInAppMessageEventSubscriber createinappmessageeventsubscriber2 = new createInAppMessageEventSubscriber();
                try {
                    accessgetsquarecp.write = supportscolormatrixquery;
                    accessgetsquarecp.IconCompatParcelizer = createinappmessageeventsubscriber2;
                    accessgetsquarecp.serializer = 1;
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(accessgetsquarecp));
                    cancellableContinuationImpl.read();
                    accessgetButtcp accessgetbuttcp = new accessgetButtcp(cancellableContinuationImpl);
                    createinappmessageeventsubscriber2.IconCompatParcelizer = accessgetbuttcp;
                    supportscolormatrixquery.IconCompatParcelizer(accessgetbuttcp);
                    if (cancellableContinuationImpl.getResult() == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    supportscolormatrixquery2 = supportscolormatrixquery;
                    createinappmessageeventsubscriber = createinappmessageeventsubscriber2;
                    accessclearshadowcache2 = (accessclearShadowCache) createinappmessageeventsubscriber.IconCompatParcelizer;
                    if (accessclearshadowcache2 != null) {
                        supportscolormatrixquery2.read(accessclearshadowcache2);
                    }
                } catch (Throwable th2) {
                    supportscolormatrixquery2 = supportscolormatrixquery;
                    createinappmessageeventsubscriber = createinappmessageeventsubscriber2;
                    th = th2;
                    accessclearshadowcache = (accessclearShadowCache) createinappmessageeventsubscriber.IconCompatParcelizer;
                    if (accessclearshadowcache != null) {
                        supportscolormatrixquery2.read(accessclearshadowcache);
                    }
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            createinappmessageeventsubscriber = accessgetsquarecp.IconCompatParcelizer;
            supportscolormatrixquery2 = accessgetsquarecp.write;
            try {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                accessclearshadowcache2 = (accessclearShadowCache) createinappmessageeventsubscriber.IconCompatParcelizer;
                if (accessclearshadowcache2 != null) {
                    supportscolormatrixquery2.read(accessclearshadowcache2);
                }
            } catch (Throwable th3) {
                th = th3;
                accessclearshadowcache = (accessclearShadowCache) createinappmessageeventsubscriber.IconCompatParcelizer;
                if (accessclearshadowcache != null) {
                    supportscolormatrixquery2.read(accessclearshadowcache);
                }
                throw th;
            }
        }
        return createfromparcel;
    }
}
