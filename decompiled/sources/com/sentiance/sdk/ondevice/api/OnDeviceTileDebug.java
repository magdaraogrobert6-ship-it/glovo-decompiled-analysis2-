package com.sentiance.sdk.ondevice.api;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.ondevice.api.OnDeviceTileDebug;
import com.sentiance.sdk.util.N;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.DataStoreProviderm;
import o.DataStoreProvidern;
import o.DataStoreProvidero;
import o.DustDataStoreProviderCompanion;
import o.createStoryPageClickedPendingIntent;
import o.getInlineImageStylelambda4;
import o.getNotificationStylelambda0;
import o.getNotificationStylelambda1;
import o.r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk;
import o.r8lambdaA5Nojo_weyBvRJwWwexNGN83YI;
import o.r8lambdaIOrQz4tPQ28VMjai8hRKronSc;
import o.r8lambdaXPYBZDOuJKDQIhpUsif_DKhgJb4;
import o.r8lambdaYpjpX6UFmLqQOe26pN5Y9DtSI4;
import o.r8lambda_8vhm_RatEWwxUvOm3H5y3VqFw;
import o.r8lambdapqC07N1rgU18W2Dq2HLrsvfo8qU;
import o.r8lambdas__JQrhgDlTZaGv5XNS1Oe5nHk;
import o.r8lambdawUFeXxYYrTT3mLgC0hxhJpbsrs;
import o.r8lambdazZSWqpteATcWzI0XAcwrs_hUjLw;
import o.readBoolean;
import o.runlambda0;
import o.setPushUniqueId;

/* JADX INFO: loaded from: classes5.dex */
@runlambda0
@DontObfuscate
public class OnDeviceTileDebug extends N {
    private static final String GUARD_TAG = "OnDeviceDebug";

