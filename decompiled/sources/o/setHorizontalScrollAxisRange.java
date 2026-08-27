package o;

import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class setHorizontalScrollAxisRange extends Thread {
    private static long MediaDescriptionCompat;
    private static char[] read;
    private final int IconCompatParcelizer;
    private final int RemoteActionCompatParcelizer;
    private final int serializer;
    private final getHorizontalScrollAxisRange write;
    private static final byte[] $$c = {49, 116, -42, -81};
    private static final int $$d = 92;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {18, -47, -52, 27, -11, -2, 5, -3, -7, 13, -13};
    private static final int $$b = 133;
    private static int MediaSessionCompatQueueItem = 0;
    private static int MediaBrowserCompatMediaItem = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r6, short r7, byte r8) {
        /*
            int r7 = r7 * 4
            int r7 = 98 - r7
            int r8 = r8 + 4
            int r6 = r6 * 3
            int r0 = 1 - r6
            byte[] r1 = o.setHorizontalScrollAxisRange.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2e
        L17:
            r3 = r2
        L18:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r7 = -r7
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setHorizontalScrollAxisRange.$$e(short, short, byte):java.lang.String");
    }

    private static void b(byte b, int i, int i2, Object[] objArr) {
        int i3 = i2 + 4;
        int i4 = (b * 5) + 114;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[5 - i];
        int i5 = 4 - i;
        int i6 = -1;
        if (bArr == null) {
            i4 = (i3 + i4) - 2;
            i6 = -1;
        }
        while (true) {
            int i7 = i3;
            int i8 = i4;
            int i9 = i6 + 1;
            bArr2[i9] = (byte) i8;
            int i10 = i7 + 1;
            if (i9 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3 = i10;
                i4 = (i8 + bArr[i10]) - 2;
                i6 = i9;
            }
        }
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        rememberNestedScrollInteropConnection remembernestedscrollinteropconnection = new rememberNestedScrollInteropConnection();
        long[] jArr = new long[i];
        remembernestedscrollinteropconnection.read = 0;
        int i4 = $10 + 117;
        $11 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        while (remembernestedscrollinteropconnection.read < i) {
            int i6 = $10 + 39;
            $11 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            int i8 = remembernestedscrollinteropconnection.read;
            try {
                Object[] objArr2 = {Integer.valueOf(read[i2 + i8])};
                Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1215525465);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (50817 - android.graphics.Color.green(0)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2086, (Process.myPid() >> 22) + 14, -1734126664, false, $$e(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(MediaDescriptionCompat), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-2040246764);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (ImageFormat.getBitsPerPixel(0) + 1), TextUtils.indexOf("", "", 0, 0) + 197, 15 - View.combineMeasuredStates(0, 0), 1454665717, false, "c", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i8] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {remembernestedscrollinteropconnection, remembernestedscrollinteropconnection};
                Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(125004226);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (6914 - ImageFormat.getBitsPerPixel(0)), 159 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 17 - View.resolveSize(0, 0), -677165021, false, com.braze.Constants.BRAZE_PUSH_CONTENT_KEY, new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i];
        remembernestedscrollinteropconnection.read = 0;
        while (remembernestedscrollinteropconnection.read < i) {
            int i9 = $10 + 49;
            $11 = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                cArr[remembernestedscrollinteropconnection.read] = (char) jArr[remembernestedscrollinteropconnection.read];
                Object[] objArr5 = {remembernestedscrollinteropconnection, remembernestedscrollinteropconnection};
                Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(125004226);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (6915 - (Process.myPid() >> 22)), 159 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 18 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -677165021, false, com.braze.Constants.BRAZE_PUSH_CONTENT_KEY, new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                int i10 = 25 / 0;
            } else {
                cArr[remembernestedscrollinteropconnection.read] = (char) jArr[remembernestedscrollinteropconnection.read];
                Object[] objArr6 = {remembernestedscrollinteropconnection, remembernestedscrollinteropconnection};
                Object objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(125004226);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (6916 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 158 - TextUtils.lastIndexOf("", '0'), 16 - TextUtils.indexOf((CharSequence) "", '0'), -677165021, false, com.braze.Constants.BRAZE_PUSH_CONTENT_KEY, new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
            }
        }
        String str = new String(cArr);
        int i11 = $11 + 65;
        $10 = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i12 = i11 % 2;
        objArr[0] = str;
    }

    public setHorizontalScrollAxisRange(int i, getHorizontalScrollAxisRange gethorizontalscrollaxisrange, int i2, int i3) {
        this.serializer = i;
        this.write = gethorizontalscrollaxisrange;
        this.RemoteActionCompatParcelizer = i2;
        this.IconCompatParcelizer = i3;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 87041. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        /*
            Method dump skipped, instruction units count: 8704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setHorizontalScrollAxisRange.run():void");
    }

    static {
        char[] cArr = new char[1379];
        ByteBuffer.wrap("\u0099ó\rY°¼$\u000fËi~Ââ(\u0089?<Ê :W\u0092úènG\u0015\u0080¸ç,PÓ\u00adG\tê&\u0091ü\u0005#¨^_îÃ\u0018vµ\u001dÎ\u0081\u001c4¹ÛÁOsò\u0085f*\ry°\u0096$?ËX~õ!<µ\u0096\bs\u009cÀs¦Æ\rZç1ð\u0084\u0014\u0018àï_BdÖ \u00ad_\u0000/\u0094\u009fk{ÿÁR³)\u001b½í\u0010¼ç\u0001{ëÎD¥$\u0099ñ\rB°ª$\u000fËc~Åâ8\u0089P<Ê /W\u008cúìnM\u0015\u0092¸à,PÓ\u00adG\t\u0094x\u0000Ò½7)\u0084ÆâsIï£\u0084´1R\u00ad»Z\u0005÷zcÀ\u0018\u0016µk!\u009cÞ\nJ\u0083çí\u009cR\b\u0098¥èRC\u0098ë\fL±²%3Êy\u007fÖã9\u0088n=Ã¡$V³ûúo^\u0014\u008c¹í-BÒ®ÜóHYõ¼a\u000f\u008ei;Â§(Ì?yÙå0\u0012\u008e¿ñ+KP\u009dýài\u0017\u0096²\u0002\n¯&Ôý@\u0017íx\u001a×\u0086 3\u008dXêÄ\u001dq\u0094\u009eð\nB·£#\fH@3\u009b§<\u001aÂ\u008eZa\u0006Ô¶HV#\u001e\u0096¸\n]ýëP\u008fÄ\u0001¿í\u0012\u008a\u0086;yÅíj@\u0007;·¯q\u0002\u001aõ¼i\\\u0099â\rV°»$\u0016Ëg~Ìâ)\u0089_<Û 2W\u0085AÍÕgh\u0082ü1\u0013W¦ü:\u0016Q\u0001äçx\u000e\u008f°\"Ï¶uÍ£`Þô)\u000b\u008c\u009f42\u0018IÒÝ8pU\u0087î\u001b\u0016®·ÅÐY\u001aì¢\u0003Ï\u0097s*³¾9Õjh\u0086\u0099ñ\r[°¹$\u000eËu~åâ-\u0089|<ß\u0099ó\rY°¼$\u000fËi~Ââ(\u0089?<Ó 1W\u0094úàn@\u0015\u0087¸º,XÓ¡G\u0013êa\u0091Â\u0005\u0018¨5_ñÃ\u0000v£\u001dÁ\u0011M\u0085ç8\u0002¬±C×ö|j\u0096\u0001\u0081´g(\u008eß0rOæõ\u009d#0^¤©[5Ï·bÂ\u0019v\u008d¦ Ñp\u0001ä«YNÍý\"\u009b\u00970\u000bÚ`ÍÕ+IÂ¾|\u0013\u0003\u0087¹üoQ\u0012Åå:@®ø\u0003Ôx\rìáA\u009a¶!*ß\u009fnô\u0018hëÝi2\n¦¾È\\\\ûá\u0003u»\u009aß/m³\u0097ØÇm\\ñ\u009e\u0006)«E\u0099ñ\rX°µ$SËa~Äâ#\u0089v<Ö :WÎ|KèâU\u000fÁé.Ý\u009b\u007f\u0007\u0092lÙÙoE\u008c²>\u001f\u0011\u0099â\rD\u0080\u000e\u0014°Ö\u0082\u0099Ç\rc°\u009e$PË>\u0099÷\rO°±$\tË\f\u0099Ô\rV°±$\u0011Ëc~Ïâl\u0089e<Õ \u007fW\u0083ú÷nK\u0015\u0092¸à,\\ÓâG\u0006ê(\u0091Ý\u0005\u0004¨t_ßÃ$v\u0099\u001dü\u0081~\u0099ñ\rB°ª$\u000fËc~Åâ8\u0089P<Ù +W\u0089úónG\u0015\u0087¸í,mÓªG\u0015êm\u0091Ì\u0005\u0012\u0099õ\rR°¬$.Ë\u007f~Øâ8\u0089t<× \u001cW\u008fúënZ\u0015\u0096¸ì,M\u0099ó\rY°¼$\u000fËi~Ââ(\u0089?<Ê :W\u0092úènG\u0015\u0080¸ç,PÓ\u00adG\tê&\u0091ø\u0005%¨^_ãÃ\u0003v£\u001dÀ\u0081\u001d4°ÛÊOqò\u008df*\u0099ó\rY°¼$\u000fËi~Ââ(\u0089?<Ê :W\u0092úènG\u0015\u0080¸ç,PÓ\u00adG\tê&\u0091ø\u0005%¨^_ãÃ\u0007v£\u001dÁ\u0081\u00174°ÛÌOsò\u0096f \r|°\u0083\u000e/\u009a\u0086'k³\u008d\\¹é\u001buö\u001e½«\u000b7èÀZmuù\u009c\u0082L/?»\u0089D\u007fÐÑ}³\u0006\u0001\u0092\u0086?µÈ\u0007TíáY\u008a8\u0016ý£XL)Ø\u0092etñ\u0099\u009a¥'G³õ\\\u0097é9uÙ\u001e~«07×Àim\u0011ù©\u0082D/\u000e»¿DS&z²Ð\u000f5\u009b\u0086tàÁK]¡6¶\u0083C\u001f³è\u001bEaÑÎª\t\u0007n\u0093Ùl$ø\u0080U¯.mº±\u0017Æàp|\u009aÉ-¢C>\u008dÔ\u001a@°ýUiæ\u0086\u00803+¯ÁÄÖq#íÓ\u001a{·\u0001#®Xiõ\u000ea¹\u009eD\nà§ÏÜ\u0005HÜå±\u0012\u0010\u008eû;PP9Ì÷yY\u0096#\u0002\u009d¿b+Ò@\u0090ýaiÂ\u0086 3\u000e¯öÄ@\u0099ó\rY°¼$\u000fËi~Ââ(\u0089?<Ê :W\u0092úènG\u0015\u0080¸ç,PÓ\u00adG\tê&\u0091ë\u00059¨I_ùÃ\u0006v¸\u001dÀ\u0081\u00054»ÛÚO|ò\u0097f,\r`°\u0081$1Ë^~ãâ\u0014\u0089¨<ð \u000eW¾úßnv\u0015\u0097¸Ý,w\u0099ó\rY°¼$\u000fËi~Ââ(\u0089?<Ê :W\u0092úènG\u0015\u0080¸ç,PÓ\u00adG\tê&\u0091ÿ\u00053¨J_éÃ\u0004v¹\u001dÛ\u0081\u000f4¼ÛÐOpò\u0090f(\r~°\u009b$'ËM~çâ\b\u0089§<ð \u001dWºúÓáSuùÈ\u001c\\¯³É\u0006b\u009a\u0088ñ\u009fDjØ\u009a/2\u0082H\u0016çm ÀGTð«\r?©\u0092\u0086éE}\u009fÐÿ'Y»¾\u000e\u0005eyùµL\u0007£r7Â\u008a=\u001e\u0096uÅÈ>\\\u0096³ù\u0006I\u009a¼ñ\u001f\u0099ó\rY°¼$\u000fËi~Ââ(\u0089?<Ê :W\u0092úènG\u0015\u0080¸ç,PÓ\u00adG\tê&\u0091ý\u00059¨H_èÃ\u001ev¤\u001dÀ\u0081\u00044¼ÛØOjò\u0087f(\rf°\u009e$7ËS~õ\u0006ý\u0092W/²»\u0001TgáÌ}&\u00161£Ä?4È\u009ceæñI\u008a\u008e'é³^L£Ø\u0007u(\u000eñ\u009a=7TÀö\\\u0010é¡\u0082Ù\u001e\n«¾DÂÐcm\u008bù+\u0092c/\u008a»\"T\\áú}\u0004\u0016¥£ú\u0099ó\rY°¼$\u000fËi~Ââ(\u0089?<Ê :W\u0092úènG\u0015\u0080¸ç,PÓ\u00adG\tê&\u0091ú\u0005$¨R_èÃ\u0004vµ\u001dÊ\u0081\b4¡ÛÛOqò\u008af(\r~°\u0088$+ËI~éâ\u0019\u0089\u00ad<ö \u001f\u009bæ\u000fL²©&\u001aÉ||×à=\u008b*>ß¢/U\u0087øýlR\u0017\u0095ºò.EÑ¸E\u001cè3\u0093í\u00073ªJ]èÁ\u0000tº\u001fÅ\u0083\u00156¡ÙÈM}ð\u0090d;\u000fb²\u0091&2É_|úà\n\u008b±>ë¢\u001aU¾øÊle\u0017\u0088ºÃ.sÑ\u0093E6èQ\u0093é\u0007\u0011ªL]àþ%j\u008f×jCÙ¬¿\u0019\u0014\u0085þîé[\u001cÇì0D\u009d>\t\u0091rVß1K\u0086´{ ß\u008dðö=bïÏ\u009f8/¤Ð\u0011nz\u0016æÓSm¼\f(ª\u0095A\u0001új¶×WCç¬\u0088\u00195\b\r\u009c§!BµñZ\u0097ï<sÖ\u0018Á\u00ad-1ÏÆjk\u001eÿ¾\u0084y)D½¦B_Öí{\u009f\u0000<\u0094æ9ËÎ\u000eRðçW\u008c0\u0010â¥NJ?Þ\u009ecr÷Ö\u009c\u0082!nµÃZ§\u0099ó\rY°¼$\u000fËi~Ââ(\u0089?<Ó 1W\u0094úàn@\u0015\u0087¸º,XÓ¡G\u0013êa\u0091Â\u0005\u0018¨5_éÃ\bv®\u001dÐ\u0081\u00024°ÛÓOlò\u0092f,\rv\u0099ó\rY°¼$\u000fËi~Ââ(\u0089?<Ó 1W\u0094úàn@\u0015\u0087¸º,XÓ¡G\u0013êa\u0091Â\u0005\u0018¨5_ñÃ\u0018vµ\u001dß\u0081\u00114¶ÛÕObò\u0083f,\rm°\u0085$=ËM~êâ\n\u0089¯<ô \u001e\u0099ó\rY°¼$\u000fËi~Ââ(\u0089?<Ù 0W\u008eúñnK\u0015\u009d¸à,\u0017Ó²G\nê&\u0091ý\u0005\u0017¨x_×Ã v\u008d\u001dê\u0081\u001d4\u0094ÛðOBò£f\f\r@°ó$(Ë|~Åâ \u0089\u008d<Ö ?W¶úînC\u0015¡¸Õ,XÓ¸G\u0005êt\u0094\u0081\u0000-nØú\u007fG\u0081Ó\u0000<J\u0089å\u0015\n~]ËðW\u0017 ¾\rà\u0099lâ²OÝÛ}$\u0081°-\u001dufåò)_[¨ø4\u001f\u0081´êËv\u0012Ã¶,À\u0099ó\rY°¼$\u000fËi~Ââ(\u0089?<Ù 0W\u008eúñnK\u0015\u009d¸à,\u0017Ó²G\nê&\u0091ý\u0005\u0017¨x_×Ã v\u008d\u001dê\u0081\u001d4\u0094ÛðOBò£f\f\r@°ó$*Ëx~Õâ$\u0089\u0080<Ç ?W¶úînC\u0015¡¸Õ,XÓ¸G\u0005êt\u0099ã\rB°½$\u000fË\u007f~éâ>\u0089~<Û ;W\u0083úän]\u0015\u0087¸Æ,\\Ó¡G\u0002êa\u0091Û\u0005\u0013¨i_Ï\u0099ñ\rX°µ$SËa~Äâ#\u0089v<Ö :WÎúönO\u0015\u0095¸ñ,ZÓ§G\tê|\u0091È\u0005\u0004\u0099ó\rY°¼$\u000fËi~Ââ(\u0089?<Ù 0W\u008eúñnK\u0015\u009d¸à,\u0017Ó²G\nê&\u0091ý\u0005\u0017¨x_×Ã v\u008d\u001dê\u0081\u00194\u009bÛøOL\u0001\u009e\u0095,(×¼vS\u001dæ¦zF\u0011\n¤ 8qÏûb\u0089ö=\u008dä \u0099´4KÕßvr\u0018\t \u0099á\rR°ª$\u000bËo~Èâ)\u0089b»\n/¸\u0092Q\u0006òé\u0085\\7ÀÃ«\u0089\u001e#~\"ê\u008dWoÃÌ,£\u0099æ\r_°½$\u0010Ëc\u0004¨\u0090\u0002-ç¹TV2ã\u0099\u007fs\u0014d¡\u0091=aÊÉg³ó\u001c\u0088Û%¼±\u000bNöÚRw}\f´\u0098d5\u000eÂ£^Eëû\u0080\u009b\u001cI©ñF\u0096Ò=oÍûd\u0090 -Ï¹f\u0099ó\rY°¼$\u000fËi~Ââ(\u0089?<Ù 0W\u008eúñnK\u0015\u009d¸à,\u0017Ó²G\nê&\u0091þ\u0005\u0013¨i_ÊÃ(v\u0089\u001dê\u0081\u00194\u009bÛøOL\u0099â\rR°ª$\u0010Ëo~Øâ?\u0089x<Õ 1".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1379);
        read = cArr;
        MediaDescriptionCompat = -6593119384409600713L;
    }
}
