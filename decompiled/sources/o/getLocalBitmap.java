package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import okio.Options;

/* JADX INFO: loaded from: classes4.dex */
public final class getLocalBitmap {
    public final String[] RemoteActionCompatParcelizer;
    public final Options read;

    public static getLocalBitmap RemoteActionCompatParcelizer(String... strArr) {
        try {
            RequestBuilder[] requestBuilderArr = new RequestBuilder[strArr.length];
            RegistryMissingComponentException registryMissingComponentException = new RegistryMissingComponentException();
            for (int i = 0; i < strArr.length; i++) {
                getLocalBitmaplambda0.RemoteActionCompatParcelizer(registryMissingComponentException, strArr[i]);
                registryMissingComponentException.MediaBrowserCompatMediaItem();
                requestBuilderArr[i] = registryMissingComponentException.RemoteActionCompatParcelizer(registryMissingComponentException.size);
            }
            return new getLocalBitmap((String[]) strArr.clone(), Options.Companion.serializer(requestBuilderArr));
        } catch (IOException e) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(e);
            return null;
        }
    }

    public getLocalBitmap(String[] strArr, Options options) {
        this.RemoteActionCompatParcelizer = strArr;
        this.read = options;
    }
}
