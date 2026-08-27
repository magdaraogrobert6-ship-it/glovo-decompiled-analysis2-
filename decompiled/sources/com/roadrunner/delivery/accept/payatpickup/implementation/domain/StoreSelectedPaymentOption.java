package com.roadrunner.delivery.accept.payatpickup.implementation.domain;

import androidx.compose.ui.graphics.Fields;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import o.LineHeightStyleSpan;
import o.calculateTargetMetrics;
import o.copyui_text;
import o.copyui_textdefault;
import o.createFromParcel;
import o.getCieXyz;
import o.getLastDescentDiff;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class StoreSelectedPaymentOption {
    private static int serializer = 0;
    private static int write = 1;
    public final getLastDescentDiff read;

    public StoreSelectedPaymentOption(getLastDescentDiff getlastdescentdiff) {
        this.read = getlastdescentdiff;
    }

    public final createFromParcel invoke(copyui_textdefault copyui_textdefaultVar) {
        int i = 2 % 2;
        boolean z = copyui_textdefaultVar.RemoteActionCompatParcelizer() instanceof copyui_text;
        AtomicReference atomicReference = this.read.RemoteActionCompatParcelizer;
        if (z) {
            int i2 = write + 59;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            atomicReference.set(copyui_textdefaultVar);
        } else if (atomicReference.get() == null) {
            int i4 = serializer + 17;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            atomicReference.set(copyui_textdefaultVar);
        } else {
            copyui_textdefault copyui_textdefaultVar2 = (copyui_textdefault) atomicReference.get();
            calculateTargetMetrics calculatetargetmetricsRemoteActionCompatParcelizer = copyui_textdefaultVar2 != null ? copyui_textdefaultVar2.RemoteActionCompatParcelizer() : null;
            LineHeightStyleSpan lineHeightStyleSpan = LineHeightStyleSpan.read;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{calculatetargetmetricsRemoteActionCompatParcelizer, lineHeightStyleSpan}, getCieXyz.write())).booleanValue()) {
                int i6 = serializer + 81;
                write = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    copyui_textdefaultVar.RemoteActionCompatParcelizer().equals(lineHeightStyleSpan);
                    throw null;
                }
                if (copyui_textdefaultVar.RemoteActionCompatParcelizer().equals(lineHeightStyleSpan)) {
                    int i7 = serializer + 35;
                    write = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    atomicReference.set(copyui_textdefaultVar);
                }
            }
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return createFromParcel.INSTANCE;
    }
}
