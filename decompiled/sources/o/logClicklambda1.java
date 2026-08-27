package o;

import com.sentiance.sdk.events.ControlMessage;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class logClicklambda1 extends deepcopyandroid_sdk_base_release {
    public final /* synthetic */ int IconCompatParcelizer;
    final /* synthetic */ getOpenUriInWebViewannotations serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ logClicklambda1(getOpenUriInWebViewannotations getopenuriinwebviewannotations, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, int i) {
        super(readandroid_sdk_base_releaseVar, "TimelineCreator");
        this.IconCompatParcelizer = i;
        this.serializer = getopenuriinwebviewannotations;
    }

    @Override // o.deepcopyandroid_sdk_base_release
    public final void serializer(ControlMessage controlMessage, Object obj) {
        int i = this.IconCompatParcelizer;
        getOpenUriInWebViewannotations getopenuriinwebviewannotations = this.serializer;
        if (i != 0) {
            List<getImageStyle> arrayList = new ArrayList<>();
            if (controlMessage == ControlMessage.CALL_DETECTOR_STOP) {
                r8lambdac3jvyDh89T8c2PwZtxY1g9Xzdk r8lambdac3jvydh89t8c2pwztxy1g9xzdk = getopenuriinwebviewannotations.MediaBrowserCompatMediaItem;
                getopenuriinwebviewannotations.MediaMetadataCompat.getClass();
                arrayList = r8lambdac3jvydh89t8c2pwztxy1g9xzdk.RemoteActionCompatParcelizer(System.currentTimeMillis());
            }
            getopenuriinwebviewannotations.MediaMetadataCompat.getClass();
            getopenuriinwebviewannotations.serializer(arrayList, System.currentTimeMillis(), null);
            return;
        }
        if (controlMessage != ControlMessage.CALL_ACTIVE || obj == null) {
            return;
        }
        byte bByteValue = ((Byte) obj).byteValue();
        r8lambdac3jvyDh89T8c2PwZtxY1g9Xzdk r8lambdac3jvydh89t8c2pwztxy1g9xzdk2 = getopenuriinwebviewannotations.MediaBrowserCompatMediaItem;
        getopenuriinwebviewannotations.MediaMetadataCompat.getClass();
        List list = r8lambdac3jvydh89t8c2pwztxy1g9xzdk2.read(bByteValue, System.currentTimeMillis());
        setHeaderTextColor setheadertextcolor = getopenuriinwebviewannotations.RatingCompat;
        setheadertextcolor.getClass();
        setheadertextcolor.serializer(new getAnalyticsEnabledEnter(setheadertextcolor, list, 1));
        getopenuriinwebviewannotations.MediaMetadataCompat.getClass();
        getopenuriinwebviewannotations.serializer(list, System.currentTimeMillis(), null);
    }
}
