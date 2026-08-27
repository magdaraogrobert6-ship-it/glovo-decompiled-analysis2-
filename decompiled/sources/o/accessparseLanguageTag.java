package o;

import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class accessparseLanguageTag {
    private static int MediaMetadataCompat = 0;
    private static int RatingCompat = 1;
    public final PlatformLocaleannotations IconCompatParcelizer;
    public final transferSessionPackageI MediaSessionCompatQueueItem;
    public final List RemoteActionCompatParcelizer;
    public final f6 read;
    public final f6 serializer;
    public final getEmpty write;

    public accessparseLanguageTag(setTransactionSuccessful settransactionsuccessful, getEmpty getempty, PlatformLocaleannotations platformLocaleannotations, transferSessionPackageI transfersessionpackagei) {
        this.write = getempty;
        this.IconCompatParcelizer = platformLocaleannotations;
        this.MediaSessionCompatQueueItem = transfersessionpackagei;
        this.read = new f6(fc.BOTTOM, settransactionsuccessful.write(com.logistics.rider.glovo.R.integer.map_pin_offset_horizontal), settransactionsuccessful.write(com.logistics.rider.glovo.R.integer.map_pin_offset_vertical));
        this.serializer = new f6(fc.CENTER, settransactionsuccessful.write(com.logistics.rider.glovo.R.integer.map_pin_entrance_offset_horizontal), settransactionsuccessful.write(com.logistics.rider.glovo.R.integer.map_pin_entrance_offset_vertical));
        List listRemoteActionCompatParcelizer = androidx.sqlite.SQLite.read(displayInAppMessagelambda1.serializer(accessgetNoOpScrollConnectionp.class), displayInAppMessagelambda1.serializer(AndroidViewHolderonNestedFling1.class));
        if (!((FirebaseRemoteConfigImpl) platformLocaleannotations.serializer).MediaSessionCompatToken()) {
            listRemoteActionCompatParcelizer = onContentCardDismissed.RemoteActionCompatParcelizer((Collection) listRemoteActionCompatParcelizer, (Object) displayInAppMessagelambda1.serializer(AndroidViewHolder_androidKt.class));
            int i = RatingCompat + 15;
            MediaMetadataCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        }
        this.RemoteActionCompatParcelizer = listRemoteActionCompatParcelizer;
        int i3 = MediaMetadataCompat + 65;
        RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    public static int read(AndroidViewHolderrelease1 androidViewHolderrelease1) {
        int i = 2 % 2;
        int i2 = RatingCompat + 37;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            androidViewHolderrelease1.read();
            obj.hashCode();
            throw null;
        }
        if (androidViewHolderrelease1.read()) {
            int i3 = RatingCompat + 19;
            MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return com.logistics.rider.glovo.R.color.primary_main;
        }
        int i5 = RatingCompat + 101;
        MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return com.logistics.rider.glovo.R.color.neutral_80;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean serializer(String str, boolean z, AndroidViewHolderlayoutNode1coreModifier1 androidViewHolderlayoutNode1coreModifier1) {
        int i = 2 % 2;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.MediaSessionCompatQueueItem;
        if (!firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_NAVER_MAPS_ENABLED)) {
            int i2 = RatingCompat + 125;
            MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            Object[] objArr = {firebaseRemoteConfigImpl, updateAdidI.IS_ACTIONABLE_PINS_ENABLED};
            if (((Boolean) FirebaseRemoteConfigImpl.RemoteActionCompatParcelizer(1762727223, com.mapbox.navigator.R.serializer(), com.mapbox.navigator.R.serializer(), -1762727220, com.mapbox.navigator.R.serializer(), com.mapbox.navigator.R.serializer(), objArr)).booleanValue() && hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str, (CharSequence) "v3", false)) {
                int i4 = MediaMetadataCompat + 31;
                int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                RatingCompat = i5;
                int i6 = i4 % 2;
                if (z) {
                    int i7 = i5 + 41;
                    MediaMetadataCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i7 % 2 != 0) {
                        throw null;
                    }
                    String strSerializer = androidViewHolderlayoutNode1coreModifier1 != null ? androidViewHolderlayoutNode1coreModifier1.serializer() : null;
                    if (strSerializer != null) {
                        int i8 = MediaMetadataCompat + 119;
                        RatingCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i8 % 2 == 0) {
                            int i9 = 13 / 0;
                            if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) strSerializer)) {
                                return true;
                            }
                        } else if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) strSerializer)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
