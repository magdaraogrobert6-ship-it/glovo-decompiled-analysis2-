package o;

import com.roadrunner.appmigration.presentation.AppMigrationBannerUiModelImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getReplacedChildrenui extends ContinuationImpl {
    private static int MediaMetadataCompat = 1;
    private static int read;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ AppMigrationBannerUiModelImpl.AnonymousClass1.C00291 RemoteActionCompatParcelizer;
    public int serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getReplacedChildrenui(AppMigrationBannerUiModelImpl.AnonymousClass1.C00291 c00291, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = c00291;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 33;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objEmit = this.RemoteActionCompatParcelizer.emit((findCoordinatorToGetBoundsui) null, (ShortNewsContentCardView) this);
        int i4 = MediaMetadataCompat + 95;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objEmit;
    }
}
