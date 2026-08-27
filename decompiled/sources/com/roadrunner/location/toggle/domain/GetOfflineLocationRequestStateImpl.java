package com.roadrunner.location.toggle.domain;

import com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl;
import o.transferSessionPackageI;

/* JADX INFO: loaded from: classes3.dex */
public final class GetOfflineLocationRequestStateImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final GetRiderStatusImpl IconCompatParcelizer;
    public final transferSessionPackageI serializer;

    public GetOfflineLocationRequestStateImpl(GetRiderStatusImpl getRiderStatusImpl, transferSessionPackageI transfersessionpackagei) {
        this.IconCompatParcelizer = getRiderStatusImpl;
        this.serializer = transfersessionpackagei;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        return new kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(o.WorkDatabase_Impl.NOT_REQUIRED_FEATURE_DISABLED);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (((com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl) r4.serializer).IconCompatParcelizer(o.updateAdidI.IS_LOCATION_PERMISSION_TOGGLE_ENABLED) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (((com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl) r4.serializer).IconCompatParcelizer(o.updateAdidI.IS_LOCATION_PERMISSION_TOGGLE_ENABLED) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        r3 = new com.roadrunner.location.toggle.domain.GetOfflineLocationRequestStateImpl$invoke$$inlined$map$1(r4.IconCompatParcelizer.IconCompatParcelizer(), r2);
        r1 = com.roadrunner.location.toggle.domain.GetOfflineLocationRequestStateImpl.read + 117;
        com.roadrunner.location.toggle.domain.GetOfflineLocationRequestStateImpl.RemoteActionCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.flow.Flow serializer() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.location.toggle.domain.GetOfflineLocationRequestStateImpl.read
            int r1 = r1 + 5
            int r2 = r1 % 128
            com.roadrunner.location.toggle.domain.GetOfflineLocationRequestStateImpl.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L1f
            o.transferSessionPackageI r1 = r4.serializer
            com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl r1 = (com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl) r1
            o.updateAdidI r3 = o.updateAdidI.IS_LOCATION_PERMISSION_TOGGLE_ENABLED
            boolean r1 = r1.IconCompatParcelizer(r3)
            r3 = 89
            int r3 = r3 / r2
            if (r1 == 0) goto L40
            goto L2b
        L1f:
            o.transferSessionPackageI r1 = r4.serializer
            com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl r1 = (com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl) r1
            o.updateAdidI r3 = o.updateAdidI.IS_LOCATION_PERMISSION_TOGGLE_ENABLED
            boolean r1 = r1.IconCompatParcelizer(r3)
            if (r1 == 0) goto L40
        L2b:
            com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl r1 = r4.IconCompatParcelizer
            com.roadrunner.map.container.context.GetMapScope$invoke$$inlined$map$1 r1 = r1.IconCompatParcelizer()
            com.roadrunner.location.toggle.domain.GetOfflineLocationRequestStateImpl$invoke$$inlined$map$1 r3 = new com.roadrunner.location.toggle.domain.GetOfflineLocationRequestStateImpl$invoke$$inlined$map$1
            r3.<init>(r1, r2)
            int r1 = com.roadrunner.location.toggle.domain.GetOfflineLocationRequestStateImpl.read
            int r1 = r1 + 117
            int r2 = r1 % 128
            com.roadrunner.location.toggle.domain.GetOfflineLocationRequestStateImpl.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            return r3
        L40:
            o.WorkDatabase_Impl r0 = o.WorkDatabase_Impl.NOT_REQUIRED_FEATURE_DISABLED
            kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 r1 = new kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.location.toggle.domain.GetOfflineLocationRequestStateImpl.serializer():kotlinx.coroutines.flow.Flow");
    }
}
