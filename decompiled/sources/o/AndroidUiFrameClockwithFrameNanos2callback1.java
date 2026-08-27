package o;

import coil3.disk.DiskLruCache$Editor;
import com.google.android.gms.tasks.zzw;
import com.huawei.wisesecurity.kfs.exception.KfsException;
import java.io.IOException;
import java.io.Serializable;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AndroidUiFrameClockwithFrameNanos2callback1 {
    public final Serializable IconCompatParcelizer;
    public Serializable RemoteActionCompatParcelizer;
    public Object write;

    public abstract void read();

    public abstract void serializer();

    public abstract List write(setRequestedFrameRate setrequestedframerate);

    public void RemoteActionCompatParcelizer(String str) throws KfsException {
        try {
            KeyStore keyStore = KeyStore.getInstance(((getCanScrollVertically) this.IconCompatParcelizer).getName());
            keyStore.load(null);
            java.security.Key key = keyStore.getKey(str, null);
            if (!(key instanceof PrivateKey)) {
                throw new KfsException("bad private key type");
            }
            this.write = (PrivateKey) key;
            this.RemoteActionCompatParcelizer = keyStore.getCertificate(str).getPublicKey();
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException | CertificateException e) {
            throw new KfsException(MediaSessionCompatQueueItem.read(e, accessgetSwitchcp.IconCompatParcelizer("keystore get key with alias failed, ")));
        }
    }

    public zzw serializer(final Executor executor, Callable callable, final ParentDataModifier parentDataModifier) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(((AtomicInteger) this.RemoteActionCompatParcelizer).get() > 0);
        if (((getMeasuredSizeYbymL2g) parentDataModifier).write.isComplete()) {
            zzw zzwVar = new zzw();
            zzwVar.read();
            return zzwVar;
        }
        final getOwner getowner = new getOwner();
        final ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = new ParentDataModifierDefaultImpls(getowner.RemoteActionCompatParcelizer);
        ((DiskLruCache$Editor) this.write).write(new getLayoutNodeToHolder(this, parentDataModifier, getowner, callable, parentDataModifierDefaultImpls, 0), new Executor() { // from class: o.getHolderToLayoutNode
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RuntimeException e) {
                    if (((getMeasuredSizeYbymL2g) parentDataModifier).write.isComplete()) {
                        getowner.IconCompatParcelizer();
                    } else {
                        parentDataModifierDefaultImpls.RemoteActionCompatParcelizer(e);
                    }
                    throw e;
                }
            }
        });
        return parentDataModifierDefaultImpls.RemoteActionCompatParcelizer;
    }

    public AndroidUiFrameClockwithFrameNanos2callback1() {
        this.RemoteActionCompatParcelizer = new AtomicInteger(0);
        this.IconCompatParcelizer = new AtomicBoolean(false);
        this.write = new DiskLruCache$Editor();
    }

    public AndroidUiFrameClockwithFrameNanos2callback1(getCanScrollVertically getcanscrollvertically) {
        this.IconCompatParcelizer = getcanscrollvertically;
    }
}
