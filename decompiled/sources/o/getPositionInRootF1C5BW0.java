package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.appmigration.model.UrgencyVariant;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes3.dex */
public final class getPositionInRootF1C5BW0 implements setGraphicModalMaxWidthDp {
    private static int IconCompatParcelizer = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    private static int read = 0;
    private static int serializer = 1;
    public static final getPositionInRootF1C5BW0 write = new getPositionInRootF1C5BW0();
    public static final DefaultInAppMessageWebViewClientListenerCompanion RemoteActionCompatParcelizer = RangesKt.read("UrgencyVariant");

    static {
        int i = IconCompatParcelizer + 91;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = read + 19;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return RemoteActionCompatParcelizer;
        }
        int i3 = 76 / 0;
        return RemoteActionCompatParcelizer;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        int i2 = read + 97;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strResultReceiver = defaultInAppMessageModalViewFactoryCompanion.ResultReceiver();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strResultReceiver, "warning"}, getCieXyz.write())).booleanValue()) {
            UrgencyVariant urgencyVariant = UrgencyVariant.WARNING;
            int i4 = read + 21;
            MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 18 / 0;
            }
            return urgencyVariant;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strResultReceiver, "urgent"}, getCieXyz.write())).booleanValue()) {
            return UrgencyVariant.NEUTRAL;
        }
        int i6 = read + 97;
        MediaBrowserCompatMediaItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return UrgencyVariant.URGENT;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        String str;
        int i = 2 % 2;
        int i2 = read + 97;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        UrgencyVariant urgencyVariant = (UrgencyVariant) obj;
        urgencyVariant.getClass();
        int i4 = getOuterSemanticsNodeui.write[urgencyVariant.ordinal()];
        if (i4 != 1) {
            int i5 = MediaBrowserCompatMediaItem + 85;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0 ? i4 == 2 : i4 == 3) {
                str = "warning";
            } else {
                if (i4 != 3) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return;
                }
                str = "urgent";
            }
        } else {
            str = "neutral";
        }
        defaultInAppMessageViewWrapperFactory.IconCompatParcelizer(str);
    }
}
