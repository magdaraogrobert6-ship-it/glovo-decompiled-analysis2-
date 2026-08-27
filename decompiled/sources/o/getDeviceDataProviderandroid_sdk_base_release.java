package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class getDeviceDataProviderandroid_sdk_base_release {
    public Boolean IconCompatParcelizer;
    public Boolean serializer;
    public Boolean write;

    public clearInstanceandroid_sdk_base_release IconCompatParcelizer() {
        if (this.write == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'has_bus_route' is missing");
            return null;
        }
        if (this.IconCompatParcelizer == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'has_train_route' is missing");
            return null;
        }
        if (this.serializer != null) {
            return new clearInstanceandroid_sdk_base_release(this);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'has_rail_route' is missing");
        return null;
    }
}
