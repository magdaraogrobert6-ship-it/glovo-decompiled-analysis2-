package com.roadrunner.home.floatinglayer;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.room.RoomDatabase$closeBarrier$1;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.home.HomeFragment;
import com.roadrunner.home.HomeFragment$initPopupLayer$1;
import com.roadrunner.home.floatinglayer.FloatingContentKt;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import java.util.Iterator;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.MatrixCompanion;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TextFieldDefaults;
import o.TooltipDefaults;
import o.createFromParcel;
import o.findFragmentByTag;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.getStrokeJoinLxFBmk8;
import o.handleUrlOverridelambda1;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.supportFinishAfterTransition;
import o.supportStartPostponedEnterTransition;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FloatingContentKt {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    public static final void ContentPlaceholder(getBirthDateFull getbirthdatefull, final int i) {
        boolean z;
        int i2 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1722357296);
        if (i != 0) {
            int i3 = IconCompatParcelizer + 39;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i & 1, z)) {
            Object[] objArr = {getpostalcode, SizeKt.m83size3ABfNKs(Modifier.Companion, Dimensions.setCustomView)};
            int iRemoteActionCompatParcelizer = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, objArr);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.getSupportFragmentManager
                private static int read = 1;
                private static int serializer;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = 2 % 2;
                    int i6 = read + 115;
                    serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    ((Integer) obj2).intValue();
                    FloatingContentKt.ContentPlaceholder((getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i8 = read + 17;
                    serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    return createfromparcel;
                }
            };
            int i5 = RemoteActionCompatParcelizer + 51;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 4 % 5;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:103:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:108:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:112:0x01df  */
    /* JADX WARN: Code duplicated, block: B:114:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:116:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:117:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:11:0x0048  */
    /* JADX WARN: Code duplicated, block: B:120:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:121:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:124:0x0201  */
    /* JADX WARN: Code duplicated, block: B:125:0x020a  */
    /* JADX WARN: Code duplicated, block: B:127:0x0214  */
    /* JADX WARN: Code duplicated, block: B:128:0x021f  */
    /* JADX WARN: Code duplicated, block: B:12:0x0053  */
    /* JADX WARN: Code duplicated, block: B:130:0x0224  */
    /* JADX WARN: Code duplicated, block: B:131:0x0229  */
    /* JADX WARN: Code duplicated, block: B:134:0x0230  */
    /* JADX WARN: Code duplicated, block: B:141:0x0285  */
    /* JADX WARN: Code duplicated, block: B:142:0x0287  */
    /* JADX WARN: Code duplicated, block: B:145:0x0293  */
    /* JADX WARN: Code duplicated, block: B:147:0x0297  */
    /* JADX WARN: Code duplicated, block: B:149:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:14:0x0056 A[PHI: r7 r11
  0x0056: PHI (r7v16 o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) = (r7v4 o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk), (r7v17 o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) binds: [B:8:0x0040, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]
  0x0056: PHI (r11v58 o.getPostalCode) = (r11v1 o.getPostalCode), (r11v60 o.getPostalCode) binds: [B:8:0x0040, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:151:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:154:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:157:0x026c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x010e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0112  */
    /* JADX WARN: Code duplicated, block: B:74:0x011d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0120  */
    /* JADX WARN: Code duplicated, block: B:78:0x0127  */
    /* JADX WARN: Code duplicated, block: B:81:0x0133  */
    /* JADX WARN: Code duplicated, block: B:82:0x0135  */
    /* JADX WARN: Code duplicated, block: B:85:0x013e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0158 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x015a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0161  */
    /* JADX WARN: Code duplicated, block: B:98:0x016e A[PHI: r8 r12
  0x016e: PHI (r8v25 int) = (r8v19 int), (r8v19 int), (r8v27 int) binds: [B:96:0x015f, B:91:0x0154, B:92:0x0156] A[DONT_GENERATE, DONT_INLINE]
  0x016e: PHI (r12v19 androidx.compose.ui.Modifier) = (r12v9 androidx.compose.ui.Modifier), (r12v7 androidx.compose.ui.Modifier), (r12v7 androidx.compose.ui.Modifier) binds: [B:96:0x015f, B:91:0x0154, B:92:0x0156] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0042 A[PHI: r7 r11
  0x0042: PHI (r7v5 o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) = (r7v4 o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk), (r7v17 o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) binds: [B:8:0x0040, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]
  0x0042: PHI (r11v2 o.getPostalCode) = (r11v1 o.getPostalCode), (r11v60 o.getPostalCode) binds: [B:8:0x0040, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void FloatingContent(final supportStartPostponedEnterTransition supportstartpostponedentertransition, final supportFinishAfterTransition supportfinishaftertransition, final HomeFragment$initPopupLayer$1 homeFragment$initPopupLayer$1, final HomeFragment.AnonymousClass1 anonymousClass1, final RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$1, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, TooltipDefaults tooltipDefaults, getBirthDateFull getbirthdatefull, final int i, final int i2) {
        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        getPostalCode getpostalcode;
        int i3;
        int i4;
        Modifier modifier2;
        int i5;
        TooltipDefaults tooltipDefaults2;
        boolean z;
        getPostalCode getpostalcode2;
        final Modifier modifier3;
        final TooltipDefaults tooltipDefaultsRemoteActionCompatParcelizer;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        int i6;
        int i7;
        Modifier modifier4;
        ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer;
        int iHashCode;
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer;
        Modifier modifierMaterializeModifier;
        Modifier modifier5;
        ComposeUiNode.Companion companion;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor;
        Iterator it;
        int i8;
        int size;
        boolean z2;
        boolean z3;
        Object objComponentActivity;
        Object next;
        findFragmentByTag findfragmentbytag;
        boolean z4;
        boolean z5;
        float f;
        boolean z6;
        float fM3673constructorimpl;
        float fM3673constructorimpl2;
        Modifier modifierWindowInsetsPadding;
        Modifier modifier6;
        int i9;
        int i10;
        int i11;
        int i12 = 2 % 2;
        int i13 = RemoteActionCompatParcelizer + 75;
        IconCompatParcelizer = i13 % Fields.SpotShadowColor;
        if (i13 % 2 != 0) {
            r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = supportstartpostponedentertransition.IconCompatParcelizer;
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-2047480082);
            if ((i & 23) == 0) {
                if (getpostalcode.read(supportstartpostponedentertransition)) {
                    int i14 = RemoteActionCompatParcelizer + 71;
                    IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                i4 = i3 | i;
            } else {
                i4 = i;
            }
        } else {
            r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = supportstartpostponedentertransition.IconCompatParcelizer;
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-2047480082);
            if ((i & 6) == 0) {
                if (getpostalcode.read(supportstartpostponedentertransition)) {
                    int i16 = RemoteActionCompatParcelizer + 71;
                    IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                i4 = i3 | i;
            } else {
                i4 = i;
            }
        }
        getPostalCode getpostalcode3 = getpostalcode;
        if ((i & 48) == 0) {
            i4 |= getpostalcode3.read(supportfinishaftertransition) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= getpostalcode3.IconCompatParcelizer(homeFragment$initPopupLayer$1) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i4 |= getpostalcode3.IconCompatParcelizer(anonymousClass1) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            int i18 = IconCompatParcelizer + 3;
            RemoteActionCompatParcelizer = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
            i4 |= getpostalcode3.IconCompatParcelizer(roomDatabase$closeBarrier$1) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            int i20 = RemoteActionCompatParcelizer + 21;
            IconCompatParcelizer = i20 % Fields.SpotShadowColor;
            int i21 = i20 % 2;
            if (getpostalcode3.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                i11 = Fields.RenderEffect;
            } else {
                int i22 = IconCompatParcelizer + 115;
                RemoteActionCompatParcelizer = i22 % Fields.SpotShadowColor;
                int i23 = i22 % 2;
                i11 = 65536;
            }
            i4 |= i11;
        }
        int i24 = i2 & 64;
        if (i24 != 0) {
            int i25 = IconCompatParcelizer + 59;
            RemoteActionCompatParcelizer = i25 % Fields.SpotShadowColor;
            if (i25 % 2 == 0) {
                i4 |= 1572864;
                int i26 = 25 / 0;
            } else {
                i4 |= 1572864;
            }
        } else {
            if ((1572864 & i) == 0) {
                int i27 = RemoteActionCompatParcelizer + 105;
                IconCompatParcelizer = i27 % Fields.SpotShadowColor;
                int i28 = i27 % 2;
                modifier2 = modifier;
                if (getpostalcode3.read(modifier2)) {
                    int i29 = RemoteActionCompatParcelizer + 63;
                    IconCompatParcelizer = i29 % Fields.SpotShadowColor;
                    if (i29 % 2 != 0) {
                        throw null;
                    }
                    i5 = 1048576;
                } else {
                    i5 = Fields.BlendMode;
                }
                i4 |= i5;
            }
            if ((12582912 & i) == 0) {
                if ((i2 & Fields.SpotShadowColor) == 0) {
                    tooltipDefaults2 = tooltipDefaults;
                    if (!getpostalcode3.read(tooltipDefaults2)) {
                        i10 = 8388608;
                    }
                    i4 |= i10;
                } else {
                    tooltipDefaults2 = tooltipDefaults;
                }
                i10 = 4194304;
                i4 |= i10;
            } else {
                tooltipDefaults2 = tooltipDefaults;
            }
            if ((i4 & 4793491) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (getpostalcode3.write(i4 & 1, z)) {
                getpostalcode3.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                if ((i & 1) == 0 && !getpostalcode3.PlaybackStateCompat()) {
                    getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    if ((i2 & Fields.SpotShadowColor) != 0) {
                        i4 &= -29360129;
                    }
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.Companion;
                    }
                    if ((i2 & Fields.SpotShadowColor) != 0) {
                        i6 = 0;
                        i7 = i4 & (-29360129);
                        tooltipDefaultsRemoteActionCompatParcelizer = OffsetKt.RemoteActionCompatParcelizer(0, 14);
                        modifier4 = modifier2;
                    }
                    getpostalcode3.RemoteActionCompatParcelizer();
                    PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
                    modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.IconCompatParcelizer(Dimensions.setTabContainer), Alignment.Companion.getStart(), getpostalcode3, i6);
                    iHashCode = Long.hashCode(getpostalcode3.RatingCompat);
                    dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode3.serializer();
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode3, modifier4);
                    modifier5 = modifier4;
                    companion = ComposeUiNode.Companion;
                    constructor = companion.getConstructor();
                    if (getpostalcode3.read != null) {
                        getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                        if (!getpostalcode3.ComponentActivity) {
                            getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        } else {
                            i9 = IconCompatParcelizer + 27;
                            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                            if (i9 % 2 != 0) {
                                getpostalcode3.serializer(constructor);
                            } else {
                                getpostalcode3.serializer(constructor);
                                throw null;
                            }
                        }
                        c8$$ExternalSyntheticOutline0.m(companion, getpostalcode3, modalBottomSheetYbuCTN8Serializer, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer);
                        AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode3, Integer.valueOf(iHashCode), getpostalcode3));
                        getpostalcode3.serializer(1155768517);
                        it = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.iterator();
                        i8 = 0;
                        while (it.hasNext()) {
                            next = it.next();
                            if (i8 >= 0) {
                                findfragmentbytag = (findFragmentByTag) next;
                                getpostalcode3.RemoteActionCompatParcelizer(-1222402268, findfragmentbytag);
                                if (i8 == 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (i8 == r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.size() - 1) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (findfragmentbytag.serializer) {
                                    modifier6 = Modifier.Companion;
                                    getpostalcode3 = getpostalcode3;
                                    z6 = true;
                                } else {
                                    Modifier.Companion companion2 = Modifier.Companion;
                                    f = Dimensions.setTransitioning;
                                    z6 = true;
                                    if (!z4) {
                                        fM3673constructorimpl = Dp.m3673constructorimpl(0.0f);
                                    } else {
                                        fM3673constructorimpl = f;
                                    }
                                    if (!z5) {
                                        fM3673constructorimpl2 = Dp.m3673constructorimpl(0.0f);
                                    } else {
                                        fM3673constructorimpl2 = f;
                                    }
                                    modifierWindowInsetsPadding = PaddingKt.read(companion2, f, fM3673constructorimpl, f, fM3673constructorimpl2);
                                    if (z4) {
                                        int i30 = IconCompatParcelizer + 55;
                                        RemoteActionCompatParcelizer = i30 % Fields.SpotShadowColor;
                                        int i31 = i30 % 2;
                                        modifierWindowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(modifierWindowInsetsPadding, tooltipDefaultsRemoteActionCompatParcelizer);
                                    }
                                    modifier6 = modifierWindowInsetsPadding;
                                }
                                getPostalCode getpostalcode4 = getpostalcode3;
                                FloatingRow(modifier6, supportfinishaftertransition.RemoteActionCompatParcelizer(findfragmentbytag.IconCompatParcelizer, homeFragment$initPopupLayer$1, anonymousClass1, roomDatabase$closeBarrier$1), supportfinishaftertransition.RemoteActionCompatParcelizer(findfragmentbytag.write, homeFragment$initPopupLayer$1, anonymousClass1, roomDatabase$closeBarrier$1), supportfinishaftertransition.RemoteActionCompatParcelizer(findfragmentbytag.RemoteActionCompatParcelizer, homeFragment$initPopupLayer$1, anonymousClass1, roomDatabase$closeBarrier$1), getpostalcode4, 0);
                                getpostalcode4.IconCompatParcelizer(false);
                                i8++;
                                it = it;
                                getpostalcode3 = getpostalcode4;
                            } else {
                                SQLite.serializer();
                                throw null;
                            }
                        }
                        getpostalcode2 = getpostalcode3;
                        getpostalcode2.IconCompatParcelizer(false);
                        getpostalcode2.IconCompatParcelizer(true);
                        size = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.size();
                        if ((i7 & 458752) == 131072) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z3 = getpostalcode2.read(size);
                        objComponentActivity = getpostalcode2.ComponentActivity();
                        if (!(z3 | z2) || objComponentActivity == getCreditCardExpirationMonth.write) {
                            objComponentActivity = new MatrixCompanion(r8lambdaunavo3sxub_pc9xroryotnrlvsm, size, 2);
                            getpostalcode2.write(objComponentActivity);
                        }
                        getPhoneNumberNational.serializer(Integer.valueOf(size), (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode2);
                        modifier3 = modifier5;
                    } else {
                        SentryUUID.write();
                        throw null;
                    }
                }
                i6 = 0;
                i7 = i4;
                modifier4 = modifier2;
                tooltipDefaultsRemoteActionCompatParcelizer = tooltipDefaults2;
                getpostalcode3.RemoteActionCompatParcelizer();
                PlaybackStateCompatCustomAction playbackStateCompatCustomAction2 = Arrangement.MediaBrowserCompatMediaItem;
                modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.IconCompatParcelizer(Dimensions.setTabContainer), Alignment.Companion.getStart(), getpostalcode3, i6);
                iHashCode = Long.hashCode(getpostalcode3.RatingCompat);
                dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode3.serializer();
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode3, modifier4);
                modifier5 = modifier4;
                companion = ComposeUiNode.Companion;
                constructor = companion.getConstructor();
                if (getpostalcode3.read != null) {
                    getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (!getpostalcode3.ComponentActivity) {
                        getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    } else {
                        i9 = IconCompatParcelizer + 27;
                        RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                        if (i9 % 2 != 0) {
                            getpostalcode3.serializer(constructor);
                        } else {
                            getpostalcode3.serializer(constructor);
                            throw null;
                        }
                    }
                    c8$$ExternalSyntheticOutline0.m(companion, getpostalcode3, modalBottomSheetYbuCTN8Serializer, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode3, Integer.valueOf(iHashCode), getpostalcode3));
                    getpostalcode3.serializer(1155768517);
                    it = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.iterator();
                    i8 = 0;
                    while (it.hasNext()) {
                        next = it.next();
                        if (i8 >= 0) {
                            findfragmentbytag = (findFragmentByTag) next;
                            getpostalcode3.RemoteActionCompatParcelizer(-1222402268, findfragmentbytag);
                            if (i8 == 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (i8 == r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.size() - 1) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (findfragmentbytag.serializer) {
                                modifier6 = Modifier.Companion;
                                getpostalcode3 = getpostalcode3;
                                z6 = true;
                            } else {
                                Modifier.Companion companion3 = Modifier.Companion;
                                f = Dimensions.setTransitioning;
                                z6 = true;
                                if (!z4) {
                                    fM3673constructorimpl = Dp.m3673constructorimpl(0.0f);
                                } else {
                                    fM3673constructorimpl = f;
                                }
                                if (!z5) {
                                    fM3673constructorimpl2 = Dp.m3673constructorimpl(0.0f);
                                } else {
                                    fM3673constructorimpl2 = f;
                                }
                                modifierWindowInsetsPadding = PaddingKt.read(companion3, f, fM3673constructorimpl, f, fM3673constructorimpl2);
                                if (z4) {
                                    int i32 = IconCompatParcelizer + 55;
                                    RemoteActionCompatParcelizer = i32 % Fields.SpotShadowColor;
                                    int i33 = i32 % 2;
                                    modifierWindowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(modifierWindowInsetsPadding, tooltipDefaultsRemoteActionCompatParcelizer);
                                }
                                modifier6 = modifierWindowInsetsPadding;
                            }
                            getPostalCode getpostalcode5 = getpostalcode3;
                            FloatingRow(modifier6, supportfinishaftertransition.RemoteActionCompatParcelizer(findfragmentbytag.IconCompatParcelizer, homeFragment$initPopupLayer$1, anonymousClass1, roomDatabase$closeBarrier$1), supportfinishaftertransition.RemoteActionCompatParcelizer(findfragmentbytag.write, homeFragment$initPopupLayer$1, anonymousClass1, roomDatabase$closeBarrier$1), supportfinishaftertransition.RemoteActionCompatParcelizer(findfragmentbytag.RemoteActionCompatParcelizer, homeFragment$initPopupLayer$1, anonymousClass1, roomDatabase$closeBarrier$1), getpostalcode5, 0);
                            getpostalcode5.IconCompatParcelizer(false);
                            i8++;
                            it = it;
                            getpostalcode3 = getpostalcode5;
                        } else {
                            SQLite.serializer();
                            throw null;
                        }
                    }
                    getpostalcode2 = getpostalcode3;
                    getpostalcode2.IconCompatParcelizer(false);
                    getpostalcode2.IconCompatParcelizer(true);
                    size = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.size();
                    if ((i7 & 458752) == 131072) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = getpostalcode2.read(size);
                    objComponentActivity = getpostalcode2.ComponentActivity();
                    if (!(z3 | z2)) {
                        objComponentActivity = new MatrixCompanion(r8lambdaunavo3sxub_pc9xroryotnrlvsm, size, 2);
                        getpostalcode2.write(objComponentActivity);
                    } else {
                        objComponentActivity = new MatrixCompanion(r8lambdaunavo3sxub_pc9xroryotnrlvsm, size, 2);
                        getpostalcode2.write(objComponentActivity);
                    }
                    getPhoneNumberNational.serializer(Integer.valueOf(size), (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode2);
                    modifier3 = modifier5;
                } else {
                    SentryUUID.write();
                    throw null;
                }
            } else {
                getpostalcode2 = getpostalcode3;
                getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier3 = modifier2;
                tooltipDefaultsRemoteActionCompatParcelizer = tooltipDefaults2;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode2.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.onResumeFragments
                    private static int PlaybackStateCompat = 0;
                    private static int PlaybackStateCompatCustomAction = 1;

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        int i34 = 2 % 2;
                        int i35 = PlaybackStateCompatCustomAction + 29;
                        PlaybackStateCompat = i35 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i36 = i35 % 2;
                        ((Integer) obj2).getClass();
                        FloatingContentKt.FloatingContent(supportstartpostponedentertransition, supportfinishaftertransition, homeFragment$initPopupLayer$1, anonymousClass1, roomDatabase$closeBarrier$1, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier3, tooltipDefaultsRemoteActionCompatParcelizer, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        int i37 = PlaybackStateCompat + 81;
                        PlaybackStateCompatCustomAction = i37 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i37 % 2 == 0) {
                            int i38 = 52 / 0;
                        }
                        return createfromparcel;
                    }
                };
            }
        }
        modifier2 = modifier;
        if ((12582912 & i) == 0) {
            if ((i2 & Fields.SpotShadowColor) == 0) {
                tooltipDefaults2 = tooltipDefaults;
                if (!getpostalcode3.read(tooltipDefaults2)) {
                    i10 = 8388608;
                }
                i4 |= i10;
            } else {
                tooltipDefaults2 = tooltipDefaults;
            }
            i10 = 4194304;
            i4 |= i10;
        } else {
            tooltipDefaults2 = tooltipDefaults;
        }
        if ((i4 & 4793491) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode3.write(i4 & 1, z)) {
            getpostalcode3.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) == 0) {
                if (i24 != 0) {
                    modifier2 = Modifier.Companion;
                }
                if ((i2 & Fields.SpotShadowColor) != 0) {
                    i6 = 0;
                    i7 = i4 & (-29360129);
                    tooltipDefaultsRemoteActionCompatParcelizer = OffsetKt.RemoteActionCompatParcelizer(0, 14);
                    modifier4 = modifier2;
                } else {
                    i6 = 0;
                    i7 = i4;
                    modifier4 = modifier2;
                    tooltipDefaultsRemoteActionCompatParcelizer = tooltipDefaults2;
                }
            } else {
                if (i24 != 0) {
                    modifier2 = Modifier.Companion;
                }
                if ((i2 & Fields.SpotShadowColor) != 0) {
                    i6 = 0;
                    i7 = i4 & (-29360129);
                    tooltipDefaultsRemoteActionCompatParcelizer = OffsetKt.RemoteActionCompatParcelizer(0, 14);
                    modifier4 = modifier2;
                } else {
                    i6 = 0;
                    i7 = i4;
                    modifier4 = modifier2;
                    tooltipDefaultsRemoteActionCompatParcelizer = tooltipDefaults2;
                }
            }
            getpostalcode3.RemoteActionCompatParcelizer();
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction3 = Arrangement.MediaBrowserCompatMediaItem;
            modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.IconCompatParcelizer(Dimensions.setTabContainer), Alignment.Companion.getStart(), getpostalcode3, i6);
            iHashCode = Long.hashCode(getpostalcode3.RatingCompat);
            dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode3.serializer();
            modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode3, modifier4);
            modifier5 = modifier4;
            companion = ComposeUiNode.Companion;
            constructor = companion.getConstructor();
            if (getpostalcode3.read != null) {
                getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!getpostalcode3.ComponentActivity) {
                    getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                } else {
                    i9 = IconCompatParcelizer + 27;
                    RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                    if (i9 % 2 != 0) {
                        getpostalcode3.serializer(constructor);
                    } else {
                        getpostalcode3.serializer(constructor);
                        throw null;
                    }
                }
                c8$$ExternalSyntheticOutline0.m(companion, getpostalcode3, modalBottomSheetYbuCTN8Serializer, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode3, Integer.valueOf(iHashCode), getpostalcode3));
                getpostalcode3.serializer(1155768517);
                it = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.iterator();
                i8 = 0;
                while (it.hasNext()) {
                    next = it.next();
                    if (i8 >= 0) {
                        findfragmentbytag = (findFragmentByTag) next;
                        getpostalcode3.RemoteActionCompatParcelizer(-1222402268, findfragmentbytag);
                        if (i8 == 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (i8 == r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.size() - 1) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (findfragmentbytag.serializer) {
                            modifier6 = Modifier.Companion;
                            getpostalcode3 = getpostalcode3;
                            z6 = true;
                        } else {
                            Modifier.Companion companion4 = Modifier.Companion;
                            f = Dimensions.setTransitioning;
                            z6 = true;
                            if (!z4) {
                                fM3673constructorimpl = Dp.m3673constructorimpl(0.0f);
                            } else {
                                fM3673constructorimpl = f;
                            }
                            if (!z5) {
                                fM3673constructorimpl2 = Dp.m3673constructorimpl(0.0f);
                            } else {
                                fM3673constructorimpl2 = f;
                            }
                            modifierWindowInsetsPadding = PaddingKt.read(companion4, f, fM3673constructorimpl, f, fM3673constructorimpl2);
                            if (z4) {
                                int i34 = IconCompatParcelizer + 55;
                                RemoteActionCompatParcelizer = i34 % Fields.SpotShadowColor;
                                int i35 = i34 % 2;
                                modifierWindowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(modifierWindowInsetsPadding, tooltipDefaultsRemoteActionCompatParcelizer);
                            }
                            modifier6 = modifierWindowInsetsPadding;
                        }
                        getPostalCode getpostalcode6 = getpostalcode3;
                        FloatingRow(modifier6, supportfinishaftertransition.RemoteActionCompatParcelizer(findfragmentbytag.IconCompatParcelizer, homeFragment$initPopupLayer$1, anonymousClass1, roomDatabase$closeBarrier$1), supportfinishaftertransition.RemoteActionCompatParcelizer(findfragmentbytag.write, homeFragment$initPopupLayer$1, anonymousClass1, roomDatabase$closeBarrier$1), supportfinishaftertransition.RemoteActionCompatParcelizer(findfragmentbytag.RemoteActionCompatParcelizer, homeFragment$initPopupLayer$1, anonymousClass1, roomDatabase$closeBarrier$1), getpostalcode6, 0);
                        getpostalcode6.IconCompatParcelizer(false);
                        i8++;
                        it = it;
                        getpostalcode3 = getpostalcode6;
                    } else {
                        SQLite.serializer();
                        throw null;
                    }
                }
                getpostalcode2 = getpostalcode3;
                getpostalcode2.IconCompatParcelizer(false);
                getpostalcode2.IconCompatParcelizer(true);
                size = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.size();
                if ((i7 & 458752) == 131072) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = getpostalcode2.read(size);
                objComponentActivity = getpostalcode2.ComponentActivity();
                if (!(z3 | z2)) {
                    objComponentActivity = new MatrixCompanion(r8lambdaunavo3sxub_pc9xroryotnrlvsm, size, 2);
                    getpostalcode2.write(objComponentActivity);
                } else {
                    objComponentActivity = new MatrixCompanion(r8lambdaunavo3sxub_pc9xroryotnrlvsm, size, 2);
                    getpostalcode2.write(objComponentActivity);
                }
                getPhoneNumberNational.serializer(Integer.valueOf(size), (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode2);
                modifier3 = modifier5;
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode2 = getpostalcode3;
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier3 = modifier2;
            tooltipDefaultsRemoteActionCompatParcelizer = tooltipDefaults2;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode2.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.onResumeFragments
                private static int PlaybackStateCompat = 0;
                private static int PlaybackStateCompatCustomAction = 1;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i36 = 2 % 2;
                    int i37 = PlaybackStateCompatCustomAction + 29;
                    PlaybackStateCompat = i37 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i38 = i37 % 2;
                    ((Integer) obj2).getClass();
                    FloatingContentKt.FloatingContent(supportstartpostponedentertransition, supportfinishaftertransition, homeFragment$initPopupLayer$1, anonymousClass1, roomDatabase$closeBarrier$1, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier3, tooltipDefaultsRemoteActionCompatParcelizer, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i39 = PlaybackStateCompat + 81;
                    PlaybackStateCompatCustomAction = i39 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i39 % 2 == 0) {
                        int i310 = 52 / 0;
                    }
                    return createfromparcel;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v34 */
    public static final void FloatingRow(Modifier modifier, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde2, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        createFromParcel createfromparcel;
        ?? r0;
        boolean z4;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(225249402);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            if (getpostalcode.read(modifier)) {
                int i5 = IconCompatParcelizer + 79;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                i3 = i5 % 2 == 0 ? 3 : 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i6 = IconCompatParcelizer + 83;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde1) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i2 & 1171) != 1170) {
            int i8 = RemoteActionCompatParcelizer + 69;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            int i10 = IconCompatParcelizer + 19;
            RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            Arrangement$Center$1 arrangement$Center$1 = Arrangement.read;
            Alignment.Companion companion = Alignment.Companion;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Modifier modifierWrite = SizeKt.write(modifier, 1.0f);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(arrangement$Center$1, centerVertically, getpostalcode, 54);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            createFromParcel createfromparcel2 = null;
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 == null) {
                int i12 = IconCompatParcelizer + 101;
                RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                if (i12 % 2 == 0) {
                    int i13 = 91 / 0;
                    if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde2 != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde2 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = true;
            }
            createFromParcel createfromparcel3 = createFromParcel.INSTANCE;
            if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 != null || z2) {
                getpostalcode.serializer(-1777887905);
                Modifier modifier2 = SizeKt.read(PaddingKt.m74paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, Dimensions.setTabContainer, 0.0f, 11));
                MeasurePolicy measurePolicy = BoxKt.read(companion.getTopStart(), false);
                int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifier2);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor2);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
                if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 == null) {
                    int i14 = IconCompatParcelizer + 21;
                    RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                    if (i14 % 2 == 0) {
                        getpostalcode.serializer(-491005990);
                        z3 = false;
                    } else {
                        z3 = false;
                        getpostalcode.serializer(-491005990);
                    }
                    getpostalcode.IconCompatParcelizer(z3);
                    createfromparcel = null;
                } else {
                    z3 = false;
                    getpostalcode.serializer(2062371079);
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(getpostalcode, Integer.valueOf((i2 >> 3) & 14));
                    getpostalcode.IconCompatParcelizer(false);
                    createfromparcel = createfromparcel3;
                }
                if (createfromparcel == null) {
                    getpostalcode.serializer(2062371475);
                    ContentPlaceholder(getpostalcode, z3 ? 1 : 0);
                } else {
                    getpostalcode.serializer(2062370669);
                }
                getpostalcode.IconCompatParcelizer(z3);
                int i15 = IconCompatParcelizer + 75;
                RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(z3);
            } else {
                getpostalcode.serializer(-1777637084);
                getpostalcode.IconCompatParcelizer(false);
                z3 = false;
            }
            if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 == null) {
                getpostalcode.serializer(-1777606302);
                getpostalcode.IconCompatParcelizer(z3);
            } else {
                getpostalcode.serializer(-1777606301);
                Alignment topCenter = companion.getTopCenter();
                Modifier modifierM = d$$ExternalSyntheticOutline0.m(1.0f, true, Modifier.Companion);
                MeasurePolicy measurePolicy2 = BoxKt.read(topCenter, z3);
                int iHashCode3 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion2.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor3);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode3), getpostalcode));
                z3 = false;
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde1.invoke(getpostalcode, 0);
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(false);
            }
            if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde2 != null || z2) {
                getpostalcode.serializer(-1777362145);
                Modifier modifier3 = SizeKt.read(PaddingKt.m74paddingqDBjuR0$default(Modifier.Companion, Dimensions.setTabContainer, 0.0f, 0.0f, 0.0f, 14));
                MeasurePolicy measurePolicy3 = BoxKt.read(companion.getTopStart(), false);
                int iHashCode4 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer4 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(getpostalcode, modifier3);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor4 = companion2.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!getpostalcode.ComponentActivity) {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                } else {
                    getpostalcode.serializer(constructor4);
                }
                af$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy3, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer4);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier4, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode4), getpostalcode));
                if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde2 == null) {
                    getpostalcode.serializer(-1406481725);
                    r0 = 0;
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    r0 = 0;
                    getpostalcode.serializer(231724286);
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde2.invoke(getpostalcode, Integer.valueOf((i2 >> 9) & 14));
                    getpostalcode.IconCompatParcelizer(false);
                    createfromparcel2 = createfromparcel3;
                }
                if (createfromparcel2 == null) {
                    getpostalcode.serializer(231724682);
                    ContentPlaceholder(getpostalcode, r0);
                } else {
                    getpostalcode.serializer(231723938);
                }
                getpostalcode.IconCompatParcelizer((boolean) r0);
                int i17 = IconCompatParcelizer + 41;
                RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
                if (i17 % 2 == 0) {
                    z4 = true;
                    getpostalcode.IconCompatParcelizer(true);
                    getpostalcode.IconCompatParcelizer(true);
                } else {
                    z4 = true;
                    getpostalcode.IconCompatParcelizer(true);
                    getpostalcode.IconCompatParcelizer(false);
                }
            } else {
                getpostalcode.serializer(-1777111324);
                getpostalcode.IconCompatParcelizer(z3);
                z4 = true;
            }
            getpostalcode.IconCompatParcelizer(z4);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i18 = RemoteActionCompatParcelizer + 55;
            IconCompatParcelizer = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getStrokeJoinLxFBmk8(modifier, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, r8lambdaa6_tctqmksh3fk6hjgcbkuvde2, i, 1);
        }
    }
}
