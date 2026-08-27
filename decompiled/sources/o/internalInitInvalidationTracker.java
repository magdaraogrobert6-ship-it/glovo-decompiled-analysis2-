package o;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class internalInitInvalidationTracker extends RgbCompanionExternalSyntheticLambda0 {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public final getTypeConverter RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final List serializer;
    public final getTypeConverter write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public internalInitInvalidationTracker(int i) {
        super(1);
        this.read = i;
        int i2 = com.logistics.rider.glovo.R.string.notification_permission_denied_button_text;
        int i3 = com.logistics.rider.glovo.R.string.camera_permission_denied_button_text;
        if (i == 1) {
            super(1);
            this.serializer = androidx.sqlite.SQLite.IconCompatParcelizer((Object) "android.permission.ACTIVITY_RECOGNITION");
            int i4 = com.logistics.rider.glovo.R.string.activity_permission_dialog_title;
            int i5 = com.logistics.rider.glovo.R.string.activity_permission_dialog_description;
            this.write = new getTypeConverter(i4, i5, i3);
            this.RemoteActionCompatParcelizer = new getTypeConverter(i4, i5, i2);
            return;
        }
        if (i == 2) {
            super(1);
            this.serializer = androidx.sqlite.SQLite.IconCompatParcelizer((Object) "android.permission.BLUETOOTH_SCAN");
            int i6 = com.logistics.rider.glovo.R.string.df_pudo_bluetooth_permission_dialog_title;
            int i7 = com.logistics.rider.glovo.R.string.df_pudo_bluetooth_permission_dialog_description;
            int i8 = com.logistics.rider.glovo.R.string.df_pudo_bluetooth_permission_denied_button_text;
            this.write = new getTypeConverter(i6, i7, i8);
            this.RemoteActionCompatParcelizer = new getTypeConverter(i6, i7, i8);
            return;
        }
        if (i == 3) {
            super(1);
            this.serializer = androidx.sqlite.SQLite.IconCompatParcelizer((Object) "android.permission.POST_NOTIFICATIONS");
            int i9 = com.logistics.rider.glovo.R.string.notification_permission_title;
            int i10 = com.logistics.rider.glovo.R.string.notification_permission_description;
            this.write = new getTypeConverter(i9, i10, i3);
            this.RemoteActionCompatParcelizer = new getTypeConverter(i9, i10, i2);
            return;
        }
        this.serializer = androidx.sqlite.SQLite.read("android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION");
        getTypeConverter gettypeconverter = new getTypeConverter(com.logistics.rider.glovo.R.string.location_access_title, com.logistics.rider.glovo.R.string.location_access_description, com.logistics.rider.glovo.R.string.give_access_action);
        this.write = gettypeconverter;
        this.RemoteActionCompatParcelizer = gettypeconverter;
    }

    @Override // o.RgbCompanionExternalSyntheticLambda0
    public final getTypeConverter IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 17;
        MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.read;
        if (i4 == 0) {
            getTypeConverter gettypeconverter = this.write;
            int i5 = i2 + 119;
            MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return gettypeconverter;
            }
            throw null;
        }
        if (i4 == 1) {
            return this.RemoteActionCompatParcelizer;
        }
        if (i4 != 2) {
            return this.RemoteActionCompatParcelizer;
        }
        getTypeConverter gettypeconverter2 = this.RemoteActionCompatParcelizer;
        int i6 = i2 + 125;
        MediaSessionCompatQueueItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return gettypeconverter2;
        }
        throw null;
    }

    @Override // o.RgbCompanionExternalSyntheticLambda0
    public final getTypeConverter read() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem;
        int i3 = i2 + 25;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RatingCompat = i4;
        int i5 = i3 % 2;
        int i6 = this.read;
        if (i6 == 0) {
            return this.RemoteActionCompatParcelizer;
        }
        if (i6 == 1) {
            getTypeConverter gettypeconverter = this.write;
            int i7 = i4 + 13;
            MediaSessionCompatQueueItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                int i8 = 31 / 0;
            }
            return gettypeconverter;
        }
        if (i6 == 2) {
            return this.write;
        }
        getTypeConverter gettypeconverter2 = this.write;
        int i9 = i2 + 73;
        RatingCompat = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            return gettypeconverter2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.RgbCompanionExternalSyntheticLambda0
    public final List serializer() {
        int i = 2 % 2;
        int i2 = RatingCompat + 69;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i3;
        int i4 = i2 % 2;
        int i5 = this.read;
        if (i5 == 0) {
            List list = this.serializer;
            int i6 = i3 + 79;
            RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return list;
        }
        if (i5 == 1) {
            return this.serializer;
        }
        if (i5 != 2) {
            return this.serializer;
        }
        List list2 = this.serializer;
        int i8 = i3 + 13;
        RatingCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            return list2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
