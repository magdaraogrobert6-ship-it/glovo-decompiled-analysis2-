package o;

import com.mapbox.maps.MapView;
import com.roadrunner.map.container.enabled.presentation.MapNavigationWrapper;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: o.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0200s extends ContinuationImpl {
    private static int MediaDescriptionCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public MapView IconCompatParcelizer;
    public final /* synthetic */ MapNavigationWrapper RemoteActionCompatParcelizer;
    public accessisRenderNodeCompatiblecp read;
    public /* synthetic */ Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0200s(MapNavigationWrapper mapNavigationWrapper, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = mapNavigationWrapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 59;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.write |= Integer.MIN_VALUE;
        Object objAccess$initAndAttachNavigation = MapNavigationWrapper.access$initAndAttachNavigation(this.RemoteActionCompatParcelizer, null, null, this);
        int i4 = MediaSessionCompatQueueItem + 81;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objAccess$initAndAttachNavigation;
    }
}
