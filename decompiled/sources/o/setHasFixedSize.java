package o;

import com.roadrunner.inappnotifications.data.InAppNotificationsRepository;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class setHasFixedSize extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public /* synthetic */ Object read;
    public final /* synthetic */ InAppNotificationsRepository serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setHasFixedSize(InAppNotificationsRepository inAppNotificationsRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = inAppNotificationsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 43;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.read = obj;
            this.write |= Integer.MIN_VALUE;
            return InAppNotificationsRepository.access$decodeFromJson(this.serializer, null, this);
        }
        this.read = obj;
        this.write |= Integer.MIN_VALUE;
        int i3 = 92 / 0;
        return InAppNotificationsRepository.access$decodeFromJson(this.serializer, null, this);
    }
}
