package com.incognia.internal;

import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import com.braze.BrazeUser;
import com.braze.events.IValueCallback;
import com.braze.ui.UserJavascriptInterfaceBase;
import com.google.android.gms.tasks.OnSuccessListener;
import com.mapbox.common.location.GoogleDeviceLocationProvider;
import com.mapbox.common.module.cronet.LazyEngine;
import com.mapbox.common.movement.GoogleActivityRecognition;
import io.reactivex.functions.Consumer;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mn$$ExternalSyntheticLambda0 implements DoubleFunction, IValueCallback, kz0, IrU, OnSuccessListener, Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM f$0;

    public /* synthetic */ mn$$ExternalSyntheticLambda0(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i) {
        this.$r8$classId = i;
        this.f$0 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // com.incognia.internal.IrU
    public void BGx(E3 e3) {
        mn.BGx(this.f$0, e3);
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
        int i = this.$r8$classId;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.f$0;
        if (i == 13) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(obj);
        } else if (i != 14) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(obj);
        } else {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(obj);
        }
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public double invoke(double d) {
        int i = this.$r8$classId;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.f$0;
        if (i == 1) {
            return Rgb._init_$lambda$0(r8lambdaunavo3sxub_pc9xroryotnrlvsm, d);
        }
        if (i != 2) {
            return i != 3 ? Rgb._init_$lambda$3(r8lambdaunavo3sxub_pc9xroryotnrlvsm, d) : Rgb._init_$lambda$2(r8lambdaunavo3sxub_pc9xroryotnrlvsm, d);
        }
        return Rgb._init_$lambda$1(r8lambdaunavo3sxub_pc9xroryotnrlvsm, d);
    }

    @Override // com.braze.events.IValueCallback
    public void onSuccess(Object obj) {
        int i = this.$r8$classId;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.f$0;
        if (i == 0) {
            mn.BGx(r8lambdaunavo3sxub_pc9xroryotnrlvsm, (jP7) obj);
            return;
        }
        if (i == 5) {
            UserJavascriptInterfaceBase.Companion.runOnUser$lambda$0(r8lambdaunavo3sxub_pc9xroryotnrlvsm, (BrazeUser) obj);
            return;
        }
        switch (i) {
            case 7:
                GoogleDeviceLocationProvider.removeLocationUpdates$lambda$11(r8lambdaunavo3sxub_pc9xroryotnrlvsm, obj);
                break;
            case 8:
                GoogleDeviceLocationProvider.doStop$lambda$4(r8lambdaunavo3sxub_pc9xroryotnrlvsm, obj);
                break;
            case 9:
                GoogleDeviceLocationProvider.doStart$lambda$2(r8lambdaunavo3sxub_pc9xroryotnrlvsm, obj);
                break;
            case 10:
                GoogleDeviceLocationProvider.requestLocationUpdates$lambda$9(r8lambdaunavo3sxub_pc9xroryotnrlvsm, obj);
                break;
            case 11:
                LazyEngine.tryInstallFromGooglePlay$lambda$1(r8lambdaunavo3sxub_pc9xroryotnrlvsm, obj);
                break;
            default:
                GoogleActivityRecognition.Companion.withLogs$lambda$6(r8lambdaunavo3sxub_pc9xroryotnrlvsm, obj);
                break;
        }
    }
}
