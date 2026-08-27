package o;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.order.history.data.network.HistoryApiRequest$getHistory$2;
import com.roadrunner.order.history.presentation.orderdetails.OrderDetails;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.sentiance.core.model.events.N$b;
import io.grpc.internal.SharedResourcePool;
import java.util.Arrays;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RealImageLoaderexecute2 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ OrderDetails IconCompatParcelizer;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ RealImageLoaderexecute2job1 write;

    public /* synthetic */ RealImageLoaderexecute2(OrderDetails orderDetails, RealImageLoaderexecute2job1 realImageLoaderexecute2job1) {
        this.serializer = 1;
        this.IconCompatParcelizer = orderDetails;
        this.write = realImageLoaderexecute2job1;
    }

    public /* synthetic */ RealImageLoaderexecute2(RealImageLoaderexecute2job1 realImageLoaderexecute2job1, OrderDetails orderDetails, int i) {
        this.serializer = i;
        this.write = realImageLoaderexecute2job1;
        this.IconCompatParcelizer = orderDetails;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00e4  */
    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        Uri uri;
        Object uriKt;
        int i = 2 % 2;
        int i2 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        OrderDetails orderDetails = this.IconCompatParcelizer;
        if (i2 == 0) {
            RealImageLoaderexecute2job1 realImageLoaderexecute2job1 = this.write;
            realImageLoaderexecute2job1.MediaBrowserCompatMediaItem.IconCompatParcelizer(orderDetails.getDeliveryId(), false);
            r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.serializer(realImageLoaderexecute2job1, new HistoryApiRequest$getHistory$2(realImageLoaderexecute2job1, orderDetails.getDeliveryId(), orderDetails.getVendor().getPhoneNumber(), (ShortNewsContentCardView) null, 5));
            return createfromparcel;
        }
        if (i2 != 1) {
            RealImageLoaderexecute2job1 realImageLoaderexecute2job2 = this.write;
            realImageLoaderexecute2job2.MediaBrowserCompatMediaItem.IconCompatParcelizer(orderDetails.getDeliveryId(), true);
            r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.serializer(realImageLoaderexecute2job2, new HistoryApiRequest$getHistory$2(realImageLoaderexecute2job2, orderDetails.getDeliveryId(), orderDetails.getCustomer().getPhoneNumber(), (ShortNewsContentCardView) null, 5));
            return createfromparcel;
        }
        OrderDetails.Address dropOffAddress = orderDetails.getCustomer().getDropOffAddress();
        if (dropOffAddress != null) {
            int i3 = read + 97;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            OrderDetails.Address.LatLong coordinate = dropOffAddress.getCoordinate();
            if (coordinate != null) {
                String str = coordinate.getLatitude() + ", " + coordinate.getLongitude();
                RealImageLoaderexecute2job1 realImageLoaderexecute2job3 = this.write;
                N$b n$b = realImageLoaderexecute2job3.serializer;
                double latitude = coordinate.getLatitude();
                double longitude = coordinate.getLongitude();
                n$b.getClass();
                String str2 = ((oa) n$b.IconCompatParcelizer).IconCompatParcelizer.read();
                if (str2 != null) {
                    int i5 = read + 77;
                    RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str2, (CharSequence) "com.google.android.apps.maps", false)) {
                        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) ((transferSessionPackageI) n$b.serializer);
                        String strSerializer = firebaseRemoteConfigImpl.RemoteActionCompatParcelizer.serializer();
                        if (strSerializer == null) {
                            uri = Uri.parse(String.format(java.util.Locale.ROOT, "geo:0,0?q=%f,%f", Arrays.copyOf(new Object[]{Double.valueOf(latitude), Double.valueOf(longitude)}, 2)));
                            int i7 = read + 107;
                            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i8 = i7 % 2;
                        } else {
                            boolean zM = m1$$ExternalSyntheticOutline0.m(updateAdidI.SHOW_CUSTOMER_LABEL_ON_GOOGLE_MAPS, firebaseRemoteConfigImpl.IconCompatParcelizer, strSerializer, firebaseRemoteConfigImpl);
                            int i9 = RemoteActionCompatParcelizer;
                            int i10 = i9 + 49;
                            read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i11 = i10 % 2;
                            if (zM) {
                                int i12 = i9 + 47;
                                read = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i13 = i12 % 2;
                                uri = Uri.parse(String.format(java.util.Locale.ROOT, "geo:0,0?q=%f,%f (%s)", Arrays.copyOf(new Object[]{Double.valueOf(latitude), Double.valueOf(longitude), str}, 3)));
                                int i14 = read + 71;
                                RemoteActionCompatParcelizer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i15 = i14 % 2;
                            } else {
                                uri = Uri.parse(String.format(java.util.Locale.ROOT, "geo:0,0?q=%f,%f", Arrays.copyOf(new Object[]{Double.valueOf(latitude), Double.valueOf(longitude)}, 2)));
                                int i16 = read + 107;
                                RemoteActionCompatParcelizer = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i17 = i16 % 2;
                            }
                        }
                    } else {
                        uri = Uri.parse(String.format(java.util.Locale.ROOT, "geo:0,0?q=%f,%f", Arrays.copyOf(new Object[]{Double.valueOf(latitude), Double.valueOf(longitude)}, 2)));
                        int i18 = read + 107;
                        RemoteActionCompatParcelizer = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i19 = i18 % 2;
                    }
                } else {
                    uri = Uri.parse(String.format(java.util.Locale.ROOT, "geo:0,0?q=%f,%f", Arrays.copyOf(new Object[]{Double.valueOf(latitude), Double.valueOf(longitude)}, 2)));
                    int i110 = read + 107;
                    RemoteActionCompatParcelizer = i110 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i111 = i110 % 2;
                }
                Intent intent = new Intent("android.intent.action.VIEW", uri);
                if (intent.resolveActivity(((Application) n$b.read).getPackageManager()) != null) {
                    uriKt = new AsyncImageKt(intent);
                } else {
                    Timber.RemoteActionCompatParcelizer.read("Sorry, you don't have a navigation app", new Object[0]);
                    uriKt = new UriKt(new Throwable(((setTransactionSuccessful) n$b.write).IconCompatParcelizer(com.logistics.rider.glovo.R.string.error_no_navigation_app)));
                }
                if (uriKt instanceof AsyncImageKt) {
                    int i20 = RemoteActionCompatParcelizer + 75;
                    read = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i20 % 2 != 0) {
                        realImageLoaderexecute2job3.MediaSessionCompatQueueItem.serializer(uriKt);
                        return createfromparcel;
                    }
                    realImageLoaderexecute2job3.MediaSessionCompatQueueItem.serializer(uriKt);
                    int i21 = 41 / 0;
                    return createfromparcel;
                }
                if (!(uriKt instanceof UriKt)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    int i22 = RemoteActionCompatParcelizer + 11;
                    read = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i23 = i22 % 2;
                    return null;
                }
                SharedResourcePool sharedResourcePool = realImageLoaderexecute2job3.PlaybackStateCompat;
                String message = ((UriKt) uriKt).serializer.getMessage();
                if (message == null) {
                    message = "";
                }
                sharedResourcePool.serializer(message);
                return createfromparcel;
            }
        }
        Timber.RemoteActionCompatParcelizer.read("Map shouldn't be able to be clicked when coordinate is null", new Object[0]);
        return createfromparcel;
    }
}
