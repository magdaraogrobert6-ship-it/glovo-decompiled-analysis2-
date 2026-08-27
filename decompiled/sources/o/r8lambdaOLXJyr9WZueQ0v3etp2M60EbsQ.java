package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Iterator;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambdaOLXJyr9WZueQ0v3etp2M60EbsQ extends coil3.ExtrasKt {
    public static boolean IconCompatParcelizer(File file) {
        r8lambdaLtU2JGjLk_lnexBelkBSfoEYe_Q r8lambdaltu2jgjlk_lnexbelkbsfoeye_q = r8lambdaLtU2JGjLk_lnexBelkBSfoEYe_Q.BOTTOM_UP;
        r8lambdaltu2jgjlk_lnexbelkbsfoeye_q.getClass();
        Iterator it = new r8lambdaDrmJdx1j9gjzqwvv4qL9c3NutF4(file, 0, r8lambdaltu2jgjlk_lnexbelkbsfoeye_q).iterator();
        while (true) {
            boolean z = true;
            while (true) {
                writeToParcel writetoparcel = (writeToParcel) it;
                if (!writetoparcel.hasNext()) {
                    return z;
                }
                File file2 = (File) writetoparcel.next();
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                        break;
                    }
                }
                z = false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        if (r2 > 0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.File RemoteActionCompatParcelizer(java.io.File r6, java.lang.String r7) {
        /*
            r6.getClass()
            r7.getClass()
            java.io.File r0 = new java.io.File
            r0.<init>(r7)
            java.lang.String r7 = r0.getPath()
            r7.getClass()
            char r1 = java.io.File.separatorChar
            r2 = 0
            r3 = 4
            int r4 = o.hideCurrentlyDisplayingInAppMessage.write(r7, r1, r2, r2, r3)
            r5 = 1
            if (r4 != 0) goto L3e
            int r4 = r7.length()
            if (r4 <= r5) goto L5c
            char r4 = r7.charAt(r5)
            if (r4 != r1) goto L5c
            r4 = 2
            int r4 = o.hideCurrentlyDisplayingInAppMessage.write(r7, r1, r4, r2, r3)
            if (r4 < 0) goto L5c
            int r4 = r4 + r5
            int r2 = o.hideCurrentlyDisplayingInAppMessage.write(r7, r1, r4, r2, r3)
            if (r2 < 0) goto L39
            int r2 = r2 + r5
            goto L5a
        L39:
            int r2 = r7.length()
            goto L5a
        L3e:
            r2 = 58
            if (r4 <= 0) goto L4d
            int r3 = r4 + (-1)
            char r3 = r7.charAt(r3)
            if (r3 != r2) goto L4d
            int r2 = r4 + 1
            goto L5a
        L4d:
            r3 = -1
            if (r4 != r3) goto L5d
            boolean r2 = o.hideCurrentlyDisplayingInAppMessage.write(r7, r2)
            if (r2 == 0) goto L5d
            int r2 = r7.length()
        L5a:
            if (r2 <= 0) goto L5d
        L5c:
            return r0
        L5d:
            java.lang.String r6 = r6.toString()
            r6.getClass()
            int r7 = r6.length()
            if (r7 != 0) goto L6b
            goto L71
        L6b:
            boolean r7 = o.hideCurrentlyDisplayingInAppMessage.write(r6, r1)
            if (r7 == 0) goto L86
        L71:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r0)
            java.lang.String r6 = r7.toString()
            java.io.File r7 = new java.io.File
            r7.<init>(r6)
            return r7
        L86:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r1)
            r7.append(r0)
            java.lang.String r6 = r7.toString()
            java.io.File r7 = new java.io.File
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdaOLXJyr9WZueQ0v3etp2M60EbsQ.RemoteActionCompatParcelizer(java.io.File, java.lang.String):java.io.File");
    }

    public static final void RemoteActionCompatParcelizer(FileOutputStream fileOutputStream, String str, Charset charset) throws IOException {
        fileOutputStream.getClass();
        str.getClass();
        charset.getClass();
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        charsetEncoderOnUnmappableCharacter.getClass();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())) * 8192);
        byteBufferAllocate.getClass();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int iMin = Math.min(8192 - i2, str.length() - i);
            int i3 = i + iMin;
            char[] cArrArray = charBufferAllocate.array();
            cArrArray.getClass();
            str.getChars(i, i3, cArrArray, i2);
            charBufferAllocate.limit(iMin + i2);
            i2 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i3 == str.length()).isUnderflow()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Check failed.");
                return;
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i2 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i = i3;
        }
    }

    public static String write(File file, Charset charset) {
        file.getClass();
        charset.getClass();
        InputStreamReader inputStreamReader = new InputStreamReader(getActiveFocusTargetNode.write(file, new FileInputStream(file)), charset);
        try {
            String strIconCompatParcelizer = TextStreamsKt.IconCompatParcelizer(inputStreamReader);
            inputStreamReader.close();
            return strIconCompatParcelizer;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                int i = sourceInformationContextOfdefault.read();
                int i2 = sourceInformationContextOfdefault.read();
                int i3 = sourceInformationContextOfdefault.read();
                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, i, i2, -871780639, sourceInformationContextOfdefault.read(), new Object[]{inputStreamReader, th}, i3);
                throw th2;
            }
        }
    }

    public static void write(File file, String str, Charset charset) {
        str.getClass();
        charset.getClass();
        FileOutputStream fileOutputStreamWrite = getPositionInRoot.write(new FileOutputStream(file), file);
        try {
            RemoteActionCompatParcelizer(fileOutputStreamWrite, str, charset);
            fileOutputStreamWrite.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                int i = sourceInformationContextOfdefault.read();
                int i2 = sourceInformationContextOfdefault.read();
                int i3 = sourceInformationContextOfdefault.read();
                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, i, i2, -871780639, sourceInformationContextOfdefault.read(), new Object[]{fileOutputStreamWrite, th}, i3);
                throw th2;
            }
        }
    }
}
