package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes4.dex */
public final class ProtoFeatureMsgserializer implements FwFClientKt {
    public static final InAppMessageHtmlBaseView serializer;
    public final Gson RemoteActionCompatParcelizer;
    public final TypeAdapter write;

    @Override // o.FwFClientKt
    public final Object IconCompatParcelizer(Object obj) throws IOException {
        RegistryMissingComponentException registryMissingComponentException = new RegistryMissingComponentException();
        JsonWriter jsonWriterNewJsonWriter = this.RemoteActionCompatParcelizer.newJsonWriter(new OutputStreamWriter(new RegistryNoModelLoaderAvailableException(0, registryMissingComponentException), StandardCharsets.UTF_8));
        this.write.write(jsonWriterNewJsonWriter, obj);
        jsonWriterNewJsonWriter.close();
        return RequestBody.create(serializer, registryMissingComponentException.RemoteActionCompatParcelizer(registryMissingComponentException.size));
    }

    public ProtoFeatureMsgserializer(Gson gson, TypeAdapter typeAdapter) {
        this.RemoteActionCompatParcelizer = gson;
        this.write = typeAdapter;
    }

    static {
        getInAppMessageEventMap getinappmessageeventmap = InAppMessageHtmlBaseView.TYPE_SUBTYPE;
        serializer = androidx.sqlite.SQLite.write("application/json; charset=UTF-8");
    }
}
