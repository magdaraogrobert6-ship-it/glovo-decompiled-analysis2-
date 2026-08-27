package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class _get_brazeApiKey_lambda5 extends _get_brazeApiKey_lambda6 {
    public long MediaBrowserCompatMediaItem;
    public final /* synthetic */ _get_brazeApiKey_lambda3 MediaDescriptionCompat;
    public boolean RatingCompat;
    public final isHtmlInAppMessageApplyWindowInsetsEnabled read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public _get_brazeApiKey_lambda5(_get_brazeApiKey_lambda3 _get_brazeapikey_lambda3, isHtmlInAppMessageApplyWindowInsetsEnabled ishtmlinappmessageapplywindowinsetsenabled) {
        super(_get_brazeapikey_lambda3);
        this.MediaDescriptionCompat = _get_brazeapikey_lambda3;
        this.MediaBrowserCompatMediaItem = -1L;
        this.RatingCompat = true;
        this.read = ishtmlinappmessageapplywindowinsetsenabled;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.write) {
            return;
        }
        if (this.RatingCompat) {
            try {
                if (!r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.read(this, 100)) {
                    read(false, (IOException) null);
                }
            } catch (IOException unused) {
            }
        }
        this.write = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (r8.RatingCompat == false) goto L25;
     */
    @Override // o._get_brazeApiKey_lambda6, o.getResourceConfigurationValue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long read(o.r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r9, long r10) throws java.io.IOException {
        /*
            r8 = this;
            boolean r10 = r8.write
            r0 = 0
            if (r10 != 0) goto Lae
            boolean r10 = r8.RatingCompat
            r2 = -1
            if (r10 != 0) goto Ld
            goto L63
        Ld:
            long r10 = r8.MediaBrowserCompatMediaItem
            int r4 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r5 = 0
            if (r4 == 0) goto L18
            int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r4 != 0) goto L64
        L18:
            o._get_brazeApiKey_lambda3 r4 = r8.MediaDescriptionCompat
            o.r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k r6 = r4.serializer
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 == 0) goto L23
            r6.MediaSessionCompatQueueItem()
        L23:
            long r10 = r6.ComponentActivity()     // Catch: java.lang.NumberFormatException -> La3
            r8.MediaBrowserCompatMediaItem = r10     // Catch: java.lang.NumberFormatException -> La3
            java.lang.String r10 = r6.MediaSessionCompatQueueItem()     // Catch: java.lang.NumberFormatException -> La3
            java.lang.String r10 = r10.trim()     // Catch: java.lang.NumberFormatException -> La3
            long r6 = r8.MediaBrowserCompatMediaItem     // Catch: java.lang.NumberFormatException -> La3
            int r11 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r11 < 0) goto L85
            boolean r11 = r10.isEmpty()     // Catch: java.lang.NumberFormatException -> La3
            if (r11 != 0) goto L45
            java.lang.String r11 = ";"
            boolean r11 = r10.startsWith(r11)     // Catch: java.lang.NumberFormatException -> La3
            if (r11 == 0) goto L85
        L45:
            long r10 = r8.MediaBrowserCompatMediaItem
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 != 0) goto L5f
            r8.RatingCompat = r5
            o.isFirebaseCloudMessagingRegistrationEnabled r10 = r4.write
            o.setTriggerActionMinimumTimeIntervalSeconds r10 = r10.PlaybackStateCompatCustomAction
            o.isHtmlInAppMessageApplyWindowInsetsEnabled r11 = r8.read
            o.isEphemeralEventsEnabled r0 = r4.write()
            com.sentiance.okhttp3.internal.http.e.write(r10, r11, r0)
            r10 = 1
            r11 = 0
            r8.read(r10, r11)
        L5f:
            boolean r10 = r8.RatingCompat
            if (r10 != 0) goto L64
        L63:
            return r2
        L64:
            long r10 = r8.MediaBrowserCompatMediaItem
            r0 = 8192(0x2000, double:4.0474E-320)
            long r10 = java.lang.Math.min(r0, r10)
            long r9 = super.read(r9, r10)
            int r11 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r11 == 0) goto L7a
            long r0 = r8.MediaBrowserCompatMediaItem
            long r0 = r0 - r9
            r8.MediaBrowserCompatMediaItem = r0
            return r9
        L7a:
            java.net.ProtocolException r9 = new java.net.ProtocolException
            java.lang.String r10 = "unexpected end of stream"
            r9.<init>(r10)
            r8.read(r5, r9)
            throw r9
        L85:
            java.net.ProtocolException r9 = new java.net.ProtocolException     // Catch: java.lang.NumberFormatException -> La3
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> La3
            java.lang.String r0 = "expected chunk size and optional extensions but was \""
            r11.<init>(r0)     // Catch: java.lang.NumberFormatException -> La3
            long r0 = r8.MediaBrowserCompatMediaItem     // Catch: java.lang.NumberFormatException -> La3
            r11.append(r0)     // Catch: java.lang.NumberFormatException -> La3
            r11.append(r10)     // Catch: java.lang.NumberFormatException -> La3
            java.lang.String r10 = "\""
            r11.append(r10)     // Catch: java.lang.NumberFormatException -> La3
            java.lang.String r10 = r11.toString()     // Catch: java.lang.NumberFormatException -> La3
            r9.<init>(r10)     // Catch: java.lang.NumberFormatException -> La3
            throw r9     // Catch: java.lang.NumberFormatException -> La3
        La3:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()
            java.net.ProtocolException r10 = new java.net.ProtocolException
            r10.<init>(r9)
            throw r10
        Lae:
            java.lang.String r9 = "closed"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o._get_brazeApiKey_lambda5.read(o.r8lambdaBEyrNr8p6809BwlBoRO_sTaNs, long):long");
    }
}
