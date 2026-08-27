package com.roadrunner.settings.ui.screens;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.room.RoomDatabase$createConnectionManager$2;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.home.HomeViewModel;
import com.roadrunner.rrds.compose.component.layouts.DividerKt;
import com.roadrunner.rrds.compose.component.navigations.HeaderKt;
import com.roadrunner.settings.SettingsViewModel;
import com.roadrunner.settings.ui.components.AppVersionKt;
import com.roadrunner.settings.ui.components.PromotionsSectionKt;
import com.roadrunner.settings.ui.components.SettingsCardKt;
import com.roadrunner.settings.ui.components.SignOutKt;
import io.sentry.SentryUUID;
import java.util.List;
import kotlinx.coroutines.JobKt__JobKt$invokeOnCompletion$1;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.IconCompatParcelizer;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PagerWrapperFlingBehavior;
import o.PopulateViewStructure_androidKtpopulate7;
import o.b9;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPendingWebViewPauseRunnableandroid_sdk_ui_release;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.p7;
import o.r8lambda5HzxMAF3xnzH0FAwlqisItZ7Ao;
import o.r8lambdaCwU8OzatE7jOuIaQjprNUSKXVA;
import o.r8lambdaFEnLU5alJx2ClfZRg4tE2QEPKfs;
import o.r8lambdaPRvOFhkr4HQfrCyNgchMMKQLk5s;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaRTIvhvu27JBv_zhnPEAt2ZGU;
import o.r8lambdaRdO_uN7XDjHQOVIqToN9xCXIqPA;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaZENoheqeAwue299tqO82jBghavc;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdaby9RGqpZEQ9dvO9shdh2_1OJRpw;
import o.r8lambdac3_QgjKoapzhLz2ctKYrWoiFlvY;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.recordGeofenceTransitionlambda1;
import o.registerInAppMessageManagerlambda0;
import o.removeNodeAtDepth;
import o.trigger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SettingsScreenKt {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    /* JADX WARN: Code duplicated, block: B:36:0x008a  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c9  */
    public static final void SettingsScreen(SettingsViewModel settingsViewModel, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRTIvhvu27JBv_zhnPEAt2ZGU r8lambdartivhvu27jbv_zhnpeat2zgu, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        int i3;
        int i4 = 2 % 2;
        settingsViewModel.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdartivhvu27jbv_zhnpeat2zgu.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-174329477);
        if ((i & 6) == 0) {
            i2 = (!(getpostalcode2.IconCompatParcelizer(settingsViewModel) ^ true) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdartivhvu27jbv_zhnpeat2zgu) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            int i5 = IconCompatParcelizer + 107;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (getpostalcode2.read(modifier)) {
                int i7 = RemoteActionCompatParcelizer + 119;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i3 = Fields.CameraDistance;
            } else {
                i3 = Fields.RotationZ;
            }
            i2 |= i3;
        }
        int i9 = i2;
        if ((i9 & 1171) != 1170) {
            int i10 = RemoteActionCompatParcelizer + 93;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            z = i10 % 2 == 0;
        }
        if (getpostalcode2.write(i9 & 1, z)) {
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = r8lambdaPRvOFhkr4HQfrCyNgchMMKQLk5s.RemoteActionCompatParcelizer;
                getpostalcode2.write(objComponentActivity);
            }
            r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds = (r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) objComponentActivity;
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = ExtrasKt.write(settingsViewModel.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, getpostalcode2, 0);
            Configuration configuration = (Configuration) getpostalcode2.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalConfiguration());
            boolean zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(settingsViewModel);
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            if (zIconCompatParcelizer || objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new HomeViewModel.AnonymousClass1(settingsViewModel, null, 28);
                getpostalcode2.write(objComponentActivity2);
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2, configuration, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity2);
            r8lambdaFEnLU5alJx2ClfZRg4tE2QEPKfs r8lambdafenlu5aljx2clfzrg4te2qepkfs = (r8lambdaFEnLU5alJx2ClfZRg4tE2QEPKfs) populateViewStructure_androidKtpopulate7Write.getValue();
            boolean zIconCompatParcelizer2 = getpostalcode2.IconCompatParcelizer(settingsViewModel);
            Object objComponentActivity3 = getpostalcode2.ComponentActivity();
            if (zIconCompatParcelizer2 || objComponentActivity3 == androidContentCaptureManager) {
                SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$1 = new SettingsScreenKt$SettingsScreen$2$1(0, settingsViewModel, SettingsViewModel.class, "onCheckNotificationsClicked", "onCheckNotificationsClicked()V", 0, 0);
                getpostalcode2.write(settingsScreenKt$SettingsScreen$2$1);
                int i11 = RemoteActionCompatParcelizer + 53;
                IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                objComponentActivity3 = settingsScreenKt$SettingsScreen$2$1;
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity3);
            boolean zIconCompatParcelizer3 = getpostalcode2.IconCompatParcelizer(settingsViewModel);
            Object objComponentActivity4 = getpostalcode2.ComponentActivity();
            if (zIconCompatParcelizer3 || objComponentActivity4 == androidContentCaptureManager) {
                RoomDatabase$createConnectionManager$2 roomDatabase$createConnectionManager$2 = new RoomDatabase$createConnectionManager$2(2, settingsViewModel, SettingsViewModel.class, "onPreferenceChange", "onPreferenceChange(Lcom/roadrunner/settings/PreferenceItem$SwitchPreferenceItem$PreferenceKey;Z)V", 0, 29);
                getpostalcode2.write(roomDatabase$createConnectionManager$2);
                objComponentActivity4 = roomDatabase$createConnectionManager$2;
            }
            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) ((registerInAppMessageManagerlambda0) objComponentActivity4);
            boolean zIconCompatParcelizer4 = getpostalcode2.IconCompatParcelizer(settingsViewModel);
            Object objComponentActivity5 = getpostalcode2.ComponentActivity();
            if (zIconCompatParcelizer4 || objComponentActivity5 == androidContentCaptureManager) {
                JobKt__JobKt$invokeOnCompletion$1 jobKt__JobKt$invokeOnCompletion$1 = new JobKt__JobKt$invokeOnCompletion$1(1, settingsViewModel, SettingsViewModel.class, "onListPreferenceItemSelected", "onListPreferenceItemSelected(Lcom/roadrunner/settings/PreferenceItem$ListPreferenceItem$PreferenceKey;)V", 0, 7);
                getpostalcode2.write(jobKt__JobKt$invokeOnCompletion$1);
                objComponentActivity5 = jobKt__JobKt$invokeOnCompletion$1;
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity5);
            boolean zIconCompatParcelizer5 = getpostalcode2.IconCompatParcelizer(settingsViewModel);
            Object objComponentActivity6 = getpostalcode2.ComponentActivity();
            if (zIconCompatParcelizer5 || objComponentActivity6 == r7) {
                JobKt__JobKt$invokeOnCompletion$1 jobKt__JobKt$invokeOnCompletion$2 = new JobKt__JobKt$invokeOnCompletion$1(1, settingsViewModel, SettingsViewModel.class, "onDeepLinkClicked", "onDeepLinkClicked(Ljava/lang/String;)V", 0, 8);
                getpostalcode2.write(jobKt__JobKt$invokeOnCompletion$2);
                objComponentActivity6 = jobKt__JobKt$invokeOnCompletion$2;
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity6);
            boolean zIconCompatParcelizer6 = getpostalcode2.IconCompatParcelizer(settingsViewModel);
            Object objComponentActivity7 = getpostalcode2.ComponentActivity();
            if (zIconCompatParcelizer6) {
                JobKt__JobKt$invokeOnCompletion$1 jobKt__JobKt$invokeOnCompletion$3 = new JobKt__JobKt$invokeOnCompletion$1(1, settingsViewModel, SettingsViewModel.class, "onAppItemSelected", "onAppItemSelected(Lcom/roadrunner/settings/PreferenceItem$ExternalItem$AppLinkItem$AppLinkItemKey;)V", 0, 9);
                getpostalcode2.write(jobKt__JobKt$invokeOnCompletion$3);
                objComponentActivity7 = jobKt__JobKt$invokeOnCompletion$3;
            } else {
                int i13 = RemoteActionCompatParcelizer + 77;
                IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                if (i13 % 2 != 0) {
                    int i14 = 57 / 0;
                    if (objComponentActivity7 == r7) {
                        JobKt__JobKt$invokeOnCompletion$1 jobKt__JobKt$invokeOnCompletion$4 = new JobKt__JobKt$invokeOnCompletion$1(1, settingsViewModel, SettingsViewModel.class, "onAppItemSelected", "onAppItemSelected(Lcom/roadrunner/settings/PreferenceItem$ExternalItem$AppLinkItem$AppLinkItemKey;)V", 0, 9);
                        getpostalcode2.write(jobKt__JobKt$invokeOnCompletion$4);
                        objComponentActivity7 = jobKt__JobKt$invokeOnCompletion$4;
                    }
                } else if (objComponentActivity7 == r7) {
                    JobKt__JobKt$invokeOnCompletion$1 jobKt__JobKt$invokeOnCompletion$5 = new JobKt__JobKt$invokeOnCompletion$1(1, settingsViewModel, SettingsViewModel.class, "onAppItemSelected", "onAppItemSelected(Lcom/roadrunner/settings/PreferenceItem$ExternalItem$AppLinkItem$AppLinkItemKey;)V", 0, 9);
                    getpostalcode2.write(jobKt__JobKt$invokeOnCompletion$5);
                    objComponentActivity7 = jobKt__JobKt$invokeOnCompletion$5;
                }
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity7);
            boolean zIconCompatParcelizer7 = getpostalcode2.IconCompatParcelizer(settingsViewModel);
            Object objComponentActivity8 = getpostalcode2.ComponentActivity();
            if (zIconCompatParcelizer7 || objComponentActivity8 == r7) {
                recordGeofenceTransitionlambda1 recordgeofencetransitionlambda1 = new recordGeofenceTransitionlambda1(2, settingsViewModel, SettingsViewModel.class, "onPromotionPreferenceClicked", "onPromotionPreferenceClicked(Ljava/lang/String;Z)V", 0, 1);
                getpostalcode2.write(recordgeofencetransitionlambda1);
                int i15 = RemoteActionCompatParcelizer + 45;
                IconCompatParcelizer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                objComponentActivity8 = recordgeofencetransitionlambda1;
            }
            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) ((registerInAppMessageManagerlambda0) objComponentActivity8);
            boolean zIconCompatParcelizer8 = getpostalcode2.IconCompatParcelizer(settingsViewModel);
            Object objComponentActivity9 = getpostalcode2.ComponentActivity();
            if (zIconCompatParcelizer8 || objComponentActivity9 == r7) {
                SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$2 = new SettingsScreenKt$SettingsScreen$2$1(0, settingsViewModel, SettingsViewModel.class, "onSignOutClicked", "onSignOutClicked()V", 0, 21);
                getpostalcode2.write(settingsScreenKt$SettingsScreen$2$2);
                objComponentActivity9 = settingsScreenKt$SettingsScreen$2$2;
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity9);
            boolean zIconCompatParcelizer9 = getpostalcode2.IconCompatParcelizer(settingsViewModel);
            Object objComponentActivity10 = getpostalcode2.ComponentActivity();
            if (zIconCompatParcelizer9 || objComponentActivity10 == r7) {
                SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$3 = new SettingsScreenKt$SettingsScreen$2$1(0, settingsViewModel, SettingsViewModel.class, "onUpdateClicked", "onUpdateClicked()V", 0, 22);
                getpostalcode2.write(settingsScreenKt$SettingsScreen$2$3);
                objComponentActivity10 = settingsScreenKt$SettingsScreen$2$3;
            }
            getpostalcode = getpostalcode2;
            SettingsScreen(r8lambdafenlu5aljx2clfzrg4te2qepkfs, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity10), r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, getpostalcode, (i9 << 24) & 1879048192, (i9 >> 9) & 14);
            r8lambdaRdO_uN7XDjHQOVIqToN9xCXIqPA r8lambdardo_un7xdjhqoviqton9xcxiqpa = settingsViewModel.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
            boolean zIconCompatParcelizer10 = getpostalcode.IconCompatParcelizer(settingsViewModel);
            Object objComponentActivity11 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer10 || objComponentActivity11 == r7) {
                JobKt__JobKt$invokeOnCompletion$1 jobKt__JobKt$invokeOnCompletion$6 = new JobKt__JobKt$invokeOnCompletion$1(1, settingsViewModel, SettingsViewModel.class, "turnOffPromotionPreference", "turnOffPromotionPreference(Ljava/lang/String;)V", 0, 6);
                getpostalcode.write(jobKt__JobKt$invokeOnCompletion$6);
                objComponentActivity11 = jobKt__JobKt$invokeOnCompletion$6;
            }
            r8lambdafbccdpyn0hhvaib8bd2sxm5rsds.invoke(r8lambdardo_un7xdjhqoviqton9xcxiqpa, (registerInAppMessageManagerlambda0) objComponentActivity11, getpostalcode, 384);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p7((Object) settingsViewModel, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (Object) r8lambdartivhvu27jbv_zhnpeat2zgu, modifier, i, 25);
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ee  */
    public static final void SettingsScreen(r8lambdaFEnLU5alJx2ClfZRg4tE2QEPKfs r8lambdafenlu5aljx2clfzrg4te2qepkfs, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3, Modifier modifier, getBirthDateFull getbirthdatefull, int i, int i2) {
        int i3;
        int i4;
        getPostalCode getpostalcode;
        char c;
        int i5;
        int i6;
        int i7 = 2 % 2;
        r8lambdafenlu5aljx2clfzrg4te2qepkfs.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm3.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde1.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k2.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k3.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(425299291);
        if ((i & 6) == 0) {
            i3 = (getpostalcode2.IconCompatParcelizer(r8lambdafenlu5aljx2clfzrg4te2qepkfs) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            int i8 = IconCompatParcelizer + 119;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm3) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde1) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            int i10 = RemoteActionCompatParcelizer + 109;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                int i11 = 32 / 0;
                if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                    i6 = 8388608;
                } else {
                    i6 = 4194304;
                }
            } else if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                i6 = 8388608;
            } else {
                i6 = 4194304;
            }
            i3 |= i6;
        }
        if ((100663296 & i) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k3) ? 536870912 : 268435456;
        }
        int i12 = i3;
        if ((i2 & 6) == 0) {
            if (getpostalcode2.read(modifier)) {
                int i13 = RemoteActionCompatParcelizer + 97;
                IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                if (i13 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                i5 = 4;
            } else {
                i5 = 2;
            }
            i4 = i2 | i5;
        } else {
            i4 = i2;
        }
        if (getpostalcode2.write(i12 & 1, ((i12 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            Modifier modifierThen = modifier.then(SizeKt.read);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierThen);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                int i14 = IconCompatParcelizer + 69;
                RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                c = 2;
                if (i14 % 2 == 0) {
                    getpostalcode2.serializer(constructor);
                    throw null;
                }
                getpostalcode2.serializer(constructor);
            } else {
                c = 2;
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            HeaderKt.serializer(null, StringResources_androidKt.stringResource(R.string.all_settings, getpostalcode2, 0), 0L, ExtrasKt.write(1594703549, new trigger(20, r8lambdardpfsr94j4iebcwx_kpqzpm8k3), getpostalcode2), null, null, null, getpostalcode2, 24576, 237);
            Content(r8lambdafenlu5aljx2clfzrg4te2qepkfs, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, null, getpostalcode2, i12 & 268435454);
            getpostalcode = getpostalcode2;
            getpostalcode.IconCompatParcelizer(true);
            int i15 = RemoteActionCompatParcelizer + 19;
            IconCompatParcelizer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdac3_QgjKoapzhLz2ctKYrWoiFlvY(r8lambdafenlu5aljx2clfzrg4te2qepkfs, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, modifier, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x028c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x008c  */
    public static final void Content(r8lambdaFEnLU5alJx2ClfZRg4tE2QEPKfs r8lambdafenlu5aljx2clfzrg4te2qepkfs, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        Modifier modifier2;
        boolean z;
        Modifier modifier3;
        boolean z2;
        Modifier.Companion companion;
        int i3;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(771097277);
        if ((i & 6) == 0) {
            int i6 = RemoteActionCompatParcelizer + 45;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i2 = (getpostalcode2.IconCompatParcelizer(r8lambdafenlu5aljx2clfzrg4te2qepkfs) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= !getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            int i8 = RemoteActionCompatParcelizer + 55;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                int i9 = 12 / 0;
                if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2)) {
                    i4 = Fields.Clip;
                } else {
                    i4 = 8192;
                }
            } else if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2)) {
                i4 = Fields.Clip;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm3)) {
                int i10 = IconCompatParcelizer + 81;
                RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i3 = Fields.RenderEffect;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        if ((1572864 & i) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde1) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            int i12 = RemoteActionCompatParcelizer + 75;
            IconCompatParcelizer = i12 % Fields.SpotShadowColor;
            if (i12 % 2 != 0) {
                getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                throw null;
            }
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ? 67108864 : 33554432;
            int i13 = IconCompatParcelizer + 5;
            RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
        }
        int i15 = i2 | 805306368;
        if (getpostalcode2.write(i15 & 1, (306783379 & i15) != 306783378)) {
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier modifierIconCompatParcelizer = PagerWrapperFlingBehavior.IconCompatParcelizer(companion2, PagerWrapperFlingBehavior.read(0, getpostalcode2, 1), false, 14);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierIconCompatParcelizer);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                int i16 = RemoteActionCompatParcelizer + 19;
                IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            getpostalcode2.serializer(-55325519);
            r8lambdaCwU8OzatE7jOuIaQjprNUSKXVA r8lambdacwu8ozate7jouiaqjprnuskxva = r8lambdafenlu5aljx2clfzrg4te2qepkfs.serializer;
            float f = Dimensions.getAnimatedVisibility;
            Object[] objArr = {getpostalcode2, SizeKt.m75height3ABfNKs(companion2, f)};
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr);
            String str = r8lambdacwu8ozate7jouiaqjprnuskxva.write;
            String str2 = r8lambdacwu8ozate7jouiaqjprnuskxva.RemoteActionCompatParcelizer;
            String str3 = r8lambdacwu8ozate7jouiaqjprnuskxva.read;
            float f2 = Dimensions.setTabContainer;
            SettingsCardKt.SettingsCard(R.drawable.img_large_brand_background_activity, (i15 << 9) & 57344, getpostalcode2, PaddingKt.m74paddingqDBjuR0$default(companion2, f2, 0.0f, f2, 0.0f, 10), str, str2, str3, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
            float f3 = Dimensions.setVisibility;
            IconCompatParcelizer.IconCompatParcelizer(companion2, f3, getpostalcode2, false);
            int i18 = i15 >> 3;
            getpostalcode = getpostalcode2;
            r8lambdaby9RGqpZEQ9dvO9shdh2_1OJRpw.read(StringResources_androidKt.stringResource(R.string.user_preference, getpostalcode2, 0), removeNodeAtDepth.read(r8lambdafenlu5aljx2clfzrg4te2qepkfs.MediaDescriptionCompat), r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, null, getpostalcode2, (i15 & 8064) | (i18 & 57344) | ((i15 << 3) & 458752));
            List list = r8lambdafenlu5aljx2clfzrg4te2qepkfs.read;
            if (list == null) {
                getpostalcode.serializer(-1714019418);
                z = false;
                getpostalcode.IconCompatParcelizer(false);
                modifier3 = null;
            } else {
                z = false;
                getpostalcode.serializer(-1714019417);
                modifier3 = null;
                PromotionsSectionKt.write(removeNodeAtDepth.read(list), r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, null, getpostalcode, (i15 >> 15) & 112);
                getpostalcode.IconCompatParcelizer(false);
            }
            r8lambda5HzxMAF3xnzH0FAwlqisItZ7Ao r8lambda5hzxmaf3xnzh0fawlqisitz7ao = r8lambdafenlu5aljx2clfzrg4te2qepkfs.IconCompatParcelizer;
            if (r8lambda5hzxmaf3xnzh0fawlqisitz7ao == null) {
                getpostalcode.serializer(-1713763079);
                getpostalcode.IconCompatParcelizer(z);
                int i19 = IconCompatParcelizer + 49;
                RemoteActionCompatParcelizer = i19 % Fields.SpotShadowColor;
                int i20 = i19 % 2;
                companion = companion2;
            } else {
                getpostalcode.serializer(-1713763078);
                Object[] objArr2 = {getpostalcode, SizeKt.m75height3ABfNKs(companion2, f)};
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr2);
                r8lambdaCwU8OzatE7jOuIaQjprNUSKXVA r8lambdacwu8ozate7jouiaqjprnuskxva2 = r8lambda5hzxmaf3xnzh0fawlqisitz7ao.write;
                String str4 = r8lambdacwu8ozate7jouiaqjprnuskxva2.write;
                String str5 = r8lambdacwu8ozate7jouiaqjprnuskxva2.RemoteActionCompatParcelizer;
                String str6 = r8lambdacwu8ozate7jouiaqjprnuskxva2.read;
                if ((i15 & 57344) == 16384) {
                    int i21 = RemoteActionCompatParcelizer + 125;
                    IconCompatParcelizer = i21 % Fields.SpotShadowColor;
                    if (i21 % 2 != 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                } else {
                    z2 = false;
                }
                boolean z3 = getpostalcode.read(r8lambda5hzxmaf3xnzh0fawlqisitz7ao);
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if ((z2 | z3) || objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new getPendingWebViewPauseRunnableandroid_sdk_ui_release(r8lambdaunavo3sxub_pc9xroryotnrlvsm2, 20, r8lambda5hzxmaf3xnzh0fawlqisitz7ao);
                    getpostalcode.write(objComponentActivity);
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity;
                Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(companion2, f2, 0.0f, f2, 0.0f, 10);
                companion = companion2;
                SettingsCardKt.SettingsCard(R.drawable.img_large_brand_success, 0, getpostalcode, modifierM74paddingqDBjuR0$default, str4, str5, str6, r8lambdardpfsr94j4iebcwx_kpqzpm8k3);
                IconCompatParcelizer.IconCompatParcelizer(companion, f3, getpostalcode, false);
            }
            r8lambdaZENoheqeAwue299tqO82jBghavc.RemoteActionCompatParcelizer(removeNodeAtDepth.read(r8lambdafenlu5aljx2clfzrg4te2qepkfs.RemoteActionCompatParcelizer), r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, null, getpostalcode, (i18 & 1008) | ((i15 >> 6) & 7168) | (i15 & 57344));
            Object[] objArr3 = {getpostalcode, SizeKt.m75height3ABfNKs(companion, f)};
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr3);
            DividerKt.RemoteActionCompatParcelizer(Dimensions.onMultiWindowModeChanged, 0, 6, 0L, getpostalcode, null);
            int i22 = i15 >> 21;
            SignOutKt.SignOut(i22 & 14, getpostalcode, modifier3, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
            AppVersionKt.AppVersion(r8lambdafenlu5aljx2clfzrg4te2qepkfs.write, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, modifier3, getpostalcode, i22 & 112);
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new b9(r8lambdafenlu5aljx2clfzrg4te2qepkfs, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, modifier2, i);
        }
    }
}
