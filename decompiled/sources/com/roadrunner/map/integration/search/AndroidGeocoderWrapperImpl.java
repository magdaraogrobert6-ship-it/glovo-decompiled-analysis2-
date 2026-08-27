package com.roadrunner.map.integration.search;

import android.app.Application;
import android.location.Address;
import android.location.Geocoder;
import android.os.Build;
import androidx.compose.ui.graphics.Fields;
import androidx.transition.Transition$1;
import com.roadrunner.home.nest.NestFragment$$ExternalSyntheticLambda1;
import com.roadrunner.login.presentation.signin.SignInViewModel$onSignInClicked$1;
import io.grpc.LoadBalancer$Helper;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CancellableContinuationImpl;
import o.ef;
import o.n9;
import o.nc;
import o.onContentCardDismissed;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class AndroidGeocoderWrapperImpl implements n9 {
    private static int serializer = 0;
    private static int write = 1;
    public final Geocoder RemoteActionCompatParcelizer;

    public AndroidGeocoderWrapperImpl(Application application, Transition$1 transition$1) {
        this.RemoteActionCompatParcelizer = new Geocoder(application);
    }

    public final Object getFromLocation(double d, double d2, NestFragment$$ExternalSyntheticLambda1 nestFragment$$ExternalSyntheticLambda1, SignInViewModel$onSignInClicked$1 signInViewModel$onSignInClicked$1) {
        Address address;
        int i = 2 % 2;
        int i2 = serializer + 43;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        boolean z = true;
        if (Build.VERSION.SDK_INT >= 33) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(signInViewModel$onSignInClicked$1));
            cancellableContinuationImpl.read();
            try {
                this.RemoteActionCompatParcelizer.getFromLocation(d, d2, 1, new nc(nestFragment$$ExternalSyntheticLambda1, cancellableContinuationImpl));
                int i4 = serializer + 47;
                write = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    int i5 = 5 / 3;
                }
            } catch (Exception e) {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "AndroidGeocoderWrapper: getFromLocation failed synchronously", new Object[0]);
                cancellableContinuationImpl.resumeWith(null);
            }
            Object result = cancellableContinuationImpl.getResult();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return result;
        }
        try {
            List<Address> fromLocation = this.RemoteActionCompatParcelizer.getFromLocation(d, d2, 1);
            String addressLine = (fromLocation == null || (address = (Address) onContentCardDismissed.MediaMetadataCompat((List) fromLocation)) == null) ? null : address.getAddressLine(0);
            ef efVar = ef.ANDROID;
            if (addressLine == null) {
                int i6 = write + 77;
                serializer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                z = false;
            }
            nestFragment$$ExternalSyntheticLambda1.invoke(efVar, Boolean.valueOf(z));
            return addressLine;
        } catch (Exception e2) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e2, "AndroidGeocoderWrapper: getFromLocation failed", new Object[0]);
            nestFragment$$ExternalSyntheticLambda1.invoke(ef.ANDROID, Boolean.FALSE);
            return null;
        }
    }
}
