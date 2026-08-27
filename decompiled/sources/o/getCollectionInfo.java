package o;

import com.roadrunner.appupdate.PlayStoreBasedAppUpdate;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getCollectionInfo extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaMetadataCompat = 1;
    public provideInsetsValuescytEWk0 IconCompatParcelizer;
    public androidx.appcompat.app.AppCompatActivity RemoteActionCompatParcelizer;
    public int read;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ PlayStoreBasedAppUpdate write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getCollectionInfo(PlayStoreBasedAppUpdate playStoreBasedAppUpdate, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = playStoreBasedAppUpdate;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 113;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objAccess$checkAppUpdateWith = PlayStoreBasedAppUpdate.access$checkAppUpdateWith(this.write, null, this);
        int i4 = MediaMetadataCompat + 17;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objAccess$checkAppUpdateWith;
    }
}
