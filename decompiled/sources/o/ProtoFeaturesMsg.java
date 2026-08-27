package o;

import com.squareup.moshi.JsonAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class ProtoFeaturesMsg implements FwFClientKt {
    public static final RequestBuilder write;
    public final JsonAdapter IconCompatParcelizer;

    @Override // o.FwFClientKt
    public final Object IconCompatParcelizer(Object obj) {
        _get_messageWebView_lambda3 _get_messagewebview_lambda3 = (_get_messageWebView_lambda3) obj;
        RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException = _get_messagewebview_lambda3.read();
        try {
            RequestBuilder requestBuilder = write;
            if (registryNoSourceEncoderAvailableException.RemoteActionCompatParcelizer(0L, requestBuilder)) {
                registryNoSourceEncoderAvailableException.RatingCompat(requestBuilder.data.length);
            }
            getLocalBitmaplambda1 getlocalbitmaplambda1 = new getLocalBitmaplambda1(registryNoSourceEncoderAvailableException);
            Object objFromJson = this.IconCompatParcelizer.fromJson(getlocalbitmaplambda1);
            if (getlocalbitmaplambda1.MediaSessionCompatToken() != getLocalBitmaplambda3.END_DOCUMENT) {
                throw new com.squareup.moshi.JsonDataException("JSON document was not fully consumed.");
            }
            _get_messagewebview_lambda3.close();
            return objFromJson;
        } catch (Throwable th) {
            _get_messagewebview_lambda3.close();
            throw th;
        }
    }

    public ProtoFeaturesMsg(JsonAdapter jsonAdapter) {
        this.IconCompatParcelizer = jsonAdapter;
    }

    static {
        RequestBuilder requestBuilder = RequestBuilder.EMPTY;
        write = ImageHeaderParserImageType.write("EFBBBF");
    }
}
