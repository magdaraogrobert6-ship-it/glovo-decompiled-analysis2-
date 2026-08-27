package com.roadrunner.bubble.presentation;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.fragment.app.FragmentActivity;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.d4$$ExternalSyntheticLambda2;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.util.UtilsKt;
import com.incognia.internal.pcn;
import com.roadrunner.bubble.presentation.BubbleContentKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.allocateItemsIndex;
import o.buildMapping;
import o.canReadPlayIds;
import o.debugString;
import o.extractAuthorizationHeader;
import o.findKNearestNeighbors;
import o.findNearestNeighbor;
import o.forEachFocusableIntersection;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getInternalPaintui_graphics;
import o.getNewPassword;
import o.getPostalCode;
import o.getQueryContext;
import o.getTopLeftannotations;
import o.insertdefault;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.setCurrentSemanticsNodesui;
import o.updateSubhierarchy;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BubbleContentKt {
    private static int IconCompatParcelizer = 1;
    private static int read;

    public static final void RemoteActionCompatParcelizer(final long j, final Modifier modifier, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = IconCompatParcelizer + 41;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1752869990);
        if ((i & 6) == 0) {
            int i6 = IconCompatParcelizer + 49;
            read = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                getpostalcode.serializer(j);
                throw null;
            }
            i2 = (getpostalcode.serializer(j) ? 4 : 2) | i;
        } else {
            int i7 = read + 77;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(modifier) ? 32 : 16;
        }
        if ((i2 & 19) != 18) {
            int i9 = read + 119;
            int i10 = i9 % Fields.SpotShadowColor;
            IconCompatParcelizer = i10;
            int i11 = i9 % 2;
            int i12 = i10 + 5;
            read = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!getpostalcode.write(i2 & 1, z)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
            Modifier modifierM83size3ABfNKs = SizeKt.m83size3ABfNKs(modifier, Dimensions.setTabContainer);
            long popupTheme = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme();
            getTopLeftannotations gettopleftannotations = RoundedCornerShapeKt.IconCompatParcelizer;
            BoxKt.Box(BackgroundKt.m20backgroundbw27NRU(PaddingKt.write(BackgroundKt.m20backgroundbw27NRU(modifierM83size3ABfNKs, popupTheme, gettopleftannotations), Dimensions.RemoteActionCompatParcelizer), j, gettopleftannotations), getpostalcode, 0);
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.defragment
                private static int RemoteActionCompatParcelizer = 0;
                private static int serializer = 1;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i14 = 2 % 2;
                    int i15 = RemoteActionCompatParcelizer + 77;
                    serializer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    ((Integer) obj2).getClass();
                    int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i | 1);
                    BubbleContentKt.RemoteActionCompatParcelizer(j, modifier, (getBirthDateFull) obj, iRemoteActionCompatParcelizer);
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i17 = RemoteActionCompatParcelizer + 121;
                    serializer = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i17 % 2 != 0) {
                        return createfromparcel;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            };
            int i14 = IconCompatParcelizer + 79;
            read = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
        }
    }

    public static final void write(String str, String str2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, extractAuthorizationHeader extractauthorizationheader, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        extractAuthorizationHeader extractauthorizationheader2;
        extractAuthorizationHeader extractauthorizationheader3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1497504023);
        if ((i & 6) == 0) {
            if (!getpostalcode.read(str)) {
                i6 = 2;
            } else {
                int i8 = IconCompatParcelizer + 37;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i6 = 4;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i10 = IconCompatParcelizer + 5;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            if (getpostalcode.read(str2)) {
                int i12 = IconCompatParcelizer + 73;
                read = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i14 = read + 5;
                IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                i4 = Fields.RotationX;
            } else {
                i4 = Fields.SpotShadowColor;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode.read(modifier)) {
                i3 = Fields.CameraDistance;
            } else {
                int i16 = read + 111;
                IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                i3 = Fields.RotationZ;
            }
            i2 |= i3;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((i2 & 9363) != 9362) {
            int i18 = IconCompatParcelizer + 19;
            read = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(1 & i2, z)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) == 0 || getpostalcode.PlaybackStateCompat()) {
                extractauthorizationheader3 = new extractAuthorizationHeader();
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                extractauthorizationheader3 = extractauthorizationheader;
            }
            getpostalcode.RemoteActionCompatParcelizer();
            ModuleDSLKt.IconCompatParcelizer(ExtrasKt.write(2111471868, new updateSubhierarchy(extractauthorizationheader3, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, str, str2, 0), getpostalcode), getpostalcode, 6);
            extractauthorizationheader2 = extractauthorizationheader3;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            extractauthorizationheader2 = extractauthorizationheader;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new findNearestNeighbor(str, str2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, extractauthorizationheader2, i, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0034  */
    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    /* JADX WARN: Code duplicated, block: B:14:0x0039 A[PHI: r2
  0x0039: PHI (r2v9 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x002c, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:28:0x006b  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:9:0x002e A[PHI: r2
  0x002e: PHI (r2v6 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x002c, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void BubbleButtonWithIndicatorBox(allocateItemsIndex allocateitemsindex, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = read + 25;
        IconCompatParcelizer = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1913297694);
            if ((i & 4) == 0) {
                if (getpostalcode.read(allocateitemsindex)) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1913297694);
            if ((i & 6) == 0) {
                if (getpostalcode.read(allocateitemsindex)) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            int i9 = IconCompatParcelizer + 51;
            read = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                    i5 = IconCompatParcelizer + 43;
                    read = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        i6 = 47;
                    } else {
                        i6 = 32;
                    }
                } else {
                    i6 = 16;
                }
            } else {
                int i10 = 19 / 0;
                if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                    i5 = IconCompatParcelizer + 43;
                    read = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        i6 = 47;
                    } else {
                        i6 = 32;
                    }
                } else {
                    i6 = 16;
                }
            }
            i3 |= i6;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.read(modifier)) {
                i4 = Fields.RotationX;
            } else {
                int i11 = IconCompatParcelizer + 99;
                read = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i4 = Fields.SpotShadowColor;
            }
            i3 |= i4;
        }
        int i13 = i3;
        if ((i13 & 147) != 146) {
            int i14 = IconCompatParcelizer + 23;
            read = i14 % Fields.SpotShadowColor;
            if (i14 % 2 != 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (getpostalcode.write(i13 & 1, z)) {
            Modifier modifier2 = canReadPlayIds.read(modifier, null, false, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode, 63);
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicy = BoxKt.read(companion.getTopStart(), false);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!getpostalcode.ComponentActivity) {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                } else {
                    int i15 = IconCompatParcelizer + 115;
                    read = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    getpostalcode.serializer(constructor);
                }
                af$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                String str = allocateitemsindex.serializer;
                String str2 = allocateitemsindex.read;
                Modifier.Companion companion3 = Modifier.Companion;
                Alignment center = companion.getCenter();
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.serializer;
                write(str, str2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, boxScopeInstance.align(companion3, center), null, getpostalcode, (i13 << 3) & 896);
                RemoteActionCompatParcelizer(allocateitemsindex.RemoteActionCompatParcelizer, boxScopeInstance.align(companion3, companion.getTopEnd()), getpostalcode, 0);
                getpostalcode.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getInternalPaintui_graphics(i, 2, allocateitemsindex, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier);
        }
    }

    public static final void serializer(forEachFocusableIntersection foreachfocusableintersection, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        foreachfocusableintersection.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(452690542);
        if ((i & 6) == 0) {
            int i6 = IconCompatParcelizer + 11;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (getpostalcode.read(foreachfocusableintersection)) {
                int i8 = IconCompatParcelizer + 39;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i10 = IconCompatParcelizer + 91;
                read = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
            int i12 = read + 77;
            IconCompatParcelizer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
        }
        if (getpostalcode.write(i2 & 1, !((i2 & 19) == 18))) {
            int i14 = IconCompatParcelizer + 11;
            read = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            FragmentActivity fragmentActivityRemoteActionCompatParcelizer = UtilsKt.RemoteActionCompatParcelizer((Context) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext()));
            View view = (View) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalView());
            debugString debugstring = (debugString) ExtrasKt.write(foreachfocusableintersection.MediaSessionCompatResultReceiverWrapper, getpostalcode, 0).getValue();
            boolean z = debugstring instanceof allocateItemsIndex;
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z) {
                getpostalcode.serializer(1243924074);
                allocateItemsIndex allocateitemsindex = (allocateItemsIndex) debugstring;
                boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(view);
                boolean z2 = (i2 & 14) == 4;
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if ((z2 | zIconCompatParcelizer) || objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new d4$$ExternalSyntheticLambda2(view, 21, foreachfocusableintersection);
                    getpostalcode.write(objComponentActivity);
                }
                Modifier.Companion companion = Modifier.Companion;
                companion.getClass();
                BubbleButtonWithIndicatorBox(allocateitemsindex, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, companion, getpostalcode, 384);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{debugstring, insertdefault.serializer}, getCieXyz.write())).booleanValue()) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, 1243921040, false);
                }
                getpostalcode.serializer(1243933682);
                getpostalcode.IconCompatParcelizer(false);
                int i16 = read + 107;
                IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
            }
            getQueryContext getquerycontext = foreachfocusableintersection.PlaybackStateCompatCustomAction;
            boolean z3 = (i2 & 112) == 32;
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if ((zIconCompatParcelizer2 | z3) || objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new Recomposer$$ExternalSyntheticLambda4(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 24, fragmentActivityRemoteActionCompatParcelizer);
                getpostalcode.write(objComponentActivity2);
            }
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode, 8);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new o.SizeKt(i, 5, foreachfocusableintersection, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
        int i18 = read + 53;
        IconCompatParcelizer = i18 % Fields.SpotShadowColor;
        if (i18 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c6  */
    public static final void BubbleButtonColumn(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str, String str2) {
        int i2;
        getPostalCode getpostalcode;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1731936055);
        if ((i & 6) == 0) {
            int i5 = IconCompatParcelizer + 23;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i2 = i | (getpostalcode2.read(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i7 = IconCompatParcelizer + 5;
            read = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (getpostalcode2.read(str2)) {
                int i9 = IconCompatParcelizer + 1;
                int i10 = i9 % Fields.SpotShadowColor;
                read = i10;
                int i11 = i9 % 2;
                int i12 = i10 + 87;
                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                if (i12 % 2 == 0) {
                    int i13 = 3 / 3;
                }
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i14 = i2 | 384;
        if (getpostalcode2.write(i14 & 1, (i14 & 147) != 146)) {
            int i15 = IconCompatParcelizer + 99;
            read = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            Modifier.Companion companion = Modifier.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.IconCompatParcelizer, Alignment.Companion.getCenterHorizontally(), getpostalcode2, 54);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i17 = read + 25;
            IconCompatParcelizer = i17 % Fields.SpotShadowColor;
            if (i17 % 2 == 0) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                int i18 = 84 / 0;
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
            } else {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            TextOverflow.Companion companion3 = TextOverflow.Companion;
            int iM3569getEllipsisgIe3tQ8 = companion3.m3569getEllipsisgIe3tQ8();
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            long onMenuItemClickListener = ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setOnMenuItemClickListener();
            TextStyle textStyleRemoteActionCompatParcelizer = performLayout.RemoteActionCompatParcelizer();
            companion.getClass();
            TextKt.m131TextNvy7gAk(str, companion, onMenuItemClickListener, 0L, null, null, 0L, null, 0L, iM3569getEllipsisgIe3tQ8, false, 1, 0, null, textStyleRemoteActionCompatParcelizer, getpostalcode2, i14 & 14, 24960, 110584);
            int iM3569getEllipsisgIe3tQ9 = companion3.m3569getEllipsisgIe3tQ8();
            getpostalcode = getpostalcode2;
            TextKt.m131TextNvy7gAk(str2, companion, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, iM3569getEllipsisgIe3tQ9, false, 1, 0, null, (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode, (i14 >> 3) & 14, 24960, 110584);
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new findKNearestNeighbors(str, str2, modifier2, i, 0);
        }
    }
}
