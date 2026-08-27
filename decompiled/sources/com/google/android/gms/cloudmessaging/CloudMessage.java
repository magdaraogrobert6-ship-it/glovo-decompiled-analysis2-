package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o.accessgetNcp;

/* JADX INFO: loaded from: classes2.dex */
public final class CloudMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CloudMessage> CREATOR = new accessgetNcp(0);
    public final Intent serializer;

    public final Intent IconCompatParcelizer() {
        return this.serializer;
    }

    public final String RemoteActionCompatParcelizer() {
        Intent intent = this.serializer;
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra(PushNotificationParserObj.MESSAGE_ID_KEY) : stringExtra;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, this.serializer, i);
        SQLite.serializer(i2, parcel);
    }

    public CloudMessage(Intent intent) {
        this.serializer = intent;
    }

    public final Integer serializer() {
        Intent intent = this.serializer;
        if (intent.hasExtra("google.product_id")) {
            return Integer.valueOf(intent.getIntExtra("google.product_id", 0));
        }
        return null;
    }
}
