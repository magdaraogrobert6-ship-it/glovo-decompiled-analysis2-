package com.roadrunner.rrds.compose.component.actions.links;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.text.TextStyle;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.checkPermission;
import o.convertToHex;
import o.equalObject;
import o.getAndroidType;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.onViewDetachedFromWindowlambda1;
import o.performLayout;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public abstract class LinkKt {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;

    public static final TextStyle write(equalObject equalobject) {
        int i;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 91;
        read = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0 ? (i = checkPermission.write[equalobject.ordinal()]) == 1 : (i = checkPermission.write[equalobject.ordinal()]) == 0) {
            onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1 = performLayout.MediaBrowserCompatMediaItem;
            return (TextStyle) performLayout.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.MediaSessionCompatResultReceiverWrapper();
        }
        if (i == 2) {
            onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda2 = performLayout.MediaBrowserCompatMediaItem;
            TextStyle textStyle = (TextStyle) performLayout.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.MediaSessionCompatResultReceiverWrapper();
            int i4 = read + 105;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return textStyle;
        }
        if (i != 3) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        int i6 = IconCompatParcelizer + 121;
        read = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda3 = performLayout.MediaBrowserCompatMediaItem;
        return (TextStyle) performLayout.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.MediaSessionCompatResultReceiverWrapper();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    public static final void serializer(String str, Modifier modifier, String str2, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        String str3;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-985098830);
        if ((i & 6) == 0) {
            if (getpostalcode.read("")) {
                int i7 = IconCompatParcelizer + 55;
                read = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i | i5;
        } else {
            i2 = i;
        }
        boolean z3 = false;
        if ((i & 48) == 0) {
            int i9 = read + 119;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                int i10 = 15 / 0;
                if (getpostalcode.read(str)) {
                    i4 = 32;
                } else {
                    i4 = 16;
                }
            } else if (getpostalcode.read(str)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        int i11 = i2 | 224640;
        if ((i & 1572864) == 0) {
            int i12 = IconCompatParcelizer + 55;
            read = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i14 = IconCompatParcelizer + 105;
                read = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                i3 = 1048576;
            } else {
                i3 = Fields.BlendMode;
            }
            i11 |= i3;
        }
        if ((599187 & i11) != 599186) {
            int i16 = read + 33;
            IconCompatParcelizer = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            z3 = true;
        }
        if (getpostalcode.write(i11 & 1, z3)) {
            int i18 = read + 55;
            IconCompatParcelizer = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierWrite = null;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{companion, companion}, getCieXyz.write())).booleanValue()) {
                int i20 = read + 29;
                IconCompatParcelizer = i20 % Fields.SpotShadowColor;
                if (i20 % 2 != 0) {
                    throw null;
                }
                modifierWrite = companion;
            }
            if (modifierWrite == null) {
                int i21 = IconCompatParcelizer + 11;
                read = i21 % Fields.SpotShadowColor;
                int i22 = i21 % 2;
                modifierWrite = SizeKt.write(companion, 1.0f);
            }
            int i23 = i11 >> 6;
            LinkText(str, "", equalObject.Medium, modifierWrite, r8lambdaunavo3sxub_pc9xroryotnrlvsm, getpostalcode, (i23 & 7168) | (i11 & 14) | 24576 | (i11 & 112) | (i23 & 896) | ((i11 << 9) & 3670016) | ((i11 << 3) & 29360128));
            str3 = "";
            z2 = true;
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
            str3 = str2;
            z2 = z;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new convertToHex(str, modifier2, str3, z2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0117  */
    /* JADX WARN: Code duplicated, block: B:55:0x0122  */
    /* JADX WARN: Code duplicated, block: B:56:0x0124  */
    public static final void write(String str, Modifier modifier, String str2, String str3, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        String str4;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        str.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-207586752);
        if ((i & 6) == 0) {
            if (getpostalcode.read(str)) {
                int i8 = read + 67;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.read(modifier)) {
                int i10 = IconCompatParcelizer + 83;
                read = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        int i12 = i2 | 384;
        if ((i & 3072) == 0) {
            int i13 = read + 19;
            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            i12 |= getpostalcode.read(0) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            if (getpostalcode.read(str3)) {
                i4 = Fields.Clip;
            } else {
                int i15 = IconCompatParcelizer + 9;
                read = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                i4 = 8192;
            }
            i12 |= i4;
        }
        int i17 = i12 | 196608;
        if ((1572864 & i) == 0) {
            i17 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 1048576 : Fields.BlendMode;
        }
        boolean z2 = true;
        if (getpostalcode.write(i17 & 1, (599187 & i17) != 599186)) {
            int i18 = read + 43;
            IconCompatParcelizer = i18 % Fields.SpotShadowColor;
            Modifier modifier2 = null;
            if (i18 % 2 != 0) {
                int i19 = 36 / 0;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{modifier, Modifier.Companion}, getCieXyz.write())).booleanValue()) {
                    i3 = IconCompatParcelizer + 71;
                    read = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 != 0) {
                        modifier2.hashCode();
                        throw null;
                    }
                    modifier2 = modifier;
                }
            } else {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{modifier, Modifier.Companion}, getCieXyz.write())).booleanValue()) {
                    i3 = IconCompatParcelizer + 71;
                    read = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 != 0) {
                        modifier2.hashCode();
                        throw null;
                    }
                    modifier2 = modifier;
                }
            }
            int i20 = i17 >> 6;
            int i21 = i17 << 3;
            LinkText(str, str3, equalObject.Small, modifier2 == null ? SizeKt.write(modifier, 1.0f) : modifier2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, getpostalcode, (i20 & 896) | (i20 & 14) | 24576 | (i21 & 112) | (i20 & 7168) | ((i17 << 9) & 3670016) | (29360128 & i21));
            str4 = "";
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            str4 = str2;
            z2 = z;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getAndroidType(str, modifier, str4, str3, z2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, i);
        }
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v1 ??, new type: char
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public static final void LinkText(java.lang.String r65, java.lang.String r66, o.equalObject r67, androidx.compose.ui.Modifier r68, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r69, o.getBirthDateFull r70, int r71) {
        /*
            Method dump skipped, instruction units count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.rrds.compose.component.actions.links.LinkKt.LinkText(java.lang.String, java.lang.String, o.equalObject, androidx.compose.ui.Modifier, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM, o.getBirthDateFull, int):void");
    }
}
