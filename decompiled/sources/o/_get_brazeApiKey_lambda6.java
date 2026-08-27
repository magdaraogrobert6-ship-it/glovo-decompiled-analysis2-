package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class _get_brazeApiKey_lambda6 implements getResourceConfigurationValue {
    public final getRuntimeConfigurationValuelambda0 IconCompatParcelizer;
    public final /* synthetic */ _get_brazeApiKey_lambda3 RemoteActionCompatParcelizer;
    public long serializer = 0;
    public boolean write;

    @Override // o.getResourceConfigurationValue
    public final isPushDeepLinkBackStackActivityEnabled IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // o.getResourceConfigurationValue
    public long read(r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans, long j) throws IOException {
        try {
            long j2 = this.RemoteActionCompatParcelizer.serializer.read(r8lambdabeyrnr8p6809bwlboro_stans, j);
            if (j2 > 0) {
                this.serializer += j2;
            }
            return j2;
        } catch (IOException e) {
            read(false, e);
            throw e;
        }
    }

    public final void read(boolean z, IOException iOException) {
        _get_brazeApiKey_lambda3 _get_brazeapikey_lambda3 = this.RemoteActionCompatParcelizer;
        int i = _get_brazeapikey_lambda3.read;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.read(_get_brazeapikey_lambda3.read, "state: ");
            return;
        }
        getRuntimeConfigurationValuelambda0 getruntimeconfigurationvaluelambda0 = this.IconCompatParcelizer;
        isPushDeepLinkBackStackActivityEnabled ispushdeeplinkbackstackactivityenabled = getruntimeconfigurationvaluelambda0.RemoteActionCompatParcelizer;
        getruntimeconfigurationvaluelambda0.RemoteActionCompatParcelizer = isPushDeepLinkBackStackActivityEnabled.write;
        ispushdeeplinkbackstackactivityenabled.serializer();
        ispushdeeplinkbackstackactivityenabled.read();
        _get_brazeapikey_lambda3.read = 6;
        r8lambdat8fEv0yHSUgjmGCOLXJ0PkXlpw r8lambdat8fev0yhsugjmgcolxj0pkxlpw = _get_brazeapikey_lambda3.RemoteActionCompatParcelizer;
        if (r8lambdat8fev0yhsugjmgcolxj0pkxlpw != null) {
            r8lambdat8fev0yhsugjmgcolxj0pkxlpw.IconCompatParcelizer(!z, _get_brazeapikey_lambda3, iOException);
        }
    }

    public _get_brazeApiKey_lambda6(_get_brazeApiKey_lambda3 _get_brazeapikey_lambda3) {
        this.RemoteActionCompatParcelizer = _get_brazeapikey_lambda3;
        this.IconCompatParcelizer = new getRuntimeConfigurationValuelambda0(_get_brazeapikey_lambda3.serializer.IconCompatParcelizer());
    }
}
