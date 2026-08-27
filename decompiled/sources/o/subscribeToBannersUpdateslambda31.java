package o;

import com.roadrunner.user.properties.data.UserPropertiesRepository;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class subscribeToBannersUpdateslambda31 extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int write;
    public final /* synthetic */ UserPropertiesRepository IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public AtomicReference read;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public subscribeToBannersUpdateslambda31(UserPropertiesRepository userPropertiesRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = userPropertiesRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objLoadUserProperties;
        int i = 2 % 2;
        int i2 = write + 57;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.serializer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            objLoadUserProperties = this.IconCompatParcelizer.loadUserProperties(this);
            int i3 = 11 / 0;
        } else {
            this.serializer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            objLoadUserProperties = this.IconCompatParcelizer.loadUserProperties(this);
        }
        int i4 = write + 51;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objLoadUserProperties;
    }
}
