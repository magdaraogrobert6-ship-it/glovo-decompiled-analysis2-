package o;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonToken;
import io.sentry.JsonObjectSerializer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public final class ProtoFeatureMsggetHoldouts1 implements FwFClientKt {
    public final Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final Object serializer;

    public /* synthetic */ ProtoFeatureMsggetHoldouts1(Object obj, int i, Object obj2) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = obj;
        this.serializer = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0039  */
    @Override // o.FwFClientKt
    public final Object IconCompatParcelizer(Object obj) {
        Charset charsetSerializer;
        int i = this.RemoteActionCompatParcelizer;
        Object obj2 = this.IconCompatParcelizer;
        Object obj3 = this.serializer;
        if (i != 0) {
            _get_messageWebView_lambda3 _get_messagewebview_lambda3 = (_get_messageWebView_lambda3) obj;
            _get_messagewebview_lambda3.getClass();
            String strMediaMetadataCompat = _get_messagewebview_lambda3.MediaMetadataCompat();
            return ((r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc) ((JsonObjectSerializer) obj3).jsonReflectionObjectSerializer).serializer(strMediaMetadataCompat, (setGraphicModalMaxWidthDp) obj2);
        }
        _get_messageWebView_lambda3 _get_messagewebview_lambda4 = (_get_messageWebView_lambda3) obj;
        Gson gson = (Gson) obj2;
        finishWebViewDisplaylambda0 finishwebviewdisplaylambda0 = _get_messagewebview_lambda4.reader;
        if (finishwebviewdisplaylambda0 == null) {
            RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException = _get_messagewebview_lambda4.read();
            InAppMessageHtmlBaseView inAppMessageHtmlBaseViewWrite = _get_messagewebview_lambda4.write();
            if (inAppMessageHtmlBaseViewWrite != null) {
                getInAppMessageEventMap getinappmessageeventmap = InAppMessageHtmlBaseView.TYPE_SUBTYPE;
                charsetSerializer = inAppMessageHtmlBaseViewWrite.serializer(null);
                if (charsetSerializer == null) {
                    charsetSerializer = ensureSubscribedToInAppMessageEvents.write;
                }
            } else {
                charsetSerializer = ensureSubscribedToInAppMessageEvents.write;
            }
            finishWebViewDisplaylambda0 finishwebviewdisplaylambda1 = new finishWebViewDisplaylambda0(registryNoSourceEncoderAvailableException, charsetSerializer);
            _get_messagewebview_lambda4.reader = finishwebviewdisplaylambda1;
            finishwebviewdisplaylambda0 = finishwebviewdisplaylambda1;
        }
        com.google.gson.stream.JsonReader jsonReaderNewJsonReader = gson.newJsonReader(finishwebviewdisplaylambda0);
        try {
            Object obj4 = ((TypeAdapter) obj3).read2(jsonReaderNewJsonReader);
            if (jsonReaderNewJsonReader.peek() != JsonToken.END_DOCUMENT) {
                throw new JsonIOException("JSON document was not fully consumed.");
            }
            _get_messagewebview_lambda4.close();
            return obj4;
        } catch (Throwable th) {
            _get_messagewebview_lambda4.close();
            throw th;
        }
    }
}
