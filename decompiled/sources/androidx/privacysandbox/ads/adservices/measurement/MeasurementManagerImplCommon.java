package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1;
import io.grpc.LoadBalancer$Helper;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.YieldKt;
import o.BlendMode;
import o.PointerInteropFilter_androidKtmotionEventSpy11;
import o.ShortNewsContentCardView;
import o.accessgetColorBurncp;
import o.accessgetColorDodgecp;
import o.createFromParcel;
import o.isFocusCaptured;
import o.setSupportButtonTintList;
import o.unitDivide;

/* JADX INFO: loaded from: classes.dex */
public abstract class MeasurementManagerImplCommon extends PointerInteropFilter_androidKtmotionEventSpy11 {
    public final MeasurementManager RemoteActionCompatParcelizer;

    public Object IconCompatParcelizer(accessgetColorBurncp accessgetcolorburncp, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        return serializer(this, accessgetcolorburncp, shortNewsContentCardView);
    }

    public Object IconCompatParcelizer(unitDivide unitdivide, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        return write(this, unitdivide, shortNewsContentCardView);
    }

    @Override // o.PointerInteropFilter_androidKtmotionEventSpy11
    public Object RemoteActionCompatParcelizer(Uri uri, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        return registerTrigger$suspendImpl(this, uri, shortNewsContentCardView);
    }

    @Override // o.PointerInteropFilter_androidKtmotionEventSpy11
    public Object read(Uri uri, InputEvent inputEvent, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        return registerSource$suspendImpl(this, uri, inputEvent, shortNewsContentCardView);
    }

    public Object serializer(accessgetColorDodgecp accessgetcolordodgecp, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        return RemoteActionCompatParcelizer(this, accessgetcolordodgecp, shortNewsContentCardView);
    }

    @Override // o.PointerInteropFilter_androidKtmotionEventSpy11
    public Object write(ShortNewsContentCardView<? super Integer> shortNewsContentCardView) {
        return getMeasurementApiStatus$suspendImpl(this, shortNewsContentCardView);
    }

    public static Object RemoteActionCompatParcelizer(MeasurementManagerImplCommon measurementManagerImplCommon, accessgetColorDodgecp accessgetcolordodgecp, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(shortNewsContentCardView)).read();
        MeasurementManager measurementManager = measurementManagerImplCommon.RemoteActionCompatParcelizer;
        throw null;
    }

    public static Object getMeasurementApiStatus$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, ShortNewsContentCardView<? super Integer> shortNewsContentCardView) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(shortNewsContentCardView));
        cancellableContinuationImpl.read();
        measurementManagerImplCommon.RemoteActionCompatParcelizer.getMeasurementApiStatus(new setSupportButtonTintList(1), new isFocusCaptured(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }

    public static Object registerSource$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, Uri uri, InputEvent inputEvent, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(shortNewsContentCardView));
        cancellableContinuationImpl.read();
        measurementManagerImplCommon.RemoteActionCompatParcelizer.registerSource(uri, inputEvent, new setSupportButtonTintList(1), new isFocusCaptured(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        return result == CoroutineSingletons.COROUTINE_SUSPENDED ? result : createFromParcel.INSTANCE;
    }

    public static Object registerTrigger$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, Uri uri, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(shortNewsContentCardView));
        cancellableContinuationImpl.read();
        measurementManagerImplCommon.RemoteActionCompatParcelizer.registerTrigger(uri, new setSupportButtonTintList(1), new isFocusCaptured(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        return result == CoroutineSingletons.COROUTINE_SUSPENDED ? result : createFromParcel.INSTANCE;
    }

    public static Object serializer(MeasurementManagerImplCommon measurementManagerImplCommon, accessgetColorBurncp accessgetcolorburncp, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(shortNewsContentCardView)).read();
        MeasurementManager measurementManager = measurementManagerImplCommon.RemoteActionCompatParcelizer;
        throw null;
    }

    public static Object write(MeasurementManagerImplCommon measurementManagerImplCommon, unitDivide unitdivide, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(shortNewsContentCardView)).read();
        MeasurementManager measurementManager = measurementManagerImplCommon.RemoteActionCompatParcelizer;
        throw null;
    }

    public MeasurementManagerImplCommon(MeasurementManager measurementManager) {
        this.RemoteActionCompatParcelizer = measurementManager;
    }

    public Object serializer(BlendMode blendMode, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        return registerSource$suspendImpl(this, blendMode, shortNewsContentCardView);
    }

    public static Object registerSource$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, BlendMode blendMode, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        Object objCoroutineScope = YieldKt.coroutineScope(new FlowLiveDataConversions$asFlow$1$1(measurementManagerImplCommon, null, 3), shortNewsContentCardView);
        return objCoroutineScope == CoroutineSingletons.COROUTINE_SUSPENDED ? objCoroutineScope : createFromParcel.INSTANCE;
    }
}
