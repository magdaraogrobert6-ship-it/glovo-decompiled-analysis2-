package o;

import android.app.Application;
import android.content.SharedPreferences;
import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda1;
import io.sentry.Sentry$$ExternalSyntheticLambda5;
import java.io.FileNotFoundException;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public class r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI implements accessgetNumPadRightParenthesiscp, getNavigateInEK5gGoQ {
    public final /* synthetic */ int IconCompatParcelizer;
    public boolean RemoteActionCompatParcelizer;
    public Object read;
    public Object serializer;
    public Object write;

    public boolean IconCompatParcelizer(String str, String str2) {
        synchronized (this) {
            if (!((invalidateIntrinsicsParent) ((AtomicMarkableReference) this.write).getReference()).serializer(str, str2)) {
                return false;
            }
            AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) this.write;
            atomicMarkableReference.set((invalidateIntrinsicsParent) atomicMarkableReference.getReference(), true);
            MediaDescriptionCompat();
            return true;
        }
    }

    @Override // o.getNavigateInEK5gGoQ
    public void IconCompatParcelizer() {
        accessgetNumPadEntercp accessgetnumpadentercp;
        synchronized (this) {
            this.RemoteActionCompatParcelizer = false;
            accessgetnumpadentercp = (accessgetNumPadEntercp) ((scale0AR0LA0default) this.serializer).RemoteActionCompatParcelizer;
        }
        if (accessgetnumpadentercp != null) {
            ((getMediaStopEK5gGoQ) this.read).write(accessgetnumpadentercp, 2441);
        }
    }

    public void IconCompatParcelizer(String str) {
        SharedPreferences.Editor editorEdit = ((LookaheadScopeKt) this.serializer).serializer().edit();
        editorEdit.putString((String) this.read, str);
        editorEdit.apply();
        this.write = str;
    }

    public void MediaMetadataCompat() {
        r8lambdaMkSjJB1nMG37oUW_yupQha4 r8lambdamksjjb1nmg37ouw_yupqha4 = (r8lambdaMkSjJB1nMG37oUW_yupQha4) this.read;
        synchronized (r8lambdamksjjb1nmg37ouw_yupqha4) {
            if (this.RemoteActionCompatParcelizer) {
                throw new IllegalStateException("Check failed.");
            }
            Object[] objArr = {((r8lambdamrRUyRDhX_6xLfo9jIAfF753450) this.write).IconCompatParcelizer, this};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                r8lambdamksjjb1nmg37ouw_yupqha4.read(this, true);
            }
            this.RemoteActionCompatParcelizer = true;
        }
    }

    public void MediaSessionCompatQueueItem() {
        r8lambdamrRUyRDhX_6xLfo9jIAfF753450 r8lambdamrruyrdhx_6xlfo9jiaff753450 = (r8lambdamrRUyRDhX_6xLfo9jIAfF753450) this.write;
        Object[] objArr = {r8lambdamrruyrdhx_6xlfo9jiaff753450.IconCompatParcelizer, this};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            r8lambdaMkSjJB1nMG37oUW_yupQha4 r8lambdamksjjb1nmg37ouw_yupqha4 = (r8lambdaMkSjJB1nMG37oUW_yupQha4) this.read;
            if (r8lambdamksjjb1nmg37ouw_yupqha4.civilizedFileSystem) {
                r8lambdamksjjb1nmg37ouw_yupqha4.read(this, false);
            } else {
                r8lambdamrruyrdhx_6xlfo9jiaff753450.MediaMetadataCompat = true;
            }
        }
    }

    public setRotationY RemoteActionCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer && ((setFrom58bKbWc) this.serializer).read.MediaSessionCompatQueueItem) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Cannot set backoff criteria on an idle mode job");
            return null;
        }
        setRotationY setrotationy = new setRotationY((UUID) this.write, (setFrom58bKbWc) this.serializer, (LinkedHashSet) this.read);
        toolingGraphicsLayer toolinggraphicslayer = ((setFrom58bKbWc) this.serializer).read;
        boolean z = !toolinggraphicslayer.write.isEmpty() || toolinggraphicslayer.RatingCompat || toolinggraphicslayer.MediaMetadataCompat || toolinggraphicslayer.MediaSessionCompatQueueItem;
        setFrom58bKbWc setfrom58bkbwc = (setFrom58bKbWc) this.serializer;
        if (setfrom58bkbwc.MediaBrowserCompatMediaItem) {
            if (z) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Expedited jobs only support network and storage constraints");
                return null;
            }
            if (setfrom58bkbwc.MediaSessionCompatQueueItem > 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Expedited jobs cannot be delayed");
                return null;
            }
        }
        String str = setfrom58bkbwc.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        if (str == null) {
            List listSerializer = hideCurrentlyDisplayingInAppMessage.serializer(setfrom58bkbwc.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28, new String[]{"."}, 6);
            String strWrite = listSerializer.size() == 1 ? (String) listSerializer.get(0) : (String) onContentCardDismissed.MediaDescriptionCompat(listSerializer);
            if (strWrite.length() > 127) {
                strWrite = hideCurrentlyDisplayingInAppMessage.write(127, strWrite);
            }
            setfrom58bkbwc.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = strWrite;
        } else if (str.length() > 127) {
            ((setFrom58bKbWc) this.serializer).r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = hideCurrentlyDisplayingInAppMessage.write(127, str);
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        this.write = uuidRandomUUID;
        String string = uuidRandomUUID.toString();
        string.getClass();
        setFrom58bKbWc setfrom58bkbwc2 = (setFrom58bKbWc) this.serializer;
        setfrom58bkbwc2.getClass();
        this.serializer = new setFrom58bKbWc(string, setfrom58bkbwc2.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, setfrom58bkbwc2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28, setfrom58bkbwc2.MediaSessionCompatResultReceiverWrapper, new accessgetAmbientShadowColor0d7_KjUjd(setfrom58bkbwc2.MediaSessionCompatToken), new accessgetAmbientShadowColor0d7_KjUjd(setfrom58bkbwc2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY), setfrom58bkbwc2.MediaSessionCompatQueueItem, setfrom58bkbwc2.PlaybackStateCompat, setfrom58bkbwc2.MediaMetadataCompat, new toolingGraphicsLayer(setfrom58bkbwc2.read), setfrom58bkbwc2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg, setfrom58bkbwc2.write, setfrom58bkbwc2.serializer, setfrom58bkbwc2.ParcelableVolumeInfo, setfrom58bkbwc2.PlaybackStateCompatCustomAction, setfrom58bkbwc2.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, setfrom58bkbwc2.MediaBrowserCompatMediaItem, setfrom58bkbwc2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, setfrom58bkbwc2.ComponentActivity, setfrom58bkbwc2.ResultReceiver, setfrom58bkbwc2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, setfrom58bkbwc2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss, setfrom58bkbwc2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, setfrom58bkbwc2.IconCompatParcelizer, androidx.compose.ui.graphics.Fields.BlendMode);
        return setrotationy;
    }

    public void read() {
        r8lambdaMkSjJB1nMG37oUW_yupQha4 r8lambdamksjjb1nmg37ouw_yupqha4 = (r8lambdaMkSjJB1nMG37oUW_yupQha4) this.read;
        synchronized (r8lambdamksjjb1nmg37ouw_yupqha4) {
            if (this.RemoteActionCompatParcelizer) {
                throw new IllegalStateException("Check failed.");
            }
            Object[] objArr = {((r8lambdamrRUyRDhX_6xLfo9jIAfF753450) this.write).IconCompatParcelizer, this};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                r8lambdamksjjb1nmg37ouw_yupqha4.read(this, false);
            }
            this.RemoteActionCompatParcelizer = true;
        }
    }

    public DateTimeConverter serializer(int i) {
        r8lambdaMkSjJB1nMG37oUW_yupQha4 r8lambdamksjjb1nmg37ouw_yupqha4 = (r8lambdaMkSjJB1nMG37oUW_yupQha4) this.read;
        synchronized (r8lambdamksjjb1nmg37ouw_yupqha4) {
            if (this.RemoteActionCompatParcelizer) {
                throw new IllegalStateException("Check failed.");
            }
            Object[] objArr = {((r8lambdamrRUyRDhX_6xLfo9jIAfF753450) this.write).IconCompatParcelizer, this};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return new setImageViewToUrl();
            }
            if (!((r8lambdamrRUyRDhX_6xLfo9jIAfF753450) this.write).MediaSessionCompatQueueItem) {
                boolean[] zArr = (boolean[]) this.serializer;
                zArr.getClass();
                zArr[i] = true;
            }
            RecyclableBufferedInputStream recyclableBufferedInputStream = (RecyclableBufferedInputStream) ((r8lambdamrRUyRDhX_6xLfo9jIAfF753450) this.write).RemoteActionCompatParcelizer.get(i);
            try {
                onCreateWindowlambda4 oncreatewindowlambda4 = r8lambdamksjjb1nmg37ouw_yupqha4.fileSystem;
                oncreatewindowlambda4.getClass();
                recyclableBufferedInputStream.getClass();
                return new r8lambdanR6s9bpMqHHF1KzKTWIbxoSaF7s(oncreatewindowlambda4.write(recyclableBufferedInputStream, false), new TncContentKt$$ExternalSyntheticLambda1(r8lambdamksjjb1nmg37ouw_yupqha4, 25, this));
            } catch (FileNotFoundException unused) {
                return new setImageViewToUrl();
            }
        }
    }

    public void serializer() {
        Iterator it = ((List) this.read).iterator();
        while (it.hasNext()) {
            ((BlurFilter) this.serializer).RemoteActionCompatParcelizer((String) it.next());
        }
    }

    @Override // o.accessgetNumPadRightParenthesiscp
    public void serializer(Object obj, Object obj2) {
        accessgetNumPadEntercp accessgetnumpadentercp;
        boolean z;
        zzdz zzdzVar = (zzdz) obj;
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = (ParentDataModifierDefaultImpls) obj2;
        synchronized (this) {
            accessgetnumpadentercp = (accessgetNumPadEntercp) ((scale0AR0LA0default) this.serializer).RemoteActionCompatParcelizer;
            z = this.RemoteActionCompatParcelizer;
            ((scale0AR0LA0default) this.serializer).RemoteActionCompatParcelizer = null;
        }
        if (accessgetnumpadentercp == null) {
            parentDataModifierDefaultImpls.IconCompatParcelizer(Boolean.FALSE);
        } else {
            ((getMediaStepBackwardEK5gGoQ) this.write).RemoteActionCompatParcelizer(zzdzVar, accessgetnumpadentercp, z, parentDataModifierDefaultImpls);
        }
    }

    public r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(Class cls) {
        this.IconCompatParcelizer = 2;
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        this.write = uuidRandomUUID;
        String string = uuidRandomUUID.toString();
        string.getClass();
        this.serializer = new setFrom58bKbWc(string, (setTranslationX) null, cls.getName(), (String) null, (accessgetAmbientShadowColor0d7_KjUjd) null, (accessgetAmbientShadowColor0d7_KjUjd) null, 0L, 0L, 0L, (toolingGraphicsLayer) null, 0, (GraphicsLayerScope) null, 0L, 0L, 0L, 0L, false, (setRotationZ) null, 0, 0L, 0, 0, (String) null, (Boolean) null, 33554426);
        String[] strArr = {cls.getName()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(onMove.RemoteActionCompatParcelizer(1));
        onContentCardClicked.read((Object[]) strArr, (AbstractSet) linkedHashSet);
        this.read = linkedHashSet;
    }

    public r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI read(GraphicsLayerScope graphicsLayerScope, long j) {
        graphicsLayerScope.getClass();
        TimeUnit.MILLISECONDS.getClass();
        this.RemoteActionCompatParcelizer = true;
        setFrom58bKbWc setfrom58bkbwc = (setFrom58bKbWc) this.serializer;
        setfrom58bkbwc.write = graphicsLayerScope;
        String str = setFrom58bKbWc.RemoteActionCompatParcelizer;
        if (j > 18000000) {
            setRotationX.read().IconCompatParcelizer(str, "Backoff delay duration exceeds maximum value");
        }
        if (j < DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) {
            setRotationX.read().IconCompatParcelizer(str, "Backoff delay duration less than minimum value");
        }
        setfrom58bkbwc.serializer = RangesKt.IconCompatParcelizer(j, DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, 18000000L);
        return this;
    }

    public r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI serializer(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        ((setFrom58bKbWc) this.serializer).MediaSessionCompatQueueItem = timeUnit.toMillis(j);
        if (Long.MAX_VALUE - System.currentTimeMillis() > ((setFrom58bKbWc) this.serializer).MediaSessionCompatQueueItem) {
            return this;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("The given initial delay is too large and will cause an overflow!");
        return null;
    }

    public void MediaDescriptionCompat() {
        Sentry$$ExternalSyntheticLambda5 sentry$$ExternalSyntheticLambda5 = new Sentry$$ExternalSyntheticLambda5(8, this);
        AtomicReference atomicReference = (AtomicReference) this.serializer;
        while (!atomicReference.compareAndSet(null, sentry$$ExternalSyntheticLambda5)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        ((CrashlyticsWorkers) ((androidx.work.impl.WorkerWrapper.Builder) this.read).MediaSessionCompatQueueItem).write.serializer(sentry$$ExternalSyntheticLambda5);
    }

    public void read(r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, String str, Throwable th, int i) {
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m(str);
        if (((String) this.read).length() > 0) {
            sbM.append("clientId: ");
            sbM.append((String) this.read);
        }
        if (((String) this.write).length() > 0) {
            sbM.append("sessionId: ");
            sbM.append((String) this.write);
        }
        String string = sbM.toString();
        Iterator it = ((ArrayList) this.serializer).iterator();
        while (it.hasNext()) {
            ((getDefaultWidthD9Ej5fM) it.next()).write.invoke(string, th, Integer.valueOf(i));
        }
        if (this.RemoteActionCompatParcelizer) {
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke("Perseus", string, th);
        }
    }

    public void IconCompatParcelizer(Object obj, String str) {
        androidx.emoji2.text.EmojiProcessor emojiProcessor = new androidx.emoji2.text.EmojiProcessor(26, false);
        ((androidx.emoji2.text.EmojiProcessor) this.serializer).IconCompatParcelizer = emojiProcessor;
        this.serializer = emojiProcessor;
        emojiProcessor.read = obj;
        emojiProcessor.serializer = str;
    }

    public String RatingCompat() {
        if (!this.RemoteActionCompatParcelizer) {
            this.RemoteActionCompatParcelizer = true;
            LookaheadScopeKt lookaheadScopeKt = (LookaheadScopeKt) this.serializer;
            this.write = lookaheadScopeKt.serializer().getString((String) this.read, null);
        }
        return (String) this.write;
    }

    public void serializer(String str, String str2) {
        visitSubtreeYYKmho visitsubtreeyykmho = new visitSubtreeYYKmho(26, false);
        ((androidx.emoji2.text.EmojiProcessor) this.serializer).IconCompatParcelizer = visitsubtreeyykmho;
        this.serializer = visitsubtreeyykmho;
        visitsubtreeyykmho.read = str2;
        visitsubtreeyykmho.serializer = str;
    }

    public String toString() {
        if (this.IconCompatParcelizer != 8) {
            return super.toString();
        }
        boolean z = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder(32);
        sb.append((String) this.read);
        sb.append('{');
        String str = "";
        for (androidx.emoji2.text.EmojiProcessor emojiProcessor = (androidx.emoji2.text.EmojiProcessor) ((androidx.emoji2.text.EmojiProcessor) this.write).IconCompatParcelizer; emojiProcessor != null; emojiProcessor = (androidx.emoji2.text.EmojiProcessor) emojiProcessor.IconCompatParcelizer) {
            Object obj = emojiProcessor.read;
            if ((emojiProcessor instanceof visitSubtreeYYKmho) || obj != null || !z) {
                sb.append(str);
                String str2 = (String) emojiProcessor.serializer;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb.append(obj);
                } else {
                    String strDeepToString = Arrays.deepToString(new Object[]{obj});
                    sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                }
                str = ", ";
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public void IconCompatParcelizer(long j, String str) {
        serializer(str, String.valueOf(j));
    }

    public void IconCompatParcelizer(String str, boolean z) {
        serializer(str, String.valueOf(z));
    }

    @Override // o.getNavigateInEK5gGoQ
    public void serializer(scale0AR0LA0default scale0ar0la0default) {
        synchronized (this) {
            scale0AR0LA0default scale0ar0la0default2 = (scale0AR0LA0default) this.serializer;
            if (scale0ar0la0default2 != scale0ar0la0default) {
                scale0ar0la0default2.RemoteActionCompatParcelizer = null;
                this.serializer = scale0ar0la0default;
            }
        }
    }

    @Override // o.getNavigateInEK5gGoQ
    public scale0AR0LA0default write() {
        scale0AR0LA0default scale0ar0la0default;
        synchronized (this) {
            scale0ar0la0default = (scale0AR0LA0default) this.serializer;
        }
        return scale0ar0la0default;
    }

    public r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(LookaheadScopeKt lookaheadScopeKt, String str) {
        this.IconCompatParcelizer = 7;
        this.serializer = lookaheadScopeKt;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        this.read = str;
    }

    public r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(int i) {
        this.IconCompatParcelizer = i;
        if (i == 1) {
            this.write = new Object();
            this.serializer = new ArrayList();
            this.read = new ArrayList();
            this.RemoteActionCompatParcelizer = true;
            return;
        }
        if (i != 5) {
            this.write = null;
            this.serializer = r8lambdaaMcmwVrYRO5d5jdf3Z38wSINaiU.AUTO;
            this.RemoteActionCompatParcelizer = false;
            this.read = "manual";
        }
    }

    public r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(Application application, BlurFilter blurFilter, List list) {
        this.IconCompatParcelizer = 4;
        this.write = application;
        this.serializer = blurFilter;
        this.read = list;
    }

    public r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(getMediaStopEK5gGoQ getmediastopek5ggoq, scale0AR0LA0default scale0ar0la0default, getMediaStepBackwardEK5gGoQ getmediastepbackwardek5ggoq) {
        this.IconCompatParcelizer = 6;
        this.read = getmediastopek5ggoq;
        this.RemoteActionCompatParcelizer = true;
        this.serializer = scale0ar0la0default;
        this.write = getmediastepbackwardek5ggoq;
    }

    public r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(String str) {
        this.IconCompatParcelizer = 8;
        androidx.emoji2.text.EmojiProcessor emojiProcessor = new androidx.emoji2.text.EmojiProcessor(26, false);
        this.write = emojiProcessor;
        this.serializer = emojiProcessor;
        this.RemoteActionCompatParcelizer = false;
        this.read = str;
    }

    public r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(scale0AR0LA0default scale0ar0la0default, clipPathKD09W0Mdefault clippathkd09w0mdefault) {
        this.IconCompatParcelizer = 3;
        this.read = new io.sentry.android.core.internal.util.write(1, this);
        this.serializer = scale0ar0la0default;
        this.write = clippathkd09w0mdefault;
    }

    public r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(androidx.work.impl.WorkerWrapper.Builder builder, boolean z) {
        this.IconCompatParcelizer = 9;
        this.read = builder;
        this.serializer = new AtomicReference(null);
        this.RemoteActionCompatParcelizer = z;
        this.write = new AtomicMarkableReference(new invalidateIntrinsicsParent(z ? 8192 : androidx.compose.ui.graphics.Fields.RotationZ), false);
    }

    public r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(r8lambdaMkSjJB1nMG37oUW_yupQha4 r8lambdamksjjb1nmg37ouw_yupqha4, r8lambdamrRUyRDhX_6xLfo9jIAfF753450 r8lambdamrruyrdhx_6xlfo9jiaff753450) {
        boolean[] zArr;
        this.IconCompatParcelizer = 10;
        this.read = r8lambdamksjjb1nmg37ouw_yupqha4;
        this.write = r8lambdamrruyrdhx_6xlfo9jiaff753450;
        if (r8lambdamrruyrdhx_6xlfo9jiaff753450.MediaSessionCompatQueueItem) {
            zArr = null;
        } else {
            r8lambdamksjjb1nmg37ouw_yupqha4.getClass();
            zArr = new boolean[2];
        }
        this.serializer = zArr;
    }
}
