package o;

import android.location.Location;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class setBigTitleText extends getLatitudeannotations<r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU> {
    final /* synthetic */ getUseWebView write;

    /* JADX WARN: Code duplicated, block: B:34:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cc  */
    @Override // o.getLatitudeannotations
    public final void a(getLongitudeannotations<r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU> getlongitudeannotations) {
        Location locationWrite;
        r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU r8lambdazeccixubf3xvz58yt5bojkwhdu = getlongitudeannotations.read();
        Integer numIconCompatParcelizer = getlongitudeannotations.IconCompatParcelizer();
        Byte b = r8lambdazeccixubf3xvz58yt5bojkwhdu.read;
        Object[] objArr = {getUseWebView.read(b.byteValue())};
        getUseWebView getusewebview = this.write;
        getusewebview.read("Received %s", objArr);
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = r8lambdazeccixubf3xvz58yt5bojkwhdu.serializer;
        setConversationShortcutId setconversationshortcutidSerializer = null;
        if (brazeCompanionExternalSyntheticLambda4 == null) {
            locationWrite = null;
        } else {
            getusewebview.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.getClass();
            locationWrite = getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda4);
        }
        if (!Arrays.asList((byte) 6, (byte) 7).contains(b) && numIconCompatParcelizer == null) {
            getusewebview.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.IconCompatParcelizer("Geofence event of type %s is missing a correlation ID", getUseWebView.read(b.byteValue()));
            return;
        }
        if (!Arrays.asList((byte) 6, (byte) 7, (byte) 5).contains(b) && brazeCompanionExternalSyntheticLambda4 == null) {
            getusewebview.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.IconCompatParcelizer("Geofence event of type %s is missing a location", getUseWebView.read(b.byteValue()));
            return;
        }
        if (locationWrite != null && !getDEFAULT_PUSH_DELIVERY_MIN_FLUSHandroid_sdk_base_releaseannotations.IconCompatParcelizer(locationWrite)) {
            getusewebview.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.IconCompatParcelizer("Invalid triggering location: %s", getDEFAULT_PUSH_DELIVERY_MIN_FLUSHandroid_sdk_base_releaseannotations.RemoteActionCompatParcelizer(locationWrite));
            return;
        }
        byte bByteValue = b.byteValue();
        if (bByteValue == 1) {
            setconversationshortcutidSerializer = getusewebview.PlaybackStateCompat.read(numIconCompatParcelizer, locationWrite);
        } else if (bByteValue == 2) {
            getusewebview.PlaybackStateCompat.getClass();
        } else if (bByteValue == 3) {
            setconversationshortcutidSerializer = getusewebview.PlaybackStateCompat.serializer(numIconCompatParcelizer, locationWrite);
        } else if (bByteValue == 6) {
            setconversationshortcutidSerializer = getUseWebView.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(getusewebview);
        } else if (bByteValue == 8) {
            setconversationshortcutidSerializer = getusewebview.PlaybackStateCompat.serializer(numIconCompatParcelizer, locationWrite);
        } else if (bByteValue == 9) {
            getusewebview.PlaybackStateCompat.getClass();
        }
        if (setconversationshortcutidSerializer != null) {
            getusewebview.IconCompatParcelizer(setconversationshortcutidSerializer);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setBigTitleText(getUseWebView getusewebview, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        super(readandroid_sdk_base_releaseVar, "GeofenceStateManager");
        this.write = getusewebview;
    }
}
