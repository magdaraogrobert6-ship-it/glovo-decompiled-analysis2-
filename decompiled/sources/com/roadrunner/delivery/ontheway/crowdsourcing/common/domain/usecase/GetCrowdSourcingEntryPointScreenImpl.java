package com.roadrunner.delivery.ontheway.crowdsourcing.common.domain.usecase;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.location.Vw$Vw;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.accessgetSentencescp;
import o.accessgetWordscp;
import o.getNumberPasswordPjHm6EEannotations;
import o.transferSessionPackageI;
import o.updateAdidI;
import o.updateSelection;

/* JADX INFO: loaded from: classes3.dex */
public final class GetCrowdSourcingEntryPointScreenImpl {
    private static int read = 1;
    private static int serializer;
    public final transferSessionPackageI RemoteActionCompatParcelizer;
    public final Vw$Vw write;

    public GetCrowdSourcingEntryPointScreenImpl(Vw$Vw vw$Vw, transferSessionPackageI transfersessionpackagei) {
        vw$Vw.getClass();
        transfersessionpackagei.getClass();
        this.write = vw$Vw;
        this.RemoteActionCompatParcelizer = transfersessionpackagei;
    }

    public static /* synthetic */ Object IconCompatParcelizer(GetCrowdSourcingEntryPointScreenImpl getCrowdSourcingEntryPointScreenImpl, boolean z, SuspendLambda suspendLambda) {
        int i = 2 % 2;
        int i2 = read + 51;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objInvoke = getCrowdSourcingEntryPointScreenImpl.invoke(z, false, suspendLambda);
        int i4 = read + 105;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvoke;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    public final Object invoke(boolean z, boolean z2, ContinuationImpl continuationImpl) {
        getNumberPasswordPjHm6EEannotations getnumberpasswordpjhm6eeannotations;
        int i;
        int i2;
        int i3 = 2 % 2;
        if (continuationImpl instanceof getNumberPasswordPjHm6EEannotations) {
            getnumberpasswordpjhm6eeannotations = (getNumberPasswordPjHm6EEannotations) continuationImpl;
            int i4 = getnumberpasswordpjhm6eeannotations.write;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                getnumberpasswordpjhm6eeannotations.write = i4 - Integer.MIN_VALUE;
            } else {
                getnumberpasswordpjhm6eeannotations = new getNumberPasswordPjHm6EEannotations(this, continuationImpl);
                i = read + 47;
                serializer = i % Fields.SpotShadowColor;
                if (i % 2 != 0) {
                    int i5 = 5 % 4;
                }
            }
        } else {
            getnumberpasswordpjhm6eeannotations = new getNumberPasswordPjHm6EEannotations(this, continuationImpl);
            i = read + 47;
            serializer = i % Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i6 = 5 % 4;
            }
        }
        Object objInvoke = getnumberpasswordpjhm6eeannotations.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = getnumberpasswordpjhm6eeannotations.write;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            if (!z2) {
                int i8 = read + 63;
                serializer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                getnumberpasswordpjhm6eeannotations.RemoteActionCompatParcelizer = z;
                getnumberpasswordpjhm6eeannotations.write = 1;
                objInvoke = this.write.invoke(getnumberpasswordpjhm6eeannotations);
                if (objInvoke == coroutineSingletons) {
                    int i10 = serializer + 113;
                    read = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    return coroutineSingletons;
                }
            }
            if (!z && ((FirebaseRemoteConfigImpl) this.RemoteActionCompatParcelizer).IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_CROWD_SOURCING_GALLERY_ENABLED.getFirebaseFlagName())) {
                return accessgetWordscp.IconCompatParcelizer;
            }
            updateSelection updateselection = updateSelection.RemoteActionCompatParcelizer;
            i2 = serializer + 21;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i12 = 63 / 0;
            }
            return updateselection;
        }
        int i13 = read + 65;
        int i14 = i13 % Fields.SpotShadowColor;
        serializer = i14;
        if (i13 % 2 == 0 ? i7 != 1 : i7 != 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            int i15 = read + 29;
            serializer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            return null;
        }
        int i17 = i14 + 49;
        read = i17 % Fields.SpotShadowColor;
        int i18 = i17 % 2;
        z = getnumberpasswordpjhm6eeannotations.RemoteActionCompatParcelizer;
        ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
        if (((Boolean) objInvoke).booleanValue()) {
            int i19 = serializer + 15;
            read = i19 % Fields.SpotShadowColor;
            int i20 = i19 % 2;
            return accessgetSentencescp.write;
        }
        if (!z) {
        }
        updateSelection updateselection2 = updateSelection.RemoteActionCompatParcelizer;
        i2 = serializer + 21;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i110 = 63 / 0;
        }
        return updateselection2;
    }
}
