package o;

import android.content.Context;
import com.sentiance.sdk.events.EventUploadResult;

/* JADX INFO: loaded from: classes4.dex */
public final class getBitmapFromCachelambda00 extends getPropertiesJsonannotations {
    final /* synthetic */ Context read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getBitmapFromCachelambda00(clearAllData clearalldata, Context context) {
        super(clearalldata);
        this.read = context;
    }

    @Override // o.getPropertiesJsonannotations
    public final void serializer(EventUploadResult eventUploadResult) {
        readBoolean.write(new getBitmapFromDiskCachelambda00(eventUploadResult, 0, this.read));
    }
}
