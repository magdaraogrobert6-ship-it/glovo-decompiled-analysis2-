package com.roadrunner.delivery.pickupdropoff.tasks.taptopay.presentation.compose;

import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.roadrunner.delivery.pickupdropoff.tasks.model.TapToPayTaskUiItem$Companion;
import com.roadrunner.delivery.pickupdropoff.tasks.model.TapToPayTaskUiItem$PaymentType;
import com.roadrunner.delivery.pickupdropoff.tasks.taptopay.presentation.compose.TapToPayContentKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.forms.ToggleKt;
import io.sentry.SentryUUID;
import java.util.List;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.UtilNetworking1;
import o.buildMapping;
import o.checkArithmeticNB67dxo;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getMaxHeightimpl;
import o.getNewPassword;
import o.getPointerPrecisionfpxItnM;
import o.getPostalCode;
import o.getSp;
import o.getUnspecifiedXSAIIZE;
import o.getValueimpl;
import o.handleUrlOverridelambda1;
import o.isSpecifiedR2X_6o;
import o.isZeroannotations;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.restrictConstraintsxF2OJ5Qdefault;
import o.setCurrentSemanticsNodesui;
import o.toAndroidVertexModeJOOmi9M;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TapToPayContentKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    /* JADX WARN: Code duplicated, block: B:14:0x004a  */
    /* JADX WARN: Code duplicated, block: B:15:0x004c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0058 A[PHI: r3
  0x0058: PHI (r3v9 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v11 o.getPostalCode) binds: [B:8:0x0030, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0071  */
    /* JADX WARN: Code duplicated, block: B:9:0x0032 A[PHI: r3
  0x0032: PHI (r3v6 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v11 o.getPostalCode) binds: [B:8:0x0030, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void RemoteActionCompatParcelizer(getMaxHeightimpl getmaxheightimpl, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        boolean zIconCompatParcelizer;
        int i2;
        int i3;
        boolean z;
        Modifier modifier2;
        int i4 = 2 % 2;
        int i5 = read + 75;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            getmaxheightimpl.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1991215476);
            if ((i & 28) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getmaxheightimpl);
                } else {
                    int i6 = RemoteActionCompatParcelizer + 5;
                    read = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    zIconCompatParcelizer = getpostalcode.read(getmaxheightimpl);
                }
                if (zIconCompatParcelizer) {
                    i2 = 4;
                } else {
                    int i8 = read + 19;
                    RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            getmaxheightimpl.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1991215476);
            if ((i & 6) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getmaxheightimpl);
                } else {
                    int i10 = RemoteActionCompatParcelizer + 5;
                    read = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    zIconCompatParcelizer = getpostalcode.read(getmaxheightimpl);
                }
                if (zIconCompatParcelizer) {
                    i2 = 4;
                } else {
                    int i12 = read + 19;
                    RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        int i14 = i3 | 48;
        if ((i14 & 19) != 18) {
            int i15 = RemoteActionCompatParcelizer + 37;
            read = i15 % Fields.SpotShadowColor;
            if (i15 % 2 != 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (getpostalcode.write(i14 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            String str = getmaxheightimpl.formattedAmount;
            TextStyle textStyleMediaSessionCompatResultReceiverWrapper = performLayout.MediaSessionCompatResultReceiverWrapper();
            long presenter = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter();
            companion.getClass();
            TextKt.m131TextNvy7gAk(str, companion, presenter, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleMediaSessionCompatResultReceiverWrapper, getpostalcode, 0, 0, 131064);
            int i16 = RemoteActionCompatParcelizer + 123;
            read = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new isSpecifiedR2X_6o(getmaxheightimpl, modifier2, i, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX WARN: Code duplicated, block: B:13:0x0041  */
    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    /* JADX WARN: Code duplicated, block: B:15:0x0045  */
    /* JADX WARN: Code duplicated, block: B:17:0x0048 A[PHI: r14
  0x0048: PHI (r14v6 o.getPostalCode) = (r14v1 o.getPostalCode), (r14v7 o.getPostalCode) binds: [B:8:0x002e, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0030 A[PHI: r14
  0x0030: PHI (r14v2 o.getPostalCode) = (r14v1 o.getPostalCode), (r14v7 o.getPostalCode) binds: [B:8:0x002e, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void IconCompatParcelizer(final checkArithmeticNB67dxo checkarithmeticnb67dxo, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Modifier modifier, getBirthDateFull getbirthdatefull, final int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        int i4;
        final Modifier modifier2;
        int i5;
        int i6 = 2 % 2;
        int i7 = RemoteActionCompatParcelizer + 113;
        read = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            checkarithmeticnb67dxo.getClass();
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1646941353);
            if ((i & 18) == 0) {
                if (getpostalcode.read(checkarithmeticnb67dxo)) {
                    i4 = RemoteActionCompatParcelizer + 47;
                    read = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 != 0) {
                        i2 = 5;
                    } else {
                        i2 = 4;
                    }
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            checkarithmeticnb67dxo.getClass();
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1646941353);
            if ((i & 6) == 0) {
                if (getpostalcode.read(checkarithmeticnb67dxo)) {
                    i4 = RemoteActionCompatParcelizer + 47;
                    read = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 != 0) {
                        i2 = 5;
                    } else {
                        i2 = 4;
                    }
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0)) {
                int i8 = read + 31;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                i5 = i8 % 2 == 0 ? 8 : 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i9 = i3 | 384;
        if (getpostalcode.write(i9 & 1, (i9 & 147) != 146)) {
            final Modifier.Companion companion = Modifier.Companion;
            getValueimpl getvalueimpl = (getValueimpl) ExtrasKt.write(checkarithmeticnb67dxo.MediaMetadataCompat, getpostalcode, 0).getValue();
            if (!(getvalueimpl instanceof getUnspecifiedXSAIIZE)) {
                getpostalcode.serializer(1677005733);
                getpostalcode.IconCompatParcelizer(false);
                getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    final int i10 = 0;
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.TextUnitanM5pPY
                        private static int MediaBrowserCompatMediaItem = 1;
                        private static int MediaMetadataCompat;

                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public final Object invoke(Object obj, Object obj2) {
                            int i11 = 2 % 2;
                            int i12 = MediaBrowserCompatMediaItem + 45;
                            MediaMetadataCompat = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i13 = i12 % 2;
                            int i14 = i10;
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            int i15 = i;
                            androidx.compose.ui.Modifier modifier3 = companion;
                            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
                            checkArithmeticNB67dxo checkarithmeticnb67dxo2 = checkarithmeticnb67dxo;
                            getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                            ((Integer) obj2).getClass();
                            if (i14 == 0) {
                                TapToPayContentKt.IconCompatParcelizer(checkarithmeticnb67dxo2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, modifier3, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i15 | 1));
                                return createfromparcel;
                            }
                            TapToPayContentKt.IconCompatParcelizer(checkarithmeticnb67dxo2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, modifier3, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i15 | 1));
                            int i16 = MediaMetadataCompat + 85;
                            MediaBrowserCompatMediaItem = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i17 = i16 % 2;
                            return createfromparcel;
                        }
                    };
                    return;
                }
                return;
            }
            getpostalcode.serializer(2132302670);
            getMaxHeightimpl getmaxheightimpl = ((getUnspecifiedXSAIIZE) getvalueimpl).serializer;
            TapToPayTaskUiItem$Companion tapToPayTaskUiItem$Companion = getMaxHeightimpl.Companion;
            TapToPayContent(getmaxheightimpl, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, companion, getpostalcode, i9 & 1008);
            getpostalcode.IconCompatParcelizer(false);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat2 = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat2 != null) {
            final int i11 = 1;
            gethandleruiannotationsMediaDescriptionCompat2.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.TextUnitanM5pPY
                private static int MediaBrowserCompatMediaItem = 1;
                private static int MediaMetadataCompat;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i12 = 2 % 2;
                    int i13 = MediaBrowserCompatMediaItem + 45;
                    MediaMetadataCompat = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    int i15 = i11;
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i16 = i;
                    androidx.compose.ui.Modifier modifier3 = modifier2;
                    r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
                    checkArithmeticNB67dxo checkarithmeticnb67dxo2 = checkarithmeticnb67dxo;
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                    ((Integer) obj2).getClass();
                    if (i15 == 0) {
                        TapToPayContentKt.IconCompatParcelizer(checkarithmeticnb67dxo2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, modifier3, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i16 | 1));
                        return createfromparcel;
                    }
                    TapToPayContentKt.IconCompatParcelizer(checkarithmeticnb67dxo2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, modifier3, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i16 | 1));
                    int i17 = MediaMetadataCompat + 85;
                    MediaBrowserCompatMediaItem = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    return createfromparcel;
                }
            };
            int i12 = read + 19;
            RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00bf  */
    public static final void CardItemContent(getMaxHeightimpl getmaxheightimpl, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        int i3;
        Modifier modifier2;
        String str;
        int i4;
        int i5 = 2 % 2;
        getmaxheightimpl.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1426175703);
        if ((i & 6) == 0) {
            int i6 = read + 105;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            if ((i6 % 2 != 0 ? (i & 8) != 0 : (i & 68) != 0) ? getpostalcode2.IconCompatParcelizer(getmaxheightimpl) : getpostalcode2.read(getmaxheightimpl)) {
                int i7 = RemoteActionCompatParcelizer + 89;
                read = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        int i9 = i2 | 48;
        if ((i9 & 19) != 18) {
            int i10 = RemoteActionCompatParcelizer + 23;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i9 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor);
                int i12 = RemoteActionCompatParcelizer + 47;
                read = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            isZeroannotations iszeroannotations = getmaxheightimpl.cardUiItem;
            if (iszeroannotations != null) {
                int i14 = read + 47;
                RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                str = iszeroannotations.description;
                if (str == null) {
                    str = "";
                }
            } else {
                str = "";
            }
            TextStyle textStyleIconCompatParcelizer = performLayout.IconCompatParcelizer();
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            long supportBackgroundTintMode = ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode();
            companion.getClass();
            String str2 = str;
            getpostalcode = getpostalcode2;
            modifier2 = companion;
            TextKt.m131TextNvy7gAk(str2, modifier2, supportBackgroundTintMode, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleIconCompatParcelizer, getpostalcode, 48, 0, 131064);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(modifier2, Dimensions.setSplitBackground)});
            TextKt.m131TextNvy7gAk(getmaxheightimpl.formattedAmount, modifier2, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatResultReceiverWrapper(), getpostalcode, 48, 0, 131064);
            i3 = 1;
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode = getpostalcode2;
            i3 = 1;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new isSpecifiedR2X_6o(getmaxheightimpl, modifier2, i, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:82:0x014e  */
    /* JADX WARN: Code duplicated, block: B:88:0x015c  */
    /* JADX WARN: Code duplicated, block: B:91:0x016d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0174  */
    public static final void IconCompatParcelizer(getMaxHeightimpl getmaxheightimpl, isZeroannotations iszeroannotations, restrictConstraintsxF2OJ5Qdefault restrictconstraintsxf2oj5qdefault, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        boolean z3;
        boolean z4;
        boolean zIconCompatParcelizer;
        Object objComponentActivity;
        boolean zIconCompatParcelizer2;
        int i4;
        int i5 = 2 % 2;
        int i6 = RemoteActionCompatParcelizer + 13;
        read = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1301264860);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? getpostalcode.read(getmaxheightimpl) : getpostalcode.IconCompatParcelizer(getmaxheightimpl) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i8 = RemoteActionCompatParcelizer + 49;
            read = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            i2 |= (i & 64) == 0 ? getpostalcode.read(iszeroannotations) : getpostalcode.IconCompatParcelizer(iszeroannotations) ? 32 : 16;
        }
        Object obj = null;
        if ((i & 384) == 0) {
            int i10 = RemoteActionCompatParcelizer;
            int i11 = i10 + 29;
            read = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            if ((i & Fields.RotationY) == 0) {
                int i13 = i10 + 97;
                read = i13 % Fields.SpotShadowColor;
                if (i13 % 2 != 0) {
                    getpostalcode.read(restrictconstraintsxf2oj5qdefault);
                    throw null;
                }
                zIconCompatParcelizer2 = getpostalcode.read(restrictconstraintsxf2oj5qdefault);
            } else {
                zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(restrictconstraintsxf2oj5qdefault);
            }
            if (zIconCompatParcelizer2) {
                int i14 = RemoteActionCompatParcelizer + 109;
                read = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                i4 = Fields.RotationX;
            } else {
                i4 = Fields.SpotShadowColor;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? 2048 : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.read(modifier) ? Fields.Clip : 8192;
        }
        if ((i2 & 9363) != 9362) {
            int i16 = RemoteActionCompatParcelizer + 113;
            read = i16 % Fields.SpotShadowColor;
            if (i16 % 2 != 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            int i17 = RemoteActionCompatParcelizer + 53;
            read = i17 % Fields.SpotShadowColor;
            if (i17 % 2 != 0) {
                String str = iszeroannotations.title;
                TapToPayTaskUiItem$PaymentType tapToPayTaskUiItem$PaymentType = getmaxheightimpl.paymentType;
                TapToPayTaskUiItem$PaymentType tapToPayTaskUiItem$PaymentType2 = TapToPayTaskUiItem$PaymentType.CARD;
                obj.hashCode();
                throw null;
            }
            String str2 = iszeroannotations.title;
            boolean z5 = getmaxheightimpl.paymentType == TapToPayTaskUiItem$PaymentType.CARD;
            Modifier.Companion companion = Modifier.Companion;
            companion.getClass();
            UtilNetworking1 utilNetworking1 = new UtilNetworking1(str2, companion, z5);
            String str3 = restrictconstraintsxf2oj5qdefault.title;
            if (getmaxheightimpl.paymentType == TapToPayTaskUiItem$PaymentType.CASH) {
                int i18 = read + 93;
                RemoteActionCompatParcelizer = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            UtilNetworking1 utilNetworking2 = new UtilNetworking1(str3, companion, z2);
            List list = SQLite.read(utilNetworking1, utilNetworking2);
            modifier.getClass();
            Modifier modifierWrite = SizeKt.write(modifier, 1.0f);
            boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(list);
            boolean zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(utilNetworking2);
            if ((i2 & 7168) == 2048) {
                int i20 = RemoteActionCompatParcelizer + 13;
                read = i20 % Fields.SpotShadowColor;
                if (i20 % 2 == 0) {
                    i3 = 4;
                    z3 = true;
                }
                if ((i2 & 14) != i3 || ((i2 & 8) != 0 && getpostalcode.IconCompatParcelizer(getmaxheightimpl))) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(utilNetworking1);
                objComponentActivity = getpostalcode.ComponentActivity();
                if (!(zIconCompatParcelizer | z3 | zIconCompatParcelizer3 | zIconCompatParcelizer4 | z4) || objComponentActivity == getCreditCardExpirationMonth.write) {
                    toAndroidVertexModeJOOmi9M toandroidvertexmodejoomi9m = new toAndroidVertexModeJOOmi9M(list, utilNetworking2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getmaxheightimpl, utilNetworking1, 7);
                    getpostalcode.write(toandroidvertexmodejoomi9m);
                    objComponentActivity = toandroidvertexmodejoomi9m;
                }
                ToggleKt.ToggleBig(list, true, modifierWrite, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode, 48);
            } else {
                int i21 = read + 29;
                RemoteActionCompatParcelizer = i21 % Fields.SpotShadowColor;
                if (i21 % 2 == 0) {
                    i3 = 4;
                    int i22 = 4 % 3;
                }
                z3 = false;
                if ((i2 & 14) != i3) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(utilNetworking1);
                objComponentActivity = getpostalcode.ComponentActivity();
                if (!zIconCompatParcelizer && !(z3 | zIconCompatParcelizer3 | zIconCompatParcelizer4 | z4)) {
                    toAndroidVertexModeJOOmi9M toandroidvertexmodejoomi9m2 = new toAndroidVertexModeJOOmi9M(list, utilNetworking2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getmaxheightimpl, utilNetworking1, 7);
                    getpostalcode.write(toandroidvertexmodejoomi9m2);
                    objComponentActivity = toandroidvertexmodejoomi9m2;
                } else {
                    toAndroidVertexModeJOOmi9M toandroidvertexmodejoomi9m3 = new toAndroidVertexModeJOOmi9M(list, utilNetworking2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getmaxheightimpl, utilNetworking1, 7);
                    getpostalcode.write(toandroidvertexmodejoomi9m3);
                    objComponentActivity = toandroidvertexmodejoomi9m3;
                }
                ToggleKt.ToggleBig(list, true, modifierWrite, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode, 48);
            }
            i3 = 4;
            z3 = false;
            if ((i2 & 14) != i3) {
                z4 = true;
            } else {
                z4 = true;
            }
            zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(utilNetworking1);
            objComponentActivity = getpostalcode.ComponentActivity();
            if (!zIconCompatParcelizer && !(z3 | zIconCompatParcelizer3 | zIconCompatParcelizer4 | z4)) {
                toAndroidVertexModeJOOmi9M toandroidvertexmodejoomi9m4 = new toAndroidVertexModeJOOmi9M(list, utilNetworking2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getmaxheightimpl, utilNetworking1, 7);
                getpostalcode.write(toandroidvertexmodejoomi9m4);
                objComponentActivity = toandroidvertexmodejoomi9m4;
            } else {
                toAndroidVertexModeJOOmi9M toandroidvertexmodejoomi9m5 = new toAndroidVertexModeJOOmi9M(list, utilNetworking2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getmaxheightimpl, utilNetworking1, 7);
                getpostalcode.write(toandroidvertexmodejoomi9m5);
                objComponentActivity = toandroidvertexmodejoomi9m5;
            }
            ToggleKt.ToggleBig(list, true, modifierWrite, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode, 48);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getPointerPrecisionfpxItnM((Object) getmaxheightimpl, (Object) iszeroannotations, (Object) restrictconstraintsxf2oj5qdefault, (Object) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, modifier, i, 23);
        }
    }

    public static final void TapToPayContent(final getMaxHeightimpl getmaxheightimpl, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, final Modifier modifier, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        getPostalCode getpostalcode;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        int i3;
        boolean zIconCompatParcelizer;
        int i4 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-837771714);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode2.read(getmaxheightimpl);
            } else {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(getmaxheightimpl);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0)) {
                int i5 = RemoteActionCompatParcelizer + 53;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        Object obj = null;
        if ((i & 384) == 0) {
            int i7 = read + 39;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                i2 |= getpostalcode2.read(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
            } else {
                getpostalcode2.read(modifier);
                obj.hashCode();
                throw null;
            }
        }
        if (getpostalcode2.write(i2 & 1, (i2 & 147) != 146)) {
            isZeroannotations iszeroannotations = getmaxheightimpl.cardUiItem;
            restrictConstraintsxF2OJ5Qdefault restrictconstraintsxf2oj5qdefault = getmaxheightimpl.cashUiItem;
            if (iszeroannotations != null && restrictconstraintsxf2oj5qdefault != null) {
                Modifier modifierWrite = AnimationModifierKt.write(SizeKt.write(modifier, 1.0f), null, 3);
                modifierWrite.getClass();
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode2, 0);
                int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite);
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
                if (getpostalcode2.read != null) {
                    getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode2.ComponentActivity) {
                        getpostalcode2.serializer(constructor);
                    } else {
                        getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    c8$$ExternalSyntheticOutline0.m(companion, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                    TextKt.m131TextNvy7gAk(getmaxheightimpl.title, null, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode2, 0, 0, 131066);
                    Modifier.Companion companion2 = Modifier.Companion;
                    Object[] objArr = {getpostalcode2, SizeKt.m75height3ABfNKs(companion2, Dimensions.getActionBarHideOffset)};
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr);
                    Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(companion2, 0.0f, Dimensions.getNestedScrollAxes, 1);
                    TapToPayTaskUiItem$Companion tapToPayTaskUiItem$Companion = getMaxHeightimpl.Companion;
                    int i8 = i2 & 14;
                    getpostalcode = getpostalcode2;
                    IconCompatParcelizer(getmaxheightimpl, iszeroannotations, restrictconstraintsxf2oj5qdefault, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, modifierM73paddingVpY3zN4$default, getpostalcode2, ((i2 << 6) & 7168) | i8);
                    Object[] objArr2 = {getpostalcode, SizeKt.m75height3ABfNKs(companion2, Dimensions.setSplitBackground)};
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr2);
                    int i9 = getSp.serializer[getmaxheightimpl.paymentType.ordinal()];
                    if (i9 != 1) {
                        int i10 = RemoteActionCompatParcelizer + 25;
                        read = i10 % Fields.SpotShadowColor;
                        if (i10 % 2 == 0 ? i9 == 2 : i9 == 4) {
                            getpostalcode.serializer(-773907809);
                            CardItemContent(getmaxheightimpl, null, getpostalcode, i8);
                            getpostalcode.IconCompatParcelizer(false);
                        } else {
                            throw d$$ExternalSyntheticOutline0.m(getpostalcode, -773913596, false);
                        }
                    } else {
                        getpostalcode.serializer(1778555555);
                        RemoteActionCompatParcelizer(getmaxheightimpl, null, getpostalcode, i8);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    getpostalcode.IconCompatParcelizer(true);
                } else {
                    SentryUUID.write();
                    throw null;
                }
            } else {
                Timber.RemoteActionCompatParcelizer.write(new Throwable("The Tap to Pay task does not have card or cash object"));
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode2.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat == null) {
                    return;
                }
                final int i11 = 0;
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.isSpecifiedR2X_6oannotations
                    private static int MediaBrowserCompatMediaItem = 1;
                    private static int MediaDescriptionCompat;

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj2, Object obj3) {
                        int i12 = 2 % 2;
                        int i13 = MediaDescriptionCompat + 51;
                        MediaBrowserCompatMediaItem = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i14 = i13 % 2;
                        int i15 = i11;
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        int i16 = i;
                        androidx.compose.ui.Modifier modifier2 = modifier;
                        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde2 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
                        getMaxHeightimpl getmaxheightimpl2 = getmaxheightimpl;
                        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj2;
                        ((Integer) obj3).getClass();
                        if (i15 == 0) {
                            TapToPayContentKt.TapToPayContent(getmaxheightimpl2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde2, modifier2, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i16 | 1));
                            return createfromparcel;
                        }
                        TapToPayContentKt.TapToPayContent(getmaxheightimpl2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde2, modifier2, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i16 | 1));
                        int i17 = MediaBrowserCompatMediaItem + 111;
                        MediaDescriptionCompat = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i17 % 2 != 0) {
                            int i18 = 33 / 0;
                        }
                        return createfromparcel;
                    }
                };
            }
            gethandleruiannotationsMediaDescriptionCompat.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
        }
        getpostalcode = getpostalcode2;
        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            final int i12 = 1;
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.isSpecifiedR2X_6oannotations
                private static int MediaBrowserCompatMediaItem = 1;
                private static int MediaDescriptionCompat;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj2, Object obj3) {
                    int i13 = 2 % 2;
                    int i14 = MediaDescriptionCompat + 51;
                    MediaBrowserCompatMediaItem = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    int i16 = i12;
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i17 = i;
                    androidx.compose.ui.Modifier modifier2 = modifier;
                    r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde2 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
                    getMaxHeightimpl getmaxheightimpl2 = getmaxheightimpl;
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj2;
                    ((Integer) obj3).getClass();
                    if (i16 == 0) {
                        TapToPayContentKt.TapToPayContent(getmaxheightimpl2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde2, modifier2, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i17 | 1));
                        return createfromparcel;
                    }
                    TapToPayContentKt.TapToPayContent(getmaxheightimpl2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde2, modifier2, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i17 | 1));
                    int i18 = MediaBrowserCompatMediaItem + 111;
                    MediaDescriptionCompat = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i18 % 2 != 0) {
                        int i19 = 33 / 0;
                    }
                    return createfromparcel;
                }
            };
            gethandleruiannotationsMediaDescriptionCompat.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
        }
    }
}
