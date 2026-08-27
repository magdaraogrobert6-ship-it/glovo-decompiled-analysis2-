package o;

import com.roadrunner.delivery.analytics.StateV3AnalyticsProviderImpl;
import com.roadrunner.delivery.state.DestinationLocation;

/* JADX INFO: loaded from: classes3.dex */
public final class getFontLoadState {
    private static int serializer = 0;
    private static int write = 1;
    public final FontEj4NQ78 IconCompatParcelizer;

    public getFontLoadState(FontEj4NQ78 fontEj4NQ78) {
        this.IconCompatParcelizer = fontEj4NQ78;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    public final setShaderStateui_text serializer(fastCoerceAtMost fastcoerceatmost) {
        String str;
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 49;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (fastcoerceatmost != null) {
            int i4 = i2 + 35;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            AndroidViewHolderlayoutNode1coreModifier3 androidViewHolderlayoutNode1coreModifier3 = fastcoerceatmost.mapComponent;
            if (androidViewHolderlayoutNode1coreModifier3 != null) {
                DestinationLocation destinationLocation = androidViewHolderlayoutNode1coreModifier3.destinationLocation;
                StateV3AnalyticsProviderImpl stateV3AnalyticsProviderImpl = (StateV3AnalyticsProviderImpl) this.IconCompatParcelizer;
                setFitInsetsSides setfitinsetssides = (setFitInsetsSides) stateV3AnalyticsProviderImpl.serializer.read();
                if (setfitinsetssides != null) {
                    int i6 = write + 99;
                    serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    ComposableSingletonsAndroidPopup_androidKt composableSingletonsAndroidPopup_androidKt = setfitinsetssides.analytics;
                    if (composableSingletonsAndroidPopup_androidKt != null) {
                        int i8 = write + 23;
                        serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i8 % 2 != 0) {
                            String str2 = composableSingletonsAndroidPopup_androidKt.deliveryState;
                            obj.hashCode();
                            throw null;
                        }
                        str = composableSingletonsAndroidPopup_androidKt.deliveryState;
                    } else {
                        str = null;
                    }
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                return new AndroidTextPaint_androidKt(new setDrawStyle(new setShadowui_text(destinationLocation.serializer(), destinationLocation.RemoteActionCompatParcelizer(), destinationLocation.read(), destinationLocation.write().getCode()), new setBrushSizeiaC8Vc4ui_text(str, stateV3AnalyticsProviderImpl.write())), false, null);
            }
        }
        return AndroidTypefaceWrapper.IconCompatParcelizer;
    }
}
