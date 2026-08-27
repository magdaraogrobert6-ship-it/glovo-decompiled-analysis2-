package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.io.InterruptedIOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class applyDisplayCutoutMarginsToCloseButtonlambda0 {
    public final /* synthetic */ int $r8$classId;
    public Object executorServiceOrNull;
    public int maxRequestsPerHost;
    public Serializable readyAsyncCalls;
    public final Serializable runningAsyncCalls;
    public final Serializable runningSyncCalls;

    /* JADX WARN: Multi-variable type inference failed */
    public applyDisplayCutoutMarginsToCloseButtonlambda0(String str) {
        this.$r8$classId = 1;
        str.getClass();
        resizeGraphicFrameIfAppropriate resizegraphicframeifappropriate = new resizeGraphicFrameIfAppropriate(0 == true ? 1 : 0, 5);
        resizegraphicframeifappropriate.read = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        resizegraphicframeifappropriate.write = iArr;
        resizegraphicframeifappropriate.serializer = -1;
        this.executorServiceOrNull = resizegraphicframeifappropriate;
        this.runningAsyncCalls = new StringBuilder();
        this.runningSyncCalls = str;
    }

    public ExecutorService MediaSessionCompatQueueItem() {
        AbstractExecutorService abstractExecutorService;
        synchronized (this) {
            if (((AbstractExecutorService) this.executorServiceOrNull) == null) {
                this.executorServiceOrNull = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new InAppMessageHtmlBaseViewmessageWebView6(setWebViewContent.read + " Dispatcher", false));
            }
            abstractExecutorService = (AbstractExecutorService) this.executorServiceOrNull;
            abstractExecutorService.getClass();
        }
        return abstractExecutorService;
    }

    public void write(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        RatingCompat();
    }

    public int IconCompatParcelizer(int i) {
        if (i < ((String) this.runningSyncCalls).length()) {
            return i;
        }
        return -1;
    }

    public void IconCompatParcelizer(char c) {
        String str = (String) this.runningSyncCalls;
        int i = this.maxRequestsPerHost;
        if (i > 0 && c == '\"') {
            try {
                this.maxRequestsPerHost = i - 1;
                String strMediaMetadataCompat = MediaMetadataCompat();
                this.maxRequestsPerHost = i;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strMediaMetadataCompat, "null"}, getCieXyz.write())).booleanValue()) {
                    IconCompatParcelizer(this.maxRequestsPerHost - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.maxRequestsPerHost = i;
                throw th;
            }
        }
        String strSerializer = coil3.util.ContextsKt.serializer(coil3.util.ContextsKt.read(c));
        int i2 = this.maxRequestsPerHost;
        int i3 = i2 - 1;
        RemoteActionCompatParcelizer(this, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Expected ", strSerializer, ", but had '", (i2 == str.length() || i3 < 0) ? "EOF" : String.valueOf(str.charAt(i3)), "' instead"), i3, null, 4);
        throw null;
    }

    public byte MediaBrowserCompatMediaItem() {
        String str = (String) this.runningSyncCalls;
        int i = this.maxRequestsPerHost;
        while (true) {
            int iIconCompatParcelizer = IconCompatParcelizer(i);
            if (iIconCompatParcelizer == -1) {
                this.maxRequestsPerHost = iIconCompatParcelizer;
                return (byte) 10;
            }
            char cCharAt = str.charAt(iIconCompatParcelizer);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.maxRequestsPerHost = iIconCompatParcelizer;
                return coil3.util.ContextsKt.read(cCharAt);
            }
            i = iIconCompatParcelizer + 1;
        }
    }

    public String MediaMetadataCompat() {
        String string;
        StringBuilder sb = (StringBuilder) this.runningAsyncCalls;
        String str = (String) this.runningSyncCalls;
        String str2 = (String) this.readyAsyncCalls;
        if (str2 != null) {
            str2.getClass();
            this.readyAsyncCalls = null;
            return str2;
        }
        int iParcelableVolumeInfo = ParcelableVolumeInfo();
        if (iParcelableVolumeInfo >= str.length() || iParcelableVolumeInfo == -1) {
            RemoteActionCompatParcelizer(this, "EOF", iParcelableVolumeInfo, null, 4);
            throw null;
        }
        byte b = coil3.util.ContextsKt.read(str.charAt(iParcelableVolumeInfo));
        if (b == 1) {
            return write();
        }
        if (b != 0) {
            RemoteActionCompatParcelizer(this, "Expected beginning of the string, but got " + str.charAt(iParcelableVolumeInfo), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (coil3.util.ContextsKt.read(str.charAt(iParcelableVolumeInfo)) == 0) {
            iParcelableVolumeInfo++;
            if (iParcelableVolumeInfo >= str.length()) {
                sb.append((CharSequence) str, this.maxRequestsPerHost, iParcelableVolumeInfo);
                int iIconCompatParcelizer = IconCompatParcelizer(iParcelableVolumeInfo);
                if (iIconCompatParcelizer == -1) {
                    this.maxRequestsPerHost = iParcelableVolumeInfo;
                    sb.append((CharSequence) str, 0, 0);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    return string2;
                }
                iParcelableVolumeInfo = iIconCompatParcelizer;
                z = true;
            }
        }
        int i = this.maxRequestsPerHost;
        if (z) {
            sb.append((CharSequence) str, i, iParcelableVolumeInfo);
            String string3 = sb.toString();
            sb.setLength(0);
            string = string3;
        } else {
            string = str.subSequence(i, iParcelableVolumeInfo).toString();
        }
        this.maxRequestsPerHost = iParcelableVolumeInfo;
        return string;
    }

    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    public long RemoteActionCompatParcelizer() {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.applyDisplayCutoutMarginsToCloseButtonlambda0.RemoteActionCompatParcelizer():long");
    }

    public r8lambdaA5ZM0ZZHuWQ_bt3yrmvyjurWj8 RemoteActionCompatParcelizer(String str) {
        Iterator it = ((ArrayDeque) this.runningAsyncCalls).iterator();
        it.getClass();
        while (it.hasNext()) {
            r8lambdaA5ZM0ZZHuWQ_bt3yrmvyjurWj8 r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj8 = (r8lambdaA5ZM0ZZHuWQ_bt3yrmvyjurWj8) it.next();
            Object[] objArr = {r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj8.serializer.originalRequest.url.host, str};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj8;
            }
        }
        Iterator it2 = ((ArrayDeque) this.readyAsyncCalls).iterator();
        it2.getClass();
        while (it2.hasNext()) {
            r8lambdaA5ZM0ZZHuWQ_bt3yrmvyjurWj8 r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj9 = (r8lambdaA5ZM0ZZHuWQ_bt3yrmvyjurWj8) it2.next();
            Object[] objArr2 = {r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj9.serializer.originalRequest.url.host, str};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                return r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj9;
            }
        }
        return null;
    }

    public void RemoteActionCompatParcelizer(r8lambdaA5ZM0ZZHuWQ_bt3yrmvyjurWj8 r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj8) {
        r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj8.IconCompatParcelizer.decrementAndGet();
        write((ArrayDeque) this.runningAsyncCalls, r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj8);
    }

    public String serializer() {
        String string;
        StringBuilder sb = (StringBuilder) this.runningAsyncCalls;
        String str = (String) this.runningSyncCalls;
        read('\"');
        int i = this.maxRequestsPerHost;
        int iWrite = hideCurrentlyDisplayingInAppMessage.write((CharSequence) str, '\"', i, false, 4);
        if (iWrite == -1) {
            MediaMetadataCompat();
            int i2 = this.maxRequestsPerHost;
            RemoteActionCompatParcelizer(this, ff$$ExternalSyntheticOutline0.m("Expected quotation mark '\"', but had '", (i2 == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, null, 4);
            throw null;
        }
        int i3 = i;
        while (i3 < iWrite) {
            if (str.charAt(i3) == '\\') {
                int iIconCompatParcelizer = this.maxRequestsPerHost;
                char cCharAt = str.charAt(i3);
                boolean z = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        sb.append((CharSequence) str, iIconCompatParcelizer, i3);
                        int iIconCompatParcelizer2 = IconCompatParcelizer(i3 + 1);
                        if (iIconCompatParcelizer2 == -1) {
                            RemoteActionCompatParcelizer(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int iWrite2 = iIconCompatParcelizer2 + 1;
                        char cCharAt2 = str.charAt(iIconCompatParcelizer2);
                        if (cCharAt2 == 'u') {
                            iWrite2 = write(iWrite2, (CharSequence) str);
                        } else {
                            char c = cCharAt2 < 'u' ? accessdisplayPreparedInAppMessage.IconCompatParcelizer[cCharAt2] : (char) 0;
                            if (c == 0) {
                                RemoteActionCompatParcelizer(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            sb.append(c);
                        }
                        iIconCompatParcelizer = IconCompatParcelizer(iWrite2);
                        if (iIconCompatParcelizer == -1) {
                            RemoteActionCompatParcelizer(this, "Unexpected EOF", iIconCompatParcelizer, null, 4);
                            throw null;
                        }
                    } else {
                        i3++;
                        if (i3 >= str.length()) {
                            sb.append((CharSequence) str, iIconCompatParcelizer, i3);
                            iIconCompatParcelizer = IconCompatParcelizer(i3);
                            if (iIconCompatParcelizer == -1) {
                                RemoteActionCompatParcelizer(this, "Unexpected EOF", iIconCompatParcelizer, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                        }
                        cCharAt = str.charAt(i3);
                    }
                    i3 = iIconCompatParcelizer;
                    z = true;
                    cCharAt = str.charAt(i3);
                }
                if (z) {
                    sb.append((CharSequence) str, iIconCompatParcelizer, i3);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    string = string2;
                } else {
                    string = str.subSequence(iIconCompatParcelizer, i3).toString();
                }
                this.maxRequestsPerHost = i3 + 1;
                return string;
            }
            i3++;
        }
        this.maxRequestsPerHost = iWrite + 1;
        return str.substring(i, iWrite);
    }

    public int write(int i, CharSequence charSequence) {
        int i2 = i + 4;
        if (i2 >= charSequence.length()) {
            this.maxRequestsPerHost = i;
            if (i2 < charSequence.length()) {
                return write(this.maxRequestsPerHost, charSequence);
            }
            RemoteActionCompatParcelizer(this, "Unexpected EOF during unicode escape", 0, null, 6);
            throw null;
        }
        ((StringBuilder) this.runningAsyncCalls).append((char) (IconCompatParcelizer(i + 3, charSequence) + (IconCompatParcelizer(i, charSequence) << 12) + (IconCompatParcelizer(i + 1, charSequence) << 8) + (IconCompatParcelizer(i + 2, charSequence) << 4)));
        return i2;
    }

    public String write() {
        String str = (String) this.readyAsyncCalls;
        if (str == null) {
            return serializer();
        }
        str.getClass();
        this.readyAsyncCalls = null;
        return str;
    }

    public void write(int i, String str) {
        String str2 = (String) this.runningSyncCalls;
        if (str2.length() - i < str.length()) {
            RemoteActionCompatParcelizer(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (str2.charAt(i + i2) | ' ')) {
                RemoteActionCompatParcelizer(this, "Expected valid boolean literal prefix, but had '" + MediaMetadataCompat() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.maxRequestsPerHost = str.length() + i;
    }

    public String IconCompatParcelizer(String str, boolean z) {
        str.getClass();
        int i = this.maxRequestsPerHost;
        try {
            if (IconCompatParcelizer() == 6) {
                Object[] objArr = {IconCompatParcelizer(z), str};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    this.readyAsyncCalls = null;
                    if (IconCompatParcelizer() == 5) {
                        return IconCompatParcelizer(z);
                    }
                }
            }
            return null;
        } finally {
            this.maxRequestsPerHost = i;
            this.readyAsyncCalls = null;
        }
    }

    public void IconCompatParcelizer(int i, String str, String str2) {
        str2.getClass();
        String strConcat = str2.length() == 0 ? "" : "\n".concat(str2);
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m(str, " at path: ");
        sbM.append(((resizeGraphicFrameIfAppropriate) this.executorServiceOrNull).write());
        sbM.append(strConcat);
        throw coil3.util.IntPair.IconCompatParcelizer((String) this.runningSyncCalls, i, sbM.toString());
    }

    public void serializer(int i) {
        if (i >= 1) {
            synchronized (this) {
                this.maxRequestsPerHost = i;
            }
            RatingCompat();
            return;
        }
        DrawableTransformation.serializer((Object) c8$$ExternalSyntheticOutline0.m(i, "max < 1: "));
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(applyDisplayCutoutMarginsToCloseButtonlambda0 applydisplaycutoutmarginstoclosebuttonlambda0, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = applydisplaycutoutmarginstoclosebuttonlambda0.maxRequestsPerHost;
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        applydisplaycutoutmarginstoclosebuttonlambda0.IconCompatParcelizer(i, str, str2);
        throw null;
    }

    public boolean PlaybackStateCompat() {
        int iParcelableVolumeInfo = ParcelableVolumeInfo();
        String str = (String) this.runningSyncCalls;
        if (iParcelableVolumeInfo >= str.length() || iParcelableVolumeInfo == -1 || str.charAt(iParcelableVolumeInfo) != ',') {
            return false;
        }
        this.maxRequestsPerHost++;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:20:0x006a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0099  */
    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public void RatingCompat() {
        int i;
        int size;
        r8lambdaA5ZM0ZZHuWQ_bt3yrmvyjurWj8 r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj8;
        int size2;
        r8lambdaA5ZM0ZZHuWQ_bt3yrmvyjurWj8 r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj9;
        TimeZone timeZone = setWebViewContent.RemoteActionCompatParcelizer;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = ((ArrayDeque) this.readyAsyncCalls).iterator();
            it.getClass();
            while (it.hasNext()) {
                r8lambdaA5ZM0ZZHuWQ_bt3yrmvyjurWj8 r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj10 = (r8lambdaA5ZM0ZZHuWQ_bt3yrmvyjurWj8) it.next();
                if (((ArrayDeque) this.runningAsyncCalls).size() >= 64) {
                    break;
                }
                if (r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj10.IconCompatParcelizer.get() < this.maxRequestsPerHost) {
                    it.remove();
                    r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj10.IconCompatParcelizer.incrementAndGet();
                    arrayList.add(r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj10);
                    ((ArrayDeque) this.runningAsyncCalls).add(r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj10);
                }
            }
            synchronized (this) {
                ((ArrayDeque) this.runningAsyncCalls).size();
                ((ArrayDeque) this.runningSyncCalls).size();
            }
            i = 0;
            if (!MediaSessionCompatQueueItem().isShutdown()) {
                size2 = arrayList.size();
                while (i < size2) {
                    r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj9 = (r8lambdaA5ZM0ZZHuWQ_bt3yrmvyjurWj8) arrayList.get(i);
                    r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj9.IconCompatParcelizer.decrementAndGet();
                    synchronized (this) {
                        ((ArrayDeque) this.runningAsyncCalls).remove(r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj9);
                    }
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(null);
                    clipCanvasToPath clipcanvastopath = r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj9.serializer;
                    clipcanvastopath.IconCompatParcelizer(interruptedIOException);
                    r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj9.read.onFailure(clipcanvastopath, interruptedIOException);
                    i++;
                }
            }
            size = arrayList.size();
            while (i < size) {
                r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj8 = (r8lambdaA5ZM0ZZHuWQ_bt3yrmvyjurWj8) arrayList.get(i);
                ExecutorService executorServiceMediaSessionCompatQueueItem = MediaSessionCompatQueueItem();
                r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj8.getClass();
                clipCanvasToPath clipcanvastopath2 = r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj8.serializer;
                clipcanvastopath2.client.dispatcher.getClass();
                try {
                    try {
                        executorServiceMediaSessionCompatQueueItem.execute(r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj8);
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                        interruptedIOException2.initCause(e);
                        clipCanvasToPath clipcanvastopath3 = r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj8.serializer;
                        clipcanvastopath3.IconCompatParcelizer(interruptedIOException2);
                        r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj8.read.onFailure(clipcanvastopath3, interruptedIOException2);
                        clipcanvastopath2.client.dispatcher.RemoteActionCompatParcelizer(r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj8);
                    }
                    i++;
                } catch (Throwable th) {
                    clipcanvastopath2.client.dispatcher.RemoteActionCompatParcelizer(r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj8);
                    throw th;
                }
            }
            return;
        }
        i = 0;
        if (!MediaSessionCompatQueueItem().isShutdown()) {
            size = arrayList.size();
            while (i < size) {
                r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj8 = (r8lambdaA5ZM0ZZHuWQ_bt3yrmvyjurWj8) arrayList.get(i);
                ExecutorService executorServiceMediaSessionCompatQueueItem2 = MediaSessionCompatQueueItem();
                r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj8.getClass();
                clipCanvasToPath clipcanvastopath4 = r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj8.serializer;
                clipcanvastopath4.client.dispatcher.getClass();
                executorServiceMediaSessionCompatQueueItem2.execute(r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj8);
                i++;
            }
            return;
        }
        size2 = arrayList.size();
        while (i < size2) {
            r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj9 = (r8lambdaA5ZM0ZZHuWQ_bt3yrmvyjurWj8) arrayList.get(i);
            r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj9.IconCompatParcelizer.decrementAndGet();
            synchronized (this) {
                ((ArrayDeque) this.runningAsyncCalls).remove(r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj9);
                InterruptedIOException interruptedIOException3 = new InterruptedIOException("executor rejected");
                interruptedIOException3.initCause(null);
                clipCanvasToPath clipcanvastopath5 = r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj9.serializer;
                clipcanvastopath5.IconCompatParcelizer(interruptedIOException3);
                r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj9.read.onFailure(clipcanvastopath5, interruptedIOException3);
                i++;
            }
        }
    }

    public boolean serializer(boolean z) {
        int iIconCompatParcelizer = IconCompatParcelizer(ParcelableVolumeInfo());
        String str = (String) this.runningSyncCalls;
        int length = str.length() - iIconCompatParcelizer;
        if (length >= 4 && iIconCompatParcelizer != -1) {
            for (int i = 0; i < 4; i++) {
                if ("null".charAt(i) == str.charAt(iIconCompatParcelizer + i)) {
                }
            }
            if (length <= 4 || coil3.util.ContextsKt.read(str.charAt(iIconCompatParcelizer + 4)) != 0) {
                if (!z) {
                    return true;
                }
                this.maxRequestsPerHost = iIconCompatParcelizer + 4;
                return true;
            }
        }
        return false;
    }

    public String toString() {
        if (this.$r8$classId != 1) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder("JsonReader(source='");
        sb.append(this.runningSyncCalls);
        sb.append("', currentPosition=");
        return af$$ExternalSyntheticOutline0.m(sb, this.maxRequestsPerHost, ')');
    }

    public int ParcelableVolumeInfo() {
        char cCharAt;
        int i = this.maxRequestsPerHost;
        if (i == -1) {
            return i;
        }
        String str = (String) this.runningSyncCalls;
        while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i++;
        }
        this.maxRequestsPerHost = i;
        return i;
    }

    public void read(char c) {
        int i = this.maxRequestsPerHost;
        if (i == -1) {
            IconCompatParcelizer(c);
            throw null;
        }
        String str = (String) this.runningSyncCalls;
        while (i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.maxRequestsPerHost = i2;
                if (cCharAt == c) {
                    return;
                }
                IconCompatParcelizer(c);
                throw null;
            }
            i = i2;
        }
        this.maxRequestsPerHost = -1;
        IconCompatParcelizer(c);
        throw null;
    }

    public String MediaDescriptionCompat() {
        String strMediaMetadataCompat = MediaMetadataCompat();
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strMediaMetadataCompat, "null"}, getCieXyz.write())).booleanValue() || ((String) this.runningSyncCalls).charAt(this.maxRequestsPerHost - 1) == '\"') {
            return strMediaMetadataCompat;
        }
        RemoteActionCompatParcelizer(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
        throw null;
    }

    public boolean read() {
        int i = this.maxRequestsPerHost;
        if (i == -1) {
            return false;
        }
        String str = (String) this.runningSyncCalls;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.maxRequestsPerHost = i;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i++;
        }
        this.maxRequestsPerHost = i;
        return false;
    }

    public String IconCompatParcelizer(boolean z) {
        String strWrite;
        byte bMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        if (z) {
            if (bMediaBrowserCompatMediaItem != 1 && bMediaBrowserCompatMediaItem != 0) {
                return null;
            }
            strWrite = MediaMetadataCompat();
        } else {
            if (bMediaBrowserCompatMediaItem != 1) {
                return null;
            }
            strWrite = write();
        }
        this.readyAsyncCalls = strWrite;
        return strWrite;
    }

    public int IconCompatParcelizer(int i, CharSequence charSequence) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        RemoteActionCompatParcelizer(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public applyDisplayCutoutMarginsToCloseButtonlambda0() {
        this.$r8$classId = 0;
        this.maxRequestsPerHost = 5;
        this.readyAsyncCalls = new ArrayDeque();
        this.runningAsyncCalls = new ArrayDeque();
        this.runningSyncCalls = new ArrayDeque();
    }

    public byte IconCompatParcelizer() {
        String str = (String) this.runningSyncCalls;
        int i = this.maxRequestsPerHost;
        while (i != -1 && i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.maxRequestsPerHost = i2;
                return coil3.util.ContextsKt.read(cCharAt);
            }
            i = i2;
        }
        this.maxRequestsPerHost = str.length();
        return (byte) 10;
    }

    public byte IconCompatParcelizer(byte b) {
        String str = (String) this.runningSyncCalls;
        byte bIconCompatParcelizer = IconCompatParcelizer();
        if (bIconCompatParcelizer == b) {
            return bIconCompatParcelizer;
        }
        String strSerializer = coil3.util.ContextsKt.serializer(b);
        int i = this.maxRequestsPerHost;
        int i2 = i - 1;
        RemoteActionCompatParcelizer(this, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Expected ", strSerializer, ", but had '", (i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, null, 4);
        throw null;
    }
}
