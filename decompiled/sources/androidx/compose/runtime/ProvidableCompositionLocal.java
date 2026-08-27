package androidx.compose.runtime;

import o.AndroidContentCaptureManager;
import o.getCieXyz;
import o.getNewPassword;
import o.getNewUsername;
import o.getPostalAddress;
import o.hideTranslatedText;
import o.onShowTranslationui;
import o.removeNodeAtDepth;
import o.setContentCaptureSessionui;
import o.setOnContentCaptureSession;

/* JADX INFO: loaded from: classes.dex */
public abstract class ProvidableCompositionLocal extends getNewPassword {
    public abstract hideTranslatedText write(Object obj);

    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    public final setContentCaptureSessionui write(hideTranslatedText hidetranslatedtext, setContentCaptureSessionui setcontentcapturesessionui) {
        getNewUsername getnewusername;
        setOnContentCaptureSession setoncontentcapturesession;
        setContentCaptureSessionui setcontentcapturesessionui2;
        getPostalAddress getpostaladdress;
        if (setcontentcapturesessionui instanceof getPostalAddress) {
            if (hidetranslatedtext.IconCompatParcelizer) {
                getpostaladdress = (getPostalAddress) setcontentcapturesessionui;
                ((onShowTranslationui) getpostaladdress.serializer).setValue(hidetranslatedtext.write());
            } else {
                setcontentcapturesessionui2 = getnewusername;
                setcontentcapturesessionui2 = setoncontentcapturesession;
                setcontentcapturesessionui2 = null;
            }
        } else if (setcontentcapturesessionui instanceof setOnContentCaptureSession) {
            if ((hidetranslatedtext.RemoteActionCompatParcelizer || hidetranslatedtext.MediaMetadataCompat != null) && !hidetranslatedtext.IconCompatParcelizer) {
                setoncontentcapturesession = (setOnContentCaptureSession) setcontentcapturesessionui;
                Object[] objArr = {hidetranslatedtext.write(), setoncontentcapturesession.IconCompatParcelizer};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    setcontentcapturesessionui2 = getnewusername;
                    setcontentcapturesessionui2 = setoncontentcapturesession;
                    setcontentcapturesessionui2 = null;
                }
            } else {
                setcontentcapturesessionui2 = getnewusername;
                setcontentcapturesessionui2 = setoncontentcapturesession;
                setcontentcapturesessionui2 = null;
            }
        } else if (setcontentcapturesessionui instanceof getNewUsername) {
            hidetranslatedtext.getClass();
            getnewusername = (getNewUsername) setcontentcapturesessionui;
            if (getnewusername.write != null) {
                setcontentcapturesessionui2 = getnewusername;
                setcontentcapturesessionui2 = setoncontentcapturesession;
                setcontentcapturesessionui2 = null;
            }
        } else {
            setcontentcapturesessionui2 = getnewusername;
            setcontentcapturesessionui2 = setoncontentcapturesession;
            setcontentcapturesessionui2 = null;
        }
        if (setcontentcapturesessionui2 != null) {
            setcontentcapturesessionui2 = getpostaladdress;
            return setcontentcapturesessionui2;
        }
        if (!hidetranslatedtext.IconCompatParcelizer) {
            setcontentcapturesessionui2 = getpostaladdress;
            return new setOnContentCaptureSession(hidetranslatedtext.write());
        }
        Object obj = hidetranslatedtext.MediaMetadataCompat;
        AndroidContentCaptureManager androidContentCaptureManager = hidetranslatedtext.serializer;
        if (androidContentCaptureManager == null) {
            setcontentcapturesessionui2 = getpostaladdress;
            androidContentCaptureManager = AndroidContentCaptureManager.write;
        }
        setcontentcapturesessionui2 = getpostaladdress;
        return new getPostalAddress(new ParcelableSnapshotMutableState(obj, androidContentCaptureManager));
    }
}
