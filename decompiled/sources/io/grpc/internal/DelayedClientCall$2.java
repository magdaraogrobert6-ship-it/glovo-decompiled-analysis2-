package io.grpc.internal;

import android.os.RemoteException;
import androidx.emoji2.text.EmojiProcessor;
import androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1;
import com.google.android.gms.measurement.internal.zzr;
import io.grpc.Status;
import io.grpc.StatusException;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import o.GifDrawableTransformation;
import o.LookaheadScopeKt;
import o.LookaheadScopeKtLookaheadScope221;
import o.MeasureScope;
import o.NoWindowInsetsAnimation;
import o.ShortNewsContentCardView;
import o.ShortNewsContentCardViewCompanion;
import o.WebContentUtilsExternalSyntheticLambda9;
import o.cancelTimer;
import o.getActiveFocusTargetNode;
import o.getButton5EK5gGoQ;
import o.getButtonThumbLeftEK5gGoQ;
import o.getContactsEK5gGoQ;
import o.getCopyEK5gGoQ;
import o.getCutEK5gGoQ;
import o.getDeclaredMethodQuietlylambda2;
import o.getEMAIL_ADDRESS_MAX_LENGTHannotations;
import o.getF4EK5gGoQ;
import o.getLookaheadDelegate;
import o.getPositionInRoot;
import o.getPrettyPrintedStringlambda0;
import o.hasTooManyZipEntrieslambda0;
import o.isComplete;
import o.isValidPushStoryClickInputlambda1;
import o.logPurchaseWithJSONlambda1;
import o.optEnum;
import o.r8lambda1DLeNeBWPKsDsvf_XikspXtDEU;
import o.r8lambda4JvXn8cf5aij3slyZU_izDVcP_4;
import o.r8lambdaHL5lWHU1FZ6wHQzf9yToLYZXdI;
import o.r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA;
import o.r8lambdaSS2NWBeOhWqf1hnOOdz0IKozXQ;
import o.r8lambdaeBKMbUtEz9b64pfeC1hMDB8oxqM;
import o.r8lambdakcTilwmporjFCAWe8ASdQv1Ks;
import o.r8lambdan29IM8cjKN7OBDaXnvkIjDq8Rpc;
import o.r8lambdatmTe9dbjpRe9qF6mggphoyHct6s;
import o.requestPushPermissionPromptlambda3;
import o.setDateOfBirthlambda2;
import o.setResourcePackageNamelambda0;
import o.setViewportBounds;
import o.unpackZipIntoDirectory;
import okio.Okio;
import okio.Options;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class DelayedClientCall$2 implements Runnable {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;

    public DelayedClientCall$2(setViewportBounds setviewportbounds, AtomicReference atomicReference, zzr zzrVar) {
        this.IconCompatParcelizer = 5;
        this.read = atomicReference;
        this.RemoteActionCompatParcelizer = zzrVar;
        Objects.requireNonNull(setviewportbounds);
        this.serializer = setviewportbounds;
    }

    public DelayedClientCall$2(CancellableContinuationImpl cancellableContinuationImpl, RoomDatabase roomDatabase, RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1 roomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1) {
        this.IconCompatParcelizer = 1;
        this.read = cancellableContinuationImpl;
        this.RemoteActionCompatParcelizer = roomDatabase;
        this.serializer = roomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1;
    }

    public /* synthetic */ DelayedClientCall$2(Object obj, Object obj2, Object obj3, int i) {
        this.IconCompatParcelizer = i;
        this.read = obj2;
        this.RemoteActionCompatParcelizer = obj3;
        this.serializer = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        GifDrawableTransformation gifDrawableTransformation;
        r8lambda1DLeNeBWPKsDsvf_XikspXtDEU r8lambda1dlenebwpksdsvf_xikspxtdeu;
        cancelTimer canceltimer;
        Socket socketSerializer;
        AtomicReference atomicReference;
        SSLSession session = null;
        switch (this.IconCompatParcelizer) {
            case 0:
                ((WebContentUtilsExternalSyntheticLambda9) this.serializer).PlaybackStateCompat.read((MathKt) this.read, (r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA) this.RemoteActionCompatParcelizer);
                return;
            case 1:
                CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) this.read;
                try {
                    BuildersKt.serializer(cancellableContinuationImpl.MediaBrowserCompatMediaItem.minusKey(ShortNewsContentCardViewCompanion.serializer), new PausingDispatcherKt$whenStateAtLeast$2((RoomDatabase) this.RemoteActionCompatParcelizer, cancellableContinuationImpl, (RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1) this.serializer, (ShortNewsContentCardView) null, 3));
                    return;
                } catch (Throwable th) {
                    cancellableContinuationImpl.serializer(th);
                    return;
                }
            case 2:
                String str = (String) this.read;
                ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                getContactsEK5gGoQ getcontactsek5ggoq = (getContactsEK5gGoQ) this.serializer;
                if (getcontactsek5ggoq.MediaSessionCompatResultReceiverWrapper != 1) {
                    getButton5EK5gGoQ.read(getcontactsek5ggoq.write, "Unexpected state - container loading already initiated.");
                    return;
                }
                getcontactsek5ggoq.MediaSessionCompatResultReceiverWrapper = 2;
                String str2 = (String) this.RemoteActionCompatParcelizer;
                getCutEK5gGoQ getcutek5ggoq = getcontactsek5ggoq.RemoteActionCompatParcelizer;
                getCopyEK5gGoQ getcopyek5ggoq = new getCopyEK5gGoQ(getcontactsek5ggoq);
                if (!getcutek5ggoq.IconCompatParcelizer()) {
                    try {
                        getcopyek5ggoq.RemoteActionCompatParcelizer(str, false);
                        return;
                    } catch (RemoteException e) {
                        getButtonThumbLeftEK5gGoQ.IconCompatParcelizer("Error - local callback should not throw RemoteException", e);
                        return;
                    }
                }
                try {
                    getcutek5ggoq.read.RemoteActionCompatParcelizer(str, str2, null, getcopyek5ggoq);
                    return;
                } catch (RemoteException e2) {
                    getButtonThumbLeftEK5gGoQ.read("Error calling service to load container", e2);
                    try {
                        getcopyek5ggoq.RemoteActionCompatParcelizer(str, false);
                        return;
                    } catch (RemoteException e3) {
                        getButtonThumbLeftEK5gGoQ.IconCompatParcelizer("Error - local callback should not throw RemoteException", e3);
                        return;
                    }
                }
            case 3:
                EmojiProcessor emojiProcessor = (EmojiProcessor) this.serializer;
                String str3 = (String) this.read;
                getF4EK5gGoQ getf4ek5ggoq = (getF4EK5gGoQ) this.RemoteActionCompatParcelizer;
                emojiProcessor.getClass();
                ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                try {
                    File fileRemoteActionCompatParcelizer = emojiProcessor.RemoteActionCompatParcelizer(str3);
                    getf4ek5ggoq.read(EmojiProcessor.read((InputStream) getActiveFocusTargetNode.write(fileRemoteActionCompatParcelizer, new FileInputStream(fileRemoteActionCompatParcelizer))));
                    return;
                } catch (FileNotFoundException unused) {
                    getButtonThumbLeftEK5gGoQ.write("Saved resource not found: ".concat("resource_".concat(String.valueOf(str3))));
                    getf4ek5ggoq.serializer(0, 1);
                    return;
                }
            case 4:
                File fileRemoteActionCompatParcelizer2 = ((EmojiProcessor) this.serializer).RemoteActionCompatParcelizer((String) this.read);
                byte[] bArr = (byte[]) this.RemoteActionCompatParcelizer;
                try {
                    try {
                        FileOutputStream fileOutputStreamWrite = getPositionInRoot.write(new FileOutputStream(fileRemoteActionCompatParcelizer2), fileRemoteActionCompatParcelizer2);
                        try {
                            try {
                                fileOutputStreamWrite.write(bArr);
                                fileOutputStreamWrite.close();
                            } catch (IOException unused2) {
                                getButtonThumbLeftEK5gGoQ.write("Error writing resource to disk. Removing resource from disk");
                                fileRemoteActionCompatParcelizer2.delete();
                                fileOutputStreamWrite.close();
                            }
                            ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                            return;
                        } catch (Throwable th2) {
                            try {
                                fileOutputStreamWrite.close();
                                ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                                break;
                            } catch (IOException unused3) {
                                getButtonThumbLeftEK5gGoQ.write("Error closing stream for writing resource to disk");
                            }
                            throw th2;
                        }
                    } catch (FileNotFoundException unused4) {
                        getButtonThumbLeftEK5gGoQ.write("Error opening resource file for writing");
                        return;
                    }
                } catch (IOException unused5) {
                    getButtonThumbLeftEK5gGoQ.write("Error closing stream for writing resource to disk");
                    return;
                }
            case 5:
                AtomicReference atomicReference2 = (AtomicReference) this.read;
                synchronized (atomicReference2) {
                    try {
                        try {
                            setViewportBounds setviewportbounds = (setViewportBounds) this.serializer;
                            LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                            LookaheadScopeKt lookaheadScopeKt = lookaheadScopeKtLookaheadScope221.PlaybackStateCompatCustomAction;
                            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt);
                            if (lookaheadScopeKt.MediaSessionCompatResultReceiverWrapper().IconCompatParcelizer(MeasureScope.ANALYTICS_STORAGE)) {
                                isComplete iscomplete = setviewportbounds.write;
                                if (iscomplete != null) {
                                    atomicReference2.set(iscomplete.serializer((zzr) this.RemoteActionCompatParcelizer));
                                    String str4 = (String) atomicReference2.get();
                                    if (str4 != null) {
                                        NoWindowInsetsAnimation noWindowInsetsAnimation = ((LookaheadScopeKtLookaheadScope221) setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ComponentActivity;
                                        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                        noWindowInsetsAnimation.MediaMetadataCompat.set(str4);
                                        LookaheadScopeKt lookaheadScopeKt2 = lookaheadScopeKtLookaheadScope221.PlaybackStateCompatCustomAction;
                                        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt2);
                                        lookaheadScopeKt2.RemoteActionCompatParcelizer.IconCompatParcelizer(str4);
                                    }
                                    setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                                    atomicReference = (AtomicReference) this.read;
                                    atomicReference.notify();
                                    return;
                                }
                                getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                getlookaheaddelegate.serializer.RemoteActionCompatParcelizer("Failed to get app instance id");
                            } else {
                                getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                                getlookaheaddelegate2.RatingCompat.RemoteActionCompatParcelizer("Analytics storage consent denied; will not get app instance id");
                                NoWindowInsetsAnimation noWindowInsetsAnimation2 = ((LookaheadScopeKtLookaheadScope221) setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ComponentActivity;
                                LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation2);
                                noWindowInsetsAnimation2.MediaMetadataCompat.set(null);
                                LookaheadScopeKt lookaheadScopeKt3 = lookaheadScopeKtLookaheadScope221.PlaybackStateCompatCustomAction;
                                LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt3);
                                lookaheadScopeKt3.RemoteActionCompatParcelizer.IconCompatParcelizer(null);
                                atomicReference2.set(null);
                            }
                            atomicReference2.notify();
                            return;
                        } catch (Throwable th3) {
                            ((AtomicReference) this.read).notify();
                            throw th3;
                        }
                    } catch (RemoteException e4) {
                        getLookaheadDelegate getlookaheaddelegate3 = ((LookaheadScopeKtLookaheadScope221) ((setViewportBounds) this.serializer).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                        getlookaheaddelegate3.serializer.serializer(e4, "Failed to get app instance id");
                        atomicReference = (AtomicReference) this.read;
                    }
                }
                break;
            case 6:
                ((getEMAIL_ADDRESS_MAX_LENGTHannotations) this.serializer).read.serializer((Status) this.read, (r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA) this.RemoteActionCompatParcelizer);
                return;
            case 7:
                setResourcePackageNamelambda0 setresourcepackagenamelambda0 = (setResourcePackageNamelambda0) this.RemoteActionCompatParcelizer;
                requestPushPermissionPromptlambda3 requestpushpermissionpromptlambda3 = (requestPushPermissionPromptlambda3) this.read;
                unpackZipIntoDirectory unpackzipintodirectory = (unpackZipIntoDirectory) this.serializer;
                hasTooManyZipEntrieslambda0 hastoomanyzipentrieslambda0 = unpackzipintodirectory.serializer;
                if (unpackzipintodirectory != hastoomanyzipentrieslambda0.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) {
                    return;
                }
                hastoomanyzipentrieslambda0.addOnConfigurationChangedListener = requestpushpermissionpromptlambda3;
                hastoomanyzipentrieslambda0.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.write(requestpushpermissionpromptlambda3);
                if (setresourcepackagenamelambda0 != setResourcePackageNamelambda0.SHUTDOWN) {
                    unpackzipintodirectory.serializer.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer(optEnum.INFO, "Entering {0} state with picker: {1}", setresourcepackagenamelambda0, requestpushpermissionpromptlambda3);
                    unpackzipintodirectory.serializer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.RemoteActionCompatParcelizer(setresourcepackagenamelambda0);
                    return;
                }
                return;
            default:
                try {
                    ((CountDownLatch) this.read).await();
                } catch (InterruptedException unused6) {
                    Thread.currentThread().interrupt();
                }
                GifDrawableTransformation gifDrawableTransformation2 = new GifDrawableTransformation(new r8lambdaHL5lWHU1FZ6wHQzf9yToLYZXdI());
                try {
                    try {
                        r8lambda1DLeNeBWPKsDsvf_XikspXtDEU r8lambda1dlenebwpksdsvf_xikspxtdeu2 = (r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) this.serializer;
                        r8lambdaeBKMbUtEz9b64pfeC1hMDB8oxqM r8lambdaebkmbutez9b64pfec1hmdb8oxqm = r8lambda1dlenebwpksdsvf_xikspxtdeu2.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
                        if (r8lambdaebkmbutez9b64pfec1hmdb8oxqm == null) {
                            socketSerializer = r8lambda1dlenebwpksdsvf_xikspxtdeu2._init_lambda4.createSocket(r8lambda1dlenebwpksdsvf_xikspxtdeu2.write.getAddress(), ((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) this.serializer).write.getPort());
                        } else {
                            SocketAddress socketAddress = r8lambdaebkmbutez9b64pfec1hmdb8oxqm.read;
                            if (!(socketAddress instanceof InetSocketAddress)) {
                                throw new StatusException(Status.write.IconCompatParcelizer("Unsupported SocketAddress implementation " + ((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) this.serializer).r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.read.getClass()));
                            }
                            socketSerializer = r8lambda1DLeNeBWPKsDsvf_XikspXtDEU.serializer(r8lambda1dlenebwpksdsvf_xikspxtdeu2, r8lambdaebkmbutez9b64pfec1hmdb8oxqm.IconCompatParcelizer, (InetSocketAddress) socketAddress, r8lambdaebkmbutez9b64pfec1hmdb8oxqm.RemoteActionCompatParcelizer, r8lambdaebkmbutez9b64pfec1hmdb8oxqm.serializer);
                        }
                        r8lambda1DLeNeBWPKsDsvf_XikspXtDEU r8lambda1dlenebwpksdsvf_xikspxtdeu3 = (r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) this.serializer;
                        SSLSocketFactory sSLSocketFactory = r8lambda1dlenebwpksdsvf_xikspxtdeu3.addObserverForBackInvokerlambda0;
                        Socket socket = socketSerializer;
                        if (sSLSocketFactory != null) {
                            String host = r8lambda1dlenebwpksdsvf_xikspxtdeu3.RatingCompat;
                            URI uriWrite = r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.write(host);
                            if (uriWrite.getHost() != null) {
                                host = uriWrite.getHost();
                            }
                            SSLSocket sSLSocketWrite = r8lambdaSS2NWBeOhWqf1hnOOdz0IKozXQ.write(sSLSocketFactory, socketSerializer, host, ((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) this.serializer).IconCompatParcelizer(), ((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) this.serializer).MediaBrowserCompatMediaItem);
                            session = sSLSocketWrite.getSession();
                            socket = sSLSocketWrite;
                        }
                        socket.setTcpNoDelay(true);
                        gifDrawableTransformation = new GifDrawableTransformation(Okio.IconCompatParcelizer(socket));
                        try {
                            ((logPurchaseWithJSONlambda1) this.RemoteActionCompatParcelizer).read(Okio.serializer(socket), socket);
                            r8lambda1DLeNeBWPKsDsvf_XikspXtDEU r8lambda1dlenebwpksdsvf_xikspxtdeu4 = (r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) this.serializer;
                            getPrettyPrintedStringlambda0 getprettyprintedstringlambda0 = r8lambda1dlenebwpksdsvf_xikspxtdeu4.IconCompatParcelizer;
                            getprettyprintedstringlambda0.getClass();
                            OkHttpCall$1 okHttpCall$1 = new OkHttpCall$1(getprettyprintedstringlambda0);
                            okHttpCall$1.write(r8lambdan29IM8cjKN7OBDaXnvkIjDq8Rpc.write, socket.getRemoteSocketAddress());
                            okHttpCall$1.write(r8lambdan29IM8cjKN7OBDaXnvkIjDq8Rpc.RemoteActionCompatParcelizer, socket.getLocalSocketAddress());
                            okHttpCall$1.write(r8lambdan29IM8cjKN7OBDaXnvkIjDq8Rpc.serializer, session);
                            okHttpCall$1.write(isValidPushStoryClickInputlambda1.serializer, session == null ? getDeclaredMethodQuietlylambda2.NONE : getDeclaredMethodQuietlylambda2.PRIVACY_AND_INTEGRITY);
                            r8lambda1dlenebwpksdsvf_xikspxtdeu4.IconCompatParcelizer = okHttpCall$1.read();
                            r8lambda1DLeNeBWPKsDsvf_XikspXtDEU r8lambda1dlenebwpksdsvf_xikspxtdeu5 = (r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) this.serializer;
                            r8lambda1dlenebwpksdsvf_xikspxtdeu5.fullyDrawnReporter_delegatelambda0.getClass();
                            r8lambda1dlenebwpksdsvf_xikspxtdeu5.RemoteActionCompatParcelizer = new cancelTimer(r8lambda1dlenebwpksdsvf_xikspxtdeu5, new setDateOfBirthlambda2(gifDrawableTransformation));
                            synchronized (((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) this.serializer).r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) {
                                if (session != null) {
                                    new r8lambdakcTilwmporjFCAWe8ASdQv1Ks(session);
                                }
                                break;
                            }
                            return;
                        } catch (StatusException e5) {
                            e = e5;
                            gifDrawableTransformation2 = gifDrawableTransformation;
                            ((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) this.serializer).IconCompatParcelizer(0, r8lambdatmTe9dbjpRe9qF6mggphoyHct6s.INTERNAL_ERROR, e.RemoteActionCompatParcelizer);
                            r8lambda1dlenebwpksdsvf_xikspxtdeu = (r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) this.serializer;
                            r8lambda1dlenebwpksdsvf_xikspxtdeu.fullyDrawnReporter_delegatelambda0.getClass();
                            canceltimer = new cancelTimer(r8lambda1dlenebwpksdsvf_xikspxtdeu, new setDateOfBirthlambda2(gifDrawableTransformation2));
                            r8lambda1dlenebwpksdsvf_xikspxtdeu.RemoteActionCompatParcelizer = canceltimer;
                            return;
                        } catch (Exception e6) {
                            e = e6;
                            gifDrawableTransformation2 = gifDrawableTransformation;
                            ((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) this.serializer).IconCompatParcelizer(e);
                            r8lambda1dlenebwpksdsvf_xikspxtdeu = (r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) this.serializer;
                            r8lambda1dlenebwpksdsvf_xikspxtdeu.fullyDrawnReporter_delegatelambda0.getClass();
                            canceltimer = new cancelTimer(r8lambda1dlenebwpksdsvf_xikspxtdeu, new setDateOfBirthlambda2(gifDrawableTransformation2));
                            r8lambda1dlenebwpksdsvf_xikspxtdeu.RemoteActionCompatParcelizer = canceltimer;
                            return;
                        } catch (Throwable th4) {
                            th = th4;
                            r8lambda1DLeNeBWPKsDsvf_XikspXtDEU r8lambda1dlenebwpksdsvf_xikspxtdeu6 = (r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) this.serializer;
                            r8lambda1dlenebwpksdsvf_xikspxtdeu6.fullyDrawnReporter_delegatelambda0.getClass();
                            r8lambda1dlenebwpksdsvf_xikspxtdeu6.RemoteActionCompatParcelizer = new cancelTimer(r8lambda1dlenebwpksdsvf_xikspxtdeu6, new setDateOfBirthlambda2(gifDrawableTransformation));
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        gifDrawableTransformation = gifDrawableTransformation2;
                    }
                } catch (StatusException e7) {
                    e = e7;
                } catch (Exception e8) {
                    e = e8;
                }
                break;
        }
    }
}
