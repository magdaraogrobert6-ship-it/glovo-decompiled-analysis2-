package o;

import java.util.Objects;
import kotlin.LazyKt__LazyJVMKt;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes4.dex */
public final class ProtoCustomerProfileMsg extends LazyKt__LazyJVMKt {
    public final boolean IconCompatParcelizer;
    public final String read;
    public final getChangeVersionControl write;

    public ProtoCustomerProfileMsg(String str, boolean z) {
        getChangeVersionControl getchangeversioncontrol = getChangeVersionControl.write;
        Objects.requireNonNull(str, "name == null");
        this.read = str;
        this.write = getchangeversioncontrol;
        this.IconCompatParcelizer = z;
    }

    @Override // kotlin.LazyKt__LazyJVMKt
    public final void read(ProtoFeatureMsg protoFeatureMsg, Object obj) {
        if (obj == null) {
            return;
        }
        this.write.getClass();
        String string = obj.toString();
        if (string == null) {
            return;
        }
        FormBody.Builder builder = protoFeatureMsg.RatingCompat;
        String str = this.read;
        if (this.IconCompatParcelizer) {
            builder.read(str, string);
        } else {
            builder.RemoteActionCompatParcelizer(str, string);
        }
    }
}
