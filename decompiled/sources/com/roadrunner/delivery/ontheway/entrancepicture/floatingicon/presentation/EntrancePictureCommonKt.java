package com.roadrunner.delivery.ontheway.entrancepicture.floatingicon.presentation;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidPathIterator_androidKtWhenMappings;
import o.AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl;
import o.DefaultPagerNestedScrollConnection;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.SingleThreadCachedScheduler1;
import o.buildMapping;
import o.canReadPlayIds;
import o.currentTimeMillis;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getNonZeroRgk1Os;
import o.getPostalCode;
import o.getTopLeftannotations;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdab6E1D0lY25DehDHETb0gPJfQmz4;
import o.setCurrentSemanticsNodesui;

/* JADX INFO: loaded from: classes3.dex */
public abstract class EntrancePictureCommonKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;

    /* JADX WARN: Code duplicated, block: B:40:0x0081  */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:43:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x009d  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:55:0x0106  */
    /* JADX WARN: Code duplicated, block: B:58:0x0110  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    public static final void write(int i, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i2, int i3) {
        int i4;
        Modifier modifier2;
        boolean z2;
        Modifier modifier3;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        Modifier modifier4;
        int i5;
        int i6 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1760458787);
        if ((i2 & 6) == 0) {
            i4 = (getpostalcode.read(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            int i7 = RemoteActionCompatParcelizer + 77;
            write = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            i4 |= getpostalcode.write(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i9 = i3 & 8;
        if (i9 == 0) {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i4 |= getpostalcode.read(modifier2) ? Fields.CameraDistance : Fields.RotationZ;
            }
            if ((i2 & 24576) == 0) {
                int i10 = RemoteActionCompatParcelizer + 119;
                write = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                    i5 = Fields.Clip;
                } else {
                    i5 = 8192;
                }
                i4 |= i5;
            }
            if ((i4 & 9363) != 9362) {
                int i12 = RemoteActionCompatParcelizer + 41;
                write = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            if (getpostalcode.write(i4 & 1, z2)) {
                if (i9 != 0) {
                    modifier4 = Modifier.Companion;
                } else {
                    modifier4 = modifier2;
                }
                Modifier modifier5 = canReadPlayIds.read(modifier4, null, false, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode, 63);
                getTopLeftannotations gettopleftannotationsIconCompatParcelizer = RoundedCornerShapeKt.IconCompatParcelizer(Dimensions._init_lambda3);
                float f = Dimensions.MediaBrowserCompatMediaItem;
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                SurfaceKt.m126SurfaceT9BRK9s(modifier5, gettopleftannotationsIconCompatParcelizer, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).IconCompatParcelizer(), 0L, 0.0f, Dimensions.setGroupDividerEnabled, DefaultPagerNestedScrollConnection.serializer(f, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).removeOnContextAvailableListener()), ExtrasKt.write(-713915912, new currentTimeMillis(i, 1, dragAndDropTargetModifierNode, z), getpostalcode), getpostalcode, 12582912, 24);
                modifier3 = modifier4;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier3 = modifier2;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new SingleThreadCachedScheduler1(i, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier3, dragAndDropTargetModifierNode, i2, i3);
            }
        }
        i4 |= 3072;
        modifier2 = modifier;
        int i14 = RemoteActionCompatParcelizer + 125;
        write = i14 % Fields.SpotShadowColor;
        if (i14 % 2 == 0) {
            int i15 = 2 / 4;
        }
        if ((i2 & 24576) == 0) {
            int i16 = RemoteActionCompatParcelizer + 119;
            write = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                i5 = Fields.Clip;
            } else {
                i5 = 8192;
            }
            i4 |= i5;
        }
        if ((i4 & 9363) != 9362) {
            int i18 = RemoteActionCompatParcelizer + 41;
            write = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (getpostalcode.write(i4 & 1, z2)) {
            if (i9 != 0) {
                modifier4 = Modifier.Companion;
            } else {
                modifier4 = modifier2;
            }
            Modifier modifier6 = canReadPlayIds.read(modifier4, null, false, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode, 63);
            getTopLeftannotations gettopleftannotationsIconCompatParcelizer2 = RoundedCornerShapeKt.IconCompatParcelizer(Dimensions._init_lambda3);
            float f2 = Dimensions.MediaBrowserCompatMediaItem;
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui2 = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            SurfaceKt.m126SurfaceT9BRK9s(modifier6, gettopleftannotationsIconCompatParcelizer2, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui2)).IconCompatParcelizer(), 0L, 0.0f, Dimensions.setGroupDividerEnabled, DefaultPagerNestedScrollConnection.serializer(f2, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui2)).removeOnContextAvailableListener()), ExtrasKt.write(-713915912, new currentTimeMillis(i, 1, dragAndDropTargetModifierNode, z), getpostalcode), getpostalcode, 12582912, 24);
            modifier3 = modifier4;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier3 = modifier2;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new SingleThreadCachedScheduler1(i, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier3, dragAndDropTargetModifierNode, i2, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:66:0x0107  */
    /* JADX WARN: Code duplicated, block: B:69:0x0119  */
    /* JADX WARN: Code duplicated, block: B:73:0x0122  */
    /* JADX WARN: Code duplicated, block: B:75:0x0137  */
    /* JADX WARN: Code duplicated, block: B:77:0x016a  */
    /* JADX WARN: Code duplicated, block: B:79:0x016e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0177  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    public static final void IconCompatParcelizer(String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier modifier, getBirthDateFull getbirthdatefull, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        int i5;
        Modifier modifier3;
        boolean z2;
        Object objComponentActivity;
        boolean z3;
        Object objComponentActivity2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 2 % 2;
        str.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-66860787);
        if ((i & 6) == 0) {
            if (getpostalcode.read(str)) {
                int i11 = RemoteActionCompatParcelizer + 29;
                write = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i;
        } else {
            i3 = i;
        }
        Object obj = null;
        if ((i & 48) == 0) {
            int i13 = write + 31;
            RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
            if (i13 % 2 == 0) {
                i3 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
            } else {
                getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                obj.hashCode();
                throw null;
            }
        }
        if ((i & 384) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                int i14 = RemoteActionCompatParcelizer + 105;
                write = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                i8 = 256;
            } else {
                i8 = Fields.SpotShadowColor;
            }
            i3 |= i8;
        }
        int i16 = i2 & 8;
        if (i16 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                if (getpostalcode.read(modifier2)) {
                    int i17 = write + 89;
                    RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
                    i4 = i17 % 2 != 0 ? 30311 : Fields.CameraDistance;
                } else {
                    i4 = Fields.RotationZ;
                }
                i3 |= i4;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (getpostalcode.write(i3 & 1, z)) {
                i5 = write + 67;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                if (i16 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                ContentScale crop = ContentScale.Companion.getCrop();
                Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_bold_double_extra_large_loading_image_loading_image, getpostalcode, 0);
                Modifier modifierM83size3ABfNKs = SizeKt.m83size3ABfNKs(modifier3, Dimensions.onPictureInPictureUiStateChanged);
                Painter painterPainterResource2 = PainterResources_androidKt.painterResource(R.drawable.ic_bold_double_extra_large_loading_image_loading_image, getpostalcode, 0);
                if ((i3 & 112) == 32) {
                    i7 = RemoteActionCompatParcelizer + 93;
                    write = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 == 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                } else {
                    z2 = false;
                }
                objComponentActivity = getpostalcode.ComponentActivity();
                AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (!z2 || objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(19, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    getpostalcode.write(objComponentActivity);
                }
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity;
                z3 = (i3 & 896) == 256;
                objComponentActivity2 = getpostalcode.ComponentActivity();
                if (!z3 || objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(20, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                    getpostalcode.write(objComponentActivity2);
                    i6 = write + 5;
                    RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 != 0) {
                        int i18 = 5 % 2;
                    }
                }
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2;
                int i19 = Painter.$stable;
                getNonZeroRgk1Os.write(str, "entrance picture", modifierM83size3ABfNKs, painterPainterResource2, painterPainterResource, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, null, crop, null, getpostalcode, (i3 & 14) | 48 | (i19 << 9) | (i19 << 12), 6, 31328);
                modifier2 = modifier3;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdab6E1D0lY25DehDHETb0gPJfQmz4(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier2, i, i2, 1);
            }
        }
        int i20 = RemoteActionCompatParcelizer + 7;
        write = i20 % Fields.SpotShadowColor;
        i3 = i20 % 2 == 0 ? i3 | 1159 : i3 | 3072;
        modifier2 = modifier;
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i3 & 1, z)) {
            i5 = write + 67;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (i16 != 0) {
                modifier3 = Modifier.Companion;
            } else {
                modifier3 = modifier2;
            }
            ContentScale crop2 = ContentScale.Companion.getCrop();
            Painter painterPainterResource3 = PainterResources_androidKt.painterResource(R.drawable.ic_bold_double_extra_large_loading_image_loading_image, getpostalcode, 0);
            Modifier modifierM83size3ABfNKs2 = SizeKt.m83size3ABfNKs(modifier3, Dimensions.onPictureInPictureUiStateChanged);
            Painter painterPainterResource4 = PainterResources_androidKt.painterResource(R.drawable.ic_bold_double_extra_large_loading_image_loading_image, getpostalcode, 0);
            if ((i3 & 112) == 32) {
                i7 = RemoteActionCompatParcelizer + 93;
                write = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            } else {
                z2 = false;
            }
            objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager2 = getCreditCardExpirationMonth.write;
            if (!z2) {
                objComponentActivity = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(19, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                getpostalcode.write(objComponentActivity);
            } else {
                objComponentActivity = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(19, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                getpostalcode.write(objComponentActivity);
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity;
            if ((i3 & 896) == 256) {
            }
            objComponentActivity2 = getpostalcode.ComponentActivity();
            if (!z3) {
                objComponentActivity2 = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(20, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                getpostalcode.write(objComponentActivity2);
                i6 = write + 5;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    int i110 = 5 % 2;
                }
            } else {
                objComponentActivity2 = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(20, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                getpostalcode.write(objComponentActivity2);
                i6 = write + 5;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    int i111 = 5 % 2;
                }
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2;
            int i112 = Painter.$stable;
            getNonZeroRgk1Os.write(str, "entrance picture", modifierM83size3ABfNKs2, painterPainterResource4, painterPainterResource3, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdaunavo3sxub_pc9xroryotnrlvsm4, null, crop2, null, getpostalcode, (i3 & 14) | 48 | (i112 << 9) | (i112 << 12), 6, 31328);
            modifier2 = modifier3;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdab6E1D0lY25DehDHETb0gPJfQmz4(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier2, i, i2, 1);
        }
    }

    public static final void PicturesCounter(Integer num, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        int i3 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1634299899);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.serializer;
        if ((i & 6) == 0) {
            i2 = (getpostalcode2.read(boxScopeInstance) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.read(num) ? 32 : 16;
        }
        if ((i2 & 19) != 18) {
            int i4 = write + 23;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i2 & 1, z)) {
            int i6 = write + 95;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            Modifier.Companion companion = Modifier.Companion;
            float f = Dimensions.getActionBarHideOffset;
            Modifier modifierM83size3ABfNKs = SizeKt.m83size3ABfNKs(PaddingKt.m74paddingqDBjuR0$default(companion, f, 0.0f, 0.0f, f, 6), Dimensions.setHideOnContentScrollEnabled);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifierM83size3ABfNKs, Color.m721copywmQWz5c$default(((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.IconCompatParcelizer(f));
            Alignment.Companion companion2 = Alignment.Companion;
            Modifier modifierAlign = boxScopeInstance.align(modifierM20backgroundbw27NRU, companion2.getBottomStart());
            MeasurePolicy measurePolicy = BoxKt.read(companion2.getTopStart(), false);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierAlign);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i8 = RemoteActionCompatParcelizer + 95;
            write = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                boolean z2 = getpostalcode2.ComponentActivity;
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor);
                int i9 = RemoteActionCompatParcelizer + 51;
                write = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            TextKt.m131TextNvy7gAk(String.valueOf(num), OffsetKt.read(boxScopeInstance.align(companion, companion2.getCenter()), Dp.m3673constructorimpl(0.0f), Dp.m3673constructorimpl(-Dimensions.RemoteActionCompatParcelizer)), ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getPopupTheme(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(-961708487, pcn.serializer(), new Object[0], 961708487, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode2, 0, 0, 131064);
            getpostalcode = getpostalcode2;
            getpostalcode.IconCompatParcelizer(true);
            int i11 = write + 15;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPathIterator_androidKtWhenMappings(num, i, 10);
        }
    }
}
