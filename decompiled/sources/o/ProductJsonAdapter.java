package o;

import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes4.dex */
public final class ProductJsonAdapter implements PrivilegedAction {
    public final /* synthetic */ getPaymentMedium IconCompatParcelizer;
    public final /* synthetic */ String RemoteActionCompatParcelizer;
    public final /* synthetic */ String read;
    public final /* synthetic */ String write;

    @Override // java.security.PrivilegedAction
    public final Object run() {
        String str = this.read;
        String str2 = this.write;
        getPaymentMedium getpaymentmedium = this.IconCompatParcelizer;
        java.security.Provider.Service service = super/*java.security.Provider*/.getService(str, str2);
        if (service == null) {
            return null;
        }
        getpaymentmedium.PlaybackStateCompat.put(this.RemoteActionCompatParcelizer, service);
        getpaymentmedium.remove(service.getType() + "." + service.getAlgorithm());
        getpaymentmedium.putService(service);
        return service;
    }

    public ProductJsonAdapter(getPaymentMedium getpaymentmedium, String str, String str2, String str3) {
        this.IconCompatParcelizer = getpaymentmedium;
        this.read = str;
        this.write = str2;
        this.RemoteActionCompatParcelizer = str3;
    }
}
