package o;

import com.roadrunner.login.presentation.router.GetAuthStateViewModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class bh extends ContinuationImpl {
    private static int MediaSessionCompatQueueItem = 1;
    private static int read;
    public int IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ GetAuthStateViewModel serializer;
    public boolean write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(GetAuthStateViewModel getAuthStateViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = getAuthStateViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 103;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return GetAuthStateViewModel.access$goToMain(this.serializer, this);
        }
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        int i3 = 97 / 0;
        return GetAuthStateViewModel.access$goToMain(this.serializer, this);
    }
}
