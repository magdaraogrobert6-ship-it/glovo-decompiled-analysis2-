package com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.compose;

import android.view.View;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$3$1$1;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.compose.ImageDetailsKt;
import com.roadrunner.delivery.ontheway.deliverynotes.presentation.DeliveryNotesUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.codescanner.BarcodeAnalyzer$$ExternalSyntheticLambda0;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.indicators.ChipsKt;
import io.sentry.SentryUUID;
import kotlinx.coroutines.BuildersKt;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.InputMethodManager;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.SingleThreadCachedScheduler1;
import o.TextFieldDefaults;
import o.buildMapping;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getContentViewGroupParentLayout;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getImm;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.mainAxisk4lQ0M;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCurrentSemanticsNodesui;
import o.setEditorBoundsInfo;
import o.show;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ImageDetailsKt {
    private static int read = 0;
    private static int serializer = 1;

    /* JADX WARN: Code duplicated, block: B:102:0x0190  */
    /* JADX WARN: Code duplicated, block: B:103:0x019d  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:111:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:114:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    /* JADX WARN: Code duplicated, block: B:12:0x0038  */
    /* JADX WARN: Code duplicated, block: B:14:0x003e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    /* JADX WARN: Code duplicated, block: B:17:0x0044 A[PHI: r1
  0x0044: PHI (r1v43 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v45 o.getPostalCode) binds: [B:8:0x002d, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00de  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:74:0x011a  */
    /* JADX WARN: Code duplicated, block: B:78:0x0124  */
    /* JADX WARN: Code duplicated, block: B:82:0x0147  */
    /* JADX WARN: Code duplicated, block: B:85:0x015c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0169  */
    /* JADX WARN: Code duplicated, block: B:89:0x016b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0179  */
    /* JADX WARN: Code duplicated, block: B:99:0x0186  */
    /* JADX WARN: Code duplicated, block: B:9:0x002f A[PHI: r1
  0x002f: PHI (r1v6 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v45 o.getPostalCode) binds: [B:8:0x002d, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void read(final getImm getimm, int i, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, boolean z, getBirthDateFull getbirthdatefull, int i2, int i3) {
        getPostalCode getpostalcode;
        boolean zIconCompatParcelizer;
        int i4;
        int i5;
        getPostalCode getpostalcode2;
        boolean z2;
        int i6;
        int i7;
        boolean z3;
        getPostalCode getpostalcode3;
        boolean z4;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        boolean z5;
        Object objComponentActivity;
        AndroidContentCaptureManager androidContentCaptureManager;
        final Animatable animatable;
        Object objComponentActivity2;
        final getContentViewGroupParentLayout getcontentviewgroupparentlayout;
        final View view;
        int i8;
        boolean z6;
        Object objComponentActivity3;
        boolean zIconCompatParcelizer2;
        Object objComponentActivity4;
        int i9;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean zIconCompatParcelizer3;
        boolean zIconCompatParcelizer4;
        boolean zIconCompatParcelizer5;
        Object objComponentActivity5;
        int i10;
        int i11 = 2 % 2;
        int i12 = serializer + 33;
        read = i12 % Fields.SpotShadowColor;
        if (i12 % 2 != 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(681172423);
            if ((i2 & 76) == 0) {
                if ((i2 & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(getimm);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getimm);
                }
                if (zIconCompatParcelizer) {
                    i4 = 4;
                } else {
                    i4 = 2;
                }
                i5 = i4 | i2;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i5 = i2;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(681172423);
            if ((i2 & 6) == 0) {
                if ((i2 & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(getimm);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getimm);
                }
                if (zIconCompatParcelizer) {
                    i4 = 4;
                } else {
                    i4 = 2;
                }
                i5 = i4 | i2;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i5 = i2;
            }
        }
        if ((i2 & 48) == 0) {
            i5 |= getpostalcode2.read(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            int i13 = read + 65;
            serializer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            i5 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i2 & 3072) == 0) {
            i5 |= getpostalcode2.read(modifier) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i15 = i3 & 16;
        if (i15 == 0) {
            if ((i2 & 24576) == 0) {
                z2 = z;
                if (getpostalcode2.write(z2)) {
                    int i16 = read + 93;
                    serializer = i16 % Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    i6 = Fields.Clip;
                } else {
                    i6 = 8192;
                }
                i5 |= i6;
            }
            i7 = i5;
            if ((i7 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (getpostalcode2.write(i7 & 1, z3)) {
                if (i15 != 0) {
                    int i18 = serializer + 55;
                    read = i18 % Fields.SpotShadowColor;
                    int i19 = i18 % 2;
                    z5 = false;
                } else {
                    z5 = z2;
                }
                objComponentActivity = getpostalcode2.ComponentActivity();
                androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = mainAxisk4lQ0M.write(1.0f);
                    getpostalcode2.write(objComponentActivity);
                }
                animatable = (Animatable) objComponentActivity;
                objComponentActivity2 = getpostalcode2.ComponentActivity();
                if (objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2);
                    getpostalcode2.write(objComponentActivity2);
                }
                getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) objComponentActivity2;
                view = (View) getpostalcode2.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalView());
                String str = getimm.IconCompatParcelizer;
                boolean z10 = getimm.RemoteActionCompatParcelizer;
                i8 = i7 & 14;
                if (i8 != 4 || ((i7 & 8) != 0 && getpostalcode2.IconCompatParcelizer(getimm))) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objComponentActivity3 = getpostalcode2.ComponentActivity();
                if (!z6 || objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = new BarcodeAnalyzer$$ExternalSyntheticLambda0(18, getimm);
                    getpostalcode2.write(objComponentActivity3);
                }
                Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifier, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, 1, null);
                zIconCompatParcelizer2 = getpostalcode2.IconCompatParcelizer(animatable);
                objComponentActivity4 = getpostalcode2.ComponentActivity();
                if (!zIconCompatParcelizer2 || objComponentActivity4 == androidContentCaptureManager) {
                    objComponentActivity4 = new setEditorBoundsInfo(animatable, 2);
                    getpostalcode2.write(objComponentActivity4);
                }
                Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierSemantics$default, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity4);
                if ((i7 & 896) == 256) {
                    i10 = read + 91;
                    serializer = i10 % Fields.SpotShadowColor;
                    i9 = 2;
                    if (i10 % 2 == 0) {
                        z7 = true;
                    }
                    int i20 = serializer + 99;
                    read = i20 % Fields.SpotShadowColor;
                    int i21 = i20 % i9;
                    if (i8 != 4 || ((i7 & 8) != 0 && getpostalcode2.IconCompatParcelizer(getimm))) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if ((i7 & 57344) == 16384) {
                        int i22 = read + 49;
                        serializer = i22 % Fields.SpotShadowColor;
                        int i23 = i22 % 2;
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    zIconCompatParcelizer3 = getpostalcode2.IconCompatParcelizer(getcontentviewgroupparentlayout);
                    zIconCompatParcelizer4 = getpostalcode2.IconCompatParcelizer(view);
                    zIconCompatParcelizer5 = getpostalcode2.IconCompatParcelizer(animatable);
                    objComponentActivity5 = getpostalcode2.ComponentActivity();
                    if (!(z7 | z8 | z9 | zIconCompatParcelizer3 | zIconCompatParcelizer4 | zIconCompatParcelizer5) || objComponentActivity5 == androidContentCaptureManager) {
                        final boolean z11 = z5;
                        objComponentActivity5 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.startInput
                            private static int MediaBrowserCompatMediaItem = 0;
                            private static int MediaDescriptionCompat = 1;

                            /* JADX WARN: Code duplicated, block: B:7:0x0032 A[DONT_INVERT] */
                            /* JADX WARN: Code duplicated, block: B:8:0x0034  */
                            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                            public final Object invoke() {
                                int i24 = 2 % 2;
                                getImm getimm2 = getimm;
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Boolean.valueOf(getimm2.RemoteActionCompatParcelizer));
                                boolean z12 = z11;
                                getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = getcontentviewgroupparentlayout;
                                androidx.compose.animation.core.Animatable animatable2 = animatable;
                                if (z12) {
                                    int i25 = MediaBrowserCompatMediaItem + 35;
                                    MediaDescriptionCompat = i25 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    int i26 = i25 % 2;
                                    if (!getimm2.RemoteActionCompatParcelizer) {
                                        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new DeliveryNotesUiModelImpl.AnonymousClass1(view, animatable2, null, 3), 3);
                                    } else if (z12) {
                                        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new ModalBottomSheetKt$ModalBottomSheet$3$1$1(animatable2, null, 3), 3);
                                    }
                                } else if (z12) {
                                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new ModalBottomSheetKt$ModalBottomSheet$3$1$1(animatable2, null, 3), 3);
                                }
                                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                int i27 = MediaBrowserCompatMediaItem + 87;
                                MediaDescriptionCompat = i27 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i28 = i27 % 2;
                                return createfromparcel;
                            }
                        };
                        getpostalcode2.write(objComponentActivity5);
                    }
                    getpostalcode3 = getpostalcode2;
                    ChipsKt.RemoteActionCompatParcelizer(str, z10, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity5, modifierGraphicsLayer, i, getpostalcode2, (i7 << 9) & 57344, 0);
                    z4 = z5;
                } else {
                    i9 = 2;
                }
                z7 = false;
                int i24 = serializer + 99;
                read = i24 % Fields.SpotShadowColor;
                int i25 = i24 % i9;
                if (i8 != 4) {
                    z8 = true;
                } else {
                    z8 = true;
                }
                if ((i7 & 57344) == 16384) {
                    int i26 = read + 49;
                    serializer = i26 % Fields.SpotShadowColor;
                    int i27 = i26 % 2;
                    z9 = true;
                } else {
                    z9 = false;
                }
                zIconCompatParcelizer3 = getpostalcode2.IconCompatParcelizer(getcontentviewgroupparentlayout);
                zIconCompatParcelizer4 = getpostalcode2.IconCompatParcelizer(view);
                zIconCompatParcelizer5 = getpostalcode2.IconCompatParcelizer(animatable);
                objComponentActivity5 = getpostalcode2.ComponentActivity();
                if (!(z7 | z8 | z9 | zIconCompatParcelizer3 | zIconCompatParcelizer4 | zIconCompatParcelizer5)) {
                    final boolean z12 = z5;
                    objComponentActivity5 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.startInput
                        private static int MediaBrowserCompatMediaItem = 0;
                        private static int MediaDescriptionCompat = 1;

                        /* JADX WARN: Code duplicated, block: B:7:0x0032 A[DONT_INVERT] */
                        /* JADX WARN: Code duplicated, block: B:8:0x0034  */
                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public final Object invoke() {
                            int i28 = 2 % 2;
                            getImm getimm2 = getimm;
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Boolean.valueOf(getimm2.RemoteActionCompatParcelizer));
                            boolean z13 = z12;
                            getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = getcontentviewgroupparentlayout;
                            androidx.compose.animation.core.Animatable animatable2 = animatable;
                            if (z13) {
                                int i29 = MediaBrowserCompatMediaItem + 35;
                                MediaDescriptionCompat = i29 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i210 = i29 % 2;
                                if (!getimm2.RemoteActionCompatParcelizer) {
                                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new DeliveryNotesUiModelImpl.AnonymousClass1(view, animatable2, null, 3), 3);
                                } else if (z13) {
                                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new ModalBottomSheetKt$ModalBottomSheet$3$1$1(animatable2, null, 3), 3);
                                }
                            } else if (z13) {
                                BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new ModalBottomSheetKt$ModalBottomSheet$3$1$1(animatable2, null, 3), 3);
                            }
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            int i211 = MediaBrowserCompatMediaItem + 87;
                            MediaDescriptionCompat = i211 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i212 = i211 % 2;
                            return createfromparcel;
                        }
                    };
                    getpostalcode2.write(objComponentActivity5);
                } else {
                    final boolean z13 = z5;
                    objComponentActivity5 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.startInput
                        private static int MediaBrowserCompatMediaItem = 0;
                        private static int MediaDescriptionCompat = 1;

                        /* JADX WARN: Code duplicated, block: B:7:0x0032 A[DONT_INVERT] */
                        /* JADX WARN: Code duplicated, block: B:8:0x0034  */
                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public final Object invoke() {
                            int i28 = 2 % 2;
                            getImm getimm2 = getimm;
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Boolean.valueOf(getimm2.RemoteActionCompatParcelizer));
                            boolean z14 = z13;
                            getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = getcontentviewgroupparentlayout;
                            androidx.compose.animation.core.Animatable animatable2 = animatable;
                            if (z14) {
                                int i29 = MediaBrowserCompatMediaItem + 35;
                                MediaDescriptionCompat = i29 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i210 = i29 % 2;
                                if (!getimm2.RemoteActionCompatParcelizer) {
                                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new DeliveryNotesUiModelImpl.AnonymousClass1(view, animatable2, null, 3), 3);
                                } else if (z14) {
                                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new ModalBottomSheetKt$ModalBottomSheet$3$1$1(animatable2, null, 3), 3);
                                }
                            } else if (z14) {
                                BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new ModalBottomSheetKt$ModalBottomSheet$3$1$1(animatable2, null, 3), 3);
                            }
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            int i211 = MediaBrowserCompatMediaItem + 87;
                            MediaDescriptionCompat = i211 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i212 = i211 % 2;
                            return createfromparcel;
                        }
                    };
                    getpostalcode2.write(objComponentActivity5);
                }
                getpostalcode3 = getpostalcode2;
                ChipsKt.RemoteActionCompatParcelizer(str, z10, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity5, modifierGraphicsLayer, i, getpostalcode2, (i7 << 9) & 57344, 0);
                z4 = z5;
            } else {
                getpostalcode3 = getpostalcode2;
                getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                z4 = z2;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode3.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new SingleThreadCachedScheduler1(getimm, i, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier, z4, i2, i3);
            }
        }
        int i28 = serializer + 21;
        read = i28 % Fields.SpotShadowColor;
        int i29 = i28 % 2;
        i5 |= 24576;
        z2 = z;
        i7 = i5;
        if ((i7 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getpostalcode2.write(i7 & 1, z3)) {
            if (i15 != 0) {
                int i110 = serializer + 55;
                read = i110 % Fields.SpotShadowColor;
                int i111 = i110 % 2;
                z5 = false;
            } else {
                z5 = z2;
            }
            objComponentActivity = getpostalcode2.ComponentActivity();
            androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = mainAxisk4lQ0M.write(1.0f);
                getpostalcode2.write(objComponentActivity);
            }
            animatable = (Animatable) objComponentActivity;
            objComponentActivity2 = getpostalcode2.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2);
                getpostalcode2.write(objComponentActivity2);
            }
            getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) objComponentActivity2;
            view = (View) getpostalcode2.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalView());
            String str2 = getimm.IconCompatParcelizer;
            boolean z14 = getimm.RemoteActionCompatParcelizer;
            i8 = i7 & 14;
            if (i8 != 4) {
                z6 = true;
            } else {
                z6 = true;
            }
            objComponentActivity3 = getpostalcode2.ComponentActivity();
            if (!z6) {
                objComponentActivity3 = new BarcodeAnalyzer$$ExternalSyntheticLambda0(18, getimm);
                getpostalcode2.write(objComponentActivity3);
            } else {
                objComponentActivity3 = new BarcodeAnalyzer$$ExternalSyntheticLambda0(18, getimm);
                getpostalcode2.write(objComponentActivity3);
            }
            Modifier modifierSemantics$default2 = SemanticsModifierKt.semantics$default(modifier, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, 1, null);
            zIconCompatParcelizer2 = getpostalcode2.IconCompatParcelizer(animatable);
            objComponentActivity4 = getpostalcode2.ComponentActivity();
            if (!zIconCompatParcelizer2) {
                objComponentActivity4 = new setEditorBoundsInfo(animatable, 2);
                getpostalcode2.write(objComponentActivity4);
            } else {
                objComponentActivity4 = new setEditorBoundsInfo(animatable, 2);
                getpostalcode2.write(objComponentActivity4);
            }
            Modifier modifierGraphicsLayer2 = GraphicsLayerModifierKt.graphicsLayer(modifierSemantics$default2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity4);
            if ((i7 & 896) == 256) {
                i10 = read + 91;
                serializer = i10 % Fields.SpotShadowColor;
                i9 = 2;
                if (i10 % 2 == 0) {
                    z7 = true;
                }
                int i210 = serializer + 99;
                read = i210 % Fields.SpotShadowColor;
                int i211 = i210 % i9;
                if (i8 != 4) {
                    z8 = true;
                } else {
                    z8 = true;
                }
                if ((i7 & 57344) == 16384) {
                    int i212 = read + 49;
                    serializer = i212 % Fields.SpotShadowColor;
                    int i213 = i212 % 2;
                    z9 = true;
                } else {
                    z9 = false;
                }
                zIconCompatParcelizer3 = getpostalcode2.IconCompatParcelizer(getcontentviewgroupparentlayout);
                zIconCompatParcelizer4 = getpostalcode2.IconCompatParcelizer(view);
                zIconCompatParcelizer5 = getpostalcode2.IconCompatParcelizer(animatable);
                objComponentActivity5 = getpostalcode2.ComponentActivity();
                if (!(z7 | z8 | z9 | zIconCompatParcelizer3 | zIconCompatParcelizer4 | zIconCompatParcelizer5)) {
                    final boolean z15 = z5;
                    objComponentActivity5 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.startInput
                        private static int MediaBrowserCompatMediaItem = 0;
                        private static int MediaDescriptionCompat = 1;

                        /* JADX WARN: Code duplicated, block: B:7:0x0032 A[DONT_INVERT] */
                        /* JADX WARN: Code duplicated, block: B:8:0x0034  */
                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public final Object invoke() {
                            int i214 = 2 % 2;
                            getImm getimm2 = getimm;
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Boolean.valueOf(getimm2.RemoteActionCompatParcelizer));
                            boolean z16 = z15;
                            getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = getcontentviewgroupparentlayout;
                            androidx.compose.animation.core.Animatable animatable2 = animatable;
                            if (z16) {
                                int i215 = MediaBrowserCompatMediaItem + 35;
                                MediaDescriptionCompat = i215 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i216 = i215 % 2;
                                if (!getimm2.RemoteActionCompatParcelizer) {
                                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new DeliveryNotesUiModelImpl.AnonymousClass1(view, animatable2, null, 3), 3);
                                } else if (z16) {
                                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new ModalBottomSheetKt$ModalBottomSheet$3$1$1(animatable2, null, 3), 3);
                                }
                            } else if (z16) {
                                BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new ModalBottomSheetKt$ModalBottomSheet$3$1$1(animatable2, null, 3), 3);
                            }
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            int i217 = MediaBrowserCompatMediaItem + 87;
                            MediaDescriptionCompat = i217 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i218 = i217 % 2;
                            return createfromparcel;
                        }
                    };
                    getpostalcode2.write(objComponentActivity5);
                } else {
                    final boolean z16 = z5;
                    objComponentActivity5 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.startInput
                        private static int MediaBrowserCompatMediaItem = 0;
                        private static int MediaDescriptionCompat = 1;

                        /* JADX WARN: Code duplicated, block: B:7:0x0032 A[DONT_INVERT] */
                        /* JADX WARN: Code duplicated, block: B:8:0x0034  */
                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public final Object invoke() {
                            int i214 = 2 % 2;
                            getImm getimm2 = getimm;
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Boolean.valueOf(getimm2.RemoteActionCompatParcelizer));
                            boolean z17 = z16;
                            getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = getcontentviewgroupparentlayout;
                            androidx.compose.animation.core.Animatable animatable2 = animatable;
                            if (z17) {
                                int i215 = MediaBrowserCompatMediaItem + 35;
                                MediaDescriptionCompat = i215 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i216 = i215 % 2;
                                if (!getimm2.RemoteActionCompatParcelizer) {
                                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new DeliveryNotesUiModelImpl.AnonymousClass1(view, animatable2, null, 3), 3);
                                } else if (z17) {
                                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new ModalBottomSheetKt$ModalBottomSheet$3$1$1(animatable2, null, 3), 3);
                                }
                            } else if (z17) {
                                BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new ModalBottomSheetKt$ModalBottomSheet$3$1$1(animatable2, null, 3), 3);
                            }
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            int i217 = MediaBrowserCompatMediaItem + 87;
                            MediaDescriptionCompat = i217 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i218 = i217 % 2;
                            return createfromparcel;
                        }
                    };
                    getpostalcode2.write(objComponentActivity5);
                }
                getpostalcode3 = getpostalcode2;
                ChipsKt.RemoteActionCompatParcelizer(str2, z14, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity5, modifierGraphicsLayer2, i, getpostalcode2, (i7 << 9) & 57344, 0);
                z4 = z5;
            } else {
                i9 = 2;
            }
            z7 = false;
            int i214 = serializer + 99;
            read = i214 % Fields.SpotShadowColor;
            int i215 = i214 % i9;
            if (i8 != 4) {
                z8 = true;
            } else {
                z8 = true;
            }
            if ((i7 & 57344) == 16384) {
                int i216 = read + 49;
                serializer = i216 % Fields.SpotShadowColor;
                int i217 = i216 % 2;
                z9 = true;
            } else {
                z9 = false;
            }
            zIconCompatParcelizer3 = getpostalcode2.IconCompatParcelizer(getcontentviewgroupparentlayout);
            zIconCompatParcelizer4 = getpostalcode2.IconCompatParcelizer(view);
            zIconCompatParcelizer5 = getpostalcode2.IconCompatParcelizer(animatable);
            objComponentActivity5 = getpostalcode2.ComponentActivity();
            if (!(z7 | z8 | z9 | zIconCompatParcelizer3 | zIconCompatParcelizer4 | zIconCompatParcelizer5)) {
                final boolean z17 = z5;
                objComponentActivity5 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.startInput
                    private static int MediaBrowserCompatMediaItem = 0;
                    private static int MediaDescriptionCompat = 1;

                    /* JADX WARN: Code duplicated, block: B:7:0x0032 A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:8:0x0034  */
                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final Object invoke() {
                        int i218 = 2 % 2;
                        getImm getimm2 = getimm;
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Boolean.valueOf(getimm2.RemoteActionCompatParcelizer));
                        boolean z18 = z17;
                        getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = getcontentviewgroupparentlayout;
                        androidx.compose.animation.core.Animatable animatable2 = animatable;
                        if (z18) {
                            int i219 = MediaBrowserCompatMediaItem + 35;
                            MediaDescriptionCompat = i219 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i2110 = i219 % 2;
                            if (!getimm2.RemoteActionCompatParcelizer) {
                                BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new DeliveryNotesUiModelImpl.AnonymousClass1(view, animatable2, null, 3), 3);
                            } else if (z18) {
                                BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new ModalBottomSheetKt$ModalBottomSheet$3$1$1(animatable2, null, 3), 3);
                            }
                        } else if (z18) {
                            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new ModalBottomSheetKt$ModalBottomSheet$3$1$1(animatable2, null, 3), 3);
                        }
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        int i2111 = MediaBrowserCompatMediaItem + 87;
                        MediaDescriptionCompat = i2111 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i2112 = i2111 % 2;
                        return createfromparcel;
                    }
                };
                getpostalcode2.write(objComponentActivity5);
            } else {
                final boolean z18 = z5;
                objComponentActivity5 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.startInput
                    private static int MediaBrowserCompatMediaItem = 0;
                    private static int MediaDescriptionCompat = 1;

                    /* JADX WARN: Code duplicated, block: B:7:0x0032 A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:8:0x0034  */
                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final Object invoke() {
                        int i218 = 2 % 2;
                        getImm getimm2 = getimm;
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Boolean.valueOf(getimm2.RemoteActionCompatParcelizer));
                        boolean z19 = z18;
                        getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = getcontentviewgroupparentlayout;
                        androidx.compose.animation.core.Animatable animatable2 = animatable;
                        if (z19) {
                            int i219 = MediaBrowserCompatMediaItem + 35;
                            MediaDescriptionCompat = i219 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i2110 = i219 % 2;
                            if (!getimm2.RemoteActionCompatParcelizer) {
                                BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new DeliveryNotesUiModelImpl.AnonymousClass1(view, animatable2, null, 3), 3);
                            } else if (z19) {
                                BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new ModalBottomSheetKt$ModalBottomSheet$3$1$1(animatable2, null, 3), 3);
                            }
                        } else if (z19) {
                            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new ModalBottomSheetKt$ModalBottomSheet$3$1$1(animatable2, null, 3), 3);
                        }
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        int i2111 = MediaBrowserCompatMediaItem + 87;
                        MediaDescriptionCompat = i2111 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i2112 = i2111 % 2;
                        return createfromparcel;
                    }
                };
                getpostalcode2.write(objComponentActivity5);
            }
            getpostalcode3 = getpostalcode2;
            ChipsKt.RemoteActionCompatParcelizer(str2, z14, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity5, modifierGraphicsLayer2, i, getpostalcode2, (i7 << 9) & 57344, 0);
            z4 = z5;
        } else {
            getpostalcode3 = getpostalcode2;
            getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            z4 = z2;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode3.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new SingleThreadCachedScheduler1(getimm, i, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier, z4, i2, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00bb A[PHI: r8
  0x00bb: PHI (r8v11 androidx.compose.ui.Modifier$Companion) = (r8v10 androidx.compose.ui.Modifier$Companion), (r8v22 androidx.compose.ui.Modifier$Companion) binds: [B:48:0x00b9, B:45:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d3 A[PHI: r8 r9
  0x00d3: PHI (r8v13 androidx.compose.ui.Modifier$Companion) = (r8v10 androidx.compose.ui.Modifier$Companion), (r8v22 androidx.compose.ui.Modifier$Companion) binds: [B:48:0x00b9, B:45:0x00b2] A[DONT_GENERATE, DONT_INLINE]
  0x00d3: PHI (r9v7 java.lang.String) = (r9v5 java.lang.String), (r9v14 java.lang.String) binds: [B:48:0x00b9, B:45:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x0108  */
    /* JADX WARN: Code duplicated, block: B:56:0x0119  */
    /* JADX WARN: Code duplicated, block: B:57:0x0126  */
    /* JADX WARN: Code duplicated, block: B:60:0x0167  */
    /* JADX WARN: Code duplicated, block: B:61:0x016b  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:68:0x022a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0234  */
    /* JADX WARN: Code duplicated, block: B:72:0x0260  */
    /* JADX WARN: Code duplicated, block: B:73:0x026a  */
    /* JADX WARN: Code duplicated, block: B:75:0x028b  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    public static final void ImageDetailsRow(final InputMethodManager inputMethodManager, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, Modifier modifier, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        final Modifier modifier2;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        Modifier.Companion companion;
        String str;
        final Modifier.Companion companion2;
        Modifier.Companion companion3;
        String str2;
        float f;
        Alignment.Companion companion4;
        supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer;
        int iHashCode;
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer;
        Modifier modifierMaterializeModifier;
        ComposeUiNode.Companion companion5;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2;
        setCurrentSemanticsNodesui setcurrentsemanticsnodesui;
        String str3;
        getImm getimm;
        getImm getimm2;
        int i3;
        boolean zIconCompatParcelizer;
        int i4 = 2 % 2;
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-766212265);
        getAddressCountry getaddresscountry = getpostalcode.read;
        Object obj = null;
        if ((i & 6) == 0) {
            int i5 = read;
            int i6 = i5 + 25;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if ((i & 8) == 0) {
                int i8 = i5 + 5;
                serializer = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    getpostalcode.read(inputMethodManager);
                    obj.hashCode();
                    throw null;
                }
                zIconCompatParcelizer = getpostalcode.read(inputMethodManager);
                int i9 = read + 97;
                serializer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(inputMethodManager);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2)) {
                int i11 = serializer + 65;
                read = i11 % Fields.SpotShadowColor;
                i3 = i11 % 2 != 0 ? 8970 : Fields.RotationX;
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        int i12 = i2 | 3072;
        if (getpostalcode.write(i12 & 1, (i12 & 1171) != 1170)) {
            int i13 = read + 17;
            serializer = i13 % Fields.SpotShadowColor;
            if (i13 % 2 == 0) {
                companion = Modifier.Companion;
                str = inputMethodManager.write;
                int i14 = 1 / 0;
                if (str == null) {
                    companion2 = companion;
                    gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                    if (gethandleruiannotationsMediaDescriptionCompat != null) {
                        return;
                    }
                    final int i15 = 0;
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.stopInput
                        private static int MediaSessionCompatQueueItem = 0;
                        private static int RatingCompat = 1;

                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public final Object invoke(Object obj2, Object obj3) {
                            int i16 = 2 % 2;
                            int i17 = MediaSessionCompatQueueItem + 121;
                            RatingCompat = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i17 % 2 == 0) {
                                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                throw null;
                            }
                            int i18 = i15;
                            createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                            int i19 = i;
                            if (i18 == 0) {
                                ((Integer) obj3).getClass();
                                ImageDetailsKt.ImageDetailsRow(inputMethodManager, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, companion2, (getBirthDateFull) obj2, ContentType_androidKt.RemoteActionCompatParcelizer(i19 | 1));
                                return createfromparcel2;
                            }
                            ((Integer) obj3).getClass();
                            ImageDetailsKt.ImageDetailsRow(inputMethodManager, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, companion2, (getBirthDateFull) obj2, ContentType_androidKt.RemoteActionCompatParcelizer(i19 | 1));
                            int i20 = MediaSessionCompatQueueItem + 47;
                            RatingCompat = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i21 = i20 % 2;
                            return createfromparcel2;
                        }
                    };
                } else {
                    companion3 = companion;
                    str2 = str;
                    Modifier modifierWrite = SizeKt.write(companion3, 1.0f);
                    float f2 = Dimensions.setActionBarVisibilityCallback;
                    f = Dimensions.getNestedScrollAxes;
                    Modifier modifierRemoteActionCompatParcelizer = PaddingKt.RemoteActionCompatParcelizer(modifierWrite, f2, f);
                    companion4 = Alignment.Companion;
                    supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, companion4.getCenterVertically(), getpostalcode, 48);
                    iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                    dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierRemoteActionCompatParcelizer);
                    companion5 = ComposeUiNode.Companion;
                    constructor = companion5.getConstructor();
                    if (getaddresscountry != null) {
                        SentryUUID.write();
                        throw null;
                    }
                    int i16 = read + 53;
                    serializer = i16 % Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        int i18 = serializer + 27;
                        read = i18 % Fields.SpotShadowColor;
                        int i19 = i18 % 2;
                        getpostalcode.serializer(constructor);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion5, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion5, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                    Modifier modifierThen = companion3.then(new show(1.0f, true));
                    ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, companion4.getStart(), getpostalcode, 0);
                    int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen);
                    constructor2 = companion5.getConstructor();
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor2);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    c8$$ExternalSyntheticOutline0.m(companion5, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion5, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
                    TextStyle textStyle = (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer());
                    setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                    TextKt.m131TextNvy7gAk(str2, companion3, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, TextOverflow.Companion.m3569getEllipsisgIe3tQ8(), false, 2, 0, null, textStyle, getpostalcode, 48, 24960, 110584);
                    str3 = inputMethodManager.read;
                    if (str3 == null) {
                        getpostalcode.serializer(-751572969);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        getpostalcode.serializer(-751572968);
                        TextKt.m131TextNvy7gAk(str3, companion3, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.RemoteActionCompatParcelizer(), getpostalcode, 48, 0, 131064);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    getpostalcode.IconCompatParcelizer(true);
                    getimm = inputMethodManager.IconCompatParcelizer;
                    if (getimm == null) {
                        getpostalcode.serializer(-1024113195);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        getpostalcode.serializer(-1024113194);
                        read(getimm, R.drawable.ic_thumbs_up, r8lambdaunavo3sxub_pc9xroryotnrlvsm, PaddingKt.m74paddingqDBjuR0$default(companion3, f, 0.0f, Dimensions.setMenu, 0.0f, 10), true, getpostalcode, ((i12 << 3) & 896) | 24576, 0);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    getimm2 = inputMethodManager.serializer;
                    if (getimm2 == null) {
                        getpostalcode.serializer(-1023686046);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        getpostalcode.serializer(-1023686045);
                        read(getimm2, R.drawable.ic_thumbs_down, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, companion3, false, getpostalcode, (i12 & 896) | 3072, 16);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    getpostalcode.IconCompatParcelizer(true);
                    modifier2 = companion3;
                }
            } else {
                companion = Modifier.Companion;
                str = inputMethodManager.write;
                if (str == null) {
                    companion2 = companion;
                    gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                    if (gethandleruiannotationsMediaDescriptionCompat != null) {
                        return;
                    }
                    final int i110 = 0;
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.stopInput
                        private static int MediaSessionCompatQueueItem = 0;
                        private static int RatingCompat = 1;

                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public final Object invoke(Object obj2, Object obj3) {
                            int i111 = 2 % 2;
                            int i112 = MediaSessionCompatQueueItem + 121;
                            RatingCompat = i112 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i112 % 2 == 0) {
                                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                throw null;
                            }
                            int i113 = i110;
                            createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                            int i114 = i;
                            if (i113 == 0) {
                                ((Integer) obj3).getClass();
                                ImageDetailsKt.ImageDetailsRow(inputMethodManager, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, companion2, (getBirthDateFull) obj2, ContentType_androidKt.RemoteActionCompatParcelizer(i114 | 1));
                                return createfromparcel2;
                            }
                            ((Integer) obj3).getClass();
                            ImageDetailsKt.ImageDetailsRow(inputMethodManager, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, companion2, (getBirthDateFull) obj2, ContentType_androidKt.RemoteActionCompatParcelizer(i114 | 1));
                            int i20 = MediaSessionCompatQueueItem + 47;
                            RatingCompat = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i21 = i20 % 2;
                            return createfromparcel2;
                        }
                    };
                } else {
                    companion3 = companion;
                    str2 = str;
                    Modifier modifierWrite2 = SizeKt.write(companion3, 1.0f);
                    float f3 = Dimensions.setActionBarVisibilityCallback;
                    f = Dimensions.getNestedScrollAxes;
                    Modifier modifierRemoteActionCompatParcelizer2 = PaddingKt.RemoteActionCompatParcelizer(modifierWrite2, f3, f);
                    companion4 = Alignment.Companion;
                    supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, companion4.getCenterVertically(), getpostalcode, 48);
                    iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                    dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierRemoteActionCompatParcelizer2);
                    companion5 = ComposeUiNode.Companion;
                    constructor = companion5.getConstructor();
                    if (getaddresscountry != null) {
                        SentryUUID.write();
                        throw null;
                    }
                    int i111 = read + 53;
                    serializer = i111 % Fields.SpotShadowColor;
                    int i112 = i111 % 2;
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        int i113 = serializer + 27;
                        read = i113 % Fields.SpotShadowColor;
                        int i114 = i113 % 2;
                        getpostalcode.serializer(constructor);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion5, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion5, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                    Modifier modifierThen2 = companion3.then(new show(1.0f, true));
                    ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, companion4.getStart(), getpostalcode, 0);
                    int iHashCode3 = Long.hashCode(getpostalcode.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode.serializer();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen2);
                    constructor2 = companion5.getConstructor();
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor2);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    c8$$ExternalSyntheticOutline0.m(companion5, getpostalcode, modalBottomSheetYbuCTN8Serializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion5, getpostalcode, Integer.valueOf(iHashCode3), getpostalcode));
                    TextStyle textStyle2 = (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer());
                    setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                    TextKt.m131TextNvy7gAk(str2, companion3, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, TextOverflow.Companion.m3569getEllipsisgIe3tQ8(), false, 2, 0, null, textStyle2, getpostalcode, 48, 24960, 110584);
                    str3 = inputMethodManager.read;
                    if (str3 == null) {
                        getpostalcode.serializer(-751572969);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        getpostalcode.serializer(-751572968);
                        TextKt.m131TextNvy7gAk(str3, companion3, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.RemoteActionCompatParcelizer(), getpostalcode, 48, 0, 131064);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    getpostalcode.IconCompatParcelizer(true);
                    getimm = inputMethodManager.IconCompatParcelizer;
                    if (getimm == null) {
                        getpostalcode.serializer(-1024113195);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        getpostalcode.serializer(-1024113194);
                        read(getimm, R.drawable.ic_thumbs_up, r8lambdaunavo3sxub_pc9xroryotnrlvsm, PaddingKt.m74paddingqDBjuR0$default(companion3, f, 0.0f, Dimensions.setMenu, 0.0f, 10), true, getpostalcode, ((i12 << 3) & 896) | 24576, 0);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    getimm2 = inputMethodManager.serializer;
                    if (getimm2 == null) {
                        getpostalcode.serializer(-1023686046);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        getpostalcode.serializer(-1023686045);
                        read(getimm2, R.drawable.ic_thumbs_down, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, companion3, false, getpostalcode, (i12 & 896) | 3072, 16);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    getpostalcode.IconCompatParcelizer(true);
                    modifier2 = companion3;
                }
            }
            gethandleruiannotationsMediaDescriptionCompat.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        }
        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        modifier2 = modifier;
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            final int i20 = 1;
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.stopInput
                private static int MediaSessionCompatQueueItem = 0;
                private static int RatingCompat = 1;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj2, Object obj3) {
                    int i115 = 2 % 2;
                    int i116 = MediaSessionCompatQueueItem + 121;
                    RatingCompat = i116 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i116 % 2 == 0) {
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        throw null;
                    }
                    int i117 = i20;
                    createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                    int i118 = i;
                    if (i117 == 0) {
                        ((Integer) obj3).getClass();
                        ImageDetailsKt.ImageDetailsRow(inputMethodManager, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, modifier2, (getBirthDateFull) obj2, ContentType_androidKt.RemoteActionCompatParcelizer(i118 | 1));
                        return createfromparcel2;
                    }
                    ((Integer) obj3).getClass();
                    ImageDetailsKt.ImageDetailsRow(inputMethodManager, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, modifier2, (getBirthDateFull) obj2, ContentType_androidKt.RemoteActionCompatParcelizer(i118 | 1));
                    int i21 = MediaSessionCompatQueueItem + 47;
                    RatingCompat = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i22 = i21 % 2;
                    return createfromparcel2;
                }
            };
            gethandleruiannotationsMediaDescriptionCompat.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        }
    }
}
