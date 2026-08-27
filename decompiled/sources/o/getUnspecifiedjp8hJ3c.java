package o;

import com.roadrunner.delivery.ontheway.turnbyturn.analytics.loggers.TurnByTurnNavigationLogger;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getUnspecifiedjp8hJ3c extends ContinuationImpl {
    private static int MediaMetadataCompat = 1;
    private static int read;
    public /* synthetic */ Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ TurnByTurnNavigationLogger serializer;
    public Map write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getUnspecifiedjp8hJ3c(TurnByTurnNavigationLogger turnByTurnNavigationLogger, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = turnByTurnNavigationLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 43;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objAccess$withVehicleType = TurnByTurnNavigationLogger.access$withVehicleType(this.serializer, null, this);
        int i4 = read + 69;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objAccess$withVehicleType;
    }
}
