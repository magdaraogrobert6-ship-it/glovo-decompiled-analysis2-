package o;

import com.roadrunner.rider.safety.report.data.SafetySideMenuItemTagRepository;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class addCallbackParameter extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int serializer;
    public int IconCompatParcelizer;
    public SafetySideMenuItemTagRepository RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ SafetySideMenuItemTagRepository write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public addCallbackParameter(SafetySideMenuItemTagRepository safetySideMenuItemTagRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = safetySideMenuItemTagRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 49;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objIncrementSafetyScreenDisplayCount = this.write.incrementSafetyScreenDisplayCount(this);
        int i4 = serializer + 85;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objIncrementSafetyScreenDisplayCount;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
