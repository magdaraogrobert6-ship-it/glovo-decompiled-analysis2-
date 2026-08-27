package com.roadrunner.startworking.equipment;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.sentiance.core.model.events.N$b;
import com.sentiance.core.model.thrift.O$b;
import io.grpc.internal.CallTracer;
import io.grpc.internal.SharedResourcePool;
import io.sentry.util.network.NetworkBody;
import o.createFromParcel;
import o.elambda0;
import o.getBitmapui_graphics;
import o.getQueryContext;
import o.handleUrlOverridelambda1;
import o.isHiddenannotations;
import o.lambda318;
import o.lambda319;
import o.lambda39;
import o.performPushDeliveryFlushlambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.requestSingleLocationUpdatelambda1;
import o.setSdkAuthenticationSignature;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class EquipmentBottomSheet$$ExternalSyntheticLambda0 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ EquipmentBottomSheet read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ EquipmentBottomSheet$$ExternalSyntheticLambda0(EquipmentBottomSheet equipmentBottomSheet, int i) {
        this.serializer = i;
        this.read = equipmentBottomSheet;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 77;
        write = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i3 = this.serializer;
        EquipmentBottomSheet equipmentBottomSheet = this.read;
        if (i3 == 0) {
            getBitmapui_graphics getbitmapui_graphics = (getBitmapui_graphics) obj;
            getbitmapui_graphics.getClass();
            lambda319 lambda319Var = equipmentBottomSheet.onActivityResult;
            if (lambda319Var != null) {
                O$b o$b = lambda319Var.RemoteActionCompatParcelizer;
                return new lambda318((NetworkBody) ((setSdkAuthenticationSignature) o$b.write).write(), (lambda39) ((elambda0) o$b.RemoteActionCompatParcelizer).write(), (N$b) ((isHiddenannotations) o$b.serializer).write(), (SharedResourcePool) ((requestSingleLocationUpdatelambda1) o$b.read).write(), (CallTracer) ((performPushDeliveryFlushlambda0) o$b.IconCompatParcelizer).write(), getbitmapui_graphics, new getQueryContext());
            }
            removeNodeAtDepth.serializer("viewModelFactory");
            throw null;
        }
        Boolean bool = (Boolean) obj;
        bool.getClass();
        ExtrasKt.write(equipmentBottomSheet, bool);
        int iRemoteActionCompatParcelizer = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
        ExtrasKt.read(662558831, iRemoteActionCompatParcelizer2, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -662558827, iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer, new Object[]{equipmentBottomSheet, bool});
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = IconCompatParcelizer + 65;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel;
    }
}
