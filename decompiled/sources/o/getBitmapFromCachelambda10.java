package o;

import android.content.Context;
import com.sentiance.sdk.events.controlmessageextras.LogUploadResult;

/* JADX INFO: loaded from: classes4.dex */
public final class getBitmapFromCachelambda10 extends isExpired {
    final /* synthetic */ Context read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getBitmapFromCachelambda10(clearAllData clearalldata, Context context) {
        super(clearalldata);
        this.read = context;
    }

    @Override // o.isExpired
    public final void IconCompatParcelizer(LogUploadResult logUploadResult) {
        readBoolean.write(new getBitmapFromDiskCachelambda00(logUploadResult, 1, this.read));
    }
}
