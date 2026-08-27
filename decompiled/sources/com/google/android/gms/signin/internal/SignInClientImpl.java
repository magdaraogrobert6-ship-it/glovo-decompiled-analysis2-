package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zacl;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.zay;
import com.google.android.gms.net.zza;
import com.huawei.hms.api.HuaweiApiClientImpl;
import io.sentry.android.core.SentryLogcatAdapter;
import io.sentry.metrics.MetricsBatchProcessor;
import o.OnRemeasuredModifierKt;
import o.accessgetNumPad4cp;
import o.accessgetNumPadDeletecp;
import o.accessgetScp;
import o.accessgetSpacebarcp;
import o.accessgetSystemNavigationDowncp;
import o.getBEK5gGoQ;

/* JADX INFO: loaded from: classes2.dex */
public final class SignInClientImpl extends accessgetScp {
    public final Integer _init_lambda3;
    public final Bundle r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public final MetricsBatchProcessor r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public final boolean write;

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
        return this.write;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final int read() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle MediaSessionCompatQueueItem() {
        MetricsBatchProcessor metricsBatchProcessor = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
        boolean zEquals = this.ParcelableVolumeInfo.getPackageName().equals((String) metricsBatchProcessor.write);
        Bundle bundle = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) metricsBatchProcessor.write);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String RemoteActionCompatParcelizer() {
        return "com.google.android.gms.signin.service.START";
    }

    public final void r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8() {
        this.MediaMetadataCompat = new accessgetSpacebarcp((BaseGmsClient) this);
        RemoteActionCompatParcelizer(2, null);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String write() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public final void write(zacl zaclVar) {
        try {
            this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.getClass();
            Account account = new Account(HuaweiApiClientImpl.DEFAULT_ACCOUNT, "com.google");
            GoogleSignInAccount googleSignInAccountRemoteActionCompatParcelizer = HuaweiApiClientImpl.DEFAULT_ACCOUNT.equals(account.name) ? Storage.IconCompatParcelizer(this.ParcelableVolumeInfo).RemoteActionCompatParcelizer() : null;
            Integer num = this._init_lambda3;
            accessgetSystemNavigationDowncp.IconCompatParcelizer(num);
            zay zayVar = new zay(2, account, num.intValue(), googleSignInAccountRemoteActionCompatParcelizer);
            OnRemeasuredModifierKt onRemeasuredModifierKt = (OnRemeasuredModifierKt) MediaSessionCompatResultReceiverWrapper();
            zai zaiVar = new zai(1, zayVar);
            Parcel parcelWrite = onRemeasuredModifierKt.write();
            getBEK5gGoQ.serializer(parcelWrite, zaiVar);
            parcelWrite.writeStrongBinder(zaclVar);
            onRemeasuredModifierKt.RemoteActionCompatParcelizer(12, parcelWrite);
        } catch (RemoteException e) {
            SentryLogcatAdapter.IconCompatParcelizer("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                zaclVar.RemoteActionCompatParcelizer.post(new zza(zaclVar, new zak(1, new ConnectionResult(8, null, null), null), false, 10));
            } catch (RemoteException unused) {
                SentryLogcatAdapter.IconCompatParcelizer("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface read(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (iInterfaceQueryLocalInterface instanceof OnRemeasuredModifierKt) {
            return (OnRemeasuredModifierKt) iInterfaceQueryLocalInterface;
        }
        return new OnRemeasuredModifierKt(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public SignInClientImpl(Context context, Looper looper, MetricsBatchProcessor metricsBatchProcessor, Bundle bundle, accessgetNumPad4cp accessgetnumpad4cp, accessgetNumPadDeletecp accessgetnumpaddeletecp) {
        super(context, looper, 44, metricsBatchProcessor, accessgetnumpad4cp, accessgetnumpaddeletecp, 0);
        this.write = true;
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = metricsBatchProcessor;
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = bundle;
        this._init_lambda3 = (Integer) metricsBatchProcessor.IconCompatParcelizer;
    }
}
