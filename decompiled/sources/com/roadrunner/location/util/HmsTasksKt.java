package com.roadrunner.location.util;

import androidx.compose.ui.graphics.Fields;
import coil3.network.okhttp.internal.CallsKt$await$2$2;
import com.roadrunner.home.nest.divider.DividerUiModelImpl$1;
import io.grpc.LoadBalancer$Helper;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CancellableContinuationImpl;
import o.ExecutableQuery;
import o.PaddingKt;
import o.TrackpadScrollingLogic;
import o.TransformGestureDetectorKtdetectTransformGestures2;
import o.ViewLayerUniqueDrawingIdApi29;
import o.accessgetViewRootjd;
import o.requiredSizeInqDBjuR0default;
import o.resetClipBounds;
import o.setShouldUseDispatchDrawui;

/* JADX INFO: loaded from: classes3.dex */
public abstract class HmsTasksKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;

    public static final Object await(setShouldUseDispatchDrawui setshouldusedispatchdrawui, DividerUiModelImpl$1 dividerUiModelImpl$1) throws Exception {
        boolean z;
        ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi29 = (ViewLayerUniqueDrawingIdApi29) setshouldusedispatchdrawui;
        synchronized (viewLayerUniqueDrawingIdApi29.read) {
            z = viewLayerUniqueDrawingIdApi29.write;
        }
        if (!z) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(dividerUiModelImpl$1));
            cancellableContinuationImpl.read();
            viewLayerUniqueDrawingIdApi29.read((resetClipBounds) new accessgetViewRootjd(ExecutableQuery.RemoteActionCompatParcelizer, new CallsKt$await$2$2(cancellableContinuationImpl, 9)));
            Object result = cancellableContinuationImpl.getResult();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return result;
        }
        Exception exc = setshouldusedispatchdrawui.read();
        if (exc != null) {
            throw exc;
        }
        if (!viewLayerUniqueDrawingIdApi29.serializer) {
            return setshouldusedispatchdrawui.IconCompatParcelizer();
        }
        throw new CancellationException("Task " + setshouldusedispatchdrawui + " was cancelled normally.");
    }

    public static final long serializer(PaddingKt paddingKt) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 83;
        write = i2 % Fields.SpotShadowColor;
        long jSerializer = i2 % 2 != 0 ? paddingKt.serializer() ^ 1000000 : paddingKt.serializer() / 1000000;
        int i3 = write + 31;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 57 / 0;
        }
        return jSerializer;
    }

    public static final PaddingKt read(TrackpadScrollingLogic trackpadScrollingLogic, requiredSizeInqDBjuR0default requiredsizeinqdbjur0default, Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        PaddingKt paddingKt = new PaddingKt(trackpadScrollingLogic, requiredsizeinqdbjur0default, obj, obj2, (TransformGestureDetectorKtdetectTransformGestures2) requiredsizeinqdbjur0default.serializer.invoke(obj3));
        int i2 = RemoteActionCompatParcelizer + 123;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return paddingKt;
    }
}
