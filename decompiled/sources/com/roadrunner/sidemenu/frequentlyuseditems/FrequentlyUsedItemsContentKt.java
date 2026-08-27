package com.roadrunner.sidemenu.frequentlyuseditems;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.roadrunner.tnc.TncComposableFactoryImpl$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import kotlinx.coroutines.JobKt__JobKt$invokeOnCompletion$1;
import o.AndroidContentCaptureManager;
import o.DragAndDropTargetModifierNode;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.onContentCardDismissed;
import o.p7;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdakakRSJ0yRWnWIggdAd9IDPYuM;
import o.r8lambdalR5SL_tSS1JcT7wrmZ_9di0raRc;
import o.r8lambdaqnZRqetjfFf2WXtrt0EwRzhWIUs;
import o.r8lambdarhobHpPgW3fYGaomIOtfm02vDE;
import o.r8lambdas7hGQZUVhdtJa9loZ8w1Xl2jDOA;
import o.registerInAppMessageManagerlambda0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FrequentlyUsedItemsContentKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;

    public static final void RemoteActionCompatParcelizer(r8lambdarhobHpPgW3fYGaomIOtfm02vDE r8lambdarhobhppgw3fygaomiotfm02vde, r8lambdakakRSJ0yRWnWIggdAd9IDPYuM r8lambdakakrsj0yrwnwiggdad9idpyum, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        r8lambdarhobhppgw3fygaomiotfm02vde.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-2130851857);
        if ((i & 6) == 0) {
            int i5 = serializer + 39;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                getpostalcode.IconCompatParcelizer(r8lambdarhobhppgw3fygaomiotfm02vde);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i2 = (getpostalcode.IconCompatParcelizer(r8lambdarhobhppgw3fygaomiotfm02vde) ? 4 : 2) | i;
        } else {
            int i6 = RemoteActionCompatParcelizer + 11;
            serializer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                int i7 = 4 % 4;
            }
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdakakrsj0yrwnwiggdad9idpyum) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.read(modifier)) {
                int i8 = RemoteActionCompatParcelizer + 11;
                serializer = i8 % Fields.SpotShadowColor;
                i3 = i8 % 2 != 0 ? 9198 : Fields.RotationX;
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            int i9 = i2 << 3;
            FrequentlyUsedItemsScreen(r8lambdarhobhppgw3fygaomiotfm02vde, (r8lambdas7hGQZUVhdtJa9loZ8w1Xl2jDOA) ExtrasKt.write(r8lambdarhobhppgw3fygaomiotfm02vde.serializer, getpostalcode, 0).getValue(), r8lambdakakrsj0yrwnwiggdad9idpyum, modifier, getpostalcode, (i9 & 7168) | (i9 & 896) | (i2 & 14) | 64);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU(i, 23, r8lambdarhobhppgw3fygaomiotfm02vde, r8lambdakakrsj0yrwnwiggdad9idpyum, modifier);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX WARN: Code duplicated, block: B:14:0x0042  */
    /* JADX WARN: Code duplicated, block: B:15:0x0044  */
    /* JADX WARN: Code duplicated, block: B:17:0x0048 A[PHI: r1
  0x0048: PHI (r1v58 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v60 o.getPostalCode) binds: [B:8:0x002e, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x012a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0030 A[PHI: r1
  0x0030: PHI (r1v6 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v60 o.getPostalCode) binds: [B:8:0x002e, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void FrequentlyUsedItemsScreen(r8lambdarhobHpPgW3fYGaomIOtfm02vDE r8lambdarhobhppgw3fygaomiotfm02vde, r8lambdas7hGQZUVhdtJa9loZ8w1Xl2jDOA r8lambdas7hgqzuvhdtja9loz8w1xl2jdoa, r8lambdakakRSJ0yRWnWIggdAd9IDPYuM r8lambdakakrsj0yrwnwiggdad9idpyum, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        getPostalCode getpostalcode2;
        int i4;
        getPostalCode getpostalcode3;
        int i5;
        boolean zIconCompatParcelizer;
        int i6 = 2 % 2;
        int i7 = serializer + 45;
        RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1238953427);
            if ((i & 87) == 0) {
                if (getpostalcode.IconCompatParcelizer(r8lambdarhobhppgw3fygaomiotfm02vde)) {
                    i4 = serializer + 17;
                    RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        i2 = 2;
                    } else {
                        i2 = 4;
                    }
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i3 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1238953427);
            if ((i & 6) == 0) {
                if (getpostalcode.IconCompatParcelizer(r8lambdarhobhppgw3fygaomiotfm02vde)) {
                    i4 = serializer + 17;
                    RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        i2 = 2;
                    } else {
                        i2 = 4;
                    }
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            int i8 = RemoteActionCompatParcelizer + 61;
            serializer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0 ? (i & 64) == 0 : (i & 16) == 0) {
                zIconCompatParcelizer = getpostalcode2.read(r8lambdas7hgqzuvhdtja9loz8w1xl2jdoa);
            } else {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(r8lambdas7hgqzuvhdtja9loz8w1xl2jdoa);
            }
            i3 |= zIconCompatParcelizer ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdakakrsj0yrwnwiggdad9idpyum)) {
                int i9 = RemoteActionCompatParcelizer + 13;
                serializer = i9 % Fields.SpotShadowColor;
                i5 = i9 % 2 != 0 ? 24749 : Fields.RotationX;
            } else {
                i5 = Fields.SpotShadowColor;
            }
            i3 |= i5;
        }
        if ((i & 3072) == 0) {
            i3 |= getpostalcode2.read(modifier) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i10 = i3;
        if (getpostalcode2.write(i10 & 1, (i10 & 1171) != 1170)) {
            int i11 = serializer + 97;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                DragAndDropTargetModifierNode dragAndDropTargetModifierNode = new DragAndDropTargetModifierNode(new TncComposableFactoryImpl$$ExternalSyntheticLambda0(9, r8lambdakakrsj0yrwnwiggdad9idpyum), true, 1164398216);
                getpostalcode2.write(dragAndDropTargetModifierNode);
                objComponentActivity = dragAndDropTargetModifierNode;
            }
            ((r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity).invoke((r8lambdalR5SL_tSS1JcT7wrmZ_9di0raRc) r8lambdarhobhppgw3fygaomiotfm02vde.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper(), getpostalcode2, 48);
            ArrayList arrayList = r8lambdas7hgqzuvhdtja9loz8w1xl2jdoa.read;
            r8lambdaqnZRqetjfFf2WXtrt0EwRzhWIUs r8lambdaqnzrqetjfff2wxtrt0ewrzhwius = (r8lambdaqnZRqetjfFf2WXtrt0EwRzhWIUs) onContentCardDismissed.read(0, arrayList);
            r8lambdaqnZRqetjfFf2WXtrt0EwRzhWIUs r8lambdaqnzrqetjfff2wxtrt0ewrzhwius2 = (r8lambdaqnZRqetjfFf2WXtrt0EwRzhWIUs) onContentCardDismissed.read(1, arrayList);
            r8lambdaqnZRqetjfFf2WXtrt0EwRzhWIUs r8lambdaqnzrqetjfff2wxtrt0ewrzhwius3 = (r8lambdaqnZRqetjfFf2WXtrt0EwRzhWIUs) onContentCardDismissed.read(2, arrayList);
            r8lambdaqnZRqetjfFf2WXtrt0EwRzhWIUs r8lambdaqnzrqetjfff2wxtrt0ewrzhwius4 = (r8lambdaqnZRqetjfFf2WXtrt0EwRzhWIUs) onContentCardDismissed.read(3, arrayList);
            boolean zIconCompatParcelizer2 = getpostalcode2.IconCompatParcelizer(r8lambdarhobhppgw3fygaomiotfm02vde);
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            if (!zIconCompatParcelizer2) {
                int i13 = RemoteActionCompatParcelizer + 69;
                serializer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                if (objComponentActivity2 == androidContentCaptureManager) {
                    JobKt__JobKt$invokeOnCompletion$1 jobKt__JobKt$invokeOnCompletion$1 = new JobKt__JobKt$invokeOnCompletion$1(1, r8lambdarhobhppgw3fygaomiotfm02vde, r8lambdarhobHpPgW3fYGaomIOtfm02vDE.class, "onItemClicked", "onItemClicked(Lcom/roadrunner/sidemenu/frequentlyuseditems/FrequentlyUsedItem;)V", 0, 12);
                    getpostalcode2.write(jobKt__JobKt$invokeOnCompletion$1);
                    objComponentActivity2 = jobKt__JobKt$invokeOnCompletion$1;
                }
            } else {
                JobKt__JobKt$invokeOnCompletion$1 jobKt__JobKt$invokeOnCompletion$2 = new JobKt__JobKt$invokeOnCompletion$1(1, r8lambdarhobhppgw3fygaomiotfm02vde, r8lambdarhobHpPgW3fYGaomIOtfm02vDE.class, "onItemClicked", "onItemClicked(Lcom/roadrunner/sidemenu/frequentlyuseditems/FrequentlyUsedItem;)V", 0, 12);
                getpostalcode2.write(jobKt__JobKt$invokeOnCompletion$2);
                objComponentActivity2 = jobKt__JobKt$invokeOnCompletion$2;
            }
            getpostalcode3 = getpostalcode2;
            FrequentlyUsedItemsKt.FrequentlyUsedItems(r8lambdaqnzrqetjfff2wxtrt0ewrzhwius, r8lambdaqnzrqetjfff2wxtrt0ewrzhwius2, r8lambdaqnzrqetjfff2wxtrt0ewrzhwius3, r8lambdaqnzrqetjfff2wxtrt0ewrzhwius4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity2), modifier, getpostalcode3, (458752 & (i10 << 6)) | 4680);
        } else {
            getpostalcode3 = getpostalcode2;
            getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode3.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p7((Object) r8lambdarhobhppgw3fygaomiotfm02vde, (Object) r8lambdas7hgqzuvhdtja9loz8w1xl2jdoa, (Object) r8lambdakakrsj0yrwnwiggdad9idpyum, modifier, i, 28);
        }
    }
}
