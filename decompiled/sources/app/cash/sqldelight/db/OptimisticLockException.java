package app.cash.sqldelight.db;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.ui.graphics.Fields;
import com.braze.Constants;
import com.huawei.hms.location.LocationRequest;
import com.huawei.location.gwi.util.GwiErrorCode;
import com.huawei.riemann.location.common.utils.Constant;
import com.roadrunner.rrds.compose.component.forms.TextInputBigV2Kt$MainText$1$1$1;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.rememberNestedScrollInteropConnection;
import o.setFontSizeR2X_6o;

/* JADX INFO: loaded from: classes4.dex */
public final class OptimisticLockException extends IllegalStateException {
    private static long RemoteActionCompatParcelizer;
    private static char[] write;
    private static final byte[] $$c = {13, -50, -112, -45};
    private static final int $$d = 59;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {89, -90, 60, -111, -19, -10, -3, -3, -13, 20, -6, 5};
    private static final int $$b = 207;
    private static int read = 0;
    private static int IconCompatParcelizer = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r6, short r7, short r8) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 98
            int r7 = r7 + 4
            int r8 = r8 * 3
            int r0 = 1 - r8
            byte[] r1 = app.cash.sqldelight.db.OptimisticLockException.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L17
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L2c:
            int r7 = r7 + r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: app.cash.sqldelight.db.OptimisticLockException.$$e(short, short, short):java.lang.String");
    }

    private static void a(byte b, short s, int i, Object[] objArr) {
        int i2 = (s * 39) + 75;
        int i3 = i + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[4 - b];
        int i4 = 3 - b;
        int i5 = -1;
        if (bArr == null) {
            i2 = i2 + i4 + 6;
        }
        while (true) {
            i5++;
            i3++;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2 = i2 + bArr[i3] + 6;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OptimisticLockException(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = IconCompatParcelizer;
            int i3 = i2 + 95;
            read = i3 % Fields.SpotShadowColor;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 33;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 5 % 5;
            } else {
                int i6 = 2 % 2;
            }
            th = null;
        }
        this(str, th);
    }

    public OptimisticLockException(String str, Throwable th) {
        super(str, th);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:38:0x01a6  */
    private static void b(int i, int i2, char c, Object[] objArr) throws Throwable {
        Throwable cause;
        int i3 = 2 % 2;
        rememberNestedScrollInteropConnection remembernestedscrollinteropconnection = new rememberNestedScrollInteropConnection();
        long[] jArr = new long[i];
        remembernestedscrollinteropconnection.read = 0;
        int i4 = $10 + 115;
        while (true) {
            $11 = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            if (remembernestedscrollinteropconnection.read >= i) {
                break;
            }
            int i6 = remembernestedscrollinteropconnection.read;
            try {
                Object[] objArr2 = {Integer.valueOf(write[i2 + i6])};
                Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1215525465);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (50817 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), Color.red(0) + 2087, 14 - View.getDefaultSize(0, 0), -1734126664, false, $$e(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(RemoteActionCompatParcelizer), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-2040246764);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 196, 14 - MotionEvent.axisFromString(""), 1454665717, false, "c", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {remembernestedscrollinteropconnection, remembernestedscrollinteropconnection};
                Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(125004226);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (6915 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 159 - KeyEvent.getDeadChar(0, 0), KeyEvent.getDeadChar(0, 0) + 17, -677165021, false, Constants.BRAZE_PUSH_CONTENT_KEY, new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                i4 = $10 + 41;
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i];
        remembernestedscrollinteropconnection.read = 0;
        while (remembernestedscrollinteropconnection.read < i) {
            int i7 = $10 + 119;
            $11 = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                cArr[remembernestedscrollinteropconnection.read] = (char) jArr[remembernestedscrollinteropconnection.read];
                Object[] objArr5 = {remembernestedscrollinteropconnection, remembernestedscrollinteropconnection};
                Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(125004226);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (6916 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 158 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 17 - TextUtils.indexOf("", ""), -677165021, false, Constants.BRAZE_PUSH_CONTENT_KEY, new Class[]{Object.class, Object.class});
                }
                Object obj = null;
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                obj.hashCode();
                throw null;
            }
            cArr[remembernestedscrollinteropconnection.read] = (char) jArr[remembernestedscrollinteropconnection.read];
            try {
                Object[] objArr6 = {remembernestedscrollinteropconnection, remembernestedscrollinteropconnection};
                Object objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(125004226);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (6914 - TextUtils.indexOf((CharSequence) "", '0')), 159 - View.combineMeasuredStates(0, 0), View.resolveSizeAndState(0, 0, 0) + 17, -677165021, false, Constants.BRAZE_PUSH_CONTENT_KEY, new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr);
    }

    static {
        char[] cArr = new char[2156];
        ByteBuffer.wrap("\u0099½rªOO[ð4Í\u00019\u001dÕözÃ\u0016ßÈ¨c\u0085\u0015\u0091ªjaFûS\u0092,68ü\u0015\u008fî5úÑ×A \t¼¦\u0089Sb\r~¯âR\tE4  \u001fO\"zÖf:\u008d\u0095¸ù¤'Ó\u008cþúêE\u0011\u008e=\u0005(pWÍC\u0004nZ\u0095Í\u0081=¬\u0083ÛöÇMò¹\u0099½rªOO[ð4Í\u00019\u001dÕözÃ\u0016ßÈ¨c\u0085\u0015\u0091ªjaFéS\u008f,<8í\u0099½r½OS[õ4Í\u00013\u001dÕörÃ\u0007ßÂ¨o\u0085I\u0091¥jQFöS\u0092,48ç\u0015\u0099î.úý×| \u001b¼¢\u0089Fb\u000b~¸K_\u007f\u001f\u0094\t©ü½GÒoç\u0098û\u007f\u0010\u009a% 9~NÇc´\u001dÙöÏË:ß\u0081°©\u0085I\u0099·r\u001fG8[º,\u001c\u0001m\u0015Ö¥ËNËs8g\u0093\bõ=Z!¨ÊOÿVã\u009e\u00941¹\u007f\u00adÂV-z¨oá\u0010P\u0004\u0099\u008b\u0080`\u0097]vIÏ&¾\u0013L\u000f©äHÑ?Íæº^\u00975\u0083\u0099xl\"2ÉsôÖà6\u008f_ºã¦\u001cMêxÒd\u0019\u0013¼>Æ*\u007fÑ\u0085ý,è{\u0097î\u00839®LUËA\u0014l¢\u001bÛ\u00075\u0099àr¡O\u0004[ä4\u008d\u00011\u001dÎö8Ã\u0000ßË¨n\u0085\u0014\u0091\u00adjWFþS©,<8ë\u0015\u009eî\u0019úÆ×p \t¼äQçºç\u0087\t\u0093¯üÌÉaÕ\u008d>c\u000bD\u0017\u009d`2M\u0013Yô¢\r\u008e¢\u009bÂäjðúÝÃ&s\u0099ðr§OM[è4\u008d\u0001&\u0015^þ^Ã°×\u0016¸u\u008dØ\u00914zÚOóS$$\u0087\tª\u001dOæ¸Ê\u0014ß` ç´ \u0099$bËv$[\u0090,ì0\u0018\u0005²îâòGÇ±«\u0013¼r\u0081Õ\u0099½r½OS[õ4\u0096\u0001;\u001d×ö9Ã\u0010ßÇ¨d\u0085I\u0091¬j[F÷S\u0083,\u00048Ã\u0015Çî6úÐ×q \n\u0099½r½OS[õ4\u0096\u0001;\u001d×ö9Ã\u001eßÇ¨h\u0085I\u0091®jWFøS\u0098,78ã\u0015\u009fî\u0010úï×n \b¼¹\u0089Bb@~¹KI\u0099½rªOO[ð4Í\u00010\u001dßö{Ã\u0007ßÉ¨\u007f\u0085\u0003\u0091±jJ\u0016ìý\u00adÀ\bÔè»\u009b\u008e;\u0092Úy~LPPÊ'i\n\u0019\u001eº\u0099ür«OK[õ4\u0087\u0001p\u001dÔösÃ\u0006Ë$ '\u001dÁ\tpf\u0018SèOE¤æ\u0091\u0087\u008dRúà×\u0086Ã(8Ó\u0014f\u0001\u0002~¸s\u0088\u0098ß¥3±\u0087ÞåëLêø\u0001¹<\u001c(îG\u0088r)nÆ\u0085{°\t¬ÂÛ<ö\u0013â»\u0019H5÷ \u0088_+Kõf\u0086\u009d+\u0089È¤cÓ\u0010\u009d1voK\u0080_;du\u008f<²Ï¦bÉ\u001cüºàY\u000b¯>\u0096\"@Uîxßl7\u0097Í»#®\u0005Ñ Å{è\b\u0013¶\u0007\u001b*î]\u009dA4t\u008b\u009f\u009f\u0083<¶ÚÚpÍ6ðªäQ\u000fð2\u0086&OIô|\u009b`-\u008bÈ¿s¢\u0000ÕË\u0099âr«OX[õ4\u008b\u0001-\u001dÎö8Ã\u0001ß×¨y\u0085H\u0091 jZF´S\u0092,78ì\u0015\u009fî!ú\u008c×y \n¼£\u0089\u001cb\b~«KM'ç0¡\r=\u0019ÆògÏ\u0011ÛÜ´c\u0081\f\u009dºvUBä\u0099âr«OX[õ4\u008b\u0001-\u001dÎö8Ã\u0001ß×¨y\u0085H\u0091 jZF´S\u0092,78ì\u0015\u009fî!ú\u008c×l \u0015¼ø\u0089Qb\u001f~£\u0099âr«OX[õ4\u008b\u0001-\u001dÎö8Ã\u0001ß×¨y\u0085H\u0091 jZF´S\u0092,78ì\u0015\u009fî!ú\u008c×l \u0015¼ø\u0089^b\u000f~©ÔÝ?\u0094\u0002g\u0016Êy´L\u0012Pñ»\u0007\u008e>\u0092èåFÈwÜ\u009f'e\u000b\u008b\u001e\u00ada\buÓX £\u001e·³\u009aSí*ñÇÄ`/23\u0096Q£ºê\u0087\u0019\u0093´üÊÉlÕ\u008f>y\u000b@\u0017\u0096`8M\tYá¢\u001b\u008eõ\u009bÓävð\u00adÝÞ&`2Í\u001f-hTt¹A\u001eªA¶è\u0099är¬OE[þ4\u0091\u00018\u0099Îr\u008fmÐ\u0086Ó»5¯\u0084Àìõ\u001céº\u0002\u00147{+¶\\\u000bqneÜ\u0097\n|BA«U\u0010:k\u000fÅ\u00131ø\u008bÍè3\u0007Ø\u0007åéñO\u009e,«\u0081·m\\\u0083i®uf\u0002Ñ/±;\u001dÀóìOù>\u0086\u0083\u0092\u001b¿'D\u0095Pv}À\n¯\u0016\u001b#ûÈùÔ\u0003áå\u008dK\u009a0§\u0085³aX÷e\u0087qu\u001eÎ+®7\u0001Üòè\u0002õ\"\u0082õ®B\u0099½r¸OO[è4\u0086\u00011\u001dÈö9Ã\u001eßÇ¨h\u0085P\u0091öj\u0011FòS\u0081,}8ï\u0015\u009fî\"úË×q T¼¦\u0089@b\u0007~§KG'ð0\u0087\rt\u0019Áò{Ï ÛÎ´i\u0081\u0015\u009d\u00adv\u0014Bå_\u009dEÿ®ú\u0093\r\u0087ªèÄÝsÁ\u008a*{\u001f\\\u0003\u0085t*Y\u0012M´¶S\u009a°\u008fÃð?ä¤Éß2g&\u008f\u000b1|H`ûU\u0003¾I¢ú\u0097Jû·ìÕÑvÅ\u0090.?\u0013{\u0007\u009bhj]SAó´¥_¥bKví\u0019\u008e,#0ÏÛ!î\u0006òß\u0085p¨H¼îG\tká~\u0082\u0001%\u0015ã8\u0096Ã\u0001×Ûúo\u008d\u0006\u0091¢¤uO\u001fS¼fJ\nÿ\u001d\u0094 $4Ïßiâ3ö\u009f\u0099}¬\n°¶[\foýr\u0085îC\u0005U8 ,\u001bC3vÉj*\u0081\u0081´ø¨\u007fß\u009dòöæU\u001d´1J$k[ÀO\u001fba\u0099Ü\u008d/ \u0085×öË^þ¥\u0015ó\tQ<öP\u000eGc\u0099Õr«OD[ÿ4\u008f\u00011\u001dÎö\u007fÃ\u001dßÀ\u0099çr OA[è4\u008d\u0001)\u001dÔ\u0099ñr¦OX[é4\u008f\u00017\u001dÏö{\u008f«dêYOM½\"Û\u0017z\u000b\u0095à(ÕZÉ\u0091¾o\u0093I\u0087ì|\u0003P¸EÞ:|\u0099är¬OE[þ4Ú\u0001h\u001dÊ\u0099õr«OD[ã4\u0090\u00017\u001dÙà\u009c\u000bÂ6-\"\u008aMùx^d°\u008f ºc¦ÿÑUM\u000e¦P\u009b¿\u008f\u0018àkÕÌÉ\"\"²\u0017ñ\u000bm|ÇQÂE\u000f¾ñ\u0099àr¡O\u0004[ö4\u0090\u00011\u001dÞöcÃ\u0011ßÚ¨$\u0085\u000b\u0091\u00adjZFÿS\u009a\u0099árªOAd\u0015\u008fA²½¦\bÉaüÈà7\u000b\u0086\u0099Ór¾OZ[¦4°\u0001+\u001dÔöbÃ\u001bßÃ¨o\u0085F\u0091¤jQFèSÖ,\u00118æ\u0015\u0098î)úÏ×{;aÐ\u0012íüùF\u0096?£\u0085¿lT\u0084a\u0093}X\nó'ô3\u0012ÈùäAñ(\u008e\u0094\u009a\u001c·>L\u009bXbu\u008c\u0002°\u001e\\+¶ø,\u0013_.±:\u000bUr`È|!\u0097É¢Þ¾\u0015É¾ä¹ð_\u000b´'\f2eMÙYQts\u008fÖ\u009b/¶ÁÁýÝ\u0011èû\u0003Î\u001f\u0003*í\u0099àr¡O\u0004[î4\u0083\u0001,\u001dÞöaÃ\u0013ßÜ¨oçà\f´1S%÷J\u0091\u007f\"cÜ\u0088k\u0099\u001frWO¾[\u00054!\u0001\u0093\u0099àr¯OD[å4\u008a\u0001+\u0099àr¡O\u0004[ö4\u0090\u00011\u001dÞöcÃ\u0011ßÚ¨$\u0085\u0004\u0091°j_FôS\u0092\u0099àr¡O\u0004[í4\u0087\u0001,\u001dÔösÃ\u001eß\u0080¨{\u0085\u0003\u0091¯jK\u0099£\u0099àr¡O\u0004[õ4\u0087\u0001=\u001dÏödÃ\u0017\u0099¢\u0099àr¡O\u0004[ä4\u0097\u00017\u001dÖörÃ\\ßÞ¨x\u0085\t\u0091¦jKFùS\u0082÷\u008e\u001cÁ!<5\u0090ZÇo\\sø\u0098Z\u0099àr¡O\u0004[ä4\u0097\u00017\u001dÖörÃ\\ßÈ¨c\u0085\b\u0091¥j[FèS\u0086, 8ç\u0015\u0084î2\u0099õr«OD[ã4\u0090\u00017\u001dÙö9Ã\u0001ßÊ¨a\u0085I\u0091¥j[FôS\u0093, 8ç\u0015\u0089èÎ\u0003\u0090>\u007f*ØE«p\flâ\u0087r²1®\u00adÙ\u0007ôrà\u008a\u001ba7Ê\"\u0092]\u0011I\u008ddç\u009fR\u008bþ¦@Ñ/Í\u0088ø{\u0013<\u000f\u0092:BVÁAý|W\u0099õr«OD[ã4\u0090\u00017\u001dÙö9Ã\u0015ßÁ¨e\u0085\u0001\u0091®j[FÅS\u0085,68å\u0015Åî!úÇ×p \u001f¼¤\u0089[b\r\u0099õr«OD[ã4\u0090\u00017\u001dÙö9Ã\u0004ßÌ¨e\u0085\u001e\u0091új\bFêSÙ,$8ì\u0015\u0085î>ú\u009a×( \n\u0099õr¡OE[á4\u008e\u0001;\u001d\u0095öeÃ\u0016ßÅ¨U\u0085\u0001\u0091²jVFõS\u0098,78Ñ\u0015\u0092î~ú\u0094×1 \u001d¼³\u0089\\b\u000b~¸KO'á0¡\r\"\u0019\u008eò$Ó38r\u0005×\u00117~^KâW\u001d¼©\u0089Î\u0095\u001câ½ÏÐÛc\u0099àr¡O\u0004[ä4\u008d\u00011\u001dÎö\u007fÃ\u001fßÏ¨m\u0085\u0003\u0091ìj\\FïS\u009f,>8ê\u0015Äî úË×p \u001d¼³\u0089@b\u001e~¸KO'ì0\u008a\u0099Ór ON[ô4\u008d\u00017\u001dÞö;Ã\nß\u0096¨<°\u0095[Ôfqr\u0091\u001dâ(B4£ß\u0007ê)ö¿\u0081\u0016¬`¸ÇC'o\u008ezú\u0005\t\u0011\u0092<û\u0099ær«OY[ò4Ï\u0099ûr OC[ò4Ì\u0001-\u001dÌöuÃ\\ßß¨o\u0085\u000b\u0091·j\u0013FêS\u0084,=8þ\u0015\u0099\u0099ãr«OG[ó4Ì\u00016\u001dÍö8Ã\u001fßÏ¨c\u0085\b\u0091©j[FãS\u0085\u0013Çø\u008fÅcÑ×¾è\u008b\t\u0097ø|\u001cI0Uë\"E\u000f'\u001b¹àyÌßÙ¿¦\u0013²Ø\u009f¯\u0099ãr«OG[ó4Ì\u0001-\u001dÜö8Ã\u001eßÍ¨n\u00859\u0091¦j[FôS\u0085,;8ú\u0015\u0093\u0099àr¡O\u0004[í4\u0087\u0001,\u001dÔösÃ\u001eß\u0080¨k\u0085\b\u0091¦jLFõS\u009f,68 \u0015\u009bî#úÏ×k \u001e\t\u0090âÑßtË\u0094¤ý\u0091A\u008d¾fHSsO»8\u0017\u0015c\u0001\u009cú/Ö\u009cÃâ¼}¨\u0090\u0085û~[j·\u0099àr¡O\u0004[é4\u0086\u00013\u001d\u0094ötÃ\u0007ßÇ¨f\u0085\u0002\u0091ìjXFóS\u0098,58ë\u0015\u0098î6úÐ×w \u0014¼¢\u0099àr¡O\u0004[ö4\u0090\u00011\u001dÞöcÃ\u0011ßÚ¨$\u0085\u0004\u0091·jWFöS\u0092,|8è\u0015\u0083î(úÅ×{ \b¼¦\u0089@b\u0007~¤KRó\u000b\u0018J%ï1\u001e^pkÆw%\u009c\u0098©ôµkÂ\u0083ïøû@\u0000¹,\u001593FßR\f\u007fo\u0084Ê\u0090,½\u0087ÊáÖOã°\bë\u0014U\u0099àr¡O\u0004[õ4\u009b\u0001-\u001dÎösÃ\u001fßñ¨o\u0085\u001e\u0091¶j\u0010FøS\u0083,;8â\u0015\u008eîhúÄ×w \u0014¼±\u0089Wb\u001c~ºKT'ë0\u0090\r.\u0099àr¡O\u0004[ð4\u0087\u00010\u001dÞöyÃ\u0000ß\u0080¨h\u0085\u0013\u0091«jRFþSØ,48ç\u0015\u0084î!úÇ×l \n¼¤\u0089[b\u0000~¾\u0017\u0082üÃÁfÕ\u0092ºå\u008fR\u0093¼x\u001bMbQ\u0093&\f\u000bh\u001fËä1ÈÖÝö¢E¶\u0085\u009bä`@tîY\u001a.q2Ú\u00077ìiðÚÅ4©\u0092¾õ\u0083V\u0097 \u0099ºVr½\"\u0099¨bïØ¦3±\u000eT\u001aëuÖ@4\\Ä·`\u0082\u001c\u009eêéaÄ\u0014Ð©+@^ µ7\u0088Ò\u009cmóPÆ°ÚH1è\u0004\u0084\u0018VoãBÔV=\u00adÂ\u0081t\u0094\u000eë\u00adÿrÒ\u0019)¿=`\u0010äg\u0082{%NÖ¥\u0097\u0099½rªOO[ð4Í\u0001-\u001dÕöuÃ\u0019ßË¨~\u0085I\u0091¥j[FôS\u008f,6ò/\u00198$Ý0b__j¿vG\u009dç¨\u008b´YÃìîÛú!\u0001É-e8\u0011G¤1\u001cÚ\u001cçòóT\u009cl©\u008eµ~^Úk¦wP\u0000ß-µ9\u0002Âüî^\u0099½r½OS[õ4\u0096\u0001;\u001d×ö9Ã\u001eßÇ¨h\u0085I\u0091®jWFøS\u0095,\r8ã\u0015\u008bî*úÎ×q \u0019¼\u0089\u0089Vb\u000b~¨KS'å0¡\r+\u0019Óò\u007fÏ;Û\u0084´u\u0081\r\u0099½rªOO[ð4Í\u0001<\u001dÉöbÃ-ßÉ¨z\u0085\u0015\u0099½rªOO[ð4Í\u0001<\u001dÉöbÃ-ßÚ¨c\u0085\u000b\u0091§\u0010\u000eû\u0019ÆüÒC½~\u0088\u009e\u0094f\u007fÆJªVx!Í\fú\u0018\u0013ãþÏ]Ú#¥\u008e±Q\u009c=g\u0090sc^É\u0099½r½OS[õ4\u0096\u0001;\u001d×ö9Ã\u001eßÇ¨h\u0085I\u0091®jWFøS\u0094,!8ú\u0015\u008cî)úÎ×z \u001f¼¤\u0089mb\u0004~¤KO'¬0\u008d\r5\u0099½rªOO[ð4Í\u0001<\u001dÉöbÃ\u0013ßÍ¨i\u0085\u0003¨þCé~\fj³\u0005\u008e0\u007f,\u008aÇ!òVî\u0094\u0099;´J{è\u0090ÿ\u00ad\u001a¹¥Ö\u0098ãiÿ\u009c\u00147!J=\u009eJ8g]\u0099½rªOO[ð4Í\u0001<\u001dÉöbÃ\u001dßÜ¨c\u0085\u0003Gò¬å\u0091\u0000\u0085¿ê\u0082ßsÃ\u0086(-\u001dK\u0001\u008cv6[N\u0013AøVÅ³Ñ\f¾1\u008bÀ\u00975|\u009eIþU5\"\u0097\u000fó\u001bNà¡\u0099½rªOO[ð4Í\u0001<\u001dÉöbÃ-ßÇ¨g\u0085\u0003NE¥R\u0098³\u008c\nã{Ö\u0089Ê&!\u0081\u0014ý\b8\u007f\u009eRñF[½¢\u0091\u0011\u0084!û\u0084ï\u000eÂp9\u0091-8\u0000\u0095wökE\u0092¡y¿DXPî?Ñ\n5\u0016ÏýdÈ\nÔÝ£a\u008e\t\u009aña`MõX\u009e'\u001d3ú\u001e\u0097å(ñÛÜf« ·¥\u0082Bi\u0016u³@H\u0099½r¾OX[é4\u0081\u0001q\u001dÓöyÃ\u0002ßÁ¨x\u0085\u0012\u0091±\u0099¢r¨OL[¦4Ø\u0099½r¾OX[é4\u0081\u0001q\u001dÉösÃ\u001eßÈ¨%\u0085\u000b\u0091£jNFé\u0007mì$ÑÓÅrª\u0016\u009f©\u0083Ah ]\u008dAY6þ\u001b\u009a\u000f<ôÏØqÍ\u0006²ä¦e\u008b\u001d%NÎ\u0017óøçq\u0088\u001e½«¡YJù\u007f cm\u0014Î9ø-\u0001Öá\u0099½r«O^[å4Í\u00013\u001dßörÃ\u001bßÏ¨U\u0085\u0005\u0091\u00adjZFÿS\u0095,!8 \u0015\u0092î+úÎT\u008b¿Ù\u0082$\u0096\u0098ùêÌQÐ ;\u000e\u000eb\u0012¦aÙ\u008aÏ·:£\u0081Ì©ùWå±\u000e\u0007;x'¾P\u001d\u0099½rªOK[ò4\u0083\u0001q\u001dÞöyÃ\u0005ßÀ¨f\u0085\t\u0091£jZFéSÙ,|8ê\u0015\u009aîiúÃ×n \n¼¥\u0089\u001cb\u0016~§KJzÑ\u0091Ò¬4¸\u0085×íâ\u001dþµ\u0015\n k<«K\bflrÁ\u0099:rNO©[\r4k\u0001Ø\u001d&ö\u0091*7Á üÁèx\u0087\t²û®]Eõp\u008blG\u001b¯6\u009c\":ÙÛõvà\u0015\u009f´\u008ba¦\u0013]ãIKdá\u0013\u0082\u000fs:\u0088ÑËÍ#øÃ\u0094e\u0083Z¾½ªUAû|¶hO\u0007ú2\u0081.&ÅÄñ2ì\u0015\u009bÁ·m¢\u0019Y¡uY`õ".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2156);
        write = cArr;
        RemoteActionCompatParcelizer = -9085334696516029746L;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0cbd A[Catch: all -> 0x0235, TryCatch #1 {all -> 0x0235, blocks: (B:10:0x012c, B:12:0x0139, B:13:0x0174, B:25:0x02e7, B:27:0x02f4, B:28:0x0333, B:35:0x046d, B:37:0x047a, B:38:0x04af, B:68:0x0755, B:70:0x075b, B:71:0x078f, B:73:0x08a8, B:75:0x08b7, B:76:0x08ff, B:81:0x0a63, B:83:0x0a70, B:84:0x0ab4, B:91:0x0ba8, B:93:0x0bb5, B:94:0x0bf9, B:101:0x0cb0, B:103:0x0cbd, B:104:0x0cfc, B:110:0x0e33, B:112:0x0e40, B:113:0x0e84, B:127:0x1030, B:129:0x103d, B:130:0x1082, B:178:0x133c, B:180:0x1349, B:181:0x1385, B:192:0x14af, B:194:0x14bc, B:195:0x14fd, B:197:0x158f, B:200:0x159e, B:202:0x15b7, B:203:0x15f1, B:206:0x168d, B:208:0x169f, B:209:0x16df, B:215:0x17df, B:217:0x17ec, B:218:0x182b, B:221:0x183e, B:223:0x1855, B:224:0x1898, B:262:0x26e8, B:264:0x26f5, B:265:0x2739, B:282:0x2c96, B:284:0x2ca3, B:285:0x2ce0, B:354:0x347f, B:356:0x348c, B:357:0x34c5, B:291:0x2dc6, B:293:0x2dd3, B:294:0x2e16, B:268:0x2745, B:270:0x275d, B:271:0x27a4, B:233:0x24ef, B:235:0x24fc, B:237:0x254a, B:198:0x1597, B:48:0x0643, B:50:0x0650, B:51:0x068f, B:57:0x06dd, B:59:0x06ea, B:60:0x0726), top: B:374:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0d9a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0da1  */
    /* JADX WARN: Code duplicated, block: B:112:0x0e40 A[Catch: all -> 0x0235, TryCatch #1 {all -> 0x0235, blocks: (B:10:0x012c, B:12:0x0139, B:13:0x0174, B:25:0x02e7, B:27:0x02f4, B:28:0x0333, B:35:0x046d, B:37:0x047a, B:38:0x04af, B:68:0x0755, B:70:0x075b, B:71:0x078f, B:73:0x08a8, B:75:0x08b7, B:76:0x08ff, B:81:0x0a63, B:83:0x0a70, B:84:0x0ab4, B:91:0x0ba8, B:93:0x0bb5, B:94:0x0bf9, B:101:0x0cb0, B:103:0x0cbd, B:104:0x0cfc, B:110:0x0e33, B:112:0x0e40, B:113:0x0e84, B:127:0x1030, B:129:0x103d, B:130:0x1082, B:178:0x133c, B:180:0x1349, B:181:0x1385, B:192:0x14af, B:194:0x14bc, B:195:0x14fd, B:197:0x158f, B:200:0x159e, B:202:0x15b7, B:203:0x15f1, B:206:0x168d, B:208:0x169f, B:209:0x16df, B:215:0x17df, B:217:0x17ec, B:218:0x182b, B:221:0x183e, B:223:0x1855, B:224:0x1898, B:262:0x26e8, B:264:0x26f5, B:265:0x2739, B:282:0x2c96, B:284:0x2ca3, B:285:0x2ce0, B:354:0x347f, B:356:0x348c, B:357:0x34c5, B:291:0x2dc6, B:293:0x2dd3, B:294:0x2e16, B:268:0x2745, B:270:0x275d, B:271:0x27a4, B:233:0x24ef, B:235:0x24fc, B:237:0x254a, B:198:0x1597, B:48:0x0643, B:50:0x0650, B:51:0x068f, B:57:0x06dd, B:59:0x06ea, B:60:0x0726), top: B:374:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:116:0x0eb5  */
    /* JADX WARN: Code duplicated, block: B:119:0x0ed7  */
    /* JADX WARN: Code duplicated, block: B:121:0x0ef8  */
    /* JADX WARN: Code duplicated, block: B:122:0x0eff  */
    /* JADX WARN: Code duplicated, block: B:126:0x102e  */
    /* JADX WARN: Code duplicated, block: B:129:0x103d A[Catch: all -> 0x0235, TryCatch #1 {all -> 0x0235, blocks: (B:10:0x012c, B:12:0x0139, B:13:0x0174, B:25:0x02e7, B:27:0x02f4, B:28:0x0333, B:35:0x046d, B:37:0x047a, B:38:0x04af, B:68:0x0755, B:70:0x075b, B:71:0x078f, B:73:0x08a8, B:75:0x08b7, B:76:0x08ff, B:81:0x0a63, B:83:0x0a70, B:84:0x0ab4, B:91:0x0ba8, B:93:0x0bb5, B:94:0x0bf9, B:101:0x0cb0, B:103:0x0cbd, B:104:0x0cfc, B:110:0x0e33, B:112:0x0e40, B:113:0x0e84, B:127:0x1030, B:129:0x103d, B:130:0x1082, B:178:0x133c, B:180:0x1349, B:181:0x1385, B:192:0x14af, B:194:0x14bc, B:195:0x14fd, B:197:0x158f, B:200:0x159e, B:202:0x15b7, B:203:0x15f1, B:206:0x168d, B:208:0x169f, B:209:0x16df, B:215:0x17df, B:217:0x17ec, B:218:0x182b, B:221:0x183e, B:223:0x1855, B:224:0x1898, B:262:0x26e8, B:264:0x26f5, B:265:0x2739, B:282:0x2c96, B:284:0x2ca3, B:285:0x2ce0, B:354:0x347f, B:356:0x348c, B:357:0x34c5, B:291:0x2dc6, B:293:0x2dd3, B:294:0x2e16, B:268:0x2745, B:270:0x275d, B:271:0x27a4, B:233:0x24ef, B:235:0x24fc, B:237:0x254a, B:198:0x1597, B:48:0x0643, B:50:0x0650, B:51:0x068f, B:57:0x06dd, B:59:0x06ea, B:60:0x0726), top: B:374:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:150:0x11ac  */
    /* JADX WARN: Code duplicated, block: B:151:0x11ae  */
    /* JADX WARN: Code duplicated, block: B:155:0x11c9  */
    /* JADX WARN: Code duplicated, block: B:156:0x11cd  */
    /* JADX WARN: Code duplicated, block: B:158:0x1234  */
    /* JADX WARN: Code duplicated, block: B:160:0x1240  */
    /* JADX WARN: Code duplicated, block: B:164:0x1276 A[Catch: IOException -> 0x1290, TryCatch #3 {IOException -> 0x1290, blocks: (B:162:0x1246, B:164:0x1276, B:166:0x127c), top: B:378:0x1246 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x127b  */
    /* JADX WARN: Code duplicated, block: B:168:0x1285  */
    /* JADX WARN: Code duplicated, block: B:169:0x128b  */
    /* JADX WARN: Code duplicated, block: B:171:0x1290  */
    /* JADX WARN: Code duplicated, block: B:174:0x12a5  */
    /* JADX WARN: Code duplicated, block: B:177:0x133a  */
    /* JADX WARN: Code duplicated, block: B:180:0x1349 A[Catch: all -> 0x0235, TryCatch #1 {all -> 0x0235, blocks: (B:10:0x012c, B:12:0x0139, B:13:0x0174, B:25:0x02e7, B:27:0x02f4, B:28:0x0333, B:35:0x046d, B:37:0x047a, B:38:0x04af, B:68:0x0755, B:70:0x075b, B:71:0x078f, B:73:0x08a8, B:75:0x08b7, B:76:0x08ff, B:81:0x0a63, B:83:0x0a70, B:84:0x0ab4, B:91:0x0ba8, B:93:0x0bb5, B:94:0x0bf9, B:101:0x0cb0, B:103:0x0cbd, B:104:0x0cfc, B:110:0x0e33, B:112:0x0e40, B:113:0x0e84, B:127:0x1030, B:129:0x103d, B:130:0x1082, B:178:0x133c, B:180:0x1349, B:181:0x1385, B:192:0x14af, B:194:0x14bc, B:195:0x14fd, B:197:0x158f, B:200:0x159e, B:202:0x15b7, B:203:0x15f1, B:206:0x168d, B:208:0x169f, B:209:0x16df, B:215:0x17df, B:217:0x17ec, B:218:0x182b, B:221:0x183e, B:223:0x1855, B:224:0x1898, B:262:0x26e8, B:264:0x26f5, B:265:0x2739, B:282:0x2c96, B:284:0x2ca3, B:285:0x2ce0, B:354:0x347f, B:356:0x348c, B:357:0x34c5, B:291:0x2dc6, B:293:0x2dd3, B:294:0x2e16, B:268:0x2745, B:270:0x275d, B:271:0x27a4, B:233:0x24ef, B:235:0x24fc, B:237:0x254a, B:198:0x1597, B:48:0x0643, B:50:0x0650, B:51:0x068f, B:57:0x06dd, B:59:0x06ea, B:60:0x0726), top: B:374:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:185:0x142d A[LOOP:4: B:175:0x1337->B:185:0x142d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:191:0x14ad  */
    /* JADX WARN: Code duplicated, block: B:194:0x14bc A[Catch: all -> 0x0235, TryCatch #1 {all -> 0x0235, blocks: (B:10:0x012c, B:12:0x0139, B:13:0x0174, B:25:0x02e7, B:27:0x02f4, B:28:0x0333, B:35:0x046d, B:37:0x047a, B:38:0x04af, B:68:0x0755, B:70:0x075b, B:71:0x078f, B:73:0x08a8, B:75:0x08b7, B:76:0x08ff, B:81:0x0a63, B:83:0x0a70, B:84:0x0ab4, B:91:0x0ba8, B:93:0x0bb5, B:94:0x0bf9, B:101:0x0cb0, B:103:0x0cbd, B:104:0x0cfc, B:110:0x0e33, B:112:0x0e40, B:113:0x0e84, B:127:0x1030, B:129:0x103d, B:130:0x1082, B:178:0x133c, B:180:0x1349, B:181:0x1385, B:192:0x14af, B:194:0x14bc, B:195:0x14fd, B:197:0x158f, B:200:0x159e, B:202:0x15b7, B:203:0x15f1, B:206:0x168d, B:208:0x169f, B:209:0x16df, B:215:0x17df, B:217:0x17ec, B:218:0x182b, B:221:0x183e, B:223:0x1855, B:224:0x1898, B:262:0x26e8, B:264:0x26f5, B:265:0x2739, B:282:0x2c96, B:284:0x2ca3, B:285:0x2ce0, B:354:0x347f, B:356:0x348c, B:357:0x34c5, B:291:0x2dc6, B:293:0x2dd3, B:294:0x2e16, B:268:0x2745, B:270:0x275d, B:271:0x27a4, B:233:0x24ef, B:235:0x24fc, B:237:0x254a, B:198:0x1597, B:48:0x0643, B:50:0x0650, B:51:0x068f, B:57:0x06dd, B:59:0x06ea, B:60:0x0726), top: B:374:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:198:0x1597 A[Catch: all -> 0x0235, LOOP:5: B:189:0x14aa->B:198:0x1597, LOOP_END, TryCatch #1 {all -> 0x0235, blocks: (B:10:0x012c, B:12:0x0139, B:13:0x0174, B:25:0x02e7, B:27:0x02f4, B:28:0x0333, B:35:0x046d, B:37:0x047a, B:38:0x04af, B:68:0x0755, B:70:0x075b, B:71:0x078f, B:73:0x08a8, B:75:0x08b7, B:76:0x08ff, B:81:0x0a63, B:83:0x0a70, B:84:0x0ab4, B:91:0x0ba8, B:93:0x0bb5, B:94:0x0bf9, B:101:0x0cb0, B:103:0x0cbd, B:104:0x0cfc, B:110:0x0e33, B:112:0x0e40, B:113:0x0e84, B:127:0x1030, B:129:0x103d, B:130:0x1082, B:178:0x133c, B:180:0x1349, B:181:0x1385, B:192:0x14af, B:194:0x14bc, B:195:0x14fd, B:197:0x158f, B:200:0x159e, B:202:0x15b7, B:203:0x15f1, B:206:0x168d, B:208:0x169f, B:209:0x16df, B:215:0x17df, B:217:0x17ec, B:218:0x182b, B:221:0x183e, B:223:0x1855, B:224:0x1898, B:262:0x26e8, B:264:0x26f5, B:265:0x2739, B:282:0x2c96, B:284:0x2ca3, B:285:0x2ce0, B:354:0x347f, B:356:0x348c, B:357:0x34c5, B:291:0x2dc6, B:293:0x2dd3, B:294:0x2e16, B:268:0x2745, B:270:0x275d, B:271:0x27a4, B:233:0x24ef, B:235:0x24fc, B:237:0x254a, B:198:0x1597, B:48:0x0643, B:50:0x0650, B:51:0x068f, B:57:0x06dd, B:59:0x06ea, B:60:0x0726), top: B:374:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:202:0x15b7 A[Catch: all -> 0x0235, TryCatch #1 {all -> 0x0235, blocks: (B:10:0x012c, B:12:0x0139, B:13:0x0174, B:25:0x02e7, B:27:0x02f4, B:28:0x0333, B:35:0x046d, B:37:0x047a, B:38:0x04af, B:68:0x0755, B:70:0x075b, B:71:0x078f, B:73:0x08a8, B:75:0x08b7, B:76:0x08ff, B:81:0x0a63, B:83:0x0a70, B:84:0x0ab4, B:91:0x0ba8, B:93:0x0bb5, B:94:0x0bf9, B:101:0x0cb0, B:103:0x0cbd, B:104:0x0cfc, B:110:0x0e33, B:112:0x0e40, B:113:0x0e84, B:127:0x1030, B:129:0x103d, B:130:0x1082, B:178:0x133c, B:180:0x1349, B:181:0x1385, B:192:0x14af, B:194:0x14bc, B:195:0x14fd, B:197:0x158f, B:200:0x159e, B:202:0x15b7, B:203:0x15f1, B:206:0x168d, B:208:0x169f, B:209:0x16df, B:215:0x17df, B:217:0x17ec, B:218:0x182b, B:221:0x183e, B:223:0x1855, B:224:0x1898, B:262:0x26e8, B:264:0x26f5, B:265:0x2739, B:282:0x2c96, B:284:0x2ca3, B:285:0x2ce0, B:354:0x347f, B:356:0x348c, B:357:0x34c5, B:291:0x2dc6, B:293:0x2dd3, B:294:0x2e16, B:268:0x2745, B:270:0x275d, B:271:0x27a4, B:233:0x24ef, B:235:0x24fc, B:237:0x254a, B:198:0x1597, B:48:0x0643, B:50:0x0650, B:51:0x068f, B:57:0x06dd, B:59:0x06ea, B:60:0x0726), top: B:374:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:206:0x168d A[Catch: all -> 0x0235, TRY_ENTER, TryCatch #1 {all -> 0x0235, blocks: (B:10:0x012c, B:12:0x0139, B:13:0x0174, B:25:0x02e7, B:27:0x02f4, B:28:0x0333, B:35:0x046d, B:37:0x047a, B:38:0x04af, B:68:0x0755, B:70:0x075b, B:71:0x078f, B:73:0x08a8, B:75:0x08b7, B:76:0x08ff, B:81:0x0a63, B:83:0x0a70, B:84:0x0ab4, B:91:0x0ba8, B:93:0x0bb5, B:94:0x0bf9, B:101:0x0cb0, B:103:0x0cbd, B:104:0x0cfc, B:110:0x0e33, B:112:0x0e40, B:113:0x0e84, B:127:0x1030, B:129:0x103d, B:130:0x1082, B:178:0x133c, B:180:0x1349, B:181:0x1385, B:192:0x14af, B:194:0x14bc, B:195:0x14fd, B:197:0x158f, B:200:0x159e, B:202:0x15b7, B:203:0x15f1, B:206:0x168d, B:208:0x169f, B:209:0x16df, B:215:0x17df, B:217:0x17ec, B:218:0x182b, B:221:0x183e, B:223:0x1855, B:224:0x1898, B:262:0x26e8, B:264:0x26f5, B:265:0x2739, B:282:0x2c96, B:284:0x2ca3, B:285:0x2ce0, B:354:0x347f, B:356:0x348c, B:357:0x34c5, B:291:0x2dc6, B:293:0x2dd3, B:294:0x2e16, B:268:0x2745, B:270:0x275d, B:271:0x27a4, B:233:0x24ef, B:235:0x24fc, B:237:0x254a, B:198:0x1597, B:48:0x0643, B:50:0x0650, B:51:0x068f, B:57:0x06dd, B:59:0x06ea, B:60:0x0726), top: B:374:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:208:0x169f A[Catch: all -> 0x0235, TryCatch #1 {all -> 0x0235, blocks: (B:10:0x012c, B:12:0x0139, B:13:0x0174, B:25:0x02e7, B:27:0x02f4, B:28:0x0333, B:35:0x046d, B:37:0x047a, B:38:0x04af, B:68:0x0755, B:70:0x075b, B:71:0x078f, B:73:0x08a8, B:75:0x08b7, B:76:0x08ff, B:81:0x0a63, B:83:0x0a70, B:84:0x0ab4, B:91:0x0ba8, B:93:0x0bb5, B:94:0x0bf9, B:101:0x0cb0, B:103:0x0cbd, B:104:0x0cfc, B:110:0x0e33, B:112:0x0e40, B:113:0x0e84, B:127:0x1030, B:129:0x103d, B:130:0x1082, B:178:0x133c, B:180:0x1349, B:181:0x1385, B:192:0x14af, B:194:0x14bc, B:195:0x14fd, B:197:0x158f, B:200:0x159e, B:202:0x15b7, B:203:0x15f1, B:206:0x168d, B:208:0x169f, B:209:0x16df, B:215:0x17df, B:217:0x17ec, B:218:0x182b, B:221:0x183e, B:223:0x1855, B:224:0x1898, B:262:0x26e8, B:264:0x26f5, B:265:0x2739, B:282:0x2c96, B:284:0x2ca3, B:285:0x2ce0, B:354:0x347f, B:356:0x348c, B:357:0x34c5, B:291:0x2dc6, B:293:0x2dd3, B:294:0x2e16, B:268:0x2745, B:270:0x275d, B:271:0x27a4, B:233:0x24ef, B:235:0x24fc, B:237:0x254a, B:198:0x1597, B:48:0x0643, B:50:0x0650, B:51:0x068f, B:57:0x06dd, B:59:0x06ea, B:60:0x0726), top: B:374:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:212:0x1796  */
    /* JADX WARN: Code duplicated, block: B:213:0x179e  */
    /* JADX WARN: Code duplicated, block: B:217:0x17ec A[Catch: all -> 0x0235, TryCatch #1 {all -> 0x0235, blocks: (B:10:0x012c, B:12:0x0139, B:13:0x0174, B:25:0x02e7, B:27:0x02f4, B:28:0x0333, B:35:0x046d, B:37:0x047a, B:38:0x04af, B:68:0x0755, B:70:0x075b, B:71:0x078f, B:73:0x08a8, B:75:0x08b7, B:76:0x08ff, B:81:0x0a63, B:83:0x0a70, B:84:0x0ab4, B:91:0x0ba8, B:93:0x0bb5, B:94:0x0bf9, B:101:0x0cb0, B:103:0x0cbd, B:104:0x0cfc, B:110:0x0e33, B:112:0x0e40, B:113:0x0e84, B:127:0x1030, B:129:0x103d, B:130:0x1082, B:178:0x133c, B:180:0x1349, B:181:0x1385, B:192:0x14af, B:194:0x14bc, B:195:0x14fd, B:197:0x158f, B:200:0x159e, B:202:0x15b7, B:203:0x15f1, B:206:0x168d, B:208:0x169f, B:209:0x16df, B:215:0x17df, B:217:0x17ec, B:218:0x182b, B:221:0x183e, B:223:0x1855, B:224:0x1898, B:262:0x26e8, B:264:0x26f5, B:265:0x2739, B:282:0x2c96, B:284:0x2ca3, B:285:0x2ce0, B:354:0x347f, B:356:0x348c, B:357:0x34c5, B:291:0x2dc6, B:293:0x2dd3, B:294:0x2e16, B:268:0x2745, B:270:0x275d, B:271:0x27a4, B:233:0x24ef, B:235:0x24fc, B:237:0x254a, B:198:0x1597, B:48:0x0643, B:50:0x0650, B:51:0x068f, B:57:0x06dd, B:59:0x06ea, B:60:0x0726), top: B:374:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:220:0x1834  */
    /* JADX WARN: Code duplicated, block: B:223:0x1855 A[Catch: all -> 0x0235, TryCatch #1 {all -> 0x0235, blocks: (B:10:0x012c, B:12:0x0139, B:13:0x0174, B:25:0x02e7, B:27:0x02f4, B:28:0x0333, B:35:0x046d, B:37:0x047a, B:38:0x04af, B:68:0x0755, B:70:0x075b, B:71:0x078f, B:73:0x08a8, B:75:0x08b7, B:76:0x08ff, B:81:0x0a63, B:83:0x0a70, B:84:0x0ab4, B:91:0x0ba8, B:93:0x0bb5, B:94:0x0bf9, B:101:0x0cb0, B:103:0x0cbd, B:104:0x0cfc, B:110:0x0e33, B:112:0x0e40, B:113:0x0e84, B:127:0x1030, B:129:0x103d, B:130:0x1082, B:178:0x133c, B:180:0x1349, B:181:0x1385, B:192:0x14af, B:194:0x14bc, B:195:0x14fd, B:197:0x158f, B:200:0x159e, B:202:0x15b7, B:203:0x15f1, B:206:0x168d, B:208:0x169f, B:209:0x16df, B:215:0x17df, B:217:0x17ec, B:218:0x182b, B:221:0x183e, B:223:0x1855, B:224:0x1898, B:262:0x26e8, B:264:0x26f5, B:265:0x2739, B:282:0x2c96, B:284:0x2ca3, B:285:0x2ce0, B:354:0x347f, B:356:0x348c, B:357:0x34c5, B:291:0x2dc6, B:293:0x2dd3, B:294:0x2e16, B:268:0x2745, B:270:0x275d, B:271:0x27a4, B:233:0x24ef, B:235:0x24fc, B:237:0x254a, B:198:0x1597, B:48:0x0643, B:50:0x0650, B:51:0x068f, B:57:0x06dd, B:59:0x06ea, B:60:0x0726), top: B:374:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:227:0x195c  */
    /* JADX WARN: Code duplicated, block: B:228:0x1970  */
    /* JADX WARN: Code duplicated, block: B:232:0x24eb  */
    /* JADX WARN: Code duplicated, block: B:235:0x24fc A[Catch: all -> 0x0235, TryCatch #1 {all -> 0x0235, blocks: (B:10:0x012c, B:12:0x0139, B:13:0x0174, B:25:0x02e7, B:27:0x02f4, B:28:0x0333, B:35:0x046d, B:37:0x047a, B:38:0x04af, B:68:0x0755, B:70:0x075b, B:71:0x078f, B:73:0x08a8, B:75:0x08b7, B:76:0x08ff, B:81:0x0a63, B:83:0x0a70, B:84:0x0ab4, B:91:0x0ba8, B:93:0x0bb5, B:94:0x0bf9, B:101:0x0cb0, B:103:0x0cbd, B:104:0x0cfc, B:110:0x0e33, B:112:0x0e40, B:113:0x0e84, B:127:0x1030, B:129:0x103d, B:130:0x1082, B:178:0x133c, B:180:0x1349, B:181:0x1385, B:192:0x14af, B:194:0x14bc, B:195:0x14fd, B:197:0x158f, B:200:0x159e, B:202:0x15b7, B:203:0x15f1, B:206:0x168d, B:208:0x169f, B:209:0x16df, B:215:0x17df, B:217:0x17ec, B:218:0x182b, B:221:0x183e, B:223:0x1855, B:224:0x1898, B:262:0x26e8, B:264:0x26f5, B:265:0x2739, B:282:0x2c96, B:284:0x2ca3, B:285:0x2ce0, B:354:0x347f, B:356:0x348c, B:357:0x34c5, B:291:0x2dc6, B:293:0x2dd3, B:294:0x2e16, B:268:0x2745, B:270:0x275d, B:271:0x27a4, B:233:0x24ef, B:235:0x24fc, B:237:0x254a, B:198:0x1597, B:48:0x0643, B:50:0x0650, B:51:0x068f, B:57:0x06dd, B:59:0x06ea, B:60:0x0726), top: B:374:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:236:0x2546  */
    /* JADX WARN: Code duplicated, block: B:252:0x258f  */
    /* JADX WARN: Code duplicated, block: B:253:0x25bd  */
    /* JADX WARN: Code duplicated, block: B:258:0x2662  */
    /* JADX WARN: Code duplicated, block: B:259:0x2684  */
    /* JADX WARN: Code duplicated, block: B:264:0x26f5 A[Catch: all -> 0x0235, TryCatch #1 {all -> 0x0235, blocks: (B:10:0x012c, B:12:0x0139, B:13:0x0174, B:25:0x02e7, B:27:0x02f4, B:28:0x0333, B:35:0x046d, B:37:0x047a, B:38:0x04af, B:68:0x0755, B:70:0x075b, B:71:0x078f, B:73:0x08a8, B:75:0x08b7, B:76:0x08ff, B:81:0x0a63, B:83:0x0a70, B:84:0x0ab4, B:91:0x0ba8, B:93:0x0bb5, B:94:0x0bf9, B:101:0x0cb0, B:103:0x0cbd, B:104:0x0cfc, B:110:0x0e33, B:112:0x0e40, B:113:0x0e84, B:127:0x1030, B:129:0x103d, B:130:0x1082, B:178:0x133c, B:180:0x1349, B:181:0x1385, B:192:0x14af, B:194:0x14bc, B:195:0x14fd, B:197:0x158f, B:200:0x159e, B:202:0x15b7, B:203:0x15f1, B:206:0x168d, B:208:0x169f, B:209:0x16df, B:215:0x17df, B:217:0x17ec, B:218:0x182b, B:221:0x183e, B:223:0x1855, B:224:0x1898, B:262:0x26e8, B:264:0x26f5, B:265:0x2739, B:282:0x2c96, B:284:0x2ca3, B:285:0x2ce0, B:354:0x347f, B:356:0x348c, B:357:0x34c5, B:291:0x2dc6, B:293:0x2dd3, B:294:0x2e16, B:268:0x2745, B:270:0x275d, B:271:0x27a4, B:233:0x24ef, B:235:0x24fc, B:237:0x254a, B:198:0x1597, B:48:0x0643, B:50:0x0650, B:51:0x068f, B:57:0x06dd, B:59:0x06ea, B:60:0x0726), top: B:374:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:267:0x2742  */
    /* JADX WARN: Code duplicated, block: B:268:0x2745 A[Catch: all -> 0x0235, TryCatch #1 {all -> 0x0235, blocks: (B:10:0x012c, B:12:0x0139, B:13:0x0174, B:25:0x02e7, B:27:0x02f4, B:28:0x0333, B:35:0x046d, B:37:0x047a, B:38:0x04af, B:68:0x0755, B:70:0x075b, B:71:0x078f, B:73:0x08a8, B:75:0x08b7, B:76:0x08ff, B:81:0x0a63, B:83:0x0a70, B:84:0x0ab4, B:91:0x0ba8, B:93:0x0bb5, B:94:0x0bf9, B:101:0x0cb0, B:103:0x0cbd, B:104:0x0cfc, B:110:0x0e33, B:112:0x0e40, B:113:0x0e84, B:127:0x1030, B:129:0x103d, B:130:0x1082, B:178:0x133c, B:180:0x1349, B:181:0x1385, B:192:0x14af, B:194:0x14bc, B:195:0x14fd, B:197:0x158f, B:200:0x159e, B:202:0x15b7, B:203:0x15f1, B:206:0x168d, B:208:0x169f, B:209:0x16df, B:215:0x17df, B:217:0x17ec, B:218:0x182b, B:221:0x183e, B:223:0x1855, B:224:0x1898, B:262:0x26e8, B:264:0x26f5, B:265:0x2739, B:282:0x2c96, B:284:0x2ca3, B:285:0x2ce0, B:354:0x347f, B:356:0x348c, B:357:0x34c5, B:291:0x2dc6, B:293:0x2dd3, B:294:0x2e16, B:268:0x2745, B:270:0x275d, B:271:0x27a4, B:233:0x24ef, B:235:0x24fc, B:237:0x254a, B:198:0x1597, B:48:0x0643, B:50:0x0650, B:51:0x068f, B:57:0x06dd, B:59:0x06ea, B:60:0x0726), top: B:374:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:270:0x275d A[Catch: all -> 0x0235, TryCatch #1 {all -> 0x0235, blocks: (B:10:0x012c, B:12:0x0139, B:13:0x0174, B:25:0x02e7, B:27:0x02f4, B:28:0x0333, B:35:0x046d, B:37:0x047a, B:38:0x04af, B:68:0x0755, B:70:0x075b, B:71:0x078f, B:73:0x08a8, B:75:0x08b7, B:76:0x08ff, B:81:0x0a63, B:83:0x0a70, B:84:0x0ab4, B:91:0x0ba8, B:93:0x0bb5, B:94:0x0bf9, B:101:0x0cb0, B:103:0x0cbd, B:104:0x0cfc, B:110:0x0e33, B:112:0x0e40, B:113:0x0e84, B:127:0x1030, B:129:0x103d, B:130:0x1082, B:178:0x133c, B:180:0x1349, B:181:0x1385, B:192:0x14af, B:194:0x14bc, B:195:0x14fd, B:197:0x158f, B:200:0x159e, B:202:0x15b7, B:203:0x15f1, B:206:0x168d, B:208:0x169f, B:209:0x16df, B:215:0x17df, B:217:0x17ec, B:218:0x182b, B:221:0x183e, B:223:0x1855, B:224:0x1898, B:262:0x26e8, B:264:0x26f5, B:265:0x2739, B:282:0x2c96, B:284:0x2ca3, B:285:0x2ce0, B:354:0x347f, B:356:0x348c, B:357:0x34c5, B:291:0x2dc6, B:293:0x2dd3, B:294:0x2e16, B:268:0x2745, B:270:0x275d, B:271:0x27a4, B:233:0x24ef, B:235:0x24fc, B:237:0x254a, B:198:0x1597, B:48:0x0643, B:50:0x0650, B:51:0x068f, B:57:0x06dd, B:59:0x06ea, B:60:0x0726), top: B:374:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:275:0x285b  */
    /* JADX WARN: Code duplicated, block: B:302:0x2ef5  */
    /* JADX WARN: Code duplicated, block: B:306:0x31ab  */
    /* JADX WARN: Code duplicated, block: B:308:0x31bb  */
    /* JADX WARN: Code duplicated, block: B:310:0x31ce  */
    /* JADX WARN: Code duplicated, block: B:323:0x3280  */
    /* JADX WARN: Code duplicated, block: B:331:0x331b A[Catch: Exception -> 0x3430, TRY_LEAVE, TryCatch #7 {Exception -> 0x3430, blocks: (B:329:0x32b2, B:331:0x331b, B:333:0x3321, B:336:0x333c, B:341:0x33e2, B:342:0x33f5, B:344:0x3411, B:346:0x3417, B:348:0x341d, B:343:0x33fa, B:337:0x334d), top: B:386:0x32b2 }] */
    /* JADX WARN: Code duplicated, block: B:351:0x342d  */
    /* JADX WARN: Code duplicated, block: B:356:0x348c A[Catch: all -> 0x0235, TryCatch #1 {all -> 0x0235, blocks: (B:10:0x012c, B:12:0x0139, B:13:0x0174, B:25:0x02e7, B:27:0x02f4, B:28:0x0333, B:35:0x046d, B:37:0x047a, B:38:0x04af, B:68:0x0755, B:70:0x075b, B:71:0x078f, B:73:0x08a8, B:75:0x08b7, B:76:0x08ff, B:81:0x0a63, B:83:0x0a70, B:84:0x0ab4, B:91:0x0ba8, B:93:0x0bb5, B:94:0x0bf9, B:101:0x0cb0, B:103:0x0cbd, B:104:0x0cfc, B:110:0x0e33, B:112:0x0e40, B:113:0x0e84, B:127:0x1030, B:129:0x103d, B:130:0x1082, B:178:0x133c, B:180:0x1349, B:181:0x1385, B:192:0x14af, B:194:0x14bc, B:195:0x14fd, B:197:0x158f, B:200:0x159e, B:202:0x15b7, B:203:0x15f1, B:206:0x168d, B:208:0x169f, B:209:0x16df, B:215:0x17df, B:217:0x17ec, B:218:0x182b, B:221:0x183e, B:223:0x1855, B:224:0x1898, B:262:0x26e8, B:264:0x26f5, B:265:0x2739, B:282:0x2c96, B:284:0x2ca3, B:285:0x2ce0, B:354:0x347f, B:356:0x348c, B:357:0x34c5, B:291:0x2dc6, B:293:0x2dd3, B:294:0x2e16, B:268:0x2745, B:270:0x275d, B:271:0x27a4, B:233:0x24ef, B:235:0x24fc, B:237:0x254a, B:198:0x1597, B:48:0x0643, B:50:0x0650, B:51:0x068f, B:57:0x06dd, B:59:0x06ea, B:60:0x0726), top: B:374:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:359:0x356c  */
    /* JADX WARN: Code duplicated, block: B:378:0x1246 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:391:0x0b44 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:392:0x0b64 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:394:0x10b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:397:0x1435 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:398:0x1414 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:399:0x158f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:400:0x159d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:407:0x329e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x075b A[Catch: all -> 0x0235, TryCatch #1 {all -> 0x0235, blocks: (B:10:0x012c, B:12:0x0139, B:13:0x0174, B:25:0x02e7, B:27:0x02f4, B:28:0x0333, B:35:0x046d, B:37:0x047a, B:38:0x04af, B:68:0x0755, B:70:0x075b, B:71:0x078f, B:73:0x08a8, B:75:0x08b7, B:76:0x08ff, B:81:0x0a63, B:83:0x0a70, B:84:0x0ab4, B:91:0x0ba8, B:93:0x0bb5, B:94:0x0bf9, B:101:0x0cb0, B:103:0x0cbd, B:104:0x0cfc, B:110:0x0e33, B:112:0x0e40, B:113:0x0e84, B:127:0x1030, B:129:0x103d, B:130:0x1082, B:178:0x133c, B:180:0x1349, B:181:0x1385, B:192:0x14af, B:194:0x14bc, B:195:0x14fd, B:197:0x158f, B:200:0x159e, B:202:0x15b7, B:203:0x15f1, B:206:0x168d, B:208:0x169f, B:209:0x16df, B:215:0x17df, B:217:0x17ec, B:218:0x182b, B:221:0x183e, B:223:0x1855, B:224:0x1898, B:262:0x26e8, B:264:0x26f5, B:265:0x2739, B:282:0x2c96, B:284:0x2ca3, B:285:0x2ce0, B:354:0x347f, B:356:0x348c, B:357:0x34c5, B:291:0x2dc6, B:293:0x2dd3, B:294:0x2e16, B:268:0x2745, B:270:0x275d, B:271:0x27a4, B:233:0x24ef, B:235:0x24fc, B:237:0x254a, B:198:0x1597, B:48:0x0643, B:50:0x0650, B:51:0x068f, B:57:0x06dd, B:59:0x06ea, B:60:0x0726), top: B:374:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:75:0x08b7 A[Catch: all -> 0x0235, TryCatch #1 {all -> 0x0235, blocks: (B:10:0x012c, B:12:0x0139, B:13:0x0174, B:25:0x02e7, B:27:0x02f4, B:28:0x0333, B:35:0x046d, B:37:0x047a, B:38:0x04af, B:68:0x0755, B:70:0x075b, B:71:0x078f, B:73:0x08a8, B:75:0x08b7, B:76:0x08ff, B:81:0x0a63, B:83:0x0a70, B:84:0x0ab4, B:91:0x0ba8, B:93:0x0bb5, B:94:0x0bf9, B:101:0x0cb0, B:103:0x0cbd, B:104:0x0cfc, B:110:0x0e33, B:112:0x0e40, B:113:0x0e84, B:127:0x1030, B:129:0x103d, B:130:0x1082, B:178:0x133c, B:180:0x1349, B:181:0x1385, B:192:0x14af, B:194:0x14bc, B:195:0x14fd, B:197:0x158f, B:200:0x159e, B:202:0x15b7, B:203:0x15f1, B:206:0x168d, B:208:0x169f, B:209:0x16df, B:215:0x17df, B:217:0x17ec, B:218:0x182b, B:221:0x183e, B:223:0x1855, B:224:0x1898, B:262:0x26e8, B:264:0x26f5, B:265:0x2739, B:282:0x2c96, B:284:0x2ca3, B:285:0x2ce0, B:354:0x347f, B:356:0x348c, B:357:0x34c5, B:291:0x2dc6, B:293:0x2dd3, B:294:0x2e16, B:268:0x2745, B:270:0x275d, B:271:0x27a4, B:233:0x24ef, B:235:0x24fc, B:237:0x254a, B:198:0x1597, B:48:0x0643, B:50:0x0650, B:51:0x068f, B:57:0x06dd, B:59:0x06ea, B:60:0x0726), top: B:374:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0a57  */
    /* JADX WARN: Code duplicated, block: B:83:0x0a70 A[Catch: all -> 0x0235, TryCatch #1 {all -> 0x0235, blocks: (B:10:0x012c, B:12:0x0139, B:13:0x0174, B:25:0x02e7, B:27:0x02f4, B:28:0x0333, B:35:0x046d, B:37:0x047a, B:38:0x04af, B:68:0x0755, B:70:0x075b, B:71:0x078f, B:73:0x08a8, B:75:0x08b7, B:76:0x08ff, B:81:0x0a63, B:83:0x0a70, B:84:0x0ab4, B:91:0x0ba8, B:93:0x0bb5, B:94:0x0bf9, B:101:0x0cb0, B:103:0x0cbd, B:104:0x0cfc, B:110:0x0e33, B:112:0x0e40, B:113:0x0e84, B:127:0x1030, B:129:0x103d, B:130:0x1082, B:178:0x133c, B:180:0x1349, B:181:0x1385, B:192:0x14af, B:194:0x14bc, B:195:0x14fd, B:197:0x158f, B:200:0x159e, B:202:0x15b7, B:203:0x15f1, B:206:0x168d, B:208:0x169f, B:209:0x16df, B:215:0x17df, B:217:0x17ec, B:218:0x182b, B:221:0x183e, B:223:0x1855, B:224:0x1898, B:262:0x26e8, B:264:0x26f5, B:265:0x2739, B:282:0x2c96, B:284:0x2ca3, B:285:0x2ce0, B:354:0x347f, B:356:0x348c, B:357:0x34c5, B:291:0x2dc6, B:293:0x2dd3, B:294:0x2e16, B:268:0x2745, B:270:0x275d, B:271:0x27a4, B:233:0x24ef, B:235:0x24fc, B:237:0x254a, B:198:0x1597, B:48:0x0643, B:50:0x0650, B:51:0x068f, B:57:0x06dd, B:59:0x06ea, B:60:0x0726), top: B:374:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0b53 A[LOOP:2: B:78:0x0a54->B:88:0x0b53, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:93:0x0bb5 A[Catch: all -> 0x0235, TryCatch #1 {all -> 0x0235, blocks: (B:10:0x012c, B:12:0x0139, B:13:0x0174, B:25:0x02e7, B:27:0x02f4, B:28:0x0333, B:35:0x046d, B:37:0x047a, B:38:0x04af, B:68:0x0755, B:70:0x075b, B:71:0x078f, B:73:0x08a8, B:75:0x08b7, B:76:0x08ff, B:81:0x0a63, B:83:0x0a70, B:84:0x0ab4, B:91:0x0ba8, B:93:0x0bb5, B:94:0x0bf9, B:101:0x0cb0, B:103:0x0cbd, B:104:0x0cfc, B:110:0x0e33, B:112:0x0e40, B:113:0x0e84, B:127:0x1030, B:129:0x103d, B:130:0x1082, B:178:0x133c, B:180:0x1349, B:181:0x1385, B:192:0x14af, B:194:0x14bc, B:195:0x14fd, B:197:0x158f, B:200:0x159e, B:202:0x15b7, B:203:0x15f1, B:206:0x168d, B:208:0x169f, B:209:0x16df, B:215:0x17df, B:217:0x17ec, B:218:0x182b, B:221:0x183e, B:223:0x1855, B:224:0x1898, B:262:0x26e8, B:264:0x26f5, B:265:0x2739, B:282:0x2c96, B:284:0x2ca3, B:285:0x2ce0, B:354:0x347f, B:356:0x348c, B:357:0x34c5, B:291:0x2dc6, B:293:0x2dd3, B:294:0x2e16, B:268:0x2745, B:270:0x275d, B:271:0x27a4, B:233:0x24ef, B:235:0x24fc, B:237:0x254a, B:198:0x1597, B:48:0x0643, B:50:0x0650, B:51:0x068f, B:57:0x06dd, B:59:0x06ea, B:60:0x0726), top: B:374:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0c04  */
    /* JADX WARN: Code duplicated, block: B:98:0x0c2e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0c34  */
    public static Object[] serializer(Context context, int i, int i2, int i3) throws Throwable {
        int mirror;
        int i4;
        char c;
        Object obj;
        String str;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Object objRemoteActionCompatParcelizer;
        int i10;
        long j;
        Object objRemoteActionCompatParcelizer2;
        String[] strArr;
        int i11;
        int i12;
        Object objRemoteActionCompatParcelizer3;
        String str2;
        int i13;
        Object objRemoteActionCompatParcelizer4;
        long j2;
        int i14;
        Object objRemoteActionCompatParcelizer5;
        String lowerCase;
        int i15;
        byte modifierMetaStateMask;
        int i16;
        Object[] objArr;
        int i17;
        String[] strArr2;
        int i18;
        int i19;
        String str3;
        File file;
        String str4;
        File file2;
        int i20;
        int i21;
        Scanner scannerUseDelimiter;
        String next;
        int i22;
        String[] strArr3;
        int i23;
        int i24;
        int i25;
        Object objRemoteActionCompatParcelizer6;
        int i26;
        int i27;
        int i28;
        String[] strArr4;
        Object objRemoteActionCompatParcelizer7;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        Object objRemoteActionCompatParcelizer8;
        Object objInvoke;
        char c2;
        String[][] strArr5;
        StringBuilder sb;
        int i34;
        int i35;
        int i36;
        char c3;
        int i37;
        Object[] objArr2;
        int i38;
        String[] strArr6;
        int i39;
        Object objRemoteActionCompatParcelizer9;
        String str5;
        char c4;
        Object objRemoteActionCompatParcelizer10;
        Object objInvoke2;
        Object objRemoteActionCompatParcelizer11;
        int i40;
        int i41;
        String[] strArr7;
        char c5;
        String[][] strArr8;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        Object objRemoteActionCompatParcelizer12;
        File file3;
        int scrollBarFadeDuration;
        int iCombineMeasuredStates;
        int i47;
        String str6;
        String str7;
        String[] strArr9;
        int length;
        int i48;
        File file4;
        String[][] strArr10;
        String[] strArr11;
        String str8;
        Object objRemoteActionCompatParcelizer13;
        int i49;
        int i50;
        Object objRemoteActionCompatParcelizer14;
        String[] strArr12;
        int i51;
        int i52;
        String[] strArr13;
        int i53;
        int i54;
        Object objRemoteActionCompatParcelizer15;
        String[] strArr14;
        int i55;
        int i56;
        Scanner scannerUseDelimiter2;
        String next2;
        Object objRemoteActionCompatParcelizer16;
        String str9;
        int i57;
        int i58;
        Object[] objArr3;
        Object[] objArr4;
        Object objRemoteActionCompatParcelizer17;
        String[] strArr15;
        int i59;
        int i60;
        int i61 = 2 % 2;
        int i62 = 0;
        int i63 = -(-TextUtils.indexOf("", "", 0, 0));
        int i64 = (i63 & 8) + (i63 | 8);
        int i65 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
        int i66 = (i65 & 911) + (i65 | 911);
        int i67 = read + 97;
        IconCompatParcelizer = i67 % Fields.SpotShadowColor;
        int i68 = i67 % 2;
        int i69 = -(-(ViewConfiguration.getFadingEdgeLength() >> 16));
        int i70 = 1;
        Object[] objArr5 = new Object[1];
        b(i64, i66, (char) ((64994 & i69) + (i69 | 64994)), objArr5);
        String str10 = (String) objArr5[0];
        int i71 = 4;
        String[] strArr16 = new String[4];
        int iAxisFromString = MotionEvent.axisFromString("");
        int i72 = (iAxisFromString ^ 28) + ((iAxisFromString & 28) << 1);
        int i73 = IconCompatParcelizer;
        int i74 = (i73 ^ 59) + ((i73 & 59) << 1);
        read = i74 % Fields.SpotShadowColor;
        int i75 = i74 % 2;
        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0');
        if (i75 != 0) {
            Object[] objArr6 = new Object[1];
            b(i72, 1 >>> iIndexOf, (char) (AudioTrack.getMinVolume() > 1.0f ? 1 : (AudioTrack.getMinVolume() == 1.0f ? 0 : -1)), objArr6);
            strArr16[0] = (String) objArr6[0];
            mirror = 3 >> AndroidCharacter.getMirror('t');
            i4 = 115;
            c = 0;
        } else {
            Object[] objArr7 = new Object[1];
            b(i72, (iIndexOf ^ 1) + ((iIndexOf & 1) << 1), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr7);
            strArr16[0] = (String) objArr7[0];
            mirror = 72 - (~(-AndroidCharacter.getMirror('0')));
            i4 = 28;
            c = 1;
        }
        Object[] objArr8 = new Object[1];
        b(mirror, (i4 - (~(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))))) - 1, (char) (31727 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr8);
        strArr16[c] = (String) objArr8[0];
        int i76 = read;
        int i77 = (i76 & 31) + (i76 | 31);
        IconCompatParcelizer = i77 % Fields.SpotShadowColor;
        int i78 = i77 % 2;
        int mode = 18 - View.MeasureSpec.getMode(0);
        int i79 = 51 - (~TextUtils.indexOf("", "", 0));
        int i80 = -(-Color.rgb(0, 0, 0));
        Object[] objArr9 = new Object[1];
        b(mode, i79, (char) ((i80 ^ 16777216) + ((i80 & 16777216) << 1)), objArr9);
        strArr16[2] = (String) objArr9[0];
        int doubleTapTimeout = 28 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
        int iMakeMeasureSpec = 70 - View.MeasureSpec.makeMeasureSpec(0, 0);
        int i81 = -(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
        Object[] objArr10 = new Object[1];
        b(doubleTapTimeout, iMakeMeasureSpec, (char) ((i81 ^ (-1)) + (i81 << 1)), objArr10);
        strArr16[3] = (String) objArr10[0];
        int i82 = 0;
        while (true) {
            obj = null;
            if (i82 >= i71) {
                str = str10;
                i5 = i;
                break;
            }
            try {
                Object[] objArr11 = {strArr16[i82]};
                Object objRemoteActionCompatParcelizer18 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1794492419);
                if (objRemoteActionCompatParcelizer18 == null) {
                    char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i62, i62) + 2645;
                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 22;
                    byte b = (byte) i62;
                    byte b2 = (byte) (b + 1);
                    Object[] objArr12 = new Object[1];
                    a(b, b2, (byte) (-b2), objArr12);
                    String str11 = (String) objArr12[i62];
                    Class[] clsArr = new Class[1];
                    clsArr[i62] = String.class;
                    objRemoteActionCompatParcelizer18 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(scrollDefaultDelay, iMakeMeasureSpec2, tapTimeout, 1171920412, false, str11, clsArr);
                }
                long jLongValue = ((Long) ((Method) objRemoteActionCompatParcelizer18).invoke(null, objArr11)).longValue();
                long j3 = 865831384;
                str = str10;
                long j4 = -755;
                String[] strArr17 = strArr16;
                long j5 = -1;
                long j6 = ((j3 ^ j5) | (jLongValue ^ j5)) ^ j5;
                long j7 = (j4 * j3) + (j4 * jLongValue) + (((long) 1512) * j6);
                long j8 = jLongValue | j3;
                long j9 = i;
                long j10 = j7 + (((long) (-756)) * (j6 | ((j8 | j9) ^ j5))) + (((long) 756) * ((j5 ^ j9) | j8)) + ((long) 227619266);
                int i83 = (-2005432166) + (((~((-279146469) | i)) | 157124) * 104);
                int i84 = ~i;
                int i85 = ((int) (j10 >> 32)) & (i83 + ((~(1437069286 | i84)) * (-104)) + ((1158079942 | i) * 104));
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i86 = 1561869931 + (((~(1858721155 | startElapsedRealtime)) | (-2145386460) | (~(421494745 | startElapsedRealtime))) * (-754));
                int i87 = ~(2145386459 | startElapsedRealtime);
                int i88 = ~startElapsedRealtime;
                int i89 = ((int) j10) & (i86 + ((i87 | (~((-1723891715) | i88))) * (-754)) + ((i88 | 1858721155) * 754));
                if (((i89 & i85) | (i85 ^ i89)) != 0) {
                    int i90 = (i82 & 190) + (i82 | 190);
                    i5 = (i90 & i84) | ((~i90) & i);
                    i62 = 0;
                    break;
                }
                i82 = ((i82 & 124) + (i82 | 124)) - 123;
                strArr16 = strArr17;
                str10 = str;
                i62 = 0;
                i71 = 4;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int iResolveSize = 12 - View.resolveSize(i62, i62);
        int i91 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
        Object[] objArr13 = new Object[1];
        b(iResolveSize, (i91 & 99) + (i91 | 99), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 59043), objArr13);
        String str12 = (String) objArr13[0];
        int i92 = -(-(ViewConfiguration.getPressedStateDuration() >> 16));
        int i93 = (i92 ^ 13) + ((i92 & 13) << 1);
        int i94 = -(-TextUtils.lastIndexOf("", '0', 0));
        int i95 = ((i94 | 111) << 1) - (i94 ^ 111);
        int i96 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
        Object[] objArr14 = new Object[1];
        b(i93, i95, (char) ((i96 ^ 33892) + ((i96 & 33892) << 1)), objArr14);
        String str13 = (String) objArr14[0];
        int i97 = -Color.rgb(0, 0, 0);
        int i98 = ((i97 | (-16777198)) << 1) - (i97 ^ (-16777198));
        int i99 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
        int i100 = ((i99 | 123) << 1) - (i99 ^ 123);
        int i101 = -TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        Object[] objArr15 = new Object[1];
        b(i98, i100, (char) ((i101 ^ 15477) + ((i101 & 15477) << 1)), objArr15);
        String[] strArr18 = {str12, str13, (String) objArr15[0]};
        int i102 = IconCompatParcelizer;
        int i103 = (i102 ^ 25) + ((i102 & 25) << 1);
        read = i103 % Fields.SpotShadowColor;
        int i104 = i103 % 2;
        int i105 = 0;
        while (true) {
            if (i105 >= 3) {
                i6 = i;
                break;
            }
            Object[] objArr16 = {strArr18[i105]};
            Object objRemoteActionCompatParcelizer19 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(971290740);
            if (objRemoteActionCompatParcelizer19 == null) {
                char c6 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int iIndexOf2 = TextUtils.indexOf("", "", 0) + 2645;
                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 23;
                byte b3 = (byte) ($$b & i70);
                byte b4 = b3;
                Object[] objArr17 = new Object[i70];
                a(b3, b4, (byte) (b4 + 1), objArr17);
                String str14 = (String) objArr17[0];
                Class[] clsArr2 = new Class[i70];
                clsArr2[0] = String.class;
                objRemoteActionCompatParcelizer19 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c6, iIndexOf2, packedPositionChild, -382428779, false, str14, clsArr2);
            }
            long jLongValue2 = ((Long) ((Method) objRemoteActionCompatParcelizer19).invoke(obj, objArr16)).longValue();
            long j11 = 459788489;
            long j12 = 217;
            long j13 = -1;
            long j14 = j11 ^ j13;
            long j15 = i;
            long j16 = j15 ^ j13;
            long j17 = jLongValue2 ^ j13;
            long j18 = (((long) (-433)) * j11) + (((long) (-216)) * jLongValue2) + ((((j14 | j16) ^ j13) | ((j17 | j15) ^ j13)) * j12) + ((((j14 | j17) ^ j13) | ((j14 | j15) ^ j13)) * j12) + (j12 * ((j13 ^ (j17 | j16)) | j11)) + ((long) (-523820501));
            int i106 = ((int) (j18 >> 32)) & (358718302 + (((~(499695243 | i)) | (-937531168)) * (-668)) + ((499695243 | (~((-937531168) | i))) * 1336) + (((-572588309) | i) * 668));
            int i107 = ~i;
            int i108 = ((int) j18) & (210730629 + (((~((-1342554913) | i107)) | (~(1515185973 | i))) * (-272)) + (((~((-1376633653) | i)) | 34078740) * (-272)) + (((~(1376633652 | i)) | 1481107233) * 272));
            if (((i108 & i106) | (i106 ^ i108)) != 0) {
                int iSerializer = TextInputBigV2Kt$MainText$1$1$1.serializer();
                int i109 = -(-(i105 * (-622)));
                int i110 = (168480 & i109) + (i109 | 168480);
                int i111 = (~((~i105) | 270 | iSerializer)) * 623;
                int i112 = (i110 & i111) + (i111 | i110);
                int i113 = ~iSerializer;
                int i114 = ~(((-271) & i105) | ((-271) ^ i105));
                int i115 = i112 + (((i113 & i114) | (i113 ^ i114)) * (-623));
                int i116 = ~i105;
                int i117 = ~((i116 ^ 270) | (i116 & 270));
                int i118 = ~((i116 & iSerializer) | (i116 ^ iSerializer));
                int i119 = i115 + (((~((iSerializer & 270) | (iSerializer ^ 270))) | (i118 & i117) | (i117 ^ i118)) * 623);
                i6 = ((~i119) & i) | (i119 & i107);
                break;
            }
            i105 = (i105 | 1) + (i105 & 1);
            i70 = 1;
            obj = null;
        }
        int i120 = (~i5) & i;
        int i121 = ~i;
        int i122 = i120 | (i5 & i121);
        int i123 = -i122;
        int i124 = ((i122 & i123) | (i122 ^ i123)) >> 31;
        int i125 = i6 & (~i124);
        int i126 = read;
        int i127 = ((i126 | 23) << 1) - (i126 ^ 23);
        IconCompatParcelizer = i127 % Fields.SpotShadowColor;
        int i128 = i127 % 2;
        int i129 = i5 & i124;
        int i130 = (i129 & i125) | (i125 ^ i129);
        Object[] objArr18 = new Object[1];
        b(13 - ((byte) KeyEvent.getModifierMetaStateMask()), Color.red(0) + 141, (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 4669), objArr18);
        Object[] objArr19 = {(String) objArr18[0]};
        Object objRemoteActionCompatParcelizer20 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-502275956);
        if (objRemoteActionCompatParcelizer20 == null) {
            char c7 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2645;
            int iNormalizeMetaState = 22 - KeyEvent.normalizeMetaState(0);
            byte b5 = (byte) 0;
            byte b6 = b5;
            Object[] objArr20 = new Object[1];
            a(b5, b6, (byte) (b6 + 4), objArr20);
            objRemoteActionCompatParcelizer20 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c7, keyRepeatDelay, iNormalizeMetaState, 853524845, false, (String) objArr20[0], new Class[]{String.class});
        }
        long jLongValue3 = ((Long) ((Method) objRemoteActionCompatParcelizer20).invoke(null, objArr19)).longValue();
        long j19 = -689951478;
        long j20 = 988;
        long j21 = -1;
        long j22 = jLongValue3 ^ j21;
        long jNextInt = new Random().nextInt(622204337);
        long j23 = jNextInt ^ j21;
        long j24 = (((long) 989) * j19) + (((long) (-987)) * jLongValue3) + (((((j22 | j23) | j19) ^ j21) | (((j19 | jLongValue3) | jNextInt) ^ j21)) * j20) + (((long) (-988)) * (j19 | j22)) + (j20 * ((((j19 ^ j21) | j22) ^ j21) | ((j22 | jNextInt) ^ j21) | ((jLongValue3 | (j23 | j19)) ^ j21))) + ((long) 1559115901);
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i131 = ((int) (j24 >> 32)) & ((-1032207904) + (((~((-1715623349) | iFreeMemory)) | (~((-278396938) | iFreeMemory))) * 69) + (((~(iFreeMemory | 1732442102)) | (~(295215691 | iFreeMemory)) | (-2010839040)) * (-69)) + 1160494026);
        int iMyUid = Process.myUid();
        int i132 = ((int) j24) & ((((~((-607155847) | iMyUid)) | (-830070564)) * 56) + 1560647501 + (((~((~iMyUid) | (-830070564))) | (-607155847)) * 56));
        if (((i131 & i132) | (i131 ^ i132)) == 0) {
            i7 = i121;
            int i133 = 25 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            int longPressTimeout = ViewConfiguration.getLongPressTimeout() >> 16;
            int i134 = ~i;
            int i135 = (((longPressTimeout * 960) - 297135) - (~(-(-(((~((i134 & (-156)) | ((-156) ^ i134))) | (~(longPressTimeout | i))) * 959))))) - (-149603);
            int i136 = ~(((-156) ^ i) | ((-156) & i));
            int i137 = ~((longPressTimeout & i7) | (i7 ^ longPressTimeout));
            int i138 = -(-(((i137 & i136) | (i136 ^ i137)) * 959));
            int i139 = ((i135 | i138) << 1) - (i138 ^ i135);
            int i140 = -Color.alpha(0);
            Object[] objArr21 = new Object[1];
            b(i133, i139, (char) (((i140 | 48082) << 1) - (i140 ^ 48082)), objArr21);
            Object[] objArr22 = {(String) objArr21[0]};
            Object objRemoteActionCompatParcelizer21 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1468326312);
            if (objRemoteActionCompatParcelizer21 == null) {
                char longPressTimeout2 = (char) (58126 - (ViewConfiguration.getLongPressTimeout() >> 16));
                int i141 = 947 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int windowTouchSlop = 27 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                byte b7 = (byte) ($$b & 1);
                byte b8 = b7;
                Object[] objArr23 = new Object[1];
                a(b7, b8, (byte) (b8 + 1), objArr23);
                objRemoteActionCompatParcelizer21 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(longPressTimeout2, i141, windowTouchSlop, 2024488889, false, (String) objArr23[0], new Class[]{String.class});
            }
            String str15 = (String) ((Method) objRemoteActionCompatParcelizer21).invoke(null, objArr22);
            if (str15 == null || str15.isEmpty()) {
                int i142 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                int i143 = ((i142 | 25) << 1) - (i142 ^ 25);
                int i144 = -ExpandableListView.getPackedPositionType(0L);
                int i145 = (i144 & 179) + (i144 | 179);
                int i146 = IconCompatParcelizer + 105;
                read = i146 % Fields.SpotShadowColor;
                int i147 = i146 % 2;
                Object[] objArr24 = new Object[1];
                b(i143, i145, (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr24);
                Object[] objArr25 = {(String) objArr24[0]};
                Object objRemoteActionCompatParcelizer22 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1468326312);
                if (objRemoteActionCompatParcelizer22 == null) {
                    char longPressTimeout3 = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 58126);
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 947;
                    int mirror2 = 'K' - AndroidCharacter.getMirror('0');
                    byte b9 = (byte) ($$b & 1);
                    byte b10 = b9;
                    Object[] objArr26 = new Object[1];
                    a(b9, b10, (byte) (b10 + 1), objArr26);
                    objRemoteActionCompatParcelizer22 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(longPressTimeout3, iResolveOpacity, mirror2, 2024488889, false, (String) objArr26[0], new Class[]{String.class});
                }
                String str16 = (String) ((Method) objRemoteActionCompatParcelizer22).invoke(null, objArr25);
                i8 = (str16 == null || str16.isEmpty()) ? i : (i & (-268)) | (i7 & 267);
            } else {
                i9 = i ^ 267;
            }
            int i148 = ((~i130) & i) | (i130 & i7);
            int i149 = (i148 | (-i148)) >> 31;
            int i150 = i8 & (~i149);
            int i151 = i130 & i149;
            int i152 = (i150 & i151) | (i150 ^ i151);
            objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-579020261);
            if (objRemoteActionCompatParcelizer == null) {
                char c8 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int windowTouchSlop2 = 1321 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                int packedPositionGroup = 31 - ExpandableListView.getPackedPositionGroup(0L);
                byte b11 = (byte) 0;
                byte b12 = (byte) (b11 + 1);
                Object[] objArr27 = new Object[1];
                a(b11, b12, (byte) (-b12), objArr27);
                objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c8, windowTouchSlop2, packedPositionGroup, 229440506, false, (String) objArr27[0], new Class[0]);
            }
            long jLongValue4 = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, null)).longValue();
            long j25 = -1099501802;
            long j26 = -751;
            long j27 = j25 ^ j21;
            long j28 = jLongValue4 ^ j21;
            i10 = i7;
            j = i;
            long j29 = (j26 * j25) + (j26 * jLongValue4) + (((long) 1504) * (((j27 | j28) ^ j21) | ((j27 | j) ^ j21)));
            long j30 = j27 | jLongValue4;
            long j31 = j29 + (((long) (-1504)) * ((j30 | j) ^ j21)) + (((long) 752) * ((j30 ^ j21) | ((j28 | j25) ^ j21))) + ((long) 1793783813);
            int i153 = ((int) (j31 >> 32)) & (1552854535 + (((~(97065705 | i10)) | (-1534292117)) * (-983)) + (((~((-1534292117) | i10)) | 21041280) * 983));
            int iNextInt = new Random().nextInt(864023753);
            int i154 = ~iNextInt;
            int i155 = (~(494405828 | i154)) | (-1031425254);
            int i156 = ~(iNextInt | (-405801157));
            int i157 = ((int) j31) & (478338897 + ((i155 | i156) * (-502)) + ((i156 | (~(i154 | (-537019426)))) * 502));
            int i158 = (i153 & i157) | (i153 ^ i157);
            int i159 = (i158 ^ (-1)) + (i158 << 1);
            int i160 = ((i159 | 200) << 1) - (i159 ^ 200);
            int i161 = ((~i160) & i) | (i160 & i10);
            int i162 = -i158;
            int i163 = ((i158 & i162) | (i158 ^ i162)) >> 31;
            int i164 = (~i163) & i;
            int i165 = i163 & i161;
            int i166 = (~(i & i152)) & (i | i152);
            int i167 = (i166 | (-i166)) >> 31;
            int i168 = ((i165 & i164) | (i164 ^ i165)) & (~i167);
            int i169 = i152 & i167;
            int i170 = (i169 & i168) | (i168 ^ i169);
            int i171 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            Object[] objArr28 = new Object[1];
            b((i171 & 19) + (i171 | 19), 202 - (~(-TextUtils.getCapsMode("", 0, 0))), (char) (51290 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), objArr28);
            String str17 = (String) objArr28[0];
            Object[] objArr29 = new Object[1];
            b(6 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 222 - (~(-(-KeyEvent.getDeadChar(0, 0)))), (char) TextUtils.indexOf("", "", 0, 0), objArr29);
            Object[] objArr30 = {str17, (String) objArr29[0]};
            objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(2121162724);
            if (objRemoteActionCompatParcelizer2 == null) {
                char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 6015);
                int i172 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1410;
                int iBlue = 17 - Color.blue(0);
                byte b13 = (byte) 0;
                byte b14 = (byte) (b13 + 1);
                Object[] objArr31 = new Object[1];
                a(b13, b14, (byte) (-b14), objArr31);
                objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(scrollBarSize, i172, iBlue, -1363247611, false, (String) objArr31[0], new Class[]{String.class, String.class});
            }
            long jLongValue5 = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr30)).longValue();
            long j32 = 543249466;
            long j33 = j32 ^ j21;
            long jFreeMemory = (int) Runtime.getRuntime().freeMemory();
            long j34 = (((long) 567) * j32) + (((long) (-565)) * jLongValue5) + (((long) (-566)) * (((j33 | jLongValue5) ^ j21) | ((j33 | jFreeMemory) ^ j21)));
            long j35 = 566;
            long j36 = jLongValue5 ^ j21;
            long j37 = j34 + (((j32 | j36) ^ j21) * j35) + (j35 * ((jFreeMemory | (j33 | j36)) ^ j21)) + ((long) 1107732412);
            int i173 = ((int) (j37 >> 32)) & (((((~((-16843945) | i)) | 1084752130) * 449) - 980573698) + ((1084752130 | (~((-16843945) | i10))) * 449));
            int i174 = ~(((int) Process.getElapsedCpuTime()) | 1369262581);
            int i175 = ((int) j37) & (((153430421 | i174) * (-658)) + 1229474639 + ((i174 | 136323072) * 658));
            int i176 = (i173 & i175) | (i173 ^ i175);
            int i177 = -i176;
            int i178 = ((i176 & i177) | (i176 ^ i177)) >> 31;
            int i179 = (i178 & (i ^ 262)) | ((~i178) & i);
            int i180 = ((~i170) & i) | (i170 & i10);
            int i181 = -i180;
            int i182 = ((i180 & i181) | (i180 ^ i181)) >> 31;
            int i183 = i179 & (~i182);
            int i184 = i182 & i170;
            int i185 = (i183 & i184) | (i183 ^ i184);
            int i186 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i187 = (i186 & 31) + (i186 | 31);
            int i188 = 229 - (~(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))));
            int i189 = -TextUtils.indexOf("", "", 0, 0);
            Object[] objArr32 = new Object[1];
            b(i187, i188, (char) ((i189 & 36067) + (i189 | 36067)), objArr32);
            String str18 = (String) objArr32[0];
            Object[] objArr33 = new Object[1];
            b(22 - (~(-(-Drawable.resolveOpacity(0, 0)))), 259 - (~(-(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))))), (char) ((-1) - Process.getGidForName("")), objArr33);
            String str19 = (String) objArr33[0];
            int i190 = -Drawable.resolveOpacity(0, 0);
            int i191 = (i190 & 28) + (i190 | 28);
            int i192 = -TextUtils.getOffsetBefore("", 0);
            Object[] objArr34 = new Object[1];
            b(i191, ((i192 | 283) << 1) - (i192 ^ 283), (char) ((-1) - ImageFormat.getBitsPerPixel(0)), objArr34);
            String str20 = (String) objArr34[0];
            int i193 = (-16777203) - (~(-Color.rgb(0, 0, 0)));
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0);
            Object[] objArr35 = new Object[1];
            b(i193, (iLastIndexOf & 312) + (iLastIndexOf | 312), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr35);
            strArr = new String[]{str18, str19, str20, (String) objArr35[0]};
            i11 = 0;
            while (true) {
                if (i11 < 4) {
                    i12 = i;
                    break;
                }
                int i194 = read + 39;
                IconCompatParcelizer = i194 % Fields.SpotShadowColor;
                int i195 = i194 % 2;
                Object[] objArr36 = {strArr[i11]};
                objRemoteActionCompatParcelizer17 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-502275956);
                if (objRemoteActionCompatParcelizer17 == null) {
                    char c9 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                    int windowTouchSlop3 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 2645;
                    int i196 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21;
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr37 = new Object[1];
                    a(b15, b16, (byte) (b16 + 4), objArr37);
                    objRemoteActionCompatParcelizer17 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c9, windowTouchSlop3, i196, 853524845, false, (String) objArr37[0], new Class[]{String.class});
                }
                long jLongValue6 = ((Long) ((Method) objRemoteActionCompatParcelizer17).invoke(null, objArr36)).longValue();
                long j38 = -878573219;
                strArr15 = strArr;
                long j39 = -159;
                long j40 = (j39 * j38) + (j39 * jLongValue6);
                long j41 = 160;
                long j42 = j ^ j21;
                long j43 = j40 + ((jLongValue6 | (j38 ^ j21)) * j41) + (((long) (-160)) * (((j42 | j38) ^ j21) | ((j38 | jLongValue6) ^ j21))) + (j41 * ((((jLongValue6 ^ j21) | j42) ^ j21) | j38)) + ((long) 1747737642);
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i197 = ~iElapsedRealtime;
                int i198 = (~(2028692554 | i197)) | (-2045470283);
                int i199 = ~(iElapsedRealtime | (-812270603));
                i59 = ((int) (j43 >> 32)) & (((i198 | i199) * (-252)) + 1374790614 + ((i199 | (~(i197 | (-16777729)))) * 252));
                i60 = ((int) j43) & ((-43517635) + (((-1344315434) | i10) * 184) + (((~(765266454 | i10)) | (-1361422890)) * 184));
                if (((i60 & i59) | (i59 ^ i60)) != 0) {
                    int i200 = IconCompatParcelizer + 109;
                    read = i200 % Fields.SpotShadowColor;
                    int i201 = i200 % 2;
                    i12 = i ^ (i11 + 252);
                    break;
                }
                int i202 = ((i11 | (-46)) << 1) - (i11 ^ (-46));
                i11 = (i202 & 47) + (i202 | 47);
                strArr = strArr15;
            }
            int i203 = i ^ i185;
            int i204 = -i203;
            int i205 = ((i203 & i204) | (i203 ^ i204)) >> 31;
            int i206 = i12 & (~i205);
            int i207 = i185 & i205;
            int i208 = (i207 & i206) | (i206 ^ i207);
            int i209 = -Color.red(0);
            int i210 = ((i209 | 13) << 1) - (i209 ^ 13);
            int i211 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 325;
            int i212 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
            Object[] objArr38 = new Object[1];
            b(i210, i211, (char) (((i212 | 36620) << 1) - (i212 ^ 36620)), objArr38);
            Object[] objArr39 = {(String) objArr38[0]};
            objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1468326312);
            if (objRemoteActionCompatParcelizer3 == null) {
                char scrollBarFadeDuration2 = (char) (58126 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 947;
                int iBlue2 = 27 - Color.blue(0);
                byte b17 = (byte) ($$b & 1);
                byte b18 = b17;
                Object[] objArr40 = new Object[1];
                a(b17, b18, (byte) (b18 + 1), objArr40);
                objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(scrollBarFadeDuration2, doubleTapTimeout2, iBlue2, 2024488889, false, (String) objArr40[0], new Class[]{String.class});
            }
            str2 = (String) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr39);
            if (str2 != null) {
                objArr4 = new Object[1];
                b(9 - (~(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))), 338 - View.MeasureSpec.getSize(0), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr4);
                if (str2.contains((String) objArr4[0])) {
                    i13 = (i & (-251)) | (i10 & 250);
                } else {
                    i13 = i;
                }
            } else {
                i13 = i;
            }
            int i213 = ((~i208) & i) | (i208 & i10);
            int i214 = (i213 | (-i213)) >> 31;
            int i215 = i13 & (~i214);
            int i216 = i208 & i214;
            int i217 = (i216 & i215) | (i215 ^ i216);
            int i218 = read + 81;
            IconCompatParcelizer = i218 % Fields.SpotShadowColor;
            int i219 = i218 % 2;
            int i220 = -TextUtils.indexOf("", "", 0);
            int i221 = ((17 | i220) << 1) - (17 ^ i220);
            int i222 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            int i223 = (i222 & 348) + (i222 | 348);
            int i224 = -Color.green(0);
            Object[] objArr41 = new Object[1];
            b(i221, i223, (char) (((i224 | 21145) << 1) - (i224 ^ 21145)), objArr41);
            String str21 = (String) objArr41[0];
            int longPressTimeout4 = ViewConfiguration.getLongPressTimeout() >> 16;
            int i225 = (longPressTimeout4 & 6) + (longPressTimeout4 | 6);
            int i226 = -(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
            Object[] objArr42 = new Object[1];
            b(i225, (i226 ^ 364) + ((i226 & 364) << 1), (char) (60019 - Process.getGidForName("")), objArr42);
            Object[] objArr43 = {str21, (String) objArr42[0]};
            objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(2121162724);
            if (objRemoteActionCompatParcelizer4 == null) {
                char absoluteGravity = (char) (6015 - Gravity.getAbsoluteGravity(0, 0));
                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1411;
                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 18;
                byte b19 = (byte) 0;
                byte b20 = (byte) (b19 + 1);
                Object[] objArr44 = new Object[1];
                a(b19, b20, (byte) (-b20), objArr44);
                objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(absoluteGravity, maximumFlingVelocity, iLastIndexOf2, -1363247611, false, (String) objArr44[0], new Class[]{String.class, String.class});
            }
            long jLongValue7 = ((Long) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr43)).longValue();
            long j44 = 148837856;
            long j45 = 868;
            long j46 = j44 ^ j21;
            long jElapsedRealtime = (int) SystemClock.elapsedRealtime();
            long j47 = jElapsedRealtime ^ j21;
            long j48 = jLongValue7 ^ j21;
            long j49 = j46 | j48;
            j2 = (j45 * j44) + (j45 * jLongValue7) + (((long) (-867)) * (((j46 | j47) ^ j21) | ((j48 | j47) ^ j21))) + (((long) (-1734)) * ((j49 ^ j21) | ((j46 | jElapsedRealtime) ^ j21) | ((j48 | jElapsedRealtime) ^ j21))) + (((long) 867) * (((jElapsedRealtime | (j48 | j44)) ^ j21) | ((j49 | j47) ^ j21) | (((j46 | jLongValue7) | jElapsedRealtime) ^ j21))) + ((long) 1502144022);
            if (((((int) (j2 >> 32)) & ((((~(1681386332 | i)) * 420) - 290318962) + (((~(1681386332 | i10)) | 1613916748) * 420))) | (((int) j2) & (1966717605 + (((~(1636251362 | i)) | 199024952) * (-366)) + (((~(1809840122 | i)) | 25436192) * 366)))) != 0) {
                i14 = (~(i & 251)) & (i | 251);
            } else {
                i14 = i;
            }
            int i227 = (~(i & i217)) & (i | i217);
            int i228 = -i227;
            int i229 = ((i227 & i228) | (i227 ^ i228)) >> 31;
            int i230 = (i217 & i229) | (i14 & (~i229));
            int i231 = 22 - (~(-(ViewConfiguration.getEdgeSlop() >> 16)));
            int i232 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int iSerializer2 = TextInputBigV2Kt$MainText$1$1$1.serializer();
            int i233 = i232 * 319;
            int i234 = ((i233 | (-117290)) << 1) - (i233 ^ (-117290));
            int i235 = ~i232;
            int i236 = -(-(((~((i235 & iSerializer2) | (i235 ^ iSerializer2))) | (-371)) * (-318)));
            int i237 = ((i234 | i236) << 1) - (i236 ^ i234);
            int i238 = ~(((-371) & iSerializer2) | ((-371) ^ iSerializer2));
            int i239 = ~iSerializer2;
            int i240 = (i238 | (~((i239 ^ i232) | (i239 & i232) | 370))) * 318;
            int i241 = ((i237 | i240) << 1) - (i240 ^ i237);
            int i242 = -(-(((~((i232 & 370) | (i232 ^ 370) | iSerializer2)) | (~(((-371) & i239) | ((-371) ^ i239) | i232))) * 318));
            int i243 = ((i241 | i242) << 1) - (i242 ^ i241);
            int i244 = -(ViewConfiguration.getScrollBarSize() >> 8);
            Object[] objArr45 = new Object[1];
            b(i231, i243, (char) ((i244 ^ 29464) + ((i244 & 29464) << 1)), objArr45);
            Object[] objArr46 = {(String) objArr45[0]};
            objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1468326312);
            if (objRemoteActionCompatParcelizer5 == null) {
                char packedPositionGroup2 = (char) (58126 - ExpandableListView.getPackedPositionGroup(0L));
                int i245 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 946;
                int modifierMetaStateMask2 = ((byte) KeyEvent.getModifierMetaStateMask()) + 28;
                byte b21 = (byte) ($$b & 1);
                byte b22 = b21;
                Object[] objArr47 = new Object[1];
                a(b21, b22, (byte) (b22 + 1), objArr47);
                objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(packedPositionGroup2, i245, modifierMetaStateMask2, 2024488889, false, (String) objArr47[0], new Class[]{String.class});
            }
            lowerCase = ((String) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr46)).toLowerCase();
            int i246 = -(-(ViewConfiguration.getTapTimeout() >> 16));
            i15 = (i246 ^ 4) + ((i246 & 4) << 1);
            modifierMetaStateMask = (byte) KeyEvent.getModifierMetaStateMask();
            int i247 = IconCompatParcelizer;
            i16 = (i247 ^ 35) + ((i247 & 35) << 1);
            read = i16 % Fields.SpotShadowColor;
            if (i16 % 2 != 0) {
                int minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity();
                objArr3 = new Object[1];
                b(i15, modifierMetaStateMask * 392, (char) (18115 >> (((minimumFlingVelocity | 119) << 1) - (minimumFlingVelocity ^ 119))), objArr3);
                if (lowerCase.contains((String) objArr3[0])) {
                    i17 = (~(i & Constant.ERROR_ROTATION_ANGLE_INVALID)) & (i | Constant.ERROR_ROTATION_ANGLE_INVALID);
                } else {
                    i17 = i;
                }
            } else {
                int i248 = -modifierMetaStateMask;
                objArr = new Object[1];
                b(i15, (i248 ^ 392) + ((i248 & 392) << 1), (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1220), objArr);
                if (lowerCase.contains((String) objArr[0])) {
                    i17 = (~(i & Constant.ERROR_ROTATION_ANGLE_INVALID)) & (i | Constant.ERROR_ROTATION_ANGLE_INVALID);
                } else {
                    i17 = i;
                }
            }
            int i249 = ((~i230) & i) | (i230 & i10);
            int i250 = -i249;
            int i251 = ((i249 & i250) | (i249 ^ i250)) >> 31;
            int i252 = i17 & (~i251);
            int i253 = i230 & i251;
            int i254 = (i253 & i252) | (i252 ^ i253);
            int i255 = -(-TextUtils.lastIndexOf("", '0', 0, 0));
            int i256 = (i255 ^ 43) + ((i255 & 43) << 1);
            int i257 = 398 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            int i258 = -TextUtils.indexOf("", "", 0, 0);
            Object[] objArr48 = new Object[1];
            b(i256, i257, (char) ((i258 & 64919) + (i258 | 64919)), objArr48);
            String str22 = (String) objArr48[0];
            int i259 = -View.combineMeasuredStates(0, 0);
            int i260 = (i259 & 40) + (i259 | 40);
            int i261 = -(-View.getDefaultSize(0, 0));
            Object[] objArr49 = new Object[1];
            b(i260, (i261 ^ 439) + ((i261 & 439) << 1), (char) ((-2) - (~(-(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))))), objArr49);
            String str23 = (String) objArr49[0];
            Object[] objArr50 = new Object[1];
            b(26 - ((byte) KeyEvent.getModifierMetaStateMask()), 478 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (0 - (~TextUtils.lastIndexOf("", '0'))), objArr50);
            String str24 = (String) objArr50[0];
            int i262 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            Object[] objArr51 = new Object[1];
            b((i262 & 27) + (i262 | 27), 505 - (~(-(ViewConfiguration.getScrollDefaultDelay() >> 16))), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), objArr51);
            String str25 = (String) objArr51[0];
            int i263 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            int packedPositionType = ExpandableListView.getPackedPositionType(0L);
            int i264 = -Color.red(0);
            Object[] objArr52 = new Object[1];
            b((i263 ^ 28) + ((i263 & 28) << 1), ((packedPositionType | 533) << 1) - (packedPositionType ^ 533), (char) (((i264 | 19775) << 1) - (i264 ^ 19775)), objArr52);
            String str26 = (String) objArr52[0];
            int i265 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int i266 = (i265 ^ 26) + ((i265 & 26) << 1);
            int iAlpha = Color.alpha(0);
            Object[] objArr53 = new Object[1];
            b(i266, ((iAlpha | 560) << 1) - (iAlpha ^ 560), (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 51265), objArr53);
            strArr2 = new String[]{str22, str23, str24, str25, str26, (String) objArr53[0]};
            i18 = 0;
            while (true) {
                if (i18 < 6) {
                    i19 = i;
                    break;
                }
                Object[] objArr54 = {strArr2[i18]};
                objRemoteActionCompatParcelizer16 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1468326312);
                if (objRemoteActionCompatParcelizer16 == null) {
                    char c10 = (char) (58126 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                    int offsetAfter = 947 - TextUtils.getOffsetAfter("", 0);
                    int packedPositionChild2 = 26 - ExpandableListView.getPackedPositionChild(0L);
                    byte b23 = (byte) ($$b & 1);
                    byte b24 = b23;
                    Object[] objArr55 = new Object[1];
                    a(b23, b24, (byte) (b24 + 1), objArr55);
                    objRemoteActionCompatParcelizer16 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c10, offsetAfter, packedPositionChild2, 2024488889, false, (String) objArr55[0], new Class[]{String.class});
                }
                str9 = (String) ((Method) objRemoteActionCompatParcelizer16).invoke(null, objArr54);
                if (str9 == null && (!str9.isEmpty())) {
                    int i267 = IconCompatParcelizer;
                    int i268 = (i267 & 7) + (i267 | 7);
                    read = i268 % Fields.SpotShadowColor;
                    if (i268 % 2 != 0) {
                        i57 = i & (-26429);
                        i58 = i10 & 26428;
                    } else {
                        i57 = i & (-266);
                        i58 = i10 & 265;
                    }
                    i19 = i57 | i58;
                    break;
                }
                i18++;
            }
            int i269 = i ^ i254;
            int i270 = -i269;
            int i271 = ((i269 & i270) | (i269 ^ i270)) >> 31;
            int i272 = (i254 & i271) | (i19 & (~i271));
            int longPressTimeout5 = 17 - (ViewConfiguration.getLongPressTimeout() >> 16);
            int i273 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int i274 = ((i273 | 348) << 1) - (i273 ^ 348);
            int maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
            int i275 = maximumDrawingCacheSize * (-518);
            int i276 = (i275 ^ (-10953110)) + ((i275 & (-10953110)) << 1);
            int i277 = ~maximumDrawingCacheSize;
            int i278 = (i277 & i10) | (i277 ^ i10);
            int i279 = ~i278;
            int i280 = -(-(((i279 & 21145) | (i279 ^ 21145)) * 519));
            int i281 = (i276 & i280) + (i280 | i276);
            int i282 = ~(i278 | 21145);
            int i283 = (maximumDrawingCacheSize ^ 21145) | (maximumDrawingCacheSize & 21145);
            int i284 = ~((i283 & i) | (i283 ^ i));
            char c11 = (char) (((i281 - (~(((i282 & i284) | (i282 ^ i284)) * (-519)))) - 1) + ((maximumDrawingCacheSize | (~((i ^ 21145) | (i & 21145)))) * 519));
            Object[] objArr56 = new Object[1];
            b(longPressTimeout5, i274, c11, objArr56);
            String str27 = (String) objArr56[0];
            int i285 = -(-Color.red(0));
            int i286 = (i285 ^ 6) + ((i285 & 6) << 1);
            int i287 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            Object[] objArr57 = new Object[1];
            b(i286, (i287 ^ 587) + ((i287 & 587) << 1), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr57);
            str3 = (String) objArr57[0];
            file = new File(str27);
            if ((!file.exists()) && file.isFile()) {
                try {
                    Scanner scanner = new Scanner(new FileInputStream(file));
                    int iMyPid = Process.myPid() >> 22;
                    int i288 = (iMyPid & 2) + (iMyPid | 2);
                    int i289 = -(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    Object[] objArr58 = new Object[1];
                    b(i288, (i289 ^ 593) + ((i289 & 593) << 1), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr58);
                    scannerUseDelimiter2 = scanner.useDelimiter((String) objArr58[0]);
                    if (!scannerUseDelimiter2.hasNext()) {
                        next2 = "";
                    } else {
                        int i290 = read;
                        int i291 = ((i290 | 117) << 1) - (i290 ^ 117);
                        IconCompatParcelizer = i291 % Fields.SpotShadowColor;
                        int i292 = i291 % 2;
                        next2 = scannerUseDelimiter2.next();
                    }
                    scannerUseDelimiter2.close();
                    if (next2.contains(str3)) {
                        i20 = i ^ 260;
                    } else {
                        int trimmedLength = 13 - TextUtils.getTrimmedLength("");
                        int i293 = -View.resolveSize(0, 0);
                        int i294 = ((i293 | 595) << 1) - (i293 ^ 595);
                        int i295 = -((byte) KeyEvent.getModifierMetaStateMask());
                        Object[] objArr59 = new Object[1];
                        b(trimmedLength, i294, (char) ((i295 & 62572) + (i295 | 62572)), objArr59);
                        String str28 = (String) objArr59[0];
                        int i296 = -(-TextUtils.indexOf((CharSequence) "", '0', 0));
                        int i297 = (i296 & 10) + (i296 | 10);
                        int i298 = -((Process.getThreadPriority(0) + 20) >> 6);
                        Object[] objArr60 = new Object[1];
                        b(i297, ((i298 | 608) << 1) - (i298 ^ 608), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 3822), objArr60);
                        str4 = (String) objArr60[0];
                        file2 = new File(str28);
                        if (file2.exists()) {
                            i21 = IconCompatParcelizer + 63;
                            read = i21 % Fields.SpotShadowColor;
                            if (i21 % 2 == 0) {
                                file2.isFile();
                                throw null;
                            }
                            if (file2.isFile()) {
                                try {
                                    Scanner scanner2 = new Scanner(new FileInputStream(file2));
                                    Object[] objArr61 = new Object[1];
                                    b(View.combineMeasuredStates(0, 0) + 2, 593 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) Gravity.getAbsoluteGravity(0, 0), objArr61);
                                    scannerUseDelimiter = scanner2.useDelimiter((String) objArr61[0]);
                                    if (scannerUseDelimiter.hasNext()) {
                                        next = scannerUseDelimiter.next();
                                    } else {
                                        next = "";
                                    }
                                    scannerUseDelimiter.close();
                                    if (next.contains(str4)) {
                                        i20 = (i & (-262)) | (i10 & 261);
                                    } else {
                                        i20 = i;
                                    }
                                } catch (IOException unused) {
                                }
                            } else {
                                i20 = i;
                            }
                        } else {
                            i20 = i;
                        }
                    }
                } catch (IOException unused2) {
                }
            } else {
                int trimmedLength2 = 13 - TextUtils.getTrimmedLength("");
                int i299 = -View.resolveSize(0, 0);
                int i2910 = ((i299 | 595) << 1) - (i299 ^ 595);
                int i2911 = -((byte) KeyEvent.getModifierMetaStateMask());
                Object[] objArr510 = new Object[1];
                b(trimmedLength2, i2910, (char) ((i2911 & 62572) + (i2911 | 62572)), objArr510);
                String str29 = (String) objArr510[0];
                int i2912 = -(-TextUtils.indexOf((CharSequence) "", '0', 0));
                int i2913 = (i2912 & 10) + (i2912 | 10);
                int i2914 = -((Process.getThreadPriority(0) + 20) >> 6);
                Object[] objArr62 = new Object[1];
                b(i2913, ((i2914 | 608) << 1) - (i2914 ^ 608), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 3822), objArr62);
                str4 = (String) objArr62[0];
                file2 = new File(str29);
                if (file2.exists()) {
                    i21 = IconCompatParcelizer + 63;
                    read = i21 % Fields.SpotShadowColor;
                    if (i21 % 2 == 0) {
                        file2.isFile();
                        throw null;
                    }
                    if (file2.isFile()) {
                        Scanner scanner3 = new Scanner(new FileInputStream(file2));
                        Object[] objArr63 = new Object[1];
                        b(View.combineMeasuredStates(0, 0) + 2, 593 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) Gravity.getAbsoluteGravity(0, 0), objArr63);
                        scannerUseDelimiter = scanner3.useDelimiter((String) objArr63[0]);
                        if (scannerUseDelimiter.hasNext()) {
                            next = scannerUseDelimiter.next();
                        } else {
                            next = "";
                        }
                        scannerUseDelimiter.close();
                        if (next.contains(str4)) {
                            i20 = (i & (-262)) | (i10 & 261);
                        } else {
                            i20 = i;
                        }
                    } else {
                        i20 = i;
                    }
                } else {
                    i20 = i;
                }
            }
            int i300 = ((~i272) & i) | (i272 & i10);
            int i301 = (i300 | (-i300)) >> 31;
            int i302 = i20 & (~i301);
            int i303 = i272 & i301;
            i22 = (i303 & i302) | (i302 ^ i303);
            if ((i2 & 8) == 0) {
                int i304 = read;
                int i305 = ((i304 | 123) << 1) - (i304 ^ 123);
                IconCompatParcelizer = i305 % Fields.SpotShadowColor;
                int i306 = i305 % 2;
                Object[] objArr64 = new Object[1];
                b(41 - (~(-TextUtils.indexOf((CharSequence) "", '0'))), 616 - (~(-KeyEvent.normalizeMetaState(0))), (char) (43704 - (~(-TextUtils.indexOf((CharSequence) "", '0', 0, 0)))), objArr64);
                String str30 = (String) objArr64[0];
                int i307 = -(-Color.alpha(0));
                Object[] objArr65 = new Object[1];
                b((i307 & 41) + (i307 | 41), 660 - (~(-(-TextUtils.lastIndexOf("", '0')))), (char) (0 - (~(-(-TextUtils.indexOf((CharSequence) "", '0', 0))))), objArr65);
                String str31 = (String) objArr65[0];
                int capsMode = TextUtils.getCapsMode("", 0, 0);
                int i308 = (capsMode & 38) + (capsMode | 38);
                int keyRepeatTimeout = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                Object[] objArr66 = new Object[1];
                b(i308, (keyRepeatTimeout ^ 701) + ((keyRepeatTimeout & 701) << 1), (char) (56386 - (ViewConfiguration.getLongPressTimeout() >> 16)), objArr66);
                strArr13 = new String[]{str30, str31, (String) objArr66[0]};
                i53 = 0;
                while (true) {
                    if (i53 < 3) {
                        i54 = i;
                        break;
                    }
                    Object[] objArr67 = {strArr13[i53]};
                    objRemoteActionCompatParcelizer15 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(971290740);
                    if (objRemoteActionCompatParcelizer15 == null) {
                        char cBlue = (char) Color.blue(0);
                        int deadChar = KeyEvent.getDeadChar(0, 0) + 2645;
                        int absoluteGravity2 = 22 - Gravity.getAbsoluteGravity(0, 0);
                        byte b25 = (byte) ($$b & 1);
                        byte b26 = b25;
                        Object[] objArr68 = new Object[1];
                        a(b25, b26, (byte) (b26 + 1), objArr68);
                        objRemoteActionCompatParcelizer15 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cBlue, deadChar, absoluteGravity2, -382428779, false, (String) objArr68[0], new Class[]{String.class});
                    }
                    long jLongValue8 = ((Long) ((Method) objRemoteActionCompatParcelizer15).invoke(null, objArr67)).longValue();
                    long j50 = 1975738297;
                    strArr14 = strArr13;
                    long j51 = -754;
                    long j52 = j50 ^ j21;
                    long j53 = j52 | jLongValue8;
                    long j54 = j ^ j21;
                    long j55 = (((long) 755) * j50) + (((long) (-753)) * jLongValue8) + (((j53 ^ j21) | ((j52 | j) ^ j21) | ((jLongValue8 | j) ^ j21)) * j51) + (j51 * (((j53 | j) ^ j21) | ((jLongValue8 | (j54 | j50)) ^ j21))) + (((long) 754) * (j52 | j54)) + ((long) (-2039770309));
                    i55 = ((int) (j55 >> 32)) & ((((((~((-652006251) | i10)) | 1069354) | (~(785220160 | i10))) * (-397)) - 333621846) + ((135352618 | i) * 397));
                    int i309 = ~((-1050697033) | i10);
                    i56 = ((int) j55) & (((17408033 | i309) * (-374)) + 817746791 + ((i309 | (-1068105066)) * 374));
                    if (((i55 & i56) | (i55 ^ i56)) != 0) {
                        int i310 = read;
                        int i311 = i310 + 17;
                        IconCompatParcelizer = i311 % Fields.SpotShadowColor;
                        int i312 = i311 % 2;
                        i54 = ((i53 & 280) + (i53 | 280)) ^ i;
                        int i313 = i310 + 81;
                        IconCompatParcelizer = i313 % Fields.SpotShadowColor;
                        int i314 = i313 % 2;
                        break;
                    }
                    i53++;
                    strArr13 = strArr14;
                }
                int i315 = (~(i & i22)) & (i | i22);
                int i316 = -i315;
                int i317 = ((i315 & i316) | (i315 ^ i316)) >> 31;
                int i318 = i54 & (~i317);
                int i319 = i22 & i317;
                i22 = (i319 & i318) | (i318 ^ i319);
            }
            int i320 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int i321 = -(-View.resolveSize(0, 0));
            Object[] objArr69 = new Object[1];
            b(((i320 | 41) << 1) - (i320 ^ 41), ((i321 | 739) << 1) - (i321 ^ 739), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 11543), objArr69);
            String str32 = (String) objArr69[0];
            int fadingEdgeLength = ViewConfiguration.getFadingEdgeLength() >> 16;
            int i322 = ((fadingEdgeLength | 30) << 1) - (fadingEdgeLength ^ 30);
            int i323 = 779 - (~(-View.resolveSizeAndState(0, 0, 0)));
            int i324 = -TextUtils.lastIndexOf("", '0', 0, 0);
            Object[] objArr70 = new Object[1];
            b(i322, i323, (char) ((i324 & 30717) + (i324 | 30717)), objArr70);
            strArr3 = new String[]{str32, (String) objArr70[0]};
            i23 = 0;
            while (true) {
                if (i23 < 2) {
                    i24 = i;
                    break;
                }
                Object[] objArr71 = {strArr3[i23]};
                objRemoteActionCompatParcelizer14 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1794492419);
                if (objRemoteActionCompatParcelizer14 == null) {
                    char c12 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                    int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 2645;
                    int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 22;
                    byte b27 = (byte) 0;
                    byte b28 = (byte) (b27 + 1);
                    Object[] objArr72 = new Object[1];
                    a(b27, b28, (byte) (-b28), objArr72);
                    objRemoteActionCompatParcelizer14 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c12, iResolveSizeAndState, packedPositionType2, 1171920412, false, (String) objArr72[0], new Class[]{String.class});
                }
                long jLongValue9 = ((Long) ((Method) objRemoteActionCompatParcelizer14).invoke(null, objArr71)).longValue();
                long j56 = 36278171;
                strArr12 = strArr3;
                long j57 = (((long) 595) * j56) + (((long) (-1187)) * jLongValue9);
                long j58 = ((j56 ^ j21) | jLongValue9) ^ j21;
                long j59 = j ^ j21;
                long j60 = j57 + (((long) (-1188)) * (j58 | ((j59 | jLongValue9) ^ j21)));
                long j61 = 594;
                long j62 = jLongValue9 ^ j21;
                long j63 = (j59 | j56) ^ j21;
                long j64 = j60 + ((j58 | ((j62 | j) ^ j21) | j63) * j61) + (j61 * (((j62 | j56) ^ j21) | ((j62 | j59) ^ j21) | j63)) + ((long) 1057172479);
                i51 = ((int) (j64 >> 32)) & ((((~((-1095780353) | i)) | 335675432) * 501) + 1537417058 + ((~((-1095780353) | i10)) * 501));
                i52 = ((int) j64) & ((-1547941655) + (((~((-984550736) | i)) | 1873190150) * (-366)) + (((~((-269025354) | i)) | 1157664768) * 366));
                if (((i52 & i51) | (i51 ^ i52)) != 0) {
                    int i325 = i23 + 288;
                    i24 = ((~i325) & i) | (i325 & i10);
                    break;
                }
                i23++;
                strArr3 = strArr12;
            }
            int i326 = i ^ i22;
            int i327 = -i326;
            int i328 = ((i326 & i327) | (i326 ^ i327)) >> 31;
            int i329 = i24 & (~i328);
            int i330 = i22 & i328;
            i25 = (i330 & i329) | (i329 ^ i330);
            objRemoteActionCompatParcelizer6 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-20375759);
            if (objRemoteActionCompatParcelizer6 == null) {
                char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 40511);
                int i331 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2101;
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 19;
                byte b29 = (byte) 0;
                byte b30 = (byte) (b29 + 1);
                Object[] objArr73 = new Object[1];
                a(b29, b30, (byte) (-b30), objArr73);
                objRemoteActionCompatParcelizer6 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(maxKeyCode, i331, jumpTapTimeout, 773404368, false, (String) objArr73[0], new Class[0]);
            }
            long jLongValue10 = ((Long) ((Method) objRemoteActionCompatParcelizer6).invoke(null, null)).longValue();
            long j65 = -1500855620;
            long j66 = j65 ^ j21;
            long j67 = jLongValue10 ^ j21;
            long jElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
            long j68 = (((long) 592) * j65) + (((long) (-590)) * jLongValue10) + (((long) (-1182)) * ((j66 | jLongValue10) ^ j21)) + (((long) (-591)) * ((((j66 | j67) | (jElapsedRealtime2 ^ j21)) ^ j21) | ((jLongValue10 | j65) ^ j21))) + (((long) 591) * (jElapsedRealtime2 | j66 | j67)) + ((long) (-444430705));
            int i332 = ~new Random().nextInt(1664265385);
            i26 = ((int) (j68 >> 32)) & ((-336018934) + (((-10755) | i332) * 184) + (((~(i332 | (-1083566596))) | (-690629203)) * 184));
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            i27 = ((int) j68) & (123090714 + (((~((-271058049) | (~elapsedCpuTime))) | 1708284458) * (-591)) + ((elapsedCpuTime | (-271058049)) * 591));
            if (((i26 & i27) | (i26 ^ i27)) != 1) {
                Object[] objArr74 = {1};
                objRemoteActionCompatParcelizer7 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-734179977);
                if (objRemoteActionCompatParcelizer7 == null) {
                    char keyRepeatDelay2 = (char) (44612 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                    int i333 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2357;
                    int i334 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12;
                    byte b31 = (byte) 0;
                    byte b32 = (byte) (b31 + 1);
                    Object[] objArr75 = new Object[1];
                    a(b31, b32, (byte) (-b32), objArr75);
                    objRemoteActionCompatParcelizer7 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(keyRepeatDelay2, i333, i334, 82668694, false, (String) objArr75[0], new Class[]{Integer.TYPE});
                }
                long jLongValue11 = ((Long) ((Method) objRemoteActionCompatParcelizer7).invoke(null, objArr74)).longValue();
                long j69 = 1437177382;
                long j70 = jLongValue11 ^ j21;
                long j71 = j ^ j21;
                long j72 = (j71 | jLongValue11) ^ j21;
                long j73 = (((long) (-515)) * j69) + (((long) 517) * jLongValue11) + (((long) (-516)) * (((j70 | j) ^ j21) | ((j71 | j69) ^ j21) | j72));
                long j74 = 516;
                long j75 = j69 ^ j21;
                long j76 = j73 + (((((j75 | j70) | j) ^ j21) | (((j75 | j71) | jLongValue11) ^ j21)) * j74) + (j74 * (((jLongValue11 | j75) ^ j21) | j72)) + ((long) (-1840417969));
                int i335 = (int) Runtime.getRuntime().totalMemory();
                i29 = ((int) (j76 >> 32)) & ((-2005432166) + (((~((-1079140508) | i335)) | 5398539) * 104) + ((~((~i335) | 1431827871)) * (-104)) + ((i335 | 358085903) * 104));
                i30 = ((int) j76) & (2134139841 + (((~(1409152255 | i10)) | 28074154 | (~((-334324907) | i))) * (-68)) + ((~(i10 | (-306250753))) * (-68)) + (((~(334324906 | i10)) | 1102901503) * 68));
                if (((i29 & i30) | (i29 ^ i30)) != 0) {
                    i31 = i10;
                    i32 = (i & (-221)) | (i31 & 220);
                } else {
                    i31 = i10;
                    i32 = i;
                }
                int i336 = (~(i & i25)) & (i | i25);
                int i337 = (i336 | (-i336)) >> 31;
                int i338 = i32 & (~i337);
                int i339 = i25 & i337;
                i33 = (i339 & i338) | (i338 ^ i339);
                int i340 = 22 - (~(-(-Color.argb(0, 0, 0, 0))));
                int i341 = -Color.blue(0);
                int i342 = (i341 ^ 370) + ((i341 & 370) << 1);
                int maxKeyCode2 = KeyEvent.getMaxKeyCode() >> 16;
                Object[] objArr76 = new Object[1];
                b(i340, i342, (char) ((maxKeyCode2 ^ 29464) + ((maxKeyCode2 & 29464) << 1)), objArr76);
                Object[] objArr77 = {(String) objArr76[0]};
                objRemoteActionCompatParcelizer8 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1468326312);
                if (objRemoteActionCompatParcelizer8 == null) {
                    char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 58126);
                    int i343 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 946;
                    int windowTouchSlop4 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 27;
                    byte b33 = (byte) ($$b & 1);
                    byte b34 = b33;
                    Object[] objArr78 = new Object[1];
                    a(b33, b34, (byte) (b34 + 1), objArr78);
                    objRemoteActionCompatParcelizer8 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(edgeSlop, i343, windowTouchSlop4, 2024488889, false, (String) objArr78[0], new Class[]{String.class});
                }
                objInvoke = ((Method) objRemoteActionCompatParcelizer8).invoke(null, objArr77);
                try {
                    if (objInvoke != null) {
                        int i344 = IconCompatParcelizer + 75;
                        read = i344 % Fields.SpotShadowColor;
                        int i345 = i344 % 2;
                        Object[] objArr79 = {objInvoke, 42};
                        objRemoteActionCompatParcelizer13 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-998984536);
                        if (objRemoteActionCompatParcelizer13 == null) {
                            char c13 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int fadingEdgeLength2 = 1481 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                            int iArgb = 31 - Color.argb(0, 0, 0, 0);
                            byte b35 = (byte) 0;
                            byte b36 = (byte) (b35 + 1);
                            Object[] objArr80 = new Object[1];
                            a(b35, b36, (byte) (-b36), objArr80);
                            objRemoteActionCompatParcelizer13 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c13, fadingEdgeLength2, iArgb, 346330441, false, (String) objArr80[0], new Class[]{String.class, Integer.TYPE});
                        }
                        long jLongValue12 = ((Long) ((Method) objRemoteActionCompatParcelizer13).invoke(null, objArr79)).longValue();
                        long j77 = -707879779;
                        long j78 = 569;
                        long j79 = j77 ^ j21;
                        long j80 = jLongValue12 ^ j21;
                        long j81 = j79 | j80;
                        long jElapsedRealtime3 = (int) SystemClock.elapsedRealtime();
                        long j82 = jElapsedRealtime3 ^ j21;
                        long j83 = (j78 * j77) + (j78 * jLongValue12) + (((long) (-1136)) * ((j81 ^ j21) | ((j79 | j82) ^ j21) | ((j80 | j82) ^ j21)));
                        long j84 = j82 | j77;
                        long j85 = j83 + (((long) (-568)) * (((j79 | jElapsedRealtime3) ^ j21) | ((j80 | jElapsedRealtime3) ^ j21) | ((j84 | jLongValue12) ^ j21))) + (((long) 568) * (((j81 | jElapsedRealtime3) ^ j21) | ((j82 | jLongValue12) ^ j21) | (j84 ^ j21))) + ((long) (-426345249));
                        i49 = ((int) (j85 >> 32)) & ((((~(798055164 | i)) | 1346635008) * (-283)) + 282844330 + ((~(2144690172 | i)) * 283));
                        int startUptimeMillis = (int) Process.getStartUptimeMillis();
                        int i346 = ~startUptimeMillis;
                        int i347 = 18631677 + (((~((-1344290977) | i346)) | (~(1479827621 | startUptimeMillis))) * 520);
                        int i348 = ~((-1479827622) | i346);
                        int i349 = ~(startUptimeMillis | 1377913264);
                        i50 = ((int) j85) & (i347 + ((i348 | i349) * (-1040)) + ((i349 | (~(i346 | (-1377913265))) | 135536645) * 520));
                        if (((i50 & i49) | (i49 ^ i50)) == 1986687685) {
                            int i350 = read;
                            int i351 = (i350 & 49) + (i350 | 49);
                            IconCompatParcelizer = i351 % Fields.SpotShadowColor;
                            int i352 = i351 % 2;
                            strArr6 = null;
                            i39 = 0;
                            i38 = 1;
                        }
                        int i353 = -Color.green(i39);
                        int i354 = (i353 ^ 16) + ((i353 & 16) << i38);
                        int iResolveSize2 = View.resolveSize(i39, i39);
                        Object[] objArr81 = new Object[i38];
                        b(i354, ((iResolveSize2 | 891) << i38) - (iResolveSize2 ^ 891), (char) KeyEvent.keyCodeFromString(""), objArr81);
                        Object[] objArr82 = {(String) objArr81[i39]};
                        objRemoteActionCompatParcelizer10 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1468326312);
                        if (objRemoteActionCompatParcelizer10 == null) {
                            char c14 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 58125);
                            int capsMode2 = TextUtils.getCapsMode("", 0, 0) + 947;
                            int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 27;
                            byte b37 = (byte) ($$b & 1);
                            byte b38 = b37;
                            Object[] objArr83 = new Object[1];
                            a(b37, b38, (byte) (b38 + 1), objArr83);
                            objRemoteActionCompatParcelizer10 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c14, capsMode2, iNormalizeMetaState2, 2024488889, false, (String) objArr83[0], new Class[]{String.class});
                        }
                        objInvoke2 = ((Method) objRemoteActionCompatParcelizer10).invoke(null, objArr82);
                        if (objInvoke2 == null) {
                            i40 = 0;
                        } else {
                            Object[] objArr84 = {objInvoke2, 42};
                            objRemoteActionCompatParcelizer11 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-998984536);
                            if (objRemoteActionCompatParcelizer11 == null) {
                                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
                                int longPressTimeout6 = (ViewConfiguration.getLongPressTimeout() >> 16) + 1481;
                                int maximumDrawingCacheSize2 = 31 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                byte b39 = (byte) 0;
                                byte b40 = (byte) (b39 + 1);
                                Object[] objArr85 = new Object[1];
                                a(b39, b40, (byte) (-b40), objArr85);
                                objRemoteActionCompatParcelizer11 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cIndexOf, longPressTimeout6, maximumDrawingCacheSize2, 346330441, false, (String) objArr85[0], new Class[]{String.class, Integer.TYPE});
                            }
                            long jLongValue13 = ((Long) ((Method) objRemoteActionCompatParcelizer11).invoke(null, objArr84)).longValue();
                            int i355 = IconCompatParcelizer;
                            int i356 = (i355 & 37) + (i355 | 37);
                            read = i356 % Fields.SpotShadowColor;
                            int i357 = i356 % 2;
                            long j86 = 914880113;
                            long j87 = 306;
                            long j88 = ((long) 610) + (j87 * j86) + (j87 * jLongValue13);
                            long j89 = 305;
                            long jFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
                            long j90 = j88 + ((((j86 | jLongValue13) ^ j21) | ((j86 | jFreeMemory2) ^ j21)) * j89) + (j89 * ((((jFreeMemory2 ^ j21) | j86) ^ j21) | (jLongValue13 ^ j21))) + ((long) (-2049105141));
                            int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
                            int i358 = ((int) (j90 >> 32)) & (745434130 + (((~(1427572846 | iFreeMemory2)) | (-9653565)) * (-465)) + ((1427572846 | (~((-9653565) | iFreeMemory2))) * 930) + ((iFreeMemory2 | (-8406289)) * 465));
                            int iMyTid = Process.myTid();
                            int i359 = ~iMyTid;
                            int i360 = ((int) j90) & ((-1687905466) + (((~((-887992997) | i359)) | 1969747889) * (-90)) + (((~((-887992997) | iMyTid)) | (-1978660790)) * (-45)) + (((~(iMyTid | (-1969747890))) | (-887992997) | (~(i359 | 1969747889))) * 45));
                            i40 = (i358 & i360) | (i358 ^ i360);
                        }
                        if (i40 != 1986687685 || i40 == -1514516938) {
                            i41 = i31;
                            strArr7 = strArr6;
                        } else {
                            int i361 = -(-Gravity.getAbsoluteGravity(0, 0));
                            int i362 = ((i361 | 14) << 1) - (i361 ^ 14);
                            int i363 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            int i364 = (i363 ^ 1610) + ((i363 & 1610) << 1);
                            int i365 = -Color.green(0);
                            Object[] objArr86 = new Object[1];
                            b(i362, i364, (char) (((i365 | 16667) << 1) - (i365 ^ 16667)), objArr86);
                            String str33 = (String) objArr86[0];
                            int pressedStateDuration = 26 - (ViewConfiguration.getPressedStateDuration() >> 16);
                            int i366 = -(-KeyEvent.normalizeMetaState(0));
                            int i367 = (i366 ^ 1624) + ((i366 & 1624) << 1);
                            int i368 = -TextUtils.lastIndexOf("", '0', 0, 0);
                            Object[] objArr87 = new Object[1];
                            b(pressedStateDuration, i367, (char) ((i368 & 51100) + (i368 | 51100)), objArr87);
                            String str34 = (String) objArr87[0];
                            int i369 = -View.MeasureSpec.getSize(0);
                            int i370 = (i369 & 17) + (i369 | 17);
                            int i371 = -(-(ViewConfiguration.getTapTimeout() >> 16));
                            Object[] objArr88 = new Object[1];
                            b(i370, (i371 ^ 1650) + ((i371 & 1650) << 1), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), objArr88);
                            String str35 = (String) objArr88[0];
                            byte modifierMetaStateMask3 = (byte) KeyEvent.getModifierMetaStateMask();
                            int i372 = (modifierMetaStateMask3 & 18) + (modifierMetaStateMask3 | 18);
                            int scrollBarFadeDuration3 = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                            int i373 = (scrollBarFadeDuration3 ^ 1667) + ((scrollBarFadeDuration3 & 1667) << 1);
                            int i374 = -Color.argb(0, 0, 0, 0);
                            Object[] objArr89 = new Object[1];
                            b(i372, i373, (char) ((i374 & 27538) + (i374 | 27538)), objArr89);
                            String str36 = (String) objArr89[0];
                            int i375 = -Color.argb(0, 0, 0, 0);
                            int i376 = (i375 ^ 15) + ((i375 & 15) << 1);
                            int i377 = -(-(ViewConfiguration.getJumpTapTimeout() >> 16));
                            int i378 = ((i377 | 1684) << 1) - (i377 ^ 1684);
                            int i379 = -KeyEvent.keyCodeFromString("");
                            Object[] objArr90 = new Object[1];
                            b(i376, i378, (char) (((i379 | 43169) << 1) - (i379 ^ 43169)), objArr90);
                            String str37 = (String) objArr90[0];
                            int i380 = -(ViewConfiguration.getTouchSlop() >> 8);
                            int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0, 0);
                            Object[] objArr91 = new Object[1];
                            b(((i380 | 37) << 1) - (i380 ^ 37), ((iLastIndexOf3 | 1700) << 1) - (iLastIndexOf3 ^ 1700), (char) ((-2) - (~(-Process.getGidForName("")))), objArr91);
                            String str38 = (String) objArr91[0];
                            int minimumFlingVelocity2 = 12 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            int i381 = -(-View.MeasureSpec.getSize(0));
                            Object[] objArr92 = new Object[1];
                            b(minimumFlingVelocity2, ((i381 | 1736) << 1) - (i381 ^ 1736), (char) ExpandableListView.getPackedPositionType(0L), objArr92);
                            String str39 = (String) objArr92[0];
                            int i382 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                            int i383 = (i382 ^ 14) + ((i382 & 14) << 1);
                            int iKeyCodeFromString = KeyEvent.keyCodeFromString("");
                            Object[] objArr93 = new Object[1];
                            b(i383, ((iKeyCodeFromString | 1748) << 1) - (iKeyCodeFromString ^ 1748), (char) View.MeasureSpec.getSize(0), objArr93);
                            String str40 = (String) objArr93[0];
                            int i384 = -Color.green(0);
                            int i385 = (i384 ^ 22) + ((i384 & 22) << 1);
                            int i386 = -(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                            Object[] objArr94 = new Object[1];
                            b(i385, ((i386 | 1761) << 1) - (i386 ^ 1761), (char) (35251 - (KeyEvent.getMaxKeyCode() >> 16)), objArr94);
                            String str41 = (String) objArr94[0];
                            int iKeyCodeFromString2 = KeyEvent.keyCodeFromString("") + 31;
                            int i387 = -(-Color.alpha(0));
                            Object[] objArr95 = new Object[1];
                            b(iKeyCodeFromString2, ((i387 | 1783) << 1) - (i387 ^ 1783), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr95);
                            String str42 = (String) objArr95[0];
                            int fadingEdgeLength3 = ViewConfiguration.getFadingEdgeLength() >> 16;
                            int i388 = ((fadingEdgeLength3 | 12) << 1) - (fadingEdgeLength3 ^ 12);
                            int iRed = Color.red(0);
                            Object[] objArr96 = new Object[1];
                            b(i388, ((iRed | 1814) << 1) - (iRed ^ 1814), (char) View.resolveSize(0, 0), objArr96);
                            String str43 = (String) objArr96[0];
                            int i389 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int i390 = i389 * (-1529);
                            int i391 = (i390 ^ (-9168)) + ((i390 & (-9168)) << 1);
                            int i392 = ~i389;
                            int i393 = ~((i392 ^ (-13)) | (i392 & (-13)) | i31);
                            int i394 = ~i389;
                            int i395 = (i394 ^ 12) | (i394 & 12);
                            int i396 = ~((i395 & i) | (i395 ^ i));
                            int i397 = ((-13) ^ i389) | ((-13) & i389);
                            int i398 = ((i393 & i396) | (i393 ^ i396) | (~((i397 & i) | (i397 ^ i)))) * 765;
                            int i399 = (i391 & i398) + (i391 | i398);
                            int i400 = ~((i392 & (-13)) | (i392 ^ (-13)));
                            int i401 = ~((i394 ^ i31) | (i394 & i31));
                            int i402 = i399 + (((i400 & i401) | (i400 ^ i401)) * 1530);
                            int i403 = ~((i394 ^ i) | (i394 & i));
                            int i404 = ((-13) ^ i31) | ((-13) & i31);
                            int i405 = ~((i389 & i404) | (i404 ^ i389));
                            int i406 = -(-(((i405 & i403) | (i403 ^ i405)) * 765));
                            int i407 = ((i402 | i406) << 1) - (i406 ^ i402);
                            int i408 = -(-(ViewConfiguration.getScrollBarFadeDuration() >> 16));
                            int i409 = ((i408 | 1826) << 1) - (i408 ^ 1826);
                            int iResolveSize3 = View.resolveSize(0, 0);
                            Object[] objArr97 = new Object[1];
                            b(i407, i409, (char) ((iResolveSize3 ^ 12611) + ((iResolveSize3 & 12611) << 1)), objArr97);
                            String str44 = (String) objArr97[0];
                            int i410 = 13 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            int i411 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                            int i412 = i411 * 829;
                            int i413 = (i412 & 1523702) + (i412 | 1523702);
                            int i414 = ~i411;
                            int i415 = i31 | i411;
                            int i416 = ((~((i414 & (-1839)) | (i414 ^ (-1839)))) | (~((i415 & 1838) | (i415 ^ 1838)))) * (-828);
                            int i417 = ((i413 | i416) << 1) - (i416 ^ i413);
                            int i418 = (i411 & 1838) | (i411 ^ 1838);
                            int i419 = -(-(((i418 ^ i31) | (i418 & i31)) * (-828)));
                            int i420 = (i417 & i419) + (i419 | i417);
                            int i421 = -(-((~i418) * 828));
                            int i422 = (i420 ^ i421) + ((i421 & i420) << 1);
                            int i423 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            Object[] objArr98 = new Object[1];
                            b(i410, i422, (char) ((i423 ^ 57942) + ((i423 & 57942) << 1)), objArr98);
                            String str45 = (String) objArr98[0];
                            Object[] objArr99 = new Object[1];
                            b(11 - (~TextUtils.getCapsMode("", 0, 0)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1849, (char) Color.green(0), objArr99);
                            String str46 = (String) objArr99[0];
                            int i424 = -AndroidCharacter.getMirror('0');
                            Object[] objArr100 = new Object[1];
                            b((i424 & 60) + (i424 | 60), 1862 - Color.green(0), (char) (MotionEvent.axisFromString("") + 56912), objArr100);
                            String str47 = (String) objArr100[0];
                            int i425 = 13 - (~(-(-TextUtils.getTrimmedLength(""))));
                            int i426 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            Object[] objArr101 = new Object[1];
                            b(i425, (i426 & 1874) + (i426 | 1874), (char) (35579 - (~(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))), objArr101);
                            String str48 = (String) objArr101[0];
                            int i427 = -(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                            int i428 = (i427 & 12) + (i427 | 12);
                            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 1888;
                            int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                            int iSerializer3 = TextInputBigV2Kt$MainText$1$1$1.serializer();
                            int i429 = iIndexOf3 * (-112);
                            int i430 = ((i429 | (-112)) << 1) - (i429 ^ (-112));
                            int i431 = ~((-2) | (~iSerializer3));
                            int i432 = ((i431 & iIndexOf3) | (iIndexOf3 ^ i431)) * Constant.ERROR_WSS_SPEED_JUMP;
                            int i433 = (i430 ^ i432) + ((i432 & i430) << 1);
                            int i434 = ~iIndexOf3;
                            int i435 = ~(i434 | 1);
                            int i436 = ~(i434 | iSerializer3);
                            int i437 = (i436 & i435) | (i435 ^ i436);
                            int i438 = ~(iIndexOf3 | (-2) | (~iSerializer3));
                            int i439 = (i433 - (~(-(-(((i438 & i437) | (i437 ^ i438)) * (-113)))))) - 1;
                            int i440 = (~(((-2) & iSerializer3) | ((-2) ^ iSerializer3))) * 113;
                            Object[] objArr102 = new Object[1];
                            b(i428, touchSlop, (char) ((i439 & i440) + (i440 | i439)), objArr102);
                            String str49 = (String) objArr102[0];
                            int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 24;
                            int i441 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                            Object[] objArr103 = new Object[1];
                            b(iResolveSizeAndState2, (i441 ^ 1901) + ((i441 & 1901) << 1), (char) (55287 - (~(-TextUtils.getOffsetBefore("", 0)))), objArr103);
                            String str50 = (String) objArr103[0];
                            int i442 = -TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                            Object[] objArr104 = new Object[1];
                            b((i442 ^ 27) + ((i442 & 27) << 1), 1924 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2843), objArr104);
                            String[] strArr19 = {str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, str47, str48, str49, str50, (String) objArr104[0]};
                            int i443 = 0;
                            while (true) {
                                if (i443 >= 19) {
                                    i41 = i31;
                                    strArr7 = strArr6;
                                    i443 = -1;
                                    break;
                                }
                                String str51 = strArr19[i443];
                                Object[] objArr105 = {str51};
                                Object objRemoteActionCompatParcelizer23 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-502275956);
                                if (objRemoteActionCompatParcelizer23 == null) {
                                    char packedPositionType3 = (char) ExpandableListView.getPackedPositionType(0L);
                                    int iAxisFromString2 = MotionEvent.axisFromString("") + 2646;
                                    int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0') + 23;
                                    byte b41 = (byte) 0;
                                    byte b42 = b41;
                                    Object[] objArr106 = new Object[1];
                                    a(b41, b42, (byte) (b42 + 4), objArr106);
                                    objRemoteActionCompatParcelizer23 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(packedPositionType3, iAxisFromString2, iIndexOf4, 853524845, false, (String) objArr106[0], new Class[]{String.class});
                                }
                                long jLongValue14 = ((Long) ((Method) objRemoteActionCompatParcelizer23).invoke(null, objArr105)).longValue();
                                long j91 = 101484030;
                                strArr7 = strArr6;
                                long j92 = jLongValue14 ^ j21;
                                String[] strArr20 = strArr19;
                                long startUptimeMillis2 = (int) Process.getStartUptimeMillis();
                                long j93 = (j91 | startUptimeMillis2) ^ j21;
                                long j94 = 407;
                                long j95 = j91 ^ j21;
                                long j96 = (j95 | jLongValue14) ^ j21;
                                long j97 = (((long) (-813)) * j91) + (((long) 408) * jLongValue14) + (((long) (-814)) * (((j92 | j91) ^ j21) | j93)) + ((((j92 | (startUptimeMillis2 ^ j21)) ^ j21) | j96 | j93) * j94) + (j94 * (j96 | ((j95 | startUptimeMillis2) ^ j21) | ((startUptimeMillis2 | jLongValue14) ^ j21))) + ((long) 767680393);
                                int iNextInt2 = new Random().nextInt(902316366);
                                int i444 = ((int) (j97 >> 32)) & ((((~((-1757624308) | iNextInt2)) | 8768) * (-283)) + 1439707754 + ((~(iNextInt2 | (-1757615540))) * 283));
                                int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                                int i445 = ((int) j97) & (1320243365 + (((~(629988642 | iElapsedRealtime2)) | (-899546536)) * 1504) + ((~(iElapsedRealtime2 | (-269557894))) * (-1504)) + 1540789424);
                                if (((i444 & i445) | (i444 ^ i445)) != 0) {
                                    i41 = i31;
                                    break;
                                }
                                int iKeyCodeFromString3 = KeyEvent.keyCodeFromString("") + 14;
                                int i446 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                int iResolveSizeAndState3 = View.resolveSizeAndState(0, 0, 0);
                                Object[] objArr107 = new Object[1];
                                b(iKeyCodeFromString3, (i446 ^ 1874) + ((i446 & 1874) << 1), (char) (((iResolveSizeAndState3 | 35580) << 1) - (iResolveSizeAndState3 ^ 35580)), objArr107);
                                if (!(!str51.equals((String) objArr107[0]))) {
                                    Object[] objArr108 = {str51};
                                    Object objRemoteActionCompatParcelizer24 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(971290740);
                                    if (objRemoteActionCompatParcelizer24 == null) {
                                        char c15 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 2645;
                                        int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 22;
                                        byte b43 = (byte) ($$b & 1);
                                        byte b44 = b43;
                                        Object[] objArr109 = new Object[1];
                                        a(b43, b44, (byte) (b44 + 1), objArr109);
                                        objRemoteActionCompatParcelizer24 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c15, offsetBefore, touchSlop2, -382428779, false, (String) objArr109[0], new Class[]{String.class});
                                    }
                                    long jLongValue15 = ((Long) ((Method) objRemoteActionCompatParcelizer24).invoke(null, objArr108)).longValue();
                                    long j98 = 1003340540;
                                    i41 = i31;
                                    long jMyPid = Process.myPid();
                                    long j99 = (((long) 860) * j98) + (((long) (-858)) * jLongValue15) + (((long) (-859)) * (j98 | jMyPid));
                                    long j100 = 859;
                                    long j101 = jMyPid ^ j21;
                                    long j102 = jLongValue15 ^ j21;
                                    long j103 = j99 + ((((j101 | j98) ^ j21) | ((((j98 ^ j21) | j102) | jMyPid) ^ j21)) * j100) + (j100 * (((j102 | j101) ^ j21) | ((j102 | j98) ^ j21))) + ((long) (-1067372552));
                                    if (((((int) (j103 >> 32)) & ((((~(586293616 | i41)) | (~((-2023520028) | i)) | (~(i41 | 2023520027))) * 959) + 2138310196 + (((~(586293616 | i)) | (~((-2023520028) | i41)) | (~(2023520027 | i))) * 959))) | (((int) j103) & ((-1520785380) + (((~(i41 | (-752958371))) | 683743746) * 529) + (((~((-752958371) | i)) | 684268039) * 529)))) != 0) {
                                        break;
                                    }
                                } else {
                                    i41 = i31;
                                }
                                i443 = (i443 ^ 1) + ((i443 & 1) << 1);
                                strArr6 = strArr7;
                                i31 = i41;
                                strArr19 = strArr20;
                            }
                            int i447 = (i443 ^ 130) + ((i443 & 130) << 1);
                            int i448 = (i447 & i41) | ((~i447) & i);
                            int i449 = ~i443;
                            int i450 = -i449;
                            int i451 = ((i449 & i450) | (i449 ^ i450)) >> 31;
                            int i452 = (~i451) & i;
                            int i453 = i448 & i451;
                            int i454 = (i453 & i452) | (i452 ^ i453);
                            int i455 = ((~i33) & i) | (i33 & i41);
                            int i456 = -i455;
                            int i457 = ((i455 & i456) | (i455 ^ i456)) >> 31;
                            int i458 = i454 & (~i457);
                            int i459 = i33 & i457;
                            i33 = (i459 & i458) | (i458 ^ i459);
                        }
                        int i460 = 12 - (~(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24)));
                        int i461 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int iSerializer4 = TextInputBigV2Kt$MainText$1$1$1.serializer();
                        int i462 = (i461 * 829) + 1617379;
                        int i463 = ~i461;
                        int i464 = ~((i463 & (-1952)) | (i463 ^ (-1952)));
                        int i465 = ~iSerializer4;
                        int i466 = (i465 ^ i461) | (i465 & i461);
                        int i467 = ~((i466 & 1951) | (i466 ^ 1951));
                        int i468 = ((i464 & i467) | (i464 ^ i467)) * (-828);
                        int i469 = (i462 & i468) + (i462 | i468);
                        int i470 = -(-((i465 | i461 | 1951) * (-828)));
                        int i471 = (i469 & i470) + (i470 | i469);
                        int i472 = (~((i461 & 1951) | (i461 ^ 1951))) * 828;
                        Object[] objArr110 = new Object[1];
                        b(i460, (i471 ^ i472) + ((i472 & i471) << 1), (char) TextUtils.getOffsetAfter("", 0), objArr110);
                        String str52 = (String) objArr110[0];
                        int i473 = 4 - (~ExpandableListView.getPackedPositionGroup(0L));
                        int iRgb = Color.rgb(0, 0, 0);
                        int i474 = iRgb * (-115);
                        int i475 = (i474 & (-1929605815)) + (i474 | (-1929605815));
                        int i476 = ~i;
                        int i477 = (i476 ^ iRgb) | (i476 & iRgb);
                        int i478 = -(-((~((i477 & 16779181) | (i477 ^ 16779181))) * (-116)));
                        int i479 = ((((i475 | i478) << 1) - (i478 ^ i475)) - (~(-(-((iRgb | i) * 116))))) - 1;
                        int i480 = ~iRgb;
                        int i481 = ~((i480 & (-16779182)) | (i480 ^ (-16779182)));
                        int i482 = ~(((-16779182) & i) | ((-16779182) ^ i));
                        int i483 = ((i481 & i482) | (i481 ^ i482)) * 116;
                        Object[] objArr111 = new Object[1];
                        b(i473, ((i479 | i483) << 1) - (i483 ^ i479), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr111);
                        String[] strArr21 = {str52, (String) objArr111[0]};
                        int threadPriority = Process.getThreadPriority(0);
                        Object[] objArr112 = new Object[1];
                        b(14 - (~(-(((threadPriority & 20) + (threadPriority | 20)) >> 6))), 1970 - (~(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr112);
                        String str53 = (String) objArr112[0];
                        int i484 = 17 - (~(-TextUtils.indexOf((CharSequence) "", '0', 0, 0)));
                        int i485 = 1983 - (~(-((byte) KeyEvent.getModifierMetaStateMask())));
                        int i486 = -ExpandableListView.getPackedPositionType(0L);
                        Object[] objArr113 = new Object[1];
                        b(i484, i485, (char) (((i486 | 40600) << 1) - (i486 ^ 40600)), objArr113);
                        String str54 = (String) objArr113[0];
                        int jumpTapTimeout2 = 14 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int i487 = 2003 - (~(-Color.red(0)));
                        int i488 = -(-Gravity.getAbsoluteGravity(0, 0));
                        Object[] objArr114 = new Object[1];
                        b(jumpTapTimeout2, i487, (char) ((i488 ^ 48304) + ((i488 & 48304) << 1)), objArr114);
                        String[] strArr22 = {str53, str54, (String) objArr114[0]};
                        int i489 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int i490 = ((i489 | 21) << 1) - (i489 ^ 21);
                        int iIndexOf5 = TextUtils.indexOf("", "", 0);
                        int iSerializer5 = TextInputBigV2Kt$MainText$1$1$1.serializer();
                        int i491 = iIndexOf5 * (-445);
                        int i492 = (i491 ^ (-898010)) + ((i491 & (-898010)) << 1);
                        int i493 = ~iIndexOf5;
                        int i494 = ~((i493 ^ (-2019)) | (i493 & (-2019)));
                        int i495 = ~((~iSerializer5) | (-2019));
                        int i496 = (i492 - (~(((i494 ^ i495) | (i494 & i495)) * 446))) - 1;
                        int i497 = ~iIndexOf5;
                        int i498 = ~((i497 & 2018) | (i497 ^ 2018));
                        int i499 = ~(((-2019) ^ iIndexOf5) | (iIndexOf5 & (-2019)) | iSerializer5);
                        int i500 = -(-(((i499 & i498) | (i498 ^ i499)) * 446));
                        Object[] objArr115 = new Object[1];
                        b(i490, (i496 ^ i500) + ((i500 & i496) << 1) + ((~((i493 ^ (-2019)) | (i493 & (-2019)))) * 446), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr115);
                        String str55 = (String) objArr115[0];
                        int i501 = -(-(ViewConfiguration.getPressedStateDuration() >> 16));
                        Object[] objArr116 = new Object[1];
                        b((i501 ^ 10) + ((i501 & 10) << 1), 2038 - (~(-(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))))), (char) (52603 - (~(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))), objArr116);
                        String[] strArr23 = {str55, (String) objArr116[0]};
                        int i502 = 10 - (~Color.red(0));
                        int i503 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int i504 = (i503 ^ 2049) + ((i503 & 2049) << 1);
                        int keyRepeatDelay3 = ViewConfiguration.getKeyRepeatDelay() >> 16;
                        Object[] objArr117 = new Object[1];
                        b(i502, i504, (char) ((keyRepeatDelay3 & 63588) + (keyRepeatDelay3 | 63588)), objArr117);
                        String str56 = (String) objArr117[0];
                        int i505 = -TextUtils.lastIndexOf("", '0', 0, 0);
                        Object[] objArr118 = new Object[1];
                        b(((i505 | 5) << 1) - (i505 ^ 5), 587 - (ViewConfiguration.getTapTimeout() >> 16), (char) KeyEvent.getDeadChar(0, 0), objArr118);
                        String[] strArr24 = {str56, (String) objArr118[0]};
                        int i506 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int i507 = (i506 & 28) + (i506 | 28);
                        int packedPositionChild3 = ExpandableListView.getPackedPositionChild(0L);
                        Object[] objArr119 = new Object[1];
                        b(i507, (packedPositionChild3 ^ 2061) + ((packedPositionChild3 & 2061) << 1), (char) KeyEvent.normalizeMetaState(0), objArr119);
                        String str57 = (String) objArr119[0];
                        int i508 = -(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                        c5 = 0;
                        Object[] objArr120 = new Object[1];
                        b((i508 & 9) + (i508 | 9), ImageFormat.getBitsPerPixel(0) + 2040, (char) (52603 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), objArr120);
                        strArr8 = new String[][]{strArr21, strArr22, strArr23, strArr24, new String[]{str57, (String) objArr120[0]}};
                        i42 = 0;
                        i43 = -1;
                        loop7: while (true) {
                            if (i42 < 5) {
                                i44 = i;
                                break;
                            }
                            String[] strArr25 = strArr8[i42];
                            str7 = strArr25[c5];
                            strArr9 = (String[]) Arrays.copyOfRange(strArr25, 1, strArr25.length);
                            length = strArr9.length;
                            i48 = 0;
                            while (i48 < length) {
                                String str58 = strArr9[i48];
                                i43 = (i43 & 1) + (i43 | 1);
                                file4 = new File(str7);
                                if (file4.exists() || !file4.isFile()) {
                                    strArr10 = strArr8;
                                    strArr11 = strArr9;
                                    str8 = str7;
                                } else {
                                    try {
                                        Scanner scanner4 = new Scanner(new FileInputStream(file4));
                                        int iMyPid2 = Process.myPid() >> 22;
                                        int i509 = (iMyPid2 & 2) + (iMyPid2 | 2);
                                        int i510 = -(-ExpandableListView.getPackedPositionGroup(0L));
                                        strArr10 = strArr8;
                                        strArr11 = strArr9;
                                        int i511 = ((i510 | 593) << 1) - (i510 ^ 593);
                                        try {
                                            int i512 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                            str8 = str7;
                                            try {
                                                Object[] objArr121 = new Object[1];
                                                b(i509, i511, (char) ((i512 & 1) + (i512 | 1)), objArr121);
                                                Scanner scannerUseDelimiter3 = scanner4.useDelimiter((String) objArr121[0]);
                                                String next3 = scannerUseDelimiter3.hasNext() ? scannerUseDelimiter3.next() : "";
                                                scannerUseDelimiter3.close();
                                                if (next3.contains(str58)) {
                                                    int i513 = -(-(i43 * (-949)));
                                                    int i514 = (((-161330) | i513) << 1) - (i513 ^ (-161330));
                                                    int i515 = ~i43;
                                                    int i516 = ~((i515 & i476) | (i515 ^ i476));
                                                    int i517 = ~(((-171) & i) | ((-171) ^ i));
                                                    int i518 = ((i514 + (((i516 & i517) | (i516 ^ i517)) * 1900)) - (~(-(-(((~((i476 ^ 170) | (i476 & 170))) | (~((i43 ^ i) | (i43 & i)))) * (-950)))))) - 1;
                                                    int i519 = ~(i476 | i43);
                                                    int i520 = ~((i ^ 170) | (i & 170));
                                                    i44 = i ^ ((i518 - (~(-(-(((i519 & i520) | (i519 ^ i520)) * 950))))) - 1);
                                                    break loop7;
                                                }
                                            } catch (IOException unused3) {
                                                continue;
                                            }
                                        } catch (IOException unused4) {
                                            str8 = str7;
                                        }
                                    } catch (IOException unused5) {
                                        strArr10 = strArr8;
                                        strArr11 = strArr9;
                                    }
                                }
                                i48 = ((i48 ^ 68) + ((i48 & 68) << 1)) - 67;
                                strArr8 = strArr10;
                                strArr9 = strArr11;
                                str7 = str8;
                            }
                            i42++;
                            c5 = 0;
                        }
                        int i521 = ((~i33) & i) | (i33 & i41);
                        int i522 = -i521;
                        int i523 = ((i521 & i522) | (i521 ^ i522)) >> 31;
                        int i524 = i44 & (~i523);
                        int i525 = i33 & i523;
                        int i526 = (i525 & i524) | (i524 ^ i525);
                        int i527 = 13 - (~(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
                        int i528 = -View.resolveSize(0, 0);
                        int i529 = (i528 & 2088) + (i528 | 2088);
                        int i530 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        Object[] objArr122 = new Object[1];
                        b(i527, i529, (char) ((i530 ^ 58221) + ((i530 & 58221) << 1)), objArr122);
                        String str59 = (String) objArr122[0];
                        int i531 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
                        Object[] objArr123 = new Object[1];
                        b((i531 ^ 8) + ((i531 & 8) << 1), 2101 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (239 - KeyEvent.getDeadChar(0, 0)), objArr123);
                        String str60 = (String) objArr123[0];
                        file3 = new File(str59);
                        if (file3.exists() || !file3.isFile()) {
                            i45 = i41;
                            i46 = i;
                        } else {
                            try {
                                Scanner scanner5 = new Scanner(new FileInputStream(file3));
                                int i532 = IconCompatParcelizer;
                                int i533 = ((i532 | 75) << 1) - (i532 ^ 75);
                                read = i533 % Fields.SpotShadowColor;
                                if (i533 % 2 != 0) {
                                    scrollBarFadeDuration = 3 / (ViewConfiguration.getScrollBarFadeDuration() << GwiErrorCode.ALG_LIBRARY_NOT_EXIST);
                                    iCombineMeasuredStates = View.combineMeasuredStates(1, 0);
                                    i47 = 20998;
                                } else {
                                    int i534 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                    scrollBarFadeDuration = (i534 ^ 2) + ((i534 & 2) << 1);
                                    iCombineMeasuredStates = View.combineMeasuredStates(0, 0);
                                    i47 = 593;
                                }
                                int iSerializer6 = TextInputBigV2Kt$MainText$1$1$1.serializer();
                                int i535 = ~iSerializer6;
                                int i536 = (-1716685681) - (~(-(-(((~(((-959540335) & i535) | ((-959540335) ^ i535))) | (-568884700)) * (-602)))));
                                int i537 = ~(((-959540335) & iSerializer6) | ((-959540335) ^ iSerializer6));
                                int i538 = (403767332 ^ i537) | (i537 & 403767332);
                                int i539 = ~((i535 ^ 959540334) | (i535 & 959540334) | (-568884700));
                                int i540 = ((i539 & i538) | (i538 ^ i539)) * (-301);
                                int i541 = (i536 & i540) + (i540 | i536);
                                int i542 = ~iSerializer6;
                                int i543 = -(-((~((i542 & (-568884700)) | (i542 ^ (-568884700)))) * LocationRequest.PRIORITY_MAG_POSITION));
                                int i544 = (i541 & i543) + (i543 | i541);
                                int i545 = ~(((-118647345) ^ i) | ((-118647345) & i));
                                int i546 = 1893324071 - (~(((i545 & 299822194) | (299822194 ^ i545)) * (-668)));
                                int i547 = ~((299822194 & i) | (299822194 ^ i));
                                int i548 = i546 + ((((-118647345) & i547) | ((-118647345) ^ i547)) * 1336);
                                int i549 = -(-(((-100663809) | i) * 668));
                                if (i544 <= (i548 & i549) + (i549 | i548)) {
                                    Object[] objArr124 = new Object[1];
                                    b(scrollBarFadeDuration, i47 / iCombineMeasuredStates, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 23), objArr124);
                                    str6 = (String) objArr124[0];
                                } else {
                                    Object[] objArr125 = new Object[1];
                                    b(scrollBarFadeDuration, (i47 - (~(-iCombineMeasuredStates))) - 1, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr125);
                                    str6 = (String) objArr125[0];
                                }
                                Scanner scannerUseDelimiter4 = scanner5.useDelimiter(str6);
                                String next4 = scannerUseDelimiter4.hasNext() ? scannerUseDelimiter4.next() : "";
                                scannerUseDelimiter4.close();
                                if (next4.contains(str60)) {
                                    i45 = i41;
                                    i46 = (i & (-151)) | (i45 & 150);
                                } else {
                                    i45 = i41;
                                    i46 = i;
                                }
                            } catch (IOException unused6) {
                            }
                        }
                        int i550 = ((~i526) & i) | (i526 & i45);
                        int i551 = -i550;
                        int i552 = ((i550 & i551) | (i550 ^ i551)) >> 31;
                        int i553 = i46 & (~i552);
                        int i554 = i526 & i552;
                        int i555 = (i554 & i553) | (i553 ^ i554);
                        int i556 = 45 - (~(-TextUtils.indexOf((CharSequence) "", '0', 0, 0)));
                        int i557 = 2108 - (~TextUtils.indexOf("", "", 0, 0));
                        int i558 = -TextUtils.getTrimmedLength("");
                        Object[] objArr126 = new Object[1];
                        b(i556, i557, (char) (((i558 | 45962) << 1) - (i558 ^ 45962)), objArr126);
                        String str61 = (String) objArr126[0];
                        int i559 = IconCompatParcelizer;
                        int i560 = ((i559 | 11) << 1) - (i559 ^ 11);
                        read = i560 % Fields.SpotShadowColor;
                        int i561 = i560 % 2;
                        Object[] objArr127 = {str61};
                        objRemoteActionCompatParcelizer12 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(971290740);
                        if (objRemoteActionCompatParcelizer12 == null) {
                            char offsetAfter2 = (char) TextUtils.getOffsetAfter("", 0);
                            int i562 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2644;
                            int packedPositionGroup3 = 22 - ExpandableListView.getPackedPositionGroup(0L);
                            byte b45 = (byte) ($$b & 1);
                            byte b46 = b45;
                            Object[] objArr128 = new Object[1];
                            a(b45, b46, (byte) (b46 + 1), objArr128);
                            objRemoteActionCompatParcelizer12 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(offsetAfter2, i562, packedPositionGroup3, -382428779, false, (String) objArr128[0], new Class[]{String.class});
                        }
                        long jLongValue16 = ((Long) ((Method) objRemoteActionCompatParcelizer12).invoke(null, objArr127)).longValue();
                        long j104 = 1924612661;
                        long j105 = -575;
                        long j106 = (j105 * j104) + (j105 * jLongValue16);
                        long j107 = 576;
                        long j108 = j104 ^ j21;
                        long j109 = jLongValue16 ^ j21;
                        long j110 = (j108 | j109) ^ j21;
                        i28 = i45;
                        long jElapsedRealtime4 = (int) SystemClock.elapsedRealtime();
                        long j111 = j106 + ((j110 | ((j109 | jElapsedRealtime4) ^ j21)) * j107) + ((((((jElapsedRealtime4 ^ j21) | j109) | j104) ^ j21) | ((jLongValue16 | j108) ^ j21)) * j107) + (j107 * j110) + ((long) (-1988644673));
                        int i563 = ((int) (j111 >> 32)) & (872779416 + (((~((-1198785098) | i)) | 238441313) * (-366)) + (((~((-1094713353) | i)) | 134369568) * 366));
                        int iMyPid3 = Process.myPid();
                        int i564 = (~((-1989266569) | iMyPid3)) | 847367304;
                        int i565 = ~((~iMyPid3) | 2010373581);
                        int i566 = ((int) j111) & (1688415237 + ((i564 | i565) * (-470)) + (((~(iMyPid3 | (-1141899265))) | i565) * 470));
                        int i567 = ((i563 & i566) | (i563 ^ i566)) * 263;
                        int i568 = i ^ i555;
                        int i569 = (i568 | (-i568)) >> 31;
                        i25 = (i555 & i569) | (((i567 & i28) | ((~i567) & i)) & (~i569));
                        strArr4 = strArr7;
                    }
                    int i5210 = 13 - (~(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
                    int i5211 = -View.resolveSize(0, 0);
                    int i5212 = (i5211 & 2088) + (i5211 | 2088);
                    int i5310 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    Object[] objArr129 = new Object[1];
                    b(i5210, i5212, (char) ((i5310 ^ 58221) + ((i5310 & 58221) << 1)), objArr129);
                    String str510 = (String) objArr129[0];
                    int i5311 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
                    Object[] objArr1210 = new Object[1];
                    b((i5311 ^ 8) + ((i5311 & 8) << 1), 2101 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (239 - KeyEvent.getDeadChar(0, 0)), objArr1210);
                    String str62 = (String) objArr1210[0];
                    file3 = new File(str510);
                    if (file3.exists()) {
                        i45 = i41;
                        i46 = i;
                    } else {
                        i45 = i41;
                        i46 = i;
                    }
                } catch (Exception unused7) {
                    i45 = i41;
                    i46 = i ^ 151;
                }
                int i570 = -(-(ViewConfiguration.getJumpTapTimeout() >> 16));
                int i571 = -(-Color.argb(0, 0, 0, 0));
                int i572 = ((i571 | 370) << 1) - (i571 ^ 370);
                int i573 = -Color.alpha(0);
                Object[] objArr130 = new Object[1];
                b((i570 & 23) + (i570 | 23), i572, (char) ((i573 & 29464) + (i573 | 29464)), objArr130);
                String str63 = (String) objArr130[0];
                Object[] objArr131 = new Object[1];
                b(10 - Color.argb(0, 0, 0, 0), TextUtils.indexOf((CharSequence) "", '0') + 811, (char) (Process.myTid() >> 22), objArr131);
                String str64 = (String) objArr131[0];
                int i574 = 6 - (~(-TextUtils.getCapsMode("", 0, 0)));
                int i575 = -(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                Object[] objArr132 = new Object[1];
                b(i574, (i575 & 819) + (i575 | 819), (char) (ViewConfiguration.getTapTimeout() >> 16), objArr132);
                String str65 = (String) objArr132[0];
                int i576 = -(-(ViewConfiguration.getMaximumFlingVelocity() >> 16));
                int i577 = (i576 & 8) + (i576 | 8);
                int i578 = -(-TextUtils.indexOf((CharSequence) "", '0', 0));
                int i579 = ((i578 | 828) << 1) - (i578 ^ 828);
                int i580 = -(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                Object[] objArr133 = new Object[1];
                b(i577, i579, (char) ((i580 ^ 1) + ((i580 & 1) << 1)), objArr133);
                String[] strArr26 = {str63, str64, str65, (String) objArr133[0]};
                int iMyTid2 = 17 - (Process.myTid() >> 22);
                int i581 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int i582 = i581 * 236;
                int i583 = (392814 ^ i582) + ((i582 & 392814) << 1);
                int i584 = ~i581;
                int i585 = ~((i584 ^ i31) | (i584 & i31));
                int i586 = i583 + (((i585 & 834) | (i585 ^ 834)) * (-235));
                int i587 = ~((~i581) | i);
                int i588 = -(-(((i587 & 834) | (i587 ^ 834)) * (-470)));
                int i589 = ((i586 | i588) << 1) - (i586 ^ i588);
                int i590 = ~((i581 & (-835)) | ((-835) ^ i581));
                int i591 = ~((i584 & 834) | (i584 ^ 834) | i);
                int i592 = ((i590 & i591) | (i590 ^ i591)) * 235;
                int i593 = -Color.rgb(0, 0, 0);
                Object[] objArr134 = new Object[1];
                b(iMyTid2, ((i589 | i592) << 1) - (i592 ^ i589), (char) (((-16771509) & i593) + (i593 | (-16771509))), objArr134);
                String str66 = (String) objArr134[0];
                Object[] objArr135 = new Object[1];
                b(7 - (ViewConfiguration.getFadingEdgeLength() >> 16), 852 - KeyEvent.keyCodeFromString(""), (char) (ViewConfiguration.getPressedStateDuration() >> 16), objArr135);
                String str67 = (String) objArr135[0];
                int i594 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                Object[] objArr136 = new Object[1];
                b((i594 & 7) + (i594 | 7), 859 - ExpandableListView.getPackedPositionType(0L), (char) Gravity.getAbsoluteGravity(0, 0), objArr136);
                String str68 = (String) objArr136[0];
                Object[] objArr137 = new Object[1];
                b(10 - (~(-TextUtils.getTrimmedLength(""))), 865 - (~(-(Process.myTid() >> 22))), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 31081), objArr137);
                String str69 = (String) objArr137[0];
                int i595 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int i596 = ((i595 | 14) << 1) - (i595 ^ 14);
                int i597 = -(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                Object[] objArr138 = new Object[1];
                b(i596, ((i597 | 876) << 1) - (i597 ^ 876), (char) (54524 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr138);
                String[] strArr27 = {str66, str67, str68, str69, (String) objArr138[0]};
                int i598 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int i599 = -Gravity.getAbsoluteGravity(0, 0);
                Object[] objArr139 = new Object[1];
                b(((i598 | 15) << 1) - (i598 ^ 15), (i599 ^ 891) + ((i599 & 891) << 1), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr139);
                String str70 = (String) objArr139[0];
                int i600 = -(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                int i601 = (i600 ^ 2) + ((i600 & 2) << 1);
                int i602 = 906 - (~(-(-(ViewConfiguration.getScrollDefaultDelay() >> 16))));
                int i603 = -AndroidCharacter.getMirror('0');
                Object[] objArr140 = new Object[1];
                b(i601, i602, (char) ((i603 ^ 48) + ((i603 & 48) << 1)), objArr140);
                String str71 = (String) objArr140[0];
                int touchSlop3 = 22 - (ViewConfiguration.getTouchSlop() >> 8);
                int i604 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                Object[] objArr141 = new Object[1];
                b(touchSlop3, ((i604 | 919) << 1) - (i604 ^ 919), (char) (ExpandableListView.getPackedPositionChild(0L) + 1), objArr141);
                String str72 = (String) objArr141[0];
                int i605 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int i606 = ((i605 | 26) << 1) - (i605 ^ 26);
                int i607 = 940 - (~(-(-TextUtils.lastIndexOf("", '0', 0))));
                int i608 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                Object[] objArr142 = new Object[1];
                b(i606, i607, (char) (((41650 | i608) << 1) - (i608 ^ 41650)), objArr142);
                String str73 = (String) objArr142[0];
                int i609 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                int i610 = ((i609 | 29) << 1) - (i609 ^ 29);
                int i611 = 964 - (~(-(ViewConfiguration.getFadingEdgeLength() >> 16)));
                int iIndexOf6 = TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                char c16 = (char) (((iIndexOf6 | 25088) << 1) - (iIndexOf6 ^ 25088));
                Object[] objArr143 = new Object[1];
                b(i610, i611, c16, objArr143);
                String[] strArr28 = {str70, str71, str, str72, str73, (String) objArr143[0]};
                int mode2 = 11 - View.MeasureSpec.getMode(0);
                int i612 = -KeyEvent.getDeadChar(0, 0);
                Object[] objArr144 = new Object[1];
                b(mode2, (i612 & 993) + (i612 | 993), (char) ((-TextUtils.indexOf((CharSequence) "", '0', 0, 0)) - 1), objArr144);
                String str74 = (String) objArr144[0];
                int i613 = -(-((byte) KeyEvent.getModifierMetaStateMask()));
                int i614 = (i613 ^ 9) + ((i613 & 9) << 1);
                int trimmedLength3 = TextUtils.getTrimmedLength("");
                int i615 = (((trimmedLength3 * 51) - 49196) - (~((trimmedLength3 | i) * (-50)))) - 1;
                int i616 = ~trimmedLength3;
                int i617 = ~((i616 ^ (-1005)) | (i616 & (-1005)) | i);
                int i618 = ~i;
                int i619 = ((-1005) ^ i618) | ((-1005) & i618);
                int i620 = ~((i619 ^ trimmedLength3) | (i619 & trimmedLength3));
                int i621 = -(-(((i617 ^ i620) | (i620 & i617)) * 50));
                int i622 = (i615 ^ i621) + ((i621 & i615) << 1);
                int i623 = ~((-1005) | i618);
                int i624 = ~((-1005) | trimmedLength3);
                int i625 = (i623 ^ i624) | (i623 & i624);
                int i626 = ~((trimmedLength3 & i618) | (i618 ^ trimmedLength3));
                int i627 = (i622 - (~(-(-(((i625 & i626) | (i625 ^ i626)) * 50))))) - 1;
                int i628 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                Object[] objArr145 = new Object[1];
                b(i614, i627, (char) ((i628 ^ 32278) + ((i628 & 32278) << 1)), objArr145);
                String str75 = (String) objArr145[0];
                int iIndexOf7 = TextUtils.indexOf((CharSequence) "", '0', 0) + 7;
                int i629 = -(ViewConfiguration.getScrollBarSize() >> 8);
                int i630 = i629 * (-337);
                int i631 = (i630 & 343068) + (i630 | 343068);
                int i632 = ~i629;
                int i633 = ~(i632 | i31);
                int i634 = ~(((-1013) ^ i629) | ((-1013) & i629));
                int i635 = (i633 ^ i634) | (i634 & i633);
                int i636 = ~(i629 | i);
                int i637 = i631 + (((i635 ^ i636) | (i635 & i636)) * (-338));
                int i638 = (~(i632 | 1012)) * 338;
                Object[] objArr146 = new Object[1];
                b(iIndexOf7, (((i637 | i638) << 1) - (i637 ^ i638)) + (((~((i632 ^ i618) | (i632 & i618))) | (~((i629 & 1012) | (i629 ^ 1012) | i))) * 338), (char) (250 - (~(-View.getDefaultSize(0, 0)))), objArr146);
                String str76 = (String) objArr146[0];
                Object[] objArr147 = new Object[1];
                b(6 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1019 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((-2) - (~(-TextUtils.lastIndexOf("", '0', 0)))), objArr147);
                String[] strArr29 = {str74, str75, str76, (String) objArr147[0]};
                int i639 = 15 - (~(-View.combineMeasuredStates(0, 0)));
                int i640 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                Object[] objArr148 = new Object[1];
                b(i639, ((i640 | Fields.RotationZ) << 1) - (i640 ^ Fields.RotationZ), (char) (ViewConfiguration.getPressedStateDuration() >> 16), objArr148);
                String str77 = (String) objArr148[0];
                int edgeSlop2 = 7 - (ViewConfiguration.getEdgeSlop() >> 16);
                int i641 = -AndroidCharacter.getMirror('0');
                Object[] objArr149 = new Object[1];
                b(edgeSlop2, (i641 & 907) + (i641 | 907), (char) ((Process.getThreadPriority(0) + 20) >> 6), objArr149);
                String str78 = (String) objArr149[0];
                int i642 = -TextUtils.getCapsMode("", 0, 0);
                int i643 = (i642 ^ 8) + ((i642 & 8) << 1);
                int touchSlop4 = ViewConfiguration.getTouchSlop() >> 8;
                int i644 = (touchSlop4 & 827) + (touchSlop4 | 827);
                int i645 = -TextUtils.lastIndexOf("", '0');
                Object[] objArr150 = new Object[1];
                b(i643, i644, (char) ((i645 ^ (-1)) + (i645 << 1)), objArr150);
                String[] strArr30 = {str77, str78, (String) objArr150[0]};
                int i646 = -(-Color.argb(0, 0, 0, 0));
                int i647 = (i646 ^ 14) + ((i646 & 14) << 1);
                int i648 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                Object[] objArr151 = new Object[1];
                b(i647, ((i648 | 1039) << 1) - (i648 ^ 1039), (char) ((-ExpandableListView.getPackedPositionChild(0L)) - 1), objArr151);
                String str79 = (String) objArr151[0];
                int tapTimeout2 = ViewConfiguration.getTapTimeout() >> 16;
                int i649 = (tapTimeout2 & 1) + (tapTimeout2 | 1);
                int i650 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
                Object[] objArr152 = new Object[1];
                b(i649, (i650 ^ 1054) + ((i650 & 1054) << 1), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr152);
                String[] strArr31 = {str79, (String) objArr152[0]};
                int i651 = -(-Color.rgb(0, 0, 0));
                Object[] objArr153 = new Object[1];
                b((16777225 ^ i651) + ((i651 & 16777225) << 1), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1054, (char) Color.blue(0), objArr153);
                String str80 = (String) objArr153[0];
                int i652 = -ExpandableListView.getPackedPositionChild(0L);
                int i653 = -(-View.resolveSizeAndState(0, 0, 0));
                Object[] objArr154 = new Object[1];
                b(i652, (i653 & 1064) + (i653 | 1064), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr154);
                String[] strArr32 = {str80, (String) objArr154[0]};
                int i654 = 15 - (~(-View.combineMeasuredStates(0, 0)));
                int iCombineMeasuredStates2 = 1065 - View.combineMeasuredStates(0, 0);
                int iIndexOf8 = TextUtils.indexOf((CharSequence) "", '0');
                Object[] objArr155 = new Object[1];
                b(i654, iCombineMeasuredStates2, (char) (((iIndexOf8 | 1) << 1) - (iIndexOf8 ^ 1)), objArr155);
                String str81 = (String) objArr155[0];
                int i655 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int i656 = (i655 & 3) + (i655 | 3);
                int iResolveOpacity2 = Drawable.resolveOpacity(0, 0);
                int iSerializer7 = TextInputBigV2Kt$MainText$1$1$1.serializer();
                int i657 = iResolveOpacity2 * (-405);
                int i658 = (369149 & i657) + (i657 | 369149);
                int i659 = ~((-908) | iSerializer7);
                int i660 = ~iSerializer7;
                int i661 = (i660 & iResolveOpacity2) | (i660 ^ iResolveOpacity2);
                int i662 = ~((i661 & 907) | (i661 ^ 907));
                int i663 = -(-(((i659 & i662) | (i659 ^ i662)) * (-406)));
                int i664 = (i658 & i663) + (i663 | i658);
                int i665 = ~iSerializer7;
                int i666 = (-908) | i665;
                int i667 = (i664 - (~((~((i666 & iResolveOpacity2) | (i666 ^ iResolveOpacity2))) * (-406)))) - 1;
                int i668 = ~iResolveOpacity2;
                int i669 = ~((i668 & iSerializer7) | (i668 ^ iSerializer7));
                int i670 = ~((i665 ^ 907) | (i665 & 907));
                int i671 = -(-(((i669 & i670) | (i669 ^ i670)) * 406));
                Object[] objArr156 = new Object[1];
                b(i656, (i667 ^ i671) + ((i671 & i667) << 1), (char) ((-2) - (~(-TextUtils.lastIndexOf("", '0', 0, 0)))), objArr156);
                String str82 = (String) objArr156[0];
                int i672 = -(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                int i673 = (i672 & 6) + (i672 | 6);
                int i674 = -(ViewConfiguration.getTapTimeout() >> 16);
                Object[] objArr157 = new Object[1];
                b(i673, (i674 & 852) + (i674 | 852), (char) (0 - (~(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))))), objArr157);
                String str83 = (String) objArr157[0];
                Object[] objArr158 = new Object[1];
                b(KeyEvent.keyCodeFromString("") + 8, 1081 - View.MeasureSpec.getSize(0), (char) (28282 - (ViewConfiguration.getScrollBarSize() >> 8)), objArr158);
                String str84 = (String) objArr158[0];
                int i675 = 11 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int i676 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                Object[] objArr159 = new Object[1];
                b(i675, ((i676 | 865) << 1) - (i676 ^ 865), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 31080), objArr159);
                String str85 = (String) objArr159[0];
                int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 14;
                int i677 = -((byte) KeyEvent.getModifierMetaStateMask());
                int i678 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
                Object[] objArr160 = new Object[1];
                b(pressedStateDuration2, (i677 ^ 876) + ((i677 & 876) << 1), (char) ((i678 & 54523) + (i678 | 54523)), objArr160);
                String[] strArr33 = {str81, str82, str83, str84, str85, (String) objArr160[0]};
                int iResolveOpacity3 = Drawable.resolveOpacity(0, 0);
                Object[] objArr161 = new Object[1];
                b((iResolveOpacity3 ^ 20) + ((iResolveOpacity3 & 20) << 1), 1089 - (ViewConfiguration.getTouchSlop() >> 8), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr161);
                String str86 = (String) objArr161[0];
                Object[] objArr162 = new Object[1];
                b(KeyEvent.normalizeMetaState(0) + 19, 1109 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) Color.alpha(0), objArr162);
                String str87 = (String) objArr162[0];
                int i679 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int i680 = (i679 ^ 31) + ((i679 & 31) << 1);
                int iKeyCodeFromString4 = KeyEvent.keyCodeFromString("") + 1128;
                int i681 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                Object[] objArr163 = new Object[1];
                b(i680, iKeyCodeFromString4, (char) ((i681 & 28987) + (i681 | 28987)), objArr163);
                String str88 = (String) objArr163[0];
                int i682 = -(-(ViewConfiguration.getPressedStateDuration() >> 16));
                int i683 = -Drawable.resolveOpacity(0, 0);
                Object[] objArr164 = new Object[1];
                b(((i682 | 26) << 1) - (i682 ^ 26), (i683 ^ 1159) + ((i683 & 1159) << 1), (char) (ViewConfiguration.getTapTimeout() >> 16), objArr164);
                String str89 = (String) objArr164[0];
                int offsetBefore2 = TextUtils.getOffsetBefore("", 0);
                Object[] objArr165 = new Object[1];
                b((offsetBefore2 ^ 23) + ((offsetBefore2 & 23) << 1), 1184 - (~(-(-(ViewConfiguration.getMaximumFlingVelocity() >> 16)))), (char) ((-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))) - 1), objArr165);
                String str90 = (String) objArr165[0];
                Object[] objArr166 = new Object[1];
                b(33 - (~TextUtils.indexOf((CharSequence) "", '0', 0)), 1207 - (~(-KeyEvent.normalizeMetaState(0))), (char) ((-2) - ((-TextUtils.lastIndexOf("", '0')) ^ (-1))), objArr166);
                String[] strArr34 = {str86, str87, str88, str89, str90, (String) objArr166[0], str};
                int i684 = -TextUtils.lastIndexOf("", '0', 0, 0);
                Object[] objArr167 = new Object[1];
                b((i684 ^ 12) + ((i684 & 12) << 1), 1239 - (~(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (char) (19154 - (~(-KeyEvent.keyCodeFromString("")))), objArr167);
                String str91 = (String) objArr167[0];
                int i685 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                Object[] objArr168 = new Object[1];
                b(((i685 | 8) << 1) - (i685 ^ 8), KeyEvent.normalizeMetaState(0) + 820, (char) TextUtils.getCapsMode("", 0, 0), objArr168);
                String[] strArr35 = {str91, (String) objArr168[0]};
                Object[] objArr169 = new Object[1];
                b(Color.alpha(0) + 30, 1253 - (~(-KeyEvent.normalizeMetaState(0))), (char) KeyEvent.normalizeMetaState(0), objArr169);
                String str92 = (String) objArr169[0];
                int i686 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                int i687 = (i686 ^ 12) + ((i686 & 12) << 1);
                int i688 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
                Object[] objArr170 = new Object[1];
                b(i687, (i688 & 1284) + (i688 | 1284), (char) (KeyEvent.getMaxKeyCode() >> 16), objArr170);
                String[] strArr36 = {str92, (String) objArr170[0]};
                int i689 = -TextUtils.indexOf("", "");
                int i690 = (i689 ^ 19) + ((i689 & 19) << 1);
                int i691 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                Object[] objArr171 = new Object[1];
                b(i690, ((i691 | 1295) << 1) - (i691 ^ 1295), (char) (10612 - (~(-Gravity.getAbsoluteGravity(0, 0)))), objArr171);
                String str93 = (String) objArr171[0];
                Object[] objArr172 = new Object[1];
                b(4 - (~(-ExpandableListView.getPackedPositionType(0L))), 1313 - (~TextUtils.getOffsetBefore("", 0)), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), objArr172);
                String[] strArr37 = {str93, (String) objArr172[0]};
                int i692 = -(-(Process.myPid() >> 22));
                int i693 = ((i692 | 19) << 1) - (i692 ^ 19);
                int i694 = -(-(ViewConfiguration.getTapTimeout() >> 16));
                Object[] objArr173 = new Object[1];
                b(i693, ((i694 | 1319) << 1) - (i694 ^ 1319), (char) Color.blue(0), objArr173);
                String[] strArr38 = {(String) objArr173[0]};
                int i695 = -(-TextUtils.indexOf((CharSequence) "", '0'));
                Object[] objArr174 = new Object[1];
                b((i695 ^ 17) + ((i695 & 17) << 1), 1338 - Color.alpha(0), (char) View.resolveSize(0, 0), objArr174);
                String[] strArr39 = {(String) objArr174[0]};
                int iAlpha2 = Color.alpha(0);
                int i696 = ((iAlpha2 | 19) << 1) - (iAlpha2 ^ 19);
                int i697 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int i698 = (i697 & 1354) + (i697 | 1354);
                int i699 = -(-ExpandableListView.getPackedPositionType(0L));
                Object[] objArr175 = new Object[1];
                b(i696, i698, (char) ((35364 ^ i699) + ((i699 & 35364) << 1)), objArr175);
                String[] strArr40 = {(String) objArr175[0]};
                int i700 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                int i701 = (i700 * (-1529)) - 13752;
                int i702 = ~i700;
                int i703 = (i702 ^ (-19)) | (i702 & (-19));
                int i704 = ~((i703 & i31) | (i703 ^ i31));
                int i705 = (i702 ^ 18) | (i702 & 18);
                int i706 = ~((i705 & i) | (i705 ^ i));
                int i707 = (i704 & i706) | (i704 ^ i706);
                int i708 = ((-19) ^ i700) | ((-19) & i700);
                int i709 = ~((i708 & i) | (i708 ^ i));
                int i710 = ((i707 & i709) | (i707 ^ i709)) * 765;
                int i711 = ((((i701 | i710) << 1) - (i701 ^ i710)) - (~(-(-(((~((~i700) | (-19))) | (~((i702 ^ i31) | (i702 & i31)))) * 1530))))) - 1;
                int i712 = ~((i702 ^ i) | (i702 & i));
                int i713 = ((-19) ^ i31) | ((-19) & i31);
                int i714 = ~((i700 & i713) | (i713 ^ i700));
                int i715 = -(-(((i714 & i712) | (i712 ^ i714)) * 765));
                Object[] objArr176 = new Object[1];
                b((i711 ^ i715) + ((i715 & i711) << 1), 1372 - (~(-(-TextUtils.getOffsetBefore("", 0)))), (char) Color.blue(0), objArr176);
                String[] strArr41 = {(String) objArr176[0]};
                int i716 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23;
                int i717 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                Object[] objArr177 = new Object[1];
                b(i716, (i717 & 1391) + (i717 | 1391), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), objArr177);
                String[] strArr42 = {(String) objArr177[0]};
                int i718 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int i719 = ((i718 | 21) << 1) - (i718 ^ 21);
                int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 1416;
                int i720 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                Object[] objArr178 = new Object[1];
                b(i719, bitsPerPixel, (char) ((36976 & i720) + (i720 | 36976)), objArr178);
                String[] strArr43 = {(String) objArr178[0]};
                int i721 = -(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                Object[] objArr179 = new Object[1];
                b((i721 ^ 24) + ((i721 & 24) << 1), 1436 - View.combineMeasuredStates(0, 0), (char) ((-2) - (~(-TextUtils.lastIndexOf("", '0')))), objArr179);
                String str94 = str;
                String[] strArr44 = {(String) objArr179[0], str94};
                int i722 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                int i723 = (i722 ^ 29) + ((i722 & 29) << 1);
                int i724 = -(-(ViewConfiguration.getWindowTouchSlop() >> 8));
                Object[] objArr180 = new Object[1];
                b(i723, (i724 ^ 1460) + ((i724 & 1460) << 1), (char) TextUtils.indexOf("", "", 0), objArr180);
                String[] strArr45 = {(String) objArr180[0], str94};
                int i725 = -(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                int i726 = (i725 & 27) + (i725 | 27);
                int i727 = -(-Process.getGidForName(""));
                Object[] objArr181 = new Object[1];
                b(i726, (i727 & 1489) + (i727 | 1489), (char) (27370 - (~TextUtils.indexOf("", "", 0, 0))), objArr181);
                String[] strArr46 = {(String) objArr181[0], str94};
                int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0);
                int i728 = (bitsPerPixel2 ^ 32) + ((bitsPerPixel2 & 32) << 1);
                int iKeyCodeFromString5 = KeyEvent.keyCodeFromString("");
                int i729 = (iKeyCodeFromString5 & 1515) + (iKeyCodeFromString5 | 1515);
                int iIndexOf9 = TextUtils.indexOf((CharSequence) "", '0', 0);
                int i730 = ~iIndexOf9;
                int i731 = ~((i730 & i31) | (i730 ^ i31) | 1);
                int i732 = (iIndexOf9 ^ 1) | (iIndexOf9 & 1);
                int i733 = ~((i732 & i) | (i732 ^ i));
                int i734 = ((iIndexOf9 * 303) - 301) + (((i731 & i733) | (i731 ^ i733)) * (-302));
                int i735 = ~iIndexOf9;
                int i736 = (i735 & 1) | (i735 ^ 1);
                int i737 = -(-((~((i736 & i) | (i736 ^ i))) * (-604)));
                int i738 = ((i734 | i737) << 1) - (i734 ^ i737);
                int i739 = -(-(((~((-2) | iIndexOf9)) | (~(i | 1))) * 302));
                Object[] objArr182 = new Object[1];
                b(i728, i729, (char) (((i738 | i739) << 1) - (i739 ^ i738)), objArr182);
                String[] strArr47 = {(String) objArr182[0], str94};
                int i740 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                c2 = 0;
                Object[] objArr183 = new Object[1];
                b((i740 & 27) + (i740 | 27), 1545 - (~(-Color.blue(0))), (char) TextUtils.getTrimmedLength(""), objArr183);
                String[] strArr48 = {(String) objArr183[0], str94};
                int i741 = 30 - (~(-MotionEvent.axisFromString("")));
                int i742 = 1572 - (~(-Color.argb(0, 0, 0, 0)));
                int i743 = -TextUtils.indexOf("", "", 0);
                Object[] objArr184 = new Object[1];
                b(i741, i742, (char) ((36450 & i743) + (i743 | 36450)), objArr184);
                strArr5 = new String[][]{strArr26, strArr27, strArr28, strArr29, strArr30, strArr31, strArr32, strArr33, strArr34, strArr35, strArr36, strArr37, strArr38, strArr39, strArr40, strArr41, strArr42, strArr43, strArr44, strArr45, strArr46, strArr47, strArr48, new String[]{(String) objArr184[0], str94}};
                int i744 = -View.combineMeasuredStates(0, 0);
                int i745 = (i744 ^ 1) + ((i744 & 1) << 1);
                int i746 = -(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                Object[] objArr185 = new Object[1];
                b(i745, (i746 & 1605) + (i746 | 1605), (char) View.resolveSize(0, 0), objArr185);
                sb = new StringBuilder((String) objArr185[0]);
                i34 = i;
                i35 = 0;
                i36 = 0;
                while (i35 < 24) {
                    String[] strArr49 = strArr5[i35];
                    Object[] objArr186 = {strArr49[c2]};
                    objRemoteActionCompatParcelizer9 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1468326312);
                    if (objRemoteActionCompatParcelizer9 == null) {
                        char tapTimeout3 = (char) (58126 - (ViewConfiguration.getTapTimeout() >> 16));
                        int doubleTapTimeout3 = 947 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int packedPositionChild4 = 26 - ExpandableListView.getPackedPositionChild(0L);
                        byte b47 = (byte) ($$b & 1);
                        byte b48 = b47;
                        Object[] objArr187 = new Object[1];
                        a(b47, b48, (byte) (b48 + 1), objArr187);
                        objRemoteActionCompatParcelizer9 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(tapTimeout3, doubleTapTimeout3, packedPositionChild4, 2024488889, false, (String) objArr187[0], new Class[]{String.class});
                    }
                    str5 = (String) ((Method) objRemoteActionCompatParcelizer9).invoke(null, objArr186);
                    String[] strArr50 = (String[]) Arrays.copyOfRange(strArr49, 1, strArr49.length);
                    if (str5 == null && !str5.isEmpty()) {
                        if (strArr49.length != 1) {
                            int length2 = strArr50.length;
                            int i747 = 0;
                            while (true) {
                                if (i747 < length2) {
                                    if (str5.contains(strArr50[i747])) {
                                        int i748 = (i35 ^ 10) + ((i35 & 10) << 1);
                                        int i749 = (i748 | i) & (~(i & i748));
                                        int i750 = (i36 ^ (-33)) + ((i36 & (-33)) << 1);
                                        i36 = (i750 & 34) + (i750 | 34);
                                        if (i36 > 1) {
                                            c4 = 0;
                                            int i751 = -(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                            Object[] objArr188 = new Object[1];
                                            b((i751 ^ 2) + ((i751 & 2) << 1), 1606 - Color.alpha(0), (char) (53195 - TextUtils.indexOf((CharSequence) "", '0')), objArr188);
                                            sb.append((String) objArr188[0]);
                                        } else {
                                            c4 = 0;
                                        }
                                        sb.append(strArr49[c4]);
                                        int i752 = 0 - (~(-(Process.myPid() >> 22)));
                                        int scrollBarFadeDuration4 = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                                        int i753 = (((scrollBarFadeDuration4 * 495) - 792744) - (~(((scrollBarFadeDuration4 ^ (-1609)) | (scrollBarFadeDuration4 & (-1609))) * (-988)))) - 1;
                                        int i754 = ~scrollBarFadeDuration4;
                                        int i755 = -(-((i754 | 1608 | i31) * 494));
                                        int i756 = ((i753 | i755) << 1) - (i753 ^ i755);
                                        int i757 = ~((i754 ^ (-1609)) | (i754 & (-1609)));
                                        int i758 = ~((i31 ^ 1608) | (i31 & 1608));
                                        int i759 = (i757 & i758) | (i757 ^ i758);
                                        int i760 = ~(scrollBarFadeDuration4 | 1608);
                                        Object[] objArr189 = new Object[1];
                                        b(i752, (i756 - (~(((i760 & i759) | (i759 ^ i760)) * 494))) - 1, (char) TextUtils.getOffsetBefore("", 0), objArr189);
                                        sb.append((String) objArr189[0]);
                                        sb.append(str5);
                                        i34 = i749;
                                    } else {
                                        i747++;
                                    }
                                }
                            }
                        } else {
                            int i7410 = (i35 ^ 10) + ((i35 & 10) << 1);
                            int i7411 = (i7410 | i) & (~(i & i7410));
                            int i7510 = (i36 ^ (-33)) + ((i36 & (-33)) << 1);
                            i36 = (i7510 & 34) + (i7510 | 34);
                            if (i36 > 1) {
                                c4 = 0;
                                int i7511 = -(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                Object[] objArr1810 = new Object[1];
                                b((i7511 ^ 2) + ((i7511 & 2) << 1), 1606 - Color.alpha(0), (char) (53195 - TextUtils.indexOf((CharSequence) "", '0')), objArr1810);
                                sb.append((String) objArr1810[0]);
                            } else {
                                c4 = 0;
                            }
                            sb.append(strArr49[c4]);
                            int i7512 = 0 - (~(-(Process.myPid() >> 22)));
                            int scrollBarFadeDuration5 = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                            int i7513 = (((scrollBarFadeDuration5 * 495) - 792744) - (~(((scrollBarFadeDuration5 ^ (-1609)) | (scrollBarFadeDuration5 & (-1609))) * (-988)))) - 1;
                            int i7514 = ~scrollBarFadeDuration5;
                            int i7515 = -(-((i7514 | 1608 | i31) * 494));
                            int i7516 = ((i7513 | i7515) << 1) - (i7513 ^ i7515);
                            int i7517 = ~((i7514 ^ (-1609)) | (i7514 & (-1609)));
                            int i7518 = ~((i31 ^ 1608) | (i31 & 1608));
                            int i7519 = (i7517 & i7518) | (i7517 ^ i7518);
                            int i761 = ~(scrollBarFadeDuration5 | 1608);
                            Object[] objArr1811 = new Object[1];
                            b(i7512, (i7516 - (~(((i761 & i7519) | (i7519 ^ i761)) * 494))) - 1, (char) TextUtils.getOffsetBefore("", 0), objArr1811);
                            sb.append((String) objArr1811[0]);
                            sb.append(str5);
                            i34 = i7411;
                        }
                    }
                    i35 = ((i35 | 1) << 1) - (i35 ^ 1);
                    strArr5 = strArr5;
                    i33 = i33;
                    c2 = 0;
                }
                int i762 = i33;
                Object[] objArr190 = new Object[1];
                b((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1608 - TextUtils.lastIndexOf("", '0', 0), (char) ((-16712877) - (~(-Color.rgb(0, 0, 0)))), objArr190);
                sb.append((String) objArr190[0]);
                if (i36 > 2) {
                    int i763 = IconCompatParcelizer + 5;
                    read = i763 % Fields.SpotShadowColor;
                    int i764 = i763 % 2;
                    i37 = 1;
                    c3 = 0;
                    String[] strArr51 = {sb.toString()};
                    ((int[]) objArr2[0])[0] = i34;
                    objArr2 = new Object[]{new int[1], strArr51};
                } else {
                    c3 = 0;
                    i37 = 1;
                    objArr2 = new Object[]{new int[]{i}, new String[0]};
                }
                int[] iArr = (int[]) objArr2[c3];
                int i765 = read;
                int i766 = ((i765 | 103) << i37) - (i765 ^ 103);
                IconCompatParcelizer = i766 % Fields.SpotShadowColor;
                int i767 = i766 % 2;
                int i768 = iArr[0];
                int i769 = ((~i762) & i) | (i762 & i31);
                int i770 = -i769;
                int i771 = ((i769 & i770) | (i769 ^ i770)) >> 31;
                int i772 = i768 & (~i771);
                int i773 = i762 & i771;
                i33 = (i772 & i773) | (i772 ^ i773);
                i38 = 1;
                strArr6 = (String[]) objArr2[1];
                i39 = 0;
                int i3510 = -Color.green(i39);
                int i3511 = (i3510 ^ 16) + ((i3510 & 16) << i38);
                int iResolveSize4 = View.resolveSize(i39, i39);
                Object[] objArr810 = new Object[i38];
                b(i3511, ((iResolveSize4 | 891) << i38) - (iResolveSize4 ^ 891), (char) KeyEvent.keyCodeFromString(""), objArr810);
                Object[] objArr811 = {(String) objArr810[i39]};
                objRemoteActionCompatParcelizer10 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1468326312);
                if (objRemoteActionCompatParcelizer10 == null) {
                    char c17 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 58125);
                    int capsMode3 = TextUtils.getCapsMode("", 0, 0) + 947;
                    int iNormalizeMetaState3 = KeyEvent.normalizeMetaState(0) + 27;
                    byte b310 = (byte) ($$b & 1);
                    byte b311 = b310;
                    Object[] objArr812 = new Object[1];
                    a(b310, b311, (byte) (b311 + 1), objArr812);
                    objRemoteActionCompatParcelizer10 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c17, capsMode3, iNormalizeMetaState3, 2024488889, false, (String) objArr812[0], new Class[]{String.class});
                }
                objInvoke2 = ((Method) objRemoteActionCompatParcelizer10).invoke(null, objArr811);
                if (objInvoke2 == null) {
                    i40 = 0;
                } else {
                    Object[] objArr813 = {objInvoke2, 42};
                    objRemoteActionCompatParcelizer11 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-998984536);
                    if (objRemoteActionCompatParcelizer11 == null) {
                        char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
                        int longPressTimeout7 = (ViewConfiguration.getLongPressTimeout() >> 16) + 1481;
                        int maximumDrawingCacheSize3 = 31 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        byte b312 = (byte) 0;
                        byte b49 = (byte) (b312 + 1);
                        Object[] objArr814 = new Object[1];
                        a(b312, b49, (byte) (-b49), objArr814);
                        objRemoteActionCompatParcelizer11 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cIndexOf2, longPressTimeout7, maximumDrawingCacheSize3, 346330441, false, (String) objArr814[0], new Class[]{String.class, Integer.TYPE});
                    }
                    long jLongValue17 = ((Long) ((Method) objRemoteActionCompatParcelizer11).invoke(null, objArr813)).longValue();
                    int i3512 = IconCompatParcelizer;
                    int i3513 = (i3512 & 37) + (i3512 | 37);
                    read = i3513 % Fields.SpotShadowColor;
                    int i3514 = i3513 % 2;
                    long j810 = 914880113;
                    long j811 = 306;
                    long j812 = ((long) 610) + (j811 * j810) + (j811 * jLongValue17);
                    long j813 = 305;
                    long jFreeMemory3 = (int) Runtime.getRuntime().freeMemory();
                    long j910 = j812 + ((((j810 | jLongValue17) ^ j21) | ((j810 | jFreeMemory3) ^ j21)) * j813) + (j813 * ((((jFreeMemory3 ^ j21) | j810) ^ j21) | (jLongValue17 ^ j21))) + ((long) (-2049105141));
                    int iFreeMemory3 = (int) Runtime.getRuntime().freeMemory();
                    int i3515 = ((int) (j910 >> 32)) & (745434130 + (((~(1427572846 | iFreeMemory3)) | (-9653565)) * (-465)) + ((1427572846 | (~((-9653565) | iFreeMemory3))) * 930) + ((iFreeMemory3 | (-8406289)) * 465));
                    int iMyTid3 = Process.myTid();
                    int i3516 = ~iMyTid3;
                    int i3610 = ((int) j910) & ((-1687905466) + (((~((-887992997) | i3516)) | 1969747889) * (-90)) + (((~((-887992997) | iMyTid3)) | (-1978660790)) * (-45)) + (((~(iMyTid3 | (-1969747890))) | (-887992997) | (~(i3516 | 1969747889))) * 45));
                    i40 = (i3515 & i3610) | (i3515 ^ i3610);
                }
                if (i40 != 1986687685) {
                    i41 = i31;
                    strArr7 = strArr6;
                } else {
                    i41 = i31;
                    strArr7 = strArr6;
                }
                int i4610 = 12 - (~(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24)));
                int i4611 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int iSerializer8 = TextInputBigV2Kt$MainText$1$1$1.serializer();
                int i4612 = (i4611 * 829) + 1617379;
                int i4613 = ~i4611;
                int i4614 = ~((i4613 & (-1952)) | (i4613 ^ (-1952)));
                int i4615 = ~iSerializer8;
                int i4616 = (i4615 ^ i4611) | (i4615 & i4611);
                int i4617 = ~((i4616 & 1951) | (i4616 ^ 1951));
                int i4618 = ((i4614 & i4617) | (i4614 ^ i4617)) * (-828);
                int i4619 = (i4612 & i4618) + (i4612 | i4618);
                int i4710 = -(-((i4615 | i4611 | 1951) * (-828)));
                int i4711 = (i4619 & i4710) + (i4710 | i4619);
                int i4712 = (~((i4611 & 1951) | (i4611 ^ 1951))) * 828;
                Object[] objArr1110 = new Object[1];
                b(i4610, (i4711 ^ i4712) + ((i4712 & i4711) << 1), (char) TextUtils.getOffsetAfter("", 0), objArr1110);
                String str511 = (String) objArr1110[0];
                int i4713 = 4 - (~ExpandableListView.getPackedPositionGroup(0L));
                int iRgb2 = Color.rgb(0, 0, 0);
                int i4714 = iRgb2 * (-115);
                int i4715 = (i4714 & (-1929605815)) + (i4714 | (-1929605815));
                int i4716 = ~i;
                int i4717 = (i4716 ^ iRgb2) | (i4716 & iRgb2);
                int i4718 = -(-((~((i4717 & 16779181) | (i4717 ^ 16779181))) * (-116)));
                int i4719 = ((((i4715 | i4718) << 1) - (i4718 ^ i4715)) - (~(-(-((iRgb2 | i) * 116))))) - 1;
                int i4810 = ~iRgb2;
                int i4811 = ~((i4810 & (-16779182)) | (i4810 ^ (-16779182)));
                int i4812 = ~(((-16779182) & i) | ((-16779182) ^ i));
                int i4813 = ((i4811 & i4812) | (i4811 ^ i4812)) * 116;
                Object[] objArr1111 = new Object[1];
                b(i4713, ((i4719 | i4813) << 1) - (i4813 ^ i4719), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr1111);
                String[] strArr210 = {str511, (String) objArr1111[0]};
                int threadPriority2 = Process.getThreadPriority(0);
                Object[] objArr1112 = new Object[1];
                b(14 - (~(-(((threadPriority2 & 20) + (threadPriority2 | 20)) >> 6))), 1970 - (~(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr1112);
                String str512 = (String) objArr1112[0];
                int i4814 = 17 - (~(-TextUtils.indexOf((CharSequence) "", '0', 0, 0)));
                int i4815 = 1983 - (~(-((byte) KeyEvent.getModifierMetaStateMask())));
                int i4816 = -ExpandableListView.getPackedPositionType(0L);
                Object[] objArr1113 = new Object[1];
                b(i4814, i4815, (char) (((i4816 | 40600) << 1) - (i4816 ^ 40600)), objArr1113);
                String str513 = (String) objArr1113[0];
                int jumpTapTimeout3 = 14 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                int i4817 = 2003 - (~(-Color.red(0)));
                int i4818 = -(-Gravity.getAbsoluteGravity(0, 0));
                Object[] objArr1114 = new Object[1];
                b(jumpTapTimeout3, i4817, (char) ((i4818 ^ 48304) + ((i4818 & 48304) << 1)), objArr1114);
                String[] strArr211 = {str512, str513, (String) objArr1114[0]};
                int i4819 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int i4910 = ((i4819 | 21) << 1) - (i4819 ^ 21);
                int iIndexOf10 = TextUtils.indexOf("", "", 0);
                int iSerializer9 = TextInputBigV2Kt$MainText$1$1$1.serializer();
                int i4911 = iIndexOf10 * (-445);
                int i4912 = (i4911 ^ (-898010)) + ((i4911 & (-898010)) << 1);
                int i4913 = ~iIndexOf10;
                int i4914 = ~((i4913 ^ (-2019)) | (i4913 & (-2019)));
                int i4915 = ~((~iSerializer9) | (-2019));
                int i4916 = (i4912 - (~(((i4914 ^ i4915) | (i4914 & i4915)) * 446))) - 1;
                int i4917 = ~iIndexOf10;
                int i4918 = ~((i4917 & 2018) | (i4917 ^ 2018));
                int i4919 = ~(((-2019) ^ iIndexOf10) | (iIndexOf10 & (-2019)) | iSerializer9);
                int i5010 = -(-(((i4919 & i4918) | (i4918 ^ i4919)) * 446));
                Object[] objArr1115 = new Object[1];
                b(i4910, (i4916 ^ i5010) + ((i5010 & i4916) << 1) + ((~((i4913 ^ (-2019)) | (i4913 & (-2019)))) * 446), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr1115);
                String str514 = (String) objArr1115[0];
                int i5011 = -(-(ViewConfiguration.getPressedStateDuration() >> 16));
                Object[] objArr1116 = new Object[1];
                b((i5011 ^ 10) + ((i5011 & 10) << 1), 2038 - (~(-(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))))), (char) (52603 - (~(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))), objArr1116);
                String[] strArr212 = {str514, (String) objArr1116[0]};
                int i5012 = 10 - (~Color.red(0));
                int i5013 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int i5014 = (i5013 ^ 2049) + ((i5013 & 2049) << 1);
                int keyRepeatDelay4 = ViewConfiguration.getKeyRepeatDelay() >> 16;
                Object[] objArr1117 = new Object[1];
                b(i5012, i5014, (char) ((keyRepeatDelay4 & 63588) + (keyRepeatDelay4 | 63588)), objArr1117);
                String str515 = (String) objArr1117[0];
                int i5015 = -TextUtils.lastIndexOf("", '0', 0, 0);
                Object[] objArr1118 = new Object[1];
                b(((i5015 | 5) << 1) - (i5015 ^ 5), 587 - (ViewConfiguration.getTapTimeout() >> 16), (char) KeyEvent.getDeadChar(0, 0), objArr1118);
                String[] strArr213 = {str515, (String) objArr1118[0]};
                int i5016 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int i5017 = (i5016 & 28) + (i5016 | 28);
                int packedPositionChild5 = ExpandableListView.getPackedPositionChild(0L);
                Object[] objArr1119 = new Object[1];
                b(i5017, (packedPositionChild5 ^ 2061) + ((packedPositionChild5 & 2061) << 1), (char) KeyEvent.normalizeMetaState(0), objArr1119);
                String str516 = (String) objArr1119[0];
                int i5018 = -(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                c5 = 0;
                Object[] objArr1211 = new Object[1];
                b((i5018 & 9) + (i5018 | 9), ImageFormat.getBitsPerPixel(0) + 2040, (char) (52603 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), objArr1211);
                strArr8 = new String[][]{strArr210, strArr211, strArr212, strArr213, new String[]{str516, (String) objArr1211[0]}};
                i42 = 0;
                i43 = -1;
                loop7: while (true) {
                    if (i42 < 5) {
                        i44 = i;
                        break;
                    }
                    String[] strArr214 = strArr8[i42];
                    str7 = strArr214[c5];
                    strArr9 = (String[]) Arrays.copyOfRange(strArr214, 1, strArr214.length);
                    length = strArr9.length;
                    i48 = 0;
                    while (i48 < length) {
                        String str517 = strArr9[i48];
                        i43 = (i43 & 1) + (i43 | 1);
                        file4 = new File(str7);
                        if (file4.exists()) {
                            strArr10 = strArr8;
                            strArr11 = strArr9;
                            str8 = str7;
                        } else {
                            strArr10 = strArr8;
                            strArr11 = strArr9;
                            str8 = str7;
                        }
                        i48 = ((i48 ^ 68) + ((i48 & 68) << 1)) - 67;
                        strArr8 = strArr10;
                        strArr9 = strArr11;
                        str7 = str8;
                    }
                    i42++;
                    c5 = 0;
                }
                int i5213 = ((~i33) & i) | (i33 & i41);
                int i5214 = -i5213;
                int i5215 = ((i5213 & i5214) | (i5213 ^ i5214)) >> 31;
                int i5216 = i44 & (~i5215);
                int i5217 = i33 & i5215;
                int i5218 = (i5217 & i5216) | (i5216 ^ i5217);
                int i5510 = ((~i5218) & i) | (i5218 & i45);
                int i5511 = -i5510;
                int i5512 = ((i5510 & i5511) | (i5510 ^ i5511)) >> 31;
                int i5513 = i46 & (~i5512);
                int i5514 = i5218 & i5512;
                int i5515 = (i5514 & i5513) | (i5513 ^ i5514);
                int i5516 = 45 - (~(-TextUtils.indexOf((CharSequence) "", '0', 0, 0)));
                int i5517 = 2108 - (~TextUtils.indexOf("", "", 0, 0));
                int i5518 = -TextUtils.getTrimmedLength("");
                Object[] objArr1212 = new Object[1];
                b(i5516, i5517, (char) (((i5518 | 45962) << 1) - (i5518 ^ 45962)), objArr1212);
                String str610 = (String) objArr1212[0];
                int i5519 = IconCompatParcelizer;
                int i5610 = ((i5519 | 11) << 1) - (i5519 ^ 11);
                read = i5610 % Fields.SpotShadowColor;
                int i5611 = i5610 % 2;
                Object[] objArr1213 = {str610};
                objRemoteActionCompatParcelizer12 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(971290740);
                if (objRemoteActionCompatParcelizer12 == null) {
                    char offsetAfter3 = (char) TextUtils.getOffsetAfter("", 0);
                    int i5612 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2644;
                    int packedPositionGroup4 = 22 - ExpandableListView.getPackedPositionGroup(0L);
                    byte b410 = (byte) ($$b & 1);
                    byte b411 = b410;
                    Object[] objArr1214 = new Object[1];
                    a(b410, b411, (byte) (b411 + 1), objArr1214);
                    objRemoteActionCompatParcelizer12 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(offsetAfter3, i5612, packedPositionGroup4, -382428779, false, (String) objArr1214[0], new Class[]{String.class});
                }
                long jLongValue18 = ((Long) ((Method) objRemoteActionCompatParcelizer12).invoke(null, objArr1213)).longValue();
                long j1010 = 1924612661;
                long j1011 = -575;
                long j1012 = (j1011 * j1010) + (j1011 * jLongValue18);
                long j1013 = 576;
                long j1014 = j1010 ^ j21;
                long j1015 = jLongValue18 ^ j21;
                long j112 = (j1014 | j1015) ^ j21;
                i28 = i45;
                long jElapsedRealtime5 = (int) SystemClock.elapsedRealtime();
                long j113 = j1012 + ((j112 | ((j1015 | jElapsedRealtime5) ^ j21)) * j1013) + ((((((jElapsedRealtime5 ^ j21) | j1015) | j1010) ^ j21) | ((jLongValue18 | j1014) ^ j21)) * j1013) + (j1013 * j112) + ((long) (-1988644673));
                int i5613 = ((int) (j113 >> 32)) & (872779416 + (((~((-1198785098) | i)) | 238441313) * (-366)) + (((~((-1094713353) | i)) | 134369568) * 366));
                int iMyPid4 = Process.myPid();
                int i5614 = (~((-1989266569) | iMyPid4)) | 847367304;
                int i5615 = ~((~iMyPid4) | 2010373581);
                int i5616 = ((int) j113) & (1688415237 + ((i5614 | i5615) * (-470)) + (((~(iMyPid4 | (-1141899265))) | i5615) * 470));
                int i5617 = ((i5613 & i5616) | (i5613 ^ i5616)) * 263;
                int i5618 = i ^ i5515;
                int i5619 = (i5618 | (-i5618)) >> 31;
                i25 = (i5515 & i5619) | (((i5617 & i28) | ((~i5617) & i)) & (~i5619));
                strArr4 = strArr7;
            } else {
                i28 = i10;
                strArr4 = null;
            }
            int[] iArr2 = new int[1];
            int i774 = i ^ i25;
            int i775 = -i774;
            Object[] objArr191 = {new int[]{i25}, new int[]{i}, iArr2, strArr4};
            int i776 = ((((~(i | 503316414)) | 138450048) * 449) - 1075229740) + ((138450048 | (~(i28 | 503316414))) * 449);
            int i777 = -(-((((i774 & i775) | (i774 ^ i775)) >> 31) & 16));
            int i778 = -(-((i776 & i777) + (i776 | i777)));
            int i779 = (i3 & i778) + (i3 | i778);
            int i780 = i779 << 13;
            int i781 = (i780 & (~i779)) | ((~i780) & i779);
            int i782 = i781 >>> 17;
            int i783 = ((~i781) & i782) | ((~i782) & i781);
            int i784 = i783 << 5;
            iArr2[0] = ((~i783) & i784) | ((~i784) & i783);
            return objArr191;
        }
        int i785 = (2101228987 ^ i) | (2101228987 & i);
        int i786 = ~i785;
        int i787 = 2078384917 + (((i786 & 1369752486) | (1369752486 ^ i786)) * (-465));
        int i788 = ~(1369752486 | i);
        int i789 = ((2101228987 & i788) | (2101228987 ^ i788)) * 930;
        int i790 = ((((i787 | i789) << 1) - (i789 ^ i787)) - (~((1369752486 | i785) * 465))) - 1;
        int i791 = 1040518576 | i;
        int i792 = -(-(((i791 & 1170850649) | (i791 ^ 1170850649)) * (-381)));
        int i793 = (587753016 ^ i792) + ((i792 & 587753016) << 1);
        int i794 = ~((i121 & 1040518576) | (i121 ^ 1040518576));
        int i795 = (i794 & 973343904) | (973343904 ^ i794);
        if (i790 <= (i793 - (~(-(-(((i795 & 1103675977) | (i795 ^ 1103675977)) * 381))))) - 894338835) {
            i7 = i121;
            i9 = (i & (-11772)) | (i7 & 11771);
        } else {
            i7 = i121;
            i9 = i ^ 266;
        }
        i8 = i9;
        int i1410 = ((~i130) & i) | (i130 & i7);
        int i1411 = (i1410 | (-i1410)) >> 31;
        int i1510 = i8 & (~i1411);
        int i1511 = i130 & i1411;
        int i1512 = (i1510 & i1511) | (i1510 ^ i1511);
        objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-579020261);
        if (objRemoteActionCompatParcelizer == null) {
            char c18 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int windowTouchSlop5 = 1321 - (ViewConfiguration.getWindowTouchSlop() >> 8);
            int packedPositionGroup5 = 31 - ExpandableListView.getPackedPositionGroup(0L);
            byte b110 = (byte) 0;
            byte b111 = (byte) (b110 + 1);
            Object[] objArr210 = new Object[1];
            a(b110, b111, (byte) (-b111), objArr210);
            objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c18, windowTouchSlop5, packedPositionGroup5, 229440506, false, (String) objArr210[0], new Class[0]);
        }
        long jLongValue19 = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, null)).longValue();
        long j210 = -1099501802;
        long j211 = -751;
        long j212 = j210 ^ j21;
        long j213 = jLongValue19 ^ j21;
        i10 = i7;
        j = i;
        long j214 = (j211 * j210) + (j211 * jLongValue19) + (((long) 1504) * (((j212 | j213) ^ j21) | ((j212 | j) ^ j21)));
        long j310 = j212 | jLongValue19;
        long j311 = j214 + (((long) (-1504)) * ((j310 | j) ^ j21)) + (((long) 752) * ((j310 ^ j21) | ((j213 | j210) ^ j21))) + ((long) 1793783813);
        int i1513 = ((int) (j311 >> 32)) & (1552854535 + (((~(97065705 | i10)) | (-1534292117)) * (-983)) + (((~((-1534292117) | i10)) | 21041280) * 983));
        int iNextInt3 = new Random().nextInt(864023753);
        int i1514 = ~iNextInt3;
        int i1515 = (~(494405828 | i1514)) | (-1031425254);
        int i1516 = ~(iNextInt3 | (-405801157));
        int i1517 = ((int) j311) & (478338897 + ((i1515 | i1516) * (-502)) + ((i1516 | (~(i1514 | (-537019426)))) * 502));
        int i1518 = (i1513 & i1517) | (i1513 ^ i1517);
        int i1519 = (i1518 ^ (-1)) + (i1518 << 1);
        int i1610 = ((i1519 | 200) << 1) - (i1519 ^ 200);
        int i1611 = ((~i1610) & i) | (i1610 & i10);
        int i1612 = -i1518;
        int i1613 = ((i1518 & i1612) | (i1518 ^ i1612)) >> 31;
        int i1614 = (~i1613) & i;
        int i1615 = i1613 & i1611;
        int i1616 = (~(i & i1512)) & (i | i1512);
        int i1617 = (i1616 | (-i1616)) >> 31;
        int i1618 = ((i1615 & i1614) | (i1614 ^ i1615)) & (~i1617);
        int i1619 = i1512 & i1617;
        int i1710 = (i1619 & i1618) | (i1618 ^ i1619);
        int i1711 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
        Object[] objArr211 = new Object[1];
        b((i1711 & 19) + (i1711 | 19), 202 - (~(-TextUtils.getCapsMode("", 0, 0))), (char) (51290 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), objArr211);
        String str110 = (String) objArr211[0];
        Object[] objArr212 = new Object[1];
        b(6 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 222 - (~(-(-KeyEvent.getDeadChar(0, 0)))), (char) TextUtils.indexOf("", "", 0, 0), objArr212);
        Object[] objArr310 = {str110, (String) objArr212[0]};
        objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(2121162724);
        if (objRemoteActionCompatParcelizer2 == null) {
            char scrollBarSize2 = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 6015);
            int i1712 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1410;
            int iBlue3 = 17 - Color.blue(0);
            byte b112 = (byte) 0;
            byte b113 = (byte) (b112 + 1);
            Object[] objArr311 = new Object[1];
            a(b112, b113, (byte) (-b113), objArr311);
            objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(scrollBarSize2, i1712, iBlue3, -1363247611, false, (String) objArr311[0], new Class[]{String.class, String.class});
        }
        long jLongValue20 = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr310)).longValue();
        long j312 = 543249466;
        long j313 = j312 ^ j21;
        long jFreeMemory4 = (int) Runtime.getRuntime().freeMemory();
        long j314 = (((long) 567) * j312) + (((long) (-565)) * jLongValue20) + (((long) (-566)) * (((j313 | jLongValue20) ^ j21) | ((j313 | jFreeMemory4) ^ j21)));
        long j315 = 566;
        long j316 = jLongValue20 ^ j21;
        long j317 = j314 + (((j312 | j316) ^ j21) * j315) + (j315 * ((jFreeMemory4 | (j313 | j316)) ^ j21)) + ((long) 1107732412);
        int i1713 = ((int) (j317 >> 32)) & (((((~((-16843945) | i)) | 1084752130) * 449) - 980573698) + ((1084752130 | (~((-16843945) | i10))) * 449));
        int i1714 = ~(((int) Process.getElapsedCpuTime()) | 1369262581);
        int i1715 = ((int) j317) & (((153430421 | i1714) * (-658)) + 1229474639 + ((i1714 | 136323072) * 658));
        int i1716 = (i1713 & i1715) | (i1713 ^ i1715);
        int i1717 = -i1716;
        int i1718 = ((i1716 & i1717) | (i1716 ^ i1717)) >> 31;
        int i1719 = (i1718 & (i ^ 262)) | ((~i1718) & i);
        int i1810 = ((~i1710) & i) | (i1710 & i10);
        int i1811 = -i1810;
        int i1812 = ((i1810 & i1811) | (i1810 ^ i1811)) >> 31;
        int i1813 = i1719 & (~i1812);
        int i1814 = i1812 & i1710;
        int i1815 = (i1813 & i1814) | (i1813 ^ i1814);
        int i1816 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
        int i1817 = (i1816 & 31) + (i1816 | 31);
        int i1818 = 229 - (~(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))));
        int i1819 = -TextUtils.indexOf("", "", 0, 0);
        Object[] objArr312 = new Object[1];
        b(i1817, i1818, (char) ((i1819 & 36067) + (i1819 | 36067)), objArr312);
        String str111 = (String) objArr312[0];
        Object[] objArr313 = new Object[1];
        b(22 - (~(-(-Drawable.resolveOpacity(0, 0)))), 259 - (~(-(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))))), (char) ((-1) - Process.getGidForName("")), objArr313);
        String str112 = (String) objArr313[0];
        int i1910 = -Drawable.resolveOpacity(0, 0);
        int i1911 = (i1910 & 28) + (i1910 | 28);
        int i1912 = -TextUtils.getOffsetBefore("", 0);
        Object[] objArr314 = new Object[1];
        b(i1911, ((i1912 | 283) << 1) - (i1912 ^ 283), (char) ((-1) - ImageFormat.getBitsPerPixel(0)), objArr314);
        String str210 = (String) objArr314[0];
        int i1913 = (-16777203) - (~(-Color.rgb(0, 0, 0)));
        int iLastIndexOf4 = TextUtils.lastIndexOf("", '0', 0, 0);
        Object[] objArr315 = new Object[1];
        b(i1913, (iLastIndexOf4 & 312) + (iLastIndexOf4 | 312), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr315);
        strArr = new String[]{str111, str112, str210, (String) objArr315[0]};
        i11 = 0;
        while (true) {
            if (i11 < 4) {
                i12 = i;
                break;
            }
            int i1914 = read + 39;
            IconCompatParcelizer = i1914 % Fields.SpotShadowColor;
            int i1915 = i1914 % 2;
            Object[] objArr316 = {strArr[i11]};
            objRemoteActionCompatParcelizer17 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-502275956);
            if (objRemoteActionCompatParcelizer17 == null) {
                char c19 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                int windowTouchSlop6 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 2645;
                int i1916 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21;
                byte b114 = (byte) 0;
                byte b115 = b114;
                Object[] objArr317 = new Object[1];
                a(b114, b115, (byte) (b115 + 4), objArr317);
                objRemoteActionCompatParcelizer17 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c19, windowTouchSlop6, i1916, 853524845, false, (String) objArr317[0], new Class[]{String.class});
            }
            long jLongValue21 = ((Long) ((Method) objRemoteActionCompatParcelizer17).invoke(null, objArr316)).longValue();
            long j318 = -878573219;
            strArr15 = strArr;
            long j319 = -159;
            long j410 = (j319 * j318) + (j319 * jLongValue21);
            long j411 = 160;
            long j412 = j ^ j21;
            long j413 = j410 + ((jLongValue21 | (j318 ^ j21)) * j411) + (((long) (-160)) * (((j412 | j318) ^ j21) | ((j318 | jLongValue21) ^ j21))) + (j411 * ((((jLongValue21 ^ j21) | j412) ^ j21) | j318)) + ((long) 1747737642);
            int iElapsedRealtime3 = (int) SystemClock.elapsedRealtime();
            int i1917 = ~iElapsedRealtime3;
            int i1918 = (~(2028692554 | i1917)) | (-2045470283);
            int i1919 = ~(iElapsedRealtime3 | (-812270603));
            i59 = ((int) (j413 >> 32)) & (((i1918 | i1919) * (-252)) + 1374790614 + ((i1919 | (~(i1917 | (-16777729)))) * 252));
            i60 = ((int) j413) & ((-43517635) + (((-1344315434) | i10) * 184) + (((~(765266454 | i10)) | (-1361422890)) * 184));
            if (((i60 & i59) | (i59 ^ i60)) != 0) {
                int i2010 = IconCompatParcelizer + 109;
                read = i2010 % Fields.SpotShadowColor;
                int i2011 = i2010 % 2;
                i12 = i ^ (i11 + 252);
                break;
            }
            int i2012 = ((i11 | (-46)) << 1) - (i11 ^ (-46));
            i11 = (i2012 & 47) + (i2012 | 47);
            strArr = strArr15;
        }
        int i2013 = i ^ i1815;
        int i2014 = -i2013;
        int i2015 = ((i2013 & i2014) | (i2013 ^ i2014)) >> 31;
        int i2016 = i12 & (~i2015);
        int i2017 = i1815 & i2015;
        int i2018 = (i2017 & i2016) | (i2016 ^ i2017);
        int i2019 = -Color.red(0);
        int i2110 = ((i2019 | 13) << 1) - (i2019 ^ 13);
        int i2111 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 325;
        int i2112 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
        Object[] objArr318 = new Object[1];
        b(i2110, i2111, (char) (((i2112 | 36620) << 1) - (i2112 ^ 36620)), objArr318);
        Object[] objArr319 = {(String) objArr318[0]};
        objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1468326312);
        if (objRemoteActionCompatParcelizer3 == null) {
            char scrollBarFadeDuration6 = (char) (58126 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
            int doubleTapTimeout4 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 947;
            int iBlue4 = 27 - Color.blue(0);
            byte b116 = (byte) ($$b & 1);
            byte b117 = b116;
            Object[] objArr410 = new Object[1];
            a(b116, b117, (byte) (b117 + 1), objArr410);
            objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(scrollBarFadeDuration6, doubleTapTimeout4, iBlue4, 2024488889, false, (String) objArr410[0], new Class[]{String.class});
        }
        str2 = (String) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr319);
        if (str2 != null) {
            objArr4 = new Object[1];
            b(9 - (~(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))), 338 - View.MeasureSpec.getSize(0), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr4);
            if (str2.contains((String) objArr4[0])) {
                i13 = (i & (-251)) | (i10 & 250);
            } else {
                i13 = i;
            }
        } else {
            i13 = i;
        }
        int i2113 = ((~i2018) & i) | (i2018 & i10);
        int i2114 = (i2113 | (-i2113)) >> 31;
        int i2115 = i13 & (~i2114);
        int i2116 = i2018 & i2114;
        int i2117 = (i2116 & i2115) | (i2115 ^ i2116);
        int i2118 = read + 81;
        IconCompatParcelizer = i2118 % Fields.SpotShadowColor;
        int i2119 = i2118 % 2;
        int i2210 = -TextUtils.indexOf("", "", 0);
        int i2211 = ((17 | i2210) << 1) - (17 ^ i2210);
        int i2212 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
        int i2213 = (i2212 & 348) + (i2212 | 348);
        int i2214 = -Color.green(0);
        Object[] objArr411 = new Object[1];
        b(i2211, i2213, (char) (((i2214 | 21145) << 1) - (i2214 ^ 21145)), objArr411);
        String str211 = (String) objArr411[0];
        int longPressTimeout8 = ViewConfiguration.getLongPressTimeout() >> 16;
        int i2215 = (longPressTimeout8 & 6) + (longPressTimeout8 | 6);
        int i2216 = -(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
        Object[] objArr412 = new Object[1];
        b(i2215, (i2216 ^ 364) + ((i2216 & 364) << 1), (char) (60019 - Process.getGidForName("")), objArr412);
        Object[] objArr413 = {str211, (String) objArr412[0]};
        objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(2121162724);
        if (objRemoteActionCompatParcelizer4 == null) {
            char absoluteGravity3 = (char) (6015 - Gravity.getAbsoluteGravity(0, 0));
            int maximumFlingVelocity2 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1411;
            int iLastIndexOf5 = TextUtils.lastIndexOf("", '0') + 18;
            byte b118 = (byte) 0;
            byte b210 = (byte) (b118 + 1);
            Object[] objArr414 = new Object[1];
            a(b118, b210, (byte) (-b210), objArr414);
            objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(absoluteGravity3, maximumFlingVelocity2, iLastIndexOf5, -1363247611, false, (String) objArr414[0], new Class[]{String.class, String.class});
        }
        long jLongValue22 = ((Long) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr413)).longValue();
        long j414 = 148837856;
        long j415 = 868;
        long j416 = j414 ^ j21;
        long jElapsedRealtime6 = (int) SystemClock.elapsedRealtime();
        long j417 = jElapsedRealtime6 ^ j21;
        long j418 = jLongValue22 ^ j21;
        long j419 = j416 | j418;
        j2 = (j415 * j414) + (j415 * jLongValue22) + (((long) (-867)) * (((j416 | j417) ^ j21) | ((j418 | j417) ^ j21))) + (((long) (-1734)) * ((j419 ^ j21) | ((j416 | jElapsedRealtime6) ^ j21) | ((j418 | jElapsedRealtime6) ^ j21))) + (((long) 867) * (((jElapsedRealtime6 | (j418 | j414)) ^ j21) | ((j419 | j417) ^ j21) | (((j416 | jLongValue22) | jElapsedRealtime6) ^ j21))) + ((long) 1502144022);
        if (((((int) (j2 >> 32)) & ((((~(1681386332 | i)) * 420) - 290318962) + (((~(1681386332 | i10)) | 1613916748) * 420))) | (((int) j2) & (1966717605 + (((~(1636251362 | i)) | 199024952) * (-366)) + (((~(1809840122 | i)) | 25436192) * 366)))) != 0) {
            i14 = (~(i & 251)) & (i | 251);
        } else {
            i14 = i;
        }
        int i2217 = (~(i & i2117)) & (i | i2117);
        int i2218 = -i2217;
        int i2219 = ((i2217 & i2218) | (i2217 ^ i2218)) >> 31;
        int i2310 = (i2117 & i2219) | (i14 & (~i2219));
        int i2311 = 22 - (~(-(ViewConfiguration.getEdgeSlop() >> 16)));
        int i2312 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
        int iSerializer10 = TextInputBigV2Kt$MainText$1$1$1.serializer();
        int i2313 = i2312 * 319;
        int i2314 = ((i2313 | (-117290)) << 1) - (i2313 ^ (-117290));
        int i2315 = ~i2312;
        int i2316 = -(-(((~((i2315 & iSerializer10) | (i2315 ^ iSerializer10))) | (-371)) * (-318)));
        int i2317 = ((i2314 | i2316) << 1) - (i2316 ^ i2314);
        int i2318 = ~(((-371) & iSerializer10) | ((-371) ^ iSerializer10));
        int i2319 = ~iSerializer10;
        int i2410 = (i2318 | (~((i2319 ^ i2312) | (i2319 & i2312) | 370))) * 318;
        int i2411 = ((i2317 | i2410) << 1) - (i2410 ^ i2317);
        int i2412 = -(-(((~((i2312 & 370) | (i2312 ^ 370) | iSerializer10)) | (~(((-371) & i2319) | ((-371) ^ i2319) | i2312))) * 318));
        int i2413 = ((i2411 | i2412) << 1) - (i2412 ^ i2411);
        int i2414 = -(ViewConfiguration.getScrollBarSize() >> 8);
        Object[] objArr415 = new Object[1];
        b(i2311, i2413, (char) ((i2414 ^ 29464) + ((i2414 & 29464) << 1)), objArr415);
        Object[] objArr416 = {(String) objArr415[0]};
        objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1468326312);
        if (objRemoteActionCompatParcelizer5 == null) {
            char packedPositionGroup6 = (char) (58126 - ExpandableListView.getPackedPositionGroup(0L));
            int i2415 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 946;
            int modifierMetaStateMask4 = ((byte) KeyEvent.getModifierMetaStateMask()) + 28;
            byte b211 = (byte) ($$b & 1);
            byte b212 = b211;
            Object[] objArr417 = new Object[1];
            a(b211, b212, (byte) (b212 + 1), objArr417);
            objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(packedPositionGroup6, i2415, modifierMetaStateMask4, 2024488889, false, (String) objArr417[0], new Class[]{String.class});
        }
        lowerCase = ((String) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr416)).toLowerCase();
        int i2416 = -(-(ViewConfiguration.getTapTimeout() >> 16));
        i15 = (i2416 ^ 4) + ((i2416 & 4) << 1);
        modifierMetaStateMask = (byte) KeyEvent.getModifierMetaStateMask();
        int i2417 = IconCompatParcelizer;
        i16 = (i2417 ^ 35) + ((i2417 & 35) << 1);
        read = i16 % Fields.SpotShadowColor;
        if (i16 % 2 != 0) {
            int minimumFlingVelocity3 = ViewConfiguration.getMinimumFlingVelocity();
            objArr3 = new Object[1];
            b(i15, modifierMetaStateMask * 392, (char) (18115 >> (((minimumFlingVelocity3 | 119) << 1) - (minimumFlingVelocity3 ^ 119))), objArr3);
            if (lowerCase.contains((String) objArr3[0])) {
                i17 = (~(i & Constant.ERROR_ROTATION_ANGLE_INVALID)) & (i | Constant.ERROR_ROTATION_ANGLE_INVALID);
            } else {
                i17 = i;
            }
        } else {
            int i2418 = -modifierMetaStateMask;
            objArr = new Object[1];
            b(i15, (i2418 ^ 392) + ((i2418 & 392) << 1), (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1220), objArr);
            if (lowerCase.contains((String) objArr[0])) {
                i17 = (~(i & Constant.ERROR_ROTATION_ANGLE_INVALID)) & (i | Constant.ERROR_ROTATION_ANGLE_INVALID);
            } else {
                i17 = i;
            }
        }
        int i2419 = ((~i2310) & i) | (i2310 & i10);
        int i2510 = -i2419;
        int i2511 = ((i2419 & i2510) | (i2419 ^ i2510)) >> 31;
        int i2512 = i17 & (~i2511);
        int i2513 = i2310 & i2511;
        int i2514 = (i2513 & i2512) | (i2512 ^ i2513);
        int i2515 = -(-TextUtils.lastIndexOf("", '0', 0, 0));
        int i2516 = (i2515 ^ 43) + ((i2515 & 43) << 1);
        int i2517 = 398 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
        int i2518 = -TextUtils.indexOf("", "", 0, 0);
        Object[] objArr418 = new Object[1];
        b(i2516, i2517, (char) ((i2518 & 64919) + (i2518 | 64919)), objArr418);
        String str212 = (String) objArr418[0];
        int i2519 = -View.combineMeasuredStates(0, 0);
        int i2610 = (i2519 & 40) + (i2519 | 40);
        int i2611 = -(-View.getDefaultSize(0, 0));
        Object[] objArr419 = new Object[1];
        b(i2610, (i2611 ^ 439) + ((i2611 & 439) << 1), (char) ((-2) - (~(-(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))))), objArr419);
        String str213 = (String) objArr419[0];
        Object[] objArr511 = new Object[1];
        b(26 - ((byte) KeyEvent.getModifierMetaStateMask()), 478 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (0 - (~TextUtils.lastIndexOf("", '0'))), objArr511);
        String str214 = (String) objArr511[0];
        int i2612 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
        Object[] objArr512 = new Object[1];
        b((i2612 & 27) + (i2612 | 27), 505 - (~(-(ViewConfiguration.getScrollDefaultDelay() >> 16))), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), objArr512);
        String str215 = (String) objArr512[0];
        int i2613 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
        int packedPositionType4 = ExpandableListView.getPackedPositionType(0L);
        int i2614 = -Color.red(0);
        Object[] objArr513 = new Object[1];
        b((i2613 ^ 28) + ((i2613 & 28) << 1), ((packedPositionType4 | 533) << 1) - (packedPositionType4 ^ 533), (char) (((i2614 | 19775) << 1) - (i2614 ^ 19775)), objArr513);
        String str216 = (String) objArr513[0];
        int i2615 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
        int i2616 = (i2615 ^ 26) + ((i2615 & 26) << 1);
        int iAlpha3 = Color.alpha(0);
        Object[] objArr514 = new Object[1];
        b(i2616, ((iAlpha3 | 560) << 1) - (iAlpha3 ^ 560), (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 51265), objArr514);
        strArr2 = new String[]{str212, str213, str214, str215, str216, (String) objArr514[0]};
        i18 = 0;
        while (true) {
            if (i18 < 6) {
                i19 = i;
                break;
            }
            Object[] objArr515 = {strArr2[i18]};
            objRemoteActionCompatParcelizer16 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1468326312);
            if (objRemoteActionCompatParcelizer16 == null) {
                char c110 = (char) (58126 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                int offsetAfter4 = 947 - TextUtils.getOffsetAfter("", 0);
                int packedPositionChild6 = 26 - ExpandableListView.getPackedPositionChild(0L);
                byte b213 = (byte) ($$b & 1);
                byte b214 = b213;
                Object[] objArr516 = new Object[1];
                a(b213, b214, (byte) (b214 + 1), objArr516);
                objRemoteActionCompatParcelizer16 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c110, offsetAfter4, packedPositionChild6, 2024488889, false, (String) objArr516[0], new Class[]{String.class});
            }
            str9 = (String) ((Method) objRemoteActionCompatParcelizer16).invoke(null, objArr515);
            if (str9 == null) {
            }
            i18++;
        }
        int i2617 = i ^ i2514;
        int i2710 = -i2617;
        int i2711 = ((i2617 & i2710) | (i2617 ^ i2710)) >> 31;
        int i2712 = (i2514 & i2711) | (i19 & (~i2711));
        int longPressTimeout9 = 17 - (ViewConfiguration.getLongPressTimeout() >> 16);
        int i2713 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
        int i2714 = ((i2713 | 348) << 1) - (i2713 ^ 348);
        int maximumDrawingCacheSize4 = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
        int i2715 = maximumDrawingCacheSize4 * (-518);
        int i2716 = (i2715 ^ (-10953110)) + ((i2715 & (-10953110)) << 1);
        int i2717 = ~maximumDrawingCacheSize4;
        int i2718 = (i2717 & i10) | (i2717 ^ i10);
        int i2719 = ~i2718;
        int i2810 = -(-(((i2719 & 21145) | (i2719 ^ 21145)) * 519));
        int i2811 = (i2716 & i2810) + (i2810 | i2716);
        int i2812 = ~(i2718 | 21145);
        int i2813 = (maximumDrawingCacheSize4 ^ 21145) | (maximumDrawingCacheSize4 & 21145);
        int i2814 = ~((i2813 & i) | (i2813 ^ i));
        char c111 = (char) (((i2811 - (~(((i2812 & i2814) | (i2812 ^ i2814)) * (-519)))) - 1) + ((maximumDrawingCacheSize4 | (~((i ^ 21145) | (i & 21145)))) * 519));
        Object[] objArr517 = new Object[1];
        b(longPressTimeout9, i2714, c111, objArr517);
        String str217 = (String) objArr517[0];
        int i2815 = -(-Color.red(0));
        int i2816 = (i2815 ^ 6) + ((i2815 & 6) << 1);
        int i2817 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
        Object[] objArr518 = new Object[1];
        b(i2816, (i2817 ^ 587) + ((i2817 & 587) << 1), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr518);
        str3 = (String) objArr518[0];
        file = new File(str217);
        if (!file.exists()) {
            int trimmedLength4 = 13 - TextUtils.getTrimmedLength("");
            int i2915 = -View.resolveSize(0, 0);
            int i2916 = ((i2915 | 595) << 1) - (i2915 ^ 595);
            int i2917 = -((byte) KeyEvent.getModifierMetaStateMask());
            Object[] objArr519 = new Object[1];
            b(trimmedLength4, i2916, (char) ((i2917 & 62572) + (i2917 | 62572)), objArr519);
            String str218 = (String) objArr519[0];
            int i2918 = -(-TextUtils.indexOf((CharSequence) "", '0', 0));
            int i2919 = (i2918 & 10) + (i2918 | 10);
            int i29110 = -((Process.getThreadPriority(0) + 20) >> 6);
            Object[] objArr610 = new Object[1];
            b(i2919, ((i29110 | 608) << 1) - (i29110 ^ 608), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 3822), objArr610);
            str4 = (String) objArr610[0];
            file2 = new File(str218);
            if (file2.exists()) {
                i21 = IconCompatParcelizer + 63;
                read = i21 % Fields.SpotShadowColor;
                if (i21 % 2 == 0) {
                    file2.isFile();
                    throw null;
                }
                if (file2.isFile()) {
                    Scanner scanner6 = new Scanner(new FileInputStream(file2));
                    Object[] objArr611 = new Object[1];
                    b(View.combineMeasuredStates(0, 0) + 2, 593 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) Gravity.getAbsoluteGravity(0, 0), objArr611);
                    scannerUseDelimiter = scanner6.useDelimiter((String) objArr611[0]);
                    if (scannerUseDelimiter.hasNext()) {
                        next = scannerUseDelimiter.next();
                    } else {
                        next = "";
                    }
                    scannerUseDelimiter.close();
                    if (next.contains(str4)) {
                        i20 = (i & (-262)) | (i10 & 261);
                    } else {
                        i20 = i;
                    }
                } else {
                    i20 = i;
                }
            } else {
                i20 = i;
            }
        } else {
            Scanner scanner7 = new Scanner(new FileInputStream(file));
            int iMyPid5 = Process.myPid() >> 22;
            int i2818 = (iMyPid5 & 2) + (iMyPid5 | 2);
            int i2819 = -(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
            Object[] objArr520 = new Object[1];
            b(i2818, (i2819 ^ 593) + ((i2819 & 593) << 1), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr520);
            scannerUseDelimiter2 = scanner7.useDelimiter((String) objArr520[0]);
            if (!scannerUseDelimiter2.hasNext()) {
                next2 = "";
            } else {
                int i2920 = read;
                int i2921 = ((i2920 | 117) << 1) - (i2920 ^ 117);
                IconCompatParcelizer = i2921 % Fields.SpotShadowColor;
                int i2922 = i2921 % 2;
                next2 = scannerUseDelimiter2.next();
            }
            scannerUseDelimiter2.close();
            if (next2.contains(str3)) {
                i20 = i ^ 260;
            } else {
                int trimmedLength5 = 13 - TextUtils.getTrimmedLength("");
                int i29111 = -View.resolveSize(0, 0);
                int i29112 = ((i29111 | 595) << 1) - (i29111 ^ 595);
                int i29113 = -((byte) KeyEvent.getModifierMetaStateMask());
                Object[] objArr5110 = new Object[1];
                b(trimmedLength5, i29112, (char) ((i29113 & 62572) + (i29113 | 62572)), objArr5110);
                String str219 = (String) objArr5110[0];
                int i29114 = -(-TextUtils.indexOf((CharSequence) "", '0', 0));
                int i29115 = (i29114 & 10) + (i29114 | 10);
                int i29116 = -((Process.getThreadPriority(0) + 20) >> 6);
                Object[] objArr612 = new Object[1];
                b(i29115, ((i29116 | 608) << 1) - (i29116 ^ 608), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 3822), objArr612);
                str4 = (String) objArr612[0];
                file2 = new File(str219);
                if (file2.exists()) {
                    i21 = IconCompatParcelizer + 63;
                    read = i21 % Fields.SpotShadowColor;
                    if (i21 % 2 == 0) {
                        file2.isFile();
                        throw null;
                    }
                    if (file2.isFile()) {
                        Scanner scanner8 = new Scanner(new FileInputStream(file2));
                        Object[] objArr613 = new Object[1];
                        b(View.combineMeasuredStates(0, 0) + 2, 593 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) Gravity.getAbsoluteGravity(0, 0), objArr613);
                        scannerUseDelimiter = scanner8.useDelimiter((String) objArr613[0]);
                        if (scannerUseDelimiter.hasNext()) {
                            next = scannerUseDelimiter.next();
                        } else {
                            next = "";
                        }
                        scannerUseDelimiter.close();
                        if (next.contains(str4)) {
                            i20 = (i & (-262)) | (i10 & 261);
                        } else {
                            i20 = i;
                        }
                    } else {
                        i20 = i;
                    }
                } else {
                    i20 = i;
                }
            }
        }
        int i3010 = ((~i2712) & i) | (i2712 & i10);
        int i3011 = (i3010 | (-i3010)) >> 31;
        int i3012 = i20 & (~i3011);
        int i3013 = i2712 & i3011;
        i22 = (i3013 & i3012) | (i3012 ^ i3013);
        if ((i2 & 8) == 0) {
            int i3014 = read;
            int i3015 = ((i3014 | 123) << 1) - (i3014 ^ 123);
            IconCompatParcelizer = i3015 % Fields.SpotShadowColor;
            int i3016 = i3015 % 2;
            Object[] objArr614 = new Object[1];
            b(41 - (~(-TextUtils.indexOf((CharSequence) "", '0'))), 616 - (~(-KeyEvent.normalizeMetaState(0))), (char) (43704 - (~(-TextUtils.indexOf((CharSequence) "", '0', 0, 0)))), objArr614);
            String str310 = (String) objArr614[0];
            int i3017 = -(-Color.alpha(0));
            Object[] objArr615 = new Object[1];
            b((i3017 & 41) + (i3017 | 41), 660 - (~(-(-TextUtils.lastIndexOf("", '0')))), (char) (0 - (~(-(-TextUtils.indexOf((CharSequence) "", '0', 0))))), objArr615);
            String str311 = (String) objArr615[0];
            int capsMode4 = TextUtils.getCapsMode("", 0, 0);
            int i3018 = (capsMode4 & 38) + (capsMode4 | 38);
            int keyRepeatTimeout2 = ViewConfiguration.getKeyRepeatTimeout() >> 16;
            Object[] objArr616 = new Object[1];
            b(i3018, (keyRepeatTimeout2 ^ 701) + ((keyRepeatTimeout2 & 701) << 1), (char) (56386 - (ViewConfiguration.getLongPressTimeout() >> 16)), objArr616);
            strArr13 = new String[]{str310, str311, (String) objArr616[0]};
            i53 = 0;
            while (true) {
                if (i53 < 3) {
                    i54 = i;
                    break;
                }
                Object[] objArr617 = {strArr13[i53]};
                objRemoteActionCompatParcelizer15 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(971290740);
                if (objRemoteActionCompatParcelizer15 == null) {
                    char cBlue2 = (char) Color.blue(0);
                    int deadChar2 = KeyEvent.getDeadChar(0, 0) + 2645;
                    int absoluteGravity4 = 22 - Gravity.getAbsoluteGravity(0, 0);
                    byte b215 = (byte) ($$b & 1);
                    byte b216 = b215;
                    Object[] objArr618 = new Object[1];
                    a(b215, b216, (byte) (b216 + 1), objArr618);
                    objRemoteActionCompatParcelizer15 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cBlue2, deadChar2, absoluteGravity4, -382428779, false, (String) objArr618[0], new Class[]{String.class});
                }
                long jLongValue23 = ((Long) ((Method) objRemoteActionCompatParcelizer15).invoke(null, objArr617)).longValue();
                long j510 = 1975738297;
                strArr14 = strArr13;
                long j511 = -754;
                long j512 = j510 ^ j21;
                long j513 = j512 | jLongValue23;
                long j514 = j ^ j21;
                long j515 = (((long) 755) * j510) + (((long) (-753)) * jLongValue23) + (((j513 ^ j21) | ((j512 | j) ^ j21) | ((jLongValue23 | j) ^ j21)) * j511) + (j511 * (((j513 | j) ^ j21) | ((jLongValue23 | (j514 | j510)) ^ j21))) + (((long) 754) * (j512 | j514)) + ((long) (-2039770309));
                i55 = ((int) (j515 >> 32)) & ((((((~((-652006251) | i10)) | 1069354) | (~(785220160 | i10))) * (-397)) - 333621846) + ((135352618 | i) * 397));
                int i3019 = ~((-1050697033) | i10);
                i56 = ((int) j515) & (((17408033 | i3019) * (-374)) + 817746791 + ((i3019 | (-1068105066)) * 374));
                if (((i55 & i56) | (i55 ^ i56)) != 0) {
                    int i3110 = read;
                    int i3111 = i3110 + 17;
                    IconCompatParcelizer = i3111 % Fields.SpotShadowColor;
                    int i3112 = i3111 % 2;
                    i54 = ((i53 & 280) + (i53 | 280)) ^ i;
                    int i3113 = i3110 + 81;
                    IconCompatParcelizer = i3113 % Fields.SpotShadowColor;
                    int i3114 = i3113 % 2;
                    break;
                }
                i53++;
                strArr13 = strArr14;
            }
            int i3115 = (~(i & i22)) & (i | i22);
            int i3116 = -i3115;
            int i3117 = ((i3115 & i3116) | (i3115 ^ i3116)) >> 31;
            int i3118 = i54 & (~i3117);
            int i3119 = i22 & i3117;
            i22 = (i3119 & i3118) | (i3118 ^ i3119);
        }
        int i3210 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
        int i3211 = -(-View.resolveSize(0, 0));
        Object[] objArr619 = new Object[1];
        b(((i3210 | 41) << 1) - (i3210 ^ 41), ((i3211 | 739) << 1) - (i3211 ^ 739), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 11543), objArr619);
        String str312 = (String) objArr619[0];
        int fadingEdgeLength4 = ViewConfiguration.getFadingEdgeLength() >> 16;
        int i3212 = ((fadingEdgeLength4 | 30) << 1) - (fadingEdgeLength4 ^ 30);
        int i3213 = 779 - (~(-View.resolveSizeAndState(0, 0, 0)));
        int i3214 = -TextUtils.lastIndexOf("", '0', 0, 0);
        Object[] objArr710 = new Object[1];
        b(i3212, i3213, (char) ((i3214 & 30717) + (i3214 | 30717)), objArr710);
        strArr3 = new String[]{str312, (String) objArr710[0]};
        i23 = 0;
        while (true) {
            if (i23 < 2) {
                i24 = i;
                break;
            }
            Object[] objArr711 = {strArr3[i23]};
            objRemoteActionCompatParcelizer14 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1794492419);
            if (objRemoteActionCompatParcelizer14 == null) {
                char c112 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                int iResolveSizeAndState4 = View.resolveSizeAndState(0, 0, 0) + 2645;
                int packedPositionType5 = ExpandableListView.getPackedPositionType(0L) + 22;
                byte b217 = (byte) 0;
                byte b218 = (byte) (b217 + 1);
                Object[] objArr712 = new Object[1];
                a(b217, b218, (byte) (-b218), objArr712);
                objRemoteActionCompatParcelizer14 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c112, iResolveSizeAndState4, packedPositionType5, 1171920412, false, (String) objArr712[0], new Class[]{String.class});
            }
            long jLongValue24 = ((Long) ((Method) objRemoteActionCompatParcelizer14).invoke(null, objArr711)).longValue();
            long j516 = 36278171;
            strArr12 = strArr3;
            long j517 = (((long) 595) * j516) + (((long) (-1187)) * jLongValue24);
            long j518 = ((j516 ^ j21) | jLongValue24) ^ j21;
            long j519 = j ^ j21;
            long j610 = j517 + (((long) (-1188)) * (j518 | ((j519 | jLongValue24) ^ j21)));
            long j611 = 594;
            long j612 = jLongValue24 ^ j21;
            long j613 = (j519 | j516) ^ j21;
            long j614 = j610 + ((j518 | ((j612 | j) ^ j21) | j613) * j611) + (j611 * (((j612 | j516) ^ j21) | ((j612 | j519) ^ j21) | j613)) + ((long) 1057172479);
            i51 = ((int) (j614 >> 32)) & ((((~((-1095780353) | i)) | 335675432) * 501) + 1537417058 + ((~((-1095780353) | i10)) * 501));
            i52 = ((int) j614) & ((-1547941655) + (((~((-984550736) | i)) | 1873190150) * (-366)) + (((~((-269025354) | i)) | 1157664768) * 366));
            if (((i52 & i51) | (i51 ^ i52)) != 0) {
                int i3215 = i23 + 288;
                i24 = ((~i3215) & i) | (i3215 & i10);
                break;
            }
            i23++;
            strArr3 = strArr12;
        }
        int i3216 = i ^ i22;
        int i3217 = -i3216;
        int i3218 = ((i3216 & i3217) | (i3216 ^ i3217)) >> 31;
        int i3219 = i24 & (~i3218);
        int i3310 = i22 & i3218;
        i25 = (i3310 & i3219) | (i3219 ^ i3310);
        objRemoteActionCompatParcelizer6 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-20375759);
        if (objRemoteActionCompatParcelizer6 == null) {
            char maxKeyCode3 = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 40511);
            int i3311 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2101;
            int jumpTapTimeout4 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 19;
            byte b219 = (byte) 0;
            byte b313 = (byte) (b219 + 1);
            Object[] objArr713 = new Object[1];
            a(b219, b313, (byte) (-b313), objArr713);
            objRemoteActionCompatParcelizer6 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(maxKeyCode3, i3311, jumpTapTimeout4, 773404368, false, (String) objArr713[0], new Class[0]);
        }
        long jLongValue110 = ((Long) ((Method) objRemoteActionCompatParcelizer6).invoke(null, null)).longValue();
        long j615 = -1500855620;
        long j616 = j615 ^ j21;
        long j617 = jLongValue110 ^ j21;
        long jElapsedRealtime7 = (int) SystemClock.elapsedRealtime();
        long j618 = (((long) 592) * j615) + (((long) (-590)) * jLongValue110) + (((long) (-1182)) * ((j616 | jLongValue110) ^ j21)) + (((long) (-591)) * ((((j616 | j617) | (jElapsedRealtime7 ^ j21)) ^ j21) | ((jLongValue110 | j615) ^ j21))) + (((long) 591) * (jElapsedRealtime7 | j616 | j617)) + ((long) (-444430705));
        int i3312 = ~new Random().nextInt(1664265385);
        i26 = ((int) (j618 >> 32)) & ((-336018934) + (((-10755) | i3312) * 184) + (((~(i3312 | (-1083566596))) | (-690629203)) * 184));
        int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
        i27 = ((int) j618) & (123090714 + (((~((-271058049) | (~elapsedCpuTime2))) | 1708284458) * (-591)) + ((elapsedCpuTime2 | (-271058049)) * 591));
        if (((i26 & i27) | (i26 ^ i27)) != 1) {
            Object[] objArr714 = {1};
            objRemoteActionCompatParcelizer7 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-734179977);
            if (objRemoteActionCompatParcelizer7 == null) {
                char keyRepeatDelay5 = (char) (44612 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                int i3313 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2357;
                int i3314 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12;
                byte b314 = (byte) 0;
                byte b315 = (byte) (b314 + 1);
                Object[] objArr715 = new Object[1];
                a(b314, b315, (byte) (-b315), objArr715);
                objRemoteActionCompatParcelizer7 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(keyRepeatDelay5, i3313, i3314, 82668694, false, (String) objArr715[0], new Class[]{Integer.TYPE});
            }
            long jLongValue111 = ((Long) ((Method) objRemoteActionCompatParcelizer7).invoke(null, objArr714)).longValue();
            long j619 = 1437177382;
            long j710 = jLongValue111 ^ j21;
            long j711 = j ^ j21;
            long j712 = (j711 | jLongValue111) ^ j21;
            long j713 = (((long) (-515)) * j619) + (((long) 517) * jLongValue111) + (((long) (-516)) * (((j710 | j) ^ j21) | ((j711 | j619) ^ j21) | j712));
            long j714 = 516;
            long j715 = j619 ^ j21;
            long j716 = j713 + (((((j715 | j710) | j) ^ j21) | (((j715 | j711) | jLongValue111) ^ j21)) * j714) + (j714 * (((jLongValue111 | j715) ^ j21) | j712)) + ((long) (-1840417969));
            int i3315 = (int) Runtime.getRuntime().totalMemory();
            i29 = ((int) (j716 >> 32)) & ((-2005432166) + (((~((-1079140508) | i3315)) | 5398539) * 104) + ((~((~i3315) | 1431827871)) * (-104)) + ((i3315 | 358085903) * 104));
            i30 = ((int) j716) & (2134139841 + (((~(1409152255 | i10)) | 28074154 | (~((-334324907) | i))) * (-68)) + ((~(i10 | (-306250753))) * (-68)) + (((~(334324906 | i10)) | 1102901503) * 68));
            if (((i29 & i30) | (i29 ^ i30)) != 0) {
                i31 = i10;
                i32 = (i & (-221)) | (i31 & 220);
            } else {
                i31 = i10;
                i32 = i;
            }
            int i3316 = (~(i & i25)) & (i | i25);
            int i3317 = (i3316 | (-i3316)) >> 31;
            int i3318 = i32 & (~i3317);
            int i3319 = i25 & i3317;
            i33 = (i3319 & i3318) | (i3318 ^ i3319);
            int i3410 = 22 - (~(-(-Color.argb(0, 0, 0, 0))));
            int i3411 = -Color.blue(0);
            int i3412 = (i3411 ^ 370) + ((i3411 & 370) << 1);
            int maxKeyCode4 = KeyEvent.getMaxKeyCode() >> 16;
            Object[] objArr716 = new Object[1];
            b(i3410, i3412, (char) ((maxKeyCode4 ^ 29464) + ((maxKeyCode4 & 29464) << 1)), objArr716);
            Object[] objArr717 = {(String) objArr716[0]};
            objRemoteActionCompatParcelizer8 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1468326312);
            if (objRemoteActionCompatParcelizer8 == null) {
                char edgeSlop3 = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 58126);
                int i3413 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 946;
                int windowTouchSlop7 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 27;
                byte b316 = (byte) ($$b & 1);
                byte b317 = b316;
                Object[] objArr718 = new Object[1];
                a(b316, b317, (byte) (b317 + 1), objArr718);
                objRemoteActionCompatParcelizer8 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(edgeSlop3, i3413, windowTouchSlop7, 2024488889, false, (String) objArr718[0], new Class[]{String.class});
            }
            objInvoke = ((Method) objRemoteActionCompatParcelizer8).invoke(null, objArr717);
            if (objInvoke != null) {
                int i3414 = IconCompatParcelizer + 75;
                read = i3414 % Fields.SpotShadowColor;
                int i3415 = i3414 % 2;
                Object[] objArr719 = {objInvoke, 42};
                objRemoteActionCompatParcelizer13 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-998984536);
                if (objRemoteActionCompatParcelizer13 == null) {
                    char c113 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int fadingEdgeLength5 = 1481 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int iArgb2 = 31 - Color.argb(0, 0, 0, 0);
                    byte b318 = (byte) 0;
                    byte b319 = (byte) (b318 + 1);
                    Object[] objArr815 = new Object[1];
                    a(b318, b319, (byte) (-b319), objArr815);
                    objRemoteActionCompatParcelizer13 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c113, fadingEdgeLength5, iArgb2, 346330441, false, (String) objArr815[0], new Class[]{String.class, Integer.TYPE});
                }
                long jLongValue112 = ((Long) ((Method) objRemoteActionCompatParcelizer13).invoke(null, objArr719)).longValue();
                long j717 = -707879779;
                long j718 = 569;
                long j719 = j717 ^ j21;
                long j814 = jLongValue112 ^ j21;
                long j815 = j719 | j814;
                long jElapsedRealtime8 = (int) SystemClock.elapsedRealtime();
                long j816 = jElapsedRealtime8 ^ j21;
                long j817 = (j718 * j717) + (j718 * jLongValue112) + (((long) (-1136)) * ((j815 ^ j21) | ((j719 | j816) ^ j21) | ((j814 | j816) ^ j21)));
                long j818 = j816 | j717;
                long j819 = j817 + (((long) (-568)) * (((j719 | jElapsedRealtime8) ^ j21) | ((j814 | jElapsedRealtime8) ^ j21) | ((j818 | jLongValue112) ^ j21))) + (((long) 568) * (((j815 | jElapsedRealtime8) ^ j21) | ((j816 | jLongValue112) ^ j21) | (j818 ^ j21))) + ((long) (-426345249));
                i49 = ((int) (j819 >> 32)) & ((((~(798055164 | i)) | 1346635008) * (-283)) + 282844330 + ((~(2144690172 | i)) * 283));
                int startUptimeMillis3 = (int) Process.getStartUptimeMillis();
                int i3416 = ~startUptimeMillis3;
                int i3417 = 18631677 + (((~((-1344290977) | i3416)) | (~(1479827621 | startUptimeMillis3))) * 520);
                int i3418 = ~((-1479827622) | i3416);
                int i3419 = ~(startUptimeMillis3 | 1377913264);
                i50 = ((int) j819) & (i3417 + ((i3418 | i3419) * (-1040)) + ((i3419 | (~(i3416 | (-1377913265))) | 135536645) * 520));
                if (((i50 & i49) | (i49 ^ i50)) == 1986687685) {
                    int i3517 = read;
                    int i3518 = (i3517 & 49) + (i3517 | 49);
                    IconCompatParcelizer = i3518 % Fields.SpotShadowColor;
                    int i3519 = i3518 % 2;
                    strArr6 = null;
                    i39 = 0;
                    i38 = 1;
                }
                int i35110 = -Color.green(i39);
                int i35111 = (i35110 ^ 16) + ((i35110 & 16) << i38);
                int iResolveSize5 = View.resolveSize(i39, i39);
                Object[] objArr816 = new Object[i38];
                b(i35111, ((iResolveSize5 | 891) << i38) - (iResolveSize5 ^ 891), (char) KeyEvent.keyCodeFromString(""), objArr816);
                Object[] objArr817 = {(String) objArr816[i39]};
                objRemoteActionCompatParcelizer10 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1468326312);
                if (objRemoteActionCompatParcelizer10 == null) {
                    char c114 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 58125);
                    int capsMode5 = TextUtils.getCapsMode("", 0, 0) + 947;
                    int iNormalizeMetaState4 = KeyEvent.normalizeMetaState(0) + 27;
                    byte b3110 = (byte) ($$b & 1);
                    byte b3111 = b3110;
                    Object[] objArr818 = new Object[1];
                    a(b3110, b3111, (byte) (b3111 + 1), objArr818);
                    objRemoteActionCompatParcelizer10 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c114, capsMode5, iNormalizeMetaState4, 2024488889, false, (String) objArr818[0], new Class[]{String.class});
                }
                objInvoke2 = ((Method) objRemoteActionCompatParcelizer10).invoke(null, objArr817);
                if (objInvoke2 == null) {
                    i40 = 0;
                } else {
                    Object[] objArr819 = {objInvoke2, 42};
                    objRemoteActionCompatParcelizer11 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-998984536);
                    if (objRemoteActionCompatParcelizer11 == null) {
                        char cIndexOf3 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
                        int longPressTimeout10 = (ViewConfiguration.getLongPressTimeout() >> 16) + 1481;
                        int maximumDrawingCacheSize5 = 31 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        byte b3112 = (byte) 0;
                        byte b412 = (byte) (b3112 + 1);
                        Object[] objArr8110 = new Object[1];
                        a(b3112, b412, (byte) (-b412), objArr8110);
                        objRemoteActionCompatParcelizer11 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cIndexOf3, longPressTimeout10, maximumDrawingCacheSize5, 346330441, false, (String) objArr8110[0], new Class[]{String.class, Integer.TYPE});
                    }
                    long jLongValue113 = ((Long) ((Method) objRemoteActionCompatParcelizer11).invoke(null, objArr819)).longValue();
                    int i35112 = IconCompatParcelizer;
                    int i35113 = (i35112 & 37) + (i35112 | 37);
                    read = i35113 % Fields.SpotShadowColor;
                    int i35114 = i35113 % 2;
                    long j8110 = 914880113;
                    long j8111 = 306;
                    long j8112 = ((long) 610) + (j8111 * j8110) + (j8111 * jLongValue113);
                    long j8113 = 305;
                    long jFreeMemory5 = (int) Runtime.getRuntime().freeMemory();
                    long j911 = j8112 + ((((j8110 | jLongValue113) ^ j21) | ((j8110 | jFreeMemory5) ^ j21)) * j8113) + (j8113 * ((((jFreeMemory5 ^ j21) | j8110) ^ j21) | (jLongValue113 ^ j21))) + ((long) (-2049105141));
                    int iFreeMemory4 = (int) Runtime.getRuntime().freeMemory();
                    int i35115 = ((int) (j911 >> 32)) & (745434130 + (((~(1427572846 | iFreeMemory4)) | (-9653565)) * (-465)) + ((1427572846 | (~((-9653565) | iFreeMemory4))) * 930) + ((iFreeMemory4 | (-8406289)) * 465));
                    int iMyTid4 = Process.myTid();
                    int i35116 = ~iMyTid4;
                    int i3611 = ((int) j911) & ((-1687905466) + (((~((-887992997) | i35116)) | 1969747889) * (-90)) + (((~((-887992997) | iMyTid4)) | (-1978660790)) * (-45)) + (((~(iMyTid4 | (-1969747890))) | (-887992997) | (~(i35116 | 1969747889))) * 45));
                    i40 = (i35115 & i3611) | (i35115 ^ i3611);
                }
                if (i40 != 1986687685) {
                    i41 = i31;
                    strArr7 = strArr6;
                } else {
                    i41 = i31;
                    strArr7 = strArr6;
                }
                int i46110 = 12 - (~(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24)));
                int i46111 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int iSerializer11 = TextInputBigV2Kt$MainText$1$1$1.serializer();
                int i46112 = (i46111 * 829) + 1617379;
                int i46113 = ~i46111;
                int i46114 = ~((i46113 & (-1952)) | (i46113 ^ (-1952)));
                int i46115 = ~iSerializer11;
                int i46116 = (i46115 ^ i46111) | (i46115 & i46111);
                int i46117 = ~((i46116 & 1951) | (i46116 ^ 1951));
                int i46118 = ((i46114 & i46117) | (i46114 ^ i46117)) * (-828);
                int i46119 = (i46112 & i46118) + (i46112 | i46118);
                int i47110 = -(-((i46115 | i46111 | 1951) * (-828)));
                int i47111 = (i46119 & i47110) + (i47110 | i46119);
                int i47112 = (~((i46111 & 1951) | (i46111 ^ 1951))) * 828;
                Object[] objArr11110 = new Object[1];
                b(i46110, (i47111 ^ i47112) + ((i47112 & i47111) << 1), (char) TextUtils.getOffsetAfter("", 0), objArr11110);
                String str518 = (String) objArr11110[0];
                int i47113 = 4 - (~ExpandableListView.getPackedPositionGroup(0L));
                int iRgb3 = Color.rgb(0, 0, 0);
                int i47114 = iRgb3 * (-115);
                int i47115 = (i47114 & (-1929605815)) + (i47114 | (-1929605815));
                int i47116 = ~i;
                int i47117 = (i47116 ^ iRgb3) | (i47116 & iRgb3);
                int i47118 = -(-((~((i47117 & 16779181) | (i47117 ^ 16779181))) * (-116)));
                int i47119 = ((((i47115 | i47118) << 1) - (i47118 ^ i47115)) - (~(-(-((iRgb3 | i) * 116))))) - 1;
                int i48110 = ~iRgb3;
                int i48111 = ~((i48110 & (-16779182)) | (i48110 ^ (-16779182)));
                int i48112 = ~(((-16779182) & i) | ((-16779182) ^ i));
                int i48113 = ((i48111 & i48112) | (i48111 ^ i48112)) * 116;
                Object[] objArr11111 = new Object[1];
                b(i47113, ((i47119 | i48113) << 1) - (i48113 ^ i47119), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr11111);
                String[] strArr215 = {str518, (String) objArr11111[0]};
                int threadPriority3 = Process.getThreadPriority(0);
                Object[] objArr11112 = new Object[1];
                b(14 - (~(-(((threadPriority3 & 20) + (threadPriority3 | 20)) >> 6))), 1970 - (~(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr11112);
                String str519 = (String) objArr11112[0];
                int i48114 = 17 - (~(-TextUtils.indexOf((CharSequence) "", '0', 0, 0)));
                int i48115 = 1983 - (~(-((byte) KeyEvent.getModifierMetaStateMask())));
                int i48116 = -ExpandableListView.getPackedPositionType(0L);
                Object[] objArr11113 = new Object[1];
                b(i48114, i48115, (char) (((i48116 | 40600) << 1) - (i48116 ^ 40600)), objArr11113);
                String str5110 = (String) objArr11113[0];
                int jumpTapTimeout5 = 14 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                int i48117 = 2003 - (~(-Color.red(0)));
                int i48118 = -(-Gravity.getAbsoluteGravity(0, 0));
                Object[] objArr11114 = new Object[1];
                b(jumpTapTimeout5, i48117, (char) ((i48118 ^ 48304) + ((i48118 & 48304) << 1)), objArr11114);
                String[] strArr216 = {str519, str5110, (String) objArr11114[0]};
                int i48119 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int i49110 = ((i48119 | 21) << 1) - (i48119 ^ 21);
                int iIndexOf11 = TextUtils.indexOf("", "", 0);
                int iSerializer12 = TextInputBigV2Kt$MainText$1$1$1.serializer();
                int i49111 = iIndexOf11 * (-445);
                int i49112 = (i49111 ^ (-898010)) + ((i49111 & (-898010)) << 1);
                int i49113 = ~iIndexOf11;
                int i49114 = ~((i49113 ^ (-2019)) | (i49113 & (-2019)));
                int i49115 = ~((~iSerializer12) | (-2019));
                int i49116 = (i49112 - (~(((i49114 ^ i49115) | (i49114 & i49115)) * 446))) - 1;
                int i49117 = ~iIndexOf11;
                int i49118 = ~((i49117 & 2018) | (i49117 ^ 2018));
                int i49119 = ~(((-2019) ^ iIndexOf11) | (iIndexOf11 & (-2019)) | iSerializer12);
                int i5019 = -(-(((i49119 & i49118) | (i49118 ^ i49119)) * 446));
                Object[] objArr11115 = new Object[1];
                b(i49110, (i49116 ^ i5019) + ((i5019 & i49116) << 1) + ((~((i49113 ^ (-2019)) | (i49113 & (-2019)))) * 446), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr11115);
                String str5111 = (String) objArr11115[0];
                int i50110 = -(-(ViewConfiguration.getPressedStateDuration() >> 16));
                Object[] objArr11116 = new Object[1];
                b((i50110 ^ 10) + ((i50110 & 10) << 1), 2038 - (~(-(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))))), (char) (52603 - (~(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))), objArr11116);
                String[] strArr217 = {str5111, (String) objArr11116[0]};
                int i50111 = 10 - (~Color.red(0));
                int i50112 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int i50113 = (i50112 ^ 2049) + ((i50112 & 2049) << 1);
                int keyRepeatDelay6 = ViewConfiguration.getKeyRepeatDelay() >> 16;
                Object[] objArr11117 = new Object[1];
                b(i50111, i50113, (char) ((keyRepeatDelay6 & 63588) + (keyRepeatDelay6 | 63588)), objArr11117);
                String str5112 = (String) objArr11117[0];
                int i50114 = -TextUtils.lastIndexOf("", '0', 0, 0);
                Object[] objArr11118 = new Object[1];
                b(((i50114 | 5) << 1) - (i50114 ^ 5), 587 - (ViewConfiguration.getTapTimeout() >> 16), (char) KeyEvent.getDeadChar(0, 0), objArr11118);
                String[] strArr218 = {str5112, (String) objArr11118[0]};
                int i50115 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int i50116 = (i50115 & 28) + (i50115 | 28);
                int packedPositionChild7 = ExpandableListView.getPackedPositionChild(0L);
                Object[] objArr11119 = new Object[1];
                b(i50116, (packedPositionChild7 ^ 2061) + ((packedPositionChild7 & 2061) << 1), (char) KeyEvent.normalizeMetaState(0), objArr11119);
                String str5113 = (String) objArr11119[0];
                int i50117 = -(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                c5 = 0;
                Object[] objArr1215 = new Object[1];
                b((i50117 & 9) + (i50117 | 9), ImageFormat.getBitsPerPixel(0) + 2040, (char) (52603 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), objArr1215);
                strArr8 = new String[][]{strArr215, strArr216, strArr217, strArr218, new String[]{str5113, (String) objArr1215[0]}};
                i42 = 0;
                i43 = -1;
                loop7: while (true) {
                    if (i42 < 5) {
                        i44 = i;
                        break;
                    }
                    String[] strArr219 = strArr8[i42];
                    str7 = strArr219[c5];
                    strArr9 = (String[]) Arrays.copyOfRange(strArr219, 1, strArr219.length);
                    length = strArr9.length;
                    i48 = 0;
                    while (i48 < length) {
                        String str5114 = strArr9[i48];
                        i43 = (i43 & 1) + (i43 | 1);
                        file4 = new File(str7);
                        if (file4.exists()) {
                            strArr10 = strArr8;
                            strArr11 = strArr9;
                            str8 = str7;
                        } else {
                            strArr10 = strArr8;
                            strArr11 = strArr9;
                            str8 = str7;
                        }
                        i48 = ((i48 ^ 68) + ((i48 & 68) << 1)) - 67;
                        strArr8 = strArr10;
                        strArr9 = strArr11;
                        str7 = str8;
                    }
                    i42++;
                    c5 = 0;
                }
                int i5219 = ((~i33) & i) | (i33 & i41);
                int i52110 = -i5219;
                int i52111 = ((i5219 & i52110) | (i5219 ^ i52110)) >> 31;
                int i52112 = i44 & (~i52111);
                int i52113 = i33 & i52111;
                int i52114 = (i52113 & i52112) | (i52112 ^ i52113);
                int i52115 = 13 - (~(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
                int i52116 = -View.resolveSize(0, 0);
                int i52117 = (i52116 & 2088) + (i52116 | 2088);
                int i5312 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                Object[] objArr1216 = new Object[1];
                b(i52115, i52117, (char) ((i5312 ^ 58221) + ((i5312 & 58221) << 1)), objArr1216);
                String str5115 = (String) objArr1216[0];
                int i5313 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
                Object[] objArr1217 = new Object[1];
                b((i5313 ^ 8) + ((i5313 & 8) << 1), 2101 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (239 - KeyEvent.getDeadChar(0, 0)), objArr1217);
                String str611 = (String) objArr1217[0];
                file3 = new File(str5115);
                if (file3.exists()) {
                    i45 = i41;
                    i46 = i;
                } else {
                    i45 = i41;
                    i46 = i;
                }
                int i55110 = ((~i52114) & i) | (i52114 & i45);
                int i55111 = -i55110;
                int i55112 = ((i55110 & i55111) | (i55110 ^ i55111)) >> 31;
                int i55113 = i46 & (~i55112);
                int i55114 = i52114 & i55112;
                int i55115 = (i55114 & i55113) | (i55113 ^ i55114);
                int i55116 = 45 - (~(-TextUtils.indexOf((CharSequence) "", '0', 0, 0)));
                int i55117 = 2108 - (~TextUtils.indexOf("", "", 0, 0));
                int i55118 = -TextUtils.getTrimmedLength("");
                Object[] objArr1218 = new Object[1];
                b(i55116, i55117, (char) (((i55118 | 45962) << 1) - (i55118 ^ 45962)), objArr1218);
                String str612 = (String) objArr1218[0];
                int i55119 = IconCompatParcelizer;
                int i56110 = ((i55119 | 11) << 1) - (i55119 ^ 11);
                read = i56110 % Fields.SpotShadowColor;
                int i56111 = i56110 % 2;
                Object[] objArr1219 = {str612};
                objRemoteActionCompatParcelizer12 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(971290740);
                if (objRemoteActionCompatParcelizer12 == null) {
                    char offsetAfter5 = (char) TextUtils.getOffsetAfter("", 0);
                    int i56112 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2644;
                    int packedPositionGroup7 = 22 - ExpandableListView.getPackedPositionGroup(0L);
                    byte b413 = (byte) ($$b & 1);
                    byte b414 = b413;
                    Object[] objArr12110 = new Object[1];
                    a(b413, b414, (byte) (b414 + 1), objArr12110);
                    objRemoteActionCompatParcelizer12 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(offsetAfter5, i56112, packedPositionGroup7, -382428779, false, (String) objArr12110[0], new Class[]{String.class});
                }
                long jLongValue114 = ((Long) ((Method) objRemoteActionCompatParcelizer12).invoke(null, objArr1219)).longValue();
                long j1016 = 1924612661;
                long j1017 = -575;
                long j1018 = (j1017 * j1016) + (j1017 * jLongValue114);
                long j1019 = 576;
                long j10110 = j1016 ^ j21;
                long j10111 = jLongValue114 ^ j21;
                long j114 = (j10110 | j10111) ^ j21;
                i28 = i45;
                long jElapsedRealtime9 = (int) SystemClock.elapsedRealtime();
                long j115 = j1018 + ((j114 | ((j10111 | jElapsedRealtime9) ^ j21)) * j1019) + ((((((jElapsedRealtime9 ^ j21) | j10111) | j1016) ^ j21) | ((jLongValue114 | j10110) ^ j21)) * j1019) + (j1019 * j114) + ((long) (-1988644673));
                int i56113 = ((int) (j115 >> 32)) & (872779416 + (((~((-1198785098) | i)) | 238441313) * (-366)) + (((~((-1094713353) | i)) | 134369568) * 366));
                int iMyPid6 = Process.myPid();
                int i56114 = (~((-1989266569) | iMyPid6)) | 847367304;
                int i56115 = ~((~iMyPid6) | 2010373581);
                int i56116 = ((int) j115) & (1688415237 + ((i56114 | i56115) * (-470)) + (((~(iMyPid6 | (-1141899265))) | i56115) * 470));
                int i56117 = ((i56113 & i56116) | (i56113 ^ i56116)) * 263;
                int i56118 = i ^ i55115;
                int i56119 = (i56118 | (-i56118)) >> 31;
                i25 = (i55115 & i56119) | (((i56117 & i28) | ((~i56117) & i)) & (~i56119));
                strArr4 = strArr7;
            }
            int i5710 = -(-(ViewConfiguration.getJumpTapTimeout() >> 16));
            int i5711 = -(-Color.argb(0, 0, 0, 0));
            int i5712 = ((i5711 | 370) << 1) - (i5711 ^ 370);
            int i5713 = -Color.alpha(0);
            Object[] objArr1310 = new Object[1];
            b((i5710 & 23) + (i5710 | 23), i5712, (char) ((i5713 & 29464) + (i5713 | 29464)), objArr1310);
            String str613 = (String) objArr1310[0];
            Object[] objArr1311 = new Object[1];
            b(10 - Color.argb(0, 0, 0, 0), TextUtils.indexOf((CharSequence) "", '0') + 811, (char) (Process.myTid() >> 22), objArr1311);
            String str614 = (String) objArr1311[0];
            int i5714 = 6 - (~(-TextUtils.getCapsMode("", 0, 0)));
            int i5715 = -(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
            Object[] objArr1312 = new Object[1];
            b(i5714, (i5715 & 819) + (i5715 | 819), (char) (ViewConfiguration.getTapTimeout() >> 16), objArr1312);
            String str615 = (String) objArr1312[0];
            int i5716 = -(-(ViewConfiguration.getMaximumFlingVelocity() >> 16));
            int i5717 = (i5716 & 8) + (i5716 | 8);
            int i5718 = -(-TextUtils.indexOf((CharSequence) "", '0', 0));
            int i5719 = ((i5718 | 828) << 1) - (i5718 ^ 828);
            int i5810 = -(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
            Object[] objArr1313 = new Object[1];
            b(i5717, i5719, (char) ((i5810 ^ 1) + ((i5810 & 1) << 1)), objArr1313);
            String[] strArr220 = {str613, str614, str615, (String) objArr1313[0]};
            int iMyTid5 = 17 - (Process.myTid() >> 22);
            int i5811 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            int i5812 = i5811 * 236;
            int i5813 = (392814 ^ i5812) + ((i5812 & 392814) << 1);
            int i5814 = ~i5811;
            int i5815 = ~((i5814 ^ i31) | (i5814 & i31));
            int i5816 = i5813 + (((i5815 & 834) | (i5815 ^ 834)) * (-235));
            int i5817 = ~((~i5811) | i);
            int i5818 = -(-(((i5817 & 834) | (i5817 ^ 834)) * (-470)));
            int i5819 = ((i5816 | i5818) << 1) - (i5816 ^ i5818);
            int i5910 = ~((i5811 & (-835)) | ((-835) ^ i5811));
            int i5911 = ~((i5814 & 834) | (i5814 ^ 834) | i);
            int i5912 = ((i5910 & i5911) | (i5910 ^ i5911)) * 235;
            int i5913 = -Color.rgb(0, 0, 0);
            Object[] objArr1314 = new Object[1];
            b(iMyTid5, ((i5819 | i5912) << 1) - (i5912 ^ i5819), (char) (((-16771509) & i5913) + (i5913 | (-16771509))), objArr1314);
            String str616 = (String) objArr1314[0];
            Object[] objArr1315 = new Object[1];
            b(7 - (ViewConfiguration.getFadingEdgeLength() >> 16), 852 - KeyEvent.keyCodeFromString(""), (char) (ViewConfiguration.getPressedStateDuration() >> 16), objArr1315);
            String str617 = (String) objArr1315[0];
            int i5914 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
            Object[] objArr1316 = new Object[1];
            b((i5914 & 7) + (i5914 | 7), 859 - ExpandableListView.getPackedPositionType(0L), (char) Gravity.getAbsoluteGravity(0, 0), objArr1316);
            String str618 = (String) objArr1316[0];
            Object[] objArr1317 = new Object[1];
            b(10 - (~(-TextUtils.getTrimmedLength(""))), 865 - (~(-(Process.myTid() >> 22))), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 31081), objArr1317);
            String str619 = (String) objArr1317[0];
            int i5915 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int i5916 = ((i5915 | 14) << 1) - (i5915 ^ 14);
            int i5917 = -(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
            Object[] objArr1318 = new Object[1];
            b(i5916, ((i5917 | 876) << 1) - (i5917 ^ 876), (char) (54524 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr1318);
            String[] strArr221 = {str616, str617, str618, str619, (String) objArr1318[0]};
            int i5918 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            int i5919 = -Gravity.getAbsoluteGravity(0, 0);
            Object[] objArr1319 = new Object[1];
            b(((i5918 | 15) << 1) - (i5918 ^ 15), (i5919 ^ 891) + ((i5919 & 891) << 1), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr1319);
            String str710 = (String) objArr1319[0];
            int i6010 = -(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
            int i6011 = (i6010 ^ 2) + ((i6010 & 2) << 1);
            int i6012 = 906 - (~(-(-(ViewConfiguration.getScrollDefaultDelay() >> 16))));
            int i6013 = -AndroidCharacter.getMirror('0');
            Object[] objArr1410 = new Object[1];
            b(i6011, i6012, (char) ((i6013 ^ 48) + ((i6013 & 48) << 1)), objArr1410);
            String str711 = (String) objArr1410[0];
            int touchSlop5 = 22 - (ViewConfiguration.getTouchSlop() >> 8);
            int i6014 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            Object[] objArr1411 = new Object[1];
            b(touchSlop5, ((i6014 | 919) << 1) - (i6014 ^ 919), (char) (ExpandableListView.getPackedPositionChild(0L) + 1), objArr1411);
            String str712 = (String) objArr1411[0];
            int i6015 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            int i6016 = ((i6015 | 26) << 1) - (i6015 ^ 26);
            int i6017 = 940 - (~(-(-TextUtils.lastIndexOf("", '0', 0))));
            int i6018 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
            Object[] objArr1412 = new Object[1];
            b(i6016, i6017, (char) (((41650 | i6018) << 1) - (i6018 ^ 41650)), objArr1412);
            String str713 = (String) objArr1412[0];
            int i6019 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            int i6110 = ((i6019 | 29) << 1) - (i6019 ^ 29);
            int i6111 = 964 - (~(-(ViewConfiguration.getFadingEdgeLength() >> 16)));
            int iIndexOf12 = TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            char c115 = (char) (((iIndexOf12 | 25088) << 1) - (iIndexOf12 ^ 25088));
            Object[] objArr1413 = new Object[1];
            b(i6110, i6111, c115, objArr1413);
            String[] strArr222 = {str710, str711, str, str712, str713, (String) objArr1413[0]};
            int mode3 = 11 - View.MeasureSpec.getMode(0);
            int i6112 = -KeyEvent.getDeadChar(0, 0);
            Object[] objArr1414 = new Object[1];
            b(mode3, (i6112 & 993) + (i6112 | 993), (char) ((-TextUtils.indexOf((CharSequence) "", '0', 0, 0)) - 1), objArr1414);
            String str714 = (String) objArr1414[0];
            int i6113 = -(-((byte) KeyEvent.getModifierMetaStateMask()));
            int i6114 = (i6113 ^ 9) + ((i6113 & 9) << 1);
            int trimmedLength6 = TextUtils.getTrimmedLength("");
            int i6115 = (((trimmedLength6 * 51) - 49196) - (~((trimmedLength6 | i) * (-50)))) - 1;
            int i6116 = ~trimmedLength6;
            int i6117 = ~((i6116 ^ (-1005)) | (i6116 & (-1005)) | i);
            int i6118 = ~i;
            int i6119 = ((-1005) ^ i6118) | ((-1005) & i6118);
            int i6210 = ~((i6119 ^ trimmedLength6) | (i6119 & trimmedLength6));
            int i6211 = -(-(((i6117 ^ i6210) | (i6210 & i6117)) * 50));
            int i6212 = (i6115 ^ i6211) + ((i6211 & i6115) << 1);
            int i6213 = ~((-1005) | i6118);
            int i6214 = ~((-1005) | trimmedLength6);
            int i6215 = (i6213 ^ i6214) | (i6213 & i6214);
            int i6216 = ~((trimmedLength6 & i6118) | (i6118 ^ trimmedLength6));
            int i6217 = (i6212 - (~(-(-(((i6215 & i6216) | (i6215 ^ i6216)) * 50))))) - 1;
            int i6218 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            Object[] objArr1415 = new Object[1];
            b(i6114, i6217, (char) ((i6218 ^ 32278) + ((i6218 & 32278) << 1)), objArr1415);
            String str715 = (String) objArr1415[0];
            int iIndexOf13 = TextUtils.indexOf((CharSequence) "", '0', 0) + 7;
            int i6219 = -(ViewConfiguration.getScrollBarSize() >> 8);
            int i6310 = i6219 * (-337);
            int i6311 = (i6310 & 343068) + (i6310 | 343068);
            int i6312 = ~i6219;
            int i6313 = ~(i6312 | i31);
            int i6314 = ~(((-1013) ^ i6219) | ((-1013) & i6219));
            int i6315 = (i6313 ^ i6314) | (i6314 & i6313);
            int i6316 = ~(i6219 | i);
            int i6317 = i6311 + (((i6315 ^ i6316) | (i6315 & i6316)) * (-338));
            int i6318 = (~(i6312 | 1012)) * 338;
            Object[] objArr1416 = new Object[1];
            b(iIndexOf13, (((i6317 | i6318) << 1) - (i6317 ^ i6318)) + (((~((i6312 ^ i6118) | (i6312 & i6118))) | (~((i6219 & 1012) | (i6219 ^ 1012) | i))) * 338), (char) (250 - (~(-View.getDefaultSize(0, 0)))), objArr1416);
            String str716 = (String) objArr1416[0];
            Object[] objArr1417 = new Object[1];
            b(6 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1019 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((-2) - (~(-TextUtils.lastIndexOf("", '0', 0)))), objArr1417);
            String[] strArr223 = {str714, str715, str716, (String) objArr1417[0]};
            int i6319 = 15 - (~(-View.combineMeasuredStates(0, 0)));
            int i6410 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            Object[] objArr1418 = new Object[1];
            b(i6319, ((i6410 | Fields.RotationZ) << 1) - (i6410 ^ Fields.RotationZ), (char) (ViewConfiguration.getPressedStateDuration() >> 16), objArr1418);
            String str717 = (String) objArr1418[0];
            int edgeSlop4 = 7 - (ViewConfiguration.getEdgeSlop() >> 16);
            int i6411 = -AndroidCharacter.getMirror('0');
            Object[] objArr1419 = new Object[1];
            b(edgeSlop4, (i6411 & 907) + (i6411 | 907), (char) ((Process.getThreadPriority(0) + 20) >> 6), objArr1419);
            String str718 = (String) objArr1419[0];
            int i6412 = -TextUtils.getCapsMode("", 0, 0);
            int i6413 = (i6412 ^ 8) + ((i6412 & 8) << 1);
            int touchSlop6 = ViewConfiguration.getTouchSlop() >> 8;
            int i6414 = (touchSlop6 & 827) + (touchSlop6 | 827);
            int i6415 = -TextUtils.lastIndexOf("", '0');
            Object[] objArr1510 = new Object[1];
            b(i6413, i6414, (char) ((i6415 ^ (-1)) + (i6415 << 1)), objArr1510);
            String[] strArr310 = {str717, str718, (String) objArr1510[0]};
            int i6416 = -(-Color.argb(0, 0, 0, 0));
            int i6417 = (i6416 ^ 14) + ((i6416 & 14) << 1);
            int i6418 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            Object[] objArr1511 = new Object[1];
            b(i6417, ((i6418 | 1039) << 1) - (i6418 ^ 1039), (char) ((-ExpandableListView.getPackedPositionChild(0L)) - 1), objArr1511);
            String str719 = (String) objArr1511[0];
            int tapTimeout4 = ViewConfiguration.getTapTimeout() >> 16;
            int i6419 = (tapTimeout4 & 1) + (tapTimeout4 | 1);
            int i6510 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
            Object[] objArr1512 = new Object[1];
            b(i6419, (i6510 ^ 1054) + ((i6510 & 1054) << 1), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr1512);
            String[] strArr311 = {str719, (String) objArr1512[0]};
            int i6511 = -(-Color.rgb(0, 0, 0));
            Object[] objArr1513 = new Object[1];
            b((16777225 ^ i6511) + ((i6511 & 16777225) << 1), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1054, (char) Color.blue(0), objArr1513);
            String str810 = (String) objArr1513[0];
            int i6512 = -ExpandableListView.getPackedPositionChild(0L);
            int i6513 = -(-View.resolveSizeAndState(0, 0, 0));
            Object[] objArr1514 = new Object[1];
            b(i6512, (i6513 & 1064) + (i6513 | 1064), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr1514);
            String[] strArr312 = {str810, (String) objArr1514[0]};
            int i6514 = 15 - (~(-View.combineMeasuredStates(0, 0)));
            int iCombineMeasuredStates3 = 1065 - View.combineMeasuredStates(0, 0);
            int iIndexOf14 = TextUtils.indexOf((CharSequence) "", '0');
            Object[] objArr1515 = new Object[1];
            b(i6514, iCombineMeasuredStates3, (char) (((iIndexOf14 | 1) << 1) - (iIndexOf14 ^ 1)), objArr1515);
            String str811 = (String) objArr1515[0];
            int i6515 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int i6516 = (i6515 & 3) + (i6515 | 3);
            int iResolveOpacity4 = Drawable.resolveOpacity(0, 0);
            int iSerializer13 = TextInputBigV2Kt$MainText$1$1$1.serializer();
            int i6517 = iResolveOpacity4 * (-405);
            int i6518 = (369149 & i6517) + (i6517 | 369149);
            int i6519 = ~((-908) | iSerializer13);
            int i6610 = ~iSerializer13;
            int i6611 = (i6610 & iResolveOpacity4) | (i6610 ^ iResolveOpacity4);
            int i6612 = ~((i6611 & 907) | (i6611 ^ 907));
            int i6613 = -(-(((i6519 & i6612) | (i6519 ^ i6612)) * (-406)));
            int i6614 = (i6518 & i6613) + (i6613 | i6518);
            int i6615 = ~iSerializer13;
            int i6616 = (-908) | i6615;
            int i6617 = (i6614 - (~((~((i6616 & iResolveOpacity4) | (i6616 ^ iResolveOpacity4))) * (-406)))) - 1;
            int i6618 = ~iResolveOpacity4;
            int i6619 = ~((i6618 & iSerializer13) | (i6618 ^ iSerializer13));
            int i6710 = ~((i6615 ^ 907) | (i6615 & 907));
            int i6711 = -(-(((i6619 & i6710) | (i6619 ^ i6710)) * 406));
            Object[] objArr1516 = new Object[1];
            b(i6516, (i6617 ^ i6711) + ((i6711 & i6617) << 1), (char) ((-2) - (~(-TextUtils.lastIndexOf("", '0', 0, 0)))), objArr1516);
            String str812 = (String) objArr1516[0];
            int i6712 = -(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
            int i6713 = (i6712 & 6) + (i6712 | 6);
            int i6714 = -(ViewConfiguration.getTapTimeout() >> 16);
            Object[] objArr1517 = new Object[1];
            b(i6713, (i6714 & 852) + (i6714 | 852), (char) (0 - (~(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))))), objArr1517);
            String str813 = (String) objArr1517[0];
            Object[] objArr1518 = new Object[1];
            b(KeyEvent.keyCodeFromString("") + 8, 1081 - View.MeasureSpec.getSize(0), (char) (28282 - (ViewConfiguration.getScrollBarSize() >> 8)), objArr1518);
            String str814 = (String) objArr1518[0];
            int i6715 = 11 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i6716 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            Object[] objArr1519 = new Object[1];
            b(i6715, ((i6716 | 865) << 1) - (i6716 ^ 865), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 31080), objArr1519);
            String str815 = (String) objArr1519[0];
            int pressedStateDuration3 = (ViewConfiguration.getPressedStateDuration() >> 16) + 14;
            int i6717 = -((byte) KeyEvent.getModifierMetaStateMask());
            int i6718 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
            Object[] objArr1610 = new Object[1];
            b(pressedStateDuration3, (i6717 ^ 876) + ((i6717 & 876) << 1), (char) ((i6718 & 54523) + (i6718 | 54523)), objArr1610);
            String[] strArr313 = {str811, str812, str813, str814, str815, (String) objArr1610[0]};
            int iResolveOpacity5 = Drawable.resolveOpacity(0, 0);
            Object[] objArr1611 = new Object[1];
            b((iResolveOpacity5 ^ 20) + ((iResolveOpacity5 & 20) << 1), 1089 - (ViewConfiguration.getTouchSlop() >> 8), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr1611);
            String str816 = (String) objArr1611[0];
            Object[] objArr1612 = new Object[1];
            b(KeyEvent.normalizeMetaState(0) + 19, 1109 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) Color.alpha(0), objArr1612);
            String str817 = (String) objArr1612[0];
            int i6719 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i6810 = (i6719 ^ 31) + ((i6719 & 31) << 1);
            int iKeyCodeFromString6 = KeyEvent.keyCodeFromString("") + 1128;
            int i6811 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            Object[] objArr1613 = new Object[1];
            b(i6810, iKeyCodeFromString6, (char) ((i6811 & 28987) + (i6811 | 28987)), objArr1613);
            String str818 = (String) objArr1613[0];
            int i6812 = -(-(ViewConfiguration.getPressedStateDuration() >> 16));
            int i6813 = -Drawable.resolveOpacity(0, 0);
            Object[] objArr1614 = new Object[1];
            b(((i6812 | 26) << 1) - (i6812 ^ 26), (i6813 ^ 1159) + ((i6813 & 1159) << 1), (char) (ViewConfiguration.getTapTimeout() >> 16), objArr1614);
            String str819 = (String) objArr1614[0];
            int offsetBefore3 = TextUtils.getOffsetBefore("", 0);
            Object[] objArr1615 = new Object[1];
            b((offsetBefore3 ^ 23) + ((offsetBefore3 & 23) << 1), 1184 - (~(-(-(ViewConfiguration.getMaximumFlingVelocity() >> 16)))), (char) ((-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))) - 1), objArr1615);
            String str95 = (String) objArr1615[0];
            Object[] objArr1616 = new Object[1];
            b(33 - (~TextUtils.indexOf((CharSequence) "", '0', 0)), 1207 - (~(-KeyEvent.normalizeMetaState(0))), (char) ((-2) - ((-TextUtils.lastIndexOf("", '0')) ^ (-1))), objArr1616);
            String[] strArr314 = {str816, str817, str818, str819, str95, (String) objArr1616[0], str};
            int i6814 = -TextUtils.lastIndexOf("", '0', 0, 0);
            Object[] objArr1617 = new Object[1];
            b((i6814 ^ 12) + ((i6814 & 12) << 1), 1239 - (~(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (char) (19154 - (~(-KeyEvent.keyCodeFromString("")))), objArr1617);
            String str96 = (String) objArr1617[0];
            int i6815 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            Object[] objArr1618 = new Object[1];
            b(((i6815 | 8) << 1) - (i6815 ^ 8), KeyEvent.normalizeMetaState(0) + 820, (char) TextUtils.getCapsMode("", 0, 0), objArr1618);
            String[] strArr315 = {str96, (String) objArr1618[0]};
            Object[] objArr1619 = new Object[1];
            b(Color.alpha(0) + 30, 1253 - (~(-KeyEvent.normalizeMetaState(0))), (char) KeyEvent.normalizeMetaState(0), objArr1619);
            String str97 = (String) objArr1619[0];
            int i6816 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            int i6817 = (i6816 ^ 12) + ((i6816 & 12) << 1);
            int i6818 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
            Object[] objArr1710 = new Object[1];
            b(i6817, (i6818 & 1284) + (i6818 | 1284), (char) (KeyEvent.getMaxKeyCode() >> 16), objArr1710);
            String[] strArr316 = {str97, (String) objArr1710[0]};
            int i6819 = -TextUtils.indexOf("", "");
            int i6910 = (i6819 ^ 19) + ((i6819 & 19) << 1);
            int i6911 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            Object[] objArr1711 = new Object[1];
            b(i6910, ((i6911 | 1295) << 1) - (i6911 ^ 1295), (char) (10612 - (~(-Gravity.getAbsoluteGravity(0, 0)))), objArr1711);
            String str98 = (String) objArr1711[0];
            Object[] objArr1712 = new Object[1];
            b(4 - (~(-ExpandableListView.getPackedPositionType(0L))), 1313 - (~TextUtils.getOffsetBefore("", 0)), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), objArr1712);
            String[] strArr317 = {str98, (String) objArr1712[0]};
            int i6912 = -(-(Process.myPid() >> 22));
            int i6913 = ((i6912 | 19) << 1) - (i6912 ^ 19);
            int i6914 = -(-(ViewConfiguration.getTapTimeout() >> 16));
            Object[] objArr1713 = new Object[1];
            b(i6913, ((i6914 | 1319) << 1) - (i6914 ^ 1319), (char) Color.blue(0), objArr1713);
            String[] strArr318 = {(String) objArr1713[0]};
            int i6915 = -(-TextUtils.indexOf((CharSequence) "", '0'));
            Object[] objArr1714 = new Object[1];
            b((i6915 ^ 17) + ((i6915 & 17) << 1), 1338 - Color.alpha(0), (char) View.resolveSize(0, 0), objArr1714);
            String[] strArr319 = {(String) objArr1714[0]};
            int iAlpha4 = Color.alpha(0);
            int i6916 = ((iAlpha4 | 19) << 1) - (iAlpha4 ^ 19);
            int i6917 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int i6918 = (i6917 & 1354) + (i6917 | 1354);
            int i6919 = -(-ExpandableListView.getPackedPositionType(0L));
            Object[] objArr1715 = new Object[1];
            b(i6916, i6918, (char) ((35364 ^ i6919) + ((i6919 & 35364) << 1)), objArr1715);
            String[] strArr410 = {(String) objArr1715[0]};
            int i7010 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int i7011 = (i7010 * (-1529)) - 13752;
            int i7012 = ~i7010;
            int i7013 = (i7012 ^ (-19)) | (i7012 & (-19));
            int i7014 = ~((i7013 & i31) | (i7013 ^ i31));
            int i7015 = (i7012 ^ 18) | (i7012 & 18);
            int i7016 = ~((i7015 & i) | (i7015 ^ i));
            int i7017 = (i7014 & i7016) | (i7014 ^ i7016);
            int i7018 = ((-19) ^ i7010) | ((-19) & i7010);
            int i7019 = ~((i7018 & i) | (i7018 ^ i));
            int i7110 = ((i7017 & i7019) | (i7017 ^ i7019)) * 765;
            int i7111 = ((((i7011 | i7110) << 1) - (i7011 ^ i7110)) - (~(-(-(((~((~i7010) | (-19))) | (~((i7012 ^ i31) | (i7012 & i31)))) * 1530))))) - 1;
            int i7112 = ~((i7012 ^ i) | (i7012 & i));
            int i7113 = ((-19) ^ i31) | ((-19) & i31);
            int i7114 = ~((i7010 & i7113) | (i7113 ^ i7010));
            int i7115 = -(-(((i7114 & i7112) | (i7112 ^ i7114)) * 765));
            Object[] objArr1716 = new Object[1];
            b((i7111 ^ i7115) + ((i7115 & i7111) << 1), 1372 - (~(-(-TextUtils.getOffsetBefore("", 0)))), (char) Color.blue(0), objArr1716);
            String[] strArr411 = {(String) objArr1716[0]};
            int i7116 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23;
            int i7117 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
            Object[] objArr1717 = new Object[1];
            b(i7116, (i7117 & 1391) + (i7117 | 1391), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), objArr1717);
            String[] strArr412 = {(String) objArr1717[0]};
            int i7118 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int i7119 = ((i7118 | 21) << 1) - (i7118 ^ 21);
            int bitsPerPixel3 = ImageFormat.getBitsPerPixel(0) + 1416;
            int i7210 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            Object[] objArr1718 = new Object[1];
            b(i7119, bitsPerPixel3, (char) ((36976 & i7210) + (i7210 | 36976)), objArr1718);
            String[] strArr413 = {(String) objArr1718[0]};
            int i7211 = -(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
            Object[] objArr1719 = new Object[1];
            b((i7211 ^ 24) + ((i7211 & 24) << 1), 1436 - View.combineMeasuredStates(0, 0), (char) ((-2) - (~(-TextUtils.lastIndexOf("", '0')))), objArr1719);
            String str99 = str;
            String[] strArr414 = {(String) objArr1719[0], str99};
            int i7212 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            int i7213 = (i7212 ^ 29) + ((i7212 & 29) << 1);
            int i7214 = -(-(ViewConfiguration.getWindowTouchSlop() >> 8));
            Object[] objArr1812 = new Object[1];
            b(i7213, (i7214 ^ 1460) + ((i7214 & 1460) << 1), (char) TextUtils.indexOf("", "", 0), objArr1812);
            String[] strArr415 = {(String) objArr1812[0], str99};
            int i7215 = -(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
            int i7216 = (i7215 & 27) + (i7215 | 27);
            int i7217 = -(-Process.getGidForName(""));
            Object[] objArr1813 = new Object[1];
            b(i7216, (i7217 & 1489) + (i7217 | 1489), (char) (27370 - (~TextUtils.indexOf("", "", 0, 0))), objArr1813);
            String[] strArr416 = {(String) objArr1813[0], str99};
            int bitsPerPixel4 = ImageFormat.getBitsPerPixel(0);
            int i7218 = (bitsPerPixel4 ^ 32) + ((bitsPerPixel4 & 32) << 1);
            int iKeyCodeFromString7 = KeyEvent.keyCodeFromString("");
            int i7219 = (iKeyCodeFromString7 & 1515) + (iKeyCodeFromString7 | 1515);
            int iIndexOf15 = TextUtils.indexOf((CharSequence) "", '0', 0);
            int i7310 = ~iIndexOf15;
            int i7311 = ~((i7310 & i31) | (i7310 ^ i31) | 1);
            int i7312 = (iIndexOf15 ^ 1) | (iIndexOf15 & 1);
            int i7313 = ~((i7312 & i) | (i7312 ^ i));
            int i7314 = ((iIndexOf15 * 303) - 301) + (((i7311 & i7313) | (i7311 ^ i7313)) * (-302));
            int i7315 = ~iIndexOf15;
            int i7316 = (i7315 & 1) | (i7315 ^ 1);
            int i7317 = -(-((~((i7316 & i) | (i7316 ^ i))) * (-604)));
            int i7318 = ((i7314 | i7317) << 1) - (i7314 ^ i7317);
            int i7319 = -(-(((~((-2) | iIndexOf15)) | (~(i | 1))) * 302));
            Object[] objArr1814 = new Object[1];
            b(i7218, i7219, (char) (((i7318 | i7319) << 1) - (i7319 ^ i7318)), objArr1814);
            String[] strArr417 = {(String) objArr1814[0], str99};
            int i7412 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
            c2 = 0;
            Object[] objArr1815 = new Object[1];
            b((i7412 & 27) + (i7412 | 27), 1545 - (~(-Color.blue(0))), (char) TextUtils.getTrimmedLength(""), objArr1815);
            String[] strArr418 = {(String) objArr1815[0], str99};
            int i7413 = 30 - (~(-MotionEvent.axisFromString("")));
            int i7414 = 1572 - (~(-Color.argb(0, 0, 0, 0)));
            int i7415 = -TextUtils.indexOf("", "", 0);
            Object[] objArr1816 = new Object[1];
            b(i7413, i7414, (char) ((36450 & i7415) + (i7415 | 36450)), objArr1816);
            strArr5 = new String[][]{strArr220, strArr221, strArr222, strArr223, strArr310, strArr311, strArr312, strArr313, strArr314, strArr315, strArr316, strArr317, strArr318, strArr319, strArr410, strArr411, strArr412, strArr413, strArr414, strArr415, strArr416, strArr417, strArr418, new String[]{(String) objArr1816[0], str99}};
            int i7416 = -View.combineMeasuredStates(0, 0);
            int i7417 = (i7416 ^ 1) + ((i7416 & 1) << 1);
            int i7418 = -(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
            Object[] objArr1817 = new Object[1];
            b(i7417, (i7418 & 1605) + (i7418 | 1605), (char) View.resolveSize(0, 0), objArr1817);
            sb = new StringBuilder((String) objArr1817[0]);
            i34 = i;
            i35 = 0;
            i36 = 0;
            while (i35 < 24) {
                String[] strArr419 = strArr5[i35];
                Object[] objArr1818 = {strArr419[c2]};
                objRemoteActionCompatParcelizer9 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1468326312);
                if (objRemoteActionCompatParcelizer9 == null) {
                    char tapTimeout5 = (char) (58126 - (ViewConfiguration.getTapTimeout() >> 16));
                    int doubleTapTimeout5 = 947 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int packedPositionChild8 = 26 - ExpandableListView.getPackedPositionChild(0L);
                    byte b415 = (byte) ($$b & 1);
                    byte b416 = b415;
                    Object[] objArr1819 = new Object[1];
                    a(b415, b416, (byte) (b416 + 1), objArr1819);
                    objRemoteActionCompatParcelizer9 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(tapTimeout5, doubleTapTimeout5, packedPositionChild8, 2024488889, false, (String) objArr1819[0], new Class[]{String.class});
                }
                str5 = (String) ((Method) objRemoteActionCompatParcelizer9).invoke(null, objArr1818);
                String[] strArr52 = (String[]) Arrays.copyOfRange(strArr419, 1, strArr419.length);
                if (str5 == null) {
                }
                i35 = ((i35 | 1) << 1) - (i35 ^ 1);
                strArr5 = strArr5;
                i33 = i33;
                c2 = 0;
            }
            int i7610 = i33;
            Object[] objArr192 = new Object[1];
            b((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1608 - TextUtils.lastIndexOf("", '0', 0), (char) ((-16712877) - (~(-Color.rgb(0, 0, 0)))), objArr192);
            sb.append((String) objArr192[0]);
            if (i36 > 2) {
                int i7611 = IconCompatParcelizer + 5;
                read = i7611 % Fields.SpotShadowColor;
                int i7612 = i7611 % 2;
                i37 = 1;
                c3 = 0;
                String[] strArr53 = {sb.toString()};
                ((int[]) objArr2[0])[0] = i34;
                objArr2 = new Object[]{new int[1], strArr53};
            } else {
                c3 = 0;
                i37 = 1;
                objArr2 = new Object[]{new int[]{i}, new String[0]};
            }
            int[] iArr3 = (int[]) objArr2[c3];
            int i7613 = read;
            int i7614 = ((i7613 | 103) << i37) - (i7613 ^ 103);
            IconCompatParcelizer = i7614 % Fields.SpotShadowColor;
            int i7615 = i7614 % 2;
            int i7616 = iArr3[0];
            int i7617 = ((~i7610) & i) | (i7610 & i31);
            int i7710 = -i7617;
            int i7711 = ((i7617 & i7710) | (i7617 ^ i7710)) >> 31;
            int i7712 = i7616 & (~i7711);
            int i7713 = i7610 & i7711;
            i33 = (i7712 & i7713) | (i7712 ^ i7713);
            i38 = 1;
            strArr6 = (String[]) objArr2[1];
            i39 = 0;
            int i35117 = -Color.green(i39);
            int i35118 = (i35117 ^ 16) + ((i35117 & 16) << i38);
            int iResolveSize6 = View.resolveSize(i39, i39);
            Object[] objArr8111 = new Object[i38];
            b(i35118, ((iResolveSize6 | 891) << i38) - (iResolveSize6 ^ 891), (char) KeyEvent.keyCodeFromString(""), objArr8111);
            Object[] objArr8112 = {(String) objArr8111[i39]};
            objRemoteActionCompatParcelizer10 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1468326312);
            if (objRemoteActionCompatParcelizer10 == null) {
                char c116 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 58125);
                int capsMode6 = TextUtils.getCapsMode("", 0, 0) + 947;
                int iNormalizeMetaState5 = KeyEvent.normalizeMetaState(0) + 27;
                byte b3113 = (byte) ($$b & 1);
                byte b3114 = b3113;
                Object[] objArr8113 = new Object[1];
                a(b3113, b3114, (byte) (b3114 + 1), objArr8113);
                objRemoteActionCompatParcelizer10 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c116, capsMode6, iNormalizeMetaState5, 2024488889, false, (String) objArr8113[0], new Class[]{String.class});
            }
            objInvoke2 = ((Method) objRemoteActionCompatParcelizer10).invoke(null, objArr8112);
            if (objInvoke2 == null) {
                i40 = 0;
            } else {
                Object[] objArr8114 = {objInvoke2, 42};
                objRemoteActionCompatParcelizer11 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-998984536);
                if (objRemoteActionCompatParcelizer11 == null) {
                    char cIndexOf4 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
                    int longPressTimeout11 = (ViewConfiguration.getLongPressTimeout() >> 16) + 1481;
                    int maximumDrawingCacheSize6 = 31 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    byte b3115 = (byte) 0;
                    byte b417 = (byte) (b3115 + 1);
                    Object[] objArr8115 = new Object[1];
                    a(b3115, b417, (byte) (-b417), objArr8115);
                    objRemoteActionCompatParcelizer11 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cIndexOf4, longPressTimeout11, maximumDrawingCacheSize6, 346330441, false, (String) objArr8115[0], new Class[]{String.class, Integer.TYPE});
                }
                long jLongValue115 = ((Long) ((Method) objRemoteActionCompatParcelizer11).invoke(null, objArr8114)).longValue();
                int i35119 = IconCompatParcelizer;
                int i351110 = (i35119 & 37) + (i35119 | 37);
                read = i351110 % Fields.SpotShadowColor;
                int i351111 = i351110 % 2;
                long j8114 = 914880113;
                long j8115 = 306;
                long j8116 = ((long) 610) + (j8115 * j8114) + (j8115 * jLongValue115);
                long j8117 = 305;
                long jFreeMemory6 = (int) Runtime.getRuntime().freeMemory();
                long j912 = j8116 + ((((j8114 | jLongValue115) ^ j21) | ((j8114 | jFreeMemory6) ^ j21)) * j8117) + (j8117 * ((((jFreeMemory6 ^ j21) | j8114) ^ j21) | (jLongValue115 ^ j21))) + ((long) (-2049105141));
                int iFreeMemory5 = (int) Runtime.getRuntime().freeMemory();
                int i351112 = ((int) (j912 >> 32)) & (745434130 + (((~(1427572846 | iFreeMemory5)) | (-9653565)) * (-465)) + ((1427572846 | (~((-9653565) | iFreeMemory5))) * 930) + ((iFreeMemory5 | (-8406289)) * 465));
                int iMyTid6 = Process.myTid();
                int i351113 = ~iMyTid6;
                int i3612 = ((int) j912) & ((-1687905466) + (((~((-887992997) | i351113)) | 1969747889) * (-90)) + (((~((-887992997) | iMyTid6)) | (-1978660790)) * (-45)) + (((~(iMyTid6 | (-1969747890))) | (-887992997) | (~(i351113 | 1969747889))) * 45));
                i40 = (i351112 & i3612) | (i351112 ^ i3612);
            }
            if (i40 != 1986687685) {
                i41 = i31;
                strArr7 = strArr6;
            } else {
                i41 = i31;
                strArr7 = strArr6;
            }
            int i461110 = 12 - (~(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24)));
            int i461111 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            int iSerializer14 = TextInputBigV2Kt$MainText$1$1$1.serializer();
            int i461112 = (i461111 * 829) + 1617379;
            int i461113 = ~i461111;
            int i461114 = ~((i461113 & (-1952)) | (i461113 ^ (-1952)));
            int i461115 = ~iSerializer14;
            int i461116 = (i461115 ^ i461111) | (i461115 & i461111);
            int i461117 = ~((i461116 & 1951) | (i461116 ^ 1951));
            int i461118 = ((i461114 & i461117) | (i461114 ^ i461117)) * (-828);
            int i461119 = (i461112 & i461118) + (i461112 | i461118);
            int i471110 = -(-((i461115 | i461111 | 1951) * (-828)));
            int i471111 = (i461119 & i471110) + (i471110 | i461119);
            int i471112 = (~((i461111 & 1951) | (i461111 ^ 1951))) * 828;
            Object[] objArr111110 = new Object[1];
            b(i461110, (i471111 ^ i471112) + ((i471112 & i471111) << 1), (char) TextUtils.getOffsetAfter("", 0), objArr111110);
            String str5116 = (String) objArr111110[0];
            int i471113 = 4 - (~ExpandableListView.getPackedPositionGroup(0L));
            int iRgb4 = Color.rgb(0, 0, 0);
            int i471114 = iRgb4 * (-115);
            int i471115 = (i471114 & (-1929605815)) + (i471114 | (-1929605815));
            int i471116 = ~i;
            int i471117 = (i471116 ^ iRgb4) | (i471116 & iRgb4);
            int i471118 = -(-((~((i471117 & 16779181) | (i471117 ^ 16779181))) * (-116)));
            int i471119 = ((((i471115 | i471118) << 1) - (i471118 ^ i471115)) - (~(-(-((iRgb4 | i) * 116))))) - 1;
            int i481110 = ~iRgb4;
            int i481111 = ~((i481110 & (-16779182)) | (i481110 ^ (-16779182)));
            int i481112 = ~(((-16779182) & i) | ((-16779182) ^ i));
            int i481113 = ((i481111 & i481112) | (i481111 ^ i481112)) * 116;
            Object[] objArr111111 = new Object[1];
            b(i471113, ((i471119 | i481113) << 1) - (i481113 ^ i471119), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr111111);
            String[] strArr2110 = {str5116, (String) objArr111111[0]};
            int threadPriority4 = Process.getThreadPriority(0);
            Object[] objArr111112 = new Object[1];
            b(14 - (~(-(((threadPriority4 & 20) + (threadPriority4 | 20)) >> 6))), 1970 - (~(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr111112);
            String str5117 = (String) objArr111112[0];
            int i481114 = 17 - (~(-TextUtils.indexOf((CharSequence) "", '0', 0, 0)));
            int i481115 = 1983 - (~(-((byte) KeyEvent.getModifierMetaStateMask())));
            int i481116 = -ExpandableListView.getPackedPositionType(0L);
            Object[] objArr111113 = new Object[1];
            b(i481114, i481115, (char) (((i481116 | 40600) << 1) - (i481116 ^ 40600)), objArr111113);
            String str5118 = (String) objArr111113[0];
            int jumpTapTimeout6 = 14 - (ViewConfiguration.getJumpTapTimeout() >> 16);
            int i481117 = 2003 - (~(-Color.red(0)));
            int i481118 = -(-Gravity.getAbsoluteGravity(0, 0));
            Object[] objArr111114 = new Object[1];
            b(jumpTapTimeout6, i481117, (char) ((i481118 ^ 48304) + ((i481118 & 48304) << 1)), objArr111114);
            String[] strArr2111 = {str5117, str5118, (String) objArr111114[0]};
            int i481119 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i491110 = ((i481119 | 21) << 1) - (i481119 ^ 21);
            int iIndexOf16 = TextUtils.indexOf("", "", 0);
            int iSerializer15 = TextInputBigV2Kt$MainText$1$1$1.serializer();
            int i491111 = iIndexOf16 * (-445);
            int i491112 = (i491111 ^ (-898010)) + ((i491111 & (-898010)) << 1);
            int i491113 = ~iIndexOf16;
            int i491114 = ~((i491113 ^ (-2019)) | (i491113 & (-2019)));
            int i491115 = ~((~iSerializer15) | (-2019));
            int i491116 = (i491112 - (~(((i491114 ^ i491115) | (i491114 & i491115)) * 446))) - 1;
            int i491117 = ~iIndexOf16;
            int i491118 = ~((i491117 & 2018) | (i491117 ^ 2018));
            int i491119 = ~(((-2019) ^ iIndexOf16) | (iIndexOf16 & (-2019)) | iSerializer15);
            int i50118 = -(-(((i491119 & i491118) | (i491118 ^ i491119)) * 446));
            Object[] objArr111115 = new Object[1];
            b(i491110, (i491116 ^ i50118) + ((i50118 & i491116) << 1) + ((~((i491113 ^ (-2019)) | (i491113 & (-2019)))) * 446), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr111115);
            String str5119 = (String) objArr111115[0];
            int i50119 = -(-(ViewConfiguration.getPressedStateDuration() >> 16));
            Object[] objArr111116 = new Object[1];
            b((i50119 ^ 10) + ((i50119 & 10) << 1), 2038 - (~(-(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))))), (char) (52603 - (~(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))), objArr111116);
            String[] strArr2112 = {str5119, (String) objArr111116[0]};
            int i501110 = 10 - (~Color.red(0));
            int i501111 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int i501112 = (i501111 ^ 2049) + ((i501111 & 2049) << 1);
            int keyRepeatDelay7 = ViewConfiguration.getKeyRepeatDelay() >> 16;
            Object[] objArr111117 = new Object[1];
            b(i501110, i501112, (char) ((keyRepeatDelay7 & 63588) + (keyRepeatDelay7 | 63588)), objArr111117);
            String str51110 = (String) objArr111117[0];
            int i501113 = -TextUtils.lastIndexOf("", '0', 0, 0);
            Object[] objArr111118 = new Object[1];
            b(((i501113 | 5) << 1) - (i501113 ^ 5), 587 - (ViewConfiguration.getTapTimeout() >> 16), (char) KeyEvent.getDeadChar(0, 0), objArr111118);
            String[] strArr2113 = {str51110, (String) objArr111118[0]};
            int i501114 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int i501115 = (i501114 & 28) + (i501114 | 28);
            int packedPositionChild9 = ExpandableListView.getPackedPositionChild(0L);
            Object[] objArr111119 = new Object[1];
            b(i501115, (packedPositionChild9 ^ 2061) + ((packedPositionChild9 & 2061) << 1), (char) KeyEvent.normalizeMetaState(0), objArr111119);
            String str51111 = (String) objArr111119[0];
            int i501116 = -(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
            c5 = 0;
            Object[] objArr12111 = new Object[1];
            b((i501116 & 9) + (i501116 | 9), ImageFormat.getBitsPerPixel(0) + 2040, (char) (52603 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), objArr12111);
            strArr8 = new String[][]{strArr2110, strArr2111, strArr2112, strArr2113, new String[]{str51111, (String) objArr12111[0]}};
            i42 = 0;
            i43 = -1;
            loop7: while (true) {
                if (i42 < 5) {
                    i44 = i;
                    break;
                }
                String[] strArr2114 = strArr8[i42];
                str7 = strArr2114[c5];
                strArr9 = (String[]) Arrays.copyOfRange(strArr2114, 1, strArr2114.length);
                length = strArr9.length;
                i48 = 0;
                while (i48 < length) {
                    String str51112 = strArr9[i48];
                    i43 = (i43 & 1) + (i43 | 1);
                    file4 = new File(str7);
                    if (file4.exists()) {
                        strArr10 = strArr8;
                        strArr11 = strArr9;
                        str8 = str7;
                    } else {
                        strArr10 = strArr8;
                        strArr11 = strArr9;
                        str8 = str7;
                    }
                    i48 = ((i48 ^ 68) + ((i48 & 68) << 1)) - 67;
                    strArr8 = strArr10;
                    strArr9 = strArr11;
                    str7 = str8;
                }
                i42++;
                c5 = 0;
            }
            int i52118 = ((~i33) & i) | (i33 & i41);
            int i52119 = -i52118;
            int i521110 = ((i52118 & i52119) | (i52118 ^ i52119)) >> 31;
            int i521111 = i44 & (~i521110);
            int i521112 = i33 & i521110;
            int i521113 = (i521112 & i521111) | (i521111 ^ i521112);
            int i521114 = 13 - (~(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
            int i521115 = -View.resolveSize(0, 0);
            int i521116 = (i521115 & 2088) + (i521115 | 2088);
            int i5314 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            Object[] objArr12112 = new Object[1];
            b(i521114, i521116, (char) ((i5314 ^ 58221) + ((i5314 & 58221) << 1)), objArr12112);
            String str51113 = (String) objArr12112[0];
            int i5315 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
            Object[] objArr12113 = new Object[1];
            b((i5315 ^ 8) + ((i5315 & 8) << 1), 2101 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (239 - KeyEvent.getDeadChar(0, 0)), objArr12113);
            String str6110 = (String) objArr12113[0];
            file3 = new File(str51113);
            if (file3.exists()) {
                i45 = i41;
                i46 = i;
            } else {
                i45 = i41;
                i46 = i;
            }
            int i551110 = ((~i521113) & i) | (i521113 & i45);
            int i551111 = -i551110;
            int i551112 = ((i551110 & i551111) | (i551110 ^ i551111)) >> 31;
            int i551113 = i46 & (~i551112);
            int i551114 = i521113 & i551112;
            int i551115 = (i551114 & i551113) | (i551113 ^ i551114);
            int i551116 = 45 - (~(-TextUtils.indexOf((CharSequence) "", '0', 0, 0)));
            int i551117 = 2108 - (~TextUtils.indexOf("", "", 0, 0));
            int i551118 = -TextUtils.getTrimmedLength("");
            Object[] objArr12114 = new Object[1];
            b(i551116, i551117, (char) (((i551118 | 45962) << 1) - (i551118 ^ 45962)), objArr12114);
            String str6111 = (String) objArr12114[0];
            int i551119 = IconCompatParcelizer;
            int i561110 = ((i551119 | 11) << 1) - (i551119 ^ 11);
            read = i561110 % Fields.SpotShadowColor;
            int i561111 = i561110 % 2;
            Object[] objArr12115 = {str6111};
            objRemoteActionCompatParcelizer12 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(971290740);
            if (objRemoteActionCompatParcelizer12 == null) {
                char offsetAfter6 = (char) TextUtils.getOffsetAfter("", 0);
                int i561112 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2644;
                int packedPositionGroup8 = 22 - ExpandableListView.getPackedPositionGroup(0L);
                byte b418 = (byte) ($$b & 1);
                byte b419 = b418;
                Object[] objArr12116 = new Object[1];
                a(b418, b419, (byte) (b419 + 1), objArr12116);
                objRemoteActionCompatParcelizer12 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(offsetAfter6, i561112, packedPositionGroup8, -382428779, false, (String) objArr12116[0], new Class[]{String.class});
            }
            long jLongValue116 = ((Long) ((Method) objRemoteActionCompatParcelizer12).invoke(null, objArr12115)).longValue();
            long j10112 = 1924612661;
            long j10113 = -575;
            long j10114 = (j10113 * j10112) + (j10113 * jLongValue116);
            long j10115 = 576;
            long j10116 = j10112 ^ j21;
            long j10117 = jLongValue116 ^ j21;
            long j116 = (j10116 | j10117) ^ j21;
            i28 = i45;
            long jElapsedRealtime10 = (int) SystemClock.elapsedRealtime();
            long j117 = j10114 + ((j116 | ((j10117 | jElapsedRealtime10) ^ j21)) * j10115) + ((((((jElapsedRealtime10 ^ j21) | j10117) | j10112) ^ j21) | ((jLongValue116 | j10116) ^ j21)) * j10115) + (j10115 * j116) + ((long) (-1988644673));
            int i561113 = ((int) (j117 >> 32)) & (872779416 + (((~((-1198785098) | i)) | 238441313) * (-366)) + (((~((-1094713353) | i)) | 134369568) * 366));
            int iMyPid7 = Process.myPid();
            int i561114 = (~((-1989266569) | iMyPid7)) | 847367304;
            int i561115 = ~((~iMyPid7) | 2010373581);
            int i561116 = ((int) j117) & (1688415237 + ((i561114 | i561115) * (-470)) + (((~(iMyPid7 | (-1141899265))) | i561115) * 470));
            int i561117 = ((i561113 & i561116) | (i561113 ^ i561116)) * 263;
            int i561118 = i ^ i551115;
            int i561119 = (i561118 | (-i561118)) >> 31;
            i25 = (i551115 & i561119) | (((i561117 & i28) | ((~i561117) & i)) & (~i561119));
            strArr4 = strArr7;
        } else {
            i28 = i10;
            strArr4 = null;
        }
        int[] iArr4 = new int[1];
        int i7714 = i ^ i25;
        int i7715 = -i7714;
        Object[] objArr193 = {new int[]{i25}, new int[]{i}, iArr4, strArr4};
        int i7716 = ((((~(i | 503316414)) | 138450048) * 449) - 1075229740) + ((138450048 | (~(i28 | 503316414))) * 449);
        int i7717 = -(-((((i7714 & i7715) | (i7714 ^ i7715)) >> 31) & 16));
        int i7718 = -(-((i7716 & i7717) + (i7716 | i7717)));
        int i7719 = (i3 & i7718) + (i3 | i7718);
        int i7810 = i7719 << 13;
        int i7811 = (i7810 & (~i7719)) | ((~i7810) & i7719);
        int i7812 = i7811 >>> 17;
        int i7813 = ((~i7811) & i7812) | ((~i7812) & i7811);
        int i7814 = i7813 << 5;
        iArr4[0] = ((~i7813) & i7814) | ((~i7814) & i7813);
        return objArr193;
    }
}
