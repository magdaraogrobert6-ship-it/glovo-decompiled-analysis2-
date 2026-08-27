package com.roadrunner.rrds.compose.component.forms.pattern;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.b8$$ExternalSyntheticLambda4;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.logistics.rider.glovo.R;
import com.roadrunner.rrds.compose.component.forms.pattern.LoadingFullScreenKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.Signer;
import o.buildMapping;
import o.createFromParcel;
import o.generateHttpsURLConnection;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getLayers;
import o.getNewPassword;
import o.getNonZeroRgk1Os;
import o.getPostalCode;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import okio.Okio;

/* JADX INFO: loaded from: classes3.dex */
public abstract class LoadingFullScreenKt {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;

    public static final void read(Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        int i3 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-683251715);
        if ((i & 6) == 0) {
            i2 = (getpostalcode2.read(modifier) ? 4 : 2) | i;
            int i4 = IconCompatParcelizer + 19;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            i2 = i;
        }
        if (getpostalcode2.write(i2 & 1, (i2 & 3) != 2)) {
            ColorFilter colorFilterM763tintxETnrds$default = ColorFilter.Companion.m763tintxETnrds$default(ColorFilter.Companion, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0, 2, null);
            getpostalcode = getpostalcode2;
            getNonZeroRgk1Os.write(Integer.valueOf(R.drawable.ic_bold_extra_large_sync_two_direction), "Loading", modifier, Okio.RemoteActionCompatParcelizer(R.drawable.ic_bold_extra_large_sync_two_direction, getpostalcode2, 0), null, null, null, null, ContentScale.Companion.getNone(), colorFilterM763tintxETnrds$default, getpostalcode2, ((i2 << 6) & 896) | 48 | (Painter.$stable << 9), 6, 27632);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i6 = RemoteActionCompatParcelizer + 21;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getLayers(modifier, i, 27);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:30:0x006e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    /* JADX WARN: Code duplicated, block: B:34:0x0078  */
    /* JADX WARN: Code duplicated, block: B:36:0x0080  */
    /* JADX WARN: Code duplicated, block: B:38:0x008a  */
    /* JADX WARN: Code duplicated, block: B:39:0x008d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0090  */
    /* JADX WARN: Code duplicated, block: B:45:0x009a  */
    /* JADX WARN: Code duplicated, block: B:47:0x009f  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00be  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00db  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:76:0x012b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0133  */
    /* JADX WARN: Code duplicated, block: B:79:0x0137  */
    /* JADX WARN: Code duplicated, block: B:82:0x0157  */
    /* JADX WARN: Code duplicated, block: B:84:0x0165  */
    /* JADX WARN: Code duplicated, block: B:87:0x0174  */
    /* JADX WARN: Code duplicated, block: B:92:0x018c  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:97:0x01be  */
    /* JADX WARN: Code duplicated, block: B:99:0x01c3  */
    /* JADX INFO: renamed from: LoadingFullScreen-Sj8uqqQ, reason: not valid java name */
    public static final void m5039LoadingFullScreenSj8uqqQ(final boolean z, Modifier modifier, String str, Color color, final DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        String str2;
        int i5;
        int i6;
        int i7;
        Color color2;
        int i8;
        boolean z2;
        final String str3;
        final Color color3;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        MeasurePolicy measurePolicy;
        int iHashCode;
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer;
        Modifier modifierMaterializeModifier;
        ComposeUiNode.Companion companion;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor;
        AndroidContentCaptureManager androidContentCaptureManager;
        Object objComponentActivity;
        Modifier modifier3;
        Object objComponentActivity2;
        Modifier modifierM20backgroundbw27NRU;
        int i9;
        int i10;
        int i11;
        int i12 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(298416412);
        if ((i & 6) == 0) {
            int i13 = IconCompatParcelizer + 67;
            RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
            if (i13 % 2 != 0) {
                int i14 = 75 / 0;
                if (getpostalcode.write(z)) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
            } else if (getpostalcode.write(z)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i3 = i11 | i;
        } else {
            i3 = i;
        }
        int i15 = i2 & 2;
        if (i15 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= getpostalcode.read(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    str2 = str;
                    if (getpostalcode.read(str2)) {
                        i6 = IconCompatParcelizer + 1;
                        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                        if (i6 % 2 != 0) {
                            i5 = 27399;
                        } else {
                            i5 = Fields.RotationX;
                        }
                    } else {
                        i5 = Fields.SpotShadowColor;
                    }
                    i3 |= i5;
                }
                i7 = i2 & 8;
                if (i7 != 0) {
                    if ((i & 3072) == 0) {
                        color2 = color;
                        if (getpostalcode.read(color2)) {
                            int i16 = RemoteActionCompatParcelizer + 17;
                            IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                            int i17 = i16 % 2;
                            i8 = Fields.CameraDistance;
                        } else {
                            i8 = Fields.RotationZ;
                        }
                        i3 |= i8;
                    }
                    if ((i & 24576) == 0) {
                        if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                            i9 = Fields.Clip;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 9363) != 9362) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (getpostalcode.write(i3 & 1, z2)) {
                        int i18 = RemoteActionCompatParcelizer + 83;
                        IconCompatParcelizer = i18 % Fields.SpotShadowColor;
                        int i19 = i18 % 2;
                        if (i15 != 0) {
                            modifier2 = Modifier.Companion;
                        }
                        if (i4 != 0) {
                            int i20 = IconCompatParcelizer + 31;
                            RemoteActionCompatParcelizer = i20 % Fields.SpotShadowColor;
                            int i21 = i20 % 2;
                            str2 = "";
                        }
                        if (i7 != 0) {
                            int i22 = IconCompatParcelizer + 75;
                            RemoteActionCompatParcelizer = i22 % Fields.SpotShadowColor;
                            int i23 = i22 % 2;
                            color2 = null;
                        }
                        Modifier modifierThen = modifier2.then(SizeKt.read);
                        measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
                        iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                        dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                        modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen);
                        companion = ComposeUiNode.Companion;
                        constructor = companion.getConstructor();
                        if (getpostalcode.read != null) {
                            SentryUUID.write();
                            throw null;
                        }
                        getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                        if (!getpostalcode.ComponentActivity) {
                            getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        } else {
                            getpostalcode.serializer(constructor);
                        }
                        af$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                        AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                        dragAndDropTargetModifierNode.invoke(getpostalcode, Integer.valueOf((i3 >> 12) & 14));
                        androidContentCaptureManager = getCreditCardExpirationMonth.write;
                        if (z) {
                            getpostalcode.serializer(51794722);
                            modifier3 = Modifier.Companion;
                            objComponentActivity2 = getpostalcode.ComponentActivity();
                            if (objComponentActivity2 == androidContentCaptureManager) {
                                objComponentActivity2 = generateHttpsURLConnection.read;
                                getpostalcode.write(objComponentActivity2);
                            }
                            Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifier3, createFromParcel.INSTANCE, (PointerInputEventHandler) objComponentActivity2);
                            if (color2 != null && (modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifier3, color2.m732unboximpl(), RectangleShapeKt.getRectangleShape())) != null) {
                                modifier3 = modifierM20backgroundbw27NRU;
                            }
                            Signer.IconCompatParcelizer(modifierPointerInput.then(modifier3), getpostalcode, 0);
                            getpostalcode.IconCompatParcelizer(false);
                        } else {
                            getpostalcode.serializer(52081100);
                            getpostalcode.IconCompatParcelizer(false);
                        }
                        LoadingView(((i3 << 3) & 112) | 6 | (i3 & 896), getpostalcode, str2, z);
                        getpostalcode.IconCompatParcelizer(true);
                        objComponentActivity = getpostalcode.ComponentActivity();
                        if (objComponentActivity == androidContentCaptureManager) {
                            objComponentActivity = new b8$$ExternalSyntheticLambda4(1);
                            getpostalcode.write(objComponentActivity);
                        }
                        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(z, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, (i3 & 14) | 48, 0);
                    } else {
                        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    }
                    str3 = str2;
                    color3 = color2;
                    gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                    if (gethandleruiannotationsMediaDescriptionCompat != null) {
                        final Modifier modifier4 = modifier2;
                        gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.UtilNetworkingIHttpsURLConnectionProvider
                            private static int MediaDescriptionCompat = 0;
                            private static int RatingCompat = 1;

                            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                            public final Object invoke(Object obj, Object obj2) {
                                int i24 = 2 % 2;
                                int i25 = MediaDescriptionCompat + 49;
                                RatingCompat = i25 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i26 = i25 % 2;
                                ((Integer) obj2).getClass();
                                LoadingFullScreenKt.m5039LoadingFullScreenSj8uqqQ(z, modifier4, str3, color3, dragAndDropTargetModifierNode, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                int i27 = MediaDescriptionCompat + 17;
                                RatingCompat = i27 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i28 = i27 % 2;
                                return createfromparcel;
                            }
                        };
                    }
                }
                i3 |= 3072;
                color2 = color;
                if ((i & 24576) == 0) {
                    if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                        i9 = Fields.Clip;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i3 & 9363) != 9362) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (getpostalcode.write(i3 & 1, z2)) {
                    int i110 = RemoteActionCompatParcelizer + 83;
                    IconCompatParcelizer = i110 % Fields.SpotShadowColor;
                    int i111 = i110 % 2;
                    if (i15 != 0) {
                        modifier2 = Modifier.Companion;
                    }
                    if (i4 != 0) {
                        int i24 = IconCompatParcelizer + 31;
                        RemoteActionCompatParcelizer = i24 % Fields.SpotShadowColor;
                        int i25 = i24 % 2;
                        str2 = "";
                    }
                    if (i7 != 0) {
                        int i26 = IconCompatParcelizer + 75;
                        RemoteActionCompatParcelizer = i26 % Fields.SpotShadowColor;
                        int i27 = i26 % 2;
                        color2 = null;
                    }
                    Modifier modifierThen2 = modifier2.then(SizeKt.read);
                    measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
                    iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                    dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen2);
                    companion = ComposeUiNode.Companion;
                    constructor = companion.getConstructor();
                    if (getpostalcode.read != null) {
                        SentryUUID.write();
                        throw null;
                    }
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (!getpostalcode.ComponentActivity) {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    } else {
                        getpostalcode.serializer(constructor);
                    }
                    af$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                    dragAndDropTargetModifierNode.invoke(getpostalcode, Integer.valueOf((i3 >> 12) & 14));
                    androidContentCaptureManager = getCreditCardExpirationMonth.write;
                    if (z) {
                        getpostalcode.serializer(51794722);
                        modifier3 = Modifier.Companion;
                        objComponentActivity2 = getpostalcode.ComponentActivity();
                        if (objComponentActivity2 == androidContentCaptureManager) {
                            objComponentActivity2 = generateHttpsURLConnection.read;
                            getpostalcode.write(objComponentActivity2);
                        }
                        Modifier modifierPointerInput2 = SuspendingPointerInputFilterKt.pointerInput(modifier3, createFromParcel.INSTANCE, (PointerInputEventHandler) objComponentActivity2);
                        if (color2 != null) {
                            modifier3 = modifierM20backgroundbw27NRU;
                        }
                        Signer.IconCompatParcelizer(modifierPointerInput2.then(modifier3), getpostalcode, 0);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        getpostalcode.serializer(52081100);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    LoadingView(((i3 << 3) & 112) | 6 | (i3 & 896), getpostalcode, str2, z);
                    getpostalcode.IconCompatParcelizer(true);
                    objComponentActivity = getpostalcode.ComponentActivity();
                    if (objComponentActivity == androidContentCaptureManager) {
                        objComponentActivity = new b8$$ExternalSyntheticLambda4(1);
                        getpostalcode.write(objComponentActivity);
                    }
                    DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(z, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, (i3 & 14) | 48, 0);
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                str3 = str2;
                color3 = color2;
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    final Modifier modifier5 = modifier2;
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.UtilNetworkingIHttpsURLConnectionProvider
                        private static int MediaDescriptionCompat = 0;
                        private static int RatingCompat = 1;

                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public final Object invoke(Object obj, Object obj2) {
                            int i28 = 2 % 2;
                            int i29 = MediaDescriptionCompat + 49;
                            RatingCompat = i29 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i210 = i29 % 2;
                            ((Integer) obj2).getClass();
                            LoadingFullScreenKt.m5039LoadingFullScreenSj8uqqQ(z, modifier5, str3, color3, dragAndDropTargetModifierNode, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            int i211 = MediaDescriptionCompat + 17;
                            RatingCompat = i211 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i212 = i211 % 2;
                            return createfromparcel;
                        }
                    };
                }
            }
            i10 = RemoteActionCompatParcelizer + 75;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                i3 |= 9385;
            } else {
                i3 |= 384;
            }
            str2 = str;
            i7 = i2 & 8;
            if (i7 != 0) {
                if ((i & 3072) == 0) {
                    color2 = color;
                    if (getpostalcode.read(color2)) {
                        int i112 = RemoteActionCompatParcelizer + 17;
                        IconCompatParcelizer = i112 % Fields.SpotShadowColor;
                        int i113 = i112 % 2;
                        i8 = Fields.CameraDistance;
                    } else {
                        i8 = Fields.RotationZ;
                    }
                    i3 |= i8;
                }
                if ((i & 24576) == 0) {
                    if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                        i9 = Fields.Clip;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i3 & 9363) != 9362) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (getpostalcode.write(i3 & 1, z2)) {
                    int i114 = RemoteActionCompatParcelizer + 83;
                    IconCompatParcelizer = i114 % Fields.SpotShadowColor;
                    int i115 = i114 % 2;
                    if (i15 != 0) {
                        modifier2 = Modifier.Companion;
                    }
                    if (i4 != 0) {
                        int i28 = IconCompatParcelizer + 31;
                        RemoteActionCompatParcelizer = i28 % Fields.SpotShadowColor;
                        int i29 = i28 % 2;
                        str2 = "";
                    }
                    if (i7 != 0) {
                        int i210 = IconCompatParcelizer + 75;
                        RemoteActionCompatParcelizer = i210 % Fields.SpotShadowColor;
                        int i211 = i210 % 2;
                        color2 = null;
                    }
                    Modifier modifierThen3 = modifier2.then(SizeKt.read);
                    measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
                    iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                    dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen3);
                    companion = ComposeUiNode.Companion;
                    constructor = companion.getConstructor();
                    if (getpostalcode.read != null) {
                        SentryUUID.write();
                        throw null;
                    }
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (!getpostalcode.ComponentActivity) {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    } else {
                        getpostalcode.serializer(constructor);
                    }
                    af$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                    dragAndDropTargetModifierNode.invoke(getpostalcode, Integer.valueOf((i3 >> 12) & 14));
                    androidContentCaptureManager = getCreditCardExpirationMonth.write;
                    if (z) {
                        getpostalcode.serializer(51794722);
                        modifier3 = Modifier.Companion;
                        objComponentActivity2 = getpostalcode.ComponentActivity();
                        if (objComponentActivity2 == androidContentCaptureManager) {
                            objComponentActivity2 = generateHttpsURLConnection.read;
                            getpostalcode.write(objComponentActivity2);
                        }
                        Modifier modifierPointerInput3 = SuspendingPointerInputFilterKt.pointerInput(modifier3, createFromParcel.INSTANCE, (PointerInputEventHandler) objComponentActivity2);
                        if (color2 != null) {
                            modifier3 = modifierM20backgroundbw27NRU;
                        }
                        Signer.IconCompatParcelizer(modifierPointerInput3.then(modifier3), getpostalcode, 0);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        getpostalcode.serializer(52081100);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    LoadingView(((i3 << 3) & 112) | 6 | (i3 & 896), getpostalcode, str2, z);
                    getpostalcode.IconCompatParcelizer(true);
                    objComponentActivity = getpostalcode.ComponentActivity();
                    if (objComponentActivity == androidContentCaptureManager) {
                        objComponentActivity = new b8$$ExternalSyntheticLambda4(1);
                        getpostalcode.write(objComponentActivity);
                    }
                    DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(z, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, (i3 & 14) | 48, 0);
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                str3 = str2;
                color3 = color2;
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    final Modifier modifier6 = modifier2;
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.UtilNetworkingIHttpsURLConnectionProvider
                        private static int MediaDescriptionCompat = 0;
                        private static int RatingCompat = 1;

                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public final Object invoke(Object obj, Object obj2) {
                            int i212 = 2 % 2;
                            int i213 = MediaDescriptionCompat + 49;
                            RatingCompat = i213 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i214 = i213 % 2;
                            ((Integer) obj2).getClass();
                            LoadingFullScreenKt.m5039LoadingFullScreenSj8uqqQ(z, modifier6, str3, color3, dragAndDropTargetModifierNode, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            int i215 = MediaDescriptionCompat + 17;
                            RatingCompat = i215 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i216 = i215 % 2;
                            return createfromparcel;
                        }
                    };
                }
            }
            i3 |= 3072;
            color2 = color;
            if ((i & 24576) == 0) {
                if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                    i9 = Fields.Clip;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            if ((i3 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (getpostalcode.write(i3 & 1, z2)) {
                int i116 = RemoteActionCompatParcelizer + 83;
                IconCompatParcelizer = i116 % Fields.SpotShadowColor;
                int i117 = i116 % 2;
                if (i15 != 0) {
                    modifier2 = Modifier.Companion;
                }
                if (i4 != 0) {
                    int i212 = IconCompatParcelizer + 31;
                    RemoteActionCompatParcelizer = i212 % Fields.SpotShadowColor;
                    int i213 = i212 % 2;
                    str2 = "";
                }
                if (i7 != 0) {
                    int i214 = IconCompatParcelizer + 75;
                    RemoteActionCompatParcelizer = i214 % Fields.SpotShadowColor;
                    int i215 = i214 % 2;
                    color2 = null;
                }
                Modifier modifierThen4 = modifier2.then(SizeKt.read);
                measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
                iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen4);
                companion = ComposeUiNode.Companion;
                constructor = companion.getConstructor();
                if (getpostalcode.read != null) {
                    SentryUUID.write();
                    throw null;
                }
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!getpostalcode.ComponentActivity) {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                } else {
                    getpostalcode.serializer(constructor);
                }
                af$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                dragAndDropTargetModifierNode.invoke(getpostalcode, Integer.valueOf((i3 >> 12) & 14));
                androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (z) {
                    getpostalcode.serializer(51794722);
                    modifier3 = Modifier.Companion;
                    objComponentActivity2 = getpostalcode.ComponentActivity();
                    if (objComponentActivity2 == androidContentCaptureManager) {
                        objComponentActivity2 = generateHttpsURLConnection.read;
                        getpostalcode.write(objComponentActivity2);
                    }
                    Modifier modifierPointerInput4 = SuspendingPointerInputFilterKt.pointerInput(modifier3, createFromParcel.INSTANCE, (PointerInputEventHandler) objComponentActivity2);
                    if (color2 != null) {
                        modifier3 = modifierM20backgroundbw27NRU;
                    }
                    Signer.IconCompatParcelizer(modifierPointerInput4.then(modifier3), getpostalcode, 0);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(52081100);
                    getpostalcode.IconCompatParcelizer(false);
                }
                LoadingView(((i3 << 3) & 112) | 6 | (i3 & 896), getpostalcode, str2, z);
                getpostalcode.IconCompatParcelizer(true);
                objComponentActivity = getpostalcode.ComponentActivity();
                if (objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new b8$$ExternalSyntheticLambda4(1);
                    getpostalcode.write(objComponentActivity);
                }
                DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(z, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, (i3 & 14) | 48, 0);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            str3 = str2;
            color3 = color2;
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                final Modifier modifier7 = modifier2;
                gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.UtilNetworkingIHttpsURLConnectionProvider
                    private static int MediaDescriptionCompat = 0;
                    private static int RatingCompat = 1;

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        int i216 = 2 % 2;
                        int i217 = MediaDescriptionCompat + 49;
                        RatingCompat = i217 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i218 = i217 % 2;
                        ((Integer) obj2).getClass();
                        LoadingFullScreenKt.m5039LoadingFullScreenSj8uqqQ(z, modifier7, str3, color3, dragAndDropTargetModifierNode, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        int i219 = MediaDescriptionCompat + 17;
                        RatingCompat = i219 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i2110 = i219 % 2;
                        return createfromparcel;
                    }
                };
            }
        }
        int i30 = RemoteActionCompatParcelizer + 97;
        IconCompatParcelizer = i30 % Fields.SpotShadowColor;
        int i31 = i30 % 2;
        i3 |= 48;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                str2 = str;
                if (getpostalcode.read(str2)) {
                    i6 = IconCompatParcelizer + 1;
                    RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 != 0) {
                        i5 = 27399;
                    } else {
                        i5 = Fields.RotationX;
                    }
                } else {
                    i5 = Fields.SpotShadowColor;
                }
                i3 |= i5;
            }
            i7 = i2 & 8;
            if (i7 != 0) {
                if ((i & 3072) == 0) {
                    color2 = color;
                    if (getpostalcode.read(color2)) {
                        int i118 = RemoteActionCompatParcelizer + 17;
                        IconCompatParcelizer = i118 % Fields.SpotShadowColor;
                        int i119 = i118 % 2;
                        i8 = Fields.CameraDistance;
                    } else {
                        i8 = Fields.RotationZ;
                    }
                    i3 |= i8;
                }
                if ((i & 24576) == 0) {
                    if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                        i9 = Fields.Clip;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i3 & 9363) != 9362) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (getpostalcode.write(i3 & 1, z2)) {
                    int i1110 = RemoteActionCompatParcelizer + 83;
                    IconCompatParcelizer = i1110 % Fields.SpotShadowColor;
                    int i1111 = i1110 % 2;
                    if (i15 != 0) {
                        modifier2 = Modifier.Companion;
                    }
                    if (i4 != 0) {
                        int i216 = IconCompatParcelizer + 31;
                        RemoteActionCompatParcelizer = i216 % Fields.SpotShadowColor;
                        int i217 = i216 % 2;
                        str2 = "";
                    }
                    if (i7 != 0) {
                        int i218 = IconCompatParcelizer + 75;
                        RemoteActionCompatParcelizer = i218 % Fields.SpotShadowColor;
                        int i219 = i218 % 2;
                        color2 = null;
                    }
                    Modifier modifierThen5 = modifier2.then(SizeKt.read);
                    measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
                    iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                    dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen5);
                    companion = ComposeUiNode.Companion;
                    constructor = companion.getConstructor();
                    if (getpostalcode.read != null) {
                        SentryUUID.write();
                        throw null;
                    }
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (!getpostalcode.ComponentActivity) {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    } else {
                        getpostalcode.serializer(constructor);
                    }
                    af$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                    dragAndDropTargetModifierNode.invoke(getpostalcode, Integer.valueOf((i3 >> 12) & 14));
                    androidContentCaptureManager = getCreditCardExpirationMonth.write;
                    if (z) {
                        getpostalcode.serializer(51794722);
                        modifier3 = Modifier.Companion;
                        objComponentActivity2 = getpostalcode.ComponentActivity();
                        if (objComponentActivity2 == androidContentCaptureManager) {
                            objComponentActivity2 = generateHttpsURLConnection.read;
                            getpostalcode.write(objComponentActivity2);
                        }
                        Modifier modifierPointerInput5 = SuspendingPointerInputFilterKt.pointerInput(modifier3, createFromParcel.INSTANCE, (PointerInputEventHandler) objComponentActivity2);
                        if (color2 != null) {
                            modifier3 = modifierM20backgroundbw27NRU;
                        }
                        Signer.IconCompatParcelizer(modifierPointerInput5.then(modifier3), getpostalcode, 0);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        getpostalcode.serializer(52081100);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    LoadingView(((i3 << 3) & 112) | 6 | (i3 & 896), getpostalcode, str2, z);
                    getpostalcode.IconCompatParcelizer(true);
                    objComponentActivity = getpostalcode.ComponentActivity();
                    if (objComponentActivity == androidContentCaptureManager) {
                        objComponentActivity = new b8$$ExternalSyntheticLambda4(1);
                        getpostalcode.write(objComponentActivity);
                    }
                    DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(z, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, (i3 & 14) | 48, 0);
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                str3 = str2;
                color3 = color2;
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    final Modifier modifier8 = modifier2;
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.UtilNetworkingIHttpsURLConnectionProvider
                        private static int MediaDescriptionCompat = 0;
                        private static int RatingCompat = 1;

                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public final Object invoke(Object obj, Object obj2) {
                            int i2110 = 2 % 2;
                            int i2111 = MediaDescriptionCompat + 49;
                            RatingCompat = i2111 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i2112 = i2111 % 2;
                            ((Integer) obj2).getClass();
                            LoadingFullScreenKt.m5039LoadingFullScreenSj8uqqQ(z, modifier8, str3, color3, dragAndDropTargetModifierNode, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            int i2113 = MediaDescriptionCompat + 17;
                            RatingCompat = i2113 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i2114 = i2113 % 2;
                            return createfromparcel;
                        }
                    };
                }
            }
            i3 |= 3072;
            color2 = color;
            if ((i & 24576) == 0) {
                if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                    i9 = Fields.Clip;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            if ((i3 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (getpostalcode.write(i3 & 1, z2)) {
                int i1112 = RemoteActionCompatParcelizer + 83;
                IconCompatParcelizer = i1112 % Fields.SpotShadowColor;
                int i1113 = i1112 % 2;
                if (i15 != 0) {
                    modifier2 = Modifier.Companion;
                }
                if (i4 != 0) {
                    int i2110 = IconCompatParcelizer + 31;
                    RemoteActionCompatParcelizer = i2110 % Fields.SpotShadowColor;
                    int i2111 = i2110 % 2;
                    str2 = "";
                }
                if (i7 != 0) {
                    int i2112 = IconCompatParcelizer + 75;
                    RemoteActionCompatParcelizer = i2112 % Fields.SpotShadowColor;
                    int i2113 = i2112 % 2;
                    color2 = null;
                }
                Modifier modifierThen6 = modifier2.then(SizeKt.read);
                measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
                iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen6);
                companion = ComposeUiNode.Companion;
                constructor = companion.getConstructor();
                if (getpostalcode.read != null) {
                    SentryUUID.write();
                    throw null;
                }
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!getpostalcode.ComponentActivity) {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                } else {
                    getpostalcode.serializer(constructor);
                }
                af$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                dragAndDropTargetModifierNode.invoke(getpostalcode, Integer.valueOf((i3 >> 12) & 14));
                androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (z) {
                    getpostalcode.serializer(51794722);
                    modifier3 = Modifier.Companion;
                    objComponentActivity2 = getpostalcode.ComponentActivity();
                    if (objComponentActivity2 == androidContentCaptureManager) {
                        objComponentActivity2 = generateHttpsURLConnection.read;
                        getpostalcode.write(objComponentActivity2);
                    }
                    Modifier modifierPointerInput6 = SuspendingPointerInputFilterKt.pointerInput(modifier3, createFromParcel.INSTANCE, (PointerInputEventHandler) objComponentActivity2);
                    if (color2 != null) {
                        modifier3 = modifierM20backgroundbw27NRU;
                    }
                    Signer.IconCompatParcelizer(modifierPointerInput6.then(modifier3), getpostalcode, 0);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(52081100);
                    getpostalcode.IconCompatParcelizer(false);
                }
                LoadingView(((i3 << 3) & 112) | 6 | (i3 & 896), getpostalcode, str2, z);
                getpostalcode.IconCompatParcelizer(true);
                objComponentActivity = getpostalcode.ComponentActivity();
                if (objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new b8$$ExternalSyntheticLambda4(1);
                    getpostalcode.write(objComponentActivity);
                }
                DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(z, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, (i3 & 14) | 48, 0);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            str3 = str2;
            color3 = color2;
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                final Modifier modifier9 = modifier2;
                gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.UtilNetworkingIHttpsURLConnectionProvider
                    private static int MediaDescriptionCompat = 0;
                    private static int RatingCompat = 1;

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        int i2114 = 2 % 2;
                        int i2115 = MediaDescriptionCompat + 49;
                        RatingCompat = i2115 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i2116 = i2115 % 2;
                        ((Integer) obj2).getClass();
                        LoadingFullScreenKt.m5039LoadingFullScreenSj8uqqQ(z, modifier9, str3, color3, dragAndDropTargetModifierNode, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        int i2117 = MediaDescriptionCompat + 17;
                        RatingCompat = i2117 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i2118 = i2117 % 2;
                        return createfromparcel;
                    }
                };
            }
        }
        i10 = RemoteActionCompatParcelizer + 75;
        IconCompatParcelizer = i10 % Fields.SpotShadowColor;
        if (i10 % 2 == 0) {
            i3 |= 9385;
        } else {
            i3 |= 384;
        }
        str2 = str;
        i7 = i2 & 8;
        if (i7 != 0) {
            if ((i & 3072) == 0) {
                color2 = color;
                if (getpostalcode.read(color2)) {
                    int i1114 = RemoteActionCompatParcelizer + 17;
                    IconCompatParcelizer = i1114 % Fields.SpotShadowColor;
                    int i1115 = i1114 % 2;
                    i8 = Fields.CameraDistance;
                } else {
                    i8 = Fields.RotationZ;
                }
                i3 |= i8;
            }
            if ((i & 24576) == 0) {
                if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                    i9 = Fields.Clip;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            if ((i3 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (getpostalcode.write(i3 & 1, z2)) {
                int i1116 = RemoteActionCompatParcelizer + 83;
                IconCompatParcelizer = i1116 % Fields.SpotShadowColor;
                int i1117 = i1116 % 2;
                if (i15 != 0) {
                    modifier2 = Modifier.Companion;
                }
                if (i4 != 0) {
                    int i2114 = IconCompatParcelizer + 31;
                    RemoteActionCompatParcelizer = i2114 % Fields.SpotShadowColor;
                    int i2115 = i2114 % 2;
                    str2 = "";
                }
                if (i7 != 0) {
                    int i2116 = IconCompatParcelizer + 75;
                    RemoteActionCompatParcelizer = i2116 % Fields.SpotShadowColor;
                    int i2117 = i2116 % 2;
                    color2 = null;
                }
                Modifier modifierThen7 = modifier2.then(SizeKt.read);
                measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
                iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen7);
                companion = ComposeUiNode.Companion;
                constructor = companion.getConstructor();
                if (getpostalcode.read != null) {
                    SentryUUID.write();
                    throw null;
                }
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!getpostalcode.ComponentActivity) {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                } else {
                    getpostalcode.serializer(constructor);
                }
                af$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                dragAndDropTargetModifierNode.invoke(getpostalcode, Integer.valueOf((i3 >> 12) & 14));
                androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (z) {
                    getpostalcode.serializer(51794722);
                    modifier3 = Modifier.Companion;
                    objComponentActivity2 = getpostalcode.ComponentActivity();
                    if (objComponentActivity2 == androidContentCaptureManager) {
                        objComponentActivity2 = generateHttpsURLConnection.read;
                        getpostalcode.write(objComponentActivity2);
                    }
                    Modifier modifierPointerInput7 = SuspendingPointerInputFilterKt.pointerInput(modifier3, createFromParcel.INSTANCE, (PointerInputEventHandler) objComponentActivity2);
                    if (color2 != null) {
                        modifier3 = modifierM20backgroundbw27NRU;
                    }
                    Signer.IconCompatParcelizer(modifierPointerInput7.then(modifier3), getpostalcode, 0);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(52081100);
                    getpostalcode.IconCompatParcelizer(false);
                }
                LoadingView(((i3 << 3) & 112) | 6 | (i3 & 896), getpostalcode, str2, z);
                getpostalcode.IconCompatParcelizer(true);
                objComponentActivity = getpostalcode.ComponentActivity();
                if (objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new b8$$ExternalSyntheticLambda4(1);
                    getpostalcode.write(objComponentActivity);
                }
                DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(z, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, (i3 & 14) | 48, 0);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            str3 = str2;
            color3 = color2;
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                final Modifier modifier10 = modifier2;
                gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.UtilNetworkingIHttpsURLConnectionProvider
                    private static int MediaDescriptionCompat = 0;
                    private static int RatingCompat = 1;

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        int i2118 = 2 % 2;
                        int i2119 = MediaDescriptionCompat + 49;
                        RatingCompat = i2119 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i21110 = i2119 % 2;
                        ((Integer) obj2).getClass();
                        LoadingFullScreenKt.m5039LoadingFullScreenSj8uqqQ(z, modifier10, str3, color3, dragAndDropTargetModifierNode, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        int i21111 = MediaDescriptionCompat + 17;
                        RatingCompat = i21111 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i21112 = i21111 % 2;
                        return createfromparcel;
                    }
                };
            }
        }
        i3 |= 3072;
        color2 = color;
        if ((i & 24576) == 0) {
            if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                i9 = Fields.Clip;
            } else {
                i9 = 8192;
            }
            i3 |= i9;
        }
        if ((i3 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (getpostalcode.write(i3 & 1, z2)) {
            int i1118 = RemoteActionCompatParcelizer + 83;
            IconCompatParcelizer = i1118 % Fields.SpotShadowColor;
            int i1119 = i1118 % 2;
            if (i15 != 0) {
                modifier2 = Modifier.Companion;
            }
            if (i4 != 0) {
                int i2118 = IconCompatParcelizer + 31;
                RemoteActionCompatParcelizer = i2118 % Fields.SpotShadowColor;
                int i2119 = i2118 % 2;
                str2 = "";
            }
            if (i7 != 0) {
                int i21110 = IconCompatParcelizer + 75;
                RemoteActionCompatParcelizer = i21110 % Fields.SpotShadowColor;
                int i21111 = i21110 % 2;
                color2 = null;
            }
            Modifier modifierThen8 = modifier2.then(SizeKt.read);
            measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
            iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen8);
            companion = ComposeUiNode.Companion;
            constructor = companion.getConstructor();
            if (getpostalcode.read != null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (!getpostalcode.ComponentActivity) {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            } else {
                getpostalcode.serializer(constructor);
            }
            af$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            dragAndDropTargetModifierNode.invoke(getpostalcode, Integer.valueOf((i3 >> 12) & 14));
            androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z) {
                getpostalcode.serializer(51794722);
                modifier3 = Modifier.Companion;
                objComponentActivity2 = getpostalcode.ComponentActivity();
                if (objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = generateHttpsURLConnection.read;
                    getpostalcode.write(objComponentActivity2);
                }
                Modifier modifierPointerInput8 = SuspendingPointerInputFilterKt.pointerInput(modifier3, createFromParcel.INSTANCE, (PointerInputEventHandler) objComponentActivity2);
                if (color2 != null) {
                    modifier3 = modifierM20backgroundbw27NRU;
                }
                Signer.IconCompatParcelizer(modifierPointerInput8.then(modifier3), getpostalcode, 0);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(52081100);
                getpostalcode.IconCompatParcelizer(false);
            }
            LoadingView(((i3 << 3) & 112) | 6 | (i3 & 896), getpostalcode, str2, z);
            getpostalcode.IconCompatParcelizer(true);
            objComponentActivity = getpostalcode.ComponentActivity();
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new b8$$ExternalSyntheticLambda4(1);
                getpostalcode.write(objComponentActivity);
            }
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(z, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, (i3 & 14) | 48, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        str3 = str2;
        color3 = color2;
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            final Modifier modifier11 = modifier2;
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.UtilNetworkingIHttpsURLConnectionProvider
                private static int MediaDescriptionCompat = 0;
                private static int RatingCompat = 1;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i21112 = 2 % 2;
                    int i21113 = MediaDescriptionCompat + 49;
                    RatingCompat = i21113 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i21114 = i21113 % 2;
                    ((Integer) obj2).getClass();
                    LoadingFullScreenKt.m5039LoadingFullScreenSj8uqqQ(z, modifier11, str3, color3, dragAndDropTargetModifierNode, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i21115 = MediaDescriptionCompat + 17;
                    RatingCompat = i21115 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i21116 = i21115 % 2;
                    return createfromparcel;
                }
            };
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 4791. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static final void LoadingView(int r25, o.getBirthDateFull r26, java.lang.String r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.rrds.compose.component.forms.pattern.LoadingFullScreenKt.LoadingView(int, o.getBirthDateFull, java.lang.String, boolean):void");
    }
}
