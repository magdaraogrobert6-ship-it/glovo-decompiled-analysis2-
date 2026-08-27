package o;

import com.incognia.internal.pcn;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class configConnectionForPOST {
    private static int read = 1;
    private static int write;

    /* JADX WARN: Code duplicated, block: B:33:0x007a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0085  */
    /* JADX WARN: Code duplicated, block: B:36:0x0088  */
    /* JADX WARN: Code duplicated, block: B:37:0x008b  */
    /* JADX WARN: Code duplicated, block: B:59:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:80:0x0175  */
    public static final void serializer(extractTargetUrl extracttargeturl, float f, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier, getBirthDateFull getbirthdatefull, int i, int i2) {
        int i3;
        boolean z;
        getPostalCode getpostalcode;
        int i4;
        int i5;
        int i6;
        androidx.compose.ui.Modifier modifier2 = modifier;
        int i7 = 2 % 2;
        extracttargeturl.getClass();
        float f2 = extracttargeturl.write;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-487626191);
        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.serializer;
        if ((i & 6) == 0) {
            if (getpostalcode2.read(boxScopeInstance)) {
                int i8 = read + 71;
                write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode2.read(extracttargeturl) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= getpostalcode2.serializer(f) ? androidx.compose.ui.graphics.Fields.RotationX : androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            int i10 = write + 85;
            read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                    i4 = write + 13;
                    read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        i5 = 23743;
                    } else {
                        i5 = androidx.compose.ui.graphics.Fields.CameraDistance;
                    }
                } else {
                    i5 = androidx.compose.ui.graphics.Fields.RotationZ;
                }
            } else {
                int i11 = 73 / 0;
                if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                    i4 = write + 13;
                    read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        i5 = 23743;
                    } else {
                        i5 = androidx.compose.ui.graphics.Fields.CameraDistance;
                    }
                } else {
                    i5 = androidx.compose.ui.graphics.Fields.RotationZ;
                }
            }
            i3 |= i5;
        }
        int i12 = i2 & 8;
        if (i12 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            int i13 = write + 89;
            read = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i13 % 2 != 0) {
                i3 |= getpostalcode2.read(modifier2) ? androidx.compose.ui.graphics.Fields.Clip : 8192;
            } else {
                getpostalcode2.read(modifier2);
                throw null;
            }
        }
        if ((i3 & 9363) != 9362) {
            int i14 = write + 19;
            read = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i14 % 2 == 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (getpostalcode2.write(i3 & 1, z)) {
            if (i12 != 0) {
                modifier2 = androidx.compose.ui.Modifier.Companion;
            }
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            long onMenuItemClickListener = ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setOnMenuItemClickListener();
            long backgroundDrawable = ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setBackgroundDrawable();
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = androidx.compose.runtime.CompositionKt.serializer(new errorMessage(onMenuItemClickListener, backgroundDrawable, f));
                getpostalcode2.write(objComponentActivity);
                int i15 = write + 27;
                read = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i16 = i15 % 2;
            }
            onViewAttachedToWindow onviewattachedtowindow = (onViewAttachedToWindow) objComponentActivity;
            float fWrite = RangesKt.write(1.0f - f2, 0.0f, 1.0f);
            requiredWidthInVpY3zN4default requiredwidthinvpy3zn4default = (requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), new Object[]{1000, 0, performFling.read, 2});
            boolean z2 = (i3 & 7168) == 2048;
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            if (!z2) {
                int i17 = read + 67;
                write = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i17 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new r8lambdacpVRyEhxzdUx5p9KqbggyjwKD6M(11, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    getpostalcode2.write(objComponentActivity2);
                }
            } else {
                objComponentActivity2 = new r8lambdacpVRyEhxzdUx5p9KqbggyjwKD6M(11, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                getpostalcode2.write(objComponentActivity2);
            }
            androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.foundation.BackgroundKt.m20backgroundbw27NRU(androidx.compose.foundation.layout.SizeKt.write(androidx.compose.foundation.layout.SizeKt.serializer(modifier2, 1.0f), ((Number) TapGestureDetectorKtprocessTapGestureresetJob1.IconCompatParcelizer(fWrite, requiredwidthinvpy3zn4default, null, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode2, 0, 12).getValue()).floatValue()), ((androidx.compose.ui.graphics.Color) onviewattachedtowindow.getValue()).m732unboximpl(), androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape()), getpostalcode2, 0);
            if (f2 < 1.0f) {
                int i18 = write + 61;
                read = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i19 = i18 % 2;
                getpostalcode2.serializer(-1291513089);
                getpostalcode = getpostalcode2;
                androidx.compose.material3.TextKt.m131TextNvy7gAk(extracttargeturl.RemoteActionCompatParcelizer, androidx.compose.foundation.layout.PaddingKt.m74paddingqDBjuR0$default(boxScopeInstance.align(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.Alignment.Companion.getCenterEnd()), 0.0f, 0.0f, Dimensions.setTabContainer, 0.0f, 11), ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getPopupTheme(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (androidx.compose.ui.text.TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode, 0, 0, 131064);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode = getpostalcode2;
                getpostalcode.serializer(-1291243823);
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        androidx.compose.ui.Modifier modifier3 = modifier2;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new ud(extracttargeturl, f, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier3, i, i2);
        }
    }
}
