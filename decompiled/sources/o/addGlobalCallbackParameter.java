package o;

import com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class addGlobalCallbackParameter extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ FirebaseRemoteConfigProvider write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public addGlobalCallbackParameter(FirebaseRemoteConfigProvider firebaseRemoteConfigProvider, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = firebaseRemoteConfigProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 121;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objActivate = this.write.activate(this);
        int i4 = IconCompatParcelizer + 125;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objActivate;
    }
}
