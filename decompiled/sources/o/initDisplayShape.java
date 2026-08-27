package o;

import com.roadrunner.freelancing.presentation.goandstartinfo.GoAndStartInformationUiModelImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class initDisplayShape extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int write;
    public final /* synthetic */ GoAndStartInformationUiModelImpl IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public Object read;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public initDisplayShape(GoAndStartInformationUiModelImpl goAndStartInformationUiModelImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = goAndStartInformationUiModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 1;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objAccess$executeGoAndStart = GoAndStartInformationUiModelImpl.access$executeGoAndStart(this.IconCompatParcelizer, null, this);
        int i4 = write + 29;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objAccess$executeGoAndStart;
    }
}
