package o;

import com.roadrunner.push.core.domain.RegisterPushNotificationUseCaseImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class access1900 extends ContinuationImpl {
    private static int MediaMetadataCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public int IconCompatParcelizer;
    public final /* synthetic */ RegisterPushNotificationUseCaseImpl MediaDescriptionCompat;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;
    public RegisterPushNotificationUseCaseImpl serializer;
    public boolean write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public access1900(RegisterPushNotificationUseCaseImpl registerPushNotificationUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaDescriptionCompat = registerPushNotificationUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 31;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return this.MediaDescriptionCompat.invoke(this);
        }
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        int i3 = 94 / 0;
        return this.MediaDescriptionCompat.invoke(this);
    }
}
