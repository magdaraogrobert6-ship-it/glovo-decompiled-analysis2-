package com.roadrunner.inappnotifications.presentation;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import com.logistics.rider.glovo.R;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import o.AndroidContentCaptureManager;
import o.extractAuthorizationHeader;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getItemOffsets;
import o.getItemViewType;
import o.getPostalCode;
import o.hasRootCause;
import o.internalPathIteratorPeek;
import o.isValidParameter;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setScrollingTouchSlop;

/* JADX INFO: loaded from: classes3.dex */
public abstract class InAppNotificationButtonKt {
    private static int serializer = 1;
    private static int write;

    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:31:0x0076  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e5 A[PHI: r0
  0x00e5: PHI (r0v19 java.lang.String) = (r0v18 java.lang.String), (r0v23 java.lang.String) binds: [B:54:0x00e3, B:51:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e7 A[PHI: r0
  0x00e7: PHI (r0v22 java.lang.String) = (r0v18 java.lang.String), (r0v23 java.lang.String) binds: [B:54:0x00e3, B:51:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:6:0x0022  */
    /* JADX WARN: Code duplicated, block: B:87:0x0191  */
    public static final void read(final getItemViewType getitemviewtype, Modifier modifier, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        boolean z2;
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        final int i7 = 2;
        int i8 = 2 % 2;
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1269791353);
        final int i9 = 1;
        if ((i & 6) == 0) {
            if (!getpostalcode.read(getitemviewtype)) {
                i6 = 2;
            } else {
                int i10 = serializer + 87;
                write = i10 % Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    i6 = 2;
                } else {
                    i6 = 4;
                }
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.read(modifier)) {
                int i11 = serializer + 17;
                write = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        final int i13 = 0;
        if ((i & 384) == 0) {
            int i14 = write + 85;
            serializer = i14 % Fields.SpotShadowColor;
            if (i14 % 2 == 0) {
                int i15 = 30 / 0;
                if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                    i4 = 256;
                } else {
                    i4 = Fields.SpotShadowColor;
                }
            } else if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                i4 = 256;
            } else {
                i4 = Fields.SpotShadowColor;
            }
            i2 |= i4;
        }
        if ((i2 & 147) != 146) {
            int i16 = write + 1;
            serializer = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            int i18 = serializer + 105;
            write = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
            Integer numValueOf = getitemviewtype.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer instanceof setScrollingTouchSlop ? Integer.valueOf(R.drawable.ic_bold_large_link_external_link) : null;
            int i20 = getItemOffsets.IconCompatParcelizer[getitemviewtype.IconCompatParcelizer.ordinal()];
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            final int i21 = 3;
            if (i20 == 1) {
                getpostalcode.serializer(1718143708);
                String str2 = getitemviewtype.write;
                int i22 = (i2 & 896) == 256 ? 1 : 0;
                if ((i2 & 14) == 4) {
                    int i23 = serializer + 49;
                    write = i23 % Fields.SpotShadowColor;
                    int i24 = i23 % 2;
                } else {
                    i9 = 0;
                }
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if ((i22 | i9) != 0 || objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.RecyclerViewItemDecoration
                        private static int read = 0;
                        private static int write = 1;

                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public final Object invoke() {
                            int i25 = 2 % 2;
                            int i26 = write + 67;
                            read = i26 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i27 = i26 % 2;
                            int i28 = i13;
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            getItemViewType getitemviewtype2 = getitemviewtype;
                            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                            if (i28 == 0) {
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(getitemviewtype2.RemoteActionCompatParcelizer);
                                int i29 = read + 119;
                                write = i29 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i29 % 2 == 0) {
                                    int i30 = 52 / 0;
                                }
                                return createfromparcel;
                            }
                            if (i28 == 1) {
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(getitemviewtype2.RemoteActionCompatParcelizer);
                                return createfromparcel;
                            }
                            if (i28 != 2) {
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(getitemviewtype2.RemoteActionCompatParcelizer);
                                return createfromparcel;
                            }
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(getitemviewtype2.RemoteActionCompatParcelizer);
                            return createfromparcel;
                        }
                    };
                    getpostalcode.write(objComponentActivity);
                }
                PrimaryKt.write(str2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, modifier, false, false, numValueOf, null, null, null, null, getpostalcode, (i2 << 3) & 896, 0, 2008);
                getpostalcode.IconCompatParcelizer(false);
            } else if (i20 == 2) {
                getpostalcode.serializer(1718359220);
                String str3 = getitemviewtype.write;
                if ((i2 & 896) == 256) {
                    int i25 = write + 71;
                    serializer = i25 % Fields.SpotShadowColor;
                    if (i25 % 2 == 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                } else {
                    z2 = false;
                }
                boolean z3 = (i2 & 14) == 4;
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                if ((z3 | z2) || objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.RecyclerViewItemDecoration
                        private static int read = 0;
                        private static int write = 1;

                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public final Object invoke() {
                            int i26 = 2 % 2;
                            int i27 = write + 67;
                            read = i27 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i28 = i27 % 2;
                            int i29 = i9;
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            getItemViewType getitemviewtype2 = getitemviewtype;
                            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                            if (i29 == 0) {
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(getitemviewtype2.RemoteActionCompatParcelizer);
                                int i210 = read + 119;
                                write = i210 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i210 % 2 == 0) {
                                    int i30 = 52 / 0;
                                }
                                return createfromparcel;
                            }
                            if (i29 == 1) {
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(getitemviewtype2.RemoteActionCompatParcelizer);
                                return createfromparcel;
                            }
                            if (i29 != 2) {
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(getitemviewtype2.RemoteActionCompatParcelizer);
                                return createfromparcel;
                            }
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(getitemviewtype2.RemoteActionCompatParcelizer);
                            return createfromparcel;
                        }
                    };
                    getpostalcode.write(objComponentActivity2);
                }
                PrimaryKt.serializer(str3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2, modifier, false, null, null, getpostalcode, (i2 << 3) & 896, 56);
                getpostalcode.IconCompatParcelizer(false);
            } else if (i20 == 3) {
                getpostalcode.serializer(1718552443);
                String str4 = getitemviewtype.write;
                int i26 = (i2 & 896) == 256 ? 1 : 0;
                if ((i2 & 14) == 4) {
                    int i27 = serializer + 97;
                    write = i27 % Fields.SpotShadowColor;
                    int i28 = i27 % 2;
                } else {
                    i9 = 0;
                }
                Object objComponentActivity3 = getpostalcode.ComponentActivity();
                if ((i9 | i26) != 0 || objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.RecyclerViewItemDecoration
                        private static int read = 0;
                        private static int write = 1;

                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public final Object invoke() {
                            int i29 = 2 % 2;
                            int i210 = write + 67;
                            read = i210 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i211 = i210 % 2;
                            int i212 = i7;
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            getItemViewType getitemviewtype2 = getitemviewtype;
                            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                            if (i212 == 0) {
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(getitemviewtype2.RemoteActionCompatParcelizer);
                                int i213 = read + 119;
                                write = i213 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i213 % 2 == 0) {
                                    int i30 = 52 / 0;
                                }
                                return createfromparcel;
                            }
                            if (i212 == 1) {
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(getitemviewtype2.RemoteActionCompatParcelizer);
                                return createfromparcel;
                            }
                            if (i212 != 2) {
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(getitemviewtype2.RemoteActionCompatParcelizer);
                                return createfromparcel;
                            }
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(getitemviewtype2.RemoteActionCompatParcelizer);
                            return createfromparcel;
                        }
                    };
                    getpostalcode.write(objComponentActivity3);
                }
                isValidParameter.RemoteActionCompatParcelizer(str4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3, modifier, false, false, numValueOf, null, null, null, getpostalcode, (i2 << 3) & 896, 984);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                if (i20 != 4) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, -498766426, false);
                }
                int i29 = write + 37;
                serializer = i29 % Fields.SpotShadowColor;
                if (i29 % 2 == 0) {
                    getpostalcode.serializer(1718770962);
                    str = getitemviewtype.write;
                    if ((i2 & 28584) == 31297) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                } else {
                    getpostalcode.serializer(1718770962);
                    str = getitemviewtype.write;
                    if ((i2 & 896) == 256) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                }
                i9 = (i2 & 14) != 4 ? 0 : 1;
                Object objComponentActivity4 = getpostalcode.ComponentActivity();
                if ((i9 | i3) != 0 || objComponentActivity4 == androidContentCaptureManager) {
                    objComponentActivity4 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.RecyclerViewItemDecoration
                        private static int read = 0;
                        private static int write = 1;

                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public final Object invoke() {
                            int i210 = 2 % 2;
                            int i211 = write + 67;
                            read = i211 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i212 = i211 % 2;
                            int i213 = i21;
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            getItemViewType getitemviewtype2 = getitemviewtype;
                            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                            if (i213 == 0) {
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(getitemviewtype2.RemoteActionCompatParcelizer);
                                int i214 = read + 119;
                                write = i214 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i214 % 2 == 0) {
                                    int i30 = 52 / 0;
                                }
                                return createfromparcel;
                            }
                            if (i213 == 1) {
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(getitemviewtype2.RemoteActionCompatParcelizer);
                                return createfromparcel;
                            }
                            if (i213 != 2) {
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(getitemviewtype2.RemoteActionCompatParcelizer);
                                return createfromparcel;
                            }
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(getitemviewtype2.RemoteActionCompatParcelizer);
                            return createfromparcel;
                        }
                    };
                    getpostalcode.write(objComponentActivity4);
                }
                isValidParameter.RemoteActionCompatParcelizer(str, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity4, modifier, false, (Integer) null, (hasRootCause) null, (extractAuthorizationHeader) null, (MutableInteractionSourceImpl) null, (getBirthDateFull) getpostalcode, (i2 << 3) & 896, 504);
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new internalPathIteratorPeek(i, 20, modifier, (Object) getitemviewtype, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
    }
}
