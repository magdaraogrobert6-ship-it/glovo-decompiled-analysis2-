package o;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.RemoteException;
import android.os.StrictMode;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.zzj;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzp;
import com.google.android.gms.common.zzr;
import com.google.android.gms.common.zzw;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.zzc;
import io.sentry.MovePreviousSession;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import io.sentry.android.core.SentryLogcatAdapter;
import io.sentry.util.UrlUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes.dex */
public final class scale0AR0LA0default implements rotateRad0AR0LA0 {
    public static scale0AR0LA0default write;
    public Object IconCompatParcelizer;
    public volatile Object RemoteActionCompatParcelizer;

    public r8lambdaHMza2HwvD2qpEDNMeHrXqzjzano IconCompatParcelizer(r8lambdagKH6tFShUp2G_hD0a6i5EJD8PU r8lambdagkh6tfshup2g_hd0a6i5ejd8pu) {
        requestPushPermissionPromptlambda3 requestpushpermissionpromptlambda3 = ((hasTooManyZipEntrieslambda0) this.IconCompatParcelizer).addOnConfigurationChangedListener;
        if (((hasTooManyZipEntrieslambda0) this.IconCompatParcelizer).addContentView.get()) {
            return ((hasTooManyZipEntrieslambda0) this.IconCompatParcelizer).r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        }
        if (requestpushpermissionpromptlambda3 == null) {
            ((hasTooManyZipEntrieslambda0) this.IconCompatParcelizer).addOnNewIntentListener.execute(new MovePreviousSession(15, this));
            return ((hasTooManyZipEntrieslambda0) this.IconCompatParcelizer).r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        }
        r8lambdaHMza2HwvD2qpEDNMeHrXqzjzano r8lambdahmza2hwvd2qpednmehrxqzjzanoRemoteActionCompatParcelizer = r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.RemoteActionCompatParcelizer(requestpushpermissionpromptlambda3.write(r8lambdagkh6tfshup2g_hd0a6i5ejd8pu), Boolean.TRUE.equals(r8lambdagkh6tfshup2g_hd0a6i5ejd8pu.write.RatingCompat));
        return r8lambdahmza2hwvd2qpednmehrxqzjzanoRemoteActionCompatParcelizer != null ? r8lambdahmza2hwvd2qpednmehrxqzjzanoRemoteActionCompatParcelizer : ((hasTooManyZipEntrieslambda0) this.IconCompatParcelizer).r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    }

