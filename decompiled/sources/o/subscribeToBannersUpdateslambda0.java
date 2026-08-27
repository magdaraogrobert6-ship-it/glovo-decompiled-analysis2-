package o;

import com.roadrunner.user.properties.data.UserPropertiesDataStore;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class subscribeToBannersUpdateslambda0 extends ContinuationImpl {
    private static int read = 1;
    private static int write;
    public int IconCompatParcelizer;
    public final /* synthetic */ UserPropertiesDataStore RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public subscribeToBannersUpdateslambda0(UserPropertiesDataStore userPropertiesDataStore, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = userPropertiesDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 39;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            this.serializer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return UserPropertiesDataStore.access$decodeFromJson(this.RemoteActionCompatParcelizer, null, this);
        }
        this.serializer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        UserPropertiesDataStore.access$decodeFromJson(this.RemoteActionCompatParcelizer, null, this);
        obj2.hashCode();
        throw null;
    }
}
