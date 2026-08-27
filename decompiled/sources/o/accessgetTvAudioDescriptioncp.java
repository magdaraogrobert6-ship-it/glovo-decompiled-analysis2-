package o;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.common.moduleinstall.internal.zay;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetTvAudioDescriptioncp extends getAvReceiverInputEK5gGoQ implements IInterface {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ ParentDataModifierDefaultImpls serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessgetTvAudioDescriptioncp(zay zayVar, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls, int i) {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
        this.IconCompatParcelizer = i;
        this.serializer = parentDataModifierDefaultImpls;
    }

    @Override // o.getAvReceiverInputEK5gGoQ
    public final boolean IconCompatParcelizer(int i, Parcel parcel, Parcel parcel2) {
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = this.serializer;
        int i2 = this.IconCompatParcelizer;
        if (i == 1) {
            Status status = (Status) getBEK5gGoQ.RemoteActionCompatParcelizer(parcel, Status.CREATOR);
            ModuleAvailabilityResponse moduleAvailabilityResponse = (ModuleAvailabilityResponse) getBEK5gGoQ.RemoteActionCompatParcelizer(parcel, ModuleAvailabilityResponse.CREATOR);
            getBEK5gGoQ.RemoteActionCompatParcelizer(parcel);
            if (i2 != 0) {
                throw new UnsupportedOperationException();
            }
            LazyKt__LazyJVMKt.serializer(status, moduleAvailabilityResponse, parentDataModifierDefaultImpls);
            return true;
        }
        if (i == 2) {
            Status status2 = (Status) getBEK5gGoQ.RemoteActionCompatParcelizer(parcel, Status.CREATOR);
            ModuleInstallResponse moduleInstallResponse = (ModuleInstallResponse) getBEK5gGoQ.RemoteActionCompatParcelizer(parcel, ModuleInstallResponse.CREATOR);
            getBEK5gGoQ.RemoteActionCompatParcelizer(parcel);
            if (i2 != 1) {
                throw new UnsupportedOperationException();
            }
            LazyKt__LazyJVMKt.serializer(status2, moduleInstallResponse, parentDataModifierDefaultImpls);
            return true;
        }
        if (i == 3) {
            getBEK5gGoQ.RemoteActionCompatParcelizer(parcel);
            getAlignmentLinesMap.write();
            return false;
        }
        if (i != 4) {
            return false;
        }
        getBEK5gGoQ.RemoteActionCompatParcelizer(parcel);
        getAlignmentLinesMap.write();
        return false;
    }
}
