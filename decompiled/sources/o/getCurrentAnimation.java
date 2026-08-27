package o;

import android.os.Process;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.compose.CustomerUnavailableStepComposableKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getCurrentAnimation {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public static int serializer;
    public static int write;

    /* JADX WARN: Code duplicated, block: B:46:0x009d  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f4  */
    public static final void write(boundsOfLayoutNode boundsoflayoutnode, String str, androidx.compose.ui.Modifier modifier, boolean z, Integer num, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        androidx.compose.ui.Modifier modifier2;
        boolean z2;
        boolean z3;
        String str2;
        int i3;
        boolean zIconCompatParcelizer;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1658687633);
        if ((i & 6) == 0) {
            int i5 = IconCompatParcelizer + 69;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode.read(boundsoflayoutnode);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(boundsoflayoutnode);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(str) ? 32 : 16;
        }
        int i7 = i2 | 384;
        if ((i & 3072) == 0) {
            i7 |= getpostalcode.write(z) ? 2048 : androidx.compose.ui.graphics.Fields.RotationZ;
        }
        int i8 = i7 | 24576;
        if ((196608 & i) == 0) {
            i8 |= getpostalcode.read(num) ? androidx.compose.ui.graphics.Fields.RenderEffect : 65536;
        }
        if (getpostalcode.write(i8 & 1, (74899 & i8) != 74898)) {
            modifier2 = androidx.compose.ui.Modifier.Companion;
            int i9 = 57344 & i8;
            if (i9 == 16384) {
                int i10 = RemoteActionCompatParcelizer + 31;
                IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            } else {
                z2 = false;
            }
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z2 || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = fieldToDouble.Active;
                getpostalcode.write(objComponentActivity);
            }
            fieldToDouble fieldtodouble = (fieldToDouble) objComponentActivity;
            boolean z4 = (i8 & 7168) == 2048;
            if (i9 == 16384) {
                int i11 = IconCompatParcelizer + 77;
                RemoteActionCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i12 = i11 % 2;
                z3 = true;
            } else {
                z3 = false;
            }
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (z3 | z4) {
                if (!z) {
                    i3 = RemoteActionCompatParcelizer + 115;
                    IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i3 % 2 == 0) {
                        str2 = boundsoflayoutnode.notStartedDescription;
                    } else {
                        String str3 = boundsoflayoutnode.notStartedDescription;
                        throw null;
                    }
                } else {
                    str2 = boundsoflayoutnode.startedDescription;
                }
                objComponentActivity2 = str2;
                int i13 = IconCompatParcelizer + 31;
                RemoteActionCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i14 = i13 % 2;
                getpostalcode.write(objComponentActivity2);
            } else {
                int i15 = IconCompatParcelizer + 69;
                RemoteActionCompatParcelizer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i15 % 2 == 0) {
                    int i16 = 79 / 0;
                    if (objComponentActivity2 == androidContentCaptureManager) {
                        if (!z) {
                            i3 = RemoteActionCompatParcelizer + 115;
                            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i3 % 2 == 0) {
                                str2 = boundsoflayoutnode.notStartedDescription;
                            } else {
                                String str4 = boundsoflayoutnode.notStartedDescription;
                                throw null;
                            }
                        } else {
                            str2 = boundsoflayoutnode.startedDescription;
                        }
                        objComponentActivity2 = str2;
                        int i17 = IconCompatParcelizer + 31;
                        RemoteActionCompatParcelizer = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i18 = i17 % 2;
                        getpostalcode.write(objComponentActivity2);
                    }
                } else if (objComponentActivity2 == androidContentCaptureManager) {
                    if (!z) {
                        i3 = RemoteActionCompatParcelizer + 115;
                        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i3 % 2 == 0) {
                            str2 = boundsoflayoutnode.notStartedDescription;
                        } else {
                            String str5 = boundsoflayoutnode.notStartedDescription;
                            throw null;
                        }
                    } else {
                        str2 = boundsoflayoutnode.startedDescription;
                    }
                    objComponentActivity2 = str2;
                    int i19 = IconCompatParcelizer + 31;
                    RemoteActionCompatParcelizer = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i110 = i19 % 2;
                    getpostalcode.write(objComponentActivity2);
                }
            }
            CustomerUnavailableStepComposableKt.CustomerUnavailableStepComposable(fieldtodouble, coil3.ExtrasKt.write(974249358, new r8lambdaaAzn5eL4WKW0o5J25K1E0csgpOI(str, z, 1), getpostalcode), modifier2, boundsoflayoutnode.title, (String) objComponentActivity2, num, false, getpostalcode, (i8 & 458752) | (i8 & 896) | 48, 64);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i20 = IconCompatParcelizer + 101;
            RemoteActionCompatParcelizer = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i21 = i20 % 2;
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new convertToHex(boundsoflayoutnode, str, modifier2, z, num, i);
        }
    }

    public static int IconCompatParcelizer() {
        int i = write;
        int i2 = i % 7032182;
        write = i + 1;
        if (i2 != 0) {
            return serializer;
        }
        int iMyPid = Process.myPid();
        serializer = iMyPid;
        return iMyPid;
    }
}
