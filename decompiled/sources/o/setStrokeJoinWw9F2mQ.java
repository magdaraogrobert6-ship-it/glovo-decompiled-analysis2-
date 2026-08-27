package o;

import android.view.View;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class setStrokeJoinWw9F2mQ {
    public static final getPhoneNumber serializer = new getPhoneNumber(new RemoteActionCompatParcelizer(27));

    public static asFrameworkPaint IconCompatParcelizer(getBirthDateFull getbirthdatefull) {
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        asFrameworkPaint asframeworkpaint = (asFrameworkPaint) getpostalcode.write((getNewPassword) serializer);
        if (asframeworkpaint == null) {
            getpostalcode.serializer(1260197608);
            Object[] objArr = {(View) getpostalcode.write((getNewPassword) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView())};
            int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
            asframeworkpaint = (asFrameworkPaint) BuildersKt.IconCompatParcelizer(-1340292176, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), 1340292178, objArr, iRemoteActionCompatParcelizer);
        } else {
            getpostalcode.serializer(1260196492);
        }
        getpostalcode.IconCompatParcelizer(false);
        return asframeworkpaint;
    }
}
