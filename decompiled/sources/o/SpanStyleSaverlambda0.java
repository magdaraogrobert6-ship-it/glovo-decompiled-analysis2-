package o;

import com.roadrunner.home.CreateHomeScope;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class SpanStyleSaverlambda0 extends ContinuationImpl {
    private static int MediaMetadataCompat = 1;
    private static int write;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ CreateHomeScope RemoteActionCompatParcelizer;
    public androidx.work.impl.WorkManagerImpl read;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpanStyleSaverlambda0(CreateHomeScope createHomeScope, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = createHomeScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 49;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        return this.RemoteActionCompatParcelizer.invoke(null, 0L, null, 0L, this);
    }
}
