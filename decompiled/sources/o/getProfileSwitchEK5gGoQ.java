package o;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzdf;

/* JADX INFO: loaded from: classes2.dex */
public final class getProfileSwitchEK5gGoQ extends getPairingEK5gGoQ implements getProgramRedEK5gGoQ {
    @Override // o.getProgramRedEK5gGoQ
    public final void setDataCollectionEnabled(boolean z) {
        throw null;
    }

    public getProfileSwitchEK5gGoQ(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // o.getProgramRedEK5gGoQ
    public final void beginAdUnitExposure(String str, long j) {
        Parcel parcelSerializer = serializer();
        parcelSerializer.writeString(str);
        parcelSerializer.writeLong(j);
        IconCompatParcelizer(23, parcelSerializer);
    }

    @Override // o.getProgramRedEK5gGoQ
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelSerializer = serializer();
        parcelSerializer.writeString(str);
        parcelSerializer.writeString(str2);
        getPageDownEK5gGoQ.read(parcelSerializer, bundle);
        IconCompatParcelizer(9, parcelSerializer);
    }

    @Override // o.getProgramRedEK5gGoQ
    public final void endAdUnitExposure(String str, long j) {
        Parcel parcelSerializer = serializer();
        parcelSerializer.writeString(str);
        parcelSerializer.writeLong(j);
        IconCompatParcelizer(24, parcelSerializer);
    }

    @Override // o.getProgramRedEK5gGoQ
    public final void generateEventId(getQEK5gGoQ getqek5ggoq) {
        Parcel parcelSerializer = serializer();
        getPageDownEK5gGoQ.serializer(parcelSerializer, getqek5ggoq);
        IconCompatParcelizer(22, parcelSerializer);
    }

    @Override // o.getProgramRedEK5gGoQ
    public final void getCachedAppInstanceId(getQEK5gGoQ getqek5ggoq) {
        Parcel parcelSerializer = serializer();
        getPageDownEK5gGoQ.serializer(parcelSerializer, getqek5ggoq);
        IconCompatParcelizer(19, parcelSerializer);
    }

    @Override // o.getProgramRedEK5gGoQ
    public final void getConditionalUserProperties(String str, String str2, getQEK5gGoQ getqek5ggoq) {
        Parcel parcelSerializer = serializer();
        parcelSerializer.writeString(str);
        parcelSerializer.writeString(str2);
        getPageDownEK5gGoQ.serializer(parcelSerializer, getqek5ggoq);
        IconCompatParcelizer(10, parcelSerializer);
    }

    @Override // o.getProgramRedEK5gGoQ
    public final void getCurrentScreenClass(getQEK5gGoQ getqek5ggoq) {
        Parcel parcelSerializer = serializer();
        getPageDownEK5gGoQ.serializer(parcelSerializer, getqek5ggoq);
        IconCompatParcelizer(17, parcelSerializer);
    }

    @Override // o.getProgramRedEK5gGoQ
    public final void getCurrentScreenName(getQEK5gGoQ getqek5ggoq) {
        Parcel parcelSerializer = serializer();
        getPageDownEK5gGoQ.serializer(parcelSerializer, getqek5ggoq);
        IconCompatParcelizer(16, parcelSerializer);
    }

    @Override // o.getProgramRedEK5gGoQ
    public final void getGmpAppId(getQEK5gGoQ getqek5ggoq) {
        Parcel parcelSerializer = serializer();
        getPageDownEK5gGoQ.serializer(parcelSerializer, getqek5ggoq);
        IconCompatParcelizer(21, parcelSerializer);
    }

    @Override // o.getProgramRedEK5gGoQ
    public final void getMaxUserProperties(String str, getQEK5gGoQ getqek5ggoq) {
        Parcel parcelSerializer = serializer();
        parcelSerializer.writeString(str);
        getPageDownEK5gGoQ.serializer(parcelSerializer, getqek5ggoq);
        IconCompatParcelizer(6, parcelSerializer);
    }

