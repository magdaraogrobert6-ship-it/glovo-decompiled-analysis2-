package o;

import com.roadrunner.delivery.accept.laststop.presentation.LastStopOptionUiModelImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getSelectionPath extends ContinuationImpl {
    private static int MediaDescriptionCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public int IconCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ LastStopOptionUiModelImpl serializer;
    public String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getSelectionPath(LastStopOptionUiModelImpl lastStopOptionUiModelImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = lastStopOptionUiModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 93;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object obj2 = null;
        Object objAccess$updateNestState = LastStopOptionUiModelImpl.access$updateNestState(this.serializer, null, this);
        int i4 = RemoteActionCompatParcelizer + 61;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objAccess$updateNestState;
        }
        obj2.hashCode();
        throw null;
    }
}
