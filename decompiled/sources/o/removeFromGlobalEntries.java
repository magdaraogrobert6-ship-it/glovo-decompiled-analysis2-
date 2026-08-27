package o;

import com.roadrunner.customerchat.legacy.core.LegacyCustomerChatCommunicatorImpl;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class removeFromGlobalEntries extends AdaptedFunctionReference implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;

    public removeFromGlobalEntries(LegacyCustomerChatCommunicatorImpl legacyCustomerChatCommunicatorImpl) {
        super(1, 0, LegacyCustomerChatCommunicatorImpl.class, legacyCustomerChatCommunicatorImpl, "openChat", "openChat(Lcom/roadrunner/customerchat/legacy/core/usecases/OpenChatAction;Z)V");
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 111;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getWindowOffsetnOccac getwindowoffsetnoccac = (getWindowOffsetnOccac) obj;
        getwindowoffsetnoccac.getClass();
        ((LegacyCustomerChatCommunicatorImpl) this.MediaSessionCompatQueueItem).serializer(getwindowoffsetnoccac, true);
        return createFromParcel.INSTANCE;
    }
}
