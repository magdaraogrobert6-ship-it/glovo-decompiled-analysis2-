package o;

import com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class setComposableContent extends ContinuationImpl {
    private static int MediaDescriptionCompat = 1;
    private static int write;
    public String IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ ConfirmationRepository read;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setComposableContent(ConfirmationRepository confirmationRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = confirmationRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws getLoaderKey {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 79;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.serializer |= Integer.MIN_VALUE;
            return this.read.uploadPicture(null, null, null, this);
        }
        this.RemoteActionCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        this.read.uploadPicture(null, null, null, this);
        throw null;
    }
}
