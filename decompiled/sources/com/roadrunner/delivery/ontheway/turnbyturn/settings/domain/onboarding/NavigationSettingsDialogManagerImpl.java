package com.roadrunner.delivery.ontheway.turnbyturn.settings.domain.onboarding;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.accessunpackByte3;
import o.copy8_81llAdefault;
import o.getAlignmentPIaL0Z0;
import o.packBytes;

/* JADX INFO: loaded from: classes3.dex */
public final class NavigationSettingsDialogManagerImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final accessunpackByte3 IconCompatParcelizer;
    public final packBytes serializer;
    public final copy8_81llAdefault write;

    public NavigationSettingsDialogManagerImpl(accessunpackByte3 accessunpackbyte3, copy8_81llAdefault copy8_81lladefault, packBytes packbytes) {
        this.IconCompatParcelizer = accessunpackbyte3;
        this.write = copy8_81lladefault;
        this.serializer = packbytes;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00aa  */
    public final Object shouldShow(ContinuationImpl continuationImpl) {
        getAlignmentPIaL0Z0 getalignmentpial0z0;
        boolean z;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 19;
        int i3 = i2 % Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        if (continuationImpl instanceof getAlignmentPIaL0Z0) {
            int i5 = i3 + 69;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = ((getAlignmentPIaL0Z0) continuationImpl).read;
                throw null;
            }
            getalignmentpial0z0 = (getAlignmentPIaL0Z0) continuationImpl;
            int i7 = getalignmentpial0z0.read;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                getalignmentpial0z0.read = i7 - Integer.MIN_VALUE;
            } else {
                getalignmentpial0z0 = new getAlignmentPIaL0Z0(this, continuationImpl);
            }
        } else {
            getalignmentpial0z0 = new getAlignmentPIaL0Z0(this, continuationImpl);
        }
        Object openSettingsDialogShown = getalignmentpial0z0.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = getalignmentpial0z0.read;
        if (i8 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(openSettingsDialogShown);
            if (this.IconCompatParcelizer.read()) {
                int i9 = RemoteActionCompatParcelizer + 17;
                read = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                getalignmentpial0z0.read = 1;
                openSettingsDialogShown = this.serializer.RemoteActionCompatParcelizer.getOpenSettingsDialogShown(getalignmentpial0z0);
                if (openSettingsDialogShown == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return Boolean.valueOf(z);
        }
        int i11 = RemoteActionCompatParcelizer;
        int i12 = i11 + 15;
        read = i12 % Fields.SpotShadowColor;
        int i13 = i12 % 2;
        if (i8 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            int i14 = read + 109;
            RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            return null;
        }
        int i16 = i11 + 85;
        read = i16 % Fields.SpotShadowColor;
        if (i16 % 2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(openSettingsDialogShown);
            throw null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(openSettingsDialogShown);
        if (!((Boolean) openSettingsDialogShown).booleanValue()) {
            int i17 = RemoteActionCompatParcelizer + 107;
            read = i17 % Fields.SpotShadowColor;
            if (i17 % 2 == 0) {
                this.write.RemoteActionCompatParcelizer();
                throw null;
            }
            z = this.write.RemoteActionCompatParcelizer() ? false : true;
        }
        return Boolean.valueOf(z);
    }
}
