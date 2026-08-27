package com.incognia.internal;

import android.content.Context;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
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
public final class ha implements prc {
    public final String BGx;
    public final AtomicLong HQ;
    public final AtomicLong N;
    public final File mbG;

    @Override // com.incognia.internal.prc
    public final void BGx(Map map) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(this.mbG, false);
        try {
            zQ zQVar = new zQ(fileOutputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(zQVar, StandardCharsets.UTF_8), 8192);
            try {
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
                bufferedWriter.close();
                this.HQ.addAndGet(zQVar.BGx.get());
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    int i = sourceInformationContextOfdefault.read();
                    int i2 = sourceInformationContextOfdefault.read();
                    int i3 = sourceInformationContextOfdefault.read();
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, i, i2, -871780639, sourceInformationContextOfdefault.read(), new Object[]{bufferedWriter, th}, i3);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                int i4 = sourceInformationContextOfdefault.read();
                int i5 = sourceInformationContextOfdefault.read();
                int i6 = sourceInformationContextOfdefault.read();
                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, i4, i5, -871780639, sourceInformationContextOfdefault.read(), new Object[]{fileOutputStream, th3}, i6);
                throw th4;
            }
        }
    }

    @Override // com.incognia.internal.prc
    public final Cmt HQ() {
        return new Cmt(this.BGx, this.mbG.exists() ? this.mbG.length() : 0L, this.N.getAndSet(0L), this.HQ.getAndSet(0L));
    }

    @Override // com.incognia.internal.prc
    public final LinkedHashMap N() throws IOException {
        if (!this.mbG.exists()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        FileInputStream fileInputStream = new FileInputStream(this.mbG);
        try {
            yy yyVar = new yy(fileInputStream);
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
                fileInputStream.close();
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
                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{fileInputStream, th3}, sourceInformationContextOfdefault.read());
                throw th4;
            }
        }
    }

    @Override // com.incognia.internal.prc
    public final boolean mbG() {
        return this.mbG.exists();
    }

    public ha(Context context, String str, String str2) {
        this.BGx = str2;
        File file = new File(context.getFilesDir(), str);
        this.mbG = file;
        file.toString();
        this.HQ = new AtomicLong(0L);
        this.N = new AtomicLong(0L);
    }

    @Override // com.incognia.internal.prc
    public final void BGx() {
        this.mbG.delete();
    }
}
