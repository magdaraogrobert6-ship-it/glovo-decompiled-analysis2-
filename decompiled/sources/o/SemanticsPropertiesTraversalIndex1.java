package o;

import com.roadrunner.auth.data.SignInDataStore;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class SemanticsPropertiesTraversalIndex1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ SignInDataStore IconCompatParcelizer;
    public /* synthetic */ Object read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SemanticsPropertiesTraversalIndex1(SignInDataStore signInDataStore, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = signInDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objAccess$decodeFromJson;
        int i = 2 % 2;
        int i2 = serializer + 111;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.read = obj;
            this.write |= Integer.MIN_VALUE;
            objAccess$decodeFromJson = SignInDataStore.access$decodeFromJson(this.IconCompatParcelizer, null, this);
            int i3 = 56 / 0;
        } else {
            this.read = obj;
            this.write |= Integer.MIN_VALUE;
            objAccess$decodeFromJson = SignInDataStore.access$decodeFromJson(this.IconCompatParcelizer, null, this);
        }
        int i4 = RemoteActionCompatParcelizer + 109;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 89 / 0;
        }
        return objAccess$decodeFromJson;
    }
}
