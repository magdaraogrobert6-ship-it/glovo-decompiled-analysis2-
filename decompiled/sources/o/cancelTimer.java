package o;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import io.grpc.Status;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes2.dex */
public final class cancelTimer implements Runnable {
    public boolean IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final Object read;
    public final Object serializer;
    public final /* synthetic */ Object write;

    public cancelTimer(r8lambda1DLeNeBWPKsDsvf_XikspXtDEU r8lambda1dlenebwpksdsvf_xikspxtdeu, setDateOfBirthlambda2 setdateofbirthlambda2) {
        this.RemoteActionCompatParcelizer = 2;
        this.write = r8lambda1dlenebwpksdsvf_xikspxtdeu;
        Level level = Level.FINE;
        this.read = new OkHttpCall$1();
        this.IconCompatParcelizer = true;
        this.serializer = setdateofbirthlambda2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r8lambda1DLeNeBWPKsDsvf_XikspXtDEU r8lambda1dlenebwpksdsvf_xikspxtdeu;
        Status statusIconCompatParcelizer;
        int i = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            setViewportBounds setviewportbounds = (setViewportBounds) this.write;
            isComplete iscomplete = setviewportbounds.write;
            if (iscomplete == null) {
                getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.serializer.RemoteActionCompatParcelizer("Discarding data. Failed to set user property");
                return;
            } else {
                setviewportbounds.RemoteActionCompatParcelizer(iscomplete, this.IconCompatParcelizer ? null : (zzpl) this.serializer, (zzr) this.read);
                setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                return;
            }
        }
        if (i == 1) {
            setViewportBounds setviewportbounds2 = (setViewportBounds) this.write;
            isComplete iscomplete2 = setviewportbounds2.write;
            if (iscomplete2 != null) {
                setviewportbounds2.RemoteActionCompatParcelizer(iscomplete2, this.IconCompatParcelizer ? null : (zzbg) this.serializer, (zzr) this.read);
                setviewportbounds2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                return;
            } else {
                getLookaheadDelegate getlookaheaddelegate2 = ((LookaheadScopeKtLookaheadScope221) setviewportbounds2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                getlookaheaddelegate2.serializer.RemoteActionCompatParcelizer("Discarding data. Failed to send event to service");
                return;
            }
        }
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName("OkHttpClientTransport");
        while (true) {
            try {
                try {
                    boolean zRemoteActionCompatParcelizer = ((setDateOfBirthlambda2) this.serializer).RemoteActionCompatParcelizer(this);
                    r8lambda1dlenebwpksdsvf_xikspxtdeu = (r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) this.write;
                    if (!zRemoteActionCompatParcelizer) {
                        break;
                    }
                    getMaxUnpackedZipEntryCountandroid_sdk_base_releaseannotations getmaxunpackedzipentrycountandroid_sdk_base_releaseannotations = r8lambda1dlenebwpksdsvf_xikspxtdeu.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                    if (getmaxunpackedzipentrycountandroid_sdk_base_releaseannotations != null) {
                        getmaxunpackedzipentrycountandroid_sdk_base_releaseannotations.read();
                    }
                } catch (IOException e) {
                    r8lambda1DLeNeBWPKsDsvf_XikspXtDEU.read.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
                }
            } catch (Throwable th) {
                try {
                    r8lambda1DLeNeBWPKsDsvf_XikspXtDEU r8lambda1dlenebwpksdsvf_xikspxtdeu2 = (r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) this.write;
                    r8lambdatmTe9dbjpRe9qF6mggphoyHct6s r8lambdatmte9dbjpre9qf6mggphoyhct6s = r8lambdatmTe9dbjpRe9qF6mggphoyHct6s.PROTOCOL_ERROR;
                    Status statusRemoteActionCompatParcelizer = Status.write.IconCompatParcelizer("error in frame handler").RemoteActionCompatParcelizer(th);
                    Map map = r8lambda1DLeNeBWPKsDsvf_XikspXtDEU.serializer;
                    r8lambda1dlenebwpksdsvf_xikspxtdeu2.IconCompatParcelizer(0, r8lambdatmte9dbjpre9qf6mggphoyhct6s, statusRemoteActionCompatParcelizer);
                    try {
                        ((setDateOfBirthlambda2) this.serializer).close();
                    } catch (RuntimeException e2) {
                        if (!"bio == null".equals(e2.getMessage())) {
                            throw e2;
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        ((setDateOfBirthlambda2) this.serializer).close();
                    } catch (IOException e3) {
                        r8lambda1DLeNeBWPKsDsvf_XikspXtDEU.read.log(Level.INFO, "Exception closing frame reader", (Throwable) e3);
                    } catch (RuntimeException e4) {
                        if (!"bio == null".equals(e4.getMessage())) {
                            throw e4;
                        }
                    }
                    ((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) this.write).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.serializer();
                    Thread.currentThread().setName(name);
                    throw th2;
                }
            }
        }
        synchronized (r8lambda1dlenebwpksdsvf_xikspxtdeu.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) {
            statusIconCompatParcelizer = ((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) this.write).ParcelableVolumeInfo;
        }
        if (statusIconCompatParcelizer == null) {
            statusIconCompatParcelizer = Status.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer("End of stream or IOException");
        }
        ((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) this.write).IconCompatParcelizer(0, r8lambdatmTe9dbjpRe9qF6mggphoyHct6s.INTERNAL_ERROR, statusIconCompatParcelizer);
        try {
            ((setDateOfBirthlambda2) this.serializer).close();
        } catch (RuntimeException e5) {
            if (!"bio == null".equals(e5.getMessage())) {
                throw e5;
            }
        }
        ((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) this.write).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.serializer();
        Thread.currentThread().setName(name);
    }

    public /* synthetic */ cancelTimer(setViewportBounds setviewportbounds, zzr zzrVar, boolean z, AbstractSafeParcelable abstractSafeParcelable, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.read = zzrVar;
        this.IconCompatParcelizer = z;
        this.serializer = abstractSafeParcelable;
        this.write = setviewportbounds;
    }
}
