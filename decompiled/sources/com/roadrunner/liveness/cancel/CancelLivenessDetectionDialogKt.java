package com.roadrunner.liveness.cancel;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.login.presentation.LoginActivity$onCreate$1$1$1$1$5$1;
import com.roadrunner.rrds.compose.component.dialog.messagedialog.MessagePopUpKt;
import o.AndroidContentCaptureManager;
import o.SharedSQLiteStatement;
import o.TriggerBasedInvalidationTracker;
import o.generatePOSTBodyString;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.getQueryContext;
import o.internalPathIteratorPeek;
import o.onPostMigrate;
import o.onValidateSchema;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdacpVRyEhxzdUx5p9KqbggyjwKD6M;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.registerInAppMessageManagerlambda0;
import o.removeNodeAtDepth;
import o.validateMigration;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CancelLivenessDetectionDialogKt {
    private static int IconCompatParcelizer = 1;
    private static int serializer;

    public static final void write(generatePOSTBodyString generatepostbodystring, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        boolean z2;
        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3;
        int i5;
        int i6;
        boolean zIconCompatParcelizer;
        int i7 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(748453563);
        if ((i & 6) == 0) {
            if ((i & 8) != 0) {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(generatepostbodystring);
            } else {
                int i8 = serializer + 99;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                zIconCompatParcelizer = getpostalcode.read(generatepostbodystring);
            }
            i2 = (!(zIconCompatParcelizer ^ true) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (!(!getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0))) {
                int i10 = serializer + 105;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode.read(modifier)) {
                int i12 = serializer + 85;
                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                i5 = i12 % 2 == 0 ? 31787 : Fields.CameraDistance;
            } else {
                i5 = Fields.RotationZ;
            }
            i2 |= i5;
        }
        if ((i2 & 1171) != 1170) {
            int i13 = serializer + 51;
            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!getpostalcode.write(i2 & 1, z)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
            int i15 = serializer + 1;
            IconCompatParcelizer = i15 % Fields.SpotShadowColor;
            if (i15 % 2 == 0) {
                modifier.getClass();
                int i16 = i2 >> 126;
                int i17 = (i2 & 27) | (29360128 & i16) | (234881024 & i16);
                z2 = false;
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = null;
                r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = null;
                r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = null;
                i3 = i17;
                i4 = 76;
            } else {
                modifier.getClass();
                int i18 = i2 << 18;
                i3 = (i2 & 126) | (29360128 & i18) | (234881024 & i18);
                i4 = 120;
                z2 = false;
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = null;
                r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = null;
                r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = null;
            }
            MessagePopUpKt.serializer(generatepostbodystring, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, z2, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getpostalcode, i3, i4);
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new validateMigration(generatepostbodystring, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier, i, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0154  */
    public static final void CancelLivenessDetectionDialog(onPostMigrate onpostmigrate, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier modifier2;
        boolean z2;
        int i3;
        int i4 = 2 % 2;
        onpostmigrate.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-475445628);
        if ((i & 6) == 0) {
            int i5 = serializer + 103;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i2 = i | (getpostalcode.IconCompatParcelizer(onpostmigrate) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i7 = serializer + 125;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                i3 = i7 % 2 == 0 ? 89 : 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i8 = i2 | 384;
        if ((i8 & 147) != 146) {
            int i9 = serializer + 75;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            z = true;
        } else {
            z = false;
        }
        Object obj = null;
        if (getpostalcode.write(i8 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            onValidateSchema onvalidateschema = (onValidateSchema) ExtrasKt.write(onpostmigrate.write, getpostalcode, 0).getValue();
            boolean z3 = onvalidateschema instanceof SharedSQLiteStatement;
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z3) {
                getpostalcode.serializer(-1636706730);
                generatePOSTBodyString generatepostbodystring = ((SharedSQLiteStatement) onvalidateschema).read;
                boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(onpostmigrate);
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if (!(!zIconCompatParcelizer) || objComponentActivity == androidContentCaptureManager) {
                    LoginActivity$onCreate$1$1$1$1$5$1 loginActivity$onCreate$1$1$1$1$5$1 = new LoginActivity$onCreate$1$1$1$1$5$1(0, onpostmigrate, onPostMigrate.class, "onDismissClicked", "onDismissClicked()V", 0, 4);
                    getpostalcode.write(loginActivity$onCreate$1$1$1$1$5$1);
                    objComponentActivity = loginActivity$onCreate$1$1$1$1$5$1;
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity);
                boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(onpostmigrate);
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                if (zIconCompatParcelizer2 || objComponentActivity2 == androidContentCaptureManager) {
                    LoginActivity$onCreate$1$1$1$1$5$1 loginActivity$onCreate$1$1$1$1$5$2 = new LoginActivity$onCreate$1$1$1$1$5$1(0, onpostmigrate, onPostMigrate.class, "onConfirmCancellingClicked", "onConfirmCancellingClicked()V", 0, 5);
                    getpostalcode.write(loginActivity$onCreate$1$1$1$1$5$2);
                    objComponentActivity2 = loginActivity$onCreate$1$1$1$1$5$2;
                }
                write(generatepostbodystring, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity2), companion, getpostalcode, (i8 << 3) & 7168);
                getpostalcode.IconCompatParcelizer(false);
                z2 = true;
            } else {
                androidContentCaptureManager = androidContentCaptureManager;
                z2 = true;
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{onvalidateschema, TriggerBasedInvalidationTracker.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, -1636709763, false);
                }
                getpostalcode.serializer(-1636698392);
                getpostalcode.IconCompatParcelizer(false);
            }
            getQueryContext getquerycontext = onpostmigrate.RemoteActionCompatParcelizer;
            boolean z4 = (i8 & 112) == 32 ? z2 : false;
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (z4) {
                objComponentActivity3 = new r8lambdacpVRyEhxzdUx5p9KqbggyjwKD6M(6, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                getpostalcode.write(objComponentActivity3);
            } else {
                int i11 = IconCompatParcelizer + 3;
                serializer = i11 % Fields.SpotShadowColor;
                if (i11 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                if (objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = new r8lambdacpVRyEhxzdUx5p9KqbggyjwKD6M(6, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    getpostalcode.write(objComponentActivity3);
                }
            }
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, getpostalcode, 8);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new internalPathIteratorPeek(i, 22, onpostmigrate, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2);
        }
        int i12 = IconCompatParcelizer + 73;
        serializer = i12 % Fields.SpotShadowColor;
        if (i12 % 2 != 0) {
            throw null;
        }
    }
}
