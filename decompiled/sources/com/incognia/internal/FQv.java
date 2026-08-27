package com.incognia.internal;

import android.content.Context;
import android.util.AtomicFile;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.io.TextStreamsKt;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.requestDisplayInAppMessagelambda4;
import o.sourceInformationContextOfdefault;

/* JADX INFO: loaded from: classes2.dex */
public final class FQv implements prc {
    public final String BGx;
    public final AtomicLong HQ;
    public final AtomicLong N;
    public final AtomicFile mbG;

    @Override // com.incognia.internal.prc
    public final void BGx(Map map) throws IOException {
        FileOutputStream fileOutputStreamStartWrite = this.mbG.startWrite();
        try {
            zQ zQVar = new zQ(fileOutputStreamStartWrite);
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(zQVar, StandardCharsets.UTF_8), 8192);
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (str2 == null) {
                    str2 = "";
                }
                StringBuilder sb = new StringBuilder();
                Charset charset = StandardCharsets.UTF_8;
                sb.append(URLEncoder.encode(str, charset.name()));
                sb.append('=');
                sb.append(URLEncoder.encode(str2, charset.name()));
                bufferedWriter.write(sb.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            this.mbG.finishWrite(fileOutputStreamStartWrite);
            try {
                this.HQ.addAndGet(zQVar.BGx.get());
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            this.mbG.failWrite(fileOutputStreamStartWrite);
            throw th;
        }
    }

    @Override // com.incognia.internal.prc
    public final Cmt HQ() {
        return new Cmt(this.BGx, this.mbG.getBaseFile().exists() ? this.mbG.getBaseFile().length() : 0L, this.N.getAndSet(0L), this.HQ.getAndSet(0L));
    }

    @Override // com.incognia.internal.prc
    public final LinkedHashMap N() throws FileNotFoundException {
        if (!this.mbG.getBaseFile().exists()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        FileInputStream fileInputStreamOpenRead = this.mbG.openRead();
        try {
            yy yyVar = new yy(fileInputStreamOpenRead);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(yyVar, StandardCharsets.UTF_8), 8192);
            try {
                for (String str : (requestDisplayInAppMessagelambda4) TextStreamsKt.write(bufferedReader)) {
                    int iWrite = hideCurrentlyDisplayingInAppMessage.write((CharSequence) str, '=', 0, false, 6);
                    if (iWrite >= 0) {
                        String strWrite = hideCurrentlyDisplayingInAppMessage.write(iWrite, str);
                        Charset charset = StandardCharsets.UTF_8;
                        String strDecode = URLDecoder.decode(strWrite, charset.name());
                        String strDecode2 = URLDecoder.decode(str.substring(iWrite + 1), charset.name());
                        if (strDecode2.length() == 0) {
                            strDecode2 = null;
                        }
                        linkedHashMap.put(strDecode, strDecode2);
                    }
                }
                bufferedReader.close();
                this.N.addAndGet(yyVar.BGx.get());
                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{fileInputStreamOpenRead, null}, sourceInformationContextOfdefault.read());
                return linkedHashMap;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{bufferedReader, th}, sourceInformationContextOfdefault.read());
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{fileInputStreamOpenRead, th3}, sourceInformationContextOfdefault.read());
                throw th4;
            }
        }
    }

    @Override // com.incognia.internal.prc
    public final boolean mbG() {
        return this.mbG.getBaseFile().exists();
    }

    public FQv(Context context, String str, String str2) {
        this.BGx = str2;
        AtomicFile atomicFile = new AtomicFile(new File(context.getFilesDir(), str));
        this.mbG = atomicFile;
        atomicFile.getBaseFile().toString();
        this.HQ = new AtomicLong(0L);
        this.N = new AtomicLong(0L);
    }

    @Override // com.incognia.internal.prc
    public final void BGx() {
        this.mbG.getBaseFile().delete();
    }
}
