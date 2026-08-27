package com.roadrunner.appperformance;

import android.os.Trace;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import o.SemanticsOwner;
import o.ShortNewsContentCardView;
import o.accessgetRole;
import o.getAllSemanticsNodesToMap;
import o.getRootInfoui;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.sourceInformationContextOfdefault;

/* JADX INFO: loaded from: classes3.dex */
public final class TraceTimeMeasurementWithPerformanceKit implements getAllSemanticsNodesToMap {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final SemanticsOwner serializer;

    public TraceTimeMeasurementWithPerformanceKit(SemanticsOwner semanticsOwner) {
        semanticsOwner.getClass();
        this.serializer = semanticsOwner;
    }

    public final Object read(String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i = 2 % 2;
        SemanticsOwner semanticsOwner = this.serializer;
        boolean zBooleanValue = ((Boolean) r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(-1240730099, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), 1240730100, sourceInformationContextOfdefault.read(), new Object[0], sourceInformationContextOfdefault.read())).booleanValue();
        if (zBooleanValue) {
            r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.read(str);
        }
        try {
            try {
                getRootInfoui getrootinfoui = (getRootInfoui) semanticsOwner;
                getrootinfoui.serializer(str);
                Object objInvoke = r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                getrootinfoui.write(str);
                if (!(!zBooleanValue)) {
                    int i2 = IconCompatParcelizer + 111;
                    RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    Trace.endSection();
                }
                return objInvoke;
            } catch (Throwable th) {
                ((getRootInfoui) semanticsOwner).write(str);
                throw th;
            }
        } catch (Throwable th2) {
            if (zBooleanValue) {
                int i4 = RemoteActionCompatParcelizer + 27;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                Trace.endSection();
                int i6 = IconCompatParcelizer + 119;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c4  */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x00db: IF  (r8 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:52:0x00e9, block:B:50:0x00db */
    public final Object ofSuspend(String str, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ShortNewsContentCardView shortNewsContentCardView) {
        accessgetRole accessgetrole;
        boolean z;
        boolean zBooleanValue;
        SemanticsOwner semanticsOwner;
        String str2;
        boolean z2;
        String str3 = str;
        int i = 2 % 2;
        if (shortNewsContentCardView instanceof accessgetRole) {
            int i2 = RemoteActionCompatParcelizer + 55;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            accessgetrole = (accessgetRole) shortNewsContentCardView;
            int i4 = accessgetrole.IconCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = RemoteActionCompatParcelizer + 109;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                accessgetrole.IconCompatParcelizer = i5 % 2 != 0 ? i4 - Integer.MIN_VALUE : i4 - Integer.MIN_VALUE;
            } else {
                accessgetrole = new accessgetRole(this, shortNewsContentCardView);
            }
        } else {
            accessgetrole = new accessgetRole(this, shortNewsContentCardView);
        }
        Object objInvoke = accessgetrole.read;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = accessgetrole.IconCompatParcelizer;
        try {
            if (i6 != 0) {
                if (i6 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i7 = RemoteActionCompatParcelizer + 11;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    z2 = accessgetrole.RemoteActionCompatParcelizer;
                    String str4 = accessgetrole.serializer;
                    semanticsOwner = accessgetrole.write;
                    try {
                        ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                        zBooleanValue = z2;
                        str3 = str4;
                        semanticsOwner.write(str3);
                        if (zBooleanValue) {
                            int i8 = RemoteActionCompatParcelizer + 89;
                            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                            int i9 = i8 % 2;
                            Trace.endSection();
                        }
                        return objInvoke;
                    } catch (Throwable th) {
                        th = th;
                        str2 = str4;
                    }
                } else {
                    boolean z3 = accessgetrole.RemoteActionCompatParcelizer;
                    str2 = accessgetrole.serializer;
                    semanticsOwner = accessgetrole.write;
                    try {
                        ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                        throw null;
                    } catch (Throwable th2) {
                        th = th2;
                        z2 = z3;
                    }
                }
                str3 = str2;
                semanticsOwner.write(str3);
                throw th;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            SemanticsOwner semanticsOwner2 = this.serializer;
            zBooleanValue = ((Boolean) r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(-1240730099, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), 1240730100, sourceInformationContextOfdefault.read(), new Object[0], sourceInformationContextOfdefault.read())).booleanValue();
            if (zBooleanValue) {
                int i10 = RemoteActionCompatParcelizer + 15;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.read(str);
            }
            try {
                getRootInfoui getrootinfoui = (getRootInfoui) semanticsOwner2;
                getrootinfoui.serializer(str3);
                try {
                    accessgetrole.write = getrootinfoui;
                    accessgetrole.serializer = str3;
                    accessgetrole.RemoteActionCompatParcelizer = zBooleanValue;
                    accessgetrole.IconCompatParcelizer = 1;
                    objInvoke = r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(accessgetrole);
                    if (objInvoke == obj) {
                        return obj;
                    }
                    semanticsOwner = getrootinfoui;
                    semanticsOwner.write(str3);
                    if (zBooleanValue) {
                        int i12 = RemoteActionCompatParcelizer + 89;
                        IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                        int i13 = i12 % 2;
                        Trace.endSection();
                    }
                    return objInvoke;
                } catch (Throwable th3) {
                    th = th3;
                    semanticsOwner = getrootinfoui;
                }
            } catch (Throwable th4) {
                th = th4;
                semanticsOwner = semanticsOwner2;
            }
        } catch (Throwable th5) {
            if (z) {
                Trace.endSection();
                int i14 = RemoteActionCompatParcelizer + 49;
                IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
            }
            throw th5;
        }
    }
}