    @Override // o.getProgramRedEK5gGoQ
    public final void getUserProperties(String str, String str2, boolean z, getQEK5gGoQ getqek5ggoq) {
        Parcel parcelSerializer = serializer();
        parcelSerializer.writeString(str);
        parcelSerializer.writeString(str2);
        ClassLoader classLoader = getPageDownEK5gGoQ.serializer;
        parcelSerializer.writeInt(z ? 1 : 0);
        getPageDownEK5gGoQ.serializer(parcelSerializer, getqek5ggoq);
        IconCompatParcelizer(5, parcelSerializer);
    }

    @Override // o.getProgramRedEK5gGoQ
    public final void initialize(accessgetTwocp accessgettwocp, zzdd zzddVar, long j) {
        Parcel parcelSerializer = serializer();
        getPageDownEK5gGoQ.serializer(parcelSerializer, accessgettwocp);
        getPageDownEK5gGoQ.read(parcelSerializer, zzddVar);
        parcelSerializer.writeLong(j);
        IconCompatParcelizer(1, parcelSerializer);
    }

    @Override // o.getProgramRedEK5gGoQ
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel parcelSerializer = serializer();
        parcelSerializer.writeString(str);
        parcelSerializer.writeString(str2);
        getPageDownEK5gGoQ.read(parcelSerializer, bundle);
        parcelSerializer.writeInt(z ? 1 : 0);
        parcelSerializer.writeInt(z2 ? 1 : 0);
        parcelSerializer.writeLong(j);
        IconCompatParcelizer(2, parcelSerializer);
    }

    @Override // o.getProgramRedEK5gGoQ
    public final void onActivityCreatedByScionActivityInfo(zzdf zzdfVar, Bundle bundle, long j) {
        Parcel parcelSerializer = serializer();
        getPageDownEK5gGoQ.read(parcelSerializer, zzdfVar);
        getPageDownEK5gGoQ.read(parcelSerializer, bundle);
        parcelSerializer.writeLong(j);
        IconCompatParcelizer(53, parcelSerializer);
    }

    @Override // o.getProgramRedEK5gGoQ
    public final void onActivityDestroyedByScionActivityInfo(zzdf zzdfVar, long j) {
        Parcel parcelSerializer = serializer();
        getPageDownEK5gGoQ.read(parcelSerializer, zzdfVar);
        parcelSerializer.writeLong(j);
        IconCompatParcelizer(54, parcelSerializer);
    }

    @Override // o.getProgramRedEK5gGoQ
    public final void onActivityPausedByScionActivityInfo(zzdf zzdfVar, long j) {
        Parcel parcelSerializer = serializer();
        getPageDownEK5gGoQ.read(parcelSerializer, zzdfVar);
        parcelSerializer.writeLong(j);
        IconCompatParcelizer(55, parcelSerializer);
    }

    @Override // o.getProgramRedEK5gGoQ
    public final void onActivityResumedByScionActivityInfo(zzdf zzdfVar, long j) {
        Parcel parcelSerializer = serializer();
        getPageDownEK5gGoQ.read(parcelSerializer, zzdfVar);
        parcelSerializer.writeLong(j);
        IconCompatParcelizer(56, parcelSerializer);
    }

    @Override // o.getProgramRedEK5gGoQ
    public final void onActivitySaveInstanceStateByScionActivityInfo(zzdf zzdfVar, getQEK5gGoQ getqek5ggoq, long j) {
        Parcel parcelSerializer = serializer();
        getPageDownEK5gGoQ.read(parcelSerializer, zzdfVar);
        getPageDownEK5gGoQ.serializer(parcelSerializer, getqek5ggoq);
        parcelSerializer.writeLong(j);
        IconCompatParcelizer(57, parcelSerializer);
    }

    @Override // o.getProgramRedEK5gGoQ
    public final void onActivityStartedByScionActivityInfo(zzdf zzdfVar, long j) {
        Parcel parcelSerializer = serializer();
        getPageDownEK5gGoQ.read(parcelSerializer, zzdfVar);
        parcelSerializer.writeLong(j);
        IconCompatParcelizer(51, parcelSerializer);
    }

    @Override // o.getProgramRedEK5gGoQ
    public final void onActivityStoppedByScionActivityInfo(zzdf zzdfVar, long j) {
        Parcel parcelSerializer = serializer();
        getPageDownEK5gGoQ.read(parcelSerializer, zzdfVar);
        parcelSerializer.writeLong(j);
        IconCompatParcelizer(52, parcelSerializer);
    }

    @Override // o.getProgramRedEK5gGoQ
    public final void registerOnMeasurementEventListener(getProgramYellowEK5gGoQ getprogramyellowek5ggoq) {
        Parcel parcelSerializer = serializer();
        getPageDownEK5gGoQ.serializer(parcelSerializer, getprogramyellowek5ggoq);
        IconCompatParcelizer(35, parcelSerializer);
    }

    @Override // o.getProgramRedEK5gGoQ
    public final void retrieveAndUploadBatches(getRightBracketEK5gGoQ getrightbracketek5ggoq) {
        Parcel parcelSerializer = serializer();
        getPageDownEK5gGoQ.serializer(parcelSerializer, getrightbracketek5ggoq);
        IconCompatParcelizer(58, parcelSerializer);
    }

    @Override // o.getProgramRedEK5gGoQ
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel parcelSerializer = serializer();
        getPageDownEK5gGoQ.read(parcelSerializer, bundle);
        parcelSerializer.writeLong(j);
        IconCompatParcelizer(8, parcelSerializer);
    }

    @Override // o.getProgramRedEK5gGoQ
    public final void setCurrentScreenByScionActivityInfo(zzdf zzdfVar, String str, String str2, long j) {
        Parcel parcelSerializer = serializer();
        getPageDownEK5gGoQ.read(parcelSerializer, zzdfVar);
        parcelSerializer.writeString(str);
        parcelSerializer.writeString(str2);
        parcelSerializer.writeLong(j);
        IconCompatParcelizer(50, parcelSerializer);
    }

    @Override // o.getProgramRedEK5gGoQ
    public final void setEventInterceptor(getProgramYellowEK5gGoQ getprogramyellowek5ggoq) {
        Parcel parcelSerializer = serializer();
        getPageDownEK5gGoQ.serializer(parcelSerializer, getprogramyellowek5ggoq);
        IconCompatParcelizer(34, parcelSerializer);
    }

    @Override // o.getProgramRedEK5gGoQ
    public final void setSgtmDebugInfo(Intent intent) {
        Parcel parcelSerializer = serializer();
        getPageDownEK5gGoQ.read(parcelSerializer, intent);
        IconCompatParcelizer(48, parcelSerializer);
    }

    @Override // o.getProgramRedEK5gGoQ
    public final void setUserId(String str, long j) {
        Parcel parcelSerializer = serializer();
        parcelSerializer.writeString(str);
        parcelSerializer.writeLong(j);
        IconCompatParcelizer(7, parcelSerializer);
    }

    @Override // o.getProgramRedEK5gGoQ
    public final void setUserProperty(String str, String str2, accessgetTwocp accessgettwocp, boolean z, long j) {
        Parcel parcelSerializer = serializer();
        parcelSerializer.writeString(str);
        parcelSerializer.writeString(str2);
        getPageDownEK5gGoQ.serializer(parcelSerializer, accessgettwocp);
        parcelSerializer.writeInt(z ? 1 : 0);
        parcelSerializer.writeLong(j);
        IconCompatParcelizer(4, parcelSerializer);
    }

    @Override // o.getProgramRedEK5gGoQ
    public final void logHealthData(int i, String str, accessgetTwocp accessgettwocp, accessgetTwocp accessgettwocp2, accessgetTwocp accessgettwocp3) {
        Parcel parcelSerializer = serializer();
        parcelSerializer.writeInt(5);
        parcelSerializer.writeString("Error with data collection. Data lost.");
        getPageDownEK5gGoQ.serializer(parcelSerializer, accessgettwocp);
        getPageDownEK5gGoQ.serializer(parcelSerializer, accessgettwocp2);
        getPageDownEK5gGoQ.serializer(parcelSerializer, accessgettwocp3);
        IconCompatParcelizer(33, parcelSerializer);
    }
}
