package o;

import com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class q4ExternalSyntheticLambda6 extends ContinuationImpl {
    private static int MediaDescriptionCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public /* synthetic */ Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public FlowCollector read;
    public final /* synthetic */ NestViewModel$updateConfiguration$1$1$1$1 serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4ExternalSyntheticLambda6(NestViewModel$updateConfiguration$1$1$1$1 nestViewModel$updateConfiguration$1$1$1$1, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.serializer = nestViewModel$updateConfiguration$1$1$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 49;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            this.IconCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return this.serializer.emit((Object) null, this);
        }
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        this.serializer.emit((Object) null, this);
        obj2.hashCode();
        throw null;
    }
}
