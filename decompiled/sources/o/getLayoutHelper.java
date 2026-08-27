package o;

import androidx.compose.material3.ThumbNode$onAttach$1$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class getLayoutHelper extends ContinuationImpl {
    private static int MediaDescriptionCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final /* synthetic */ ThumbNode$onAttach$1$1 IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public int serializer;
    public FlowCollector write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getLayoutHelper(ThumbNode$onAttach$1$1 thumbNode$onAttach$1$1, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.IconCompatParcelizer = thumbNode$onAttach$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 103;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            this.read = obj;
            this.serializer |= Integer.MIN_VALUE;
            return this.IconCompatParcelizer.emit(null, this);
        }
        this.read = obj;
        this.serializer |= Integer.MIN_VALUE;
        this.IconCompatParcelizer.emit(null, this);
        obj2.hashCode();
        throw null;
    }
}
