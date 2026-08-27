package o;

import com.roadrunner.sidemenu.data.cache.SideMenuCacheImpl$get$$inlined$map$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdah0l0b2fybS8krsuMTBF1RruHv8w extends ContinuationImpl {
    private static int MediaDescriptionCompat = 1;
    private static int MediaMetadataCompat;
    public FlowCollector IconCompatParcelizer;
    public final /* synthetic */ SideMenuCacheImpl$get$$inlined$map$1.AnonymousClass2 RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public int serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdah0l0b2fybS8krsuMTBF1RruHv8w(SideMenuCacheImpl$get$$inlined$map$1.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 113;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objEmit = this.RemoteActionCompatParcelizer.emit(null, this);
        int i4 = MediaMetadataCompat + 29;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objEmit;
    }
}
