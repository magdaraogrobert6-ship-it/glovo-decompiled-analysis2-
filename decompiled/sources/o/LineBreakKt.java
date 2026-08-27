package o;

import com.roadrunner.delivery.ontheway.turnbyturn.analytics.loggers.TurnByTurnNavigationLogger;
import java.io.Serializable;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class LineBreakKt extends ContinuationImpl {
    private static int MediaMetadataCompat = 1;
    private static int write;
    public safeSetClipToOutline IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ TurnByTurnNavigationLogger serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LineBreakKt(TurnByTurnNavigationLogger turnByTurnNavigationLogger, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.serializer = turnByTurnNavigationLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 13;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Serializable serializableAccess$getCommonParams = TurnByTurnNavigationLogger.access$getCommonParams(this.serializer, this);
        int i4 = write + 73;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return serializableAccess$getCommonParams;
    }
}
