package o;

import android.net.Uri;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes3.dex */
public final class offsetNN6EwUdefault implements setGraphicModalMaxWidthDp {
    private static int IconCompatParcelizer = 0;
    private static int MediaSessionCompatQueueItem = 1;
    private static int read = 0;
    private static int serializer = 1;
    public static final offsetNN6EwUdefault write = new offsetNN6EwUdefault();
    public static final DefaultInAppMessageWebViewClientListenerCompanion RemoteActionCompatParcelizer = RangesKt.read("Uri");

    static {
        int i = serializer + 85;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 32 / 0;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = read + 7;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        DefaultInAppMessageWebViewClientListenerCompanion defaultInAppMessageWebViewClientListenerCompanion = RemoteActionCompatParcelizer;
        int i4 = i3 + 113;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return defaultInAppMessageWebViewClientListenerCompanion;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 33;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Uri uri = Uri.parse(defaultInAppMessageModalViewFactoryCompanion.ResultReceiver());
        int i4 = read + 79;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return uri;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 27;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Uri uri = (Uri) obj;
        uri.getClass();
        String string = uri.toString();
        string.getClass();
        defaultInAppMessageViewWrapperFactory.IconCompatParcelizer(string);
        int i4 = MediaSessionCompatQueueItem + 19;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}
