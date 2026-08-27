package androidx.compose.runtime;

import androidx.emoji2.text.EmojiProcessor;
import coil3.RealImageLoader;
import coil3.RealImageLoader$execute$result$1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AndroidContentCaptureManager;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getPersonLastName;
import o.getPhoneNumberNational;
import o.getPlatformAndroidManager;
import o.getPostalCode;
import o.getSmsOtpCode;
import o.onCreateVirtualViewTranslationRequests;
import o.onSemanticsChangeui;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public abstract class CompositionKt {
    public static final Object serializer = new Object();
    public static final AndroidContentCaptureManager read = new AndroidContentCaptureManager(7);

    public static final onCreateVirtualViewTranslationRequests IconCompatParcelizer() {
        EmojiProcessor emojiProcessor = onSemanticsChangeui.read;
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = (onCreateVirtualViewTranslationRequests) emojiProcessor.RemoteActionCompatParcelizer();
        if (oncreatevirtualviewtranslationrequests != null) {
            return oncreatevirtualviewtranslationrequests;
        }
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2 = new onCreateVirtualViewTranslationRequests(new getSmsOtpCode[0]);
        emojiProcessor.read(oncreatevirtualviewtranslationrequests2);
        return oncreatevirtualviewtranslationrequests2;
    }

    public static final PopulateViewStructure_androidKtpopulate7 RemoteActionCompatParcelizer(Object obj, Object obj2, Object obj3, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        Object objComponentActivity = getpostalcode.ComponentActivity();
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        if (objComponentActivity == androidContentCaptureManager) {
            objComponentActivity = RemoteActionCompatParcelizer(obj);
            getpostalcode.write(objComponentActivity);
        }
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity;
        boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
        Object objComponentActivity2 = getpostalcode.ComponentActivity();
        if (zIconCompatParcelizer || objComponentActivity2 == androidContentCaptureManager) {
            objComponentActivity2 = new RealImageLoader.AnonymousClass2(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, populateViewStructure_androidKtpopulate7, (ShortNewsContentCardView) null, 19);
            getpostalcode.write(objComponentActivity2);
        }
        getPhoneNumberNational.serializer(obj2, obj3, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity2, getpostalcode);
        return populateViewStructure_androidKtpopulate7;
    }

    public static final getPlatformAndroidManager read(int i) {
        return new ParcelableSnapshotMutableIntState(i);
    }

    public static final PopulateViewStructure_androidKtpopulate7 serializer(Object obj, AndroidContentCaptureManager androidContentCaptureManager) {
        return new ParcelableSnapshotMutableState(obj, androidContentCaptureManager);
    }

    public static final PopulateViewStructure_androidKtpopulate7 serializer(Object obj, getBirthDateFull getbirthdatefull) {
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        Object objComponentActivity = getpostalcode.ComponentActivity();
        if (objComponentActivity == getCreditCardExpirationMonth.write) {
            objComponentActivity = RemoteActionCompatParcelizer(obj);
            getpostalcode.write(objComponentActivity);
        }
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity;
        populateViewStructure_androidKtpopulate7.setValue(obj);
        return populateViewStructure_androidKtpopulate7;
    }

    public static final Flow IconCompatParcelizer(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        return FlowKt.read(new RealImageLoader$execute$result$1(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null));
    }

    public static PopulateViewStructure_androidKtpopulate7 RemoteActionCompatParcelizer(Object obj) {
        return new ParcelableSnapshotMutableState(obj, AndroidContentCaptureManager.write);
    }

    public static final getPersonLastName serializer(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        EmojiProcessor emojiProcessor = onSemanticsChangeui.serializer;
        return new getPersonLastName(null, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
    }

    public static final PopulateViewStructure_androidKtpopulate7 write(StateFlow stateFlow, getBirthDateFull getbirthdatefull) {
        Object obj = stateFlow.read();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc r8lambda2qmxd75iptxkfld4rjabqemoamc = r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write;
        boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(r8lambda2qmxd75iptxkfld4rjabqemoamc);
        boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(stateFlow);
        Object objComponentActivity = getpostalcode.ComponentActivity();
        if ((zIconCompatParcelizer | zIconCompatParcelizer2) || objComponentActivity == getCreditCardExpirationMonth.write) {
            objComponentActivity = new RealImageLoader.AnonymousClass2(r8lambda2qmxd75iptxkfld4rjabqemoamc, stateFlow, (ShortNewsContentCardView) null, 20);
            getpostalcode.write(objComponentActivity);
        }
        return RemoteActionCompatParcelizer(obj, stateFlow, r8lambda2qmxd75iptxkfld4rjabqemoamc, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity, getpostalcode, 0);
    }

    public static final getPersonLastName serializer(AndroidContentCaptureManager androidContentCaptureManager, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        EmojiProcessor emojiProcessor = onSemanticsChangeui.serializer;
        return new getPersonLastName(androidContentCaptureManager, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
    }
}
