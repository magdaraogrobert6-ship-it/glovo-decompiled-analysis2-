package o;

/* JADX INFO: loaded from: classes3.dex */
public final class ContentPainterElement implements invokeSuspendcomroadrunnerrrdscomposecomponenttooltipTooltipKtTooltip31 {
    private static int serializer = 1;
    private static int write;
    public final SubcomposeAsyncImageContent IconCompatParcelizer;

    public ContentPainterElement(SubcomposeAsyncImageContent subcomposeAsyncImageContent) {
        subcomposeAsyncImageContent.getClass();
        this.IconCompatParcelizer = subcomposeAsyncImageContent;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        int i = 2 % 2;
        int i2 = write + 25;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        accessisrendernodecompatiblecp.getClass();
        this.IconCompatParcelizer.read.IconCompatParcelizer(Boolean.FALSE);
        super.onStart(accessisrendernodecompatiblecp);
        int i4 = write + 111;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        int i = 2 % 2;
        int i2 = write + 87;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            accessisrendernodecompatiblecp.getClass();
            this.IconCompatParcelizer.read.IconCompatParcelizer(Boolean.TRUE);
            super.onStop(accessisrendernodecompatiblecp);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        accessisrendernodecompatiblecp.getClass();
        this.IconCompatParcelizer.read.IconCompatParcelizer(Boolean.TRUE);
        super.onStop(accessisrendernodecompatiblecp);
        int i3 = serializer + 121;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }
}
