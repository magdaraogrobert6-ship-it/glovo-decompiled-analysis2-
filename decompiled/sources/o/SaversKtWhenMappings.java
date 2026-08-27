package o;

import com.roadrunner.delivery.accept.autoaccept.domain.AutoAcceptNotificationMapperImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class SaversKtWhenMappings extends ContinuationImpl {
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat;
    public fastRoundToInt IconCompatParcelizer;
    public final /* synthetic */ AutoAcceptNotificationMapperImpl MediaMetadataCompat;
    public checkAdjustAdRevenue RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public boolean serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaversKtWhenMappings(AutoAcceptNotificationMapperImpl autoAcceptNotificationMapperImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaMetadataCompat = autoAcceptNotificationMapperImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 103;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.write |= Integer.MIN_VALUE;
        Object notification = this.MediaMetadataCompat.getNotification(null, null, false, this);
        int i4 = RatingCompat + 97;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return notification;
    }
}
