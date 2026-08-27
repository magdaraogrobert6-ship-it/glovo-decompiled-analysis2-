package o;

import com.squareup.moshi.JsonAdapter;
import java.io.EOFException;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes4.dex */
public final class ProtoFeatureOrErrorMsgserializer implements FwFClientKt {
    public static final InAppMessageHtmlBaseView write;
    public final JsonAdapter IconCompatParcelizer;

    @Override // o.FwFClientKt
    public final Object IconCompatParcelizer(Object obj) throws EOFException {
        RegistryMissingComponentException registryMissingComponentException = new RegistryMissingComponentException();
        this.IconCompatParcelizer.toJson(new getLocalBitmaplambda0(registryMissingComponentException), obj);
        return RequestBody.create(write, registryMissingComponentException.RemoteActionCompatParcelizer(registryMissingComponentException.size));
    }

    public ProtoFeatureOrErrorMsgserializer(JsonAdapter jsonAdapter) {
        this.IconCompatParcelizer = jsonAdapter;
    }

    static {
        getInAppMessageEventMap getinappmessageeventmap = InAppMessageHtmlBaseView.TYPE_SUBTYPE;
        write = androidx.sqlite.SQLite.write("application/json; charset=UTF-8");
    }
}
