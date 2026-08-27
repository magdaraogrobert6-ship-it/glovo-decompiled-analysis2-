package com.roadrunner.delivery.accept.individualEarnings.presentation.composable;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import o.StaticLayoutFactory33;
import o.StaticLayoutFactoryDefaultCompanion;
import o.accessgetReusableRectp;
import o.accessgetStaticLayoutConstructorcp;
import o.accesssetInitializedcp;
import o.accesssetStaticLayoutConstructorcp;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public abstract class EarningsComposableKt {
    private static int IconCompatParcelizer = 1;
    private static int serializer;

    public static final void serializer(StaticLayoutFactory33 staticLayoutFactory33, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        staticLayoutFactory33.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1225167363);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? getpostalcode.read(staticLayoutFactory33) : getpostalcode.IconCompatParcelizer(staticLayoutFactory33) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i5 = serializer + 75;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i7 = i2 | 384;
        if ((i7 & 147) != 146) {
            int i8 = IconCompatParcelizer + 9;
            serializer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i7 & 1, z)) {
            int i10 = serializer + 77;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            modifier2 = Modifier.Companion;
            if (!(!(staticLayoutFactory33 instanceof accesssetInitializedcp))) {
                int i12 = IconCompatParcelizer + 123;
                serializer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                getpostalcode.serializer(329029956);
                accesssetStaticLayoutConstructorcp accesssetstaticlayoutconstructorcp = ((accesssetInitializedcp) staticLayoutFactory33).IconCompatParcelizer;
                modifier2.getClass();
                SingleEarningsContentKt.serializer(accesssetstaticlayoutconstructorcp, modifier2, null, getpostalcode, 8, 4);
                getpostalcode.IconCompatParcelizer(false);
            } else if (staticLayoutFactory33 instanceof accessgetStaticLayoutConstructorcp) {
                getpostalcode.serializer(329272438);
                modifier2.getClass();
                IndividualEarningsContentKt.IndividualEarningsContent((accessgetStaticLayoutConstructorcp) staticLayoutFactory33, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier2, getpostalcode, i7 & 126);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                if (!staticLayoutFactory33.equals(StaticLayoutFactoryDefaultCompanion.IconCompatParcelizer)) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, 564801464, false);
                }
                int i14 = serializer + 39;
                IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                if (i14 % 2 == 0) {
                    getpostalcode.serializer(564819655);
                    getpostalcode.IconCompatParcelizer(true);
                } else {
                    getpostalcode.serializer(564819655);
                    getpostalcode.IconCompatParcelizer(false);
                }
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetReusableRectp(i, 21, modifier2, (Object) staticLayoutFactory33, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
    }
}
