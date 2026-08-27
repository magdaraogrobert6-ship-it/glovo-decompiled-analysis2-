package androidx.recyclerview.widget;

import android.view.View;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.huawei.wisesecurity.ucs_credential.g0;
import com.roadrunner.rider.state.summary.nest.NestRiderStateSummaryColumnKt;
import com.roadrunner.settings.SettingsFragment;
import com.roadrunner.settings.ui.screens.SettingsScreenKt$SettingsScreen$2$1;
import o.AndroidContentCaptureManager;
import o.SdkClickHandler2;
import o.SdkClickResponseData;
import o.SessionResponseData;
import o.SharedPreferencesManager;
import o.UiMediaScopeImpl;
import o.WindowInsetsCompatImpl21;
import o.WindowInsetsCompatImpl28;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getIntrinsicSizeNHjbRc;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.getQueryContext;
import o.getSoftlight0nO6VwU;
import o.p3;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.registerInAppMessageManagerlambda0;
import o.removeNodeAtDepth;
import o.saveInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class ScrollbarHelper {
    private static int read = 0;
    private static int serializer = 1;

    public static int IconCompatParcelizer(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc, getSoftlight0nO6VwU getsoftlight0no6vwu, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z) {
        int i = 2 % 2;
        Object obj = null;
        if (layoutManager.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() != 0 && getintrinsicsizenhjbrc.serializer() != 0) {
            int i2 = read + 85;
            int i3 = i2 % Fields.SpotShadowColor;
            serializer = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (view != null) {
                int i4 = i3 + 45;
                read = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                if (view2 != null) {
                    if (!z) {
                        return Math.abs(RecyclerView.LayoutManager.RemoteActionCompatParcelizer(view) - RecyclerView.LayoutManager.RemoteActionCompatParcelizer(view2)) + 1;
                    }
                    return Math.min(getsoftlight0no6vwu.MediaDescriptionCompat(), getsoftlight0no6vwu.write(view2) - getsoftlight0no6vwu.RemoteActionCompatParcelizer(view));
                }
            }
        }
        int i6 = read + 69;
        serializer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return 0;
        }
        obj.hashCode();
        throw null;
    }

    public static int write(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc, getSoftlight0nO6VwU getsoftlight0no6vwu, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z) {
        int i = 2 % 2;
        if (layoutManager.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == 0 || getintrinsicsizenhjbrc.serializer() == 0 || view == null) {
            return 0;
        }
        int i2 = read;
        int i3 = i2 + 29;
        serializer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (view2 != null) {
            if (!z) {
                return getintrinsicsizenhjbrc.serializer();
            }
            return (int) (((getsoftlight0no6vwu.write(view2) - getsoftlight0no6vwu.RemoteActionCompatParcelizer(view)) / (Math.abs(RecyclerView.LayoutManager.RemoteActionCompatParcelizer(view) - RecyclerView.LayoutManager.RemoteActionCompatParcelizer(view2)) + 1)) * getintrinsicsizenhjbrc.serializer());
        }
        int i4 = i2 + 3;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return 0;
        }
        int i5 = 3 % 3;
        return 0;
    }

    public static int IconCompatParcelizer(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc, getSoftlight0nO6VwU getsoftlight0no6vwu, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z, boolean z2) {
        int iMax;
        int i = 2 % 2;
        if (layoutManager.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() != 0 && getintrinsicsizenhjbrc.serializer() != 0) {
            int i2 = read + 25;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (view != null && view2 != null) {
                int iMin = Math.min(RecyclerView.LayoutManager.RemoteActionCompatParcelizer(view), RecyclerView.LayoutManager.RemoteActionCompatParcelizer(view2));
                int iMax2 = Math.max(RecyclerView.LayoutManager.RemoteActionCompatParcelizer(view), RecyclerView.LayoutManager.RemoteActionCompatParcelizer(view2));
                if (z2) {
                    int i3 = read + 69;
                    serializer = i3 % Fields.SpotShadowColor;
                    iMax = i3 % 2 == 0 ? Math.max(1, (getintrinsicsizenhjbrc.serializer() / iMax2) >> 1) : Math.max(0, (getintrinsicsizenhjbrc.serializer() - iMax2) - 1);
                } else {
                    iMax = Math.max(0, iMin);
                }
                if (z) {
                    return Math.round((iMax * (Math.abs(getsoftlight0no6vwu.write(view2) - getsoftlight0no6vwu.RemoteActionCompatParcelizer(view)) / (Math.abs(RecyclerView.LayoutManager.RemoteActionCompatParcelizer(view) - RecyclerView.LayoutManager.RemoteActionCompatParcelizer(view2)) + 1))) + (getsoftlight0no6vwu.IconCompatParcelizer() - getsoftlight0no6vwu.RemoteActionCompatParcelizer(view)));
                }
                return iMax;
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x024d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0259  */
    /* JADX WARN: Code duplicated, block: B:124:0x025f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x0262  */
    /* JADX WARN: Code duplicated, block: B:127:0x0265  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a8  */
    public static final void NestRiderStateSummary(saveInteger saveinteger, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, g0 g0Var, getBirthDateFull getbirthdatefull, int i) throws Throwable {
        int i2;
        getPostalCode getpostalcode;
        boolean z;
        int i3;
        Throwable th;
        int i4;
        AndroidContentCaptureManager androidContentCaptureManager;
        boolean zIconCompatParcelizer;
        Object objComponentActivity;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 2 % 2;
        saveinteger.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k2.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1005239874);
        if ((i & 6) == 0) {
            if (getpostalcode2.IconCompatParcelizer(saveinteger)) {
                int i10 = serializer + 67;
                read = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i12 = serializer + 85;
            read = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        Object obj = null;
        if ((i & 384) == 0) {
            int i14 = read + 25;
            serializer = i14 % Fields.SpotShadowColor;
            if (i14 % 2 != 0) {
                i2 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.RotationX : Fields.SpotShadowColor;
            } else {
                getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                obj.hashCode();
                throw null;
            }
        }
        if ((i & 3072) == 0) {
            int i15 = serializer + 75;
            read = i15 % Fields.SpotShadowColor;
            if (i15 % 2 == 0) {
                if (!(!getpostalcode2.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry))) {
                    i7 = Fields.CameraDistance;
                } else {
                    i7 = Fields.RotationZ;
                }
            } else {
                int i16 = 51 / 0;
                if (!getpostalcode2.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry)) {
                    i7 = Fields.RotationZ;
                } else {
                    i7 = Fields.CameraDistance;
                }
            }
            i2 |= i7;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            if (!(!getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2))) {
                int i17 = serializer + 13;
                read = i17 % Fields.SpotShadowColor;
                if (i17 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i2 |= i6;
        }
        if ((1572864 & i) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(g0Var) ? 1048576 : Fields.BlendMode;
        }
        int i18 = i2;
        if (getpostalcode2.write(i18 & 1, (599187 & i18) != 599186)) {
            boolean z2 = (57344 & i18) == 16384;
            if ((458752 & i18) == 131072) {
                int i19 = serializer + 47;
                read = i19 % Fields.SpotShadowColor;
                int i20 = i19 % 2;
                z = true;
            } else {
                z = false;
            }
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager2 = getCreditCardExpirationMonth.write;
            if ((z2 | z) || objComponentActivity2 == androidContentCaptureManager2) {
                objComponentActivity2 = new p3(r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, 3);
                getpostalcode2.write(objComponentActivity2);
                int i21 = serializer + 63;
                read = i21 % Fields.SpotShadowColor;
                int i22 = i21 % 2;
            }
            getPhoneNumberNational.serializer(createFromParcel.INSTANCE, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode2);
            SdkClickHandler2 sdkClickHandler2 = (SdkClickHandler2) ExtrasKt.write(saveinteger.PlaybackStateCompat, getpostalcode2, 0).getValue();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{sdkClickHandler2, SdkClickResponseData.read}, getCieXyz.write())).booleanValue()) {
                getpostalcode2.serializer(-332098074);
                getpostalcode2.IconCompatParcelizer(false);
                i18 = i18;
                androidContentCaptureManager2 = androidContentCaptureManager2;
                getpostalcode = getpostalcode2;
                th = null;
                i3 = 1;
                i4 = 0;
            } else if (sdkClickHandler2 instanceof SessionResponseData) {
                getpostalcode2.serializer(-332096104);
                SessionResponseData sessionResponseData = (SessionResponseData) sdkClickHandler2;
                boolean zIconCompatParcelizer2 = getpostalcode2.IconCompatParcelizer(saveinteger);
                Object objComponentActivity3 = getpostalcode2.ComponentActivity();
                i3 = 1;
                if (!(!zIconCompatParcelizer2) || objComponentActivity3 == androidContentCaptureManager2) {
                    getpostalcode = getpostalcode2;
                    SettingsFragment.AnonymousClass1 anonymousClass1 = new SettingsFragment.AnonymousClass1(1, saveinteger, saveInteger.class, "onActionClick", "onActionClick(Lcom/roadrunner/rider/state/summary/api/nest/NestRiderStateAction;)V", 0, 27);
                    getpostalcode.write(anonymousClass1);
                    objComponentActivity3 = anonymousClass1;
                } else {
                    getpostalcode = getpostalcode2;
                }
                th = null;
                i4 = 0;
                NestRiderStateSummaryColumnKt.NestRiderStateSummaryColumn(sessionResponseData, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity3), null, getpostalcode, 0);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                throw d$$ExternalSyntheticOutline0.m(getpostalcode2, -332101802, false);
            }
            getQueryContext getquerycontext = saveinteger.MediaSessionCompatToken;
            int i23 = (i18 & 112) == 32 ? i3 : i4;
            int i24 = (i18 & 896) == 256 ? i3 : i4;
            if ((i18 & 7168) != 2048) {
                i3 = i4;
            }
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if ((i23 | i24 | i3) == 0) {
                int i25 = serializer + 57;
                read = i25 % Fields.SpotShadowColor;
                if (i25 % 2 != 0) {
                    throw th;
                }
                androidContentCaptureManager = androidContentCaptureManager2;
                if (objComponentActivity4 == androidContentCaptureManager) {
                }
                SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity4, getpostalcode, 8);
                WindowInsetsCompatImpl28 windowInsetsCompatImpl28 = saveinteger.RemoteActionCompatParcelizer;
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(saveinteger);
                objComponentActivity = getpostalcode.ComponentActivity();
                if (!zIconCompatParcelizer) {
                    i5 = serializer + 67;
                    read = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        int i26 = 43 / i4;
                        if (objComponentActivity == androidContentCaptureManager) {
                            SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$1 = new SettingsScreenKt$SettingsScreen$2$1(0, saveinteger, saveInteger.class, "onConfirmStopWorkingClick", "onConfirmStopWorkingClick()V", 0, 10);
                            getpostalcode.write(settingsScreenKt$SettingsScreen$2$1);
                            objComponentActivity = settingsScreenKt$SettingsScreen$2$1;
                        }
                    } else if (objComponentActivity == androidContentCaptureManager) {
                        SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$2 = new SettingsScreenKt$SettingsScreen$2$1(0, saveinteger, saveInteger.class, "onConfirmStopWorkingClick", "onConfirmStopWorkingClick()V", 0, 10);
                        getpostalcode.write(settingsScreenKt$SettingsScreen$2$2);
                        objComponentActivity = settingsScreenKt$SettingsScreen$2$2;
                    }
                } else {
                    SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$3 = new SettingsScreenKt$SettingsScreen$2$1(0, saveinteger, saveInteger.class, "onConfirmStopWorkingClick", "onConfirmStopWorkingClick()V", 0, 10);
                    getpostalcode.write(settingsScreenKt$SettingsScreen$2$3);
                    objComponentActivity = settingsScreenKt$SettingsScreen$2$3;
                }
                WindowInsetsCompatImpl21.IconCompatParcelizer.invoke(windowInsetsCompatImpl28, (registerInAppMessageManagerlambda0) objComponentActivity, getpostalcode, Integer.valueOf(i4));
            } else {
                androidContentCaptureManager = androidContentCaptureManager2;
            }
            objComponentActivity4 = new SharedPreferencesManager(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry);
            getpostalcode.write(objComponentActivity4);
            int i27 = serializer + 87;
            read = i27 % Fields.SpotShadowColor;
            int i28 = i27 % 2;
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity4, getpostalcode, 8);
            WindowInsetsCompatImpl28 windowInsetsCompatImpl29 = saveinteger.RemoteActionCompatParcelizer;
            zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(saveinteger);
            objComponentActivity = getpostalcode.ComponentActivity();
            if (!zIconCompatParcelizer) {
                i5 = serializer + 67;
                read = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i29 = 43 / i4;
                    if (objComponentActivity == androidContentCaptureManager) {
                        SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$4 = new SettingsScreenKt$SettingsScreen$2$1(0, saveinteger, saveInteger.class, "onConfirmStopWorkingClick", "onConfirmStopWorkingClick()V", 0, 10);
                        getpostalcode.write(settingsScreenKt$SettingsScreen$2$4);
                        objComponentActivity = settingsScreenKt$SettingsScreen$2$4;
                    }
                } else if (objComponentActivity == androidContentCaptureManager) {
                    SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$5 = new SettingsScreenKt$SettingsScreen$2$1(0, saveinteger, saveInteger.class, "onConfirmStopWorkingClick", "onConfirmStopWorkingClick()V", 0, 10);
                    getpostalcode.write(settingsScreenKt$SettingsScreen$2$5);
                    objComponentActivity = settingsScreenKt$SettingsScreen$2$5;
                }
            } else {
                SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$6 = new SettingsScreenKt$SettingsScreen$2$1(0, saveinteger, saveInteger.class, "onConfirmStopWorkingClick", "onConfirmStopWorkingClick()V", 0, 10);
                getpostalcode.write(settingsScreenKt$SettingsScreen$2$6);
                objComponentActivity = settingsScreenKt$SettingsScreen$2$6;
            }
            WindowInsetsCompatImpl21.IconCompatParcelizer.invoke(windowInsetsCompatImpl29, (registerInAppMessageManagerlambda0) objComponentActivity, getpostalcode, Integer.valueOf(i4));
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new UiMediaScopeImpl(saveinteger, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, g0Var, i, 18);
        }
    }
}
