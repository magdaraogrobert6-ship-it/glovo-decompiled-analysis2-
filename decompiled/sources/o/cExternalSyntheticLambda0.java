package o;

import com.roadrunner.login.presentation.router.GetAuthStateViewModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class cExternalSyntheticLambda0 extends ContinuationImpl {
    private static int MediaMetadataCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ GetAuthStateViewModel IconCompatParcelizer;
    public getTextSelectionRange read;
    public int serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cExternalSyntheticLambda0(GetAuthStateViewModel getAuthStateViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = getAuthStateViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 49;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objLoadUserProperties = this.IconCompatParcelizer.loadUserProperties(null, this);
        int i4 = RemoteActionCompatParcelizer + 17;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objLoadUserProperties;
    }
}
