package com.roadrunner.delivery.stacked.delivery.list.compose.v1;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.compose.Measurer2;
import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.layouts.DividerKt;
import io.sentry.SentryUUID;
import java.util.ArrayList;
import o.ActivityPackageSender1;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DrawBackgroundModifier;
import o.DrawBehindElement;
import o.IActivityPackageSender;
import o.IActivityPackageSenderResponseDataCallbackSubscriber;
import o.IndirectPointerInputDragCycleDetectorKt;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PopulateViewStructure_androidKtpopulate7;
import o.buildMapping;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.getTransactionContextroom_runtime;
import o.p7;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.unaryMinus9UxMQ8M;

/* JADX INFO: loaded from: classes3.dex */
public abstract class StackedDeliveryListV1Kt {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:61:0x014c  */
    public static final void StackedDeliveryListV1(unaryMinus9UxMQ8M unaryminus9uxmq8m, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier modifier2;
        boolean z2;
        int i3;
        boolean zIconCompatParcelizer;
        int i4 = 2;
        int i5 = 2 % 2;
        ArrayList arrayList = unaryminus9uxmq8m.serializer;
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(805148443);
        if ((i & 6) == 0) {
            if ((i & 8) != 0) {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(unaryminus9uxmq8m);
            } else {
                int i6 = IconCompatParcelizer + 111;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                zIconCompatParcelizer = getpostalcode.read(unaryminus9uxmq8m);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i8 = IconCompatParcelizer + 97;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                i3 = i8 % 2 == 0 ? 83 : 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i9 = i2 | 3072;
        if ((i9 & 1171) != 1170) {
            int i10 = IconCompatParcelizer + 105;
            RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (getpostalcode.write(i9 & 1, z)) {
            int i11 = IconCompatParcelizer + 97;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierWrite = SizeKt.write(companion, 1.0f);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getCenterHorizontally(), getpostalcode, 48);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    int i13 = RemoteActionCompatParcelizer + 9;
                    IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                    if (i13 % 2 == 0) {
                        getpostalcode.serializer(constructor);
                        int i14 = IconCompatParcelizer + 91;
                        RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                        int i15 = i14 % 2;
                    } else {
                        getpostalcode.serializer(constructor);
                        throw null;
                    }
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                boolean z3 = false;
                DividerKt.RemoteActionCompatParcelizer(Dimensions.onSaveInstanceState, 0, 2, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).addOnContextAvailableListener(), getpostalcode, null);
                int size = arrayList.size();
                getpostalcode.serializer(-1289541630);
                int i16 = 0;
                for (Object obj : arrayList) {
                    if (i16 < 0) {
                        SQLite.serializer();
                        throw null;
                    }
                    int i17 = IconCompatParcelizer + 3;
                    int i18 = i17 % Fields.SpotShadowColor;
                    RemoteActionCompatParcelizer = i18;
                    int i19 = i17 % i4;
                    r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ r8lambdayigkjx4opgvyddqvttr8slptylq = (r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ) obj;
                    if (i16 < size - 1) {
                        int i20 = i18 + 73;
                        IconCompatParcelizer = i20 % Fields.SpotShadowColor;
                        if (i20 % i4 != 0) {
                            z2 = z3;
                        } else {
                            z2 = true;
                        }
                    } else {
                        z2 = z3;
                    }
                    int i21 = i9 << 6;
                    write(r8lambdayigkjx4opgvyddqvttr8slptylq, i16, z2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, null, getpostalcode, (57344 & i21) | (i21 & 7168) | 8);
                    i16++;
                    z3 = z3;
                    i4 = 2;
                }
                getpostalcode.IconCompatParcelizer(z3);
                getpostalcode.IconCompatParcelizer(true);
                modifier2 = companion;
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p7((Object) unaryminus9uxmq8m, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm, (Object) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, modifier2, i, 4);
        }
    }

    public static final void write(r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ r8lambdayigkjx4opgvyddqvttr8slptylq, int i, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Modifier modifier, getBirthDateFull getbirthdatefull, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        boolean zIconCompatParcelizer;
        int i6 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1467846809);
        if ((i2 & 6) == 0) {
            if ((i2 & 8) == 0) {
                int i7 = IconCompatParcelizer + 95;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    zIconCompatParcelizer = getpostalcode.read(r8lambdayigkjx4opgvyddqvttr8slptylq);
                    int i8 = 33 / 0;
                } else {
                    zIconCompatParcelizer = getpostalcode.read(r8lambdayigkjx4opgvyddqvttr8slptylq);
                }
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(r8lambdayigkjx4opgvyddqvttr8slptylq);
            }
            i3 = (zIconCompatParcelizer ^ true ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (getpostalcode.read(i)) {
                int i9 = RemoteActionCompatParcelizer + 47;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                i5 = i9 % 2 != 0 ? 61 : 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 384) == 0) {
            i3 |= getpostalcode.write(z) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i2 & 3072) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i10 = RemoteActionCompatParcelizer + 89;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                i4 = i10 % 2 != 0 ? 5427 : Fields.CameraDistance;
            } else {
                i4 = Fields.RotationZ;
            }
            i3 |= i4;
        }
        if ((i2 & 24576) == 0) {
            int i11 = IconCompatParcelizer + 121;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
                throw null;
            }
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? Fields.Clip : 8192;
        }
        int i12 = i3 | 196608;
        if (!getpostalcode.write(i12 & 1, (74899 & i12) != 74898)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        } else {
            int i13 = RemoteActionCompatParcelizer + 97;
            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierWrite = PaddingKt.write(SizeKt.write(companion, 1.0f), Dimensions.setActionBarVisibilityCallback);
            long j = r8lambdayigkjx4opgvyddqvttr8slptylq.write;
            modifierWrite.getClass();
            getpostalcode.serializer(-1003410150);
            getpostalcode.serializer(212064437);
            getpostalcode.IconCompatParcelizer(false);
            Density density = (Density) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalDensity());
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new Measurer2(density);
                getpostalcode.write(objComponentActivity);
            }
            Measurer2 measurer2 = (Measurer2) objComponentActivity;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new DrawBehindElement();
                getpostalcode.write(objComponentActivity2);
            }
            DrawBehindElement drawBehindElement = (DrawBehindElement) objComponentActivity2;
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (objComponentActivity3 == androidContentCaptureManager) {
                int i15 = IconCompatParcelizer + 121;
                RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                objComponentActivity3 = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
                getpostalcode.write(objComponentActivity3);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity3;
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if (objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = new DrawBackgroundModifier(drawBehindElement);
                getpostalcode.write(objComponentActivity4);
            }
            DrawBackgroundModifier drawBackgroundModifier = (DrawBackgroundModifier) objComponentActivity4;
            Object objComponentActivity5 = getpostalcode.ComponentActivity();
            if (objComponentActivity5 == androidContentCaptureManager) {
                int i17 = IconCompatParcelizer + 49;
                RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Serializer = CompositionKt.serializer(createFromParcel.INSTANCE, AndroidContentCaptureManager.RemoteActionCompatParcelizer);
                getpostalcode.write(populateViewStructure_androidKtpopulate7Serializer);
                int i19 = RemoteActionCompatParcelizer + 29;
                IconCompatParcelizer = i19 % Fields.SpotShadowColor;
                if (i19 % 2 != 0) {
                    int i20 = 4 % 4;
                }
                objComponentActivity5 = populateViewStructure_androidKtpopulate7Serializer;
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity5;
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(measurer2);
            boolean z2 = getpostalcode.read(257);
            Object objComponentActivity6 = getpostalcode.ComponentActivity();
            if ((zIconCompatParcelizer2 | z2) || objComponentActivity6 == androidContentCaptureManager) {
                objComponentActivity6 = new ActivityPackageSender1(populateViewStructure_androidKtpopulate8, measurer2, drawBackgroundModifier, populateViewStructure_androidKtpopulate7, 7);
                getpostalcode.write(objComponentActivity6);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objComponentActivity6;
            Object objComponentActivity7 = getpostalcode.ComponentActivity();
            if (objComponentActivity7 == androidContentCaptureManager) {
                objComponentActivity7 = new IActivityPackageSender(populateViewStructure_androidKtpopulate7, drawBackgroundModifier, 7);
                getpostalcode.write(objComponentActivity7);
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity7;
            boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(measurer2);
            Object objComponentActivity8 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer3 || objComponentActivity8 == androidContentCaptureManager) {
                objComponentActivity8 = new IActivityPackageSenderResponseDataCallbackSubscriber(measurer2, 7);
                getpostalcode.write(objComponentActivity8);
            }
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierWrite, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity8, 1, null), ExtrasKt.write(1200550679, new IndirectPointerInputDragCycleDetectorKt(populateViewStructure_androidKtpopulate8, drawBehindElement, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdayigkjx4opgvyddqvttr8slptylq, i, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0), getpostalcode), measurePolicy, getpostalcode, 48, 0);
            getpostalcode.IconCompatParcelizer(false);
            if (z) {
                getpostalcode.serializer(1564177986);
                DividerKt.read(0.0f, 0, 7, 0L, getpostalcode, null);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(1564215465);
                getpostalcode.IconCompatParcelizer(false);
            }
            modifier2 = companion;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getTransactionContextroom_runtime(r8lambdayigkjx4opgvyddqvttr8slptylq, i, z, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, modifier2, i2, 1);
        }
    }
}
