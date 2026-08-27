package o;

import com.roadrunner.delivery.analytics.StateV3AnalyticsProviderImpl;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class PlaceholderExtensions_androidKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final FontEj4NQ78 IconCompatParcelizer;

    public PlaceholderExtensions_androidKt(FontEj4NQ78 fontEj4NQ78, io.sentry.util.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
        this.IconCompatParcelizer = fontEj4NQ78;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0076  */
    public final getSpanVerticalAligndo9XGgannotations IconCompatParcelizer(accessgetOwnerp accessgetownerp) {
        setPlaceholder setplaceholder;
        Object next;
        String str;
        int i = 2 % 2;
        int i2 = read + 101;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Iterator it = accessgetownerp.components.iterator();
        while (true) {
            setplaceholder = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            int i4 = read + 77;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                boolean z = it.next() instanceof AndroidViewHolderlayoutNode15;
                setplaceholder.hashCode();
                throw null;
            }
            next = it.next();
            if (next instanceof AndroidViewHolderlayoutNode15) {
                int i5 = RemoteActionCompatParcelizer + 53;
                read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    break;
                }
                int i6 = 2 / 3;
                break;
            }
        }
        AndroidViewHolderlayoutNode15 androidViewHolderlayoutNode15 = (AndroidViewHolderlayoutNode15) next;
        if (androidViewHolderlayoutNode15 == null) {
            return null;
        }
        long j = androidViewHolderlayoutNode15.deliveryId;
        String str2 = androidViewHolderlayoutNode15.number;
        boolean z2 = androidViewHolderlayoutNode15.masked;
        String str3 = androidViewHolderlayoutNode15.callee;
        String str4 = androidViewHolderlayoutNode15.calleeName;
        String str5 = androidViewHolderlayoutNode15.orderCode;
        StateV3AnalyticsProviderImpl stateV3AnalyticsProviderImpl = (StateV3AnalyticsProviderImpl) this.IconCompatParcelizer;
        setFitInsetsSides setfitinsetssides = (setFitInsetsSides) stateV3AnalyticsProviderImpl.serializer.read();
        if (setfitinsetssides != null) {
            int i7 = RemoteActionCompatParcelizer + 67;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            ComposableSingletonsAndroidPopup_androidKt composableSingletonsAndroidPopup_androidKt = setfitinsetssides.analytics;
            if (composableSingletonsAndroidPopup_androidKt != null) {
                str = composableSingletonsAndroidPopup_androidKt.deliveryState;
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        setplaceholder = str != null ? new setPlaceholder(str, stateV3AnalyticsProviderImpl.write()) : null;
        int i9 = read + 37;
        RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return new getSpanVerticalAligndo9XGgannotations(j, str2, z2, str3, str4, str5, setplaceholder);
    }
}