    public void RemoteActionCompatParcelizer(setResourcePackageNamelambda0 setresourcepackagenamelambda0) {
        TextStreamsKt.serializer(setresourcepackagenamelambda0, "newState");
        if (((setResourcePackageNamelambda0) this.RemoteActionCompatParcelizer) == setresourcepackagenamelambda0 || ((setResourcePackageNamelambda0) this.RemoteActionCompatParcelizer) == setResourcePackageNamelambda0.SHUTDOWN) {
            return;
        }
        this.RemoteActionCompatParcelizer = setresourcepackagenamelambda0;
        if (((ArrayList) this.IconCompatParcelizer).isEmpty()) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.IconCompatParcelizer;
        this.IconCompatParcelizer = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((r8lambdavFH2wnCVQAlDYBWQ6fWDFNezEDs) it.next()).write();
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0165  */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean read(int i) {
        accessgetTvTerrestrialDigitalcp accessgettvterrestrialdigitalcpSerializer;
        accessgetTvTerrestrialDigitalcp accessgettvterrestrialdigitalcpSerializer2;
        ApplicationInfo applicationInfo;
        String[] packagesForUid = ((Context) this.IconCompatParcelizer).getPackageManager().getPackagesForUid(i);
        if (packagesForUid == null || (packagesForUid.length) == 0) {
            accessgettvterrestrialdigitalcpSerializer = accessgetTvTerrestrialDigitalcp.serializer("no pkgs");
        } else {
            int i2 = 0;
            Object[] objArr = 0;
            accessgettvterrestrialdigitalcpSerializer = null;
            for (String str : packagesForUid) {
                if (str == null) {
                    accessgettvterrestrialdigitalcpSerializer = accessgetTvTerrestrialDigitalcp.serializer("null pkg");
                } else if (str.equals((String) this.RemoteActionCompatParcelizer)) {
                    accessgettvterrestrialdigitalcpSerializer = accessgetTvTerrestrialDigitalcp.serializer;
                } else {
                    accessgetTvSatelliteBscp accessgettvsatellitebscp = zzo.read;
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            zzo.IconCompatParcelizer();
                            boolean zWrite = ((accessgetSystemHomecp) zzo.RemoteActionCompatParcelizer).write();
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            if (zWrite) {
                                accessgetTvTeletextcp accessgettvteletextcp = new accessgetTvTeletextcp(i2, (boolean) (objArr == true ? 1 : 0));
                                accessgettvteletextcp.serializer(str);
                                accessgettvteletextcp.read(GooglePlayServicesUtilLight.honorsDebugCertificates((Context) this.IconCompatParcelizer));
                                accessgettvteletextcp.MediaSessionCompatQueueItem();
                                zzw zzwVarPlaybackStateCompatCustomAction = accessgettvteletextcp.PlaybackStateCompatCustomAction();
                                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                                try {
                                    accessgetSystemNavigationDowncp.IconCompatParcelizer(zzo.serializer);
                                    try {
                                        zzo.IconCompatParcelizer();
                                        accessgetSystemNavigationDowncp.IconCompatParcelizer(zzo.serializer);
                                        zzp zzpVarZzb = zzwVarPlaybackStateCompatCustomAction.zzb(zzo.serializer);
                                        try {
                                            zzr zzrVarSerializer = zzwVarPlaybackStateCompatCustomAction.write() ? ((accessgetSystemHomecp) zzo.RemoteActionCompatParcelizer).serializer(zzpVarZzb) : ((accessgetSystemHomecp) zzo.RemoteActionCompatParcelizer).IconCompatParcelizer(zzpVarZzb);
                                            if (zzrVarSerializer.IconCompatParcelizer()) {
                                                zzrVarSerializer.RemoteActionCompatParcelizer();
                                                accessgettvterrestrialdigitalcpSerializer2 = accessgetTvTerrestrialDigitalcp.read();
                                            } else {
                                                String strSerializer = zzrVarSerializer.serializer();
                                                PackageManager.NameNotFoundException nameNotFoundException = zzrVarSerializer.read() == 4 ? new PackageManager.NameNotFoundException() : null;
                                                if (strSerializer == null) {
                                                    strSerializer = "error checking package certificate";
                                                }
                                                zzrVarSerializer.RemoteActionCompatParcelizer();
                                                zzrVarSerializer.read();
                                                accessgettvterrestrialdigitalcpSerializer2 = accessgetTvTerrestrialDigitalcp.RemoteActionCompatParcelizer(strSerializer, nameNotFoundException);
                                            }
                                        } catch (RemoteException e) {
                                            SentryLogcatAdapter.read("GoogleCertificates", "Failed to get Google certificates from remote", e);
                                            accessgettvterrestrialdigitalcpSerializer2 = accessgetTvTerrestrialDigitalcp.read("module call", e);
                                        }
                                    } catch (DynamiteModule.LoadingException e2) {
                                        SentryLogcatAdapter.read("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                                        accessgettvterrestrialdigitalcpSerializer2 = accessgetTvTerrestrialDigitalcp.read("module init: ".concat(String.valueOf(e2.getMessage())), e2);
                                    }
                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                                } catch (Throwable th) {
                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                                    throw th;
                                }
                            } else {
                                try {
                                    PackageInfo packageInfo = ((Context) this.IconCompatParcelizer).getPackageManager().getPackageInfo(str, 134217792);
                                    boolean zHonorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates((Context) this.IconCompatParcelizer);
                                    if (packageInfo == null) {
                                        accessgettvterrestrialdigitalcpSerializer2 = accessgetTvTerrestrialDigitalcp.serializer("null pkg");
                                    } else {
                                        Signature[] signatureArr = packageInfo.signatures;
                                        if (signatureArr == null || signatureArr.length != 1) {
                                            accessgettvterrestrialdigitalcpSerializer2 = accessgetTvTerrestrialDigitalcp.serializer("single cert required");
                                        } else {
                                            accessgetTvSatelliteCscp accessgettvsatellitecscp = new accessgetTvSatelliteCscp(packageInfo.signatures[0].toByteArray());
                                            String str2 = packageInfo.packageName;
                                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads3 = StrictMode.allowThreadDiskReads();
                                            try {
                                                accessgetTvTerrestrialDigitalcp accessgettvterrestrialdigitalcpZzf = zzo.zzf(str2, accessgettvsatellitecscp, zHonorsDebugCertificates, false);
                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                                if (!accessgettvterrestrialdigitalcpZzf.RemoteActionCompatParcelizer || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0) {
                                                    accessgettvterrestrialdigitalcpSerializer2 = accessgettvterrestrialdigitalcpZzf;
                                                } else {
                                                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads4 = StrictMode.allowThreadDiskReads();
                                                    try {
                                                        accessgetTvTerrestrialDigitalcp accessgettvterrestrialdigitalcpZzf2 = zzo.zzf(str2, accessgettvsatellitecscp, false, true);
                                                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                        if (accessgettvterrestrialdigitalcpZzf2.RemoteActionCompatParcelizer) {
                                                            accessgettvterrestrialdigitalcpSerializer2 = accessgetTvTerrestrialDigitalcp.serializer("debuggable release cert app rejected");
                                                        } else {
                                                            accessgettvterrestrialdigitalcpSerializer2 = accessgettvterrestrialdigitalcpZzf;
                                                        }
                                                    } catch (Throwable th2) {
                                                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                        throw th2;
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                                throw th3;
                                            }
                                        }
                                    }
                                } catch (PackageManager.NameNotFoundException e3) {
                                    accessgettvterrestrialdigitalcpSerializer = accessgetTvTerrestrialDigitalcp.read("no pkg ".concat(str), e3);
                                }
                            }
                        } catch (Throwable th4) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th4;
                        }
                    } catch (RemoteException | DynamiteModule.LoadingException e4) {
                        SentryLogcatAdapter.read("GoogleCertificates", "Failed to get Google certificates from remote", e4);
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    }
                    if (accessgettvterrestrialdigitalcpSerializer2.RemoteActionCompatParcelizer) {
                        this.RemoteActionCompatParcelizer = str;
                    }
                    accessgettvterrestrialdigitalcpSerializer = accessgettvterrestrialdigitalcpSerializer2;
                }
                if (!accessgettvterrestrialdigitalcpSerializer.RemoteActionCompatParcelizer) {
                }
            }
            accessgetSystemNavigationDowncp.IconCompatParcelizer(accessgettvterrestrialdigitalcpSerializer);
        }
        accessgettvterrestrialdigitalcpSerializer.serializer();
        return accessgettvterrestrialdigitalcpSerializer.RemoteActionCompatParcelizer;
    }

    public getY serializer() {
        if (((getY) this.RemoteActionCompatParcelizer) == null) {
            synchronized (this) {
                if (((getY) this.RemoteActionCompatParcelizer) == null) {
                    File cacheDir = ((accesssetHasRetrievedMethodcp) ((coil3.memory.MemoryCacheService) this.IconCompatParcelizer).RemoteActionCompatParcelizer).serializer.getCacheDir();
                    OnGloballyPositionedModifierDefaultImpls onGloballyPositionedModifierDefaultImplsIconCompatParcelizer = null;
                    File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                    if (file != null && (file.isDirectory() || file.mkdirs())) {
                        onGloballyPositionedModifierDefaultImplsIconCompatParcelizer = OnGloballyPositionedModifierDefaultImpls.IconCompatParcelizer(file);
                    }
                    this.RemoteActionCompatParcelizer = onGloballyPositionedModifierDefaultImplsIconCompatParcelizer;
                }
                if (((getY) this.RemoteActionCompatParcelizer) == null) {
                    this.RemoteActionCompatParcelizer = new com.huawei.hmf.tasks.a.j(14);
                }
            }
        }
        return (getY) this.RemoteActionCompatParcelizer;
    }

    public static scale0AR0LA0default write(Context context) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(context);
        synchronized (scale0AR0LA0default.class) {
            if (write == null) {
                accessgetTvSatelliteBscp accessgettvsatellitebscp = zzo.read;
                synchronized (zzo.class) {
                    if (zzo.serializer == null) {
                        zzo.serializer = context.getApplicationContext();
                    } else {
                        SentryLogcatAdapter.IconCompatParcelizer("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                scale0AR0LA0default scale0ar0la0default = new scale0AR0LA0default();
                scale0ar0la0default.IconCompatParcelizer = context.getApplicationContext();
                write = scale0ar0la0default;
            }
        }
        return write;
    }

    public void write(accessgetNumPadInsertcp accessgetnumpadinsertcp) {
        ((Executor) this.IconCompatParcelizer).execute(new zzc(this, 7, accessgetnumpadinsertcp));
    }

    public scale0AR0LA0default(ActivityLifecycleIntegration$$ExternalSyntheticLambda1 activityLifecycleIntegration$$ExternalSyntheticLambda1) {
        this.RemoteActionCompatParcelizer = null;
        this.IconCompatParcelizer = activityLifecycleIntegration$$ExternalSyntheticLambda1;
    }

    @Override // o.rotateRad0AR0LA0
    public Object B_() {
        if (this.RemoteActionCompatParcelizer == null) {
            synchronized (this) {
                if (this.RemoteActionCompatParcelizer == null) {
                    Object objB_ = ((rotateRad0AR0LA0) this.IconCompatParcelizer).B_();
                    UrlUtils.serializer(objB_, "Argument must not be null");
                    this.RemoteActionCompatParcelizer = objB_;
                }
            }
        }
        return this.RemoteActionCompatParcelizer;
    }

    public Object IconCompatParcelizer(Context context) {
        if (this.RemoteActionCompatParcelizer == null) {
            synchronized (this) {
                if (this.RemoteActionCompatParcelizer == null) {
                    this.RemoteActionCompatParcelizer = ((ActivityLifecycleIntegration$$ExternalSyntheticLambda1) this.IconCompatParcelizer).serializer(context);
                }
            }
        }
        return this.RemoteActionCompatParcelizer;
    }

    public static zzj RemoteActionCompatParcelizer(PackageInfo packageInfo, zzj... zzjVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                SentryLogcatAdapter.IconCompatParcelizer("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            accessgetTvSatelliteCscp accessgettvsatellitecscp = new accessgetTvSatelliteCscp(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < zzjVarArr.length; i++) {
                if (zzjVarArr[i].equals(accessgettvsatellitecscp)) {
                    return zzjVarArr[i];
                }
            }
        }
        return null;
    }

    public static final boolean write(PackageInfo packageInfo, boolean z) {
        zzj zzjVarRemoteActionCompatParcelizer;
        getButton12EK5gGoQ getbutton12ek5ggoq;
        getButton12EK5gGoQ getbutton12ek5ggoq2;
        int i;
        if (packageInfo != null) {
            if (z && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            try {
                if (z) {
                    getbutton12ek5ggoq = accessgetTvSatelliteServicecp.IconCompatParcelizer;
                } else {
                    getbutton12ek5ggoq = accessgetTvSatelliteServicecp.RemoteActionCompatParcelizer;
                }
                SigningInfo signingInfo = packageInfo.signingInfo;
                if (signingInfo != null && !signingInfo.hasMultipleSigners() && signingInfo.getSigningCertificateHistory() != null) {
                    getBackspaceEK5gGoQ getbackspaceek5ggoq = getButton10EK5gGoQ.MediaDescriptionCompat;
                    Object[] objArrCopyOf = new Object[4];
                    Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                    int length = signingCertificateHistory.length;
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < length) {
                        byte[] byteArray = signingCertificateHistory[i2].toByteArray();
                        byteArray.getClass();
                        int length2 = objArrCopyOf.length;
                        int i4 = i3 + 1;
                        if (i4 >= 0) {
                            if (i4 <= length2) {
                                i = length2;
                            } else {
                                i = (length2 >> 1) + length2 + 1;
                                if (i < i4) {
                                    int iHighestOneBit = Integer.highestOneBit(i3);
                                    i = iHighestOneBit + iHighestOneBit;
                                }
                                if (i < 0) {
                                    i = Integer.MAX_VALUE;
                                }
                            }
                            if (i > length2) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i);
                            }
                            objArrCopyOf[i3] = byteArray;
                            i2++;
                            i3 = i4;
                        } else {
                            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
                        }
                    }
                    if (i3 == 0) {
                        getbutton12ek5ggoq2 = getButton12EK5gGoQ.IconCompatParcelizer;
                    } else {
                        getbutton12ek5ggoq2 = new getButton12EK5gGoQ(i3, objArrCopyOf);
                    }
                } else {
                    getBackspaceEK5gGoQ getbackspaceek5ggoq2 = getButton10EK5gGoQ.MediaDescriptionCompat;
                    getbutton12ek5ggoq2 = getButton12EK5gGoQ.IconCompatParcelizer;
                }
                if (!getbutton12ek5ggoq2.isEmpty()) {
                    getButton10EK5gGoQ getbutton10ek5ggoqRemoteActionCompatParcelizer = getbutton12ek5ggoq2.RemoteActionCompatParcelizer();
                    int size = getbutton10ek5ggoqRemoteActionCompatParcelizer.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        byte[] bArr = (byte[]) getbutton10ek5ggoqRemoteActionCompatParcelizer.get(i5);
                        getBackspaceEK5gGoQ getbackspaceek5ggoqSerializer = getbutton12ek5ggoq.listIterator(0);
                        while (getbackspaceek5ggoqSerializer.hasNext()) {
                            if (Arrays.equals(bArr, (byte[]) getbackspaceek5ggoqSerializer.next())) {
                                return true;
                            }
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Unable to obtain package certificate history.");
                }
            } catch (IllegalArgumentException unused) {
                if (z) {
                    zzjVarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(packageInfo, accessgetTvSatelliteServicecp.read);
                } else {
                    zzjVarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(packageInfo, accessgetTvSatelliteServicecp.read[0]);
                }
                if (zzjVarRemoteActionCompatParcelizer == null) {
                    return false;
                }
            }
        }
        return false;
    }

    public /* synthetic */ scale0AR0LA0default(Object obj) {
        this.IconCompatParcelizer = obj;
    }

    public scale0AR0LA0default() {
    }
}
