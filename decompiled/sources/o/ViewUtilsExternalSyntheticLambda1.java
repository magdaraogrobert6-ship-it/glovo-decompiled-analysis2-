package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import io.sentry.SentryTracer$$ExternalSyntheticLambda1;
import io.socket.parser.IOParser$Decoder;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import okhttp3.EventListener;
import okhttp3.WebSocketListener;
import okhttp3.internal.ws.RealWebSocket$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewUtilsExternalSyntheticLambda1 implements finishWebViewDisplay {
    public static final List RemoteActionCompatParcelizer;
    public r8lambdaMqJZvG9RjEdNq0uR_kRBAiM5YUM ComponentActivity;
    public clipCanvasToPath IconCompatParcelizer;
    public final ArrayDeque MediaBrowserCompatMediaItem;
    public final long MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public final long MediaSessionCompatResultReceiverWrapper;
    public String MediaSessionCompatToken;
    public final r8lambday113fDFTSR5e4PZj6XsSXLtpL60 ParcelableVolumeInfo;
    public final ArrayDeque PlaybackStateCompat;
    public long PlaybackStateCompatCustomAction;
    public final WebSocketListener RatingCompat;
    public String ResultReceiver;
    public final Random r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final onCreateWindowlambda3 r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public r8lambda8wlcaTG4WSLSeoWnhVT_DMKDe7Y r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public isUnreadIndicatorEnabled r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public setRectf r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public final long r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public boolean read;
    public boolean serializer;
    public r8lambda9dwTneWqHzFwEeeDLZ80_1lxoOc write;

    public final boolean RemoteActionCompatParcelizer(int i, RequestBuilder requestBuilder) {
        synchronized (this) {
            if (!this.MediaSessionCompatQueueItem && !this.read) {
                long j = this.PlaybackStateCompatCustomAction;
                byte[] bArr = requestBuilder.data;
                if (((long) bArr.length) + j > 16777216) {
                    RemoteActionCompatParcelizer(1001, (String) null);
                    return false;
                }
                this.PlaybackStateCompatCustomAction = j + ((long) bArr.length);
                this.MediaBrowserCompatMediaItem.add(new setWebViewSettings(i, requestBuilder));
                serializer();
                return true;
            }
            return false;
        }
    }

    public final void write() {
        boolean z;
        int i;
        String str;
        r8lambdaMqJZvG9RjEdNq0uR_kRBAiM5YUM r8lambdamqjzvg9rjednq0ur_krbaim5yum;
        setRectf setrectf;
        synchronized (this) {
            z = this.MediaSessionCompatQueueItem;
            i = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            str = this.ResultReceiver;
            r8lambdamqjzvg9rjednq0ur_krbaim5yum = this.ComponentActivity;
            this.ComponentActivity = null;
            if (this.read && this.MediaBrowserCompatMediaItem.isEmpty()) {
                isUnreadIndicatorEnabled isunreadindicatorenabled = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                if (isunreadindicatorenabled != null) {
                    this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = null;
                    onCreateWindowlambda3.RemoteActionCompatParcelizer(this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss, this.MediaSessionCompatToken + " writer close", 0L, new RealWebSocket$$ExternalSyntheticLambda0(0, isunreadindicatorenabled), 2);
                }
                this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.serializer();
            }
            setrectf = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 == null ? this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 : null;
        }
        if (!z && setrectf != null && this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY != -1) {
            WebSocketListener webSocketListener = this.RatingCompat;
            str.getClass();
            webSocketListener.onClosed(this, i, str);
        }
        if (r8lambdamqjzvg9rjednq0ur_krbaim5yum != null) {
            InAppMessageHtmlBaseViewCompanion.IconCompatParcelizer(r8lambdamqjzvg9rjednq0ur_krbaim5yum);
        }
        if (setrectf != null) {
            InAppMessageHtmlBaseViewCompanion.IconCompatParcelizer(setrectf);
        }
    }

    static {
        Object[] objArr = {r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc.HTTP_1_1};
        int iSerializer = getQueryParameterslambda2.serializer();
        RemoteActionCompatParcelizer = (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
    }

    public final void read(r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0) {
        r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60 = this.ParcelableVolumeInfo;
        if (r8lambday113fdftsr5e4pzj6xssxltpl60.headers.write("Sec-WebSocket-Extensions") != null) {
            RemoteActionCompatParcelizer(this, new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null, 6);
            return;
        }
        r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ r8lambdauggauuj_lbnzvef8yyxtwmhrlkq = r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0.read();
        EventListener eventListener = EventListener.NONE;
        eventListener.getClass();
        TimeZone timeZone = setWebViewContent.RemoteActionCompatParcelizer;
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.PlaybackStateCompatCustomAction = new SentryTracer$$ExternalSyntheticLambda1(15, eventListener);
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.write(RemoteActionCompatParcelizer);
        r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg1 = new r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0(r8lambdauggauuj_lbnzvef8yyxtwmhrlkq);
        _get_messageWebView_lambda0 _get_messagewebview_lambda0 = r8lambday113fdftsr5e4pzj6xssxltpl60.read();
        _get_messagewebview_lambda0.IconCompatParcelizer("Upgrade", "websocket");
        _get_messagewebview_lambda0.IconCompatParcelizer("Connection", "Upgrade");
        _get_messagewebview_lambda0.IconCompatParcelizer("Sec-WebSocket-Key", this.MediaMetadataCompat);
        _get_messagewebview_lambda0.IconCompatParcelizer("Sec-WebSocket-Version", "13");
        _get_messagewebview_lambda0.IconCompatParcelizer("Sec-WebSocket-Extensions", "permessage-deflate");
        r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl61 = new r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messagewebview_lambda0);
        clipCanvasToPath clipcanvastopath = new clipCanvasToPath(r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg1, r8lambday113fdftsr5e4pzj6xssxltpl61, true);
        this.IconCompatParcelizer = clipcanvastopath;
        clipcanvastopath.IconCompatParcelizer(new IOParser$Decoder(this, r8lambday113fdftsr5e4pzj6xssxltpl61));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x007a A[Catch: all -> 0x0140, TRY_ENTER, TryCatch #0 {all -> 0x0140, blocks: (B:32:0x007a, B:33:0x0086, B:35:0x008a, B:36:0x0096, B:38:0x00a2, B:41:0x00a6, B:42:0x00a7, B:43:0x00a8, B:45:0x00ac, B:75:0x011e, B:77:0x0122, B:85:0x0137, B:86:0x0139, B:63:0x00d7, B:67:0x00fc, B:68:0x0105, B:64:0x00eb, B:69:0x0106, B:71:0x0110, B:72:0x0113, B:87:0x013a, B:88:0x013f, B:74:0x011b, B:37:0x0097), top: B:98:0x0078, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0086 A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:32:0x007a, B:33:0x0086, B:35:0x008a, B:36:0x0096, B:38:0x00a2, B:41:0x00a6, B:42:0x00a7, B:43:0x00a8, B:45:0x00ac, B:75:0x011e, B:77:0x0122, B:85:0x0137, B:86:0x0139, B:63:0x00d7, B:67:0x00fc, B:68:0x0105, B:64:0x00eb, B:69:0x0106, B:71:0x0110, B:72:0x0113, B:87:0x013a, B:88:0x013f, B:74:0x011b, B:37:0x0097), top: B:98:0x0078, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x008a A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:32:0x007a, B:33:0x0086, B:35:0x008a, B:36:0x0096, B:38:0x00a2, B:41:0x00a6, B:42:0x00a7, B:43:0x00a8, B:45:0x00ac, B:75:0x011e, B:77:0x0122, B:85:0x0137, B:86:0x0139, B:63:0x00d7, B:67:0x00fc, B:68:0x0105, B:64:0x00eb, B:69:0x0106, B:71:0x0110, B:72:0x0113, B:87:0x013a, B:88:0x013f, B:74:0x011b, B:37:0x0097), top: B:98:0x0078, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a8 A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:32:0x007a, B:33:0x0086, B:35:0x008a, B:36:0x0096, B:38:0x00a2, B:41:0x00a6, B:42:0x00a7, B:43:0x00a8, B:45:0x00ac, B:75:0x011e, B:77:0x0122, B:85:0x0137, B:86:0x0139, B:63:0x00d7, B:67:0x00fc, B:68:0x0105, B:64:0x00eb, B:69:0x0106, B:71:0x0110, B:72:0x0113, B:87:0x013a, B:88:0x013f, B:74:0x011b, B:37:0x0097), top: B:98:0x0078, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ac A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:32:0x007a, B:33:0x0086, B:35:0x008a, B:36:0x0096, B:38:0x00a2, B:41:0x00a6, B:42:0x00a7, B:43:0x00a8, B:45:0x00ac, B:75:0x011e, B:77:0x0122, B:85:0x0137, B:86:0x0139, B:63:0x00d7, B:67:0x00fc, B:68:0x0105, B:64:0x00eb, B:69:0x0106, B:71:0x0110, B:72:0x0113, B:87:0x013a, B:88:0x013f, B:74:0x011b, B:37:0x0097), top: B:98:0x0078, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00eb A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:32:0x007a, B:33:0x0086, B:35:0x008a, B:36:0x0096, B:38:0x00a2, B:41:0x00a6, B:42:0x00a7, B:43:0x00a8, B:45:0x00ac, B:75:0x011e, B:77:0x0122, B:85:0x0137, B:86:0x0139, B:63:0x00d7, B:67:0x00fc, B:68:0x0105, B:64:0x00eb, B:69:0x0106, B:71:0x0110, B:72:0x0113, B:87:0x013a, B:88:0x013f, B:74:0x011b, B:37:0x0097), top: B:98:0x0078, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fc A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:32:0x007a, B:33:0x0086, B:35:0x008a, B:36:0x0096, B:38:0x00a2, B:41:0x00a6, B:42:0x00a7, B:43:0x00a8, B:45:0x00ac, B:75:0x011e, B:77:0x0122, B:85:0x0137, B:86:0x0139, B:63:0x00d7, B:67:0x00fc, B:68:0x0105, B:64:0x00eb, B:69:0x0106, B:71:0x0110, B:72:0x0113, B:87:0x013a, B:88:0x013f, B:74:0x011b, B:37:0x0097), top: B:98:0x0078, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0110 A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:32:0x007a, B:33:0x0086, B:35:0x008a, B:36:0x0096, B:38:0x00a2, B:41:0x00a6, B:42:0x00a7, B:43:0x00a8, B:45:0x00ac, B:75:0x011e, B:77:0x0122, B:85:0x0137, B:86:0x0139, B:63:0x00d7, B:67:0x00fc, B:68:0x0105, B:64:0x00eb, B:69:0x0106, B:71:0x0110, B:72:0x0113, B:87:0x013a, B:88:0x013f, B:74:0x011b, B:37:0x0097), top: B:98:0x0078, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0122 A[Catch: all -> 0x0140, TRY_LEAVE, TryCatch #0 {all -> 0x0140, blocks: (B:32:0x007a, B:33:0x0086, B:35:0x008a, B:36:0x0096, B:38:0x00a2, B:41:0x00a6, B:42:0x00a7, B:43:0x00a8, B:45:0x00ac, B:75:0x011e, B:77:0x0122, B:85:0x0137, B:86:0x0139, B:63:0x00d7, B:67:0x00fc, B:68:0x0105, B:64:0x00eb, B:69:0x0106, B:71:0x0110, B:72:0x0113, B:87:0x013a, B:88:0x013f, B:74:0x011b, B:37:0x0097), top: B:98:0x0078, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x012c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0131  */
    /* JADX WARN: Code duplicated, block: B:87:0x013a A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:32:0x007a, B:33:0x0086, B:35:0x008a, B:36:0x0096, B:38:0x00a2, B:41:0x00a6, B:42:0x00a7, B:43:0x00a8, B:45:0x00ac, B:75:0x011e, B:77:0x0122, B:85:0x0137, B:86:0x0139, B:63:0x00d7, B:67:0x00fc, B:68:0x0105, B:64:0x00eb, B:69:0x0106, B:71:0x0110, B:72:0x0113, B:87:0x013a, B:88:0x013f, B:74:0x011b, B:37:0x0097), top: B:98:0x0078, inners: #1, #2 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x00eb, please report this as an issue */
    public final boolean read() {
        Object objPoll;
        isUnreadIndicatorEnabled isunreadindicatorenabled;
        String str;
        setRectf setrectf;
        int i;
        RequestBuilder requestBuilder;
        RequestBuilder requestBuilderRemoteActionCompatParcelizer;
        RegistryMissingComponentException registryMissingComponentException;
        setWebViewSettings setwebviewsettings;
        synchronized (this) {
            if (this.MediaSessionCompatQueueItem) {
                return false;
            }
            isUnreadIndicatorEnabled isunreadindicatorenabled2 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
            Object objPoll2 = this.PlaybackStateCompat.poll();
            int i2 = -1;
            String str2 = null;
            try {
                if (objPoll2 == null) {
                    objPoll = this.MediaBrowserCompatMediaItem.poll();
                    if (objPoll instanceof setWebViewSettingslambda0) {
                        int i3 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                        str = this.ResultReceiver;
                        if (i3 != -1) {
                            isUnreadIndicatorEnabled isunreadindicatorenabled3 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = null;
                            setrectf = (isunreadindicatorenabled3 == null || this.ComponentActivity != null) ? null : this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.serializer();
                            i2 = i3;
                            isunreadindicatorenabled = isunreadindicatorenabled3;
                        } else {
                            long j = ((setWebViewSettingslambda0) objPoll).RemoteActionCompatParcelizer;
                            onCreateWindowlambda3.RemoteActionCompatParcelizer(this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss, this.MediaSessionCompatToken + " cancel", TimeUnit.MILLISECONDS.toNanos(j), new RealWebSocket$$ExternalSyntheticLambda0(21, this), 4);
                            i2 = i3;
                            isunreadindicatorenabled = null;
                            setrectf = null;
                        }
                    } else if (objPoll == null) {
                        return false;
                    }
                    if (objPoll2 != null) {
                        isunreadindicatorenabled2.getClass();
                        isunreadindicatorenabled2.serializer(10, (RequestBuilder) objPoll2);
                    } else if (objPoll instanceof setWebViewSettings) {
                        setwebviewsettings = (setWebViewSettings) objPoll;
                        isunreadindicatorenabled2.getClass();
                        isunreadindicatorenabled2.write(setwebviewsettings.write, setwebviewsettings.read);
                        synchronized (this) {
                            this.PlaybackStateCompatCustomAction -= (long) setwebviewsettings.read.data.length;
                        }
                    } else {
                        if (objPoll instanceof setWebViewSettingslambda0) {
                            throw new AssertionError();
                        }
                        setWebViewSettingslambda0 setwebviewsettingslambda0 = (setWebViewSettingslambda0) objPoll;
                        isunreadindicatorenabled2.getClass();
                        i = setwebviewsettingslambda0.serializer;
                        requestBuilder = setwebviewsettingslambda0.IconCompatParcelizer;
                        requestBuilderRemoteActionCompatParcelizer = RequestBuilder.EMPTY;
                        if (i == 0 || requestBuilder != null) {
                            if (i != 0) {
                                if (i >= 1000 || i >= 5000) {
                                    str2 = "Code must be in range [1000,5000): " + i;
                                } else if ((1004 <= i && i < 1007) || (1015 <= i && i < 3000)) {
                                    str2 = "Code " + i + " is reserved and may not be used.";
                                }
                                if (str2 != null) {
                                    throw new IllegalArgumentException(str2.toString());
                                }
                            }
                            registryMissingComponentException = new RegistryMissingComponentException();
                            registryMissingComponentException.MediaBrowserCompatMediaItem(i);
                            if (requestBuilder != null) {
                                registryMissingComponentException.serializer(requestBuilder);
                            }
                            requestBuilderRemoteActionCompatParcelizer = registryMissingComponentException.RemoteActionCompatParcelizer(registryMissingComponentException.size);
                        }
                        try {
                            isunreadindicatorenabled2.serializer(8, requestBuilderRemoteActionCompatParcelizer);
                            isunreadindicatorenabled2.MediaSessionCompatResultReceiverWrapper = true;
                            if (setrectf != null) {
                                WebSocketListener webSocketListener = this.RatingCompat;
                                str.getClass();
                                webSocketListener.onClosed(this, i2, str);
                            }
                        } catch (Throwable th) {
                            isunreadindicatorenabled2.MediaSessionCompatResultReceiverWrapper = true;
                            throw th;
                        }
                    }
                    if (isunreadindicatorenabled != null) {
                        InAppMessageHtmlBaseViewCompanion.IconCompatParcelizer(isunreadindicatorenabled);
                    }
                    if (setrectf != null) {
                        InAppMessageHtmlBaseViewCompanion.IconCompatParcelizer(setrectf);
                    }
                    return true;
                }
                objPoll = null;
                if (objPoll2 != null) {
                    isunreadindicatorenabled2.getClass();
                    isunreadindicatorenabled2.serializer(10, (RequestBuilder) objPoll2);
                } else if (objPoll instanceof setWebViewSettings) {
                    setwebviewsettings = (setWebViewSettings) objPoll;
                    isunreadindicatorenabled2.getClass();
                    isunreadindicatorenabled2.write(setwebviewsettings.write, setwebviewsettings.read);
                    synchronized (this) {
                        this.PlaybackStateCompatCustomAction -= (long) setwebviewsettings.read.data.length;
                    }
                } else {
                    if (objPoll instanceof setWebViewSettingslambda0) {
                        throw new AssertionError();
                    }
                    setWebViewSettingslambda0 setwebviewsettingslambda1 = (setWebViewSettingslambda0) objPoll;
                    isunreadindicatorenabled2.getClass();
                    i = setwebviewsettingslambda1.serializer;
                    requestBuilder = setwebviewsettingslambda1.IconCompatParcelizer;
                    requestBuilderRemoteActionCompatParcelizer = RequestBuilder.EMPTY;
                    if (i == 0) {
                        if (i != 0) {
                            if (i >= 1000) {
                                str2 = "Code must be in range [1000,5000): " + i;
                            } else {
                                str2 = "Code must be in range [1000,5000): " + i;
                            }
                            if (str2 != null) {
                                throw new IllegalArgumentException(str2.toString());
                            }
                        }
                        registryMissingComponentException = new RegistryMissingComponentException();
                        registryMissingComponentException.MediaBrowserCompatMediaItem(i);
                        if (requestBuilder != null) {
                            registryMissingComponentException.serializer(requestBuilder);
                        }
                        requestBuilderRemoteActionCompatParcelizer = registryMissingComponentException.RemoteActionCompatParcelizer(registryMissingComponentException.size);
                    } else {
                        if (i != 0) {
                            if (i >= 1000) {
                                str2 = "Code must be in range [1000,5000): " + i;
                            } else {
                                str2 = "Code must be in range [1000,5000): " + i;
                            }
                            if (str2 != null) {
                                throw new IllegalArgumentException(str2.toString());
                            }
                        }
                        registryMissingComponentException = new RegistryMissingComponentException();
                        registryMissingComponentException.MediaBrowserCompatMediaItem(i);
                        if (requestBuilder != null) {
                            registryMissingComponentException.serializer(requestBuilder);
                        }
                        requestBuilderRemoteActionCompatParcelizer = registryMissingComponentException.RemoteActionCompatParcelizer(registryMissingComponentException.size);
                    }
                    isunreadindicatorenabled2.serializer(8, requestBuilderRemoteActionCompatParcelizer);
                    isunreadindicatorenabled2.MediaSessionCompatResultReceiverWrapper = true;
                    if (setrectf != null) {
                        WebSocketListener webSocketListener2 = this.RatingCompat;
                        str.getClass();
                        webSocketListener2.onClosed(this, i2, str);
                    }
                }
                if (isunreadindicatorenabled != null) {
                    InAppMessageHtmlBaseViewCompanion.IconCompatParcelizer(isunreadindicatorenabled);
                }
                if (setrectf != null) {
                    InAppMessageHtmlBaseViewCompanion.IconCompatParcelizer(setrectf);
                }
                return true;
            } catch (Throwable th2) {
                if (isunreadindicatorenabled != null) {
                    InAppMessageHtmlBaseViewCompanion.IconCompatParcelizer(isunreadindicatorenabled);
                }
                if (setrectf != null) {
                    InAppMessageHtmlBaseViewCompanion.IconCompatParcelizer(setrectf);
                }
                throw th2;
            }
            isunreadindicatorenabled = null;
            str = null;
            setrectf = null;
        }
    }

    public final void serializer() {
        TimeZone timeZone = setWebViewContent.RemoteActionCompatParcelizer;
        r8lambda8wlcaTG4WSLSeoWnhVT_DMKDe7Y r8lambda8wlcatg4wslseownhvt_dmkde7y = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (r8lambda8wlcatg4wslseownhvt_dmkde7y != null) {
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.read(r8lambda8wlcatg4wslseownhvt_dmkde7y, 0L);
        }
    }

    public ViewUtilsExternalSyntheticLambda1(InAppMessageHtmlFullView inAppMessageHtmlFullView, r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60, WebSocketListener webSocketListener, Random random, long j, long j2, long j3) {
        inAppMessageHtmlFullView.getClass();
        this.ParcelableVolumeInfo = r8lambday113fdftsr5e4pzj6xssxltpl60;
        this.RatingCompat = webSocketListener;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = random;
        this.MediaSessionCompatResultReceiverWrapper = j;
        this.write = null;
        this.MediaDescriptionCompat = j2;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = j3;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = inAppMessageHtmlFullView.read();
        this.PlaybackStateCompat = new ArrayDeque();
        this.MediaBrowserCompatMediaItem = new ArrayDeque();
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = -1;
        String str = r8lambday113fdftsr5e4pzj6xssxltpl60.method;
        if (!"GET".equals(str)) {
            DrawableTransformation.serializer((Object) r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Request must be GET: ", str));
            throw null;
        }
        RequestBuilder requestBuilder = RequestBuilder.EMPTY;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.MediaMetadataCompat = ImageHeaderParserImageType.read(bArr).read();
    }

    public final boolean RemoteActionCompatParcelizer(int i, String str) {
        String str2;
        long j = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        synchronized (this) {
            RequestBuilder requestBuilderSerializer = null;
            try {
                if (i < 1000 || i >= 5000) {
                    str2 = "Code must be in range [1000,5000): " + i;
                } else if ((1004 > i || i >= 1007) && (1015 > i || i >= 3000)) {
                    str2 = null;
                } else {
                    str2 = "Code " + i + " is reserved and may not be used.";
                }
                if (str2 != null) {
                    throw new IllegalArgumentException(str2.toString());
                }
                if (str != null) {
                    RequestBuilder requestBuilder = RequestBuilder.EMPTY;
                    requestBuilderSerializer = ImageHeaderParserImageType.serializer(str);
                    if (requestBuilderSerializer.data.length > 123) {
                        throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                    }
                }
                if (!this.MediaSessionCompatQueueItem && !this.read) {
                    this.read = true;
                    this.MediaBrowserCompatMediaItem.add(new setWebViewSettingslambda0(i, j, requestBuilderSerializer));
                    serializer();
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void read(_get_messageWebView_lambda1 _get_messagewebview_lambda1, r8lambda0088L0EiZH2mqIpRPuXhwYCr8 r8lambda0088l0eizh2mqiprpuxhwycr8) {
        int i = _get_messagewebview_lambda1.code;
        if (i != 101) {
            StringBuilder sb = new StringBuilder("Expected HTTP 101 response but was '");
            sb.append(i);
            sb.append(' ');
            throw new ProtocolException(ff$$ExternalSyntheticOutline0.m(sb, _get_messagewebview_lambda1.message, '\''));
        }
        String strRemoteActionCompatParcelizer = _get_messageWebView_lambda1.RemoteActionCompatParcelizer(_get_messagewebview_lambda1, "Connection");
        if (!"Upgrade".equalsIgnoreCase(strRemoteActionCompatParcelizer)) {
            throw new ProtocolException(m1$$ExternalSyntheticOutline0.m('\'', "Expected 'Connection' header value 'Upgrade' but was '", strRemoteActionCompatParcelizer));
        }
        String strRemoteActionCompatParcelizer2 = _get_messageWebView_lambda1.RemoteActionCompatParcelizer(_get_messagewebview_lambda1, "Upgrade");
        if (!"websocket".equalsIgnoreCase(strRemoteActionCompatParcelizer2)) {
            throw new ProtocolException(m1$$ExternalSyntheticOutline0.m('\'', "Expected 'Upgrade' header value 'websocket' but was '", strRemoteActionCompatParcelizer2));
        }
        String strRemoteActionCompatParcelizer3 = _get_messageWebView_lambda1.RemoteActionCompatParcelizer(_get_messagewebview_lambda1, "Sec-WebSocket-Accept");
        RequestBuilder requestBuilder = RequestBuilder.EMPTY;
        String str = ImageHeaderParserImageType.serializer(this.MediaMetadataCompat + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").read("SHA-1").read();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, strRemoteActionCompatParcelizer3}, getCieXyz.write())).booleanValue()) {
            if (r8lambda0088l0eizh2mqiprpuxhwycr8 == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + str + "' but was '" + strRemoteActionCompatParcelizer3 + '\'');
    }

    public static void RemoteActionCompatParcelizer(ViewUtilsExternalSyntheticLambda1 viewUtilsExternalSyntheticLambda1, Exception exc, _get_messageWebView_lambda1 _get_messagewebview_lambda1, int i) {
        setRectf setrectf = null;
        if ((i & 2) != 0) {
            _get_messagewebview_lambda1 = null;
        }
        boolean z = (i & 4) == 0;
        viewUtilsExternalSyntheticLambda1.getClass();
        createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
        createInAppMessageEventSubscriber createinappmessageeventsubscriber2 = new createInAppMessageEventSubscriber();
        synchronized (viewUtilsExternalSyntheticLambda1) {
            if (viewUtilsExternalSyntheticLambda1.MediaSessionCompatQueueItem) {
                return;
            }
            viewUtilsExternalSyntheticLambda1.MediaSessionCompatQueueItem = true;
            setRectf setrectf2 = viewUtilsExternalSyntheticLambda1.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
            isUnreadIndicatorEnabled isunreadindicatorenabled = viewUtilsExternalSyntheticLambda1.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
            createinappmessageeventsubscriber2.IconCompatParcelizer = isunreadindicatorenabled;
            viewUtilsExternalSyntheticLambda1.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = null;
            if (isunreadindicatorenabled != null && viewUtilsExternalSyntheticLambda1.ComponentActivity == null) {
                setrectf = setrectf2;
            }
            createinappmessageeventsubscriber.IconCompatParcelizer = setrectf;
            if (!z && createinappmessageeventsubscriber2.IconCompatParcelizer != null) {
                onCreateWindowlambda3.RemoteActionCompatParcelizer(viewUtilsExternalSyntheticLambda1.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss, viewUtilsExternalSyntheticLambda1.MediaSessionCompatToken + " writer close", 0L, new getPendingWebViewPauseRunnableandroid_sdk_ui_release(createinappmessageeventsubscriber2, 28, createinappmessageeventsubscriber), 2);
            }
            viewUtilsExternalSyntheticLambda1.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.serializer();
            try {
                viewUtilsExternalSyntheticLambda1.RatingCompat.onFailure(viewUtilsExternalSyntheticLambda1, exc, _get_messagewebview_lambda1);
            } finally {
                if (setrectf2 != null) {
                    setrectf2.read.codec.read();
                }
                if (z) {
                    isUnreadIndicatorEnabled isunreadindicatorenabled2 = (isUnreadIndicatorEnabled) createinappmessageeventsubscriber2.IconCompatParcelizer;
                    if (isunreadindicatorenabled2 != null) {
                        InAppMessageHtmlBaseViewCompanion.IconCompatParcelizer(isunreadindicatorenabled2);
                    }
                    setRectf setrectf3 = (setRectf) createinappmessageeventsubscriber.IconCompatParcelizer;
                    if (setrectf3 != null) {
                        InAppMessageHtmlBaseViewCompanion.IconCompatParcelizer(setrectf3);
                    }
                }
            }
        }
    }
}
