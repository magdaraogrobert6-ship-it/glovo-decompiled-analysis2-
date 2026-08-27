package o;

import java.util.List;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes3.dex */
public final class PopupLayoutHelper implements setGraphicModalMaxWidthDp {
    private static int IconCompatParcelizer = 1;
    private static int MediaBrowserCompatMediaItem = 1;
    public static final PopupLayoutHelper read = new PopupLayoutHelper();
    private static int serializer;
    private static int write;
    public final setGraphicModalMaxWidthDp RemoteActionCompatParcelizer;

    static {
        int i = IconCompatParcelizer + 47;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 94 / 0;
        }
    }

    public PopupLayoutHelper() {
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = getDismissOnBackPress.Companion.serializer();
        setgraphicmodalmaxwidthdpSerializer.getClass();
        this.RemoteActionCompatParcelizer = setgraphicmodalmaxwidthdpSerializer;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 71;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.RemoteActionCompatParcelizer.getDescriptor();
        }
        this.RemoteActionCompatParcelizer.getDescriptor();
        throw null;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = write + 123;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        BackgroundInAppMessagePreparer backgroundInAppMessagePreparer = ModuleDSLKt.read(defaultInAppMessageViewWrapperFactory);
        backgroundInAppMessagePreparer.IconCompatParcelizer(prepareInAppMessageWithBitmapDownloadlambda2.IconCompatParcelizer(backgroundInAppMessagePreparer.read(), obj, this.RemoteActionCompatParcelizer));
        int i4 = MediaBrowserCompatMediaItem + 87;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 30 / 0;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        requestDisallowParentIntercept requestdisallowparentintercept;
        SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection;
        int i = 2 % 2;
        int i2 = write + 65;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setTouchListener settouchlistenerRemoteActionCompatParcelizer = ModuleDSLKt.RemoteActionCompatParcelizer(defaultInAppMessageModalViewFactoryCompanion);
        SwipeDismissTouchListenerVerticalDismissDirection r8lambdaerwhggzq_gqgn8cultnvrcshm8k = settouchlistenerRemoteActionCompatParcelizer.read();
        resetTransientState resettransientstateSerializer = settouchlistenerRemoteActionCompatParcelizer.serializer();
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = this.RemoteActionCompatParcelizer;
        r8lambdaerwhggzq_gqgn8cultnvrcshm8k.getClass();
        r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k r8lambdaerwhggzq_gqgn8cultnvrcshm8kRemoteActionCompatParcelizer = TouchAwareSwipeDismissTouchListener.RemoteActionCompatParcelizer(r8lambdaerwhggzq_gqgn8cultnvrcshm8k);
        SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection2 = (SwipeDismissTouchListenerVerticalDismissDirection) r8lambdaerwhggzq_gqgn8cultnvrcshm8kRemoteActionCompatParcelizer.get("action");
        if (swipeDismissTouchListenerVerticalDismissDirection2 == null || (swipeDismissTouchListenerVerticalDismissDirection2 instanceof r8lambdaOVm5S_u8QUSoMXvJUOeZHUBFeHc)) {
            Object obj = r8lambdaerwhggzq_gqgn8cultnvrcshm8kRemoteActionCompatParcelizer.get("actions");
            if (obj instanceof requestDisallowParentIntercept) {
                requestdisallowparentintercept = (requestDisallowParentIntercept) obj;
                int i4 = MediaBrowserCompatMediaItem + 73;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
            } else {
                requestdisallowparentintercept = null;
            }
            if (requestdisallowparentintercept != null && (swipeDismissTouchListenerVerticalDismissDirection = (SwipeDismissTouchListenerVerticalDismissDirection) onContentCardDismissed.MediaMetadataCompat((List) requestdisallowparentintercept)) != null) {
                r8lambdaerwhggzq_gqgn8cultnvrcshm8k = new r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k(onMove.serializer(r8lambdaerwhggzq_gqgn8cultnvrcshm8kRemoteActionCompatParcelizer, new onViewAttachedToWindowlambda0("action", swipeDismissTouchListenerVerticalDismissDirection)));
            }
        } else {
            int i6 = MediaBrowserCompatMediaItem + 63;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                int i7 = 85 / 0;
            }
        }
        return resettransientstateSerializer.IconCompatParcelizer(setgraphicmodalmaxwidthdp, r8lambdaerwhggzq_gqgn8cultnvrcshm8k);
    }
}
