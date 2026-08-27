package o;

import com.sentiance.okhttp3.internal.http2.ErrorCode;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class getBaseUrlForRequests extends r8lambda0S3kvX2wuurB_sOm2dk25CPetL8 {
    public final /* synthetic */ ErrorCode IconCompatParcelizer;
    public final /* synthetic */ getGenericEnumSetFromStringSet serializer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getBaseUrlForRequests(getGenericEnumSetFromStringSet getgenericenumsetfromstringset, Object[] objArr, int i, ErrorCode errorCode) {
        super("OkHttp %s stream %d", objArr);
        this.serializer = getgenericenumsetfromstringset;
        this.write = i;
        this.IconCompatParcelizer = errorCode;
    }

    @Override // o.r8lambda0S3kvX2wuurB_sOm2dk25CPetL8
    public final void RemoteActionCompatParcelizer() {
        getGenericEnumSetFromStringSet getgenericenumsetfromstringset = this.serializer;
        try {
            getgenericenumsetfromstringset.write.read(this.write, this.IconCompatParcelizer);
        } catch (IOException unused) {
            getgenericenumsetfromstringset.RemoteActionCompatParcelizer();
        }
    }
}
