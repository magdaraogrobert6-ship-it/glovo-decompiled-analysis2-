package com.roadrunner.delivery.ontheway.turnbyturn.ui.speedlimit.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.speedlimit.compose.SpeedLimitKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidFontTypefaceLoader;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.LineHeightStyleModeCompanion;
import o.LineHeightStyleTrim;
import o.LineHeightStyleTrimCompanion;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TapGestureDetectorKtdetectTapGestures21;
import o.accessgetFirstLineTopcp;
import o.buildMapping;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getBottomLeftannotations;
import o.getHandleruiannotations;
import o.getMinimumlzQqcRY;
import o.getNewPassword;
import o.getPostalCode;
import o.getTopLeftannotations;
import o.isTrimFirstLineTopimplui_text;
import o.isTrimLastLineBottomimplui_text;
import o.onViewAttachedToWindow;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setCurrentSemanticsNodesui;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SpeedLimitKt {
    private static int IconCompatParcelizer = 0;
    public static final float RemoteActionCompatParcelizer = Dp.m3673constructorimpl(5.0f);
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = write + 39;
        IconCompatParcelizer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:12:0x0030  */
    /* JADX WARN: Code duplicated, block: B:21:0x0054  */
    public static final void RemoteActionCompatParcelizer(accessgetFirstLineTopcp accessgetfirstlinetopcp, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        accessgetfirstlinetopcp.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1127203409);
        if ((i & 6) == 0) {
            int i5 = serializer + 77;
            read = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 75 / 0;
                if (getpostalcode.read(accessgetfirstlinetopcp)) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
            } else if (getpostalcode.read(accessgetfirstlinetopcp)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            int i7 = serializer + 15;
            read = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            i2 = i;
        }
        int i9 = i2 | 48;
        if ((i9 & 19) != 18) {
            int i10 = read + 95;
            serializer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (getpostalcode.write(i9 & 1, z)) {
            modifier = Modifier.Companion;
            LineHeightStyleTrim lineHeightStyleTrim = (LineHeightStyleTrim) ExtrasKt.write(((getMinimumlzQqcRY) accessgetfirstlinetopcp).write, getpostalcode, 0).getValue();
            if (lineHeightStyleTrim instanceof isTrimFirstLineTopimplui_text) {
                int i11 = serializer + 77;
                read = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                getpostalcode.serializer(-910711213);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                if (!(lineHeightStyleTrim instanceof isTrimLastLineBottomimplui_text)) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, -910714282, false);
                }
                int i13 = serializer + 51;
                read = i13 % Fields.SpotShadowColor;
                if (i13 % 2 == 0) {
                    getpostalcode.serializer(1832761725);
                    SpeedLimitWithRiderSpeed((isTrimLastLineBottomimplui_text) lineHeightStyleTrim, modifier, getpostalcode, i9 & 7);
                    getpostalcode.IconCompatParcelizer(true);
                } else {
                    getpostalcode.serializer(1832761725);
                    SpeedLimitWithRiderSpeed((isTrimLastLineBottomimplui_text) lineHeightStyleTrim, modifier, getpostalcode, i9 & 112);
                    getpostalcode.IconCompatParcelizer(false);
                }
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i14 = serializer + 89;
            read = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidFontTypefaceLoader(i, 9, accessgetfirstlinetopcp, modifier);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0076  */
    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Code duplicated, block: B:37:0x0093  */
    /* JADX WARN: Code duplicated, block: B:38:0x0096  */
    /* JADX WARN: Code duplicated, block: B:41:0x009d  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    public static final void serializer(final String str, final long j, Modifier modifier, getBirthDateFull getbirthdatefull, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean z;
        final Modifier modifier3;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        TextStyle textStyleMediaSessionCompatResultReceiverWrapper;
        int i4 = 2 % 2;
        int i5 = serializer + 87;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1422587575);
        if ((i & 6) == 0) {
            i3 = (getpostalcode.read(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i7 = serializer + 87;
            read = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            i3 |= getpostalcode.serializer(j) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= getpostalcode.read(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            }
            if ((i3 & 147) != 146) {
                int i10 = read + 97;
                serializer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                z = true;
            } else {
                int i12 = serializer + 125;
                read = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                z = false;
            }
            if (getpostalcode.write(i3 & 1, z)) {
                int i14 = read + 37;
                serializer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                if (i9 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if (str.length() > 2) {
                    textStyleMediaSessionCompatResultReceiverWrapper = performLayout.MediaSessionCompatToken();
                } else {
                    textStyleMediaSessionCompatResultReceiverWrapper = performLayout.MediaSessionCompatResultReceiverWrapper();
                }
                TextKt.m131TextNvy7gAk(str, modifier3, j, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleMediaSessionCompatResultReceiverWrapper, getpostalcode, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & 896), 0, 131064);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier3 = modifier2;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.getBothEVpEnUU
                    private static int MediaMetadataCompat = 0;
                    private static int MediaSessionCompatQueueItem = 1;

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        int i16 = 2 % 2;
                        int i17 = MediaMetadataCompat + 35;
                        MediaSessionCompatQueueItem = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i18 = i17 % 2;
                        ((Integer) obj2).getClass();
                        SpeedLimitKt.serializer(str, j, modifier3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        int i19 = MediaSessionCompatQueueItem + 57;
                        MediaMetadataCompat = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i19 % 2 != 0) {
                            int i20 = 57 / 0;
                        }
                        return createfromparcel;
                    }
                };
            }
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) != 146) {
            int i16 = read + 97;
            serializer = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            z = true;
        } else {
            int i18 = serializer + 125;
            read = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
            z = false;
        }
        if (getpostalcode.write(i3 & 1, z)) {
            int i110 = read + 37;
            serializer = i110 % Fields.SpotShadowColor;
            int i111 = i110 % 2;
            if (i9 != 0) {
                modifier3 = Modifier.Companion;
            } else {
                modifier3 = modifier2;
            }
            if (str.length() > 2) {
                textStyleMediaSessionCompatResultReceiverWrapper = performLayout.MediaSessionCompatToken();
            } else {
                textStyleMediaSessionCompatResultReceiverWrapper = performLayout.MediaSessionCompatResultReceiverWrapper();
            }
            TextKt.m131TextNvy7gAk(str, modifier3, j, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleMediaSessionCompatResultReceiverWrapper, getpostalcode, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & 896), 0, 131064);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier3 = modifier2;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.getBothEVpEnUU
                private static int MediaMetadataCompat = 0;
                private static int MediaSessionCompatQueueItem = 1;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i112 = 2 % 2;
                    int i113 = MediaMetadataCompat + 35;
                    MediaSessionCompatQueueItem = i113 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i114 = i113 % 2;
                    ((Integer) obj2).getClass();
                    SpeedLimitKt.serializer(str, j, modifier3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i115 = MediaSessionCompatQueueItem + 57;
                    MediaMetadataCompat = i115 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i115 % 2 != 0) {
                        int i20 = 57 / 0;
                    }
                    return createfromparcel;
                }
            };
        }
    }

    public static final void SpeedLimitContainer(isTrimLastLineBottomimplui_text istrimlastlinebottomimplui_text, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = serializer + 123;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1232968810);
        if ((i & 6) == 0) {
            int i6 = serializer + 61;
            read = i6 % Fields.SpotShadowColor;
            i2 = ((i6 % 2 != 0 ? (i & 8) != 0 : (i & 7) != 0) ? getpostalcode.IconCompatParcelizer(istrimlastlinebottomimplui_text) : getpostalcode.read(istrimlastlinebottomimplui_text) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i7 = i2 | 48;
        if (getpostalcode.write(i7 & 1, (i7 & 19) != 18)) {
            modifier = Modifier.Companion;
            Alignment center = Alignment.Companion.getCenter();
            Modifier modifierM83size3ABfNKs = SizeKt.m83size3ABfNKs(modifier, Dimensions.setCustomView);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            long windowSystemUiVisibility = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getWindowSystemUiVisibility();
            getTopLeftannotations gettopleftannotations = RoundedCornerShapeKt.IconCompatParcelizer;
            getBottomLeftannotations getbottomleftannotations = new getBottomLeftannotations(50.0f);
            Modifier modifierWrite = BorderKt.write(modifierM83size3ABfNKs, RemoteActionCompatParcelizer, windowSystemUiVisibility, new getTopLeftannotations(getbottomleftannotations, getbottomleftannotations, getbottomleftannotations, getbottomleftannotations));
            long jIconCompatParcelizer = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).IconCompatParcelizer();
            getBottomLeftannotations getbottomleftannotations2 = new getBottomLeftannotations(50.0f);
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifierWrite, jIconCompatParcelizer, new getTopLeftannotations(getbottomleftannotations2, getbottomleftannotations2, getbottomleftannotations2, getbottomleftannotations2));
            MeasurePolicy measurePolicy = BoxKt.read(center, false);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM20backgroundbw27NRU);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
                int i8 = serializer + 123;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            serializer(istrimlastlinebottomimplui_text.IconCompatParcelizer, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), null, getpostalcode, 0, 4);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new LineHeightStyleTrimCompanion(istrimlastlinebottomimplui_text, modifier, i, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0072  */
    /* JADX WARN: Code duplicated, block: B:32:0x007f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0095  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:42:0x0140  */
    /* JADX WARN: Code duplicated, block: B:43:0x0144  */
    /* JADX WARN: Code duplicated, block: B:46:0x016c  */
    /* JADX WARN: Code duplicated, block: B:47:0x017d  */
    /* JADX WARN: Code duplicated, block: B:49:0x019a  */
    /* JADX WARN: Code duplicated, block: B:51:0x019f  */
    /* JADX WARN: Code duplicated, block: B:54:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    public static final void SpeedLimitWithRiderSpeed(isTrimLastLineBottomimplui_text istrimlastlinebottomimplui_text, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        long presenter;
        Alignment.Companion companion;
        ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer;
        int iHashCode;
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer;
        Modifier modifierMaterializeModifier;
        ComposeUiNode.Companion companion2;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor;
        Modifier.Companion companion3;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2;
        Modifier modifierM74paddingqDBjuR0$default;
        boolean zIconCompatParcelizer;
        int i4 = 2 % 2;
        LineHeightStyleModeCompanion lineHeightStyleModeCompanion = istrimlastlinebottomimplui_text.read;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1417037888);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode.read(istrimlastlinebottomimplui_text);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(istrimlastlinebottomimplui_text);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i5 = serializer + 55;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i2 |= getpostalcode.read(modifier) ? 32 : 16;
        }
        int i7 = i2;
        if ((i7 & 19) != 18) {
            int i8 = read + 51;
            serializer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                z = true;
            }
            if (getpostalcode.write(i7 & 1, z)) {
                int i9 = serializer + 125;
                read = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                if (lineHeightStyleModeCompanion.IconCompatParcelizer) {
                    getpostalcode.serializer(-268770805);
                    presenter = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setUiOptions();
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(-268769782);
                    presenter = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter();
                    getpostalcode.IconCompatParcelizer(false);
                }
                i3 = 0;
                onViewAttachedToWindow onviewattachedtowindowIconCompatParcelizer = TapGestureDetectorKtdetectTapGestures21.IconCompatParcelizer(presenter, null, null, null, getpostalcode, 0, 14);
                Arrangement$Center$1 arrangement$Center$1 = Arrangement.read;
                companion = Alignment.Companion;
                Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifier, ((Color) onviewattachedtowindowIconCompatParcelizer.getValue()).m732unboximpl(), RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.setLogo));
                modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(arrangement$Center$1, centerHorizontally, getpostalcode, 54);
                iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM20backgroundbw27NRU);
                companion2 = ComposeUiNode.Companion;
                constructor = companion2.getConstructor();
                if (getaddresscountry != null) {
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                    getpostalcode.serializer(-1642761510);
                    Alignment bottomCenter = companion.getBottomCenter();
                    companion3 = Modifier.Companion;
                    Modifier modifierM83size3ABfNKs = SizeKt.m83size3ABfNKs(companion3, Dimensions.setMenuPrepared);
                    MeasurePolicy measurePolicy = BoxKt.read(bottomCenter, false);
                    int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM83size3ABfNKs);
                    constructor2 = companion2.getConstructor();
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (!getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor2);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    af$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
                    String str = lineHeightStyleModeCompanion.write;
                    long popupTheme = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme();
                    if (lineHeightStyleModeCompanion.write.length() > 2) {
                        modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, Dimensions.write, 7);
                    } else {
                        modifierM74paddingqDBjuR0$default = companion3;
                    }
                    serializer(str, popupTheme, companion3.then(modifierM74paddingqDBjuR0$default), getpostalcode, 0, 0);
                    getpostalcode.IconCompatParcelizer(true);
                    getpostalcode.IconCompatParcelizer(false);
                    SpeedLimitContainer(istrimlastlinebottomimplui_text, null, getpostalcode, i7 & 14);
                    getpostalcode.IconCompatParcelizer(true);
                } else {
                    SentryUUID.write();
                    throw null;
                }
            } else {
                i3 = 0;
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new LineHeightStyleTrimCompanion(istrimlastlinebottomimplui_text, modifier, i, i3);
            }
        }
        int i11 = read + 101;
        serializer = i11 % Fields.SpotShadowColor;
        int i12 = i11 % 2;
        z = false;
        if (getpostalcode.write(i7 & 1, z)) {
            int i13 = serializer + 125;
            read = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            if (lineHeightStyleModeCompanion.IconCompatParcelizer) {
                getpostalcode.serializer(-268770805);
                presenter = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setUiOptions();
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-268769782);
                presenter = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter();
                getpostalcode.IconCompatParcelizer(false);
            }
            i3 = 0;
            onViewAttachedToWindow onviewattachedtowindowIconCompatParcelizer2 = TapGestureDetectorKtdetectTapGestures21.IconCompatParcelizer(presenter, null, null, null, getpostalcode, 0, 14);
            Arrangement$Center$1 arrangement$Center$2 = Arrangement.read;
            companion = Alignment.Companion;
            Alignment.Horizontal centerHorizontally2 = companion.getCenterHorizontally();
            Modifier modifierM20backgroundbw27NRU2 = BackgroundKt.m20backgroundbw27NRU(modifier, ((Color) onviewattachedtowindowIconCompatParcelizer2.getValue()).m732unboximpl(), RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.setLogo));
            modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(arrangement$Center$2, centerHorizontally2, getpostalcode, 54);
            iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM20backgroundbw27NRU2);
            companion2 = ComposeUiNode.Companion;
            constructor = companion2.getConstructor();
            if (getaddresscountry != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                getpostalcode.serializer(-1642761510);
                Alignment bottomCenter2 = companion.getBottomCenter();
                companion3 = Modifier.Companion;
                Modifier modifierM83size3ABfNKs2 = SizeKt.m83size3ABfNKs(companion3, Dimensions.setMenuPrepared);
                MeasurePolicy measurePolicy2 = BoxKt.read(bottomCenter2, false);
                int iHashCode3 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM83size3ABfNKs2);
                constructor2 = companion2.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor2);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode3), getpostalcode));
                String str2 = lineHeightStyleModeCompanion.write;
                long popupTheme2 = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme();
                if (lineHeightStyleModeCompanion.write.length() > 2) {
                    modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, Dimensions.write, 7);
                } else {
                    modifierM74paddingqDBjuR0$default = companion3;
                }
                serializer(str2, popupTheme2, companion3.then(modifierM74paddingqDBjuR0$default), getpostalcode, 0, 0);
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(false);
                SpeedLimitContainer(istrimlastlinebottomimplui_text, null, getpostalcode, i7 & 14);
                getpostalcode.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            i3 = 0;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new LineHeightStyleTrimCompanion(istrimlastlinebottomimplui_text, modifier, i, i3);
        }
    }
}
