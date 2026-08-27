package com.roadrunner.delivery.ontheway.tripplanner.list.presentation.compose;

import androidx.compose.foundation.GestureNodeKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.braze.ui.support.ViewUtils$$ExternalSyntheticLambda6;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.domain.ReportPictureUseCase$invoke$2;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.compose.SwitcherKt$Switcher$2$1;
import com.roadrunner.delivery.state.pudo.TagColorToken;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import io.sentry.SentryUUID;
import java.util.List;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.BaselineShift;
import o.BaselineShiftCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DrawStyleSpan_androidKt;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.RadioButton;
import o.buildMapping;
import o.dc;
import o.findField;
import o.findMethod;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getHasCamera;
import o.getNewPassword;
import o.getPostalCode;
import o.getQueryContext;
import o.getStore;
import o.hashBoolean;
import o.onContentCardDismissed;
import o.p6;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaKeMyxhuF3EYMhl9vgBGt4ME3jBA;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.registerInAppMessageManagerlambda0;
import o.shaderStatelambda0;
import o.toAndroidCapBeK7IIE;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TripPlannerListKt {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 0;
    private static int write = 1;

    static {
        DrawStyleSpan_androidKt drawStyleSpan_androidKt = DrawStyleSpan_androidKt.CUSTOMER;
        new findField(TagColorToken.NaturalPale);
        drawStyleSpan_androidKt.getClass();
        int i = RemoteActionCompatParcelizer + 47;
        write = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0035  */
    /* JADX WARN: Code duplicated, block: B:12:0x0037  */
    public static final void read(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str) {
        int i2;
        getPostalCode getpostalcode;
        int i3;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1413646979);
        boolean z = false;
        if ((i & 6) == 0) {
            int i6 = serializer + 69;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                if (getpostalcode2.read(str)) {
                    i4 = 4;
                } else {
                    i4 = 2;
                }
            } else {
                int i7 = 76 / 0;
                if (!getpostalcode2.read(str)) {
                    i4 = 2;
                } else {
                    i4 = 4;
                }
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode2.read(modifier)) {
                i3 = 32;
            } else {
                int i8 = IconCompatParcelizer + 113;
                serializer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i3 = 16;
            }
            i2 |= i3;
        }
        int i10 = i2;
        if ((i10 & 19) != 18) {
            int i11 = serializer + 99;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            z = true;
        }
        if (getpostalcode2.write(i10 & 1, z)) {
            int i13 = serializer + 31;
            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            getpostalcode = getpostalcode2;
            TextKt.m131TextNvy7gAk(str, modifier, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, performLayout.MediaSessionCompatResultReceiverWrapper(), getpostalcode, i10 & 126, 24576, 114680);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new dc(i, str, modifier, 6);
        }
    }

    public static final void RemoteActionCompatParcelizer(findMethod findmethod, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        int i3 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1216653463);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? getpostalcode2.read(findmethod) : getpostalcode2.IconCompatParcelizer(findmethod) ? 4 : 2) | i;
            int i4 = serializer + 49;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            i2 = i;
        }
        Object obj = null;
        if ((i & 48) == 0) {
            int i6 = IconCompatParcelizer + 115;
            serializer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                getpostalcode2.write(z);
                obj.hashCode();
                throw null;
            }
            i2 |= getpostalcode2.write(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i7 = serializer + 43;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                throw null;
            }
            i2 |= !getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.SpotShadowColor : Fields.RotationX;
        }
        if ((i & 3072) == 0) {
            int i8 = serializer + 125;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            i2 |= getpostalcode2.read(modifier) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if (getpostalcode2.write(i2 & 1, (i2 & 1171) != 1170)) {
            String str = z ? findmethod.showLess : findmethod.showMore;
            int i10 = z ? R.drawable.ic_bold_medium_arrow_up : R.drawable.ic_bold_medium_arrow_down;
            int i11 = serializer + 19;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            hashBoolean hashboolean = hashBoolean.END;
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(modifier, 0.0f, 0.0f, Dimensions.setActionBarVisibilityCallback, Dimensions.setMenu, 3);
            modifierM74paddingqDBjuR0$default.getClass();
            getpostalcode = getpostalcode2;
            TertiaryKt.IconCompatParcelizer(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifierM74paddingqDBjuR0$default, false, i10, hashboolean, null, null, getpostalcode2, ((i2 >> 3) & 112) | 196608, 200);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p6(findmethod, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, i, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    /* JADX WARN: Code duplicated, block: B:15:0x003d  */
    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0043 A[PHI: r1
  0x0043: PHI (r1v9 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v11 o.getPostalCode) binds: [B:8:0x002b, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:75:0x0105  */
    /* JADX WARN: Code duplicated, block: B:9:0x002d A[PHI: r1
  0x002d: PHI (r1v6 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v11 o.getPostalCode) binds: [B:8:0x002b, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void IconCompatParcelizer(BaselineShift baselineShift, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        boolean zIconCompatParcelizer;
        int i2;
        int i3;
        Modifier modifier2;
        boolean z;
        boolean z2;
        boolean z3;
        int i4 = 2 % 2;
        int i5 = serializer + 111;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(612822629);
            if ((i & 17) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(baselineShift);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(baselineShift);
                }
                if (!zIconCompatParcelizer) {
                    i2 = 2;
                } else {
                    i2 = 4;
                }
                i3 = i | i2;
            } else {
                i3 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(612822629);
            if ((i & 6) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(baselineShift);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(baselineShift);
                }
                if (!zIconCompatParcelizer) {
                    i2 = 2;
                } else {
                    i2 = 4;
                }
                i3 = i | i2;
            } else {
                i3 = i;
            }
        }
        int i6 = 32;
        Object obj = null;
        if ((i & 48) == 0) {
            int i7 = serializer + 83;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                i3 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ^ true ? 16 : 32;
            } else {
                getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                obj.hashCode();
                throw null;
            }
        }
        int i8 = i3 | 384;
        if (getpostalcode.write(i8 & 1, (i8 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion;
            boolean z4 = baselineShift.read;
            List list = baselineShift.write;
            List list2 = !(z4 ^ true) ? list : onContentCardDismissed.read(list, 3);
            getpostalcode.serializer(512038777);
            int i9 = 0;
            for (Object obj2 : list2) {
                if (i9 >= 0) {
                    toAndroidCapBeK7IIE toandroidcapbek7iie = (toAndroidCapBeK7IIE) obj2;
                    if (i9 == 0) {
                        int i10 = serializer + 51;
                        IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                        if (i10 % 2 == 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                    if (i9 == list.size() - 1) {
                        int i11 = serializer + 111;
                        IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                        if (i11 % 2 == 0) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                    } else {
                        z2 = false;
                    }
                    if ((i8 & 112) == i6) {
                        int i12 = serializer + 11;
                        IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                        if (i12 % 2 == 0) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                    } else {
                        z3 = false;
                    }
                    boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(toandroidcapbek7iie);
                    Object objComponentActivity = getpostalcode.ComponentActivity();
                    if (!(z3 | zIconCompatParcelizer2)) {
                        int i13 = serializer + 65;
                        IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                        if (i13 % 2 != 0) {
                            if (objComponentActivity == getCreditCardExpirationMonth.write) {
                                objComponentActivity = new ViewUtils$$ExternalSyntheticLambda6(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 27, toandroidcapbek7iie);
                                getpostalcode.write(objComponentActivity);
                                int i14 = serializer + 89;
                                IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                                int i15 = i14 % 2;
                            }
                        } else {
                            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                            throw null;
                        }
                    } else {
                        objComponentActivity = new ViewUtils$$ExternalSyntheticLambda6(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 27, toandroidcapbek7iie);
                        getpostalcode.write(objComponentActivity);
                        int i16 = serializer + 89;
                        IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                        int i17 = i16 % 2;
                    }
                    TripPlannerItemKt.read(toandroidcapbek7iie, z, !z2, companion, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, ((i8 << 3) & 7168) | 8);
                    i9++;
                    list = list;
                    i6 = 32;
                } else {
                    SQLite.serializer();
                    throw null;
                }
            }
            getpostalcode.IconCompatParcelizer(false);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getStore(i, 12, baselineShift, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0072  */
    /* JADX WARN: Code duplicated, block: B:34:0x0075  */
    public static final void TripPlannerList(BaselineShift baselineShift, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(245994477);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? getpostalcode.read(baselineShift) : getpostalcode.IconCompatParcelizer(baselineShift) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (!getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                i4 = 16;
            } else {
                int i6 = IconCompatParcelizer + 27;
                serializer = i6 % Fields.SpotShadowColor;
                i4 = i6 % 2 != 0 ? 2 : 32;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            int i7 = IconCompatParcelizer + 55;
            serializer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                int i8 = 63 / 0;
                if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                    i3 = Fields.RotationX;
                } else {
                    i3 = Fields.SpotShadowColor;
                }
            } else if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                i3 = Fields.RotationX;
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.read(modifier) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i2 & 1171) != 1170) {
            int i9 = serializer + 99;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            int i11 = serializer + 53;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            Modifier modifierWrite = SizeKt.write(modifier, 1.0f);
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i13 = serializer + 89;
            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            getpostalcode.serializer(1343293123);
            String str = baselineShift.IconCompatParcelizer;
            Modifier.Companion companion3 = Modifier.Companion;
            read(0, getpostalcode, PaddingKt.write(companion3, Dimensions.setActionBarVisibilityCallback), str);
            IconCompatParcelizer(baselineShift, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null, getpostalcode, ((i2 >> 3) & 112) | 8);
            if (baselineShift.write.size() > 3) {
                getpostalcode.serializer(-1271180164);
                findMethod findmethod = baselineShift.serializer;
                if (findmethod == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("See more button text should not be null");
                    return;
                } else {
                    RemoteActionCompatParcelizer(findmethod, baselineShift.read, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, companion3.then(new RadioButton(companion.getEnd())), getpostalcode, (i2 << 3) & 896);
                    z2 = false;
                    getpostalcode.IconCompatParcelizer(false);
                }
            } else {
                z2 = false;
                getpostalcode.serializer(-1270854385);
                getpostalcode.IconCompatParcelizer(false);
                int i15 = IconCompatParcelizer + 11;
                serializer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
            }
            getpostalcode.IconCompatParcelizer(z2);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getHasCamera((Object) baselineShift, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier, i, 23);
        }
        int i17 = IconCompatParcelizer + 15;
        serializer = i17 % Fields.SpotShadowColor;
        if (i17 % 2 != 0) {
            int i18 = 2 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0089  */
    /* JADX WARN: Code duplicated, block: B:35:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f7 A[DONT_INVERT, PHI: r0 r2 r3
  0x00f7: PHI (r0v19 o.BaselineShift) = (r0v18 o.BaselineShift), (r0v39 o.BaselineShift) binds: [B:54:0x00f5, B:51:0x00e3] A[DONT_GENERATE, DONT_INLINE]
  0x00f7: PHI (r2v4 java.lang.Object) = (r2v3 java.lang.Object), (r2v14 java.lang.Object) binds: [B:54:0x00f5, B:51:0x00e3] A[DONT_GENERATE, DONT_INLINE]
  0x00f7: PHI (r3v2 o.AndroidContentCaptureManager) = (r3v1 o.AndroidContentCaptureManager), (r3v7 o.AndroidContentCaptureManager) binds: [B:54:0x00f5, B:51:0x00e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:61:0x0134  */
    /* JADX WARN: Code duplicated, block: B:63:0x013f  */
    /* JADX WARN: Code duplicated, block: B:66:0x016f  */
    /* JADX WARN: Code duplicated, block: B:67:0x017b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0185 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:72:0x0187  */
    public static final void TripPlannerListContainer(BaselineShiftCompanion baselineShiftCompanion, getQueryContext getquerycontext, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        BaselineShift baselineShift;
        Object objComponentActivity;
        AndroidContentCaptureManager androidContentCaptureManager;
        BaselineShift baselineShift2;
        AndroidContentCaptureManager androidContentCaptureManager2;
        boolean zIconCompatParcelizer;
        Object objComponentActivity2;
        boolean z;
        Object objComponentActivity3;
        int i3;
        boolean zIconCompatParcelizer2;
        int i4;
        int i5 = 2 % 2;
        baselineShiftCompanion.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-2085670760);
        if ((i & 6) == 0) {
            i2 = (!getpostalcode.IconCompatParcelizer(baselineShiftCompanion) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i6 = IconCompatParcelizer + 27;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if ((i & 64) == 0) {
                zIconCompatParcelizer2 = getpostalcode.read(getquerycontext);
            } else {
                zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(getquerycontext);
                int i8 = IconCompatParcelizer + 49;
                serializer = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    int i9 = 2 / 2;
                }
            }
            if (zIconCompatParcelizer2) {
                int i10 = serializer + 89;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                i4 = i10 % 2 == 0 ? 30 : 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            int i11 = serializer + 29;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                    i3 = Fields.RotationX;
                } else {
                    i3 = Fields.SpotShadowColor;
                }
            } else {
                int i12 = 46 / 0;
                if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                    i3 = Fields.RotationX;
                } else {
                    i3 = Fields.SpotShadowColor;
                }
            }
            i2 |= i3;
        }
        int i13 = i2 | 3072;
        if (getpostalcode.write(i13 & 1, (i13 & 1171) != 1170)) {
            Modifier.Companion companion = Modifier.Companion;
            r8lambdaKeMyxhuF3EYMhl9vgBGt4ME3jBA r8lambdakemyxhuf3eymhl9vgbgt4me3jba = (r8lambdaKeMyxhuF3EYMhl9vgBGt4ME3jBA) ExtrasKt.write(baselineShiftCompanion.MediaBrowserCompatMediaItem, getpostalcode, 0).getValue();
            if (r8lambdakemyxhuf3eymhl9vgbgt4me3jba instanceof shaderStatelambda0) {
                getpostalcode.serializer(1420137980);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                if (!(r8lambdakemyxhuf3eymhl9vgbgt4me3jba instanceof BaselineShift)) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, 1420134718, false);
                }
                int i14 = serializer + 95;
                IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                if (i14 % 2 == 0) {
                    getpostalcode.serializer(1074669367);
                    baselineShift = (BaselineShift) r8lambdakemyxhuf3eymhl9vgbgt4me3jba;
                    boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(baselineShiftCompanion);
                    objComponentActivity = getpostalcode.ComponentActivity();
                    androidContentCaptureManager = getCreditCardExpirationMonth.write;
                    int i15 = 64 / 0;
                    if (!zIconCompatParcelizer3) {
                        if (objComponentActivity == androidContentCaptureManager) {
                            baselineShift2 = baselineShift;
                            androidContentCaptureManager2 = androidContentCaptureManager;
                        }
                    }
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity);
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(baselineShiftCompanion);
                    objComponentActivity2 = getpostalcode.ComponentActivity();
                    if (!zIconCompatParcelizer) {
                        int i16 = IconCompatParcelizer + 53;
                        serializer = i16 % Fields.SpotShadowColor;
                        int i17 = i16 % 2;
                        if (objComponentActivity2 == androidContentCaptureManager2) {
                            ReportPictureUseCase$invoke$2 reportPictureUseCase$invoke$2 = new ReportPictureUseCase$invoke$2(1, baselineShiftCompanion, BaselineShiftCompanion.class, "onActionsClick", "onActionsClick(Lcom/roadrunner/delivery/ontheway/tripplanner/list/api/TripPlannerItem;)V", 0, 24);
                            getpostalcode.write(reportPictureUseCase$invoke$2);
                            objComponentActivity2 = reportPictureUseCase$invoke$2;
                        }
                    } else {
                        ReportPictureUseCase$invoke$2 reportPictureUseCase$invoke$3 = new ReportPictureUseCase$invoke$2(1, baselineShiftCompanion, BaselineShiftCompanion.class, "onActionsClick", "onActionsClick(Lcom/roadrunner/delivery/ontheway/tripplanner/list/api/TripPlannerItem;)V", 0, 24);
                        getpostalcode.write(reportPictureUseCase$invoke$3);
                        objComponentActivity2 = reportPictureUseCase$invoke$3;
                    }
                    TripPlannerList(baselineShift2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity2), companion, getpostalcode, i13 & 7168);
                    if ((i13 & 896) == 256) {
                        int i18 = serializer + 89;
                        IconCompatParcelizer = i18 % Fields.SpotShadowColor;
                        int i19 = i18 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    objComponentActivity3 = getpostalcode.ComponentActivity();
                    if (!z || objComponentActivity3 == androidContentCaptureManager2) {
                        objComponentActivity3 = new GestureNodeKt$$ExternalSyntheticLambda0(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 8);
                        getpostalcode.write(objComponentActivity3);
                    }
                    SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, getpostalcode, ((i13 >> 3) & 14) | 8);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(1074669367);
                    baselineShift = (BaselineShift) r8lambdakemyxhuf3eymhl9vgbgt4me3jba;
                    boolean zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(baselineShiftCompanion);
                    objComponentActivity = getpostalcode.ComponentActivity();
                    androidContentCaptureManager = getCreditCardExpirationMonth.write;
                    if (!zIconCompatParcelizer4) {
                        if (objComponentActivity == androidContentCaptureManager) {
                            baselineShift2 = baselineShift;
                            androidContentCaptureManager2 = androidContentCaptureManager;
                        }
                    }
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity);
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(baselineShiftCompanion);
                    objComponentActivity2 = getpostalcode.ComponentActivity();
                    if (!zIconCompatParcelizer) {
                        int i110 = IconCompatParcelizer + 53;
                        serializer = i110 % Fields.SpotShadowColor;
                        int i111 = i110 % 2;
                        if (objComponentActivity2 == androidContentCaptureManager2) {
                            ReportPictureUseCase$invoke$2 reportPictureUseCase$invoke$4 = new ReportPictureUseCase$invoke$2(1, baselineShiftCompanion, BaselineShiftCompanion.class, "onActionsClick", "onActionsClick(Lcom/roadrunner/delivery/ontheway/tripplanner/list/api/TripPlannerItem;)V", 0, 24);
                            getpostalcode.write(reportPictureUseCase$invoke$4);
                            objComponentActivity2 = reportPictureUseCase$invoke$4;
                        }
                    } else {
                        ReportPictureUseCase$invoke$2 reportPictureUseCase$invoke$5 = new ReportPictureUseCase$invoke$2(1, baselineShiftCompanion, BaselineShiftCompanion.class, "onActionsClick", "onActionsClick(Lcom/roadrunner/delivery/ontheway/tripplanner/list/api/TripPlannerItem;)V", 0, 24);
                        getpostalcode.write(reportPictureUseCase$invoke$5);
                        objComponentActivity2 = reportPictureUseCase$invoke$5;
                    }
                    TripPlannerList(baselineShift2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity2), companion, getpostalcode, i13 & 7168);
                    if ((i13 & 896) == 256) {
                        int i112 = serializer + 89;
                        IconCompatParcelizer = i112 % Fields.SpotShadowColor;
                        int i113 = i112 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    objComponentActivity3 = getpostalcode.ComponentActivity();
                    if (!z) {
                        objComponentActivity3 = new GestureNodeKt$$ExternalSyntheticLambda0(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 8);
                        getpostalcode.write(objComponentActivity3);
                    } else {
                        objComponentActivity3 = new GestureNodeKt$$ExternalSyntheticLambda0(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 8);
                        getpostalcode.write(objComponentActivity3);
                    }
                    SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, getpostalcode, ((i13 >> 3) & 14) | 8);
                    getpostalcode.IconCompatParcelizer(false);
                }
                baselineShift2 = baselineShift;
                SwitcherKt$Switcher$2$1 switcherKt$Switcher$2$1 = new SwitcherKt$Switcher$2$1(0, baselineShiftCompanion, BaselineShiftCompanion.class, "onSeeMoreClick", "onSeeMoreClick()V", 0, 2);
                getpostalcode.write(switcherKt$Switcher$2$1);
                objComponentActivity = switcherKt$Switcher$2$1;
                androidContentCaptureManager2 = androidContentCaptureManager;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity);
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(baselineShiftCompanion);
                objComponentActivity2 = getpostalcode.ComponentActivity();
                if (!zIconCompatParcelizer) {
                    int i114 = IconCompatParcelizer + 53;
                    serializer = i114 % Fields.SpotShadowColor;
                    int i115 = i114 % 2;
                    if (objComponentActivity2 == androidContentCaptureManager2) {
                        ReportPictureUseCase$invoke$2 reportPictureUseCase$invoke$6 = new ReportPictureUseCase$invoke$2(1, baselineShiftCompanion, BaselineShiftCompanion.class, "onActionsClick", "onActionsClick(Lcom/roadrunner/delivery/ontheway/tripplanner/list/api/TripPlannerItem;)V", 0, 24);
                        getpostalcode.write(reportPictureUseCase$invoke$6);
                        objComponentActivity2 = reportPictureUseCase$invoke$6;
                    }
                } else {
                    ReportPictureUseCase$invoke$2 reportPictureUseCase$invoke$7 = new ReportPictureUseCase$invoke$2(1, baselineShiftCompanion, BaselineShiftCompanion.class, "onActionsClick", "onActionsClick(Lcom/roadrunner/delivery/ontheway/tripplanner/list/api/TripPlannerItem;)V", 0, 24);
                    getpostalcode.write(reportPictureUseCase$invoke$7);
                    objComponentActivity2 = reportPictureUseCase$invoke$7;
                }
                TripPlannerList(baselineShift2, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity2), companion, getpostalcode, i13 & 7168);
                if ((i13 & 896) == 256) {
                    int i116 = serializer + 89;
                    IconCompatParcelizer = i116 % Fields.SpotShadowColor;
                    int i117 = i116 % 2;
                    z = true;
                } else {
                    z = false;
                }
                objComponentActivity3 = getpostalcode.ComponentActivity();
                if (!z) {
                    objComponentActivity3 = new GestureNodeKt$$ExternalSyntheticLambda0(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 8);
                    getpostalcode.write(objComponentActivity3);
                } else {
                    objComponentActivity3 = new GestureNodeKt$$ExternalSyntheticLambda0(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 8);
                    getpostalcode.write(objComponentActivity3);
                }
                SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, getpostalcode, ((i13 >> 3) & 14) | 8);
                getpostalcode.IconCompatParcelizer(false);
            }
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getHasCamera((Object) baselineShiftCompanion, (Object) getquerycontext, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier2, i, 22);
        }
    }
}
