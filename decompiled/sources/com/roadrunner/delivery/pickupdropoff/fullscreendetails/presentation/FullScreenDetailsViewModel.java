package com.roadrunner.delivery.pickupdropoff.fullscreendetails.presentation;

import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.ViewModel;
import com.roadrunner.delivery.common.data.model.TrackingEventExtensionsKt;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.SwitcherUiModelImpl$1;
import com.roadrunner.delivery.pickupdropoff.fullscreendetails.models.FullscreenItemUi;
import com.roadrunner.delivery.state.TrackingEvent;
import com.sentiance.core.model.events.H$b;
import io.grpc.internal.SharedResourcePool;
import java.util.Iterator;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.FontEj4NQ78default;
import o.FontMuC2MFsdefault;
import o.decode;
import o.safeSetClipToOutline;
import o.setDesignInfoListui_tooling;
import o.toBitmapConfig1JJdX4A;

/* JADX INFO: loaded from: classes3.dex */
public final class FullScreenDetailsViewModel extends ViewModel {
    private static int RatingCompat = 1;
    private static int write;
    public final SharedResourcePool IconCompatParcelizer;
    public final H$b RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final MutableStateFlow serializer;

    public final SharedResourcePool serializer() {
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 37;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        SharedResourcePool sharedResourcePool = this.IconCompatParcelizer;
        int i5 = i2 + 21;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return sharedResourcePool;
    }

    public FullScreenDetailsViewModel(SharedResourcePool sharedResourcePool, H$b h$b) {
        sharedResourcePool.getClass();
        h$b.getClass();
        this.IconCompatParcelizer = sharedResourcePool;
        this.RemoteActionCompatParcelizer = h$b;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(setDesignInfoListui_tooling.IconCompatParcelizer);
        this.read = mutableStateFlow;
        this.serializer = mutableStateFlow;
    }

    public final void read(FullscreenItemUi fullscreenItemUi) {
        int i = 2 % 2;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new SwitcherUiModelImpl$1.AnonymousClass1(this, fullscreenItemUi, null, 17), 3);
        int i2 = RatingCompat + 13;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public final void serializer(FullscreenItemUi fullscreenItemUi) {
        int i = 2 % 2;
        Iterator it = TrackingEventExtensionsKt.RemoteActionCompatParcelizer(fullscreenItemUi.write).iterator();
        int i2 = RatingCompat + 85;
        write = i2 % Fields.SpotShadowColor;
        while (true) {
            int i3 = i2 % 2;
            if (!it.hasNext()) {
                return;
            }
            TrackingEvent trackingEvent = (TrackingEvent) it.next();
            H$b h$b = this.RemoteActionCompatParcelizer;
            h$b.getClass();
            trackingEvent.getClass();
            safeSetClipToOutline safesetcliptooutline = new safeSetClipToOutline();
            safesetcliptooutline.putAll(FontMuC2MFsdefault.RemoteActionCompatParcelizer(trackingEvent.parameters));
            safesetcliptooutline.putAll(((FontEj4NQ78default) h$b.write).read());
            ((decode) h$b.serializer).logEvent(trackingEvent.name, safesetcliptooutline.IconCompatParcelizer());
            i2 = write + 17;
            RatingCompat = i2 % Fields.SpotShadowColor;
        }
    }
}
