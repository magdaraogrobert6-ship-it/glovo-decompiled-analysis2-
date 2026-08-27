package o;

import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import com.github.gcacace.signaturepad.views.SignaturePad;

/* JADX INFO: loaded from: classes4.dex */
public final class accessgetAcp implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Bitmap read;
    public final /* synthetic */ SignaturePad serializer;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        SignaturePad signaturePad = this.serializer;
        signaturePad.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        signaturePad.setSignatureBitmap(this.read);
    }

    public accessgetAcp(SignaturePad signaturePad, Bitmap bitmap) {
        this.serializer = signaturePad;
        this.read = bitmap;
    }
}
