package io.socket.emitter;

import android.app.PendingIntent;
import android.media.MediaCodecInfo;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import androidx.compose.ui.graphics.Fields;
import com.huawei.location.router.interfaces.IRouterCallback;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import o.WindowRecomposerFactoryCompanion;
import o.WrappedCompositionsetContent1211;
import o.getContentCardUpdateHandler;
import o.getContentCardsViewBindingHandler;
import o.getNamedInt;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Emitter {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final Object ComponentActivity;

    public abstract Emitter h_();

    public abstract String i_();

    public Emitter(int i) {
        if (i == 2) {
            this.ComponentActivity = new getNamedInt();
        } else if (i != 3) {
            this.ComponentActivity = new ConcurrentHashMap();
        } else {
            this.ComponentActivity = new CopyOnWriteArrayList();
        }
    }

    public void serializer(String str, getContentCardsViewBindingHandler getcontentcardsviewbindinghandler) {
        int i = 2 % 2;
        read(str, new getContentCardUpdateHandler(this, str, getcontentcardsviewbindinghandler));
        int i2 = write + 33;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public void read(String str, getContentCardsViewBindingHandler getcontentcardsviewbindinghandler) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 33;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.ComponentActivity;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) concurrentHashMap.get(str);
        if (concurrentLinkedQueue == null) {
            concurrentLinkedQueue = new ConcurrentLinkedQueue();
            ConcurrentLinkedQueue concurrentLinkedQueue2 = (ConcurrentLinkedQueue) concurrentHashMap.putIfAbsent(str, concurrentLinkedQueue);
            if (concurrentLinkedQueue2 != null) {
                int i4 = IconCompatParcelizer + 57;
                int i5 = i4 % Fields.SpotShadowColor;
                write = i5;
                if (i4 % 2 == 0) {
                    throw null;
                }
                int i6 = i5 + 85;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                concurrentLinkedQueue = concurrentLinkedQueue2;
            }
        }
        concurrentLinkedQueue.add(getcontentcardsviewbindinghandler);
    }

    public Emitter write(String str, Object... objArr) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 11;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) ((ConcurrentHashMap) this.ComponentActivity).get(str);
        if (concurrentLinkedQueue != null) {
            int i4 = write + 61;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            Iterator it = concurrentLinkedQueue.iterator();
            while (!(!it.hasNext())) {
                ((getContentCardsViewBindingHandler) it.next()).RemoteActionCompatParcelizer(objArr);
                int i6 = write + 23;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
            }
        }
        return this;
    }

    public Emitter(String str) {
        this.ComponentActivity = str;
    }

    public Emitter(MediaCodecInfo mediaCodecInfo, String str) throws InvalidConfigException {
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            Objects.requireNonNull(capabilitiesForType);
            this.ComponentActivity = capabilitiesForType;
        } catch (RuntimeException e) {
            throw new InvalidConfigException(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Unable to get CodecCapabilities for mime: ", str), e);
        }
    }

    public void RemoteActionCompatParcelizer(String str, getContentCardsViewBindingHandler getcontentcardsviewbindinghandler) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 95;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) ((ConcurrentHashMap) this.ComponentActivity).get(str);
        if (concurrentLinkedQueue != null) {
            Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                getContentCardsViewBindingHandler getcontentcardsviewbindinghandler2 = (getContentCardsViewBindingHandler) it.next();
                if (getcontentcardsviewbindinghandler.equals(getcontentcardsviewbindinghandler2)) {
                    int i4 = write + 63;
                    IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                } else if (!(getcontentcardsviewbindinghandler2 instanceof getContentCardUpdateHandler) || !getcontentcardsviewbindinghandler.equals(((getContentCardUpdateHandler) getcontentcardsviewbindinghandler2).serializer)) {
                }
                int i6 = IconCompatParcelizer + 93;
                write = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                it.remove();
                return;
            }
        }
    }

    public void RemoteActionCompatParcelizer(WindowRecomposerFactoryCompanion windowRecomposerFactoryCompanion) {
        int i = 2 % 2;
        String strI_ = i_();
        StringBuilder sb = new StringBuilder("removeCallback callBackInfoList size is ");
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.ComponentActivity;
        sb.append(copyOnWriteArrayList.size());
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(strI_, sb.toString());
        if (copyOnWriteArrayList.isEmpty()) {
            int i2 = IconCompatParcelizer + 45;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            int i4 = write + 21;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                boolean z = it.next() instanceof WindowRecomposerFactoryCompanion;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object next = it.next();
            if (next instanceof WindowRecomposerFactoryCompanion) {
                WindowRecomposerFactoryCompanion windowRecomposerFactoryCompanion2 = (WindowRecomposerFactoryCompanion) next;
                if (windowRecomposerFactoryCompanion2.equals(windowRecomposerFactoryCompanion)) {
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(i_(), "removeCallback true");
                    copyOnWriteArrayList.remove(windowRecomposerFactoryCompanion2);
                    break;
                }
            }
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(i_(), "removeCallback end callBackInfoList size is " + copyOnWriteArrayList.size());
    }

    public WindowRecomposerFactoryCompanion RemoteActionCompatParcelizer(PendingIntent pendingIntent) {
        int i = 2 % 2;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.ComponentActivity;
        if (!copyOnWriteArrayList.isEmpty()) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (!(!it.hasNext())) {
                WindowRecomposerFactoryCompanion windowRecomposerFactoryCompanion = (WindowRecomposerFactoryCompanion) it.next();
                PendingIntent pendingIntent2 = windowRecomposerFactoryCompanion.write;
                if (pendingIntent2 != null && !(true ^ pendingIntent2.equals(pendingIntent))) {
                    int i2 = write + 25;
                    IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(i_(), "getInfoFromPendingIntent equals is true");
                    int i4 = IconCompatParcelizer + 59;
                    write = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 != 0) {
                        return windowRecomposerFactoryCompanion;
                    }
                    throw null;
                }
            }
        }
        return null;
    }

    public WindowRecomposerFactoryCompanion read(IRouterCallback iRouterCallback) {
        int i = 2 % 2;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.ComponentActivity;
        Object obj = null;
        if (copyOnWriteArrayList.isEmpty()) {
            int i2 = write + 97;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else {
            Iterator it = copyOnWriteArrayList.iterator();
            while (!(!it.hasNext())) {
                int i4 = IconCompatParcelizer + 51;
                write = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    IRouterCallback iRouterCallback2 = ((WindowRecomposerFactoryCompanion) it.next()).serializer;
                    obj.hashCode();
                    throw null;
                }
                WindowRecomposerFactoryCompanion windowRecomposerFactoryCompanion = (WindowRecomposerFactoryCompanion) it.next();
                IRouterCallback iRouterCallback3 = windowRecomposerFactoryCompanion.serializer;
                if (iRouterCallback3 != null && iRouterCallback3.equals(iRouterCallback)) {
                    int i5 = IconCompatParcelizer + 37;
                    write = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(i_(), "getInfoFromRouterCallback equals is true");
                        return windowRecomposerFactoryCompanion;
                    }
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(i_(), "getInfoFromRouterCallback equals is true");
                    obj.hashCode();
                    throw null;
                }
            }
        }
        return null;
    }

    public void IconCompatParcelizer(WindowRecomposerFactoryCompanion windowRecomposerFactoryCompanion) {
        int i = 2 % 2;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.ComponentActivity;
        if (windowRecomposerFactoryCompanion == null) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(i_(), "setCallBackInfo, null == locationCallBackInfo ");
            return;
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(i_(), "setCallBackInfo callBackInfoList size is " + copyOnWriteArrayList.size());
        Object obj = null;
        if (copyOnWriteArrayList.isEmpty()) {
            int i2 = write + 105;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                copyOnWriteArrayList.add(windowRecomposerFactoryCompanion);
                return;
            } else {
                copyOnWriteArrayList.add(windowRecomposerFactoryCompanion);
                obj.hashCode();
                throw null;
            }
        }
        if (!copyOnWriteArrayList.isEmpty()) {
            for (int i3 = 0; i3 < copyOnWriteArrayList.size(); i3++) {
                int i4 = IconCompatParcelizer + 15;
                write = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    ((WindowRecomposerFactoryCompanion) copyOnWriteArrayList.get(i3)).equals(windowRecomposerFactoryCompanion);
                    obj.hashCode();
                    throw null;
                }
                if (((WindowRecomposerFactoryCompanion) copyOnWriteArrayList.get(i3)).equals(windowRecomposerFactoryCompanion)) {
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(i_(), "setCallBackInfo, update");
                    int i5 = write + 23;
                    IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    return;
                }
            }
        }
        copyOnWriteArrayList.add(windowRecomposerFactoryCompanion);
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(i_(), "setCallBackInfo end callBackInfoList size is " + copyOnWriteArrayList.size());
    }

    public getNamedInt RatingCompat() {
        int i = 2 % 2;
        getNamedInt getnamedint = (getNamedInt) this.ComponentActivity;
        int i2 = getnamedint.ResultReceiver;
        int[] iArr = getnamedint.MediaMetadataCompat;
        if (i2 != 1) {
            int i3 = IconCompatParcelizer + 11;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = getnamedint.serializer;
            iArr[0] = i5;
            int i6 = getnamedint.ParcelableVolumeInfo;
            iArr[1] = i6;
            iArr[2] = i6;
            iArr[3] = i5;
        } else {
            int i7 = getnamedint.ParcelableVolumeInfo;
            iArr[0] = i7;
            iArr[1] = i7;
            int i8 = getnamedint.serializer;
            iArr[2] = i8;
            iArr[3] = i8;
            int i9 = IconCompatParcelizer + 125;
            write = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
        }
        float[] fArr = getnamedint.PlaybackStateCompatCustomAction;
        if (i2 == 1) {
            fArr[0] = 0.0f;
            fArr[1] = Math.min(getnamedint.PlaybackStateCompat, 1.0f);
            fArr[2] = Math.min(getnamedint.PlaybackStateCompat + getnamedint.MediaDescriptionCompat, 1.0f);
            fArr[3] = 1.0f;
            return getnamedint;
        }
        fArr[0] = Math.max(((1.0f - getnamedint.PlaybackStateCompat) - getnamedint.MediaDescriptionCompat) / 2.0f, 0.0f);
        fArr[1] = Math.max(((1.0f - getnamedint.PlaybackStateCompat) - 0.001f) / 2.0f, 0.0f);
        fArr[2] = Math.min(((getnamedint.PlaybackStateCompat + 1.0f) + 0.001f) / 2.0f, 1.0f);
        fArr[3] = Math.min(((getnamedint.PlaybackStateCompat + 1.0f) + getnamedint.MediaDescriptionCompat) / 2.0f, 1.0f);
        return getnamedint;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f3, code lost:
    
        if (r8 >= 1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0101, code lost:
    
        if (r14 >= 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0103, code lost:
    
        r3.ComponentActivity = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0106, code lost:
    
        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(bo.app.af$$ExternalSyntheticOutline0.m(r8, "Given a negative repeat delay: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x010f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01e3, code lost:
    
        if (r4 >= 1.0f) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01f0, code lost:
    
        if (r4 >= 0.0f) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01f2, code lost:
    
        r3.PlaybackStateCompat = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01f5, code lost:
    
        com.google.protobuf.FieldType$$ExternalSyntheticBUOutline0.read(r4, "Given invalid intensity value: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01fa, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public io.socket.emitter.Emitter RemoteActionCompatParcelizer(android.content.res.TypedArray r18) {
        /*
            Method dump skipped, instruction units count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.socket.emitter.Emitter.RemoteActionCompatParcelizer(android.content.res.TypedArray):io.socket.emitter.Emitter");
    }
}
