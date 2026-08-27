package com.roadrunner.rrds.compose.component.indicators;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.indicators.ChipsKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.SingleThreadCachedScheduler1;
import o.TapGestureDetectorKtdetectTapGestures21;
import o.TextFieldDefaults;
import o.buildMapping;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.onViewAttachedToWindow;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.scheduleFutureWithFixedDelay;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ChipsKt {
    private static int read = 0;
    private static int write = 1;

    public static final void write(String str, long j, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        int i3 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1492956835);
        if ((i & 6) == 0) {
            int i4 = write + 109;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            i2 = i | (getpostalcode2.read(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i6 = read + 25;
            write = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                getpostalcode2.serializer(j);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i2 |= getpostalcode2.serializer(j) ? 32 : 16;
        }
        int i7 = i2;
        if ((i7 & 19) != 18) {
            z = true;
        } else {
            int i8 = write + 121;
            read = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            z = false;
        }
        if (getpostalcode2.write(i7 & 1, z)) {
            getpostalcode = getpostalcode2;
            TextKt.m131TextNvy7gAk(str, null, j, 0L, null, null, 0L, null, 0L, TextOverflow.Companion.m3569getEllipsisgIe3tQ8(), false, 1, 0, null, (TextStyle) performLayout.enterPictureInPictureMode.MediaSessionCompatResultReceiverWrapper(), getpostalcode, (i7 & 14) | ((i7 << 3) & 896), 24960, 110586);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new scheduleFutureWithFixedDelay(j, str, i, 0);
        }
    }

    public static final void read(final int i, final boolean z, final long j, getBirthDateFull getbirthdatefull, final int i2) {
        int i3;
        boolean z2;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1986277185);
        if ((i2 & 6) == 0) {
            i3 = (getpostalcode.read(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            int i5 = read + 57;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i3 |= !getpostalcode.write(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= getpostalcode.serializer(j) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i3 & 147) != 146) {
            z2 = true;
        } else {
            int i7 = write + 21;
            read = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            z2 = false;
        }
        if (!getpostalcode.write(i3 & 1, z2)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else if (i != 0) {
            getpostalcode.serializer(1419305283);
            ImageKt.Image(PainterResources_androidKt.painterResource(z ? R.drawable.ic_bold_small_tick_thin : i, getpostalcode, 0), null, null, null, null, 0.0f, ColorFilter.Companion.m763tintxETnrds$default(ColorFilter.Companion, j, 0, 2, null), getpostalcode, Painter.$stable | 48, 60);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m83size3ABfNKs(Modifier.Companion, Dimensions.supportNavigateUpTo)});
            getpostalcode.IconCompatParcelizer(false);
        } else {
            getpostalcode.serializer(1419641633);
            getpostalcode.IconCompatParcelizer(false);
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.access302
                private static int MediaSessionCompatQueueItem = 1;
                private static int read;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i9 = 2 % 2;
                    int i10 = MediaSessionCompatQueueItem + 77;
                    read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    ((Integer) obj2).intValue();
                    ChipsKt.read(i, z, j, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i2 | 1));
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i12 = read + 15;
                    MediaSessionCompatQueueItem = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    return createfromparcel;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081  */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:47:0x008d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX WARN: Code duplicated, block: B:53:0x009d  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:73:0x0106  */
    /* JADX WARN: Code duplicated, block: B:74:0x0122  */
    /* JADX WARN: Code duplicated, block: B:76:0x016a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0174  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    public static final void RemoteActionCompatParcelizer(final String str, final boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, int i, getBirthDateFull getbirthdatefull, int i2, int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        Modifier modifier3;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        Modifier modifier4;
        int i9;
        float f;
        int i10;
        long jOnSupportActionModeStarted;
        long jDispatchResult;
        int i11;
        int i12 = 2 % 2;
        str.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1065066483);
        if ((i2 & 6) == 0) {
            i4 = (getpostalcode.read(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= getpostalcode.write(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i13 = i3 & 8;
        if (i13 == 0) {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i4 |= getpostalcode.read(modifier2) ? Fields.CameraDistance : Fields.RotationZ;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i2 & 24576) == 0) {
                    i6 = i;
                    if (getpostalcode.read(i6)) {
                        i7 = Fields.Clip;
                    } else {
                        i7 = 8192;
                    }
                    i4 |= i7;
                }
                i8 = i4;
                if ((i8 & 9363) != 9362) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (getpostalcode.write(i8 & 1, z2)) {
                    if (i13 != 0) {
                        modifier4 = Modifier.Companion;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i5 != 0) {
                        i9 = 0;
                    } else {
                        i9 = i6;
                    }
                    if (i9 != 0) {
                        f = Dimensions.invalidateOptionsMenu;
                    } else {
                        f = Dimensions.getDelegate;
                    }
                    float f2 = f;
                    i10 = write;
                    int i14 = i10 + 119;
                    read = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    if (z) {
                        int i16 = i10 + 105;
                        read = i16 % Fields.SpotShadowColor;
                        int i17 = i16 % 2;
                        getpostalcode.serializer(1326682892);
                        jOnSupportActionModeStarted = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onLocalesChanged();
                        i11 = read + 43;
                        write = i11 % Fields.SpotShadowColor;
                        if (i11 % 2 == 0) {
                            int i18 = 2 / 5;
                        }
                    } else {
                        getpostalcode.serializer(1326683886);
                        jOnSupportActionModeStarted = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onSupportActionModeStarted();
                    }
                    final long j = jOnSupportActionModeStarted;
                    getpostalcode.IconCompatParcelizer(false);
                    if (z) {
                        int i19 = write + 103;
                        read = i19 % Fields.SpotShadowColor;
                        int i20 = i19 % 2;
                        getpostalcode.serializer(1326685932);
                        jDispatchResult = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).r8lambdaTWvtyPFkiHdx0RbtWVLevVLT0();
                    } else {
                        getpostalcode.serializer(1326686926);
                        jDispatchResult = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).dispatchResult();
                    }
                    final long j2 = jDispatchResult;
                    getpostalcode.IconCompatParcelizer(false);
                    final int i21 = i9;
                    int i22 = i8 >> 3;
                    m5042ChipContainer3GLzNTs(z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier4, f2, 0.0f, ExtrasKt.write(1256497615, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.tryExecuteRunnable
                        private static int MediaDescriptionCompat = 1;
                        private static int MediaSessionCompatQueueItem;

                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public final Object invoke(Object obj, Object obj2) {
                            boolean z3;
                            int i23 = 2 % 2;
                            int i24 = MediaDescriptionCompat + 15;
                            MediaSessionCompatQueueItem = i24 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i25 = i24 % 2;
                            getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if ((iIntValue & 3) != 2) {
                                int i26 = MediaSessionCompatQueueItem + 91;
                                int i27 = i26 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                MediaDescriptionCompat = i27;
                                z3 = i26 % 2 != 0;
                                int i28 = i27 + 97;
                                MediaSessionCompatQueueItem = i28 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i29 = i28 % 2;
                            } else {
                                z3 = false;
                            }
                            getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                            if (getpostalcode2.write(iIntValue & 1, z3)) {
                                int i30 = MediaDescriptionCompat + 81;
                                MediaSessionCompatQueueItem = i30 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i31 = i30 % 2;
                                ChipsKt.read(i21, z, j2, getpostalcode2, 0);
                                String upperCase = str.toUpperCase(java.util.Locale.ROOT);
                                upperCase.getClass();
                                ChipsKt.write(upperCase, j, getpostalcode2, 0);
                            } else {
                                getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                            }
                            return createFromParcel.INSTANCE;
                        }
                    }, getpostalcode), getpostalcode, (i22 & 14) | 1572864 | (i22 & 112) | (i22 & 896));
                    modifier3 = modifier4;
                    i6 = i9;
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    modifier3 = modifier2;
                }
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new SingleThreadCachedScheduler1(str, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier3, i6, i2, i3);
                }
            }
            i4 |= 24576;
            i6 = i;
            i8 = i4;
            if ((i8 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (getpostalcode.write(i8 & 1, z2)) {
                if (i13 != 0) {
                    modifier4 = Modifier.Companion;
                } else {
                    modifier4 = modifier2;
                }
                if (i5 != 0) {
                    i9 = 0;
                } else {
                    i9 = i6;
                }
                if (i9 != 0) {
                    f = Dimensions.invalidateOptionsMenu;
                } else {
                    f = Dimensions.getDelegate;
                }
                float f3 = f;
                i10 = write;
                int i110 = i10 + 119;
                read = i110 % Fields.SpotShadowColor;
                int i111 = i110 % 2;
                if (z) {
                    int i112 = i10 + 105;
                    read = i112 % Fields.SpotShadowColor;
                    int i113 = i112 % 2;
                    getpostalcode.serializer(1326682892);
                    jOnSupportActionModeStarted = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onLocalesChanged();
                    i11 = read + 43;
                    write = i11 % Fields.SpotShadowColor;
                    if (i11 % 2 == 0) {
                        int i114 = 2 / 5;
                    }
                } else {
                    getpostalcode.serializer(1326683886);
                    jOnSupportActionModeStarted = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onSupportActionModeStarted();
                }
                final long j3 = jOnSupportActionModeStarted;
                getpostalcode.IconCompatParcelizer(false);
                if (z) {
                    int i115 = write + 103;
                    read = i115 % Fields.SpotShadowColor;
                    int i23 = i115 % 2;
                    getpostalcode.serializer(1326685932);
                    jDispatchResult = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).r8lambdaTWvtyPFkiHdx0RbtWVLevVLT0();
                } else {
                    getpostalcode.serializer(1326686926);
                    jDispatchResult = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).dispatchResult();
                }
                final long j4 = jDispatchResult;
                getpostalcode.IconCompatParcelizer(false);
                final int i24 = i9;
                int i25 = i8 >> 3;
                m5042ChipContainer3GLzNTs(z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier4, f3, 0.0f, ExtrasKt.write(1256497615, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.tryExecuteRunnable
                    private static int MediaDescriptionCompat = 1;
                    private static int MediaSessionCompatQueueItem;

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        boolean z3;
                        int i26 = 2 % 2;
                        int i27 = MediaDescriptionCompat + 15;
                        MediaSessionCompatQueueItem = i27 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i28 = i27 % 2;
                        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if ((iIntValue & 3) != 2) {
                            int i29 = MediaSessionCompatQueueItem + 91;
                            int i210 = i29 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            MediaDescriptionCompat = i210;
                            z3 = i29 % 2 != 0;
                            int i211 = i210 + 97;
                            MediaSessionCompatQueueItem = i211 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i212 = i211 % 2;
                        } else {
                            z3 = false;
                        }
                        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                        if (getpostalcode2.write(iIntValue & 1, z3)) {
                            int i30 = MediaDescriptionCompat + 81;
                            MediaSessionCompatQueueItem = i30 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i31 = i30 % 2;
                            ChipsKt.read(i24, z, j4, getpostalcode2, 0);
                            String upperCase = str.toUpperCase(java.util.Locale.ROOT);
                            upperCase.getClass();
                            ChipsKt.write(upperCase, j3, getpostalcode2, 0);
                        } else {
                            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        }
                        return createFromParcel.INSTANCE;
                    }
                }, getpostalcode), getpostalcode, (i25 & 14) | 1572864 | (i25 & 112) | (i25 & 896));
                modifier3 = modifier4;
                i6 = i9;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier3 = modifier2;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new SingleThreadCachedScheduler1(str, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier3, i6, i2, i3);
            }
        }
        int i26 = read + 7;
        write = i26 % Fields.SpotShadowColor;
        i4 = i26 % 2 == 0 ? i4 | 4764 : i4 | 3072;
        modifier2 = modifier;
        i5 = i3 & 16;
        if (i5 != 0) {
            if ((i2 & 24576) == 0) {
                i6 = i;
                if (getpostalcode.read(i6)) {
                    i7 = Fields.Clip;
                } else {
                    i7 = 8192;
                }
                i4 |= i7;
            }
            i8 = i4;
            if ((i8 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (getpostalcode.write(i8 & 1, z2)) {
                if (i13 != 0) {
                    modifier4 = Modifier.Companion;
                } else {
                    modifier4 = modifier2;
                }
                if (i5 != 0) {
                    i9 = 0;
                } else {
                    i9 = i6;
                }
                if (i9 != 0) {
                    f = Dimensions.invalidateOptionsMenu;
                } else {
                    f = Dimensions.getDelegate;
                }
                float f4 = f;
                i10 = write;
                int i116 = i10 + 119;
                read = i116 % Fields.SpotShadowColor;
                int i117 = i116 % 2;
                if (z) {
                    int i118 = i10 + 105;
                    read = i118 % Fields.SpotShadowColor;
                    int i119 = i118 % 2;
                    getpostalcode.serializer(1326682892);
                    jOnSupportActionModeStarted = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onLocalesChanged();
                    i11 = read + 43;
                    write = i11 % Fields.SpotShadowColor;
                    if (i11 % 2 == 0) {
                        int i1110 = 2 / 5;
                    }
                } else {
                    getpostalcode.serializer(1326683886);
                    jOnSupportActionModeStarted = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onSupportActionModeStarted();
                }
                final long j5 = jOnSupportActionModeStarted;
                getpostalcode.IconCompatParcelizer(false);
                if (z) {
                    int i1111 = write + 103;
                    read = i1111 % Fields.SpotShadowColor;
                    int i27 = i1111 % 2;
                    getpostalcode.serializer(1326685932);
                    jDispatchResult = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).r8lambdaTWvtyPFkiHdx0RbtWVLevVLT0();
                } else {
                    getpostalcode.serializer(1326686926);
                    jDispatchResult = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).dispatchResult();
                }
                final long j6 = jDispatchResult;
                getpostalcode.IconCompatParcelizer(false);
                final int i28 = i9;
                int i29 = i8 >> 3;
                m5042ChipContainer3GLzNTs(z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier4, f4, 0.0f, ExtrasKt.write(1256497615, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.tryExecuteRunnable
                    private static int MediaDescriptionCompat = 1;
                    private static int MediaSessionCompatQueueItem;

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        boolean z3;
                        int i210 = 2 % 2;
                        int i211 = MediaDescriptionCompat + 15;
                        MediaSessionCompatQueueItem = i211 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i212 = i211 % 2;
                        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if ((iIntValue & 3) != 2) {
                            int i213 = MediaSessionCompatQueueItem + 91;
                            int i214 = i213 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            MediaDescriptionCompat = i214;
                            z3 = i213 % 2 != 0;
                            int i215 = i214 + 97;
                            MediaSessionCompatQueueItem = i215 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i216 = i215 % 2;
                        } else {
                            z3 = false;
                        }
                        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                        if (getpostalcode2.write(iIntValue & 1, z3)) {
                            int i30 = MediaDescriptionCompat + 81;
                            MediaSessionCompatQueueItem = i30 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i31 = i30 % 2;
                            ChipsKt.read(i28, z, j6, getpostalcode2, 0);
                            String upperCase = str.toUpperCase(java.util.Locale.ROOT);
                            upperCase.getClass();
                            ChipsKt.write(upperCase, j5, getpostalcode2, 0);
                        } else {
                            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        }
                        return createFromParcel.INSTANCE;
                    }
                }, getpostalcode), getpostalcode, (i29 & 14) | 1572864 | (i29 & 112) | (i29 & 896));
                modifier3 = modifier4;
                i6 = i9;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier3 = modifier2;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new SingleThreadCachedScheduler1(str, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier3, i6, i2, i3);
            }
        }
        i4 |= 24576;
        i6 = i;
        i8 = i4;
        if ((i8 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (getpostalcode.write(i8 & 1, z2)) {
            if (i13 != 0) {
                modifier4 = Modifier.Companion;
            } else {
                modifier4 = modifier2;
            }
            if (i5 != 0) {
                i9 = 0;
            } else {
                i9 = i6;
            }
            if (i9 != 0) {
                f = Dimensions.invalidateOptionsMenu;
            } else {
                f = Dimensions.getDelegate;
            }
            float f5 = f;
            i10 = write;
            int i1112 = i10 + 119;
            read = i1112 % Fields.SpotShadowColor;
            int i1113 = i1112 % 2;
            if (z) {
                int i1114 = i10 + 105;
                read = i1114 % Fields.SpotShadowColor;
                int i1115 = i1114 % 2;
                getpostalcode.serializer(1326682892);
                jOnSupportActionModeStarted = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onLocalesChanged();
                i11 = read + 43;
                write = i11 % Fields.SpotShadowColor;
                if (i11 % 2 == 0) {
                    int i1116 = 2 / 5;
                }
            } else {
                getpostalcode.serializer(1326683886);
                jOnSupportActionModeStarted = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onSupportActionModeStarted();
            }
            final long j7 = jOnSupportActionModeStarted;
            getpostalcode.IconCompatParcelizer(false);
            if (z) {
                int i1117 = write + 103;
                read = i1117 % Fields.SpotShadowColor;
                int i210 = i1117 % 2;
                getpostalcode.serializer(1326685932);
                jDispatchResult = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).r8lambdaTWvtyPFkiHdx0RbtWVLevVLT0();
            } else {
                getpostalcode.serializer(1326686926);
                jDispatchResult = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).dispatchResult();
            }
            final long j8 = jDispatchResult;
            getpostalcode.IconCompatParcelizer(false);
            final int i211 = i9;
            int i212 = i8 >> 3;
            m5042ChipContainer3GLzNTs(z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier4, f5, 0.0f, ExtrasKt.write(1256497615, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.tryExecuteRunnable
                private static int MediaDescriptionCompat = 1;
                private static int MediaSessionCompatQueueItem;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    boolean z3;
                    int i213 = 2 % 2;
                    int i214 = MediaDescriptionCompat + 15;
                    MediaSessionCompatQueueItem = i214 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i215 = i214 % 2;
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if ((iIntValue & 3) != 2) {
                        int i216 = MediaSessionCompatQueueItem + 91;
                        int i217 = i216 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        MediaDescriptionCompat = i217;
                        z3 = i216 % 2 != 0;
                        int i218 = i217 + 97;
                        MediaSessionCompatQueueItem = i218 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i219 = i218 % 2;
                    } else {
                        z3 = false;
                    }
                    getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                    if (getpostalcode2.write(iIntValue & 1, z3)) {
                        int i30 = MediaDescriptionCompat + 81;
                        MediaSessionCompatQueueItem = i30 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i31 = i30 % 2;
                        ChipsKt.read(i211, z, j8, getpostalcode2, 0);
                        String upperCase = str.toUpperCase(java.util.Locale.ROOT);
                        upperCase.getClass();
                        ChipsKt.write(upperCase, j7, getpostalcode2, 0);
                    } else {
                        getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    }
                    return createFromParcel.INSTANCE;
                }
            }, getpostalcode), getpostalcode, (i212 & 14) | 1572864 | (i212 & 112) | (i212 & 896));
            modifier3 = modifier4;
            i6 = i9;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier3 = modifier2;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new SingleThreadCachedScheduler1(str, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier3, i6, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ChipContainer-3GLzNTs, reason: not valid java name */
    public static final void m5042ChipContainer3GLzNTs(final boolean z, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final Modifier modifier, final float f, float f2, final DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        final float f3;
        int i3;
        long jCreateFullyDrawnExecutor;
        long jPeekAvailableContext;
        int i4;
        int i5;
        int i6 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1404733087);
        if ((i & 6) == 0) {
            if (getpostalcode.write(z)) {
                int i7 = read + 11;
                write = i7 % Fields.SpotShadowColor;
                i5 = i7 % 2 == 0 ? 3 : 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= !(getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ^ true) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.read(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i8 = i2 | 3072;
        if ((i & 24576) == 0) {
            int i9 = read + 5;
            write = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            if (getpostalcode.serializer(f)) {
                int i11 = write + 25;
                read = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i4 = Fields.Clip;
            } else {
                i4 = 8192;
            }
            i8 |= i4;
        }
        if ((196608 & i) == 0) {
            int i13 = write + 79;
            read = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            i8 |= 65536;
        }
        if ((1572864 & i) == 0) {
            int i15 = write + 43;
            read = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            i8 |= !getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode) ? Fields.BlendMode : 1048576;
        }
        if (getpostalcode.write(i8 & 1, (599187 & i8) != 599186)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) != 0 && !getpostalcode.PlaybackStateCompat()) {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                i3 = i8 & (-458753);
                f3 = f2;
            } else {
                i3 = i8 & (-458753);
                f3 = Dimensions.getMenuInflater;
            }
            getpostalcode.RemoteActionCompatParcelizer();
            if (!z) {
                getpostalcode.serializer(-1757474358);
                jCreateFullyDrawnExecutor = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).createFullyDrawnExecutor();
                getpostalcode.IconCompatParcelizer(false);
            } else {
                int i17 = read + 1;
                write = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                getpostalcode.serializer(-1757588748);
                getpostalcode.serializer(1328779070);
                jCreateFullyDrawnExecutor = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).defaultViewModelProviderFactory_delegatelambda0();
                getpostalcode.IconCompatParcelizer(false);
                getpostalcode.IconCompatParcelizer(false);
            }
            onViewAttachedToWindow onviewattachedtowindowIconCompatParcelizer = TapGestureDetectorKtdetectTapGestures21.IconCompatParcelizer(jCreateFullyDrawnExecutor, null, null, null, getpostalcode, 0, 14);
            if (z) {
                getpostalcode.serializer(-1757371996);
                getpostalcode.serializer(1328785818);
                jPeekAvailableContext = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).registerForActivityResult();
                getpostalcode.IconCompatParcelizer(false);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-1757273726);
                jPeekAvailableContext = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).peekAvailableContext();
                getpostalcode.IconCompatParcelizer(false);
            }
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = c8$$ExternalSyntheticOutline0.m(getpostalcode);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) objComponentActivity;
            float f4 = Dimensions.MediaSessionCompatQueueItem;
            float f5 = Dimensions._init_lambda2;
            Modifier modifier2 = PaddingKt.read(SizeKt.m75height3ABfNKs(BackgroundKt.m20backgroundbw27NRU(ClickableKt.serializer(ClipKt.clip(BorderKt.write(modifier, f4, jPeekAvailableContext, RoundedCornerShapeKt.IconCompatParcelizer(f5)), RoundedCornerShapeKt.IconCompatParcelizer(f5)), mutableInteractionSourceImpl, null, false, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, 28), ((Color) onviewattachedtowindowIconCompatParcelizer.getValue()).m732unboximpl(), RectangleShapeKt.getRectangleShape()), Dimensions.onNewIntent), f, Dimensions.findViewById, f3, Dimensions.getResources);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, Alignment.Companion.getCenterVertically(), getpostalcode, 54);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier2);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                dragAndDropTargetModifierNode.invoke(getpostalcode, Integer.valueOf((i3 >> 18) & 14));
                getpostalcode.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            f3 = f2;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.rejectedExecution
                private static int MediaMetadataCompat = 0;
                private static int RatingCompat = 1;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i19 = 2 % 2;
                    int i20 = MediaMetadataCompat + 87;
                    RatingCompat = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i21 = i20 % 2;
                    ((Integer) obj2).getClass();
                    ChipsKt.m5042ChipContainer3GLzNTs(z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, f, f3, dragAndDropTargetModifierNode, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i22 = MediaMetadataCompat + 1;
                    RatingCompat = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i22 % 2 != 0) {
                        return createfromparcel;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            };
        }
    }
}
