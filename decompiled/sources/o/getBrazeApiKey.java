package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class getBrazeApiKey extends r8lambda0S3kvX2wuurB_sOm2dk25CPetL8 {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ getGenericEnumSetFromStringSet read;
    public final /* synthetic */ long serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getBrazeApiKey(getGenericEnumSetFromStringSet getgenericenumsetfromstringset, Object[] objArr, int i, long j) {
        super("OkHttp Window Update %s stream %d", objArr);
        this.read = getgenericenumsetfromstringset;
        this.IconCompatParcelizer = i;
        this.serializer = j;
    }

    @Override // o.r8lambda0S3kvX2wuurB_sOm2dk25CPetL8
    public final void RemoteActionCompatParcelizer() {
        getGenericEnumSetFromStringSet getgenericenumsetfromstringset = this.read;
        try {
            getgenericenumsetfromstringset.write.read(this.IconCompatParcelizer, this.serializer);
        } catch (IOException unused) {
            getgenericenumsetfromstringset.RemoteActionCompatParcelizer();
        }
    }
}
