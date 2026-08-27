package o;

import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.customerchat.usecases.CustomerChatCommunicatorImpl;
import com.roadrunner.delivery.ontheway.phonecall.UnifiedPhoneCallerImpl;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.SwitcherUiModelImpl$1;
import com.roadrunner.freelancing.data.GoAndStartDataStoreFactory$$ExternalSyntheticLambda1;
import io.grpc.internal.SharedResourcePool;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomBulletSpan extends androidx.lifecycle.ViewModel {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatToken = 1;
    public final isAdapterPositionOnScreen IconCompatParcelizer;
    public final MutableStateFlow MediaBrowserCompatMediaItem;
    public final SharedResourcePool MediaDescriptionCompat;
    public final getBitmapui_graphics MediaSessionCompatQueueItem;
    public final UnifiedPhoneCallerImpl RatingCompat;
    public final DrawStyleSpan RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final SignInDataStore serializer;
    public final CustomerChatCommunicatorImpl write;

    public final SharedResourcePool write() {
        SharedResourcePool sharedResourcePool;
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 107;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaMetadataCompat = i3;
        if (i2 % 2 != 0) {
            sharedResourcePool = this.MediaDescriptionCompat;
            int i4 = 77 / 0;
        } else {
            sharedResourcePool = this.MediaDescriptionCompat;
        }
        int i5 = i3 + 9;
        MediaSessionCompatToken = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return sharedResourcePool;
    }

    public CustomBulletSpan(CustomerChatCommunicatorImpl customerChatCommunicatorImpl, SignInDataStore signInDataStore, SharedResourcePool sharedResourcePool, UnifiedPhoneCallerImpl unifiedPhoneCallerImpl, DrawStyleSpan drawStyleSpan, getBitmapui_graphics getbitmapui_graphics) {
        customerChatCommunicatorImpl.getClass();
        signInDataStore.getClass();
        sharedResourcePool.getClass();
        unifiedPhoneCallerImpl.getClass();
        drawStyleSpan.getClass();
        getbitmapui_graphics.getClass();
        this.write = customerChatCommunicatorImpl;
        this.serializer = signInDataStore;
        this.MediaDescriptionCompat = sharedResourcePool;
        this.RatingCompat = unifiedPhoneCallerImpl;
        this.RemoteActionCompatParcelizer = drawStyleSpan;
        this.MediaSessionCompatQueueItem = getbitmapui_graphics;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(drawLeadingMarginlambda00.write);
        this.read = mutableStateFlow;
        this.MediaBrowserCompatMediaItem = mutableStateFlow;
        this.IconCompatParcelizer = new isAdapterPositionOnScreen(new GoAndStartDataStoreFactory$$ExternalSyntheticLambda1(4, this));
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new SwitcherUiModelImpl$1(this, (ShortNewsContentCardView) null, 10), 3);
    }
}
