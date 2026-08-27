package o;

import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes4.dex */
public final class sync implements FwFClientKt {
    public final /* synthetic */ int read;
    public static final sync RemoteActionCompatParcelizer = new sync(1);
    public static final sync write = new sync(0);
    public static final sync serializer = new sync(2);
    public static final sync IconCompatParcelizer = new sync(3);

    public /* synthetic */ sync(int i) {
        this.read = i;
    }

    @Override // o.FwFClientKt
    public final Object IconCompatParcelizer(Object obj) {
        int i = this.read;
        if (i == 0) {
            return (RequestBody) obj;
        }
        if (i != 1) {
            if (i == 2) {
                return (_get_messageWebView_lambda3) obj;
            }
            ((_get_messageWebView_lambda3) obj).close();
            return null;
        }
        _get_messageWebView_lambda3 _get_messagewebview_lambda3 = (_get_messageWebView_lambda3) obj;
        try {
            RegistryMissingComponentException registryMissingComponentException = new RegistryMissingComponentException();
            _get_messagewebview_lambda3.read().RemoteActionCompatParcelizer(registryMissingComponentException);
            return new _get_messageWebView_lambda4(_get_messagewebview_lambda3.write(), _get_messagewebview_lambda3.IconCompatParcelizer(), registryMissingComponentException);
        } finally {
            _get_messagewebview_lambda3.close();
        }
    }
}
