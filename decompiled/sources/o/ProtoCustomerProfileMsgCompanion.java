package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;
import okhttp3.RequestBody;
import okio.Options;

/* JADX INFO: loaded from: classes4.dex */
public final class ProtoCustomerProfileMsgCompanion extends LazyKt__LazyJVMKt {
    public final /* synthetic */ int IconCompatParcelizer = 1;
    public final int RatingCompat;
    public final Object read;
    public final FwFClientKt serializer;
    public final Method write;

    public ProtoCustomerProfileMsgCompanion(Method method, int i, resetMessageMarginslambda00 resetmessagemarginslambda00, FwFClientKt fwFClientKt) {
        this.write = method;
        this.RatingCompat = i;
        this.read = resetmessagemarginslambda00;
        this.serializer = fwFClientKt;
    }

    @Override // kotlin.LazyKt__LazyJVMKt
    public final void read(ProtoFeatureMsg protoFeatureMsg, Object obj) {
        int i = this.IconCompatParcelizer;
        FwFClientKt fwFClientKt = this.serializer;
        Object obj2 = this.read;
        Method method = this.write;
        int i2 = this.RatingCompat;
        if (i == 0) {
            if (obj == null) {
                return;
            }
            try {
                RequestBody requestBody = (RequestBody) fwFClientKt.IconCompatParcelizer(obj);
                protoFeatureMsg.MediaMetadataCompat.read((resetMessageMarginslambda00) obj2, requestBody);
                return;
            } catch (IOException e) {
                throw getKind.IconCompatParcelizer(method, i2, af$$ExternalSyntheticOutline0.m(obj, "Unable to convert ", " to RequestBody"), e);
            }
        }
        Map map = (Map) obj;
        if (map == null) {
            throw getKind.IconCompatParcelizer(method, i2, "Part map was null.", new Object[0]);
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw getKind.IconCompatParcelizer(method, i2, "Part map contained null key.", new Object[0]);
            }
            Object value = entry.getValue();
            if (value == null) {
                throw getKind.IconCompatParcelizer(method, i2, ff$$ExternalSyntheticOutline0.m("Part map contained null value for key '", str, "'."), new Object[0]);
            }
            String[] strArr = {"Content-Disposition", ff$$ExternalSyntheticOutline0.m("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) obj2};
            resetMessageMarginslambda00 resetmessagemarginslambda00 = resetMessageMarginslambda00.EMPTY;
            protoFeatureMsg.MediaMetadataCompat.read(Options.Companion.serializer(strArr), (RequestBody) fwFClientKt.IconCompatParcelizer(value));
        }
    }

    public ProtoCustomerProfileMsgCompanion(Method method, int i, FwFClientKt fwFClientKt, String str) {
        this.write = method;
        this.RatingCompat = i;
        this.serializer = fwFClientKt;
        this.read = str;
    }
}
