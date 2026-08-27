package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.zzq;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Map;
import o.ImageKt;

/* JADX INFO: loaded from: classes2.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new zzq(24);
    public ImageKt RemoteActionCompatParcelizer;
    public final Bundle read;

    public final void IconCompatParcelizer(Intent intent) {
        intent.putExtras(this.read);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.IconCompatParcelizer(parcel, 2, this.read);
        SQLite.serializer(i2, parcel);
    }

    public RemoteMessage(Bundle bundle) {
        this.read = bundle;
    }

    public final String write() {
        return this.read.getString("google.to");
    }

    public final Map read() {
        if (this.RemoteActionCompatParcelizer == null) {
            ImageKt imageKt = new ImageKt(0);
            Bundle bundle = this.read;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals(RemoteMessageConst.FROM) && !str.equals(RemoteMessageConst.MSGTYPE) && !str.equals("collapse_key")) {
                        imageKt.put(str, str2);
                    }
                }
            }
            this.RemoteActionCompatParcelizer = imageKt;
        }
        return this.RemoteActionCompatParcelizer;
    }
}
