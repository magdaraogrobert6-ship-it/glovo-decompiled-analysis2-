package org.bouncycastle.asn1;

import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ah$$ExternalSyntheticLambda0;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.SignInDataStore$set$2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import o.AndroidPathIterator_androidKtWhenMappings;
import o.AndroidPathMeasure_androidKt;
import o.AndroidPrefetchScheduler;
import o.BlockDropShadowNode;
import o.BlockDropShadowNodeobtainPainter1;
import o.PathMeasure;
import o.PopulateViewStructure_androidKtpopulate7;
import o.accessregisterComponentCallback;
import o.cubicTo;
import o.getBackendNamecustomerchat_release;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getLength;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.opN5in7k0;
import o.r8lambdaD6k6wXRxTgZJWNsBhjsOrg3Yu9s;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setPath;
import o.toColorLong8_81llA;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ASN1Util {
    public static final void write(List list, Collection collection, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1537894851);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(collection) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && getpostalcode.MediaSessionCompatToken()) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
            boolean zBooleanValue = ((Boolean) getpostalcode.write((getNewPassword) InspectionModeKt.getLocalInspectionMode())).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                cubicTo cubicto = (cubicTo) it.next();
                accessregisterComponentCallback accessregistercomponentcallback = cubicto.MediaBrowserCompatMediaItem.RatingCompat;
                boolean zWrite = getpostalcode.write(zBooleanValue);
                boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(list);
                boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(cubicto);
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if ((zWrite | zIconCompatParcelizer | zIconCompatParcelizer2) || objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new getLength(cubicto, list, zBooleanValue);
                    getpostalcode.write(objComponentActivity);
                }
                getPhoneNumberNational.serializer(accessregistercomponentcallback, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode);
            }
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPrefetchScheduler(i, 7, list, collection);
        }
    }

    public static final void serializer(setPath setpath, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(294589392);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(setpath) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        boolean z = false;
        if ((i2 & 3) == 2 && getpostalcode.MediaSessionCompatToken()) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
            BlockDropShadowNode blockDropShadowNodeIconCompatParcelizer = r8lambdaD6k6wXRxTgZJWNsBhjsOrg3Yu9s.IconCompatParcelizer(getpostalcode);
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = CompositionKt.write(setpath.serializer().serializer, getpostalcode);
            Object obj = (Collection) ((List) populateViewStructure_androidKtpopulate7Write.getValue());
            boolean zBooleanValue = ((Boolean) getpostalcode.write(InspectionModeKt.getLocalInspectionMode())).booleanValue();
            boolean z2 = getpostalcode.read(obj);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            Object obj2 = getCreditCardExpirationMonth.write;
            Object obj3 = objComponentActivity;
            if (z2 || objComponentActivity == obj2) {
                SnapshotStateList snapshotStateList = new SnapshotStateList();
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : (Iterable) obj) {
                    cubicTo cubicto = (cubicTo) obj4;
                    if (zBooleanValue || cubicto.MediaBrowserCompatMediaItem.RatingCompat.RatingCompat.isAtLeast(toColorLong8_81llA.STARTED)) {
                        arrayList.add(obj4);
                    }
                }
                snapshotStateList.addAll(arrayList);
                getpostalcode.write(snapshotStateList);
                obj3 = snapshotStateList;
            }
            SnapshotStateList snapshotStateList2 = (SnapshotStateList) obj3;
            write(snapshotStateList2, (List) populateViewStructure_androidKtpopulate7Write.getValue(), getpostalcode, 0);
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write2 = CompositionKt.write(setpath.serializer().MediaBrowserCompatMediaItem, getpostalcode);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (objComponentActivity2 == obj2) {
                objComponentActivity2 = new SnapshotStateList();
                getpostalcode.write(objComponentActivity2);
            }
            SnapshotStateList snapshotStateList3 = (SnapshotStateList) objComponentActivity2;
            getpostalcode.serializer(-367418626);
            ListIterator listIterator = snapshotStateList2.listIterator();
            while (true) {
                BlockDropShadowNodeobtainPainter1 blockDropShadowNodeobtainPainter1 = (BlockDropShadowNodeobtainPainter1) listIterator;
                if (!blockDropShadowNodeobtainPainter1.hasNext()) {
                    break;
                }
                cubicTo cubicto2 = (cubicTo) blockDropShadowNodeobtainPainter1.next();
                opN5in7k0 opn5in7k0 = cubicto2.IconCompatParcelizer;
                opn5in7k0.getClass();
                PathMeasure pathMeasure = (PathMeasure) opn5in7k0;
                boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(setpath);
                boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(cubicto2);
                Object objComponentActivity3 = getpostalcode.ComponentActivity();
                if ((zIconCompatParcelizer | zIconCompatParcelizer2) || objComponentActivity3 == obj2) {
                    objComponentActivity3 = new ah$$ExternalSyntheticLambda0(setpath, 19, cubicto2);
                    getpostalcode.write(objComponentActivity3);
                }
                AndroidDialog_androidKt.Dialog((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3, pathMeasure.IconCompatParcelizer, ExtrasKt.write(1129586364, new AndroidPathMeasure_androidKt(cubicto2, setpath, blockDropShadowNodeIconCompatParcelizer, snapshotStateList3, pathMeasure), getpostalcode), getpostalcode, 384, 0);
                z = false;
            }
            getpostalcode.IconCompatParcelizer(z);
            Set set = (Set) populateViewStructure_androidKtpopulate7Write2.getValue();
            boolean z3 = getpostalcode.read(populateViewStructure_androidKtpopulate7Write2);
            boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(setpath);
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if ((z3 | zIconCompatParcelizer3) || objComponentActivity4 == obj2) {
                Object signInDataStore$set$2 = new SignInDataStore$set$2(populateViewStructure_androidKtpopulate7Write2, setpath, snapshotStateList3, null, 2);
                getpostalcode.write(signInDataStore$set$2);
                objComponentActivity4 = signInDataStore$set$2;
            }
            getPhoneNumberNational.serializer(set, snapshotStateList3, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity4, getpostalcode);
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPathIterator_androidKtWhenMappings(setpath, i, 0);
        }
    }

    public static void read(getBackendNamecustomerchat_release getbackendnamecustomerchat_release) {
        String str;
        int i = getbackendnamecustomerchat_release.RemoteActionCompatParcelizer;
        if (i == 128) {
            return;
        }
        if (i == 64) {
            str = "APPLICATION";
        } else if (i != 128) {
            str = i != 192 ? "UNIVERSAL" : "PRIVATE";
        } else {
            str = "CONTEXT";
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(af$$ExternalSyntheticOutline0.m("Expected ", "CONTEXT", " tag but found ", str));
    }

    public static String serializer(int i, int i2) {
        String str;
        if (i == 64) {
            str = "[APPLICATION ";
        } else if (i == 128) {
            str = "[CONTEXT ";
        } else if (i != 192) {
            str = "[UNIVERSAL ";
        } else {
            str = "[PRIVATE ";
        }
        return d$$ExternalSyntheticOutline0.m(i2, str, "]");
    }
}
