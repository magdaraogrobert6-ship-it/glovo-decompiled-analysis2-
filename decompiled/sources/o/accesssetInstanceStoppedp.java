package o;

import coil3.ComponentRegistry$Builder;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class accesssetInstanceStoppedp extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int read;
    public final /* synthetic */ ComponentRegistry$Builder IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public int serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accesssetInstanceStoppedp(ComponentRegistry$Builder componentRegistry$Builder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = componentRegistry$Builder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 17;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.serializer |= Integer.MIN_VALUE;
        return this.IconCompatParcelizer.cachedZoneGeoJson(0, this);
    }
}
