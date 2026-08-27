package o;

import com.sentiance.core.model.events.H$b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class pc extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int MediaDescriptionCompat = 1;
    public long RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ H$b serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc(H$b h$b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = h$b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 23;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.read |= Integer.MIN_VALUE;
        Object objRecord = this.serializer.record(0L, 0L, this);
        int i4 = IconCompatParcelizer + 53;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objRecord;
        }
        throw null;
    }
}
