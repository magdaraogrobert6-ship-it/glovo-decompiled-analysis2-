package com.roadrunner.map.integration.mapbox.ui.maneuver.compose;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.nafath.logger.NafathLogger$$ExternalSyntheticLambda0;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda2;
import o.AndroidContentCaptureManager;
import o.LineHeightStyleAlignment;
import o.LineHeightStyleAlignmentCompanion;
import o.getBirthDateFull;
import o.getBottomPIaL0Z0;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.getTrimEVpEnUU;
import o.na;
import o.p2;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ManeuverKt {
    private static int read = 1;
    private static int write;

    public static final void IconCompatParcelizer(getTrimEVpEnUU gettrimevpenuu, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        gettrimevpenuu.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(2086199954);
        if ((i & 6) == 0) {
            if (getpostalcode.read(gettrimevpenuu)) {
                int i5 = read + 45;
                write = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
            int i7 = write + 75;
            read = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
        } else {
            int i9 = read + 51;
            write = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            i2 = i;
        }
        int i11 = i2 | 48;
        if (!(!getpostalcode.write(i11 & 1, (i11 & 19) != 18))) {
            modifier = Modifier.Companion;
            LineHeightStyleAlignment lineHeightStyleAlignment = (LineHeightStyleAlignment) ExtrasKt.write(((na) gettrimevpenuu).IconCompatParcelizer, getpostalcode, 0).getValue();
            if (lineHeightStyleAlignment instanceof getBottomPIaL0Z0) {
                int i12 = read + 29;
                write = i12 % Fields.SpotShadowColor;
                if (i12 % 2 != 0) {
                    getpostalcode.serializer(-911565322);
                    getpostalcode.IconCompatParcelizer(true);
                } else {
                    getpostalcode.serializer(-911565322);
                    getpostalcode.IconCompatParcelizer(false);
                }
            } else {
                if (!(lineHeightStyleAlignment instanceof LineHeightStyleAlignmentCompanion)) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, -911568384, false);
                }
                int i13 = write + 5;
                read = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                getpostalcode.serializer(1806282641);
                RemoteActionCompatParcelizer((LineHeightStyleAlignmentCompanion) lineHeightStyleAlignment, modifier, getpostalcode, i11 & 112);
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p2(i, 19, gettrimevpenuu, modifier);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bf  */
    public static final void RemoteActionCompatParcelizer(LineHeightStyleAlignmentCompanion lineHeightStyleAlignmentCompanion, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = read + 35;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-827302429);
        if ((i & 6) == 0) {
            if ((i & 8) == 0 ? getpostalcode.read(lineHeightStyleAlignmentCompanion) : getpostalcode.IconCompatParcelizer(lineHeightStyleAlignmentCompanion)) {
                int i7 = read + 19;
                write = i7 % Fields.SpotShadowColor;
                i3 = i7 % 2 != 0 ? 3 : 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(modifier) ? 32 : 16;
        }
        boolean z = false;
        int i8 = 1;
        if (getpostalcode.write(i2 & 1, (i2 & 19) != 18)) {
            Object obj = null;
            Modifier modifierClip = ClipKt.clip(SizeKt.serializer(SizeKt.write(modifier, 1.0f), (Alignment.Vertical) null, 3), RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.enterPictureInPictureMode));
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new NafathLogger$$ExternalSyntheticLambda0(10);
                getpostalcode.write(objComponentActivity);
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity;
            if ((i2 & 14) == 4) {
                z = true;
            } else if ((i2 & 8) != 0) {
                int i9 = read + 87;
                write = i9 % Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    getpostalcode.IconCompatParcelizer(lineHeightStyleAlignmentCompanion);
                    obj.hashCode();
                    throw null;
                }
                if (getpostalcode.IconCompatParcelizer(lineHeightStyleAlignmentCompanion)) {
                    z = true;
                }
            }
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (z) {
                objComponentActivity2 = new TncContentKt$$ExternalSyntheticLambda2(i8, lineHeightStyleAlignmentCompanion);
                getpostalcode.write(objComponentActivity2);
            } else {
                int i10 = read + 101;
                write = i10 % Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    throw null;
                }
                if (objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new TncContentKt$$ExternalSyntheticLambda2(i8, lineHeightStyleAlignmentCompanion);
                    getpostalcode.write(objComponentActivity2);
                }
            }
            AndroidView_androidKt.AndroidView(r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifierClip, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode, 6, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p2(i, 20, lineHeightStyleAlignmentCompanion, modifier);
        }
    }
}
