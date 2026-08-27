package com.roadrunner.sidemenu.menuitems;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.res.StringResources_androidKt;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.tnc.TncComposableFactoryImpl$$ExternalSyntheticLambda0;
import kotlinx.coroutines.JobKt__JobKt$invokeOnCompletion$1;
import o.AndroidContentCaptureManager;
import o.DragAndDropTargetModifierNode;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdakakRSJ0yRWnWIggdAd9IDPYuM;
import o.r8lambdalR5SL_tSS1JcT7wrmZ_9di0raRc;
import o.r8lambdatwlPMTrSrus3A7UmaCID8_1F1M;
import o.r8lambdav2DTvZQspFAZpFmiK0qxdNT7ag4;
import o.r8lambdav4khHexYF7B8JZECOja6EPumcY4;
import o.r8lambdav9lEwuigriKPLoepmU9DzDAsGns;
import o.r8lambdavFhLS1yxrGUJqVmNjrm6vmsl_H8;
import o.r8lambdavqK0yH3ghr0voBP7IVvbATocpo;
import o.registerInAppMessageManagerlambda0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MenuItemContentKt {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;

    public static final void serializer(r8lambdavFhLS1yxrGUJqVmNjrm6vmsl_H8 r8lambdavfhls1yxrgujqvmnjrm6vmsl_h8, r8lambdakakRSJ0yRWnWIggdAd9IDPYuM r8lambdakakrsj0yrwnwiggdad9idpyum, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        r8lambdavfhls1yxrgujqvmnjrm6vmsl_h8.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(2108940768);
        boolean z = true;
        if ((i & 6) == 0) {
            if (!(!getpostalcode.IconCompatParcelizer(r8lambdavfhls1yxrgujqvmnjrm6vmsl_h8))) {
                int i6 = IconCompatParcelizer;
                int i7 = i6 + 63;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                int i9 = i6 + 3;
                write = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdakakrsj0yrwnwiggdad9idpyum)) {
                int i11 = IconCompatParcelizer + 77;
                write = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i13 = i2 | 384;
        if ((i13 & 147) != 146) {
            int i14 = IconCompatParcelizer + 49;
            write = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
        } else {
            z = false;
        }
        if (getpostalcode.write(i13 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            int i16 = i13 << 3;
            MenuItemsScreen(r8lambdavfhls1yxrgujqvmnjrm6vmsl_h8, (r8lambdav4khHexYF7B8JZECOja6EPumcY4) ExtrasKt.write(r8lambdavfhls1yxrgujqvmnjrm6vmsl_h8.read, getpostalcode, 0).getValue(), r8lambdakakrsj0yrwnwiggdad9idpyum, companion, getpostalcode, (i16 & 7168) | (i16 & 896) | (i13 & 14));
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU(i, 24, r8lambdavfhls1yxrgujqvmnjrm6vmsl_h8, r8lambdakakrsj0yrwnwiggdad9idpyum, modifier2);
        }
    }

    public static final void MenuItemsScreen(r8lambdavFhLS1yxrGUJqVmNjrm6vmsl_H8 r8lambdavfhls1yxrgujqvmnjrm6vmsl_h8, r8lambdav4khHexYF7B8JZECOja6EPumcY4 r8lambdav4khhexyf7b8jzecoja6epumcy4, r8lambdakakRSJ0yRWnWIggdAd9IDPYuM r8lambdakakrsj0yrwnwiggdad9idpyum, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1093790054);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(r8lambdavfhls1yxrgujqvmnjrm6vmsl_h8) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i6 = write + 3;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            i2 |= (i6 % 2 == 0 ? (i & 64) != 0 : (i & 111) != 0) ? getpostalcode.IconCompatParcelizer(r8lambdav4khhexyf7b8jzecoja6epumcy4) : getpostalcode.read(r8lambdav4khhexyf7b8jzecoja6epumcy4) ? 32 : 16;
        }
        Object obj = null;
        if ((i & 384) == 0) {
            int i7 = IconCompatParcelizer + 83;
            write = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                getpostalcode.IconCompatParcelizer(r8lambdakakrsj0yrwnwiggdad9idpyum);
                obj.hashCode();
                throw null;
            }
            if (getpostalcode.IconCompatParcelizer(r8lambdakakrsj0yrwnwiggdad9idpyum)) {
                int i8 = IconCompatParcelizer + 97;
                write = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i4 = Fields.RotationX;
            } else {
                i4 = Fields.SpotShadowColor;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode.read(modifier)) {
                int i10 = IconCompatParcelizer + 19;
                write = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i3 = Fields.CameraDistance;
            } else {
                i3 = Fields.RotationZ;
            }
            i2 |= i3;
        }
        int i12 = i2;
        if (getpostalcode.write(i12 & 1, (i12 & 1171) != 1170)) {
            int i13 = IconCompatParcelizer + 77;
            write = i13 % Fields.SpotShadowColor;
            if (i13 % 2 == 0) {
                getpostalcode.ComponentActivity();
                AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                obj.hashCode();
                throw null;
            }
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager2 = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager2) {
                DragAndDropTargetModifierNode dragAndDropTargetModifierNode = new DragAndDropTargetModifierNode(new TncComposableFactoryImpl$$ExternalSyntheticLambda0(9, r8lambdakakrsj0yrwnwiggdad9idpyum), true, 1164398216);
                getpostalcode.write(dragAndDropTargetModifierNode);
                int i14 = write + 107;
                IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                objComponentActivity = dragAndDropTargetModifierNode;
            }
            ((r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity).invoke((r8lambdalR5SL_tSS1JcT7wrmZ_9di0raRc) r8lambdavfhls1yxrgujqvmnjrm6vmsl_h8.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper(), getpostalcode, 48);
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(r8lambdavfhls1yxrgujqvmnjrm6vmsl_h8);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer || objComponentActivity2 == androidContentCaptureManager2) {
                JobKt__JobKt$invokeOnCompletion$1 jobKt__JobKt$invokeOnCompletion$1 = new JobKt__JobKt$invokeOnCompletion$1(1, r8lambdavfhls1yxrgujqvmnjrm6vmsl_h8, r8lambdavFhLS1yxrGUJqVmNjrm6vmsl_H8.class, "onItemClicked", "onItemClicked(Lcom/roadrunner/sidemenu/menuitems/MenuItemUiState;)V", 0, 13);
                getpostalcode.write(jobKt__JobKt$invokeOnCompletion$1);
                objComponentActivity2 = jobKt__JobKt$invokeOnCompletion$1;
            }
            RemoteActionCompatParcelizer(r8lambdav4khhexyf7b8jzecoja6epumcy4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity2), modifier, getpostalcode, (i12 >> 3) & 910);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdatwlPMTrSrus3A7UmaCID8_1F1M(r8lambdavfhls1yxrgujqvmnjrm6vmsl_h8, r8lambdav4khhexyf7b8jzecoja6epumcy4, r8lambdakakrsj0yrwnwiggdad9idpyum, modifier, i, 0);
        }
        int i16 = IconCompatParcelizer + 73;
        write = i16 % Fields.SpotShadowColor;
        if (i16 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:85:0x015f  */
    /* JADX WARN: Code duplicated, block: B:90:0x017c  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void RemoteActionCompatParcelizer(final r8lambdav4khHexYF7B8JZECOja6EPumcY4 r8lambdav4khhexyf7b8jzecoja6epumcy4, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        final int i4;
        int i5;
        int i6 = 2 % 2;
        r8lambdav4khhexyf7b8jzecoja6epumcy4.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1899576649);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? getpostalcode.read(r8lambdav4khhexyf7b8jzecoja6epumcy4) : getpostalcode.IconCompatParcelizer(r8lambdav4khhexyf7b8jzecoja6epumcy4) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (!(!getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm))) {
                int i7 = IconCompatParcelizer + 49;
                write = i7 % Fields.SpotShadowColor;
                i5 = i7 % 2 == 0 ? 64 : 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.read(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i2 & 147) != 146) {
            int i8 = IconCompatParcelizer + 23;
            write = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            boolean z4 = r8lambdav4khhexyf7b8jzecoja6epumcy4 instanceof r8lambdavqK0yH3ghr0voBP7IVvbATocpo;
            Object obj = getCreditCardExpirationMonth.write;
            if (z4) {
                int i10 = IconCompatParcelizer + 27;
                write = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                getpostalcode.serializer(-200938189);
                r8lambdavqK0yH3ghr0voBP7IVvbATocpo r8lambdavqk0yh3ghr0vobp7ivvbatocpo = (r8lambdavqK0yH3ghr0voBP7IVvbATocpo) r8lambdav4khhexyf7b8jzecoja6epumcy4;
                modifier.getClass();
                String str = r8lambdavqk0yh3ghr0vobp7ivvbatocpo.IconCompatParcelizer;
                String str2 = r8lambdavqk0yh3ghr0vobp7ivvbatocpo.RemoteActionCompatParcelizer;
                String str3 = r8lambdavqk0yh3ghr0vobp7ivvbatocpo.MediaMetadataCompat;
                String str4 = r8lambdavqk0yh3ghr0vobp7ivvbatocpo.serializer;
                boolean z5 = r8lambdavqk0yh3ghr0vobp7ivvbatocpo.RatingCompat;
                r8lambdav9lEwuigriKPLoepmU9DzDAsGns r8lambdav9lewuigrikploepmu9dzdasgns = r8lambdavqk0yh3ghr0vobp7ivvbatocpo.MediaBrowserCompatMediaItem;
                if ((i2 & 112) == 32) {
                    int i12 = IconCompatParcelizer + 77;
                    write = i12 % Fields.SpotShadowColor;
                    if (i12 % 2 == 0) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                } else {
                    z3 = false;
                }
                boolean z6 = (i2 & 14) == 4 || ((i2 & 8) != 0 && getpostalcode.IconCompatParcelizer(r8lambdav4khhexyf7b8jzecoja6epumcy4));
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if (z3 || z6) {
                    i4 = 0;
                    objComponentActivity = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.r8lambdaseLHrOC27SGt3A1EhIZjS1P85dI
                        private static int IconCompatParcelizer = 0;
                        private static int serializer = 1;

                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public final Object invoke() {
                            int i13 = 2 % 2;
                            int i14 = IconCompatParcelizer + 3;
                            serializer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i15 = i14 % 2;
                            int i16 = i4;
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            r8lambdav4khHexYF7B8JZECOja6EPumcY4 r8lambdav4khhexyf7b8jzecoja6epumcy5 = r8lambdav4khhexyf7b8jzecoja6epumcy4;
                            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                            if (i16 != 0) {
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(r8lambdav4khhexyf7b8jzecoja6epumcy5);
                                return createfromparcel;
                            }
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(r8lambdav4khhexyf7b8jzecoja6epumcy5);
                            int i17 = serializer + 25;
                            IconCompatParcelizer = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i17 % 2 == 0) {
                                return createfromparcel;
                            }
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                    };
                    getpostalcode.write(objComponentActivity);
                } else {
                    int i13 = write + 99;
                    IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                    if (i13 % 2 != 0) {
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    if (objComponentActivity == obj) {
                        i4 = 0;
                        objComponentActivity = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.r8lambdaseLHrOC27SGt3A1EhIZjS1P85dI
                            private static int IconCompatParcelizer = 0;
                            private static int serializer = 1;

                            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                            public final Object invoke() {
                                int i14 = 2 % 2;
                                int i15 = IconCompatParcelizer + 3;
                                serializer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i16 = i15 % 2;
                                int i17 = i4;
                                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                r8lambdav4khHexYF7B8JZECOja6EPumcY4 r8lambdav4khhexyf7b8jzecoja6epumcy5 = r8lambdav4khhexyf7b8jzecoja6epumcy4;
                                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                                if (i17 != 0) {
                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(r8lambdav4khhexyf7b8jzecoja6epumcy5);
                                    return createfromparcel;
                                }
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(r8lambdav4khhexyf7b8jzecoja6epumcy5);
                                int i18 = serializer + 25;
                                IconCompatParcelizer = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i18 % 2 == 0) {
                                    return createfromparcel;
                                }
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                        };
                        getpostalcode.write(objComponentActivity);
                    } else {
                        i4 = 0;
                    }
                }
                MenuItem(str, str2, r8lambdav9lewuigrikploepmu9dzdasgns, str3, z5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, modifier, null, str4, getpostalcode, 0, Fields.SpotShadowColor);
                getpostalcode.IconCompatParcelizer((boolean) i4);
            } else {
                if (!(r8lambdav4khhexyf7b8jzecoja6epumcy4 instanceof r8lambdav2DTvZQspFAZpFmiK0qxdNT7ag4)) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, 132063812, false);
                }
                getpostalcode.serializer(-200527067);
                String strStringResource = StringResources_androidKt.stringResource(R.string.all_settings, getpostalcode, 0);
                r8lambdav2DTvZQspFAZpFmiK0qxdNT7ag4 r8lambdav2dtvzqspfazpfmik0qxdnt7ag4 = (r8lambdav2DTvZQspFAZpFmiK0qxdNT7ag4) r8lambdav4khhexyf7b8jzecoja6epumcy4;
                String str5 = r8lambdav2dtvzqspfazpfmik0qxdnt7ag4.read;
                r8lambdav9lEwuigriKPLoepmU9DzDAsGns r8lambdav9lewuigrikploepmu9dzdasgns2 = r8lambdav2dtvzqspfazpfmik0qxdnt7ag4.RemoteActionCompatParcelizer;
                boolean z7 = (i2 & 112) == 32;
                if ((i2 & 14) != 4) {
                    int i14 = IconCompatParcelizer + 99;
                    write = i14 % Fields.SpotShadowColor;
                    if (i14 % 2 != 0 ? (i2 & 8) != 0 : (i2 & 121) != 0) {
                        if (getpostalcode.IconCompatParcelizer(r8lambdav4khhexyf7b8jzecoja6epumcy4)) {
                            int i15 = IconCompatParcelizer + 29;
                            write = i15 % Fields.SpotShadowColor;
                            i3 = 2;
                            int i16 = i15 % 2;
                            z2 = true;
                        }
                    }
                    z2 = false;
                    i3 = 2;
                } else {
                    int i17 = IconCompatParcelizer + 29;
                    write = i17 % Fields.SpotShadowColor;
                    i3 = 2;
                    int i18 = i17 % 2;
                    z2 = true;
                }
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                if (!z2 && !z7) {
                    int i19 = IconCompatParcelizer + 99;
                    write = i19 % Fields.SpotShadowColor;
                    int i20 = i19 % i3;
                    if (objComponentActivity2 == obj) {
                        final int i21 = 1;
                        objComponentActivity2 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.r8lambdaseLHrOC27SGt3A1EhIZjS1P85dI
                            private static int IconCompatParcelizer = 0;
                            private static int serializer = 1;

                            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                            public final Object invoke() {
                                int i110 = 2 % 2;
                                int i111 = IconCompatParcelizer + 3;
                                serializer = i111 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i112 = i111 % 2;
                                int i113 = i21;
                                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                r8lambdav4khHexYF7B8JZECOja6EPumcY4 r8lambdav4khhexyf7b8jzecoja6epumcy5 = r8lambdav4khhexyf7b8jzecoja6epumcy4;
                                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                                if (i113 != 0) {
                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(r8lambdav4khhexyf7b8jzecoja6epumcy5);
                                    return createfromparcel;
                                }
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(r8lambdav4khhexyf7b8jzecoja6epumcy5);
                                int i114 = serializer + 25;
                                IconCompatParcelizer = i114 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i114 % 2 == 0) {
                                    return createfromparcel;
                                }
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                        };
                        getpostalcode.write(objComponentActivity2);
                    }
                } else {
                    final int i22 = 1;
                    objComponentActivity2 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.r8lambdaseLHrOC27SGt3A1EhIZjS1P85dI
                        private static int IconCompatParcelizer = 0;
                        private static int serializer = 1;

                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public final Object invoke() {
                            int i110 = 2 % 2;
                            int i111 = IconCompatParcelizer + 3;
                            serializer = i111 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i112 = i111 % 2;
                            int i113 = i22;
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            r8lambdav4khHexYF7B8JZECOja6EPumcY4 r8lambdav4khhexyf7b8jzecoja6epumcy5 = r8lambdav4khhexyf7b8jzecoja6epumcy4;
                            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                            if (i113 != 0) {
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(r8lambdav4khhexyf7b8jzecoja6epumcy5);
                                return createfromparcel;
                            }
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(r8lambdav4khhexyf7b8jzecoja6epumcy5);
                            int i114 = serializer + 25;
                            IconCompatParcelizer = i114 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i114 % 2 == 0) {
                                return createfromparcel;
                            }
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                    };
                    getpostalcode.write(objComponentActivity2);
                }
                MenuItem(strStringResource, str5, r8lambdav9lewuigrikploepmu9dzdasgns2, null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2, modifier, Integer.valueOf(R.drawable.ic_bold_large_settings_cog_outlined), null, getpostalcode, ((i2 << 12) & 3670016) | 113273856, 0);
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU(i, 25, r8lambdav4khhexyf7b8jzecoja6epumcy4, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r0v19 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v19 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v20 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v29 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v29 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v23 ??, new type: boolean
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
    public static final void MenuItem(java.lang.String r44, java.lang.String r45, o.r8lambdav9lEwuigriKPLoepmU9DzDAsGns r46, java.lang.String r47, boolean r48, o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r49, androidx.compose.ui.Modifier r50, java.lang.Integer r51, java.lang.String r52, o.getBirthDateFull r53, int r54, int r55) {
        /*
            Method dump skipped, instruction units count: 1189
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.sidemenu.menuitems.MenuItemContentKt.MenuItem(java.lang.String, java.lang.String, o.r8lambdav9lEwuigriKPLoepmU9DzDAsGns, java.lang.String, boolean, o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0, androidx.compose.ui.Modifier, java.lang.Integer, java.lang.String, o.getBirthDateFull, int, int):void");
    }
}
