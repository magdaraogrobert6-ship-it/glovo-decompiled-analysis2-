package o;

import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.huawei.hms.adapter.internal.BaseCode;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.riemann.location.common.utils.Constant;
import com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit;
import com.roadrunner.common.data.api.MapApiError$$ExternalSyntheticLambda1;
import com.roadrunner.database.dao.SessionDao_Impl$$ExternalSyntheticLambda1;
import dagger.Lazy;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.TuplesKt;
import okio.internal.ResourceFileSystem$$ExternalSyntheticLambda0;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
@getCardAtIndexlambda0
public final class r8lambda2tFXStZN_MXijoyymezhxf14xPY implements SemanticsInfo {
    private static final byte[] $$a = {118, -29, -86, -87};
    private static final int $$b = 25;
    private static char[] MediaBrowserCompatMediaItem;
    private static long MediaDescriptionCompat;
    private static int MediaMetadataCompat;
    private static final byte[] MediaSessionCompatQueueItem;
    private static final int PlaybackStateCompat;
    private static int RatingCompat;
    private final r8lambda3LykK_dh7npnNoSi5rY1HPXio9g IconCompatParcelizer;
    private final getAllSemanticsNodesToMap RemoteActionCompatParcelizer;
    private final Lazy read;
    private final accessgetOldDependencyp serializer;
    private final onViewDetachedFromWindowlambda1 write;

    private static String $$c(int i, int i2, short s) {
        int i3 = (s * 4) + 4;
        int i4 = i2 * 2;
        byte[] bArr = $$a;
        int i5 = (i * 4) + 98;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        int i7 = -1;
        if (bArr == null) {
            i5 += -i6;
            i3++;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i5;
            if (i7 == i6) {
                return new String(bArr2, 0);
            }
            i5 += -bArr[i3];
            i3++;
        }
    }

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public r8lambda2tFXStZN_MXijoyymezhxf14xPY(Lazy lazy, r8lambda3LykK_dh7npnNoSi5rY1HPXio9g r8lambda3lykk_dh7npnnosi5ry1hpxio9g, getAllSemanticsNodesToMap getallsemanticsnodestomap, accessgetOldDependencyp accessgetolddependencyp) {
        lazy.getClass();
        r8lambda3lykk_dh7npnnosi5ry1hpxio9g.getClass();
        getallsemanticsnodestomap.getClass();
        accessgetolddependencyp.getClass();
        this.read = lazy;
        this.IconCompatParcelizer = r8lambda3lykk_dh7npnnosi5ry1hpxio9g;
        this.RemoteActionCompatParcelizer = getallsemanticsnodestomap;
        this.serializer = accessgetolddependencyp;
        this.write = new isAdapterPositionOnScreen(new ResourceFileSystem$$ExternalSyntheticLambda0(19, this));
    }

