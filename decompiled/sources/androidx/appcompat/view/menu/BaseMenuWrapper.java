package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import com.huawei.wisesecurity.kfs.exception.KfsException;
import com.huawei.wisesecurity.kfs.exception.KfsKeyStoreException;
import java.io.IOException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.util.Arrays;
import o.ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1;
import o.MediaSessionCompatQueueItem;
import o.ScrollCapture_androidKt;
import o.accessgetSwitchcp;
import o.accessminIntrinsicHeightjd;
import o.closeOptionsMenu;
import o.dispatchIndirectPointerEvent;
import o.getCanScrollVertically;
import o.getColumnSpan;
import o.getMergeDescendants;
import o.processDragGesture;
import o.toContentCaptureSession;
import o.visitScrollCaptureCandidates;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseMenuWrapper {
    public Object IconCompatParcelizer;
    public Object write;

    public abstract void read(visitScrollCaptureCandidates visitscrollcapturecandidates);

    public abstract void serializer(visitScrollCaptureCandidates visitscrollcapturecandidates);

    public abstract void write(visitScrollCaptureCandidates visitscrollcapturecandidates);

    public static void read(ScrollCapture_androidKt scrollCapture_androidKt) throws KfsKeyStoreException {
        ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.write("EncryptUtil");
        byte[] bArrRemoteActionCompatParcelizer = accessminIntrinsicHeightjd.RemoteActionCompatParcelizer(32);
        if (!Arrays.equals(bArrRemoteActionCompatParcelizer, scrollCapture_androidKt.getDecryptHandler().from(scrollCapture_androidKt.getEncryptHandler().mo4512from(bArrRemoteActionCompatParcelizer).to()).to())) {
            throw new KfsKeyStoreException("validate crypto key get bad result");
        }
    }

    public static void read(getMergeDescendants getmergedescendants) throws KfsKeyStoreException {
        ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.write("EncryptUtil");
        byte[] bArrRemoteActionCompatParcelizer = accessminIntrinsicHeightjd.RemoteActionCompatParcelizer(32);
        if (!getmergedescendants.getVerifyHandler().fromData(bArrRemoteActionCompatParcelizer).verify(getmergedescendants.getSignHandler().from(bArrRemoteActionCompatParcelizer).sign())) {
            throw new KfsKeyStoreException("validate sign key get bad result");
        }
    }

    public void IconCompatParcelizer() throws KfsException {
        if (((KeyStore) this.write) != null) {
            return;
        }
        if (((getCanScrollVertically) this.IconCompatParcelizer) == getCanScrollVertically.HUAWEI_KEYSTORE && toContentCaptureSession.RemoteActionCompatParcelizer == null) {
            synchronized (toContentCaptureSession.class) {
                if (toContentCaptureSession.RemoteActionCompatParcelizer == null) {
                    toContentCaptureSession.RemoteActionCompatParcelizer = new toContentCaptureSession();
                }
            }
        }
        try {
            KeyStore keyStore = KeyStore.getInstance(((getCanScrollVertically) this.IconCompatParcelizer).getName());
            this.write = keyStore;
            keyStore.load(null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            throw new KfsException(MediaSessionCompatQueueItem.read(e, accessgetSwitchcp.IconCompatParcelizer("init keystore failed, ")));
        }
    }

    public BaseMenuWrapper(getCanScrollVertically getcanscrollvertically) {
        this.IconCompatParcelizer = getcanscrollvertically;
    }

    public void RemoteActionCompatParcelizer(visitScrollCaptureCandidates visitscrollcapturecandidates) {
        getColumnSpan.RemoteActionCompatParcelizer(visitscrollcapturecandidates);
        String str = (String) visitscrollcapturecandidates.serializer;
        serializer(visitscrollcapturecandidates);
        read(visitscrollcapturecandidates);
        try {
            write(visitscrollcapturecandidates);
        } catch (KfsException e) {
            accessgetSwitchcp.IconCompatParcelizer("validate key failed, try to remove the key entry for alias:").append(str);
            if (RemoteActionCompatParcelizer(str)) {
                try {
                    ((KeyStore) this.write).deleteEntry(str);
                } catch (KeyStoreException e2) {
                    StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("delete key entry failed, ");
                    sbIconCompatParcelizer.append(e2.getMessage());
                    throw new KfsException(sbIconCompatParcelizer.toString());
                }
            }
            throw e;
        }
    }

    public boolean RemoteActionCompatParcelizer(String str) throws KfsException {
        IconCompatParcelizer();
        try {
            return ((KeyStore) this.write).containsAlias(str);
        } catch (KeyStoreException e) {
            StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("keystore check alias failed, ");
            sbIconCompatParcelizer.append(e.getMessage());
            throw new KfsException(sbIconCompatParcelizer.toString());
        }
    }

    public Key serializer() throws KfsException {
        IconCompatParcelizer();
        try {
            return ((KeyStore) this.write).getKey("ucs_aes_alias_rootKey", null);
        } catch (KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException e) {
            StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("keystore get key failed, ");
            sbIconCompatParcelizer.append(e.getMessage());
            throw new KfsException(sbIconCompatParcelizer.toString());
        }
    }

    public Certificate[] write(String str) {
        IconCompatParcelizer();
        try {
            return ((KeyStore) this.write).getCertificateChain(str);
        } catch (KeyStoreException e) {
            StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("keystore get certificate chain failed, ");
            sbIconCompatParcelizer.append(e.getMessage());
            throw new KfsException(sbIconCompatParcelizer.toString());
        }
    }

    public MenuItem serializer(MenuItem menuItem) {
        if (!(menuItem instanceof dispatchIndirectPointerEvent)) {
            return menuItem;
        }
        dispatchIndirectPointerEvent dispatchindirectpointerevent = (dispatchIndirectPointerEvent) menuItem;
        if (((processDragGesture) this.IconCompatParcelizer) == null) {
            this.IconCompatParcelizer = new processDragGesture(0);
        }
        MenuItem menuItem2 = (MenuItem) ((processDragGesture) this.IconCompatParcelizer).get(dispatchindirectpointerevent);
        if (menuItem2 != null) {
            return menuItem2;
        }
        closeOptionsMenu closeoptionsmenu = new closeOptionsMenu((Context) this.write, dispatchindirectpointerevent);
        ((processDragGesture) this.IconCompatParcelizer).put(dispatchindirectpointerevent, closeoptionsmenu);
        return closeoptionsmenu;
    }

    public BaseMenuWrapper(Context context) {
        this.write = context;
    }
}
