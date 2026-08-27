package o;

import androidx.datastore.core.SimpleActor$offer$2;
import coil3.ComponentRegistry$Builder;
import com.foodora.courier.main.presentation.MainActivity;
import com.roadrunner.customerchat.legacy.core.manager.CustomerChatManagerImpl;
import com.roadrunner.customerchat.usecases.CustomerChatCommunicatorImpl;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes3.dex */
public final class getTextAligne0LSkKk implements androidx.lifecycle.DefaultLifecycleObserver {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaMetadataCompat = 1;
    public final TextUnitType IconCompatParcelizer;
    public final com.huawei.wisesecurity.ucs_credential.n0 MediaDescriptionCompat;
    public final getTextIndent MediaSessionCompatQueueItem;
    public final ComponentRegistry$Builder RatingCompat;
    public final accessisSetgyyYBs RemoteActionCompatParcelizer;
    public final CustomerChatManagerImpl read;
    public final MainActivity serializer;
    public final CustomerChatCommunicatorImpl write;

    public getTextAligne0LSkKk(CustomerChatCommunicatorImpl customerChatCommunicatorImpl, com.huawei.wisesecurity.ucs_credential.n0 n0Var, CustomerChatManagerImpl customerChatManagerImpl, TextUnitType textUnitType, accessisSetgyyYBs accessissetgyyybs, getTextIndent gettextindent, ComponentRegistry$Builder componentRegistry$Builder, MainActivity mainActivity) {
        customerChatCommunicatorImpl.getClass();
        n0Var.getClass();
        customerChatManagerImpl.getClass();
        textUnitType.getClass();
        accessissetgyyybs.getClass();
        gettextindent.getClass();
        componentRegistry$Builder.getClass();
        this.write = customerChatCommunicatorImpl;
        this.MediaDescriptionCompat = n0Var;
        this.read = customerChatManagerImpl;
        this.IconCompatParcelizer = textUnitType;
        this.RemoteActionCompatParcelizer = accessissetgyyybs;
        this.MediaSessionCompatQueueItem = gettextindent;
        this.RatingCompat = componentRegistry$Builder;
        this.serializer = mainActivity;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        int i = 2 % 2;
        accessisrendernodecompatiblecp.getClass();
        super.onCreate(accessisrendernodecompatiblecp);
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(accessisrendernodecompatiblecp.getLifecycle()), null, null, new SimpleActor$offer$2(accessisrendernodecompatiblecp, this, (ShortNewsContentCardView) null, 28), 3);
        int i2 = MediaBrowserCompatMediaItem + 111;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }
}
