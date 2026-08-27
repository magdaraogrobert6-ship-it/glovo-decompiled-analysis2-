package o;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.gtm.zzd;
import com.google.android.gms.stats.zza;
import com.google.android.gms.tasks.zzc;
import io.sentry.metrics.MetricsBatchProcessor;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class getChannelUpEK5gGoQ extends zzd implements getButtonL2EK5gGoQ {
    public static final /* synthetic */ int serializer = 0;
    public final MetricsBatchProcessor IconCompatParcelizer;
    public final Context MediaDescriptionCompat;
    public final ExecutorService RemoteActionCompatParcelizer;
    public final HashMap read;
    public final setLastReportedResult write;

    public getChannelUpEK5gGoQ(Context context, setLastReportedResult setlastreportedresult, OnVisibilityChangedNode onVisibilityChangedNode) {
        MetricsBatchProcessor metricsBatchProcessor = new MetricsBatchProcessor(context, setlastreportedresult, onVisibilityChangedNode);
        ExecutorService executorService = coil3.util.IntPair.read(context);
        super("com.google.android.gms.tagmanager.internal.ITagManagerService");
        this.read = new HashMap(1);
        this.write = setlastreportedresult;
        this.IconCompatParcelizer = metricsBatchProcessor;
        this.RemoteActionCompatParcelizer = executorService;
        this.MediaDescriptionCompat = context;
    }

    @Override // o.getButtonL2EK5gGoQ
    public final void IconCompatParcelizer() {
        this.read.clear();
    }

    @Override // o.getButtonL2EK5gGoQ
    public final void IconCompatParcelizer(String str, Bundle bundle, String str2, long j, boolean z) {
        this.RemoteActionCompatParcelizer.execute(new zzc(this, new getButton3EK5gGoQ(str, bundle, str2, new Date(j), z, this.write), false, 10));
    }

    @Override // o.getButtonL2EK5gGoQ
    public final void RemoteActionCompatParcelizer() {
        this.RemoteActionCompatParcelizer.execute(new zza(17, this));
    }

    @Override // o.getButtonL2EK5gGoQ
    public final void RemoteActionCompatParcelizer(String str, String str2, String str3, getButtonR1EK5gGoQ getbuttonr1ek5ggoq) {
        this.RemoteActionCompatParcelizer.execute(new getClearEK5gGoQ(this, str, str2, str3, getbuttonr1ek5ggoq, 0));
    }

    @Override // com.google.android.gms.internal.gtm.zzd
    public final boolean zza(int i, Parcel parcel, Parcel parcel2) {
        getButtonR1EK5gGoQ getbutton8ek5ggoq = null;
        if (i == 1) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            getDirectionCenterEK5gGoQ.IconCompatParcelizer(parcel);
            RemoteActionCompatParcelizer(string, string2, string3, null);
        } else if (i == 2) {
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.tagmanager.internal.ITagManagerLoadContainerCallback");
                if (iInterfaceQueryLocalInterface instanceof getButtonR1EK5gGoQ) {
                    getbutton8ek5ggoq = (getButtonR1EK5gGoQ) iInterfaceQueryLocalInterface;
                } else {
                    getbutton8ek5ggoq = new getButton8EK5gGoQ(strongBinder);
                }
            }
            getDirectionCenterEK5gGoQ.IconCompatParcelizer(parcel);
            RemoteActionCompatParcelizer(string4, string5, string6, getbutton8ek5ggoq);
        } else if (i == 3) {
            IconCompatParcelizer();
        } else if (i == 101) {
            String string7 = parcel.readString();
            Bundle bundle = (Bundle) getDirectionCenterEK5gGoQ.serializer(parcel, Bundle.CREATOR);
            String string8 = parcel.readString();
            long j = parcel.readLong();
            boolean z = getDirectionCenterEK5gGoQ.read(parcel);
            getDirectionCenterEK5gGoQ.IconCompatParcelizer(parcel);
            IconCompatParcelizer(string7, bundle, string8, j, z);
        } else {
            if (i != 102) {
                return false;
            }
            RemoteActionCompatParcelizer();
        }
        parcel2.writeNoException();
        return true;
    }
}
