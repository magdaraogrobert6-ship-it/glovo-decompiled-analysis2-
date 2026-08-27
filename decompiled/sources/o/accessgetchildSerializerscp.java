package o;

import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.KotlinNullPointerException;
import kotlinx.coroutines.CancellableContinuationImpl;
import okio.Options;

/* JADX INFO: loaded from: classes4.dex */
public final class accessgetchildSerializerscp implements OnSuccessListener, FwFClientExtensionKtgetVariationsevalResults1 {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ CancellableContinuationImpl read;

    public /* synthetic */ accessgetchildSerializerscp(CancellableContinuationImpl cancellableContinuationImpl, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.read = cancellableContinuationImpl;
    }

    @Override // o.FwFClientExtensionKtgetVariationsevalResults1
    public void onFailure(syncCustomerProfile synccustomerprofile, Throwable th) {
        int i = this.RemoteActionCompatParcelizer;
        CancellableContinuationImpl cancellableContinuationImpl = this.read;
        if (i != 0) {
            cancellableContinuationImpl.resumeWith(new isItemDismissable(th));
        } else {
            cancellableContinuationImpl.resumeWith(new isItemDismissable(th));
        }
    }

    @Override // o.FwFClientExtensionKtgetVariationsevalResults1
    public void onResponse(syncCustomerProfile synccustomerprofile, getHoldoutVariationName getholdoutvariationname) {
        int i = this.RemoteActionCompatParcelizer;
        CancellableContinuationImpl cancellableContinuationImpl = this.read;
        if (i != 0) {
            cancellableContinuationImpl.resumeWith(getholdoutvariationname);
            return;
        }
        if (!getholdoutvariationname.rawResponse.isSuccessful) {
            cancellableContinuationImpl.resumeWith(new isItemDismissable(new retrofit2.HttpException(getholdoutvariationname)));
            return;
        }
        Object obj = getholdoutvariationname.body;
        if (obj != null) {
            cancellableContinuationImpl.resumeWith(obj);
            return;
        }
        r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60Write = synccustomerprofile.write();
        r8lambday113fdftsr5e4pzj6xssxltpl60Write.getClass();
        r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = displayInAppMessagelambda1.serializer(DecodeResult.class);
        Object objCast = Options.Companion.read(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer).cast(r8lambday113fdftsr5e4pzj6xssxltpl60Write.tags.get(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer));
        objCast.getClass();
        DecodeResult decodeResult = (DecodeResult) objCast;
        cancellableContinuationImpl.resumeWith(new isItemDismissable(new KotlinNullPointerException("Response from " + decodeResult.serializer.getName() + '.' + decodeResult.write.getName() + " was null but response body type was declared as non-null")));
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        this.read.resumeWith(obj);
    }
}
