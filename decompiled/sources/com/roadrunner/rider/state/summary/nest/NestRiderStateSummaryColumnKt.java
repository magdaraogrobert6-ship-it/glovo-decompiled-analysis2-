package com.roadrunner.rider.state.summary.nest;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import com.roadrunner.rrds.compose.component.message.BannerMessageKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidPathIterator_androidKtWhenMappings;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.SdkClickHandler1;
import o.SdkClickHandler5;
import o.SessionResponseData;
import o.buildMapping;
import o.buildResponseData;
import o.enableBridgeSecurity;
import o.extractAuthorizationHeader;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPendingWebViewPauseRunnableandroid_sdk_ui_release;
import o.getPostalCode;
import o.hasRootCause;
import o.isValidParameter;
import o.p6;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NestRiderStateSummaryColumnKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x003e  */
    /* JADX WARN: Code duplicated, block: B:17:0x004a A[PHI: r3
  0x004a: PHI (r3v9 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v11 o.getPostalCode) binds: [B:8:0x002b, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x0073  */
    /* JADX WARN: Code duplicated, block: B:32:0x0082 A[PHI: r5
  0x0082: PHI (r5v19 int) = (r5v18 int), (r5v26 int) binds: [B:31:0x0080, B:27:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x008d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0090  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:9:0x002d A[PHI: r3
  0x002d: PHI (r3v6 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v11 o.getPostalCode) binds: [B:8:0x002b, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void read(SdkClickHandler1 sdkClickHandler1, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        boolean zIconCompatParcelizer;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = read + 63;
        RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-302670216);
            if ((i & 30) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(sdkClickHandler1);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(sdkClickHandler1);
                }
                if (zIconCompatParcelizer) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
                int i9 = RemoteActionCompatParcelizer + 95;
                read = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
            } else {
                i3 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-302670216);
            if ((i & 6) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(sdkClickHandler1);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(sdkClickHandler1);
                }
                if (zIconCompatParcelizer) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
                int i11 = RemoteActionCompatParcelizer + 95;
                read = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
            } else {
                i3 = i;
            }
        }
        if (getpostalcode.write(i3 & 1, (i3 & 3) != 2)) {
            int i13 = read + 59;
            RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
            if (i13 % 2 == 0) {
                i4 = SdkClickHandler5.read[sdkClickHandler1.write.ordinal()];
                if (i4 == 0) {
                    getpostalcode.serializer(1191702662);
                    BannerMessageKt.IconCompatParcelizer((Modifier) null, (ImageVector) null, (String) null, sdkClickHandler1.IconCompatParcelizer, (String) null, (String) null, (enableBridgeSecurity) null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) null, getpostalcode, 0, 503);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    i5 = read;
                    int i14 = i5 + 55;
                    RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    if (i4 != 2) {
                        getpostalcode.serializer(1191704774);
                        BannerMessageKt.BannerMessageSuccess(null, null, sdkClickHandler1.IconCompatParcelizer, null, null, null, null, getpostalcode, 0, 503);
                        getpostalcode.IconCompatParcelizer(false);
                    } else if (i4 != 3) {
                        i6 = i5 + 61;
                        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                        if (i6 % 2 == 0 ? i4 == 4 : i4 == 3) {
                            getpostalcode.serializer(1191708900);
                            BannerMessageKt.IconCompatParcelizer((Modifier) null, (ImageVector) null, sdkClickHandler1.IconCompatParcelizer, (String) null, (AnnotatedString) null, (String) null, (enableBridgeSecurity) null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) null, getpostalcode, 0, 503);
                            getpostalcode.IconCompatParcelizer(false);
                        } else {
                            throw d$$ExternalSyntheticOutline0.m(getpostalcode, 1191701435, false);
                        }
                    } else {
                        getpostalcode.serializer(1191706916);
                        BannerMessageKt.m5059BannerMessageError1xFH4wI(null, null, sdkClickHandler1.IconCompatParcelizer, null, null, null, null, 0L, null, 0L, null, 0L, 0L, getpostalcode, 0, 0, 32759);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                }
            } else {
                i4 = SdkClickHandler5.read[sdkClickHandler1.write.ordinal()];
                if (i4 == 1) {
                    getpostalcode.serializer(1191702662);
                    BannerMessageKt.IconCompatParcelizer((Modifier) null, (ImageVector) null, (String) null, sdkClickHandler1.IconCompatParcelizer, (String) null, (String) null, (enableBridgeSecurity) null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) null, getpostalcode, 0, 503);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    i5 = read;
                    int i16 = i5 + 55;
                    RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    if (i4 != 2) {
                        getpostalcode.serializer(1191704774);
                        BannerMessageKt.BannerMessageSuccess(null, null, sdkClickHandler1.IconCompatParcelizer, null, null, null, null, getpostalcode, 0, 503);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        if (i4 != 3) {
                            i6 = i5 + 61;
                            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                            if (i6 % 2 == 0) {
                                throw d$$ExternalSyntheticOutline0.m(getpostalcode, 1191701435, false);
                            }
                            throw d$$ExternalSyntheticOutline0.m(getpostalcode, 1191701435, false);
                        }
                        getpostalcode.serializer(1191706916);
                        BannerMessageKt.m5059BannerMessageError1xFH4wI(null, null, sdkClickHandler1.IconCompatParcelizer, null, null, null, null, 0L, null, 0L, null, 0L, 0L, getpostalcode, 0, 0, 32759);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                }
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPathIterator_androidKtWhenMappings(sdkClickHandler1, i, 28);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX WARN: Code duplicated, block: B:12:0x003b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    /* JADX WARN: Code duplicated, block: B:17:0x0047 A[PHI: r1
  0x0047: PHI (r1v9 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v11 o.getPostalCode) binds: [B:8:0x0030, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x011b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0032 A[PHI: r1
  0x0032: PHI (r1v6 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v11 o.getPostalCode) binds: [B:8:0x0030, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void NestRiderStateSummaryColumn(SessionResponseData sessionResponseData, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        boolean zIconCompatParcelizer;
        int i2;
        int i3;
        Modifier modifier2;
        boolean z;
        int i4 = 2 % 2;
        int i5 = read + 47;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1969953195);
            if ((i & 81) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(sessionResponseData);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(sessionResponseData);
                }
                if (zIconCompatParcelizer) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i | i2;
            } else {
                int i6 = RemoteActionCompatParcelizer + 23;
                read = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                i3 = i;
            }
        } else {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1969953195);
            if ((i & 6) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(sessionResponseData);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(sessionResponseData);
                }
                if (zIconCompatParcelizer) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i | i2;
            } else {
                int i8 = RemoteActionCompatParcelizer + 23;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            int i10 = read + 85;
            RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                i3 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 32 : 16;
            } else {
                getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                throw null;
            }
        }
        int i11 = i3 | 384;
        if (getpostalcode.write(i11 & 1, (i11 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierWrite = SizeKt.write(BackgroundKt.m20backgroundbw27NRU(companion, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).IconCompatParcelizer(), RectangleShapeKt.getRectangleShape()), 1.0f);
            float f = Dimensions.getAnimatedVisibility;
            float f2 = Dimensions.setTabContainer;
            Modifier modifierRemoteActionCompatParcelizer = PaddingKt.RemoteActionCompatParcelizer(modifierWrite, f, f2);
            modifierRemoteActionCompatParcelizer.getClass();
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.IconCompatParcelizer(f2), Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierRemoteActionCompatParcelizer);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                getpostalcode.serializer(-1946070197);
                for (buildResponseData buildresponsedata : sessionResponseData.read) {
                    boolean z2 = sessionResponseData.write;
                    if ((i11 & 112) == 32) {
                        int i12 = read + 103;
                        RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                        if (i12 % 2 == 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                    boolean z3 = getpostalcode.read(buildresponsedata);
                    Object objComponentActivity = getpostalcode.ComponentActivity();
                    if ((z | z3) || objComponentActivity == getCreditCardExpirationMonth.write) {
                        objComponentActivity = new getPendingWebViewPauseRunnableandroid_sdk_ui_release(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 6, buildresponsedata);
                        getpostalcode.write(objComponentActivity);
                    }
                    RemoteActionCompatParcelizer(buildresponsedata, z2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, SizeKt.write(Modifier.Companion, 1.0f), getpostalcode, 3072);
                }
                getpostalcode.IconCompatParcelizer(false);
                SdkClickHandler1 sdkClickHandler1 = sessionResponseData.RemoteActionCompatParcelizer;
                if (sdkClickHandler1 == null) {
                    int i13 = read + 99;
                    RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    getpostalcode.serializer(-198355675);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(-198355674);
                    read(sdkClickHandler1, getpostalcode, 0);
                    getpostalcode.IconCompatParcelizer(false);
                }
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
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU(i, 13, sessionResponseData, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    public static final void RemoteActionCompatParcelizer(buildResponseData buildresponsedata, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        getPostalCode getpostalcode2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull;
        getpostalcode3.MediaSessionCompatQueueItem(107222535);
        if ((i & 6) == 0) {
            i2 = (getpostalcode3.read(buildresponsedata) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i6 = read + 15;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                getpostalcode3.write(z);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i2 |= !(getpostalcode3.write(z) ^ true) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i7 = read + 27;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                int i8 = 6 / 0;
                if (getpostalcode3.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                    i4 = Fields.RotationX;
                } else {
                    i4 = Fields.SpotShadowColor;
                }
            } else if (getpostalcode3.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                i4 = Fields.RotationX;
            } else {
                i4 = Fields.SpotShadowColor;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode3.read(modifier)) {
                int i9 = RemoteActionCompatParcelizer + 119;
                read = i9 % Fields.SpotShadowColor;
                i3 = i9 % 2 != 0 ? 1195 : Fields.CameraDistance;
            } else {
                i3 = Fields.RotationZ;
            }
            i2 |= i3;
        }
        int i10 = i2;
        if (getpostalcode3.write(i10 & 1, (i10 & 1171) != 1170)) {
            int i11 = read + 83;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            int i13 = SdkClickHandler5.serializer[buildresponsedata.serializer().ordinal()];
            if (i13 != 1) {
                int i14 = RemoteActionCompatParcelizer + 1;
                int i15 = i14 % Fields.SpotShadowColor;
                read = i15;
                int i16 = i14 % 2;
                if (i13 == 2) {
                    getpostalcode2 = getpostalcode3;
                    getpostalcode2.serializer(-1188696672);
                    isValidParameter.RemoteActionCompatParcelizer(buildresponsedata.read(), r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, z, false, buildresponsedata.IconCompatParcelizer(), null, null, null, getpostalcode2, ((i10 >> 3) & 1008) | ((i10 << 6) & 7168), 976);
                    getpostalcode2.IconCompatParcelizer(false);
                } else if (i13 != 3) {
                    if (i13 == 4) {
                        getpostalcode3.serializer(-1188257216);
                        PrimaryKt.serializer(buildresponsedata.read(), r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, z, null, null, getpostalcode3, ((i10 >> 3) & 1008) | ((i10 << 6) & 7168), 48);
                        getpostalcode3.IconCompatParcelizer(false);
                    } else {
                        if (i13 != 5) {
                            throw d$$ExternalSyntheticOutline0.m(getpostalcode3, -38353366, false);
                        }
                        int i17 = i15 + 123;
                        RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
                        int i18 = i17 % 2;
                        getpostalcode3.serializer(-1188062722);
                        isValidParameter.RemoteActionCompatParcelizer(buildresponsedata.read(), r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, z, (Integer) null, (hasRootCause) null, (extractAuthorizationHeader) null, (MutableInteractionSourceImpl) null, getpostalcode3, ((i10 >> 3) & 1008) | ((i10 << 6) & 7168), 496);
                        getpostalcode3.IconCompatParcelizer(false);
                    }
                    getpostalcode = getpostalcode3;
                } else {
                    getpostalcode3.serializer(-1188478494);
                    PrimaryKt.write(buildresponsedata.read(), r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, z, false, buildresponsedata.IconCompatParcelizer(), null, null, null, null, getpostalcode3, ((i10 >> 3) & 1008) | ((i10 << 6) & 7168), 0, 2000);
                    getpostalcode2 = getpostalcode3;
                    getpostalcode2.IconCompatParcelizer(false);
                    int i19 = RemoteActionCompatParcelizer + 101;
                    read = i19 % Fields.SpotShadowColor;
                    int i20 = i19 % 2;
                }
                getpostalcode = getpostalcode2;
            } else {
                getpostalcode3.serializer(-1188925545);
                PrimaryKt.write(buildresponsedata.read(), r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, z, buildresponsedata.IconCompatParcelizer(), null, null, null, 0, null, null, null, 0.0f, getpostalcode3, ((i10 >> 3) & 1008) | ((i10 << 6) & 7168), 0, 16352);
                getpostalcode = getpostalcode3;
                getpostalcode.IconCompatParcelizer(false);
                int i21 = RemoteActionCompatParcelizer + 77;
                read = i21 % Fields.SpotShadowColor;
                int i22 = i21 % 2;
            }
        } else {
            getpostalcode = getpostalcode3;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p6(buildresponsedata, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, i, 10);
        }
    }
}
