package o;

import android.annotation.SuppressLint;
import com.deliveryhero.selfServiceChat.data.bridge.BridgeMessage$Companion;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
@SuppressLint
public abstract class getY2 {
    public final String bridgeMessageId;
    public final String messageType;
    public static final BridgeMessage$Companion Companion = new BridgeMessage$Companion();
    public static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, setViewportSizeuvyYCjkui.RemoteActionCompatParcelizer);

    public static final /* synthetic */ void read(getY2 gety2, DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactory, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        defaultInAppMessageSlideupViewFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, gety2.bridgeMessageId);
        defaultInAppMessageSlideupViewFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, gety2.messageType);
    }

    public /* synthetic */ getY2(String str, String str2) {
        this.bridgeMessageId = str;
        this.messageType = str2;
    }

    public getY2(String str, String str2, int i) {
        this.bridgeMessageId = str;
        this.messageType = str2;
    }
}
