package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class ag {
    private static int IconCompatParcelizer = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final QueryResultCompanion RemoteActionCompatParcelizer;
    public final transferSessionPackageI read;
    public final getBindingAdapter serializer;
    public final setTransactionSuccessful write;

    public ag(setTransactionSuccessful settransactionsuccessful, transferSessionPackageI transfersessionpackagei, QueryResultCompanion queryResultCompanion, getBindingAdapter getbindingadapter) {
        settransactionsuccessful.getClass();
        transfersessionpackagei.getClass();
        queryResultCompanion.getClass();
        getbindingadapter.getClass();
        this.write = settransactionsuccessful;
        this.read = transfersessionpackagei;
        this.RemoteActionCompatParcelizer = queryResultCompanion;
        this.serializer = getbindingadapter;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0048  */
    public final C0179j write(String str, String str2) {
        boolean z;
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 81;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setTransactionSuccessful settransactionsuccessful = this.write;
        String strIconCompatParcelizer = settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.login_forgot_password_title);
        String strIconCompatParcelizer2 = settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.login_forgot_password_by_email_sub_title);
        String strIconCompatParcelizer3 = settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.reset_password);
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.read;
        firebaseRemoteConfigImpl.getClass();
        if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_PERSIST_TIMER_IN_RESET_PASSWORD_ENABLED)) {
            firebaseRemoteConfigImpl.getClass();
            if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_RESET_PASSWORD_FLEXIBILITY_ENABLED)) {
                int i4 = MediaSessionCompatQueueItem + 65;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return new C0179j(strIconCompatParcelizer, strIconCompatParcelizer2, strIconCompatParcelizer3, str2, null, serializer(str, verifyPlayStorePurchaseI.EMAIL), z);
    }

    public final C0179j write(endStream endstream, String str) {
        int i = 2 % 2;
        endstream.getClass();
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.read;
        firebaseRemoteConfigImpl.getClass();
        if (!firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_RESET_PASSWORD_FLEXIBILITY_ENABLED)) {
            firebaseRemoteConfigImpl.getClass();
            if (!firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_RESET_PASSWORD_BY_MAGIC_LINK_ENABLED)) {
                return read(str, null);
            }
            int i2 = MediaSessionCompatQueueItem + 95;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return write(str, (String) null);
            }
            write(str, (String) null);
            throw null;
        }
        int i3 = IconCompatParcelizer + 121;
        MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            endstream.equals(C0166g.read);
            throw null;
        }
        boolean zEquals = endstream.equals(C0166g.read);
        setTransactionSuccessful settransactionsuccessful = this.write;
        if (zEquals) {
            return write(str, settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.login_reset_password_use_phone_number_button));
        }
        if (!endstream.equals(C0175h.read)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        int i4 = IconCompatParcelizer + 61;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return read(str, settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.login_reset_password_use_email_button));
    }

    public final getBoolean serializer(String str, verifyPlayStorePurchaseI verifyplaystorepurchasei) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 39;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = m1.write[verifyplaystorepurchasei.ordinal()];
        getBindingAdapter getbindingadapter = this.serializer;
        setTransactionSuccessful settransactionsuccessful = this.write;
        if (i4 == 1) {
            getBoolean getboolean = new getBoolean(settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.login_phone_placeholder_title), androidx.compose.ui.text.input.KeyboardType.Companion.m3321getPhonePjHm6EE(), str, getbindingadapter.serializer(getAbsoluteAdapterPosition.read), null, hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str), 16);
            int i5 = MediaSessionCompatQueueItem + 33;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return getboolean;
        }
        int i7 = MediaSessionCompatQueueItem + 47;
        int i8 = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i8;
        int i9 = i7 % 2;
        if (i4 == 2) {
            return new getBoolean(settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.COURIER_AND_EMAIL), androidx.compose.ui.text.input.KeyboardType.Companion.m3317getEmailPjHm6EE(), str, getbindingadapter.serializer(getAbsoluteAdapterPosition.IconCompatParcelizer), null, hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str), 16);
        }
        int i10 = i8 + 59;
        MediaSessionCompatQueueItem = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i10 % 2 != 0 ? i4 == 3 : i4 == 4) {
            return new getBoolean(settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.login_email_or_phone_placeholder), androidx.compose.ui.text.input.KeyboardType.Companion.m3317getEmailPjHm6EE(), str, getbindingadapter.serializer(getAbsoluteAdapterPosition.serializer), null, hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str), 16);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00da  */
    public final C0179j read(String str, String str2) {
        boolean z;
        boolean z2;
        int i = 2 % 2;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.read;
        int i2 = m1.write[((verifyPlayStorePurchaseI) FirebaseRemoteConfigImpl.RemoteActionCompatParcelizer(-383819351, com.mapbox.navigator.R.serializer(), com.mapbox.navigator.R.serializer(), 383819352, com.mapbox.navigator.R.serializer(), com.mapbox.navigator.R.serializer(), new Object[]{firebaseRemoteConfigImpl})).ordinal()];
        setTransactionSuccessful settransactionsuccessful = this.write;
        if (i2 == 1) {
            String strIconCompatParcelizer = settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.login_forgot_password_title);
            String str3 = settransactionsuccessful.read(com.logistics.rider.glovo.R.string.login_forgot_password_sub_title_with_placeholder, settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.login_forgot_password_sub_phone_placeholder));
            String strIconCompatParcelizer2 = settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.login_forgot_request_new_password);
            String strRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            firebaseRemoteConfigImpl.getClass();
            if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_PERSIST_TIMER_IN_RESET_PASSWORD_ENABLED) && firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_RESET_PASSWORD_FLEXIBILITY_ENABLED)) {
                int i3 = IconCompatParcelizer + 53;
                MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                z = true;
            } else {
                z = false;
            }
            return new C0179j(strIconCompatParcelizer, str3, strIconCompatParcelizer2, str2, strRemoteActionCompatParcelizer, serializer(str, verifyPlayStorePurchaseI.PHONE), z);
        }
        if (i2 == 2) {
            String strIconCompatParcelizer3 = settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.login_forgot_password_title);
            String str4 = settransactionsuccessful.read(com.logistics.rider.glovo.R.string.login_forgot_password_sub_title_with_placeholder, settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.login_forgot_password_sub_email_placeholder));
            String strIconCompatParcelizer4 = settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.login_forgot_request_new_password);
            firebaseRemoteConfigImpl.getClass();
            if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_PERSIST_TIMER_IN_RESET_PASSWORD_ENABLED)) {
                int i5 = MediaSessionCompatQueueItem + 51;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_RESET_PASSWORD_FLEXIBILITY_ENABLED)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            return new C0179j(strIconCompatParcelizer3, str4, strIconCompatParcelizer4, str2, null, serializer(str, verifyPlayStorePurchaseI.EMAIL), z2);
        }
        Object obj = null;
        if (i2 != 3) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        String strIconCompatParcelizer5 = settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.login_email_or_phone_placeholder);
        String strIconCompatParcelizer6 = settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.login_forgot_password_title);
        String lowerCase = strIconCompatParcelizer5.toLowerCase(java.util.Locale.ROOT);
        lowerCase.getClass();
        String str5 = settransactionsuccessful.read(com.logistics.rider.glovo.R.string.login_forgot_password_sub_title_with_placeholder, lowerCase);
        String strIconCompatParcelizer7 = settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.login_forgot_request_new_password);
        getBoolean getbooleanSerializer = serializer(str, verifyPlayStorePurchaseI.EMAIL_OR_PHONE);
        firebaseRemoteConfigImpl.getClass();
        C0179j c0179j = new C0179j(strIconCompatParcelizer6, str5, strIconCompatParcelizer7, str2, null, getbooleanSerializer, firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_PERSIST_TIMER_IN_RESET_PASSWORD_ENABLED) && !(firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_RESET_PASSWORD_FLEXIBILITY_ENABLED) ^ true));
        int i7 = IconCompatParcelizer + 13;
        MediaSessionCompatQueueItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return c0179j;
        }
        obj.hashCode();
        throw null;
    }
}
