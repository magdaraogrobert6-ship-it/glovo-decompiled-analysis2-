package o;

import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final class indexToBitOffset implements setGraphicModalMaxWidthDp {
    private static int IconCompatParcelizer = 1;
    private static int MediaSessionCompatQueueItem = 1;
    private static int RemoteActionCompatParcelizer;
    private static int read;
    public static final indexToBitOffset write = new indexToBitOffset();
    public final /* synthetic */ getMaxDimensionsAndFocusMaskannotations serializer = new getMaxDimensionsAndFocusMaskannotations(LazyKt__LazyJVMKt.read(DefaultInAppMessageViewLifecycleListener.RemoteActionCompatParcelizer));

    static {
        int i = IconCompatParcelizer + 121;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 115;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = this.serializer.read;
        int i4 = read + 61;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 103;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.serializer.write(defaultInAppMessageModalViewFactoryCompanion);
        }
        this.serializer.write(defaultInAppMessageModalViewFactoryCompanion);
        throw null;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = read + 117;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) obj;
            r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
            this.serializer.IconCompatParcelizer(defaultInAppMessageViewWrapperFactory, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk);
            throw null;
        }
        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2 = (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) obj;
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2.getClass();
        this.serializer.IconCompatParcelizer(defaultInAppMessageViewWrapperFactory, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2);
        int i3 = read + 117;
        MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }
}
