package o;

import android.view.ViewGroup;
import androidx.work.RxWorker$1$$ExternalSyntheticLambda0;
import bo.app.w4$$ExternalSyntheticLambda0;
import com.google.android.gms.common.zzw;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class copyMDFrstsdefault extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ scaledRadiiRect IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read = 0;
    public final /* synthetic */ ViewGroup write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public copyMDFrstsdefault(scaledRadiiRect scaledradiirect, Object obj, ViewGroup viewGroup) {
        super(0);
        this.IconCompatParcelizer = scaledradiirect;
        this.RemoteActionCompatParcelizer = obj;
        this.write = viewGroup;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ViewGroup viewGroup = this.write;
        Object obj = this.RemoteActionCompatParcelizer;
        scaledRadiiRect scaledradiirect = this.IconCompatParcelizer;
        if (i == 0) {
            scaledradiirect.MediaSessionCompatToken.write(viewGroup, obj);
            return createfromparcel;
        }
        ArrayList arrayList = scaledradiirect.ParcelableVolumeInfo;
        toAndroidBlendModes9anfk8 toandroidblendmodes9anfk8 = scaledradiirect.MediaSessionCompatToken;
        if (arrayList.isEmpty()) {
            div7Ah8Wj8.RemoteActionCompatParcelizer(2);
            Object obj2 = scaledradiirect.read;
            obj2.getClass();
            toandroidblendmodes9anfk8.read(obj2, new w4$$ExternalSyntheticLambda0(scaledradiirect, 4, viewGroup));
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((component5kKHJgLs) it.next()).RemoteActionCompatParcelizer.MediaSessionCompatQueueItem) {
                    div7Ah8Wj8.RemoteActionCompatParcelizer(2);
                    zzw zzwVar = new zzw();
                    toandroidblendmodes9anfk8.write(((component5kKHJgLs) arrayList.get(0)).RemoteActionCompatParcelizer.RemoteActionCompatParcelizer, obj, zzwVar, new RxWorker$1$$ExternalSyntheticLambda0(7, scaledradiirect));
                    zzwVar.read();
                }
            }
            div7Ah8Wj8.RemoteActionCompatParcelizer(2);
            Object obj3 = scaledradiirect.read;
            obj3.getClass();
            toandroidblendmodes9anfk8.read(obj3, new w4$$ExternalSyntheticLambda0(scaledradiirect, 4, viewGroup));
        }
        return createfromparcel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public copyMDFrstsdefault(scaledRadiiRect scaledradiirect, ViewGroup viewGroup, Object obj) {
        super(0);
        this.IconCompatParcelizer = scaledradiirect;
        this.write = viewGroup;
        this.RemoteActionCompatParcelizer = obj;
    }
}
