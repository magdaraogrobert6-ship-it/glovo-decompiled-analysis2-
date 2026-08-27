package o;

import android.content.ActivityNotFoundException;
import coil3.ComponentRegistry$Builder;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class addSerializedCardJsonToStoragelambda1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    public final /* synthetic */ ComponentRegistry$Builder RemoteActionCompatParcelizer;
    public int read;
    public ActivityNotFoundException serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public addSerializedCardJsonToStoragelambda1(ComponentRegistry$Builder componentRegistry$Builder, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = componentRegistry$Builder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 79;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.read |= Integer.MIN_VALUE;
        Object obj2 = null;
        Object objAccess$handleMapNotFound = ComponentRegistry$Builder.access$handleMapNotFound(this.RemoteActionCompatParcelizer, null, this);
        int i4 = IconCompatParcelizer + 111;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objAccess$handleMapNotFound;
        }
        obj2.hashCode();
        throw null;
    }
}
