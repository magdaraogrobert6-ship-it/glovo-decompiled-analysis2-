package o;

import com.roadrunner.map.container.enabled.presentation.MapNavigationWrapper;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: o.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0196q extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ MapNavigationWrapper RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0196q(MapNavigationWrapper mapNavigationWrapper, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = mapNavigationWrapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objWaitForMapboxInitialization;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 103;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.read = obj;
            this.write |= Integer.MIN_VALUE;
            objWaitForMapboxInitialization = this.RemoteActionCompatParcelizer.waitForMapboxInitialization(this);
            int i3 = 27 / 0;
        } else {
            this.read = obj;
            this.write |= Integer.MIN_VALUE;
            objWaitForMapboxInitialization = this.RemoteActionCompatParcelizer.waitForMapboxInitialization(this);
        }
        int i4 = serializer + 119;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objWaitForMapboxInitialization;
        }
        throw null;
    }
}