    @SuppressLint
    private static OnDeviceTileDebug sInstance;
    private final Context mContext;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getTiles$2(r8lambdapqC07N1rgU18W2Dq2HLrsvfo8qU r8lambdapqc07n1rgu18w2dq2hlrsvfo8qu, r8lambdapqC07N1rgU18W2Dq2HLrsvfo8qU r8lambdapqc07n1rgu18w2dq2hlrsvfo8qu2) {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<r8lambdas__JQrhgDlTZaGv5XNS1Oe5nHk> convertToTempVenues(List<DataStoreProvidern> list) {
        ArrayList arrayList = new ArrayList();
        for (DataStoreProvidern dataStoreProvidern : list) {
            arrayList.add(new r8lambdas__JQrhgDlTZaGv5XNS1Oe5nHk(dataStoreProvidern.IconCompatParcelizer(), dataStoreProvidern.read(), (float) dataStoreProvidern.write(), (float) dataStoreProvidern.serializer(), getVenueTags(dataStoreProvidern.IconCompatParcelizer())));
        }
        return arrayList;
    }

    public static OnDeviceTileDebug getInstance(Context context) {
        OnDeviceTileDebug onDeviceTileDebug;
        synchronized (OnDeviceTileDebug.class) {
            if (sInstance == null) {
                sInstance = new OnDeviceTileDebug(context);
            }
            onDeviceTileDebug = sInstance;
        }
        return onDeviceTileDebug;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$getNearestVenues$6(Location location, r8lambdaIOrQz4tPQ28VMjai8hRKronSc r8lambdaiorqz4tpq28vmjai8hrkronsc) {
        r8lambdaXPYBZDOuJKDQIhpUsif_DKhgJb4 r8lambdaxpybzdoujkdqihpusif_dkhgjb4 = (r8lambdaXPYBZDOuJKDQIhpUsif_DKhgJb4) setPushUniqueId.read(r8lambdaXPYBZDOuJKDQIhpUsif_DKhgJb4.class);
        r8lambdaxpybzdoujkdqihpusif_dkhgjb4.write().RemoteActionCompatParcelizer(location, 120, new getNotificationStylelambda0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getTiles$4(r8lambdazZSWqpteATcWzI0XAcwrs_hUjLw r8lambdazzswqpteatcwzi0xacwrs_hujlw) {
        ArrayList arrayList = new ArrayList();
        for (r8lambda_8vhm_RatEWwxUvOm3H5y3VqFw r8lambda_8vhm_ratewwxuvom3h5y3vqfw : ((DustDataStoreProviderCompanion) setPushUniqueId.read(DustDataStoreProviderCompanion.class)).read()) {
            arrayList.add(new r8lambdapqC07N1rgU18W2Dq2HLrsvfo8qU(r8lambda_8vhm_ratewwxuvom3h5y3vqfw.read(), r8lambda_8vhm_ratewwxuvom3h5y3vqfw.serializer(), r8lambda_8vhm_ratewwxuvom3h5y3vqfw.IconCompatParcelizer(), 0L, null, null));
        }
        int i = 1;
        Collections.sort(arrayList, new createStoryPageClickedPendingIntent(i));
        readBoolean.serializer(new getInlineImageStylelambda4(i, arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$getVenueTags$5(long j) {
        ArrayList arrayList = new ArrayList();
        for (DataStoreProvidero dataStoreProvidero : ((DustDataStoreProviderCompanion) setPushUniqueId.read(DustDataStoreProviderCompanion.class)).read(j)) {
            arrayList.add(new r8lambdawUFeXxYYrTT3mLgC0hxhJpbsrs(dataStoreProvidero.RemoteActionCompatParcelizer(), dataStoreProvidero.write(), dataStoreProvidero.read()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getZippedTiles$1(r8lambdazZSWqpteATcWzI0XAcwrs_hUjLw r8lambdazzswqpteatcwzi0xacwrs_hujlw) {
        ArrayList arrayList = new ArrayList();
        List<r8lambda_8vhm_RatEWwxUvOm3H5y3VqFw> list = ((DustDataStoreProviderCompanion) setPushUniqueId.read(DustDataStoreProviderCompanion.class)).read();
        List<r8lambdaYpjpX6UFmLqQOe26pN5Y9DtSI4> listMediaSessionCompatToken = ((DataStoreProviderm) setPushUniqueId.read(DataStoreProviderm.class)).MediaSessionCompatToken();
        DataStoreProviderm dataStoreProviderm = (DataStoreProviderm) setPushUniqueId.read(DataStoreProviderm.class);
        for (r8lambdaYpjpX6UFmLqQOe26pN5Y9DtSI4 r8lambdaypjpx6ufmlqqoe26pn5y9dtsi4 : listMediaSessionCompatToken) {
            long length = 0;
            long jIconCompatParcelizer = 0;
            for (r8lambda_8vhm_RatEWwxUvOm3H5y3VqFw r8lambda_8vhm_ratewwxuvom3h5y3vqfw : list) {
                if (r8lambda_8vhm_ratewwxuvom3h5y3vqfw.read().contains(r8lambdaypjpx6ufmlqqoe26pn5y9dtsi4.RemoteActionCompatParcelizer)) {
                    jIconCompatParcelizer += r8lambda_8vhm_ratewwxuvom3h5y3vqfw.IconCompatParcelizer();
                }
            }
            File fileWrite = dataStoreProviderm.write(r8lambdaypjpx6ufmlqqoe26pn5y9dtsi4.RemoteActionCompatParcelizer);
            if (fileWrite.exists()) {
                length = fileWrite.length();
            }
            arrayList.add(new r8lambdapqC07N1rgU18W2Dq2HLrsvfo8qU(r8lambdaypjpx6ufmlqqoe26pn5y9dtsi4.RemoteActionCompatParcelizer, r8lambdaypjpx6ufmlqqoe26pn5y9dtsi4.RatingCompat, jIconCompatParcelizer, length, Long.valueOf(r8lambdaypjpx6ufmlqqoe26pn5y9dtsi4.write), Long.valueOf(r8lambdaypjpx6ufmlqqoe26pn5y9dtsi4.MediaDescriptionCompat)));
        }
        readBoolean.serializer(new getInlineImageStylelambda4(0, arrayList));
    }

    private OnDeviceTileDebug(Context context) {
        this.mContext = context;
    }

    public List<r8lambdawUFeXxYYrTT3mLgC0hxhJpbsrs> getVenueTags(final long j) {
        return (List) ifSdkIsInitializedWithUser(Collections.EMPTY_LIST, (r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk<List>) new r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk() { // from class: o.getNotificationStylelambda2
            @Override // o.r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk
            public final Object IconCompatParcelizer() {
                return OnDeviceTileDebug.lambda$getVenueTags$5(j);
            }
        });
    }

    @runlambda0
    public void getNearestVenues(final Location location, r8lambdaIOrQz4tPQ28VMjai8hRKronSc r8lambdaiorqz4tpq28vmjai8hrkronsc) {
        ifSdkIsInitializedWithUser(getSentianceHandler(), new r8lambdaA5Nojo_weyBvRJwWwexNGN83YI() { // from class: o.getInlineImageStylelambda2
            @Override // o.r8lambdaA5Nojo_weyBvRJwWwexNGN83YI
            public final void RemoteActionCompatParcelizer() {
                this.serializer.lambda$getNearestVenues$6(location, null);
            }
        });
    }

    @runlambda0
    public void getTiles(r8lambdazZSWqpteATcWzI0XAcwrs_hUjLw r8lambdazzswqpteatcwzi0xacwrs_hujlw) {
        ifSdkIsInitializedWithUser(getSentianceHandler(), new getNotificationStylelambda1(1));
    }

    @runlambda0
    public void getZippedTiles(r8lambdazZSWqpteATcWzI0XAcwrs_hUjLw r8lambdazzswqpteatcwzi0xacwrs_hujlw) {
        ifSdkIsInitializedWithUser(getSentianceHandler(), new getNotificationStylelambda1(0));
    }
}
