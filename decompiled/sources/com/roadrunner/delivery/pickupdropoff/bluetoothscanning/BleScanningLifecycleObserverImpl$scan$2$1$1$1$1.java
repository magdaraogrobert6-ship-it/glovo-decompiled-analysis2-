package com.roadrunner.delivery.pickupdropoff.bluetoothscanning;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import coil3.UriKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.decode;
import o.getContentViewGroupParentLayout;
import o.getSubpixelTextPositioningui_text;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.safeSetClipToOutline;
import o.setUnregisteredInAppMessage;
import o.unregisterInAppMessageManager;

/* JADX INFO: loaded from: classes3.dex */
public final class BleScanningLifecycleObserverImpl$scan$2$1$1$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaSessionCompatQueueItem;
    public final /* synthetic */ int IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ BleScanningLifecycleObserverImpl serializer;
    public final /* synthetic */ String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleScanningLifecycleObserverImpl$scan$2$1$1$1$1(int i, BleScanningLifecycleObserverImpl bleScanningLifecycleObserverImpl, String str, int i2, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.serializer = bleScanningLifecycleObserverImpl;
        this.write = str;
        this.read = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        BleScanningLifecycleObserverImpl$scan$2$1$1$1$1 bleScanningLifecycleObserverImpl$scan$2$1$1$1$1 = new BleScanningLifecycleObserverImpl$scan$2$1$1$1$1(this.IconCompatParcelizer, this.serializer, this.write, this.read, shortNewsContentCardView);
        int i2 = MediaBrowserCompatMediaItem + 73;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return bleScanningLifecycleObserverImpl$scan$2$1$1$1$1;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 31;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return ((BleScanningLifecycleObserverImpl$scan$2$1$1$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        }
        ((BleScanningLifecycleObserverImpl$scan$2$1$1$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 41;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.RemoteActionCompatParcelizer;
        if (i4 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            unregisterInAppMessageManager unregisterinappmessagemanager = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
            long jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(this.IconCompatParcelizer * 1000, setUnregisteredInAppMessage.MILLISECONDS);
            this.RemoteActionCompatParcelizer = 1;
            if (DelayKt.m5145delayVtjQ1oo(jRemoteActionCompatParcelizer, this) == coroutineSingletons) {
                int i5 = MediaSessionCompatQueueItem + 123;
                MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return coroutineSingletons;
            }
        } else {
            if (i4 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i7 = MediaBrowserCompatMediaItem + 29;
            MediaSessionCompatQueueItem = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int i8 = 99 / 0;
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
        }
        getSubpixelTextPositioningui_text getsubpixeltextpositioningui_text = this.serializer.write;
        Integer num = new Integer(this.read);
        getsubpixeltextpositioningui_text.getClass();
        String str = this.write;
        str.getClass();
        decode decodeVar = getsubpixeltextpositioningui_text.serializer;
        safeSetClipToOutline safesetcliptooutline = new safeSetClipToOutline();
        safesetcliptooutline.putAll(getsubpixeltextpositioningui_text.IconCompatParcelizer.write());
        safesetcliptooutline.put("vendor_id", str);
        safesetcliptooutline.put("last_rssi", String.valueOf(num.intValue()));
        decodeVar.logEvent("ble_signal_lost", safesetcliptooutline.IconCompatParcelizer());
        return createFromParcel.INSTANCE;
    }
}
