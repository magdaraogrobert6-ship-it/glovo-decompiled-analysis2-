package com.huawei.location.base.activity.entity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zzq;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class ClientInfo implements Parcelable {
    public static final Parcelable.Creator<ClientInfo> CREATOR = new zzq(25);
    private int clientPid;
    private int clientUid;
    private Bundle mExtras;
    private String packageName;
    private String transactionID;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getClientPid() {
        return this.clientPid;
    }

    public int getClientUid() {
        return this.clientUid;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getTransactionID() {
        return this.transactionID;
    }

    public Bundle getmExtras() {
        return this.mExtras;
    }

    public void setClientPid(int i) {
        this.clientPid = i;
    }

    public void setClientUid(int i) {
        this.clientUid = i;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setTransactionID(String str) {
        this.transactionID = str;
    }

    public void setmExtras(Bundle bundle) {
        this.mExtras = bundle;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.packageName);
        parcel.writeInt(this.clientUid);
        parcel.writeInt(this.clientPid);
        parcel.writeString(this.transactionID);
        parcel.writeBundle(this.mExtras);
    }

    public ClientInfo(Parcel parcel) {
        this.mExtras = null;
        this.packageName = parcel.readString();
        this.clientUid = parcel.readInt();
        this.clientPid = parcel.readInt();
        this.transactionID = parcel.readString();
        this.mExtras = parcel.readBundle(Bundle.class.getClassLoader());
    }

    public ClientInfo() {
        this.mExtras = null;
        this.transactionID = UUID.randomUUID().toString();
    }

    public ClientInfo(String str, int i, int i2) {
        this.mExtras = null;
        this.packageName = str;
        this.clientUid = i;
        this.clientPid = i2;
        this.transactionID = UUID.randomUUID().toString();
        this.mExtras = new Bundle();
    }

    public ClientInfo(String str, int i, int i2, String str2) {
        this.mExtras = null;
        this.packageName = str;
        this.clientUid = i;
        this.clientPid = i2;
        this.transactionID = str2;
        this.mExtras = new Bundle();
    }

    public ClientInfo(String str, int i, int i2, String str2, Bundle bundle) {
        this.packageName = str;
        this.clientUid = i;
        this.clientPid = i2;
        this.transactionID = str2;
        this.mExtras = bundle;
    }
}