    private static void b(char c, int i, int i2, Object[] objArr) throws Throwable {
        rememberNestedScrollInteropConnection remembernestedscrollinteropconnection = new rememberNestedScrollInteropConnection();
        long[] jArr = new long[i];
        remembernestedscrollinteropconnection.read = 0;
        while (remembernestedscrollinteropconnection.read < i) {
            int i3 = remembernestedscrollinteropconnection.read;
            try {
                Object[] objArr2 = {Integer.valueOf(MediaBrowserCompatMediaItem[i2 + i3])};
                Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1215525465);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (50817 - (android.view.KeyEvent.getMaxKeyCode() >> 16)), Process.getGidForName("") + 2088, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14, -1734126664, false, $$c(b, b2, b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i3), Long.valueOf(MediaDescriptionCompat), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-2040246764);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 197 - (Process.myPid() >> 22), 14 - TextUtils.lastIndexOf("", '0'), 1454665717, false, "c", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i3] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {remembernestedscrollinteropconnection, remembernestedscrollinteropconnection};
                Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(125004226);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 6915), 159 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.graphics.Color.alpha(0) + 17, -677165021, false, com.braze.Constants.BRAZE_PUSH_CONTENT_KEY, new Class[]{Object.class, Object.class});
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
            cArr[remembernestedscrollinteropconnection.read] = (char) jArr[remembernestedscrollinteropconnection.read];
            Object[] objArr5 = {remembernestedscrollinteropconnection, remembernestedscrollinteropconnection};
            Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(125004226);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (View.combineMeasuredStates(0, 0) + 6915), 159 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 17, -677165021, false, com.braze.Constants.BRAZE_PUSH_CONTENT_KEY, new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = o.r8lambda2tFXStZN_MXijoyymezhxf14xPY.MediaSessionCompatQueueItem
            int r8 = r8 + 97
            int r1 = r6 + 3
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            int r6 = r6 + 2
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            int r7 = r7 + 1
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2a:
            int r7 = r7 + r4
            int r7 = r7 + (-5)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambda2tFXStZN_MXijoyymezhxf14xPY.a(int, short, short, java.lang.Object[]):void");
    }

    static void IconCompatParcelizer() {
        char[] cArr = new char[2181];
        ByteBuffer.wrap("\u000eë%xYô\u008cZ Ö× \u000b®>\u0003R\u008b\u0086í½aÑÏ\u0004_8¶o8\u0083\u0091¶\u001aê\u008e\u001eä5ciÆ\u009cP°¸ç3\u001b\u009fN\u0001bl\u0096þÍWáÙ\u0014)H¡\u007f\n\u0093\u0098Æ\núg.ëE^yÐ¬8À²÷\f+\u0087_ïrc¦ÓÝXñª$.Xµ\u008f\u0005£\u0082×æ\np>ÝUO\u0089¢¼<Ð\u0091\u0007\u0003;noø\u0082U¶Æí*\u0001¸4/h\u0087\u009f\u000b³uçð\u001aXNÒe,\u0099¡Ì\u0011à\u009e\u0014ôKm\u007fË\u0092AÆÕý%\u0011ªD\u0019x\u0091¬áÃn÷Ú*]^\u00adu\"©\u0097Ü\u0019ði$æ[P\u008fÅ¢IÖ§\r7!\u009fT\u0010\u0088}¼ïÓM\u0007Â:1n¾\u0085\u0017¹\u0087íë\u0000n4õkE\u009fÈ²&æ°\u001d\u001d1\u0088eâ\u0098cÌÕã_\u0017¯J$~\u009c\u0095\u001bÉtýÿ\u0010tDÆ{K¯µÂ0ö\u0082-\u000fAwuü¨NÜÃó3\u0099¾¤³\u008f ó¬&\u0002\n\u008e}x¡ö\u0094[øÔ,¡\u0017${\u0096®\u0019\u0092ñÅ~)Ç\u001cB@Ì´¤\u009f/Ã\u00806\u001c\u001aøMt±ÆäEÈ5<¾g\u0016K\u009e¾mâãÕF9ÝlMP%\u0084®ï\u0004Ó\u0094\u0006{jë]N\u0081Äõ¶Ø2\f\u0091w\u001f[í\u008ebòò%C\tÏ}¿ <\u0094\u0098ÿ\u0016#à\u0016ezÕ\u00adZ\u0091*Å¡(\u0011\u001c\u009eGo«ý\u009emÂÂ5P\u00199M©°\u0006ä\u0094Ïu3åfJJÙ¾±á?Õ\u008b8\u0002l\u0092We»ïîEÒÉ\u0006¹i6]\u0082\u0080\u0005ôéß}\u0003Öv@Z-\u008eºñ\u0012%\u009c\b\u0011|å§n\u008bØþU\" \u0016ªy\u0014\u00ad\u0099\u0090lÄæ/P\u0013ÝG§ª\"\u009e¬Á\u00015\u009bÑ§ú4\u0086¸S\u0016\u007f\u009a\blÔâáO\u008dÀYµb0\u000e\u0082Û\rçå°j\\ÒiV5ÆÁ´ê;¶\u008bC\u0005oì8kÄÎ\u0091N½<I³\u0012\u0003>\u008cËd\u0097é RLÉ\u0019Y%1ñº\u009a\u0012¦\u0081so\u001fê(AôÑ\u0080¸\u00ad2y\u0098\u0002\b.çûw\u0087íPH|Ú\b¿Õ=á\u0093\u008a\u0005Vîcn\u000fÙØSä9°µ]\u0005i\u008a2zÞéëe·Ñ@Zl,8¡Å\u0012\u0091\u009eº`Fí\u0013]?ÒË¤\u0094) \u0098M\u0016\u0019\u0098\"uÎä\u009bJ§Üs±\u001c'(\u008eõ\u000e\u0081ûªsvÝ\u0003A/$û¨\u0084\u0019P\u0089}\u0019\töÒcþÍ\u008bAW:c¾\f\u001aØ\u0090åb±ïZ_fÔ2¦ß+ë¢´\b@\u009amw9éÂLîÞº³G%\u0013\u0080<\u0012Èÿ\u0095`¡ÄJV\u0016;\"¼\\³w \u000b¬Þ\u0002ò\u008e\u0085xYöl[\u0000ÕÔ ï$\u0083\u008fV\u001ajñ=aÑÌäB¸ÕL¡g/;\u009fÎ\u0011âøµ\u007fIÚ\u001c]0(Ä§\u009f\u0017³\u0098Fp\u001aü-GÁÝ\u0094M¨%|®\u0017\u0001+\u0096þ{\u0092ò¥JyÄ\r¶ =ô\u0091\u008f\u0001£çvb\nìÝIñÏ\u0085¿X4l\u0084\u0007\u000bÛûîx\u0082ÉUGi7=¼Ð\u000eä\u0083¿jSáfl:ÞÍSá&µ¨H\u0003\u001c\u00927uËü\u009eN²ÆF°\u0019=-\u008fÀ\u0002\u0094\u008c¯aC÷\u0016^*Ôþ¸\u0091*¥\u0087x\u001c\fô'\u007fûÌ\u008eA¢(vº\t\u0012Ý\u009cð\u0011\u0084ã_nsØ\u0006UÚ!îª\u0081\rU\u009bhw<ç×LëÛ¿³R#f°9\bÍ\u008fà\u007f´ôOMcË7»Ê;\u009e\u0088±\u0007E÷\u0018|,ÅÇC\u009b*¯¦B,\u0016\u009e)\u0010ýä\u0090h¤Ä\u007f_\u00135'¥ú\t\u008e\u0098¡quø\bKÜÂ÷U\u008b _¯r\u001f\u0006\u0094Ùgíë\u0080ETÐh´\u0003?×\u008aê\u0001¾ñQ~eÎ8]ÌÍà¢»4O\u0099b\u00106âÉj\u009dÔ°ZD(\u0018¦3\tÇ\u009f\u009as®ãAs\u0015Ä(Oü?\u0090·«\u0001\u007f\u008b\u0012{&ûùN\u008dÇ¡·t?\b\u008c#\u0003÷ó\u008ac^÷q_\u0005ÖÙ¥ì(\u0080\u009a[\u0014oê\u0002dÖÈé[½1Q´d\u00138\u0083Ó\u0013çèºoNÃa\\58É¶\u009c\u000f°\u0085Ko\u001fç2BÆÁ\u009a±\u00ad=A\u0087\u0014\u001d(\u0091Ãc\u0097îªX~×\u0012§%*ù\u0094\u008c\u001b ê{f\u000fÉ\"Tö3\u008aº]8q\u009c\u0004\u0012Øêói\u0087ÃZKn;\u0002ºÕ\né\u0087¼kPûkP?ÂÓ\u00adæ\"º¬M\u001ea\u00914aÈèãZ·ÕK¬\u001e$2\u0096Å\u0018\u0099î¬`@Ò\u001b\\/ÑÃ¼\u00966ª\u0082}\t\u0011ù$uøÁ\u0093E§5{¸\u000e\f\"\u0081õi\u0089þ\\RpÂ\u000bXß?ó±\u0086\u0006Z\u0088mz\u0001õÔNèÄ¼ªW<k\u0091>\u0001Òìåv¹íL]`Ð4«Ï)ã\u0099¶\u0013Jæ\u001de1ÕÄ_\u0098*¬¡G\u0011\u001b\u009c.oÂý\u0095u©Á|N\u0010$$·ÿ\u001b\u0093\u0091¦uzå\rH!Øõ±\u0088=\\\u0089w\u0002\u000b\u008cÞdòò\u0085^YÈm \u00005Ô\u009aï\u0004\u0083ìVxjÖ=@Ñ(å¼¸\u0012L\u009cg\u0014;çÎnâÀµWI;\u001d«0\rÄ\u009d\u009fw³ÿFI\u001aÀ.²Á:\u0095´¨\u001c|\u008e\u0017f+óþX\u0092Ò¦£y%\r\u0095 \u001fôí\u008fa£ÉvY\n2Þ¼ñ4\u0085\u0084X\u000elø\u0007vÛÄîJ\u00824Vºi\b\u0099¿²,Î \u001b\u000e7\u0082@t\u009cú©WÅß\u0011¢*(F\u0082\u0093\u001e¯ýøm\u0014À!N}Ø\u0089¥¢#þ\u0093\u000b\u001d'ôp}\u008cÊÙIõ9\u0001²Z\u001av\u0097\u0083aßïèD\u0004ÏQ@m)¹½Ò\u0015î\u0085;mWæ`@¼ÓÈ»å31\u0089J\ffþ³uÏá\u0018I4Ö@²\u009d$©\u0080Â\u0007\u001e÷+|GØ\u0090J¬'ø±\u0015\u001c!\u0092z~\u0096ð£}ÿÎ\bB$+p¹\u008d\u0017Ù\u0087òd\u000eö[[wÐ\u0083¤Ü,è\u009e\u0005\u0013Q\u009ejp\u0086úÓRïÜ; T'`\u0097½\u0014Éàâk>ÀKVg<³®Ì\u0003\u0018\u00885\u0000Aé\u009av¶ÕÃ]\u001f#+¦D\u0018\u0090\u0095\u00adaùê\u0012G.Ùz¿\u0097/£¼ü\u000b\b\u0083%iqù\u008aT¦Üò«\u000f)[\u0083t\u0015\u0080úÝvéÄ\u0002O^?j¬\u00874Ó\u0093ì\u001c8èUdaÖº[Ö,â¨?\u0005K\u0094d}°íÍA\u0019Ò2AN-\u009a¶·\u0012Ã\u0098\u001ca(çEM\u0091Ð\u00ad¸Æ*\u0012\u0084/\u0010{ü\u0094r ÂýQ\tÁ%\u00ad~<\u008a\u0095§\u0019óë\ffXØuV\u0081%Ýªö\u001c\u0002\u0092_`kî\u0084zÐÊíC9/Uºn\u0014º\u009c×vãè<FHÓdº±0Í\u0089æ\u000f2åOq\u009bá´MÀÛ\u001cµ)%E\u0089\u009e\u001cªùÇi\u0013Å,Qx=\u0094\u00ad¡\u0001ý\u009a\u0016\u0001\"í\u007f\u007f\u008bÒ¤[ð*\f§Y\bu\u0096\u008exÚÿ÷Z\u0003Ì_¢h1\u0084\u009eÑ\u0010í\u009e\u0006fRâoN»ß×·à;<\u0086I\beà¾jÊÜçS3#O®\u0098<´\u0085Á\u0003\u001dé6eBÕ\u009fX«+Ç©\u0010\u0019,\u0094yd\u0095í®]úÐ\u0016¡#1\u007f¡\u0088\r¤\u0096ñu\rù&KrÆ\u008e¢Û<÷\u009b\u0000\u0011\\èil\u0085ËÞNêÀ\u0006®S=o\u0092¸\u0004Ôëá\u007f=ÖVPb ¾«Ë\u001bç\u00920eLï\u0099GµÎÎ@\u001a26½C\f\u009f\u0084¨vÄù\u0011C-Èy¢\u00925®\u009dû\r\u0017à u|á\u0089I¥Ûñ²\n$&\u008bs\u001c\u008föØhôÆ\u0001_]:i¬\u0082\u0002Þ\u009bÇ?ì¬\u0090 E\u008ei\u0002\u001eôÂz÷×\u009bXO-t¨\u0018\u001aÍ\u0095ñ}¦øJC\u007fÎ#@×(ü£ \fU\u0098yt.æÒO\u0087É«¦_6\u0004\u009a(\fÝæ\u0081o¶ÃZD\u000fÀ3®ç8\u008c\u0095°\u0010e÷\tg>ÂâH\u0096&»¶o\u001d\u0014\u008d8kíî\u0091`FÅjC\u001e&Ã¸÷\u0014\u009c\u009a@iué\u0019CÎËò»¦0K\u0080\u007f\u000f$ãÈdýà¡HVÂz´.9Ó\u008a\u0087\u0006¬øPu\u0005Å)JÝ<\u0082±¶\u0000[\u008e\u000f\u00004íØ|\u0099¿²,Î \u001b\u000e7\u0082@t\u009cú©WÅØ\u0011¬*(F\u008f\u0093\u0014¯ýøm\u0014À!N}Ü\u0089°¢\"þ\u008a\u000b\u0005'êps\u008cÖÙHõ!\u0001«Z\u0004v\u0099\u0083|ßîèD\u0004ÑQ^m&¹¢Ò\fî\u009b;wWç`B¼ÈÈ¯å51\u009dJ\u0018fç³nÏà\u0018D4Ã@¦\u009d%©\u0095Â\u0012\u001eö+sGØ\u0090P¬:ø¹\u0015\u001c!\u008ezc\u0096í£`ÿÎ\b^$5p¥\u008d\nÙ\u009bòy\u000eé[FwÔ\u0083½Ü3è\u0087\u0005\u000eQ\u009eji\u0086ãÓIïÅ;µT:`\u0089½\tÉåâ~>ÚKVg<³®Ì\u0003\u0018\u00895\u0000Aò\u009a\u007f¶ÌÃD\u001f6+»D\u0003\u0090\u0088\u00adzù÷\u0012F.Ìz¢\u00972£¡ü\u000e\b\u009d%rqä\u008aI¦Óò¶\u000f=[\u0098t\n\u0080çÝpéÜ\u0002N^#j¤\u0087 Ó\u008aì\u001d8õUeaÉºZÖ9â±?\u0003K\u008ad|°òÍC\u0019Î2@N-\u009a¸·\u0012Ã\u0084\u001ci(ü\bâ#q_ý\u008aS¦ßÑ)\r§8\nT\u0085\u0080ð»u×Ç\u0002H> i/\u0085\u0096°\u0013ì\u009d\u0018õ3~oÑ\u009aL¶©á;\u001d\u0092H\u0014dx\u0090ãËGçÍ\u0012;N²y\u0017\u0095\u008cÀ\u001cüt(ÿCU\u007fÅª*Æºñ\u001f-\u0095Yçtc ÀÛE÷»\"3^¤\u0089\u0018¥\u009eÑû\fb8ÉS[\u008f¾º4Ö\u0098\u0001\f=giñ\u0084\\°Îë#\u0007\u00ad2 n\u0093\u0099\u001fµiáä\u001cTHÛc%\u009f¨Ê\u0018æ\u0097\u0012áMlyÝ\u0094SÀÈû6\u0017¾B\u0010~\u0087ªéÅ{ñÖ,LX¥s+¯\u009dÚ\u0010ö`\"ï]Z\u0089Ì¤\\Ð³\u000b%'\u0088R\u0018\u008ewºàÕD\u0001Ô<;h£\u0083\u0000¿\u008cëâ\u0006r2âmM\u0099À´;à¸\u001b\b7\u0085cë\u009ejÊÑåV\u0011¦L(x\u0081\u0093\fÏvûì\u0016bBÒ}_©¼Ä-ð\u008a+\u000fGqsõ®]ÚÂõ !¥\\\u0002\u0088\u0092£\u0005ßm\u000bÿ&RRÍ\u008d)¹¯Ô\u0017\u0000\u0094<äWh\u0083Û¾Pê´\u0005/1\u0083l\r\u0098\u0083´òï\u007f\u001bÉ6Db¾\u009d;É\u0085ä\b\u0010r>·\u0015$i¨¼\u001a\u0090\u0094ç};ò\u000eJbÎ¶¬\u008d á\u00924\u001d\bõ_{³Â\u0086FÚÑ.¤\u0005+Y\u009b¬\u0015\u0080ü×w+Ã~AR1¦ºý\u0012Ñ\u0084$nxçOC£ÇöHÊ:\u001e±u\u001dI\u0094\u009cgðîÇD\u001bßo³B:\u0096\u008cí\u0004Áö\u0014rhé¿Y\u0093Þçº:3\u000e\u0089e\u000f¹á\u008c}àÐ7B\u000b/_¹²\u0014\u0086\u009aÝc1ù\u0004uXÎ¯J\u0083&×µ*\u001f~\u008fUl©ýüSÐß$©{$O\u0096¢\u001bö\u0097Íx!êtGHÒ\u009c¼ó:Ç\u0086\u001a\u0001näEy\u0099ÒìDÀ)\u0014¿k\u0016¿\u0084\u0092\u001dæû=q\u0011ÝdM¸\"\u008c·ã\u00117\u0081\nn^øµU\u0089ÅÝª0=\u0004©[\u0019¯\u0096\u0082nÖí-A\u0001ÓU¾¨4ü\u0089Ó\u0003'æzeNÕ¥Zù(Í¹ )t\u0086K\u001f\u009fýòyÆÅ\u001dNq,E¿\u0098\u0013ì\u0099Ãu\u0017åjI¾Ú\u0095Ié%=¾\u0010\u001ad\u0096»|\u008fîâ@6Ü\n°a\"µ\u008c\u0088\u001bÜô3f\u0007ÈZF®È\u0082ºÙ4-\u009d\u0000\u0019Tä«nÿÐÒ_&3zºQ\b¥\u0084øvÌþ#iwÇJ^\u009e:òµÉ\u0000\u001d\u008fp\u007fDø\u009bPïÂÃ¨\u0016%j\u0081A\u0013\u0095öèx<ó\u0013[gß»¨\u008e,â\u00879\u0012\rñ`x´Ê\u008bBß43°\u0006\u0017Z\u0087±\u001c\u0085øØu,Î\u0003MW=«²þ\u0002Ò\u0081)q}ýPJ¤Åø\u00adÏ?#\u0096v\u0018J\u0096¡bõêÈD\u001cÓp¿G/\u009b\u008fî\u0019Âó\u0019cmË@^\u00947è»?5\u0013\u0084f\u000bºû\u0091såÇ8O\f#`½·\r\u008b\u0083Þs2û\tO]Ç±·\u0084$Ø¼/\u001b\u0003\u008bV`ªø\u0099¿²,Î \u001b\f7\u009e@u\u009cå©IÅÆ\u0011\u00ad*(F\u0086\u0093\n¯üøs\u0014ß!S}Ý\u0089®¢#þ\u008d\u000b\u0019'ôpf\u008cÎÙIõ%\u0001·Z\u0005v\u008d\u0083aßóèF\u0004ÑQAm*¹¢Ò\bî\u0098;nWæ`D¼ÔÈ¡å*1\u009cJ\u0016fÿ³oÏú\u0018P4Â@¦\u009d%©\u0095Â\u0012\u001eö+tGØ\u0090J¬'ø±\u0015\u001c!\u0092zb\u0096î£`ÿÎ\bB$4p¹\u008d\nÙ\u0086òd\u000eô[@wÊ\u0083 Ü0è\u008b\u0005\u000eQ\u0080jn\u0086ãÓOïÙ;¡T'`\u0097½\u0014Éæâk>ÇKPg ³¯Ì\u001f\u0018\u008c5\u001fAó\u009a\u007f¶ÈÃY\u001f7+§D\u0004\u0090\u0090\u00ad{ù÷\u0012@.Òz¿\u0097/£¼ü\t\b\u0083%oqø\u008aK¦Çò·\u000f4[\u0082t\u000b\u0080çÝpéÄ\u0002O^?j¬\u0087;Ó\u0093ì\u001f8éUpa×º[Ö$â±?\u001bK\u0097d`°öÍ_\u0019Ï2\\N$\u009a£·\u000fÃ\u0098\u001co(çEW\u0091Ô\u00ad\u00adÆ+\u0012\u0087/\u0011{ç\u0094o ÃýM\tÔ%³~#\u008a\u008b§\u0004óã\ffXÄuT\u0081/Ýªö\u001c\u0002\u0092_ckî\u0084|ÐÍíW92Uºn\bº\u0087×wã÷<EHËd¤±8Í\u009cæ\u00122ãOd\u009bà´LÀÞ\u001cµ)%E\u0089\u009e\u0018ªùÇv\u0013Î,Jx\"\u0094°¡\u001fý\u008f\u0016\u001f\"ï\u007fc\u008bÌ¤Qð4\f¦Y\bu\u0091\u008exÚÿ÷Z\u0003Ì_¢h6\u0084\u009eÑ\fí\u0095\u0006sRÿoO»Ä×£à&<\u0098I\u0016eá¾jÊÀçP3?O¯\u0098?´\u0089Á\u0003\u001dó6{BÏ\u009fG«+Ç·\u0010\u0004,\u008bye\u0095ô®\\úÔ\u0016¾#0\u007f¾\u0088\u0007¤\u0082ñh\rþ&WrÇ\u008e§Û=÷\u009b\u0000\u000b\\âip\u0085ßÞOêÞ\u0006\u00adS#o\u0093¸\u001aÔêág=ÉVUb8¾ªË\u0004ç\u008d0hLï\u0099CµÑÎA\u001a,6¢C\b\u009f\u0098¨iÄæ\u0011F-Ôy»\u0092+®\u0085û\f\u0017â r|þ\u0089P¥Þñ®\n=&\u0094s\u0006\u008fïØiôÅ\u0001U]'i\u00ad\u0082\u0002Þ\u0091ë~\u0007ïP\u007flÓ¹VÕ5á¥:\bV\u0099cy¿éÈ@äÊ0¼M8\u0099\u009f²\u000fÎ\u009f\u001bk7ã@O\u009cÛ¨ªÅ'\u0011\u008e*\u001cFø\u0093t¯ÎøM\u0014# ¶}\u001e\u0089\u008a¢\u0000þò\u000b|'ÁpD\u008c*Ø¼õ\u0019\u0001\u0089Zdvò\u0083]ßÍë \u00047P¡m\u0011¹\u009cÒhîå;UWØc¬¼)È\u0099å\u00141áJmfÁ³QÏ!\u001b±4!@\u008c\u009d\u0016©õÂy\u001eÉ+^G9\u0093©¬\u0004ø\u009e\u0015}!íz@\u0096Ð£Aÿ1\u000b¼$\f".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2181);
        MediaBrowserCompatMediaItem = cArr;
        MediaDescriptionCompat = 6064046965778985501L;
    }

    static {
        byte[] bArr = new byte[927];
        System.arraycopy("KB ¹\u0012û\u0013\u0002ÿ\u0000ÏDý\u0004\nýÒ\u00189ô\n\u000bê#ô\u0007\r\u0003\u0014Þ\u0019\u001cã\u001e\u0002\u000eýý\u0012û\u0013\u0002ÿ\u0000ÏF\tÀ*+ÿ\u0006ö\rÛ.\bù\r\fú\u0014\b÷\u0004ó\u0018\u0001\u0010\rú\tý\u0012û\u0013\u0002ÿ\u0000ÏKö\u0018\u0001¿+\u0016\u0018\u0001æ$ú\b\f\nû\u0006\u0018Ü\u001cü\u001aðÒCú\u0012þÌ\u001a*þ\u0016æ\u0017\u0011\tõ\u000eú\u0007\u0012û\u0013\u0002ÿ\u0000Ï>\u0010ô\u0014ý\u0006ÿ\u0015À\u001a1\u0002\b\b\u000f\u000eõ\u0012û\u0013\u0002ÿ\u0000ÏMø\u0001\u0017¼$'\nú\u000b\u0004Ü6ô\u000e\u000b\u001cö\u000fØ1\u0002\u0003ë&\u0003ü\nþü\u001aðÒCú\u0012þÌ*&\u0003ü\nþ\u0012û\u0013\u0002ÿ\u0000ÏMø\u0001\u0017¼\"\u001f\u0019Ñ6ô\u000e\u000b\u0003\u0014Þ'ú\n\u0002\b\u0001\u0012à\u001d\u0014ò÷&ò\u0018öí\u0019\u0017ý\u0002\u0001\u0002\u0010ü\u001aðÒCú\u0012þÌ *\u000bö\u0007\u0003\u0012ð\u0010\u000eõï\u001c\n\u000bç\u0010\u0010\u000eõü\u001aðÒCú\u0012þÌ\u001c8ð\u0007\u0010\tú\u000b\u0004\u0012û\u0013\u0002ÿ\u0000ÏMø\u0001\u0017¼-\u0018\u0001\u0017Ñ1\u0004ý\b\u0003\u0013\u0002ô\u0018ú\u000b\u0004\u0003\u0014× \b\n\nþã$\b\u0003ì\u001e\u000eþ\u0012ù\u0003\u0014å \u000bó\nð\u001e\b\u0006\u0000\tú\týí!\b\u0005\u0002\u000f\u0012û\u0013\u0002ÿ\u0000ÏN÷\u0000\b\u0003\u0014¿\u001c8ýö\u0012û\u0002\u0006\u000fþì\"\u000f\u0006ç\u0018\u0001\u0017\u0003\u0014á\u0016\u0007\rÿ\u0004ñ$\tû\u0010ú\u000b\u0004Ý.\bÖ*\u0006\bý\u0012û\u0013\u0002ÿ\u0000Ï>\u0010ô\u0014ý\u0006ÿ\u0015À;\u0013ô\u001bï\u0006\u000fþÎ\u001b3ô\u001bï\u0006\u000fþø\u0013\u0001\u0002\u000fôï&ö\u0007\u000b\u0010\n\u0003\u0014Ü\u001f\u0019Þ\u0018\u0010ú\u0001\u0018Õ&\fú\u001d\u0012û\u0013\u0002ÿ\u0000ÏMø\u0001\u0017¼-\u0018\u0001\u0017².\u001d\u0001\u0017\u0007\u0002øó\"ú\u0003\u0003\u0014Þ'ú\u0006\u0003\u0014ë\u001a\u0005\u0003Û1\u0004\u000b\u0003\u0002\u0002\fæ\u001a\tý\u000f\u000b\u0004\u0003\u0014á\u0016\u0007\rÿ\u0004ñ$\tû\u0010ú\u000b\u0004Ý.\bÚ0\u0002\u000b\u0000\u0012û\u0013\u0002ÿ\u0000Ï>\u0010ô\u0014ý\u0006ÿ\u0015À'$ÿ\n\u000b×þ\u000eþ\u0012ù\u0012û\u0013\u0002ÿ\u0000ÏF\tÀ+#ô\u0007\u0007\u000eûô\u0017\u0003\u0016ú\u000b\u0004\u0010\týþ\u0003\u0014Ý(\u0004þî'ø\u0013\u0005æ\u001a\tý\u000f\u000b\u0004\u0012û\u0013\u0002ÿ\u0000ÏMø\u0001\u0017¼-\u0018\u0001\u0017ø\u0013\u0001\u0002\u000fôó\u001b\u0016ðá2ûô&ò\u0018ö\u0003\u0014Ö$\b\u0003ó\u001e\b\u0006ú\u0000\u0003\u0014ä\u0015\u0014\u0002\u0002\u0005Û$\u0016æ\u001b\u0016ð\u0012û\u0013\u0002ÿ\u0000ÏF\tÀ''\u0002ù\u0007\u0013\u0005\u0003\u0014Ø'\u0000ç.\bá\u0018\u0011ýÿ\u0019Ï1ú\u0006æ1\u0002\u0003ë&\u0003ü\nþü\u001aðÒL\u0004ú\bÇ:\u0011\u0004ú\u0017\u0002\u0005ø\u000e\u000b¿8\u0018\u0000\u0003\u0001ÿÐ\u00188\u0000\u0003\u0001ÿô\u0018\u0006\u0004\u0012ø\u000eú\u0007ü\u001aðÒCú\u0012þÌ&\u0018\r\u0000\u0003\u0016\u0003\u0014Þ\u0019\u001cØ\u001f\u0019Ï1ú\u0006ú\u0017\u0006Ú*û\u0006\u0018Ü\u001cø\u0004ø\u0013\u0001\u0002\u000fôó\u001b\u0016ð\u0003\u0014Ô#\u0014\bß'ú\u0006÷\u0014\u0003\u0014à\u001c\u0005\u0012÷\u0014Ó(\u0006\u000e\bø\u0011à\u001a\u0000\u0003\u0014\u0006\b\u0000ù\u0010\u0002\u0016ðí\u001d\u0014ò÷&ò\u0018ö\u0003\u0014á\u0016\u0007\rÿ\u0004ñ$\tû\u0010ú\u000b\u0004Ú*\u0006\bý\u0003\u0014Ò2ûô\u0017\u0014ü\u001aðÒCú\u0012þÌ%,ýú\b\u0012\b\u0004þô\u0010\u0010\u000eõ".getBytes("ISO-8859-1"), 0, bArr, 0, 927);
        MediaSessionCompatQueueItem = bArr;
        PlaybackStateCompat = 98;
        IconCompatParcelizer();
        RatingCompat = 0;
        MediaMetadataCompat = 1;
    }

    /* JADX WARN: Code duplicated, block: B:158:0x072c  */
    /* JADX WARN: Code duplicated, block: B:162:0x0734  */
    /* JADX WARN: Code duplicated, block: B:163:0x073a  */
    /* JADX WARN: Code duplicated, block: B:165:0x0755  */
    /* JADX WARN: Code duplicated, block: B:169:0x075d  */
    /* JADX WARN: Code duplicated, block: B:171:0x0763  */
    /* JADX WARN: Code duplicated, block: B:173:0x077e  */
    /* JADX WARN: Code duplicated, block: B:180:0x07a2  */
    /* JADX WARN: Code duplicated, block: B:187:0x07c6  */
    /* JADX WARN: Code duplicated, block: B:194:0x07d3  */
    /* JADX WARN: Code duplicated, block: B:281:0x07e3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final void RemoteActionCompatParcelizer(r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA r8lambda4iulmttpk1bccxnrohiqnfq1opa) throws Throwable {
        byte[] bArr;
        short s;
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        Object[] objArr4;
        Object[] objArr5;
        int i;
        int i2;
        int i3;
        r8lambda4eayLEkyCzRqunjxKNY3fxSMeyo r8lambda4eaylekyczrqunjxkny3fxsmeyo = new r8lambda4eayLEkyCzRqunjxKNY3fxSMeyo(this, r8lambda4iulmttpk1bccxnrohiqnfq1opa);
        try {
            byte[] bArr2 = MediaSessionCompatQueueItem;
            byte b = bArr2[4];
            Object[] objArr6 = new Object[1];
            a(b, (short) (b | 173), bArr2[9], objArr6);
            Class<?> cls = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            a(bArr2[35], (short) 714, bArr2[14], objArr7);
            String str = (String) objArr7[0];
            short s2 = (short) 176;
            Object[] objArr8 = new Object[1];
            a(bArr2[26], s2, bArr2[46], objArr8);
            char cIntValue = (char) ((Integer) cls.getMethod(str, Class.forName((String) objArr8[0])).invoke(null, "")).intValue();
            short s3 = (short) 624;
            Object[] objArr9 = new Object[1];
            a(bArr2[35], s3, bArr2[9], objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            short s4 = (short) 640;
            Object[] objArr10 = new Object[1];
            a(bArr2[68], s4, bArr2[115], objArr10);
            int iIntValue = 405 - ((Integer) cls2.getMethod((String) objArr10[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, 0, 0, 0)).intValue();
            Object[] objArr11 = new Object[1];
            a(bArr2[434], (short) 285, bArr2[9], objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            byte b2 = bArr2[6];
            int i4 = PlaybackStateCompat;
            Object[] objArr12 = new Object[1];
            a(b2, (short) (i4 | 408), bArr2[51], objArr12);
            int i5 = (((Long) cls3.getMethod((String) objArr12[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls3.getMethod((String) objArr12[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 1775;
            Object[] objArr13 = new Object[1];
            b(cIntValue, iIntValue, i5, objArr13);
            String str2 = (String) objArr13[0];
            Object[] objArr14 = {Float.valueOf(0.0f), Float.valueOf(0.0f)};
            Object[] objArr15 = new Object[1];
            a(bArr2[28], (short) 551, bArr2[9], objArr15);
            Class<?> cls4 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            a(bArr2[27], (short) 573, bArr2[21], objArr16);
            char c = (char) (((Float) cls4.getMethod((String) objArr16[0], Float.TYPE, Float.TYPE).invoke(null, objArr14)).floatValue() > 0.0f ? 1 : (((Float) cls4.getMethod((String) objArr16[0], Float.TYPE, Float.TYPE).invoke(null, objArr14)).floatValue() == 0.0f ? 0 : -1));
            Object[] objArr17 = new Object[1];
            a(bArr2[33], (short) (i4 | androidx.compose.ui.graphics.Fields.RotationX), bArr2[9], objArr17);
            Class<?> cls5 = Class.forName((String) objArr17[0]);
            Object[] objArr18 = new Object[1];
            a(bArr2[6], (short) (i4 | 772), bArr2[51], objArr18);
            int i6 = -((Integer) cls5.getMethod((String) objArr18[0], Long.TYPE).invoke(null, 0L)).intValue();
            Object[] objArr19 = {0, 0, 0};
            Object[] objArr20 = new Object[1];
            a(bArr2[35], s3, bArr2[9], objArr20);
            Class<?> cls6 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            a(bArr2[68], s4, bArr2[115], objArr21);
            Object[] objArr22 = new Object[1];
            b(c, i6, ((Integer) cls6.getMethod((String) objArr21[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr19)).intValue() + 142, objArr22);
            try {
                Object[] objArr23 = {(String) objArr22[0]};
                Object[] objArr24 = new Object[1];
                a(bArr2[26], s2, bArr2[46], objArr24);
                Class<?> cls7 = Class.forName((String) objArr24[0]);
                byte b3 = bArr2[7];
                Object[] objArr25 = new Object[1];
                a(b3, (short) (b3 | 232), bArr2[4], objArr25);
                String str3 = (String) objArr25[0];
                Object[] objArr26 = new Object[1];
                a(bArr2[26], s2, bArr2[46], objArr26);
                Object[] objArr27 = (Object[]) cls7.getMethod(str3, Class.forName((String) objArr26[0])).invoke(str2, objArr23);
                int[] iArr = new int[objArr27.length];
                for (int i7 = 0; i7 < objArr27.length; i7++) {
                    try {
                        Object[] objArr28 = {objArr27[i7]};
                        byte[] bArr3 = MediaSessionCompatQueueItem;
                        byte b4 = bArr3[35];
                        Object[] objArr29 = new Object[1];
                        a(b4, (short) (b4 | 224), bArr3[46], objArr29);
                        Class<?> cls8 = Class.forName((String) objArr29[0]);
                        byte b5 = bArr3[13];
                        Object[] objArr30 = new Object[1];
                        a(b5, (short) (b5 | 250), bArr3[135], objArr30);
                        String str4 = (String) objArr30[0];
                        Object[] objArr31 = new Object[1];
                        a(bArr3[26], s2, bArr3[46], objArr31);
                        Object objInvoke = cls8.getMethod(str4, Class.forName((String) objArr31[0])).invoke(null, objArr28);
                        try {
                            byte b6 = bArr3[35];
                            Object[] objArr32 = new Object[1];
                            a(b6, (short) (b6 | 224), bArr3[46], objArr32);
                            Class<?> cls9 = Class.forName((String) objArr32[0]);
                            Object[] objArr33 = new Object[1];
                            a(bArr3[356], (short) 260, bArr3[56], objArr33);
                            iArr[i7] = ((Integer) cls9.getMethod((String) objArr33[0], null).invoke(objInvoke, null)).intValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                int i8 = 0;
                while (true) {
                    int i9 = i8 + 1;
                    try {
                        switch (r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(iArr[i8])) {
                            case -38:
                                i8 = 110;
                                break;
                            case -37:
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(24);
                                if (r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer != 49) {
                                    i8 = 1;
                                } else {
                                    i9 = 80;
                                    i8 = i9;
                                }
                                break;
                            case -36:
                                i8 = 68;
                                break;
                            case -35:
                                i8 = 109;
                                break;
                            case -34:
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(20);
                                if (r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer == 0) {
                                    i9 = ActivityIdentificationData.RUNNING;
                                }
                                i8 = i9;
                                break;
                            case -33:
                                try {
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(15);
                                    if (r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer == 0) {
                                        i9 = 97;
                                    }
                                    i8 = i9;
                                } catch (Throwable th3) {
                                    th = th3;
                                    bArr = MediaSessionCompatQueueItem;
                                    s = (short) 267;
                                    objArr = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr);
                                    if (Class.forName((String) objArr[0]).isInstance(th)) {
                                        objArr2 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr2);
                                        if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                            objArr3 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                break;
                                            }
                                            objArr4 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            objArr5 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i8 >= 92) {
                                            }
                                            throw th;
                                        }
                                        objArr3 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr3);
                                        if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                            break;
                                        }
                                        objArr4 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr4);
                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                            break;
                                        }
                                        objArr5 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr5);
                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            break;
                                        }
                                        if (i8 >= 92) {
                                        }
                                        throw th;
                                    }
                                    objArr2 = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr2);
                                    if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                        objArr3 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr3);
                                        if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                            break;
                                        }
                                        objArr4 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr4);
                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                            break;
                                        }
                                        objArr5 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr5);
                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            break;
                                        }
                                        if (i8 >= 92) {
                                        }
                                        throw th;
                                    }
                                    objArr3 = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr3);
                                    if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                        break;
                                    }
                                    objArr4 = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr4);
                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                        break;
                                    }
                                    objArr5 = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr5);
                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                        break;
                                    }
                                    if (i8 >= 92) {
                                    }
                                    throw th;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                                }
                                break;
                            case -32:
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(9);
                                throw ((Throwable) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat);
                            case -31:
                                i8 = 111;
                                break;
                            case -30:
                                i8 = 113;
                                break;
                            case -29:
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(20);
                                if (r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer == 0) {
                                    i9 = 78;
                                }
                                i8 = i9;
                                break;
                            case -28:
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                try {
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                    try {
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(14);
                                        MediaMetadataCompat = r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer;
                                        i8 = i9;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        bArr = MediaSessionCompatQueueItem;
                                        s = (short) 267;
                                        objArr = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr);
                                        if (Class.forName((String) objArr[0]).isInstance(th)) {
                                            objArr2 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr2);
                                            if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                                objArr3 = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr3);
                                                if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                    break;
                                                }
                                                objArr4 = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                objArr5 = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                    break;
                                                }
                                                if (i8 >= 92) {
                                                }
                                                throw th;
                                            }
                                            objArr3 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                break;
                                            }
                                            objArr4 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            objArr5 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i8 >= 92) {
                                            }
                                            throw th;
                                        }
                                        objArr2 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr2);
                                        if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                            objArr3 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                break;
                                            }
                                            objArr4 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            objArr5 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i8 >= 92) {
                                            }
                                            throw th;
                                        }
                                        objArr3 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr3);
                                        if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                            break;
                                        }
                                        objArr4 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr4);
                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                            break;
                                        }
                                        objArr5 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr5);
                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            break;
                                        }
                                        if (i8 >= 92) {
                                        }
                                        throw th;
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    bArr = MediaSessionCompatQueueItem;
                                    s = (short) 267;
                                    objArr = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr);
                                    if (Class.forName((String) objArr[0]).isInstance(th)) {
                                        objArr2 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr2);
                                        if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                            objArr3 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                break;
                                            }
                                            objArr4 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            objArr5 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i8 >= 92) {
                                            }
                                            throw th;
                                        }
                                        objArr3 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr3);
                                        if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                            break;
                                        }
                                        objArr4 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr4);
                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                            break;
                                        }
                                        objArr5 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr5);
                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            break;
                                        }
                                        if (i8 >= 92) {
                                        }
                                        throw th;
                                    }
                                    objArr2 = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr2);
                                    if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                        objArr3 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr3);
                                        if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                            break;
                                        }
                                        objArr4 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr4);
                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                            break;
                                        }
                                        objArr5 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr5);
                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            break;
                                        }
                                        if (i8 >= 92) {
                                        }
                                        throw th;
                                    }
                                    objArr3 = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr3);
                                    if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                        break;
                                    }
                                    objArr4 = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr4);
                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                        break;
                                    }
                                    objArr5 = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr5);
                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                        break;
                                    }
                                    if (i8 >= 92) {
                                    }
                                    throw th;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                                    break;
                                }
                                break;
                            case -27:
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = RatingCompat;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(11);
                                i8 = i9;
                                break;
                            case -26:
                                i8 = 70;
                                break;
                            case -25:
                                return;
                            case -24:
                                try {
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                    try {
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                        Object obj = r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat;
                                        try {
                                            byte[] bArr4 = MediaSessionCompatQueueItem;
                                            Object[] objArr34 = new Object[1];
                                            a(bArr4[26], (short) 899, bArr4[46], objArr34);
                                            Class<?> cls10 = Class.forName((String) objArr34[0]);
                                            Object[] objArr35 = new Object[1];
                                            a(bArr4[51], (short) 914, bArr4[21], objArr35);
                                            try {
                                                try {
                                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.serializer = ((Long) cls10.getMethod((String) objArr35[0], null).invoke(obj, null)).longValue();
                                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(66);
                                                    i8 = i9;
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    bArr = MediaSessionCompatQueueItem;
                                                    s = (short) 267;
                                                    objArr = new Object[1];
                                                    a(bArr[68], s, bArr[46], objArr);
                                                    if (Class.forName((String) objArr[0]).isInstance(th) || i8 < 22 || i8 >= 64) {
                                                        objArr2 = new Object[1];
                                                        a(bArr[68], s, bArr[46], objArr2);
                                                        if (Class.forName((String) objArr2[0]).isInstance(th) || i8 < 25 || i8 >= 26) {
                                                            objArr3 = new Object[1];
                                                            a(bArr[68], s, bArr[46], objArr3);
                                                            if (Class.forName((String) objArr3[0]).isInstance(th) || i8 < 27 || i8 >= 64) {
                                                                objArr4 = new Object[1];
                                                                a(bArr[68], s, bArr[46], objArr4);
                                                                if (Class.forName((String) objArr4[0]).isInstance(th) || i8 < 29 || i8 >= 64) {
                                                                    objArr5 = new Object[1];
                                                                    a(bArr[68], s, bArr[46], objArr5);
                                                                    if (Class.forName((String) objArr5[0]).isInstance(th) || i8 < 31 || i8 >= 64) {
                                                                        if (i8 >= 92 || i8 >= 98) {
                                                                            throw th;
                                                                        }
                                                                        i8 = 79;
                                                                    }
                                                                }
                                                                i8 = 116;
                                                            } else {
                                                                i8 = 115;
                                                            }
                                                        } else {
                                                            i8 = 116;
                                                        }
                                                    } else {
                                                        i8 = 115;
                                                    }
                                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                Throwable cause3 = th.getCause();
                                                if (cause3 == null) {
                                                    throw th;
                                                }
                                                throw cause3;
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        bArr = MediaSessionCompatQueueItem;
                                        s = (short) 267;
                                        objArr = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr);
                                        if (Class.forName((String) objArr[0]).isInstance(th)) {
                                            objArr2 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr2);
                                            if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                                objArr3 = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr3);
                                                if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                }
                                                objArr4 = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                }
                                                objArr5 = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                if (i8 >= 92) {
                                                }
                                                throw th;
                                            }
                                            objArr3 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                            }
                                            objArr4 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                            }
                                            objArr5 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            if (i8 >= 92) {
                                            }
                                            throw th;
                                        }
                                        objArr2 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr2);
                                        if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                            objArr3 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                            }
                                            objArr4 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                            }
                                            objArr5 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            if (i8 >= 92) {
                                            }
                                            throw th;
                                        }
                                        objArr3 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr3);
                                        if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                        }
                                        objArr4 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr4);
                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                        }
                                        objArr5 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr5);
                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                        }
                                        if (i8 >= 92) {
                                        }
                                        throw th;
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                }
                                break;
                            case -23:
                                try {
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat;
                                    i = 4;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i);
                                    i8 = i9;
                                } catch (Throwable th11) {
                                    th = th11;
                                    bArr = MediaSessionCompatQueueItem;
                                    s = (short) 267;
                                    objArr = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr);
                                    if (Class.forName((String) objArr[0]).isInstance(th)) {
                                        objArr2 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr2);
                                        if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                            objArr3 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                break;
                                            }
                                            objArr4 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            objArr5 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i8 >= 92) {
                                            }
                                            throw th;
                                        }
                                        objArr3 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr3);
                                        if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                            break;
                                        }
                                        objArr4 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr4);
                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                            break;
                                        }
                                        objArr5 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr5);
                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            break;
                                        }
                                        if (i8 >= 92) {
                                        }
                                        throw th;
                                    }
                                    objArr2 = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr2);
                                    if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                        objArr3 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr3);
                                        if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                            break;
                                        }
                                        objArr4 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr4);
                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                            break;
                                        }
                                        objArr5 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr5);
                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            break;
                                        }
                                        if (i8 >= 92) {
                                        }
                                        throw th;
                                    }
                                    objArr3 = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr3);
                                    if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                        break;
                                    }
                                    objArr4 = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr4);
                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                        break;
                                    }
                                    objArr5 = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr5);
                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                        break;
                                    }
                                    if (i8 >= 92) {
                                    }
                                    throw th;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                                }
                                break;
                            case -22:
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 4;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                androidx.room.RoomDatabase roomDatabase = (androidx.room.RoomDatabase) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(14);
                                boolean z = r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer != 0;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(14);
                                boolean z2 = r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer != 0;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = TuplesKt.write(roomDatabase, z, z2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat);
                                i = 4;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i);
                                i8 = i9;
                                break;
                            case -21:
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 3;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                Object obj2 = r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(14);
                                int i10 = r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = new SessionDao_Impl$$ExternalSyntheticLambda1(obj2, i10, r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat);
                                i = 4;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i);
                                i8 = i9;
                                break;
                            case -20:
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = ((accessgetBottomcp) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat).read;
                                i = 4;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i);
                                i8 = i9;
                                break;
                            case -19:
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = (accessgetBottomcp) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat;
                                i = 4;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i);
                                i8 = i9;
                                break;
                            case -18:
                                try {
                                    try {
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 6;
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(73);
                                        long j = r8lambda4eaylekyczrqunjxkny3fxsmeyo.read;
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                        String str5 = (String) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat;
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                        String str6 = (String) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat;
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(73);
                                        long j2 = r8lambda4eaylekyczrqunjxkny3fxsmeyo.read;
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                        String str7 = (String) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat;
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(73);
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = new getTextCenterJ6kI3mc(j, str5, str6, j2, str7, r8lambda4eaylekyczrqunjxkny3fxsmeyo.read);
                                        i = 4;
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i);
                                        i8 = i9;
                                    } catch (Throwable th12) {
                                        th = th12;
                                        bArr = MediaSessionCompatQueueItem;
                                        s = (short) 267;
                                        objArr = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr);
                                        if (Class.forName((String) objArr[0]).isInstance(th)) {
                                            objArr2 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr2);
                                            if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                                objArr3 = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr3);
                                                if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                    break;
                                                }
                                                objArr4 = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                objArr5 = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                    break;
                                                }
                                                if (i8 >= 92) {
                                                }
                                                throw th;
                                            }
                                            objArr3 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                break;
                                            }
                                            objArr4 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            objArr5 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i8 >= 92) {
                                            }
                                            throw th;
                                        }
                                        objArr2 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr2);
                                        if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                            objArr3 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                break;
                                            }
                                            objArr4 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            objArr5 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i8 >= 92) {
                                            }
                                            throw th;
                                        }
                                        objArr3 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr3);
                                        if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                            break;
                                        }
                                        objArr4 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr4);
                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                            break;
                                        }
                                        objArr5 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr5);
                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            break;
                                        }
                                        if (i8 >= 92) {
                                        }
                                        throw th;
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                                    }
                                } catch (Throwable th13) {
                                    th = th13;
                                }
                                break;
                            case -17:
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.serializer = 14490L;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(66);
                                i8 = i9;
                                break;
                            case -16:
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.serializer = ((r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat).write;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(66);
                                i8 = i9;
                                break;
                            case -15:
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = ((r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat).IconCompatParcelizer;
                                i2 = 4;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i2);
                                i8 = i9;
                                break;
                            case androidx.compose.ui.graphics.Float16.MinExponent /* -14 */:
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.serializer = ((r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat).read;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(66);
                                i8 = i9;
                                break;
                            case -13:
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = ((r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat).RemoteActionCompatParcelizer;
                                i2 = 4;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i2);
                                i8 = i9;
                                break;
                            case -12:
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = ((r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat).serializer;
                                i2 = 4;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i2);
                                i8 = i9;
                                break;
                            case BaseCode.NOT_SUPPORT_RESOLUTION /* -11 */:
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = ((r8lambda2tFXStZN_MXijoyymezhxf14xPY) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat).IconCompatParcelizer;
                                i2 = 4;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i2);
                                i8 = i9;
                                break;
                            case BaseCode.KPMS_UPDATE_FAILED /* -10 */:
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = ((r8lambda2tFXStZN_MXijoyymezhxf14xPY) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat).read();
                                i2 = 4;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i2);
                                i8 = i9;
                                break;
                            case BaseCode.NO_AVAILABLE_LIB_ERROR /* -9 */:
                                i8 = 98;
                                break;
                            case BaseCode.SOLUTION_GET_RESPONSE_CODE_ERROR /* -8 */:
                                i8 = 18;
                                break;
                            case BaseCode.DATA_NULL_IN_INTENT /* -7 */:
                                i8 = 17;
                                break;
                            case BaseCode.TRANSACTION_IS_NULL /* -6 */:
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(15);
                                if (r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer == 0) {
                                    i9 = 16;
                                }
                                i8 = i9;
                                break;
                            case BaseCode.URI_IS_NULL /* -5 */:
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 2;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                Object obj3 = r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj3, r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat}, getCieXyz.write())).booleanValue() ? 1 : 0;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(11);
                                i8 = i9;
                                break;
                            case BaseCode.NO_SOLUTION /* -4 */:
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 2;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                Object obj4 = r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                try {
                                    Object[] objArr36 = {r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat};
                                    byte[] bArr5 = MediaSessionCompatQueueItem;
                                    Object[] objArr37 = new Object[1];
                                    a(bArr5[614], (short) 730, bArr5[46], objArr37);
                                    Class<?> cls11 = Class.forName((String) objArr37[0]);
                                    byte b7 = bArr5[51];
                                    Object[] objArr38 = new Object[1];
                                    a(b7, (short) (PlaybackStateCompat | 793), b7, objArr38);
                                    String str8 = (String) objArr38[0];
                                    Object[] objArr39 = new Object[1];
                                    a(bArr5[26], (short) 772, bArr5[46], objArr39);
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = cls11.getMethod(str8, Class.forName((String) objArr39[0])).invoke(obj4, objArr36);
                                    i2 = 4;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i2);
                                    i8 = i9;
                                } catch (Throwable th14) {
                                    Throwable cause4 = th14.getCause();
                                    if (cause4 == null) {
                                        throw th14;
                                    }
                                    throw cause4;
                                }
                                break;
                            case -3:
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = ((r8lambda2tFXStZN_MXijoyymezhxf14xPY) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat).RemoteActionCompatParcelizer();
                                i3 = 4;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i3);
                                i8 = i9;
                                break;
                            case -2:
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat.getClass();
                                i3 = 4;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i3);
                                i8 = i9;
                                break;
                            case -1:
                                i8 = 64;
                                break;
                            default:
                                i8 = i9;
                                break;
                        }
                    } catch (Throwable th15) {
                        th = th15;
                    }
                }
            } catch (Throwable th16) {
                Throwable cause5 = th16.getCause();
                if (cause5 == null) {
                    throw th16;
                }
                throw cause5;
            }
        } catch (Throwable th17) {
            Throwable cause6 = th17.getCause();
            if (cause6 == null) {
                throw th17;
            }
            throw cause6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:140:0x05ce A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:143:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:145:0x05f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:151:0x061f  */
    /* JADX WARN: Code duplicated, block: B:205:0x0631 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    @Override // o.SemanticsInfo
    public Object init(ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i;
        int i2;
        r8lambda4eayLEkyCzRqunjxKNY3fxSMeyo r8lambda4eaylekyczrqunjxkny3fxsmeyo = new r8lambda4eayLEkyCzRqunjxKNY3fxSMeyo(this, shortNewsContentCardView);
        try {
            byte[] bArr = MediaSessionCompatQueueItem;
            byte b = bArr[4];
            Object[] objArr3 = new Object[1];
            a(b, (short) (b | 173), bArr[9], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(bArr[142], (short) 853, bArr[26], objArr4);
            char cIntValue = (char) (42760 - ((Integer) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 0)).intValue());
            Object[] objArr5 = new Object[1];
            a(bArr[209], (short) 410, bArr[9], objArr5);
            Class<?> cls2 = Class.forName((String) objArr5[0]);
            byte b2 = bArr[21];
            Object[] objArr6 = new Object[1];
            a(b2, (short) (b2 | 432), bArr[115], objArr6);
            int iIntValue = 263 - ((Integer) cls2.getMethod((String) objArr6[0], Integer.TYPE, Integer.TYPE).invoke(null, 0, 0)).intValue();
            Object[] objArr7 = {Float.valueOf(0.0f), Float.valueOf(0.0f)};
            Object[] objArr8 = new Object[1];
            a(bArr[28], (short) 551, bArr[9], objArr8);
            Class<?> cls3 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            a(bArr[27], (short) 573, bArr[21], objArr9);
            Object[] objArr10 = new Object[1];
            b(cIntValue, iIntValue, (((Float) cls3.getMethod((String) objArr9[0], Float.TYPE, Float.TYPE).invoke(null, objArr7)).floatValue() > 0.0f ? 1 : (((Float) cls3.getMethod((String) objArr9[0], Float.TYPE, Float.TYPE).invoke(null, objArr7)).floatValue() == 0.0f ? 0 : -1)) + 1513, objArr10);
            String str = (String) objArr10[0];
            Object[] objArr11 = new Object[1];
            a(bArr[6], bArr[11], bArr[9], objArr11);
            Class<?> cls4 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            a(bArr[13], (short) 89, bArr[56], objArr12);
            String str2 = (String) objArr12[0];
            byte b3 = bArr[6];
            Object[] objArr13 = new Object[1];
            a(b3, (short) (b3 | 76), bArr[46], objArr13);
            char cIntValue2 = (char) (((Integer) cls4.getMethod(str2, Class.forName((String) objArr13[0]), Character.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, "", '0', 0, 0)).intValue() + 1);
            Object[] objArr14 = new Object[1];
            a(bArr[434], (short) 285, bArr[9], objArr14);
            Class<?> cls5 = Class.forName((String) objArr14[0]);
            int i3 = 35;
            Object[] objArr15 = new Object[1];
            a(bArr[35], (short) 456, bArr[51], objArr15);
            int iIntValue2 = 1 - (((Integer) cls5.getMethod((String) objArr15[0], null).invoke(null, null)).intValue() >> 16);
            Object[] objArr16 = {0, 0};
            Object[] objArr17 = new Object[1];
            a(bArr[35], (short) 624, bArr[9], objArr17);
            Class<?> cls6 = Class.forName((String) objArr17[0]);
            byte b4 = bArr[56];
            Object[] objArr18 = new Object[1];
            a(b4, (short) (b4 | 803), bArr[115], objArr18);
            String str3 = (String) objArr18[0];
            Object[] objArr19 = new Object[1];
            b(cIntValue2, iIntValue2, 142 - ((Integer) cls6.getMethod(str3, Integer.TYPE, Integer.TYPE).invoke(null, objArr16)).intValue(), objArr19);
            Object[] objArr20 = {(String) objArr19[0]};
            short s = (short) 176;
            Object[] objArr21 = new Object[1];
            a(bArr[26], s, bArr[46], objArr21);
            Class<?> cls7 = Class.forName((String) objArr21[0]);
            byte b5 = bArr[7];
            Object[] objArr22 = new Object[1];
            a(b5, (short) (b5 | 232), bArr[4], objArr22);
            String str4 = (String) objArr22[0];
            Object[] objArr23 = new Object[1];
            a(bArr[26], s, bArr[46], objArr23);
            Object[] objArr24 = (Object[]) cls7.getMethod(str4, Class.forName((String) objArr23[0])).invoke(str, objArr20);
            int[] iArr = new int[objArr24.length];
            int i4 = 0;
            while (i4 < objArr24.length) {
                try {
                    Object[] objArr25 = {objArr24[i4]};
                    byte[] bArr2 = MediaSessionCompatQueueItem;
                    byte b6 = bArr2[i3];
                    Object[] objArr26 = new Object[1];
                    a(b6, (short) (b6 | 224), bArr2[46], objArr26);
                    Class<?> cls8 = Class.forName((String) objArr26[0]);
                    byte b7 = bArr2[13];
                    Object[] objArr27 = new Object[1];
                    a(b7, (short) (b7 | 250), bArr2[135], objArr27);
                    String str5 = (String) objArr27[0];
                    Object[] objArr28 = new Object[1];
                    a(bArr2[26], s, bArr2[46], objArr28);
                    Object objInvoke = cls8.getMethod(str5, Class.forName((String) objArr28[0])).invoke(null, objArr25);
                    try {
                        byte b8 = bArr2[35];
                        Object[] objArr29 = new Object[1];
                        a(b8, (short) (b8 | 224), bArr2[46], objArr29);
                        Class<?> cls9 = Class.forName((String) objArr29[0]);
                        Object[] objArr30 = new Object[1];
                        a(bArr2[356], (short) 260, bArr2[56], objArr30);
                        iArr[i4] = ((Integer) cls9.getMethod((String) objArr30[0], null).invoke(objInvoke, null)).intValue();
                        i4++;
                        i3 = 35;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
            int i5 = i3;
            int i6 = 0;
            while (true) {
                int i7 = i6 + 1;
                try {
                    switch (r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(iArr[i6])) {
                        case -27:
                            i6 = 74;
                            i5 = 35;
                            break;
                        case -26:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(24);
                            i6 = r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer != 46 ? 1 : 51;
                            i5 = 35;
                            break;
                        case -25:
                            i6 = 69;
                            i5 = 35;
                            break;
                        case -24:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(24);
                            int i8 = r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer;
                            i7 = (i8 == 0 || i8 != 1) ? 37 : 25;
                            i6 = i7;
                            i5 = 35;
                            break;
                        case -23:
                            i6 = 75;
                            i5 = 35;
                            break;
                        case -22:
                            i6 = 77;
                            i5 = 35;
                            break;
                        case -21:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(20);
                            if (r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer == 0) {
                                i7 = 50;
                            }
                            i6 = i7;
                            i5 = 35;
                            break;
                        case -20:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                            try {
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(14);
                                MediaMetadataCompat = r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer;
                                i6 = i7;
                            } catch (Throwable th3) {
                                th = th3;
                                if (i6 >= 38) {
                                    byte[] bArr3 = MediaSessionCompatQueueItem;
                                    short s2 = (short) 267;
                                    objArr = new Object[1];
                                    a(bArr3[68], s2, bArr3[46], objArr);
                                    if (Class.forName((String) objArr[0]).isInstance(th)) {
                                    }
                                    objArr2 = new Object[1];
                                    a(bArr3[68], s2, bArr3[46], objArr2);
                                    if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                    }
                                    throw th;
                                }
                                byte[] bArr4 = MediaSessionCompatQueueItem;
                                short s3 = (short) 267;
                                objArr = new Object[1];
                                a(bArr4[68], s3, bArr4[46], objArr);
                                if (Class.forName((String) objArr[0]).isInstance(th)) {
                                }
                                objArr2 = new Object[1];
                                a(bArr4[68], s3, bArr4[46], objArr2);
                                if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                }
                                throw th;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                            }
                            i5 = 35;
                            break;
                        case -19:
                            try {
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = RatingCompat;
                                try {
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(11);
                                    i6 = i7;
                                } catch (Throwable th4) {
                                    th = th4;
                                    if (i6 >= 38) {
                                        byte[] bArr5 = MediaSessionCompatQueueItem;
                                        short s4 = (short) 267;
                                        objArr = new Object[1];
                                        a(bArr5[68], s4, bArr5[46], objArr);
                                        if (Class.forName((String) objArr[0]).isInstance(th)) {
                                        }
                                        objArr2 = new Object[1];
                                        a(bArr5[68], s4, bArr5[46], objArr2);
                                        if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                        }
                                        throw th;
                                    }
                                    byte[] bArr6 = MediaSessionCompatQueueItem;
                                    short s5 = (short) 267;
                                    objArr = new Object[1];
                                    a(bArr6[68], s5, bArr6[46], objArr);
                                    if (Class.forName((String) objArr[0]).isInstance(th)) {
                                    }
                                    objArr2 = new Object[1];
                                    a(bArr6[68], s5, bArr6[46], objArr2);
                                    if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                    }
                                    throw th;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                                }
                            } catch (Throwable th5) {
                                th = th5;
                            }
                            i5 = 35;
                            break;
                        case -18:
                            try {
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(9);
                                throw ((Throwable) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat);
                            } catch (Throwable th6) {
                                th = th6;
                                if (i6 >= 38 || i6 >= 41) {
                                    byte[] bArr7 = MediaSessionCompatQueueItem;
                                    short s6 = (short) 267;
                                    objArr = new Object[1];
                                    a(bArr7[68], s6, bArr7[46], objArr);
                                    if (Class.forName((String) objArr[0]).isInstance(th) || i6 < 41 || i6 >= 42) {
                                        objArr2 = new Object[1];
                                        a(bArr7[68], s6, bArr7[46], objArr2);
                                        if (Class.forName((String) objArr2[0]).isInstance(th) || i6 < 45 || i6 >= 51) {
                                            throw th;
                                        }
                                        i6 = 80;
                                    } else {
                                        i6 = 79;
                                    }
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                                    i5 = 35;
                                } else {
                                    i6 = 36;
                                }
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                                i5 = 35;
                            }
                            break;
                        case -17:
                            i6 = 70;
                            break;
                        case -16:
                            i6 = 72;
                            break;
                        case -15:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(15);
                            i6 = r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer == 0 ? i5 : i7;
                            break;
                        case androidx.compose.ui.graphics.Float16.MinExponent /* -14 */:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(14);
                            RatingCompat = r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer;
                            i6 = i7;
                            i5 = 35;
                            break;
                        case -13:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = MediaMetadataCompat;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(11);
                            i6 = i7;
                            i5 = 35;
                            break;
                        case -12:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(9);
                            return r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat;
                        case BaseCode.NOT_SUPPORT_RESOLUTION /* -11 */:
                            i6 = 41;
                            break;
                        case BaseCode.KPMS_UPDATE_FAILED /* -10 */:
                            i6 = 27;
                            break;
                        case BaseCode.NO_AVAILABLE_LIB_ERROR /* -9 */:
                            try {
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = createFromParcel.INSTANCE;
                                try {
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(4);
                                    i6 = i7;
                                } catch (Throwable th7) {
                                    th = th7;
                                    if (i6 >= 38) {
                                        byte[] bArr8 = MediaSessionCompatQueueItem;
                                        short s7 = (short) 267;
                                        objArr = new Object[1];
                                        a(bArr8[68], s7, bArr8[46], objArr);
                                        if (Class.forName((String) objArr[0]).isInstance(th)) {
                                        }
                                        objArr2 = new Object[1];
                                        a(bArr8[68], s7, bArr8[46], objArr2);
                                        if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                        }
                                        throw th;
                                    }
                                    byte[] bArr9 = MediaSessionCompatQueueItem;
                                    short s8 = (short) 267;
                                    objArr = new Object[1];
                                    a(bArr9[68], s8, bArr9[46], objArr);
                                    if (Class.forName((String) objArr[0]).isInstance(th)) {
                                    }
                                    objArr2 = new Object[1];
                                    a(bArr9[68], s8, bArr9[46], objArr2);
                                    if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                    }
                                    throw th;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                if (i6 >= 38) {
                                    byte[] bArr10 = MediaSessionCompatQueueItem;
                                    short s9 = (short) 267;
                                    objArr = new Object[1];
                                    a(bArr10[68], s9, bArr10[46], objArr);
                                    if (Class.forName((String) objArr[0]).isInstance(th)) {
                                    }
                                    objArr2 = new Object[1];
                                    a(bArr10[68], s9, bArr10[46], objArr2);
                                    if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                    }
                                    throw th;
                                }
                                byte[] bArr11 = MediaSessionCompatQueueItem;
                                short s10 = (short) 267;
                                objArr = new Object[1];
                                a(bArr11[68], s10, bArr11[46], objArr);
                                if (Class.forName((String) objArr[0]).isInstance(th)) {
                                }
                                objArr2 = new Object[1];
                                a(bArr11[68], s10, bArr11[46], objArr2);
                                if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                }
                                throw th;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                            }
                            i5 = 35;
                            break;
                        case BaseCode.SOLUTION_GET_RESPONSE_CODE_ERROR /* -8 */:
                            try {
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 3;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                Timber.Forest forest = (Timber.Forest) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                String str6 = (String) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                forest.IconCompatParcelizer(str6, (Object[]) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat);
                                i6 = i7;
                            } catch (Throwable th9) {
                                th = th9;
                                if (i6 >= 38) {
                                    byte[] bArr12 = MediaSessionCompatQueueItem;
                                    short s11 = (short) 267;
                                    objArr = new Object[1];
                                    a(bArr12[68], s11, bArr12[46], objArr);
                                    if (Class.forName((String) objArr[0]).isInstance(th)) {
                                    }
                                    objArr2 = new Object[1];
                                    a(bArr12[68], s11, bArr12[46], objArr2);
                                    if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                    }
                                    throw th;
                                }
                                byte[] bArr13 = MediaSessionCompatQueueItem;
                                short s12 = (short) 267;
                                objArr = new Object[1];
                                a(bArr13[68], s12, bArr13[46], objArr);
                                if (Class.forName((String) objArr[0]).isInstance(th)) {
                                }
                                objArr2 = new Object[1];
                                a(bArr13[68], s12, bArr13[46], objArr2);
                                if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                }
                                throw th;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                            }
                            i5 = 35;
                            break;
                        case BaseCode.DATA_NULL_IN_INTENT /* -7 */:
                            try {
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(14);
                                int i9 = r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer;
                                byte[] bArr14 = MediaSessionCompatQueueItem;
                                try {
                                    Object[] objArr31 = new Object[1];
                                    a(bArr14[26], (short) 772, bArr14[46], objArr31);
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = Array.newInstance(Class.forName((String) objArr31[0]), i9);
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(4);
                                    i6 = i7;
                                } catch (Throwable th10) {
                                    th = th10;
                                    if (i6 >= 38) {
                                        byte[] bArr15 = MediaSessionCompatQueueItem;
                                        short s13 = (short) 267;
                                        objArr = new Object[1];
                                        a(bArr15[68], s13, bArr15[46], objArr);
                                        if (Class.forName((String) objArr[0]).isInstance(th)) {
                                        }
                                        objArr2 = new Object[1];
                                        a(bArr15[68], s13, bArr15[46], objArr2);
                                        if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                        }
                                        throw th;
                                    }
                                    byte[] bArr16 = MediaSessionCompatQueueItem;
                                    short s14 = (short) 267;
                                    objArr = new Object[1];
                                    a(bArr16[68], s14, bArr16[46], objArr);
                                    if (Class.forName((String) objArr[0]).isInstance(th)) {
                                    }
                                    objArr2 = new Object[1];
                                    a(bArr16[68], s14, bArr16[46], objArr2);
                                    if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                    }
                                    throw th;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                                }
                            } catch (Throwable th11) {
                                th = th11;
                            }
                            i5 = 35;
                            break;
                        case BaseCode.TRANSACTION_IS_NULL /* -6 */:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 2;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                            Object obj = r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = m1$$ExternalSyntheticOutline0.m(obj, (String) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat);
                            i = 4;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i);
                            i6 = i7;
                            i5 = 35;
                            break;
                        case BaseCode.URI_IS_NULL /* -5 */:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = "Session repository is loaded. ";
                            i = 4;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i);
                            i6 = i7;
                            i5 = 35;
                            break;
                        case BaseCode.NO_SOLUTION /* -4 */:
                            try {
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                Object obj2 = r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat;
                                try {
                                    byte[] bArr17 = MediaSessionCompatQueueItem;
                                    Object[] objArr32 = new Object[1];
                                    a(bArr17[614], (short) 730, bArr17[46], objArr32);
                                    Class<?> cls10 = Class.forName((String) objArr32[0]);
                                    byte b9 = bArr17[9];
                                    Object[] objArr33 = new Object[1];
                                    a(b9, (short) (b9 | 851), bArr17[51], objArr33);
                                    try {
                                        try {
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = cls10.getMethod((String) objArr33[0], null).invoke(obj2, null);
                                            i = 4;
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i);
                                            i6 = i7;
                                        } catch (Throwable th12) {
                                            th = th12;
                                            if (i6 >= 38) {
                                                byte[] bArr18 = MediaSessionCompatQueueItem;
                                                short s15 = (short) 267;
                                                objArr = new Object[1];
                                                a(bArr18[68], s15, bArr18[46], objArr);
                                                if (Class.forName((String) objArr[0]).isInstance(th)) {
                                                }
                                                objArr2 = new Object[1];
                                                a(bArr18[68], s15, bArr18[46], objArr2);
                                                if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte[] bArr19 = MediaSessionCompatQueueItem;
                                            short s16 = (short) 267;
                                            objArr = new Object[1];
                                            a(bArr19[68], s16, bArr19[46], objArr);
                                            if (Class.forName((String) objArr[0]).isInstance(th)) {
                                            }
                                            objArr2 = new Object[1];
                                            a(bArr19[68], s16, bArr19[46], objArr2);
                                            if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                            }
                                            throw th;
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                                        }
                                        i5 = 35;
                                    } catch (Throwable th13) {
                                        th = th13;
                                        Throwable cause3 = th.getCause();
                                        if (cause3 != null) {
                                            throw cause3;
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th14) {
                                    th = th14;
                                }
                            } catch (Throwable th15) {
                                th = th15;
                            }
                            break;
                        case -3:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = ((r8lambda2tFXStZN_MXijoyymezhxf14xPY) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat).RemoteActionCompatParcelizer();
                            i2 = 4;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i2);
                            i6 = i7;
                            i5 = 35;
                            break;
                        case -2:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = Timber.RemoteActionCompatParcelizer;
                            i2 = 4;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i2);
                            i6 = i7;
                            i5 = 35;
                            break;
                        case -1:
                            i6 = 21;
                            break;
                        default:
                            i6 = i7;
                            i5 = 35;
                            break;
                    }
                } catch (Throwable th16) {
                    th = th16;
                }
            }
        } catch (Throwable th17) {
            Throwable cause4 = th17.getCause();
            if (cause4 != null) {
                throw cause4;
            }
            throw th17;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x052c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:106:0x0530  */
    /* JADX WARN: Code duplicated, block: B:108:0x0538  */
    /* JADX WARN: Code duplicated, block: B:110:0x0554  */
    /* JADX WARN: Code duplicated, block: B:115:0x055f  */
    /* JADX WARN: Code duplicated, block: B:117:0x0563 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:121:0x0584  */
    /* JADX WARN: Code duplicated, block: B:127:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:186:0x05bc A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA serializer() {
        byte[] bArr;
        short s;
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        Object[] objArr4;
        int i;
        r8lambda4eayLEkyCzRqunjxKNY3fxSMeyo r8lambda4eaylekyczrqunjxkny3fxsmeyo = new r8lambda4eayLEkyCzRqunjxKNY3fxSMeyo(this);
        try {
            byte[] bArr2 = MediaSessionCompatQueueItem;
            Object[] objArr5 = new Object[1];
            a(bArr2[6], bArr2[11], bArr2[9], objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            short s2 = (short) 833;
            Object[] objArr6 = new Object[1];
            a(bArr2[59], s2, bArr2[51], objArr6);
            String str = (String) objArr6[0];
            byte b = bArr2[6];
            Object[] objArr7 = new Object[1];
            a(b, (short) (b | 76), bArr2[46], objArr7);
            char cIntValue = (char) (37213 - ((Integer) cls.getMethod(str, Class.forName((String) objArr7[0]), Integer.TYPE).invoke(null, "", 0)).intValue());
            Object[] objArr8 = new Object[1];
            a(bArr2[142], (short) 685, bArr2[9], objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            byte b2 = bArr2[7];
            Object[] objArr9 = new Object[1];
            a(b2, (short) (b2 | 845), bArr2[59], objArr9);
            int iIntValue = (((Integer) cls2.getMethod((String) objArr9[0], null).invoke(null, null)).intValue() >> 22) + 172;
            Object[] objArr10 = {"", 0, 0};
            Object[] objArr11 = new Object[1];
            a(bArr2[6], bArr2[11], bArr2[9], objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            a(bArr2[56], (short) 821, bArr2[51], objArr12);
            String str2 = (String) objArr12[0];
            byte b3 = bArr2[6];
            Object[] objArr13 = new Object[1];
            a(b3, (short) (b3 | 76), bArr2[46], objArr13);
            Class<?>[] clsArr = {Class.forName((String) objArr13[0]), Integer.TYPE, Integer.TYPE};
            Object[] objArr14 = new Object[1];
            b(cIntValue, iIntValue, 1341 - ((Integer) cls3.getMethod(str2, clsArr).invoke(null, objArr10)).intValue(), objArr14);
            String str3 = (String) objArr14[0];
            int i2 = 4;
            Object[] objArr15 = new Object[1];
            a(bArr2[6], bArr2[11], bArr2[9], objArr15);
            Class<?> cls4 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            a(bArr2[13], (short) 89, bArr2[56], objArr16);
            String str4 = (String) objArr16[0];
            byte b4 = bArr2[6];
            Object[] objArr17 = new Object[1];
            a(b4, (short) (b4 | 76), bArr2[46], objArr17);
            char cIntValue2 = (char) (((Integer) cls4.getMethod(str4, Class.forName((String) objArr17[0]), Character.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, "", '0', 0, 0)).intValue() + 1);
            Object[] objArr18 = new Object[1];
            a(bArr2[6], bArr2[11], bArr2[9], objArr18);
            Class<?> cls5 = Class.forName((String) objArr18[0]);
            Object[] objArr19 = new Object[1];
            a(bArr2[59], s2, bArr2[51], objArr19);
            String str5 = (String) objArr19[0];
            byte b5 = bArr2[6];
            Object[] objArr20 = new Object[1];
            a(b5, (short) (b5 | 76), bArr2[46], objArr20);
            int iIntValue2 = 1 - ((Integer) cls5.getMethod(str5, Class.forName((String) objArr20[0]), Integer.TYPE).invoke(null, "", 0)).intValue();
            Object[] objArr21 = new Object[1];
            a(bArr2[434], (short) 285, bArr2[9], objArr21);
            Class<?> cls6 = Class.forName((String) objArr21[0]);
            byte b6 = bArr2[68];
            Object[] objArr22 = new Object[1];
            a(b6, (short) (b6 | 590), bArr2[51], objArr22);
            Object[] objArr23 = new Object[1];
            b(cIntValue2, iIntValue2, (((Integer) cls6.getMethod((String) objArr22[0], null).invoke(null, null)).intValue() >> 16) + 142, objArr23);
            Object[] objArr24 = {(String) objArr23[0]};
            char c = 26;
            short s3 = (short) 176;
            Object[] objArr25 = new Object[1];
            a(bArr2[26], s3, bArr2[46], objArr25);
            Class<?> cls7 = Class.forName((String) objArr25[0]);
            byte b7 = bArr2[7];
            Object[] objArr26 = new Object[1];
            a(b7, (short) (b7 | 232), bArr2[4], objArr26);
            String str6 = (String) objArr26[0];
            Object[] objArr27 = new Object[1];
            a(bArr2[26], s3, bArr2[46], objArr27);
            Object[] objArr28 = (Object[]) cls7.getMethod(str6, Class.forName((String) objArr27[0])).invoke(str3, objArr24);
            int[] iArr = new int[objArr28.length];
            int i3 = 0;
            while (i3 < objArr28.length) {
                try {
                    Object[] objArr29 = {objArr28[i3]};
                    byte[] bArr3 = MediaSessionCompatQueueItem;
                    byte b8 = bArr3[35];
                    Object[] objArr30 = new Object[1];
                    a(b8, (short) (b8 | 224), bArr3[46], objArr30);
                    Class<?> cls8 = Class.forName((String) objArr30[0]);
                    byte b9 = bArr3[13];
                    Object[] objArr31 = new Object[1];
                    a(b9, (short) (b9 | 250), bArr3[135], objArr31);
                    String str7 = (String) objArr31[0];
                    Object[] objArr32 = new Object[1];
                    a(bArr3[c], s3, bArr3[46], objArr32);
                    Object objInvoke = cls8.getMethod(str7, Class.forName((String) objArr32[0])).invoke(null, objArr29);
                    try {
                        byte b10 = bArr3[35];
                        Object[] objArr33 = new Object[1];
                        a(b10, (short) (b10 | 224), bArr3[46], objArr33);
                        Class<?> cls9 = Class.forName((String) objArr33[0]);
                        Object[] objArr34 = new Object[1];
                        a(bArr3[356], (short) 260, bArr3[56], objArr34);
                        iArr[i3] = ((Integer) cls9.getMethod((String) objArr34[0], null).invoke(objInvoke, null)).intValue();
                        i3++;
                        c = 26;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                try {
                    switch (r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(iArr[i4])) {
                        case -20:
                            i4 = 47;
                            break;
                        case -19:
                            try {
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(24);
                                if (r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer != 78) {
                                    i5 = 34;
                                    i4 = i5;
                                } else {
                                    i4 = 1;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                bArr = MediaSessionCompatQueueItem;
                                s = (short) 267;
                                objArr = new Object[1];
                                a(bArr[68], s, bArr[46], objArr);
                                if (Class.forName((String) objArr[0]).isInstance(th)) {
                                    objArr2 = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr2);
                                    if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                        if (i4 >= 42) {
                                        }
                                        objArr3 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr3);
                                        if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                            break;
                                        }
                                        objArr4 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr4);
                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                        }
                                        throw th;
                                    }
                                    if (i4 >= 42) {
                                    }
                                    objArr3 = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr3);
                                    if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                        break;
                                    }
                                    objArr4 = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr4);
                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                    }
                                    throw th;
                                }
                                objArr2 = new Object[1];
                                a(bArr[68], s, bArr[46], objArr2);
                                if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                    if (i4 >= 42) {
                                    }
                                    objArr3 = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr3);
                                    if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                        break;
                                    }
                                    objArr4 = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr4);
                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                    }
                                    throw th;
                                }
                                if (i4 >= 42) {
                                }
                                objArr3 = new Object[1];
                                a(bArr[68], s, bArr[46], objArr3);
                                if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                    break;
                                }
                                objArr4 = new Object[1];
                                a(bArr[68], s, bArr[46], objArr4);
                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                }
                                throw th;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                                i2 = 4;
                            }
                            break;
                        case -18:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(9);
                            throw ((Throwable) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat);
                        case -17:
                            i4 = 48;
                            break;
                        case -16:
                            i4 = 50;
                            break;
                        case -15:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(20);
                            if (r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer == 0) {
                                i5 = 32;
                            }
                            i4 = i5;
                            break;
                        case androidx.compose.ui.graphics.Float16.MinExponent /* -14 */:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                            try {
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(14);
                                MediaMetadataCompat = r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer;
                                i4 = i5;
                            } catch (Throwable th4) {
                                th = th4;
                                bArr = MediaSessionCompatQueueItem;
                                s = (short) 267;
                                objArr = new Object[1];
                                a(bArr[68], s, bArr[46], objArr);
                                if (Class.forName((String) objArr[0]).isInstance(th) || i4 < 15 || i4 >= 24) {
                                    objArr2 = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr2);
                                    if (!Class.forName((String) objArr2[0]).isInstance(th) && i4 >= 19 && i4 < 20) {
                                        i = 52;
                                    } else if (i4 >= 42 || i4 >= 47) {
                                        objArr3 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr3);
                                        if (Class.forName((String) objArr3[0]).isInstance(th) || i4 < 37 || i4 >= 47) {
                                            objArr4 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th) || i4 < 39 || i4 >= 40) {
                                                throw th;
                                            }
                                            i4 = 52;
                                        } else {
                                            i = 53;
                                        }
                                    } else {
                                        i = 33;
                                    }
                                    i4 = i;
                                } else {
                                    i = 53;
                                    i4 = i;
                                }
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                                i2 = 4;
                            }
                            break;
                        case -13:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = RatingCompat;
                            try {
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(11);
                                i4 = i5;
                            } catch (Throwable th5) {
                                th = th5;
                                bArr = MediaSessionCompatQueueItem;
                                s = (short) 267;
                                objArr = new Object[1];
                                a(bArr[68], s, bArr[46], objArr);
                                if (Class.forName((String) objArr[0]).isInstance(th)) {
                                    objArr2 = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr2);
                                    if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                        if (i4 >= 42) {
                                        }
                                        objArr3 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr3);
                                        if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                            break;
                                        }
                                        objArr4 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr4);
                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                        }
                                        throw th;
                                    }
                                    if (i4 >= 42) {
                                    }
                                    objArr3 = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr3);
                                    if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                        break;
                                    }
                                    objArr4 = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr4);
                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                    }
                                    throw th;
                                }
                                objArr2 = new Object[1];
                                a(bArr[68], s, bArr[46], objArr2);
                                if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                    if (i4 >= 42) {
                                    }
                                    objArr3 = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr3);
                                    if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                        break;
                                    }
                                    objArr4 = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr4);
                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                    }
                                    throw th;
                                }
                                if (i4 >= 42) {
                                }
                                objArr3 = new Object[1];
                                a(bArr[68], s, bArr[46], objArr3);
                                if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                    break;
                                }
                                objArr4 = new Object[1];
                                a(bArr[68], s, bArr[46], objArr4);
                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                }
                                throw th;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                                i2 = 4;
                            }
                            break;
                        case -12:
                            i4 = 13;
                            break;
                        case BaseCode.NOT_SUPPORT_RESOLUTION /* -11 */:
                            i4 = 24;
                            break;
                        case BaseCode.KPMS_UPDATE_FAILED /* -10 */:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(15);
                            if (r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer == 0) {
                                i5 = 23;
                            }
                            i4 = i5;
                            break;
                        case BaseCode.NO_AVAILABLE_LIB_ERROR /* -9 */:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(14);
                            RatingCompat = r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer;
                            i4 = i5;
                            break;
                        case BaseCode.SOLUTION_GET_RESPONSE_CODE_ERROR /* -8 */:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = MediaMetadataCompat;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(11);
                            i4 = i5;
                            break;
                        case BaseCode.DATA_NULL_IN_INTENT /* -7 */:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(9);
                            return (r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat;
                        case BaseCode.TRANSACTION_IS_NULL /* -6 */:
                            i4 = 25;
                            break;
                        case BaseCode.URI_IS_NULL /* -5 */:
                            i4 = 15;
                            break;
                        case BaseCode.NO_SOLUTION /* -4 */:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                            try {
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = (r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i2);
                                i4 = i5;
                            } catch (Throwable th6) {
                                th = th6;
                                bArr = MediaSessionCompatQueueItem;
                                s = (short) 267;
                                objArr = new Object[1];
                                a(bArr[68], s, bArr[46], objArr);
                                if (Class.forName((String) objArr[0]).isInstance(th)) {
                                    objArr2 = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr2);
                                    if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                        if (i4 >= 42) {
                                        }
                                        objArr3 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr3);
                                        if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                            break;
                                        }
                                        objArr4 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr4);
                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                        }
                                        throw th;
                                    }
                                    if (i4 >= 42) {
                                    }
                                    objArr3 = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr3);
                                    if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                        break;
                                    }
                                    objArr4 = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr4);
                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                    }
                                    throw th;
                                }
                                objArr2 = new Object[1];
                                a(bArr[68], s, bArr[46], objArr2);
                                if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                    if (i4 >= 42) {
                                    }
                                    objArr3 = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr3);
                                    if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                        break;
                                    }
                                    objArr4 = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr4);
                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                    }
                                    throw th;
                                }
                                if (i4 >= 42) {
                                }
                                objArr3 = new Object[1];
                                a(bArr[68], s, bArr[46], objArr3);
                                if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                    break;
                                }
                                objArr4 = new Object[1];
                                a(bArr[68], s, bArr[46], objArr4);
                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                }
                                throw th;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                                i2 = 4;
                            }
                            break;
                        case -3:
                            try {
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                Object obj = r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat;
                                try {
                                    byte[] bArr4 = MediaSessionCompatQueueItem;
                                    Object[] objArr35 = new Object[1];
                                    a(bArr4[614], (short) 730, bArr4[46], objArr35);
                                    Class<?> cls10 = Class.forName((String) objArr35[0]);
                                    byte b11 = bArr4[9];
                                    Object[] objArr36 = new Object[1];
                                    a(b11, (short) (b11 | 851), bArr4[51], objArr36);
                                    try {
                                        try {
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = cls10.getMethod((String) objArr36[0], null).invoke(obj, null);
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i2);
                                            i4 = i5;
                                        } catch (Throwable th7) {
                                            th = th7;
                                            bArr = MediaSessionCompatQueueItem;
                                            s = (short) 267;
                                            objArr = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr);
                                            if (Class.forName((String) objArr[0]).isInstance(th)) {
                                                objArr2 = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr2);
                                                if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                    if (i4 >= 42) {
                                                    }
                                                    objArr3 = new Object[1];
                                                    a(bArr[68], s, bArr[46], objArr3);
                                                    if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    objArr4 = new Object[1];
                                                    a(bArr[68], s, bArr[46], objArr4);
                                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    }
                                                    throw th;
                                                }
                                                if (i4 >= 42) {
                                                }
                                                objArr3 = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr3);
                                                if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                    break;
                                                }
                                                objArr4 = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            objArr2 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr2);
                                            if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                if (i4 >= 42) {
                                                }
                                                objArr3 = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr3);
                                                if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                    break;
                                                }
                                                objArr4 = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            if (i4 >= 42) {
                                            }
                                            objArr3 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                break;
                                            }
                                            objArr4 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                            }
                                            throw th;
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                                            i2 = 4;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        Throwable cause3 = th.getCause();
                                        if (cause3 != null) {
                                            throw cause3;
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                }
                            } catch (Throwable th10) {
                                th = th10;
                            }
                            break;
                        case -2:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = ((r8lambda2tFXStZN_MXijoyymezhxf14xPY) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat).RemoteActionCompatParcelizer();
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i2);
                            i4 = i5;
                            break;
                        case -1:
                            i4 = 9;
                            break;
                        default:
                            i4 = i5;
                            break;
                    }
                } catch (Throwable th11) {
                    th = th11;
                }
            }
        } catch (Throwable th12) {
            Throwable cause4 = th12.getCause();
            if (cause4 != null) {
                throw cause4;
            }
            throw th12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0530  */
    /* JADX WARN: Code duplicated, block: B:112:0x053d  */
    /* JADX WARN: Code duplicated, block: B:114:0x0556  */
    /* JADX WARN: Code duplicated, block: B:119:0x0561 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:122:0x057c  */
    /* JADX WARN: Code duplicated, block: B:127:0x0587 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:130:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:135:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:137:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:189:0x05c0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final void write() throws Throwable {
        byte[] bArr;
        short s;
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        Object[] objArr4;
        int i;
        r8lambda4eayLEkyCzRqunjxKNY3fxSMeyo r8lambda4eaylekyczrqunjxkny3fxsmeyo = new r8lambda4eayLEkyCzRqunjxKNY3fxSMeyo(this);
        try {
            byte[] bArr2 = MediaSessionCompatQueueItem;
            byte b = bArr2[4];
            Object[] objArr5 = new Object[1];
            a(b, (short) (b | 173), bArr2[9], objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            a(bArr2[14], (short) 787, bArr2[51], objArr6);
            char cIntValue = (char) (((Integer) cls.getMethod((String) objArr6[0], null).invoke(null, null)).intValue() >> 16);
            Object[] objArr7 = new Object[1];
            a(bArr2[6], bArr2[354], bArr2[9], objArr7);
            Class<?> cls2 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            a(bArr2[59], bArr2[164], bArr2[13], objArr8);
            int i2 = (((Long) cls2.getMethod((String) objArr8[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls2.getMethod((String) objArr8[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 151;
            try {
                Object[] objArr9 = {"", '0', 0, 0};
                Object[] objArr10 = new Object[1];
                a(bArr2[6], bArr2[11], bArr2[9], objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                byte b2 = bArr2[56];
                Object[] objArr11 = new Object[1];
                a(b2, (short) (b2 | 791), bArr2[21], objArr11);
                String str = (String) objArr11[0];
                byte b3 = bArr2[6];
                Object[] objArr12 = new Object[1];
                a(b3, (short) (b3 | 76), bArr2[46], objArr12);
                Object[] objArr13 = new Object[1];
                b(cIntValue, i2, 1188 - ((Integer) cls3.getMethod(str, Class.forName((String) objArr12[0]), Character.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr9)).intValue(), objArr13);
                String str2 = (String) objArr13[0];
                try {
                    Object[] objArr14 = {0};
                    Object[] objArr15 = new Object[1];
                    a(bArr2[6], (short) 116, bArr2[9], objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    byte b4 = bArr2[9];
                    Object[] objArr16 = new Object[1];
                    a(b4, (short) (b4 | 809), bArr2[115], objArr16);
                    char cIntValue2 = (char) ((Integer) cls4.getMethod((String) objArr16[0], Integer.TYPE).invoke(null, objArr14)).intValue();
                    try {
                        Object[] objArr17 = {0, 0};
                        Object[] objArr18 = new Object[1];
                        a(bArr2[35], (short) 624, bArr2[9], objArr18);
                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                        byte b5 = bArr2[56];
                        Object[] objArr19 = new Object[1];
                        a(b5, (short) (b5 | 803), bArr2[115], objArr19);
                        int iIntValue = 1 - ((Integer) cls5.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr17)).intValue();
                        Object[] objArr20 = {"", 0, 0};
                        Object[] objArr21 = new Object[1];
                        a(bArr2[6], bArr2[11], bArr2[9], objArr21);
                        Class<?> cls6 = Class.forName((String) objArr21[0]);
                        Object[] objArr22 = new Object[1];
                        a(bArr2[56], (short) 821, bArr2[51], objArr22);
                        String str3 = (String) objArr22[0];
                        byte b6 = bArr2[6];
                        Object[] objArr23 = new Object[1];
                        a(b6, (short) (b6 | 76), bArr2[46], objArr23);
                        Class<?>[] clsArr = {Class.forName((String) objArr23[0]), Integer.TYPE, Integer.TYPE};
                        Object[] objArr24 = new Object[1];
                        b(cIntValue2, iIntValue, 142 - ((Integer) cls6.getMethod(str3, clsArr).invoke(null, objArr20)).intValue(), objArr24);
                        Object[] objArr25 = {(String) objArr24[0]};
                        char c = 26;
                        short s2 = (short) 176;
                        Object[] objArr26 = new Object[1];
                        a(bArr2[26], s2, bArr2[46], objArr26);
                        Class<?> cls7 = Class.forName((String) objArr26[0]);
                        byte b7 = bArr2[7];
                        Object[] objArr27 = new Object[1];
                        a(b7, (short) (b7 | 232), bArr2[4], objArr27);
                        String str4 = (String) objArr27[0];
                        Object[] objArr28 = new Object[1];
                        a(bArr2[26], s2, bArr2[46], objArr28);
                        Object[] objArr29 = (Object[]) cls7.getMethod(str4, Class.forName((String) objArr28[0])).invoke(str2, objArr25);
                        int[] iArr = new int[objArr29.length];
                        int i3 = 0;
                        while (i3 < objArr29.length) {
                            try {
                                Object[] objArr30 = {objArr29[i3]};
                                byte[] bArr3 = MediaSessionCompatQueueItem;
                                byte b8 = bArr3[35];
                                Object[] objArr31 = new Object[1];
                                a(b8, (short) (b8 | 224), bArr3[46], objArr31);
                                Class<?> cls8 = Class.forName((String) objArr31[0]);
                                byte b9 = bArr3[13];
                                Object[] objArr32 = new Object[1];
                                a(b9, (short) (b9 | 250), bArr3[135], objArr32);
                                String str5 = (String) objArr32[0];
                                Object[] objArr33 = new Object[1];
                                a(bArr3[c], s2, bArr3[46], objArr33);
                                Object objInvoke = cls8.getMethod(str5, Class.forName((String) objArr33[0])).invoke(null, objArr30);
                                byte b10 = bArr3[35];
                                Object[] objArr34 = new Object[1];
                                a(b10, (short) (b10 | 224), bArr3[46], objArr34);
                                Class<?> cls9 = Class.forName((String) objArr34[0]);
                                Object[] objArr35 = new Object[1];
                                a(bArr3[356], (short) 260, bArr3[56], objArr35);
                                iArr[i3] = ((Integer) cls9.getMethod((String) objArr35[0], null).invoke(objInvoke, null)).intValue();
                                i3++;
                                c = 26;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        int i4 = 0;
                        while (true) {
                            int i5 = i4 + 1;
                            try {
                                switch (r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(iArr[i4])) {
                                    case -20:
                                        i4 = 42;
                                        break;
                                    case -19:
                                        i5 = 24;
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(24);
                                        int i6 = r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer;
                                        if (i6 != 0 && i6 == 1) {
                                            i5 = 37;
                                        }
                                        break;
                                    case -18:
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                        try {
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                            try {
                                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat.hashCode();
                                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(11);
                                            } catch (Throwable th2) {
                                                th = th2;
                                                bArr = MediaSessionCompatQueueItem;
                                                s = (short) 267;
                                                objArr = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr);
                                                if (Class.forName((String) objArr[0]).isInstance(th)) {
                                                    objArr2 = new Object[1];
                                                    a(bArr[68], s, bArr[46], objArr2);
                                                    if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                                    }
                                                    objArr3 = new Object[1];
                                                    a(bArr[68], s, bArr[46], objArr3);
                                                    if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                    }
                                                    objArr4 = new Object[1];
                                                    a(bArr[68], s, bArr[46], objArr4);
                                                    if (!Class.forName((String) objArr4[0]).isInstance(th)) {
                                                        if (i4 >= 38) {
                                                        }
                                                        throw th;
                                                    }
                                                    if (i4 >= 38) {
                                                    }
                                                    throw th;
                                                }
                                                objArr2 = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr2);
                                                if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                                }
                                                objArr3 = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr3);
                                                if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                }
                                                objArr4 = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr4);
                                                if (!Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    if (i4 >= 38) {
                                                    }
                                                    throw th;
                                                }
                                                if (i4 >= 38) {
                                                }
                                                throw th;
                                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            bArr = MediaSessionCompatQueueItem;
                                            s = (short) 267;
                                            objArr = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr);
                                            if (Class.forName((String) objArr[0]).isInstance(th) || i4 < 5 || i4 >= 20) {
                                                objArr2 = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr2);
                                                if (Class.forName((String) objArr2[0]).isInstance(th) || i4 < 9 || i4 >= 20) {
                                                    objArr3 = new Object[1];
                                                    a(bArr[68], s, bArr[46], objArr3);
                                                    if (Class.forName((String) objArr3[0]).isInstance(th) || i4 < 11 || i4 >= 12) {
                                                        objArr4 = new Object[1];
                                                        a(bArr[68], s, bArr[46], objArr4);
                                                        if (!Class.forName((String) objArr4[0]).isInstance(th) && i4 >= 17 && i4 < 18) {
                                                            i4 = 48;
                                                        } else {
                                                            if (i4 >= 38 || i4 >= 42) {
                                                                throw th;
                                                            }
                                                            i4 = 36;
                                                        }
                                                    } else {
                                                        i4 = 47;
                                                    }
                                                } else {
                                                    i4 = 47;
                                                }
                                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                                            } else {
                                                i4 = 48;
                                            }
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                                            break;
                                        }
                                        break;
                                    case -17:
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(9);
                                        throw ((Throwable) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat);
                                    case -16:
                                        i4 = 43;
                                        break;
                                    case -15:
                                        i4 = 45;
                                        break;
                                    case androidx.compose.ui.graphics.Float16.MinExponent /* -14 */:
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(15);
                                        i4 = r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer == 0 ? 35 : i5;
                                        break;
                                    case -13:
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                        try {
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(14);
                                            RatingCompat = r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            bArr = MediaSessionCompatQueueItem;
                                            s = (short) 267;
                                            objArr = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr);
                                            if (Class.forName((String) objArr[0]).isInstance(th)) {
                                                objArr2 = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr2);
                                                if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                                    break;
                                                }
                                                objArr3 = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr3);
                                                if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                    break;
                                                }
                                                objArr4 = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr4);
                                                if (!Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    if (i4 >= 38) {
                                                    }
                                                    throw th;
                                                }
                                                if (i4 >= 38) {
                                                }
                                                throw th;
                                            }
                                            objArr2 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr2);
                                            if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                                break;
                                            }
                                            objArr3 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                break;
                                            }
                                            objArr4 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr4);
                                            if (!Class.forName((String) objArr4[0]).isInstance(th)) {
                                                if (i4 >= 38) {
                                                }
                                                throw th;
                                            }
                                            if (i4 >= 38) {
                                            }
                                            throw th;
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                                        }
                                        break;
                                    case -12:
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = MediaMetadataCompat;
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(11);
                                        break;
                                    case BaseCode.NOT_SUPPORT_RESOLUTION /* -11 */:
                                        return;
                                    case BaseCode.KPMS_UPDATE_FAILED /* -10 */:
                                        i4 = 1;
                                        break;
                                    case BaseCode.NO_AVAILABLE_LIB_ERROR /* -9 */:
                                        i4 = 26;
                                        break;
                                    case BaseCode.SOLUTION_GET_RESPONSE_CODE_ERROR /* -8 */:
                                        try {
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 4;
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                            androidx.room.RoomDatabase roomDatabase = (androidx.room.RoomDatabase) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat;
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(14);
                                            boolean z = r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer != 0;
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(14);
                                            boolean z2 = r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer != 0;
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = TuplesKt.write(roomDatabase, z, z2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat);
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(4);
                                        } catch (Throwable th5) {
                                            th = th5;
                                            bArr = MediaSessionCompatQueueItem;
                                            s = (short) 267;
                                            objArr = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr);
                                            if (Class.forName((String) objArr[0]).isInstance(th)) {
                                                objArr2 = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr2);
                                                if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                                    break;
                                                }
                                                objArr3 = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr3);
                                                if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                    break;
                                                }
                                                objArr4 = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr4);
                                                if (!Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    if (i4 >= 38) {
                                                    }
                                                    throw th;
                                                }
                                                if (i4 >= 38) {
                                                }
                                                throw th;
                                            }
                                            objArr2 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr2);
                                            if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                                break;
                                            }
                                            objArr3 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                break;
                                            }
                                            objArr4 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr4);
                                            if (!Class.forName((String) objArr4[0]).isInstance(th)) {
                                                if (i4 >= 38) {
                                                }
                                                throw th;
                                            }
                                            if (i4 >= 38) {
                                            }
                                            throw th;
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                                        }
                                        break;
                                    case BaseCode.DATA_NULL_IN_INTENT /* -7 */:
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(14);
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = new accessgetTextCentercp(r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer);
                                        i = 4;
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i);
                                        break;
                                    case BaseCode.TRANSACTION_IS_NULL /* -6 */:
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = ((accessgetBottomcp) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat).read;
                                        i = 4;
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i);
                                        break;
                                    case BaseCode.URI_IS_NULL /* -5 */:
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = (accessgetBottomcp) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat;
                                        i = 4;
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i);
                                        break;
                                    case BaseCode.NO_SOLUTION /* -4 */:
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = ((r8lambda2tFXStZN_MXijoyymezhxf14xPY) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat).read();
                                        i = 4;
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i);
                                        break;
                                    case -3:
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 2;
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                        Object obj = r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat;
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                        try {
                                            Object[] objArr36 = {r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat};
                                            byte[] bArr4 = MediaSessionCompatQueueItem;
                                            Object[] objArr37 = new Object[1];
                                            a(bArr4[614], (short) 730, bArr4[46], objArr37);
                                            Class<?> cls10 = Class.forName((String) objArr37[0]);
                                            byte b11 = bArr4[9];
                                            Object[] objArr38 = new Object[1];
                                            a(b11, (short) (b11 | 831), bArr4[4], objArr38);
                                            String str6 = (String) objArr38[0];
                                            Object[] objArr39 = new Object[1];
                                            a(bArr4[26], (short) 772, bArr4[46], objArr39);
                                            cls10.getMethod(str6, Class.forName((String) objArr39[0])).invoke(obj, objArr36);
                                        } catch (Throwable th6) {
                                            Throwable cause2 = th6.getCause();
                                            if (cause2 == null) {
                                                throw th6;
                                            }
                                            throw cause2;
                                        }
                                        break;
                                    case -2:
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = ((r8lambda2tFXStZN_MXijoyymezhxf14xPY) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat).RemoteActionCompatParcelizer();
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(4);
                                        break;
                                    case -1:
                                        i4 = 20;
                                        break;
                                    default:
                                        break;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                            }
                        }
                    } catch (Throwable th8) {
                        Throwable cause3 = th8.getCause();
                        if (cause3 == null) {
                            throw th8;
                        }
                        throw cause3;
                    }
                } catch (Throwable th9) {
                    Throwable cause4 = th9.getCause();
                    if (cause4 == null) {
                        throw th9;
                    }
                    throw cause4;
                }
            } catch (Throwable th10) {
                Throwable cause5 = th10.getCause();
                if (cause5 == null) {
                    throw th10;
                }
                throw cause5;
            }
        } catch (Throwable th11) {
            Throwable cause6 = th11.getCause();
            if (cause6 == null) {
                throw th11;
            }
            throw cause6;
        }
    }

    private static final AtomicReference write(r8lambda2tFXStZN_MXijoyymezhxf14xPY r8lambda2tfxstzn_mxijoyymezhxf14xpy) throws Throwable {
        char c;
        int i;
        Object objMediaMetadataCompat;
        r8lambda4eayLEkyCzRqunjxKNY3fxSMeyo r8lambda4eaylekyczrqunjxkny3fxsmeyo = new r8lambda4eayLEkyCzRqunjxKNY3fxSMeyo(r8lambda2tfxstzn_mxijoyymezhxf14xpy);
        try {
            byte[] bArr = MediaSessionCompatQueueItem;
            Object[] objArr = new Object[1];
            a(bArr[142], (short) 685, bArr[9], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b = bArr[14];
            Object[] objArr2 = new Object[1];
            a(b, (short) (b | 692), bArr[51], objArr2);
            String str = (String) objArr2[0];
            short s = (short) 176;
            Object[] objArr3 = new Object[1];
            a(bArr[26], s, bArr[46], objArr3);
            char cIntValue = (char) (24191 - ((Integer) cls.getMethod(str, Class.forName((String) objArr3[0])).invoke(null, "")).intValue());
            short s2 = (short) 285;
            Object[] objArr4 = new Object[1];
            a(bArr[434], s2, bArr[9], objArr4);
            Class<?> cls2 = Class.forName((String) objArr4[0]);
            short s3 = (short) 670;
            Object[] objArr5 = new Object[1];
            a(bArr[26], s3, bArr[51], objArr5);
            int iIntValue = (((Integer) cls2.getMethod((String) objArr5[0], null).invoke(null, null)).intValue() >> 8) + 84;
            Object[] objArr6 = {0, 0};
            Object[] objArr7 = new Object[1];
            a(bArr[33], (short) (PlaybackStateCompat | androidx.compose.ui.graphics.Fields.RotationX), bArr[9], objArr7);
            Class<?> cls3 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            a(bArr[86], (short) 386, bArr[51], objArr8);
            Object[] objArr9 = new Object[1];
            b(cIntValue, iIntValue, (((Long) cls3.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr6)).longValue() > 0L ? 1 : (((Long) cls3.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr6)).longValue() == 0L ? 0 : -1)) + 1106, objArr9);
            String str2 = (String) objArr9[0];
            Object[] objArr10 = new Object[1];
            a(bArr[6], bArr[11], bArr[9], objArr10);
            Class<?> cls4 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            a(bArr[13], (short) 89, bArr[56], objArr11);
            String str3 = (String) objArr11[0];
            byte b2 = bArr[6];
            Object[] objArr12 = new Object[1];
            a(b2, (short) (b2 | 76), bArr[46], objArr12);
            byte b3 = bArr[6];
            Object[] objArr13 = new Object[1];
            a(b3, (short) (b3 | 76), bArr[46], objArr13);
            char cIntValue2 = (char) ((Integer) cls4.getMethod(str3, Class.forName((String) objArr12[0]), Class.forName((String) objArr13[0]), Integer.TYPE, Integer.TYPE).invoke(null, "", "", 0, 0)).intValue();
            Object[] objArr14 = new Object[1];
            a(bArr[434], s2, bArr[9], objArr14);
            Class<?> cls5 = Class.forName((String) objArr14[0]);
            Object[] objArr15 = new Object[1];
            a(bArr[26], s3, bArr[51], objArr15);
            int iIntValue2 = (((Integer) cls5.getMethod((String) objArr15[0], null).invoke(null, null)).intValue() >> 8) + 1;
            byte b4 = bArr[4];
            Object[] objArr16 = new Object[1];
            a(b4, (short) (b4 | 173), bArr[9], objArr16);
            Class<?> cls6 = Class.forName((String) objArr16[0]);
            Object[] objArr17 = new Object[1];
            a(bArr[35], (short) 714, bArr[14], objArr17);
            String str4 = (String) objArr17[0];
            Object[] objArr18 = new Object[1];
            a(bArr[26], s, bArr[46], objArr18);
            Method method = cls6.getMethod(str4, Class.forName((String) objArr18[0]));
            Object[] objArr19 = new Object[1];
            b(cIntValue2, iIntValue2, ((Integer) method.invoke(null, "")).intValue() + 142, objArr19);
            Object[] objArr20 = {(String) objArr19[0]};
            Object[] objArr21 = new Object[1];
            a(bArr[26], s, bArr[46], objArr21);
            Class<?> cls7 = Class.forName((String) objArr21[0]);
            byte b5 = bArr[7];
            Object[] objArr22 = new Object[1];
            a(b5, (short) (b5 | 232), bArr[4], objArr22);
            String str5 = (String) objArr22[0];
            Object[] objArr23 = new Object[1];
            a(bArr[26], s, bArr[46], objArr23);
            Object[] objArr24 = (Object[]) cls7.getMethod(str5, Class.forName((String) objArr23[0])).invoke(str2, objArr20);
            int[] iArr = new int[objArr24.length];
            for (int i2 = 0; i2 < objArr24.length; i2++) {
                Object[] objArr25 = {objArr24[i2]};
                byte[] bArr2 = MediaSessionCompatQueueItem;
                byte b6 = bArr2[35];
                Object[] objArr26 = new Object[1];
                a(b6, (short) (b6 | 224), bArr2[46], objArr26);
                Class<?> cls8 = Class.forName((String) objArr26[0]);
                byte b7 = bArr2[13];
                Object[] objArr27 = new Object[1];
                a(b7, (short) (b7 | 250), bArr2[135], objArr27);
                String str6 = (String) objArr27[0];
                Object[] objArr28 = new Object[1];
                a(bArr2[26], s, bArr2[46], objArr28);
                Object objInvoke = cls8.getMethod(str6, Class.forName((String) objArr28[0])).invoke(null, objArr25);
                byte b8 = bArr2[35];
                Object[] objArr29 = new Object[1];
                a(b8, (short) (b8 | 224), bArr2[46], objArr29);
                Class<?> cls9 = Class.forName((String) objArr29[0]);
                Object[] objArr30 = new Object[1];
                a(bArr2[356], (short) 260, bArr2[56], objArr30);
                iArr[i2] = ((Integer) cls9.getMethod((String) objArr30[0], null).invoke(objInvoke, null)).intValue();
            }
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                switch (r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(iArr[i3])) {
                    case -13:
                        i4 = 15;
                        i3 = i4;
                        break;
                    case -12:
                        i4 = 27;
                        i3 = i4;
                        break;
                    case BaseCode.NOT_SUPPORT_RESOLUTION /* -11 */:
                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(20);
                        if (r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer == 0) {
                            i4 = 26;
                        }
                        i3 = i4;
                        break;
                    case BaseCode.KPMS_UPDATE_FAILED /* -10 */:
                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(14);
                        MediaMetadataCompat = r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer;
                        i3 = i4;
                        break;
                    case BaseCode.NO_AVAILABLE_LIB_ERROR /* -9 */:
                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = RatingCompat;
                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(11);
                        i3 = i4;
                        break;
                    case BaseCode.SOLUTION_GET_RESPONSE_CODE_ERROR /* -8 */:
                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(9);
                        return (AtomicReference) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat;
                    case BaseCode.DATA_NULL_IN_INTENT /* -7 */:
                        i3 = 1;
                        break;
                    case BaseCode.TRANSACTION_IS_NULL /* -6 */:
                        i3 = 17;
                        break;
                    case BaseCode.URI_IS_NULL /* -5 */:
                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                        Object[] objArr31 = {r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat};
                        byte[] bArr3 = MediaSessionCompatQueueItem;
                        Object[] objArr32 = new Object[1];
                        a(bArr3[614], (short) 730, bArr3[46], objArr32);
                        Class<?> cls10 = Class.forName((String) objArr32[0]);
                        Object[] objArr33 = new Object[1];
                        a(bArr3[26], (short) 772, bArr3[46], objArr33);
                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = cls10.getDeclaredConstructor(Class.forName((String) objArr33[0])).newInstance(objArr31);
                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(4);
                        i3 = i4;
                        break;
                    case BaseCode.NO_SOLUTION /* -4 */:
                        c = 2;
                        i = 4;
                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                        objMediaMetadataCompat = ((r8lambda2tFXStZN_MXijoyymezhxf14xPY) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat).MediaMetadataCompat();
                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = objMediaMetadataCompat;
                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i);
                        i3 = i4;
                        break;
                    case -3:
                        c = 2;
                        i = 4;
                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                        objMediaMetadataCompat = r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat.getClass();
                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = objMediaMetadataCompat;
                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i);
                        i3 = i4;
                        break;
                    case -2:
                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                        c = 2;
                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = ((r8lambda2tFXStZN_MXijoyymezhxf14xPY) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat).serializer;
                        i = 4;
                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i);
                        i3 = i4;
                        break;
                    case -1:
                        i3 = 11;
                        break;
                    default:
                        i3 = i4;
                        break;
                }
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x058e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0596  */
    /* JADX WARN: Code duplicated, block: B:111:0x059c  */
    /* JADX WARN: Code duplicated, block: B:113:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:117:0x05be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:123:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:129:0x0605  */
    /* JADX WARN: Code duplicated, block: B:133:0x060e  */
    /* JADX WARN: Code duplicated, block: B:135:0x0612  */
    /* JADX WARN: Code duplicated, block: B:174:0x0620 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    private static final r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA RemoteActionCompatParcelizer(r8lambda2tFXStZN_MXijoyymezhxf14xPY r8lambda2tfxstzn_mxijoyymezhxf14xpy) throws Throwable {
        byte[] bArr;
        short s;
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        Object[] objArr4;
        int i;
        r8lambda4eayLEkyCzRqunjxKNY3fxSMeyo r8lambda4eaylekyczrqunjxkny3fxsmeyo = new r8lambda4eayLEkyCzRqunjxKNY3fxSMeyo(r8lambda2tfxstzn_mxijoyymezhxf14xpy);
        try {
            byte[] bArr2 = MediaSessionCompatQueueItem;
            short s2 = (short) 116;
            Object[] objArr5 = new Object[1];
            a(bArr2[6], s2, bArr2[9], objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            byte b = bArr2[7];
            Object[] objArr6 = new Object[1];
            a(b, (short) (b | 600), bArr2[9], objArr6);
            char cIntValue = (char) ((Integer) cls.getMethod((String) objArr6[0], Integer.TYPE).invoke(null, 0)).intValue();
            short s3 = (short) 285;
            Object[] objArr7 = new Object[1];
            a(bArr2[434], s3, bArr2[9], objArr7);
            Class<?> cls2 = Class.forName((String) objArr7[0]);
            byte b2 = bArr2[68];
            Object[] objArr8 = new Object[1];
            a(b2, (short) (b2 | 590), bArr2[51], objArr8);
            int iIntValue = 320 - (((Integer) cls2.getMethod((String) objArr8[0], null).invoke(null, null)).intValue() >> 16);
            Object[] objArr9 = {0, 0, 0};
            Object[] objArr10 = new Object[1];
            a(bArr2[35], (short) 624, bArr2[9], objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            a(bArr2[68], (short) 640, bArr2[115], objArr11);
            Object[] objArr12 = new Object[1];
            b(cIntValue, iIntValue, ((Integer) cls3.getMethod((String) objArr11[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr9)).intValue() + 785, objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            a(bArr2[434], s3, bArr2[9], objArr13);
            Class<?> cls4 = Class.forName((String) objArr13[0]);
            Object[] objArr14 = new Object[1];
            a(bArr2[56], (short) 658, bArr2[51], objArr14);
            char cIntValue2 = (char) (((Integer) cls4.getMethod((String) objArr14[0], null).invoke(null, null)).intValue() >> 16);
            Object[] objArr15 = new Object[1];
            a(bArr2[6], s2, bArr2[9], objArr15);
            Class<?> cls5 = Class.forName((String) objArr15[0]);
            byte b3 = bArr2[9];
            Object[] objArr16 = new Object[1];
            a(b3, (short) (b3 | 668), bArr2[115], objArr16);
            int iIntValue2 = ((Integer) cls5.getMethod((String) objArr16[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, 0, 0, 0)).intValue() + 16777217;
            Object[] objArr17 = new Object[1];
            a(bArr2[434], s3, bArr2[9], objArr17);
            Class<?> cls6 = Class.forName((String) objArr17[0]);
            char c = 26;
            Object[] objArr18 = new Object[1];
            a(bArr2[26], (short) 670, bArr2[51], objArr18);
            Object[] objArr19 = new Object[1];
            b(cIntValue2, iIntValue2, (((Integer) cls6.getMethod((String) objArr18[0], null).invoke(null, null)).intValue() >> 8) + 142, objArr19);
            Object[] objArr20 = {(String) objArr19[0]};
            short s4 = (short) 176;
            Object[] objArr21 = new Object[1];
            a(bArr2[26], s4, bArr2[46], objArr21);
            Class<?> cls7 = Class.forName((String) objArr21[0]);
            byte b4 = bArr2[7];
            Object[] objArr22 = new Object[1];
            a(b4, (short) (b4 | 232), bArr2[4], objArr22);
            String str2 = (String) objArr22[0];
            Object[] objArr23 = new Object[1];
            a(bArr2[26], s4, bArr2[46], objArr23);
            Object[] objArr24 = (Object[]) cls7.getMethod(str2, Class.forName((String) objArr23[0])).invoke(str, objArr20);
            int[] iArr = new int[objArr24.length];
            int i2 = 0;
            while (i2 < objArr24.length) {
                Object[] objArr25 = {objArr24[i2]};
                byte[] bArr3 = MediaSessionCompatQueueItem;
                byte b5 = bArr3[35];
                Object[] objArr26 = new Object[1];
                a(b5, (short) (b5 | 224), bArr3[46], objArr26);
                Class<?> cls8 = Class.forName((String) objArr26[0]);
                byte b6 = bArr3[13];
                Object[] objArr27 = new Object[1];
                a(b6, (short) (b6 | 250), bArr3[135], objArr27);
                String str3 = (String) objArr27[0];
                Object[] objArr28 = new Object[1];
                a(bArr3[c], s4, bArr3[46], objArr28);
                Object objInvoke = cls8.getMethod(str3, Class.forName((String) objArr28[0])).invoke(null, objArr25);
                byte b7 = bArr3[35];
                Object[] objArr29 = new Object[1];
                a(b7, (short) (b7 | 224), bArr3[46], objArr29);
                Class<?> cls9 = Class.forName((String) objArr29[0]);
                Object[] objArr30 = new Object[1];
                a(bArr3[356], (short) 260, bArr3[56], objArr30);
                iArr[i2] = ((Integer) cls9.getMethod((String) objArr30[0], null).invoke(objInvoke, null)).intValue();
                i2++;
                c = 26;
            }
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                try {
                    switch (r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(iArr[i3])) {
                        case -37:
                            i3 = 91;
                            break;
                        case -36:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(24);
                            i4 = r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer != 0 ? 65 : 52;
                            i3 = i4;
                            break;
                        case -35:
                            i3 = 86;
                            break;
                        case -34:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(24);
                            i4 = r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer != 0 ? 50 : 81;
                            i3 = i4;
                            break;
                        case -33:
                            i3 = 87;
                            break;
                        case -32:
                            i3 = 89;
                            break;
                        case -31:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(20);
                            if (r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer == 0) {
                                i4 = 79;
                            }
                            i3 = i4;
                            break;
                        case -30:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                            try {
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(14);
                                MediaMetadataCompat = r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer;
                                i3 = i4;
                            } catch (Throwable th) {
                                th = th;
                                bArr = MediaSessionCompatQueueItem;
                                s = (short) 267;
                                objArr = new Object[1];
                                a(bArr[68], s, bArr[46], objArr);
                                if (Class.forName((String) objArr[0]).isInstance(th)) {
                                    objArr2 = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr2);
                                    if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                        if (i3 >= 66) {
                                            break;
                                        }
                                        objArr3 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr3);
                                        if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                            break;
                                        }
                                        byte b8 = bArr[68];
                                        byte b9 = bArr[46];
                                        objArr4 = new Object[1];
                                        a(b8, s, b9, objArr4);
                                        if (!Class.forName((String) objArr4[0]).isInstance(th)) {
                                            if (i3 >= 82) {
                                            }
                                            throw th;
                                        }
                                        if (i3 >= 82) {
                                        }
                                        throw th;
                                    }
                                    if (i3 >= 66) {
                                        break;
                                    }
                                    objArr3 = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr3);
                                    if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                        break;
                                    }
                                    byte b10 = bArr[68];
                                    byte b11 = bArr[46];
                                    objArr4 = new Object[1];
                                    a(b10, s, b11, objArr4);
                                    if (!Class.forName((String) objArr4[0]).isInstance(th)) {
                                        if (i3 >= 82) {
                                        }
                                        throw th;
                                    }
                                    if (i3 >= 82) {
                                    }
                                    throw th;
                                }
                                objArr2 = new Object[1];
                                a(bArr[68], s, bArr[46], objArr2);
                                if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                    if (i3 >= 66) {
                                        break;
                                    }
                                    objArr3 = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr3);
                                    if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                        break;
                                    }
                                    byte b12 = bArr[68];
                                    byte b13 = bArr[46];
                                    objArr4 = new Object[1];
                                    a(b12, s, b13, objArr4);
                                    if (!Class.forName((String) objArr4[0]).isInstance(th)) {
                                        if (i3 >= 82) {
                                        }
                                        throw th;
                                    }
                                    if (i3 >= 82) {
                                    }
                                    throw th;
                                }
                                if (i3 >= 66) {
                                    break;
                                }
                                objArr3 = new Object[1];
                                a(bArr[68], s, bArr[46], objArr3);
                                if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                    break;
                                }
                                byte b14 = bArr[68];
                                byte b15 = bArr[46];
                                objArr4 = new Object[1];
                                a(b14, s, b15, objArr4);
                                if (!Class.forName((String) objArr4[0]).isInstance(th)) {
                                    if (i3 >= 82) {
                                    }
                                    throw th;
                                }
                                if (i3 >= 82) {
                                }
                                throw th;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                            }
                            break;
                        case -29:
                            try {
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = RatingCompat;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(11);
                                i3 = i4;
                            } catch (Throwable th2) {
                                th = th2;
                                bArr = MediaSessionCompatQueueItem;
                                s = (short) 267;
                                objArr = new Object[1];
                                a(bArr[68], s, bArr[46], objArr);
                                if (Class.forName((String) objArr[0]).isInstance(th) || i3 < 54 || i3 >= 55) {
                                    objArr2 = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr2);
                                    if (!Class.forName((String) objArr2[0]).isInstance(th) && i3 >= 58 && i3 < 64) {
                                        i3 = 97;
                                    } else if (i3 >= 66 || i3 >= 70) {
                                        objArr3 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr3);
                                        if (Class.forName((String) objArr3[0]).isInstance(th) || i3 < 70 || i3 >= 80) {
                                            byte b16 = bArr[68];
                                            byte b17 = bArr[46];
                                            objArr4 = new Object[1];
                                            a(b16, s, b17, objArr4);
                                            if (!Class.forName((String) objArr4[0]).isInstance(th) && i3 >= 74 && i3 < 80) {
                                                i3 = 96;
                                            } else {
                                                if (i3 >= 82 || i3 >= 86) {
                                                    throw th;
                                                }
                                                i3 = 80;
                                            }
                                        } else {
                                            i3 = 97;
                                        }
                                    } else {
                                        i3 = 64;
                                    }
                                } else {
                                    i3 = 97;
                                }
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                            }
                            break;
                        case -28:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(9);
                            throw ((Throwable) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat);
                        case -27:
                            i3 = 92;
                            break;
                        case -26:
                            i3 = 94;
                            break;
                        case -25:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(15);
                            if (r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer == 0) {
                                i4 = 63;
                            }
                            i3 = i4;
                            break;
                        case -24:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(14);
                            RatingCompat = r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer;
                            i3 = i4;
                            break;
                        case -23:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = MediaMetadataCompat;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(11);
                            i3 = i4;
                            break;
                        case -22:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(9);
                            return (r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat;
                        case -21:
                            i3 = 1;
                            break;
                        case -20:
                            i3 = 70;
                            break;
                        case -19:
                            i3 = 54;
                            break;
                        case -18:
                            try {
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 5;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(73);
                                long j = r8lambda4eaylekyczrqunjxkny3fxsmeyo.read;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(73);
                                long j2 = r8lambda4eaylekyczrqunjxkny3fxsmeyo.read;
                                try {
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                    String str4 = (String) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                    String str5 = (String) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = new r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA(j, j2, str4, str5, (String) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat);
                                    try {
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(4);
                                        i3 = i4;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        bArr = MediaSessionCompatQueueItem;
                                        s = (short) 267;
                                        objArr = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr);
                                        if (Class.forName((String) objArr[0]).isInstance(th)) {
                                            objArr2 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr2);
                                            if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                if (i3 >= 66) {
                                                    break;
                                                }
                                                objArr3 = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr3);
                                                if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b18 = bArr[68];
                                                byte b19 = bArr[46];
                                                objArr4 = new Object[1];
                                                a(b18, s, b19, objArr4);
                                                if (!Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    if (i3 >= 82) {
                                                    }
                                                    throw th;
                                                }
                                                if (i3 >= 82) {
                                                }
                                                throw th;
                                            }
                                            if (i3 >= 66) {
                                                break;
                                            }
                                            objArr3 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b110 = bArr[68];
                                            byte b111 = bArr[46];
                                            objArr4 = new Object[1];
                                            a(b110, s, b111, objArr4);
                                            if (!Class.forName((String) objArr4[0]).isInstance(th)) {
                                                if (i3 >= 82) {
                                                }
                                                throw th;
                                            }
                                            if (i3 >= 82) {
                                            }
                                            throw th;
                                        }
                                        objArr2 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr2);
                                        if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                            if (i3 >= 66) {
                                                break;
                                            }
                                            objArr3 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b112 = bArr[68];
                                            byte b113 = bArr[46];
                                            objArr4 = new Object[1];
                                            a(b112, s, b113, objArr4);
                                            if (!Class.forName((String) objArr4[0]).isInstance(th)) {
                                                if (i3 >= 82) {
                                                }
                                                throw th;
                                            }
                                            if (i3 >= 82) {
                                            }
                                            throw th;
                                        }
                                        if (i3 >= 66) {
                                            break;
                                        }
                                        objArr3 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr3);
                                        if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                            break;
                                        }
                                        byte b114 = bArr[68];
                                        byte b115 = bArr[46];
                                        objArr4 = new Object[1];
                                        a(b114, s, b115, objArr4);
                                        if (!Class.forName((String) objArr4[0]).isInstance(th)) {
                                            if (i3 >= 82) {
                                            }
                                            throw th;
                                        }
                                        if (i3 >= 82) {
                                        }
                                        throw th;
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    bArr = MediaSessionCompatQueueItem;
                                    s = (short) 267;
                                    objArr = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr);
                                    if (Class.forName((String) objArr[0]).isInstance(th)) {
                                        objArr2 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr2);
                                        if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                            if (i3 >= 66) {
                                                break;
                                            }
                                            objArr3 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b116 = bArr[68];
                                            byte b117 = bArr[46];
                                            objArr4 = new Object[1];
                                            a(b116, s, b117, objArr4);
                                            if (!Class.forName((String) objArr4[0]).isInstance(th)) {
                                                if (i3 >= 82) {
                                                }
                                                throw th;
                                            }
                                            if (i3 >= 82) {
                                            }
                                            throw th;
                                        }
                                        if (i3 >= 66) {
                                            break;
                                        }
                                        objArr3 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr3);
                                        if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                            break;
                                        }
                                        byte b118 = bArr[68];
                                        byte b119 = bArr[46];
                                        objArr4 = new Object[1];
                                        a(b118, s, b119, objArr4);
                                        if (!Class.forName((String) objArr4[0]).isInstance(th)) {
                                            if (i3 >= 82) {
                                            }
                                            throw th;
                                        }
                                        if (i3 >= 82) {
                                        }
                                        throw th;
                                    }
                                    objArr2 = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr2);
                                    if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                        if (i3 >= 66) {
                                            break;
                                        }
                                        objArr3 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr3);
                                        if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                            break;
                                        }
                                        byte b1110 = bArr[68];
                                        byte b1111 = bArr[46];
                                        objArr4 = new Object[1];
                                        a(b1110, s, b1111, objArr4);
                                        if (!Class.forName((String) objArr4[0]).isInstance(th)) {
                                            if (i3 >= 82) {
                                            }
                                            throw th;
                                        }
                                        if (i3 >= 82) {
                                        }
                                        throw th;
                                    }
                                    if (i3 >= 66) {
                                        break;
                                    }
                                    objArr3 = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr3);
                                    if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                        break;
                                    }
                                    byte b1112 = bArr[68];
                                    byte b1113 = bArr[46];
                                    objArr4 = new Object[1];
                                    a(b1112, s, b1113, objArr4);
                                    if (!Class.forName((String) objArr4[0]).isInstance(th)) {
                                        if (i3 >= 82) {
                                        }
                                        throw th;
                                    }
                                    if (i3 >= 82) {
                                    }
                                    throw th;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                                }
                            } catch (Throwable th5) {
                                th = th5;
                            }
                            break;
                        case -17:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.serializer = ((getTextCenterJ6kI3mc) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat).RemoteActionCompatParcelizer;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(66);
                            i3 = i4;
                            break;
                        case -16:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = ((getTextCenterJ6kI3mc) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat).serializer;
                            i = 4;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i);
                            i3 = i4;
                            break;
                        case -15:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.serializer = ((getTextCenterJ6kI3mc) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat).MediaBrowserCompatMediaItem;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(66);
                            i3 = i4;
                            break;
                        case androidx.compose.ui.graphics.Float16.MinExponent /* -14 */:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = ((getTextCenterJ6kI3mc) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat).write;
                            i = 4;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i);
                            i3 = i4;
                            break;
                        case -13:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = ((getTextCenterJ6kI3mc) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat).read;
                            i = 4;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i);
                            i3 = i4;
                            break;
                        case -12:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat.getClass();
                            i = 4;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i);
                            i3 = i4;
                            break;
                        case BaseCode.NOT_SUPPORT_RESOLUTION /* -11 */:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = ((r8lambda2tFXStZN_MXijoyymezhxf14xPY) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat).IconCompatParcelizer;
                            i = 4;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i);
                            i3 = i4;
                            break;
                        case BaseCode.KPMS_UPDATE_FAILED /* -10 */:
                            i3 = 44;
                            break;
                        case BaseCode.NO_AVAILABLE_LIB_ERROR /* -9 */:
                            i3 = 21;
                            break;
                        case BaseCode.SOLUTION_GET_RESPONSE_CODE_ERROR /* -8 */:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(64);
                            if (r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer == 0) {
                                i4 = 20;
                            }
                            i3 = i4;
                            break;
                        case BaseCode.DATA_NULL_IN_INTENT /* -7 */:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = (getTextCenterJ6kI3mc) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat;
                            i = 4;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i);
                            i3 = i4;
                            break;
                        case BaseCode.TRANSACTION_IS_NULL /* -6 */:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 4;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                            androidx.room.RoomDatabase roomDatabase = (androidx.room.RoomDatabase) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(14);
                            boolean z = r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer != 0;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(14);
                            boolean z2 = r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer != 0;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = TuplesKt.write(roomDatabase, z, z2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat);
                            i = 4;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i);
                            i3 = i4;
                            break;
                        case BaseCode.URI_IS_NULL /* -5 */:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(14);
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = new MapApiError$$ExternalSyntheticLambda1(r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer);
                            i = 4;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i);
                            i3 = i4;
                            break;
                        case BaseCode.NO_SOLUTION /* -4 */:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = ((accessgetBottomcp) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat).read;
                            i = 4;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i);
                            i3 = i4;
                            break;
                        case -3:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = (accessgetBottomcp) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat;
                            i = 4;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i);
                            i3 = i4;
                            break;
                        case -2:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = ((r8lambda2tFXStZN_MXijoyymezhxf14xPY) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat).read();
                            i = 4;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i);
                            i3 = i4;
                            break;
                        case -1:
                            i3 = 46;
                            break;
                        default:
                            i3 = i4;
                            break;
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            }
        } catch (Throwable th7) {
            Throwable cause = th7.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:161:0x06bc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:162:0x06be  */
    /* JADX WARN: Code duplicated, block: B:163:0x06c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:164:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:167:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:169:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:174:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:177:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:194:0x071b  */
    /* JADX WARN: Code duplicated, block: B:198:0x0723  */
    /* JADX WARN: Code duplicated, block: B:199:0x0726  */
    /* JADX WARN: Code duplicated, block: B:201:0x0741  */
    /* JADX WARN: Code duplicated, block: B:208:0x074e  */
    /* JADX WARN: Code duplicated, block: B:305:0x075d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x04e3 A[Catch: all -> 0x051a, TryCatch #15 {all -> 0x051a, blocks: (B:82:0x04dd, B:84:0x04e3, B:85:0x04e4, B:88:0x04f9, B:89:0x0508, B:90:0x0509), top: B:253:0x0509 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x04e4 A[Catch: all -> 0x051a, TryCatch #15 {all -> 0x051a, blocks: (B:82:0x04dd, B:84:0x04e3, B:85:0x04e4, B:88:0x04f9, B:89:0x0508, B:90:0x0509), top: B:253:0x0509 }] */
    private final r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA MediaMetadataCompat() throws Throwable {
        int i;
        int i2;
        byte[] bArr;
        short s;
        Object[] objArr;
        Object[] objArr2;
        Throwable cause;
        int i3;
        r8lambda4eayLEkyCzRqunjxKNY3fxSMeyo r8lambda4eaylekyczrqunjxkny3fxsmeyo = new r8lambda4eayLEkyCzRqunjxKNY3fxSMeyo(this);
        try {
            byte[] bArr2 = MediaSessionCompatQueueItem;
            Object[] objArr3 = new Object[1];
            a(bArr2[434], (short) 285, bArr2[9], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr2[6];
            int i4 = PlaybackStateCompat;
            Object[] objArr4 = new Object[1];
            a(b, (short) (i4 | 408), bArr2[51], objArr4);
            char c = (char) (50445 - (((Long) cls.getMethod((String) objArr4[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls.getMethod((String) objArr4[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1)));
            Object[] objArr5 = {0, 0};
            Object[] objArr6 = new Object[1];
            a(bArr2[33], (short) (i4 | androidx.compose.ui.graphics.Fields.RotationX), bArr2[9], objArr6);
            Class<?> cls2 = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            a(bArr2[86], (short) 386, bArr2[51], objArr7);
            int i5 = 395 - (((Long) cls2.getMethod((String) objArr7[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr5)).longValue() > 0L ? 1 : (((Long) cls2.getMethod((String) objArr7[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr5)).longValue() == 0L ? 0 : -1));
            Object[] objArr8 = {"", '0', 0, 0};
            Object[] objArr9 = new Object[1];
            a(bArr2[6], bArr2[11], bArr2[9], objArr9);
            Class<?> cls3 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            a(bArr2[13], (short) 89, bArr2[56], objArr10);
            String str = (String) objArr10[0];
            byte b2 = bArr2[6];
            Object[] objArr11 = new Object[1];
            a(b2, (short) (b2 | 76), bArr2[46], objArr11);
            Class<?>[] clsArr = {Class.forName((String) objArr11[0]), Character.TYPE, Integer.TYPE, Integer.TYPE};
            Object[] objArr12 = new Object[1];
            b(c, i5, ((Integer) cls3.getMethod(str, clsArr).invoke(null, objArr8)).intValue() + 390, objArr12);
            String str2 = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            a(bArr2[6], bArr2[354], bArr2[9], objArr13);
            Class<?> cls4 = Class.forName((String) objArr13[0]);
            Object[] objArr14 = new Object[1];
            a(bArr2[59], bArr2[164], bArr2[13], objArr14);
            char c2 = (char) ((((Long) cls4.getMethod((String) objArr14[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls4.getMethod((String) objArr14[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1)) - 1);
            Object[] objArr15 = {0};
            Object[] objArr16 = new Object[1];
            a(bArr2[33], (short) (i4 | androidx.compose.ui.graphics.Fields.RotationX), bArr2[9], objArr16);
            Class<?> cls5 = Class.forName((String) objArr16[0]);
            Object[] objArr17 = new Object[1];
            a(bArr2[86], (short) 527, bArr2[51], objArr17);
            int i6 = (((Long) cls5.getMethod((String) objArr17[0], Integer.TYPE).invoke(null, objArr15)).longValue() > 0L ? 1 : (((Long) cls5.getMethod((String) objArr17[0], Integer.TYPE).invoke(null, objArr15)).longValue() == 0L ? 0 : -1)) + 1;
            try {
                Object[] objArr18 = {Float.valueOf(0.0f), Float.valueOf(0.0f)};
                Object[] objArr19 = new Object[1];
                a(bArr2[28], (short) 551, bArr2[9], objArr19);
                Class<?> cls6 = Class.forName((String) objArr19[0]);
                Object[] objArr20 = new Object[1];
                a(bArr2[27], (short) 573, bArr2[21], objArr20);
                int i7 = (((Float) cls6.getMethod((String) objArr20[0], Float.TYPE, Float.TYPE).invoke(null, objArr18)).floatValue() > 0.0f ? 1 : (((Float) cls6.getMethod((String) objArr20[0], Float.TYPE, Float.TYPE).invoke(null, objArr18)).floatValue() == 0.0f ? 0 : -1)) + 142;
                Object[] objArr21 = new Object[1];
                b(c2, i6, i7, objArr21);
                Object[] objArr22 = {(String) objArr21[0]};
                char c3 = 26;
                short s2 = (short) 176;
                Object[] objArr23 = new Object[1];
                a(bArr2[26], s2, bArr2[46], objArr23);
                Class<?> cls7 = Class.forName((String) objArr23[0]);
                byte b3 = bArr2[7];
                Object[] objArr24 = new Object[1];
                a(b3, (short) (b3 | 232), bArr2[4], objArr24);
                String str3 = (String) objArr24[0];
                Object[] objArr25 = new Object[1];
                a(bArr2[26], s2, bArr2[46], objArr25);
                Object[] objArr26 = (Object[]) cls7.getMethod(str3, Class.forName((String) objArr25[0])).invoke(str2, objArr22);
                int[] iArr = new int[objArr26.length];
                int i8 = 0;
                while (i8 < objArr26.length) {
                    Object[] objArr27 = {objArr26[i8]};
                    byte[] bArr3 = MediaSessionCompatQueueItem;
                    byte b4 = bArr3[35];
                    Object[] objArr28 = new Object[1];
                    a(b4, (short) (b4 | 224), bArr3[46], objArr28);
                    Class<?> cls8 = Class.forName((String) objArr28[0]);
                    byte b5 = bArr3[13];
                    Object[] objArr29 = new Object[1];
                    a(b5, (short) (b5 | 250), bArr3[135], objArr29);
                    String str4 = (String) objArr29[0];
                    Object[] objArr30 = new Object[1];
                    a(bArr3[c3], s2, bArr3[46], objArr30);
                    Object objInvoke = cls8.getMethod(str4, Class.forName((String) objArr30[0])).invoke(null, objArr27);
                    byte b6 = bArr3[35];
                    Object[] objArr31 = new Object[1];
                    a(b6, (short) (b6 | 224), bArr3[46], objArr31);
                    Class<?> cls9 = Class.forName((String) objArr31[0]);
                    Object[] objArr32 = new Object[1];
                    a(bArr3[356], (short) 260, bArr3[56], objArr32);
                    iArr[i8] = ((Integer) cls9.getMethod((String) objArr32[0], null).invoke(objInvoke, null)).intValue();
                    i8++;
                    c3 = 26;
                }
                int i9 = 0;
                while (true) {
                    int i10 = i9 + 1;
                    try {
                        switch (r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(iArr[i9])) {
                            case -47:
                                i9 = 109;
                                break;
                            case -46:
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(24);
                                int i11 = r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer;
                                if (i11 != 82 && i11 == 98) {
                                    i9 = 21;
                                } else {
                                    i10 = 18;
                                    i9 = i10;
                                }
                                break;
                            case -45:
                                i9 = 104;
                                break;
                            case -44:
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(24);
                                int i12 = r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer;
                                i10 = (i12 == 0 || i12 != 1) ? 58 : 70;
                                i9 = i10;
                                break;
                            case -43:
                                i9 = 37;
                                break;
                            case -42:
                                i9 = 103;
                                break;
                            case -41:
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(20);
                                if (r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer == 0) {
                                    i10 = 102;
                                }
                                i9 = i10;
                                break;
                            case -40:
                                i9 = 1;
                                break;
                            case -39:
                                i9 = 93;
                                break;
                            case -38:
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(15);
                                if (r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer == 0) {
                                    i10 = 92;
                                }
                                i9 = i10;
                                break;
                            case -37:
                                try {
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                    try {
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(14);
                                        RatingCompat = r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer;
                                        i9 = i10;
                                    } catch (Throwable th) {
                                        th = th;
                                        i = 21;
                                        if (i9 >= i) {
                                            if (i9 >= 24) {
                                                i2 = 27;
                                                if (i9 < 27) {
                                                    i9 = 43;
                                                }
                                            } else {
                                                i2 = 27;
                                            }
                                            if (i9 < i2) {
                                                break;
                                            }
                                            if (i9 >= 30) {
                                                bArr = MediaSessionCompatQueueItem;
                                                s = (short) 267;
                                                objArr = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr);
                                                if (Class.forName((String) objArr[0]).isInstance(th)) {
                                                    objArr2 = new Object[1];
                                                    a(bArr[68], s, bArr[46], objArr2);
                                                    if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    if (i9 >= 82) {
                                                    }
                                                    throw th;
                                                }
                                                objArr2 = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr2);
                                                if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                    break;
                                                }
                                                if (i9 >= 82) {
                                                }
                                                throw th;
                                            }
                                            bArr = MediaSessionCompatQueueItem;
                                            s = (short) 267;
                                            objArr = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr);
                                            if (Class.forName((String) objArr[0]).isInstance(th)) {
                                                objArr2 = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr2);
                                                if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                    break;
                                                }
                                                if (i9 >= 82) {
                                                }
                                                throw th;
                                            }
                                            objArr2 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr2);
                                            if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i9 >= 82) {
                                            }
                                            throw th;
                                        }
                                        if (i9 >= 24) {
                                            i2 = 27;
                                            if (i9 < 27) {
                                                i9 = 43;
                                            }
                                        } else {
                                            i2 = 27;
                                        }
                                        if (i9 < i2) {
                                            break;
                                        }
                                        if (i9 >= 30) {
                                            bArr = MediaSessionCompatQueueItem;
                                            s = (short) 267;
                                            objArr = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr);
                                            if (Class.forName((String) objArr[0]).isInstance(th)) {
                                                objArr2 = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr2);
                                                if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                    break;
                                                }
                                                if (i9 >= 82) {
                                                }
                                                throw th;
                                            }
                                            objArr2 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr2);
                                            if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i9 >= 82) {
                                            }
                                            throw th;
                                        }
                                        bArr = MediaSessionCompatQueueItem;
                                        s = (short) 267;
                                        objArr = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr);
                                        if (Class.forName((String) objArr[0]).isInstance(th)) {
                                            objArr2 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr2);
                                            if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i9 >= 82) {
                                            }
                                            throw th;
                                        }
                                        objArr2 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr2);
                                        if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                            break;
                                        }
                                        if (i9 >= 82) {
                                        }
                                        throw th;
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                                break;
                            case -36:
                                try {
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = MediaMetadataCompat;
                                    try {
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(11);
                                        i9 = i10;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        i = 21;
                                        if (i9 >= i) {
                                            if (i9 >= 24) {
                                                i2 = 27;
                                                if (i9 < 27) {
                                                    i9 = 43;
                                                }
                                            } else {
                                                i2 = 27;
                                            }
                                            if (i9 < i2) {
                                                break;
                                            }
                                            if (i9 >= 30) {
                                                bArr = MediaSessionCompatQueueItem;
                                                s = (short) 267;
                                                objArr = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr);
                                                if (Class.forName((String) objArr[0]).isInstance(th)) {
                                                    objArr2 = new Object[1];
                                                    a(bArr[68], s, bArr[46], objArr2);
                                                    if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    if (i9 >= 82) {
                                                    }
                                                    throw th;
                                                }
                                                objArr2 = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr2);
                                                if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                    break;
                                                }
                                                if (i9 >= 82) {
                                                }
                                                throw th;
                                            }
                                            bArr = MediaSessionCompatQueueItem;
                                            s = (short) 267;
                                            objArr = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr);
                                            if (Class.forName((String) objArr[0]).isInstance(th)) {
                                                objArr2 = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr2);
                                                if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                    break;
                                                }
                                                if (i9 >= 82) {
                                                }
                                                throw th;
                                            }
                                            objArr2 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr2);
                                            if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i9 >= 82) {
                                            }
                                            throw th;
                                        }
                                        if (i9 >= 24) {
                                            i2 = 27;
                                            if (i9 < 27) {
                                                i9 = 43;
                                            }
                                        } else {
                                            i2 = 27;
                                        }
                                        if (i9 < i2) {
                                            break;
                                        }
                                        if (i9 >= 30) {
                                            bArr = MediaSessionCompatQueueItem;
                                            s = (short) 267;
                                            objArr = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr);
                                            if (Class.forName((String) objArr[0]).isInstance(th)) {
                                                objArr2 = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr2);
                                                if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                    break;
                                                }
                                                if (i9 >= 82) {
                                                }
                                                throw th;
                                            }
                                            objArr2 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr2);
                                            if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i9 >= 82) {
                                            }
                                            throw th;
                                        }
                                        bArr = MediaSessionCompatQueueItem;
                                        s = (short) 267;
                                        objArr = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr);
                                        if (Class.forName((String) objArr[0]).isInstance(th)) {
                                            objArr2 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr2);
                                            if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i9 >= 82) {
                                            }
                                            throw th;
                                        }
                                        objArr2 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr2);
                                        if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                            break;
                                        }
                                        if (i9 >= 82) {
                                        }
                                        throw th;
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                                break;
                            case -35:
                                i9 = 56;
                                break;
                            case -34:
                                i9 = 81;
                                break;
                            case -33:
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(20);
                                if (r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer == 0) {
                                    i10 = 79;
                                }
                                i9 = i10;
                                break;
                            case -32:
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(14);
                                MediaMetadataCompat = r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer;
                                i9 = i10;
                                break;
                            case -31:
                                try {
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = RatingCompat;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(11);
                                    i9 = i10;
                                } catch (Throwable th5) {
                                    th = th5;
                                    i = 21;
                                    if (i9 >= i) {
                                        if (i9 >= 24) {
                                            i2 = 27;
                                            if (i9 < 27) {
                                                i9 = 43;
                                            }
                                        } else {
                                            i2 = 27;
                                        }
                                        if (i9 < i2) {
                                            break;
                                        }
                                        if (i9 >= 30) {
                                            bArr = MediaSessionCompatQueueItem;
                                            s = (short) 267;
                                            objArr = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr);
                                            if (Class.forName((String) objArr[0]).isInstance(th)) {
                                                objArr2 = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr2);
                                                if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                    break;
                                                }
                                                if (i9 >= 82) {
                                                }
                                                throw th;
                                            }
                                            objArr2 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr2);
                                            if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i9 >= 82) {
                                            }
                                            throw th;
                                        }
                                        bArr = MediaSessionCompatQueueItem;
                                        s = (short) 267;
                                        objArr = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr);
                                        if (Class.forName((String) objArr[0]).isInstance(th)) {
                                            objArr2 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr2);
                                            if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i9 >= 82) {
                                            }
                                            throw th;
                                        }
                                        objArr2 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr2);
                                        if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                            break;
                                        }
                                        if (i9 >= 82) {
                                        }
                                        throw th;
                                    }
                                    if (i9 >= 24) {
                                        i2 = 27;
                                        if (i9 < 27) {
                                            i9 = 43;
                                        }
                                    } else {
                                        i2 = 27;
                                    }
                                    if (i9 < i2) {
                                        break;
                                    }
                                    if (i9 >= 30) {
                                        bArr = MediaSessionCompatQueueItem;
                                        s = (short) 267;
                                        objArr = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr);
                                        if (Class.forName((String) objArr[0]).isInstance(th)) {
                                            objArr2 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr2);
                                            if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i9 >= 82) {
                                            }
                                            throw th;
                                        }
                                        objArr2 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr2);
                                        if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                            break;
                                        }
                                        if (i9 >= 82) {
                                        }
                                        throw th;
                                    }
                                    bArr = MediaSessionCompatQueueItem;
                                    s = (short) 267;
                                    objArr = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr);
                                    if (Class.forName((String) objArr[0]).isInstance(th)) {
                                        objArr2 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr2);
                                        if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                            break;
                                        }
                                        if (i9 >= 82) {
                                        }
                                        throw th;
                                    }
                                    objArr2 = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr2);
                                    if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                        break;
                                    }
                                    if (i9 >= 82) {
                                    }
                                    throw th;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                                }
                                break;
                            case -30:
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(9);
                                return (r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat;
                            case -29:
                                i9 = 58;
                                break;
                            case -28:
                                i9 = 84;
                                break;
                            case -27:
                                i9 = 63;
                                break;
                            case -26:
                                i9 = 105;
                                break;
                            case -25:
                                i9 = 107;
                                break;
                            case -24:
                                try {
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(15);
                                    if (r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer == 0) {
                                        i10 = 55;
                                    }
                                    i9 = i10;
                                } catch (Throwable th6) {
                                    th = th6;
                                    i = 21;
                                    if (i9 >= i) {
                                        if (i9 >= 24) {
                                            i2 = 27;
                                            if (i9 < 27) {
                                                i9 = 43;
                                            }
                                        } else {
                                            i2 = 27;
                                        }
                                        if (i9 < i2) {
                                            break;
                                        }
                                        if (i9 >= 30) {
                                            bArr = MediaSessionCompatQueueItem;
                                            s = (short) 267;
                                            objArr = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr);
                                            if (Class.forName((String) objArr[0]).isInstance(th)) {
                                                objArr2 = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr2);
                                                if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                    break;
                                                }
                                                if (i9 >= 82) {
                                                }
                                                throw th;
                                            }
                                            objArr2 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr2);
                                            if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i9 >= 82) {
                                            }
                                            throw th;
                                        }
                                        bArr = MediaSessionCompatQueueItem;
                                        s = (short) 267;
                                        objArr = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr);
                                        if (Class.forName((String) objArr[0]).isInstance(th)) {
                                            objArr2 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr2);
                                            if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i9 >= 82) {
                                            }
                                            throw th;
                                        }
                                        objArr2 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr2);
                                        if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                            break;
                                        }
                                        if (i9 >= 82) {
                                        }
                                        throw th;
                                    }
                                    if (i9 >= 24) {
                                        i2 = 27;
                                        if (i9 < 27) {
                                            i9 = 43;
                                        }
                                    } else {
                                        i2 = 27;
                                    }
                                    if (i9 < i2) {
                                        break;
                                    }
                                    if (i9 >= 30) {
                                        bArr = MediaSessionCompatQueueItem;
                                        s = (short) 267;
                                        objArr = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr);
                                        if (Class.forName((String) objArr[0]).isInstance(th)) {
                                            objArr2 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr2);
                                            if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i9 >= 82) {
                                            }
                                            throw th;
                                        }
                                        objArr2 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr2);
                                        if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                            break;
                                        }
                                        if (i9 >= 82) {
                                        }
                                        throw th;
                                    }
                                    bArr = MediaSessionCompatQueueItem;
                                    s = (short) 267;
                                    objArr = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr);
                                    if (Class.forName((String) objArr[0]).isInstance(th)) {
                                        objArr2 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr2);
                                        if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                            break;
                                        }
                                        if (i9 >= 82) {
                                        }
                                        throw th;
                                    }
                                    objArr2 = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr2);
                                    if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                        break;
                                    }
                                    if (i9 >= 82) {
                                    }
                                    throw th;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                                }
                                break;
                            case -23:
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(9);
                                throw ((Throwable) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat);
                            case -22:
                                i9 = 52;
                                break;
                            case -21:
                                i9 = 68;
                                break;
                            case -20:
                                try {
                                    byte[] bArr4 = MediaSessionCompatQueueItem;
                                    try {
                                        Object[] objArr33 = new Object[1];
                                        a(bArr4[26], (short) 578, bArr4[9], objArr33);
                                        Class<?> cls10 = Class.forName((String) objArr33[0]);
                                        try {
                                            Object[] objArr34 = new Object[1];
                                            a(bArr4[25], (short) 593, bArr4[13], objArr34);
                                            try {
                                                cls10.getMethod((String) objArr34[0], null).invoke(null, null);
                                                i9 = i10;
                                            } catch (Throwable th7) {
                                                th = th7;
                                                cause = th.getCause();
                                                if (cause != null) {
                                                    throw cause;
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        cause = th.getCause();
                                        if (cause != null) {
                                            throw cause;
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                }
                                break;
                            case -19:
                                i9 = 39;
                                break;
                            case -18:
                                i9 = 94;
                                break;
                            case -17:
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(15);
                                if (r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer == 0) {
                                    i10 = 36;
                                }
                                i9 = i10;
                                break;
                            case -16:
                                try {
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 2;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                    try {
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                        getRootInfoui getrootinfoui = (getRootInfoui) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat;
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                        getrootinfoui.write((String) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat);
                                        i9 = i10;
                                    } catch (Throwable th11) {
                                        th = th11;
                                        i = 21;
                                        if (i9 >= i) {
                                            if (i9 >= 24) {
                                                i2 = 27;
                                                if (i9 < 27) {
                                                    i9 = 43;
                                                }
                                            } else {
                                                i2 = 27;
                                            }
                                            if (i9 < i2) {
                                                break;
                                            }
                                            if (i9 >= 30) {
                                                bArr = MediaSessionCompatQueueItem;
                                                s = (short) 267;
                                                objArr = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr);
                                                if (Class.forName((String) objArr[0]).isInstance(th)) {
                                                    objArr2 = new Object[1];
                                                    a(bArr[68], s, bArr[46], objArr2);
                                                    if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    if (i9 >= 82) {
                                                    }
                                                    throw th;
                                                }
                                                objArr2 = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr2);
                                                if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                    break;
                                                }
                                                if (i9 >= 82) {
                                                }
                                                throw th;
                                            }
                                            bArr = MediaSessionCompatQueueItem;
                                            s = (short) 267;
                                            objArr = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr);
                                            if (Class.forName((String) objArr[0]).isInstance(th)) {
                                                objArr2 = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr2);
                                                if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                    break;
                                                }
                                                if (i9 >= 82) {
                                                }
                                                throw th;
                                            }
                                            objArr2 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr2);
                                            if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i9 >= 82) {
                                            }
                                            throw th;
                                        }
                                        if (i9 >= 24) {
                                            i2 = 27;
                                            if (i9 < 27) {
                                                i9 = 43;
                                            }
                                        } else {
                                            i2 = 27;
                                        }
                                        if (i9 < i2) {
                                            break;
                                        }
                                        if (i9 >= 30) {
                                            bArr = MediaSessionCompatQueueItem;
                                            s = (short) 267;
                                            objArr = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr);
                                            if (Class.forName((String) objArr[0]).isInstance(th)) {
                                                objArr2 = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr2);
                                                if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                    break;
                                                }
                                                if (i9 >= 82) {
                                                }
                                                throw th;
                                            }
                                            objArr2 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr2);
                                            if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i9 >= 82) {
                                            }
                                            throw th;
                                        }
                                        bArr = MediaSessionCompatQueueItem;
                                        s = (short) 267;
                                        objArr = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr);
                                        if (Class.forName((String) objArr[0]).isInstance(th)) {
                                            objArr2 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr2);
                                            if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i9 >= 82) {
                                            }
                                            throw th;
                                        }
                                        objArr2 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr2);
                                        if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                            break;
                                        }
                                        if (i9 >= 82) {
                                        }
                                        throw th;
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                }
                                break;
                            case -15:
                                try {
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = RemoteActionCompatParcelizer((r8lambda2tFXStZN_MXijoyymezhxf14xPY) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat);
                                    i3 = 4;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i3);
                                    i9 = i10;
                                } catch (Throwable th13) {
                                    th = th13;
                                    i = 21;
                                    if (i9 >= i || i9 >= 24) {
                                        if (i9 >= 24) {
                                            i2 = 27;
                                            if (i9 < 27) {
                                                i9 = 43;
                                            }
                                        } else {
                                            i2 = 27;
                                        }
                                        if (i9 < i2 && i9 < 30) {
                                            i9 = 43;
                                        } else if ((i9 >= 30 || i9 >= 33) && ((i9 < 44 || i9 >= 47) && ((i9 < 47 || i9 >= 50) && (i9 < 50 || i9 >= 52)))) {
                                            bArr = MediaSessionCompatQueueItem;
                                            s = (short) 267;
                                            objArr = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr);
                                            if (Class.forName((String) objArr[0]).isInstance(th) || i9 < 70 || i9 >= 80) {
                                                objArr2 = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr2);
                                                if (!Class.forName((String) objArr2[0]).isInstance(th) && i9 >= 75 && i9 < 80) {
                                                    i9 = 114;
                                                } else {
                                                    if (i9 >= 82 || i9 >= 84) {
                                                        throw th;
                                                    }
                                                    i9 = 80;
                                                }
                                            } else {
                                                i9 = 114;
                                            }
                                        } else {
                                            i9 = 41;
                                        }
                                    } else {
                                        i9 = 43;
                                    }
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                                }
                                break;
                            case androidx.compose.ui.graphics.Float16.MinExponent /* -14 */:
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 2;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                getRootInfoui getrootinfoui2 = (getRootInfoui) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                getrootinfoui2.serializer((String) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat);
                                i9 = i10;
                                break;
                            case -13:
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = (getRootInfoui) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat;
                                i3 = 4;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i3);
                                i9 = i10;
                                break;
                            case -12:
                                i9 = 21;
                                break;
                            case BaseCode.NOT_SUPPORT_RESOLUTION /* -11 */:
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.read((String) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat);
                                i9 = i10;
                                break;
                            case BaseCode.KPMS_UPDATE_FAILED /* -10 */:
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = "asti_load_session_from_db";
                                i3 = 4;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i3);
                                i9 = i10;
                                break;
                            case BaseCode.NO_AVAILABLE_LIB_ERROR /* -9 */:
                                i9 = 110;
                                break;
                            case BaseCode.SOLUTION_GET_RESPONSE_CODE_ERROR /* -8 */:
                                i9 = 112;
                                break;
                            case BaseCode.DATA_NULL_IN_INTENT /* -7 */:
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(15);
                                if (r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer == 0) {
                                    i10 = 17;
                                }
                                i9 = i10;
                                break;
                            case BaseCode.TRANSACTION_IS_NULL /* -6 */:
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = ((Boolean) r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(-1240730099, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), 1240730100, sourceInformationContextOfdefault.read(), new Object[0], sourceInformationContextOfdefault.read())).booleanValue() ? 1 : 0;
                                i3 = 11;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i3);
                                i9 = i10;
                                break;
                            case BaseCode.URI_IS_NULL /* -5 */:
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = ((TraceTimeMeasurementWithPerformanceKit) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat).serializer;
                                i3 = 4;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i3);
                                i9 = i10;
                                break;
                            case BaseCode.NO_SOLUTION /* -4 */:
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat.getClass();
                                i3 = 4;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i3);
                                i9 = i10;
                                break;
                            case -3:
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = (TraceTimeMeasurementWithPerformanceKit) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat;
                                i3 = 4;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i3);
                                i9 = i10;
                                break;
                            case -2:
                                try {
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = ((r8lambda2tFXStZN_MXijoyymezhxf14xPY) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat).RemoteActionCompatParcelizer;
                                    i3 = 4;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i3);
                                    i9 = i10;
                                } catch (Throwable th14) {
                                    th = th14;
                                    i = 21;
                                    if (i9 >= i) {
                                        if (i9 >= 24) {
                                            i2 = 27;
                                            if (i9 < 27) {
                                                i9 = 43;
                                            }
                                        } else {
                                            i2 = 27;
                                        }
                                        if (i9 < i2) {
                                            break;
                                        }
                                        if (i9 >= 30) {
                                            bArr = MediaSessionCompatQueueItem;
                                            s = (short) 267;
                                            objArr = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr);
                                            if (Class.forName((String) objArr[0]).isInstance(th)) {
                                                objArr2 = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr2);
                                                if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                    break;
                                                }
                                                if (i9 >= 82) {
                                                }
                                                throw th;
                                            }
                                            objArr2 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr2);
                                            if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i9 >= 82) {
                                            }
                                            throw th;
                                        }
                                        bArr = MediaSessionCompatQueueItem;
                                        s = (short) 267;
                                        objArr = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr);
                                        if (Class.forName((String) objArr[0]).isInstance(th)) {
                                            objArr2 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr2);
                                            if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i9 >= 82) {
                                            }
                                            throw th;
                                        }
                                        objArr2 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr2);
                                        if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                            break;
                                        }
                                        if (i9 >= 82) {
                                        }
                                        throw th;
                                    }
                                    if (i9 >= 24) {
                                        i2 = 27;
                                        if (i9 < 27) {
                                            i9 = 43;
                                        }
                                    } else {
                                        i2 = 27;
                                    }
                                    if (i9 < i2) {
                                        break;
                                    }
                                    if (i9 >= 30) {
                                        bArr = MediaSessionCompatQueueItem;
                                        s = (short) 267;
                                        objArr = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr);
                                        if (Class.forName((String) objArr[0]).isInstance(th)) {
                                            objArr2 = new Object[1];
                                            a(bArr[68], s, bArr[46], objArr2);
                                            if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i9 >= 82) {
                                            }
                                            throw th;
                                        }
                                        objArr2 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr2);
                                        if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                            break;
                                        }
                                        if (i9 >= 82) {
                                        }
                                        throw th;
                                    }
                                    bArr = MediaSessionCompatQueueItem;
                                    s = (short) 267;
                                    objArr = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr);
                                    if (Class.forName((String) objArr[0]).isInstance(th)) {
                                        objArr2 = new Object[1];
                                        a(bArr[68], s, bArr[46], objArr2);
                                        if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                            break;
                                        }
                                        if (i9 >= 82) {
                                        }
                                        throw th;
                                    }
                                    objArr2 = new Object[1];
                                    a(bArr[68], s, bArr[46], objArr2);
                                    if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                        break;
                                    }
                                    if (i9 >= 82) {
                                    }
                                    throw th;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                                }
                                break;
                            case -1:
                                i9 = 60;
                                break;
                            default:
                                i9 = i10;
                                break;
                        }
                    } catch (Throwable th15) {
                        th = th15;
                    }
                }
            } catch (Throwable th16) {
                Throwable cause2 = th16.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th16;
            }
        } catch (Throwable th17) {
            Throwable cause3 = th17.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th17;
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0439  */
    private final copyK8Q__8 read() throws Throwable {
        int i;
        r8lambda4eayLEkyCzRqunjxKNY3fxSMeyo r8lambda4eaylekyczrqunjxkny3fxsmeyo = new r8lambda4eayLEkyCzRqunjxKNY3fxSMeyo(this);
        try {
            Object[] objArr = {0, 0};
            byte[] bArr = MediaSessionCompatQueueItem;
            Object[] objArr2 = new Object[1];
            a(bArr[209], (short) 410, bArr[9], objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            byte b = bArr[21];
            Object[] objArr3 = new Object[1];
            a(b, (short) (b | 432), bArr[115], objArr3);
            char cIntValue = (char) (18456 - ((Integer) cls.getMethod((String) objArr3[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr)).intValue());
            try {
                Object[] objArr4 = new Object[1];
                a(bArr[434], (short) 285, bArr[9], objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                a(bArr[35], (short) 456, bArr[51], objArr5);
                int iIntValue = (((Integer) cls2.getMethod((String) objArr5[0], null).invoke(null, null)).intValue() >> 16) + 130;
                try {
                    Object[] objArr6 = {0};
                    Object[] objArr7 = new Object[1];
                    a(bArr[6], (short) 116, bArr[9], objArr7);
                    Class<?> cls3 = Class.forName((String) objArr7[0]);
                    byte b2 = bArr[67];
                    byte b3 = b2;
                    Object[] objArr8 = new Object[1];
                    a(b3, (short) (b3 | 136), b2, objArr8);
                    Object[] objArr9 = new Object[1];
                    b(cIntValue, iIntValue, 259 - ((Integer) cls3.getMethod((String) objArr8[0], Integer.TYPE).invoke(null, objArr6)).intValue(), objArr9);
                    String str = (String) objArr9[0];
                    Object[] objArr10 = {0};
                    Object[] objArr11 = new Object[1];
                    a(bArr[101], (short) 472, bArr[9], objArr11);
                    Class<?> cls4 = Class.forName((String) objArr11[0]);
                    byte b4 = bArr[13];
                    Object[] objArr12 = new Object[1];
                    a(b4, (short) (b4 | 496), bArr[51], objArr12);
                    char cIntValue2 = (char) ((Integer) cls4.getMethod((String) objArr12[0], Integer.TYPE).invoke(null, objArr10)).intValue();
                    Object[] objArr13 = new Object[1];
                    a(bArr[6], bArr[11], bArr[9], objArr13);
                    Class<?> cls5 = Class.forName((String) objArr13[0]);
                    Object[] objArr14 = new Object[1];
                    a(bArr[13], (short) 89, bArr[56], objArr14);
                    String str2 = (String) objArr14[0];
                    byte b5 = bArr[6];
                    Object[] objArr15 = new Object[1];
                    a(b5, (short) (b5 | 76), bArr[46], objArr15);
                    int i2 = -((Integer) cls5.getMethod(str2, Class.forName((String) objArr15[0]), Character.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, "", '0', 0, 0)).intValue();
                    Object[] objArr16 = new Object[1];
                    a(bArr[6], bArr[354], bArr[9], objArr16);
                    Class<?> cls6 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    a(bArr[59], bArr[164], bArr[13], objArr17);
                    Object[] objArr18 = new Object[1];
                    b(cIntValue2, i2, 143 - (((Long) cls6.getMethod((String) objArr17[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls6.getMethod((String) objArr17[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1)), objArr18);
                    Object[] objArr19 = {(String) objArr18[0]};
                    char c = 26;
                    short s = (short) 176;
                    Object[] objArr20 = new Object[1];
                    a(bArr[26], s, bArr[46], objArr20);
                    Class<?> cls7 = Class.forName((String) objArr20[0]);
                    byte b6 = bArr[7];
                    Object[] objArr21 = new Object[1];
                    a(b6, (short) (b6 | 232), bArr[4], objArr21);
                    String str3 = (String) objArr21[0];
                    Object[] objArr22 = new Object[1];
                    a(bArr[26], s, bArr[46], objArr22);
                    Object[] objArr23 = (Object[]) cls7.getMethod(str3, Class.forName((String) objArr22[0])).invoke(str, objArr19);
                    int[] iArr = new int[objArr23.length];
                    int i3 = 0;
                    while (i3 < objArr23.length) {
                        Object[] objArr24 = {objArr23[i3]};
                        byte[] bArr2 = MediaSessionCompatQueueItem;
                        byte b7 = bArr2[35];
                        Object[] objArr25 = new Object[1];
                        a(b7, (short) (b7 | 224), bArr2[46], objArr25);
                        Class<?> cls8 = Class.forName((String) objArr25[0]);
                        byte b8 = bArr2[13];
                        Object[] objArr26 = new Object[1];
                        a(b8, (short) (b8 | 250), bArr2[135], objArr26);
                        String str4 = (String) objArr26[0];
                        Object[] objArr27 = new Object[1];
                        a(bArr2[c], s, bArr2[46], objArr27);
                        Object objInvoke = cls8.getMethod(str4, Class.forName((String) objArr27[0])).invoke(null, objArr24);
                        byte b9 = bArr2[35];
                        Object[] objArr28 = new Object[1];
                        a(b9, (short) (b9 | 224), bArr2[46], objArr28);
                        Class<?> cls9 = Class.forName((String) objArr28[0]);
                        Object[] objArr29 = new Object[1];
                        a(bArr2[356], (short) 260, bArr2[56], objArr29);
                        iArr[i3] = ((Integer) cls9.getMethod((String) objArr29[0], null).invoke(objInvoke, null)).intValue();
                        i3++;
                        c = 26;
                    }
                    int i4 = 0;
                    while (true) {
                        int i5 = i4 + 1;
                        try {
                            switch (r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(iArr[i4])) {
                                case -19:
                                    try {
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(9);
                                        throw ((Throwable) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat);
                                    } catch (Throwable th) {
                                        th = th;
                                        byte[] bArr3 = MediaSessionCompatQueueItem;
                                        short s2 = (short) 267;
                                        Object[] objArr30 = new Object[1];
                                        a(bArr3[68], s2, bArr3[46], objArr30);
                                        if (!Class.forName((String) objArr30[0]).isInstance(th) || i4 < 2 || i4 >= 3) {
                                            Object[] objArr31 = new Object[1];
                                            a(bArr3[68], s2, bArr3[46], objArr31);
                                            if (Class.forName((String) objArr31[0]).isInstance(th) && i4 >= 4) {
                                                if (i4 < 13) {
                                                }
                                                i4 = 40;
                                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                                                break;
                                            }
                                            Object[] objArr32 = new Object[1];
                                            a(bArr3[68], s2, bArr3[46], objArr32);
                                            if (!Class.forName((String) objArr32[0]).isInstance(th) || i4 < 7 || i4 >= 8) {
                                                Object[] objArr33 = new Object[1];
                                                a(bArr3[68], s2, bArr3[46], objArr33);
                                                if (Class.forName((String) objArr33[0]).isInstance(th) && i4 >= 10) {
                                                    if (i4 < 11) {
                                                    }
                                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                                                    break;
                                                }
                                                Object[] objArr34 = new Object[1];
                                                a(bArr3[68], s2, bArr3[46], objArr34);
                                                if (!Class.forName((String) objArr34[0]).isInstance(th) || i4 < 18 || i4 >= 19) {
                                                    throw th;
                                                }
                                            }
                                            i4 = 40;
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                                            break;
                                        }
                                        i4 = 39;
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                        r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                                    }
                                    break;
                                case -18:
                                    i4 = 16;
                                    break;
                                case -17:
                                    i4 = 38;
                                    break;
                                case -16:
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(15);
                                    if (r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer == 0) {
                                        i5 = 37;
                                    }
                                    break;
                                case -15:
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(14);
                                    RatingCompat = r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer;
                                    break;
                                case androidx.compose.ui.graphics.Float16.MinExponent /* -14 */:
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = MediaMetadataCompat;
                                    i = 11;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i);
                                    break;
                                case -13:
                                    i4 = 1;
                                    break;
                                case -12:
                                    i4 = 27;
                                    break;
                                case BaseCode.NOT_SUPPORT_RESOLUTION /* -11 */:
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(20);
                                    i4 = r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer == 0 ? 26 : i5;
                                    break;
                                case BaseCode.KPMS_UPDATE_FAILED /* -10 */:
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(14);
                                    MediaMetadataCompat = r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer;
                                    break;
                                case BaseCode.NO_AVAILABLE_LIB_ERROR /* -9 */:
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = RatingCompat;
                                    i = 11;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i);
                                    break;
                                case BaseCode.SOLUTION_GET_RESPONSE_CODE_ERROR /* -8 */:
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(9);
                                    return (copyK8Q__8) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat;
                                case BaseCode.DATA_NULL_IN_INTENT /* -7 */:
                                    i4 = 18;
                                    break;
                                case BaseCode.TRANSACTION_IS_NULL /* -6 */:
                                    i4 = 28;
                                    break;
                                case BaseCode.URI_IS_NULL /* -5 */:
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = (copyK8Q__8) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat;
                                    i = 4;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i);
                                    break;
                                case BaseCode.NO_SOLUTION /* -4 */:
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat.getClass();
                                    i = 4;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i);
                                    break;
                                case -3:
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = ((Lazy) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat).write();
                                    i = 4;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i);
                                    break;
                                case -2:
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = ((r8lambda2tFXStZN_MXijoyymezhxf14xPY) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat).read;
                                    i = 4;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i);
                                    break;
                                case -1:
                                    i4 = 13;
                                    break;
                                default:
                                    break;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                } catch (Throwable th3) {
                    Throwable cause = th3.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th3;
                }
            } catch (Throwable th4) {
                Throwable cause2 = th4.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th4;
            }
        } catch (Throwable th5) {
            Throwable cause3 = th5.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:165:0x04a6 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:71:0x0401  */
    /* JADX WARN: Code duplicated, block: B:73:0x041e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0425 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:81:0x0443  */
    /* JADX WARN: Code duplicated, block: B:85:0x044c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x046a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:92:0x0472  */
    /* JADX WARN: Code duplicated, block: B:95:0x0491  */
    private final AtomicReference<r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA> RemoteActionCompatParcelizer() throws Throwable {
        byte[] bArr;
        short s;
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        Object[] objArr4;
        Object[] objArr5;
        int i;
        r8lambda4eayLEkyCzRqunjxKNY3fxSMeyo r8lambda4eaylekyczrqunjxkny3fxsmeyo = new r8lambda4eayLEkyCzRqunjxKNY3fxSMeyo(this);
        try {
            byte[] bArr2 = MediaSessionCompatQueueItem;
            short s2 = (short) 285;
            Object[] objArr6 = new Object[1];
            a(bArr2[434], s2, bArr2[9], objArr6);
            Class<?> cls = Class.forName((String) objArr6[0]);
            byte b = bArr2[68];
            Object[] objArr7 = new Object[1];
            a(b, (short) (b | 298), bArr2[51], objArr7);
            char cIntValue = (char) ((((Integer) cls.getMethod((String) objArr7[0], null).invoke(null, null)).intValue() >> 16) + 15628);
            try {
                Object[] objArr8 = new Object[1];
                a(bArr2[434], s2, bArr2[9], objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                char c = '.';
                Object[] objArr9 = new Object[1];
                a(bArr2[46], (short) 332, bArr2[51], objArr9);
                int iIntValue = 116 - (((Integer) cls2.getMethod((String) objArr9[0], null).invoke(null, null)).intValue() >> 8);
                try {
                    Object[] objArr10 = new Object[1];
                    a(bArr2[6], bArr2[354], bArr2[9], objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    a(bArr2[46], (short) 343, bArr2[28], objArr11);
                    Object[] objArr12 = new Object[1];
                    b(cIntValue, iIntValue, 144 - (((Long) cls3.getMethod((String) objArr11[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls3.getMethod((String) objArr11[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1)), objArr12);
                    String str = (String) objArr12[0];
                    Object[] objArr13 = new Object[1];
                    a(bArr2[6], bArr2[11], bArr2[9], objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    Object[] objArr14 = new Object[1];
                    a(bArr2[13], (short) 89, bArr2[56], objArr14);
                    String str2 = (String) objArr14[0];
                    byte b2 = bArr2[6];
                    Object[] objArr15 = new Object[1];
                    a(b2, (short) (b2 | 76), bArr2[46], objArr15);
                    byte b3 = bArr2[6];
                    Object[] objArr16 = new Object[1];
                    a(b3, (short) (b3 | 76), bArr2[46], objArr16);
                    char cIntValue2 = (char) ((Integer) cls4.getMethod(str2, Class.forName((String) objArr15[0]), Class.forName((String) objArr16[0])).invoke(null, "", "")).intValue();
                    try {
                        Object[] objArr17 = new Object[1];
                        a(bArr2[135], bArr2[8], bArr2[9], objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        a(bArr2[46], bArr2[86], bArr2[51], objArr18);
                        int i2 = (((Float) cls5.getMethod((String) objArr18[0], null).invoke(null, null)).floatValue() > 0.0f ? 1 : (((Float) cls5.getMethod((String) objArr18[0], null).invoke(null, null)).floatValue() == 0.0f ? 0 : -1));
                        try {
                            Object[] objArr19 = {0, 0};
                            Object[] objArr20 = new Object[1];
                            a(bArr2[33], (short) (PlaybackStateCompat | androidx.compose.ui.graphics.Fields.RotationX), bArr2[9], objArr20);
                            Class<?> cls6 = Class.forName((String) objArr20[0]);
                            Object[] objArr21 = new Object[1];
                            a(bArr2[86], (short) 386, bArr2[51], objArr21);
                            Object[] objArr22 = new Object[1];
                            b(cIntValue2, i2, (((Long) cls6.getMethod((String) objArr21[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr19)).longValue() > 0L ? 1 : (((Long) cls6.getMethod((String) objArr21[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr19)).longValue() == 0L ? 0 : -1)) + 143, objArr22);
                            Object[] objArr23 = {(String) objArr22[0]};
                            char c2 = 26;
                            short s3 = (short) 176;
                            Object[] objArr24 = new Object[1];
                            a(bArr2[26], s3, bArr2[46], objArr24);
                            Class<?> cls7 = Class.forName((String) objArr24[0]);
                            byte b4 = bArr2[7];
                            Object[] objArr25 = new Object[1];
                            a(b4, (short) (b4 | 232), bArr2[4], objArr25);
                            String str3 = (String) objArr25[0];
                            Object[] objArr26 = new Object[1];
                            a(bArr2[26], s3, bArr2[46], objArr26);
                            Object[] objArr27 = (Object[]) cls7.getMethod(str3, Class.forName((String) objArr26[0])).invoke(str, objArr23);
                            int[] iArr = new int[objArr27.length];
                            int i3 = 0;
                            while (i3 < objArr27.length) {
                                Object[] objArr28 = {objArr27[i3]};
                                byte[] bArr3 = MediaSessionCompatQueueItem;
                                byte b5 = bArr3[35];
                                Object[] objArr29 = new Object[1];
                                a(b5, (short) (b5 | 224), bArr3[c], objArr29);
                                Class<?> cls8 = Class.forName((String) objArr29[0]);
                                byte b6 = bArr3[13];
                                Object[] objArr30 = new Object[1];
                                a(b6, (short) (b6 | 250), bArr3[135], objArr30);
                                String str4 = (String) objArr30[0];
                                Object[] objArr31 = new Object[1];
                                a(bArr3[c2], s3, bArr3[46], objArr31);
                                Object objInvoke = cls8.getMethod(str4, Class.forName((String) objArr31[0])).invoke(null, objArr28);
                                byte b7 = bArr3[35];
                                Object[] objArr32 = new Object[1];
                                a(b7, (short) (b7 | 224), bArr3[46], objArr32);
                                Class<?> cls9 = Class.forName((String) objArr32[0]);
                                Object[] objArr33 = new Object[1];
                                a(bArr3[356], (short) 260, bArr3[56], objArr33);
                                iArr[i3] = ((Integer) cls9.getMethod((String) objArr33[0], null).invoke(objInvoke, null)).intValue();
                                i3++;
                                c = '.';
                                c2 = 26;
                            }
                            int i4 = 0;
                            while (true) {
                                int i5 = i4 + 1;
                                try {
                                    switch (r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(iArr[i4])) {
                                        case -18:
                                            try {
                                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(9);
                                                throw ((Throwable) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat);
                                            } catch (Throwable th) {
                                                th = th;
                                                bArr = MediaSessionCompatQueueItem;
                                                s = (short) 267;
                                                objArr = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr);
                                                i4 = 34;
                                                if (Class.forName((String) objArr[0]).isInstance(th) || i4 < 2 || i4 >= 10) {
                                                    objArr2 = new Object[1];
                                                    a(bArr[68], s, bArr[46], objArr2);
                                                    if (Class.forName((String) objArr2[0]).isInstance(th) || i4 < 4 || i4 >= 5) {
                                                        objArr3 = new Object[1];
                                                        a(bArr[68], s, bArr[46], objArr3);
                                                        if (Class.forName((String) objArr3[0]).isInstance(th) || i4 < 6 || i4 >= 10) {
                                                            objArr4 = new Object[1];
                                                            a(bArr[68], s, bArr[46], objArr4);
                                                            if (!Class.forName((String) objArr4[0]).isInstance(th) && i4 >= 15) {
                                                                if (i4 < 16) {
                                                                }
                                                            }
                                                            objArr5 = new Object[1];
                                                            a(bArr[68], s, bArr[46], objArr5);
                                                            if (Class.forName((String) objArr5[0]).isInstance(th) || i4 < 18 || i4 >= 23) {
                                                                throw th;
                                                            }
                                                            i4 = 35;
                                                        }
                                                    }
                                                }
                                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                                            }
                                            break;
                                        case -17:
                                            i4 = 1;
                                            break;
                                        case -16:
                                            i4 = 33;
                                            break;
                                        case -15:
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(15);
                                            if (r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer == 0) {
                                                i5 = 32;
                                            }
                                            i4 = i5;
                                            break;
                                        case androidx.compose.ui.graphics.Float16.MinExponent /* -14 */:
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(14);
                                            RatingCompat = r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer;
                                            i4 = i5;
                                            break;
                                        case -13:
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = MediaMetadataCompat;
                                            try {
                                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(11);
                                                i4 = i5;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                bArr = MediaSessionCompatQueueItem;
                                                s = (short) 267;
                                                objArr = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr);
                                                i4 = 34;
                                                if (Class.forName((String) objArr[0]).isInstance(th)) {
                                                    objArr2 = new Object[1];
                                                    a(bArr[68], s, bArr[46], objArr2);
                                                    if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    objArr3 = new Object[1];
                                                    a(bArr[68], s, bArr[46], objArr3);
                                                    if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    objArr4 = new Object[1];
                                                    a(bArr[68], s, bArr[46], objArr4);
                                                    if (!Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    }
                                                    objArr5 = new Object[1];
                                                    a(bArr[68], s, bArr[46], objArr5);
                                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                    }
                                                    throw th;
                                                }
                                                objArr2 = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr2);
                                                if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                                    break;
                                                }
                                                objArr3 = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr3);
                                                if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                    break;
                                                }
                                                objArr4 = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr4);
                                                if (!Class.forName((String) objArr4[0]).isInstance(th)) {
                                                }
                                                objArr5 = new Object[1];
                                                a(bArr[68], s, bArr[46], objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                                            }
                                            break;
                                        case -12:
                                            i4 = 13;
                                            break;
                                        case BaseCode.NOT_SUPPORT_RESOLUTION /* -11 */:
                                            i4 = 23;
                                            break;
                                        case BaseCode.KPMS_UPDATE_FAILED /* -10 */:
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(20);
                                            if (r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer == 0) {
                                                i5 = 22;
                                            }
                                            i4 = i5;
                                            break;
                                        case BaseCode.NO_AVAILABLE_LIB_ERROR /* -9 */:
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(14);
                                            MediaMetadataCompat = r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer;
                                            i4 = i5;
                                            break;
                                        case BaseCode.SOLUTION_GET_RESPONSE_CODE_ERROR /* -8 */:
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = RatingCompat;
                                            i = 11;
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i);
                                            i4 = i5;
                                            break;
                                        case BaseCode.DATA_NULL_IN_INTENT /* -7 */:
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(9);
                                            return (AtomicReference) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat;
                                        case BaseCode.TRANSACTION_IS_NULL /* -6 */:
                                            i4 = 24;
                                            break;
                                        case BaseCode.URI_IS_NULL /* -5 */:
                                            i4 = 15;
                                            break;
                                        case BaseCode.NO_SOLUTION /* -4 */:
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat;
                                            i = 4;
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i);
                                            i4 = i5;
                                            break;
                                        case -3:
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = ((onViewDetachedFromWindowlambda1) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat).MediaSessionCompatResultReceiverWrapper();
                                            i = 4;
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i);
                                            i4 = i5;
                                            break;
                                        case -2:
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = ((r8lambda2tFXStZN_MXijoyymezhxf14xPY) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat).write;
                                            i = 4;
                                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(i);
                                            i4 = i5;
                                            break;
                                        case -1:
                                            i4 = 10;
                                            break;
                                        default:
                                            i4 = i5;
                                            break;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                        } catch (Throwable th4) {
                            Throwable cause = th4.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th4;
                        }
                    } catch (Throwable th5) {
                        Throwable cause2 = th5.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th5;
                    }
                } catch (Throwable th6) {
                    Throwable cause3 = th6.getCause();
                    if (cause3 != null) {
                        throw cause3;
                    }
                    throw th6;
                }
            } catch (Throwable th7) {
                Throwable cause4 = th7.getCause();
                if (cause4 != null) {
                    throw cause4;
                }
                throw th7;
            }
        } catch (Throwable th8) {
            Throwable cause5 = th8.getCause();
            if (cause5 != null) {
                throw cause5;
            }
            throw th8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:136:0x0479 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0437  */
    /* JADX WARN: Code duplicated, block: B:82:0x0440 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x0446 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:90:0x0468  */
    public static /* synthetic */ AtomicReference IconCompatParcelizer(r8lambda2tFXStZN_MXijoyymezhxf14xPY r8lambda2tfxstzn_mxijoyymezhxf14xpy) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        r8lambda4eayLEkyCzRqunjxKNY3fxSMeyo r8lambda4eaylekyczrqunjxkny3fxsmeyo = new r8lambda4eayLEkyCzRqunjxKNY3fxSMeyo(r8lambda2tfxstzn_mxijoyymezhxf14xpy);
        try {
            byte[] bArr = MediaSessionCompatQueueItem;
            Object[] objArr3 = new Object[1];
            a(bArr[135], bArr[8], bArr[9], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(bArr[46], bArr[86], bArr[51], objArr4);
            char c = (char) (38741 - (((Float) cls.getMethod((String) objArr4[0], null).invoke(null, null)).floatValue() > 0.0f ? 1 : (((Float) cls.getMethod((String) objArr4[0], null).invoke(null, null)).floatValue() == 0.0f ? 0 : -1)));
            Object[] objArr5 = new Object[1];
            a(bArr[6], bArr[354], bArr[9], objArr5);
            Class<?> cls2 = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            a(bArr[59], bArr[164], bArr[13], objArr6);
            int i = (((Long) cls2.getMethod((String) objArr6[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls2.getMethod((String) objArr6[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 141;
            Object[] objArr7 = {"", "", 0, 0};
            Object[] objArr8 = new Object[1];
            a(bArr[6], bArr[11], bArr[9], objArr8);
            Class<?> cls3 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            a(bArr[13], (short) 89, bArr[56], objArr9);
            String str = (String) objArr9[0];
            byte b = bArr[6];
            Object[] objArr10 = new Object[1];
            a(b, (short) (b | 76), bArr[46], objArr10);
            byte b2 = bArr[6];
            Object[] objArr11 = new Object[1];
            a(b2, (short) (b2 | 76), bArr[46], objArr11);
            Class<?>[] clsArr = {Class.forName((String) objArr10[0]), Class.forName((String) objArr11[0]), Integer.TYPE, Integer.TYPE};
            Object[] objArr12 = new Object[1];
            b(c, i, ((Integer) cls3.getMethod(str, clsArr).invoke(null, objArr7)).intValue(), objArr12);
            String str2 = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            a(bArr[6], (short) 116, bArr[9], objArr13);
            Class<?> cls4 = Class.forName((String) objArr13[0]);
            byte b3 = bArr[67];
            byte b4 = b3;
            Object[] objArr14 = new Object[1];
            a(b4, (short) (b4 | 136), b3, objArr14);
            char cIntValue = (char) ((Integer) cls4.getMethod((String) objArr14[0], Integer.TYPE).invoke(null, 0)).intValue();
            Object[] objArr15 = new Object[1];
            a(bArr[135], (short) 140, bArr[9], objArr15);
            Class<?> cls5 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            a(bArr[21], (short) 163, bArr[9], objArr16);
            String str3 = (String) objArr16[0];
            char c2 = 26;
            short s = (short) 176;
            Object[] objArr17 = new Object[1];
            a(bArr[26], s, bArr[46], objArr17);
            int i2 = -((Integer) cls5.getMethod(str3, Class.forName((String) objArr17[0])).invoke(null, "")).intValue();
            byte b5 = bArr[4];
            Object[] objArr18 = new Object[1];
            a(b5, (short) (b5 | 173), bArr[9], objArr18);
            Class<?> cls6 = Class.forName((String) objArr18[0]);
            Object[] objArr19 = new Object[1];
            a(bArr[135], (short) Constant.ERROR_GYRO_NO_DATA, bArr[51], objArr19);
            Object[] objArr20 = new Object[1];
            b(cIntValue, i2, 141 - ((byte) ((Integer) cls6.getMethod((String) objArr19[0], null).invoke(null, null)).intValue()), objArr20);
            Object[] objArr21 = {(String) objArr20[0]};
            Object[] objArr22 = new Object[1];
            a(bArr[26], s, bArr[46], objArr22);
            Class<?> cls7 = Class.forName((String) objArr22[0]);
            byte b6 = bArr[7];
            Object[] objArr23 = new Object[1];
            a(b6, (short) (b6 | 232), bArr[4], objArr23);
            String str4 = (String) objArr23[0];
            Object[] objArr24 = new Object[1];
            a(bArr[26], s, bArr[46], objArr24);
            Object[] objArr25 = (Object[]) cls7.getMethod(str4, Class.forName((String) objArr24[0])).invoke(str2, objArr21);
            int[] iArr = new int[objArr25.length];
            int i3 = 0;
            while (i3 < objArr25.length) {
                try {
                    Object[] objArr26 = {objArr25[i3]};
                    byte[] bArr2 = MediaSessionCompatQueueItem;
                    byte b7 = bArr2[35];
                    Object[] objArr27 = new Object[1];
                    a(b7, (short) (b7 | 224), bArr2[46], objArr27);
                    Class<?> cls8 = Class.forName((String) objArr27[0]);
                    byte b8 = bArr2[13];
                    Object[] objArr28 = new Object[1];
                    a(b8, (short) (b8 | 250), bArr2[135], objArr28);
                    String str5 = (String) objArr28[0];
                    Object[] objArr29 = new Object[1];
                    a(bArr2[c2], s, bArr2[46], objArr29);
                    Object objInvoke = cls8.getMethod(str5, Class.forName((String) objArr29[0])).invoke(null, objArr26);
                    try {
                        byte b9 = bArr2[35];
                        Object[] objArr30 = new Object[1];
                        a(b9, (short) (b9 | 224), bArr2[46], objArr30);
                        Class<?> cls9 = Class.forName((String) objArr30[0]);
                        Object[] objArr31 = new Object[1];
                        a(bArr2[356], (short) 260, bArr2[56], objArr31);
                        iArr[i3] = ((Integer) cls9.getMethod((String) objArr31[0], null).invoke(objInvoke, null)).intValue();
                        i3++;
                        c2 = 26;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                try {
                    switch (r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(iArr[i4])) {
                        case -18:
                            i4 = 40;
                            break;
                        case -17:
                            try {
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(24);
                                if (r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer != 14) {
                                    i5 = 33;
                                    i4 = i5;
                                } else {
                                    i4 = 1;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                byte[] bArr3 = MediaSessionCompatQueueItem;
                                short s2 = (short) 267;
                                objArr = new Object[1];
                                a(bArr3[68], s2, bArr3[46], objArr);
                                if (Class.forName((String) objArr[0]).isInstance(th)) {
                                    break;
                                }
                                if (i4 >= 36) {
                                }
                                objArr2 = new Object[1];
                                a(bArr3[68], s2, bArr3[46], objArr2);
                                if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                }
                                throw th;
                            }
                            break;
                        case -16:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(9);
                            throw ((Throwable) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat);
                        case -15:
                            i4 = 41;
                            break;
                        case androidx.compose.ui.graphics.Float16.MinExponent /* -14 */:
                            i4 = 43;
                            break;
                        case -13:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(20);
                            if (r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer == 0) {
                                i5 = 31;
                            }
                            i4 = i5;
                            break;
                        case -12:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(14);
                            MediaMetadataCompat = r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer;
                            i4 = i5;
                            break;
                        case BaseCode.NOT_SUPPORT_RESOLUTION /* -11 */:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = RatingCompat;
                            try {
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(11);
                                i4 = i5;
                            } catch (Throwable th4) {
                                th = th4;
                                byte[] bArr4 = MediaSessionCompatQueueItem;
                                short s3 = (short) 267;
                                objArr = new Object[1];
                                a(bArr4[68], s3, bArr4[46], objArr);
                                if (Class.forName((String) objArr[0]).isInstance(th)) {
                                    break;
                                }
                                if (i4 >= 36) {
                                }
                                objArr2 = new Object[1];
                                a(bArr4[68], s3, bArr4[46], objArr2);
                                if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                }
                                throw th;
                            }
                            break;
                        case BaseCode.KPMS_UPDATE_FAILED /* -10 */:
                            i4 = 10;
                            break;
                        case BaseCode.NO_AVAILABLE_LIB_ERROR /* -9 */:
                            i4 = 21;
                            break;
                        case BaseCode.SOLUTION_GET_RESPONSE_CODE_ERROR /* -8 */:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(15);
                            if (r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer == 0) {
                                i5 = 20;
                            }
                            i4 = i5;
                            break;
                        case BaseCode.DATA_NULL_IN_INTENT /* -7 */:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(14);
                            RatingCompat = r8lambda4eaylekyczrqunjxkny3fxsmeyo.RemoteActionCompatParcelizer;
                            i4 = i5;
                            break;
                        case BaseCode.TRANSACTION_IS_NULL /* -6 */:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = MediaMetadataCompat;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(11);
                            i4 = i5;
                            break;
                        case BaseCode.URI_IS_NULL /* -5 */:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(9);
                            return (AtomicReference) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat;
                        case BaseCode.NO_SOLUTION /* -4 */:
                            i4 = 22;
                            break;
                        case -3:
                            i4 = 12;
                            break;
                        case -2:
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.write = 1;
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(2);
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(3);
                            r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = write((r8lambda2tFXStZN_MXijoyymezhxf14xPY) r8lambda4eaylekyczrqunjxkny3fxsmeyo.MediaMetadataCompat);
                            try {
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(4);
                                i4 = i5;
                            } catch (Throwable th5) {
                                th = th5;
                                byte[] bArr5 = MediaSessionCompatQueueItem;
                                short s4 = (short) 267;
                                objArr = new Object[1];
                                a(bArr5[68], s4, bArr5[46], objArr);
                                if (Class.forName((String) objArr[0]).isInstance(th) || i4 < 2 || i4 >= 3) {
                                    if (i4 >= 36 || i4 >= 40) {
                                        objArr2 = new Object[1];
                                        a(bArr5[68], s4, bArr5[46], objArr2);
                                        if (Class.forName((String) objArr2[0]).isInstance(th) || i4 < 34 || i4 >= 40) {
                                            throw th;
                                        }
                                        i4 = 45;
                                    } else {
                                        i4 = 32;
                                    }
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                    r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                                } else {
                                    i4 = 45;
                                }
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.IconCompatParcelizer = th;
                                r8lambda4eaylekyczrqunjxkny3fxsmeyo.read(27);
                            }
                            break;
                        case -1:
                            i4 = 6;
                            break;
                        default:
                            i4 = i5;
                            break;
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            }
        } catch (Throwable th7) {
            Throwable cause3 = th7.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th7;
        }
    }
}
