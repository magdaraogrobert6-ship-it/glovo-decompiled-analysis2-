package o;

import com.mapbox.navigation.core.arrival.ArrivalProgressObserver$$ExternalSyntheticLambda0;
import com.roadrunner.domain.util.IsFixableByRetry;
import com.roadrunner.home.nest.NestFragment;
import com.sentiance.core.model.events.H$b;

/* JADX INFO: loaded from: classes3.dex */
public final class getOffsetFromRectListForBjo55l4 implements outerToInnerOffsetBjo55l4 {
    private static int MediaDescriptionCompat = 0;
    private static int MediaMetadataCompat = 1;
    public onBackPressed IconCompatParcelizer;
    public final H$b RemoteActionCompatParcelizer;
    public final NestFragment.AnonymousClass1 read;
    public final androidx.activity.result.ActivityResultRegistry serializer;
    public final IsFixableByRetry write;

    public getOffsetFromRectListForBjo55l4(androidx.activity.result.ActivityResultRegistry activityResultRegistry, NestFragment.AnonymousClass1 anonymousClass1, H$b h$b, IsFixableByRetry isFixableByRetry) {
        activityResultRegistry.getClass();
        h$b.getClass();
        isFixableByRetry.getClass();
        this.serializer = activityResultRegistry;
        this.read = anonymousClass1;
        this.RemoteActionCompatParcelizer = h$b;
        this.write = isFixableByRetry;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        int i = 2 % 2;
        accessisrendernodecompatiblecp.getClass();
        super.onCreate(accessisrendernodecompatiblecp);
        this.write.getClass();
        this.IconCompatParcelizer = this.serializer.register("custom_password_launch_activity", accessisrendernodecompatiblecp, new onPictureInPictureModeChanged(3), new ArrivalProgressObserver$$ExternalSyntheticLambda0(this, 12, accessisrendernodecompatiblecp));
        int i2 = MediaMetadataCompat + 83;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }
}
