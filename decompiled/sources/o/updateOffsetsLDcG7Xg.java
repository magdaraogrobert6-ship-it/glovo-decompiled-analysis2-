package o;

import com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$Companion;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public abstract class updateOffsetsLDcG7Xg {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final String messageType;
    public static final BridgeMessage$Companion Companion = new BridgeMessage$Companion();
    public static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ActionPropertyKey(15));

    public abstract String IconCompatParcelizer();

    static {
        int i = serializer + 39;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public updateOffsetsLDcG7Xg(String str, int i) {
        this.messageType = str;
    }

    public final isLineEllipsized write() {
        int i = 2 % 2;
        isLineEllipsized islineellipsized = new isLineEllipsized(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.messageType, "_ACK"), this);
        int i2 = RemoteActionCompatParcelizer + 1;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return islineellipsized;
        }
        throw null;
    }

    public static final void IconCompatParcelizer(updateOffsetsLDcG7Xg updateoffsetsldcg7xg, DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactory, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 65;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        defaultInAppMessageSlideupViewFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, updateoffsetsldcg7xg.IconCompatParcelizer());
        defaultInAppMessageSlideupViewFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, updateoffsetsldcg7xg.messageType);
        int i4 = RemoteActionCompatParcelizer + 123;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}
