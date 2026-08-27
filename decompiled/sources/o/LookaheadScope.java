package o;

import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.measurement.internal.zzgz;
import com.google.android.gms.measurement.internal.zzpg;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class LookaheadScope implements Runnable {
    public final Object IconCompatParcelizer;
    public final Map MediaDescriptionCompat;
    public final String RatingCompat;
    public final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    public final URL read;
    public final /* synthetic */ androidx.compose.animation.core.TransitionState serializer;
    public final byte[] write;

    public LookaheadScope(zzgz zzgzVar, String str, URL url, byte[] bArr, Map map, LookaheadLayoutCoordinatesKt lookaheadLayoutCoordinatesKt) {
        Objects.requireNonNull(zzgzVar);
        this.serializer = zzgzVar;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        accessgetSystemNavigationDowncp.IconCompatParcelizer(url);
        this.read = url;
        this.write = bArr;
        this.IconCompatParcelizer = lookaheadLayoutCoordinatesKt;
        this.RatingCompat = str;
        this.MediaDescriptionCompat = map;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0237 A[Catch: all -> 0x025d, LOOP:2: B:112:0x0231->B:114:0x0237, LOOP_END, TryCatch #26 {all -> 0x025d, blocks: (B:111:0x022f, B:112:0x0231, B:114:0x0237, B:115:0x023b), top: B:176:0x022f }] */
    /* JADX WARN: Code duplicated, block: B:147:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:159:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:163:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x02e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x02a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x015a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x023b A[EDGE_INSN: B:196:0x023b->B:115:0x023b BREAK  A[LOOP:2: B:112:0x0231->B:114:0x0237], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0147  */
    /* JADX WARN: Code duplicated, block: B:83:0x0170  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 25, insn: 0x026b: MOVE (r18 I:??[OBJECT, ARRAY]) = (r25 I:??[OBJECT, ARRAY]), block:B:126:0x0269 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r22v6 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r27v0, types: [o.LookaheadScope] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v28, types: [int] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Throwable th;
        int i;
        OutputStream outputStream;
        ?? r22;
        IOException iOException;
        int responseCode;
        HttpURLConnection httpURLConnection;
        OutputStream outputStream2;
        ?? r25;
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates;
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4;
        OutputStream outputStream3;
        OutputStream outputStream4;
        HttpURLConnection httpURLConnection2;
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        int i2;
        Throwable th2;
        OutputStream outputStream5;
        ?? r4;
        ?? r5;
        OutputStream outputStream6;
        ?? r6;
        ?? r7;
        IOException iOException2;
        OutputStream outputStream7;
        ?? r8;
        ?? r9;
        ?? r10;
        InputStream inputStream2;
        Object obj = this.IconCompatParcelizer;
        int i3 = this.RemoteActionCompatParcelizer;
        byte[] bArr2 = this.write;
        ?? HasNext = this.MediaDescriptionCompat;
        URL url = this.read;
        androidx.compose.animation.core.TransitionState transitionState = this.serializer;
        String str = this.RatingCompat;
        int i4 = 0;
        if (i3 != 0) {
            NoOpSubcomposeSlotReusePolicy noOpSubcomposeSlotReusePolicy = (NoOpSubcomposeSlotReusePolicy) transitionState;
            LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) noOpSubcomposeSlotReusePolicy.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope222 = (LookaheadScopeKtLookaheadScope221) noOpSubcomposeSlotReusePolicy.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope5 = lookaheadScopeKtLookaheadScope221.MediaSessionCompatResultReceiverWrapper;
            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope5);
            lookaheadScopeKtLookaheadScope5.serializer();
            try {
                URLConnection uRLConnectionOpenConnection = url.openConnection();
                if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                    throw new IOException("Failed to obtain HTTP connection");
                }
                r6 = (HttpURLConnection) uRLConnectionOpenConnection;
                r6.setDefaultUseCaches(false);
                lookaheadScopeKtLookaheadScope222.getClass();
                r6.setConnectTimeout(60000);
                r6.setReadTimeout(61000);
                r6.setInstanceFollowRedirects(false);
                r6.setDoInput(true);
                if (HasNext != 0) {
                    try {
                        try {
                            Iterator it = HasNext.entrySet().iterator();
                            while (true) {
                                HasNext = it.hasNext();
                                if (HasNext == 0) {
                                    break;
                                }
                                Map.Entry entry = (Map.Entry) it.next();
                                r6.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            outputStream6 = null;
                            r9 = 0;
                            OutputStream outputStream8 = outputStream6;
                            th2 = th;
                            outputStream5 = outputStream8;
                            r4 = r9;
                            r5 = r6;
                            if (outputStream5 != null) {
                                try {
                                    outputStream5.close();
                                } catch (IOException e) {
                                    getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope222.ParcelableVolumeInfo;
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                    getlookaheaddelegate.serializer.serializer("Error closing HTTP compressed POST connection output stream. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str), e);
                                }
                            }
                            if (r5 != 0) {
                                r5.disconnect();
                            }
                            write(i4, null, null, r4);
                            throw th2;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        r10 = 0;
                        iOException2 = e;
                        outputStream7 = null;
                        r7 = r10;
                        r8 = r6;
                        if (outputStream7 != null) {
                            try {
                                outputStream7.close();
                            } catch (IOException e3) {
                                getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope222.ParcelableVolumeInfo;
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                                getlookaheaddelegate2.serializer.serializer("Error closing HTTP compressed POST connection output stream. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str), e3);
                            }
                        }
                        if (r8 != 0) {
                            r8.disconnect();
                        }
                        write(i4, iOException2, null, r7);
                    }
                }
                if (bArr2 != null) {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                        gZIPOutputStream.write(bArr2);
                        gZIPOutputStream.close();
                        byteArrayOutputStream2.close();
                        byte[] byteArray = byteArrayOutputStream2.toByteArray();
                        getLookaheadDelegate getlookaheaddelegate3 = lookaheadScopeKtLookaheadScope222.ParcelableVolumeInfo;
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                        zzgs zzgsVar = getlookaheaddelegate3.PlaybackStateCompat;
                        HasNext = byteArray.length;
                        zzgsVar.serializer(Integer.valueOf((int) HasNext), "Uploading data. size");
                        r6.setDoOutput(true);
                        r6.addRequestProperty("Content-Encoding", "gzip");
                        r6.setFixedLengthStreamingMode(HasNext);
                        r6.connect();
                        outputStream6 = r6.getOutputStream();
                        try {
                            outputStream6.write(byteArray);
                            outputStream6.close();
                        } catch (IOException e4) {
                            e = e4;
                            r7 = 0;
                            OutputStream outputStream9 = outputStream6;
                            iOException2 = e;
                            outputStream7 = outputStream9;
                            r8 = r6;
                            if (outputStream7 != null) {
                                outputStream7.close();
                            }
                            if (r8 != 0) {
                                r8.disconnect();
                            }
                            write(i4, iOException2, null, r7);
                        } catch (Throwable th4) {
                            th = th4;
                            r9 = 0;
                            OutputStream outputStream10 = outputStream6;
                            th2 = th;
                            outputStream5 = outputStream10;
                            r4 = r9;
                            r5 = r6;
                            if (outputStream5 != null) {
                                outputStream5.close();
                            }
                            if (r5 != 0) {
                                r5.disconnect();
                            }
                            write(i4, null, null, r4);
                            throw th2;
                        }
                    } catch (IOException e5) {
                        getLookaheadDelegate getlookaheaddelegate4 = lookaheadScopeKtLookaheadScope222.ParcelableVolumeInfo;
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                        getlookaheaddelegate4.serializer.serializer(e5, "Failed to gzip post request content");
                        throw e5;
                    }
                }
                int responseCode2 = r6.getResponseCode();
                try {
                    try {
                        Map<String, List<String>> headerFields = r6.getHeaderFields();
                        try {
                            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                            inputStream2 = r6.getInputStream();
                            try {
                                byte[] bArr3 = new byte[androidx.compose.ui.graphics.Fields.RotationZ];
                                while (true) {
                                    int i5 = inputStream2.read(bArr3);
                                    if (i5 <= 0) {
                                        byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                                        inputStream2.close();
                                        r6.disconnect();
                                        write(responseCode2, null, byteArray2, headerFields);
                                        return;
                                    }
                                    byteArrayOutputStream3.write(bArr3, 0, i5);
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                if (inputStream2 != null) {
                                    inputStream2.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            inputStream2 = null;
                        }
                    } catch (IOException e6) {
                        e = e6;
                        i4 = responseCode2;
                        r10 = 0;
                        iOException2 = e;
                        outputStream7 = null;
                        r7 = r10;
                        r8 = r6;
                        if (outputStream7 != null) {
                            outputStream7.close();
                        }
                        if (r8 != 0) {
                            r8.disconnect();
                        }
                        write(i4, iOException2, null, r7);
                    } catch (Throwable th7) {
                        th = th7;
                        i4 = responseCode2;
                        outputStream6 = null;
                        r9 = 0;
                        OutputStream outputStream11 = outputStream6;
                        th2 = th;
                        outputStream5 = outputStream11;
                        r4 = r9;
                        r5 = r6;
                        if (outputStream5 != null) {
                            outputStream5.close();
                        }
                        if (r5 != 0) {
                            r5.disconnect();
                        }
                        write(i4, null, null, r4);
                        throw th2;
                    }
                } catch (IOException e7) {
                    e = e7;
                    i4 = responseCode2;
                    r10 = HasNext;
                    iOException2 = e;
                    outputStream7 = null;
                    r7 = r10;
                    r8 = r6;
                    if (outputStream7 != null) {
                        outputStream7.close();
                    }
                    if (r8 != 0) {
                        r8.disconnect();
                    }
                    write(i4, iOException2, null, r7);
                } catch (Throwable th8) {
                    th = th8;
                    i4 = responseCode2;
                    outputStream6 = null;
                    r9 = HasNext;
                    OutputStream outputStream12 = outputStream6;
                    th2 = th;
                    outputStream5 = outputStream12;
                    r4 = r9;
                    r5 = r6;
                    if (outputStream5 != null) {
                        outputStream5.close();
                    }
                    if (r5 != 0) {
                        r5.disconnect();
                    }
                    write(i4, null, null, r4);
                    throw th2;
                }
            } catch (IOException e8) {
                e = e8;
                outputStream6 = null;
                r6 = 0;
            } catch (Throwable th9) {
                th2 = th9;
                outputStream5 = null;
                r4 = 0;
                r5 = 0;
            }
        } else {
            HttpURLConnection httpURLConnection3 = null;
            zzgz zzgzVar = (zzgz) transitionState;
            LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope223 = (LookaheadScopeKtLookaheadScope221) zzgzVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope224 = (LookaheadScopeKtLookaheadScope221) zzgzVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope6 = lookaheadScopeKtLookaheadScope223.MediaSessionCompatResultReceiverWrapper;
            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope6);
            lookaheadScopeKtLookaheadScope6.serializer();
            try {
                URLConnection uRLConnectionOpenConnection2 = url.openConnection();
                if (!(uRLConnectionOpenConnection2 instanceof HttpURLConnection)) {
                    throw new IOException("Failed to obtain HTTP connection");
                }
                httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection2;
                httpURLConnection.setDefaultUseCaches(false);
                lookaheadScopeKtLookaheadScope224.getClass();
                httpURLConnection.setConnectTimeout(60000);
                httpURLConnection.setReadTimeout(61000);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoInput(true);
                if (HasNext != 0) {
                    try {
                        for (Map.Entry entry2 : HasNext.entrySet()) {
                            httpURLConnection.addRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                        }
                    } catch (IOException e9) {
                        e = e9;
                        iOException = e;
                        responseCode = i4;
                        outputStream2 = null;
                        r25 = outputStream2;
                        if (outputStream2 != null) {
                            try {
                                outputStream2.close();
                            } catch (IOException e10) {
                                getLookaheadDelegate getlookaheaddelegate5 = lookaheadScopeKtLookaheadScope224.ParcelableVolumeInfo;
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate5);
                                getlookaheaddelegate5.serializer.serializer("Error closing HTTP compressed POST connection output stream. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str), e10);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        lookaheadScopeKtLookaheadScope4 = lookaheadScopeKtLookaheadScope224.MediaSessionCompatResultReceiverWrapper;
                        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
                        lookaheadLayoutCoordinates = new LookaheadLayoutCoordinates(this.RatingCompat, (LookaheadLayoutCoordinatesKt) obj, responseCode, iOException, (byte[]) null, (Map) r25);
                        lookaheadScopeKtLookaheadScope4.write((Runnable) lookaheadLayoutCoordinates);
                    } catch (Throwable th10) {
                        th = th10;
                        outputStream3 = null;
                        i = i4;
                        r22 = httpURLConnection3;
                        outputStream = outputStream3;
                        httpURLConnection3 = httpURLConnection;
                        th = th;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e11) {
                                getLookaheadDelegate getlookaheaddelegate6 = lookaheadScopeKtLookaheadScope224.ParcelableVolumeInfo;
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate6);
                                getlookaheaddelegate6.serializer.serializer("Error closing HTTP compressed POST connection output stream. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str), e11);
                            }
                        }
                        if (httpURLConnection3 != null) {
                            httpURLConnection3.disconnect();
                        }
                        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope7 = lookaheadScopeKtLookaheadScope224.MediaSessionCompatResultReceiverWrapper;
                        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope7);
                        lookaheadScopeKtLookaheadScope7.write((Runnable) new LookaheadLayoutCoordinates(this.RatingCompat, (LookaheadLayoutCoordinatesKt) obj, i, (IOException) null, (byte[]) null, (Map) r22));
                        throw th;
                    }
                }
                if (bArr2 != null) {
                    zzgz zzgzVar2 = zzgzVar.MediaSessionCompatToken.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                    zzpg.serializer(zzgzVar2);
                    byte[] bArrWrite = zzgzVar2.write(bArr2);
                    getLookaheadDelegate getlookaheaddelegate7 = lookaheadScopeKtLookaheadScope224.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate7);
                    zzgs zzgsVar2 = getlookaheaddelegate7.PlaybackStateCompat;
                    int length = bArrWrite.length;
                    zzgsVar2.serializer(Integer.valueOf(length), "Uploading data. size");
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                    httpURLConnection.setFixedLengthStreamingMode(length);
                    httpURLConnection.connect();
                    OutputStream outputStream13 = httpURLConnection.getOutputStream();
                    try {
                        outputStream13.write(bArrWrite);
                        outputStream13.close();
                        responseCode = httpURLConnection.getResponseCode();
                        try {
                            try {
                                Map<String, List<String>> headerFields2 = httpURLConnection.getHeaderFields();
                                try {
                                    byteArrayOutputStream = new ByteArrayOutputStream();
                                    inputStream = httpURLConnection.getInputStream();
                                    try {
                                        bArr = new byte[androidx.compose.ui.graphics.Fields.RotationZ];
                                        while (true) {
                                            i2 = inputStream.read(bArr);
                                            if (i2 > 0) {
                                                break;
                                            } else {
                                                byteArrayOutputStream.write(bArr, 0, i2);
                                            }
                                        }
                                        byte[] byteArray3 = byteArrayOutputStream.toByteArray();
                                        inputStream.close();
                                        httpURLConnection.disconnect();
                                        lookaheadScopeKtLookaheadScope4 = lookaheadScopeKtLookaheadScope224.MediaSessionCompatResultReceiverWrapper;
                                        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
                                        lookaheadLayoutCoordinates = new LookaheadLayoutCoordinates(this.RatingCompat, (LookaheadLayoutCoordinatesKt) obj, responseCode, (IOException) null, byteArray3, headerFields2);
                                    } catch (Throwable th11) {
                                        th = th11;
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    inputStream = null;
                                }
                            } catch (IOException e12) {
                                iOException = e12;
                                outputStream2 = null;
                                if (outputStream2 != null) {
                                    outputStream2.close();
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                lookaheadScopeKtLookaheadScope4 = lookaheadScopeKtLookaheadScope224.MediaSessionCompatResultReceiverWrapper;
                                LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
                                lookaheadLayoutCoordinates = new LookaheadLayoutCoordinates(this.RatingCompat, (LookaheadLayoutCoordinatesKt) obj, responseCode, iOException, (byte[]) null, (Map) r25);
                            } catch (Throwable th13) {
                                th = th13;
                                outputStream4 = null;
                                httpURLConnection3 = httpURLConnection2;
                                outputStream3 = outputStream4;
                                i4 = responseCode;
                                i = i4;
                                r22 = httpURLConnection3;
                                outputStream = outputStream3;
                                httpURLConnection3 = httpURLConnection;
                                th = th;
                                if (outputStream != null) {
                                    outputStream.close();
                                }
                                if (httpURLConnection3 != null) {
                                    httpURLConnection3.disconnect();
                                }
                                LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope8 = lookaheadScopeKtLookaheadScope224.MediaSessionCompatResultReceiverWrapper;
                                LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope8);
                                lookaheadScopeKtLookaheadScope8.write((Runnable) new LookaheadLayoutCoordinates(this.RatingCompat, (LookaheadLayoutCoordinatesKt) obj, i, (IOException) null, (byte[]) null, (Map) r22));
                                throw th;
                            }
                        } catch (IOException e13) {
                            e = e13;
                            i4 = responseCode;
                            iOException = e;
                            responseCode = i4;
                            outputStream2 = null;
                            r25 = outputStream2;
                            if (outputStream2 != null) {
                                outputStream2.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            lookaheadScopeKtLookaheadScope4 = lookaheadScopeKtLookaheadScope224.MediaSessionCompatResultReceiverWrapper;
                            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
                            lookaheadLayoutCoordinates = new LookaheadLayoutCoordinates(this.RatingCompat, (LookaheadLayoutCoordinatesKt) obj, responseCode, iOException, (byte[]) null, (Map) r25);
                        } catch (Throwable th14) {
                            th = th14;
                            i4 = responseCode;
                            outputStream3 = null;
                            i = i4;
                            r22 = httpURLConnection3;
                            outputStream = outputStream3;
                            httpURLConnection3 = httpURLConnection;
                            th = th;
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            if (httpURLConnection3 != null) {
                                httpURLConnection3.disconnect();
                            }
                            LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope9 = lookaheadScopeKtLookaheadScope224.MediaSessionCompatResultReceiverWrapper;
                            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope9);
                            lookaheadScopeKtLookaheadScope9.write((Runnable) new LookaheadLayoutCoordinates(this.RatingCompat, (LookaheadLayoutCoordinatesKt) obj, i, (IOException) null, (byte[]) null, (Map) r22));
                            throw th;
                        }
                    } catch (IOException e14) {
                        iOException = e14;
                        responseCode = 0;
                        r25 = 0;
                        outputStream2 = outputStream13;
                        if (outputStream2 != null) {
                            outputStream2.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        lookaheadScopeKtLookaheadScope4 = lookaheadScopeKtLookaheadScope224.MediaSessionCompatResultReceiverWrapper;
                        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
                        lookaheadLayoutCoordinates = new LookaheadLayoutCoordinates(this.RatingCompat, (LookaheadLayoutCoordinatesKt) obj, responseCode, iOException, (byte[]) null, (Map) r25);
                        lookaheadScopeKtLookaheadScope4.write((Runnable) lookaheadLayoutCoordinates);
                    } catch (Throwable th15) {
                        th = th15;
                        responseCode = 0;
                        outputStream4 = outputStream13;
                        outputStream3 = outputStream4;
                        i4 = responseCode;
                        i = i4;
                        r22 = httpURLConnection3;
                        outputStream = outputStream3;
                        httpURLConnection3 = httpURLConnection;
                        th = th;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnection3 != null) {
                            httpURLConnection3.disconnect();
                        }
                        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope10 = lookaheadScopeKtLookaheadScope224.MediaSessionCompatResultReceiverWrapper;
                        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope10);
                        lookaheadScopeKtLookaheadScope10.write((Runnable) new LookaheadLayoutCoordinates(this.RatingCompat, (LookaheadLayoutCoordinatesKt) obj, i, (IOException) null, (byte[]) null, (Map) r22));
                        throw th;
                    }
                } else {
                    responseCode = httpURLConnection.getResponseCode();
                    Map<String, List<String>> headerFields3 = httpURLConnection.getHeaderFields();
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    inputStream = httpURLConnection.getInputStream();
                    bArr = new byte[androidx.compose.ui.graphics.Fields.RotationZ];
                    while (true) {
                        i2 = inputStream.read(bArr);
                        if (i2 > 0) {
                            break;
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i2);
                    }
                    byte[] byteArray4 = byteArrayOutputStream.toByteArray();
                    inputStream.close();
                    httpURLConnection.disconnect();
                    lookaheadScopeKtLookaheadScope4 = lookaheadScopeKtLookaheadScope224.MediaSessionCompatResultReceiverWrapper;
                    LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
                    lookaheadLayoutCoordinates = new LookaheadLayoutCoordinates(this.RatingCompat, (LookaheadLayoutCoordinatesKt) obj, responseCode, (IOException) null, byteArray4, headerFields3);
                }
                lookaheadScopeKtLookaheadScope4.write((Runnable) lookaheadLayoutCoordinates);
            } catch (IOException e15) {
                iOException = e15;
                responseCode = 0;
                httpURLConnection = null;
                outputStream2 = null;
            } catch (Throwable th16) {
                th = th16;
                i = 0;
                outputStream = null;
                r22 = 0;
            }
        }
    }

    public void write(int i, IOException iOException, byte[] bArr, Map map) {
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = ((LookaheadScopeKtLookaheadScope221) ((NoOpSubcomposeSlotReusePolicy) this.serializer).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
        lookaheadScopeKtLookaheadScope4.write((Runnable) new AndroidCanvas(this, i, iOException, bArr, map));
    }

    public LookaheadScope(NoOpSubcomposeSlotReusePolicy noOpSubcomposeSlotReusePolicy, String str, URL url, byte[] bArr, HashMap map, getMeasurePolicy getmeasurepolicy) {
        Objects.requireNonNull(noOpSubcomposeSlotReusePolicy);
        this.serializer = noOpSubcomposeSlotReusePolicy;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        this.read = url;
        this.write = bArr;
        this.IconCompatParcelizer = getmeasurepolicy;
        this.RatingCompat = str;
        this.MediaDescriptionCompat = map;
    }
}
